package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearOutputData {
    private final List<String> deletedUsers;
    public ClearOutputData(List<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public List<String> getDeletedUsers() {return deletedUsers;}

//    public String getDeletedUser() {
//        String finalDeletedUsers = new String(" ");
//        for (String s: deletedUsers) {
//            finalDeletedUsers.concat(s);
//            finalDeletedUsers = finalDeletedUsers + "\n";
//        }
//        return finalDeletedUsers;
//    }
}
