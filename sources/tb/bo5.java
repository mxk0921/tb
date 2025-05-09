package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class bo5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_MAPIMPLODE = -3398088490479994350L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(bo5 bo5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserMapImplode");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        ckf.g(dXRuntimeContext, "dinamicParams");
        if (objArr == null || objArr.length < 3 || !(objArr[0] instanceof JSONObject) || !(objArr[1] instanceof String) || !(objArr[2] instanceof String)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Object obj = objArr[1];
        if (obj != null) {
            String str = (String) obj;
            Object obj2 = objArr[2];
            if (obj2 != null) {
                String str2 = (String) obj2;
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    JSONObject jSONObject = (JSONObject) obj3;
                    for (String str3 : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str3);
                        sb.append(valueOf);
                        sb.append(str.concat(" "));
                        sb.append((String) jSONObject.get(valueOf));
                        sb.append(str2);
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
