package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.AliNNFlipType;
import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rir {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<Integer, rir> k = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public FaceDetectionNet f27411a;
    public final Context c;
    public String d;
    public c f;
    public int g;
    public final FaceDetectionNet.b b = new FaceDetectionNet.b();
    public final ExecutorService h = VExecutors.defaultSharedThreadPool();
    public final FutureTask i = new FutureTask(new a());
    public final Runnable j = new b();
    public Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Callable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.rir$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C1048a implements asj<FaceDetectionNet> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f27413a;

            public C1048a(long j) {
                this.f27413a = j;
            }

            @Override // tb.asj
            public void a(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("36700252", new Object[]{this, th});
                    return;
                }
                x5t.j("TBLiveAIImmersiveService", "prepareNet onFailed：" + th.getMessage());
            }

            @Override // tb.asj
            public void c(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7fae6b67", new Object[]{this, new Integer(i)});
                } else {
                    x5t.k("TBLiveAIImmersiveService", "prepareNet onProgressUpdate：");
                }
            }

            /* renamed from: d */
            public void b(FaceDetectionNet faceDetectionNet) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8418b9ed", new Object[]{this, faceDetectionNet});
                    return;
                }
                rir.c(rir.this, faceDetectionNet);
                x5t.k("TBLiveAIImmersiveService", "prepareNet 耗时：" + (System.currentTimeMillis() - this.f27413a));
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            FaceDetectionNet.s(rir.a(rir.this), rir.b(rir.this), "jwH6QKsj+j1mHV3+pbi26Kh55aMzO/mKmHUqTY+E414CkWcXIqkh8kYP+7hkQn3lvEfmfx4RrRcitG0aMWLRsz2upDoAfAG/Yd5ry/iQf2M=", new C1048a(System.currentTimeMillis()));
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (rir.d(rir.this) != null && rir.e(rir.this) > 0) {
                rir rirVar = rir.this;
                rir.f(rirVar, rir.d(rirVar).a(), rir.e(rir.this), rir.d(rir.this), true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        Bitmap a();

        void b(float f, int i);
    }

    static {
        t2o.a(779093454);
    }

    public rir(Context context) {
        m();
        p();
        this.c = context;
    }

    public static /* synthetic */ Context a(rir rirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6021f6e9", new Object[]{rirVar});
        }
        return rirVar.c;
    }

    public static /* synthetic */ FaceDetectionNet.b b(rir rirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionNet.b) ipChange.ipc$dispatch("5c3951ed", new Object[]{rirVar});
        }
        return rirVar.b;
    }

    public static /* synthetic */ FaceDetectionNet c(rir rirVar, FaceDetectionNet faceDetectionNet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionNet) ipChange.ipc$dispatch("af9507c9", new Object[]{rirVar, faceDetectionNet});
        }
        rirVar.f27411a = faceDetectionNet;
        return faceDetectionNet;
    }

    public static /* synthetic */ c d(rir rirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8a08afdd", new Object[]{rirVar});
        }
        return rirVar.f;
    }

    public static /* synthetic */ int e(rir rirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0893b60", new Object[]{rirVar})).intValue();
        }
        return rirVar.g;
    }

    public static /* synthetic */ void f(rir rirVar, Bitmap bitmap, int i, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6355de", new Object[]{rirVar, bitmap, new Integer(i), cVar, new Boolean(z)});
        } else {
            rirVar.g(bitmap, i, cVar, z);
        }
    }

    public static void j(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94819dac", new Object[]{context, new Integer(i)});
        } else if (ejr.f()) {
            HashMap<Integer, rir> hashMap = k;
            if (!hashMap.containsKey(Integer.valueOf(i))) {
                hashMap.put(Integer.valueOf(i), new rir(context));
                x5t.j("TBLiveAIImmersiveService", "TBLiveAIImmersiveService generateInstance with identify = " + i);
            }
        }
    }

    public static rir l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rir) ipChange.ipc$dispatch("76ff684c", new Object[]{new Integer(i)});
        }
        HashMap<Integer, rir> hashMap = k;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public static void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24115721", new Object[]{new Integer(i)});
            return;
        }
        HashMap<Integer, rir> hashMap = k;
        if (hashMap.get(Integer.valueOf(i)) != null) {
            hashMap.get(Integer.valueOf(i)).o();
            hashMap.remove(Integer.valueOf(i));
            x5t.j("TBLiveAIImmersiveService", "TBLiveAIImmersiveService onDestroy with identify = " + i);
        }
    }

    public final void g(Bitmap bitmap, int i, c cVar, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e4b54a", new Object[]{this, bitmap, new Integer(i), cVar, new Boolean(z)});
            return;
        }
        FaceDetectionReport[] i3 = i(bitmap);
        if (i3 != null) {
            int length = i3.length;
            int length2 = i3.length;
            int i4 = 0;
            while (i2 < length2) {
                i4 += i3[i2].rect.bottom;
                i2++;
            }
            i2 = hw0.f() - (i4 / length);
        } else if (ejr.b()) {
            i2 = k();
        } else if (!z && this.e != null) {
            x5t.k("TBLiveAIImmersiveService", "calculateOffset repeat");
            this.e.postDelayed(this.j, 100L);
            return;
        }
        if (i2 > 0 && i > i2 && cVar != null) {
            if (z) {
                cVar.b(-(i - i2), 150);
            } else {
                cVar.b(-(i - i2), 250);
            }
        }
    }

    public final boolean h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccc36ec", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (!ejr.f() || ejr.w().contains(str2)) {
            return false;
        }
        if ((str3 == null || !ejr.x().contains(str3)) && str != null && !ejr.y().contains(str)) {
            return true;
        }
        return false;
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3eea83f8", new Object[]{this})).intValue();
        }
        int v = ejr.v();
        if (v <= 0) {
            return 0;
        }
        return hw0.b(this.c, v);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
        } else {
            this.b.f6339a = FaceDetectionNet.FaceDetectMode.SCOPE_DETECT_MODE_IMAGE;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2933d9af", new Object[]{this});
            return;
        }
        if (this.f27411a != null) {
            x5t.j("TBLiveAIImmersiveService", "forward_net onRelease");
            this.f27411a.release();
            this.f27411a = null;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.e = null;
        }
        this.i.cancel(true);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a13c9d", new Object[]{this});
            return;
        }
        x5t.j("TBLiveAIImmersiveService", "prepareNet start, appkey=" + v2s.o().f().getAppKey() + " appname=" + v2s.o().f().getAppName(this.c));
        if (this.f27411a != null) {
            o();
        }
        this.h.submit(this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(java.util.HashMap<java.lang.String, java.lang.String> r9, tb.rir.c r10) {
        /*
            r8 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.rir.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "db5ce1c8"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            r0 = 1
            r3[r0] = r9
            r9 = 2
            r3[r9] = r10
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            if (r10 != 0) goto L_0x001b
            return
        L_0x001b:
            java.lang.String r1 = "isMoveUp"
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = tb.zqq.d(r1, r0)
            java.lang.String r2 = "containerHeight"
            java.lang.Object r2 = r9.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = tb.zqq.g(r2, r0)
            java.lang.String r3 = "scene"
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "bizCode"
            java.lang.Object r4 = r9.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "h5Url"
            java.lang.Object r9 = r9.get(r5)
            java.lang.String r9 = (java.lang.String) r9
            r8.f = r10
            r8.g = r2
            boolean r9 = r8.h(r3, r4, r9)
            java.lang.String r5 = ", bizCode= "
            java.lang.String r6 = "TBLiveAIImmersiveService"
            if (r9 != 0) goto L_0x0075
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "人脸服务鉴权失败，scene= "
            r9.<init>(r10)
            r9.append(r3)
            r9.append(r5)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            tb.x5t.j(r6, r9)
            return
        L_0x0075:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r7 = "startImmersive，scene="
            r9.<init>(r7)
            r9.append(r3)
            r9.append(r5)
            r9.append(r4)
            java.lang.String r4 = " isMoveUp"
            r9.append(r4)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            tb.x5t.j(r6, r9)
            java.lang.String r9 = "GoodFrame"
            boolean r9 = r9.equals(r3)
            r4 = 4604705439004963635(0x3fe7333333333333, double:0.725)
            if (r9 == 0) goto L_0x00ab
            int r9 = tb.hw0.f()
        L_0x00a6:
            double r6 = (double) r9
            double r6 = r6 * r4
            int r2 = (int) r6
            goto L_0x00b9
        L_0x00ab:
            java.lang.String r9 = "insideDetail"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x00b9
            int r9 = tb.hw0.f()
            goto L_0x00a6
        L_0x00b9:
            r8.g = r2
            if (r1 == 0) goto L_0x00cb
            java.lang.String r9 = r8.d
            if (r9 != 0) goto L_0x00e5
            r8.d = r3
            android.graphics.Bitmap r9 = r10.a()
            r8.g(r9, r2, r10, r0)
            goto L_0x00e5
        L_0x00cb:
            java.lang.String r9 = r8.d
            if (r9 == 0) goto L_0x00e5
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x00e5
            r9 = 0
            r8.d = r9
            android.os.Handler r9 = r8.e
            java.lang.Runnable r0 = r8.j
            r9.removeCallbacks(r0)
            r9 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r10.b(r9, r0)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rir.q(java.util.HashMap, tb.rir$c):void");
    }

    public final FaceDetectionReport[] i(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceDetectionReport[]) ipChange.ipc$dispatch("1fd84ee7", new Object[]{this, bitmap});
        }
        if (bitmap == null) {
            x5t.j("TBLiveAIImmersiveService", "bitmap is null");
            return null;
        } else if (this.f27411a == null) {
            x5t.j("TBLiveAIImmersiveService", "人脸检测网络模型创建中");
            p();
            return null;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            FaceDetectionReport[] q = this.f27411a.q(iArr, bitmap.getWidth(), bitmap.getHeight(), 0, 0L, 0, AliNNFlipType.FLIP_NONE, true, null);
            x5t.i("TBLiveAIImmersiveService", "faceDetect 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
            if (q != null) {
                return q;
            }
            x5t.j("TBLiveAIImmersiveService", mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            return null;
        }
    }
}
