package androidx.activity;

import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/activity/EdgeToEdgeBase;", "Landroidx/activity/EdgeToEdgeImpl;", "<init>", "()V", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", pg1.ATOM_EXT_window, "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "Ltb/xhv;", "setUp", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V", "adjustLayoutInDisplayCutoutMode", "(Landroid/view/Window;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class EdgeToEdgeBase implements EdgeToEdgeImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd68142d", new Object[]{this, window});
        } else {
            ckf.g(window, pg1.ATOM_EXT_window);
        }
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5849ccbf", new Object[]{this, systemBarStyle, systemBarStyle2, window, view, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(systemBarStyle, "statusBarStyle");
        ckf.g(systemBarStyle2, "navigationBarStyle");
        ckf.g(window, pg1.ATOM_EXT_window);
        ckf.g(view, "view");
    }
}
