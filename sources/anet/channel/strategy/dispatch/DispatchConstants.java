package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DispatchConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_STRATEGY = "abStrategy";
    public static final String ANDROID = "android";
    public static final String APPKEY = "appkey";
    public static final String APP_NAME = "appName";
    public static final String APP_VERSION = "appVersion";
    public static final String BSSID = "bssid";
    public static final String CARRIER = "carrier";
    public static final String CHANNEL = "channel";
    public static final String CONFIG_VERSION = "cv";
    public static final String DEVICEID = "deviceId";
    public static final String DOMAIN = "domain";
    public static final String HOSTS = "hosts";
    public static final String LATEST_VER_CODE_PROTOCOL = "6.3";
    public static final String LATITUDE = "lat";
    public static final String LIMIT_VER_CODE_PROTOCOL = "6.5";
    public static final String LONGTITUDE = "lng";
    public static final String MACHINE = "machine";
    public static final String MNC = "mnc";
    public static final String NETWORK_ID = "networkId";
    public static final String NET_TYPE = "netType";
    public static final String OTHER = "other";
    public static final String PLATFORM = "platform";
    public static final String PLATFORM_VERSION = "platformVersion";
    public static final String PRE_IP = "preIp";
    public static final String PRIORITY_VER_CODE_PROTOCOL = "6.4";
    public static final String SEC_DATA = "secData";
    public static final String SID = "sid";
    public static final String SIGN = "sign";
    public static final String SIGNTYPE = "signType";
    public static final String SIGN_SPLIT_SYMBOL = "&";
    public static final String STACK_TYPE = "stackType";
    public static final String TIMESTAMP = "t";
    public static final String U_PRIORITY = "uPriority";
    public static final String VERSION = "v";
    public static final String serverPath = "/amdc/mobileDispatch";
    public static String[] initHostArray = new String[0];
    public static String[] AMDC_SERVER_DOMAIN = {"amdc.m.taobao.com", "amdc.wapa.taobao.com", "amdc.taobao.net"};
    public static String[] AMDC_SERVER_CHANNEL_DOMAIN = {"amdc.m.taobao.com", "msgacs.m.taobao.com", "dorangesource.alicdn.com", "msgacs.wapa.taobao.com", "channel-acs.m.taobao.com"};
    public static String[][] AMDC_SERVER_OVER_SEA_IP = {new String[]{"47.246.103.9", "47.246.103.10"}, null, null};
    public static String[][] AMDC_SERVER_FIX_IP = {new String[]{Utils.longToIP(59082113219L), Utils.longToIP(59082113010L)}, new String[]{Utils.longToIP(106011052006L)}, null};
    public static String[][] AMDC_SERVER_FIX_IPV6 = {new String[]{Utils.stringToIP6("7f1*-00f-1004-8042"), Utils.stringToIP6("77*-01f-1004-8042")}, new String[]{Utils.stringToIP6("7f1*-00f-1004-8042"), Utils.stringToIP6("77*-01f-1004-8042")}, null};

    public static String getAmdcServerDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30326551", new Object[0]);
        }
        return AMDC_SERVER_DOMAIN[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static String[] getAmdcServerFixIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d2ea344e", new Object[0]);
        }
        return AMDC_SERVER_FIX_IP[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static String[] getAmdcServerFixIpv6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a24354ce", new Object[0]);
        }
        return AMDC_SERVER_FIX_IPV6[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static String[] getAmdcServerOverSeaIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5ecc6f14", new Object[0]);
        }
        return AMDC_SERVER_OVER_SEA_IP[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static boolean isAmdcServerChannelDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cdf5a44", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = AMDC_SERVER_CHANNEL_DOMAIN;
            if (i >= strArr.length) {
                return false;
            }
            if (str.equalsIgnoreCase(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static boolean isAmdcServerDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e04e11", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(getAmdcServerDomain());
    }

    public static void setAmdcServerFixIp(String[][] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600b4e9d", new Object[]{strArr});
        } else if (strArr == null || strArr.length < 2) {
            throw new IllegalArgumentException("ips is null or length < 2");
        } else {
            AMDC_SERVER_FIX_IP = strArr;
        }
    }

    public static void setAmdcServerDomain(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcccb04", new Object[]{strArr});
        } else if (strArr == null || strArr.length < 2) {
            throw new IllegalArgumentException("domains is null or length < 2");
        } else {
            for (int i = 0; i < strArr.length; i++) {
                if (TextUtils.isEmpty(strArr[i])) {
                    throw new IllegalArgumentException("domains[" + i + "] is null or empty");
                }
            }
            AMDC_SERVER_DOMAIN = strArr;
        }
    }

    static {
        t2o.a(607125899);
    }
}
