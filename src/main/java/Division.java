public
class Division {
    private String name;
    private  int id;
    public Division(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public
    String toString() {
        String result = id+" "+name;
        return result;
    }
}
