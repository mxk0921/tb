package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class eas {
    public static final String TMS_ERR_APPINFO_PREFIX = "TMS_ERR_AI_";
    public static final String TMS_ERR_ENGINE_MIX_DATA = "TMS_ERR_ENGINE_MIX_DATA";
    public static final String TMS_ERR_ENGINE_MIX_H5_RENDER = "TMS_ERR_ENGINE_MIX_H5_RENDER";
    public static final String TMS_ERR_RENDER_PREFIX = "TMS_ERR_";
    public static final eas e = new eas("TMS_ERR_ENGINE_INVALID", "当前手淘版本不支持这种类型的engine", "升级到客户端最新版本才能打开这个页面");
    public static final eas f = new eas("TMS_ERR_GET_PREFETCH_APPINFO", "TMS_ERR_GET_PREFETCH_APPINFO", "别紧张，休息一会再来试试吧...");
    public static final eas g = new eas("TMS_ERR_CANVAS_LOAD_FAIL", "themis_graphics remoteSo 加载失败", "对不起，加载失败，请尝试重新打开当前页面");
    public static final eas h = new eas("TMS_ERR_CAN_NOT_CREATE_PAGE", "Page创建失败", "对不起，加载失败，请尝试重新打开当前页面");
    public static final eas i = new eas("TMS_PAGE_ERROR", "页面错误，需要降级", "页面错误，需要降级");
    public static final eas j = new eas("TMS_DEPRECATED_DOWNGRADE", "页面错误，需要降级", "页面错误，需要降级");
    public static final eas k = new eas("TMS_ERROR_PHA_DOWNGRADE", "PHA轻应用已下线", "PHA轻应用已下线", "应用已下线", "您访问的应用已下线，可以逛逛其它的");

    /* renamed from: a  reason: collision with root package name */
    public final String f18428a;
    public final String b;
    public final String c;
    public final String d;

    public eas(String str, String str2, String str3) {
        this.f18428a = str;
        this.b = str2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static final String TMS_ERR_MANIFEST_PREFIX = "TMS_ERR_MT_";
        public static final String TMS_ERR_MANIFEST_RAPID_PREFIX = "TMS_ERR_MT_RAPID_";
        public static final eas URL_NOT_MATCH = new eas("TMS_ERR_MT_URL_NOT_MATCH", "Manifest内页url与投放链接url不匹配", "对不起，加载失败，请尝试重新打开当前页面");
        public static final eas APP_ID_DIS_MATCH = new eas("TMS_ERR_MT_APPID_DISMATCH", "当前UniApp打开页面的appID与manifest不匹配", "");
        public static final eas URL_EMPTY = new eas("TMS_ERR_MT_URL_EMPTY", "Manifest请求URL为空", "对不起，加载失败，请尝试重新打开当前页面");

        static {
            t2o.a(839909400);
        }
    }

    static {
        t2o.a(839909399);
    }

    public eas(String str, String str2, String str3, String str4, String str5) {
        this.f18428a = str;
        this.b = str2;
        this.c = str4;
        this.d = str5;
    }
}
