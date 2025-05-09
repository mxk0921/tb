package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class WindowCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api16Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api16Impl() {
        }

        public static void setDecorFitsSystemWindows(Window window, boolean z) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cce9a63", new Object[]{window, new Boolean(z)});
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static <T> T requireViewById(Window window, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("a8d00e33", new Object[]{window, new Integer(i)});
            }
            return (T) window.requireViewById(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static void setDecorFitsSystemWindows(Window window, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cce9a63", new Object[]{window, new Boolean(z)});
            } else {
                window.setDecorFitsSystemWindows(z);
            }
        }
    }

    private WindowCompat() {
    }

    public static WindowInsetsControllerCompat getInsetsController(Window window, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsControllerCompat) ipChange.ipc$dispatch("b643ef47", new Object[]{window, view});
        }
        return new WindowInsetsControllerCompat(window, view);
    }

    public static <T extends View> T requireViewById(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("a1448161", new Object[]{window, new Integer(i)}));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) ((View) Api28Impl.requireViewById(window, i));
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cce9a63", new Object[]{window, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setDecorFitsSystemWindows(window, z);
        } else {
            Api16Impl.setDecorFitsSystemWindows(window, z);
        }
    }
}
