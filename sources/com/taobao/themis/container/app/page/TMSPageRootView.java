package com.taobao.themis.container.app.page;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xcs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lcom/taobao/themis/container/app/page/TMSPageRootView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", "requestApplyInsetsCompat", "()V", "", "isFullScreen", "init", "(Landroid/content/Context;Z)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "mEnableNewAdjustInput", "Z", "mNeedRestoreWindowInsets", "mWindowInsetBottom", TLogTracker.LEVEL_INFO, "mStatusBarHeight", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSPageRootView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "TMSPageRootView@";
    private boolean mEnableNewAdjustInput;
    private boolean mNeedRestoreWindowInsets;
    private int mStatusBarHeight;
    private int mWindowInsetBottom;

    static {
        t2o.a(835715111);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSPageRootView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(TMSPageRootView tMSPageRootView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 880921750) {
            return super.onApplyWindowInsets((WindowInsets) objArr[0]);
        }
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/container/app/page/TMSPageRootView");
        }
    }

    private final void requestApplyInsetsCompat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7f12de", new Object[]{this});
        } else {
            requestApplyInsets();
        }
    }

    public final void init(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        ckf.g(context, "context");
        this.TAG = ckf.p(this.TAG, Integer.valueOf(hashCode()));
        setFitsSystemWindows(true);
        if (z) {
            this.mEnableNewAdjustInput = false;
        }
        if (this.mEnableNewAdjustInput) {
            this.mStatusBarHeight = xcs.d(context);
            if (context instanceof Activity) {
                ((Activity) context).getWindow().setSoftInputMode(16);
            }
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("3481cc96", new Object[]{this, windowInsets});
        }
        ckf.g(windowInsets, "insets");
        if (!this.mEnableNewAdjustInput) {
            return super.onApplyWindowInsets(windowInsets);
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() - this.mStatusBarHeight;
        if (systemWindowInsetTop >= 0) {
            i = systemWindowInsetTop;
        }
        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        this.mWindowInsetBottom = systemWindowInsetBottom;
        WindowInsets replaceSystemWindowInsets = windowInsets.replaceSystemWindowInsets(systemWindowInsetLeft, i, systemWindowInsetRight, systemWindowInsetBottom);
        ckf.f(replaceSystemWindowInsets, "insets.replaceSystemWind…left, top, right, bottom)");
        return super.onApplyWindowInsets(replaceSystemWindowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mEnableNewAdjustInput && this.mNeedRestoreWindowInsets) {
            requestApplyInsetsCompat();
            this.mNeedRestoreWindowInsets = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.mEnableNewAdjustInput && this.mWindowInsetBottom > 0) {
            this.mNeedRestoreWindowInsets = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSPageRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attrs");
    }

    public TMSPageRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
