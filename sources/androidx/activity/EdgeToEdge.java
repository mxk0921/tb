package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\" \u0010\u000f\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f\"\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Ltb/xhv;", "enable", "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "enableEdgeToEdge", "", "DefaultLightScrim", TLogTracker.LEVEL_INFO, "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultDarkScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "Landroidx/activity/EdgeToEdgeImpl;", "Impl", "Landroidx/activity/EdgeToEdgeImpl;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EdgeToEdge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static final void enable(ComponentActivity componentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcae09c5", new Object[]{componentActivity});
            return;
        }
        ckf.g(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8515b387", new Object[]{componentActivity, systemBarStyle, systemBarStyle2, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc28371f", new Object[0])).intValue();
        }
        return DefaultDarkScrim;
    }

    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e16e42c", new Object[0]);
        }
    }

    public static final int getDefaultLightScrim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34532cb5", new Object[0])).intValue();
        }
        return DefaultLightScrim;
    }

    public static /* synthetic */ void getDefaultLightScrim$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4028c2", new Object[0]);
        }
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879eb06d", new Object[]{componentActivity, systemBarStyle});
            return;
        }
        ckf.g(componentActivity, "<this>");
        ckf.g(systemBarStyle, "statusBarStyle");
        enable$default(componentActivity, systemBarStyle, null, 2, null);
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6123ad15", new Object[]{componentActivity, systemBarStyle, systemBarStyle2});
            return;
        }
        ckf.g(componentActivity, "<this>");
        ckf.g(systemBarStyle, "statusBarStyle");
        ckf.g(systemBarStyle2, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        ckf.f(decorView, "window.decorView");
        g1a<Resources, Boolean> detectDarkMode$activity_release = systemBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        ckf.f(resources, "view.resources");
        boolean booleanValue = detectDarkMode$activity_release.invoke(resources).booleanValue();
        g1a<Resources, Boolean> detectDarkMode$activity_release2 = systemBarStyle2.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        ckf.f(resources2, "view.resources");
        boolean booleanValue2 = detectDarkMode$activity_release2.invoke(resources2).booleanValue();
        EdgeToEdgeImpl edgeToEdgeImpl = Impl;
        if (edgeToEdgeImpl == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                edgeToEdgeImpl = new EdgeToEdgeApi30();
            } else if (i >= 29) {
                edgeToEdgeImpl = new EdgeToEdgeApi29();
            } else if (i >= 28) {
                edgeToEdgeImpl = new EdgeToEdgeApi28();
            } else if (i >= 26) {
                edgeToEdgeImpl = new EdgeToEdgeApi26();
            } else if (i >= 23) {
                edgeToEdgeImpl = new EdgeToEdgeApi23();
            } else {
                edgeToEdgeImpl = new EdgeToEdgeApi21();
                Impl = edgeToEdgeImpl;
            }
        }
        Window window = componentActivity.getWindow();
        ckf.f(window, pg1.ATOM_EXT_window);
        edgeToEdgeImpl.setUp(systemBarStyle, systemBarStyle2, window, decorView, booleanValue, booleanValue2);
        Window window2 = componentActivity.getWindow();
        ckf.f(window2, pg1.ATOM_EXT_window);
        edgeToEdgeImpl.adjustLayoutInDisplayCutoutMode(window2);
    }
}
