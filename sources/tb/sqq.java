package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sqq extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004991);
    }

    public static /* synthetic */ Object ipc$super(sqq sqqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/StringSubstr");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        String str = null;
        if (list == null) {
            return null;
        }
        if (list.size() == 3) {
            Object obj = list.get(0);
            int e = qak.e(list.get(1));
            int e2 = qak.e(list.get(2));
            String valueOf = String.valueOf(obj);
            if (e2 < 0 || e + 1 > valueOf.length()) {
                return "";
            }
            if (e >= 0) {
                i = e;
            }
            int i2 = e2 + i;
            if (i2 > obj.toString().length()) {
                str = valueOf.substring(i);
            }
            if (i2 - 1 < obj.toString().length()) {
                return ((String) obj).substring(i, i2);
            }
            return str;
        } else if (list.size() != 2) {
            return null;
        } else {
            Object obj2 = list.get(0);
            int e3 = qak.e(list.get(1));
            String valueOf2 = String.valueOf(obj2);
            if (1 + e3 > valueOf2.length()) {
                return "";
            }
            if (e3 >= 0) {
                i = e3;
            }
            return valueOf2.substring(i);
        }
    }
}
