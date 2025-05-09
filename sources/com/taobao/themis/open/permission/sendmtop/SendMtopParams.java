package com.taobao.themis.open.permission.sendmtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.ov2;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010%\n\u0002\b\t\u0018\u0000 ]2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010(\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR$\u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR\"\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0016\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\"\u0010B\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0016\u001a\u0004\bC\u0010\u0018\"\u0004\bD\u0010\u001aR\"\u0010E\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010 \u001a\u0004\bF\u0010\"\"\u0004\bG\u0010$R\"\u0010H\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0016\u001a\u0004\bI\u0010\u0018\"\u0004\bJ\u0010\u001aR\"\u0010K\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0016\u001a\u0004\bL\u0010\u0018\"\u0004\bM\u0010\u001aR\"\u0010N\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0016\u001a\u0004\bO\u0010\u0018\"\u0004\bP\u0010\u001aR\"\u0010Q\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010 \u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$R\"\u0010T\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010 \u001a\u0004\bT\u0010\"\"\u0004\bU\u0010$R \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010XR\u001f\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b[\u0010\u0007¨\u0006_"}, d2 = {"Lcom/taobao/themis/open/permission/sendmtop/SendMtopParams;", "Ljava/io/Serializable;", "<init>", "()V", "", "", "getDataMap", "()Ljava/util/Map;", "getHeaders", "getParameterMap", "key", "value", "Ltb/xhv;", "addParameterMap", "(Ljava/lang/String;Ljava/lang/String;)V", "addData", "addHeader", "addExtraDara", "headers", "setHeaders", "(Ljava/util/Map;)V", "api", "Ljava/lang/String;", "getApi", "()Ljava/lang/String;", "setApi", "(Ljava/lang/String;)V", "v", "getV", "setV", "", ICallService.KEY_NEED_LOGIN, "Z", "getNeedLogin", "()Z", "setNeedLogin", "(Z)V", "forceLogin", "getForceLogin", "setForceLogin", "dataType", "getDataType", "setDataType", "method", "getMethod", "setMethod", "", "wuaFlag", TLogTracker.LEVEL_INFO, "getWuaFlag", "()I", "setWuaFlag", "(I)V", "ttid", "getTtid", "setTtid", "", "timer", "J", "getTimer", "()J", "setTimer", "(J)V", "mpHost", "getMpHost", "setMpHost", "userAgent", "getUserAgent", "setUserAgent", "post", "getPost", "setPost", "pageUrl", "getPageUrl", "setPageUrl", "sessionOption", "getSessionOption", "setSessionOption", ov2.ALIPAY_ACCOUNT_SITE, "getAccountSite", "setAccountSite", "useCache", "getUseCache", "setUseCache", "isAddISVHeader", "setAddISVHeader", "", "dataMap", "Ljava/util/Map;", "parameterMap", "extraData", "getExtraDataMap", "extraDataMap", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class SendMtopParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final long serialVersionUID = -33061885727159462L;
    private boolean forceLogin;
    private boolean isAddISVHeader;
    private String method;
    private boolean needLogin;
    private boolean post;
    private long timer;
    private boolean useCache;
    private String api = "";
    private String v = "";
    private String dataType = "originaljson";
    private int wuaFlag = -1;
    private String ttid = "";
    private String mpHost = "";
    private String userAgent = "";
    private String pageUrl = "";
    private String sessionOption = "";
    private String accountSite = "";
    private final Map<String, String> dataMap = new HashMap();
    private final Map<String, String> parameterMap = new HashMap();
    private final Map<String, String> headers = new HashMap();
    private final Map<String, String> extraData = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055383);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055382);
    }

    public final void addData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        this.dataMap.put(str, str2);
    }

    public final void addExtraDara(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5121a716", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        this.extraData.put(str, str2);
    }

    public final void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        this.headers.put(str, str2);
    }

    public final void addParameterMap(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae4e4f", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        this.parameterMap.put(str, str2);
    }

    public final String getAccountSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82d9dfdb", new Object[]{this});
        }
        return this.accountSite;
    }

    public final String getApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.api;
    }

    public final Map<String, String> getDataMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3847098", new Object[]{this});
        }
        return this.dataMap;
    }

    public final String getDataType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this});
        }
        return this.dataType;
    }

    public final Map<String, String> getExtraDataMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("266c7214", new Object[]{this});
        }
        return this.extraData;
    }

    public final boolean getForceLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb3211bf", new Object[]{this})).booleanValue();
        }
        return this.forceLogin;
    }

    public final Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.headers;
    }

    public final String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.method;
    }

    public final String getMpHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9a24b8", new Object[]{this});
        }
        return this.mpHost;
    }

    public final boolean getNeedLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e9333c8", new Object[]{this})).booleanValue();
        }
        return this.needLogin;
    }

    public final String getPageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        return this.pageUrl;
    }

    public final Map<String, String> getParameterMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3226f5a5", new Object[]{this});
        }
        return this.parameterMap;
    }

    public final boolean getPost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e70aa1", new Object[]{this})).booleanValue();
        }
        return this.post;
    }

    public final String getSessionOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85801f24", new Object[]{this});
        }
        return this.sessionOption;
    }

    public final long getTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("287d28a", new Object[]{this})).longValue();
        }
        return this.timer;
    }

    public final String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return this.ttid;
    }

    public final boolean getUseCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f39d7bc", new Object[]{this})).booleanValue();
        }
        return this.useCache;
    }

    public final String getUserAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a235", new Object[]{this});
        }
        return this.userAgent;
    }

    public final String getV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this});
        }
        return this.v;
    }

    public final int getWuaFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("479e7313", new Object[]{this})).intValue();
        }
        return this.wuaFlag;
    }

    public final boolean isAddISVHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9edcc6d", new Object[]{this})).booleanValue();
        }
        return this.isAddISVHeader;
    }

    public final void setAccountSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0194a63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.accountSite = str;
    }

    public final void setAddISVHeader(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef681b53", new Object[]{this, new Boolean(z)});
        } else {
            this.isAddISVHeader = z;
        }
    }

    public final void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.api = str;
    }

    public final void setDataType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3e1e97", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.dataType = str;
    }

    public final void setForceLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e771ed", new Object[]{this, new Boolean(z)});
        } else {
            this.forceLogin = z;
        }
    }

    public final void setHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
            return;
        }
        Map<String, String> map2 = this.headers;
        ckf.d(map);
        map2.putAll(map);
    }

    public final void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.method = str;
        }
    }

    public final void setMpHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63545fbe", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.mpHost = str;
    }

    public final void setNeedLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bca5f9c", new Object[]{this, new Boolean(z)});
        } else {
            this.needLogin = z;
        }
    }

    public final void setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.pageUrl = str;
    }

    public final void setPost(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04ebc4b", new Object[]{this, new Boolean(z)});
        } else {
            this.post = z;
        }
    }

    public final void setSessionOption(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f23a73a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.sessionOption = str;
    }

    public final void setTimer(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9744fa", new Object[]{this, new Long(j)});
        } else {
            this.timer = j;
        }
    }

    public final void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.ttid = str;
    }

    public final void setUseCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad83890", new Object[]{this, new Boolean(z)});
        } else {
            this.useCache = z;
        }
    }

    public final void setUserAgent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac96049", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.userAgent = str;
    }

    public final void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.v = str;
    }

    public final void setWuaFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2795eef", new Object[]{this, new Integer(i)});
        } else {
            this.wuaFlag = i;
        }
    }
}
