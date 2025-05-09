package android.taobao.windvane.extra.uc.preRender;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.preRender.PreRenderWebView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.URLUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.gtw;
import tb.t2o;
import tb.v7t;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BasePreInitManager<WebView extends PreRenderWebView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTACH_EVENT = "WV.Event.Preload.Attach";
    public static final String INJECT_JS = "injectJs";
    private static final String KEY_EXTRA_FULL_URL = "fullUrl";
    public static final String ONLOAD_EVENT = "WV.Event.Preload.OnLoad";
    public static final String PRE_RENDER_URL_ADDITION = "&_wv_preload=true";
    public static final String PRE_RENDER_URL_ADDITION_JUDGE = "_wv_preload=true";
    public static final String PRE_RENDER_URL_ADDITION_KEY = "_wv_preload";
    public static final String PRE_RENDER_URL_ADDITION_VALUE = "true";
    public static final String TAG = "BasePreInitManager";
    public static final String TIMEOUT = "timeout";
    public Class<WebView> WebViewClass;
    private WebView preWeb;
    private Map<String, WebView> preRenderWebViews = new HashMap();
    private Map<String, WebView> preInitWebViews = new HashMap();
    private Map<String, ScheduleProtocolCallback> callbacks = new HashMap();

    static {
        t2o.a(989856171);
    }

    public BasePreInitManager() {
        try {
            this.WebViewClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        new StringBuilder("WebViewClass ").append(this.WebViewClass);
    }

    private WebView clearCacheInQueue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ((PreRenderWebView) ipChange.ipc$dispatch("89b10fc5", new Object[]{this, str}));
        }
        if (!TextUtils.isEmpty(str)) {
            return this.preRenderWebViews.remove(str);
        }
        return null;
    }

    private String getRealKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0285824", new Object[]{this, str});
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return removeHash(str);
        }
        return str;
    }

    private String removeHash(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14e8de3d", new Object[]{this, str});
        }
        return str.split("#")[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean addPreInitWeb(String str, Context context, ScheduleProtocolCallback scheduleProtocolCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88cc271d", new Object[]{this, str, context, scheduleProtocolCallback})).booleanValue();
        }
        if (!WVCore.getInstance().isUCSupport()) {
            return false;
        }
        String realKey = getRealKey(str);
        if (this.preInitWebViews.containsKey(realKey)) {
            return false;
        }
        this.preInitWebViews.put(realKey, (PreRenderWebView) getNewObject((Class<WebView>) this.WebViewClass, new MutableContextWrapper(context)));
        if (scheduleProtocolCallback != null) {
            this.callbacks.put(realKey, scheduleProtocolCallback);
        }
        v7t.d(TAG, "add pre init webview success. key=[" + realKey + "]");
        return true;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.preWeb = null;
        }
    }

    public boolean clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c823e69f", new Object[]{this})).booleanValue();
        }
        for (WebView webview : this.preRenderWebViews.values()) {
            if (webview != null) {
                webview.destroy();
            }
        }
        for (WebView webview2 : this.preInitWebViews.values()) {
            if (webview2 != null) {
                webview2.destroy();
            }
        }
        this.preRenderWebViews.clear();
        this.preInitWebViews.clear();
        this.callbacks.clear();
        return true;
    }

    public boolean clearByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b06f490", new Object[]{this, str})).booleanValue();
        }
        String realKey = getRealKey(str);
        WebView remove = this.preRenderWebViews.remove(realKey);
        if (remove != null) {
            remove.destroy();
        }
        WebView remove2 = this.preInitWebViews.remove(realKey);
        if (remove2 != null) {
            remove2.destroy();
        }
        this.callbacks.remove(realKey);
        return true;
    }

    public <T> T getNewObject(Class<T> cls, Context context) {
        try {
            return cls.getConstructor(Context.class).newInstance(context);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public WebView getPreRender(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebView) ((PreRenderWebView) ipChange.ipc$dispatch("304f5711", new Object[]{this, str, context})) : getPreRender(str, context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WebView getPreRenderWebView(java.lang.String r10, android.content.Context r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.extra.uc.preRender.BasePreInitManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "2603d5e"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            r3 = 1
            r2[r3] = r10
            r10 = 2
            r2[r10] = r11
            java.lang.Object r10 = r0.ipc$dispatch(r1, r2)
            android.taobao.windvane.extra.uc.preRender.PreRenderWebView r10 = (android.taobao.windvane.extra.uc.preRender.PreRenderWebView) r10
            return r10
        L_0x001b:
            r0 = 0
            if (r10 == 0) goto L_0x00b5
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x0026
            goto L_0x00b5
        L_0x0026:
            java.lang.String r1 = "getPreRenderWebView for url: "
            java.lang.String r1 = r1.concat(r10)
            java.lang.String r2 = "BasePreInitManager"
            tb.v7t.d(r2, r1)
            java.lang.String r1 = r9.getRealKey(r10)
            java.util.Map<java.lang.String, WebView extends android.taobao.windvane.extra.uc.preRender.PreRenderWebView> r2 = r9.preRenderWebViews
            java.lang.Object r2 = r2.get(r1)
            android.taobao.windvane.extra.uc.preRender.PreRenderWebView r2 = (android.taobao.windvane.extra.uc.preRender.PreRenderWebView) r2
            if (r2 != 0) goto L_0x007a
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.util.Map<java.lang.String, WebView extends android.taobao.windvane.extra.uc.preRender.PreRenderWebView> r3 = r9.preRenderWebViews
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x004e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri r5 = android.net.Uri.parse(r4)
            boolean r6 = r9.isSameUrl(r5, r1)
            if (r6 == 0) goto L_0x004e
            boolean r1 = r9.isSameQuery(r5, r1)
            if (r1 == 0) goto L_0x007c
            java.util.Map<java.lang.String, WebView extends android.taobao.windvane.extra.uc.preRender.PreRenderWebView> r1 = r9.preRenderWebViews
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            android.taobao.windvane.extra.uc.preRender.PreRenderWebView r2 = (android.taobao.windvane.extra.uc.preRender.PreRenderWebView) r2
            goto L_0x007c
        L_0x007a:
            java.lang.String r4 = ""
        L_0x007c:
            if (r2 != 0) goto L_0x007f
            return r0
        L_0x007f:
            boolean r1 = r2.isPreRenderSuccess()
            if (r1 != 0) goto L_0x0086
            return r0
        L_0x0086:
            long r5 = r2.getExpireTime()
            long r7 = java.lang.System.currentTimeMillis()
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0093
            return r0
        L_0x0093:
            java.util.Map<java.lang.String, com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback> r1 = r9.callbacks
            java.lang.Object r1 = r1.get(r4)
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback r1 = (com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback) r1
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "fullUrl"
            r3.put(r4, r10)
            if (r1 == 0) goto L_0x00af
            boolean r10 = r1.resolveParameter(r10, r3)
            if (r10 != 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r0 = r2
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r0.setOuterContext(r11)
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.preRender.BasePreInitManager.getPreRenderWebView(java.lang.String, android.content.Context):android.taobao.windvane.extra.uc.preRender.PreRenderWebView");
    }

    public WebView getPreWeb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ((PreRenderWebView) ipChange.ipc$dispatch("8f9e452b", new Object[]{this}));
        }
        WebView webview = this.preWeb;
        this.preWeb = null;
        return webview;
    }

    public void setPreWeb(WebView webview) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461c0913", new Object[]{this, webview});
        } else {
            this.preWeb = webview;
        }
    }

    public void triggerRender(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f6925f", new Object[]{this, str, str2, context});
        } else {
            triggerRender(str, str2, context, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void addPreRenderWeb(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a582d1b", new Object[]{this, str, context});
            return;
        }
        PreRenderWebView preRenderWebView = (PreRenderWebView) getNewObject((Class<WebView>) this.WebViewClass, new MutableContextWrapper(context));
        preRenderWebView.preRenderInit(str);
        preRenderWebView.isPreRender = true;
        vpw.b();
        if (vpw.commonConfig.T) {
            preRenderWebView.loadUrl(gtw.a(str, PRE_RENDER_URL_ADDITION_KEY, "true"));
        } else {
            preRenderWebView.loadUrl(str.concat(PRE_RENDER_URL_ADDITION));
        }
        this.preRenderWebViews.put(getRealKey(str), preRenderWebView);
        v7t.d(TAG, "add pre render webview success. key=[" + getRealKey(str) + "], url = [" + str.concat(PRE_RENDER_URL_ADDITION) + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WebView getPreRender(java.lang.String r26, android.content.Context r27, java.util.Map<java.lang.String, java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.preRender.BasePreInitManager.getPreRender(java.lang.String, android.content.Context, java.util.Map):android.taobao.windvane.extra.uc.preRender.PreRenderWebView");
    }

    public boolean triggerRender(String str, String str2, Context context, ScheduleProtocolCallback scheduleProtocolCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a48b213", new Object[]{this, str, str2, context, scheduleProtocolCallback})).booleanValue() : triggerRender(str, str2, context, scheduleProtocolCallback, null);
    }

    private boolean isSameUrl(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbeb3d0a", new Object[]{this, uri, uri2})).booleanValue();
        }
        String host = uri.getHost();
        String host2 = uri2.getHost();
        if (!TextUtils.equals(host, host2)) {
            v7t.d(TAG, "host equal=[false],require=[" + host + "],real=[" + host2 + "]");
            return false;
        }
        String path = uri.getPath();
        String path2 = uri2.getPath();
        if (TextUtils.equals(path, path2)) {
            return true;
        }
        v7t.d(TAG, "path equal=[false],require=[" + path + "],real=[" + path2 + "]");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean triggerRender(String str, String str2, Context context, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8dae99a", new Object[]{this, str, str2, context, scheduleProtocolCallback, map})).booleanValue();
        }
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        v7t.d(TAG, "triggerRender() called with: key = [" + str + "], url = [" + str2 + "], ctx = [" + context + "], scheduleProtocolCallback = [" + scheduleProtocolCallback + "], args = [" + map + "]");
        if (!WVCore.getInstance().isUCSupport()) {
            return false;
        }
        String realKey = getRealKey(str2);
        if (this.preRenderWebViews.containsKey(realKey)) {
            return false;
        }
        for (WebView webview : this.preRenderWebViews.values()) {
            if (webview != null) {
                webview.destroy();
            }
        }
        this.preRenderWebViews.clear();
        WebView remove = this.preInitWebViews.remove(getRealKey(str));
        if (remove != null || context == null) {
            v7t.d(TAG, "obtain pre init webview success by key=[" + str + "]");
        } else {
            remove = (PreRenderWebView) getNewObject((Class<WebView>) this.WebViewClass, new MutableContextWrapper(context));
            remove.preRenderInit(str2);
            v7t.d(TAG, "obtain pre init webview failed by key=[" + str + "], init it");
        }
        if (remove == null) {
            v7t.d(TAG, "triger render failed, for no inited webview");
            return false;
        }
        remove.isPreRender = true;
        if (remove.getUCExtension() != null) {
            remove.getUCExtension().setIsPreRender(true);
        }
        if (map != null && map.containsKey("injectJs")) {
            String str3 = map.get("injectJs");
            if (!TextUtils.isEmpty(str3)) {
                remove.injectJsEarly(str3);
            }
        }
        long j = Long.MAX_VALUE;
        if (map != null && map.containsKey("timeout")) {
            String str4 = map.get("timeout");
            if (!TextUtils.isEmpty(str4)) {
                try {
                    int parseInt = Integer.parseInt(str4);
                    j = System.currentTimeMillis() + parseInt;
                    v7t.d(TAG, "time=" + parseInt);
                } catch (Exception unused) {
                }
            }
        }
        remove.setExpireTime(j);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        View view = remove.getView();
        view.setTop(0);
        view.setBottom(displayMetrics.heightPixels);
        view.setLeft(0);
        view.setRight(displayMetrics.widthPixels);
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        remove.injectJsEarly("javascript:window._wv_preload=true");
        vpw.b();
        if (vpw.commonConfig.T) {
            remove.loadUrl(gtw.a(str2, PRE_RENDER_URL_ADDITION_KEY, "true"));
        } else {
            remove.loadUrl(str2.concat(PRE_RENDER_URL_ADDITION));
        }
        this.preRenderWebViews.put(realKey, remove);
        if (scheduleProtocolCallback != null) {
            this.callbacks.put(realKey, scheduleProtocolCallback);
        }
        v7t.d(TAG, "trigger render success. key=[" + realKey + "],url = [" + str2.concat(PRE_RENDER_URL_ADDITION) + "]");
        return true;
    }

    private boolean isSameQuery(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0bab9a3", new Object[]{this, uri, uri2})).booleanValue();
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return true;
        }
        Set<String> queryParameterNames2 = uri2.getQueryParameterNames();
        if (queryParameterNames2 == null || queryParameterNames2.isEmpty()) {
            v7t.d(TAG, "real url miss query");
            return false;
        }
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            String queryParameter2 = uri2.getQueryParameter(str);
            if (!TextUtils.equals(queryParameter, queryParameter2)) {
                try {
                    JSONObject parseObject = JSON.parseObject(queryParameter);
                    JSONObject parseObject2 = JSON.parseObject(queryParameter2);
                    if (!(parseObject2 == null || parseObject == null)) {
                        for (String str2 : parseObject.keySet()) {
                            if (!TextUtils.equals(parseObject.getString(str2), parseObject2.getString(str2))) {
                                v7t.d(TAG, "query value is not equal, require=[" + queryParameter + "],real=[" + queryParameter2 + "]");
                                return false;
                            }
                        }
                        continue;
                    }
                } catch (Throwable unused) {
                    v7t.d(TAG, "query value is not equal, require=[" + queryParameter + "],real=[" + queryParameter2 + "]");
                    return false;
                }
            }
        }
        return true;
    }
}
