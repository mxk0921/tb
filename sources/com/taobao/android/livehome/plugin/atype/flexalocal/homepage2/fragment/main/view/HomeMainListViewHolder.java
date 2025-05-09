package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.b0h;
import tb.bm7;
import tb.cmb;
import tb.j00;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeMainListViewHolder extends BaseViewHolder<IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8841a;
    public final ViewGroup b;
    public bm7 c;
    public final b0h d;
    public cmb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements j00.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(j00 j00Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c57d08e", new Object[]{this, j00Var});
            }
        }

        public void b(j00 j00Var, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("630c03d9", new Object[]{this, j00Var, view});
                return;
            }
            if (HomeMainListViewHolder.c0(HomeMainListViewHolder.this) != null) {
                HomeMainListViewHolder.c0(HomeMainListViewHolder.this).removeAllViews();
                HomeMainListViewHolder.c0(HomeMainListViewHolder.this).addView(view);
            }
            HomeMainListViewHolder.d0(HomeMainListViewHolder.this).k();
        }
    }

    static {
        t2o.a(310378790);
    }

    public HomeMainListViewHolder(Context context, ViewGroup viewGroup, int i, b0h b0hVar) {
        super(viewGroup, i);
        new Rect();
        this.f8841a = context;
        this.d = b0hVar;
        View view = this.itemView;
        if (view != null) {
            this.b = (ViewGroup) view.findViewById(R.id.tao_live_dinamic_card_container);
        }
    }

    public static /* synthetic */ ViewGroup c0(HomeMainListViewHolder homeMainListViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ff21c82d", new Object[]{homeMainListViewHolder});
        }
        return homeMainListViewHolder.b;
    }

    public static /* synthetic */ bm7 d0(HomeMainListViewHolder homeMainListViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bm7) ipChange.ipc$dispatch("549bc893", new Object[]{homeMainListViewHolder});
        }
        return homeMainListViewHolder.c;
    }

    public static /* synthetic */ Object ipc$super(HomeMainListViewHolder homeMainListViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/HomeMainListViewHolder");
    }

    public void e0(IMTOPDataObject iMTOPDataObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b11129", new Object[]{this, iMTOPDataObject, new Integer(i)});
        } else if (iMTOPDataObject instanceof DinamicDataObject) {
            DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
            dinamicDataObject.mPosition = i;
            if (dinamicDataObject.data != null) {
                bm7 bm7Var = this.c;
                if (bm7Var != null) {
                    if (dinamicDataObject == bm7Var.g()) {
                        this.c.m();
                        this.c.l();
                        this.c.f();
                        this.c.d();
                        this.c.k();
                        return;
                    }
                    TemplateObject template = this.d.q().getTemplate(dinamicDataObject.templateName);
                    if (!(this.c.g() == null || template == null || !template.equals(this.c.i()))) {
                        this.c.m();
                        this.c.l();
                        this.c.n(dinamicDataObject);
                        this.c.f();
                        this.c.d();
                        this.c.k();
                        return;
                    }
                }
                bm7 bm7Var2 = new bm7(dinamicDataObject, this.f8841a, this.b, this.d);
                this.c = bm7Var2;
                bm7Var2.o(this.e);
                this.c.p(this.d.q().getTemplate(dinamicDataObject.templateName));
                this.c.e(new a());
                this.c.j();
            }
        }
    }

    public DinamicDataObject f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicDataObject) ipChange.ipc$dispatch("1e08e738", new Object[]{this});
        }
        bm7 bm7Var = this.c;
        if (bm7Var == null) {
            return null;
        }
        return bm7Var.g();
    }

    public void g0(int i) {
        bm7 bm7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
        } else if (i == 0 && (bm7Var = this.c) != null) {
            bm7Var.q();
        }
    }

    public void h0(cmb cmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bd2406", new Object[]{this, cmbVar});
        } else {
            this.e = cmbVar;
        }
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2756a9", new Object[]{this});
            return;
        }
        bm7 bm7Var = this.c;
        if (bm7Var != null) {
            bm7Var.q();
        }
    }

    public void onScrollStateChanged(int i) {
        bm7 bm7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0 && (bm7Var = this.c) != null) {
            bm7Var.q();
        }
        b0h b0hVar = this.d;
        if (b0hVar != null && b0hVar.h() != null) {
            this.d.h().removeParent();
        }
    }
}
