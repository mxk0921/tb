package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rvl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_ACTION = "TBCashierStageBroadcast";

    public static void a(Context context, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4a21f8", new Object[]{context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setAction("TBBootImageForbiddenModeBroadcast");
        if (z) {
            str = "stopForbidden";
        } else {
            str = "startForbidden";
        }
        intent.putExtra(v4s.PARAM_UPLOAD_STAGE, str);
        intent.putExtra("timeout", "3600");
        intent.putExtra("bizId", "TBBuy");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void b(Context context, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ed32a0", new Object[]{context, str, str2, str3, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ALIPAY_ACTION);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("from", "tbPay");
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("result", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("scene", str2);
        }
        intent.putExtra("isResultSuccess", z);
        intent.putExtra(v4s.PARAM_UPLOAD_STAGE, str);
        intent.putExtra("blockSplashADDuration", "3600");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void c(Context context, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ef07f7", new Object[]{context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        if (z) {
            str = "com.alipay.android.app.pay.ACTION_PAY_SUCCESS";
        } else {
            str = "com.alipay.android.app.pay.ACTION_PAY_FAILED";
        }
        intent.setAction(str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a21db0", new Object[]{str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("action", (Object) str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("result", (Object) str2);
        }
        new kmi().c("tbPay", CashdeskConstants.TB_CASH_DESK_BROADCAST_RESULT_ACTION, jSONObject);
    }

    public static void e(Context context, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91908c3", new Object[]{context, str, str2, str3, new Boolean(z)});
            return;
        }
        d(str, str3);
        b(context, "afterPayment", str2, str3, z);
        a(context, true);
    }

    public static void f(Context context, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627c92a8", new Object[]{context, str, str2, str3, new Boolean(z)});
            return;
        }
        e(context, str, str2, str3, z);
        c(context, z);
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a057ae2", new Object[]{context});
            return;
        }
        b(context, "beforePayment", null, null, false);
        a(context, false);
    }
}
