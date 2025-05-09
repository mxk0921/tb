package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.stat.IMtopMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gau implements IMtopMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544433);
        t2o.a(589299983);
    }

    @Override // mtopsdk.mtop.stat.IMtopMonitor
    public void onCommit(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6701704c", new Object[]{this, str, hashMap});
            return;
        }
        ogh.e("TrackMtopMonitor", "接收到MTOP响应信息, type=" + str + ", data=" + hashMap);
        try {
            if (TextUtils.equals(IMtopMonitor.MtopMonitorType.TYPE_RESPONSE, str) && hashMap != null) {
                String str2 = hashMap.get(HttpHeaderConstant.X_AB);
                if (!TextUtils.isEmpty(str2)) {
                    UTABTest.activateServer(str2);
                } else {
                    String str3 = hashMap.get("mtop-x-ali-ab");
                    if (!TextUtils.isEmpty(str3)) {
                        UTABTest.activateServer(str3);
                    }
                }
            }
        } catch (Throwable th) {
            ku0.j("TrackMtopMonitor.onCommit", th);
        }
    }
}
