package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainSecondFragment;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bm7 extends j00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DinamicDataObject b;
    public TemplateObject c;
    public final Context d;
    public final ViewGroup e;
    public View f;
    public final b0h g;
    public cmb h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements rzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rzb
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6216d0", new Object[]{this, view});
            } else {
                bm7.this.c(view);
            }
        }

        @Override // tb.rzb
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a14aabed", new Object[]{this});
            } else {
                bm7.this.b();
            }
        }
    }

    static {
        t2o.a(310378773);
    }

    public bm7(DinamicDataObject dinamicDataObject, Context context, ViewGroup viewGroup, b0h b0hVar) {
        if (dinamicDataObject != null) {
            n(dinamicDataObject);
        }
        this.d = context;
        this.e = viewGroup;
        this.g = b0hVar;
    }

    public static /* synthetic */ Object ipc$super(bm7 bm7Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                bm7Var.a();
                return null;
            case -583924053:
                super.c((View) objArr[0]);
                return null;
            case -558272972:
                super.d();
                return null;
            case 498594312:
                super.b();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/module/DinamicCard");
        }
    }

    @Override // tb.j00
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db7f208", new Object[]{this});
        } else {
            super.b();
        }
    }

    @Override // tb.j00
    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3206ab", new Object[]{this, view});
            return;
        }
        if (view != null) {
            this.f = view;
        }
        super.c(view);
    }

    @Override // tb.j00
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            super.d();
        }
    }

    public void f() {
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54838a8e", new Object[]{this});
        } else if (this.f != null && this.b != null) {
            try {
                b0h b0hVar = this.g;
                if (b0hVar != null && b0hVar.q() != null && this.g.q().getDinamicSdkManager() != null) {
                    DinamicXEngine dinamicEngine = this.g.q().getDinamicSdkManager().getDinamicEngine();
                    if (!(dinamicEngine == null || (hashMap = this.b.data) == null)) {
                        View view = this.f;
                        if (view instanceof DXRootView) {
                            dinamicEngine.D0(this.d, hashMap.get("data"), ((DXRootView) view).getDxTemplateItem(), -1);
                        }
                    }
                    this.g.q().getDinamicSdkManager().bindData(this.f, this.b);
                }
            } catch (Exception unused) {
                TLog.loge("CardContainer", "    template name: " + this.b.templateName);
            }
        }
    }

    public DinamicDataObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicDataObject) ipChange.ipc$dispatch("1e08e738", new Object[]{this});
        }
        return this.b;
    }

    public ViewGroup h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b91cfe0e", new Object[]{this});
        }
        return this.e;
    }

    public TemplateObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("c00cf0db", new Object[]{this});
        }
        return this.c;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156fa3d3", new Object[]{this});
        } else if (this.b != null && this.d != null) {
            try {
                if (this.g.q().getDinamicSdkManager() != null) {
                    this.g.q().getDinamicSdkManager().inflateView(this.d, this.b, new a());
                }
            } catch (Exception e) {
                TLog.loge("CardContainer", "inflate view exp.", e);
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        b0h b0hVar = this.g;
        if (b0hVar != null && b0hVar.q() != null && this.g.q().getDinamicSdkManager() != null) {
            this.g.q().getDinamicSdkManager().setWillDisplay(this.f);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        b0h b0hVar = this.g;
        if (b0hVar != null) {
            if (!(b0hVar.q() == null || this.g.q().getDinamicSdkManager() == null)) {
                this.g.q().getDinamicSdkManager().setDidEndDisplay(this.f);
            }
            if (this.g.h() != null) {
                this.g.h().removeParent();
            }
            if (this.g.r() != null && (this.f instanceof DXRootView)) {
                this.g.r().i((DXRootView) this.f);
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void n(DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87c3ec8", new Object[]{this, dinamicDataObject});
        } else {
            this.b = dinamicDataObject;
        }
    }

    public void o(cmb cmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670bd6e0", new Object[]{this, cmbVar});
        } else {
            this.h = cmbVar;
        }
    }

    public void p(TemplateObject templateObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98661d1", new Object[]{this, templateObject});
        } else {
            this.c = templateObject;
        }
    }

    public void q() {
        DinamicDataObject dinamicDataObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2756a9", new Object[]{this});
        } else if (this.h != null && this.f != null && (dinamicDataObject = this.b) != null && !dinamicDataObject.mIsCache && !dinamicDataObject.mShowUtParam) {
            Rect rect = new Rect();
            boolean localVisibleRect = this.f.getLocalVisibleRect(rect);
            if (rect.height() > h().getMeasuredHeight() / 2) {
                z = true;
            }
            if (localVisibleRect && z) {
                DinamicDataObject dinamicDataObject2 = this.b;
                dinamicDataObject2.mShowUtParam = true;
                ((HomeMainSecondFragment) this.h).s3(this, dinamicDataObject2);
                TLog.loge("CardContainer", "onShowUtParams：" + this.b.mPosition);
            }
        }
    }
}
