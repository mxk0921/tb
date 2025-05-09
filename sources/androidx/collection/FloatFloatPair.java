package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import tb.en9;
import tb.f7l;
import tb.tiv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006 "}, d2 = {"Landroidx/collection/FloatFloatPair;", "", "first", "", c.LOCATION_SECOND, "constructor-impl", "(FF)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)F", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatFloatPair {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m0boximpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatFloatPair) ipChange.ipc$dispatch("2b506265", new Object[]{new Long(j)});
        }
        return new FloatFloatPair(j);
    }

    /* renamed from: component1-impl  reason: not valid java name */
    public static final float m1component1impl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97f96134", new Object[]{new Long(j)})).floatValue();
        }
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl  reason: not valid java name */
    public static final float m2component2impl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cde13f5", new Object[]{new Long(j)})).floatValue();
        }
        return Float.intBitsToFloat((int) (j & tiv.INT_MASK));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m4constructorimpl(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7c3fede", new Object[]{new Long(j)})).longValue() : j;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m6equalsimpl0(long j, long j2) {
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
    public static final float m7getFirstimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54085fda", new Object[]{new Long(j)})).floatValue();
        }
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d901aa", new Object[0]);
        }
    }

    /* renamed from: getSecond-impl  reason: not valid java name */
    public static final float m8getSecondimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86ab024a", new Object[]{new Long(j)})).floatValue();
        }
        return Float.intBitsToFloat((int) (j & tiv.INT_MASK));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m9hashCodeimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440ddbe", new Object[]{new Long(j)})).intValue();
        }
        return en9.a(j);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m10toStringimpl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df7ff544", new Object[]{new Long(j)});
        }
        return f7l.BRACKET_START_STR + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & tiv.INT_MASK)) + ')';
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return m5equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return m9hashCodeimpl(this.packedValue);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return m10toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m11unboximpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d22176", new Object[]{this})).longValue();
        }
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m3constructorimpl(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba748e", new Object[]{new Float(f), new Float(f2)})).longValue();
        }
        return m4constructorimpl((Float.floatToRawIntBits(f2) & tiv.INT_MASK) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m5equalsimpl(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d581c68f", new Object[]{new Long(j), obj})).booleanValue();
        }
        return (obj instanceof FloatFloatPair) && j == ((FloatFloatPair) obj).m11unboximpl();
    }
}
