package app.outlay.mvp.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by bmelnychuk on 10/25/16.
 */

public interface SettingsView extends MvpView {
    void setCurrentThemeSetting(int theme);
}
