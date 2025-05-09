package com.taobao.android.detail.ttdetail.data.meta;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dt4;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "vertical")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Vertical extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a askAll;
    private final JSONObject dtaoInfo;
    private final b hk;
    private final c jhs;
    private final JSONObject picHeaderGlobalFloatLayer;
    private final d supermarket;
    private final JSONObject transparentBroadcast;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f6767a;

        static {
            t2o.a(912261715);
        }

        public a(JSONObject jSONObject) {
            this.f6767a = jSONObject;
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6124be2c", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new a(jSONObject);
            }
            return null;
        }

        public JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
            }
            return this.f6767a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6768a;
        public final String b;
        public final List<Map<String, List<Pair<String, String>>>> c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements dt4.a<Map<String, List<Pair<String, String>>>> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            /* renamed from: b */
            public Map<String, List<Pair<String, String>>> a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("ce4739cb", new Object[]{this, obj});
                }
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = (JSONObject) obj;
                for (String str : jSONObject.keySet()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : jSONObject2.keySet()) {
                        String string = jSONObject2.getString(str2);
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList.add(new Pair(str2, string));
                        }
                    }
                    hashMap.put(str, arrayList);
                }
                return hashMap;
            }
        }

        static {
            t2o.a(912261716);
        }

        public b(JSONObject jSONObject) {
            this.f6768a = jSONObject.getString("taxDescTittle");
            this.b = jSONObject.getString("sizeCartUrl");
            this.c = e(jSONObject);
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bec61d91", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new b(jSONObject);
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5a0527d4", new Object[]{this});
            }
            return this.b;
        }

        public List<Map<String, List<Pair<String, String>>>> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f0f307a", new Object[]{this});
            }
            return this.c;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aaf88ce7", new Object[]{this});
            }
            return this.f6768a;
        }

        public final List<Map<String, List<Pair<String, String>>>> e(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("739b8a", new Object[]{this, jSONObject});
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("taxDesc");
            return (jSONArray == null || jSONArray.size() == 0) ? arrayList : dt4.a(jSONArray, new a(this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261718);
        }

        public c(JSONObject jSONObject) {
            jSONObject.getBooleanValue("hasIntervalPrice");
        }

        public static c a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("19fef12d", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new c(jSONObject);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6769a;

        static {
            t2o.a(912261719);
        }

        public d(JSONObject jSONObject) {
            this.f6769a = jSONObject.getString("tpId");
        }

        public static d a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("db43c1cb", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new d(jSONObject);
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("63c3cbec", new Object[]{this});
            }
            return this.f6769a;
        }
    }

    static {
        t2o.a(912261714);
    }

    public Vertical(JSONObject jSONObject) {
        super(jSONObject);
        this.jhs = c.a(jSONObject.getJSONObject("jhs"));
        this.hk = b.a(jSONObject.getJSONObject("inter"));
        this.askAll = a.a(jSONObject.getJSONObject("askAll"));
        this.dtaoInfo = jSONObject.getJSONObject("dtaoInfo");
        this.supermarket = d.a(jSONObject.getJSONObject("supermarket"));
        this.transparentBroadcast = jSONObject.getJSONObject("transparentBroadcast");
        this.picHeaderGlobalFloatLayer = jSONObject.getJSONObject("picHeaderGlobalFloatLayer");
    }

    public static /* synthetic */ Object ipc$super(Vertical vertical, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Vertical");
    }

    public a getAskAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a0db3b22", new Object[]{this});
        }
        return this.askAll;
    }

    public JSONObject getDtaoInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7111b6a9", new Object[]{this});
        }
        return this.dtaoInfo;
    }

    public b getHK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("77f3d7ec", new Object[]{this});
        }
        return this.hk;
    }

    public c getJhs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("11328498", new Object[]{this});
        }
        return this.jhs;
    }

    public JSONObject getPicHeaderGlobalFloatLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6dda5ba0", new Object[]{this});
        }
        return this.picHeaderGlobalFloatLayer;
    }

    public d getSupermarket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("88847738", new Object[]{this});
        }
        return this.supermarket;
    }

    public JSONObject getTransparentBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d43fb92c", new Object[]{this});
        }
        return this.transparentBroadcast;
    }
}
