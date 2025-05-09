package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class nn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("239da135", new Object[]{this})).longValue();
            }
            return nn5.b();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eccd9fd2", new Object[0])).longValue();
        }
        return 9053333931513791477L;
    }

    public static /* synthetic */ Object ipc$super(nn5 nn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserJson2Array");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONArray jSONArray = new JSONArray();
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof JSONObject) {
            if (obj != null) {
                for (Map.Entry<String, Object> entry : ((JSONObject) obj).entrySet()) {
                    Object value = entry.getValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) at.k, entry.getKey());
                    jSONObject.put((JSONObject) "v", (String) value);
                    jSONArray.add(jSONObject);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        return jSONArray;
    }
}
