package Seminar02_5;

public interface StatIcInterface {
    int getUserId();

    default int getAdminId(){
        return 1;
    }
    static int getUniversalId(){
        return 5;
    }
}
