package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20457a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    static {
        t2o.a(729808972);
    }

    public h7p(String str, int i, String str2, String str3, String str4, int i2, int i3) {
        this.f20457a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = i3;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13542dfd", new Object[]{this});
        }
        return this.f20457a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8384064", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2b9ccbd", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f20457a) || TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e)) {
            return false;
        }
        return true;
    }
}
