package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ii3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199436);
    }

    public ii3() {
        b();
    }

    public static /* synthetic */ Object ipc$super(ii3 ii3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/ChangeQuantitySubscriber");
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ae8e315", new Object[]{this})).booleanValue();
        }
        return NetworkStatusHelper.isConnected();
    }

    public final void q() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6195afc9", new Object[]{this});
            return;
        }
        if (CheckHoldManager.i().e() == 0) {
            str = this.b.getString(R.string.cart_promotion_calculate_totalTitle_heji);
        } else {
            str = this.b.getString(R.string.cart_promotion_calculate_totalTitle_youhuiqian);
        }
        cb4.d(this.d, this.b.getString(R.string.cart_promotion_calculate), str);
        cb4.W(this.d, this.j);
        this.j.e().E(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    @Override // tb.l12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(tb.lcu r18) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ii3.j(tb.lcu):void");
    }
}
