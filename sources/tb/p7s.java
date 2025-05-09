package tb;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tmgdeliverybase.TMGDeliveryPurchaseActivity;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p7s implements zk9.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TMGDeliveryPurchaseActivity f25924a;

    public p7s(TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity) {
        this.f25924a = tMGDeliveryPurchaseActivity;
    }

    @Override // tb.zk9.i
    public void onClassLoaded(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            return;
        }
        FragmentTransaction beginTransaction = this.f25924a.getSupportFragmentManager().beginTransaction();
        TMGDeliveryPurchaseActivity tMGDeliveryPurchaseActivity = this.f25924a;
        TMGDeliveryPurchaseActivity.m3(tMGDeliveryPurchaseActivity, Fragment.instantiate(tMGDeliveryPurchaseActivity, "com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment", null));
        beginTransaction.replace(16908290, TMGDeliveryPurchaseActivity.l3(this.f25924a));
        beginTransaction.commit();
    }

    @Override // tb.zk9.i
    public void onClassNotFound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
        } else {
            AppMonitor.Alarm.commitFail("tmgdelivery", "install", "INSTALL_FAILED", "class not found");
        }
    }
}
