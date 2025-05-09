package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tm6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, um6<View>> f28798a = new ConcurrentHashMap(30);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DXRuntimeContext> f28799a;
        public Class b;

        static {
            t2o.a(444596581);
        }

        public a(DXRuntimeContext dXRuntimeContext, Class cls) {
            this.f28799a = new WeakReference<>(dXRuntimeContext);
            this.b = cls;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!(this.f28799a.get() == null || this.f28799a.get().h() == null || this.f28799a.get().W() == null)) {
                    int reusePoolMaxSize = this.f28799a.get().W().reusePoolMaxSize();
                    int min = Math.min(10, reusePoolMaxSize);
                    for (int i = 0; i < min; i++) {
                        if (!(this.f28799a.get() == null || this.f28799a.get().h() == null || this.f28799a.get().W() == null)) {
                            tm6.this.b(reusePoolMaxSize, this.b, this.f28799a.get().W()._createViewOnlyForCache(this.f28799a.get().h()));
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    static {
        t2o.a(444596580);
    }

    public View a(DXRuntimeContext dXRuntimeContext, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a75c534c", new Object[]{this, dXRuntimeContext, cls});
        }
        View view = null;
        if (!(dXRuntimeContext == null || dXRuntimeContext.s() == null || dXRuntimeContext.W() == null || !dXRuntimeContext.s().p())) {
            um6 um6Var = (um6) ((ConcurrentHashMap) this.f28798a).get(cls);
            if (um6Var == null) {
                if (dXRuntimeContext.W().supportReuse() && dXRuntimeContext.W().reusePoolMaxSize() > 0) {
                    jb6.q(new a(dXRuntimeContext, cls));
                }
                return null;
            }
            view = (View) um6Var.acquire();
            if ((view == null || um6Var.size() == 0) && dXRuntimeContext.W().supportReuse() && dXRuntimeContext.W().reusePoolMaxSize() > 0) {
                jb6.q(new a(dXRuntimeContext, cls));
            }
        }
        return view;
    }

    public void b(int i, Class cls, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649f83fd", new Object[]{this, new Integer(i), cls, view});
            return;
        }
        try {
            um6 um6Var = (um6) ((ConcurrentHashMap) this.f28798a).get(cls);
            if (um6Var == null) {
                if (i > 200) {
                    i = 200;
                } else if (i < 20) {
                    i = 20;
                }
                um6Var = new wm6(i);
                ((ConcurrentHashMap) this.f28798a).put(cls, um6Var);
            }
            um6Var.release(view);
        } catch (Exception e) {
            if (DinamicXEngine.j0()) {
                h36.g("shandian", cls + " 发生异常 " + view.hashCode());
            }
            xv5.b(e);
        }
    }

    public void c(DXRuntimeContext dXRuntimeContext, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29eb916", new Object[]{this, dXRuntimeContext, view});
        }
    }
}
