package com.taobao.tao.infoflow.multitab;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import tb.fuq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SubMultiPreCreateListener implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final fuq b;

    /* renamed from: a  reason: collision with root package name */
    public float f12442a = -1.0f;
    public boolean c = false;

    static {
        t2o.a(729809458);
    }

    public SubMultiPreCreateListener(fuq fuqVar) {
        this.b = fuqVar;
    }

    public final void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86660528", new Object[]{this, new Integer(i), str});
            return;
        }
        View w = this.b.w(i);
        if (w != null && (w instanceof SubWrapFrameLayout)) {
            ((SubWrapFrameLayout) w).addTabView(this.b, str);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.f12442a = -1.0f;
            this.c = false;
        } else if (i == 1) {
            this.c = true;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else {
            a(i, "tabSelected");
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.c) {
            float f2 = this.f12442a;
            if (f2 >= 0.0f) {
                if (f > f2) {
                    a(i + 1, IMultiTabPerformanceListener.TAB_SCROLL_SELECT);
                } else if (f < f2) {
                    a(i, IMultiTabPerformanceListener.TAB_SCROLL_SELECT);
                }
            }
            this.f12442a = f;
        }
    }
}
