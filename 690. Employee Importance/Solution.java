/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        Map<Integer, Employee> map = new HashMap<>();
        Employee e = null;
        for(Employee employee: employees) {
            map.put(employee.id, employee);
        }

        return importance(id, map);
    }
    
    public int importance(int id, Map<Integer, Employee> map) {
        Employee employee = map.get(id);
        int importance = employee.importance;

        for(Integer subId: employee.subordinates) {
            importance += importance(subId, map);
        }
        
        return importance;
    }
}