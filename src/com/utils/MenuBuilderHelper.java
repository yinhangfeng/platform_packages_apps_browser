package com.utils;

import android.content.Context;
import android.view.Menu;

/**
 * Created by yhf on 2015/9/15.
 */
public class MenuBuilderHelper {

    public static Menu newInstance(Context context) {
        try {
            return (Menu) Class.forName("com.android.internal.view.menu.MenuBuilder").getConstructor(Context.class).newInstance(context);
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException("new MenuBuilder fail");
        }
    }
}
