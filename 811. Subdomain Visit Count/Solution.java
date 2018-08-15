class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> visits = new HashMap<>();
        
        for(String cpdomain: cpdomains) {
            String[] domainData = cpdomain.split(" ");
            int numberOfVisits = Integer.valueOf(domainData[0]);
            String domain = domainData[1];
            
            String[] subDomains = domain.split("\\.");
            String sub = subDomains[subDomains.length - 1];
            visits.put(sub, visits.getOrDefault(sub, 0) + numberOfVisits);
            
            for(int i = subDomains.length - 2; i >= 0; i--) {
                sub = subDomains[i] + "." + sub;
                visits.put(sub, visits.getOrDefault(sub, 0) + numberOfVisits);
            }
        }
        
        List<String> allVisits = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : visits.entrySet())
            allVisits.add(entry.getValue() + " " + entry.getKey());
        
        return allVisits;
    }
}