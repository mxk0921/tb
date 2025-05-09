package tb;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m1g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f23717a;
    public static SharedPreferences.Editor b;

    public static SharedPreferences.Editor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("4fdc14c7", new Object[0]);
        }
        c();
        return b;
    }

    public static SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("58ab18e", new Object[0]);
        }
        d();
        return f23717a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bd54a4", new Object[0]);
        } else if (b == null) {
            d();
            SharedPreferences sharedPreferences = f23717a;
            if (sharedPreferences != null) {
                b = sharedPreferences.edit();
            }
        }
    }

    public static void d() {
        Application b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d547174", new Object[0]);
        } else if (f23717a == null && (b2 = z9a.b()) != null) {
            f23717a = b2.getSharedPreferences("deviceevaluator", 0);
        }
    }
}
