package com.taobao.android.detail.ttdetail.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f6687a;
    public final d b;
    public final C0351a c;
    public final List<b> d;
    public final List<e> e;
    public final String f;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.async.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0351a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c f6688a;

        static {
            t2o.a(912261260);
        }

        public C0351a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("mtopConfig")) != null && !jSONObject2.isEmpty()) {
                this.f6688a = new c(jSONObject2);
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9f78ad4c", new Object[]{this});
            }
            return this.f6688a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6689a;
        public final String b;

        static {
            t2o.a(912261261);
        }

        public b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6689a = jSONObject.getString("source");
                this.b = jSONObject.getString("target");
            }
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
            }
            return this.f6689a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6690a;
        public final String b;
        public JSONObject c;

        static {
            t2o.a(912261262);
        }

        public c(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6690a = jSONObject.getString("apiMethod");
                this.b = jSONObject.getString("apiVersion");
                this.c = jSONObject.getJSONObject("data");
            }
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("ea9c9155", new Object[]{this});
            }
            return this.c;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88867334", new Object[]{this});
            }
            return this.f6690a;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
            }
            return this.b;
        }

        public void d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d258e53d", new Object[]{this, jSONObject});
            } else if (jSONObject != null && !jSONObject.isEmpty()) {
                if (this.c == null) {
                    this.c = new JSONObject();
                }
                this.c.putAll(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final f f6691a;
        public final f b;

        static {
            t2o.a(912261263);
        }

        public d(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6691a = new f(jSONObject.getJSONObject("onSuccess"));
                this.b = new f(jSONObject.getJSONObject("onFailed"));
            }
        }

        public f a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("3747f788", new Object[]{this});
            }
            return this.b;
        }

        public f b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("9354b9a2", new Object[]{this});
            }
            return this.f6691a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f6692a;

        static {
            t2o.a(912261264);
        }

        public e(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6692a = a.g(jSONObject);
            }
        }

        public List<b> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("73fa793a", new Object[]{this});
            }
            return this.f6692a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f6693a;
        public final JSONObject b;
        public final JSONArray c;

        static {
            t2o.a(912261265);
        }

        public f(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject.getJSONObject("payload");
                this.c = jSONObject.getJSONArray("events");
                this.f6693a = a.g(jSONObject);
            }
        }

        public JSONArray a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("58418e68", new Object[]{this});
            }
            return this.c;
        }

        public List<b> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("73fa793a", new Object[]{this});
            }
            return this.f6693a;
        }

        public JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5117a4ff", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(912261259);
    }

    public a(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mtopConfig");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                this.f6687a = new c(jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("R");
            if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                this.b = new d(jSONObject3);
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("dependencyRequest");
            if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                this.c = new C0351a(jSONObject4);
            }
            this.d = g(jSONObject);
            JSONArray jSONArray = jSONObject.getJSONArray("relateComponents");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                    if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                        if (this.e == null) {
                            this.e = new ArrayList(jSONArray.size());
                        }
                        ((ArrayList) this.e).add(new e(jSONObject5));
                    }
                }
            }
            this.f = jSONObject.getString("v-if");
        }
    }

    public static List<b> g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("49ce2293", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("kvmap");
        ArrayList arrayList = null;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(jSONArray.size());
                    }
                    arrayList.add(new b(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    public C0351a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0351a) ipChange.ipc$dispatch("7f8df6ee", new Object[]{this});
        }
        return this.c;
    }

    public List<b> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("73fa793a", new Object[]{this});
        }
        return this.d;
    }

    public c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9f78ad4c", new Object[]{this});
        }
        return this.f6687a;
    }

    public d d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6dda3a92", new Object[]{this});
        }
        return this.b;
    }

    public List<e> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("92e30bfb", new Object[]{this});
        }
        return this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17afd23c", new Object[]{this});
        }
        return this.f;
    }
}
