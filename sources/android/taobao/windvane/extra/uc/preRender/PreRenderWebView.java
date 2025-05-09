package android.taobao.windvane.extra.uc.preRender;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.acd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PreRenderWebView extends WVUCWebView implements acd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isPreRender = false;
    private boolean preRenderSuccess = false;
    private long expireTime = 0;
    private String realUrl = null;

    static {
        t2o.a(989856172);
        t2o.a(989856462);
    }

    public PreRenderWebView(Context context) {
        super(context);
    }

    private String getAttachData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b012494", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.realUrl)) {
            return "{}";
        }
        return "{ \"url\": \"" + this.realUrl + "\" }";
    }

    public static /* synthetic */ Object ipc$super(PreRenderWebView preRenderWebView, String str, Object... objArr) {
        if (str.hashCode() == 1626033557) {
            super.onAttachedToWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/preRender/PreRenderWebView");
    }

    public long getExpireTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b347fd", new Object[]{this})).longValue();
        }
        return this.expireTime;
    }

    @Override // tb.acd
    public boolean isPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d4411a", new Object[]{this})).booleanValue();
        }
        return this.isPreRender;
    }

    public boolean isPreRenderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5fc877f", new Object[]{this})).booleanValue();
        }
        return this.preRenderSuccess;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.isPreRender) {
            fireEvent(BasePreInitManager.ATTACH_EVENT, getAttachData());
            if (getUCExtension() != null) {
                post(new Runnable() { // from class: android.taobao.windvane.extra.uc.preRender.PreRenderWebView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (PreRenderWebView.this.getUCExtension() != null) {
                            PreRenderWebView.this.getUCExtension().setIsPreRender(false);
                        }
                    }
                });
            }
            try {
                getWebViewContext().getWebViewPageModel().onProperty("H5_PreRender", Boolean.TRUE);
                getWebViewContext().getWebViewPageModel().onProperty("H5_URL", getUrl());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.isPreRender = false;
        }
    }

    public void preRenderInit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80c4c9a", new Object[]{this, str});
        }
    }

    public void setExpireTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158cc94f", new Object[]{this, new Long(j)});
        } else {
            this.expireTime = j;
        }
    }

    public void setPreRenderSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac079e81", new Object[]{this, new Boolean(z)});
        } else {
            this.preRenderSuccess = z;
        }
    }

    public void setRealUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ba0d80", new Object[]{this, str});
        } else {
            this.realUrl = str;
        }
    }

    public PreRenderWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreRenderWebView(Context context, Map<String, String> map) {
        super(context, map);
    }

    public PreRenderWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PreRenderWebView(WVUCWebView.Builder builder) {
        super(builder);
    }
}
