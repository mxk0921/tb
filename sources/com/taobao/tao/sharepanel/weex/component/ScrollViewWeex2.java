package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import io.unicorn.plugin.platform.WeexPlatformView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScrollViewWeex2 extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String SHARESCROLLVIEW_TAG = "sharescrollViewTag";
    public Context context;
    public String weexUrl = null;
    public String scrollwidth = "0";
    public String scrollheight = "0";
    public ShareScrollViewView scrollView = null;

    public ScrollViewWeex2(Context context, int i) {
        super(context, i);
        this.context = context;
    }

    public static /* synthetic */ Object ipc$super(ScrollViewWeex2 scrollViewWeex2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else if (hashCode == -12003312) {
            super.onCreated();
            return null;
        } else if (hashCode == 1056639943) {
            super.onDispose();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/sharepanel/weex/component/ScrollViewWeex2");
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.scrollView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        this.scrollView.clear();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        super.onCreated();
        if (this.scrollView == null) {
            float f2 = 0.0f;
            try {
                f = Float.parseFloat(this.scrollheight);
                try {
                    f2 = Float.parseFloat(this.scrollwidth);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                f = 0.0f;
            }
            ShareScrollViewView shareScrollViewView = new ShareScrollViewView(this.context, this.weexUrl, f, f2);
            this.scrollView = shareScrollViewView;
            shareScrollViewView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.scrollView.setTag(SHARESCROLLVIEW_TAG);
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
            return;
        }
        super.onDispose();
        this.scrollView.clear();
    }

    @WXComponentProp(name = "scrollheight")
    public void setScrollheight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dade5c7", new Object[]{this, str});
        } else {
            this.scrollheight = str;
        }
    }

    @WXComponentProp(name = "scrollwidth")
    public void setScrollwidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbac8a8", new Object[]{this, str});
        } else {
            this.scrollwidth = str;
        }
    }

    @WXComponentProp(name = "url")
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.weexUrl = str;
        }
    }

    static {
        t2o.a(666894594);
    }
}
