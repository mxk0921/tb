package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbed;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uyw implements m3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qdr f29685a;
    public final rb8 b;
    public final uaq c;
    public String d;
    public String e;
    public int f = 400;
    public final boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("loadDataFromCache", Boolean.valueOf(uyw.a(uyw.this).v));
            uyw.b(uyw.this).o(uyw.a(uyw.this).a(), hashMap);
            uyw.a(uyw.this).f29265a = true;
        }
    }

    static {
        t2o.a(1032847439);
        t2o.a(1032847368);
    }

    public uyw(uaq uaqVar) {
        boolean c = fbl.c();
        this.g = c;
        this.c = uaqVar;
        if (c) {
            vk8.b().a(Arrays.asList("login", "renderSuccess", vk8.EVENT_TAB_PAGE_INFO_REFRESH), this);
            n();
            qdr qdrVar = new qdr(this.d, this.e, this.f, ir7.d(), ir7.c(), "_tab3__embed_instance__");
            this.f29685a = qdrVar;
            qdrVar.L(R.drawable.edlp_tab3_placeholder, fbl.h(), true);
            return;
        }
        this.b = new rb8(uaqVar);
    }

    public static /* synthetic */ uaq a(uyw uywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uaq) ipChange.ipc$dispatch("d41ba396", new Object[]{uywVar});
        }
        return uywVar.c;
    }

    public static /* synthetic */ qdr b(uyw uywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qdr) ipChange.ipc$dispatch("237e2278", new Object[]{uywVar});
        }
        return uywVar.f29685a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1f2d28", new Object[]{this});
        } else if (!this.g) {
            this.b.p();
        } else if (!this.c.f29265a) {
            rvu.a(new a(), 2000L);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.g) {
            this.f29685a.v();
            vk8.b().c(Arrays.asList("login", "renderSuccess", vk8.EVENT_TAB_PAGE_INFO_REFRESH), this);
        } else {
            this.b.t();
        }
    }

    public void e(String str, drs drsVar, Activity activity) {
        idr idrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad55108", new Object[]{this, str, drsVar, activity});
        } else if (this.g) {
            if (drsVar != null) {
                idrVar = new idr();
                idrVar.e(drsVar.f18031a);
                idrVar.d(drsVar.b);
                idrVar.f(drsVar.h);
            } else {
                idrVar = null;
            }
            this.f29685a.y(str, idrVar, activity);
        } else {
            this.b.x(str, drsVar, activity);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676d69c3", new Object[]{this, str});
        } else if (this.g) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str);
            this.f29685a.G("notifyOpenFromUrl", jSONObject);
        } else {
            this.b.z(str);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e730ad9", new Object[]{this});
        } else if (this.g) {
            this.f29685a.G("notifyEdlpRefresh", null);
        } else {
            this.b.A();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        } else if (this.g) {
            this.f29685a.A();
        } else {
            TMSEmbed v = this.b.v();
            if (v != null) {
                v.n();
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        } else if (this.g) {
            this.f29685a.B();
        } else {
            TMSEmbed v = this.b.v();
            if (v != null) {
                v.o();
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
        } else if (this.g) {
            this.f29685a.E();
        } else {
            TMSEmbed v = this.b.v();
            if (v != null) {
                v.p();
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
        } else if (this.g) {
            this.f29685a.F();
        } else {
            TMSEmbed v = this.b.v();
            if (v != null) {
                v.q();
            }
        }
    }

    public void l(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
        } else if (this.g) {
            this.f29685a.I(viewGroup);
        } else {
            this.b.D(viewGroup);
        }
    }

    public void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a287a4", new Object[]{this, new Long(j)});
            return;
        }
        this.c.b = j;
        if (this.g) {
            this.f29685a.K(j);
            this.f29685a.J("LowPriceFragment");
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b11449a", new Object[]{this});
            return;
        }
        String str = "{\"pageType\":\"weex2\",\"url\":\"https://web.m.taobao.com/app/ug/crowd-weex2/newuser-tab3?wh_weex=true&weex_mode=dom&in_tab=true&wx_limit_raster_cache=true\"}";
        String config = OrangeConfig.getInstance().getConfig("edlp_business_switch", "defaultPageInfo", str);
        if (!TextUtils.isEmpty(config)) {
            str = config;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject.containsKey("url")) {
            this.d = parseObject.getString("url");
        }
        if (parseObject.containsKey("pageType")) {
            this.e = parseObject.getString("pageType");
        }
        String config2 = OrangeConfig.getInstance().getConfig("edlp_business_switch", "defaultPageTimeout", "400");
        if (!TextUtils.isEmpty(config2)) {
            try {
                this.f = Integer.parseInt(config2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // tb.m3c
    public void onEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5db5b9", new Object[]{this, str, map});
        } else if (!this.g) {
            this.b.onEvent(str, map);
        } else if (TextUtils.equals(str, "login")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) "login");
            this.f29685a.G("notifyLoginStatusChange", jSONObject);
        } else if (TextUtils.equals(str, "renderSuccess")) {
            this.f29685a.C((String) map.get("data"));
        } else if (TextUtils.equals(str, vk8.EVENT_TAB_PAGE_INFO_REFRESH)) {
            idr idrVar = new idr();
            drs drsVar = (drs) map.get("data");
            if (drsVar != null) {
                idrVar.e(drsVar.f18031a);
                idrVar.d(drsVar.b);
                idrVar.f(drsVar.h);
            }
            this.f29685a.N(idrVar);
        }
    }
}
