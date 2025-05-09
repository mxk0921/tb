package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f26046a = new HashMap<>();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public Map<String, String> u;
    public Map<String, String> v;
    public Map<String, String> w;
    public final iep x;
    public Map<String, String> y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(pep pepVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends TypeReference<Map<String, String>> {
        public b(pep pepVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends TypeReference<Map<String, String>> {
        public c(pep pepVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends TypeReference<Map<String, String>> {
        public d(pep pepVar) {
        }
    }

    static {
        t2o.a(468714762);
    }

    public pep(Uri uri) {
        this.b = uri.getQueryParameter("type");
        this.c = uri.getQueryParameter("source");
        this.d = uri.getQueryParameter("id");
        this.e = uri.getQueryParameter("spm");
        uri.getQueryParameter("business_spm");
        this.f = uri.getQueryParameter("topicId");
        uri.getQueryParameter("videoUrl");
        this.g = uri.getQueryParameter("detailParameters");
        this.h = uri.getQueryParameter("bizParameters");
        uri.getQueryParameter("interactiveId");
        uri.getQueryParameter("hideAccountInfo");
        uri.getQueryParameter("contentId");
        uri.getQueryParameter(BaseOuterComponent.b.SOURCE_COMPONENT_ID);
        uri.getQueryParameter("accountId");
        uri.getQueryParameter("ab");
        uri.getQueryParameter("coverImage");
        uri.getQueryParameter("tppParameters");
        uri.getQueryParameter("height");
        uri.getQueryParameter("width");
        this.j = uri.getQueryParameter("extParams");
        this.k = uri.getQueryParameter("sourcePageName");
        this.l = uri.getQueryParameter("shareScene");
        this.m = uri.getQueryParameter("miniAppId");
        uri.getQueryParameter("hasSharedInstance");
        this.n = uri.getQueryParameter("trackInfo");
        uri.getQueryParameter("umpChannel");
        uri.getQueryParameter("commentId");
        this.o = uri.getQueryParameter("scm");
        this.t = uri.getQueryParameter("utExtParams");
        this.p = uri.getQueryParameter("clickid");
        this.i = uri.getQueryParameter("sceneId");
        this.q = uri.getQueryParameter("LocalWidth");
        this.r = uri.getQueryParameter("LocalHeight");
        uri.getQueryParameter("tbvs_ddns");
        for (String str : uri.getQueryParameterNames()) {
            this.f26046a.put(str, uri.getQueryParameter(str));
        }
        String queryParameter = uri.getQueryParameter(yj4.PARAM_UT_PARAMS);
        this.s = queryParameter;
        if (!TextUtils.isEmpty(queryParameter)) {
            JSON.parseObject(queryParameter);
        }
        if (!oau.d()) {
            this.u = (Map) hxf.c(uri.getQueryParameter("globalUtParams"), new a(this));
            this.v = (Map) hxf.c(uri.getQueryParameter(p3h.KEY_PAGE_UT_PARAMS), new b(this));
        } else {
            this.u = null;
            this.v = null;
        }
        this.x = new iep();
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("880dd23b", new Object[]{this});
        }
        return this.y;
    }

    public iep b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iep) ipChange.ipc$dispatch("d4815cc2", new Object[]{this});
        }
        return this.x;
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84c573ca", new Object[]{this});
        }
        return this.w;
    }

    public void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e927de04", new Object[]{this, map});
        } else {
            this.w = map;
        }
    }

    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b87046c", new Object[]{this, map});
        } else {
            this.y = map;
        }
    }

    public void e(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce5f0b5", new Object[]{this, map});
        } else if (map != null) {
            HashMap<String, String> c2 = nwv.c(map);
            for (Map.Entry<String, String> entry : c2.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                char c3 = 65535;
                switch (key.hashCode()) {
                    case -1799558163:
                        if (key.equals("shareScene")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case -1793914700:
                        if (key.equals(p3h.KEY_PAGE_UT_PARAMS)) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case -1539012526:
                        if (key.equals("LocalHeight")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case -1225813241:
                        if (key.equals("extParams")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case -1139259734:
                        if (key.equals("topicId")) {
                            c3 = 4;
                            break;
                        }
                        break;
                    case -1005509317:
                        if (key.equals("LocalWidth")) {
                            c3 = 5;
                            break;
                        }
                        break;
                    case -896505829:
                        if (key.equals("source")) {
                            c3 = 6;
                            break;
                        }
                        break;
                    case -751680229:
                        if (key.equals("detailParameters")) {
                            c3 = 7;
                            break;
                        }
                        break;
                    case -504237323:
                        if (key.equals("sourcePageName")) {
                            c3 = '\b';
                            break;
                        }
                        break;
                    case -332486872:
                        if (key.equals("utExtParams")) {
                            c3 = '\t';
                            break;
                        }
                        break;
                    case -168864312:
                        if (key.equals("globalUtParams")) {
                            c3 = '\n';
                            break;
                        }
                        break;
                    case -108833458:
                        if (key.equals(yj4.PARAM_UT_PARAMS)) {
                            c3 = 11;
                            break;
                        }
                        break;
                    case -47440035:
                        if (key.equals("bizParameters")) {
                            c3 = '\f';
                            break;
                        }
                        break;
                    case 3355:
                        if (key.equals("id")) {
                            c3 = '\r';
                            break;
                        }
                        break;
                    case 113693:
                        if (key.equals("scm")) {
                            c3 = 14;
                            break;
                        }
                        break;
                    case 114096:
                        if (key.equals("spm")) {
                            c3 = 15;
                            break;
                        }
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c3 = 16;
                            break;
                        }
                        break;
                    case 729492633:
                        if (key.equals("trackInfo")) {
                            c3 = 17;
                            break;
                        }
                        break;
                    case 778144005:
                        if (key.equals("miniAppId")) {
                            c3 = 18;
                            break;
                        }
                        break;
                    case 860524707:
                        if (key.equals("clickid")) {
                            c3 = 19;
                            break;
                        }
                        break;
                    case 1914646215:
                        if (key.equals("sceneId")) {
                            c3 = 20;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                        this.l = value;
                        break;
                    case 1:
                        this.v = (Map) hxf.c(value, new d(this));
                        break;
                    case 2:
                        this.r = value;
                        break;
                    case 3:
                        this.j = value;
                        break;
                    case 4:
                        this.f = value;
                        break;
                    case 5:
                        this.q = value;
                        break;
                    case 6:
                        this.c = value;
                        break;
                    case 7:
                        this.g = value;
                        break;
                    case '\b':
                        this.k = value;
                        break;
                    case '\t':
                        this.t = value;
                        break;
                    case '\n':
                        this.u = (Map) hxf.c(value, new c(this));
                        break;
                    case 11:
                        if (value != null) {
                            this.s = value;
                            if (!TextUtils.isEmpty(value)) {
                                JSON.parseObject(value);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case '\f':
                        this.h = value;
                        break;
                    case '\r':
                        this.d = value;
                        break;
                    case 14:
                        this.o = value;
                        break;
                    case 15:
                        this.e = value;
                        break;
                    case 16:
                        this.b = value;
                        break;
                    case 17:
                        this.n = value;
                        break;
                    case 18:
                        this.m = value;
                        break;
                    case 19:
                        this.p = value;
                        break;
                    case 20:
                        this.i = value;
                        break;
                }
            }
            this.f26046a.putAll(c2);
        }
    }
}
