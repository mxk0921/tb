package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class eiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final eiz INSTANCE = new eiz();

    /* renamed from: a  reason: collision with root package name */
    public static Application f18607a;

    static {
        t2o.a(598736908);
    }

    public final Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("99ed31f5", new Object[]{this});
        }
        Application application = f18607a;
        if (application != null) {
            return application;
        }
        ckf.y("application");
        throw null;
    }

    public final void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        ckf.g(application, "application");
        c(application);
        if (iiz.c()) {
            iiz.a aVar = iiz.Companion;
            aVar.j(" density " + application.getResources().getDisplayMetrics().density + " window width : " + application.getResources().getDisplayMetrics().widthPixels);
        }
    }

    public final void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b733a85", new Object[]{this, application});
            return;
        }
        ckf.g(application, "<set-?>");
        f18607a = application;
    }
}
