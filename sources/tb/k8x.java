package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001924);
    }

    public static float f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("798ff4d9", new Object[]{new Float(f)})).floatValue();
        }
        return (f * 750.0f) / ej4.f18611a;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66d5b20c", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            c4p.n("WeexSizeUtil", "remSize字符串为空");
            return 0;
        }
        try {
            return (Integer.parseInt(str) * ej4.f18611a) / 750;
        } catch (Exception unused) {
            c4p.n("WeexSizeUtil", "解析rem数字异常");
            return 0;
        }
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e2aa0d8", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (str.endsWith("wx")) {
                return e(str);
            }
            return a(str);
        } catch (Throwable unused) {
            c4p.n("WeexSizeUtil", "解析尺寸异常");
            return 0;
        }
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4de38bd9", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            c4p.n("WeexSizeUtil", "wxSize字符串为空");
            return 0;
        }
        int lastIndexOf = str.lastIndexOf("wx");
        if (lastIndexOf < 0 || lastIndexOf >= str.length()) {
            c4p.n("WeexSizeUtil", "解析wx后缀异常");
            return 0;
        }
        try {
            return p1p.a(Float.parseFloat(str.substring(0, lastIndexOf)));
        } catch (Exception unused) {
            c4p.n("WeexSizeUtil", "解析wx数字异常");
            return 0;
        }
    }

    public static float g(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5629fc", new Object[]{str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        if (str.endsWith("wx") || str.endsWith("dp")) {
            return p1p.a(qrl.d(str.substring(0, str.length() - 2), f));
        }
        if (str.endsWith("px")) {
            return qrl.d(str.substring(0, str.length() - 2), f);
        }
        return qrl.d(str, f);
    }
}
