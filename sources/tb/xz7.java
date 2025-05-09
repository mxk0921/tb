package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xz7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xz7 INSTANCE = new xz7();

    static {
        t2o.a(918552779);
    }

    public final Integer b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3e5b837f", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if ((obj instanceof String) && ((String) obj).length() != 0 && !ckf.b("null", obj)) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
            return null;
        } catch (Exception e) {
            tpu.Companion.a("DressUpTypeUtils", "Int数据类型转换失败。", e);
            if (kz7.a()) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38672d32", new Object[]{this, obj});
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final Boolean a(Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ead62a0e", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        try {
        } catch (Exception e) {
            tpu.Companion.a("DressUpTypeUtils", "Boolean数据类型转换失败。", e);
            if (kz7.a()) {
                throw new RuntimeException(e);
            }
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if ((obj instanceof String) && ((String) obj).length() != 0 && !ckf.b("null", obj)) {
            if (!tsq.x("true", (String) obj, true) && !ckf.b("1", obj)) {
                if (tsq.x("false", (String) obj, true) || ckf.b("0", obj)) {
                    return Boolean.FALSE;
                }
                return null;
            }
            return Boolean.TRUE;
        }
        return null;
    }
}
