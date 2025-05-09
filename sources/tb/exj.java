package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class exj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f514fa", new Object[]{this, new Boolean(z)});
        } else {
            TLog.loge("AliNewDetailExtend", "NewDetailDateManager", "notifyFirstDetailLoadState mGetFirstDetailListener is null!");
        }
    }
}
