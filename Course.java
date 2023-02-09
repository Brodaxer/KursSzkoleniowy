class Course {
    private String id;
    private double price;
    private String name;
    private String descripiton;

    public Course( double price, String name, String descripiton) {

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
}

class OnlineCourse extends Course {

    private int videoLenght;
    private int timeToFinish;

    public OnlineCourse( double price, String name, String descripiton, int videoLenght, int timeToFinish) {
        super( price, name, descripiton);
        this.videoLenght = videoLenght;
        this.timeToFinish = timeToFinish;
        setId("JAVA-ONLINE-123");
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }
}

class OffonlineCourse extends Course {

    private String town;
    private int numberOfLessons;

    public OffonlineCourse( double price, String name, String descripiton, String town, int numberOfLessons) {
        super(price, name, descripiton);
        this.town = town;
        this.numberOfLessons = numberOfLessons;
        setId("JAVA-STACJO-WRO-234");
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }
}

class BootCamp extends OnlineCourse {
    private String firstName;
    private String lastName;
    private int privateLessons;

    public BootCamp( double price, String name, String descripiton, int videoLenght, int timeToFinish, String firstName,
                    String lastName, int privateLessons) {
        super(price, name, descripiton, videoLenght, timeToFinish);
        this.firstName=firstName;
        this.lastName=lastName;
        this.privateLessons=privateLessons;
        setId("JAVA-ONLINE-123");
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }
}