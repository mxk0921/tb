package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.framework.container.loading.LoadingDialog;
import com.taobao.android.litecreator.widgets.LCBubble;
import java.util.HashMap;
import java.util.Stack;
import tb.dov;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c8g extends b8g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final wic e;
    public LoadingDialog f;
    public dov.a g;
    public final c5e i;
    public String j;
    public com.taobao.android.litecreator.widgets.a k;
    public final Stack<e8g> h = new Stack<>();
    public final yic l = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends fag {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/context/LCContextImpl$1");
        }

        @Override // tb.fag, tb.yic
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45891773", new Object[]{this});
            } else {
                c8g.this.h();
            }
        }
    }

    static {
        t2o.a(511705531);
    }

    public c8g(Context context, String str, String str2) {
        String str3;
        this.d = context;
        HashMap hashMap = new HashMap();
        if (J()) {
            str3 = "liteModel";
        } else {
            str3 = "normal";
        }
        hashMap.put("model", str3);
        this.i = new m3v(str, str2, hashMap);
        this.e = new gpl(context);
    }

    public static c8g G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8g) ipChange.ipc$dispatch("eda6b4a9", new Object[]{context});
        }
        return H(context, "unknown", "unknown");
    }

    public static c8g H(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8g) ipChange.ipc$dispatch("c55cd615", new Object[]{context, str, str2});
        }
        return new c8g(context, str, str2);
    }

    public static /* synthetic */ Object ipc$super(c8g c8gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/context/LCContextImpl");
    }

    @Override // tb.b8g
    public void A(e8g e8gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696e10c9", new Object[]{this, e8gVar});
        } else {
            this.h.push(e8gVar);
        }
    }

    @Override // tb.b8g
    public void B(LCBubble lCBubble, LCBubble.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207de11a", new Object[]{this, lCBubble, hVar});
        } else {
            this.k.f(lCBubble, hVar);
        }
    }

    @Override // tb.b8g
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            D(false);
        }
    }

    @Override // tb.b8g
    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            ebg.l(this.d, str);
        }
    }

    @Override // tb.b8g
    public void F(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90ae82b", new Object[]{this, charSequence});
            return;
        }
        LoadingDialog loadingDialog = this.f;
        if (loadingDialog != null) {
            loadingDialog.u2(charSequence);
        }
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c0ecc7", new Object[]{this, str});
            return;
        }
        this.g = dov.b(str);
        this.j = str;
        this.k = new com.taobao.android.litecreator.widgets.a();
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20856d1c", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(Resource.TYPE_TEMPLATE_LITE, muu.i(this.d));
    }

    @Override // tb.b8g
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cb6573", new Object[]{this});
        } else {
            ((gpl) this.e).close();
        }
    }

    @Override // tb.b8g
    public b8g i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8g) ipChange.ipc$dispatch("43afadc8", new Object[]{this});
        }
        return null;
    }

    @Override // tb.b8g
    public MutableLiveData o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("36e99b37", new Object[]{this, str});
        }
        if (((HashMap) this.c).get(str) == null) {
            ((HashMap) this.c).put(str, new MutableLiveData());
        }
        return (MutableLiveData) ((HashMap) this.c).get(str);
    }

    @Override // tb.b8g
    public dov.a q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dov.a) ipChange.ipc$dispatch("2cbf1799", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.b8g
    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("648be081", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.b8g
    public c5e s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("1ebed9f4", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.b8g
    public void u() {
        LoadingDialog loadingDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        Context context = this.d;
        if ((context instanceof Activity) && !((Activity) context).isDestroyed() && (loadingDialog = this.f) != null) {
            try {
                loadingDialog.dismissAllowingStateLoss();
            } catch (Throwable th) {
                odg.c("LCContextImpl", "hideLoading error. info:" + Log.getStackTraceString(th));
            }
        }
    }

    @Override // tb.b8g
    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57054a76", new Object[]{this})).booleanValue();
        }
        return ((gpl) this.e).isShowing();
    }

    @Override // tb.b8g
    public boolean w(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50a2a524", new Object[]{this, view})).booleanValue();
        }
        return ((gpl) this.e).s(view);
    }

    @Override // tb.b8g
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeebd8b1", new Object[]{this})).booleanValue();
        }
        return muu.y(this.d);
    }

    @Override // tb.b8g
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (!this.h.empty()) {
            if (((gpl) this.e).isShowing()) {
                ((gpl) this.e).close();
                return;
            }
            e8g pop = this.h.pop();
            if (pop != null) {
                pop.h();
            }
        }
    }

    @Override // tb.b8g
    public void z(View view, yic yicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e84581d", new Object[]{this, view, yicVar});
            return;
        }
        if (yicVar == null) {
            yicVar = this.l;
        }
        ((gpl) this.e).a(view);
        ((gpl) this.e).w(yicVar);
        ((gpl) this.e).show();
    }

    @Override // tb.b8g
    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed9df0e", new Object[]{this, new Boolean(z)});
            return;
        }
        u();
        Context context = this.d;
        if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
            if (this.f == null) {
                this.f = new LoadingDialog();
            }
            try {
                this.f.setCancelable(z);
                this.f.show(((FragmentActivity) this.d).getSupportFragmentManager(), "lc_loading_dialog");
            } catch (Throwable th) {
                odg.c("LCContextImpl", "showLoading error. info:" + Log.getStackTraceString(th));
            }
        }
    }
}
