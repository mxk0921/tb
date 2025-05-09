package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class etz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737106);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final byte a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bb93bec8", new Object[]{this, new Integer(i)})).byteValue();
            }
            return etz.a((byte) i);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737105);
    }

    public static byte a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3e0ce", new Object[]{new Byte(b)})).byteValue();
        }
        return b;
    }

    public static final Arrangement.l b(byte b, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Arrangement.l) ipChange.ipc$dispatch("3a74215a", new Object[]{new Byte(b), new Float(f)});
        }
        if (f == 0.0f) {
            if (c(b, a((byte) 0))) {
                return Arrangement.INSTANCE.e();
            }
            if (c(b, a((byte) 1))) {
                return Arrangement.INSTANCE.a();
            }
            if (c(b, a((byte) 2))) {
                return Arrangement.INSTANCE.b();
            }
            return Arrangement.INSTANCE.e();
        } else if (c(b, a((byte) 0))) {
            return Arrangement.INSTANCE.m(n5z.g(f), can.Companion.g());
        } else {
            if (c(b, a((byte) 1))) {
                return Arrangement.INSTANCE.m(n5z.g(f), can.Companion.a());
            }
            if (c(b, a((byte) 2))) {
                return Arrangement.INSTANCE.m(n5z.g(f), can.Companion.d());
            }
            return Arrangement.INSTANCE.m(n5z.g(f), can.Companion.g());
        }
    }

    public static final boolean c(byte b, byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16fc974d", new Object[]{new Byte(b), new Byte(b2)})).booleanValue();
        }
        if (b == b2) {
            return true;
        }
        return false;
    }
}
