package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ef6 extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698936);
    }

    public static /* synthetic */ Object ipc$super(ef6 ef6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTLStrMap");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        JSONObject jSONObject = new JSONObject();
        if (list != null && !list.isEmpty() && (list.get(0) instanceof String)) {
            for (String str : ((String) list.get(0)).split(",")) {
                if (str.contains("=")) {
                    String[] split2 = str.split("=");
                    jSONObject.put(split2[0], (Object) split2[1]);
                }
            }
        }
        return jSONObject;
    }
}
