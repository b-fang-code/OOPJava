package Seminar02_4;

public interface MyIf {
    int getUserId();

    default int getAdminId(){
        return 1;
    }
}
