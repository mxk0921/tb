package tb;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx_v4.responsive.impl.PropertyInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.iub;
import tb.qvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fc5 implements Runnable, iub.a, iub.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<DXWidgetNode> f19182a;
    private final int b;
    private final int c;
    private twb d;
    private final Class<?> e;
    private iub f;
    private Choreographer g;
    private b h;
    private byte i = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte f19183a;

        public a(byte b) {
            this.f19183a = b;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fc5.this.g(this.f19183a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597740);
        }

        public b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            } else {
                fc5.this.run();
            }
        }
    }

    static {
        t2o.a(444597738);
        t2o.a(444597743);
        t2o.a(444597744);
    }

    public fc5(byte b2, int i, int i2) {
        this.b = i;
        this.c = i2;
        if (b2 == 0 || b2 == 1) {
            this.e = Float.class;
        } else {
            this.e = Object.class;
        }
    }

    @Override // tb.iub.a
    public void a(yb5 yb5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c8966b", new Object[]{this, yb5Var});
        } else {
            ec5.a(yb5Var, false);
        }
    }

    @Override // tb.iub.b
    public Object b(String str, View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c4c2b854", new Object[]{this, str, view, obj});
        }
        return ec5.b(str, view, obj);
    }

    @Override // tb.iub.a
    public void c(yb5 yb5Var, boolean z) {
        iub iubVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1d4d30", new Object[]{this, yb5Var, new Boolean(z)});
        } else if (!z) {
            ec5.a(yb5Var, true);
            twb twbVar = this.d;
            if (twbVar != null && (iubVar = this.f) != null) {
                twbVar.setState(iubVar.f());
            }
        }
    }

    public iub d(jub jubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iub) ipChange.ipc$dispatch("e9d3bd28", new Object[]{this, jubVar});
        }
        iub a2 = jubVar.a();
        a2.b(this);
        a2.a(this);
        return a2;
    }

    public List<dc5> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8a819aa6", new Object[]{this});
        }
        twb twbVar = this.d;
        ArrayList arrayList = null;
        if (twbVar == null) {
            return null;
        }
        List<PropertyInfo> b2 = twbVar.b();
        if (b2 != null && !b2.isEmpty()) {
            arrayList = new ArrayList();
            for (PropertyInfo propertyInfo : b2) {
                WeakReference<DXWidgetNode> c = propertyInfo.c();
                Collection<String> d = propertyInfo.d();
                if (!(c == null || d == null || d.isEmpty())) {
                    arrayList.add(new dc5(c, new ArrayList(d)));
                }
            }
        }
        return arrayList;
    }

    public DXWidgetNode f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("4df8e4fe", new Object[]{this});
        }
        WeakReference<DXWidgetNode> weakReference = this.f19182a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void g(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a6f509", new Object[]{this, new Byte(b2)});
        } else if (this.i < 0) {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                jb6.p(new a(b2));
                return;
            }
            if (this.f == null) {
                b2 = 0;
            }
            this.i = b2;
            if (this.g == null) {
                this.g = Choreographer.getInstance();
            }
            if (this.h == null) {
                this.h = new b();
            }
            this.g.postFrameCallback(this.h);
        }
    }

    public void h(Object obj, jub jubVar) {
        List<dc5> e;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899f2df4", new Object[]{this, obj, jubVar});
            return;
        }
        if (obj != null && !obj.equals(this.f.f())) {
            z2 = true;
        }
        if (jubVar == null || jubVar.equals(this.f.e())) {
            z = z2;
        } else {
            this.f = d(jubVar);
        }
        if (z && (e = e()) != null && !e.isEmpty()) {
            if (obj != null) {
                this.f.c(obj);
            }
            this.f.d(e);
            this.f.start();
        }
    }

    public void i(DXWidgetNode dXWidgetNode, twb twbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e35213", new Object[]{this, dXWidgetNode, twbVar});
            return;
        }
        this.f19182a = new WeakReference<>(dXWidgetNode);
        this.d = twbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        DXWidgetNode f;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.i >= 0 && (f = f()) != null) {
            byte b2 = this.i;
            jub jubVar = null;
            if (b2 == 1 || b2 == 0) {
                qvb.a b3 = e66.b(f, this.b);
                if (b3 != null && b3.f26952a) {
                    if (this.e == Float.class) {
                        obj = Float.valueOf(b3.c.f());
                    } else {
                        obj = b3.c.z();
                    }
                } else {
                    return;
                }
            } else {
                obj = null;
            }
            byte b4 = this.i;
            if (b4 == 2 || b4 == 0) {
                int i = this.c;
                if (i < 0) {
                    jubVar = cc5.b(null, this.e);
                } else {
                    qvb.a b5 = e66.b(f, i);
                    if (b5 != null && b5.f26952a && b5.c.H()) {
                        jubVar = cc5.b(b5.c.v(), this.e);
                    } else {
                        return;
                    }
                }
            }
            if (this.f == null) {
                if (obj != null && jubVar != null) {
                    this.f = d(jubVar);
                } else {
                    return;
                }
            }
            h(obj, jubVar);
            this.i = (byte) -1;
        }
    }
}
