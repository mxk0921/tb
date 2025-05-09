package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.common.page.b;
import com.alibaba.android.ultron.ext.event.MtopV2Subscriber;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;
import tb.c6h;
import tb.zun;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class iz implements g5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.a f21656a;
    public h8v b;
    public String c;
    public h5e d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements zun.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(b8v b8vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("135f40e7", new Object[]{this, b8vVar});
                return;
            }
            h5e h5eVar = iz.this.d;
            if (h5eVar != null) {
                ((b.c) h5eVar).b(b8vVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements c6h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("429f4bfa", new Object[]{this, jSONObject});
                return;
            }
            h5e h5eVar = iz.this.d;
            if (h5eVar != null) {
                ((b.c) h5eVar).a(jSONObject);
            }
        }
    }

    static {
        t2o.a(153092129);
        t2o.a(153092122);
    }

    @Override // tb.g5e
    public boolean a() {
        List<IDMComponent> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7032815b", new Object[]{this})).booleanValue();
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f21656a;
        if (aVar == null || aVar.z() == null || (a2 = this.f21656a.z().a()) == null || a2.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // tb.g5e
    public void c(JSONArray jSONArray) {
        com.alibaba.android.ultron.vfw.instance.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44db4871", new Object[]{this, jSONArray});
        } else if (jSONArray != null && jSONArray.size() > 0 && (aVar = this.f21656a) != null && aVar.getEventHandler() != null) {
            this.f21656a.getEventHandler().n(x9v.a(jSONArray, null, null));
        }
    }

    @Override // tb.g5e
    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c47bf40a", new Object[]{this});
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f21656a;
        if (aVar == null || aVar.b() == null) {
            return null;
        }
        return this.f21656a.b().i();
    }

    @Override // tb.g5e
    public void e(h5e h5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6151a2f", new Object[]{this, h5eVar});
        } else {
            this.d = h5eVar;
        }
    }

    @Override // tb.g5e
    public void g(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656015b", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.f21656a.t0(j());
        this.f21656a.O(linearLayout, recyclerView, linearLayout2);
        this.f21656a.y0();
    }

    public com.alibaba.android.ultron.vfw.instance.a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("53dc8f1e", new Object[]{this});
        }
        return this.f21656a;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3aef21f", new Object[]{this});
            return;
        }
        this.f21656a.getEventHandler().d("refreshMtopV3", new b8j());
        this.f21656a.getEventHandler().d("weexPopV3", new r7x());
        this.f21656a.getEventHandler().d("alipayV3", new et0());
        this.f21656a.getEventHandler().d("shareV3", new hkp());
        this.f21656a.getEventHandler().d("dispatchV3", new tq7());
        this.f21656a.getEventHandler().d("toastV3", new i1u());
        this.f21656a.getEventHandler().d("alertV3", new yk0());
        this.f21656a.getEventHandler().d("mtopV3", new MtopV2Subscriber());
        this.f21656a.getEventHandler().d("openUrlV3", new r5l());
        this.f21656a.getEventHandler().d("groupSelectV3", new ela());
        this.f21656a.getEventHandler().d("shareWithRefreshV3", new xkp());
        this.f21656a.getEventHandler().d("mtopWithOpenUrlV3", new a8j());
        this.f21656a.getEventHandler().d("alertWithMtopWithAlipayV3", new al0());
        this.f21656a.getEventHandler().d("alertWithOpenUrlV3", new dl0());
        this.f21656a.getEventHandler().d("alertWithMtopWithOpenUrlV3", new bl0());
        this.f21656a.getEventHandler().d("mtopWithAlipayV3", new z7j());
        this.f21656a.getEventHandler().d("mtopWithRefreshWithOpenUrlV3", new d8j());
        this.f21656a.getEventHandler().d("refreshPageV3", new zun(new a()));
        this.f21656a.getEventHandler().d("loadMore", new h6h());
        this.b.f("loadMore", new i8v());
        this.f21656a.getEventHandler().d("loadData", new c6h(new b()));
    }

    public abstract rjc j();

    @Override // tb.g5e
    public void loadMore() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else if (this.b != null && this.f21656a.b() != null) {
            JSONObject i = this.f21656a.b().i();
            JSONObject jSONObject = i != null ? i.getJSONObject("pageControl") : null;
            if (jSONObject != null) {
                str = jSONObject.getString("nextPageIndex");
            } else {
                str = "0";
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pageIndex", (Object) str);
            this.b.a("loadMore", jSONObject2);
        }
    }

    @Override // tb.g5e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f21656a;
        if (aVar != null) {
            aVar.r();
        }
    }

    @Override // tb.g5e
    public void f(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271120ba", new Object[]{this, context, str, str2, jSONObject, map});
            return;
        }
        this.c = str2;
        if (TextUtils.isEmpty(str)) {
            str = "ultroncommonpage";
        }
        UltronInstanceConfig K = new UltronInstanceConfig().n(true).z(str).K(false);
        if (sbl.b("useMultiJsEngine", true)) {
            K.H(true);
        }
        this.f21656a = com.alibaba.android.ultron.vfw.instance.a.q(K, context);
        this.b = new h8v(this.f21656a);
        i();
    }
}
