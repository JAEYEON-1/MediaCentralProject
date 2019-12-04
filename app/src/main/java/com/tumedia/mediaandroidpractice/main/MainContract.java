package com.tumedia.mediaandroidpractice.main;

import com.tumedia.mediaandroidpractice.base.BasePresenter;
import com.tumedia.mediaandroidpractice.base.BaseView;

public class MainContract {
    public interface View extends BaseView {

    }

    public interface Presenter extends BasePresenter<View> {

    }
}
