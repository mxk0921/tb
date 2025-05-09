package tb;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.megadesign.view.LoadingView;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class pvp extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoadingView f26342a;
        public final /* synthetic */ ViewGroup b;

        public a(LoadingView loadingView, ViewGroup viewGroup) {
            this.f26342a = loadingView;
            this.b = viewGroup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f26342a.show(this.b);
            }
        }
    }

    static {
        t2o.a(478150963);
    }

    public static /* synthetic */ Object ipc$super(pvp pvpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/ShowLoadingNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        ViewGroup j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        rv i = CartMegaManager.INSTANCE.i(str);
        sv b = i != null ? i.b() : null;
        if (b == null || (j = b.j()) == null) {
            return false;
        }
        LoadingView i2 = b.i();
        i2.reset();
        if (jSONObject.containsKey("message")) {
            i2.setMessage(jSONObject.getString("message"));
        }
        if (jSONObject.containsKey("style")) {
            i2.setStyle(jSONObject.getString("style"));
        }
        new Handler(Looper.getMainLooper()).post(new a(i2, j));
        return true;
    }
}
