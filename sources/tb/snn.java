package tb;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class snn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f28163a;
    public final ParentRecyclerView b;
    public RecyclerView c;
    public fnn d;
    public boolean e = false;
    public final String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ks8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/recommend/RecommendHelper$1");
        }

        @Override // tb.khd
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                ck.g().e("IRecommendCallback error");
            }
        }

        @Override // tb.khd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                snn.a(snn.this);
            }
        }
    }

    static {
        t2o.a(725614635);
    }

    public snn(ParentRecyclerView parentRecyclerView, String str) {
        this.b = parentRecyclerView;
        this.f28163a = parentRecyclerView.getContext();
        this.f = str;
        d();
    }

    public static /* synthetic */ void a(snn snnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d30efe", new Object[]{snnVar});
        } else {
            snnVar.b();
        }
    }

    public final void b() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cf969", new Object[]{this});
        } else if (this.d != null && (recyclerView = this.c) != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = pb6.r(this.f28163a);
                this.c.setLayoutParams(layoutParams);
            } else {
                this.c.setLayoutParams(new RecyclerView.LayoutParams(-1, pb6.r(this.f28163a)));
            }
            RecyclerView recyclerView2 = this.c;
            if (recyclerView2 instanceof ChildRecyclerView) {
                this.b.setNestedScrollChild((jrj) recyclerView2);
                ((ChildRecyclerView) this.c).setNestedScrollParent(this.b);
            }
            this.e = true;
            this.b.resetScroll();
            this.c.getAdapter().notifyDataSetChanged();
        }
    }

    public RecyclerView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e936b1b0", new Object[]{this});
        }
        return this.c;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de57be5c", new Object[]{this});
            return;
        }
        fnn q = fnn.q(z4a.REC_ORDER_DETAIL, this.f);
        this.d = q;
        q.y(new a());
        this.c = this.d.a(this.f28163a);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fnn fnnVar = this.d;
        if (fnnVar != null) {
            fnnVar.c();
            this.d.y(null);
        }
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c99b47c", new Object[]{this, jSONObject});
        } else if (this.d != null && !this.e) {
            this.d.v(new JSONObject(jSONObject));
        }
    }
}
