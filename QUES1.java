public class Student {
   
    private String id;
    private String name;
    private double cgpa;
    
    
    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        setCgpa(cgpa); // Use setter for validation
    }
    
        public String getId() {
        return id;
    }
    
    
    public void setId(String id) {
        this.id = id;
    }
    
        public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public double getCgpa() {
        return cgpa;
    }
    
        public void setCgpa(double cgpa) {
        if (cgpa < 0.0 || cgpa > 4.0) {
            throw new IllegalArgumentException("CGPA must be between 0.0 and 4.0");
        }
        this.cgpa = cgpa;
    }
    
       public static void main(String[] args) {
        try {
            
            Student student1 = new Student("S001", "Alice Johnson", 3.75);
            System.out.println("Student 1 created successfully:");
            System.out.println("ID: " + student1.getId());
            System.out.println("Name: " + student1.getName());
            System.out.println("CGPA: " + student1.getCgpa());
            
            System.out.println("\n--- Testing validation ---");
            
            
            Student student2 = new Student("S002", "Bob Smith", 4.5);
            System.out.println("Student 2 created with CGPA: " + student2.getCgpa());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n--- Testing setter validation ---");
        
        
        Student student3 = new Student("S003", "Charlie Brown", 2.8);
        System.out.println("Student 3 created with CGPA: " + student3.getCgpa());
        
        try {
            student3.setCgpa(5.0); // Invalid CGPA
            System.out.println("Updated CGPA to: " + student3.getCgpa());
        } catch (IllegalArgumentException e) {
            System.out.println("Error updating CGPA: " + e.getMessage());
        }
        
                student3.setCgpa(3.2);
        System.out.println("Successfully updated CGPA to: " + student3.getCgpa());
        
                System.out.println("\n--- Testing all getters and setters ---");
        student3.setName("Charles Brown");
        student3.setId("S003A");
        System.out.println("Updated Student 3:");
        System.out.println("ID: " + student3.getId());
        System.out.println("Name: " + student3.getName());
        System.out.println("CGPA: " + student3.getCgpa());
    }
}