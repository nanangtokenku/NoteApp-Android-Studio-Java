package id.nalaronline.mynotesapp.activity.main;

import id.nalaronline.mynotesapp.model.Note;

import java.util.List;

public interface MainView {
    void showLoading();
    void hideLoading();
    void onGetResult(List<Note> notes);
    void onErrorLoading(String message);
}
