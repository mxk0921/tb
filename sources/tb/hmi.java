package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final kpi b;
    public final FluidContext c;

    /* renamed from: a  reason: collision with root package name */
    public final List<lr9> f20745a = new ArrayList();
    public final Handler d = new a(Looper.getMainLooper());
    public boolean e = false;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/center/MessageCenter$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            vrp vrpVar = (vrp) message.obj;
            if (vrpVar.c == null) {
                ir9.b("MessageCenter", "The message name is null, message: " + vrpVar);
                return;
            }
            hmi.a(hmi.this, vrpVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20747a;
        public final /* synthetic */ lr9 b;
        public final /* synthetic */ vrp c;

        public b(String str, lr9 lr9Var, vrp vrpVar) {
            this.f20747a = str;
            this.b = lr9Var;
            this.c = vrpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            se2 b = new se2(this.f20747a).b();
            this.b.k(this.c);
            b.a();
        }
    }

    static {
        t2o.a(468714330);
        t2o.a(468714329);
    }

    public hmi(FluidContext fluidContext, kpi kpiVar) {
        this.c = fluidContext;
        this.b = kpiVar;
    }

    public static /* synthetic */ void a(hmi hmiVar, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d09ef0", new Object[]{hmiVar, vrpVar});
        } else {
            hmiVar.c(vrpVar);
        }
    }

    public static void b(vrp vrpVar, lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e511bbb", new Object[]{vrpVar, lr9Var});
            return;
        }
        String c = bsr.c(lr9Var, vrpVar);
        az9.o(new b(c, lr9Var, vrpVar), bsr.b(lr9Var), bsr.a(lr9Var), c);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.e = true;
        Iterator it = ((ArrayList) this.f20745a).iterator();
        while (it.hasNext()) {
            ((lr9) it.next()).onDestroy();
        }
        this.f = true;
    }

    public void e(lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fafcd48f", new Object[]{this, lr9Var});
        } else if (lr9Var != null && !((ArrayList) this.f20745a).contains(lr9Var)) {
            ((ArrayList) this.f20745a).add(lr9Var);
        }
    }

    public void f(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82892d4d", new Object[]{this, vrpVar});
        } else if (this.f) {
            ir9.b("MessageCenter", "sendMessage, THe MessageCenter is destroyed, message: " + vrpVar);
        } else if (vrpVar.d == null && !"VSMSG_registerFilter".equals(vrpVar.c)) {
            ir9.b("MessageCenter", "sendMessage, The message id is null, message: " + vrpVar);
        } else if (vrp.MSG_DATA_CHANGE.equals(vrpVar.c)) {
            c(vrpVar);
        } else {
            Message obtain = Message.obtain();
            obtain.obj = vrpVar;
            this.d.sendMessage(obtain);
            this.b.a(vrpVar);
        }
    }

    public void g(lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c88d48", new Object[]{this, lr9Var});
        } else if (!this.e && lr9Var != null) {
            ((ArrayList) this.f20745a).remove(lr9Var);
        }
    }

    public final void c(vrp vrpVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9efb8a", new Object[]{this, vrpVar});
            return;
        }
        igs.a("handleMessageInternal " + vrpVar.c);
        try {
            Map map = vrpVar.h;
            boolean z2 = map != null && nwv.o(map.get(sj4.UPDATE_DATA_MSG_FOR_GLOBAL_H5), false);
            boolean equals = vrp.MSG_DATA_CHANGE.equals(vrpVar.c);
            Iterator it = ((ArrayList) this.f20745a).iterator();
            while (it.hasNext()) {
                lr9 lr9Var = (lr9) it.next();
                boolean z3 = lr9Var instanceof rba;
                if (!equals || !z2 || z3) {
                    if (!lr9Var.b() && lr9Var.j(vrpVar)) {
                        if (!(lr9Var instanceof rba) && !lr9Var.a()) {
                            se2 b2 = new se2(bsr.c(lr9Var, vrpVar)).b();
                            lr9Var.k(vrpVar);
                            b2.a();
                            z = true;
                        }
                        b(vrpVar, lr9Var);
                        z = true;
                    }
                }
            }
        } catch (Throwable th) {
            if (!p91.j()) {
                ir9.b("MessageCenter", "message: " + vrpVar + ", error: " + th.getMessage());
            } else {
                throw th;
            }
        }
        if (!z) {
            ir9.b("MessageCenter", "The message was not handled, message: " + vrpVar);
        }
        igs.c();
    }
}
