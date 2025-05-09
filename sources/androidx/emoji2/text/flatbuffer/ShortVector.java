package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ShortVector extends BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ShortVector shortVector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/ShortVector");
    }

    public ShortVector __assign(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShortVector) ipChange.ipc$dispatch("55b9d1a7", new Object[]{this, new Integer(i), byteBuffer});
        }
        __reset(i, 2, byteBuffer);
        return this;
    }

    public short get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15c3", new Object[]{this, new Integer(i)})).shortValue();
        }
        return this.bb.getShort(__element(i));
    }

    public int getAsUnsigned(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2380032", new Object[]{this, new Integer(i)})).intValue();
        }
        return get(i) & 65535;
    }
}
