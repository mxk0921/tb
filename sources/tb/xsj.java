package tb;

import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashSet;
import java.util.Iterator;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xsj implements NetworkQualityMonitor.IGlobalNetworkQualityListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static xsj d;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<vzc> f31581a = null;
    public volatile boolean b = false;
    public final feh c = new feh("NetWorkStateReceive", "Global");

    static {
        t2o.a(774897958);
        t2o.a(607126095);
    }

    public static synchronized xsj a() {
        synchronized (xsj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xsj) ipChange.ipc$dispatch("1ba837e5", new Object[0]);
            }
            if (d == null) {
                d = new xsj();
            }
            if (!d.b) {
                d.b();
            }
            return d;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4248192", new Object[]{this});
            return;
        }
        try {
            this.b = NetworkQualityMonitor.getInstance().registerGlobalNetworkQualityListener(this);
            feh fehVar = this.c;
            AVSDKLog.e(fehVar, "NetWorkStateReceive registerGlobalNetworkQualityListener success=" + this.b);
        } catch (Throwable th) {
            feh fehVar2 = this.c;
            AVSDKLog.e(fehVar2, "NetWorkStateReceive registerGlobalNetworkQualityListener error:" + th.getMessage());
        }
    }

    public void c(vzc vzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad8ea21", new Object[]{this, vzcVar});
            return;
        }
        synchronized (xsj.class) {
            try {
                if (this.f31581a == null) {
                    this.f31581a = new HashSet<>();
                }
                if (vzcVar != null) {
                    this.f31581a.add(vzcVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7a274b", new Object[]{this});
            return;
        }
        try {
            NetworkQualityMonitor.getInstance().unregisterGlobalNetworkQualityListener(this);
            AVSDKLog.e(this.c, "NetWorkStateReceive try to unRegisterGlobalNetworkQualityListener");
            this.b = false;
        } catch (Throwable th) {
            feh fehVar = this.c;
            AVSDKLog.e(fehVar, "NetWorkStateReceive unregisterGlobalNetworkQualityListener error:" + th.getMessage());
        }
    }

    public void e(vzc vzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65236a3a", new Object[]{this, vzcVar});
            return;
        }
        synchronized (xsj.class) {
            try {
                HashSet<vzc> hashSet = this.f31581a;
                if (hashSet != null && hashSet.contains(vzcVar)) {
                    this.f31581a.remove(vzcVar);
                }
                if (this.f31581a.size() == 0) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // anetwork.channel.monitor.NetworkQualityMonitor.IGlobalNetworkQualityListener
    public void onNetworkQualityChanged(int i, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d676f46", new Object[]{this, new Integer(i), new Double(d2)});
            return;
        }
        synchronized (xsj.class) {
            try {
                HashSet<vzc> hashSet = this.f31581a;
                if (hashSet != null) {
                    Iterator<vzc> it = hashSet.iterator();
                    while (it.hasNext()) {
                        vzc next = it.next();
                        if (next != null && (next instanceof TaobaoMediaPlayer)) {
                            ((TaobaoMediaPlayer) next).onNetworkStateUpdate(i, d2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
