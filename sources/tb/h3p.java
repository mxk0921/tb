package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class h3p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FONT_MAX_DP = 32;
    public static final h3p INSTANCE = new h3p();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final Integer[] f20397a = {13, 13, 13, 21, 21};
        public static final Integer[] b = {16, 16, 16, 22, 22};
        public static final Integer[] c = {14, 14, 14, 18, 18};
        public static final Integer[] d = {13, 13, 13, 18, 18};
        public static final Integer[] e = {16, 16, 16, 18, 18};
        public static final Integer[] f = {15, 15, 15, 18, 18};

        static {
            t2o.a(815792238);
        }

        public final Integer[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer[]) ipChange.ipc$dispatch("34881a11", new Object[]{this});
            }
            return f20397a;
        }

        public final Integer[] b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer[]) ipChange.ipc$dispatch("1ec04a6f", new Object[]{this});
            }
            return b;
        }

        public final Integer[] c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer[]) ipChange.ipc$dispatch("9c9c6bad", new Object[]{this});
            }
            return f;
        }

        public final Integer[] d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer[]) ipChange.ipc$dispatch("c4fbea5b", new Object[]{this});
            }
            return e;
        }

        public final Integer[] e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer[]) ipChange.ipc$dispatch("e496f00a", new Object[]{this});
            }
            return d;
        }

        public final Integer[] f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer[]) ipChange.ipc$dispatch("5583d6a", new Object[]{this});
            }
            return c;
        }
    }

    static {
        t2o.a(815792237);
    }

    @JvmStatic
    public static final int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbe4502", new Object[]{new Boolean(z)})).intValue();
        }
        if (z) {
            return 2;
        }
        return 0;
    }

    @JvmStatic
    public static final int b(Integer[] numArr, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("719c08a5", new Object[]{numArr, new Boolean(z)})).intValue();
        }
        if (numArr == null || numArr.length == 0) {
            return 0;
        }
        int a2 = a(z) + 1;
        if (a2 >= numArr.length) {
            i = ((Number) ic1.R(numArr)).intValue();
        } else {
            i = numArr[a2].intValue();
        }
        if (i > 32) {
            return 32;
        }
        return i;
    }

    @JvmStatic
    public static final int c(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ecc24c2", new Object[]{new Integer(i), new Boolean(z)})).intValue();
        }
        int d = iai.d(i * d(z));
        if (d > 32) {
            return 32;
        }
        return d;
    }

    @JvmStatic
    public static final float d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34b80f", new Object[]{new Boolean(z)})).floatValue();
        }
        int a2 = a(z);
        if (a2 == -1) {
            return 0.84f;
        }
        if (a2 == 1) {
            return 1.28f;
        }
        if (a2 == 2) {
            return 1.64f;
        }
        if (a2 != 3) {
            return 1.0f;
        }
        return 2.28f;
    }
}
