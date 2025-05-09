package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rgu extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596334);
    }

    public static /* synthetic */ Object ipc$super(rgu rguVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/Triple");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        ym7.h("TripleEvaluation");
        if (list == null || list.size() != 3) {
            return Boolean.FALSE;
        }
        try {
            if (rak.b(list.get(0).toString())) {
                return (String) list.get(1);
            }
            return (String) list.get(2);
        } catch (ClassCastException unused) {
            return Boolean.FALSE;
        }
    }
}
