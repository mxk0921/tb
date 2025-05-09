package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class i68 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f21121a = new Object();

    static {
        t2o.a(912262876);
    }

    public abstract Stack a(Stack stack);

    public final Stack c(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("6da4d928", new Object[]{this, stack});
        }
        try {
            if (!f(stack)) {
                return stack;
            }
            return a(stack);
        } catch (Throwable unused) {
            return stack;
        }
    }

    public abstract boolean d(Stack stack);

    public abstract boolean f(Stack stack);

    public static boolean e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85b8f614", new Object[]{obj})).booleanValue();
        }
        if (obj == null || obj == f21121a) {
            return false;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String trim = ((String) obj).trim();
            if ("true".equalsIgnoreCase(trim)) {
                return true;
            }
            if ("false".equalsIgnoreCase(trim)) {
                return false;
            }
            try {
                return Integer.parseInt(trim) != 0;
            } catch (Exception unused) {
                return trim.length() > 0;
            }
        } else if (obj instanceof List) {
            return !((List) obj).isEmpty();
        } else {
            if (obj.getClass().isArray()) {
                try {
                    return Array.getLength(obj) > 0;
                } catch (Exception unused2) {
                    return false;
                }
            } else if (obj instanceof Map) {
                return !((Map) obj).isEmpty();
            } else {
                return true;
            }
        }
    }

    public boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcaeceaa", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null || obj == f21121a) {
            return true;
        }
        if (obj instanceof String) {
            String trim = ((String) obj).trim();
            if ("true".equalsIgnoreCase(trim)) {
                return false;
            }
            return "false".equalsIgnoreCase(trim) || trim.length() <= 0;
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() == 0;
        } else {
            if (obj instanceof Boolean) {
                return !((Boolean) obj).booleanValue();
            }
            if (obj instanceof List) {
                return ((List) obj).isEmpty();
            }
            if (obj.getClass().isArray()) {
                try {
                    return Array.getLength(obj) <= 0;
                } catch (Exception unused) {
                    return false;
                }
            } else if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            } else {
                return false;
            }
        }
    }
}
