package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_RLLIST2MAP = -2660439002557496364L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(cq5 cq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRlList2Map");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = null;
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            if (!(obj instanceof JSONArray)) {
                obj = null;
            }
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray != null) {
                Object obj2 = objArr[1];
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str = (String) obj2;
                if (str != null) {
                    jSONObject = new JSONObject();
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) next;
                            if (jSONObject2.get(str) instanceof String) {
                                Object obj3 = jSONObject2.get(str);
                                if (obj3 != null) {
                                    jSONObject.put((JSONObject) ((String) obj3), (String) next);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
