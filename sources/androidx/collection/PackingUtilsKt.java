package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.tiv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0019\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0080\b¨\u0006\u0007"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PackingUtilsKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final long packFloats(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f09a2bcb", new Object[]{new Float(f), new Float(f2)})).longValue();
        }
        return (Float.floatToRawIntBits(f2) & tiv.INT_MASK) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long packInts(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea9a1d78", new Object[]{new Integer(i), new Integer(i2)})).longValue() : (i2 & tiv.INT_MASK) | (i << 32);
    }
}
