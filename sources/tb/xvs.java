package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092877);
    }

    public static jyd a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyd) ipChange.ipc$dispatch("934220a2", new Object[]{activity, intent});
        }
        if (iw0.j(activity)) {
            x0u.a(activity, "公域使用开放直播间");
        }
        return new i6t(activity, intent);
    }

    public static jyd b(Activity activity, String str, y3s y3sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyd) ipChange.ipc$dispatch("ab6ae32b", new Object[]{activity, str, y3sVar});
        }
        if (iw0.j(activity)) {
            x0u.a(activity, "公域使用开放直播间");
        }
        return new i6t(activity, str, y3sVar);
    }
}
