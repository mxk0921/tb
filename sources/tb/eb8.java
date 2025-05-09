package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eb8 extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004976);
    }

    public static /* synthetic */ Object ipc$super(eb8 eb8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/Else");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        if (list == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
}
