package com.taobao.tao.recommend4.recyclerview.notify.sub.nativeconatiner;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import tb.bqa;
import tb.lrj;
import tb.m5a;
import tb.t2o;
import tb.zpk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ViewPageTabChange {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewPager f12726a;
    public ViewPager.OnPageChangeListener b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ViewPageTabChange.a(ViewPageTabChange.this);
            }
        }
    }

    static {
        t2o.a(729810081);
    }

    public ViewPageTabChange(zpk zpkVar, HomeChildRecyclerView homeChildRecyclerView) {
        this.f12726a = e(homeChildRecyclerView);
        f(homeChildRecyclerView, zpkVar);
    }

    public static /* synthetic */ void a(ViewPageTabChange viewPageTabChange) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9c8519", new Object[]{viewPageTabChange});
        } else {
            viewPageTabChange.g();
        }
    }

    public static /* synthetic */ ViewPager b(ViewPageTabChange viewPageTabChange) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("a665055f", new Object[]{viewPageTabChange});
        }
        return viewPageTabChange.f12726a;
    }

    public final ViewPager.OnPageChangeListener c(final HomeChildRecyclerView homeChildRecyclerView, final zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("6bd6a0ee", new Object[]{this, homeChildRecyclerView, zpkVar});
        }
        return new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.recommend4.recyclerview.notify.sub.nativeconatiner.ViewPageTabChange.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else if (ViewPageTabChange.b(ViewPageTabChange.this).findFocus() != homeChildRecyclerView.getNestedScrollParent()) {
                    bqa.d("OrderListTriggerEnhance", "onPageSelected");
                    zpkVar.a();
                }
            }
        };
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            m5a.a().g(new a(), 0L);
        }
    }

    public final ViewPager e(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("12ecb758", new Object[]{this, homeChildRecyclerView});
        }
        if (homeChildRecyclerView == null) {
            return null;
        }
        lrj nestedScrollParent = homeChildRecyclerView.getNestedScrollParent();
        if (!(nestedScrollParent instanceof ViewGroup)) {
            return null;
        }
        ViewParent viewParent = (ViewGroup) nestedScrollParent;
        while (viewParent != null) {
            viewParent = viewParent.getParent();
            bqa.d("OrderListTriggerEnhance", "getViewPager, target:".concat(viewParent.getClass().getSimpleName()));
            if (!(viewParent instanceof ViewPager)) {
                if (viewParent instanceof ViewGroup) {
                    if (viewParent instanceof ViewPager.DecorView) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return (ViewPager) viewParent;
            }
        }
        return null;
    }

    public final void f(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f33c4b", new Object[]{this, homeChildRecyclerView, zpkVar});
        } else if (this.f12726a == null) {
            bqa.d("OrderListTriggerEnhance", "mViewPager == null");
        } else {
            ViewPager.OnPageChangeListener c = c(homeChildRecyclerView, zpkVar);
            this.b = c;
            this.f12726a.addOnPageChangeListener(c);
            bqa.d("OrderListTriggerEnhance", "register viewPager listener success");
        }
    }

    public final void g() {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4036f37d", new Object[]{this});
            return;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.b;
        if (onPageChangeListener == null || (viewPager = this.f12726a) == null) {
            bqa.d("OrderListTriggerEnhance", "mPageChangeListener == null || mViewPager == null");
            return;
        }
        viewPager.removeOnPageChangeListener(onPageChangeListener);
        bqa.d("OrderListTriggerEnhance", "remove viewPager listener success");
    }
}
