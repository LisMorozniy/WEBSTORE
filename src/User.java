public abstract class User {
    protected String fio;
    protected Long iin;
    protected String contactNumber;

    public User(String fio, Long iin, String contactNumber) {
        this.fio = fio;
        this.iin = iin;
        this.contactNumber = contactNumber;
    }

    public String getFio() {
        return fio;
    }

    public Long getIin() {
        return iin;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public abstract void changeNumber(String number);

    public abstract void changeFio(String fio);
    
}
