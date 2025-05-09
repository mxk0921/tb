package tb;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.gms.tasks.OnCompleteListener;
import com.taobao.tao.log.TLog;
import com.taobao.tmgcashier.googlepay.TMGGooglePayUtils;
import com.taobao.tmgcashier.jsbridge.TMGCashierJSBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements OnCompleteListener<Boolean> {
        public a(b bVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
    }

    static {
        t2o.a(860880915);
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90a487d0", new Object[]{context});
        }
        try {
            Resources resources = context.getResources();
            return resources.getString(resources.getIdentifier("ttid", "string", context.getPackageName()));
        } catch (Throwable th) {
            TLog.logd("tmgcashier", "ttid", th.getMessage());
            return "";
        }
    }

    public static void a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95346f6", new Object[]{context, bVar});
            return;
        }
        try {
            TMGGooglePayUtils.getIsReadyToPayRequest(context, new a(bVar));
        } catch (Throwable th) {
            Log.e("TMGCashierGPUtils", "getIsReadyToPayRequest error:" + th.getMessage());
            ((TMGCashierJSBridge.a) bVar).a(false);
            TLog.loge("tmgcashier", "TMGGooglePayUtils", "getIsReadyToPayRequest error :" + th.getMessage());
        }
    }
}
