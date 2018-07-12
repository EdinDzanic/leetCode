class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] aArr = a.split("\\+");
        int A = Integer.parseInt(aArr[0]);
        int B = Integer.parseInt(aArr[1].substring(0, aArr[1].length() - 1));
        
        String[] bArr = b.split("\\+");
        int C = Integer.parseInt(bArr[0]);
        int D = Integer.parseInt(bArr[1].substring(0, bArr[1].length() - 1));
        
        int complexPart = (A * C - B * D);
        int nonComplexPart = (A * D + B * C);
        
        return String.valueOf(complexPart) + "+" + String.valueOf(nonComplexPart) + "i";
    }
}