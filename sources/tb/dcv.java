package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17732a;
    public final String b;
    public final List<unm> c;
    public final boolean d;

    static {
        t2o.a(157286873);
    }

    public dcv(String str, String str2, List<unm> list, boolean z) {
        ckf.g(str, "bizName");
        ckf.g(str2, "requestStage");
        this.f17732a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.f17732a;
    }

    public final List<unm> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e03688aa", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b23ff3f4", new Object[]{this});
        }
        return this.b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14b51917", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof dcv) {
                dcv dcvVar = (dcv) obj;
                if (!ckf.b(this.f17732a, dcvVar.f17732a) || !ckf.b(this.b, dcvVar.b) || !ckf.b(this.c, dcvVar.c) || this.d != dcvVar.d) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f17732a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        List<unm> list = this.c;
        if (list != null) {
            i3 = list.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        boolean z = this.d;
        if (!z) {
            i4 = z ? 1 : 0;
        }
        return i7 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UltronTradeHybridPreRequestImageModel(bizName=" + this.f17732a + ", requestStage=" + this.b + ", defaultImgList=" + this.c + ", saveToDrawable=" + this.d + f7l.BRACKET_END_STR;
    }
}
