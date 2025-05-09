package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LEVEL_HIGH = "h";
    public static final String LEVEL_LOW = "l";
    public static final String LEVEL_MED = "m";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f27419a;
    public static Application b;

    static {
        t2o.a(487587970);
        f27419a = true;
        try {
            IpChange ipChange = Globals.$ipChange;
        } catch (Throwable unused) {
            f27419a = false;
        }
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (!f27419a) {
            return b;
        }
        return Globals.getApplication();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (!f27419a) {
            return true;
        }
        return cw6.b();
    }

    public static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac3b6a", new Object[]{application});
        } else {
            b = application;
        }
    }
}
