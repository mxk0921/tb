package com.uploader.implement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a4y;
import tb.bux;
import tb.cwx;
import tb.f8y;
import tb.h9y;
import tb.hzx;
import tb.kk2;
import tb.lzd;
import tb.mxx;
import tb.mzd;
import tb.o7y;
import tb.oxx;
import tb.rtx;
import tb.w6e;
import tb.x6e;
import tb.xrx;
import tb.ytx;
import tb.z6e;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UploaderManager implements x6e, a4y {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicInteger t = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private int f14544a;
    private ArrayList<h9y> b;
    private ArrayList<h9y> c;
    private ArrayList<Pair<Integer, String>> d;
    private SparseArray<ArrayList<Pair<h9y, oxx>>> e;
    private ArrayList<Pair<h9y, oxx>> f;
    private mxx g;
    private BroadcastReceiver h;
    private volatile Handler i;
    private volatile boolean j;
    private Runnable k;
    private boolean l;
    private String m;
    private final int n;
    private com.uploader.implement.a o;
    private final byte[] p;
    private final int q;
    private xrx r;
    private o7y s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final UploaderManager f14545a;
        public final int b;
        public final Object[] c;

        public a(int i, UploaderManager uploaderManager, Object... objArr) {
            this.b = i;
            this.f14545a = uploaderManager;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            switch (this.b) {
                case 1:
                    UploaderManager uploaderManager = this.f14545a;
                    Object[] objArr = this.c;
                    uploaderManager.a((z6e) objArr[0], (mzd) objArr[1], (Handler) objArr[2], ((Boolean) objArr[3]).booleanValue());
                    return;
                case 2:
                    UploaderManager uploaderManager2 = this.f14545a;
                    Object[] objArr2 = this.c;
                    uploaderManager2.a((z6e) objArr2[0], ((Integer) objArr2[1]).intValue());
                    return;
                case 3:
                    this.f14545a.a();
                    return;
                case 4:
                    this.f14545a.b((f8y) this.c[0]);
                    return;
                case 5:
                    UploaderManager.a(this.f14545a);
                    return;
                case 6:
                    UploaderManager uploaderManager3 = this.f14545a;
                    Object[] objArr3 = this.c;
                    uploaderManager3.a((String) objArr3[0], (lzd) objArr3[1], (Handler) objArr3[2]);
                    return;
                case 7:
                    UploaderManager.a(this.f14545a, (z6e) this.c[0]);
                    return;
                case 8:
                    UploaderManager.b(this.f14545a, (z6e) this.c[0]);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<UploaderManager> f14546a;

        public b(UploaderManager uploaderManager) {
            this.f14546a = new WeakReference<>(uploaderManager);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/UploaderManager$b");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            if (!(context == null || intent == null)) {
                try {
                    intent.getBooleanExtra("noConnectivity", false);
                    intent.getStringExtra("extraInfo");
                    UploaderManager uploaderManager = this.f14546a.get();
                    if (uploaderManager != null) {
                        UploaderManager.b(uploaderManager);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public UploaderManager() {
        this(0);
    }

    public static /* synthetic */ void a(UploaderManager uploaderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66214d7", new Object[]{uploaderManager});
        } else {
            uploaderManager.d();
        }
    }

    public static /* synthetic */ void b(UploaderManager uploaderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6102d758", new Object[]{uploaderManager});
        } else {
            uploaderManager.e();
        }
    }

    private Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this});
        }
        Handler handler = this.i;
        if (handler != null) {
            return handler;
        }
        if (rtx.d(2)) {
            rtx.a(2, "UploaderManager", this.n + " doRetrieve and register");
        }
        HandlerThread handlerThread = new HandlerThread("[aus]");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.i = handler2;
        return handler2;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.p) {
            try {
                Handler handler = this.i;
                if (handler != null) {
                    handler.post(new a(5, this, new Object[0]));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int f() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        for (int size = this.b.size() - 1; size >= 0; size--) {
            h9y h9yVar = this.b.get(size);
            ArrayList<Pair<h9y, oxx>> arrayList = this.e.get(h9yVar.O());
            if (arrayList == null) {
                if (this.e.size() < 2) {
                    this.b.remove(size);
                    a(h9yVar, arrayList);
                    i++;
                }
            } else if (arrayList.size() < 2) {
                this.b.remove(size);
                a(h9yVar, arrayList);
                i++;
            }
        }
        if (rtx.d(2)) {
            rtx.a(2, "UploaderManager", this.n + " suppliedCount:" + i);
        }
        return i;
    }

    @Override // tb.x6e
    public boolean cancelAsync(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("427242e8", new Object[]{this, z6eVar})).booleanValue() : cancelAsync(z6eVar, 0);
    }

    @Override // tb.x6e
    public boolean continueAsync(z6e z6eVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8667195", new Object[]{this, z6eVar})).booleanValue();
        }
        if (z6eVar == null) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderManager", this.n + " continueAsync fail,task null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                try {
                    if (!this.j) {
                        return false;
                    }
                    Handler handler = this.i;
                    if (handler == null || !handler.post(new a(8, this, z6eVar))) {
                        z = false;
                    }
                    return z;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.x6e
    public boolean getUnfinishedTasksAsync(String str, lzd lzdVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26aad90d", new Object[]{this, str, lzdVar, handler})).booleanValue();
        }
        if (str == null || lzdVar == null) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderManager", this.n + " getUnfinishedTasksAsync fail, bizType or listener null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                try {
                    if (!this.j) {
                        return false;
                    }
                    return c().post(new a(6, this, str, lzdVar, handler));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.x6e
    public boolean initialize(Context context, w6e w6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59977fba", new Object[]{this, context, w6eVar})).booleanValue();
        }
        if (context == null) {
            if (rtx.d(16)) {
                rtx.a(16, "UploaderManager", this.n + " initialize fail, context null");
            }
            return false;
        } else if (this.j) {
            if (rtx.d(4)) {
                rtx.a(4, "UploaderManager", this.n + " initialize, is initialized !");
            }
            return false;
        } else {
            synchronized (this.p) {
                try {
                    if (this.j) {
                        if (rtx.d(4)) {
                            rtx.a(4, "UploaderManager", this.n + " initialize, is initialized !");
                        }
                        return false;
                    } else if (this.q != w6eVar.getEnvironment().getInstanceType()) {
                        if (rtx.d(16)) {
                            rtx.a(16, "UploaderManager", this.n + " initialize, FAILED! environment not equals instance in instanceType");
                        }
                        return false;
                    } else {
                        this.o = new com.uploader.implement.a(context, w6eVar);
                        try {
                            xrx d = xrx.d();
                            this.r = d;
                            d.e(context, this.o);
                            this.r.B();
                            o7y a2 = o7y.a();
                            this.s = a2;
                            a2.b(context, this.o);
                        } catch (Exception e) {
                            if (rtx.d(16)) {
                                rtx.b(16, "UploaderManager", this.n + " initialize taskDbManager, FAILED!", e);
                            }
                        }
                        this.j = true;
                        if (rtx.d(4)) {
                            rtx.a(4, "UploaderManager", this.n + " initialize !!!");
                        }
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.x6e
    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    @Override // tb.x6e
    public boolean pauseAsync(z6e z6eVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("457f064", new Object[]{this, z6eVar})).booleanValue();
        }
        if (z6eVar == null) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderManager", this.n + " pauseAsync fail,task null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                try {
                    if (!this.j) {
                        return false;
                    }
                    Handler handler = this.i;
                    if (handler == null || !handler.post(new a(7, this, z6eVar))) {
                        z = false;
                    }
                    return z;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.x6e
    public boolean uploadAsync(z6e z6eVar, mzd mzdVar, Handler handler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d5f6e90", new Object[]{this, z6eVar, mzdVar, handler})).booleanValue() : uploadAsync(z6eVar, mzdVar, handler, false);
    }

    public UploaderManager(int i) {
        this.f14544a = 0;
        this.j = false;
        this.p = new byte[0];
        this.e = new SparseArray<>(2);
        this.f = new ArrayList<>();
        this.d = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.n = hashCode();
        this.q = i;
    }

    public static /* synthetic */ void a(UploaderManager uploaderManager, z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526b32f6", new Object[]{uploaderManager, z6eVar});
        } else {
            uploaderManager.a(z6eVar);
        }
    }

    public static /* synthetic */ void b(UploaderManager uploaderManager, z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305e98d5", new Object[]{uploaderManager, z6eVar});
        } else {
            uploaderManager.b(z6eVar);
        }
    }

    @Override // tb.x6e
    public boolean cancelAsync(z6e z6eVar, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd68ca3", new Object[]{this, z6eVar, new Integer(i)})).booleanValue();
        }
        if (z6eVar == null) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderManager", this.n + " cancelAsync fail,task null");
            }
            return false;
        } else if (!this.j) {
            return false;
        } else {
            synchronized (this.p) {
                try {
                    if (!this.j) {
                        return false;
                    }
                    Handler handler = this.i;
                    if (handler == null || !handler.post(new a(2, this, z6eVar, Integer.valueOf(i)))) {
                        z = false;
                    }
                    return z;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.x6e
    public boolean uploadAsync(z6e z6eVar, mzd mzdVar, Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e8f15cc", new Object[]{this, z6eVar, mzdVar, handler, new Boolean(z)})).booleanValue();
        }
        if (z6eVar == null) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderManager", this.n + " uploadAsync fail,task null");
            }
            return false;
        }
        synchronized (this.p) {
            try {
                if (!this.j) {
                    return false;
                }
                return c().post(new a(1, this, z6eVar, mzdVar, handler, Boolean.valueOf(z)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        boolean z;
        String str;
        boolean z2;
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        NetworkInfo d = bux.d(this.o.c.getApplicationContext());
        if (d != null) {
            z = d.isConnected();
            str = d.getExtraInfo();
        } else {
            str = null;
            z = false;
        }
        boolean z3 = this.l;
        String str2 = this.m;
        if (z3 != z) {
            z2 = true;
        } else {
            if (str2 != null) {
                equals = str2.equals(str);
            } else if (str != null) {
                equals = str.equals(str2);
            } else {
                z2 = false;
            }
            z2 = !equals;
        }
        if (rtx.d(8)) {
            rtx.a(8, "UploaderManager", this.n + " doNetworkChanged, extraInfo(new|old):" + str + "|" + str2 + " isConnected(new|old):" + z + "|" + z3 + " changed:" + z2);
        }
        if (z2) {
            this.l = z;
            this.m = str;
            if (cwx.n()) {
                this.o.f14547a.e(false);
            }
            if (!z) {
                mxx mxxVar = this.g;
                if (mxxVar != null) {
                    mxxVar.e();
                    return;
                }
                return;
            }
            int size = this.f.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Pair<h9y, oxx> pair = this.f.get(i2);
                ((h9y) pair.first).n((oxx) pair.second);
                i++;
            }
            int f = f();
            if (rtx.d(2)) {
                rtx.a(2, "UploaderManager", this.n + " restartedCount:" + i + " suppliedCount:" + f);
            }
            this.s.g();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Handler handler = this.i;
        if (handler != null) {
            Context applicationContext = this.o.c.getApplicationContext();
            BroadcastReceiver broadcastReceiver = this.h;
            if (broadcastReceiver != null) {
                try {
                    try {
                        applicationContext.unregisterReceiver(broadcastReceiver);
                    } catch (Exception e) {
                        if (rtx.d(16)) {
                            rtx.b(16, "UploaderManager", "doClean unregisterReceiver", e);
                        }
                    }
                } finally {
                    this.h = null;
                }
            }
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
            this.k = null;
            this.i = null;
            this.e = new SparseArray<>(2);
            this.f.trimToSize();
            this.d.trimToSize();
            this.b.trimToSize();
            mxx mxxVar = this.g;
            if (mxxVar != null) {
                mxxVar.e();
                this.g = null;
            }
            if (rtx.d(2)) {
                rtx.a(2, "UploaderManager", this.n + " doClean and release");
            }
        }
    }

    public void b(f8y f8yVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760be29e", new Object[]{this, f8yVar});
            return;
        }
        h9y h9yVar = (h9y) f8yVar;
        int O = h9yVar.O();
        ArrayList<Pair<h9y, oxx>> arrayList = this.e.get(O);
        if (arrayList != null) {
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    break;
                } else if (((h9y) arrayList.get(size).first).equals(h9yVar)) {
                    z = this.f.remove(arrayList.remove(size));
                    break;
                } else {
                    size--;
                }
            }
            if (z) {
                t.decrementAndGet();
                if (arrayList.size() == 0) {
                    this.e.remove(O);
                    if (rtx.d(4)) {
                        rtx.a(4, "UploaderManager", this.n + " onFinish remove concurrent task:" + h9yVar.N().hashCode());
                    }
                }
                if (bux.b(this.o.c.getApplicationContext())) {
                    f();
                    if (this.e.size() == 0 && this.b.size() == 0) {
                        synchronized (this.p) {
                            try {
                                Handler handler = this.i;
                                if (rtx.d(8)) {
                                    rtx.a(8, "UploaderManager", this.n + " start count down:" + TaobaoMediaPlayer.FFP_PROP_FLOAT_AUDIO_GAIN_VALUE);
                                }
                                if (handler != null) {
                                    a aVar = new a(3, this, new Object[0]);
                                    this.k = aVar;
                                    handler.postDelayed(aVar, 90000L);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else if (rtx.d(8)) {
                        rtx.a(8, "UploaderManager", this.n + " doFinish has more data");
                    }
                } else if (rtx.d(8)) {
                    rtx.a(8, "UploaderManager", this.n + " doFinish no network");
                }
            } else if (rtx.d(8)) {
                rtx.a(8, "UploaderManager", this.n + " doFinish !removed");
            }
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderManager", this.n + " doFinish no concurrent");
        }
    }

    private boolean c(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9544b87", new Object[]{this, z6eVar})).booleanValue();
        }
        if (!(z6eVar instanceof kk2)) {
            return false;
        }
        String str = ((kk2) z6eVar).f22724a.g;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (str.equalsIgnoreCase(((h9y) this.f.get(i).first).P())) {
                if (rtx.d(4)) {
                    rtx.a(4, "UploaderManager", this.n + " breakpoint task fileId not valid, fileId=" + str);
                }
                return false;
            }
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (str.equalsIgnoreCase(this.b.get(i2).P())) {
                if (rtx.d(4)) {
                    rtx.a(4, "UploaderManager", this.n + " breakpoint task fileId not valid, fileId=" + str);
                }
                return false;
            }
        }
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            if (str.equalsIgnoreCase(this.c.get(i3).P())) {
                if (rtx.d(4)) {
                    rtx.a(4, "UploaderManager", this.n + " breakpoint task fileId not valid, fileId=" + str);
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.z6e r17, tb.mzd r18, android.os.Handler r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uploader.implement.UploaderManager.a(tb.z6e, tb.mzd, android.os.Handler, boolean):void");
    }

    private void b(z6e z6eVar) {
        h9y h9yVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92365aa4", new Object[]{this, z6eVar});
            return;
        }
        int size = this.c.size() - 1;
        while (true) {
            if (size < 0) {
                h9yVar = null;
                break;
            } else if (this.c.get(size).N().equals(z6eVar)) {
                h9yVar = this.c.remove(size);
                break;
            } else {
                size--;
            }
        }
        if (h9yVar != null && h9yVar.s() != 1 && h9yVar.s() != 2) {
            ArrayList<h9y> arrayList = this.b;
            arrayList.add(arrayList.size(), h9yVar);
            h9yVar.v();
            f();
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : t.get();
    }

    private void a(h9y h9yVar, ArrayList<Pair<h9y, oxx>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af0412f", new Object[]{this, h9yVar, arrayList});
            return;
        }
        int O = h9yVar.O();
        if (this.g == null) {
            this.g = new mxx(this.o, this.i.getLooper());
        }
        hzx hzxVar = new hzx(this.o, this.g, this.i.getLooper());
        if (arrayList == null) {
            arrayList = new ArrayList<>(2);
            this.e.append(O, arrayList);
        }
        Pair<h9y, oxx> create = Pair.create(h9yVar, hzxVar);
        arrayList.add(create);
        this.f.add(create);
        t.incrementAndGet();
        h9yVar.k(this);
        h9yVar.n(hzxVar);
        if (rtx.d(4)) {
            rtx.a(4, "UploaderManager", this.n + " startAction task:" + h9yVar.N().hashCode());
        }
    }

    private int a(String str) {
        int i = -1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            str = "";
        }
        int size = this.d.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (((String) this.d.get(size).second).equals(str)) {
                i = size;
                break;
            } else {
                size--;
            }
        }
        if (i < 0) {
            ArrayList<Pair<Integer, String>> arrayList = this.d;
            int i2 = this.f14544a + 1;
            this.f14544a = i2;
            arrayList.add(new Pair<>(Integer.valueOf(i2), str));
            i = this.d.size() - 1;
        }
        return ((Integer) this.d.get(i).first).intValue();
    }

    public void a(z6e z6eVar, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f541de", new Object[]{this, z6eVar, new Integer(i)});
            return;
        }
        int a2 = a(z6eVar.getBizType());
        ytx ytxVar = i != 0 ? new ytx("200", String.valueOf(i), null, false) : null;
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (this.b.get(size).N().equals(z6eVar)) {
                this.b.remove(size).o(null, ytxVar);
                z = true;
                break;
            } else {
                size--;
            }
        }
        if (!z) {
            int size2 = this.c.size() - 1;
            while (true) {
                if (size2 < 0) {
                    break;
                } else if (this.c.get(size2).N().equals(z6eVar)) {
                    this.c.remove(size2).o(null, ytxVar);
                    break;
                } else {
                    size2--;
                }
            }
            if (!z) {
                ArrayList<Pair<h9y, oxx>> arrayList = this.e.get(a2);
                if (arrayList != null) {
                    for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                        if (((h9y) arrayList.get(size3).first).N().equals(z6eVar)) {
                            Pair<h9y, oxx> pair = arrayList.get(size3);
                            ((h9y) pair.first).o((oxx) pair.second, ytxVar);
                            if (rtx.d(4)) {
                                rtx.a(4, "UploaderManager", this.n + " doCancel cancel concurrent task:" + z6eVar);
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if (rtx.d(4)) {
                rtx.a(4, "UploaderManager", this.n + " doCancel cancel pausing task:" + z6eVar);
            }
        } else if (rtx.d(4)) {
            rtx.a(4, "UploaderManager", this.n + " doCancel cancel waiting task:" + z6eVar);
        }
    }

    @Override // tb.a4y
    public void a(f8y f8yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f834269d", new Object[]{this, f8yVar});
            return;
        }
        synchronized (this.p) {
            try {
                Handler handler = this.i;
                if (handler != null) {
                    handler.post(new a(4, this, f8yVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, lzd lzdVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff71757", new Object[]{this, str, lzdVar, handler});
            return;
        }
        if (rtx.d(4)) {
            rtx.a(4, "UploaderManager", this.n + " query unfinished tasks. bizType:" + str);
        }
        this.r.g(str, lzdVar, handler, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(z6e z6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1869c5", new Object[]{this, z6eVar});
            return;
        }
        int a2 = a(z6eVar.getBizType());
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (this.b.get(size).N().equals(z6eVar)) {
                this.c.add(0, this.b.get(size));
                this.b.remove(size).t(null);
                break;
            } else {
                size--;
            }
        }
        ArrayList<Pair<h9y, oxx>> arrayList = this.e.get(a2);
        if (arrayList != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                if (((h9y) arrayList.get(size2).first).N().equals(z6eVar)) {
                    Pair<h9y, oxx> pair = arrayList.get(size2);
                    if (!(((h9y) pair.first).s() == 4 || ((h9y) pair.first).s() == 5)) {
                        ((h9y) pair.first).t((oxx) pair.second);
                        this.c.add(0, pair.first);
                        this.f.remove(arrayList.remove(size2));
                        t.decrementAndGet();
                        if (arrayList.size() == 0) {
                            this.e.remove(a2);
                        }
                        f();
                        return;
                    }
                    return;
                }
            }
        }
    }
}
