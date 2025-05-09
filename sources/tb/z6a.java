package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z6a extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596319);
    }

    public static /* synthetic */ Object ipc$super(z6a z6aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/Get");
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
            if (obj instanceof Map) {
                return ((Map) obj).get(list.get(1));
            }
            try {
                int e = rak.e(list.get(1));
                if (obj instanceof List) {
                    objArr = ((List) obj).toArray();
                } else {
                    objArr = (Object[]) obj;
                }
                if (e < objArr.length) {
                    return objArr[e];
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
