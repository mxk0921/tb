package com.taobao.search.sf.widgets.headerskin;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.sf.widgets.headerskin.SkinView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.cpt;
import tb.d1a;
import tb.n14;
import tb.njg;
import tb.s8d;
import tb.t2o;
import tb.tot;
import tb.wot;
import tb.wsa;
import tb.xyd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SkinView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f11708a;
    public ThemeFrameLayout b;
    public FrameLayout c;
    public TUrlImageView d;
    public final tot e;
    public final boolean g;
    public final HandlerThread f = wsa.a("tb-search-thread");
    public final njg h = kotlin.a.b(new d1a() { // from class: tb.joz
        @Override // tb.d1a
        public final Object invoke() {
            Handler l;
            l = SkinView.l(SkinView.this);
            return l;
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f11709a;
        public final /* synthetic */ SkinView b;

        public a(TUrlImageView tUrlImageView, SkinView skinView) {
            this.f11709a = tUrlImageView;
            this.b = skinView;
        }

        public static final void d(Bitmap bitmap, float f, final SkinView skinView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5444cc0", new Object[]{bitmap, new Float(f), skinView});
                return;
            }
            ckf.g(skinView, "this$0");
            final wot wotVar = new wot(n14.b(bitmap), f);
            FrameLayout f2 = skinView.f();
            ckf.d(f2);
            f2.post(new Runnable() { // from class: tb.loz
                @Override // java.lang.Runnable
                public final void run() {
                    SkinView.a.e(SkinView.this, wotVar);
                }
            });
            FrameLayout f3 = skinView.f();
            ckf.d(f3);
            f3.postInvalidate();
        }

        public static final void e(SkinView skinView, wot wotVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a04b2c0", new Object[]{skinView, wotVar});
                return;
            }
            ckf.g(skinView, "this$0");
            ckf.g(wotVar, "$drawable");
            if (!skinView.d().isFinishing()) {
                FrameLayout f = skinView.f();
                ckf.d(f);
                f.setForeground(wotVar);
            }
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            final Bitmap bitmap;
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null || (drawable = succPhenixEvent.getDrawable()) == null) {
                bitmap = null;
            } else {
                bitmap = drawable.getBitmap();
            }
            if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
                this.f11709a.setImageDrawable(null);
                return true;
            }
            this.f11709a.setImageDrawable(succPhenixEvent.getDrawable());
            final float width = this.f11709a.getWidth() / ((bitmap.getWidth() * 1.0f) / bitmap.getHeight());
            this.f11709a.getLayoutParams().height = (int) width;
            this.f11709a.requestLayout();
            Handler a2 = SkinView.a(this.b);
            final SkinView skinView = this.b;
            a2.post(new Runnable() { // from class: tb.koz
                @Override // java.lang.Runnable
                public final void run() {
                    SkinView.a.d(bitmap, width, skinView);
                }
            });
            return true;
        }
    }

    static {
        t2o.a(815793578);
    }

    public SkinView(int i, Activity activity, String str) {
        ckf.g(activity, "activity");
        ckf.g(str, "bizName");
        this.f11708a = activity;
        tot totVar = new tot(str, i);
        this.e = totVar;
        this.g = xyd.a(activity);
        totVar.e = i;
    }

    public static final /* synthetic */ Handler a(SkinView skinView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4abc80cb", new Object[]{skinView});
        }
        return skinView.e();
    }

    public static final Handler l(SkinView skinView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a34c3bce", new Object[]{skinView});
        }
        ckf.g(skinView, "this$0");
        skinView.f.start();
        return new Handler(skinView.f.getLooper());
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            this.f.quitSafely();
        } catch (Exception unused) {
        }
    }

    public final Activity d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f11708a;
    }

    public final Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e5fe2bb", new Object[]{this});
        }
        return (Handler) this.h.getValue();
    }

    public final FrameLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5c6a177", new Object[]{this});
        }
        ThemeFrameLayout themeFrameLayout = this.b;
        if (themeFrameLayout != null) {
            return themeFrameLayout;
        }
        return this.c;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3ec0f1", new Object[]{this});
            return;
        }
        SearchUrlImageView searchUrlImageView = new SearchUrlImageView(this.f11708a);
        this.d = searchUrlImageView;
        searchUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
        FrameLayout frameLayout = new FrameLayout(this.f11708a);
        this.c = frameLayout;
        frameLayout.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void h(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341f4b02", new Object[]{this, tUrlImageView});
        } else {
            tUrlImageView.succListener(new a(tUrlImageView, this));
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450e6b8a", new Object[]{this});
        } else if (!this.g || cpt.h() || cpt.g()) {
            ThemeFrameLayout b = cpt.c().b(this.f11708a, this.e);
            this.b = b;
            if (b != null) {
                View childAt = b.getChildAt(0);
                TUrlImageView tUrlImageView = null;
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    View childAt2 = viewGroup.getChildAt(0);
                    if (childAt2 instanceof TUrlImageView) {
                        tUrlImageView = (TUrlImageView) childAt2;
                    }
                    if (tUrlImageView != null) {
                        this.d = tUrlImageView;
                        h(tUrlImageView);
                    }
                }
            }
        } else {
            FrameLayout frameLayout = new FrameLayout(this.f11708a);
            this.c = frameLayout;
            frameLayout.setBackgroundColor(-1);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e2cc410", new Object[]{this});
            return;
        }
        ThemeData e = cpt.c().e(this.e.f28850a);
        ThemeFrameLayout themeFrameLayout = this.b;
        if (themeFrameLayout != null) {
            themeFrameLayout.loadData(e);
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            tUrlImageView.setVisibility(8);
            tUrlImageView.setImageUrl("");
            FrameLayout f = f();
            ckf.d(f);
            f.setForeground(null);
            FrameLayout f2 = f();
            ckf.d(f2);
            f2.postInvalidate();
            return;
        }
        tUrlImageView.setVisibility(0);
        tUrlImageView.setImageUrl(str);
        h(tUrlImageView);
    }
}
