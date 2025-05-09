package tb;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mp2 implements jn2<lp2> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lp2 f24200a;
    public boolean b;
    public ComponentCallbacks2 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ComponentCallbacks2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lp2 f24201a;

        public a(lp2 lp2Var) {
            this.f24201a = lp2Var;
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
            fiv.a("BytesPool", "ComponentCallbacks2 onTrimMemory, level=%d", Integer.valueOf(i));
            if (i >= 60) {
                this.f24201a.clear();
                fiv.k("BytesPool", "clear all at TRIM_MEMORY_MODERATE", new Object[0]);
            }
        }
    }

    static {
        t2o.a(620757014);
        t2o.a(620757013);
    }

    public synchronized lp2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lp2) ipChange.ipc$dispatch("14d3c96c", new Object[]{this});
        } else if (this.b) {
            return this.f24200a;
        } else {
            this.b = true;
            if (this.f24200a == null) {
                this.f24200a = new osg(1048576);
            }
            return b(this.f24200a);
        }
    }

    public final lp2 b(lp2 lp2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lp2) ipChange.ipc$dispatch("3220c303", new Object[]{this, lp2Var});
        }
        Context b = s0m.B().b();
        if (b != null) {
            a aVar = new a(lp2Var);
            this.c = aVar;
            b.registerComponentCallbacks(aVar);
        }
        return lp2Var;
    }

    public void finalize() {
        Context b;
        ComponentCallbacks2 componentCallbacks2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            super.finalize();
            b = s0m.B().b();
            if (b == null || (componentCallbacks2 = this.c) == null) {
                return;
            }
        } catch (Throwable unused) {
            b = s0m.B().b();
            if (b == null || (componentCallbacks2 = this.c) == null) {
                return;
            }
        }
        b.unregisterComponentCallbacks(componentCallbacks2);
    }
}
