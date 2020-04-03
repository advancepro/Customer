package kg.iaau.edu.com.model;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String jobTitle;
    private int mobilePhone;
    private String city;
    private String webPage;

    public Customer()
    {

    }

    public Customer(int id, String firstName, String lastName, String emailAddress, String jobTitle, int mobilePhone, String city, String webPage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.jobTitle = jobTitle;
        this.mobilePhone = mobilePhone;
        this.city = city;
        this.webPage = webPage;
    }

    public Customer(String firstName, String lastName, String emailAddress, String jobTitle, int mobilePhone, String city, String webPage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.jobTitle = jobTitle;
        this.mobilePhone = mobilePhone;
        this.city = city;
        this.webPage = webPage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.emailAddress = EmailAddress;
    }

    public String getJobTitle(){
        return jobTitle = jobTitle;
    }

    public void setJobTitle(String JobTitle){
        this.jobTitle = jobTitle;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", EmailAddress='" + emailAddress + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", city='" + city + '\'' +
                ", webPage='" + webPage + '\'' +
                '}';
    }
}
