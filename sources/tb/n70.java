package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.utl.ALog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n70 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933226);
    }

    public static String a(Context context, String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20e122ad", new Object[]{context, str, new Integer(i), str2, str3});
        }
        if (context == null) {
            ALog.e("AccsSpUtil-", "getString context null", new Object[0]);
            return str3;
        }
        try {
            return APreferencesManager.getSharedPreferences(context, str, i).getString(str2, str3);
        } catch (Throwable th) {
            ALog.e("AccsSpUtil-", "getString err:", th, new Object[0]);
            return str3;
        }
    }
}
