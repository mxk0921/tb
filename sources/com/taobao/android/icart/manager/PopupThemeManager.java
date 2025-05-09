package com.taobao.android.icart.manager;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.cfx;
import tb.jg2;
import tb.kmb;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PopupThemeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TUrlImageView f8018a;
    public String b;
    public final View c;
    public final ViewGroup d;
    public boolean e;
    public final RecyclerView f;
    public final jg2 g;
    public final int h;
    public final kmb i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8020a;

        public a(ViewGroup viewGroup) {
            this.f8020a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int height = this.f8020a.getHeight();
            ViewGroup.LayoutParams layoutParams = PopupThemeManager.b(PopupThemeManager.this).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = height;
                PopupThemeManager.b(PopupThemeManager.this).requestLayout();
            }
        }
    }

    static {
        t2o.a(478150825);
    }

    public PopupThemeManager(kmb kmbVar, jg2 jg2Var, ViewGroup viewGroup, RecyclerView recyclerView) {
        this.d = viewGroup;
        TUrlImageView tUrlImageView = new TUrlImageView(kmbVar.getContext());
        this.f8018a = tUrlImageView;
        int d0 = kmbVar.e().d0(160.0f);
        this.h = d0;
        tUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, d0));
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f = recyclerView;
        this.g = jg2Var;
        View view = new View(kmbVar.getContext());
        this.c = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, d0));
        view.setAlpha(0.0f);
        view.setBackgroundColor(-1);
        this.i = kmbVar;
    }

    public static /* synthetic */ void a(PopupThemeManager popupThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55339951", new Object[]{popupThemeManager});
        } else {
            popupThemeManager.d();
        }
    }

    public static /* synthetic */ View b(PopupThemeManager popupThemeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1f155dd4", new Object[]{popupThemeManager});
        }
        return popupThemeManager.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcffaae", new Object[]{this});
            return;
        }
        this.d.removeView(this.f8018a);
        this.d.removeView(this.c);
        this.f8018a.setVisibility(8);
        this.c.setAlpha(0.0f);
    }

    public final void d() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b81897", new Object[]{this});
            return;
        }
        float c = this.g.c();
        this.f8018a.setTranslationY(-c);
        float f = c / this.h;
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.c.setAlpha(f);
        if (c > 0.0f) {
            str = pg1.ATOM_EXT_white;
        } else {
            str = ThemeUtils.COLOR_SCHEME_DARK;
        }
        e(str);
    }

    public final void e(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c769b9", new Object[]{this, str});
            return;
        }
        List<IDMComponent> h = this.i.e().l0().h();
        if (h != null) {
            for (IDMComponent iDMComponent : h) {
                if (!TextUtils.equals(str, iDMComponent.getFields().getString("_themeState"))) {
                    iDMComponent.getFields().put("_themeState", (Object) str);
                    z = true;
                }
            }
            if (z) {
                this.i.e().h0().c(1);
            }
        }
    }

    public void f(cfx cfxVar) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d884502f", new Object[]{this, cfxVar});
            return;
        }
        if (cfxVar == null || cfxVar.e() == null) {
            z = false;
        }
        this.e = z;
        if (cfxVar != null) {
            str = cfxVar.e();
        } else {
            str = "";
        }
        this.b = str;
        if (this.e) {
            g();
        } else {
            c();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dabd3f53", new Object[]{this});
        } else if (this.b != null) {
            this.c.setAlpha(0.0f);
            this.f8018a.setImageUrl(this.b);
            if (this.f8018a.getParent() == null) {
                this.d.addView(this.f8018a, 0);
            }
            if (this.c.getParent() == null) {
                this.d.addView(this.c, 1);
            }
            this.f8018a.setVisibility(0);
            this.f.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.manager.PopupThemeManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/PopupThemeManager$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    } else if (i == 0) {
                        PopupThemeManager.a(PopupThemeManager.this);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    } else {
                        PopupThemeManager.a(PopupThemeManager.this);
                    }
                }
            });
            ViewGroup a2 = this.i.e().h0().a();
            a2.post(new a(a2));
        }
    }
}
