package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final id6 b;
    public final a c;
    public final xw5 d;
    public int k;

    /* renamed from: a  reason: collision with root package name */
    public tv5 f26335a = null;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, fw5> f26336a;
        public final Stack<fw5> b = new Stack<>();
        public final id6 c;

        static {
            t2o.a(444597032);
        }

        public a(pv5 pv5Var, id6 id6Var) {
            this.c = id6Var;
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("773f0b36", new Object[]{aVar});
            }
            return aVar.f26336a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0162, code lost:
            ((java.util.HashMap) r17.f26336a).put(r13, r14);
            r10 = r10 + 1;
            r3 = 3;
            r6 = 4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(int r18, tb.lg5 r19, com.taobao.android.dinamicx.DXRuntimeContext r20) {
            /*
                Method dump skipped, instructions count: 402
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.pv5.a.b(int, tb.lg5, com.taobao.android.dinamicx.DXRuntimeContext):boolean");
        }
    }

    static {
        t2o.a(444597031);
    }

    public pv5(xw5 xw5Var) {
        id6 id6Var = new id6();
        this.b = id6Var;
        this.c = new a(this, id6Var);
        this.d = xw5Var;
    }

    public tv5 a(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        gv5 c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tv5) ipChange.ipc$dispatch("f604c1b2", new Object[]{this, lg5Var, dXRuntimeContext});
        }
        long nanoTime = System.nanoTime();
        if (this.f == 0 || lg5Var == null || !lg5Var.k(this.e)) {
            return null;
        }
        byte e = lg5Var.e();
        if (e < 0) {
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_COUNT_ERROR));
            return null;
        }
        this.f26335a = new tv5();
        for (int i = 0; i < e; i++) {
            if (lg5Var.e() != 0 || (c = c(lg5Var.h(), lg5Var, dXRuntimeContext)) == null) {
                return null;
            }
            this.f26335a.d(c.c(), c);
            if (lg5Var.e() != 1) {
                return null;
            }
        }
        this.f26335a.c(a.a(this.c));
        Log.e("TIME:", "eventchain_createEventChain** " + (System.nanoTime() - nanoTime));
        return this.f26335a;
    }

    public final wc5 b(int i, String str, lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wc5) ipChange.ipc$dispatch("23185140", new Object[]{this, new Integer(i), str, lg5Var, dXRuntimeContext});
        }
        try {
            short j = lg5Var.j();
            String str2 = new String(lg5Var.a(), lg5Var.c(), (int) j);
            lg5Var.l(j);
            wc5 wc5Var = new wc5(str2, Long.valueOf(lg5Var.i()));
            if (this.k >= 11) {
                wc5Var.x(wc5.MEGA.byteValue());
                if (this.k >= 12) {
                    wc5Var.x(this.d.a());
                }
            }
            short j2 = lg5Var.j();
            if (j2 != 0) {
                wc5Var.w(new String(lg5Var.a(), lg5Var.c(), (int) j2));
                lg5Var.l(j2);
            }
            short j3 = lg5Var.j();
            if (j3 != 0) {
                wc5Var.u(new String(lg5Var.a(), lg5Var.c(), (int) j3));
                lg5Var.l(j3);
            }
            int h = lg5Var.h();
            if (h != 0) {
                wc5Var.v(new String(lg5Var.a(), lg5Var.c(), h));
                lg5Var.l(h);
            }
            return wc5Var;
        } catch (Exception e) {
            if (DinamicXEngine.j0()) {
                e.printStackTrace();
            }
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_ATOMICEVENT, xv5.a(e)));
            return null;
        }
    }

    public final gv5 c(int i, lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gv5) ipChange.ipc$dispatch("37646d0c", new Object[]{this, new Integer(i), lg5Var, dXRuntimeContext});
        }
        try {
            short j = lg5Var.j();
            String str = new String(lg5Var.a(), lg5Var.c(), (int) j);
            lg5Var.l(j);
            short j2 = lg5Var.j();
            gv5 gv5Var = new gv5(str, j2);
            for (int i2 = 0; i2 < j2; i2++) {
                lg5Var.e();
                wc5 b = b(lg5Var.j(), str, lg5Var, dXRuntimeContext);
                if (b == null) {
                    List<f.a> list = dXRuntimeContext.m().c;
                    ((ArrayList) list).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_ATOMICEVENT, "eventChainName" + str));
                    return null;
                }
                gv5Var.a(b.o(), b);
                lg5Var.e();
            }
            return gv5Var;
        } catch (Exception e) {
            if (DinamicXEngine.j0()) {
                e.printStackTrace();
            }
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_EVENTCHIAN, xv5.a(e)));
            return null;
        }
    }

    public boolean d(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (lg5Var == null || !lg5Var.k(this.e)) {
            return false;
        }
        if (!lg5Var.l(this.f)) {
            Log.e("EventChainLoader_TMTEST", "event chain seekBy error:" + this.f);
            return false;
        }
        lg5Var.c();
        if (lg5Var.c() != this.g) {
            List<f.a> list = dXRuntimeContext.m().c;
            ((ArrayList) list).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_STRING_LOADER_POSITION_ERROR, "event chain string pos error:" + this.g + "  read pos:" + lg5Var.c()));
        } else if (!this.b.b(this.h, lg5Var, dXRuntimeContext)) {
            la6.b("event chain string loadFromBuffer error!");
        }
        if (lg5Var.c() != this.i) {
            List<f.a> list2 = dXRuntimeContext.m().c;
            ((ArrayList) list2).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_EXPR_LOADER_POSITION_ERROR, "event chain expr pos error:" + this.i + "  read pos:" + lg5Var.c()));
        } else if (!this.c.b(this.j, lg5Var, dXRuntimeContext)) {
            la6.b("event chain expr loadFromBuffer error!");
        }
        Log.e("TIME:", "eventchain_loadFromBuffer** " + (System.nanoTime() - nanoTime));
        return true;
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c3ca80", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5b03d4", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e706978", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5bc4cc", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f2581c", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1c9a70", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce971197", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }
}
