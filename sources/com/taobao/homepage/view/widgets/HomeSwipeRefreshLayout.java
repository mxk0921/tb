package com.taobao.homepage.view.widgets;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.utils.NavigationBarUtils;
import tb.bqa;
import tb.pg1;
import tb.t2o;
import tb.vxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HomeSwipeRefreshLayout extends TBSwipeRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeSwipeRefreshLayout";
    private Boolean mEnablePreRender;

    static {
        t2o.a(729809180);
    }

    public HomeSwipeRefreshLayout(Context context) {
        super(context);
    }

    private boolean enablePreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc614161", new Object[]{this})).booleanValue();
        }
        if (this.mEnablePreRender == null) {
            this.mEnablePreRender = Boolean.valueOf(vxl.b().u());
        }
        return this.mEnablePreRender.booleanValue();
    }

    private int getContentHeightWithContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97739515", new Object[]{this, context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics);
        if (enablePreRender()) {
            return displayMetrics.heightPixels;
        }
        return displayMetrics.heightPixels - getNavigationBarHeightWithContext(context);
    }

    public static /* synthetic */ Object ipc$super(HomeSwipeRefreshLayout homeSwipeRefreshLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1376037801) {
            super.initContentHeight();
            return null;
        } else if (hashCode == -172423314) {
            super.initNavBarHeight();
            return null;
        } else if (hashCode == 2108156838) {
            return new Boolean(super.isChildScrollToTop());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/view/widgets/HomeSwipeRefreshLayout");
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
    public void initContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfb5457", new Object[]{this});
        } else if (!enablePreRender()) {
            super.initContentHeight();
        } else if (this.mContentHeight == -1) {
            this.mContentHeight = getContentHeightWithContext(getContext());
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
    public void initNavBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b9076e", new Object[]{this});
        } else if (!enablePreRender()) {
            super.initNavBarHeight();
        } else if (this.mNavigationBarHeight == -1) {
            this.mNavigationBarHeight = getNavigationBarHeightWithContext(getContext());
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
    public boolean isChildScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue();
        }
        try {
            return super.isChildScrollToTop();
        } catch (Throwable th) {
            bqa.d(TAG, "TBSwipeRefreshLayout isChildScrollToTop error " + th);
            return false;
        }
    }

    public void reCalculateHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288b8193", new Object[]{this, activity});
        } else if (activity != null) {
            this.mNavigationBarHeight = NavigationBarUtils.getNavigationBarHeight(activity);
            this.mContentHeight = NavigationBarUtils.getContentHeight(activity);
        }
    }

    public void setCurrentTargetOffsetTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186a7622", new Object[]{this, new Integer(i)});
        } else {
            this.mCurrentTargetOffsetTop = i;
        }
    }

    public HomeSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int getNavigationBarHeightWithContext(Context context) {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fdf2ffb", new Object[]{context})).intValue();
        }
        if (context == null || context.getResources() == null || (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }
}
