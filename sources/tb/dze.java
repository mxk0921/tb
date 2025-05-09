package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.message.DiagnoseAccsMessenger;
import com.taobao.android.tbuprofen.adapter.b;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dze extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jgg f18172a;
        public final /* synthetic */ Application b;

        public a(jgg jggVar, Application application) {
            this.f18172a = jggVar;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.tbuprofen.adapter.a aVar = new com.taobao.android.tbuprofen.adapter.a();
            jgg jggVar = this.f18172a;
            aVar.f9613a = jggVar.f;
            int i = jggVar.i;
            aVar.c = jggVar.h;
            aVar.b = jggVar.g;
            dze.this.q(this.b, aVar);
        }
    }

    public dze(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(dze dzeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitDiagnose");
    }

    public void q(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc233ea", new Object[]{this, context, aVar});
            return;
        }
        try {
            b.b().c(context, aVar);
        } catch (Exception unused) {
        }
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        jgg jggVar = new jgg();
        jggVar.l = Login.getNick();
        jggVar.j = (String) hhg.a("userId", "");
        jggVar.g = (String) hhg.a("process", "com.taobao.taobao");
        jggVar.k = (String) hhg.a("deviceId", "");
        jggVar.f = (String) hhg.a("appVersion", "");
        jggVar.i = ((Integer) hhg.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue();
        jggVar.h = ((Boolean) hhg.a("isDebuggable", Boolean.FALSE)).booleanValue();
        jggVar.e = ((Long) hhg.a("launchStartTime", Long.valueOf(System.currentTimeMillis()))).longValue();
        try {
            uk7.i().d(application).q(new DiagnoseAccsMessenger()).l(jggVar);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 26) {
            new Thread(new a(jggVar, application), "tbp-init").start();
        }
    }
}
