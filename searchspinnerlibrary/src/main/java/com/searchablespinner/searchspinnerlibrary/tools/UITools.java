package com.searchablespinner.searchspinnerlibrary.tools;

import android.content.Context;

/**
 * Created by samwel nyandoro on 01/08/2022.
 */

public class UITools {

    private UITools() {
    }

    public static int dpToPx(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * scale);
    }
}
