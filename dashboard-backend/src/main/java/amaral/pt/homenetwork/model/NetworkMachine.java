package amaral.pt.homenetwork.model;

public class NetworkMachine {
    private String IP;
    private Boolean isOnline;

    public NetworkMachine(String IP, Boolean isOnline) {
        this.IP = IP;
        this.isOnline = isOnline;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }
}
