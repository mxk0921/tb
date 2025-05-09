package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.mqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class vu0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<bzm> f30256a;
    public final List<bzm> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552654);
        }

        public a() {
        }

        public final float c(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("810ff841", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).floatValue();
            }
            if (f / f2 >= f3 / f4) {
                return f4 / f2;
            }
            return f3 / f;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final vu0 a(float f, float f2, float f3, float f4, List<? extends Object> list, float f5, float f6) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vu0) ipChange.ipc$dispatch("ee6e1acd", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), list, new Float(f5), new Float(f6)});
            }
            ckf.g(list, "anchors");
            float c = c(f, f2, f3, f4);
            float f7 = f * c;
            float f8 = f2 * c;
            float f9 = 2;
            float f10 = (f7 - f3) / f9;
            float f11 = (f8 - f4) / f9;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map) {
                    mqu.a aVar = mqu.Companion;
                    Map map = (Map) next;
                    float c2 = aVar.c(map.get("x"), 0.0f);
                    it = it;
                    float c3 = aVar.c(map.get("y"), 0.0f);
                    Object obj = map.get("direction");
                    float f12 = 100;
                    float f13 = (c2 / f12) * f7;
                    float f14 = (c3 / f12) * f8;
                    if (f13 <= f10 + 20.0f || f13 >= (f7 - f10) - 20.0f || f14 <= f11 + 20.0f || f14 >= ((f8 - f11) - 20.0f) - 40.0f) {
                        arrayList = arrayList;
                        f7 = f7;
                    } else {
                        f7 = f7;
                        ArrayList arrayList3 = null;
                        if (ckf.b(obj, "left") || (obj == null && ((int) c2) >= 50)) {
                            float f15 = f5 / f9;
                            float f16 = (f3 - (f13 - f10)) - f15;
                            float f17 = (f14 - f11) - f15;
                            float f18 = (f3 - f16) - f6;
                            if (f18 > 110.0f) {
                                String valueOf = String.valueOf(map.get("x"));
                                String valueOf2 = String.valueOf(map.get("y"));
                                String obj2 = obj != null ? obj.toString() : null;
                                Object obj3 = map.get("targetItems");
                                if (obj3 instanceof List) {
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj4 : (Iterable) obj3) {
                                        if (obj4 instanceof JSONObject) {
                                            arrayList4.add(obj4);
                                        }
                                    }
                                    arrayList3 = arrayList4;
                                } else if (obj3 instanceof String) {
                                    try {
                                        JSONArray parseArray = JSON.parseArray((String) obj3);
                                        if (parseArray != null) {
                                            ArrayList arrayList5 = new ArrayList();
                                            for (Object obj5 : parseArray) {
                                                wyf b = dun.b(JSONObject.class);
                                                if (ckf.b(b, dun.b(String.class))) {
                                                    if (!(obj5 instanceof JSONObject)) {
                                                        obj5 = null;
                                                    }
                                                    jSONObject = (JSONObject) obj5;
                                                } else {
                                                    if (ckf.b(b, dun.b(Integer.TYPE))) {
                                                        if (!(obj5 instanceof Number)) {
                                                            obj5 = null;
                                                        }
                                                        Number number = (Number) obj5;
                                                        if (number != null) {
                                                            number.intValue();
                                                        }
                                                    } else if (ckf.b(b, dun.b(Long.TYPE))) {
                                                        if (!(obj5 instanceof Number)) {
                                                            obj5 = null;
                                                        }
                                                        Number number2 = (Number) obj5;
                                                        if (number2 != null) {
                                                            number2.longValue();
                                                        }
                                                    } else if (ckf.b(b, dun.b(Double.TYPE))) {
                                                        if (!(obj5 instanceof Number)) {
                                                            obj5 = null;
                                                        }
                                                        Number number3 = (Number) obj5;
                                                        if (number3 != null) {
                                                            number3.doubleValue();
                                                        }
                                                    } else if (ckf.b(b, dun.b(Boolean.TYPE))) {
                                                        if (!(obj5 instanceof JSONObject)) {
                                                            obj5 = null;
                                                        }
                                                        jSONObject = (JSONObject) obj5;
                                                    } else if (ckf.b(b, dun.b(JSONObject.class))) {
                                                        if (!(obj5 instanceof JSONObject)) {
                                                            obj5 = null;
                                                        }
                                                        jSONObject = (JSONObject) obj5;
                                                    }
                                                    jSONObject = null;
                                                }
                                                if (jSONObject != null) {
                                                    arrayList5.add(jSONObject);
                                                }
                                            }
                                            arrayList3 = arrayList5;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                arrayList = arrayList;
                                arrayList.add(new bzm(valueOf, valueOf2, obj2, f16, f17, f18, arrayList3));
                            }
                        } else {
                            float f19 = f5 / f9;
                            float f20 = (f13 - f10) - f19;
                            float f21 = (f14 - f11) - f19;
                            float f22 = (f3 - f20) - f6;
                            if (f22 > 110.0f) {
                                String valueOf3 = String.valueOf(map.get("x"));
                                String valueOf4 = String.valueOf(map.get("y"));
                                String obj6 = obj != null ? obj.toString() : null;
                                Object obj7 = map.get("targetItems");
                                if (obj7 instanceof List) {
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj8 : (Iterable) obj7) {
                                        if (obj8 instanceof JSONObject) {
                                            arrayList6.add(obj8);
                                        }
                                    }
                                    arrayList3 = arrayList6;
                                } else if (obj7 instanceof String) {
                                    try {
                                        JSONArray parseArray2 = JSON.parseArray((String) obj7);
                                        if (parseArray2 != null) {
                                            ArrayList arrayList7 = new ArrayList();
                                            for (Object obj9 : parseArray2) {
                                                wyf b2 = dun.b(JSONObject.class);
                                                if (ckf.b(b2, dun.b(String.class))) {
                                                    if (!(obj9 instanceof JSONObject)) {
                                                        obj9 = null;
                                                    }
                                                    jSONObject2 = (JSONObject) obj9;
                                                } else {
                                                    if (ckf.b(b2, dun.b(Integer.TYPE))) {
                                                        if (!(obj9 instanceof Number)) {
                                                            obj9 = null;
                                                        }
                                                        Number number4 = (Number) obj9;
                                                        if (number4 != null) {
                                                            number4.intValue();
                                                        }
                                                    } else if (ckf.b(b2, dun.b(Long.TYPE))) {
                                                        if (!(obj9 instanceof Number)) {
                                                            obj9 = null;
                                                        }
                                                        Number number5 = (Number) obj9;
                                                        if (number5 != null) {
                                                            number5.longValue();
                                                        }
                                                    } else if (ckf.b(b2, dun.b(Double.TYPE))) {
                                                        if (!(obj9 instanceof Number)) {
                                                            obj9 = null;
                                                        }
                                                        Number number6 = (Number) obj9;
                                                        if (number6 != null) {
                                                            number6.doubleValue();
                                                        }
                                                    } else if (ckf.b(b2, dun.b(Boolean.TYPE))) {
                                                        if (!(obj9 instanceof JSONObject)) {
                                                            obj9 = null;
                                                        }
                                                        jSONObject2 = (JSONObject) obj9;
                                                    } else if (ckf.b(b2, dun.b(JSONObject.class))) {
                                                        if (!(obj9 instanceof JSONObject)) {
                                                            obj9 = null;
                                                        }
                                                        jSONObject2 = (JSONObject) obj9;
                                                    }
                                                    jSONObject2 = null;
                                                }
                                                if (jSONObject2 != null) {
                                                    arrayList7.add(jSONObject2);
                                                }
                                            }
                                            arrayList3 = arrayList7;
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                                arrayList2.add(new bzm(valueOf3, valueOf4, obj6, f20, f21, f22, arrayList3));
                            }
                        }
                        arrayList = arrayList;
                    }
                } else {
                    f7 = f7;
                    it = it;
                    arrayList = arrayList;
                }
            }
            return new vu0(arrayList, arrayList2);
        }

        public final vu0 b(float f, float f2, float f3, float f4, List<? extends Object> list, float f5, float f6) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            float f7 = f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vu0) ipChange.ipc$dispatch("c5fd558a", new Object[]{this, new Float(f), new Float(f7), new Float(f3), new Float(f4), list, new Float(f5), new Float(f6)});
            }
            ckf.g(list, "anchors");
            float f8 = 2;
            float f9 = (f3 - f) / f8;
            float f10 = (f4 - f7) / f8;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map) {
                    mqu.a aVar = mqu.Companion;
                    Map map = (Map) next;
                    it = it;
                    float c = aVar.c(map.get("x"), 0.0f);
                    float c2 = aVar.c(map.get("y"), 0.0f);
                    Object obj = map.get("direction");
                    float f11 = 100;
                    float f12 = (c / f11) * f;
                    float f13 = (c2 / f11) * f7;
                    ArrayList arrayList3 = null;
                    if (ckf.b(obj, "left") || (obj == null && ((int) c) >= 50)) {
                        arrayList2 = arrayList2;
                        float f14 = f5 / f8;
                        float f15 = ((f - f12) + f9) - f14;
                        float f16 = (f13 + f10) - f14;
                        if (f16 <= f4 - 50.0f) {
                            String valueOf = String.valueOf(map.get("x"));
                            String valueOf2 = String.valueOf(map.get("y"));
                            String obj2 = obj != null ? obj.toString() : null;
                            float f17 = (f3 - f15) - f6;
                            Object obj3 = map.get("targetItems");
                            if (obj3 instanceof List) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : (Iterable) obj3) {
                                    if (obj4 instanceof JSONObject) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                arrayList3 = arrayList4;
                            } else if (obj3 instanceof String) {
                                try {
                                    JSONArray parseArray = JSON.parseArray((String) obj3);
                                    if (parseArray != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj5 : parseArray) {
                                            wyf b = dun.b(JSONObject.class);
                                            if (ckf.b(b, dun.b(String.class))) {
                                                if (!(obj5 instanceof JSONObject)) {
                                                    obj5 = null;
                                                }
                                                jSONObject = (JSONObject) obj5;
                                            } else {
                                                if (ckf.b(b, dun.b(Integer.TYPE))) {
                                                    if (!(obj5 instanceof Number)) {
                                                        obj5 = null;
                                                    }
                                                    Number number = (Number) obj5;
                                                    if (number != null) {
                                                        number.intValue();
                                                    }
                                                } else if (ckf.b(b, dun.b(Long.TYPE))) {
                                                    if (!(obj5 instanceof Number)) {
                                                        obj5 = null;
                                                    }
                                                    Number number2 = (Number) obj5;
                                                    if (number2 != null) {
                                                        number2.longValue();
                                                    }
                                                } else if (ckf.b(b, dun.b(Double.TYPE))) {
                                                    if (!(obj5 instanceof Number)) {
                                                        obj5 = null;
                                                    }
                                                    Number number3 = (Number) obj5;
                                                    if (number3 != null) {
                                                        number3.doubleValue();
                                                    }
                                                } else if (ckf.b(b, dun.b(Boolean.TYPE))) {
                                                    if (!(obj5 instanceof JSONObject)) {
                                                        obj5 = null;
                                                    }
                                                    jSONObject = (JSONObject) obj5;
                                                } else if (ckf.b(b, dun.b(JSONObject.class))) {
                                                    if (!(obj5 instanceof JSONObject)) {
                                                        obj5 = null;
                                                    }
                                                    jSONObject = (JSONObject) obj5;
                                                }
                                                jSONObject = null;
                                            }
                                            if (jSONObject != null) {
                                                arrayList5.add(jSONObject);
                                            }
                                        }
                                        arrayList3 = arrayList5;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            arrayList = arrayList;
                            arrayList.add(new bzm(valueOf, valueOf2, obj2, f15, f16, f17, arrayList3));
                        }
                    } else {
                        float f18 = f5 / f8;
                        float f19 = (f12 + f9) - f18;
                        float f20 = (f13 + f10) - f18;
                        if (f20 <= f4 - 50.0f) {
                            String valueOf3 = String.valueOf(map.get("x"));
                            String valueOf4 = String.valueOf(map.get("y"));
                            String obj6 = obj != null ? obj.toString() : null;
                            float f21 = (f3 - f19) - f6;
                            Object obj7 = map.get("targetItems");
                            if (obj7 instanceof List) {
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj8 : (Iterable) obj7) {
                                    if (obj8 instanceof JSONObject) {
                                        arrayList6.add(obj8);
                                    }
                                }
                                arrayList3 = arrayList6;
                            } else if (obj7 instanceof String) {
                                try {
                                    JSONArray parseArray2 = JSON.parseArray((String) obj7);
                                    if (parseArray2 != null) {
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj9 : parseArray2) {
                                            wyf b2 = dun.b(JSONObject.class);
                                            if (ckf.b(b2, dun.b(String.class))) {
                                                if (!(obj9 instanceof JSONObject)) {
                                                    obj9 = null;
                                                }
                                                jSONObject2 = (JSONObject) obj9;
                                            } else {
                                                if (ckf.b(b2, dun.b(Integer.TYPE))) {
                                                    if (!(obj9 instanceof Number)) {
                                                        obj9 = null;
                                                    }
                                                    Number number4 = (Number) obj9;
                                                    if (number4 != null) {
                                                        number4.intValue();
                                                    }
                                                } else if (ckf.b(b2, dun.b(Long.TYPE))) {
                                                    if (!(obj9 instanceof Number)) {
                                                        obj9 = null;
                                                    }
                                                    Number number5 = (Number) obj9;
                                                    if (number5 != null) {
                                                        number5.longValue();
                                                    }
                                                } else if (ckf.b(b2, dun.b(Double.TYPE))) {
                                                    if (!(obj9 instanceof Number)) {
                                                        obj9 = null;
                                                    }
                                                    Number number6 = (Number) obj9;
                                                    if (number6 != null) {
                                                        number6.doubleValue();
                                                    }
                                                } else if (ckf.b(b2, dun.b(Boolean.TYPE))) {
                                                    if (!(obj9 instanceof JSONObject)) {
                                                        obj9 = null;
                                                    }
                                                    jSONObject2 = (JSONObject) obj9;
                                                } else if (ckf.b(b2, dun.b(JSONObject.class))) {
                                                    if (!(obj9 instanceof JSONObject)) {
                                                        obj9 = null;
                                                    }
                                                    jSONObject2 = (JSONObject) obj9;
                                                }
                                                jSONObject2 = null;
                                            }
                                            if (jSONObject2 != null) {
                                                arrayList7.add(jSONObject2);
                                            }
                                        }
                                        arrayList3 = arrayList7;
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                            arrayList2 = arrayList2;
                            arrayList2.add(new bzm(valueOf3, valueOf4, obj6, f19, f20, f21, arrayList3));
                        } else {
                            arrayList2 = arrayList2;
                        }
                    }
                    arrayList = arrayList;
                } else {
                    it = it;
                    arrayList = arrayList;
                    arrayList2 = arrayList2;
                }
                f7 = f2;
            }
            return new vu0(arrayList, arrayList2);
        }
    }

    static {
        t2o.a(918552653);
    }

    public vu0(List<bzm> list, List<bzm> list2) {
        ckf.g(list, "lefts");
        ckf.g(list2, "rights");
        this.f30256a = list;
        this.b = list2;
    }

    public final List<bzm> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c0b5038a", new Object[]{this});
        }
        return this.f30256a;
    }

    public final List<bzm> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed1a54f3", new Object[]{this});
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof vu0) {
                vu0 vu0Var = (vu0) obj;
                if (!ckf.b(this.f30256a, vu0Var.f30256a) || !ckf.b(this.b, vu0Var.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        List<bzm> list = this.f30256a;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<bzm> list2 = this.b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AnchorModel(lefts=" + this.f30256a + ", rights=" + this.b + f7l.BRACKET_END_STR;
    }
}
