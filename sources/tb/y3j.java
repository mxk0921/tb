package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final y3j f31829a = new y3j();
    public static final fdb b = AVFSCacheManager.getInstance().cacheForModule(mba.BIZ_NAME).Z(y3j.class.getClassLoader()).L(new op()).w();

    public static y3j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y3j) ipChange.ipc$dispatch("1350c002", new Object[0]);
        }
        return f31829a;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d07523", new Object[]{str});
        }
        fdb fdbVar = b;
        return (String) fdbVar.d0(Login.getUserId() + "_" + str);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458dddfe", new Object[]{str, str2});
            return;
        }
        fdb fdbVar = b;
        fdbVar.N(Login.getUserId() + "_" + str, str2);
    }
}
