public
class Person {
    private int id;
    private String name;
    private String gender;
    private String birthDate;
    private int salary;
    private Division division;
    public Person(int id,String name,String gender,Division division,String birthDate,int salary)
    {
        this.id=id;
        this.birthDate=birthDate;
        this.division=division;
        this.gender=gender;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public
    String toString() {
        String result = id+" "+name+' '+gender+' '+division.toString()+' '+birthDate+' '+salary;
        return result;
    }
}
