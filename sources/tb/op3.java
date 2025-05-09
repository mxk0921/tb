package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.good.GoodProxy;
import java.net.URI;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class op3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";
    public static final Handler d = new Handler(Looper.getMainLooper());

    static {
        t2o.a(295698568);
    }

    public static String f(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af866e8c", new Object[]{ux9Var});
        }
        if (!(ux9Var == null || !(ux9Var.k() instanceof yac) || GoodProxy.getInstance().getGLConfig(ux9Var, "bigCardChatViewStyle") == null)) {
            Object gLConfig = GoodProxy.getInstance().getGLConfig(ux9Var, "bigCardChatViewStyle");
            if (gLConfig instanceof String) {
                return (String) gLConfig;
            }
        }
        return null;
    }

    public static HashMap<String, String> k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("639465fd", new Object[]{str});
        }
        String query = URI.create(str).getQuery();
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : query.split("&")) {
            String[] split = str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    public static void r(Runnable runnable) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{runnable});
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else if (runnable != null && (handler = d) != null) {
            handler.post(runnable);
        }
    }
}
