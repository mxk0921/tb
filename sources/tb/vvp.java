package tb;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class vvp extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sv f30284a;
        public final /* synthetic */ Activity b;

        public a(sv svVar, Activity activity) {
            this.f30284a = svVar;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f30284a.k().g(this.b, true);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ plq f30285a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ Uri.Builder c;
        public final /* synthetic */ c d;
        public final /* synthetic */ JSONObject e;

        public b(plq plqVar, Activity activity, Uri.Builder builder, c cVar, JSONObject jSONObject) {
            this.f30285a = plqVar;
            this.b = activity;
            this.c = builder;
            this.d = cVar;
            this.e = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f30285a.x(this.b, this.c.toString(), this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30286a;

        public c(String str) {
            this.f30286a = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/ShowStdPopNativeHandler$handleNativeBiz$callback$1");
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(this.f30286a);
            if (f != null) {
                f.invoke(new JSONObject());
            }
        }
    }

    static {
        t2o.a(478150965);
    }

    public static /* synthetic */ Object ipc$super(vvp vvpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/ShowStdPopNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        Activity f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        rv i = CartMegaManager.INSTANCE.i(str);
        sv b2 = i != null ? i.b() : null;
        if (b2 == null || (f = b2.f()) == null) {
            return false;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new a(b2, f));
        int id = b2.j().getId();
        String string = jSONObject.getString("url");
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        boolean booleanValue = jSONObject.getBooleanValue("useCartRootView");
        JSONObject jSONObject3 = jSONObject.getJSONObject(h9.KEY_POP_CONFIG);
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("margins");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        plq plqVar = new plq();
        plqVar.r(true);
        Float f2 = jSONObject3.getFloat("maxHeight");
        plqVar.q(f2 != null ? f2.floatValue() : 0.8f);
        if (jSONObject3.containsKey("backgroundColor")) {
            plqVar.i(jSONObject3.getString("backgroundColor"));
        }
        String string2 = jSONObject3.getString("contentBackgroundColor");
        if (string2 == null) {
            string2 = "#FFFFFF";
        }
        plqVar.k(string2);
        zfm zfmVar = new zfm();
        zfmVar.h(jSONObject4.getFloatValue("topMargin"));
        zfmVar.e(jSONObject4.getFloatValue("bottomMargin"));
        zfmVar.f(jSONObject4.getFloatValue("leftMargin"));
        zfmVar.g(jSONObject4.getFloatValue("rightMargin"));
        xhv xhvVar = xhv.INSTANCE;
        plqVar.p(zfmVar);
        if (booleanValue) {
            plqVar.s(Integer.valueOf(id));
        }
        b2.q(plqVar);
        c cVar = new c(str3);
        Uri.Builder buildUpon = Uri.parse(string).buildUpon();
        buildUpon.appendQueryParameter("popId", plqVar.f());
        handler.post(new b(plqVar, f, buildUpon, cVar, jSONObject2));
        return true;
    }
}
