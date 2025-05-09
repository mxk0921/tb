package com.alipay.android.msp.framework.preload;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.android.msp.network.http.http.PhoneCashierHttpClient;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.Header;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PreloadConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Header a(String str, Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header) ipChange.ipc$dispatch("55b45db8", new Object[]{str, headerArr});
        }
        if (headerArr == null || headerArr.length <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (Header header : headerArr) {
            String name = header.getName();
            if (!TextUtils.isEmpty(name) && TextUtils.equals(name.toLowerCase(), lowerCase)) {
                return header;
            }
        }
        return null;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("500f2a51", new Object[]{str});
        }
        try {
            return new URI(str).getAuthority();
        } catch (URISyntaxException e) {
            LogUtil.printExceptionStackTrace(e);
            return DnsValue.DOMAIN_MOBILE_GW;
        }
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        PhoneCashierHttpClient.newInstance().shutdown();
        LogUtil.record(1, "PreloadConnection", "Preload shutdown");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:(2:21|22)|69|23|(4:30|(1:32)(1:33)|34|(14:36|(1:38)|39|(1:41)|42|(1:44)|45|(1:47)|48|71|49|50|54|(1:1)(1:76)))|27|(0)|39|(0)|42|(0)|45|(0)|48|71|49|50|54|(3:74|57|75)(1:73)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016f, code lost:
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0170, code lost:
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
        shutdown();
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[Catch: all -> 0x007e, TryCatch #2 {all -> 0x007e, blocks: (B:23:0x0052, B:25:0x0073, B:30:0x0081, B:32:0x0093, B:33:0x00a2, B:34:0x00b0, B:36:0x00b6, B:38:0x00c1, B:39:0x00c7, B:41:0x010f, B:42:0x0112, B:44:0x011a, B:45:0x011d, B:47:0x0126, B:48:0x012d), top: B:69:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[Catch: all -> 0x007e, TryCatch #2 {all -> 0x007e, blocks: (B:23:0x0052, B:25:0x0073, B:30:0x0081, B:32:0x0093, B:33:0x00a2, B:34:0x00b0, B:36:0x00b6, B:38:0x00c1, B:39:0x00c7, B:41:0x010f, B:42:0x0112, B:44:0x011a, B:45:0x011d, B:47:0x0126, B:48:0x012d), top: B:69:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a A[Catch: all -> 0x007e, TryCatch #2 {all -> 0x007e, blocks: (B:23:0x0052, B:25:0x0073, B:30:0x0081, B:32:0x0093, B:33:0x00a2, B:34:0x00b0, B:36:0x00b6, B:38:0x00c1, B:39:0x00c7, B:41:0x010f, B:42:0x0112, B:44:0x011a, B:45:0x011d, B:47:0x0126, B:48:0x012d), top: B:69:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126 A[Catch: all -> 0x007e, TryCatch #2 {all -> 0x007e, blocks: (B:23:0x0052, B:25:0x0073, B:30:0x0081, B:32:0x0093, B:33:0x00a2, B:34:0x00b0, B:36:0x00b6, B:38:0x00c1, B:39:0x00c7, B:41:0x010f, B:42:0x0112, B:44:0x011a, B:45:0x011d, B:47:0x0126, B:48:0x012d), top: B:69:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[ADDED_TO_REGION, EDGE_INSN: B:73:0x0183->B:59:0x0183 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean startConnect() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.preload.PreloadConnection.startConnect():boolean");
    }
}
