package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class igh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        new HashMap();
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else {
            b(objArr);
        }
    }

    public static String b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac108fe1", new Object[]{objArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (objArr != null) {
            for (Object obj : objArr) {
                stringBuffer.append(obj);
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }
}
