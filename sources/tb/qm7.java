package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String currentVersion = "2.0";

    static {
        t2o.a(444596282);
    }

    public static Object a(String str, String str2, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6a657a09", new Object[]{str, str2, bn7Var});
        }
        Object obj = null;
        if (!(bn7Var == null || bn7Var.d() == null || str == null)) {
            if (str.startsWith("@")) {
                return g.g(str, str2, bn7Var);
            }
            char[] charArray = str.toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            boolean z = false;
            boolean z2 = false;
            StringBuffer stringBuffer3 = stringBuffer;
            String str3 = null;
            for (char c : charArray) {
                if ('$' == c) {
                    stringBuffer3 = new StringBuffer();
                    stringBuffer2 = new StringBuffer();
                    z = true;
                } else {
                    if ('{' == c && z) {
                        str3 = stringBuffer3.toString();
                        if (km7.a(str3)) {
                            z = false;
                            z2 = true;
                        } else {
                            z = false;
                        }
                    } else if ('}' == c && z2) {
                        String stringBuffer4 = stringBuffer2.toString();
                        if (TextUtils.isEmpty(stringBuffer4)) {
                            obj = bn7Var.d();
                        } else {
                            im7 b = km7.b(str3);
                            if (b != null) {
                                try {
                                    obj = b.b(stringBuffer4, bn7Var);
                                } catch (Throwable th) {
                                    if (tl7.f()) {
                                        ym7.l("DinamicExpresstion", th, "parse express failed, parser=", b.getClass().getName());
                                    }
                                    bn7Var.e().b().a(mm7.ERROR_CODE_TEMPLATE_PARSER_EXCEPTION, str2);
                                }
                            } else {
                                bn7Var.e().b().a(mm7.ERROR_CODE_TEMPLATE_PARSER_NOT_FOUND, str2);
                            }
                        }
                        if (!(obj == null || ((obj instanceof String) && TextUtils.isEmpty(obj.toString())))) {
                            return obj;
                        }
                        z = false;
                    } else if (z) {
                        stringBuffer3.append(c);
                    } else if (z2) {
                        stringBuffer2.append(c);
                    }
                }
                z2 = false;
            }
        }
        return obj;
    }
}
