package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class flo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792836);
    }

    public static final String a(Intent intent) {
        String str;
        Bundle extras;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e7dc278", new Object[]{intent});
        }
        String str2 = null;
        if (intent == null || (data = intent.getData()) == null) {
            str = null;
        } else {
            str = data.getQueryParameter("channelSrp");
            if (TextUtils.isEmpty(str)) {
                str = data.getQueryParameter(xrl.G_CHANNELSRP);
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                str2 = extras.getString("channelSrp");
                if (TextUtils.isEmpty(str2)) {
                    str2 = extras.getString(xrl.G_CHANNELSRP);
                }
            }
            str = str2;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
