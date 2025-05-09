package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bus {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENABLE_BACKGROUND_PLAY = "enableBackgroundPlay";

    static {
        t2o.a(806356497);
    }

    public static boolean a() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cceca7f0", new Object[0])).booleanValue();
        }
        if (v2s.o().f() == null || v2s.o().f().getApplication() == null || (sharedPreferences = v2s.o().f().getApplication().getSharedPreferences("taolive", 0)) == null) {
            return false;
        }
        return sharedPreferences.getBoolean(KEY_ENABLE_BACKGROUND_PLAY, qvs.h());
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cdcb2ea", new Object[0])).booleanValue();
        }
        if (v2s.o().I("closeBgVideoPlay") || !qvs.o()) {
            return false;
        }
        return true;
    }
}
