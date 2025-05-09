package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y6a extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004979);
    }

    public static /* synthetic */ Object ipc$super(y6a y6aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/Get");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        if (list != null && list.size() == 2) {
            Object obj = list.get(0);
            if (obj instanceof Map) {
                return ((Map) obj).get(list.get(1));
            }
            try {
                int e = qak.e(list.get(1));
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
