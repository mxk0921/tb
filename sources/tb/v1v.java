package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.stat.IMtopMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v1v implements IMtopMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTOP_HEAD = "mtop-x-ut-config";

    static {
        t2o.a(962593332);
        t2o.a(589299983);
    }

    @Override // mtopsdk.mtop.stat.IMtopMonitor
    public void onCommit(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6701704c", new Object[]{this, str, hashMap});
            return;
        }
        try {
            if (TextUtils.equals(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, str) && hashMap != null) {
                String str2 = hashMap.get(MTOP_HEAD);
                if (!TextUtils.isEmpty(str2)) {
                    u1v.activateMtopConfig(str2);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
