package com.taobao.umipublish.extension.preview;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity;
import com.taobao.umipublish.extension.preview.widget.PreviewIndexTabView;
import java.util.List;
import tb.a65;
import tb.f9g;
import tb.fyp;
import tb.maw;
import tb.pne;
import tb.t2o;
import tb.ydv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreviewDelegate implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long u = ydv.o();
    public static final int v = a65.a(51.0f);
    public static final int w = a65.a(96.0f);

    /* renamed from: a  reason: collision with root package name */
    public final Activity f13986a;
    public final View b;
    public final ViewPager c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final TextView j;
    public fyp k;
    public final PreviewIndexTabView l;
    public PreviewModel m;
    public final PreviewAdapter n;
    public c p;
    public int o = 0;
    public boolean q = false;
    public int r = 0;
    public final Handler s = new Handler(Looper.getMainLooper());
    public final Runnable t = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PreviewDelegate.a(PreviewDelegate.this).finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int count;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!PreviewDelegate.b(PreviewDelegate.this) && (count = PreviewDelegate.c(PreviewDelegate.this).getCount()) > 0) {
                PreviewDelegate.e(PreviewDelegate.this);
                PreviewDelegate.f(PreviewDelegate.this).setCurrentItem(PreviewDelegate.d(PreviewDelegate.this) % count);
                PreviewDelegate.h(PreviewDelegate.this).postDelayed(this, PreviewDelegate.g());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
    }

    static {
        t2o.a(944767027);
    }

    public PreviewDelegate(Activity activity) {
        this.f13986a = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.activity_umi_preview, (ViewGroup) null, false);
        this.b = inflate;
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.preview_container);
        this.c = viewPager;
        View findViewById = inflate.findViewById(R.id.preview_close);
        this.d = findViewById;
        this.e = (TextView) inflate.findViewById(R.id.preview_title);
        this.l = (PreviewIndexTabView) inflate.findViewById(R.id.preview_index);
        this.i = inflate.findViewById(R.id.ll_music_bar);
        this.j = (TextView) inflate.findViewById(R.id.tv_music_name);
        this.f = (TextView) inflate.findViewById(R.id.preview_edit);
        this.h = (TextView) inflate.findViewById(R.id.preview_videoedit);
        this.g = (TextView) inflate.findViewById(R.id.preview_delete);
        PreviewAdapter previewAdapter = new PreviewAdapter();
        this.n = previewAdapter;
        viewPager.setAdapter(previewAdapter);
        viewPager.addOnPageChangeListener(this);
        previewAdapter.l(0, new pne());
        previewAdapter.l(1, new maw());
        ViewProxy.setOnClickListener(findViewById, new a());
    }

    public static /* synthetic */ Activity a(PreviewDelegate previewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("8fef1f6", new Object[]{previewDelegate});
        }
        return previewDelegate.f13986a;
    }

    public static /* synthetic */ boolean b(PreviewDelegate previewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3da37d5", new Object[]{previewDelegate})).booleanValue();
        }
        return previewDelegate.q;
    }

    public static /* synthetic */ PreviewAdapter c(PreviewDelegate previewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewAdapter) ipChange.ipc$dispatch("4eae4119", new Object[]{previewDelegate});
        }
        return previewDelegate.n;
    }

    public static /* synthetic */ int d(PreviewDelegate previewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d09c3f82", new Object[]{previewDelegate})).intValue();
        }
        return previewDelegate.r;
    }

    public static /* synthetic */ int e(PreviewDelegate previewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("728fbc7a", new Object[]{previewDelegate})).intValue();
        }
        int i = previewDelegate.r;
        previewDelegate.r = 1 + i;
        return i;
    }

    public static /* synthetic */ ViewPager f(PreviewDelegate previewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("81e57155", new Object[]{previewDelegate});
        }
        return previewDelegate.c;
    }

    public static /* synthetic */ long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5552fb0", new Object[0])).longValue();
        }
        return u;
    }

    public static /* synthetic */ Handler h(PreviewDelegate previewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4535c1a", new Object[]{previewDelegate});
        }
        return previewDelegate.s;
    }

    public void A(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdc8587", new Object[]{this, onClickListener});
        } else {
            ViewProxy.setOnClickListener(this.d, onClickListener);
        }
    }

    public void B(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0fb182", new Object[]{this, onClickListener});
        } else {
            this.g.setOnClickListener(onClickListener);
        }
    }

    public void C(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342134a1", new Object[]{this, onClickListener});
        } else {
            this.f.setOnClickListener(onClickListener);
        }
    }

    public void D(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c711bbc5", new Object[]{this, onClickListener});
        } else {
            ViewProxy.setOnClickListener(this.i, onClickListener);
        }
    }

    public void E(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36c72da", new Object[]{this, onClickListener});
        } else {
            this.h.setOnClickListener(onClickListener);
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b226a7", new Object[]{this});
        } else {
            this.n.p();
        }
    }

    public final void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea99feb", new Object[]{this, new Integer(i)});
            return;
        }
        this.l.clearTabs();
        r(this.m);
        int size = this.m.d.size() - 1;
        if (i >= size) {
            i = size;
        }
        this.l.setFocused(i);
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c030bb9", new Object[]{this, new Integer(i)});
            return;
        }
        PreviewAdapter previewAdapter = this.n;
        if (previewAdapter != null && previewAdapter.getCount() > 1) {
            this.r = i;
            this.s.postDelayed(this.t, u);
        }
    }

    public PreviewModel.Media j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel.Media) ipChange.ipc$dispatch("6c1b66d1", new Object[]{this, new Integer(i)});
        }
        List<PreviewModel.Media> list = this.m.d;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        PreviewModel.Media remove = this.m.d.remove(i);
        PreviewModel previewModel = this.m;
        if (previewModel.b == 2) {
            this.c.setOffscreenPageLimit(Math.min(previewModel.d.size(), 6));
        }
        this.n.m(remove.type);
        this.n.n(this.m.d);
        this.e.setText(p(this.c.getCurrentItem() + 1));
        G(i);
        return remove;
    }

    public void k(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d00edf", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.g;
        if (textView != null) {
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public void l(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d0520", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.f;
        if (textView != null) {
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public void m(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2091fd8b", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.h;
        if (textView != null) {
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public PreviewModel.Media n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel.Media) ipChange.ipc$dispatch("b66a52e7", new Object[]{this});
        }
        return this.m.d.get(this.o);
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        return this.o;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.q = true;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.setText(p(1 + i));
        this.o = i;
        PreviewModel previewModel = this.m;
        int i3 = previewModel.b;
        if (i3 == 0) {
            boolean z = previewModel.c;
            this.f.setEnabled(z);
            TextView textView = this.f;
            if (!z) {
                i2 = 4;
            }
            textView.setVisibility(i2);
        } else if (i3 == 2) {
            boolean z2 = previewModel.c;
            this.f.setEnabled(z2);
            TextView textView2 = this.f;
            if (!z2) {
                i2 = 4;
            }
            textView2.setVisibility(i2);
            F();
        }
        this.l.setFocused(i);
        c cVar = this.p;
        if (cVar != null) {
            ((UmiImagePreviewActivity.e) cVar).b();
        }
    }

    public final String p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9800c73", new Object[]{this, new Integer(i)});
        }
        return "";
    }

    public View q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public final void r(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b04ab78", new Object[]{this, previewModel});
            return;
        }
        List<PreviewModel.Media> list = previewModel.d;
        if (list == null || list.size() <= 1) {
            this.l.setVisibility(8);
            return;
        }
        this.l.setVisibility(0);
        for (int i = 0; i < previewModel.d.size(); i++) {
            this.l.addTab(new PreviewIndexTabView.a(i, previewModel.d.size(), String.valueOf(i)));
        }
    }

    public final void s(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85792ad8", new Object[]{this, previewModel});
        } else if (previewModel == null || previewModel.e == null) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            z(previewModel.e.name);
            fyp fypVar = new fyp();
            this.k = fypVar;
            fypVar.c(previewModel.e.path);
            c cVar = this.p;
            if (cVar != null) {
                ((UmiImagePreviewActivity.e) cVar).a();
            }
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fyp fypVar = this.k;
        if (fypVar != null) {
            fypVar.a();
        }
        this.s.removeCallbacksAndMessages(null);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        fyp fypVar = this.k;
        if (fypVar != null) {
            fypVar.e();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        fyp fypVar = this.k;
        if (fypVar != null) {
            fypVar.d();
        }
    }

    public void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.c.setCurrentItem(i, z);
        onPageSelected(i);
    }

    public void x(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd7bdcc", new Object[]{this, previewModel});
            return;
        }
        this.m = previewModel;
        this.n.n(previewModel.d);
        this.n.o(previewModel.b);
        PreviewModel previewModel2 = this.m;
        if (previewModel2.b == 2) {
            this.c.setOffscreenPageLimit(Math.min(previewModel2.d.size(), 6));
        }
        this.e.setText(p(1));
        this.f.setText(previewModel.f);
        r(previewModel);
        s(previewModel);
    }

    public void y(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3945562c", new Object[]{this, cVar});
        } else {
            this.p = cVar;
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139f9d27", new Object[]{this, str});
            return;
        }
        String str2 = " " + str + " ";
        int min = Math.min(w, Math.max(v, (int) this.j.getPaint().measureText(str2)));
        CharSequence d = f9g.d(str2, this.j.getPaint(), a65.a(1.0f) + min);
        this.j.setLayoutParams(new LinearLayout.LayoutParams(min, -2));
        this.j.setText(d);
        this.j.setFocusable(true);
        this.j.setFocusableInTouchMode(true);
        this.j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.j.setMarqueeRepeatLimit(-1);
        this.j.setSelected(true);
        this.j.setSingleLine();
    }
}
