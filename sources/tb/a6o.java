package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a6o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FAST_TIME = 1000;

    static {
        t2o.a(468714317);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35bab659", new Object[]{str})).booleanValue();
        }
        if ("ANDROID_SYS_NETWORK_ERROR".equals(str) || ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
            return true;
        }
        return false;
    }

    public static String a(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e42ba59", new Object[]{new Integer(i)});
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 1) {
                    switch (i) {
                        case -1003:
                        case -1002:
                        case -1001:
                        case -1000:
                            break;
                        default:
                            str = "该内容不符合互联网安全规范";
                            break;
                    }
                }
            } else {
                str = "此内容已被删除";
            }
            ir9.a("RequestUtils", "getErrorMessage status=" + i + " ;message=" + str);
            return str;
        }
        str = "由于作者设置，原分享内容暂时没有权限查看哦";
        ir9.a("RequestUtils", "getErrorMessage status=" + i + " ;message=" + str);
        return str;
    }
}
