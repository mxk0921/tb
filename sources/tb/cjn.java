package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cjn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h6c<RecyclerView> f17100a;
    public h6c.c<RecyclerView> b;
    public final IHostService c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.c<RecyclerView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            }
        }

        /* renamed from: b */
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else if (cjn.a(cjn.this) == null) {
                fve.e("ReachEdgeHandler", "mHostService is null");
            } else {
                jgc invokeCallback = cjn.a(cjn.this).getInvokeCallback();
                ged k = invokeCallback.k();
                if (k != null) {
                    k.p(z);
                }
                gqb b = invokeCallback.b();
                if (b != null) {
                    b.t(z);
                }
            }
        }
    }

    static {
        t2o.a(486539627);
    }

    public cjn(cfc cfcVar, h6c<RecyclerView> h6cVar) {
        this.f17100a = h6cVar;
        this.c = (IHostService) cfcVar.a(IHostService.class);
        d(h6cVar);
    }

    public static /* synthetic */ IHostService a(cjn cjnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHostService) ipChange.ipc$dispatch("e3391461", new Object[]{cjnVar});
        }
        return cjnVar.c;
    }

    public final h6c.c<RecyclerView> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("424ddef8", new Object[]{this});
        }
        return new a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            e(this.f17100a);
        }
    }

    public final void d(h6c<RecyclerView> h6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9606941", new Object[]{this, h6cVar});
            return;
        }
        h6c.c<RecyclerView> b = b();
        this.b = b;
        h6cVar.h(b);
    }

    public final void e(h6c<RecyclerView> h6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427d8ffa", new Object[]{this, h6cVar});
            return;
        }
        h6c.c<RecyclerView> cVar = this.b;
        if (cVar != null) {
            h6cVar.v(cVar);
        }
        this.b = null;
    }
}
