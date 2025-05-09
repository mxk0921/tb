package com.taobao.android.layoutmanager.container.secondpage.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.secondpage.helper.SimplePageChangeListener;
import com.taobao.android.layoutmanager.container.secondpage.helper.TwoPageAdapter;
import com.taobao.orange.OrangeConfig;
import tb.anl;
import tb.bod;
import tb.dwu;
import tb.nwv;
import tb.t2o;
import tb.xe;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class VPSecPageWrapper<T extends xe> extends ye<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HAS_SET_STATUS_BAR = 2;
    public Activity b;
    public TwoPageAdapter c;
    public ViewPager d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final ViewPager.OnPageChangeListener f = new SimplePageChangeListener() { // from class: com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/impl/VPSecPageWrapper$1");
        }

        @Override // com.taobao.android.layoutmanager.container.secondpage.helper.SimplePageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                VPSecPageWrapper vPSecPageWrapper = VPSecPageWrapper.this;
                vPSecPageWrapper.u(vPSecPageWrapper.q());
            } else if (i == 0) {
                VPSecPageWrapper vPSecPageWrapper2 = VPSecPageWrapper.this;
                vPSecPageWrapper2.t(vPSecPageWrapper2.q());
            }
        }

        @Override // com.taobao.android.layoutmanager.container.secondpage.helper.SimplePageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                VPSecPageWrapper.this.s(i);
            }
        }
    };
    public final ViewPager.PageTransformer g = new ViewPager.PageTransformer() { // from class: com.taobao.android.layoutmanager.container.secondpage.impl.VPSecPageWrapper.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
                return;
            }
            int width = view.getWidth();
            TwoPageAdapter twoPageAdapter = VPSecPageWrapper.this.c;
            if (view == twoPageAdapter.f8197a) {
                view.setTranslationX(width * (-f) * 0.8f);
            } else if (view == twoPageAdapter.b) {
                view.setTranslationX((1.0f - f) * width * 0.0f);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f8200a;

        public a(Activity activity) {
            this.f8200a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VPSecPageWrapper.o(VPSecPageWrapper.this, this.f8200a);
            }
        }
    }

    static {
        t2o.a(502268087);
    }

    public static /* synthetic */ Object ipc$super(VPSecPageWrapper vPSecPageWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/impl/VPSecPageWrapper");
    }

    public static /* synthetic */ void o(VPSecPageWrapper vPSecPageWrapper, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e534315f", new Object[]{vPSecPageWrapper, activity});
        } else {
            vPSecPageWrapper.v(activity);
        }
    }

    @Override // tb.ye
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5240799", new Object[]{this})).booleanValue();
        }
        ViewPager viewPager = this.d;
        if (viewPager == null || viewPager.getCurrentItem() == 0) {
            return false;
        }
        this.d.setCurrentItem(0);
        return true;
    }

    @Override // tb.ye
    public View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.ye
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7eaff9c", new Object[]{this})).booleanValue();
        }
        if (q() == 1) {
            return true;
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6523a33f", new Object[]{this})).booleanValue();
        }
        ViewPager viewPager = this.d;
        if (viewPager == null || viewPager.getCurrentItem() == 1) {
            return false;
        }
        this.d.setCurrentItem(1);
        return true;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb6627eb", new Object[]{this})).intValue();
        }
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return 0;
    }

    public abstract ViewPager r();

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db3efbe", new Object[]{this, new Integer(i)});
        } else {
            new StringBuilder("onPageChange. curr position:").append(i);
        }
    }

    public abstract void t(int i);

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feebd415", new Object[]{this, new Integer(i)});
        } else {
            new StringBuilder("onScrollStart. curr position:").append(i);
        }
    }

    public final void v(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9543ed3", new Object[]{this, activity});
        } else if (activity != null) {
            try {
                String[] split = OrangeConfig.getInstance().getConfig("weitao_switch", "tansparent_statusbar_model", "V1950A").split(",");
                if (split != null && split.length > 0) {
                    for (String str : split) {
                        if (Build.MODEL.equals(str)) {
                            View findViewById = activity.getWindow().getDecorView().findViewById(16908335);
                            if (findViewById != null) {
                                findViewById.setAlpha(0.0f);
                                findViewById.setBackgroundColor(0);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean x(anl anlVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a06dfbda", new Object[]{this, anlVar, new Integer(i)})).booleanValue();
        }
        T c = c();
        if (c == null) {
            Log.e("SecPageVPWrapper", "second page is null, wrap failed! ");
            return false;
        }
        this.b = anlVar.getActivity();
        if (anlVar instanceof bod) {
            this.f32008a = (bod) anlVar;
        }
        try {
            ViewPager r = r();
            this.d = r;
            r.setAdapter(this.c);
            this.d.setPageTransformer(false, this.g);
            this.d.addOnPageChangeListener(this.f);
            TwoPageAdapter twoPageAdapter = new TwoPageAdapter(anlVar.getContentView(), c.i(this.b));
            this.c = twoPageAdapter;
            this.d.setAdapter(twoPageAdapter);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean w(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93598b04", new Object[]{this, activity, new Integer(i)})).booleanValue();
        }
        T c = c();
        if (c == null) {
            Log.e("SecPageVPWrapper", "second page is null, wrap failed! ");
            return false;
        }
        this.b = activity;
        if (activity instanceof bod) {
            this.f32008a = (bod) activity;
        }
        try {
            ViewPager r = r();
            this.d = r;
            r.setAdapter(this.c);
            this.d.setPageTransformer(false, this.g);
            this.d.addOnPageChangeListener(this.f);
            View view = (View) activity.findViewById(16908290).getParent();
            if (i != 2) {
                dwu.c(activity);
                view.setPadding(0, dwu.b(activity), 0, 0);
                view.setBackgroundColor(i);
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.removeView(view);
            viewGroup.addView(this.d, 0);
            TwoPageAdapter twoPageAdapter = new TwoPageAdapter(view, c.i(this.b));
            this.c = twoPageAdapter;
            this.d.setAdapter(twoPageAdapter);
            this.e.postDelayed(new a(activity), nwv.y(OrangeConfig.getInstance().getConfig("weitao_switch", "transparent_statusbar_delay", "100"), 100L));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
