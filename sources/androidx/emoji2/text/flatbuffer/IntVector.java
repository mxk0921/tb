package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntVector extends BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(IntVector intVector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/IntVector");
    }

    public IntVector __assign(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntVector) ipChange.ipc$dispatch("1e0b2594", new Object[]{this, new Integer(i), byteBuffer});
        }
        __reset(i, 4, byteBuffer);
        return this;
    }

    public int get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15b9", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.bb.getInt(__element(i));
    }

    public long getAsUnsigned(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2380033", new Object[]{this, new Integer(i)})).longValue();
        }
        return get(i) & tiv.INT_MASK;
    }
}
