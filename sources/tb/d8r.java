package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.downgrade")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class d8r extends ev {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTION_ORDER_LIST_NEED_REFRESH = "orderListNeedRefreshAction";

    static {
        t2o.a(725614623);
    }

    public static void M0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8a6fdd", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent("orderListNeedRefreshAction");
        intent.putExtra("reason", str);
        intent.putExtra("from", "Page_WaitpayDetail");
        context.sendBroadcast(intent);
    }

    public static /* synthetic */ Object ipc$super(d8r d8rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/downgrade/TBBuyErrorDowngradeExtension");
    }

    @Override // tb.ev
    public void K0(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a52c1a", new Object[]{this, new Boolean(z), str});
        } else {
            L0(str);
        }
    }

    public final void L0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb7c711", new Object[]{this, str});
        } else {
            M0(m0().f(), str);
        }
    }
}
