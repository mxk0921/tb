package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dn1 b = new dn1();

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f17957a;

    static {
        t2o.a(404750653);
    }

    public static dn1 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dn1) ipChange.ipc$dispatch("8c4f79f7", new Object[0]);
        }
        return b;
    }

    public final SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{this, context});
        }
        if (this.f17957a == null) {
            this.f17957a = context.getSharedPreferences(b(), 0);
        }
        return this.f17957a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "behavix_local";
    }

    public long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        return a(f82.d()).getLong(str, j);
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        return f(str, "");
    }

    public String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        return a(f82.d()).getString(str, str2);
    }

    public void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ffffc8", new Object[]{this, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = a(f82.d()).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences.Editor edit = a(f82.d()).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
