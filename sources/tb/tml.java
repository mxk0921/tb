package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268036);
    }

    public static anl a(Context context, sll sllVar, String str, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("8509479b", new Object[]{context, sllVar, str, new Boolean(z), bundle});
        }
        zos zosVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (bps.v(parse)) {
                zosVar = new zos(context, sllVar, str, bundle);
            } else if (!ufs.s(parse) || !ufs.u(parse)) {
                zosVar = cr9.a(context, sllVar, str, z, bundle);
            } else {
                zosVar = new yml(context, sllVar, str, z, bundle);
            }
        } catch (Throwable unused) {
            tfs.e("PageFactory", "createPage error:" + str);
        }
        return zosVar;
    }
}
