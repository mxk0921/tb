package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bac;
import tb.npd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g67 implements npd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f19749a;
    public IShareAdapter.b b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    static {
        t2o.a(839909607);
        t2o.a(839909647);
    }

    public g67(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f19749a = iTMSPage;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            npd.a.b(this, iTMSPage);
        }
    }

    @Override // tb.npd
    public IShareAdapter.b K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShareAdapter.b) ipChange.ipc$dispatch("29da3e99", new Object[]{this});
        }
        return this.b;
    }

    public final ITMSPage a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f19749a;
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            npd.a.c(this);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            npd.a.a(this);
        }
    }

    @Override // tb.npd
    public void l1(IShareAdapter.b bVar) {
        bac bacVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c107941b", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "params");
        this.b = bVar;
        if (!this.c.get()) {
            this.c.set(true);
            IGlobalMenuAdapter iGlobalMenuAdapter = (IGlobalMenuAdapter) p8s.b(IGlobalMenuAdapter.class);
            bac.c cVar = iGlobalMenuAdapter == null ? null : iGlobalMenuAdapter.mo333createMenuItemvVa9PYU(this.f19749a, sbs.INSTANCE.i());
            if (cVar != null && (bacVar = (bac) a().getExtension(bac.class)) != null) {
                bacVar.addItems(xz3.e(cVar));
            }
        }
    }
}
