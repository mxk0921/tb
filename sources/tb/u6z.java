package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class u6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737436);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e15cd61e", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i > u6z.b(14) || i < u6z.b(0)) {
                return false;
            }
            return true;
        }

        public a() {
        }
    }

    static {
        t2o.a(598737435);
    }

    public static final boolean a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6eb7eafb", new Object[]{new Integer(i), obj})).booleanValue();
        }
        if (c(i, b(8))) {
            return obj instanceof String;
        }
        if (c(i, b(4))) {
            return obj instanceof Integer;
        }
        if (c(i, b(5))) {
            return obj instanceof Long;
        }
        if (c(i, b(6))) {
            return obj instanceof Float;
        }
        if (c(i, b(7))) {
            return obj instanceof Double;
        }
        if (c(i, b(1))) {
            return obj instanceof Boolean;
        }
        if (c(i, b(2))) {
            return obj instanceof Byte;
        }
        if (c(i, b(3))) {
            return obj instanceof Short;
        }
        if (c(i, b(11))) {
            return obj instanceof xhv;
        }
        if (c(i, b(12))) {
            return true;
        }
        if (c(i, b(13))) {
            return obj instanceof Integer;
        }
        if (c(i, b(14))) {
            return obj instanceof Integer;
        }
        if (c(i, b(0))) {
            if (obj == null) {
                return true;
            }
            return false;
        } else if (c(i, b(9))) {
            return obj instanceof List;
        } else {
            if (c(i, b(10))) {
                return obj instanceof Map;
            }
            return false;
        }
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fb1c", new Object[]{new Integer(i)})).intValue();
        }
        return i;
    }

    public static final boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16ffe02d", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440d9fd", new Object[]{new Integer(i)})).intValue();
        }
        return i;
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7de1ee5", new Object[]{new Integer(i)});
        }
        return "FieldType(value=" + i + ')';
    }
}
