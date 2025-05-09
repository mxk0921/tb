package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final long f28747a = k06.a("itemMapReplace");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261748);
        }

        public a() {
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff44e04c", new Object[]{this})).longValue();
            }
            return tj5.a();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261747);
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d14655b", new Object[0])).longValue();
        }
        return f28747a;
    }

    public static /* synthetic */ Object ipc$super(tj5 tj5Var, String str, Object... objArr) {
        if (str.hashCode() == -858210922) {
            return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/DXDataParserDetailMapConvertList");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            Object evalWithArgs = super.evalWithArgs(objArr, dXRuntimeContext);
            ckf.c(evalWithArgs, "super.evalWithArgs(operationList, runtimeParam)");
            return evalWithArgs;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONObject)) {
            for (Object obj3 : (Iterable) obj) {
                jSONArray.add(((Map) obj2).get(obj3));
            }
        }
        tgh.b("DXDataParserDetailMapConvertList", "dataList : " + jSONArray);
        return jSONArray;
    }
}
