package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class uk9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<vk9> f29433a;
    public final long b;
    public final String c;
    public final Integer d;
    public final String e;
    public final Integer f;

    static {
        t2o.a(815792370);
    }

    public uk9(List<vk9> list, long j, String str, Integer num, String str2, Integer num2) {
        ckf.g(list, "texList");
        this.f29433a = list;
        this.b = j;
        this.c = str;
        this.d = num;
        this.e = str2;
        this.f = num2;
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("db8239b1", new Object[]{this});
        }
        return this.f;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.e;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d758e1ba", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1755284d", new Object[]{this});
        }
        return this.c;
    }

    public final List<vk9> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed335551", new Object[]{this});
        }
        return this.f29433a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk9)) {
            return false;
        }
        uk9 uk9Var = (uk9) obj;
        if (ckf.b(this.f29433a, uk9Var.f29433a) && this.b == uk9Var.b && ckf.b(this.c, uk9Var.c) && ckf.b(this.d, uk9Var.d) && ckf.b(this.e, uk9Var.e) && ckf.b(this.f, uk9Var.f)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.d;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = ((this.f29433a.hashCode() * 31) + en9.a(this.b)) * 31;
        String str = this.c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (hashCode + i) * 31;
        Integer num = this.d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        String str2 = this.e;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        Integer num2 = this.f;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FlashSaleInfo(texList=" + this.f29433a + ", onlineEndTime=" + this.b + ", soldOutTxt=" + this.c + ", textColor=" + this.d + ", iconUrl=" + this.e + ", countDownBgColor=" + this.f + ')';
    }
}
