package com.taobao.search.musie.web;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.mcj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusWebViewHost extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean disableTouch;
    private String mCurrentUrl;
    private WVUCWebView mWebView;

    static {
        t2o.a(815792804);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusWebViewHost(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    private final void createWebViewIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688726d6", new Object[]{this});
        } else if (this.mWebView == null) {
            WVUCWebView wVUCWebView = new WVUCWebView(getContext());
            wVUCWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            wVUCWebView.setWebViewClient(new mcj(getContext()));
            wVUCWebView.setBackgroundColor(0);
            addView(wVUCWebView);
            this.mWebView = wVUCWebView;
        }
    }

    private final void destroyWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5272a7c6", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null && !wVUCWebView.isDestroied()) {
            wVUCWebView.destroy();
        }
        removeAllViews();
        this.mWebView = null;
        this.mCurrentUrl = null;
    }

    public static /* synthetic */ Object ipc$super(MusWebViewHost musWebViewHost, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/web/MusWebViewHost");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableTouch) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void mount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd26dea", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        if (!TextUtils.equals(str, this.mCurrentUrl)) {
            createWebViewIfNeeded();
            WVUCWebView wVUCWebView = this.mWebView;
            if (wVUCWebView != null) {
                wVUCWebView.loadUrl(str);
            }
            this.mCurrentUrl = str;
        }
    }

    public final void setDisableTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b3a014", new Object[]{this, new Boolean(z)});
        } else {
            this.disableTouch = z;
        }
    }

    public final void unMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b27987", new Object[]{this});
        } else {
            destroyWebView();
        }
    }
}
