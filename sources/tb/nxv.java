package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Image;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902807);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("969d5d97", new Object[0])).booleanValue();
        }
        if (b() || Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2398b670", new Object[0])).booleanValue();
        }
        String str = Build.VERSION.CODENAME;
        if (str.length() != 1 || str.charAt(0) < 'Q' || str.charAt(0) > 'Z') {
            return false;
        }
        return true;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe43ec2", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action.cancel");
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public static void d(Context context, List<Image> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c6db32", new Object[]{context, list});
            return;
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("IMAGE_RESULT", (ArrayList) list);
        intent.setAction("action.complete");
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public static void e(Context context, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f1990", new Object[]{context, new Integer(i), new Integer(i2), str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.taobao.interact.publish.action.error");
        intent.putExtra("errorMsg", str);
        intent.putExtra("subCode", i2);
        intent.putExtra("errorCode", String.valueOf(i));
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }
}
