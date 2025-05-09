package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tpf extends yrf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kArrayBuffer = 0;
    public static final int kBigInt64Array = 12;
    public static final int kBigUint64Array = 11;
    public static final int kFloat32Array = 9;
    public static final int kFloat64Array = 10;
    public static final int kInt16Array = 6;
    public static final int kInt32Array = 8;
    public static final int kInt8Array = 4;
    public static final int kSharedArrayBuffer = 1;
    public static final int kUint16Array = 5;
    public static final int kUint32Array = 7;
    public static final int kUint8Array = 2;
    public static final int kUint8ClampedArray = 3;
    public ByteBuffer d;

    static {
        t2o.a(921698335);
    }

    public tpf(dqf dqfVar, int i, int i2) {
        super(dqfVar, Bridge.createNative(dqfVar, 11, i, i2));
        this.d = null;
    }

    public static /* synthetic */ Object ipc$super(tpf tpfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSArrayBuffer");
    }

    public ByteBuffer M(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("da7bebd", new Object[]{this, dqfVar});
        }
        b();
        if (this.d == null) {
            Object cmd = Bridge.cmd(dqfVar, 505, this.b);
            if (cmd instanceof ByteBuffer) {
                this.d = (ByteBuffer) cmd;
            }
        }
        return this.d;
    }

    @Override // tb.ksf
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38cc5d7a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public tpf(dqf dqfVar, int i, ByteBuffer byteBuffer) {
        super(dqfVar, 0L);
        this.d = null;
        if (byteBuffer == null) {
            throw new NullPointerException("buffer can not be null!");
        } else if (byteBuffer.isDirect()) {
            this.d = byteBuffer;
            this.b = Bridge.createNative(dqfVar, 11, i, byteBuffer.limit(), new Object[]{byteBuffer});
            lwx.d(dqfVar, this);
        } else {
            throw new IllegalArgumentException("buffer must be a direct ByteBuffer!");
        }
    }

    public tpf(dqf dqfVar, long j) {
        super(dqfVar, j);
        this.d = null;
    }
}
