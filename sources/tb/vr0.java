package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489056);
    }

    public static Intent a(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("793e9057", new Object[]{qg0Var});
        }
        if (qg0Var == null || TextUtils.isEmpty(qg0Var.g)) {
            return null;
        }
        Uri parse = Uri.parse(qg0Var.g);
        Intent intent = new Intent();
        intent.setData(parse);
        intent.setFlags(268435456);
        intent.setFlags(131072);
        if (!TextUtils.isEmpty(qg0.D)) {
            intent.setPackage(qg0.D);
        }
        return intent;
    }

    public static Intent b(Context context, qg0 qg0Var, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cc52ff12", new Object[]{context, qg0Var, intent});
        }
        Intent intent2 = new Intent();
        intent2.setAction("com.alibaba.intent.action.GETWAY");
        intent2.setData(Uri.parse("tbopen://linkpartner/entrance?fl_out_id=8617ab96f88d12c0"));
        if (qg0Var != null && !TextUtils.isEmpty(qg0.D)) {
            intent2.setPackage(qg0.D);
        }
        intent2.putExtra("pluginRules", "forward");
        intent2.putExtra("linkIntent", intent);
        intent2.putExtra("sourcePackageName", context.getPackageName());
        intent2.putExtra(rg0.SOURCE_VC, context.getClass().getName());
        return intent2;
    }

    public static void c(Context context, qg0 qg0Var) {
        Intent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66bf3e5", new Object[]{context, qg0Var});
        } else if (context != null && (a2 = a(qg0Var)) != null) {
            Intent b = b(context, qg0Var, a2);
            try {
                b.putExtra(hq9.VISA, hq9.XBS_VISA);
                jq9.q(context, b);
            } catch (Exception e) {
                vp9.b("linkx", "jumpBack 异常：" + e.getMessage());
            }
        }
    }
}
