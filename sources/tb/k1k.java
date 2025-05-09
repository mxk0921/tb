package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.data.remote.newmodel.NewRecommendRequest;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.login4android.session.constants.SessionConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k1k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASAC_VALUE = "2A239181Y5Q46U3PS790AH";
    public static final String KEY_ASAC = "asac";
    public static final String KEY_BIZ_PARAMS = "bizParams";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_QUERY_PARAMS = "queryParams";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements njd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f22344a = new JSONObject();
        public final JSONObject b = new JSONObject();
        public final JSONObject c = new JSONObject();
        public final JSONObject d = new JSONObject();
        public final JSONObject e = new JSONObject();
        public final NewRecommendRequest f;

        static {
            t2o.a(468714251);
            t2o.a(468714247);
        }

        public a(pep pepVar, NewRecommendRequest newRecommendRequest) {
            this.f = newRecommendRequest;
        }

        public a A(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6ce7cb87", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                JSONObject jSONObject = this.f22344a.getJSONObject("options");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.f22344a.put("options", (Object) jSONObject);
                }
                jSONObject.put("prefetch", (Object) Boolean.TRUE);
            }
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6ea8151", new Object[]{this});
            }
            this.d.put("queryParams", (Object) JSON.toJSONString(this.e));
            this.c.put("bizParams", (Object) JSON.toJSONString(this.d));
            Application a2 = p91.a();
            if (a2 != null) {
                JSONObject jSONObject = this.c;
                kgv kgvVar = kgv.INSTANCE;
                jSONObject.put("enableUnderageMode", (Object) Boolean.valueOf(kgvVar.h(a2)));
                if (kgvVar.a()) {
                    this.c.put("isSystemMinors", (Object) Boolean.valueOf(kgvVar.g(a2)));
                    this.c.put("minorsAgeLevel", (Object) Integer.valueOf(kgvVar.b(a2)));
                }
            }
            this.f.params = JSON.toJSONString(this.c);
            this.b.put("params", (Object) this.f.params);
            this.f22344a.put("data", (Object) this.b);
            return this;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9cb1709f", new Object[]{this});
            }
            this.f22344a.put("api", (Object) this.f.getApi());
            this.f22344a.put("v", (Object) this.f.getVersion());
            this.f22344a.put(SessionConstants.ECODE, (Object) Integer.valueOf(this.f.isNeedEcode() ? 1 : 0));
            this.f22344a.put(MspGlobalDefine.SESSION, (Object) Integer.valueOf(this.f.isNeedSession() ? 1 : 0));
            return this;
        }

        @Override // tb.njd
        public JSONObject build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d1d5fb15", new Object[]{this});
            }
            return this.f22344a;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("95eefc21", new Object[]{this, str});
            }
            this.f.appId = str;
            this.b.put("appId", (Object) str);
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a1995c0", new Object[]{this, str});
            }
            this.e.put("appVersion", (Object) str);
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7acbff9d", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = this.f22344a.getJSONObject("headers");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("asac", (Object) str);
                this.f22344a.put("headers", (Object) jSONObject);
            }
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("31f4ee62", new Object[]{this, str});
            }
            this.e.put("bizParameters", (Object) str);
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2c2aea5", new Object[]{this, str});
            }
            if (str != null && ws6.f()) {
                ir9.b("NewRecommendRequestParam", "setBizTopic - bizTopic= ".concat(str));
                JSONObject jSONObject = this.f22344a.getJSONObject("options");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.f22344a.put("options", (Object) jSONObject);
                }
                jSONObject.put(MtopModule.KEY_MTOP_BIZ_TOPIC, (Object) str);
                jSONObject.put("bizId", (Object) "TBVideoSDK");
            }
            return this;
        }

        @Override // tb.njd
        public IMTOPRequest getMtopRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMTOPRequest) ipChange.ipc$dispatch("8167cd7e", new Object[]{this});
            }
            return this.f;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c077179", new Object[]{this, str});
            }
            this.e.put("contentId", (Object) str);
            return this;
        }

        public a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7911c528", new Object[]{this, str});
            }
            this.e.put("countryCode", (Object) str);
            return this;
        }

        public a j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f14a5c6", new Object[]{this, new Integer(i)});
            }
            this.e.put("dataVersion", (Object) Integer.valueOf(i));
            return this;
        }

        public a k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9b9fcde4", new Object[]{this, str});
            }
            this.e.put("detailParameters", (Object) str);
            return this;
        }

        public a l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6c17bd6d", new Object[]{this, str});
            }
            this.e.put("extendParameters", (Object) str);
            return this;
        }

        public a m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b8cdf04a", new Object[]{this, str});
            }
            this.e.put("guideExp", (Object) str);
            return this;
        }

        public a n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3616eccf", new Object[]{this, str});
            }
            this.e.put("lowDevice", (Object) str);
            this.c.put("lowDevice", (Object) str);
            return this;
        }

        public a o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("545e6d8c", new Object[]{this, str});
            }
            this.e.put("ndExp", (Object) str);
            return this;
        }

        public a p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf20f2c3", new Object[]{this, str});
            }
            this.e.put(x3w.KEY_ND_OPEN_TYPE, (Object) str);
            return this;
        }

        public a q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7870303a", new Object[]{this, str});
            }
            this.e.put("networkQuality", (Object) str);
            return this;
        }

        public a r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e4d1727b", new Object[]{this, str});
            }
            this.e.put("newDetailChannel", (Object) str);
            return this;
        }

        public a s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a2e427f", new Object[]{this, str});
            }
            this.e.put("newType", (Object) str);
            return this;
        }

        public a t(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("218fd3f1", new Object[]{this, new Integer(i)});
            }
            this.e.put("pageIndex", (Object) Integer.valueOf(i));
            return this;
        }

        public a u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4dceb1f9", new Object[]{this, str});
            }
            this.e.put("pageSize", (Object) str);
            return this;
        }

        public a v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8e3d07cd", new Object[]{this, str});
            }
            this.e.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, (Object) str);
            return this;
        }

        public a w(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a5cb17ca", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                JSONObject jSONObject = this.f22344a.getJSONObject("options");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.f22344a.put("options", (Object) jSONObject);
                }
                jSONObject.put("prefetchTimeout", (Object) Integer.valueOf(i));
            }
            return this;
        }

        public a x(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aee6bcee", new Object[]{this, str});
            }
            if (!TextUtils.isEmpty(str)) {
                this.f22344a.put("type", (Object) str);
            }
            return this;
        }

        public a y(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c827c44c", new Object[]{this, str});
            }
            this.e.put("sceneId", (Object) str);
            return this;
        }

        public a z(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a1d4b64", new Object[]{this, str});
            }
            this.e.put("source", (Object) str);
            return this;
        }
    }

    static {
        t2o.a(468714250);
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82462d5b", new Object[]{jSONObject});
        }
        return jSONObject.getString("contentId");
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff33d864", new Object[]{jSONObject});
        }
        return jSONObject.getString("detailParameters");
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6283ad", new Object[]{jSONObject});
        }
        return jSONObject.getString("extendParameters");
    }

    public static JSONObject d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5dc854fb", new Object[]{obj});
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return JSON.parseObject(JSON.parseObject(JSON.parseObject((String) obj).getString("bizParams")).getString("queryParams"));
        } catch (Throwable unused) {
            ir9.b("NewRecommendRequestParam", "getQueryParams failed " + obj);
            return null;
        }
    }

    public a e(pep pepVar, NewRecommendRequest newRecommendRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bcc35365", new Object[]{this, pepVar, newRecommendRequest});
        }
        return new a(pepVar, newRecommendRequest);
    }
}
