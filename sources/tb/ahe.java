package tb;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ahe {
    public static final String SYS_IDENTIFIERID = "persist.sys.identifierid";

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15736a = new Object();
    public static Context b;
    public static boolean c;
    public static bhe d;
    public static bhe e;
    public static bhe f;
    public static HandlerThread g;
    public static Handler h;
    public static String i;
    public static String j;
    public static String k;
    public static volatile ahe l;
    public static volatile jp6 m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ahe.n + ahe.o + ahe.t + ahe.w + ahe.p + ahe.q + ahe.v + ahe.w + ahe.r + ahe.s + ahe.x + ahe.y > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("oaid", ahe.this.M(ahe.n, ahe.o, ahe.t, ahe.u));
                contentValues.put("vaid", ahe.this.M(ahe.p, ahe.q, ahe.v, ahe.w));
                contentValues.put("aaid", ahe.this.M(ahe.r, ahe.s, ahe.x, ahe.y));
                ahe.m.a(7, "vivo", new ContentValues[]{contentValues});
                int unused = ahe.s = 0;
                int unused2 = ahe.r = 0;
                int unused3 = ahe.q = 0;
                int unused4 = ahe.p = 0;
                int unused5 = ahe.o = 0;
                int unused6 = ahe.n = 0;
                int unused7 = ahe.y = 0;
                int unused8 = ahe.x = 0;
                int unused9 = ahe.w = 0;
                int unused10 = ahe.v = 0;
                int unused11 = ahe.u = 0;
                int unused12 = ahe.t = 0;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 11) {
                int i = message.getData().getInt("type");
                try {
                    String b = ahe.m.b(i, message.getData().getString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
                    if (i == 0) {
                        String unused = ahe.i = b;
                        ahe.T(8, ahe.i);
                    } else if (i == 1) {
                        if (b != null) {
                            String unused2 = ahe.j = b;
                        } else {
                            Log.e("VMS_SDK_Client", "get vaid failed");
                        }
                        ahe.T(9, ahe.j);
                    } else if (i == 2) {
                        if (b != null) {
                            String unused3 = ahe.k = b;
                        } else {
                            Log.e("VMS_SDK_Client", "get aaid failed");
                        }
                        ahe.T(10, ahe.k);
                    } else if (i != 3) {
                        if (i != 4 && i == 5 && b == null) {
                            Log.e("VMS_SDK_Client", "get guid failed");
                        }
                    } else if (b == null) {
                        Log.e("VMS_SDK_Client", "get udid failed");
                    }
                } catch (Exception e) {
                    Log.e("VMS_SDK_Client", "readException:" + e.toString());
                }
                Object obj = ahe.f15736a;
                synchronized (obj) {
                    obj.notify();
                }
                return;
            }
            Log.e("VMS_SDK_Client", "message type valid");
        }
    }

    public ahe() {
        P();
        m = new jp6(b);
        N(b);
    }

    public static void H() {
        c = "1".equals(L("persist.sys.identifierid.supported", "0")) || "1".equals(L(SYS_IDENTIFIERID, "0"));
    }

    public static ahe I(Context context) {
        if (!Q()) {
            return null;
        }
        return J(context);
    }

    public static ahe J(Context context) {
        if (b == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            b = context;
        }
        if (l == null) {
            synchronized (ahe.class) {
                try {
                    if (l == null) {
                        l = new ahe();
                        l.U();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l;
    }

    public static String L(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "0");
            } catch (Exception e2) {
                Log.e("VMS_SDK_Client", "getProperty: invoke is error" + e2.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static int N(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.vivo.vms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static synchronized void O(Context context, int i2, String str) {
        synchronized (ahe.class) {
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            if (f == null) {
                                f = new bhe(l, 2, str);
                                ContentResolver contentResolver = context.getContentResolver();
                                contentResolver.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/" + context.getPackageName()), false, f);
                            }
                        }
                    } else if (e == null) {
                        e = new bhe(l, 1, str);
                        ContentResolver contentResolver2 = context.getContentResolver();
                        contentResolver2.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, e);
                    }
                } else if (d == null) {
                    d = new bhe(l, 0, null);
                    context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void P() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        g = handlerThread;
        handlerThread.start();
        h = new b(g.getLooper());
    }

    public static boolean Q() {
        if (!c) {
            H();
        }
        return c;
    }

    public static void T(int i2, String str) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    switch (i2) {
                        case 8:
                            if (str == null) {
                                u++;
                                return;
                            } else {
                                t++;
                                return;
                            }
                        case 9:
                            if (str == null) {
                                w++;
                                return;
                            } else {
                                v++;
                                return;
                            }
                        case 10:
                            if (str == null) {
                                y++;
                                return;
                            } else {
                                x++;
                                return;
                            }
                        default:
                            return;
                    }
                } else if (str == null) {
                    s++;
                } else {
                    r++;
                }
            } else if (str == null) {
                q++;
            } else {
                p++;
            }
        } else if (str == null) {
            o++;
        } else {
            n++;
        }
    }

    public String K() {
        String str = i;
        if (str != null) {
            T(0, str);
            return i;
        }
        R(0, null);
        if (d == null) {
            O(b, 0, null);
        }
        T(0, i);
        return i;
    }

    public final String M(int i2, int i3, int i4, int i5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i2);
        stringBuffer.append(",");
        stringBuffer.append(i3);
        stringBuffer.append(";");
        stringBuffer.append(i4);
        stringBuffer.append(",");
        stringBuffer.append(i5);
        return stringBuffer.toString();
    }

    public final void R(int i2, String str) {
        Object obj = f15736a;
        synchronized (obj) {
            S(i2, str);
            SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException unused) {
                Log.e("VMS_SDK_Client", "queryId: lock error");
            }
            SystemClock.uptimeMillis();
        }
    }

    public void S(int i2, String str) {
        Message obtainMessage = h.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        if (i2 == 1 || i2 == 2 || i2 == 6) {
            bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
        }
        obtainMessage.setData(bundle);
        h.sendMessage(obtainMessage);
    }

    public final void U() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new a(), 600L, 600L, TimeUnit.SECONDS);
    }
}
