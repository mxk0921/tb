package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d8l extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596328);
    }

    public static /* synthetic */ Object ipc$super(d8l d8lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/Or");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        ym7.h("OrEvaluation");
        if (list != null && list.size() > 1) {
            int size = list.size();
            try {
                boolean b = rak.b(list.get(0).toString());
                for (int i = 1; i < size; i++) {
                    boolean b2 = rak.b(list.get(i).toString());
                    if (!b && !b2) {
                        b = false;
                    }
                    b = true;
                }
                return Boolean.valueOf(b);
            } catch (ClassCastException unused) {
                ym7.h("boolean cast error!");
            }
        }
        return null;
    }
}
