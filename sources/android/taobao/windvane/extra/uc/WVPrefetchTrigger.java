package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.export.network.a;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.Request;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.f7l;
import tb.gtw;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.yaa;
import tb.zpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVPrefetchTrigger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVPrefetchTrigger";
    private static volatile WVPrefetchTrigger mWVPrefetchTrigger;
    private static final Map<String, WVPrefetchNetworkAdapter> mPrefetchNetwork = new ConcurrentHashMap();
    public static int retryTimes = 1;
    public static int connectTimeout = 10000;
    public static int readTimeout = 10000;

    static {
        t2o.a(989856097);
    }

    private WVPrefetchTrigger() {
    }

    private Request formatAliRequest(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2, boolean z2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("5a4b0f59", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2), new Boolean(z2), str3});
        }
        try {
            RequestImpl requestImpl = new RequestImpl(str);
            requestImpl.setFollowRedirects(false);
            requestImpl.setBizId(str3);
            requestImpl.setRetryTime(retryTimes);
            requestImpl.setConnectTimeout(connectTimeout);
            requestImpl.setReadTimeout(readTimeout);
            requestImpl.setMethod(str2);
            if (map != null) {
                requestImpl.addHeader("f-refer", "wv_h5");
                UCNetworkDelegate.getInstance().onSendRequest(map, str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    requestImpl.addHeader(key, value);
                    v7t.a(TAG, "AliRequestAdapter from uc header key=" + key + ",value=" + value);
                }
            }
            return requestImpl;
        } catch (Exception e) {
            v7t.d(TAG, " AliRequestAdapter formatAliRequest Exception" + e.getMessage());
            return null;
        }
    }

    public static WVPrefetchTrigger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPrefetchTrigger) ipChange.ipc$dispatch("da8701af", new Object[0]);
        }
        if (mWVPrefetchTrigger == null) {
            synchronized (WVPrefetchTrigger.class) {
                try {
                    if (mWVPrefetchTrigger == null) {
                        mWVPrefetchTrigger = new WVPrefetchTrigger();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mWVPrefetchTrigger;
    }

    private void mockHeaders(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0375fb8", new Object[]{this, str, map});
            return;
        }
        map.put("Cookie", zpw.a(str));
        map.put(HttpRequest.HEADER_ACCEPT, "*/*");
        map.put("X-Requested-With", "com.taobao.taobao");
        StringBuilder sb = new StringBuilder();
        vpw.b();
        wpw wpwVar = vpw.commonConfig;
        if (!TextUtils.isEmpty(wpwVar.d0)) {
            vpw.b();
            sb.append(wpwVar.d0);
        }
        String a2 = yaa.f().a();
        String b = yaa.f().b();
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(b)) {
            sb.append(" AliApp(");
            sb.append(a2);
            sb.append("/");
            sb.append(b);
            sb.append(f7l.BRACKET_END_STR);
        }
        if (!TextUtils.isEmpty(yaa.f().g())) {
            sb.append(" TTID/");
            sb.append(yaa.f().g());
        }
        sb.append(yaa.DEFAULT_UA);
        map.put(HttpConstant.USER_AGENT, sb.toString());
        map.put("Accept-Encoding", a.ACCEPTENCODING);
        map.put(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, "zh-CN,zh-CN;q=0.9,en-US;q=0.8");
    }

    public WVPrefetchNetworkAdapter getPrefetchNetworkAdapter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPrefetchNetworkAdapter) ipChange.ipc$dispatch("e640b03b", new Object[]{this, str});
        }
        return mPrefetchNetwork.get(gtw.c(str));
    }

    public boolean hasPrefetchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb020d13", new Object[]{this, str})).booleanValue();
        }
        return mPrefetchNetwork.containsKey(gtw.c(str));
    }

    public void preloadMainHtml(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eefdede", new Object[]{this, context, str});
            return;
        }
        vpw.b();
        preloadMainHtml(context, str, vpw.commonConfig.b0);
    }

    public void preloadMainHtml(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0c73a6", new Object[]{this, context, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        v7t.a(TAG, "preloadMainHtml url=" + str);
        HashMap hashMap = new HashMap();
        mockHeaders(str, hashMap);
        WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter = new WVPrefetchNetworkAdapter(context, ABGlobal.isFeatureOpened(context, "WVPrefetchNetType") ? 2 : 0, j, formatAliRequest(str, "GET", false, hashMap, null, null, null, 0L, 4, 0, true, "windvane"));
        mPrefetchNetwork.put(gtw.c(str), wVPrefetchNetworkAdapter);
        v7t.a(TAG, "use time =" + (System.currentTimeMillis() - currentTimeMillis));
        wVPrefetchNetworkAdapter.sendRequest();
    }
}
