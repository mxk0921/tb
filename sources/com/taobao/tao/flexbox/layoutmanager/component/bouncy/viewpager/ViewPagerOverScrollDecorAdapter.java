package com.taobao.tao.flexbox.layoutmanager.component.bouncy.viewpager;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.u4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ViewPagerOverScrollDecorAdapter implements u4d, ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewPager f12143a;
    public int b;
    public float c = 0.0f;

    static {
        t2o.a(503316908);
        t2o.a(503316898);
    }

    public ViewPagerOverScrollDecorAdapter(ViewPager viewPager) {
        this.b = 0;
        this.f12143a = viewPager;
        viewPager.addOnPageChangeListener(this);
        this.b = viewPager.getCurrentItem();
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f12143a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc46f680", new Object[]{this})).booleanValue();
        }
        if (this.b == this.f12143a.getAdapter().getCount() - 1 && this.c == 0.0f) {
            return true;
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6aefd807", new Object[]{this})).booleanValue();
        }
        if (this.b == 0 && this.c == 0.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        this.b = i;
        this.c = f;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }
}
