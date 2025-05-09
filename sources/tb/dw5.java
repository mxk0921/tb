package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, mw5> b = new HashMap();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, lw5> f18108a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18109a;
        public final String b;
        public final mw5 c;

        static {
            t2o.a(444596832);
        }

        public a(boolean z, String str, mw5 mw5Var) {
            this.f18109a = z;
            this.b = str;
            this.c = mw5Var;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "EngineResult{success=" + this.f18109a + ", errorMsg='" + this.b + "', result=" + this.c + '}';
        }
    }

    static {
        t2o.a(444596831);
        if (!eb5.E()) {
            e();
        }
    }

    public static mw5 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("f19eb476", new Object[]{str});
        }
        if (!eb5.E()) {
            return (mw5) ((HashMap) b).get(str);
        }
        HashMap hashMap = (HashMap) b;
        mw5 mw5Var = (mw5) hashMap.get(str);
        if (mw5Var != null) {
            return mw5Var;
        }
        d();
        mw5 mw5Var2 = (mw5) hashMap.get(str);
        if (mw5Var2 != null) {
            return mw5Var2;
        }
        long a2 = k06.a(str);
        evb evbVar = g.n().get(a2);
        if (evbVar != null) {
            if (evbVar instanceof nb5) {
                nb5 nb5Var = (nb5) evbVar;
                if (!TextUtils.isEmpty(nb5Var.getDxFunctionName())) {
                    mw5 J = mw5.J(nb5Var);
                    hashMap.put(str, J);
                    return J;
                }
            }
            return null;
        }
        mvb mvbVar = g.l().get(a2);
        if (mvbVar != null && (mvbVar instanceof ob5)) {
            ob5 ob5Var = (ob5) mvbVar;
            if (!TextUtils.isEmpty(ob5Var.getDxFunctionName())) {
                mw5 J2 = mw5.J(ob5Var);
                hashMap.put(str, J2);
                return J2;
            }
        }
        return null;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (c.compareAndSet(false, true)) {
            e();
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3305d6", new Object[0]);
            return;
        }
        g(pg1.ATOM_EXT_parseInt, new frl());
        g(pg1.ATOM_EXT_parseFloat, new drl());
        g(pg1.ATOM_EXT_substring, new ruq());
        g(pg1.ATOM_EXT_slice, new rb1());
        g(pg1.ATOM_length, new tn5());
        gai gaiVar = new gai();
        f(pg1.ATOM_Math, pg1.ATOM_EXT_abs, new n2a(gaiVar, pg1.ATOM_EXT_abs));
        f(pg1.ATOM_Math, pg1.ATOM_EXT_ceil, new n2a(gaiVar, pg1.ATOM_EXT_ceil));
        f(pg1.ATOM_Math, "exp", new n2a(gaiVar, "exp"));
        f(pg1.ATOM_Math, pg1.ATOM_EXT_floor, new n2a(gaiVar, pg1.ATOM_EXT_floor));
        f(pg1.ATOM_Math, "max", new n2a(gaiVar, "max"));
        f(pg1.ATOM_Math, "min", new n2a(gaiVar, "min"));
        f(pg1.ATOM_Math, pg1.ATOM_EXT_round, new n2a(gaiVar, pg1.ATOM_EXT_round));
        zqf zqfVar = new zqf();
        f("JSON", "parse", new n2a(zqfVar, "parse"));
        f("JSON", pg1.ATOM_EXT_stringify, new n2a(zqfVar, pg1.ATOM_EXT_stringify));
        g("comboEventHandler", new ng5());
    }

    public static void f(String str, String str2, wvb wvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f92e3d", new Object[]{str, str2, wvbVar});
            return;
        }
        HashMap hashMap = (HashMap) b;
        mw5 mw5Var = (mw5) hashMap.get(str);
        if (mw5Var == null) {
            mw5Var = mw5.H(new nw5());
            hashMap.put(str, mw5Var);
        }
        if (mw5Var.v()) {
            mw5Var.j().b(str2, mw5.J(wvbVar));
            return;
        }
        throw new IllegalStateException("objectName is not a builtin obj");
    }

    public static void g(String str, wvb wvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e0273", new Object[]{str, wvbVar});
        } else {
            b.put(str, mw5.J(wvbVar));
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63044939", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !this.f18108a.containsKey(str)) {
            return false;
        }
        return true;
    }

    public a b(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d07e139d", new Object[]{this, str, bArr, new Integer(i)});
        }
        this.f18108a.remove(str);
        lw5 lw5Var = new lw5();
        lw5Var.o(this);
        try {
            lw5Var.a(bArr, i);
            this.f18108a.put(str, lw5Var);
            return new a(true, null, null);
        } catch (Throwable th) {
            th.printStackTrace();
            return new a(false, th.getMessage(), null);
        }
    }

    public a h(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, String str, int i, Object obj, Object obj2, Integer num, Map<String, mw5> map, v16 v16Var, cw5 cw5Var, td5 td5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ef2340ac", new Object[]{this, dXRuntimeContext, dXEvent, str, new Integer(i), obj, obj2, num, map, v16Var, cw5Var, td5Var});
        }
        lw5 lw5Var = this.f18108a.get(str);
        if (lw5Var == null) {
            return new a(false, "template engine not exist: " + str, null);
        }
        try {
            HashMap hashMap = new HashMap();
            if (obj != null && (obj instanceof JSONObject)) {
                hashMap.put("data", mw5.N((JSONObject) obj));
            } else if (obj != null && dXRuntimeContext.w0()) {
                hashMap.put("data", mw5.L(obj));
            }
            if (obj2 != null && (obj2 instanceof JSONObject)) {
                hashMap.put(c4o.KEY_DATA_SOURCE, mw5.N((JSONObject) obj2));
            } else if (obj2 != null && dXRuntimeContext.w0()) {
                hashMap.put(c4o.KEY_DATA_SOURCE, mw5.L(obj2));
            }
            if (dXRuntimeContext.O() instanceof JSONObject) {
                hashMap.put("subdata", mw5.N((JSONObject) dXRuntimeContext.O()));
            } else if (dXRuntimeContext.O() != null && dXRuntimeContext.w0() && (dXRuntimeContext.O() instanceof Object)) {
                hashMap.put("subdata", mw5.L(dXRuntimeContext.O()));
            }
            if (num != null) {
                hashMap.put(bmv.MSGTYPE_INTERVAL, mw5.K(num.intValue()));
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            return new a(true, null, lw5Var.m(dXRuntimeContext, dXEvent, i, hashMap, v16Var, cw5Var, td5Var));
        } catch (Throwable th) {
            xv5.b(th);
            return new a(false, th.getMessage(), null);
        }
    }
}
