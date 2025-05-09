package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class li0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AgooRegister";
    public static final String groupName = "client_wswitch_12278902";

    static {
        t2o.a(775946346);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
            return;
        }
        String appKey = GetAppKeyFromSecurity.getAppKey(0);
        TaobaoRegister.setNotificationIcon(context, R.drawable.icon);
        TaobaoRegister.bindAgoo(context, appKey, TaoPackageInfo.getTTID(), null);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72121245", new Object[]{context});
            return;
        }
        UTAnalytics.getInstance().getTracker("accs").send(new UTOriginalCustomHitBuilder("AgooRegisterUnregister", 66001, UtilityImpl.getDeviceId(context), null, null, null).build());
        TaobaoRegister.unregister(context, null);
    }
}
