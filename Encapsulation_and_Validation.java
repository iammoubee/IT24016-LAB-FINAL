class Student {
    private int id;
    private String name;
    private double cgpa;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0)
            this.cgpa = cgpa;
        else
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Siam");
        s.setCgpa(3.7);
        s.setCgpa(4.9); // invalid

        System.out.println(s.getId() + " " + s.getName() + " " + s.getCgpa());
    }
}
