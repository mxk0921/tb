package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iv8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FCANVAS_ERROR_CREATE_EMBED_VIEW = "1002";
    public static final String FCANVAS_ERROR_DISPATCH_TOUCH_EVENT = "1004";
    public static final String FCANVAS_ERROR_ENGINE = "2006";
    public static final String FCANVAS_ERROR_INIT_CANVAS = "1003";
    public static final String FCANVAS_ERROR_JS_BINDING = "2003";
    public static final String FCANVAS_ERROR_JS_CONTEXT = "2004";
    public static final String FCANVAS_ERROR_JS_EXCEPTION = "2005";
    public static final String FCANVAS_ERROR_JS_LOGIC = "2001";
    public static final String FCANVAS_ERROR_JS_THREAD = "2002";
    public static final String FCANVAS_ERROR_LOADLIBRARY = "1001";
    public static final String FCANVAS_ERROR_LOAD_IMAGE = "1005";
    public static final String FCANVAS_ERROR_NONE = "2000";
    public static final String FCANVAS_ERROR_OPEN_GL = "2007";
    public static final String FCANVAS_ERROR_UNKNOWN = "1000";

    static {
        t2o.a(834666507);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c623f59", new Object[]{str, str2, str3});
        }
    }
}
