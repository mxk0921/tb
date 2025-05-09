package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a7d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class col implements a7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f17203a;
    public final CopyOnWriteArraySet<a7d.b> b = new CopyOnWriteArraySet<>();
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909665);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            int i11 = i3 - i;
            int i12 = i4 - i2;
            if (i9 == i11 && i10 == i12) {
                TMSLogger.f("PageResizePageExtension", "onLayoutChange width and height don't change");
                return;
            }
            TMSLogger.f("PageResizePageExtension", "PageResizePageExtension onGlobalLayout newWidth: " + i11 + " newHeight: " + i12 + "; oldWidth: " + i9 + " oldHeight: " + i10);
            for (a7d.b bVar : col.a(col.this)) {
                bVar.a(i11, i12);
            }
        }
    }

    static {
        t2o.a(839909664);
        t2o.a(839909636);
    }

    public col(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "mPage");
        this.f17203a = iTMSPage;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a(col colVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("a487287d", new Object[]{colVar});
        }
        return colVar.b;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            a7d.a.b(this, iTMSPage);
        }
    }

    @Override // tb.a7d
    public void Z0(a7d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0ba5be", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        this.b.remove(bVar);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            a7d.a.c(this);
        }
    }

    public final void f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230cd7d9", new Object[]{this, iTMSPage});
            return;
        }
        View view = iTMSPage.getView();
        if (view != null) {
            view.addOnLayoutChangeListener(new b());
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            a7d.a.a(this);
        }
    }

    @Override // tb.a7d
    public void r0(a7d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e5e401", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        if (this.c.compareAndSet(false, true)) {
            f(this.f17203a);
        }
        this.b.add(bVar);
    }
}
