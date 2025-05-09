package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dfp f28776a;
    public WeakReference<Context> b;
    public rdc c;
    public final dge d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rdc.a f28777a;

        public a(rdc.a aVar) {
            this.f28777a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View e = tkv.a(tkv.this).e(this.f28777a);
            if (e != null) {
                fve.e("UpgradeIconAnimeTrigger", "compensateAnime start");
                tkv.b(tkv.this, this.f28777a, e);
            }
        }
    }

    static {
        t2o.a(491782386);
    }

    public tkv(dfp dfpVar, dge dgeVar) {
        this.f28776a = dfpVar;
        this.d = dgeVar;
    }

    public static /* synthetic */ dge a(tkv tkvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dge) ipChange.ipc$dispatch("11ea0aea", new Object[]{tkvVar});
        }
        return tkvVar.d;
    }

    public static /* synthetic */ void b(tkv tkvVar, rdc.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db30158a", new Object[]{tkvVar, aVar, view});
        } else {
            tkvVar.h(aVar, view);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745ee826", new Object[]{this});
            return;
        }
        rdc rdcVar = this.c;
        if (rdcVar != null) {
            ((x10) rdcVar).g();
            fve.e("UpgradeIconAnimeTrigger", "cancel animation task");
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1a1c63", new Object[]{this});
            return;
        }
        rdc rdcVar = this.c;
        if (rdcVar != null) {
            this.f28776a.d(((x10) rdcVar).s().e());
        }
    }

    public final void e(rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3837c1d", new Object[]{this, aVar});
        } else {
            get.a().f(new a(aVar), 500L);
        }
    }

    public final TUrlImageView f(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("268b17f5", new Object[]{this, bitmap});
        }
        WeakReference<Context> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        if (!(context instanceof Activity)) {
            return null;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(((Activity) context).getResources(), bitmap);
        create.setCornerRadius(24.0f);
        tUrlImageView.setImageDrawable(create);
        tUrlImageView.setMaxHeight(pb6.r(context));
        tUrlImageView.setMaxWidth(pb6.s(context));
        return tUrlImageView;
    }

    public void g(Context context, rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04d6110", new Object[]{this, context, aVar});
            return;
        }
        this.b = new WeakReference<>(context);
        rdc rdcVar = this.c;
        if (rdcVar != null) {
            ((x10) rdcVar).g();
        }
        Context context2 = this.b.get();
        if (!(aVar == null || context2 == null)) {
            if (aVar.g()) {
                this.c = new mt0(context2, aVar);
            } else {
                this.c = new rfe(context2, aVar);
            }
        }
        i();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fff018", new Object[]{this});
            return;
        }
        rdc rdcVar = this.c;
        if (rdcVar == null || ((x10) rdcVar).t()) {
            fve.e("UpgradeIconAnimeTrigger", "playAnime mAnimeTask == null");
            return;
        }
        rdc.a s = ((x10) this.c).s();
        if (!s.l()) {
            fve.e("UpgradeIconAnimeTrigger", "Invalidate config:config" + s);
            return;
        }
        View e = this.d.e(s);
        if (e == null) {
            fve.e("UpgradeIconAnimeTrigger", "finalTargetView ==null compensateAnime");
            e(s);
            return;
        }
        h(s, e);
    }

    public final void h(rdc.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34da540a", new Object[]{this, aVar, view});
        } else if (this.c == null) {
            fve.e("UpgradeIconAnimeTrigger", "startAnime mAnimeTask == null");
        } else {
            Bitmap e = this.f28776a.e(aVar.e());
            if (e == null || e.isRecycled()) {
                this.c = null;
                fve.e("UpgradeIconAnimeTrigger", "No legal bitmap can be use" + aVar);
                return;
            }
            TUrlImageView f = f(e);
            if (f == null) {
                fve.e("UpgradeIconAnimeTrigger", "startAnime imageView == null");
                return;
            }
            ((x10) this.c).w(f);
            ((x10) this.c).x(view);
            ((x10) this.c).e();
            ((x10) this.c).y(false, 0L);
        }
    }
}
