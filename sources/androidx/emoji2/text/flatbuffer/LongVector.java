package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LongVector extends BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LongVector longVector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/LongVector");
    }

    public LongVector __assign(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongVector) ipChange.ipc$dispatch("aba96171", new Object[]{this, new Integer(i), byteBuffer});
        }
        __reset(i, 8, byteBuffer);
        return this;
    }

    public long get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15ba", new Object[]{this, new Integer(i)})).longValue();
        }
        return this.bb.getLong(__element(i));
    }
}
