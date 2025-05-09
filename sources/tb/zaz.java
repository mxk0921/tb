package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final byte f32659a = d((byte) 0);
    public static final byte b = d((byte) 1);
    public static final byte c = d((byte) 2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737388);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final byte a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfa80079", new Object[]{this})).byteValue();
            }
            return zaz.a();
        }

        public final byte b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc7c5dd2", new Object[]{this})).byteValue();
            }
            return zaz.b();
        }

        public final byte c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e92057b4", new Object[]{this})).byteValue();
            }
            return zaz.c();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737387);
    }

    public static final /* synthetic */ byte a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9664df5a", new Object[0])).byteValue();
        }
        return c;
    }

    public static final /* synthetic */ byte b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa3d5e61", new Object[0])).byteValue();
        }
        return b;
    }

    public static final /* synthetic */ byte c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2aba8bf", new Object[0])).byteValue();
        }
        return f32659a;
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
