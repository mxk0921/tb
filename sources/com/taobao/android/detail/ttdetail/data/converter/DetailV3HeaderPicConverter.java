package com.taobao.android.detail.ttdetail.data.converter;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.t2o;
import tb.tx9;
import tb.wua;
import tb.xka;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailV3HeaderPicConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f6747a = "frameVideo";
    public static final String b = "frameImage";
    public static final String c = "id";
    public static final String d = "type";
    public static final String e = "fields";
    public static final String f = "events";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6748a;
        public String b;
        public String c;
        public String d;

        static {
            t2o.a(912261631);
        }

        public a() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.f6748a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.d;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
            }
            return this.c;
        }

        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            } else {
                this.f6748a = str;
            }
        }

        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6749a;
        public e b;
        public List<c> c;

        static {
            t2o.a(912261632);
        }

        public b() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
            }
            return this.f6749a;
        }

        public e b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d5d8fabd", new Object[]{this});
            }
            return this.b;
        }

        public List<c> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e0c90411", new Object[]{this});
            }
            return this.c;
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
            } else {
                this.f6749a = str;
            }
        }

        public void e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ce0e261", new Object[]{this, eVar});
            } else {
                this.b = eVar;
            }
        }

        public void f(List<c> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2f0ebdb", new Object[]{this, list});
            } else {
                this.c = list;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6750a;
        public e b;
        public a c;

        static {
            t2o.a(912261633);
        }

        public c() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
            }
            return this.f6750a;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("380fe658", new Object[]{this});
            }
            return this.c;
        }

        public e c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d5d8fabd", new Object[]{this});
            }
            return this.b;
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
            } else {
                this.f6750a = str;
            }
        }

        public void e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("125345e6", new Object[]{this, aVar});
            } else {
                this.c = aVar;
            }
        }

        public void f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ce0e261", new Object[]{this, eVar});
            } else {
                this.b = eVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6751a;
        public e b;
        public List<b> c;

        static {
            t2o.a(912261634);
        }

        public d() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
            }
            return this.f6751a;
        }

        public e b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d5d8fabd", new Object[]{this});
            }
            return this.b;
        }

        public List<b> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("b92dc10b", new Object[]{this});
            }
            return this.c;
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
            } else {
                this.f6751a = str;
            }
        }

        public void e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ce0e261", new Object[]{this, eVar});
            } else {
                this.b = eVar;
            }
        }

        public void f(List<b> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d6146b9", new Object[]{this, list});
            } else {
                this.c = list;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6752a;
        public String b;
        public String c;
        public JSONObject d;
        public JSONObject e;

        static {
            t2o.a(912261635);
        }

        public e() {
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("78cabc36", new Object[]{this});
            }
            return this.e;
        }

        public JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
            }
            return this.d;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return this.f6752a;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
            }
            return this.b;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.c;
        }

        public void f(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b13ef00e", new Object[]{this, jSONObject});
            } else {
                this.e = jSONObject;
            }
        }

        public void g(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f811566e", new Object[]{this, jSONObject});
            } else {
                this.d = jSONObject;
            }
        }

        public void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
            } else {
                this.f6752a = str;
            }
        }

        public void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }
    }

    public static e b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("5d0e0bf6", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        String string = jSONObject2.getString("id");
        String string2 = jSONObject2.getString("tag");
        String string3 = jSONObject2.getString("type");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("events");
        e eVar = new e();
        eVar.h(string);
        eVar.i(string2);
        eVar.j(string3);
        eVar.g(jSONObject3);
        eVar.f(jSONObject4);
        return eVar;
    }

    public static JSONObject c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2d9bdce7", new Object[]{aVar});
        }
        return new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3HeaderPicConverter.2
            {
                put("name", (Object) a.this.a());
                put("type", (Object) a.this.b());
                put("version", (Object) a.this.d());
                put("url", (Object) a.this.c());
            }
        };
    }

    public static JSONObject d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dde122dd", new Object[]{jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("type");
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONObject.put(jSONArray2.getString(i2), (Object) jSONObject2);
                }
            }
        }
        return jSONObject;
    }

    static {
        t2o.a(912261628);
    }

    public static a a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2276b976", new Object[]{jSONObject, str});
        }
        if (str.startsWith("native$")) {
            String[] split = str.split("\\$");
            if (split.length == 2) {
                a aVar = new a();
                aVar.e(split[1]);
                aVar.f(split[0]);
                aVar.h("0");
                aVar.g("");
                return aVar;
            }
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        a aVar2 = new a();
        aVar2.e(jSONObject2.getString("name"));
        aVar2.f(jSONObject2.getString("containerType"));
        aVar2.h(jSONObject2.getString("version"));
        aVar2.g(jSONObject2.getString("url"));
        return aVar2;
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, JSONObject jSONObject3, JSONObject jSONObject4) {
        JSONArray jSONArray2;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53dcc8b5", new Object[]{jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4})).booleanValue();
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("detailHeaderPic");
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            return false;
        }
        String str = "headerPic";
        if (!str.equals(jSONArray3.getString(0)) || (jSONArray2 = jSONObject.getJSONArray("mainFrame")) == null || jSONArray2.isEmpty()) {
            return false;
        }
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject2.getJSONObject("mainContainer");
        String str2 = f;
        jSONObject6.put(str2, (Object) jSONObject7.getJSONObject(str2));
        String str3 = e;
        jSONObject6.put(str3, (Object) jSONObject7.getJSONObject(str3).getJSONObject("pullStyle"));
        jSONObject5.put(wua.KEY_DRAG_END, (Object) jSONObject6);
        JSONArray jSONArray4 = jSONObject.getJSONArray("locatorBar");
        if (jSONArray4 != null && !jSONArray4.isEmpty()) {
            JSONArray jSONArray5 = new JSONArray();
            int size = jSONArray4.size();
            for (int i3 = 0; i3 < size; i3++) {
                JSONObject jSONObject8 = jSONObject2.getJSONObject(jSONArray4.getString(i3));
                if (jSONObject8 != null) {
                    JSONObject jSONObject9 = jSONObject8.getJSONObject("fields");
                    jSONArray5.add(new JSONObject(jSONObject9.getString("locator"), jSONObject9.getString("text")) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3HeaderPicConverter.1
                        public final /* synthetic */ String val$locator;
                        public final /* synthetic */ String val$text;

                        {
                            this.val$locator = r2;
                            this.val$text = r3;
                            put("id", (Object) r2);
                            put("name", (Object) r3);
                        }
                    });
                }
            }
            jSONObject5.put(wua.KEY_LOCATORS, (Object) jSONArray5);
        }
        JSONObject d2 = d(jSONArray);
        ArrayList arrayList = new ArrayList();
        int size2 = jSONArray2.size();
        int i4 = 0;
        while (i4 < size2) {
            String string = jSONArray2.getString(i4);
            d dVar = new d();
            dVar.d(string);
            dVar.e(b(jSONObject2, string));
            ArrayList arrayList2 = new ArrayList();
            dVar.f(arrayList2);
            JSONArray jSONArray6 = jSONObject.getJSONArray(string);
            if (jSONArray6 == null || jSONArray6.isEmpty()) {
                jSONArray2 = jSONArray2;
                str = str;
                size2 = size2;
                i = 1;
            } else {
                int size3 = jSONArray6.size();
                int i5 = 0;
                while (i5 < size3) {
                    String string2 = jSONArray6.getString(i5);
                    b bVar = new b();
                    bVar.d(string2);
                    bVar.e(b(jSONObject2, string2));
                    ArrayList arrayList3 = new ArrayList();
                    bVar.f(arrayList3);
                    JSONArray jSONArray7 = jSONObject.getJSONArray(string2);
                    if (jSONArray7 == null || jSONArray7.isEmpty()) {
                        str = str;
                        jSONArray6 = jSONArray6;
                        i2 = 1;
                    } else {
                        jSONArray6 = jSONArray6;
                        int size4 = jSONArray7.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            String string3 = jSONArray7.getString(i6);
                            c cVar = new c();
                            if (string3.startsWith("frameFloat_")) {
                                JSONArray jSONArray8 = jSONObject.getJSONArray(string3);
                                if (jSONArray8 != null && !jSONArray8.isEmpty()) {
                                    string3 = jSONArray8.getString(0);
                                }
                                i6++;
                                size4 = size4;
                                jSONArray7 = jSONArray7;
                                str = str;
                            }
                            cVar.d(string3);
                            e b2 = b(jSONObject2, string3);
                            cVar.f(b2);
                            cVar.e(a(d2, b2.e()));
                            arrayList3.add(cVar);
                            i6++;
                            size4 = size4;
                            jSONArray7 = jSONArray7;
                            str = str;
                        }
                        str = str;
                        i2 = 1;
                        arrayList2.add(bVar);
                    }
                    i5 += i2;
                    size3 = size3;
                    jSONArray2 = jSONArray2;
                    size2 = size2;
                }
                jSONArray2 = jSONArray2;
                str = str;
                size2 = size2;
                i = 1;
                arrayList.add(dVar);
            }
            i4 += i;
        }
        JSONArray jSONArray9 = new JSONArray();
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("id", dVar2.a());
            jSONObject10.put(xka.KEY_LOCATOR_ID, dVar2.b().c());
            List<b> c2 = dVar2.c();
            if (!c2.isEmpty()) {
                JSONArray jSONArray10 = new JSONArray();
                for (b bVar2 : c2) {
                    JSONObject jSONObject11 = new JSONObject();
                    JSONObject b3 = bVar2.b().b();
                    jSONObject11.put("id", (Object) bVar2.a());
                    jSONObject11.put("dimension", (Object) b3.getString("dimension"));
                    jSONObject11.put(tx9.KEY_TAG_NAME, (Object) b3.getString("tag"));
                    jSONObject11.put(tx9.KEY_ENABLE_LIGHT_OFF, (Object) b3.getString("showLightOff"));
                    List<c> c3 = bVar2.c();
                    if (!c3.isEmpty()) {
                        for (c cVar2 : c3) {
                            String d3 = cVar2.c().d();
                            a b4 = cVar2.b();
                            if (b4 != null) {
                                jSONObject3.put(cVar2.c().e(), (Object) c(b4));
                            }
                            if (f6747a.equals(d3) || b.equals(d3)) {
                                JSONObject jSONObject12 = new JSONObject();
                                jSONObject12.put(c, (Object) cVar2.a());
                                jSONObject12.put(d, (Object) cVar2.c().e());
                                jSONObject12.put(f, (Object) cVar2.c().a());
                                jSONObject12.put(e, (Object) cVar2.c().b());
                                jSONObject11.put("content", (Object) jSONObject12);
                            } else {
                                JSONObject jSONObject13 = new JSONObject();
                                jSONObject13.put(c, (Object) cVar2.a());
                                jSONObject13.put(d, (Object) cVar2.c().e());
                                jSONObject13.put(f, (Object) cVar2.c().a());
                                jSONObject13.put(e, (Object) cVar2.c().b());
                                jSONObject11.put(tx9.KEY_FLOAT, (Object) jSONObject13);
                            }
                        }
                        jSONArray10.add(jSONObject11);
                    }
                }
                jSONObject10.put("items", (Object) jSONArray10);
                jSONArray9.add(jSONObject10);
            }
        }
        if (jSONArray9.isEmpty()) {
            return false;
        }
        jSONObject5.put("groups", (Object) jSONArray9);
        jSONObject4.put(str, (Object) jSONObject5);
        return true;
    }
}
