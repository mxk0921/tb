package anet.channel.encode;

import android.os.Build;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PublicNetworkErrorStatistic;
import anet.channel.statist.ZstdLinkStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.dispatch.DispatchHelper;
import anet.channel.strategy.dispatch.DispatchZstdDictEvent;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.TlsSniSocketFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.ZstdStreamInflater;
import com.android.taobao.zstd.dict.ZstdDecompressDict;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import tb.crx;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ZstdResponseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_RETRY = 1;
    private static final String TAG = "awcn.ZstdResponseHeader";
    private String contentEncodeType = null;
    public UseAsDictionary useAsDictionary = null;
    public LatestDictionary latestDictionary = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class LatestDictionary {
        public String link = null;
        public String hash_algo = "sha-256";
        public String hash = null;

        static {
            t2o.a(607125625);
        }

        public LatestDictionary() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class UseAsDictionary {
        public String matchPath = null;
        public long ttl = 31536000;
        public String dictType = pg1.ATOM_raw;
        public String hashes = "sha-256";

        static {
            t2o.a(607125626);
        }

        public UseAsDictionary() {
        }
    }

    static {
        t2o.a(607125622);
    }

    public static /* synthetic */ int access$000(ZstdResponseHelper zstdResponseHelper, List list, URL url, boolean z, long j, String str, String str2, int i, boolean z2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55dbd09e", new Object[]{zstdResponseHelper, list, url, new Boolean(z), new Long(j), str, str2, new Integer(i), new Boolean(z2), new Long(j2)})).intValue();
        }
        return zstdResponseHelper.sendOneDictUrl(list, url, z, j, str, str2, i, z2, j2);
    }

    private static HttpURLConnection getHttpConnection(URL url, String str, String str2) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("54137669", new Object[]{url, str, str2});
        }
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setRequestProperty(HttpConstant.HOST, str);
                httpURLConnection2.setConnectTimeout(20000);
                httpURLConnection2.setReadTimeout(20000);
                return httpURLConnection2;
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = httpURLConnection2;
                ALog.e(TAG, "[zstd-d] getHttpConnection, error=" + e.toString(), str2, new Object[0]);
                return httpURLConnection;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private static HttpsURLConnection getHttpsConnection(final URL url, final String str, final String str2) {
        Exception e;
        HttpsURLConnection httpsURLConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpsURLConnection) ipChange.ipc$dispatch("ad107bc8", new Object[]{url, str, str2});
        }
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            httpsURLConnection = (HttpsURLConnection) url.openConnection();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            httpsURLConnection.setRequestProperty(HttpConstant.HOST, str);
            httpsURLConnection.setConnectTimeout(20000);
            httpsURLConnection.setReadTimeout(20000);
            if (Integer.parseInt(Build.VERSION.SDK) < 8) {
                ALog.e(TAG, "[zstd-d] supportHttpsDictUrl 以下版本不支持https", str2, new Object[0]);
                return httpsURLConnection;
            }
            httpsURLConnection.setSSLSocketFactory(new TlsSniSocketFactory(str));
            httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: anet.channel.encode.ZstdResponseHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str3, SSLSession sSLSession) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("563b2905", new Object[]{this, str3, sSLSession})).booleanValue();
                    }
                    ALog.e(ZstdResponseHelper.TAG, "[zstd-d] getHttpsConnection, host=" + str + " ,url=" + url.toString(), str2, new Object[0]);
                    return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
                }
            });
            return httpsURLConnection;
        } catch (Exception e3) {
            e = e3;
            httpsURLConnection2 = httpsURLConnection;
            ALog.e(TAG, "[zstd-d] getHttpsConnection, error=" + e.toString(), str2, new Object[0]);
            return httpsURLConnection2;
        }
    }

    public static Pair<crx, Pair<ZstdDecompressDict, ZstdStreamInflater>> getZstdMtopInputStream(InputStream inputStream, DispatchZstdDictEvent dispatchZstdDictEvent, ZstdResponseHelper zstdResponseHelper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c1ee1e40", new Object[]{inputStream, dispatchZstdDictEvent, zstdResponseHelper, str});
        }
        if (!(zstdResponseHelper == null || dispatchZstdDictEvent == null)) {
            try {
                byte[] dictionary = zstdResponseHelper.getDictionary(dispatchZstdDictEvent.urlKey, str);
                if (!EncodingHelper.isZstdValid() || !AwcnConfig.isZstdDictDecompressOpened() || dictionary == null) {
                    return null;
                }
                Pair<crx, Pair<ZstdDecompressDict, ZstdStreamInflater>> zstdDictInputStream = EncodingHelper.getZstdDictInputStream(dictionary, inputStream, str);
                ALog.e(TAG, "[zstd-d] getZstdMtopInputStream zstd dict decompress get inputStream success!", str, new Object[0]);
                return zstdDictInputStream;
            } catch (Exception e) {
                ALog.e(TAG, "[zstd-d] getZstdMtopInputStream error=" + e.toString(), str, new Object[0]);
            }
        }
        return null;
    }

    private LatestDictionary parseLatestDictionary(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LatestDictionary) ipChange.ipc$dispatch("d491a98d", new Object[]{this, str, str2});
        }
        if (this.latestDictionary == null) {
            this.latestDictionary = new LatestDictionary();
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split(",")) {
            String[] split = str3.split("=");
            String trim = split[0].trim();
            String trim2 = split[1].trim();
            if ("link".equalsIgnoreCase(trim)) {
                this.latestDictionary.link = trim2.replace("\"", "");
                sb.append("[link]=");
                sb.append(this.latestDictionary.link);
            } else if ("hash_algo".equalsIgnoreCase(trim)) {
                this.latestDictionary.hash_algo = trim2.replace("\"", "");
                sb.append(" ,[hash_algo]=");
                sb.append(this.latestDictionary.hash_algo);
            } else if ("hash".equalsIgnoreCase(trim)) {
                this.latestDictionary.hash = trim2.replace("\"", "");
                sb.append(" ,[hash]=");
                sb.append(this.latestDictionary.hash);
            }
        }
        ALog.e(TAG, "[zstd-d] parseLatestDictionary msg=" + sb.toString(), str2, new Object[0]);
        return this.latestDictionary;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x04cf, code lost:
        anet.channel.encode.FileHelper.deleteDirectory(anet.channel.encode.FileHelper.getDefaultFilePath(r44, anet.channel.encode.FileHelper.DEFAULT_TEMPORARY_PATH, r25), r44, r25);
        r14.updateMsg = "update_over_dictPerMaxLength";
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04db, code lost:
        r1 = null;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x05f6, code lost:
        r1 = anet.channel.util.StringUtils.bytesToHexString(r1.digest());
        r14.updateMsg = "update_hash";
        anet.channel.util.ALog.e(anet.channel.encode.ZstdResponseHelper.TAG, "[zstd-d] sendOneDictUrl hashStr=" + r1, r44, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x061a, code lost:
        r19 = r2;
        r11 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07ea A[Catch: IOException -> 0x07ef, TRY_LEAVE, TryCatch #2 {IOException -> 0x07ef, blocks: (B:339:0x07e5, B:341:0x07ea), top: B:749:0x07e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186 A[Catch: all -> 0x00d0, Exception -> 0x00db, IOException -> 0x00ea, CancellationException -> 0x00f9, SSLException -> 0x0108, SSLHandshakeException -> 0x011b, ConnectException -> 0x012e, ConnectTimeoutException -> 0x013d, SocketTimeoutException -> 0x014c, UnknownHostException -> 0x015b, TRY_ENTER, TryCatch #185 {SSLHandshakeException -> 0x011b, SSLException -> 0x0108, Exception -> 0x00db, blocks: (B:38:0x016f, B:40:0x0175, B:44:0x0186, B:47:0x0201), top: B:793:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0201 A[Catch: all -> 0x00d0, Exception -> 0x00db, IOException -> 0x00ea, CancellationException -> 0x00f9, SSLException -> 0x0108, SSLHandshakeException -> 0x011b, ConnectException -> 0x012e, ConnectTimeoutException -> 0x013d, SocketTimeoutException -> 0x014c, UnknownHostException -> 0x015b, TRY_LEAVE, TryCatch #185 {SSLHandshakeException -> 0x011b, SSLException -> 0x0108, Exception -> 0x00db, blocks: (B:38:0x016f, B:40:0x0175, B:44:0x0186, B:47:0x0201), top: B:793:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0c44 A[Catch: all -> 0x0c49, TryCatch #19 {all -> 0x0c49, blocks: (B:623:0x0c3e, B:625:0x0c44, B:629:0x0c4f, B:631:0x0c5a, B:633:0x0c6a, B:643:0x0cd7, B:653:0x0d3a, B:702:0x0eda, B:712:0x0f3d, B:722:0x0fa0, B:732:0x1001), top: B:753:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0c5a A[Catch: all -> 0x0c49, TryCatch #19 {all -> 0x0c49, blocks: (B:623:0x0c3e, B:625:0x0c44, B:629:0x0c4f, B:631:0x0c5a, B:633:0x0c6a, B:643:0x0cd7, B:653:0x0d3a, B:702:0x0eda, B:712:0x0f3d, B:722:0x0fa0, B:732:0x1001), top: B:753:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0cbe A[Catch: IOException -> 0x0cc3, TRY_LEAVE, TryCatch #141 {IOException -> 0x0cc3, blocks: (B:637:0x0cb9, B:639:0x0cbe), top: B:776:0x0cb9 }] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0d21 A[Catch: IOException -> 0x0d26, TRY_LEAVE, TryCatch #128 {IOException -> 0x0d26, blocks: (B:647:0x0d1c, B:649:0x0d21), top: B:772:0x0d1c }] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0d84 A[Catch: IOException -> 0x0d89, TRY_LEAVE, TryCatch #57 {IOException -> 0x0d89, blocks: (B:657:0x0d7f, B:659:0x0d84), top: B:758:0x0d7f }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0ddc A[Catch: all -> 0x0dfe, TRY_LEAVE, TryCatch #215 {all -> 0x0dfe, blocks: (B:663:0x0da1, B:665:0x0ddc, B:669:0x0dfa, B:674:0x0e0a, B:684:0x0e45, B:686:0x0e80, B:689:0x0e9c, B:692:0x0ea3), top: B:786:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027f A[Catch: all -> 0x0b7c, Exception -> 0x0b87, IOException -> 0x0b96, CancellationException -> 0x0ba7, SSLException -> 0x0bb8, SSLHandshakeException -> 0x0bc9, ConnectException -> 0x0bda, ConnectTimeoutException -> 0x0beb, SocketTimeoutException -> 0x0bfc, UnknownHostException -> 0x0c0d, TRY_ENTER, TRY_LEAVE, TryCatch #145 {all -> 0x0b7c, blocks: (B:11:0x00bb, B:12:0x00bf, B:41:0x017d, B:57:0x0244, B:67:0x027f), top: B:753:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0e28 A[Catch: IOException -> 0x0e2d, TRY_LEAVE, TryCatch #202 {IOException -> 0x0e2d, blocks: (B:678:0x0e23, B:680:0x0e28), top: B:781:0x0e23 }] */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0e80 A[Catch: all -> 0x0dfe, TRY_LEAVE, TryCatch #215 {all -> 0x0dfe, blocks: (B:663:0x0da1, B:665:0x0ddc, B:669:0x0dfa, B:674:0x0e0a, B:684:0x0e45, B:686:0x0e80, B:689:0x0e9c, B:692:0x0ea3), top: B:786:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0eb7  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0ec1 A[Catch: IOException -> 0x0ec6, TRY_LEAVE, TryCatch #139 {IOException -> 0x0ec6, blocks: (B:696:0x0ebc, B:698:0x0ec1), top: B:774:0x0ebc }] */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0f24 A[Catch: IOException -> 0x0f29, TRY_LEAVE, TryCatch #127 {IOException -> 0x0f29, blocks: (B:706:0x0f1f, B:708:0x0f24), top: B:770:0x0f1f }] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0f7d  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0f87 A[Catch: IOException -> 0x0f8c, TRY_LEAVE, TryCatch #69 {IOException -> 0x0f8c, blocks: (B:716:0x0f82, B:718:0x0f87), top: B:764:0x0f82 }] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0fe0  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0fea A[Catch: IOException -> 0x0fee, TRY_LEAVE, TryCatch #4 {IOException -> 0x0fee, blocks: (B:726:0x0fe5, B:728:0x0fea), top: B:751:0x0fe5 }] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x1041  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x104b A[Catch: IOException -> 0x104f, TRY_LEAVE, TryCatch #220 {IOException -> 0x104f, blocks: (B:736:0x1046, B:738:0x104b), top: B:789:0x1046 }] */
    /* JADX WARN: Removed duplicated region for block: B:742:0x1057  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x1061 A[Catch: IOException -> 0x1065, TRY_LEAVE, TryCatch #229 {IOException -> 0x1065, blocks: (B:744:0x105c, B:746:0x1061), top: B:791:0x105c }] */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0fe5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0d7f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0f82 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0f1f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:772:0x0d1c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0ebc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0cb9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0e23 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:789:0x1046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:791:0x105c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:799:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:832:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r18v47 */
    /* JADX WARN: Type inference failed for: r18v54 */
    /* JADX WARN: Type inference failed for: r18v55 */
    /* JADX WARN: Type inference failed for: r18v56 */
    /* JADX WARN: Type inference failed for: r18v57 */
    /* JADX WARN: Type inference failed for: r19v105 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v236 */
    /* JADX WARN: Type inference failed for: r25v237, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r25v305 */
    /* JADX WARN: Type inference failed for: r25v306 */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int sendOneDictUrl(java.util.List<anet.channel.strategy.IConnStrategy> r39, java.net.URL r40, boolean r41, long r42, java.lang.String r44, java.lang.String r45, int r46, boolean r47, long r48) {
        /*
            Method dump skipped, instructions count: 4203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.encode.ZstdResponseHelper.sendOneDictUrl(java.util.List, java.net.URL, boolean, long, java.lang.String, java.lang.String, int, boolean, long):int");
    }

    public void dueToLinkDictionary(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55408cba", new Object[]{this, str, str2});
        } else {
            ThreadPoolExecutorFactory.submitDownloaderExecutorTask(new Runnable() { // from class: anet.channel.encode.ZstdResponseHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    UseAsDictionary useAsDictionary;
                    String str3;
                    boolean z;
                    String str4;
                    String str5 = "https";
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!ZstdDictHelper.isCanUpdate(str, str2)) {
                            ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary not allow update ", str2, new Object[0]);
                            return;
                        }
                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary first download or dict use finish, can update", str2, new Object[0]);
                        ZstdResponseHelper zstdResponseHelper = ZstdResponseHelper.this;
                        if (!(zstdResponseHelper.latestDictionary == null || (useAsDictionary = zstdResponseHelper.useAsDictionary) == null)) {
                            long j = useAsDictionary.ttl;
                            ZstdAttributes zstdAttributesByUrlKey = ZstdDictHelper.getZstdAttributesByUrlKey(str, str2);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (zstdAttributesByUrlKey != null) {
                                long j2 = zstdAttributesByUrlKey.lastZstdLinkDictTime;
                                if (j2 != -1 && currentTimeMillis - j2 < AwcnConfig.getZstdLinkDictIntervalTime()) {
                                    ALog.e(ZstdResponseHelper.TAG, "[zstd-d] not allow dueToLinkDictionary!", str2, "urlKey", str, "intervalTime", Long.valueOf(currentTimeMillis - zstdAttributesByUrlKey.lastZstdLinkDictTime));
                                    return;
                                }
                            }
                            if (zstdAttributesByUrlKey != null) {
                                zstdAttributesByUrlKey.setTtl(j);
                                str3 = ZstdDictHelper.getDictKeyByZstdAttributes(str, zstdAttributesByUrlKey, str2);
                            } else {
                                str3 = null;
                            }
                            if (str3 != null && !str3.isEmpty()) {
                                z = false;
                                boolean z2 = z && !str3.equalsIgnoreCase(ZstdResponseHelper.this.latestDictionary.hash);
                                str4 = ZstdResponseHelper.this.latestDictionary.link;
                                if (str4 != null || str4.isEmpty() || (!z && !z2)) {
                                    ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary not need update", str2, new Object[0]);
                                    return;
                                }
                                if (zstdAttributesByUrlKey != null) {
                                    zstdAttributesByUrlKey.lastZstdLinkDictTime = currentTimeMillis;
                                }
                                ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary need update", str2, new Object[0]);
                                boolean startsWith = ZstdResponseHelper.this.latestDictionary.link.startsWith(str5);
                                URL url = new URL(ZstdResponseHelper.this.latestDictionary.link);
                                if (!startsWith) {
                                    str5 = "http";
                                }
                                String host = url.getHost();
                                List<IConnStrategy> prepareConnStrategy = DispatchHelper.prepareConnStrategy(str5, host);
                                ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary get strategies: host=" + host, str2, "strategies", prepareConnStrategy);
                                long currentTimeMillis2 = System.currentTimeMillis();
                                int i = 0;
                                while (i <= 1) {
                                    if (ZstdResponseHelper.access$000(ZstdResponseHelper.this, prepareConnStrategy, url, z2, j, str2, str, i, startsWith, currentTimeMillis2) != 0) {
                                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary sendOneDictUrl break retry=" + i, str2, new Object[0]);
                                        return;
                                    }
                                    i++;
                                    url = url;
                                    j = j;
                                }
                                return;
                            }
                            z = true;
                            if (z) {
                            }
                            str4 = ZstdResponseHelper.this.latestDictionary.link;
                            if (str4 != null) {
                            }
                            ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary not need update", str2, new Object[0]);
                            return;
                        }
                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary  null", str2, new Object[0]);
                    } catch (Exception e) {
                        ALog.e(ZstdResponseHelper.TAG, "[zstd-d] dueToLinkDictionary  error=" + e.toString(), str2, new Object[0]);
                    }
                }
            });
        }
    }

    public static Pair<crx, Pair<ZstdDecompressDict, ZstdStreamInflater>> getZstdInputStream(InputStream inputStream, DispatchZstdDictEvent dispatchZstdDictEvent, int i, PublicNetworkErrorStatistic publicNetworkErrorStatistic, String str) {
        Pair<crx, Pair<ZstdDecompressDict, ZstdStreamInflater>> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("60398e4a", new Object[]{inputStream, dispatchZstdDictEvent, new Integer(i), publicNetworkErrorStatistic, str});
        }
        if (dispatchZstdDictEvent == null) {
            return null;
        }
        try {
            ZstdResponseHelper parseZstdResponseHeader = new ZstdResponseHelper().parseZstdResponseHeader(dispatchZstdDictEvent.urlKey, dispatchZstdDictEvent.contentEncodeStr, dispatchZstdDictEvent.useAsDictionaryStr, dispatchZstdDictEvent.LatestDictionaryStr, str);
            if (parseZstdResponseHeader != null) {
                byte[] dictionary = parseZstdResponseHeader.getDictionary(dispatchZstdDictEvent.urlKey, str);
                if (!EncodingHelper.isZstdValid() || !AwcnConfig.isZstdDictDecompressOpened() || dictionary == null) {
                    pair = null;
                } else {
                    pair = EncodingHelper.getZstdDictInputStream(dictionary, inputStream, str);
                    publicNetworkErrorStatistic.strArg1 = "real_zstd-d";
                    ALog.e(TAG, "[zstd-d] getZstdInputStream zstd dict decompress get inputStream success!", str, new Object[0]);
                }
                parseZstdResponseHeader.dueToLinkDictionary(dispatchZstdDictEvent.urlKey, str);
                return pair;
            }
        } catch (Exception e) {
            ALog.e(TAG, "[zstd-d] getZstdInputStream error=" + e.toString(), str, new Object[0]);
        }
        return null;
    }

    private void commitErrorStatistic(ZstdLinkStatistic zstdLinkStatistic, int i, String str, String str2, int i2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d526a0", new Object[]{this, zstdLinkStatistic, new Integer(i), str, str2, new Integer(i2), str3, str4});
        } else if ((i >= 1 || str3.equalsIgnoreCase("1")) && zstdLinkStatistic != null) {
            zstdLinkStatistic.updateMsg = "update" + str;
            zstdLinkStatistic.ret = str3;
            zstdLinkStatistic.errMsg = str2;
            zstdLinkStatistic.responseCode = i2;
            AppMonitor.getInstance().commitStat(zstdLinkStatistic);
            ALog.e(TAG, "[zstd-d] commitErrorStatistic send link pss=" + zstdLinkStatistic.toString(), str4, new Object[0]);
        }
    }

    private UseAsDictionary parseUseAsDictionary(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UseAsDictionary) ipChange.ipc$dispatch("f9d9b9f1", new Object[]{this, str, str2});
        }
        if (this.useAsDictionary == null) {
            this.useAsDictionary = new UseAsDictionary();
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split(",")) {
            String[] split = str3.split("=");
            String trim = split[0].trim();
            String trim2 = split[1].trim();
            if (pg1.ATOM_EXT_match.equalsIgnoreCase(trim)) {
                this.useAsDictionary.matchPath = trim2.replace("\"", "");
                sb.append("[match]=");
                sb.append(this.useAsDictionary.matchPath);
            } else if (RemoteMessageConst.TTL.equalsIgnoreCase(trim)) {
                this.useAsDictionary.ttl = Long.parseLong(split[1]);
                sb.append(" ,[ttl]=");
                sb.append(this.useAsDictionary.ttl);
            } else if ("type".equalsIgnoreCase(trim)) {
                this.useAsDictionary.dictType = trim2.replace("\"", "");
                sb.append(" ,[dictType]=");
                sb.append(this.useAsDictionary.dictType);
            } else if ("hashes".equalsIgnoreCase(trim)) {
                this.useAsDictionary.hashes = split[1];
                sb.append(" ,[hashes]=");
                sb.append(this.useAsDictionary.hashes);
            }
        }
        ALog.e(TAG, "[zstd-d] parseUseAsDictionary msg= " + sb.toString(), str2, new Object[0]);
        return this.useAsDictionary;
    }

    public byte[] getDictionary(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("de0e716", new Object[]{this, str, str2});
        }
        String str3 = this.contentEncodeType;
        if (str3 == null || !"zstd-d".equalsIgnoreCase(str3)) {
            ALog.e(TAG, "[zstd-d] getDictionary null, contentEncode is " + this.contentEncodeType, str2, new Object[0]);
            return null;
        }
        ZstdAttributes zstdAttributesByUrlKey = ZstdDictHelper.getZstdAttributesByUrlKey(str, str2);
        byte[] dictByUrlKey = ZstdDictHelper.getDictByUrlKey(str, ZstdDictHelper.getDictKeyByZstdAttributes(str, zstdAttributesByUrlKey, str2), str2);
        if (zstdAttributesByUrlKey != null) {
            zstdAttributesByUrlKey.setCanUpdate(true);
        }
        if (dictByUrlKey != null && dictByUrlKey.length != 0) {
            return dictByUrlKey;
        }
        ALog.e(TAG, "[zstd-d] dueToDictionary null,urlKey=" + str, str2, new Object[0]);
        return null;
    }

    public ZstdResponseHelper parseZstdResponseHeader(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZstdResponseHelper) ipChange.ipc$dispatch("9f9a1410", new Object[]{this, str, str2, str3, str4, str5});
        }
        if (str2 == null || str2.isEmpty() || !str2.contains("zstd-d")) {
            ALog.e(TAG, "[zstd-d] parseZstdResponseHeader contentEncode not zstd-d", str5, "contentEncode=", str2);
        } else {
            this.contentEncodeType = "zstd-d";
            ALog.e(TAG, "[zstd-d] parseZstdResponseHeader contentEncode is zstd", str5, new Object[0]);
        }
        if (str3 != null && !str3.isEmpty()) {
            parseUseAsDictionary(str3, str5);
            ZstdDictHelper.updateMatchPath(this.useAsDictionary, str, str5);
        }
        if (str4 != null && !str4.isEmpty()) {
            parseLatestDictionary(str4, str5);
        }
        return this;
    }
}
