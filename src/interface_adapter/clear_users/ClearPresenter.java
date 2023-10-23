package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.login.LoginOutputData;

import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {

    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, SignupViewModel signupViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
    }

    @Override
    public void openDialogue(ClearOutputData clearOutputData) {
        String deletedUsers = clearOutputData.getDeletedUser();
        SignupState signupState = signupViewModel.getState();
        signupState.setDeletedUsers(deletedUsers);
        this.signupViewModel.setState(signupState);
        signupViewModel.firePropertyChanged();
    }

}
