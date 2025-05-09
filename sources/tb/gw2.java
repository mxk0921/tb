package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gw2 extends rm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475005004);
    }

    public static /* synthetic */ Object ipc$super(gw2 gw2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/parser/resolver/CallbackParamParser");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        Object c = g5aVar.c();
        if (!(c instanceof JSONObject)) {
            return null;
        }
        try {
            return b((String) list.get(0), ((JSONObject) c).getJSONObject(dm7.CALLBACK_PARAM_PREFIX));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
