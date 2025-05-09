package tb;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bki implements jn2<vmh<String, bu2>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16445a;
    public vmh<String, bu2> b;
    public Context c;
    public Integer d;
    public Float e;
    public ComponentCallbacks2 f;

    static {
        t2o.a(620757021);
        t2o.a(620757013);
    }

    public synchronized vmh<String, bu2> a() {
        int i;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmh) ipChange.ipc$dispatch("fe210c04", new Object[]{this});
        } else if (this.f16445a) {
            return this.b;
        } else {
            Context b = s0m.B().b();
            this.c = b;
            fpm.d(b, "Phenix.with(Context) hasn't been called before MemCacheBuilder building");
            this.f16445a = true;
            vmh<String, bu2> vmhVar = this.b;
            if (vmhVar != null) {
                int e = ((i6b) vmhVar).e();
                float n = ((i6b) this.b).n();
                Integer num = this.d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = e;
                }
                Float f2 = this.e;
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = n;
                }
                if (e != i || Math.abs(n - f) >= 1.0E-4d) {
                    ((i6b) this.b).b(i, f);
                }
                return c(this.b);
            }
            if (this.d == null) {
                this.d = Integer.valueOf(cki.a(this.c));
            }
            if (this.e == null) {
                this.e = Float.valueOf(0.2f);
            }
            sie sieVar = new sie(this.d.intValue(), this.e.floatValue());
            this.b = sieVar;
            return c(sieVar);
        }
    }

    public vmh<String, bu2> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmh) ipChange.ipc$dispatch("703f4751", new Object[]{this});
        }
        return this.b;
    }

    public final vmh<String, bu2> c(vmh<String, bu2> vmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmh) ipChange.ipc$dispatch("5da30ebb", new Object[]{this, vmhVar});
        }
        a aVar = new a(vmhVar);
        this.f = aVar;
        this.c.registerComponentCallbacks(aVar);
        return vmhVar;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            super.finalize();
            ComponentCallbacks2 componentCallbacks2 = this.f;
            if (componentCallbacks2 != null) {
                this.c.unregisterComponentCallbacks(componentCallbacks2);
            }
        } catch (Throwable unused) {
            if (this.f != null) {
                this.c.unregisterComponentCallbacks(this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ComponentCallbacks2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vmh f16446a;

        public a(vmh vmhVar) {
            this.f16446a = vmhVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
                return;
            }
            fiv.a(sie.TAG, "ComponentCallbacks2 onTrimMemory, level=%d", Integer.valueOf(i));
            if (i >= 60) {
                this.f16446a.clear();
                fiv.k(sie.TAG, "clear all at TRIM_MEMORY_MODERATE", new Object[0]);
            } else if (i >= 40) {
                int size = this.f16446a.size() / 2;
                this.f16446a.a(size);
                fiv.k(sie.TAG, "trim to size=%d at TRIM_MEMORY_BACKGROUND", Integer.valueOf(size));
            }
        }
    }
}
