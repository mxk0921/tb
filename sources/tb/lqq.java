package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lqq extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596329);
    }

    public static /* synthetic */ Object ipc$super(lqq lqqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/StringConcat");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        if (list != null && list.size() > 1) {
            int size = list.size();
            Object obj = list.get(0);
            if (obj != null && (obj instanceof String)) {
                for (int i = 1; i < size; i++) {
                    Object obj2 = list.get(i);
                    if (obj2 != null && (obj2 instanceof String)) {
                        obj = obj.toString().concat(obj2.toString());
                    }
                }
                return obj.toString();
            }
        }
        return null;
    }
}
