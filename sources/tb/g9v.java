package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class g9v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPARE_RESULT_CODE_ARRAY_SIZE_NOT_SAME = "arraySizeNotSame";
    public static final String COMPARE_RESULT_CODE_OBJECT_NOT_SAME = "objectNotSame";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        static {
            t2o.a(83886372);
        }
    }

    static {
        t2o.a(83886370);
    }

    public static boolean b(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66567b94", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        return c(iDMComponent, iDMComponent2, null);
    }

    public static boolean c(IDMComponent iDMComponent, IDMComponent iDMComponent2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80339a67", new Object[]{iDMComponent, iDMComponent2, aVar})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent2 == null || !a(iDMComponent.getData(), iDMComponent2.getData(), aVar) || !a(iDMComponent.getContainerInfo(), iDMComponent2.getContainerInfo(), aVar)) {
            return false;
        }
        return true;
    }

    public static void f(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c6f107", new Object[]{str, str2, obj, obj2, obj3, obj4, aVar});
        } else if (aVar != null) {
            aVar.getClass();
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5590e8e7", new Object[]{jSONObject, jSONObject2, aVar})).booleanValue();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            f(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, "", jSONObject, jSONObject2, null, null, aVar);
            return false;
        }
        if (aVar == null) {
            aVar = new a();
        }
        return d(jSONObject, jSONObject2, aVar, "");
    }

    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad39295", new Object[]{jSONObject, jSONObject2, aVar, str})).booleanValue();
        }
        int size = jSONObject.size();
        int size2 = jSONObject2.size();
        aVar.getClass();
        if (size != size2) {
            f(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, str, jSONObject, jSONObject2, null, null, aVar);
            return false;
        }
        for (String str2 : (size >= size2 ? jSONObject : jSONObject2).keySet()) {
            if (!t8v.b(str, str2, null)) {
                Object obj = jSONObject.get(str2);
                Object obj2 = jSONObject2.get(str2);
                if (obj != null || obj2 == null) {
                    if (obj == null || obj2 != null) {
                        if (obj != null || obj2 != null) {
                            if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
                                if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                                    if (!String.valueOf(obj).equals(String.valueOf(obj2)) && !obj.equals(obj2)) {
                                        f(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, t8v.a(str, str2), jSONObject, jSONObject2, obj, obj2, aVar);
                                        return false;
                                    }
                                } else if (!e((JSONArray) obj, (JSONArray) obj2, aVar, t8v.a(str, str2))) {
                                    return false;
                                }
                            } else if (!d((JSONObject) obj, (JSONObject) obj2, aVar, t8v.a(str, str2))) {
                                return false;
                            }
                        }
                    } else if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
                        if (!(obj instanceof String) || Boolean.parseBoolean((String) obj)) {
                            f(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, t8v.a(str, str2), jSONObject, jSONObject2, obj, obj2, aVar);
                            return false;
                        }
                    }
                } else if (!(obj2 instanceof Boolean) || ((Boolean) obj2).booleanValue()) {
                    if (!(obj2 instanceof String) || Boolean.parseBoolean((String) obj2)) {
                        f(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, t8v.a(str, str2), jSONObject, jSONObject2, obj, obj2, aVar);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean e(JSONArray jSONArray, JSONArray jSONArray2, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41539c7e", new Object[]{jSONArray, jSONArray2, aVar, str})).booleanValue();
        }
        if (jSONArray.size() != jSONArray2.size()) {
            f(COMPARE_RESULT_CODE_ARRAY_SIZE_NOT_SAME, str, jSONArray, jSONArray2, jSONArray, jSONArray2, aVar);
            return false;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            Object obj2 = jSONArray2.get(i);
            if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
                if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                    if (!obj.equals(obj2)) {
                        f("objectNotSame#index=" + i, str, jSONArray, jSONArray, obj, obj2, aVar);
                        return false;
                    }
                } else if (!e((JSONArray) obj, (JSONArray) obj2, aVar, str)) {
                    return false;
                }
            } else if (!d((JSONObject) obj, (JSONObject) obj2, aVar, str)) {
                return false;
            }
        }
        return true;
    }
}
