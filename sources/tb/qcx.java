package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256222);
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adfab1a4", new Object[]{context, str})).booleanValue();
        }
        String A = b9l.A(context);
        if (!TextUtils.isEmpty(A)) {
            JSONObject parseObject = JSON.parseObject(A);
            if (parseObject.getJSONObject(str) != null) {
                String string = parseObject.getJSONObject(str).getString("app_version");
                String g = qj7.g(context);
                if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(string) && qj7.b(g, string) < 0) {
                    return false;
                }
            }
        }
        if (!x.a()) {
            return false;
        }
        hgh.d("WidgetServiceNativeHub widgetInstallSupport typeId：" + str);
        return true;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fee35ad", new Object[]{str})).booleanValue();
        }
        try {
            return a(ae7.c().b(), str);
        } catch (Exception e) {
            hgh.d("WidgetServiceNativeHub widgetInstallSupport error：" + e);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r4.equals("oppo") == false) goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        if (tb.qj7.q(r8, r9) != false) goto L_0x00cc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
        if (tb.qj7.m(r8) != false) goto L_0x00cc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (r3 != false) goto L_0x00cc;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qcx.a(android.content.Context, java.lang.String):boolean");
    }
}
