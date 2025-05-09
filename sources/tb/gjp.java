package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareEnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gjp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_ACTION_CLOSE_SHARE_MENU = "share_receiver_close_share_menu";

    static {
        t2o.a(666894388);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return ShareEnv.getApplication();
    }
}
