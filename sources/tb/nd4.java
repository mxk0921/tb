package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class nd4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f24655a;
    public final String b;
    public final String c;

    static {
        t2o.a(815792341);
    }

    public nd4(Integer num, String str, String str2) {
        ckf.g(str2, "text");
        this.f24655a = num;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this});
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.c;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.f24655a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd4)) {
            return false;
        }
        nd4 nd4Var = (nd4) obj;
        if (ckf.b(this.f24655a, nd4Var.f24655a) && ckf.b(this.b, nd4Var.b) && ckf.b(this.c, nd4Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Integer num = this.f24655a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = i * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i3 + i2) * 31) + this.c.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CompositeItemInfo(textColor=" + this.f24655a + ", icon=" + this.b + ", text=" + this.c + ')';
    }
}
