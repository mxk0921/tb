package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b \u0010\r¨\u0006\""}, d2 = {"Ltb/z2w;", "", "", "major", "minor", "patch", CartRecommendRefreshScene.build, "<init>", "(IIII)V", "other", "a", "(Ltb/z2w;)I", TplMsg.VALUE_T_NATIVE_RETURN, "()I", "d", "e", "f", at.f, "(IIII)Ltb/z2w;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", TLogTracker.LEVEL_INFO, at.j, at.k, "c", "l", bmv.MSGTYPE_INTERVAL, "Companion", "themis_utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class z2w implements Comparable<z2w> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f32505a;
    private final int b;
    private final int c;
    private final int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(849346606);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final z2w a(String str) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z2w) ipChange.ipc$dispatch("8f98b0", new Object[]{this, str});
            }
            ckf.g(str, "versionString");
            List<String> z0 = wsq.z0(str, new String[]{"."}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(zz3.q(z0, 10));
            for (String str2 : z0) {
                Integer m = ssq.m(str2);
                arrayList.add(Integer.valueOf(m == null ? 0 : m.intValue()));
            }
            Integer num = (Integer) i04.d0(arrayList, 0);
            int intValue = num == null ? 0 : num.intValue();
            Integer num2 = (Integer) i04.d0(arrayList, 1);
            int intValue2 = num2 == null ? 0 : num2.intValue();
            Integer num3 = (Integer) i04.d0(arrayList, 2);
            int intValue3 = num3 == null ? 0 : num3.intValue();
            Integer num4 = (Integer) i04.d0(arrayList, 3);
            if (num4 != null) {
                i = num4.intValue();
            }
            return new z2w(intValue, intValue2, intValue3, i);
        }
    }

    static {
        t2o.a(849346605);
    }

    public z2w(int i, int i2, int i3, int i4) {
        this.f32505a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static /* synthetic */ z2w h(z2w z2wVar, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z2w) ipChange.ipc$dispatch("658124a8", new Object[]{z2wVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
        }
        if ((i5 & 1) != 0) {
            i = z2wVar.f32505a;
        }
        if ((i5 & 2) != 0) {
            i2 = z2wVar.b;
        }
        if ((i5 & 4) != 0) {
            i3 = z2wVar.c;
        }
        if ((i5 & 8) != 0) {
            i4 = z2wVar.d;
        }
        return z2wVar.g(i, i2, i3, i4);
    }

    /* renamed from: a */
    public int compareTo(z2w z2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("405f3ce0", new Object[]{this, z2wVar})).intValue();
        }
        ckf.g(z2wVar, "other");
        int i = this.f32505a;
        int i2 = z2wVar.f32505a;
        return (i == i2 && (i = this.b) == (i2 = z2wVar.b) && (i = this.c) == (i2 = z2wVar.c)) ? this.d - z2wVar.d : i - i2;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f047d4e", new Object[]{this})).intValue();
        }
        return this.f32505a;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f1294cf", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f20ac50", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2w)) {
            return false;
        }
        z2w z2wVar = (z2w) obj;
        if (this.f32505a == z2wVar.f32505a && this.b == z2wVar.b && this.c == z2wVar.c && this.d == z2wVar.d) {
            return true;
        }
        return false;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2ec3d1", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final z2w g(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z2w) ipChange.ipc$dispatch("d0671440", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        return new z2w(i, i2, i3, i4);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((this.f32505a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abd9d532", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27fd26fd", new Object[]{this})).intValue();
        }
        return this.f32505a;
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a9f7af9", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0c1b20c", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Version(major=" + this.f32505a + ", minor=" + this.b + ", patch=" + this.c + ", build=" + this.d + ')';
    }
}
