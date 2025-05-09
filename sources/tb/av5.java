package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class av5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<DXEngineConfig> f16022a;
    public WeakReference<ew5> b;
    public WeakReference<dw5> c;
    public WeakReference<DinamicXEngine> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final String m;
    public final String n;
    public final boolean o;
    public final boolean p;

    static {
        t2o.a(444596491);
    }

    public av5(DXEngineConfig dXEngineConfig) {
        String str;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = 500;
        this.i = false;
        this.j = false;
        this.o = false;
        this.f16022a = new WeakReference<>(dXEngineConfig);
        dXEngineConfig.d();
        if (zg5.m3(dXEngineConfig.f7286a)) {
            this.e = true;
        }
        if (zg5.j3(dXEngineConfig.d())) {
            this.f = true;
        }
        if (zg5.y5(dXEngineConfig.d())) {
            this.g = true;
            this.h = zg5.X2();
        }
        if (zg5.j4(dXEngineConfig.d())) {
            this.o = true;
        }
        boolean U4 = zg5.U4(dXEngineConfig.d());
        this.i = U4;
        Log.e("DXEngineContext", "supportViewReuse " + U4);
        la6.b("DXEngineContext supportViewReuse" + U4);
        if (zg5.x5(dXEngineConfig.d())) {
            this.j = true;
        }
        this.k = zg5.S3(dXEngineConfig.d());
        this.l = zg5.W2(dXEngineConfig.d(), dXEngineConfig.r());
        if (zg5.b5(dXEngineConfig.d(), dXEngineConfig.r())) {
            str = dXEngineConfig.r();
        } else {
            str = DXEngineConfig.DX_DEFAULT_SUB_BIZTYPE;
        }
        this.m = str;
        this.n = b();
        if (zg5.s4(dXEngineConfig.d())) {
            this.p = true;
        }
    }

    public long a() {
        ra6 D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("403ecf43", new Object[]{this})).longValue();
        }
        if (f() == null || (D = f().D()) == null) {
            return -1L;
        }
        return D.a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43934156", new Object[]{this});
        }
        DXEngineConfig c = c();
        return c.d() + "|" + this.m;
    }

    public DXEngineConfig c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("2f487a5b", new Object[]{this});
        }
        DinamicXEngine f = f();
        if (f == null) {
            return this.f16022a.get();
        }
        return f.d();
    }

    public dw5 d() {
        DinamicXEngine f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dw5) ipChange.ipc$dispatch("8c3d2941", new Object[]{this});
        }
        WeakReference<dw5> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        if (!eb5.E() || (f = f()) == null) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    f.V(c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.c.get();
    }

    public ew5 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ew5) ipChange.ipc$dispatch("598f5683", new Object[]{this});
        }
        WeakReference<ew5> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b092b8e8", new Object[]{this});
        }
        WeakReference<DinamicXEngine> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef30d5d5", new Object[]{this});
        }
        return this.n;
    }

    public lub h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lub) ipChange.ipc$dispatch("10322034", new Object[]{this});
        }
        DinamicXEngine f = f();
        if (f == null) {
            return null;
        }
        return f.a();
    }

    public fvb i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvb) ipChange.ipc$dispatch("f542b87", new Object[]{this});
        }
        DinamicXEngine f = f();
        if (f == null) {
            return null;
        }
        return f.L();
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a2570d5", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f479e80", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634134cc", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24559bb8", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1d58ae", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5045bffc", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("679b8095", new Object[]{this})).booleanValue();
        }
        if (c() == null || c().u() == 0 || !this.i) {
            return false;
        }
        return true;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cae44", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6849cd", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93a4edc8", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void t(DXRootView dXRootView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b141deb", new Object[]{this, dXRootView, obj});
        } else if (f() != null) {
            f().y0(dXRootView, obj);
        }
    }

    public void u(dw5 dw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adeea75", new Object[]{this, dw5Var});
        } else {
            this.c = new WeakReference<>(dw5Var);
        }
    }

    public void v(ew5 ew5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b01105", new Object[]{this, ew5Var});
        } else {
            this.b = new WeakReference<>(ew5Var);
        }
    }

    public void w(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1607c7c", new Object[]{this, dinamicXEngine});
        } else {
            this.d = new WeakReference<>(dinamicXEngine);
        }
    }
}
