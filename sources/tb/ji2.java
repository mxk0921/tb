package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ji2 extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "com.taobao.allspark";
    private static final String f = "TAOBAO_DELAY_START_ALLSPARK";

    public ji2(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(ji2 ji2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/BoradcastAllSpark");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("launch_config", "all_spark_mode", "1");
        if ("1".equals(config)) {
            a.a(e, null);
        } else if ("2".equals(config)) {
            application.sendBroadcast(mef.a(application, f));
        }
    }
}
