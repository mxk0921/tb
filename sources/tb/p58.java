package tb;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p58 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static p58 g;
    public o65 c;

    /* renamed from: a  reason: collision with root package name */
    public n65 f25885a = null;
    public final List<k65> b = new ArrayList();
    public final isb d = new a();
    public final gpb e = new b();
    public final up8 f = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements isb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.isb
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null) {
                int i = message.what;
                if (i == 1) {
                    p58.a(p58.this);
                } else if (i == 2) {
                    p58.b(p58.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements gpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c91e82", new Object[]{this});
            } else {
                p58.c(p58.this, 2, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements up8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.up8
        public Map<String, String> getExposureViewProperties(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("21fe9e1", new Object[]{this, str, view});
            }
            try {
                k65 d = p58.d(p58.this, view);
                if (d != null) {
                    return d.getExposureViewProperties(str, view);
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                k71.a("catch_crash", "DynamicTracker.getExposureViewProperties", "-999", e.getMessage());
                return null;
            }
        }

        @Override // tb.up8
        public vp8 getExposureViewTag(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vp8) ipChange.ipc$dispatch("77c81b6a", new Object[]{this, str, view});
            }
            try {
                k65 d = p58.d(p58.this, view);
                if (d != null) {
                    return d.getExposureViewTag(str, view);
                }
                return null;
            } catch (Exception e) {
                k71.a("catch_crash", "DynamicTracker.getExposureViewTag", "-999", e.getMessage());
                e.printStackTrace();
                return null;
            }
        }

        @Override // tb.up8
        public boolean isExposureView(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9ec7c8cf", new Object[]{this, str, view})).booleanValue();
            }
            try {
                k65 d = p58.d(p58.this, view);
                if (d != null) {
                    return d.isExposureView(str, view);
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                k71.a("catch_crash", "DynamicTracker.isExposureView", "-999", e.getMessage());
                return false;
            }
        }
    }

    static {
        t2o.a(455081989);
    }

    public static /* synthetic */ void a(p58 p58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a551967", new Object[]{p58Var});
        } else {
            p58Var.p();
        }
    }

    public static /* synthetic */ void b(p58 p58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfebf86", new Object[]{p58Var});
        } else {
            p58Var.o();
        }
    }

    public static /* synthetic */ void c(p58 p58Var, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e676e5a", new Object[]{p58Var, new Integer(i), obj});
        } else {
            p58Var.r(i, obj);
        }
    }

    public static /* synthetic */ k65 d(p58 p58Var, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k65) ipChange.ipc$dispatch("3853b1b7", new Object[]{p58Var, view});
        }
        return p58Var.f(view);
    }

    public static p58 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p58) ipChange.ipc$dispatch("6532ec4a", new Object[0]);
        }
        if (g == null) {
            g = new p58();
        }
        return g;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1beb7de2", new Object[]{this});
            return;
        }
        bcu.a("DynamicTracker::checkUTIntercept");
        if (n()) {
            q();
        } else {
            s();
        }
    }

    public final k65 f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k65) ipChange.ipc$dispatch("829ff7ed", new Object[]{this, view});
        }
        if (view == null || e9x.j(view) == null) {
            return null;
        }
        return this.c;
    }

    public o65 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o65) ipChange.ipc$dispatch("77c7d498", new Object[]{this});
        }
        return this.c;
    }

    public void h(String str, Message message) {
        o65 o65Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bcd25d", new Object[]{this, str, message});
        } else if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (str.equals("weex_update_page_config")) {
                o65 o65Var2 = this.c;
                if (o65Var2 != null) {
                    o65Var2.t(message);
                }
            } else if (str.equals("action_weex_uninit") && (o65Var = this.c) != null) {
                o65Var.q(message);
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        bcu.c();
        bcu.a("DynamicTracker::init");
        k();
        l();
        r(1, null);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        bcu.a("DynamicTracker::initConfig");
        if (this.b != null) {
            for (int i = 0; i < ((ArrayList) this.b).size(); i++) {
                ((k65) ((ArrayList) this.b).get(i)).a(this.e);
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c66691d", new Object[]{this});
            return;
        }
        o65 o65Var = new o65();
        this.c = o65Var;
        ((ArrayList) this.b).add(o65Var);
        ((ArrayList) this.b).add(new m65());
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe0aac1", new Object[]{this});
            return;
        }
        bcu.a("DynamicTracker::initThread");
        n65 n65Var = new n65(Looper.getMainLooper());
        this.f25885a = n65Var;
        n65Var.c(this.d);
    }

    public boolean n() {
        k65 k65Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57043f57", new Object[]{this})).booleanValue();
        }
        List<k65> list = this.b;
        if (list == null || ((ArrayList) list).size() == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < ((ArrayList) this.b).size() && ((k65Var = (k65) ((ArrayList) this.b).get(i)) == null || !((z = z | k65Var.b()))); i++) {
        }
        return z;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da918", new Object[]{this});
        } else {
            e();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea799edf", new Object[]{this});
            return;
        }
        j();
        e();
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df496ae7", new Object[]{this});
            return;
        }
        bcu.a("DynamicTracker::registerUTIntercept");
        g3v instance = g3v.getInstance();
        if (instance != null) {
            instance.registerExposureViewHandler(this.f);
        }
    }

    public final void r(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0f35f9", new Object[]{this, new Integer(i), obj});
            return;
        }
        n65 n65Var = this.f25885a;
        if (n65Var != null) {
            n65Var.b(i, obj);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd4d80e", new Object[]{this});
            return;
        }
        bcu.a("DynamicTracker::unRegisterUTIntercept");
        g3v instance = g3v.getInstance();
        if (instance != null) {
            instance.unRegisterExposureViewHandler(this.f);
        }
    }
}
