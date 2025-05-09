package tb;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.NetworkUtil;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ni7 implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24746a;
    public final int b;
    public final int c;

    static {
        t2o.a(1034944707);
        t2o.a(1034944593);
    }

    public ni7(Context context) {
        this.f24746a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.b = displayMetrics.widthPixels;
            this.c = displayMetrics.heightPixels;
        }
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        kgh.a("DeviceInfoTask", "params:" + map);
        HashMap hashMap = new HashMap();
        if (map != null) {
            String str2 = map.get("method_name");
            if ("get_model".equalsIgnoreCase(str2)) {
                str = c();
            } else if ("get_os_name".equalsIgnoreCase(str2)) {
                str = e();
            } else if ("get_os_version".equalsIgnoreCase(str2)) {
                str = f();
            } else if (ErrorCode.NORMAL_GET_APP_VERSION.equalsIgnoreCase(str2)) {
                str = b();
            } else if ("get_screen_width".equalsIgnoreCase(str2)) {
                str = h();
            } else if ("get_screen_height".equalsIgnoreCase(str2)) {
                str = g();
            } else if ("get_net_status".equalsIgnoreCase(str2)) {
                str = d();
            } else {
                str = "";
            }
            hashMap.put("info", str);
        }
        return hashMap;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return ewv.c(this.f24746a);
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a78b0366", new Object[]{this});
        }
        return Build.MODEL;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36f66f60", new Object[]{this});
        }
        return NetworkUtil.a(this.f24746a).value_name();
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59d4b694", new Object[]{this});
        }
        return "android";
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f114e1b", new Object[]{this});
        }
        return Build.VERSION.RELEASE;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2316a370", new Object[]{this});
        }
        return this.b + "";
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("443ea1f5", new Object[]{this});
        }
        return this.c + "";
    }
}
