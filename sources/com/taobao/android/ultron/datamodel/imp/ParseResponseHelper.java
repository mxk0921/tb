package com.taobao.android.ultron.datamodel.imp;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bs2;
import tb.gsb;
import tb.mrl;
import tb.o1n;
import tb.o58;
import tb.t2o;
import tb.u55;
import tb.v55;
import tb.xav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ParseResponseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final u55 f9871a;
    public boolean b = false;
    public final Map<String, Object> c = new HashMap();
    public volatile bs2 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class TemplateInfo implements Serializable {
        public String id;
        public String version;

        static {
            t2o.a(83886199);
        }

        public TemplateInfo(String str, String str2) {
            this.id = str;
            this.version = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends AsyncTask<Void, Void, bs2> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9873a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ xav c;
        public final /* synthetic */ String d;

        public b(JSONObject jSONObject, JSONArray jSONArray, xav xavVar, String str) {
            this.f9873a = jSONObject;
            this.b = jSONArray;
            this.c = xavVar;
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/ParseResponseHelper$2");
        }

        /* renamed from: a */
        public bs2 doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bs2) ipChange.ipc$dispatch("49110ee4", new Object[]{this, voidArr});
            }
            ParseResponseHelper parseResponseHelper = ParseResponseHelper.this;
            ParseResponseHelper.b(parseResponseHelper, ParseResponseHelper.c(parseResponseHelper, this.f9873a, this.b));
            if (ParseResponseHelper.a(ParseResponseHelper.this) != null) {
                this.c.h(this.d, ParseResponseHelper.a(ParseResponseHelper.this));
            }
            return ParseResponseHelper.a(ParseResponseHelper.this);
        }
    }

    static {
        t2o.a(83886196);
    }

    public ParseResponseHelper(u55 u55Var) {
        this.f9871a = u55Var;
    }

    public static /* synthetic */ bs2 a(ParseResponseHelper parseResponseHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bs2) ipChange.ipc$dispatch("cced0d10", new Object[]{parseResponseHelper});
        }
        return parseResponseHelper.d;
    }

    public static /* synthetic */ bs2 b(ParseResponseHelper parseResponseHelper, bs2 bs2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bs2) ipChange.ipc$dispatch("272e6ea9", new Object[]{parseResponseHelper, bs2Var});
        }
        parseResponseHelper.d = bs2Var;
        return bs2Var;
    }

    public static /* synthetic */ bs2 c(ParseResponseHelper parseResponseHelper, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bs2) ipChange.ipc$dispatch("c96cd603", new Object[]{parseResponseHelper, jSONObject, jSONArray});
        }
        return parseResponseHelper.j(jSONObject, jSONArray);
    }

    public static List<TemplateInfo> g(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85b2387a", new Object[]{context, str});
        }
        List<String> g = xav.d(context, str).g();
        if (g == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(g.size());
        for (String str3 : g) {
            String[] split = str3.split("_\\$_");
            if (split.length >= 1) {
                String str4 = split[0];
                if (split.length == 2) {
                    str2 = split[1];
                } else {
                    str2 = null;
                }
                arrayList.add(new TemplateInfo(str4, str2));
            }
        }
        return arrayList;
    }

    public void d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126ad766", new Object[]{this, str, obj});
        } else {
            ((HashMap) this.c).put(str, obj);
        }
    }

    public final String e(String str, Map<String, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e098f067", new Object[]{this, str, map});
        }
        JSONObject jSONObject = map.get(str);
        String string = jSONObject != null ? jSONObject.getString("containerType") : null;
        return TextUtils.isEmpty(string) ? "native" : string;
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("53b1fea0", new Object[]{this});
        }
        return this.c;
    }

    public boolean h(BigInteger bigInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("985575fe", new Object[]{this, bigInteger})).booleanValue();
        }
        if (this.f9871a.F() == null) {
            return false;
        }
        return o1n.a(new BigInteger(this.f9871a.F()), bigInteger);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void l(JSONObject jSONObject, bs2 bs2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3276df3", new Object[]{this, jSONObject, bs2Var});
            return;
        }
        u55 u55Var = this.f9871a;
        if (u55Var != null && jSONObject != null) {
            v55 v = u55Var.v();
            if (v == null) {
                v = new v55(this.f9871a.getBizName(), this.f9871a.t);
                this.f9871a.u0(v);
            }
            if (bs2Var != null) {
                Map<String, DMComponent> a2 = bs2Var.a();
                List<o58> c = bs2Var.c();
                Map<String, JSONObject> b2 = bs2Var.b();
                if (a2 != null) {
                    this.f9871a.p().putAll(a2);
                    this.f9871a.I0("data");
                }
                if (c != null) {
                    this.f9871a.G0(c);
                    this.f9871a.I0("container");
                }
                if (b2 != null) {
                    this.f9871a.H0(b2);
                    this.f9871a.I0("container");
                }
            } else {
                this.f9871a.I0(null);
            }
            if (!jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT)) {
                jSONObject = jSONObject.getJSONObject("data");
            }
            this.b = v.j(this.f9871a, jSONObject, null);
            ((HashMap) this.c).put("protocolVersion", this.f9871a.G());
            if (jSONObject == null) {
                ((HashMap) this.c).put("reload", Boolean.TRUE);
                return;
            }
            ((HashMap) this.c).put("reload", Boolean.valueOf(Boolean.TRUE.toString().equalsIgnoreCase(jSONObject.getString("reload"))));
        }
    }

    public final gsb m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("a41e8109", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option"));
    }

    public final Map<String, List<gsb>> n(JSONObject jSONObject) {
        gsb m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7bbf1f69", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (m = m((JSONObject) next)) != null) {
                        arrayList.add(m);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    public void o(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f361c97", new Object[]{this, list});
        } else if (this.b) {
            for (JSONObject jSONObject : list) {
                new mrl().a(this.f9871a, jSONObject, null);
            }
        }
    }

    public void p(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972a0881", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT) && (jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) != null) {
            String string = jSONObject2.getString("features");
            if (!TextUtils.isEmpty(string)) {
                this.f9871a.A0(string);
            }
        }
    }

    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e82afb5", new Object[]{this, jSONObject});
        } else if (this.d != null) {
            l(jSONObject, this.d);
        } else {
            u(jSONObject, null);
        }
    }

    public void r(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
        } else if (mtopResponse != null) {
            s(mtopResponse.getBytedata());
        }
    }

    public void s(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03ec4a2", new Object[]{this, bArr});
        } else if (this.f9871a != null && bArr != null) {
            q((JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]));
        }
    }

    public void t(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bbc123", new Object[]{this, jSONObject, str});
        } else if (this.d != null) {
            l(jSONObject, this.d);
        } else {
            u(jSONObject, str);
        }
    }

    public void u(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a517b45", new Object[]{this, jSONObject, str});
            return;
        }
        u55 u55Var = this.f9871a;
        if (u55Var != null && jSONObject != null) {
            v55 v = u55Var.v();
            if (v == null) {
                v = new v55(this.f9871a.getBizName(), this.f9871a.t);
                this.f9871a.u0(v);
            }
            if (!jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT)) {
                jSONObject = jSONObject.getJSONObject("data");
            }
            this.b = v.j(this.f9871a, jSONObject, str);
            ((HashMap) this.c).put("protocolVersion", this.f9871a.G());
            if (jSONObject == null) {
                ((HashMap) this.c).put("reload", Boolean.TRUE);
                return;
            }
            ((HashMap) this.c).put("reload", Boolean.valueOf(Boolean.TRUE.toString().equalsIgnoreCase(jSONObject.getString("reload"))));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xav f9872a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public a(ParseResponseHelper parseResponseHelper, xav xavVar, String str, String str2, String str3, String str4) {
            this.f9872a = xavVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/ParseResponseHelper$1");
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
            }
            this.f9872a.i(this.b, this.c);
            UnifyLog.g("ParseResponseHelper", "processCache save cache");
            List<String> g = this.f9872a.g();
            if (g == null) {
                return null;
            }
            Iterator it = new ArrayList(g).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String[] split = str.split("_\\$_");
                if (split.length == 2 && TextUtils.equals(split[0], this.d) && !TextUtils.equals(split[1], this.e)) {
                    this.f9872a.b(str);
                    this.f9872a.a(str);
                    UnifyLog.g("ParseResponseHelper", "processCache deleteTemplateById:".concat(str));
                }
            }
            return null;
        }
    }

    public boolean k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1fce091", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.size() != 1 || !jSONObject.containsKey("linkage")) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("linkage");
        this.f9871a.z0(jSONObject2);
        this.f9871a.o0(jSONObject2.getJSONObject("common"));
        this.b = true;
        return true;
    }

    public void v(Context context, String str, JSONObject jSONObject, boolean z, boolean z2) {
        String str2;
        JSONObject jSONObject2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27ec878", new Object[]{this, context, str, jSONObject, new Boolean(z), new Boolean(z2)});
        } else if (jSONObject != null && z) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
            JSONObject jSONObject4 = (jSONObject3 == null || jSONObject3.isEmpty() || (jSONObject2 = jSONObject3.getJSONObject("meta")) == null) ? null : jSONObject2.getJSONObject("template");
            if (jSONObject4 != null) {
                xav d = xav.d(context, str);
                String string = jSONObject4.getString("id");
                String string2 = jSONObject4.getString("version");
                if (string != null) {
                    if (string2 != null) {
                        str2 = string + "_$_" + string2;
                    } else {
                        str2 = string;
                    }
                    JSONArray jSONArray = jSONObject4.getJSONArray("cacheFields");
                    if (!TextUtils.isEmpty(str2) && jSONArray != null) {
                        Iterator<Object> it = jSONArray.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                JSONObject jSONObject5 = new JSONObject();
                                Iterator<Object> it2 = jSONArray.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    jSONObject5.put((String) next, jSONObject.get(next));
                                }
                                new a(this, d, str2, jSONObject5.toJSONString(), string, string2).execute(new Object[0]);
                            } else if (!jSONObject.containsKey(it.next())) {
                                JSONObject f = d.f(str2);
                                if (f != null) {
                                    Iterator<Object> it3 = jSONArray.iterator();
                                    boolean z4 = false;
                                    while (it3.hasNext()) {
                                        Object next2 = it3.next();
                                        if (!jSONObject.containsKey(next2)) {
                                            Object obj = f.get(next2);
                                            if (obj != null) {
                                                jSONObject.put((String) next2, obj);
                                            } else {
                                                z4 = true;
                                            }
                                        }
                                    }
                                    z3 = z4;
                                }
                                if (z3) {
                                    UnifyLog.m(this.f9871a.getBizName(), "ParseResponseHelper", "processCache dataWrong", new String[0]);
                                    d.b(str2);
                                }
                            }
                        }
                        if (z2) {
                            this.d = d.c(str2);
                            if (this.d == null) {
                                new b(jSONObject, jSONArray, d, str2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                            }
                        }
                    }
                }
            }
        }
    }

    public final bs2 j(JSONObject jSONObject, JSONArray jSONArray) {
        String key;
        String[] g;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bs2) ipChange.ipc$dispatch("1bd7a365", new Object[]{this, jSONObject, jSONArray});
        }
        bs2 bs2Var = new bs2();
        if (!(jSONObject == null || jSONArray == null || jSONArray.isEmpty())) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = jSONObject.getJSONObject("container");
            if (!(jSONObject2 == null || (jSONArray2 = jSONObject2.getJSONArray("data")) == null)) {
                int size = jSONArray2.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    if (jSONObject3 != null) {
                        arrayList.add(new o58(jSONObject3));
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("type");
                        int i2 = 0;
                        for (int size2 = jSONArray3.size(); i2 < size2; size2 = size2) {
                            String string = jSONArray3.getString(i2);
                            jSONObject3.toString();
                            hashMap.put(string, jSONObject3);
                            i2++;
                        }
                    }
                }
            }
            if (jSONArray.contains("container")) {
                bs2Var.f(arrayList);
                bs2Var.e(hashMap);
            }
            if (jSONArray.contains("data")) {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject4 = jSONObject.getJSONObject("data");
                if (jSONObject4 != null) {
                    boolean h = h(o1n.FEATURE_TAG_ID);
                    for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
                        if (!(entry == null || (key = entry.getKey()) == null)) {
                            Object value = entry.getValue();
                            if (value instanceof JSONObject) {
                                if (h && (g = ParseModule.g(key)) != null) {
                                    if (g.length == 2) {
                                        jSONObject.put("tag", (Object) g[0]);
                                        jSONObject.put("id", (Object) g[1]);
                                        JSONObject jSONObject5 = (JSONObject) value;
                                        String string2 = jSONObject5.getString("type");
                                        jSONObject5.getString("tag");
                                        DMComponent dMComponent = new DMComponent(jSONObject5, e(string2, hashMap), (JSONObject) hashMap.get(string2), n(jSONObject.getJSONObject("events")));
                                        dMComponent.setComponentKey(key);
                                        hashMap2.put(key, dMComponent);
                                    }
                                }
                                JSONObject jSONObject52 = (JSONObject) value;
                                String string22 = jSONObject52.getString("type");
                                jSONObject52.getString("tag");
                                DMComponent dMComponent2 = new DMComponent(jSONObject52, e(string22, hashMap), (JSONObject) hashMap.get(string22), n(jSONObject.getJSONObject("events")));
                                dMComponent2.setComponentKey(key);
                                hashMap2.put(key, dMComponent2);
                            }
                        }
                    }
                }
                bs2Var.d(hashMap2);
            }
        }
        return bs2Var;
    }
}
