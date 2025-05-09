package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h11 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_REQUEST = "request";
    public static final String ALLOWED_DOMAIN = "allowedDomain";
    public static final String CONNECT_WEB_SOCKET = "connectWebSocket";
    public static final a Companion = new a(null);
    public static final String ENABLE_PROXY = "Enable_Proxy";
    public static final String EVENT_LIST = "EVENT_List";
    public static final String FORCE_USE_SSL = "ForceUseSSL";
    public static final String HTTPREQUET = "httpRequest";
    public static final String HTTP_LINK_SUB_RES_MIME_LIST = "HttpLink_SubResMimeList";
    public static final String JS_API_LIST = "JSAPI_List";
    public static final String JS_API_SP_CONFIG = "JSAPI_SP_Config";
    public static final String RESOURCE = "resource";
    public static final String START_APP = "startApp";
    public static final String UPLOAD_FILE = "uploadFile";
    public static final String VALID_DOMAIN = "validDomain";
    public static final String VALID_SUB_RES_MIME_LIST = "Valid_SubResMimeList";
    public static final String WEBSOCKET = "connectSocket";
    public static final String WEB_VIEW_CONFIG = "Webview_Config";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f20356a = new HashMap();
    public final Map<String, String> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055376);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055375);
    }

    public final Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d51beba", new Object[]{this});
        }
        return this.f20356a;
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea13934d", new Object[]{this});
        }
        return this.b;
    }
}
