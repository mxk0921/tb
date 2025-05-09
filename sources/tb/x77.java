package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x77 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(467664985);
    }

    public static Intent a(qg0 qg0Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("793e9057", new Object[]{qg0Var});
        }
        String str2 = "";
        if (qg0Var == null) {
            str = str2;
        } else {
            str = qg0Var.g;
        }
        if (qg0Var != null) {
            str2 = qg0.D;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent();
        intent.setData(parse);
        intent.setFlags(268435456);
        intent.setFlags(131072);
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        return intent;
    }

    public static void b(Context context, qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66bf3e5", new Object[]{context, qg0Var});
            return;
        }
        Intent a2 = a(qg0Var);
        if (a2 != null && context != null) {
            try {
                if (!(context instanceof Activity)) {
                    a2.addFlags(268435456);
                }
                a2.putExtra(hq9.VISA, hq9.XBS_VISA);
                context.startActivity(a2);
            } catch (Throwable th) {
                vp9.b("linkx", "TipsBack === jumpBack  异常：" + th.toString());
            }
        }
    }
}
