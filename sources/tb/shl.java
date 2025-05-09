package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class shl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile shl f;

    /* renamed from: a  reason: collision with root package name */
    public String f28055a;
    public String b;
    public String c;
    public Application d;
    public boolean e;

    static {
        t2o.a(757071875);
    }

    public static shl b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shl) ipChange.ipc$dispatch("8b33e17a", new Object[0]);
        }
        if (f == null) {
            synchronized (shl.class) {
                try {
                    if (f == null) {
                        f = new shl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.d;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        return this.c;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0817d", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.b.split("@")[0], "212200");
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86f268e4", new Object[]{this})).booleanValue();
        }
        if (f()) {
            return false;
        }
        String[] split = this.f28055a.split("\\.");
        if (split.length != 4 || Integer.parseInt(split[3]) >= 700) {
            return false;
        }
        new StringBuilder("isGrayPackage: gray scale version ").append(this.f28055a);
        return true;
    }

    public void d(Application application, Map<String, Object> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47f095d", new Object[]{this, application, map});
            return;
        }
        this.d = application;
        this.b = map.get("ttid") + "";
        this.f28055a = map.get("appVersion") + "";
        Objects.toString(map.get("dailyAppKey"));
        this.c = map.get("packageName") + "";
        if ((this.d.getApplicationInfo().flags & 2) == 0) {
            z = false;
        }
        this.e = z;
    }
}
