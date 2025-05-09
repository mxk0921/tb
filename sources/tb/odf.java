package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class odf extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004981);
    }

    public static /* synthetic */ Object ipc$super(odf odfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/IntGreater");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        s3a.a("IntGreater");
        if (list != null && list.size() == 2) {
            try {
                if (Integer.parseInt(list.get(0).toString()) > Integer.parseInt(list.get(1).toString())) {
                    return Boolean.TRUE;
                }
            } catch (NumberFormatException unused) {
                s3a.a("Integer cast error!");
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}
