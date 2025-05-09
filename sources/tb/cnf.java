package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TOTAL_PAGE_NAME = "Page_PhotoSearchResult";

    /* renamed from: a  reason: collision with root package name */
    public final ta0 f17176a;
    public final IrpDatasource b;
    public JSONObject c;
    public Map<String, String> d;
    public static final a Companion = new a(null);
    public static String e = "PhotoSearchResult";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297185);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297184);
    }

    public cnf(ta0 ta0Var, IrpDatasource irpDatasource) {
        String str;
        ckf.g(ta0Var, "adapter");
        ckf.g(irpDatasource, "irpDatasource");
        this.f17176a = ta0Var;
        this.b = irpDatasource;
        if (caa.r()) {
            str = "PhotoSearchResultY";
        } else {
            str = "PhotoSearchResult";
        }
        e = str;
        if (irpDatasource.B() == PhotoFrom.Values.PRODUCT_CODE) {
            e = "ScanProductResult";
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5cfd52", new Object[]{this});
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cd3254", new Object[]{this});
        } else {
            jzu.i(e, "Cancel", new String[0]);
        }
    }

    public final void c() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12eb35b7", new Object[]{this});
            return;
        }
        this.f17176a.d(e);
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.c;
        String str = "";
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                hashMap.put(str2, h19.i(this.c, str2, str));
            }
        } else {
            if (!lg4.s0()) {
                hashMap.put(wxi.KEY_PHOTO_FROM, this.b.B().getValue());
                hashMap.put("pssource", this.b.y());
            }
            String z = this.b.z("cat");
            if (z != null) {
                str = z;
            }
            hashMap.put("cat", str);
        }
        if (lg4.s0() && (map = this.d) != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    hashMap.put(str3, str4);
                }
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this.f17176a.getActivity(), JSON.toJSONString(hashMap));
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70653dd5", new Object[]{this});
        } else {
            a();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c73409d", new Object[]{this});
        }
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c304bf6b", new Object[]{this, jSONObject});
            return;
        }
        this.c = jSONObject;
        c();
    }

    public final void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b943913b", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            if (this.d == null) {
                this.d = new LinkedHashMap();
            }
            Map<String, String> map2 = this.d;
            if (map2 != null) {
                map2.putAll(map);
            }
        }
    }
}
