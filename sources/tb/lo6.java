package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.relation.DaifuApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06c101f", new Object[]{str, str2, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("targetId", str);
        bundle.putString("targetType", str2);
        bundle.putInt("bizType", i);
        bundle.putString("entityType", "U");
        Nav.from(DaifuApplication.getApplication()).withExtras(bundle).toUri("http://tb.cn/n/im/chat");
    }

    public static String b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1da6841", new Object[]{str, str2, new Integer(i)});
        }
        StringBuffer stringBuffer = new StringBuffer("0_U_");
        stringBuffer.append(str);
        stringBuffer.append("_");
        stringBuffer.append(str2);
        if (i > 0) {
            stringBuffer.append("_");
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }
}
