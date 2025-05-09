package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f28739a = f4b.b("enableSetTemplateType", true);
    public static final LruCache<JSONObject, a> b = new LruCache<>(20);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String S_T_DISABLE_DINAMICX3 = "disableDinamicX3_client";
        public static final String S_T_IS_HOMEPAGE_DATA = "isHomepageData_client";
        public static final String S_T_RECALCULATE_VIEW_TYPE = "needReCalculateViewType_client";

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f28740a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;
        public DinamicTemplate i;
        public DXTemplateItem j;

        static {
            t2o.a(729809162);
        }

        public a(JSONObject jSONObject) {
            this.f28740a = jSONObject;
            String string = jSONObject.getString("name");
            this.b = string;
            String string2 = jSONObject.getString("version");
            this.c = string2;
            String string3 = jSONObject.getString("url");
            this.d = string3;
            String string4 = jSONObject.getString("name_v2");
            this.e = string4;
            String string5 = jSONObject.getString("version_v2");
            this.f = string5;
            String string6 = jSONObject.getString("url_v2");
            this.g = string6;
            jSONObject.getBooleanValue(S_T_IS_HOMEPAGE_DATA);
            this.h = f(string3, string, string2) || f(string6, string4, string5);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea414ee9", new Object[]{this});
            } else {
                this.f28740a.put(S_T_DISABLE_DINAMICX3, (Object) Boolean.TRUE);
            }
        }

        public DXTemplateItem b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXTemplateItem) ipChange.ipc$dispatch("c32af741", new Object[]{this});
            }
            DXTemplateItem dXTemplateItem = this.j;
            if (dXTemplateItem != null) {
                return dXTemplateItem;
            }
            if (f(this.d, this.b, this.c)) {
                DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
                this.j = dXTemplateItem2;
                dXTemplateItem2.f7343a = this.b;
                dXTemplateItem2.b = k(this.c);
                DXTemplateItem dXTemplateItem3 = this.j;
                dXTemplateItem3.c = this.d;
                j(dXTemplateItem3);
                return this.j;
            } else if (!f(this.g, this.e, this.f)) {
                return new DXTemplateItem();
            } else {
                DXTemplateItem dXTemplateItem4 = new DXTemplateItem();
                this.j = dXTemplateItem4;
                dXTemplateItem4.f7343a = this.e;
                dXTemplateItem4.b = k(this.f);
                DXTemplateItem dXTemplateItem5 = this.j;
                dXTemplateItem5.c = this.g;
                j(dXTemplateItem5);
                return this.j;
            }
        }

        public DinamicTemplate c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DinamicTemplate) ipChange.ipc$dispatch("7043cd26", new Object[]{this});
            }
            DinamicTemplate dinamicTemplate = this.i;
            if (dinamicTemplate != null) {
                return dinamicTemplate;
            }
            if (f(this.d, this.b, this.c)) {
                return new DinamicTemplate();
            }
            DinamicTemplate dinamicTemplate2 = new DinamicTemplate();
            this.i = dinamicTemplate2;
            dinamicTemplate2.name = this.b;
            dinamicTemplate2.templateUrl = this.d;
            dinamicTemplate2.version = this.c;
            return dinamicTemplate2;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
            }
            if (h()) {
                return b().f7343a;
            }
            return c().name;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba17df31", new Object[]{this});
            }
            if (h()) {
                return String.valueOf(b().b);
            }
            return c().version;
        }

        public final boolean f(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cf70aa3", new Object[]{this, str, str2, str3})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || !str.endsWith(".zip") || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return false;
            }
            return true;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ed4ea59d", new Object[]{this})).booleanValue();
            }
            return this.f28740a.getBooleanValue(S_T_RECALCULATE_VIEW_TYPE);
        }

        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("366eb872", new Object[]{this})).booleanValue();
            }
            if (!this.f28740a.containsKey(S_T_DISABLE_DINAMICX3) || !this.f28740a.getBooleanValue(S_T_DISABLE_DINAMICX3)) {
                return this.h;
            }
            return false;
        }

        public void i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47b5eb93", new Object[]{this, new Boolean(z)});
            } else {
                this.f28740a.put(S_T_RECALCULATE_VIEW_TYPE, (Object) Boolean.valueOf(z));
            }
        }

        public final void j(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9f64c6", new Object[]{this, dXTemplateItem});
            } else if (tit.a() && dXTemplateItem != null) {
                dXTemplateItem.m(1);
            }
        }

        public final long k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("718dec6a", new Object[]{this, str})).longValue();
            }
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
                return 0L;
            }
        }
    }

    static {
        t2o.a(729809161);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f28739a;
    }

    public static a b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("391e9d09", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            LruCache<JSONObject, a> lruCache = b;
            a aVar = lruCache.get(jSONObject);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(jSONObject);
            lruCache.put(jSONObject, aVar2);
            return aVar2;
        } catch (Throwable th) {
            bqa.d("TemplateDataUtils", "getCompatibleDinamicTemplate error e: " + th.getMessage());
            return new a(jSONObject);
        }
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15e2d237", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.getString("columnType");
    }
}
