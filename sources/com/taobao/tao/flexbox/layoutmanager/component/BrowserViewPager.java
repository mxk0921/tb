package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager;
import tb.bk2;
import tb.t2o;
import tb.ytn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BrowserViewPager extends EdgePanViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean firstTimeAttach = true;

    static {
        t2o.a(503316702);
    }

    public BrowserViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(BrowserViewPager browserViewPager, String str, Object... objArr) {
        if (str.hashCode() == 1626033557) {
            super.onAttachedToWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/BrowserViewPager");
    }

    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
        } else {
            bk2.a(this, false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.firstTimeAttach && getAdapter() != null) {
            ytn.f(ViewPager.class, "mFirstLayout", this, Boolean.FALSE);
        }
        this.firstTimeAttach = false;
    }

    public BrowserViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
