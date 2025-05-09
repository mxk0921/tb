package com.taobao.browser.urlFilter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.login4android.api.Login;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.UrlFormator;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.h1p;
import tb.k7r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UrlpreLoadFilter extends UrlFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "UrlpreLoadFilter";
    private boolean isiInit;
    private Context mContext;
    private Intent mIntent;
    private UrlFilterpriority mUrlFilterBase;
    private IWVWebView mWebview;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface URLPreLoader {
        String beforeLoadTo(Context context, String str);
    }

    static {
        t2o.a(619708632);
    }

    public UrlpreLoadFilter(Context context, Intent intent, Handler handler, IWVWebView iWVWebView) {
        super(handler);
        this.isiInit = false;
        this.mContext = context;
        this.mIntent = intent;
        this.mWebview = iWVWebView;
        registerURLFilter(new ExtraUrlFilter(this.handler));
        registerURLFilter(new BusinessUrlFilter(this.handler));
        this.isiInit = true;
    }

    public static /* synthetic */ Object ipc$super(UrlpreLoadFilter urlpreLoadFilter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/urlFilter/UrlpreLoadFilter");
    }

    public boolean basefiltrate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("801c7051", new Object[]{this, str})).booleanValue();
        }
        if (this.mUrlFilterBase == null) {
            this.mUrlFilterBase = new UrlFilterpriority(this.mWebview, this.handler);
        }
        if (this.mUrlFilterBase.doFilter(this.mContext, str)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.browser.urlFilter.UrlFilter
    public boolean filtrate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdb16d40", new Object[]{this, str})).booleanValue();
        }
        for (UrlFilter.URLFilterinterface uRLFilterinterface : this.mURLFiltersCommon) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean doFilter = uRLFilterinterface.doFilter(this.mContext, str);
            k7r.b("exchain.FullTrace", "BrowserActivity." + uRLFilterinterface.getClass().getSimpleName() + ".doFilter cost time: " + (System.currentTimeMillis() - currentTimeMillis));
            if (doFilter) {
                return true;
            }
        }
        return false;
    }

    public String preloadURL(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ada6bac", new Object[]{this, str, intent});
        }
        if (str != null && str.startsWith("taobao://")) {
            str = str.replace("taobao://", h1p.HTTP_PREFIX);
        }
        Intent intent2 = this.mIntent;
        if (intent2 == null || (!intent2.hasExtra("decapsulation") && !"weitao_plugin_third_menu".equals(this.mIntent.getStringExtra(RVStartParams.KEY_FROM_TYPE)))) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                if (!parse.isHierarchical() || ((!"http".equals(parse.getScheme()) && !"https".equals(parse.getScheme())) || !"true".equals(parse.getQueryParameter("hybrid")))) {
                    if (BrowserUtil.t(str, BrowserUtil.m(this.mContext, R.string.utdid_url))) {
                        String queryParameter = parse.getQueryParameter("utd_id");
                        if (queryParameter == null) {
                            str = UrlFormator.appendutd_id(this.mContext, parse);
                        }
                        HashMap hashMap = new HashMap();
                        if (queryParameter == null) {
                            queryParameter = "0";
                        }
                        hashMap.put("utd_id", queryParameter);
                        BrowserUtil.b(this.TAG, "preloadURL", "query_utd_id", str, hashMap);
                    }
                    if (BrowserUtil.t(str, BrowserUtil.m(this.mContext, R.string.utdid_url_new_task)) && parse.getQueryParameter("needUtdid") != null) {
                        BrowserUtil.b(this.TAG, "preloadURL", "query_needUtdid", str, null);
                        str = UrlFormator.appendutd_id(this.mContext, parse);
                    }
                } else {
                    BrowserUtil.b(this.TAG, "preloadURL", "query_has_hybrid", str, null);
                    return null;
                }
            }
            if (!BrowserUtil.t(str, BrowserUtil.m(this.mContext, R.string.alipay_activity_url)) || TextUtils.isEmpty(Login.getSid())) {
                return str;
            }
            BrowserUtil.b(this.TAG, "preloadURL", "url_replace_s_id", str, null);
            return Constants.replaceParam(str, "s_id", Login.getSid());
        }
        HashMap hashMap2 = new HashMap();
        if (this.mIntent.hasExtra("decapsulation")) {
            hashMap2.put("decapsulation", "1");
        }
        if ("weitao_plugin_third_menu".equals(this.mIntent.getStringExtra(RVStartParams.KEY_FROM_TYPE))) {
            hashMap2.put("weitao_plugin", "1");
        }
        BrowserUtil.b(this.TAG, "preloadURL", "intent_has_decapsulation_or_weitao", str, hashMap2);
        return null;
    }
}
