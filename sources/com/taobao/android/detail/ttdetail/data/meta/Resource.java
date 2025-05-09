package com.taobao.android.detail.ttdetail.data.meta;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.dt4;
import tb.ir;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
@MappingKey(key = "resource")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Resource extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ArrayList<ir> abilityParamList;
    private final b animation;
    private final List<d> floatButtons;
    private final JSONObject floatView;
    private final JSONObject mResident;
    private final String pageKey;
    private final Map<String, String> rsExtParams;
    private final g share;
    private final JSONObject topAtmosphere;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dt4.a<ir> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Resource resource) {
        }

        /* renamed from: b */
        public ir a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ir) ipChange.ipc$dispatch("494f1317", new Object[]{this, obj});
            }
            if (obj instanceof JSONObject) {
                return new ir((JSONObject) obj);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6757a;
        public final String b;

        static {
            t2o.a(912261688);
        }

        public b(JSONObject jSONObject) {
            this.f6757a = jSONObject.getString("type");
            this.b = jSONObject.getString("animationUrl");
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cea385a6", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new b(jSONObject);
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("71631bd8", new Object[]{this});
            }
            return this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.f6757a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6758a;
        public final JSONObject b;
        public final String c;

        static {
            t2o.a(912261689);
        }

        public c() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("910cf2ba", new Object[]{this});
            }
            return this.f6758a;
        }

        public JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("32be7773", new Object[]{this});
            }
            return this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
            }
            return this.c;
        }

        public c(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6758a = Resource.nullToEmpty(jSONObject.getString("abilityName"));
                Resource.nullToEmpty(jSONObject.getString("apiName"));
                this.b = jSONObject.getJSONObject("params");
                this.c = Resource.nullToEmpty(jSONObject.getString("url"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6759a;
        public final String b;
        public final c c;
        public final String d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a implements dt4.a<d> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: b */
            public d a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (d) ipChange.ipc$dispatch("5648f7b7", new Object[]{this, obj});
                }
                return new d((JSONObject) obj);
            }
        }

        static {
            t2o.a(912261690);
        }

        public d(JSONObject jSONObject) {
            if (jSONObject != null) {
                jSONObject.getBooleanValue("showDetailPopBtn");
                this.f6759a = Resource.nullToEmpty(jSONObject.getString("btnImageUrl"));
                this.b = Resource.nullToEmpty(jSONObject.getString("actionType"));
                this.c = new c(jSONObject.getJSONObject("actionData"));
                this.d = Resource.nullToEmpty(jSONObject.getString("bizCode"));
            }
        }

        public static List<d> a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ad6be10c", new Object[]{jSONArray});
            }
            return dt4.a(jSONArray, new a());
        }

        public c b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("97441bd0", new Object[]{this});
            }
            return this.c;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65717033", new Object[]{this});
            }
            return this.b;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8799bef", new Object[]{this});
            }
            return this.d;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("80eabbdf", new Object[]{this});
            }
            return this.f6759a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6760a;
        public final String b;
        public final String c;

        static {
            t2o.a(912261692);
        }

        public e(JSONObject jSONObject) {
            this.f6760a = Resource.nullToEmpty(jSONObject.getString("itemId"));
            this.b = Resource.nullToEmpty(jSONObject.getString("picUrl"));
            this.c = Resource.nullToEmpty(jSONObject.getString("title"));
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
            }
            return this.f6760a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a92c3f5e", new Object[]{this});
            }
            return this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
            }
            return this.c;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f6761a;
        public final ArrayList<e> b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements dt4.a<e> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(f fVar) {
            }

            /* renamed from: b */
            public e a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (e) ipChange.ipc$dispatch("be10120e", new Object[]{this, obj});
                }
                return new e((JSONObject) obj);
            }
        }

        static {
            t2o.a(912261693);
        }

        public f(JSONObject jSONObject) {
            this.f6761a = jSONObject.getIntValue("index");
            this.b = dt4.a(jSONObject.getJSONArray("items"), new a(this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f6762a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements dt4.a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(g gVar) {
            }

            /* renamed from: b */
            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
                }
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
            }
        }

        static {
            t2o.a(912261695);
        }

        public g(JSONObject jSONObject) {
            jSONObject.getString("name");
            try {
                jSONObject.getInteger("iconType");
            } catch (Exception e) {
                tgh.a("Share iconType cast fail, " + e);
            }
            jSONObject.getString("iconUrl");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 != null) {
                this.f6762a = dt4.b(jSONObject2, new a(this));
            } else {
                this.f6762a = null;
            }
        }

        public static g a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("a25f6c2b", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new g(jSONObject);
        }

        public Map<String, String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
            }
            return this.f6762a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6763a;
        public final String b;
        public final String c;
        public final ArrayList<String> d;
        public final ArrayList<f> e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements dt4.a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(h hVar) {
            }

            /* renamed from: b */
            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
                }
                return (String) obj;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements dt4.a<f> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b(h hVar) {
            }

            /* renamed from: b */
            public f a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (f) ipChange.ipc$dispatch("f4877f13", new Object[]{this, obj});
                }
                return new f((JSONObject) obj);
            }
        }

        static {
            t2o.a(912261697);
        }

        public h(JSONObject jSONObject) {
            Resource.nullToEmpty(jSONObject.getString("title"));
            this.f6763a = Resource.nullToEmpty(jSONObject.getString(TypedValues.CycleType.S_WAVE_PERIOD));
            Resource.nullToEmpty(jSONObject.getString("activityId"));
            Resource.nullToEmpty(jSONObject.getString("type"));
            this.b = Resource.nullToEmpty(jSONObject.getString("actionUrl"));
            this.c = Resource.nullToEmpty(jSONObject.getString("iconText"));
            this.d = dt4.a(jSONObject.getJSONArray("content"), new a(this));
            this.e = dt4.a(jSONObject.getJSONArray("giftOfContent"), new b(this));
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65517636", new Object[]{this});
            }
            return this.b;
        }

        public ArrayList<String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("79987624", new Object[]{this});
            }
            return this.d;
        }

        public ArrayList<f> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("29c86638", new Object[]{this});
            }
            return this.e;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("273eadbd", new Object[]{this});
            }
            return this.c;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fdf7fea2", new Object[]{this});
            }
            return this.f6763a;
        }
    }

    static {
        t2o.a(912261686);
    }

    public Resource(JSONObject jSONObject) {
        super(jSONObject);
        this.animation = b.a(jSONObject.getJSONObject("animation"));
        this.share = g.a(jSONObject.getJSONObject("share"));
        this.floatButtons = d.a(jSONObject.getJSONArray("nativeFloatButton"));
        this.topAtmosphere = jSONObject.getJSONObject("topAtmosphere");
        this.floatView = jSONObject.getJSONObject("floatView");
        this.rsExtParams = (Map) jSONObject.getObject("globalNativeParams", Map.class);
        this.abilityParamList = buildAbilityParamList(jSONObject.getJSONArray("inDetailAutoEvent"));
        this.pageKey = jSONObject.getString("pageKey");
        this.mResident = jSONObject.getJSONObject("resident");
    }

    private ArrayList<ir> buildAbilityParamList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f702b658", new Object[]{this, jSONArray});
        }
        return dt4.a(jSONArray, new a(this));
    }

    public static /* synthetic */ Object ipc$super(Resource resource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Resource");
    }

    public static String nullToEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ed2fc4", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public ArrayList<ir> getAbilityParamList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b9049a18", new Object[]{this});
        }
        return this.abilityParamList;
    }

    public b getAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c19ec660", new Object[]{this});
        }
        return this.animation;
    }

    public List<d> getFloatButtons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("32a9f705", new Object[]{this});
        }
        return this.floatButtons;
    }

    public JSONObject getFloatView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50f96e92", new Object[]{this});
        }
        return this.floatView;
    }

    public String getPageKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab0b021f", new Object[]{this});
        }
        return this.pageKey;
    }

    public JSONObject getResident() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7082736d", new Object[]{this});
        }
        return this.mResident;
    }

    public Map<String, String> getRsExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a58ff0c", new Object[]{this});
        }
        return this.rsExtParams;
    }

    public g getShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e18e2b40", new Object[]{this});
        }
        return this.share;
    }

    public JSONObject getTopAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14b427c8", new Object[]{this});
        }
        return this.topAtmosphere;
    }
}
