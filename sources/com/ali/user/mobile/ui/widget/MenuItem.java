package com.ali.user.mobile.ui.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MenuItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MenuItemOnClickListener menuItemOnClickListener;
    private String text;
    public int textColor;
    public float textSize;

    static {
        t2o.a(70254887);
    }

    public MenuItem() {
    }

    public MenuItemOnClickListener getMenuItemOnClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItemOnClickListener) ipChange.ipc$dispatch("8018bf1a", new Object[]{this});
        }
        return this.menuItemOnClickListener;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.text;
    }

    public void setMenuItemOnClickListener(MenuItemOnClickListener menuItemOnClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f76087e", new Object[]{this, menuItemOnClickListener});
        } else {
            this.menuItemOnClickListener = menuItemOnClickListener;
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }

    public MenuItem(String str, MenuItemOnClickListener menuItemOnClickListener) {
        this.text = str;
        this.menuItemOnClickListener = menuItemOnClickListener;
    }
}
