package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.p58;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p65 implements pob {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public gpb b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25897a = false;
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<p65> f25898a;

        static {
            t2o.a(455082004);
            t2o.a(613416995);
        }

        public a(p65 p65Var, p65 p65Var2) {
            this.f25898a = new WeakReference<>(p65Var2);
        }

        public final p65 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p65) ipChange.ipc$dispatch("64316ee7", new Object[]{this});
            }
            WeakReference<p65> weakReference = this.f25898a;
            if (weakReference == null || weakReference.get() == null) {
                return null;
            }
            return this.f25898a.get();
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            bcu.a("DynamicTracker::DynamicTrackerListener::onConfigUpdate");
            p65 a2 = a();
            if (a2 != null) {
                a2.j();
            }
        }
    }

    static {
        t2o.a(455082003);
        t2o.a(455082001);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de726f6", new Object[]{this});
        } else {
            this.c = d(ybu.f31970a, ybu.d, false);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa523447", new Object[]{this})).booleanValue();
        }
        boolean d = d(ybu.f31970a, ybu.c, false);
        if (d == this.f25897a) {
            return false;
        }
        this.f25897a = d;
        return true;
    }

    public String c(String str, String str2, String str3) {
        OrangeConfig instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee2566", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (instance = OrangeConfig.getInstance()) == null) {
            return null;
        }
        return instance.getConfig(str, str2, null);
    }

    public boolean d(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d30f9963", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        String c = c(str, str2, null);
        if (!TextUtils.isEmpty(c)) {
            return Boolean.valueOf(c).booleanValue();
        }
        return z;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        k(ybu.f31970a);
        h();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("739ae1d2", new Object[]{this})).booleanValue();
        }
        if (!this.f25897a || !this.c) {
            return false;
        }
        return true;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4852c9b", new Object[]{this})).booleanValue();
        }
        return d(ybu.f31970a, ybu.b, false);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        String str = ybu.f31970a;
        this.f25897a = d(str, ybu.c, false);
        this.c = d(str, ybu.d, false);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57043f57", new Object[]{this})).booleanValue();
        }
        return this.f25897a;
    }

    public void j() {
        gpb gpbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0c99b1", new Object[]{this});
            return;
        }
        a();
        if (b() && (gpbVar = this.b) != null) {
            ((p58.b) gpbVar).a();
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c67bc8", new Object[]{this, str});
            return;
        }
        a aVar = new a(this, this);
        OrangeConfig instance = OrangeConfig.getInstance();
        if (instance != null) {
            instance.registerListener(new String[]{str}, aVar, false);
        }
    }

    public void l(gpb gpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40a8846", new Object[]{this, gpbVar});
        } else {
            this.b = gpbVar;
        }
    }
}
