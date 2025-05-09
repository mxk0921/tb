package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991510);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88f44379", new Object[]{str});
        }
        mvr.c("getProcessedWeexUrl-- original url is " + str);
        HashMap hashMap = new HashMap();
        if (b()) {
            hashMap.put("_wx_shop_render_activity", Boolean.toString(true));
        }
        if (!jvr.p().z()) {
            hashMap.put("_parallel_render", Boolean.toString(false));
        }
        if (!jvr.p().x()) {
            hashMap.put("_enable_local_js", Boolean.toString(false));
        }
        String a2 = rvr.a(str, hashMap);
        mvr.c("getProcessedWeexUrl-- processed url is " + a2);
        return a2;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14623cf6", new Object[0])).booleanValue();
        }
        List<String> u = jvr.p().u();
        if (u != null && !u.isEmpty()) {
            String nick = Login.getNick();
            if (!TextUtils.isEmpty(nick) && u.contains(nick)) {
                return true;
            }
        }
        if (jvr.p().A()) {
            return true;
        }
        return false;
    }
}
