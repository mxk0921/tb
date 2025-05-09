package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.strategy.HttpDnsAdapter;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z5r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NET_2G = "2G";
    public static final String NET_3G = "3G";
    public static final String NET_4G = "4G";
    public static final String NET_5G = "5G";
    public static final String NET_WIFI = "WIFI";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Long> f32556a = new ConcurrentHashMap();
    public static final Map<String, String> b = new ConcurrentHashMap();
    public static final Map<String, String> c = new ConcurrentHashMap();
    public static final feh d = new feh("TBAVNetworkUtils", "");

    static {
        t2o.a(774897962);
    }

    public static boolean a(String str) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6ac17a7", new Object[]{str})).booleanValue();
        }
        try {
            host = Uri.parse(str).getHost();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        if (!((ConcurrentHashMap) b).containsKey(host)) {
            feh fehVar = d;
            AVSDKLog.e(fehVar, "TBAVNetworkUtils no local cached IP , host is :" + host);
            return false;
        }
        Map<String, Long> map = f32556a;
        if (((ConcurrentHashMap) map).containsKey(host)) {
            long longValue = ((Long) ((ConcurrentHashMap) map).get(host)).longValue();
            if (System.currentTimeMillis() - longValue >= 300000) {
                feh fehVar2 = d;
                AVSDKLog.e(fehVar2, "TBAVNetworkUtils has cached IP , host is :" + host + ",but is time out " + String.valueOf(System.currentTimeMillis() - longValue));
                return false;
            }
            feh fehVar3 = d;
            AVSDKLog.e(fehVar3, "TBAVNetworkUtils has cached IP , host is :" + host);
            return true;
        }
        feh fehVar4 = d;
        AVSDKLog.e(fehVar4, "TBAVNetworkUtils has cached IP, but no cached time , host is :" + host);
        return false;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f66aa2e", new Object[0]);
            return;
        }
        ((ConcurrentHashMap) b).clear();
        ((ConcurrentHashMap) f32556a).clear();
        AVSDKLog.e(d, "TBAVNetworkUtils clear cached IP by network changed");
    }

    public static double c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("205e97c6", new Object[0])).doubleValue();
        }
        try {
            return NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth();
        } catch (Throwable th) {
            feh fehVar = d;
            AVSDKLog.e(fehVar, "TBAVNetworkUtils getGlobalCurrentBandWidth error:" + th.getMessage());
            return -1.0d;
        }
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1a24164", new Object[0])).intValue();
        }
        try {
            return NetworkQualityMonitor.getGlobalNetworkQuality();
        } catch (Throwable th) {
            feh fehVar = d;
            AVSDKLog.e(fehVar, "TBAVNetworkUtils getGlobalNetworkQuality error:" + th.getMessage());
            return 0;
        }
    }

    public static double e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfbe9c66", new Object[0])).doubleValue();
        }
        try {
            return NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth();
        } catch (Throwable th) {
            feh fehVar = d;
            AVSDKLog.e(fehVar, "TBAVNetworkUtils getGlobalPredictBandWidth error:" + th.getMessage());
            return -1.0d;
        }
    }

    public static HttpDnsAdapter.HttpDnsOrigin f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsAdapter.HttpDnsOrigin) ipChange.ipc$dispatch("974a01c5", new Object[]{str, new Boolean(z)});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        if (z) {
            return o(parse);
        }
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> p = p(parse);
        if (p == null || p.isEmpty() || p.get(0) == null || TextUtils.isEmpty(p.get(0).getOriginIP())) {
            return null;
        }
        int size = p.size();
        for (int i = 0; i < size; i++) {
            HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin = p.get(i);
            if (!(httpDnsOrigin == null || TextUtils.isEmpty(httpDnsOrigin.getOriginIP()) || ((startsWith && !parse.getScheme().equals(httpDnsOrigin.getOriginProtocol())) || httpDnsOrigin.getOriginIP().contains(":")))) {
                return httpDnsOrigin;
            }
        }
        return null;
    }

    public static String g(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6925e42a", new Object[]{str, new Boolean(z)});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        if (z) {
            return h(parse);
        }
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> p = p(parse);
        if (p == null || p.isEmpty() || p.get(0) == null || TextUtils.isEmpty(p.get(0).getOriginIP())) {
            return null;
        }
        int size = p.size();
        for (int i = 0; i < size; i++) {
            if (p.get(i) != null && !TextUtils.isEmpty(p.get(i).getOriginIP()) && (!startsWith || parse.getScheme().equals(p.get(i).getOriginProtocol()))) {
                String originIP = p.get(i).getOriginIP();
                if (!originIP.contains(":")) {
                    return originIP;
                }
            }
        }
        return null;
    }

    public static String h(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d76e8c17", new Object[]{uri});
        }
        HttpDnsAdapter.HttpDnsOrigin originByHttpDnsNoWait = HttpDnsAdapter.getOriginByHttpDnsNoWait(uri.getHost());
        if (originByHttpDnsNoWait != null) {
            return originByHttpDnsNoWait.getOriginIP();
        }
        return null;
    }

    public static String i(String str) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("116f25b1", new Object[]{str});
        }
        try {
            host = Uri.parse(str).getHost();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(host)) {
            return "";
        }
        Map<String, String> map = b;
        if (((ConcurrentHashMap) map).containsKey(host)) {
            feh fehVar = d;
            AVSDKLog.e(fehVar, "TBAVNetworkUtils has got cached IP , host is :" + host + " IP is " + ((String) ((ConcurrentHashMap) map).get(host)));
            return (String) ((ConcurrentHashMap) map).get(host);
        }
        return "";
    }

    public static String j(String str) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1027b633", new Object[]{str});
        }
        try {
            host = Uri.parse(str).getHost();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(host)) {
            return "";
        }
        Map<String, String> map = c;
        if (((ConcurrentHashMap) map).containsKey(host)) {
            feh fehVar = d;
            AVSDKLog.e(fehVar, "TBAVNetworkUtils has got cached IP List , host is :" + host + " IPlist is " + ((String) ((ConcurrentHashMap) map).get(host)));
            return (String) ((ConcurrentHashMap) map).get(host);
        }
        return "";
    }

    public static String k(String str, boolean z, StringBuilder sb) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfeb8f3f", new Object[]{str, new Boolean(z), sb});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> p = p(parse);
        String str2 = null;
        if (z) {
            if (p != null && !p.isEmpty() && p.get(0) != null && !TextUtils.isEmpty(p.get(0).getOriginIP())) {
                for (int size = p.size() - 1; size > 0; size--) {
                    if (!(p.get(size) == null || TextUtils.isEmpty(p.get(size).getOriginIP()) || (startsWith && !parse.getScheme().equals(p.get(size).getOriginProtocol())))) {
                        sb.append(p.get(size).getOriginIP());
                        break;
                    }
                }
                return p.get(0).getOriginIP();
            }
        } else if (p != null && !p.isEmpty() && p.get(0) != null && !TextUtils.isEmpty(p.get(0).getOriginIP())) {
            int size2 = p.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                if (p.get(i) != null && !TextUtils.isEmpty(p.get(i).getOriginIP()) && (!startsWith || parse.getScheme().equals(p.get(i).getOriginProtocol()))) {
                    String originIP = p.get(i).getOriginIP();
                    if (!originIP.contains(":")) {
                        str2 = originIP;
                        break;
                    }
                }
                i++;
            }
            int i2 = size2 - 1;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                if (p.get(i2) != null && !TextUtils.isEmpty(p.get(i2).getOriginIP()) && (!startsWith || parse.getScheme().equals(p.get(i2).getOriginProtocol()))) {
                    String originIP2 = p.get(i2).getOriginIP();
                    if (!originIP2.contains(":") && !TextUtils.isEmpty(str2) && !str2.equals(originIP2)) {
                        sb.append(originIP2);
                        break;
                    }
                }
                i2--;
            }
        }
        return str2;
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c422db2b", new Object[0])).intValue();
        }
        try {
            return (int) BandWidthSampler.getInstance().getNetSpeedValue();
        } catch (Throwable th) {
            feh fehVar = d;
            AVSDKLog.e(fehVar, " TBAVNetworkUtils getNetSpeedValue error:" + th.getMessage());
            return Integer.MAX_VALUE;
        }
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1387ca29", new Object[0])).intValue();
        }
        return BandWidthSampler.getInstance().getNetworkSpeed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String n(g0d g0dVar, Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f74f6f8a", new Object[]{g0dVar, context});
        }
        if (g0dVar != null && !TextUtils.isEmpty(g0dVar.getNetworkStutas())) {
            return g0dVar.getNetworkStutas();
        }
        if (context == null || context.getApplicationContext() == null || (activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                break;
            case 13:
                return "4G";
            default:
                if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                    return subtypeName;
                }
                break;
        }
        return "3G";
    }

    public static HttpDnsAdapter.HttpDnsOrigin o(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsAdapter.HttpDnsOrigin) ipChange.ipc$dispatch("f6d05c2d", new Object[]{uri});
        }
        return HttpDnsAdapter.getOriginByHttpDnsNoWait(uri.getHost());
    }

    public static ArrayList<HttpDnsAdapter.HttpDnsOrigin> p(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("cc678889", new Object[]{uri});
        }
        return HttpDnsAdapter.getOriginsByHttpDnsNoWait(uri.getHost(), false);
    }

    public static ArrayList<String> q(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("78bb4c51", new Object[]{str, new Boolean(z)});
        }
        Uri parse = Uri.parse(str);
        boolean startsWith = str.startsWith("http");
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Iterator<HttpDnsAdapter.HttpDnsOrigin> it = p(parse).iterator();
        while (it.hasNext()) {
            HttpDnsAdapter.HttpDnsOrigin next = it.next();
            if (next != null && !TextUtils.isEmpty(next.getOriginIP()) && (!startsWith || TextUtils.isEmpty(parse.getScheme()) || parse.getScheme().equals(next.getOriginProtocol()))) {
                String originIP = next.getOriginIP();
                if (z || !originIP.contains(":")) {
                    if (hashSet.add(originIP)) {
                        arrayList.add(originIP);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean r(g0d g0dVar, Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f7025c7", new Object[]{g0dVar, context})).booleanValue();
        }
        if (g0dVar != null && !TextUtils.isEmpty(g0dVar.getNetworkStutas())) {
            return g0dVar.isConnected();
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || (activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public static void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc1fd4d", new Object[]{str, str2});
            return;
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                ((ConcurrentHashMap) b).put(host, str2);
                ((ConcurrentHashMap) f32556a).put(host, Long.valueOf(System.currentTimeMillis()));
                feh fehVar = d;
                AVSDKLog.e(fehVar, "TBAVNetworkUtils  cached IP , host is :" + host + " IP is " + str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1bd230b", new Object[]{str, str2});
            return;
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                ((ConcurrentHashMap) c).put(host, str2);
                feh fehVar = d;
                AVSDKLog.e(fehVar, "TBAVNetworkUtils  cached IP list , host is :" + host + " IP list  is " + str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f96ebb", new Object[]{str});
        } else {
            d.c(str);
        }
    }
}
