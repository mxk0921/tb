package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class q3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26476a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    static {
        t2o.a(815793040);
    }

    public q3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str) {
        ckf.g(str, Constants.Name.PLACE_HOLDER);
        this.f26476a = z;
        this.b = z2;
        this.c = z3;
        this.f = z4;
        this.d = z5;
        this.e = z6;
        this.g = z7;
        this.h = str;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8578e7b", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be377995", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7663cb", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d209a5", new Object[]{this})).booleanValue();
        }
        return this.f26476a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6945e5", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        if (this.f26476a == q3Var.f26476a && this.b == q3Var.b && this.c == q3Var.c && this.f == q3Var.f && this.d == q3Var.d && this.e == q3Var.e && this.g == q3Var.g && ckf.b(this.h, q3Var.h)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e829f2", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60fbfcfc", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28ff42bc", new Object[]{this});
        }
        return this.h;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((((((((bbz.a(this.f26476a) * 31) + bbz.a(this.b)) * 31) + bbz.a(this.c)) * 31) + bbz.a(this.f)) * 31) + bbz.a(this.d)) * 31) + bbz.a(this.e)) * 31) + bbz.a(this.g)) * 31) + this.h.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AIInputConfig(hideThink=" + this.f26476a + ", hideVoice=" + this.b + ", hideRag=" + this.c + ", hideUserInfo=" + this.f + ", defaultRagEnable=" + this.d + ", defaultThinkEnable=" + this.e + ", defaultUserInfoEnable=" + this.g + ", placeHolder=" + this.h + ')';
    }
}
