package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import tb.en9;
import tb.f7l;
import tb.tiv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006\u001e"}, d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", c.LOCATION_SECOND, "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntIntPair {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntIntPair m12boximpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntIntPair) ipChange.ipc$dispatch("8f1f9445", new Object[]{new Long(j)});
        }
        return new IntIntPair(j);
    }

    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m13component1impl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97f96137", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j >> 32);
    }

    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m14component2impl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cde13f8", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j & tiv.INT_MASK);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m16constructorimpl(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7c3fede", new Object[]{new Long(j)})).longValue() : j;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m18equalsimpl0(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1700584d", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-impl  reason: not valid java name */
    public static final int m19getFirstimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54085fdd", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d901aa", new Object[0]);
        }
    }

    /* renamed from: getSecond-impl  reason: not valid java name */
    public static final int m20getSecondimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86ab024d", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j & tiv.INT_MASK);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m21hashCodeimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440ddbe", new Object[]{new Long(j)})).intValue();
        }
        return en9.a(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m22toStringimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df7ff544", new Object[]{new Long(j)});
        }
        return f7l.BRACKET_START_STR + m19getFirstimpl(j) + ", " + m20getSecondimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return m17equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return m21hashCodeimpl(this.packedValue);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return m22toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m23unboximpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d22176", new Object[]{this})).longValue();
        }
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m15constructorimpl(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bbdcee", new Object[]{new Integer(i), new Integer(i2)})).longValue() : m16constructorimpl((i2 & tiv.INT_MASK) | (i << 32));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m17equalsimpl(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d581c68f", new Object[]{new Long(j), obj})).booleanValue();
        }
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).m23unboximpl();
    }
}
