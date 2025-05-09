package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vln {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HISTORY_KEY_CHANGE = 2;

    /* renamed from: a  reason: collision with root package name */
    public static final String f30089a = "historyKeyChange";

    static {
        t2o.a(713031876);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1304136", new Object[]{context});
        } else if (context != null) {
            Intent intent = new Intent();
            intent.setAction(nl2.ORDER_ACTION);
            intent.putExtra(f30089a, true);
            context.sendBroadcast(intent);
        }
    }
}
