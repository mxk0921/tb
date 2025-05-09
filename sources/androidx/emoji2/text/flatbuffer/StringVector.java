package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class StringVector extends BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Utf8 utf8 = Utf8.getDefault();

    public static /* synthetic */ Object ipc$super(StringVector stringVector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/StringVector");
    }

    public StringVector __assign(int i, int i2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringVector) ipChange.ipc$dispatch("7ffc9f85", new Object[]{this, new Integer(i), new Integer(i2), byteBuffer});
        }
        __reset(i, i2, byteBuffer);
        return this;
    }

    public String get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae1f639a", new Object[]{this, new Integer(i)});
        }
        return Table.__string(__element(i), this.bb, this.utf8);
    }
}
