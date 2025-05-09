package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fh8 extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699205);
    }

    public static /* synthetic */ Object ipc$super(fh8 fh8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/express/Equal");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
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
        return Boolean.valueOf(e(obj, obj2));
    }

    public boolean e(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d190c51", new Object[]{this, obj, obj2})).booleanValue();
        }
        if ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) {
            if (rak.c(obj).compareTo(rak.c(obj2)) == 0) {
                return true;
            }
            return false;
        } else if (rak.a(obj) || rak.a(obj2)) {
            if (rak.d(obj) == rak.d(obj2)) {
                return true;
            }
            return false;
        } else if (rak.f(obj) == rak.f(obj2)) {
            return true;
        } else {
            return false;
        }
    }
}
