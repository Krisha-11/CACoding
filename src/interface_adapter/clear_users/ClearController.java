package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {

    final ClearInputBoundary usersClearUseCaseInteractor;

    public ClearController(ClearInputBoundary usersClearUseCaseInteractor) {
        this.usersClearUseCaseInteractor = usersClearUseCaseInteractor;
    }
    // starts the use case by calling the execute method of the Interactor
    public void execute() {
        usersClearUseCaseInteractor.execute();
    }
}
