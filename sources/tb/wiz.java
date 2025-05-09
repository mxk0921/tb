package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wiz<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737409);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737408);
    }

    public static <T> int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fb1c", new Object[]{new Integer(i)})).intValue();
        }
        return i;
    }

    public static final boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16ffe02d", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == i2) {
            return true;
        }
        return false;
    }
}
