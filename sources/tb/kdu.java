package tb;

import android.app.Activity;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kdu implements NetworkStatusHelper.INetworkStatusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ idu f22600a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((idu.a(kdu.this.f22600a) instanceof Activity) && !((Activity) idu.a(kdu.this.f22600a)).isDestroyed()) {
                idu iduVar = kdu.this.f22600a;
                idu.g(iduVar, idu.a(iduVar));
            }
        }
    }

    public kdu(idu iduVar) {
        this.f22600a = iduVar;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            return;
        }
        o3s.b("TrafficCardManager", "onNetworkStatusChanged:" + networkStatus);
        if ((idu.e(this.f22600a) == NetworkStatusHelper.NetworkStatus.NO || idu.e(this.f22600a) == NetworkStatusHelper.NetworkStatus.WIFI) && (networkStatus == NetworkStatusHelper.NetworkStatus.G3 || networkStatus == NetworkStatusHelper.NetworkStatus.G4 || networkStatus == NetworkStatusHelper.NetworkStatus.G5)) {
            idu.h().postDelayed(new a(), 1000L);
        }
        idu.f(this.f22600a, networkStatus);
    }
}
