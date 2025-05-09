package tb;

import android.app.Application;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareEnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hjp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_GEN3_CODE = "gen3Code";
    public static final String TYPE_QR_CODE = "qrcode";
    public static final String UNUSED_CODE_TAG = "UNUSED_CODE_TAG";

    static {
        t2o.a(664797220);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return ShareEnv.getApplication();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        return GlobalAppRuntimeInfo.getUserId();
    }
}
