package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;
import tb.can;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class l8z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737019);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final byte a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9afd2063", new Object[]{this, new Integer(i)})).byteValue();
            }
            return l8z.a((byte) i);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737018);
    }

    public static byte a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3e0ce", new Object[]{new Byte(b)})).byteValue();
        }
        return b;
    }

    public static final can.b b(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (can.b) ipChange.ipc$dispatch("e1151db", new Object[]{new Byte(b)});
        }
        if (c(b, a((byte) 0))) {
            return can.Companion.f();
        }
        if (c(b, a((byte) 1))) {
            return can.Companion.e();
        }
        if (c(b, a((byte) 2))) {
            return can.Companion.c();
        }
        return can.Companion.f();
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
