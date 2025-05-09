package androidx.core.util;

import android.util.Range;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.rw3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\n¢\u0006\u0004\b\u0007\u0010\n\u001a>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\f¢\u0006\u0004\b\u000b\u0010\n\u001a/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "T", "that", "Landroid/util/Range;", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "plus", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;", "and", "Ltb/rw3;", "toClosedRange", "(Landroid/util/Range;)Ltb/rw3;", "toRange", "(Ltb/rw3;)Landroid/util/Range;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RangeKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Range) ipChange.ipc$dispatch("c1c78fb9", new Object[]{range, range2});
        }
        return range.intersect(range2);
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Range) ipChange.ipc$dispatch("4a88e434", new Object[]{range, t}) : range.extend((Range<T>) t);
    }

    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Range) ipChange.ipc$dispatch("a2369ed4", new Object[]{t, t2});
        }
        return new Range<>(t, t2);
    }

    public static final <T extends Comparable<? super T>> rw3<T> toClosedRange(final Range<T> range) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rw3) ipChange.ipc$dispatch("fc15c2c7", new Object[]{range});
        }
        return (rw3<T>) new rw3<T>() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("ac0ba18b", new Object[]{this, comparable})).booleanValue();
                }
                return rw3.a.a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // tb.rw3
            public Comparable getEndInclusive() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Comparable) ipChange2.ipc$dispatch("9a5cc3e9", new Object[]{this});
                }
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // tb.rw3
            public Comparable getStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Comparable) ipChange2.ipc$dispatch("55715ea4", new Object[]{this});
                }
                return range.getLower();
            }

            @Override // tb.rw3
            public boolean isEmpty() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
                }
                return rw3.a.b(this);
            }
        };
    }

    public static final <T extends Comparable<? super T>> Range<T> toRange(rw3<T> rw3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Range) ipChange.ipc$dispatch("69b1c1e3", new Object[]{rw3Var});
        }
        return new Range<>(rw3Var.getStart(), rw3Var.getEndInclusive());
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Range) ipChange.ipc$dispatch("fe640f96", new Object[]{range, range2}) : range.extend(range2);
    }
}
