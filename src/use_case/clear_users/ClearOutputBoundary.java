package use_case.clear_users;

import use_case.login.LoginOutputData;

import java.util.List;

public interface ClearOutputBoundary {
    void openDialogue(ClearOutputData deletedUsers);
}
