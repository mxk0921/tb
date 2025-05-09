package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rmg extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596325);
    }

    public static /* synthetic */ Object ipc$super(rmg rmgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/Length");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        ym7.h("LengthEvaluation");
        if (list == null || list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        try {
            if (obj instanceof String) {
                return String.valueOf(((String) obj).length());
            }
            if (obj instanceof Object[]) {
                return String.valueOf(((Object[]) obj).length);
            }
            if (obj instanceof Map) {
                return String.valueOf(((Map) obj).size());
            }
            if (obj instanceof List) {
                return String.valueOf(((List) obj).size());
            }
            return null;
        } catch (ClassCastException unused) {
            ym7.h("String cast error!");
            return null;
        }
    }
}
