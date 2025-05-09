package tb;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.Remo;
import com.taobao.android.remoteso.component.d;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.weex.utils.Switch;
import tb.fbe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dzr implements fbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements gcf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f18182a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ fbe.a d;

        public a(dzr dzrVar, long j, boolean z, String str, fbe.a aVar) {
            this.f18182a = j;
            this.b = z;
            this.c = str;
            this.d = aVar;
        }

        @Override // tb.gcf
        public void a(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ef5050", new Object[]{this, cxnVar});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f18182a;
            if (cxnVar.a()) {
                TLog.loge("Weex", "TBWXRemoteManager", "install  success!");
                if (this.b) {
                    kyn.c("taobao_weex_adapter", this.c, uptimeMillis);
                }
                this.d.onSuccess();
                return;
            }
            this.d.onError(cxnVar.e());
            if (1003 == cxnVar.d() && this.b) {
                kyn.d("taobao_weex_adapter", this.c);
            }
            TLog.loge("Triver", "TBWXRemoteManager", "install failed!");
        }
    }

    static {
        t2o.a(773849129);
        t2o.a(773849126);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22df6630", new Object[0]);
        }
        return Remo.h("taobao_weex_adapter");
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[]{this})).booleanValue();
        }
        return "remote".equals(a());
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8838b25", new Object[]{this, context})).booleanValue();
        }
        if (Switch.isSwitchOn(".disableWeexRemote").booleanValue()) {
            return false;
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        cxn c = Remo.c(d.a().d(context).a("flexa", "taobao_weex_adapter").b());
        boolean a2 = c.a();
        TLog.loge("Weex", "TBWXRemoteManager", " remote install result : " + c);
        return a2;
    }

    public void c(String str, String str2, Context context, boolean z, fbe.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3cc413", new Object[]{this, str, str2, context, new Boolean(z), aVar});
        } else if (Switch.isSwitchOn(".disableWeexRemote").booleanValue()) {
            aVar.onError("disableWeexRemote");
        } else {
            boolean equals = "init".equals(str);
            boolean z2 = !equals;
            if (!equals) {
                kyn.a("taobao_weex_adapter", str2);
            }
            if (b(context)) {
                TLog.loge("Weex", "TBWXRemoteManager", " remote has installed:");
                aVar.onSuccess();
                return;
            }
            if (!equals) {
                kyn.e("taobao_weex_adapter", str2);
            }
            Remo.e(d.a().d(context).a("flexa", "taobao_weex_adapter").g(z).c(new a(this, SystemClock.uptimeMillis(), z2, str2, aVar)).b());
        }
    }
}
