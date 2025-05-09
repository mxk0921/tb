package tb;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view.InfoFlowRecyclerView;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k6c f26339a;

        public a(pve pveVar, k6c k6cVar) {
            this.f26339a = k6cVar;
        }

        @Override // tb.h6c.e
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4813aba", new Object[]{this, new Boolean(z)});
            } else {
                this.f26339a.c(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k6c f26340a;

        public b(pve pveVar, k6c k6cVar) {
            this.f26340a = k6cVar;
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            } else {
                this.f26340a.H();
            }
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            } else {
                this.f26340a.T();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements h6c.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k6c f26341a;

        public c(pve pveVar, k6c k6cVar) {
            this.f26341a = k6cVar;
        }

        @Override // tb.h6c.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ec7ab1", new Object[]{this});
            } else {
                this.f26341a.N();
            }
        }
    }

    static {
        t2o.a(486539658);
    }

    public RecyclerView a(Context context, k6c<?> k6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c4aa228e", new Object[]{this, context, k6cVar});
        }
        InfoFlowRecyclerView infoFlowRecyclerView = new InfoFlowRecyclerView(context);
        if (!mve.a("disableOutOfWindowAnimate", false)) {
            infoFlowRecyclerView.setClipChildren(false);
        }
        infoFlowRecyclerView.setOnWindowVisibilityChangedListener(new a(this, k6cVar));
        infoFlowRecyclerView.setOnFeedsLayoutListener(new b(this, k6cVar));
        infoFlowRecyclerView.setFirstScreenDiffRefreshListener(new c(this, k6cVar));
        return infoFlowRecyclerView;
    }
}
