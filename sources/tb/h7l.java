package tb;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h7l implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g1r f20455a;

    public h7l(g1r g1rVar, loq loqVar) {
        this.f20455a = g1rVar;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5648375", new Object[0])).booleanValue();
        }
        boolean equalsIgnoreCase = Build.BOARD.equalsIgnoreCase("OnePlus");
        if (Build.VERSION.SDK_INT == 33) {
            z = true;
        }
        return equalsIgnoreCase & z;
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
        } else if (b() && this.f20455a.a("FixedOppoException", true)) {
            application.registerActivityLifecycleCallbacks(new a61());
        }
    }
}
