package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378913);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{str});
        }
        return Globals.getApplication().getSharedPreferences("taolive", 0).getString(str, "");
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{str});
            return;
        }
        SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("taolive", 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306d747d", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("taolive", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
