package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516254);
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b61c36cd", new Object[]{new Float(f)})).floatValue();
        }
        return (f * nxh.e(f5x.a())) / 750.0f;
    }

    public static float b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("145c445d", new Object[]{new Integer(i)})).floatValue();
        }
        return (i * nxh.e(f5x.a())) / 750.0f;
    }

    public static float c(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58e293f8", new Object[]{mUSValue})).floatValue();
        }
        return d(mUSValue, 1.0f);
    }

    public static float e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c607eca", new Object[]{str})).floatValue();
        }
        return f(str, 1.0f);
    }

    public static float g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81684bfe", new Object[]{str})).floatValue();
        }
        return h(str, 1.0f);
    }

    public static float i(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef142de", new Object[]{context, new Float(f)})).floatValue();
        }
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static float j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fca6924", new Object[]{str})).floatValue();
        }
        return Float.parseFloat(str.substring(0, str.length() - 3));
    }

    public static float k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e10ee58", new Object[]{str})).floatValue();
        }
        return a(Float.parseFloat(str));
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static float m(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce809697", new Object[]{context, new Integer(i)})).floatValue();
        }
        return i / context.getResources().getDisplayMetrics().density;
    }

    public static float n(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d371b63e", new Object[]{context, new Float(f)})).floatValue();
        }
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static float d(MUSValue mUSValue, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c37054a8", new Object[]{mUSValue, new Float(f)})).floatValue();
        }
        if (mUSValue != null) {
            int type = mUSValue.getType();
            if (type == 2 || type == 3) {
                return a(mUSValue.convertToFloat());
            }
            if (type == 4) {
                return f(mUSValue.getStringValue(), f);
            }
            throw new IllegalArgumentException("Float can't parse from attr value type: " + mUSValue.toString());
        }
        throw new IllegalArgumentException("value is null");
    }

    public static float f(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fafc416", new Object[]{str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("value is empty or null");
        } else if (str.length() <= 2) {
            return k(str);
        } else {
            char charAt = str.charAt(str.length() - 1);
            char charAt2 = str.charAt(str.length() - 2);
            if (charAt == 'x' && charAt2 == 'p') {
                if (str.length() <= 3 || str.charAt(str.length() - 3) != 'r') {
                    return Float.parseFloat(str.substring(0, str.length() - 2)) * nxh.b(f5x.a());
                }
                return k(str.substring(0, str.length() - 3));
            } else if (charAt == 'm' && charAt2 == 'e' && str.length() > 3) {
                return a(j(str) * f);
            } else {
                return k(str);
            }
        }
    }

    public static float h(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aba19d62", new Object[]{str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("value is empty or null");
        } else if (str.length() <= 2) {
            return Float.parseFloat(str);
        } else {
            char charAt = str.charAt(str.length() - 1);
            char charAt2 = str.charAt(str.length() - 2);
            if (charAt == 'x' && charAt2 == 'p') {
                if (str.length() > 3 && str.charAt(str.length() - 3) == 'r') {
                    return Float.parseFloat(str.substring(0, str.length() - 3));
                }
                float parseFloat = Float.parseFloat(str.substring(0, str.length() - 2));
                Application a2 = f5x.a();
                return ((parseFloat * 750.0f) * nxh.b(a2)) / nxh.e(a2);
            } else if (charAt == 'm' && charAt2 == 'e' && str.length() > 3) {
                return j(str) * f;
            } else {
                return Float.parseFloat(str);
            }
        }
    }
}
