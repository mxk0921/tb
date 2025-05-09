package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.taobao.android.tbuprofen.adapter.anr.b;
import com.taobao.tao.TaobaoApplication;
import dalvik.system.ZipPathValidator;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x42 extends s9t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InstantPatcher.create(x42.this.f27892a).applyPatch();
            }
        }
    }

    public x42(Application application, String str, String str2) {
        super(application, str, str2);
    }

    public static /* synthetic */ Object ipc$super(x42 x42Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/BasicPreLaunch");
    }

    @Override // tb.s9t
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        f();
        d();
        com.taobao.android.ab.api.a.c(this.f27892a);
        zgg.a(this.f27892a, null);
        e();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6ee440", new Object[]{this});
            return;
        }
        try {
            Application application = this.f27892a;
            TaobaoApplication taobaoApplication = (TaobaoApplication) application;
            if (iia.b(application)) {
                ZipPathValidator.clearCallback();
            }
        } catch (Throwable unused) {
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894996ec", new Object[]{this});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("processName", TaobaoApplication.sProcessName);
            hashMap.put("startTime", Long.valueOf(TaobaoApplication.START));
            hashMap.put("version", TaobaoApplication.sAppVersion);
            b.a(this.f27892a, hashMap);
        } catch (Throwable unused) {
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dedad9f", new Object[]{this});
        } else if (!iia.a(this.f27892a)) {
            d51.f(new a());
        }
    }
}
