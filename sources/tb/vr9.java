package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class vr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f30199a;
    public static Boolean b;

    static {
        t2o.a(469762074);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        return (String) hhg.a("appVersion", "");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cad2687", new Object[0])).booleanValue();
        }
        return ((Boolean) hhg.a("isDebuggable", Boolean.FALSE)).booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a7b5ca", new Object[0])).booleanValue();
        }
        Boolean bool = f30199a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            f30199a = Boolean.FALSE;
        } else if (a2.split("\\.").length == 4) {
            f30199a = Boolean.TRUE;
        } else {
            f30199a = Boolean.FALSE;
        }
        ir9.b("FluidSDKSwitch", "FluidSDK 新架构应用版本号：" + a2 + "，是否为灰度包：" + f30199a);
        return f30199a.booleanValue();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f85d042f", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (or9.j(or9.DEV_TOOLS_CLASS_NAME, false) != null) {
            z = true;
        }
        b = Boolean.valueOf(z);
        ir9.b("FluidSDKSwitch", "FluidSDK 新架构是否集成 fluid-devtools: " + b);
        return b.booleanValue();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c0237d5", new Object[0])).booleanValue();
        }
        return true;
    }
}
