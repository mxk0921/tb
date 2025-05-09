package tb;

import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(734003249);
    }

    public static void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2794f000", new Object[]{bundle});
            return;
        }
        b("try to clear fragments");
        if (bundle != null) {
            String string = bundle.getString("taobao:state:source", "unknown");
            b("saved state is from " + string + ", now clear all");
            bundle.clear();
        }
        b("clear finished");
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3579868e", new Object[]{str});
            return;
        }
        d(str);
        c(str);
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{str});
        } else {
            Log.e("TFragmentState", str);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573ed506", new Object[]{str});
        } else {
            TLog.loge("Welcome", "TFragmentState", str);
        }
    }
}
