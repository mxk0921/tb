package tb;

import com.alibaba.jsi.standard.JNIBridge;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<Long, dqf> m = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f18011a;
    public vl8 b;
    public final JSEngine c;
    public long d;
    public final long e;
    public Runnable g;
    public final lpf i;
    public final utf j;
    public final gsf k;
    public final Object f = new Object();
    public boolean h = false;
    public final Object[] l = new Object[6];

    static {
        t2o.a(921698316);
    }

    public dqf(String str, Object obj, JSEngine jSEngine, Class<? extends Annotation> cls) {
        lpf lpfVar = new lpf(this);
        this.i = lpfVar;
        this.j = new utf(this, lpfVar);
        this.k = new gsf(this, lpfVar);
        this.f18011a = str;
        this.c = jSEngine;
        long nativeCreateContext = JNIBridge.nativeCreateContext(jSEngine.getNativeInstance(), str, null);
        this.d = nativeCreateContext;
        long nativeCommand = JNIBridge.nativeCommand(2L, nativeCreateContext, null);
        this.e = nativeCommand;
        Map<Long, dqf> map = m;
        synchronized (map) {
            ((HashMap) map).put(Long.valueOf(nativeCommand), this);
        }
        lpfVar.B(obj, cls);
    }

    public static dqf d(long j) {
        dqf dqfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("3a92e55d", new Object[]{new Long(j)});
        }
        Map<Long, dqf> map = m;
        synchronized (map) {
            dqfVar = (dqf) ((HashMap) map).get(Long.valueOf(j));
        }
        return dqfVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab4c1dfc", new Object[]{this})).booleanValue();
        }
        if (!r()) {
            return false;
        }
        a0y.o("Context has been destroyed! Id: " + this.e);
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            try {
                if (!a()) {
                    w();
                    JNIBridge.nativeDisposeContext(this.c.getNativeInstance(), this.d);
                    Map<Long, dqf> map = m;
                    synchronized (map) {
                        ((HashMap) map).remove(Long.valueOf(this.e));
                    }
                    this.d = 0L;
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ksf c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("343f35e6", new Object[]{this, str, str2});
        }
        synchronized (this.f) {
            try {
                ksf ksfVar = null;
                if (a()) {
                    return null;
                }
                Object nativeExecuteJS = JNIBridge.nativeExecuteJS(this.c.getNativeInstance(), this.d, str, str2);
                if (nativeExecuteJS != null) {
                    ksfVar = (ksf) nativeExecuteJS;
                }
                this.c.requestLoopAsync(0L);
                return ksfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Runnable e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5786af3", new Object[]{this});
        }
        return this.g;
    }

    public vl8 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vl8) ipChange.ipc$dispatch("d4c6db95", new Object[]{this});
        }
        return this.b;
    }

    public kqf g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqf) ipChange.ipc$dispatch("25960fcf", new Object[]{this});
        }
        if (a()) {
            return null;
        }
        Object cmd = Bridge.cmd(this, 12);
        if (cmd instanceof kqf) {
            return (kqf) cmd;
        }
        return null;
    }

    public ksf h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("18b5f637", new Object[]{this, str});
        }
        yrf p = p();
        if (p == null) {
            return null;
        }
        ksf y = p.y(this, str);
        p.delete();
        return y;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public lpf j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpf) ipChange.ipc$dispatch("5ba91116", new Object[]{this});
        }
        return this.i;
    }

    public JSEngine k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("39541b2c", new Object[]{this});
        }
        return this.c;
    }

    public gsf l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsf) ipChange.ipc$dispatch("fc65252d", new Object[]{this});
        }
        return this.k;
    }

    public utf m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utf) ipChange.ipc$dispatch("581db54d", new Object[]{this});
        }
        return this.j;
    }

    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755f1c9c", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.f18011a;
    }

    public yrf p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrf) ipChange.ipc$dispatch("c2437cb0", new Object[]{this});
        }
        if (a()) {
            return null;
        }
        Object cmd = Bridge.cmd(this, 10);
        if (cmd instanceof yrf) {
            return (yrf) cmd;
        }
        return null;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65fcbce0", new Object[]{this})).booleanValue();
        }
        if (!a() && Bridge.cmd(this, 11) != null) {
            return true;
        }
        return false;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebb099e4", new Object[]{this, str});
        }
        vl8 vl8Var = this.b;
        if (vl8Var != null) {
            return vl8Var.onGetSourceMapFilePath(this, str);
        }
        return null;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc0f0df", new Object[]{this});
            return;
        }
        vl8 vl8Var = this.b;
        if (vl8Var != null) {
            vl8Var.onReload(this);
        }
    }

    public boolean u(kqf kqfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b53e7121", new Object[]{this, kqfVar, new Integer(i)})).booleanValue();
        }
        vl8 vl8Var = this.b;
        if (vl8Var != null) {
            return vl8Var.onUncaughtJSException(this, kqfVar, i);
        }
        if (kqfVar != null) {
            kqfVar.delete();
        }
        return false;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            try {
                if (!a()) {
                    w();
                    JNIBridge.nativeResetContext(this.c.getNativeInstance(), this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae46393", new Object[]{this});
            return;
        }
        ye8 ye8Var = new ye8(this.c);
        try {
            this.k.f();
            this.i.L();
        } finally {
            ye8Var.c();
        }
    }

    public void x(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75bc073", new Object[]{this, runnable});
        } else {
            this.g = runnable;
        }
    }

    public void y(vl8 vl8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314bb53", new Object[]{this, vl8Var});
        } else {
            this.b = vl8Var;
        }
    }

    public void z(kqf kqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f0812f", new Object[]{this, kqfVar});
        } else if (!a()) {
            Bridge.cmd(this, 13, new Object[]{kqfVar});
        }
    }
}
