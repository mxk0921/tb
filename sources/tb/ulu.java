package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ulu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILE_STATIC_CONFIG = "trtc_static_config";
    public static final String FILE_STATIC_CONFIG_DIR = "/shared_prefs/";

    static {
        t2o.a(395313643);
    }

    public static void a(Context context, String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db371b6", new Object[]{context, str, str2});
            return;
        }
        File file = new File(context.getApplicationInfo().dataDir + "/shared_prefs/trtc_static_config.xml");
        if (!file.exists()) {
            TrtcLog.j("TrtcLocalConfig", "trtc config file path is not exist: " + file.getPath());
            file.createNewFile();
        }
        if (file.exists()) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(FILE_STATIC_CONFIG, 0).edit();
                edit.putString(str, str2);
                edit.apply();
                TrtcLog.j("TrtcLocalConfig", "onWriteLocalConfig, key: " + str + " , value: " + str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
