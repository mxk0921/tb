package com.taobao.tao.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.graphics.ColorUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.why;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SystemBarDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ENABLE_KEY = "immersive_status_enable";
    private static final String GROUP_NAME = "message_box_switch";
    private static final int MASK_COLOR = 805306368;
    private static final String TAG = "SystemBarDecorator";
    private WeakReference<Activity> mActivity;
    private SystemBarConfig mConfig;
    private View mStatusBarTintView;
    private boolean mStatusBarAvailable = true;
    private boolean mNavBarAvailable = false;
    private int mType = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class SystemBarConfig {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
        private static final String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
        private static final String NAV_BAR_WIDTH_RES_NAME = "navigation_bar_width";
        private static final String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
        private static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
        private final int mActionBarHeight;
        private final boolean mInPortrait;
        private final float mSmallestWidthDp;
        private final int mStatusBarHeight;
        private final boolean mTranslucentNavBar;
        private final boolean mTranslucentStatusBar;

        public SystemBarConfig(Activity activity, boolean z, boolean z2) {
            this.mInPortrait = isPortrait(activity);
            this.mSmallestWidthDp = getSmallestWidthDp(activity);
            this.mStatusBarHeight = getStatusBarHeight(activity);
            this.mActionBarHeight = getActionBarHeight(activity);
            this.mTranslucentStatusBar = z;
            this.mTranslucentNavBar = z2;
        }

        public static int getActionBarHeight(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("be5e9886", new Object[]{context})).intValue();
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        private static int getInternalDimensionSize(Resources resources, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("84c806a3", new Object[]{resources, str})).intValue();
            }
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        private float getSmallestWidthDp(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6abde4e6", new Object[]{this, activity})).floatValue();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            float f = displayMetrics.density;
            return Math.min(displayMetrics.widthPixels / f, displayMetrics.heightPixels / f);
        }

        public static int getStatusBarHeight(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue() : getInternalDimensionSize(context.getResources(), STATUS_BAR_HEIGHT_RES_NAME);
        }

        public static boolean isPortrait(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1709c060", new Object[]{context})).booleanValue();
            }
            if (context.getResources().getConfiguration().orientation == 1) {
                return true;
            }
            return false;
        }

        public int getPixelInsetTop(boolean z) {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2e386c38", new Object[]{this, new Boolean(z)})).intValue();
            }
            if (this.mTranslucentStatusBar) {
                i = this.mStatusBarHeight;
            } else {
                i = 0;
            }
            if (z) {
                i2 = this.mActionBarHeight;
            }
            return i + i2;
        }

        public boolean isNavigationAtBottom() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("34e993c7", new Object[]{this})).booleanValue();
            }
            if (this.mSmallestWidthDp >= 600.0f || this.mInPortrait) {
                return true;
            }
            return false;
        }

        public int getStatusBarHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue() : this.mStatusBarHeight;
        }

        public int getActionBarHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue() : this.mActionBarHeight;
        }
    }

    public SystemBarDecorator(Activity activity) {
        this.mActivity = new WeakReference<>(activity);
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        return getSystemComponentDimen(context, "status_bar_height");
    }

    public static int getSystemComponentDimen(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c8f46c5", new Object[]{context, str})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier(str, "dimen", "android");
            Log.e(TAG, str + " " + identifier);
            return context.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void enableFitsWindowsOnRoot(boolean z) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1d716e", new Object[]{this, new Boolean(z)});
            return;
        }
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null && weakReference.get() != null && (childAt = ((ViewGroup) this.mActivity.get().findViewById(16908290)).getChildAt(0)) != null && z) {
            childAt.setFitsSystemWindows(true);
        }
    }

    @Deprecated
    public boolean enableImmersiveStatus(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1181ae7", new Object[]{this, new Boolean(z)})).booleanValue() : enableImmersiveStatus(null, true, z);
    }

    public boolean enableImmersiveStatusBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("80119d34", new Object[]{this})).booleanValue() : enableImmersiveStatusBar(false);
    }

    public SystemBarConfig getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemBarConfig) ipChange.ipc$dispatch("d88fa4a0", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        if (this.mConfig == null) {
            this.mConfig = new SystemBarConfig(this.mActivity.get(), this.mStatusBarAvailable, this.mNavBarAvailable);
        }
        return this.mConfig;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public boolean isStatusBarAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73cbbb5d", new Object[]{this})).booleanValue();
        }
        return this.mStatusBarAvailable;
    }

    public void setStatusBarColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d82f5b5", new Object[]{this, str});
        } else {
            setStatusBarColor(str, true);
        }
    }

    @Deprecated
    public boolean enableImmersiveStatus(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83e9e49d", new Object[]{this, str, new Boolean(z)})).booleanValue() : enableImmersiveStatus(str, true, z);
    }

    public boolean enableImmersiveStatusBar(boolean z) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8222bba8", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return false;
        }
        activity.getWindow();
        Window window = activity.getWindow();
        int systemUiVisibility = TBStatusBarSwitch.isIconVisibleFeatureOpen(activity) ? window.getDecorView().getSystemUiVisibility() : 0;
        try {
            if (z) {
                window.clearFlags(201326592);
                window.getDecorView().setSystemUiVisibility(systemUiVisibility | 9472);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                window.clearFlags(201334784);
                window.getDecorView().setSystemUiVisibility(systemUiVisibility | 1280);
                window.addFlags(Integer.MIN_VALUE);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        window.setStatusBarColor(0);
        if (TBStatusBarUtils.isMIUIDevice()) {
            TBStatusBarUtils.miuiSetStatusBarLightMode(activity, z);
        } else if (TBStatusBarUtils.isMeizuDevice()) {
            TBStatusBarUtils.setStatusBarDarkIcon(activity, z);
        }
        return true;
    }

    public void setStatusBarColor(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32dc73bf", new Object[]{this, str, new Boolean(z)});
            return;
        }
        int parseColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
        if (!TextUtils.isEmpty(str)) {
            parseColor = Color.parseColor(str);
        }
        setStatusBarColor(parseColor, z);
    }

    @Deprecated
    public boolean enableImmersiveStatus(String str, boolean z, boolean z2) {
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f953615f", new Object[]{this, str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (!this.mStatusBarAvailable || (weakReference = this.mActivity) == null || weakReference.get() == null) {
            return false;
        }
        Activity activity = this.mActivity.get();
        int i = this.mType;
        if (i != 1) {
            if (i != 2) {
                this.mStatusBarAvailable = false;
                return false;
            }
            activity.getWindow().clearFlags(201326592);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            if (z2) {
                activity.getWindow().getDecorView().setSystemUiVisibility(1024);
            }
        }
        setStatusBarColor(str, z);
        return true;
    }

    public void setStatusBarColor(int i, boolean z) {
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ffa21c", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mStatusBarAvailable && (weakReference = this.mActivity) != null && weakReference.get() != null) {
            Activity activity = this.mActivity.get();
            if (z) {
                i = ColorUtils.compositeColors((int) MASK_COLOR, i);
            }
            if (this.mType == 2) {
                activity.getWindow().setStatusBarColor(i);
            }
        }
    }
}
