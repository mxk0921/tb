package tb;

import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708643);
    }

    public static void a(AppCompatActivity appCompatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf82632", new Object[]{appCompatActivity});
            return;
        }
        try {
            appCompatActivity.getSupportActionBar().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
