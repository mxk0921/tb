package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.base.service.pop.PopType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PopType f17050a;
    public final int b;
    public final Map<String, Object> c;
    public final boolean d;

    static {
        t2o.a(916455452);
    }

    public cgm(PopType popType, int i, Map<String, ? extends Object> map, boolean z) {
        ckf.g(popType, "type");
        ckf.g(map, u59.KEY_POPDATA);
        this.f17050a = popType;
        this.b = i;
        this.c = map;
        this.d = z;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77ebb0a1", new Object[]{this});
        }
        return this.c;
    }

    public final PopType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopType) ipChange.ipc$dispatch("f220852f", new Object[]{this});
        }
        return this.f17050a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof cgm) {
                cgm cgmVar = (cgm) obj;
                if (!ckf.b(this.f17050a, cgmVar.f17050a) || this.b != cgmVar.b || !ckf.b(this.c, cgmVar.c) || this.d != cgmVar.d) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        PopType popType = this.f17050a;
        if (popType != null) {
            i = popType.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i * 31) + this.b) * 31;
        Map<String, Object> map = this.c;
        if (map != null) {
            i2 = map.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        boolean z = this.d;
        if (!z) {
            i3 = z ? 1 : 0;
        }
        return i5 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PopMsg(type=" + this.f17050a + ", duration=" + this.b + ", popData=" + this.c + ", transferTouchEvent=" + this.d + f7l.BRACKET_END_STR;
    }

    public /* synthetic */ cgm(PopType popType, int i, Map map, boolean z, int i2, a07 a07Var) {
        this(popType, i, map, (i2 & 8) != 0 ? true : z);
    }
}
