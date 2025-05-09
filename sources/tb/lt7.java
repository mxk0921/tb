package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lt7 extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596314);
    }

    public static /* synthetic */ Object ipc$super(lt7 lt7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/DoubleLess");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        ym7.h("DoubleLess");
        if (list != null && list.size() == 2) {
            try {
                if (Double.parseDouble(list.get(1).toString()) - Double.parseDouble(list.get(0).toString()) >= 1.0E-9d) {
                    return Boolean.TRUE;
                }
            } catch (NumberFormatException unused) {
                ym7.h("double cast error!");
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}
