package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_LIST_FILTER = -5298919323794606164L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(xn5 xn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserListFilter");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        JSONArray jSONArray = (JSONArray) (!(obj instanceof JSONArray) ? null : obj);
        if (jSONArray != null) {
            Object obj2 = objArr[2];
            if (!(obj2 instanceof JSONObject)) {
                obj2 = null;
            }
            JSONObject jSONObject = (JSONObject) obj2;
            if (jSONObject != null) {
                Object obj3 = objArr[1];
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str = (String) obj3;
                if (str != null) {
                    if (objArr.length > 3) {
                        z = ckf.b("true", objArr[3]);
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            Object obj4 = ((JSONObject) next).get(str);
                            if (!(obj4 instanceof String)) {
                                obj4 = null;
                            }
                            String str2 = (String) obj4;
                            if (!(str2 == null || z == jSONObject.containsKey(str2))) {
                                jSONArray2.add(next);
                            }
                        }
                    }
                    return jSONArray2;
                }
            }
        }
        return obj;
    }
}
