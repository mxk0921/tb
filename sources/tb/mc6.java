package tb;

import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class mc6 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ThreadLocal<o> f = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public DXRuntimeContext f23937a;
    public boolean b;
    public DXRenderOptions c;
    public k d;
    public WeakReference<View> e;

    static {
        t2o.a(444596558);
    }

    public mc6(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, av5 av5Var, k kVar, View view) {
        this.f23937a = dXRuntimeContext;
        this.c = dXRenderOptions;
        this.d = kVar;
        this.e = new WeakReference<>(view);
    }

    public DXEngineConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3abed5b9", new Object[]{this});
        }
        av5 b = b();
        if (b == null) {
            return null;
        }
        return b.c();
    }

    public av5 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (av5) ipChange.ipc$dispatch("351370a9", new Object[]{this});
        }
        return this.f23937a.s();
    }

    public o c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("dd6d60b5", new Object[]{this});
        }
        o oVar = f.get();
        av5 b = b();
        DXEngineConfig a2 = a();
        if (oVar != null && a2.g() == oVar.d().g()) {
            return oVar;
        }
        o oVar2 = new o(b, 3, UUID.randomUUID().toString());
        f.set(oVar2);
        return oVar2;
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public void run() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
            d();
        } catch (Throwable unused) {
        }
    }
}
