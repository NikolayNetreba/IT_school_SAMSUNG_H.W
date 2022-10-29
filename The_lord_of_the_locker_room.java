public class The_lord_of_the_locker_room {
    protected String name;
    protected int friends = 2;
    protected String privileges;
    public void setPrivileges(String privileges){
        this.privileges = privileges;
    }

    public String getName() {
        return name;
    }

    void i_sey(){
        System.out.println("Hello, i the lord of the locker room, my name is " + name + ". I have " + friends + " friends and privilege: " + privileges );
    }
}
