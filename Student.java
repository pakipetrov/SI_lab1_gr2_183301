class Student {
    
    String index;
    String firstName;
    String lastName;
    ArrayList<Integer> grades;

    public Student(String index, String firstName, String lastName, ArrayList<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public Student() {
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double getAverage() {
	    double sum = 0;
	    for (int i = 0; i < grades.size(); i++) {
	    sum += grades.get(i);
	    }
	    return sum / grades.size();
    }

    public int ECTSCredits() {
	    return grades.size() * 6;
    }
}
