package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mse extends qa2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593247);
    }

    public static /* synthetic */ Object ipc$super(mse mseVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/expression/InOperator");
    }

    @Override // tb.qa2
    public boolean apply(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == null || !(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        if (!(obj2 instanceof List)) {
            return false;
        }
        try {
            List<String> list = (List) obj2;
            if (list != null && list.size() >= 1) {
                for (String str2 : list) {
                    if (!str2.startsWith(f7l.MOD) || !str2.endsWith(f7l.MOD)) {
                        if (str2.startsWith(f7l.MOD)) {
                            if (str.endsWith(str2.substring(1))) {
                                return true;
                            }
                        } else if (str2.endsWith(f7l.MOD)) {
                            if (str.startsWith(str2.substring(0, str2.length() - 1))) {
                                return true;
                            }
                        } else if (str.equals(str2)) {
                            return true;
                        }
                    } else if (str.contains(str2.substring(1, str2.length() - 1))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            nhh.h("InOperator", e, new Object[0]);
            return false;
        }
    }

    @Override // tb.qa2
    public String getOperatorSymbol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return "in";
    }
}
