package com.taobao.message.lab.comfrm.util;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.message.container.dynamic.widget.CustomInsetsFrameLayout;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/message/lab/comfrm/util/KeyboardStateHelper;", "", "()V", "lastHeightDelta", "", "screenHeight", "statusBarHeight", "getRootViewHeight", "aty", "Landroid/app/Activity;", WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, "isKeyboardShow", "", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KeyboardStateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int statusBarHeight = -1;
    private int screenHeight = -1;
    private int lastHeightDelta = -1;

    static {
        t2o.a(537919888);
    }

    private final int getRootViewHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73832730", new Object[]{this, activity})).intValue();
        }
        Window window = activity.getWindow();
        ckf.f(window, "aty.window");
        View decorView = window.getDecorView();
        ckf.f(decorView, "aty.window.decorView");
        View rootView = decorView.getRootView();
        ckf.f(rootView, "aty.window.decorView.rootView");
        int height = rootView.getHeight();
        this.screenHeight = height;
        return height;
    }

    private final int getStatusBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9070b1e", new Object[]{this, activity})).intValue();
        }
        if (this.statusBarHeight < 0) {
            this.statusBarHeight = DisplayUtil.getStatusBarHeight(activity);
        }
        return this.statusBarHeight;
    }

    public final boolean isKeyboardShow(Activity activity) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa7f70eb", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        int dip2px = DisplayUtil.dip2px(Globals.getApplication(), 62.75f);
        if (activity instanceof ICustomInsetsContainer) {
            CustomInsetsFrameLayout customInsetsFrameLayout = ((ICustomInsetsContainer) activity).getCustomInsetsFrameLayout();
            if (customInsetsFrameLayout == null) {
                View findViewById = activity.findViewById(16908290);
                ckf.f(findViewById, "aty.findViewById<View>(android.R.id.content)");
                i2 = findViewById.getHeight();
            } else if (customInsetsFrameLayout.getInsets()[3] > dip2px) {
                Logger.e("tbKbDebug", " inserts bottom=" + customInsetsFrameLayout.getInsets()[3] + ",大于阈值，键盘判定开");
                return true;
            } else {
                i2 = customInsetsFrameLayout.getHeight() - customInsetsFrameLayout.getInsets()[3];
            }
            int rootViewHeight = getRootViewHeight(activity);
            if (i2 <= 0 || rootViewHeight <= 0) {
                return false;
            }
            int statusBarHeight = getStatusBarHeight(activity);
            int i3 = (rootViewHeight - statusBarHeight) - i2;
            if (this.lastHeightDelta != i3) {
                Logger.e("tbKbDebug", "heightDelta=" + i3 + ",screenHeight=" + rootViewHeight + ",statusBarHeight=" + statusBarHeight + ",displayHeight=" + i2);
                Log.e("tbKbDebug", "heightDelta=" + i3 + ",screenHeight=" + rootViewHeight + ",statusBarHeight=" + statusBarHeight + ",displayHeight=" + i2);
                this.lastHeightDelta = i3;
            }
            return i3 > dip2px;
        }
        if (TBMainHost.fromActivity(activity) != null) {
            View findViewById2 = activity.findViewById(16908290);
            ckf.f(findViewById2, "aty.findViewById<View>(android.R.id.content)");
            i = findViewById2.getHeight();
        } else {
            Rect rect = new Rect();
            Window window = activity.getWindow();
            ckf.f(window, "aty.window");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.height();
        }
        return (getRootViewHeight(activity) - getStatusBarHeight(activity)) - i > dip2px;
    }
}
