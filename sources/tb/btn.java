package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class btn implements h6c.c<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final IHostService d;

    /* renamed from: a  reason: collision with root package name */
    public int f16621a = 0;
    public int b = 0;
    public int c = -1;
    public final boolean e = "l".equals(sue.a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16622a;

        public a(int i) {
            this.f16622a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                btn.a(btn.this, zve.b(rgm.PAGE_EVENT_SCROLL_STATE_CHANGED).a("newState", String.valueOf(this.f16622a)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16623a;
        public final /* synthetic */ int b;

        public b(int i, int i2) {
            this.f16623a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                btn.a(btn.this, zve.b(rgm.PAGE_EVENT_SCROLLED).a("dy", String.valueOf(this.f16623a)).a("dx", String.valueOf(this.b)).a("offsetx", String.valueOf(btn.c(btn.this))).a("offsety", String.valueOf(btn.b(btn.this))));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                btn.d(btn.this);
            }
        }
    }

    static {
        t2o.a(486539651);
        t2o.a(488636470);
    }

    public btn(cfc cfcVar) {
        this.d = (IHostService) cfcVar.a(IHostService.class);
    }

    public static /* synthetic */ void a(btn btnVar, zve zveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89ba7e5", new Object[]{btnVar, zveVar});
        } else {
            btnVar.g(zveVar);
        }
    }

    public static /* synthetic */ int b(btn btnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cc36e2c", new Object[]{btnVar})).intValue();
        }
        return btnVar.f16621a;
    }

    public static /* synthetic */ int c(btn btnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d937ab0b", new Object[]{btnVar})).intValue();
        }
        return btnVar.b;
    }

    public static /* synthetic */ void d(btn btnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65abe7f7", new Object[]{btnVar});
        } else {
            btnVar.h();
        }
    }

    /* renamed from: e */
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if (this.c != i) {
            get.a().e(new a(i));
        }
        this.c = i;
    }

    /* renamed from: f */
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (!this.e) {
            this.b += i;
            this.f16621a += i2;
            get.a().e(new b(i2, i));
        }
    }

    public final void g(zve zveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69759066", new Object[]{this, zveVar});
            return;
        }
        iad h = this.d.getInvokeCallback().h();
        if (h != null) {
            h.g(zveVar);
        }
    }

    @Override // tb.h6c.c
    public void n(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            get.a().e(new c());
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25ca2de", new Object[]{this});
            return;
        }
        if (this.f16621a != 0) {
            g(zve.b(rgm.PAGE_EVENT_SCROLLED).a("dy", String.valueOf(-this.f16621a)).a("dx", "0").a("offsetx", "0").a("offsety", "0"));
        }
        this.f16621a = 0;
    }
}
