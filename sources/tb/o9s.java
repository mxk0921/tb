package tb;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o9s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CommonUtils";

    static {
        t2o.a(849346568);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51f47a3d", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (!(str2 == null || str2.length() == 0)) {
                        if (!str.contains("*") && !str2.contains("*")) {
                            String[] split = str.split("\\.");
                            String[] split2 = str2.split("\\.");
                            int length = split.length;
                            int length2 = split2.length;
                            int min = Math.min(length, length2);
                            for (int i = 0; i < min; i++) {
                                int i2 = (tds.a(split[i]) > tds.a(split2[i]) ? 1 : (tds.a(split[i]) == tds.a(split2[i]) ? 0 : -1));
                                if (i2 > 0) {
                                    return 1;
                                }
                                if (i2 < 0) {
                                    return -1;
                                }
                            }
                            if (length > length2) {
                                while (min < length) {
                                    if (tds.a(split[min]) > 0) {
                                        return 1;
                                    }
                                    min++;
                                }
                            } else if (length < length2) {
                                while (min < length2) {
                                    if (tds.a(split2[min]) > 0) {
                                        return -1;
                                    }
                                    min++;
                                }
                            }
                        }
                        return 0;
                    }
                    return 1;
                }
            } catch (Exception e) {
                Log.e("CommonUtils", "compareVersion exception!", e);
            }
        }
        if (str2 == null || str2.length() == 0) {
            return 0;
        }
        return -1;
    }

    public static long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90c5b9bb", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return j - (System.currentTimeMillis() - SystemClock.uptimeMillis());
        }
        return j;
    }

    public static long d(String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7083ed1b", new Object[]{str})).longValue();
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            j = -1;
        }
        return c(j);
    }

    public static <T extends View> T e(ViewGroup viewGroup, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("d5c4c90a", new Object[]{viewGroup, cls}));
        }
        if (!(viewGroup == null || cls == null)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    return cls.cast(childAt);
                }
                if ((childAt instanceof ViewGroup) && (t = (T) e((ViewGroup) childAt, cls)) != null) {
                    return t;
                }
            }
        }
        return null;
    }

    public static String f(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls.newInstance(), str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c99fafb", new Object[]{application})).booleanValue();
        }
        if (application == null) {
            return false;
        }
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f1efe4", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6cbcba", new Object[]{context})).booleanValue();
        }
        if (TBDeviceUtils.p(context)) {
            return true;
        }
        return false;
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291a7758", new Object[]{context})).booleanValue();
        }
        if (!TBDeviceUtils.P(context) && !TBDeviceUtils.p(context)) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d0e605c", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !"app".equals(str) && !NativeCallContext.DOMAIN_APPX.equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Integer m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("66ca63e8", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    return Integer.valueOf(Color.parseColor(str));
                } catch (Exception e) {
                    Log.e("CommonUtils", "parseColor", e);
                }
            } catch (Exception unused) {
                return Integer.valueOf(Integer.parseInt(str));
            }
        }
        return null;
    }

    public static long n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3efb2a5", new Object[]{str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eae365d", new Object[]{str});
        }
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Throwable unused) {
            return null;
        }
    }
}
