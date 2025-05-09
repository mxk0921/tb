package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qmg extends zu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004985);
    }

    public static /* synthetic */ Object ipc$super(qmg qmgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/dinamic/expressionv2/ExepressionEvaluation/Length");
    }

    @Override // tb.h5a
    public Object a(List list, g5a g5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2dffdab0", new Object[]{this, list, g5aVar});
        }
        s3a.a("LengthEvaluation");
        if (list == null || list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        try {
            if (obj instanceof String) {
                return String.valueOf(((String) obj).length());
            }
            if (obj instanceof Object[]) {
                return String.valueOf(((Object[]) obj).length);
            }
            if (obj instanceof Map) {
                return String.valueOf(((Map) obj).size());
            }
            if (obj instanceof List) {
                return String.valueOf(((List) obj).size());
            }
            return null;
        } catch (ClassCastException unused) {
            s3a.a("String cast error!");
            return null;
        }
    }
}
