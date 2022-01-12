enum Dept {
    CS("John", "Block A"), IT("Smith", "Block B"), CIVIL("Srinivas", "Block C"), ECE("Dave", "Block D");

    String head;
    String location;

    private Dept(String head, String loc) {
        this.head = head;
        this.location = loc;
    }

    public String getHeadName() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}

public class EnumClassDemo {
    public static void main(String[] args) {
        Dept dt = Dept.IT;
        Dept dept = Dept.ECE;
        Dept dep2 = Dept.CS;
        Dept dep3 = Dept.CIVIL;
        System.out.println(dt.getHeadName() + " - " + dt.getLocation());
        System.out.println(dept.getHeadName() + " - " + dept.getLocation());
        System.out.println(dep2.getHeadName() + " - " + dep2.getLocation());
        System.out.println(dep3.getHeadName() + " - " + dep3.getLocation());
    }
}
