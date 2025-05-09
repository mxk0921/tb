package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ao5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_MAP_CONCAT = -3309045306953881825L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15893a = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(ao5 ao5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserMapConcat");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = null;
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null) {
            return new JSONObject();
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof JSONObject) {
            jSONObject = obj2;
        }
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 == null) {
            return jSONObject2;
        }
        if (objArr.length == 3) {
            Object obj3 = objArr[2];
            if (obj3 instanceof Integer) {
                z = ckf.b(obj3, 1);
            } else if (obj3 instanceof String) {
                z = tsq.x("true", (String) obj3, true);
            } else if (obj3 instanceof Boolean) {
                z = ((Boolean) obj3).booleanValue();
            }
            this.f15893a = z;
        }
        if (this.f15893a) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.putAll(jSONObject2);
            jSONObject4.putAll(jSONObject3);
            return jSONObject4;
        }
        jSONObject2.putAll(jSONObject3);
        return jSONObject2;
    }
}
