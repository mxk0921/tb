package anetwork.channel.cookie;

import android.webkit.CookieManager;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkCookieHandler extends CookieHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CookieManager cm;

    static {
        t2o.a(607126035);
    }

    public NetworkCookieHandler(CookieManager cookieManager) {
        this.cm = cookieManager;
    }

    public static /* synthetic */ Object ipc$super(NetworkCookieHandler networkCookieHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anetwork/channel/cookie/NetworkCookieHandler");
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        CookieManager cookieManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c41deedb", new Object[]{this, uri, map});
        }
        if (!CookieManager.checkSetup() || !CookieManager.isCookieValid) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            cookieManager = this.cm;
        } catch (Throwable th) {
            ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] get cookie failed", null, th, "url", uri.toString(), "\nheaders", map);
        }
        if (!(cookieManager == null || uri == null)) {
            String cookie = cookieManager.getCookie(uri.toString());
            if (cookie != null && !cookie.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(cookie);
                hashMap.put("Cookie", arrayList);
            }
            return hashMap;
        }
        ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] get, cm or uri is null", null, "url", uri.toString(), "\nheaders", map);
        return hashMap;
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f034e8d", new Object[]{this, uri, map});
        } else if (CookieManager.checkSetup() && CookieManager.isCookieValid) {
            if (this.cm == null || uri == null) {
                ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] put, cm or uri is null", null, "url", uri.toString(), "\nheaders", map);
                return;
            }
            String uri2 = uri.toString();
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        if (!key.equalsIgnoreCase("Set-Cookie") && !key.equalsIgnoreCase(HttpConstant.SET_COOKIE2)) {
                        }
                        for (String str : entry.getValue()) {
                            this.cm.setCookie(uri2, str);
                            if (AwcnConfig.isHostInCookiePrintLogWhiteList(uri.getHost())) {
                                ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] set cookie.", null, "url", uri2, "cookies", str);
                            }
                            this.cm.flush();
                        }
                    }
                }
            } catch (Throwable th) {
                ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] set cookie failed", null, th, "url", uri2, "\nheaders", map);
            }
        }
    }
}
