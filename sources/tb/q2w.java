package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q2w implements p2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26474a;
    public final String b;
    public final String c;

    public q2w(String str, String str2, String str3) {
        this.f26474a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // tb.p2w
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20383e7f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (Boolean.parseBoolean(this.b) || "1".equals(this.b)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || q2w.class != obj.getClass()) {
            return false;
        }
        return this.f26474a.equals(((q2w) obj).f26474a);
    }

    @Override // tb.p2w
    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.p2w
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f26474a;
    }

    @Override // tb.p2w
    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.b;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Arrays.hashCode(new String[]{this.f26474a});
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VariationImpl{name='" + this.f26474a + "', value='" + this.b + "', desc='" + this.c + "'}";
    }

    public q2w(String str, String str2) {
        this(str, str2, null);
    }
}
