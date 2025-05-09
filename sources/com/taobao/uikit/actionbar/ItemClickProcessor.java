package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.text.TextUtils;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ItemClickProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TBPublicMenu.TBOnPublicMenuClickListener sOnPublicMenuClickListener;
    private WeakReference<Activity> mActivity;
    private final List<MenuItemImpl> mFilteredMenus;
    private final List<MenuItemImpl> mMenuItems;

    static {
        t2o.a(927989773);
    }

    public ItemClickProcessor(Activity activity, List<MenuItemImpl> list, List<MenuItemImpl> list2) {
        this.mActivity = new WeakReference<>(activity);
        this.mMenuItems = list;
        this.mFilteredMenus = list2;
    }

    private void dispatchOptionItemSelected(List<MenuItemImpl> list, TBPublicMenuItem tBPublicMenuItem, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327fc811", new Object[]{this, list, tBPublicMenuItem, activity, new Boolean(z)});
            return;
        }
        int id = tBPublicMenuItem.getId();
        for (MenuItemImpl menuItemImpl : list) {
            if (menuItemImpl != null && id == menuItemImpl.getItemId() && TextUtils.equals(tBPublicMenuItem.getTitle(), menuItemImpl.getTitle())) {
                if (!menuItemImpl.invoke()) {
                    activity.onOptionsItemSelected(menuItemImpl);
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public static void setOnPublicMenuClickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816c9e9c", new Object[]{tBOnPublicMenuClickListener});
        } else {
            sOnPublicMenuClickListener = tBOnPublicMenuClickListener;
        }
    }

    public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            return;
        }
        TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener = sOnPublicMenuClickListener;
        if (tBOnPublicMenuClickListener != null) {
            tBOnPublicMenuClickListener.onPublicMenuItemClicked(tBPublicMenuItem);
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            dispatchOptionItemSelected(this.mMenuItems, tBPublicMenuItem, activity, false);
            dispatchOptionItemSelected(this.mFilteredMenus, tBPublicMenuItem, activity, true);
        }
    }
}
