package tb;

import android.app.Activity;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r2r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f27072a;

    public r2r(Activity activity) {
        this.f27072a = new WeakReference<>(activity);
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8222bba8", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.f27072a;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        this.f27072a.get().getWindow();
        Window window = this.f27072a.get().getWindow();
        if (z) {
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(9472);
            window.addFlags(Integer.MIN_VALUE);
        } else {
            window.clearFlags(201334784);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
        }
        window.setStatusBarColor(0);
        return true;
    }

    static {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
        }
    }
}
