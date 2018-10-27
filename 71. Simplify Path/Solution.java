class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        
        List<String> simplified = new ArrayList<>();
        
        for (int i = 0; i < parts.length; i++) {
            
            if (parts[i].equals("") || parts[i].equals("."))
                continue;

            if (!parts[i].equals("..")) 
                simplified.add(parts[i]);
            else if (simplified.size() > 0)
                simplified.remove(simplified.size() - 1);
        }
        
        if (simplified.size() == 0)
            return "/";
        
        String simplifiedPath = new String();
        for (String part: simplified)
            simplifiedPath += "/" + part;
        
        return simplifiedPath;
    }
}