package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.login4android.qrcode.data.QrCodeData;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final b f19165a;
    public static long b = 0;
    public static final long c = QrCodeData.QR_CODE_VALID_PERIOD;
    public static volatile boolean d = false;
    public static volatile WeakReference<Looper> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19166a;

        /* compiled from: Taobao */
        /* renamed from: tb.fbh$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0924a implements unr {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Looper f19167a;

            public C0924a(a aVar, Looper looper) {
                this.f19167a = looper;
            }

            @Override // tb.unr
            public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                    return;
                }
                txj.e("LocationStore", "onLocationChanged");
                try {
                    fbh.b(false);
                    fbh.c(null);
                    this.f19167a.quit();
                } catch (Throwable th) {
                    txj.f("LocationStore", "looper.quit() error", th);
                }
                if (tBLocationDTO != null && tBLocationDTO.isNavSuccess()) {
                    fbh.d(0L);
                }
            }
        }

        public a(Context context) {
            this.f19166a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/location/LocationManager$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String str;
            String str2;
            String str3;
            Throwable th;
            TBLocationDTO d;
            String str4 = "0";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                d = TBLocationClient.d();
            } catch (Throwable th2) {
                th = th2;
                str3 = str4;
                str2 = str3;
            }
            if (d == null && !fbh.a()) {
                if (fbh.f(this.f19166a)) {
                    TBLocationClient g = TBLocationClient.g(y9a.b());
                    TBLocationOption tBLocationOption = new TBLocationOption();
                    Looper.prepare();
                    Looper myLooper = Looper.myLooper();
                    fbh.b(true);
                    fbh.c(new WeakReference(myLooper));
                    g.h(tBLocationOption, new C0924a(this, myLooper), myLooper);
                    Looper.loop();
                }
                txj.e("LocationStore", "afterloop");
            } else if (d != null) {
                if (!TextUtils.isEmpty(d.getLongitude())) {
                    str3 = d.getLongitude();
                } else {
                    str3 = str4;
                }
                try {
                    if (!TextUtils.isEmpty(d.getLatitude())) {
                        str2 = d.getLatitude();
                    } else {
                        str2 = str4;
                    }
                    try {
                        if (!TextUtils.isEmpty(d.cityCode)) {
                            str4 = d.cityCode;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        txj.f("LocationStore", "", th);
                        str = str4;
                        str4 = str3;
                        txj.e("LocationStore", "longitude=" + str4 + ", latitude=" + str2);
                        fbh.e().f19168a = str4;
                        fbh.e().b = str2;
                        fbh.e().c = str;
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str4;
                }
                str = str4;
                str4 = str3;
                txj.e("LocationStore", "longitude=" + str4 + ", latitude=" + str2);
                fbh.e().f19168a = str4;
                fbh.e().b = str2;
                fbh.e().c = str;
                return null;
            }
            str = str4;
            str2 = str;
            txj.e("LocationStore", "longitude=" + str4 + ", latitude=" + str2);
            fbh.e().f19168a = str4;
            fbh.e().b = str2;
            fbh.e().c = str;
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f19168a;
        public String b;
        public String c;

        static {
            t2o.a(352321636);
        }
    }

    static {
        t2o.a(352321633);
        b bVar = new b();
        f19165a = bVar;
        bVar.f19168a = "0";
        bVar.b = "0";
        bVar.c = "0";
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
            return (b) ipChange.ipc$dispatch("fb30844e", new Object[0]);
        }
        return f19165a;
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
                        txj.f("LocationStore", "15 min looper.quit() error", th);
                    }
                }
            }
            new a(context).execute(new Void[0]);
        }
    }

    public b g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ac39f800", new Object[]{this, context});
        }
        b bVar = new b();
        b bVar2 = f19165a;
        bVar.b = bVar2.b;
        bVar.f19168a = bVar2.f19168a;
        bVar.c = bVar2.c;
        h(context);
        return bVar;
    }

    public static boolean f(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b4bd04b", new Object[]{context})).booleanValue();
        }
        if (byj.n0()) {
            qzl d2 = com.taobao.runtimepermission.a.d(context, "TB_SHOPPING_PROCESS", new String[]{p78.ACCESS_FINE_LOCATION});
            if (d2 != null && d2.b[0] == 0) {
                return true;
            }
            StringBuilder sb = new StringBuilder("checkBizPermission: denied with msg ");
            if (d2 != null) {
                str = d2.c[0];
            } else {
                str = "";
            }
            sb.append(str);
            txj.e(txj.TAG_RENDER, sb.toString());
            return false;
        }
        txj.e(txj.TAG_RENDER, "orange close checkBizPermission");
        return true;
    }
}
