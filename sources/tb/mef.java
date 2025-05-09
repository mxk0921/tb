package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class mef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Intent a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ed2682c0", new Object[]{context, str});
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setAction(str);
        return intent;
    }
}
