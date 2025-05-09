package android.taobao.windvane.jsbridge.api;

import android.net.wifi.ScanResult;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVNetwork extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_TYPE_IWLAN = 18;
    public static final int NETWORK_TYPE_LTE_CA = 19;
    public static final int NETWORK_TYPE_TD_SCDMA = 17;
    private final int NETWORK_TYPE_GPRS = 1;
    private final int NETWORK_TYPE_EDGE = 2;
    private final int NETWORK_TYPE_UMTS = 3;
    private final int NETWORK_TYPE_CDMA = 4;
    private final int NETWORK_TYPE_EVDO_0 = 5;
    private final int NETWORK_TYPE_EVDO_A = 6;
    private final int NETWORK_TYPE_1xRTT = 7;
    private final int NETWORK_TYPE_HSDPA = 8;
    private final int NETWORK_TYPE_HSUPA = 9;
    private final int NETWORK_TYPE_HSPA = 10;
    private final int NETWORK_TYPE_IDEN = 11;
    private final int NETWORK_TYPE_EVDO_B = 12;
    private final int NETWORK_TYPE_LTE = 13;
    private final int NETWORK_TYPE_EHRPD = 14;
    private final int NETWORK_TYPE_HSPAP = 15;
    private final int NETWORK_TYPE_GSM = 16;
    private final int NETWORK_TYPE_NR = 20;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus;

        static {
            int[] iArr = new int[NetworkStatusHelper.NetworkStatus.values().length];
            $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus = iArr;
            try {
                iArr[NetworkStatusHelper.NetworkStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus[NetworkStatusHelper.NetworkStatus.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus[NetworkStatusHelper.NetworkStatus.G2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus[NetworkStatusHelper.NetworkStatus.G3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus[NetworkStatusHelper.NetworkStatus.G4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus[NetworkStatusHelper.NetworkStatus.WIFI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$anet$channel$status$NetworkStatusHelper$NetworkStatus[NetworkStatusHelper.NetworkStatus.G5.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        t2o.a(989856292);
    }

    public static /* synthetic */ Object ipc$super(WVNetwork wVNetwork, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVNetwork");
    }

    public StringBuffer lookUpScan(List<ScanResult> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("a95f9671", new Object[]{this, list});
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (i < list.size()) {
            StringBuilder sb = new StringBuilder("Index_");
            int i2 = i + 1;
            sb.append(new Integer(i2).toString());
            sb.append(":");
            stringBuffer.append(sb.toString());
            stringBuffer.append(list.get(i).SSID.toString());
            stringBuffer.append("\n");
            i = i2;
        }
        return stringBuffer;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"getNetworkType".equals(str)) {
            return false;
        }
        getNetworkType(str2, wVCallBackContext);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getNetworkType(java.lang.String r13, android.taobao.windvane.jsbridge.WVCallBackContext r14) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVNetwork.getNetworkType(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }
}
