package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ut5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_VALUEFORKEYPATH = -6369601284820524535L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(ut5 ut5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserValueForKeyPath");
    }

    public final Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{this, obj, str});
        }
        if (!(obj == null || str == null)) {
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

    public final Object b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e634508", new Object[]{this, str, jSONObject});
        }
        if (jSONObject.isEmpty()) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".[]", false);
        JSONObject jSONObject2 = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            jSONObject2 = a(jSONObject2, stringTokenizer.nextToken());
        }
        return jSONObject2;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            return obj;
        }
        String obj2 = objArr[1].toString();
        if (obj2 == null || obj2.length() == 0) {
            return objArr[0];
        }
        Object obj3 = objArr[0];
        if (obj3 != null) {
            JSONObject jSONObject = (JSONObject) obj3;
            Object obj4 = objArr[1];
            if (obj4 != null) {
                Object b = b((String) obj4, jSONObject);
                return (objArr.length <= 2 || String.valueOf(b).length() != 0) ? b : objArr[3];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }
}
