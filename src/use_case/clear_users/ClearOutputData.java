package use_case.clear_users;

import java.util.List;

public class ClearOutputData {
    private final List<String> deletedUsers;
    public ClearOutputData(List<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

//    public List<String> getDeletedUsers() {return deletedUsers;}

//    public String getDeletedUser() {
//        String finalDeletedUsers = new String(" ");
//        for (String s: deletedUsers) {
//            finalDeletedUsers.concat(s);
//            finalDeletedUsers = finalDeletedUsers + "\n";
//        }
//        return finalDeletedUsers;
//    }
    public String getDeletedUsers() {
        StringBuilder finalDeletedUsers = new StringBuilder();
        for (String s: deletedUsers) {
            finalDeletedUsers.append(s).append("\n");
        }
        return finalDeletedUsers.toString();
    }
}
