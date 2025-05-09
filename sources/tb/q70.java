package tb;

import android.content.Context;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q70 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f26558a;
    public static final Object b = new Object();

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaaa6005", new Object[]{context});
            return;
        }
        synchronized (b) {
            try {
                if (!f26558a) {
                    f26558a = true;
                    try {
                        ACCSClient.init(context, new AccsClientConfig.Builder().setAppKey("21646297").setTag("default").build());
                        ACCSClient.getAccsClient();
                    } catch (AccsException e) {
                        UnifyLog.d("AccsUtils", e.getMessage(), new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
