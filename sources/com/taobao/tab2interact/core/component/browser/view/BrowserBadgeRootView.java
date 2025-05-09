package com.taobao.tab2interact.core.component.browser.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BrowserBadgeRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mOnVisibilityChangedListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(689963063);
    }

    public BrowserBadgeRootView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(BrowserBadgeRootView browserBadgeRootView, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/view/BrowserBadgeRootView");
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        a aVar = this.mOnVisibilityChangedListener;
        if (aVar != null) {
            ((BrowserBadgeViewController.d) aVar).a(i);
        }
    }

    public void setOnVisibilityChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34708d0c", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.mOnVisibilityChangedListener = aVar;
        }
    }

    public BrowserBadgeRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowserBadgeRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
