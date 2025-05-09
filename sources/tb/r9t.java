package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r9t implements rzc, NetworkStatusHelper.INetworkStatusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArraySet<Runnable> f27215a = new CopyOnWriteArraySet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = r9t.a(r9t.this).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public r9t() {
        new AtomicBoolean(false);
    }

    public static /* synthetic */ CopyOnWriteArraySet a(r9t r9tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("e9c2d2e9", new Object[]{r9tVar});
        }
        return r9tVar.f27215a;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
        } else if (networkStatus.ordinal() < NetworkStatusHelper.NetworkStatus.G3.ordinal()) {
            RSoLog.d("onNetworkStatusChanged < G3, useless skip ");
        } else {
            RSoLog.d("onNetworkStatusChanged to " + networkStatus.name());
            rbn.i("TaobaoNetAvailableWatcher", new a());
        }
    }
}
