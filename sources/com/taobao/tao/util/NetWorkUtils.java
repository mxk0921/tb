package com.taobao.tao.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.preference.AppPreference;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NetWorkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREF_VALUE_KEY_LOW_NETWORK_MODE = "pvk_low_network_mode";
    private static boolean firstRead = true;
    private static boolean lowNetworkMode = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ConnectType {
        CONNECT_TYPE_WIFI,
        CONNECT_TYPE_MOBILE,
        CONNECT_TYPE_OTHER,
        CONNECT_TYPE_DISCONNECT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ConnectType connectType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/NetWorkUtils$ConnectType");
        }

        public static ConnectType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConnectType) ipChange.ipc$dispatch("ae5c63dc", new Object[]{str});
            }
            return (ConnectType) Enum.valueOf(ConnectType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum MobileNetworkType {
        MOBILE_NETWORK_TYPE_2G,
        MOBILE_NETWORK_TYPE_3G,
        MOBILE_NETWORK_TYPE_4G,
        MOBILE_NETWORK_TYPE_UNKNOWN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MobileNetworkType mobileNetworkType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/util/NetWorkUtils$MobileNetworkType");
        }

        public static MobileNetworkType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MobileNetworkType) ipChange.ipc$dispatch("8abd8f1a", new Object[]{str});
            }
            return (MobileNetworkType) Enum.valueOf(MobileNetworkType.class, str);
        }
    }

    static {
        t2o.a(775946426);
    }

    public static String GetNetworkType(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d44f91", new Object[]{context});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return null;
        }
        for (int i = 0; i < allNetworkInfo.length; i++) {
            NetworkInfo networkInfo = allNetworkInfo[i];
            if (networkInfo != null && ((state = networkInfo.getState()) == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                String extraInfo = allNetworkInfo[i].getExtraInfo();
                return allNetworkInfo[i].getTypeName() + " " + allNetworkInfo[i].getSubtypeName() + extraInfo;
            }
        }
        return null;
    }

    public static ConnectType getConnectType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectType) ipChange.ipc$dispatch("5498b402", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return ConnectType.CONNECT_TYPE_DISCONNECT;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return ConnectType.CONNECT_TYPE_MOBILE;
        }
        if (type != 1) {
            return ConnectType.CONNECT_TYPE_OTHER;
        }
        return ConnectType.CONNECT_TYPE_WIFI;
    }

    public static MobileNetworkType getMobileNetworkType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MobileNetworkType) ipChange.ipc$dispatch("419c7482", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0 || !activeNetworkInfo.isConnected()) {
            return MobileNetworkType.MOBILE_NETWORK_TYPE_UNKNOWN;
        }
        return getNetWorkType(activeNetworkInfo.getSubtype());
    }

    private static MobileNetworkType getNetWorkType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MobileNetworkType) ipChange.ipc$dispatch("95772e09", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_3G;
            case 13:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_4G;
            default:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_UNKNOWN;
        }
    }

    public static int getNumCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e7ecbe", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.taobao.tao.util.NetWorkUtils.1CpuFilter
                public static volatile transient /* synthetic */ IpChange $ipChange;

                static {
                    t2o.a(775946427);
                }

                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                    }
                    if (Pattern.matches("cpu[0-9]", file.getName())) {
                        return true;
                    }
                    return false;
                }
            });
            if (listFiles != null) {
                return listFiles.length;
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getTotalRAM() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.util.NetWorkUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0016
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "83cbd42a"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0016:
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: all -> 0x0032, IOException -> 0x0037
            java.lang.String r2 = "/proc/meminfo"
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch: all -> 0x0032, IOException -> 0x0037
            java.lang.String r0 = r1.readLine()     // Catch: all -> 0x002e, IOException -> 0x0030
            r1.close()     // Catch: IOException -> 0x0029
            goto L_0x0041
        L_0x0029:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0041
        L_0x002e:
            r0 = move-exception
            goto L_0x0064
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0064
        L_0x0037:
            r2 = move-exception
            r1 = r0
        L_0x0039:
            r2.printStackTrace()     // Catch: all -> 0x002e
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch: IOException -> 0x0029
        L_0x0041:
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = "kB"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "MemTotal:"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r0 = r0.trim()     // Catch: NumberFormatException -> 0x005d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: NumberFormatException -> 0x005d
            int r0 = r0 / 1000
            return r0
        L_0x005d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0061:
            r0 = 1024(0x400, float:1.435E-42)
            return r0
        L_0x0064:
            if (r1 == 0) goto L_0x006e
            r1.close()     // Catch: IOException -> 0x006a
            goto L_0x006e
        L_0x006a:
            r1 = move-exception
            r1.printStackTrace()
        L_0x006e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.NetWorkUtils.getTotalRAM():int");
    }

    @Deprecated
    public static boolean isLowNetworkMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("269c95be", new Object[]{context})).booleanValue();
        }
        if (firstRead) {
            updateIsLowNetworkMode(getConnectType(context));
            firstRead = false;
        }
        new StringBuilder("isLowNetworkMode = ").append(lowNetworkMode);
        return lowNetworkMode;
    }

    @Deprecated
    public static boolean isLowendPhone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f7e6f28", new Object[0])).booleanValue();
        }
        int numCores = getNumCores();
        int totalRAM = getTotalRAM();
        StringBuilder sb = new StringBuilder("processorCore = ");
        sb.append(numCores);
        sb.append(" ram = ");
        sb.append(totalRAM);
        sb.append(" MB");
        return numCores == 1 && totalRAM < 800;
    }

    public static boolean isNetworkAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        return NetworkStatusHelper.isConnected();
    }

    private static void setLowNetworkMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a3c88e", new Object[]{new Boolean(z)});
        } else {
            lowNetworkMode = z;
        }
    }

    @Deprecated
    public static void updateIsLowNetworkMode(ConnectType connectType) {
        MobileNetworkType mobileNetworkType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe5b156", new Object[]{connectType});
            return;
        }
        new StringBuilder("updateIsLowNetworkMode:currentConnectType = ").append(connectType);
        if (AppPreference.getBoolean(PREF_VALUE_KEY_LOW_NETWORK_MODE, true)) {
            if (isLowendPhone()) {
                setLowNetworkMode(true);
                return;
            } else if (connectType == ConnectType.CONNECT_TYPE_MOBILE && ((mobileNetworkType = getMobileNetworkType(Globals.getApplication())) == MobileNetworkType.MOBILE_NETWORK_TYPE_2G || mobileNetworkType == MobileNetworkType.MOBILE_NETWORK_TYPE_3G)) {
                setLowNetworkMode(true);
                return;
            }
        }
        setLowNetworkMode(false);
    }
}
