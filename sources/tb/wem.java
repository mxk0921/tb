package tb;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_POP = "com.alibaba.poplayer.PopLayer.action.POP";
    public static final String EXTRA_KEY_EVENT = "event";
    public static final String EXTRA_KEY_PARAM = "param";

    static {
        t2o.a(806356122);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba460b4", new Object[]{context});
        } else if (zga.h()) {
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", "poplayer://2020PushRecall");
            intent.putExtra("param", "poplayer://2020PushRecall");
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }
}
