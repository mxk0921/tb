package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.internal.PayRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class af3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15706a;
        public final /* synthetic */ PayRequest b;

        public a(Context context, PayRequest payRequest) {
            this.f15706a = context;
            this.b = payRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                af3.c(this.f15706a, this.b.getOrderIds(), this.b.getSuccessUrl());
            }
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2495e226", new Object[]{str});
        }
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("tradeHybridStartTime", String.valueOf(System.currentTimeMillis())).build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void b(Context context, PayRequest payRequest) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cdd619c", new Object[]{context, payRequest});
            return;
        }
        if (TextUtils.equals(payRequest.getFrom(), ds8.UT_PAGE_NAME)) {
            z = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequestInConfirmOrder", true);
        } else {
            z = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequestInOther", false);
        }
        if (payRequest.isCallWXSDK()) {
            z2 = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequestByWxPay", true);
        } else {
            z2 = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ALI_PAY, "enablePaySuccessPreRequestByOthers", false);
        }
        if (!z || !z2) {
            hav.d("CashDeskHybridUtil", "switcher is off");
            return;
        }
        boolean i = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ALI_PAY, "enablePreRequestSwitchThread", false);
        if (pav.b()) {
            c(context, payRequest.getOrderIds(), payRequest.getSuccessUrl());
        } else if (i) {
            hav.d("CashDeskHybridUtil", "not in main thread, switch thread");
            pav.i(new a(context, payRequest), 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.af3.c(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
