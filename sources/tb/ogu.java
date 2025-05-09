package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ogu extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596333);
    }

    public static /* synthetic */ Object ipc$super(ogu oguVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/expressionv2/ExepressionEvaluation/Trim");
    }

    @Override // tb.av, tb.im7
    public Object a(List list, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ab0b6f88", new Object[]{this, list, bn7Var});
        }
        ym7.h("TrimEvaluation");
        if (list == null || list.size() != 1) {
            return null;
        }
        try {
            String valueOf = String.valueOf(list.get(0));
            if (valueOf.length() != 0) {
                return valueOf.trim();
            }
            return null;
        } catch (ClassCastException unused) {
            ym7.h("String cast error!");
            return null;
        }
    }
}
