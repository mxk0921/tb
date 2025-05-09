package com.taobao.android.detail2.core.framework.view.manager;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.secondpage.SecondPageFactory;
import com.taobao.android.detail2.core.framework.view.horizontalscroll.NewDetailViewPager;
import com.taobao.android.detail2.core.framework.view.horizontalscroll.NewDetailViewPagerAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.cxj;
import tb.gxj;
import tb.ncf;
import tb.t2o;
import tb.txj;
import tb.ze;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PageHorizontalScrollManager extends ViewPager.SimpleOnPageChangeListener implements ViewPager.PageTransformer, ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_TYPE_NEW_DETAIL = "NewDetail";
    public static final String PAGE_TYPE_SECOND_PAGE = "SecondPage";
    public static final Map<String, SecondPageFactory.SecondPageType> k;

    /* renamed from: a  reason: collision with root package name */
    public final cxj f7187a;
    public final View b;
    public NewDetailViewPager c;
    public NewDetailViewPagerAdapter d;
    public final SecondPageFactory e;
    public ze f;
    public FrameLayout g;
    public boolean h;
    public boolean i;
    public b j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ze.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ze.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3adc3f7", new Object[]{this});
            } else {
                PageHorizontalScrollManager.this.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    public PageHorizontalScrollManager(cxj cxjVar, View view) {
        this.f7187a = cxjVar;
        this.b = view;
        this.e = new SecondPageFactory(cxjVar.i());
        e();
    }

    public static /* synthetic */ Object ipc$super(PageHorizontalScrollManager pageHorizontalScrollManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/PageHorizontalScrollManager");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed99eac4", new Object[]{this});
            return;
        }
        ze zeVar = this.f;
        if (zeVar != null) {
            zeVar.b();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124e47c0", new Object[]{this});
            return;
        }
        ze zeVar = this.f;
        if (zeVar != null) {
            zeVar.f();
        }
    }

    public void g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6272acc", new Object[]{this, bVar});
        } else {
            this.j = bVar;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae43db7", new Object[]{this});
            return;
        }
        ze zeVar = this.f;
        if (zeVar != null) {
            zeVar.j();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2725392c", new Object[]{this});
            return;
        }
        ze zeVar = this.f;
        if (zeVar != null) {
            zeVar.l();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef81a4cc", new Object[]{this});
            return;
        }
        ze zeVar = this.f;
        if (zeVar != null) {
            zeVar.m();
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1061917b", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.b.getParent();
        viewGroup.removeView(this.b);
        viewGroup.addView(this.c, 0);
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (this.j == null) {
            if (!gxj.b()) {
                txj.e(txj.TAG_TIP, "mHorizontalScrollListener 不存在。 mHorizontalScrollListener is null");
                return;
            }
            throw new NullPointerException("mHorizontalScrollListener 不存在。 mHorizontalScrollListener is null");
        } else if (i == 1) {
            if (this.c.getCurrentItem() == 0) {
                ((ncf) this.j).b();
            } else if (this.c.getCurrentItem() == 1) {
                ((ncf) this.j).c();
            }
            this.h = true;
            this.i = false;
        } else if (i == 2) {
            this.i = true;
        } else if (i == 0) {
            if (this.c.getCurrentItem() == 0) {
                if (!this.h) {
                    ((ncf) this.j).c();
                }
                ((ncf) this.j).d(this.i);
            } else if (this.c.getCurrentItem() == 1) {
                if (!this.h) {
                    ((ncf) this.j).b();
                }
                ((ncf) this.j).e(this.i);
            }
            this.h = false;
            this.i = false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
        } else if (view == this.d.h(0)) {
            if (f <= -1.0f) {
                view.setVisibility(4);
            } else if (f <= 0.0f) {
                view.setVisibility(0);
            }
            view.setTranslationX(view.getWidth() * f * (-0.8f));
        }
    }

    public String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9103f5ad", new Object[]{this});
        }
        NewDetailViewPager newDetailViewPager = this.c;
        if (newDetailViewPager == null || newDetailViewPager.getCurrentItem() != 1) {
            str = "NewDetail";
        } else {
            str = PAGE_TYPE_SECOND_PAGE;
        }
        txj.e(txj.TAG_SECOND_PAGE, "获取当前的页面类型".concat(str));
        return str;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else if (this.f7187a.i() != null) {
            txj.e(txj.TAG_SECOND_PAGE, "初始化页面水平滑动视图");
            this.c = new NewDetailViewPager(this.f7187a.i());
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.b);
            FrameLayout frameLayout = new FrameLayout(this.f7187a.i());
            this.g = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.g.setBackgroundColor(-1);
            arrayList.add(this.g);
            NewDetailViewPagerAdapter newDetailViewPagerAdapter = new NewDetailViewPagerAdapter(arrayList);
            this.d = newDetailViewPagerAdapter;
            this.c.setAdapter(newDetailViewPagerAdapter);
            this.c.setPageTransformer(false, this);
            this.c.addOnPageChangeListener(this);
            k();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c089a3b7", new Object[]{this});
            return;
        }
        NewDetailViewPager newDetailViewPager = this.c;
        if (newDetailViewPager != null && newDetailViewPager.getCurrentItem() == 1) {
            txj.e(txj.TAG_SECOND_PAGE, "当前位于二级页，从二级页返回");
            this.c.setCurrentItem(0);
        }
    }

    public void d(boolean z, String str, String str2) {
        ze zeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70334e7", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "处理左滑打开二级页，是否可用" + z + "，二级页类型" + str + "，二级页URL" + str2);
        if (!TextUtils.isEmpty(str)) {
            this.f = this.e.a((SecondPageFactory.SecondPageType) ((HashMap) k).get(str));
        }
        if (!z || (zeVar = this.f) == null || zeVar.d() == null || TextUtils.isEmpty(str2)) {
            this.c.setIsAvailable(false);
            return;
        }
        NewDetailViewPager newDetailViewPager = this.c;
        newDetailViewPager.setViewPagerFeature(this.f.e(newDetailViewPager));
        this.c.setIsAvailable(true);
        if (this.f.d().getParent() == null) {
            this.g.removeAllViews();
            this.g.addView(this.f.d());
        } else if (this.f.d().getParent() != this.g) {
            ((ViewGroup) this.f.d().getParent()).removeView(this.f.d());
            this.g.removeAllViews();
            this.g.addView(this.f.d());
        }
        this.f.k(Uri.parse(str2));
        if (this.f.c() == null) {
            this.f.g(new a());
        }
    }

    static {
        t2o.a(352322069);
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_PERSON, SecondPageFactory.SecondPageType.GG_PROFILE);
    }
}
