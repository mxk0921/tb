package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gw5 implements o4c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile o4c f20267a = null;
    public static volatile o4c b = null;
    public static boolean c = false;

    static {
        t2o.a(444598030);
        t2o.a(444596624);
    }

    public static o4c e() {
        if (!c && DinamicXEngine.j0() && b == null) {
            synchronized (gw5.class) {
                try {
                    if (b == null) {
                        try {
                            b = (o4c) Class.forName("com.taobao.android.dinamicx.devtools.modules.DXDevToolsExprRecorder").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            c = true;
                            throw th;
                        }
                        c = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (b == null) {
            return f();
        }
        return b;
    }

    public static o4c f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o4c) ipChange.ipc$dispatch("71c1ef30", new Object[0]);
        }
        if (f20267a == null) {
            synchronized (gw5.class) {
                try {
                    if (f20267a == null) {
                        f20267a = new gw5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20267a;
    }

    @Override // tb.o4c
    public void a(fw5 fw5Var, Object obj, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6b9f6a", new Object[]{this, fw5Var, obj, dXRuntimeContext});
        }
    }

    @Override // tb.o4c
    public void b(fw5 fw5Var, Object obj, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91d6dca", new Object[]{this, fw5Var, obj, dXRuntimeContext});
        }
    }

    @Override // tb.o4c
    public void c(fw5 fw5Var, evb evbVar, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8084cf6e", new Object[]{this, fw5Var, evbVar, objArr, dXRuntimeContext});
        }
    }

    @Override // tb.o4c
    public void d(fw5 fw5Var, Object obj, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf6b323", new Object[]{this, fw5Var, obj, dXRuntimeContext});
        }
    }
}
