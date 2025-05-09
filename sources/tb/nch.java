package tb;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.qrcode.data.QrCodeData;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final b f24640a;
    public static long b = 0;
    public static final long c = QrCodeData.QR_CODE_VALID_PERIOD;
    public static volatile boolean d = false;
    public static volatile WeakReference<Looper> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24641a;

        /* compiled from: Taobao */
        /* renamed from: tb.nch$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1006a implements unr {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Looper f24642a;

            public C1006a(a aVar, Looper looper) {
                this.f24642a = looper;
            }

            @Override // tb.unr
            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                    return;
                }
                try {
                    nch.b(false);
                    nch.c(null);
                    this.f24642a.quit();
                } catch (Throwable th) {
                    tgh.c("LocationUtils", "looper.quit() error", th);
                }
                if (tBLocationDTO != null && tBLocationDTO.isNavSuccess()) {
                    nch.d(0L);
                } else if (tBLocationDTO != null) {
                    tgh.b("LocationUtils", "地理位置获取错误");
                }
            }
        }

        public a(Context context) {
            this.f24641a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            Throwable th;
            String str3;
            String str4 = "0";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TBLocationDTO d = TBLocationClient.d();
                if (d != null || nch.a()) {
                    if (!TextUtils.isEmpty(d.getLongitude())) {
                        str3 = d.getLongitude();
                    } else {
                        str3 = str4;
                    }
                    try {
                        if (!TextUtils.isEmpty(d.getLatitude())) {
                            str4 = d.getLatitude();
                        }
                        str4 = str3;
                        str = str4;
                    } catch (Throwable th2) {
                        str2 = str3;
                        th = th2;
                        tgh.c("LocationUtils", "", th);
                        str = str4;
                        str4 = str2;
                        nch.e().f24643a = str4;
                        nch.e().b = str;
                    }
                } else {
                    TBLocationClient g = TBLocationClient.g(this.f24641a);
                    TBLocationOption tBLocationOption = new TBLocationOption();
                    Looper.prepare();
                    Looper myLooper = Looper.myLooper();
                    nch.b(true);
                    nch.c(new WeakReference(myLooper));
                    g.h(tBLocationOption, new C1006a(this, myLooper), myLooper);
                    Looper.loop();
                    str = str4;
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = str4;
            }
            nch.e().f24643a = str4;
            nch.e().b = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f24643a;
        public String b;

        static {
            t2o.a(354418756);
        }
    }

    static {
        t2o.a(354418753);
        b bVar = new b();
        f24640a = bVar;
        bVar.f24643a = "0";
        bVar.b = "0";
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return d;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ WeakReference c(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("c7a7f1f2", new Object[]{weakReference});
        }
        e = weakReference;
        return weakReference;
    }

    public static /* synthetic */ long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117691d", new Object[]{new Long(j)})).longValue();
        }
        b = j;
        return j;
    }

    public static /* synthetic */ b e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6ffec5ff", new Object[0]);
        }
        return f24640a;
    }

    public static boolean f(Context context) {
        qzl d2;
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b4bd04b", new Object[]{context})).booleanValue();
        }
        if (context == null || (d2 = com.taobao.runtimepermission.a.d(context, "TB_SHOPPING_PROCESS", new String[]{p78.ACCESS_FINE_LOCATION})) == null || (iArr = d2.b) == null || iArr.length <= 0 || iArr[0] != 0) {
            return false;
        }
        return true;
    }

    public static b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("374898c5", new Object[0]);
        }
        Application d2 = mr7.d();
        b bVar = new b();
        b bVar2 = f24640a;
        bVar.b = bVar2.b;
        bVar.f24643a = bVar2.f24643a;
        if (f(d2)) {
            h(d2);
        }
        return bVar;
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf3ad1d", new Object[]{context});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b >= c) {
            b = currentTimeMillis;
            if (e != null) {
                Looper looper = e.get();
                e = null;
                if (looper != null) {
                    try {
                        d = false;
                        looper.quit();
                    } catch (Throwable th) {
                        tgh.c("LocationUtils", "15 min looper.quit() error", th);
                    }
                }
            }
            pos.a(new a(context));
        }
    }
}
