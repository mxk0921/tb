package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_INDEXOFVALUEFORKEYPATH = -8937188514497035075L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(vm5 vm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserIndexOfValueForKeyPath");
    }

    public final Object b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{this, obj, str});
        }
        if (!(obj == null || str == null)) {
            boolean z = obj instanceof String;
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final Object c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e634508", new Object[]{this, str, jSONObject});
        }
        ckf.g(jSONObject, "inputData");
        if (jSONObject.isEmpty()) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".", false);
        JSONObject jSONObject2 = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            jSONObject2 = b(jSONObject2, stringTokenizer.nextToken());
        }
        return jSONObject2;
    }

    public final int a(JSONArray jSONArray, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6781120f", new Object[]{this, jSONArray, str, str2})).intValue();
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                Object c = c(str2, jSONObject);
                if ((c instanceof String) && ckf.b(c, str)) {
                    return i;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        return 0;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        ckf.g(objArr, "operationList");
        if ((objArr.length == 0) && objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof JSONArray) {
            Object obj2 = objArr[1];
            if (obj2 instanceof String) {
                Object obj3 = objArr[2];
                if (obj3 instanceof String) {
                    if (obj != null) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (obj2 != null) {
                            String str = (String) obj2;
                            if (obj3 != null) {
                                return Integer.valueOf(a(jSONArray, str, (String) obj3));
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
                }
            }
        }
        return null;
    }
}
