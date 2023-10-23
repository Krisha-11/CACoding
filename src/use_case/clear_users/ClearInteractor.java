package use_case.clear_users;

import javax.swing.*;
import java.util.List;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface clearButtonDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearOutputBoundary) {
        this.clearButtonDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        List<String> deletedUsers = clearButtonDataAccessObject.deleteAllUsers();

        ClearOutputData clearOutputData = new ClearOutputData(deletedUsers);
        clearPresenter.openDialogue(clearOutputData);
    }

}
