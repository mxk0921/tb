package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class coj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_REDIRECT_SOURCE_URI = "redirect_source_uri";

    static {
        t2o.a(578814051);
    }

    public static boolean b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c8d06c0", new Object[]{context, intent})).booleanValue();
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_REDIRECT_SOURCE_URI, intent.getDataString());
        return Nav.from(context).withExtras(bundle).toUri("taobao://root/main/tab/unknown");
    }

    public static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fdfcbfb", new Object[]{intent})).booleanValue();
        }
        String dataString = intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return false;
        }
        return dataString.startsWith("taobao://root/main/tab/unknown");
    }
}
