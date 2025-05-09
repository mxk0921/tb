package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatVector extends BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FloatVector floatVector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/FloatVector");
    }

    public FloatVector __assign(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatVector) ipChange.ipc$dispatch("6cbbd7c7", new Object[]{this, new Integer(i), byteBuffer});
        }
        __reset(i, 4, byteBuffer);
        return this;
    }

    public float get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15b6", new Object[]{this, new Integer(i)})).floatValue();
        }
        return this.bb.getFloat(__element(i));
    }
}
