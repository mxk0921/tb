package tb;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.dto.BeaconRecord;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b62 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROAD_CAST_ACTION = "com.taobao.lbs.collection.BLUETOOTH_SCAN_RESULT";
    public static final String BROAD_CAST_IBEACON_KEY = "devices_list";
    public static final String UUID_FEATURE_KEY = "uuid";

    /* renamed from: a  reason: collision with root package name */
    public final BluetoothAdapter f16201a;
    public Handler b;
    public Looper c;
    public Runnable d;
    public final Lock e;
    public final Context f;
    public final Map<String, BeaconRecord.IBeacon> g;
    public final Set<String> h;
    public final boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BluetoothAdapter.LeScanCallback f16202a;

        /* compiled from: Taobao */
        /* renamed from: tb.b62$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0880a implements Comparator<BeaconRecord.IBeacon> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0880a(a aVar) {
            }

            /* renamed from: a */
            public int compare(BeaconRecord.IBeacon iBeacon, BeaconRecord.IBeacon iBeacon2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("db263825", new Object[]{this, iBeacon, iBeacon2})).intValue();
                }
                return Integer.valueOf(iBeacon2.getRssi()).compareTo(Integer.valueOf(iBeacon.getRssi()));
            }
        }

        public a(BluetoothAdapter.LeScanCallback leScanCallback) {
            this.f16202a = leScanCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b62.a(b62.this) != null && this.f16202a != null) {
                try {
                    if (ContextCompat.checkSelfPermission(Globals.getApplication(), "android.permission.BLUETOOTH_ADMIN") == 0) {
                        b62.a(b62.this).stopLeScan(this.f16202a);
                    }
                } catch (Throwable unused) {
                }
                b62.b(b62.this).lock();
                ArrayList arrayList = new ArrayList(b62.c(b62.this).values());
                try {
                    Collections.sort(arrayList, new C0880a(this));
                    b62.d(b62.this, b62.BROAD_CAST_ACTION, arrayList);
                } finally {
                    b62.b(b62.this).unlock();
                    if (b62.e(b62.this) != null) {
                        b62.e(b62.this).quit();
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f16203a;
        public final /* synthetic */ BluetoothAdapter.LeScanCallback b;

        public b(long j, BluetoothAdapter.LeScanCallback leScanCallback) {
            this.f16203a = j;
            this.b = leScanCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b62.f(b62.this, Looper.myLooper());
            if (b62.e(b62.this) == null) {
                Looper.prepare();
            }
            b62.f(b62.this, Looper.myLooper());
            b62.h(b62.this, new Handler());
            b62.g(b62.this).postDelayed(b62.i(b62.this), this.f16203a);
            try {
                if (ContextCompat.checkSelfPermission(Globals.getApplication(), "android.permission.BLUETOOTH_ADMIN") == 0) {
                    b62.a(b62.this).startLeScan(this.b);
                }
            } catch (Throwable unused) {
            }
            Looper.loop();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements BluetoothAdapter.LeScanCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(789577804);
        }

        public c() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d30d3c88", new Object[]{this, bluetoothDevice, new Integer(i), bArr});
                return;
            }
            BeaconRecord.IBeacon b = BeaconRecord.b(bluetoothDevice, i, bArr);
            if (b != null) {
                if (!b62.j(b62.this)) {
                    Map c = b62.c(b62.this);
                    c.put(b.proximityUuid + b.major + b.minor, b);
                } else if (b62.k(b62.this) != null && !b62.k(b62.this).isEmpty() && b62.k(b62.this).contains(b.proximityUuid)) {
                    Map c2 = b62.c(b62.this);
                    c2.put(b.proximityUuid + b.major + b.minor, b);
                }
            }
        }

        public /* synthetic */ c(b62 b62Var, a aVar) {
            this();
        }
    }

    static {
        t2o.a(789577800);
    }

    public b62(Context context, Set<String> set) {
        this.b = null;
        this.c = null;
        this.e = new ReentrantLock();
        this.g = new ConcurrentHashMap();
        this.h = null;
        this.i = true;
        if (m()) {
            this.f = context;
            this.h = set;
            this.f16201a = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        }
    }

    public static /* synthetic */ BluetoothAdapter a(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BluetoothAdapter) ipChange.ipc$dispatch("c3981ea8", new Object[]{b62Var});
        }
        return b62Var.f16201a;
    }

    public static /* synthetic */ Lock b(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lock) ipChange.ipc$dispatch("bf3f66e1", new Object[]{b62Var});
        }
        return b62Var.e;
    }

    public static /* synthetic */ Map c(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfbf2dae", new Object[]{b62Var});
        }
        return b62Var.g;
    }

    public static /* synthetic */ void d(b62 b62Var, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba9ca53", new Object[]{b62Var, str, list});
        } else {
            b62Var.o(str, list);
        }
    }

    public static /* synthetic */ Looper e(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("d808850c", new Object[]{b62Var});
        }
        return b62Var.c;
    }

    public static /* synthetic */ Looper f(b62 b62Var, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("45461b25", new Object[]{b62Var, looper});
        }
        b62Var.c = looper;
        return looper;
    }

    public static /* synthetic */ Handler g(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("85bcf0b0", new Object[]{b62Var});
        }
        return b62Var.b;
    }

    public static /* synthetic */ Handler h(b62 b62Var, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a9bbc482", new Object[]{b62Var, handler});
        }
        b62Var.b = handler;
        return handler;
    }

    public static /* synthetic */ Runnable i(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4e779abf", new Object[]{b62Var});
        }
        return b62Var.d;
    }

    public static /* synthetic */ boolean j(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5262b718", new Object[]{b62Var})).booleanValue();
        }
        return b62Var.i;
    }

    public static /* synthetic */ Set k(b62 b62Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3cdf2822", new Object[]{b62Var});
        }
        return b62Var.h;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
            return;
        }
        this.e.lock();
        try {
            this.g.clear();
        } finally {
            this.e.unlock();
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef5e970", new Object[]{this})).booleanValue();
        }
        if (!rg8.a()) {
            return false;
        }
        return rg8.b();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b19a02", new Object[]{this});
            return;
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
        }
    }

    public final void o(String str, List<BeaconRecord.IBeacon> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594a5cdb", new Object[]{this, str, list});
            return;
        }
        Intent intent = new Intent(str);
        intent.putExtra(BROAD_CAST_IBEACON_KEY, JSON.toJSONString(list));
        intent.setPackage(this.f.getPackageName());
        this.f.sendBroadcast(intent);
        mdh.a("lbs_sdk.coll_IBeaconHandle", "扫描到的Beacon: " + list);
    }

    public void p(long j) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fff5fb", new Object[]{this, new Long(j)});
        } else if (!m()) {
            mdh.d("lbs_sdk.coll_IBeaconHandle", "startScanWithTimeWindow isEnvCheck false");
        } else if (!this.i || ((set = this.h) != null && !set.isEmpty())) {
            c cVar = new c(this, null);
            n();
            l();
            this.d = new a(cVar);
            mdh.d("lbs_sdk.coll_IBeaconHandle", "[startScanWithTimeWindow] start scan");
            new Thread(new b(j, cVar), "BLE_SCAN_THREAD").start();
        } else {
            mdh.d("lbs_sdk.coll_IBeaconHandle", "startScanWithTimeWindow serviceUuids empty");
        }
    }

    public b62(Context context) {
        this.b = null;
        this.c = null;
        this.e = new ReentrantLock();
        this.g = new ConcurrentHashMap();
        this.h = null;
        this.i = true;
        if (m()) {
            this.f = context;
            this.f16201a = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
            this.i = false;
        }
    }
}
