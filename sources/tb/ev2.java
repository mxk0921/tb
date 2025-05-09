package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ev2 extends vpi {
    static {
        t2o.a(612368412);
    }

    @Override // tb.csl
    public BaseMode a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return c(intent, i);
        }
        return null;
    }

    public BaseMode c(Intent intent, int i) {
        try {
            dv2 dv2Var = new dv2();
            dv2Var.d(Integer.parseInt(ty4.e(intent.getStringExtra("command"))));
            dv2Var.e(Integer.parseInt(ty4.e(intent.getStringExtra("code"))));
            dv2Var.setContent(ty4.e(intent.getStringExtra("content")));
            ty4.e(intent.getStringExtra("appKey"));
            ty4.e(intent.getStringExtra("appSecret"));
            dv2Var.setAppPackage(ty4.e(intent.getStringExtra("appPackage")));
            dgh.a("OnHandleIntent-message:" + dv2Var.toString());
            return dv2Var;
        } catch (Exception e) {
            dgh.a("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }
}
