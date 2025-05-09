package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import android.os.Process;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UserTrackMethodJniBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f3427a;
    private static String b;
    private static volatile int c;
    private static volatile int d;
    private static volatile int e;
    private static volatile int f;
    private static Class g;
    private static Class h;
    private static Class i;
    private static Constructor j;
    private static Method k;
    private static Method l;
    private static Method m;
    private static Method n;
    private static String o;
    private static final char[] p = "0123456789abcdef".toCharArray();

    static {
        t2o.a(659554341);
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String str = o;
        if (str != null) {
            return str;
        }
        try {
            o = a.a(new File(f3427a.getDir("SGLib", 0), ".mwua"));
        } catch (Exception unused) {
        }
        if (o == null) {
            o = "";
        }
        return o;
    }

    public static void addCustomRecord(String str, int i2, String str2, String str3, String str4, Map<String, String> map) {
        Object invoke;
        Object invoke2;
        if (!(utAvaiable() == 0 || str == null || str.length() == 0)) {
            try {
                Map map2 = (Map) k.invoke(j.newInstance(str, Integer.valueOf(i2), str2, str3, str4, map), new Object[0]);
                if (map2 != null && !map2.isEmpty() && (invoke = l.invoke(h, new Object[0])) != null && (invoke2 = m.invoke(invoke, new Object[0])) != null) {
                    n.invoke(invoke2, map2);
                }
            } catch (Exception unused) {
            }
        }
    }

    private static synchronized String b() {
        synchronized (UserTrackMethodJniBridge.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            String str = b;
            if (str == null || str.length() == 0) {
                b = c();
            }
            String str2 = b;
            return str2.substring(0, str2.length() / 8);
        }
    }

    public static String bytesToHex(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51f47a3d", new Object[]{bArr});
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = p;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            String uuid = UUID.randomUUID().toString();
            String valueOf = String.valueOf(System.nanoTime());
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            return bytesToHex(instance.digest((uuid + valueOf).getBytes("UTF-8")));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getStackTrace(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf1c766", new Object[]{new Integer(i2), new Integer(i3)});
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length <= 0 || i2 <= 0 || i3 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (int i5 = 0; i5 < stackTrace.length && i4 < i3 && sb.length() < i2; i5++) {
            if (i5 > 1) {
                i4++;
                StackTraceElement stackTraceElement = stackTrace[i5];
                sb.append(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
                if (i5 < stackTrace.length - 1) {
                    sb.append("#");
                }
            }
        }
        return sb.toString();
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (context != null) {
            f3427a = context;
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!(str == null || str.length() == 0)) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static int utAvaiable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d8bbb30", new Object[0])).intValue();
        }
        if (f == 0) {
            synchronized (UserTrackMethodJniBridge.class) {
                try {
                    if (f == 0) {
                        try {
                            int i2 = UTOriginalCustomHitBuilder.f14551a;
                            g = UTOriginalCustomHitBuilder.class;
                            IpChange ipChange2 = UTAnalytics.$ipChange;
                            h = UTAnalytics.class;
                            IpChange ipChange3 = UTTracker.$ipChange;
                            i = UTTracker.class;
                            j = g.getConstructor(String.class, Integer.TYPE, String.class, String.class, String.class, Map.class);
                            k = g.getMethod(CartRecommendRefreshScene.build, new Class[0]);
                            l = h.getMethod("getInstance", new Class[0]);
                            m = h.getMethod("getDefaultTracker", new Class[0]);
                            n = i.getMethod("send", Map.class);
                            e = 1;
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                        f = 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static int addUtRecord(String str, int i2, int i3, String str2, long j2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa49d9d", new Object[]{str, new Integer(i2), new Integer(i3), str2, new Long(j2), str3, str4, str5, str6, str7})).intValue();
        }
        if (!(utAvaiable() == 0 || str == null || str.length() == 0)) {
            String str8 = str2 != null ? str2 : "";
            try {
                String valueOf = String.valueOf(i2);
                HashMap hashMap = new HashMap();
                hashMap.put(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN, String.valueOf(i3));
                hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, String.valueOf(Process.myPid()));
                hashMap.put("tid", String.valueOf(Thread.currentThread().getId()));
                hashMap.put("time", String.valueOf(j2));
                if (d == 0) {
                    c = e.b(f3427a) ? 1 : 0;
                    d = 1;
                }
                hashMap.put("ui", String.valueOf(c));
                hashMap.put("sid", b());
                hashMap.put("uuid", c());
                hashMap.put("msg", a(str3));
                hashMap.put("rsv1", a(str4));
                hashMap.put("rsv2", a(str5));
                hashMap.put("rsv3", a(str6));
                hashMap.put("rsv4", a(str7));
                hashMap.put("mwua", a());
                addCustomRecord("Page_SecurityGuardSDK", 19997, str, str8, valueOf, hashMap);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
