package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.HostController;
import java.io.File;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eye extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "taobao_speed";
    private static final String f = "com.taobao.tao.welcome.Welcome";
    private static final String g = "ab_watcher_indices_evo_switches";

    public eye(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(eye eyeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitClearSpeedFlag");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private boolean q(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49d9a1f4", new Object[]{this, application})).booleanValue();
        }
        File filesDir = application.getFilesDir();
        new File(filesDir, File.separator + ".bootimageready").delete();
        return application.getSharedPreferences("android_bootimage_coldstart", 0).edit().putLong("tm", System.currentTimeMillis()).commit();
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        application.getSharedPreferences(e, 0).edit().clear().commit();
        application.getSharedPreferences(g, 0).edit().clear().commit();
        application.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().remove(HostController.KEY_APP_VIEW_MODE).commit();
        q(application);
    }
}
