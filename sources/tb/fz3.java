package tb;

import android.content.IntentFilter;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.b;
import com.taobao.collection.common.c;
import com.taobao.collection.impl.BeaconCollection;
import com.taobao.collection.impl.WIFICollection;
import com.taobao.collection.manager.StateReceiver;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fz3 implements y0d, aob {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static fz3 d;

    /* renamed from: a  reason: collision with root package name */
    public int f19642a = 1;
    public final Map<Integer, pkc> b = new HashMap();
    public final Map<SwitchOption.CollectionType, znb> c;

    static {
        t2o.a(789577798);
        t2o.a(789577781);
        t2o.a(789577795);
    }

    public fz3() {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        WIFICollection wIFICollection = new WIFICollection(this);
        BeaconCollection beaconCollection = new BeaconCollection(this);
        hashMap.put(SwitchOption.CollectionType.WIFI, wIFICollection);
        hashMap.put(SwitchOption.CollectionType.BEACON, beaconCollection);
        StateReceiver stateReceiver = new StateReceiver(wIFICollection, beaconCollection);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        Globals.getApplication().registerReceiver(stateReceiver, intentFilter);
    }

    public static synchronized fz3 d() {
        synchronized (fz3.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fz3) ipChange.ipc$dispatch("20913e70", new Object[0]);
            }
            AppMonitor.Counter.commit("passivelocation", "CollectionManagerImpl", 1.0d);
            if (d == null) {
                d = new fz3();
            }
            return d;
        }
    }

    @Override // tb.aob
    public synchronized int a(pkc pkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e2b4d4", new Object[]{this, pkcVar})).intValue();
        }
        int i = this.f19642a;
        this.f19642a = 1 + i;
        ((HashMap) this.b).put(Integer.valueOf(i), pkcVar);
        return i;
    }

    @Override // tb.aob
    public synchronized void b(int i, SwitchOption.CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf79b", new Object[]{this, new Integer(i), collectionType});
            return;
        }
        ((HashMap) this.b).remove(Integer.valueOf(i));
        if (collectionType != null) {
            ((znb) ((HashMap) this.c).get(collectionType)).remove(i);
        }
    }

    public c c(SwitchOption.CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("52a96e1e", new Object[]{this, collectionType});
        }
        if (((HashMap) this.c).containsKey(collectionType)) {
            return ((znb) ((HashMap) this.c).get(collectionType)).collect();
        }
        mdh.b("lbs_sdk.coll_CollectionManagerImpl", "Collection = " + collectionType.name() + " unavailable!");
        return null;
    }

    public Map<Integer, pkc> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59942a26", new Object[]{this});
        }
        return this.b;
    }

    public synchronized boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862306b", new Object[]{this, new Integer(i)})).booleanValue();
        } else if (((pkc) ((HashMap) this.b).get(Integer.valueOf(i))) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924a206b", new Object[]{this, cVar});
            return;
        }
        try {
            int moduleToken = cVar.a().getModuleToken();
            if (((HashMap) this.b).containsKey(Integer.valueOf(moduleToken))) {
                ((pkc) ((HashMap) this.b).get(Integer.valueOf(moduleToken))).a(cVar);
            }
        } catch (Exception e) {
            mdh.c("lbs_sdk.coll_CollectionManagerImpl", "call back error!", e);
        }
    }

    @Override // tb.aob
    public void modifiy(Code code, SwitchOption switchOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7548037a", new Object[]{this, code, switchOption});
            return;
        }
        mdh.d("lbs_sdk.coll_CollectionManagerImpl", "modifiy begin " + b.a(code, switchOption));
        if (((HashMap) this.c).containsKey(switchOption.getType())) {
            ((znb) ((HashMap) this.c).get(switchOption.getType())).modifiy(code, switchOption);
        }
    }
}
