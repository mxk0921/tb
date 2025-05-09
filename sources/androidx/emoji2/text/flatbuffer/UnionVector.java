package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class UnionVector extends BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UnionVector unionVector, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/flatbuffer/UnionVector");
    }

    public UnionVector __assign(int i, int i2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UnionVector) ipChange.ipc$dispatch("40f4444b", new Object[]{this, new Integer(i), new Integer(i2), byteBuffer});
        }
        __reset(i, i2, byteBuffer);
        return this;
    }

    public Table get(Table table, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Table) ipChange.ipc$dispatch("b64e05d0", new Object[]{this, table, new Integer(i)});
        }
        return Table.__union(table, __element(i), this.bb);
    }
}
