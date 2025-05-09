package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a1n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROP_REGEX = "\\{\\{\\+?store.*?\\}\\}";

    static {
        t2o.a(790626426);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a11e7b37", new Object[]{str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Pattern.compile(PROP_REGEX).matcher(str).find();
            }
        } catch (Throwable th) {
            wdm.h("PropAnalise.containsProp.error.", th);
        }
        return false;
    }

    public static boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e244b33f", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        return false;
    }

    public static Object c(oe8 oe8Var, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c8679da", new Object[]{oe8Var, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Matcher matcher = Pattern.compile(PROP_REGEX).matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String replaceAll = matcher.group().replaceAll("[$]", "");
                wdm.d("PropAnalise.parsePropResult.prop=%s.group=%s", str, replaceAll);
                Object i = i(oe8Var, replaceAll);
                if (i == null) {
                    if (z) {
                        oe8Var.s("PropValueProcessInvalid.group=" + replaceAll, "");
                        return null;
                    }
                    wdm.d("PropAnalise.parsePropResult.resultIsNull.prop=%s.group=%s", str, replaceAll);
                    return null;
                } else if (str.equals(replaceAll)) {
                    return i;
                } else {
                    matcher.appendReplacement(stringBuffer, String.valueOf(i).replaceAll("\\\\", "\\\\\\\\"));
                }
            }
            matcher.appendTail(stringBuffer);
            String stringBuffer2 = stringBuffer.toString();
            wdm.d("PropAnalise.parsePropResult.prop=%s.result=%s", str, stringBuffer2);
            return stringBuffer2;
        } catch (Throwable th) {
            wdm.h("PropAnalise.parsePropResult.eval.", th);
            oe8Var.s("ParsePropResultFailed", "");
            return str;
        }
    }

    public static Float d(oe8 oe8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("eb5f60ea", new Object[]{oe8Var, str});
        }
        Number f = f(oe8Var, str, true);
        if (f != null) {
            return (Float) f;
        }
        return null;
    }

    public static Long e(oe8 oe8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("46002b90", new Object[]{oe8Var, str});
        }
        Number f = f(oe8Var, str, false);
        if (f != null) {
            return (Long) f;
        }
        return null;
    }

    public static String g(oe8 oe8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab16d4b0", new Object[]{oe8Var, str});
        }
        return h(oe8Var, str, true);
    }

    public static String h(oe8 oe8Var, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b01e63c", new Object[]{oe8Var, str, new Boolean(z)});
        }
        try {
            Object c = c(oe8Var, str, z);
            if (c == null) {
                return null;
            }
            return String.valueOf(c);
        } catch (Throwable th) {
            wdm.h("PropAnalise.parsePropResultToString.error.", th);
            oe8Var.s("parsePropResultToStringError.prop=" + str, "");
            return null;
        }
    }

    public static Number f(oe8 oe8Var, String str, boolean z) {
        long j;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("78f4f7cc", new Object[]{oe8Var, str, new Boolean(z)});
        }
        try {
            Object c = c(oe8Var, str, true);
            if (c == null) {
                return null;
            }
            if (z) {
                if (c instanceof String) {
                    f = Float.parseFloat((String) c);
                } else {
                    f = ((Float) c).floatValue();
                }
                return Float.valueOf(f);
            }
            if (c instanceof String) {
                j = Long.parseLong((String) c);
            } else {
                j = ((Long) c).longValue();
            }
            return Long.valueOf(j);
        } catch (Throwable unused) {
            oe8Var.s("parsePropResultToNumberError.prop=" + str, "");
            return null;
        }
    }

    public static Object i(oe8 oe8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e03d057a", new Object[]{oe8Var, str});
        }
        if (TextUtils.isEmpty(str) || str.length() <= 4 || !str.startsWith("{{") || !str.endsWith("}}")) {
            return str;
        }
        String substring = str.substring(2, str.length() - 2);
        boolean startsWith = substring.startsWith(f7l.PLUS);
        if (startsWith) {
            substring = substring.substring(1);
        }
        if (!substring.startsWith("store.")) {
            return str;
        }
        String substring2 = substring.substring(6);
        Object b = jwf.b(oe8Var.j().x(), substring2);
        if (b == null) {
            return null;
        }
        if (startsWith) {
            try {
                Float valueOf = Float.valueOf(Float.parseFloat(String.valueOf(b)));
                wdm.d("PropAnalise.replaceProp.realPath=%s.result=%s.Number.", substring2, valueOf);
                if (!b(valueOf)) {
                    return null;
                }
                return valueOf;
            } catch (Throwable th) {
                wdm.h("PropAnalise.replaceProp.evalError.Long.realPath=" + substring2, th);
            }
        } else {
            try {
                String valueOf2 = String.valueOf(b);
                wdm.d("PropAnalise.replaceProp.realPath=%s.result=%s.String.", substring2, valueOf2);
                if (!b(valueOf2)) {
                    return null;
                }
                return valueOf2;
            } catch (Throwable th2) {
                wdm.h("PropAnalise.replaceProp.evalError.String.realPath=" + substring2, th2);
            }
        }
        return null;
    }
}
