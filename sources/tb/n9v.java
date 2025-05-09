package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n9v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEW_CONTENT_GROUP = "mtb_switch";
    public static final String NEW_CONTENT_KEY = "mtb_new_content";
    public static final String TAG = n9v.class.getSimpleName();

    static {
        t2o.a(745538175);
    }

    public static void a(String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb21875", new Object[]{str, str2, bool});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences(str, 0).edit();
            if (bool == null) {
                edit.remove(str2);
            } else {
                edit.putBoolean(str2, bool.booleanValue());
            }
            edit.apply();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605447bd", new Object[0]);
        } else {
            TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE);
        }
    }
}
