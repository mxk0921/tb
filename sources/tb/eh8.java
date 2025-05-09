package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eh8 extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004977);
    }

    public static /* synthetic */ Object ipc$super(eh8 eh8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/Equal");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        if (list == null || list.size() != 2) {
            return null;
        }
        Object obj = list.get(0);
        Object obj2 = list.get(1);
        if (obj == null && obj2 == null) {
            return Boolean.TRUE;
        }
        if (obj == null || obj2 == null) {
            return Boolean.FALSE;
        }
        if (obj.getClass().equals(obj2.getClass())) {
            return Boolean.valueOf(obj.equals(obj2));
        }
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            return Boolean.valueOf(obj.equals(obj2));
        }
        return Boolean.valueOf(b(obj, obj2));
    }

    public boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d190c51", new Object[]{this, obj, obj2})).booleanValue();
        }
        if ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) {
            if (qak.c(obj).compareTo(qak.c(obj2)) == 0) {
                return true;
            }
            return false;
        } else if (qak.a(obj) || qak.a(obj2)) {
            if (qak.d(obj) == qak.d(obj2)) {
                return true;
            }
            return false;
        } else if (qak.f(obj) == qak.f(obj2)) {
            return true;
        } else {
            return false;
        }
    }
}
