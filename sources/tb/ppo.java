package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ppo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ppo d = new ppo();
    public static final kgg e = new kgg();

    /* renamed from: a  reason: collision with root package name */
    public Application f26226a;
    public String b;
    public xhq c;

    public static ppo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppo) ipChange.ipc$dispatch("431b79c4", new Object[0]);
        }
        return d;
    }

    public kgg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgg) ipChange.ipc$dispatch("6be21625", new Object[]{this});
        }
        return e;
    }

    public xhq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhq) ipChange.ipc$dispatch("ee884526", new Object[]{this});
        }
        return this.c;
    }

    public void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        this.f26226a = application;
        this.c = biq.c();
        g(application);
    }

    public void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a30639", new Object[]{this, application});
        } else {
            this.f26226a = application;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void h(xhq xhqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a70c1", new Object[]{this, xhqVar});
            return;
        }
        this.c = xhqVar;
        g(this.f26226a);
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34650def", new Object[]{this, context});
            return;
        }
        xhq xhqVar = this.c;
        if (xhqVar != null) {
            if (TextUtils.isEmpty(this.b)) {
                try {
                    this.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception unused) {
                }
            }
            if (xhqVar.f31405a) {
                vgg.a(context);
                TCrashSDK.instance().addJvmUncaughtCrashListener(new npo(this.f26226a, this.b));
            }
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo("startup_context", this.c.toString());
        }
    }
}
