package org.insbaixcamp.testevents.ui.inici;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IniciViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public IniciViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fragment d'inici");
    }

    public LiveData<String> getText() {
        return mText;
    }
}