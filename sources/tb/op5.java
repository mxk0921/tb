package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class op5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "rateFeedList";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c4789637", new Object[]{this})).longValue();
            }
            return op5.h();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static final /* synthetic */ long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("827ea390", new Object[0])).longValue();
        }
        return -67668164305500991L;
    }

    public static /* synthetic */ Object ipc$super(op5 op5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateDebugLogKT");
    }

    public final void b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46aeafa", new Object[]{this, objArr});
        } else {
            e(objArr[0]);
        }
    }

    public final void c(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54579fc2", new Object[]{this, objArr});
            return;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object obj3 = objArr[2];
        String e = e(obj2);
        String e2 = e(obj);
        if (f(obj3)) {
            n0u.d(e + " : " + e2);
        }
    }

    public final void d(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5049e8d4", new Object[]{this, objArr});
            return;
        }
        Object obj = objArr[0];
        e(objArr[1]);
        e(obj);
    }

    public final String e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf01dda9", new Object[]{this, obj});
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof JSONObject) {
            return obj.toString();
        }
        if (!(obj instanceof JSONArray)) {
            return "Unsupported type";
        }
        String jSONString = ((JSONArray) obj).toJSONString();
        ckf.f(jSONString, "value.toJSONString()");
        return jSONString;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return Boolean.FALSE;
        }
        int length = objArr.length;
        if (length == 1) {
            b(objArr);
        } else if (length != 2) {
            c(objArr);
        } else {
            d(objArr);
        }
        return Boolean.TRUE;
    }

    public final boolean f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c31f4dc", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return g((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f7d2679", new Object[]{this, str})).booleanValue();
        }
        if (str == null || ckf.b(str, "false") || tsq.x(str, "0", true) || str.length() == 0) {
            return false;
        }
        return true;
    }
}
