package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.gee;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class t91 implements gee {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArraySet<gee.b> f28572a = new CopyOnWriteArraySet<>();
    public int b = -1;
    public int c = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909546);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(839909545);
        t2o.a(839909580);
    }

    @Override // tb.gee
    public void J(gee.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80742d07", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        this.f28572a.add(bVar);
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        gee.a.a(this, bbsVar);
        this.b = bbsVar.I().getResources().getConfiguration().screenWidthDp;
        this.c = bbsVar.I().getResources().getConfiguration().screenHeightDp;
    }

    public final void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9419d2a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        IpChange ipChange2 = TMSAssertUtils.$ipChange;
        if (this.b == i && this.c == i2) {
            TMSLogger.f("AppWindowResizeExtension", "onWindowResize width and height don't change");
            return;
        }
        TMSLogger.f("AppWindowResizeExtension", "onWindowResize newWidth: " + i + " newHeight: " + i2 + "; oldWidth: " + this.b + " oldHeight: " + this.c);
        this.b = i;
        this.c = i2;
        Iterator<gee.b> it = this.f28572a.iterator();
        while (it.hasNext()) {
            it.next().a(i, i2);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            gee.a.b(this);
        }
    }

    @Override // tb.gee
    public void i(gee.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77eed04", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        this.f28572a.remove(bVar);
    }
}
