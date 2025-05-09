package com.taobao.browser.urlFilter;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.alibaba.security.wukong.config.Algo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.login4android.api.Login;
import com.taobao.tao.util.StringUtil;
import com.taobao.tao.util.UrlFormator;
import tb.ahu;
import tb.h1p;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserUrlFilter extends UrlFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserUrlFilter";
    private Handler handler;
    private Activity mContext;
    private UrlFilterpriority mUrlFilterBase;
    public BrowserHybridWebView mWebView;
    private boolean forceWebview = false;
    private ThreadLocal<String> munionFilterClickId = null;
    private boolean isiInit = false;
    @Deprecated
    private boolean isshorturl = false;

    static {
        t2o.a(619708625);
    }

    @Deprecated
    public BrowserUrlFilter(Activity activity, Handler handler, BrowserHybridWebView browserHybridWebView) {
        super(handler);
        this.mContext = activity;
        this.mWebView = browserHybridWebView;
        this.handler = handler;
        initUrlFilter();
    }

    @Deprecated
    private boolean checkShortUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aae93786", new Object[]{this})).booleanValue();
        }
        if (!this.isshorturl) {
            return false;
        }
        this.isshorturl = false;
        return true;
    }

    private void initUrlFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1d3b9e", new Object[]{this});
        } else if (!this.isiInit) {
            registerURLFilter(new ExtraUrlFilter(this.handler));
            registerURLFilter(new BusinessUrlFilter(this.handler));
            this.isiInit = true;
        }
    }

    private boolean interceptByWindvane(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e80bd8", new Object[]{this, str})).booleanValue();
        }
        if (!Login.isLoginUrl(str) && !Login.isLogoutUrl(str)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(BrowserUrlFilter browserUrlFilter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/urlFilter/BrowserUrlFilter");
    }

    private void killSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbd2f51", new Object[]{this});
            return;
        }
        this.handler.removeMessages(1105);
        Message obtain = Message.obtain();
        obtain.what = 1105;
        this.handler.dispatchMessage(obtain);
    }

    private boolean needSuicide(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c398954d", new Object[]{this, str})).booleanValue();
        }
        if (Uri.parse(str) != null && "1".equals(Uri.parse(str).getQueryParameter(Algo.ALGO_TYPE_CPP))) {
            return true;
        }
        if ((Uri.parse(str) == null || !"0".equals(Uri.parse(str).getQueryParameter(Algo.ALGO_TYPE_CPP))) && checkShortUrl()) {
            return true;
        }
        return false;
    }

    public void addFilter(UrlFilter.URLFilterinterface uRLFilterinterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9db2d0", new Object[]{this, uRLFilterinterface});
        } else {
            registerURLFilter(uRLFilterinterface);
        }
    }

    public void setFilterClickId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411fdaba", new Object[]{this, str});
            return;
        }
        if (this.munionFilterClickId == null) {
            this.munionFilterClickId = new ThreadLocal<>();
        }
        this.munionFilterClickId.set(str);
    }

    public void setForceWebView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d75a0fd", new Object[]{this, new Boolean(z)});
        } else {
            this.forceWebview = z;
        }
    }

    public void setForceWebViewItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72f2fef", new Object[]{this, str});
        }
    }

    @Deprecated
    public void setIsshortURL(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8eca0e", new Object[]{this, new Boolean(z)});
        } else {
            this.isshorturl = z;
        }
    }

    @Override // com.taobao.browser.urlFilter.UrlFilter
    public boolean filtrate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdb16d40", new Object[]{this, str})).booleanValue();
        }
        y7t.c();
        if (str == null) {
            y7t.a(TAG, "Error  load  url is null");
            return true;
        } else if (ahu.a(this.mContext, str)) {
            if (needSuicide(str)) {
                killSelf();
            }
            return true;
        } else {
            if (this.mUrlFilterBase == null) {
                this.mUrlFilterBase = new UrlFilterpriority(this.mWebView, this.handler);
            }
            if (this.mUrlFilterBase.doFilter(this.mContext, str)) {
                return true;
            }
            String formatUrl = UrlFormator.formatUrl(str);
            Uri parse = Uri.parse(formatUrl);
            ThreadLocal<String> threadLocal = this.munionFilterClickId;
            if (threadLocal != null && !StringUtil.isEmpty(threadLocal.get())) {
                formatUrl = parse.buildUpon().appendQueryParameter("clickid", this.munionFilterClickId.get()) + "";
                this.munionFilterClickId = null;
            }
            if (interceptByWindvane(formatUrl) || this.forceWebview) {
                return false;
            }
            if (!BrowserUtil.i(this.mContext, formatUrl) || !Nav.from(this.mContext).disallowLoopback().toUri(formatUrl)) {
                for (UrlFilter.URLFilterinterface uRLFilterinterface : this.mURLFiltersCommon) {
                    if (uRLFilterinterface.doFilter(this.mContext, formatUrl)) {
                        if (y7t.c()) {
                            uRLFilterinterface.toString();
                        }
                        if (needSuicide(formatUrl)) {
                            killSelf();
                        }
                        return true;
                    }
                }
                return formatUrl.startsWith("taobao://") && Nav.from(this.mContext).disallowLoopback().toUri(formatUrl.replace("taobao://", h1p.HTTP_PREFIX));
            }
            if (needSuicide(formatUrl)) {
                killSelf();
            }
            return true;
        }
    }
}
