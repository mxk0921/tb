package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class f7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final long f19093a = g7z.a(0.0f, 0.0f);
    public static final long b = g7z.a(Float.NaN, Float.NaN);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737514);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6f971f7f", new Object[]{this})).longValue();
            }
            return f7z.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737513);
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42629ee", new Object[0])).longValue();
        }
        return f19093a;
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fede", new Object[]{new Long(j)})).longValue();
        }
        return j;
    }

    public static final float c(long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cca24b3d", new Object[]{new Long(j)})).floatValue();
        }
        if (j != b) {
            z = true;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j & tiv.INT_MASK));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6b408a", new Object[]{new Long(j)})).floatValue();
        }
        return Math.min(Math.abs(e(j)), Math.abs(c(j)));
    }

    public static final float e(long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d695770", new Object[]{new Long(j)})).floatValue();
        }
        if (j != b) {
            z = true;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }
}
