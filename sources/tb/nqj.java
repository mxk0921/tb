package tb;

import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321940);
    }

    public static void a(Object obj, Intent intent) {
        Intent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80317703", new Object[]{obj, intent});
        } else if ((obj instanceof hlb) && (a2 = ((hlb) obj).a()) != null && intent != null) {
            Bundle extras = intent.getExtras();
            Bundle extras2 = a2.getExtras();
            if (extras != null) {
                txj.e(txj.TAG_TIP, "StartPutNavExtras.");
                extras.putAll(extras2);
                a2.putExtras(extras);
            }
        }
    }
}
