package com.taobao.browser.urlFilter;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.login4android.api.Login;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import tb.h1p;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UrlFilterpriority implements UrlFilter.URLFilterinterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = UrlFilterpriority.class.getSimpleName();
    private Handler mHandler;
    private IWVWebView mWebView;

    static {
        t2o.a(619708630);
        t2o.a(619708629);
    }

    public UrlFilterpriority(IWVWebView iWVWebView, Handler handler) {
        this.mWebView = iWVWebView;
        this.mHandler = handler;
    }

    @Override // com.taobao.browser.urlFilter.UrlFilter.URLFilterinterface
    public boolean doFilter(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc59a6c", new Object[]{this, context, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if ("http://www.taobao.com".equalsIgnoreCase(str) || "http://www.taobao.com/".equalsIgnoreCase(str) || "https://www.taobao.com".equalsIgnoreCase(str) || "https://www.taobao.com/".equalsIgnoreCase(str) || "www.taobao.com".equalsIgnoreCase(str) || "www.taobao.com/".equalsIgnoreCase(str)) {
            TBS.Ext.commitEvent(29002, "success");
            this.mHandler.sendEmptyMessage(1102);
            Nav.from(Globals.getApplication()).toUri("http://m.taobao.com/index.htm");
            BrowserUtil.b(TAG, "doFilter", "nav_to_home", str, null);
            return true;
        } else if (str.startsWith("mailto:") || str.startsWith("tel:")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                y7t.a("ExtraUrlFilter", "doFilter: ActivityNotFoundException, url=".concat(str));
            }
            BrowserUtil.b(TAG, "doFilter", "nav_to_mail_or_tel", str, null);
            return true;
        } else {
            if (parse.isHierarchical() && ("taobao".equals(parse.getScheme()) || "http".equals(parse.getScheme()) || "https".equals(parse.getScheme()))) {
                if (str.startsWith("taobao://")) {
                    parse = Uri.parse(str.replace("taobao://", h1p.HTTP_PREFIX));
                }
                String queryParameter = parse.getQueryParameter("customtitle");
                if (!(queryParameter == null || this.mHandler == null)) {
                    BrowserUtil.b(TAG, "doFilter", "query_has_customtitle", str, null);
                    Message obtain = Message.obtain();
                    obtain.obj = queryParameter;
                    obtain.what = 1104;
                    this.mHandler.sendMessage(obtain);
                }
                String queryParameter2 = parse.getQueryParameter("landscape");
                if (queryParameter2 != null && "true".equals(queryParameter2.trim())) {
                    BrowserUtil.b(TAG, "doFilter", "query_has_landscape", str, null);
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        activity.setRequestedOrientation(0);
                        Window window = activity.getWindow();
                        if (window != null) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            if (attributes != null) {
                                attributes.systemUiVisibility = 4098;
                                window.setAttributes(attributes);
                            }
                            window.addFlags(1024);
                        }
                    }
                    return false;
                }
            }
            if (!str.contains("taobao.wap.alipay.com/cmsCente") || TextUtils.isEmpty(Login.getSid())) {
                return false;
            }
            BrowserUtil.b(TAG, "doFilter", "url_contains_cmsCente", str, null);
            String v = BrowserUtil.v(str, "s_id", Login.getSid());
            IWVWebView iWVWebView = this.mWebView;
            if (iWVWebView != null) {
                iWVWebView.loadUrl(v);
            }
            return true;
        }
    }
}
