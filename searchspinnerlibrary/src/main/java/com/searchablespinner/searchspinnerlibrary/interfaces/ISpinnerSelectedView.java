package com.searchablespinner.searchspinnerlibrary.interfaces;

import android.view.View;

/**
 * Created by samwel nyandoro on 01/08/2022.
 */

public interface ISpinnerSelectedView {
    View getNoSelectionView();

    View getSelectedView(int position);
}
