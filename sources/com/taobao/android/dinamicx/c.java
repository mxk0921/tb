package com.taobao.android.dinamicx;

import android.os.Looper;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import tb.av5;
import tb.bew;
import tb.eb5;
import tb.ic5;
import tb.t2o;
import tb.xv5;
import tb.zg5;
import tb.zm6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ThreadLocal<d> c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public DXRuntimeContext f7305a;
    private DXRenderOptions b;

    static {
        t2o.a(444596474);
    }

    public c(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        this.f7305a = dXRuntimeContext;
        this.b = dXRenderOptions;
    }

    private boolean d(DXRuntimeContext dXRuntimeContext) {
        List<f.a> list;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86ed39cf", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        if (!dXRuntimeContext.Y()) {
            return true;
        }
        f m = dXRuntimeContext.m();
        if (m == null || (list = m.c) == null || list.size() <= 0) {
            return false;
        }
        for (f.a aVar : m.c) {
            int i = aVar.d;
            if (i != 100002) {
                z = true;
            } else {
                z = false;
            }
            if (i < 71001 || i > 710010) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return false;
            }
        }
        return true;
    }

    public DXRuntimeContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a960eebf", new Object[]{this});
        }
        return this.f7305a;
    }

    public DXEngineConfig b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3abed5b9", new Object[]{this});
        }
        av5 c2 = c();
        if (c2 == null) {
            return null;
        }
        return c2.c();
    }

    public av5 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (av5) ipChange.ipc$dispatch("351370a9", new Object[]{this});
        }
        DXRuntimeContext a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.s();
    }

    @Override // java.lang.Runnable
    public void run() {
        DXEngineConfig dXEngineConfig;
        String str;
        DXRuntimeContext a2 = a();
        if (a2 != null) {
            if (g.q() != null && zg5.y2()) {
                g.q().a();
            }
            try {
                Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(Looper.getMainLooper());
                if (obj instanceof ThreadLocal) {
                    ((ThreadLocal) obj).set(Looper.getMainLooper());
                }
                d dVar = c.get();
                av5 c2 = c();
                DXEngineConfig b = b();
                if (b != null) {
                    if (dVar != null) {
                        dXEngineConfig = dVar.d();
                        if (dXEngineConfig == null) {
                            return;
                        }
                    } else {
                        dXEngineConfig = null;
                    }
                    if (dVar == null || b.g() != dXEngineConfig.g()) {
                        if (DinamicXEngine.x() != null && c2.f() != null) {
                            d dVar2 = new d(c2, p.g(c2, DinamicXEngine.x()));
                            c.set(dVar2);
                            dVar = dVar2;
                        } else {
                            return;
                        }
                    }
                    a2.e0(dVar);
                    a2.d0(new bew(a2.h().getApplicationContext()));
                    DXButterRootView dXButterRootView = new DXButterRootView(a2.h());
                    dXButterRootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    dXButterRootView.setDxTemplateItem(a2.p());
                    if (!(c2 == null || c2.f() == null)) {
                        dXButterRootView.setBindingXManagerWeakReference(c2.f().p);
                    }
                    a2.o.q = new WeakReference<>(dXButterRootView);
                    try {
                        DXResult<DXRootView> s = dVar.s(dXButterRootView, a2, -1, this.b);
                        if (s != null && s.f7291a != null && d(a2)) {
                            if (eb5.i()) {
                                dXButterRootView.measure(dXButterRootView.getParentWidthSpec(), dXButterRootView.getParentHeightSpec());
                            }
                            if (eb5.h()) {
                                dXButterRootView.layout(0, 0, dXButterRootView.getMeasuredWidth(), dXButterRootView.getMeasuredHeight());
                            }
                            if (this.b.f() == 4) {
                                zm6.g().l(b.d(), a2.A(), s.f7291a);
                            } else {
                                zm6.g().a(s.f7291a, a2.p(), b.d());
                            }
                        }
                    } catch (Throwable th) {
                        DXEngineConfig b2 = b();
                        if (b2 != null) {
                            str = b2.d();
                        } else {
                            str = "default";
                        }
                        f fVar = new f(str);
                        fVar.d = true;
                        fVar.b = a2.p();
                        f.a aVar = new f.a("Engine", "Engine_Render", 30005);
                        aVar.e = xv5.a(th);
                        ((ArrayList) fVar.c).add(aVar);
                        ic5.p(fVar);
                    }
                }
            } catch (Throwable th2) {
                xv5.b(th2);
            }
        }
    }
}
