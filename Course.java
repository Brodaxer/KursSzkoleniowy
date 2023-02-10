class Course {
    private String id;
    private double price;
    private String name;
    private String descripiton;

    public Course(double price, String name, String descripiton) {

        this.price = price;
        this.name = name;
        this.descripiton = descripiton;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }
    

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class OnlineCourse extends Course {
    static final String ID = "JAVA-ONLINE-123";
    private int videoLenght;
    private int timeToFinish;

    public OnlineCourse(double price, String name, String descripiton, int videoLenght, int timeToFinish) {
        super(price, name, descripiton);
        this.videoLenght = videoLenght;
        this.timeToFinish = timeToFinish;
        setId(ID);
    }

    public void onlineInfo() {
        System.out.println(ID + " " +getName()+" "+getPrice()+" "+getDescripiton()+" "+videoLenght+" "+timeToFinish);
    }

}

class OffonlineCourse extends Course {
    static final String ID = "JAVA-STACJO-WRO-234";
    private String town;
    private int numberOfLessons;

    public OffonlineCourse(double price, String name, String descripiton, String town, int numberOfLessons) {
        super(price, name, descripiton);
        this.town = town;
        this.numberOfLessons = numberOfLessons;
        setId(ID);
    }
    public void offInfo (){
        System.out.println(ID+" "+getName()+" "+getPrice()+" "+getDescripiton()+" "+town+" "+numberOfLessons);
    }





}

class BootCamp extends OnlineCourse {
    private String firstName;
    private String lastName;
    private int privateLessons;

    public BootCamp(double price, String name, String descripiton, int videoLenght, int timeToFinish, String firstName,
                    String lastName, int privateLessons) {
        super(price, name, descripiton, videoLenght, timeToFinish);
        this.firstName = firstName;
        this.lastName = lastName;
        this.privateLessons = privateLessons;
        setId(ID);
    }
    public void bootInfo(){
        onlineInfo();
        System.out.println(firstName+" "+lastName+" "+privateLessons);
    }

}