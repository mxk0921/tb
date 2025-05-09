package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z02 extends rz<TabLayout, pib> implements qib, TabLayout.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TabLayout d;
    public int e;
    public int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32441a;

        public a(int i) {
            this.f32441a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TabLayout.f tabAt = z02.this.d.getTabAt(this.f32441a);
            if (tabAt != null) {
                tabAt.l();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FrameLayout f32442a;
        public final TextView b;
        public final ImageView c;
        public p1m d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null && !succPhenixEvent.isIntermediate()) {
                    b.this.b(drawable);
                }
                p1m ticket = succPhenixEvent.getTicket();
                if (ticket != null && !ticket.b()) {
                    ticket.d(true);
                }
                return true;
            }
        }

        static {
            t2o.a(993001689);
        }

        public b(LayoutInflater layoutInflater) {
            FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.libsf_custom_tab, (ViewGroup) null);
            this.f32442a = frameLayout;
            this.b = (TextView) frameLayout.findViewById(R.id.libsf_tab_text);
            this.c = (ImageView) frameLayout.findViewById(R.id.libsf_tab_icon);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77d953d0", new Object[]{this, str});
                return;
            }
            p1m p1mVar = this.d;
            if (p1mVar != null && !p1mVar.b()) {
                this.d.a();
            }
            this.d = s0m.B().T(str).succListener(new a()).fetch();
        }

        public void b(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ef6a741", new Object[]{this, drawable});
                return;
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                this.c.setVisibility(0);
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }

        public void c(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ac2d988", new Object[]{this, str, new Integer(i)});
                return;
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(str);
                this.b.setTextColor(i);
                this.b.setVisibility(0);
            }
        }
    }

    static {
        t2o.a(993001687);
        t2o.a(993001693);
    }

    public static /* synthetic */ Object ipc$super(z02 z02Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/tab/BaseSrpTabView");
    }

    /* renamed from: Q */
    public TabLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabLayout) ipChange.ipc$dispatch("47547738", new Object[]{this, context, viewGroup});
        }
        this.e = context.getResources().getColor(R.color.libsf_black);
        this.f = context.getResources().getColor(R.color.libsf_tab_selected);
        TabLayout tabLayout = (TabLayout) LayoutInflater.from(context).inflate(R.layout.libsf_srp_tab, viewGroup, false);
        this.d = tabLayout;
        return tabLayout;
    }

    /* renamed from: R */
    public TabLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabLayout) ipChange.ipc$dispatch("b904a075", new Object[]{this});
        }
        return this.d;
    }

    public final void S(TabBean tabBean, b bVar) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d73def", new Object[]{this, tabBean, bVar});
            return;
        }
        String str2 = tabBean.showText;
        if (tabBean.isSelected) {
            i = this.f;
        } else {
            i = this.e;
        }
        bVar.c(str2, i);
        if (tabBean.isSelected) {
            str = tabBean.activeImage;
        } else {
            str = tabBean.normalImage;
        }
        if (!TextUtils.isEmpty(str)) {
            bVar.a(str);
        }
    }

    @Override // tb.qib
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabReselected(TabLayout.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c8ee3b", new Object[]{this, fVar});
        }
    }

    @Override // tb.qib
    public void r() {
        TabBean W;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea2e729", new Object[]{this});
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.d.getContext());
        if (from != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.getTabCount(); i3++) {
                TabLayout.f tabAt = this.d.getTabAt(i3);
                if (!(tabAt == null || (W = P().W(tabAt)) == null)) {
                    b bVar = new b(from);
                    tabAt.r(bVar);
                    tabAt.o(bVar.f32442a);
                    if ("img".equals(W.showType)) {
                        S(W, bVar);
                    } else {
                        String str = W.showText;
                        if (W.isSelected) {
                            i = this.f;
                        } else {
                            i = this.e;
                        }
                        bVar.c(str, i);
                        if (W.isSelected) {
                            i2 = i3;
                        }
                    }
                }
            }
            this.d.post(new a(i2));
        }
    }

    @Override // tb.qib
    public void s(ViewPager viewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a72c3f", new Object[]{this, viewPager, new Boolean(z)});
            return;
        }
        TabLayout R = getView();
        if (z) {
            R.setTabMode(0);
        }
        R.addOnTabSelectedListener((TabLayout.d) this);
        R.setupWithViewPager(viewPager);
    }

    @Override // tb.qib
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.d.setVisibility(0);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabSelected(TabLayout.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48ba408", new Object[]{this, fVar});
            return;
        }
        TabBean W = P().W(fVar);
        if (W == null) {
            O().l().d("MySrpTabView", "onTabSelected: fail to get tab bean");
            return;
        }
        W.isSelected = true;
        TextUtils.isEmpty(W.bizName);
        b bVar = (b) fVar.h();
        if (bVar != null) {
            if ("text".equals(W.showType)) {
                bVar.c(W.showText, this.f);
            } else {
                S(W, bVar);
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabUnselected(TabLayout.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca6e1a1", new Object[]{this, fVar});
            return;
        }
        TabBean W = P().W(fVar);
        if (W == null) {
            O().l().d("MySrpTabView", "onTabUnselected: fail to get tab bean");
            return;
        }
        W.isSelected = false;
        b bVar = (b) fVar.h();
        if (bVar != null) {
            if ("text".equals(W.showType)) {
                bVar.c(W.showText, this.e);
            } else {
                S(W, bVar);
            }
        }
    }
}
