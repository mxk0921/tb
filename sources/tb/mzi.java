package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.monitor.Monitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f24407a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Monitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(mzi mziVar) {
        }

        @Override // com.taobao.android.boutique.fastsp.monitor.Monitor
        public void commit(String str, String str2, String str3, String str4, String str5, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f21ad414", new Object[]{this, str, str2, str3, str4, str5, new Long(j)});
            }
        }
    }

    static {
        t2o.a(408944644);
    }

    public mzi(Application application) {
        this.f24407a = application;
    }

    public static mzi a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mzi) ipChange.ipc$dispatch("c568d60d", new Object[]{application});
        }
        return new mzi(application);
    }

    public void b(f1r f1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b66b358", new Object[]{this, f1rVar});
            return;
        }
        Monitor a2 = q19.b().a();
        if (f1rVar.b("useMonitor", false)) {
            p19 p19Var = new p19(this.f24407a);
            q19.b().c(p19Var);
            if (a2 instanceof m19) {
                ((m19) a2).a(new kzi(p19Var));
                return;
            }
            return;
        }
        q19.b().c(new a(this));
    }
}
