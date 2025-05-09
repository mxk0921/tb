package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.aligallery.AliGalleryContainer;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.data.converter.TTDataDealException;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.List;
import tb.b5m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fos extends ins implements Application.ActivityLifecycleCallbacks, ntc<pog> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTGalleryContainer";
    public final GalleryCore j;
    public final boolean k;
    public c l;
    public final ntc<ez9> m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ntc<ez9> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ntc
        public ThreadMode W2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
            }
            return ThreadMode.MainThread;
        }

        /* renamed from: a */
        public boolean y1(ez9 ez9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d9c2377", new Object[]{this, ez9Var})).booleanValue();
            }
            try {
                tgh.b(fos.TAG, "receiveDestroyMessage() Context: " + fos.this.b.hashCode() + " TTGalleryContainer: " + fos.this.hashCode());
                fos.this.g();
            } catch (Throwable th) {
                tgh.c(fos.TAG, "unregisterActivityLifecycleCallbacks exception when FrameWorkDestroyMessage Context: " + fos.this.b.hashCode(), th);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fos.j(fos.this).v0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    static {
        t2o.a(912261214);
        t2o.a(912261362);
    }

    public fos(Context context, String str, ze7 ze7Var) {
        super(context, str, ze7Var);
        r8c f;
        boolean B = vbl.B();
        this.k = B;
        a aVar = new a();
        this.m = aVar;
        tgh.b(TAG, "TTGalleryContainer() Context: " + context.hashCode() + " TTGalleryContainer: " + hashCode());
        s(ze7Var);
        GalleryCore galleryCore = new GalleryCore(context, h());
        this.j = galleryCore;
        b5m.x R = b5m.R();
        if (!(R == null || (f = R.f(context, h(), galleryCore)) == null)) {
            galleryCore.M0(f);
        }
        if (!B) {
            y(context);
        } else if (pq4.a(context) || tq4.e(context)) {
            tgh.c(TAG, "create TTGalleryContainer when activity destroyed Context: " + this.b.hashCode(), new TTDataDealException("create instance after activity destroyed"));
        } else {
            y(context);
        }
        q84.i(context, pog.class, this);
        if (B) {
            q84.i(context, ez9.class, aVar);
        }
    }

    public static /* synthetic */ Object ipc$super(fos fosVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.g();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTGalleryContainer");
    }

    public static /* synthetic */ GalleryCore j(fos fosVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GalleryCore) ipChange.ipc$dispatch("b0e003ad", new Object[]{fosVar});
        }
        return fosVar.j;
    }

    public void A(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572812fc", new Object[]{this, new Float(f)});
        } else {
            this.j.F0(f);
        }
    }

    public void B(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908bb2d1", new Object[]{this, new Float(f)});
        } else {
            this.j.G0(f);
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98742a58", new Object[]{this, str});
        } else {
            this.j.J0(str);
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce566fc", new Object[]{this, str});
        } else {
            this.j.K0(str);
        }
    }

    public void E(GalleryCore.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4d5aa7", new Object[]{this, lVar});
        } else {
            this.j.L0(lVar);
        }
    }

    public void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f33b5", new Object[]{this, jSONObject});
        } else {
            h().e().t(jSONObject);
        }
    }

    public void G(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76da5cc6", new Object[]{this, cVar});
        } else {
            this.l = cVar;
        }
    }

    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c04418", new Object[]{this, new Integer(i)});
        } else {
            this.j.N0(i);
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac49a8ee", new Object[]{this});
        } else {
            this.j.e0().B();
        }
    }

    public final void J(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55aba82", new Object[]{this, context});
            return;
        }
        ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        tgh.b(TAG, "unregisterActivityLifecycleCallbacks() Context: " + context.hashCode() + " TTGalleryContainer: " + hashCode());
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b4e426", new Object[]{this, str});
        } else {
            this.j.Z0(str);
        }
    }

    public b8z L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8z) ipChange.ipc$dispatch("68edaed4", new Object[]{this});
        }
        return this.j.c1();
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    @Override // tb.ins
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (pq4.a(this)) {
            tgh.b(TAG, "destroy() after activity destroyed Context: " + this.b.hashCode() + " TTGalleryContainer: " + hashCode());
        } else {
            pq4.b(this);
            tgh.b(TAG, "destroy() Context: " + this.b.hashCode() + " TTGalleryContainer: " + hashCode());
            if (this.k) {
                q84.m(this.b, this.m);
            }
            q84.m(this.b, this);
            J(this.b);
            this.j.P();
            super.g();
        }
    }

    public void k(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee22207d", new Object[]{this, viewGroup});
        } else {
            zqp.a().b(viewGroup);
        }
    }

    public void l(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd03736f", new Object[]{this, viewGroup});
        } else {
            this.j.N(viewGroup);
        }
    }

    public <C extends oa4> C m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        return (C) this.j.R(str);
    }

    public <C extends oa4> C n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        return (C) this.j.S(str);
    }

    public String o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856294ce", new Object[]{this, new Integer(i)});
        }
        GalleryCore galleryCore = this.j;
        if (galleryCore != null) {
            return galleryCore.b0(i);
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.b == activity) {
            com.taobao.android.detail.ttdetail.widget.video.a.d().f(activity);
            this.j.e0().w();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onActivityPaused(): " + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.b == activity) {
            com.taobao.android.detail.ttdetail.widget.video.a.d().h(activity);
            this.j.e0().z();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onActivityResumed(): " + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public List<sx9> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82431471", new Object[]{this});
        }
        return this.j.f0();
    }

    public View q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.j.h0();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58893ec9", new Object[]{this});
        } else {
            this.j.e0().q();
        }
    }

    public final void s(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6fd94bb", new Object[]{this, ze7Var});
        } else if (ze7Var == null) {
            gos.b(h(), h().c());
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.j.v0();
        } else {
            h().h().g(new b());
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e7ae6", new Object[]{this, new Boolean(z)});
            return;
        }
        w();
        if (z) {
            r();
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b47111", new Object[]{this, new Boolean(z)});
            return;
        }
        z();
        if (z) {
            I();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebc89ae", new Object[]{this});
        } else {
            this.j.x0();
        }
    }

    public final void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769691eb", new Object[]{this, context});
            return;
        }
        J(context);
        ((Activity) context).getApplication().registerActivityLifecycleCallbacks(this);
        tgh.b(TAG, "registerActivityLifecycleCallbacks() Context: " + context.hashCode() + " TTGalleryContainer: " + hashCode());
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee8ac25", new Object[]{this});
        } else {
            this.j.C0();
        }
    }

    /* renamed from: x */
    public boolean y1(pog pogVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35884fb5", new Object[]{this, pogVar})).booleanValue();
        }
        c cVar = this.l;
        if (cVar != null) {
            ((AliGalleryContainer.b) cVar).a(pogVar);
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", (Object) pogVar.a());
            jSONObject.put("image", (Object) jSONObject2);
            jSONObject.put("bizId", (Object) "blacklight");
            q84.f(this.b, new rc7("share", jSONObject, new RuntimeAbilityParam("shareFromSku", Boolean.TRUE), new RuntimeAbilityParam("shareContainer", pogVar.b())));
        }
        return true;
    }
}
