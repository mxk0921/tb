package tb;

import android.os.Bundle;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k7n implements g8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<?> f22451a;
    public h6c.c<ViewGroup> b;
    public final IDxItemClickService c;
    public IDxItemClickService.OnDxClickNavListener d;
    public boolean e = true;
    public boolean f = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (k7n.b(k7n.this) && i == 1) {
                k7n.c(k7n.this, false);
                e7n.c(e7n.TAG_FIRST_SCROLL);
                e7n.g("first_scroll_time", System.currentTimeMillis());
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IDxItemClickService.OnDxClickNavListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
            } else if (k7n.d(k7n.this)) {
                k7n.e(k7n.this, false);
                e7n.c(e7n.TAG_FIRST_CLICK);
                e7n.g("first_click_time", System.currentTimeMillis());
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
        public void onNavFinished(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(491782553);
        t2o.a(491782563);
    }

    public k7n(cfc cfcVar) {
        this.f22451a = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.c = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
    }

    public static /* synthetic */ boolean b(k7n k7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdb6eb4f", new Object[]{k7nVar})).booleanValue();
        }
        return k7nVar.e;
    }

    public static /* synthetic */ boolean c(k7n k7nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163e32ef", new Object[]{k7nVar, new Boolean(z)})).booleanValue();
        }
        k7nVar.e = z;
        return z;
    }

    public static /* synthetic */ boolean d(k7n k7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b8a6e", new Object[]{k7nVar})).booleanValue();
        }
        return k7nVar.f;
    }

    public static /* synthetic */ boolean e(k7n k7nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fed77b0", new Object[]{k7nVar, new Boolean(z)})).booleanValue();
        }
        k7nVar.f = z;
        return z;
    }

    @Override // tb.g8d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa750a", new Object[]{this});
        } else {
            f();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eca425", new Object[]{this});
            return;
        }
        if (this.f22451a != null && this.e) {
            this.b = h();
            this.f22451a.getLifeCycleRegister().h(this.b);
        }
        if (this.c != null && this.f) {
            IDxItemClickService.OnDxClickNavListener g = g();
            this.d = g;
            this.c.addDxClickNavListener(g);
        }
    }

    public final IDxItemClickService.OnDxClickNavListener g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemClickService.OnDxClickNavListener) ipChange.ipc$dispatch("72c1df6b", new Object[]{this});
        }
        return new b();
    }

    public final h6c.c<ViewGroup> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new a();
    }

    public final void i() {
        IDxItemClickService.OnDxClickNavListener onDxClickNavListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f34d22", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f22451a;
        if (!(iMainFeedsViewService == null || this.b == null)) {
            iMainFeedsViewService.getLifeCycleRegister().v(this.b);
            this.b = null;
        }
        IDxItemClickService iDxItemClickService = this.c;
        if (iDxItemClickService != null && (onDxClickNavListener = this.d) != null) {
            iDxItemClickService.removeDxClickNavListener(onDxClickNavListener);
        }
    }

    @Override // tb.g8d
    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
        } else {
            i();
        }
    }
}
