package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a0k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOUBLE_11_CATEGORY_ID = "20151111";
    public static final String DOUBLE_12_CATEGORY_ID = "20151212";

    static {
        t2o.a(707788897);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f0ad042", new Object[]{context})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.utils.NewFavoriteUtils", "public static boolean checkActivityDestroy(Context context)", "20180112");
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return activity.isFinishing() || activity.isDestroyed();
    }
}
