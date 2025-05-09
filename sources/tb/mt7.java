package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mt7 extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004975);
    }

    public static /* synthetic */ Object ipc$super(mt7 mt7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/DoubleLessEqual");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        s3a.a("DoubleLessEqual");
        if (list != null && list.size() == 2) {
            try {
                double parseDouble = Double.parseDouble(list.get(1).toString()) - Double.parseDouble(list.get(0).toString());
                if (1.0E-9d <= parseDouble || Math.abs(parseDouble) < 1.0E-9d) {
                    return Boolean.TRUE;
                }
            } catch (NumberFormatException unused) {
                s3a.a("double cast error!");
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}
