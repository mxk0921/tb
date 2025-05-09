package tb;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.b;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.taolivecontainer.WVUCWebViewProxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nkr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TBLiveBasePlugin_Event_PreRender_Attach = "TBLiveBasePlugin.Event.PreRender.Attach";
    public static final String Flag_TaobaoLiveContainer = "TaobaoLiveContainer";
    public static final String KEY_PRE_LOAD = "x-preload";
    public static final String KEY_PRE_RENDER = "tl-x-prerender";
    public static final String KEY_PRE_ZCACHE = "tl-x-pre-zcache";
    public static final String KEY_SSR = "x-ssr";
    public static final String PAGE_TAOBAOLIVECONTAINER = "Page_TaobaoLiveContainer";
    public static final String TBLive_Container = "1.1.0";
    public static final String q = nkr.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public Context f24797a;
    public final String b;
    public final z1e c;
    public final String[] d;
    public Object e;
    public final String f;
    public String g;
    public final okr h;
    public TBLiveH5Container i;
    public zmr j;
    public final mnr k;
    public String l;
    public boolean m;
    public anr n;
    public boolean o;
    public boolean p;

    static {
        t2o.a(1027604485);
    }

    public nkr(Context context, String str, z1e z1eVar, zdb zdbVar) {
        this(context, str, z1eVar, zdbVar, null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f24797a = null;
        mnr mnrVar = this.k;
        if (mnrVar != null) {
            mnrVar.c(this.i);
            this.k.c(this.j);
        }
        TBLiveH5Container tBLiveH5Container = this.i;
        if (tBLiveH5Container != null && !tBLiveH5Container.isDestroied()) {
            this.i.destroy();
            this.i = null;
        }
        zmr zmrVar = this.j;
        if (zmrVar != null && !zmrVar.isDestroied()) {
            this.j.destroy();
            this.j = null;
        }
        z1e z1eVar = this.c;
        if (z1eVar != null) {
            String str = q;
            z1eVar.b(Flag_TaobaoLiveContainer, str, "TBLiveH5ContainerBuilder-destroy-mSource:" + this.b);
        }
    }

    public okr c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okr) ipChange.ipc$dispatch("d9dc75bd", new Object[]{this});
        }
        return this.h;
    }

    public xud d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xud) ipChange.ipc$dispatch("1fb4b3fd", new Object[]{this});
        }
        TBLiveH5Container tBLiveH5Container = this.i;
        if (tBLiveH5Container != null) {
            return tBLiveH5Container;
        }
        return this.j;
    }

    public String[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("bd73bbe6", new Object[]{this});
        }
        return this.d;
    }

    public TBLiveH5Container f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveH5Container) ipChange.ipc$dispatch("b16c4f6b", new Object[]{this});
        }
        return this.i;
    }

    public zmr g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmr) ipChange.ipc$dispatch("dbc2270b", new Object[]{this});
        }
        return this.j;
    }

    public z1e h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z1e) ipChange.ipc$dispatch("b24d0b2e", new Object[]{this});
        }
        return this.c;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
            return;
        }
        TBLiveH5Container tBLiveH5Container = this.i;
        if (tBLiveH5Container == null || tBLiveH5Container.isDestroied()) {
            s("tlh5_container_init_begin");
            TBLiveH5Container tBLiveH5Container2 = new TBLiveH5Container(this.f24797a);
            this.i = tBLiveH5Container2;
            tBLiveH5Container2.setWebViewToken(this.e);
            this.i.setBuilder(this);
            String userAgentString = this.i.getUserAgentString();
            this.i.setUserAgentString(userAgentString + " TLHybrid/(" + this.b + ",1.1.0)");
            s("tlh5_container_init_end");
            this.i.setWebViewClientProxy(new WVUCWebViewProxy(this.f24797a, this));
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8795deb2", new Object[]{this});
            return;
        }
        zmr zmrVar = this.j;
        if (zmrVar == null || zmrVar.isDestroied()) {
            anr anrVar = new anr(this.f24797a, this);
            this.n = anrVar;
            anrVar.b();
            zmr a2 = this.n.a();
            this.j = a2;
            a2.k(this.e);
            this.j.h(this);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de9fcf2", new Object[]{this, str});
            return;
        }
        m(str);
        if (this.p) {
            this.i.loadUrl(str);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2defa32b", new Object[]{this, str});
            return;
        }
        j();
        anr anrVar = this.n;
        if (anrVar != null) {
            anrVar.c(str);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f032fffb", new Object[]{this, str});
        } else {
            o(str, false, true);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eef0d05", new Object[]{this, str});
            return;
        }
        b.i(new Request.b().l(str).i("GET").f());
        z1e z1eVar = this.c;
        String str2 = q;
        z1eVar.b(Flag_TaobaoLiveContainer, str2, "preLoadHtml:" + str);
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c37682", new Object[]{this, str});
            return;
        }
        yox.n(Arrays.asList(str));
        z1e z1eVar = this.c;
        String str2 = q;
        z1eVar.b(Flag_TaobaoLiveContainer, str2, "preLoadZCache:" + str);
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf156a7", new Object[]{this, str});
            return;
        }
        if (this.k.h(str, this)) {
            s("tlh5_h5_prerender_begin");
        }
        z1e z1eVar = this.c;
        String str2 = q;
        z1eVar.b(Flag_TaobaoLiveContainer, str2, "preRenderUrl:" + str);
    }

    public long s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c7ab6c", new Object[]{this, str})).longValue();
        }
        return t(str, null);
    }

    public long t(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("780f832f", new Object[]{this, str, hashMap})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.c != null) {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put("timestamp", String.valueOf(currentTimeMillis));
            hashMap.put("tlh5_session_id", this.f);
            hashMap.put("tlh5_url", this.l);
            hashMap.put("tlh5_sdk_env", this.b);
            hashMap.put("tlh5_sdk_version", TBLive_Container);
            if (!TextUtils.isEmpty(this.g)) {
                hashMap.put("is_pre_render", this.g);
            }
            hashMap.putAll(this.h.a());
            this.c.c(PAGE_TAOBAOLIVECONTAINER, str, hashMap);
            try {
                v(str, Arrays.toString(brq.a(hashMap)));
            } catch (Throwable unused) {
            }
        }
        return currentTimeMillis;
    }

    public void u(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ee9a05", new Object[]{this, obj});
            return;
        }
        this.e = obj;
        TBLiveH5Container tBLiveH5Container = this.i;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.setWebViewToken(obj);
        }
        zmr zmrVar = this.j;
        if (zmrVar != null) {
            zmrVar.k(this.e);
        }
    }

    public void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{this, str, str2});
            return;
        }
        z1e z1eVar = this.c;
        if (z1eVar != null) {
            z1eVar.b(Flag_TaobaoLiveContainer, str, str2);
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ea5395", new Object[]{this, str});
            return;
        }
        j();
        anr anrVar = this.n;
        if (anrVar != null) {
            anrVar.e(str, false, true);
        }
    }

    public nkr(Context context, String str, z1e z1eVar, zdb zdbVar, String[] strArr) {
        this(context, str, z1eVar, zdbVar, null, strArr);
    }

    public void b(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88bfb3a9", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        this.k.d(z);
        if (!z) {
            TBLiveH5Container tBLiveH5Container = this.i;
            if (tBLiveH5Container != null) {
                if (ch8.j(tBLiveH5Container.getContext())) {
                    Toast.makeText(this.i.getContext(), "预渲染失败，释放JS环境", 0).show();
                }
                this.i.destroy();
                this.i = null;
            }
            zmr zmrVar = this.j;
            if (zmrVar != null) {
                if (ch8.j(zmrVar.getContext())) {
                    Toast.makeText(this.j.getContext(), "预渲染失败，释放JS环境", 0).show();
                }
                this.j.destroy();
                this.j = null;
            }
        }
        HashMap<String, String> b = brq.b(jSONObject);
        if (b == null) {
            b = new HashMap<>();
        }
        b.put("success", String.valueOf(z));
        t("tlh5_prerender_finish", b);
    }

    public nkr(Context context, String str, z1e z1eVar, zdb zdbVar, zbe zbeVar, String[] strArr) {
        this.k = new mnr();
        this.m = false;
        this.o = false;
        this.p = true;
        this.f = UUID.randomUUID().toString();
        this.f24797a = context;
        this.b = str;
        this.c = z1eVar;
        this.d = strArr;
        this.h = new okr(zdbVar);
        if (z1eVar != null) {
            z1eVar.b(Flag_TaobaoLiveContainer, q, "TBLiveH5ContainerBuilder-create-mSource:" + str);
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!this.o) {
            this.o = true;
            this.l = str;
            long s = s("tlh5_load_url_begin");
            if (!this.m) {
                o(str, true, false);
            }
            TBLiveH5Container tBLiveH5Container = this.i;
            if (tBLiveH5Container == null || tBLiveH5Container.isDestroied()) {
                hashMap.put("pre_render_failed_code", "5");
                i();
            }
            this.i.setTag(R.id.taolive_container_prerender_status, Boolean.FALSE);
            if (this.k.g(str)) {
                hashMap.put("pre_render_failed_code", "0");
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("accessUrl", (Object) str);
                    WVStandardEventCenter.postNotificationToJS(this.i, EVENT_TBLiveBasePlugin_Event_PreRender_Attach, jSONObject.toJSONString());
                }
                this.p = false;
                this.g = "true";
            } else {
                if (this.k.e() || this.k.f()) {
                    float c = qp0.c();
                    if (!this.h.e) {
                        hashMap.put("pre_render_failed_code", "1");
                    } else if (c <= 20.0f) {
                        hashMap.put("pre_render_failed_code", "2");
                    } else if (this.k.e()) {
                        hashMap.put("pre_render_failed_code", "4");
                    } else if (this.k.f()) {
                        hashMap.put("pre_render_failed_code", "7");
                    }
                    this.i.destroy();
                    this.i = null;
                    i();
                }
                this.p = true;
            }
            t("tlh5_fsp", hashMap);
            this.i.setLoadUrlTimestamp(s);
            this.k.b();
        }
    }

    public final void o(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af8947bb", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        } else if (!TextUtils.isEmpty(str)) {
            this.l = str;
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(KEY_PRE_ZCACHE);
                this.h.e &= parse.getBooleanQueryParameter(KEY_PRE_RENDER, false);
                this.h.b &= parse.getBooleanQueryParameter(KEY_PRE_LOAD, false);
                okr okrVar = this.h;
                okrVar.c = parse.getBooleanQueryParameter(KEY_SSR, false) & okrVar.c;
                if (z || this.h.f25451a) {
                    i();
                }
                if (this.h.d && !TextUtils.isEmpty(queryParameter)) {
                    q(queryParameter);
                }
                if (this.h.b) {
                    p(str);
                }
                if (z2 && this.h.e) {
                    r(str);
                }
                this.m = true;
            }
        }
    }
}
