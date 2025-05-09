package tb;

import android.content.Context;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import tb.jb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class bd5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ThreadLocal<m> j = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public long f16330a;
    public String b;
    public WeakReference<DXRuntimeContext> c;
    public k d;
    public WeakReference<ph5> e;
    public WeakReference<p> f;
    public DXRenderOptions g;
    public volatile boolean h;
    public boolean i;

    static {
        t2o.a(444596632);
    }

    public bd5(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, p pVar, k kVar, av5 av5Var, ph5 ph5Var) {
        this.c = new WeakReference<>(dXRuntimeContext);
        this.d = kVar;
        this.g = dXRenderOptions;
        if (ph5Var != null) {
            this.e = new WeakReference<>(ph5Var);
        }
        if (pVar != null) {
            this.f = new WeakReference<>(pVar);
        }
        this.f16330a = System.nanoTime();
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89ecce80", new Object[]{this})).booleanValue();
        }
        if (!zg5.O2() || !(Thread.currentThread() instanceof jb6.g)) {
            return false;
        }
        return true;
    }

    public abstract m a(av5 av5Var, p pVar);

    public abstract p b(av5 av5Var, Context context);

    public m c(DXEngineConfig dXEngineConfig, av5 av5Var) {
        m mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("c263ac18", new Object[]{this, dXEngineConfig, av5Var});
        }
        if (!g() || !(Thread.currentThread() instanceof jb6.g)) {
            mVar = j.get();
        } else {
            mVar = ((jb6.g) Thread.currentThread()).a();
        }
        if (mVar == null || dXEngineConfig.g() != mVar.d().g()) {
            mVar = a(av5Var, b(av5Var, DinamicXEngine.x()));
            if (!g() || !(Thread.currentThread() instanceof jb6.g)) {
                j.set(mVar);
            } else {
                ((jb6.g) Thread.currentThread()).b(mVar);
            }
        }
        return mVar;
    }

    public DXRuntimeContext d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a960eebf", new Object[]{this});
        }
        WeakReference<DXRuntimeContext> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public DXEngineConfig e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3abed5b9", new Object[]{this});
        }
        av5 f = f();
        if (f == null) {
            return null;
        }
        return f.c();
    }

    public av5 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (av5) ipChange.ipc$dispatch("351370a9", new Object[]{this});
        }
        DXRuntimeContext d = d();
        if (d == null) {
            return null;
        }
        return d.s();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public bd5() {
    }
}
