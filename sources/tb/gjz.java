package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final byte f20051a = d((byte) 0);
    public static final byte b = d((byte) 1);
    public static final byte c = d((byte) 2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737423);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final byte a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("60fdb7bc", new Object[]{this})).byteValue();
            }
            return gjz.a();
        }

        public final byte b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e053611e", new Object[]{this})).byteValue();
            }
            return gjz.b();
        }

        public final byte c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cde08619", new Object[]{this})).byteValue();
            }
            return gjz.c();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737422);
    }

    public static final /* synthetic */ byte a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1e22709", new Object[0])).byteValue();
        }
        return b;
    }

    public static final /* synthetic */ byte b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce18b867", new Object[0])).byteValue();
        }
        return f20051a;
    }

    public static final /* synthetic */ byte c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2495f28c", new Object[0])).byteValue();
        }
        return c;
    }

    public static byte d(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3e0ce", new Object[]{new Byte(b2)})).byteValue();
        }
        return b2;
    }

    public static final boolean e(byte b2, byte b3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16fc974d", new Object[]{new Byte(b2), new Byte(b3)})).booleanValue();
        }
        if (b2 == b3) {
            return true;
        }
        return false;
    }
}
