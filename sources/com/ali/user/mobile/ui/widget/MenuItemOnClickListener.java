package com.ali.user.mobile.ui.widget;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class MenuItemOnClickListener implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DialogFragment bottomMenuFragment;
    private MenuItem menuItem;

    static {
        t2o.a(70254889);
    }

    public MenuItemOnClickListener(DialogFragment dialogFragment, MenuItem menuItem) {
        this.bottomMenuFragment = dialogFragment;
        this.menuItem = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        DialogFragment dialogFragment = this.bottomMenuFragment;
        if (dialogFragment != null && dialogFragment.isVisible()) {
            try {
                this.bottomMenuFragment.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        onClickMenuItem(view, this.menuItem);
    }

    public abstract void onClickMenuItem(View view, MenuItem menuItem);
}
