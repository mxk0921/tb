package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORN_2G = 2;
    public static final int NETWORN_3G = 3;
    public static final int NETWORN_4G = 4;
    public static final int NETWORN_5G = 5;
    public static final int NETWORN_MOBILE = 6;
    public static final int NETWORN_NONE = 0;
    public static final int NETWORN_WIFI = 1;

    static {
        t2o.a(806356461);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return w2s.c(context, f);
    }

    public static int b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9563e23b", new Object[]{context})).intValue();
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo == null || (state = networkInfo.getState()) == null || !(state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null) {
                    NetworkInfo.State state2 = networkInfo2.getState();
                    String subtypeName = networkInfo2.getSubtypeName();
                    int subtype = activeNetworkInfo.getSubtype();
                    activeNetworkInfo.getSubtypeName();
                    if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                        switch (subtype) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                return 2;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 18:
                                return 3;
                            case 13:
                                return 4;
                            case 17:
                            case 19:
                            default:
                                if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA")) {
                                    if (!subtypeName.equalsIgnoreCase("CDMA2000")) {
                                        return 6;
                                    }
                                }
                                return 3;
                            case 20:
                                return 5;
                        }
                    }
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aa913c8", new Object[]{context});
        }
        if (v2s.o().f() != null) {
            return v2s.o().f().getAppName(context);
        }
        return "unknow";
    }

    public static String d(String str) {
        Process process;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afc63364", new Object[]{str});
        }
        try {
            process = Runtime.getRuntime().exec("getprop " + str);
        } catch (Throwable th2) {
            th = th2;
            process = null;
        }
        try {
            InputStream inputStream = process.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String readLine = bufferedReader.readLine();
                if (process.waitFor() != 0) {
                    bufferedReader.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    process.destroy();
                    return null;
                }
                bufferedReader.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                process.destroy();
                return readLine;
            } finally {
                try {
                    throw th;
                } catch (Throwable th3) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                o3s.b("AndroidUtils", "getPropsString Error : " + th.getMessage());
                return null;
            } finally {
                if (process != null) {
                    process.destroy();
                }
            }
        }
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0010990", new Object[0])).intValue();
        }
        return i3s.e();
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return i3s.f();
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4aeae8b", new Object[0])).booleanValue();
        }
        return w2s.j();
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3169ab69", new Object[]{context})).booleanValue();
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

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return i3s.m(context);
    }

    public static int l(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6da9ec0", new Object[]{new Float(f)})).intValue();
        }
        return w2s.n(f);
    }

    public static int m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c60377", new Object[]{new Integer(i)})).intValue();
        }
        return w2s.o(i);
    }
}
