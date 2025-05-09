package tb;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j4r extends m8<n9> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHECKLOCATIONSERVICE = "3520998369804419612";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432100);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(786432099);
    }

    public static /* synthetic */ Object ipc$super(j4r j4rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/locaition/TAKAbilityCheckLocationService");
    }

    public final JSONObject i(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("46d6e029", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            if (j((LocationManager) systemService)) {
                str = "true";
            } else {
                str = "false";
            }
            jSONObject.put((JSONObject) "isOpen", str);
            return jSONObject;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public final boolean j(LocationManager locationManager) {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT < 28) {
            return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
        }
        isLocationEnabled = locationManager.isLocationEnabled();
        return isLocationEnabled;
    }

    /* renamed from: k */
    public c8<?> f(n8 n8Var, n9 n9Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("21e3ce11", new Object[]{this, n8Var, n9Var, u8Var});
        }
        ckf.g(n9Var, "abilityRuntimeContext");
        ckf.g(u8Var, "callback");
        Context d = n9Var.d();
        ckf.f(d, "abilityRuntimeContext.context");
        f8 f8Var = new f8(i(d));
        u8Var.callback("success", f8Var);
        return f8Var;
    }
}
