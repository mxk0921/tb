package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BooleanVector extends BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(BooleanVector booleanVector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/BooleanVector");
    }

    public BooleanVector __assign(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BooleanVector) ipChange.ipc$dispatch("c2a741bb", new Object[]{this, new Integer(i), byteBuffer});
        }
        __reset(i, 1, byteBuffer);
        return this;
    }

    public boolean get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72fc15ca", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.bb.get(__element(i)) != 0) {
            return true;
        }
        return false;
    }
}
