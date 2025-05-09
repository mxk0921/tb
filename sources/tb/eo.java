package tb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18707a;
        public final /* synthetic */ String b;
        public final /* synthetic */ x3e c;

        public a(Context context, String str, x3e x3eVar) {
            this.f18707a = context;
            this.b = str;
            this.c = x3eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Toast.makeText(this.f18707a, this.b, 0).show();
            } catch (Throwable th) {
                x3e x3eVar = this.c;
                if (x3eVar != null) {
                    x3eVar.a(th.getMessage());
                }
                ck.g().b("AURAToastUtils", LoginConstants.SHOW_TOAST, th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(x3e x3eVar) {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void showToast(Activity activity, String str);
    }

    static {
        t2o.a(81789265);
    }

    public static void a(JSONObject jSONObject, x3e<String> x3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f17a420", new Object[]{jSONObject, x3eVar});
            return;
        }
        hji a2 = hji.a();
        if (a2 != null) {
            a2.c(new g0u(jSONObject), new b(x3eVar));
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
        } else {
            c(context, str, null);
        }
    }

    public static void c(Context context, String str, x3e<String> x3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c26670", new Object[]{context, str, x3eVar});
        } else if (xk.a("enableMegaToast", true)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", (Object) str);
            a(jSONObject, null);
        } else {
            c cVar = (c) AliAdaptServiceManager.getInstance().findAliAdaptService(c.class);
            if (cVar == null) {
                dn.f(new a(context, str, x3eVar), 0L);
            } else if (context instanceof Activity) {
                cVar.showToast((Activity) context, str);
            } else {
                if (x3eVar != null) {
                    x3eVar.a("context is not activity");
                }
                ck.g().b("AURAToastUtils", LoginConstants.SHOW_TOAST, "context is not activity");
            }
        }
    }
}
