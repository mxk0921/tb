package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.xky;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ruy implements xky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f27623a;
    public final CopyOnWriteArrayList<xky.b> b = new CopyOnWriteArrayList<>();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public String d;

    static {
        t2o.a(839909668);
        t2o.a(839909641);
    }

    public ruy(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f27623a = iTMSPage;
        this.d = iTMSPage.c();
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            xky.a.b(this, iTMSPage);
        }
    }

    @Override // tb.xky
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1a444c", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            xky.a.c(this);
        }
    }

    @Override // tb.z5d
    public void w0() {
        String realUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
            return;
        }
        xky.a.a(this);
        this.c.set(true);
        xjy xjyVar = (xjy) this.f27623a.getInstance().getExtension(xjy.class);
        if (!(xjyVar == null || (realUrl = xjyVar.getRealUrl()) == null)) {
            this.d = realUrl;
        }
        Iterator<xky.b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(this.d);
        }
    }

    @Override // tb.xky
    public void c(xky.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5310999f", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        if (this.c.get()) {
            bVar.a(this.d);
        } else {
            this.b.add(bVar);
        }
    }
}
