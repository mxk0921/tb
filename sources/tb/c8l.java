package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c8l extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004988);
    }

    public static /* synthetic */ Object ipc$super(c8l c8lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/Or");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        s3a.a("OrEvaluation");
        if (list != null && list.size() > 1) {
            int size = list.size();
            try {
                boolean b = qak.b(list.get(0).toString());
                for (int i = 1; i < size; i++) {
                    boolean b2 = qak.b(list.get(i).toString());
                    if (!b && !b2) {
                        b = false;
                    }
                    b = true;
                }
                return Boolean.valueOf(b);
            } catch (ClassCastException unused) {
                s3a.a("boolean cast error!");
            }
        }
        return null;
    }
}
