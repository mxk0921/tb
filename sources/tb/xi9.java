package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xi9 extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596318);
    }

    public static /* synthetic */ Object ipc$super(xi9 xi9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/Find");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        if (list != null && list.size() == 2) {
            Object obj = list.get(0);
            Object obj2 = list.get(1);
            try {
                if (obj instanceof List) {
                    objArr = ((List) obj).toArray();
                } else {
                    objArr = (Object[]) obj;
                }
                for (int i = 0; i < objArr.length; i++) {
                    if (objArr[i].equals(obj2)) {
                        return objArr[i];
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
