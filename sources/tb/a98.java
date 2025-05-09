package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a98 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EdlpCheckUtil";

    static {
        t2o.a(1032847445);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3508b0b8", new Object[0])).booleanValue();
        }
        boolean b = ((scc) n78.a(scc.class)).b("newBarVersion_newUser");
        TLog.loge(TAG, "isEdlp is" + b);
        return b;
    }
}
