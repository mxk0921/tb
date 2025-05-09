package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j56 extends an6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_INDICATOR_COLOR = -35072;
    public static final double DEFAULT_INDICATOR_RATIO = 0.5d;
    public static final long DX_SCROLLER_INDICATOR_COLOR = -5151416374116397110L;
    public static final long DX_SCROLLER_INDICATOR_INDICATOR_RATIO = -5150348073123091510L;

    /* renamed from: a  reason: collision with root package name */
    public int f21764a = -35072;
    public double b = 0.5d;

    static {
        t2o.a(444596456);
    }

    public static /* synthetic */ Object ipc$super(j56 j56Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1764761226) {
            super.b((fae) objArr[0]);
            return null;
        } else if (hashCode == 111792625) {
            super.d(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1762007832) {
            super.h(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic_v35/widget/DXNanoScrollerIndicatorProps");
        }
    }

    @Override // tb.an6, tb.fae
    public void b(fae faeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cfe176", new Object[]{this, faeVar});
            return;
        }
        super.b(faeVar);
        if (faeVar instanceof j56) {
            j56 j56Var = (j56) faeVar;
            this.f21764a = j56Var.f21764a;
            this.b = j56Var.b;
        }
    }

    @Override // tb.an6, tb.fae
    public void d(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9d1f1", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -5151416374116397110L) {
            this.f21764a = i;
        } else {
            super.d(j, i);
        }
    }

    @Override // tb.an6, tb.fae
    public void h(long j, double d) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69061b18", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == -5150348073123091510L) {
            if (d > vu3.b.GEO_NOT_SUPPORT) {
                d2 = Math.min(1.0d, d);
            } else {
                d2 = 0.5d;
            }
            this.b = d2;
        } else {
            super.h(j, d);
        }
    }
}
