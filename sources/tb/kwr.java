package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.constants.TPTargetType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kwr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String QQ_LITE_PKG = "com.tencent.qqlite";
    public static final String QQ_PKG = "com.tencent.mobileqq";
    public static final String QZONE_PKG = "com.qzone";
    public static final String TAO_PASSWORD_FROM_PIC_SAVE_KEY = "tb_taopassword_from_pic_save_key";
    public static final String WEIXIN_PKG = "com.tencent.mm";

    static {
        t2o.a(665845946);
    }

    public static String c(TPTargetType tPTargetType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a0f3832", new Object[]{tPTargetType});
        }
        if (tPTargetType == null) {
            return null;
        }
        if (TPTargetType.WEIXIN.getInfo().equals(tPTargetType.getInfo())) {
            return "com.tencent.mm";
        }
        if (TPTargetType.QZONE.getInfo().equals(tPTargetType.getInfo())) {
            return "com.qzone";
        }
        if (TPTargetType.QQFRIEND.getInfo().equals(tPTargetType.getInfo())) {
            return "com.tencent.mobileqq";
        }
        return null;
    }

    public static boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d87e588", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Map<String, String> h(Uri uri) {
        String[] strArr;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de19b76b", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        String query = uri.getQuery();
        if (fragment == null || !fragment.contains("?")) {
            strArr = null;
        } else {
            strArr = fragment.split("\\?");
        }
        if (strArr != null && strArr.length > 0) {
            fragment = strArr[0];
            query = !TextUtils.isEmpty(query) ? query + "&" + strArr[1] : strArr[1];
        }
        if (fragment != null && fragment.contains("&") && (indexOf = fragment.indexOf("&")) > 0) {
            if (!TextUtils.isEmpty(query)) {
                fragment.substring(indexOf + 1);
            } else {
                fragment.substring(indexOf + 1);
            }
            fragment.substring(0, indexOf);
        }
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String[] strArr2 = (String[]) queryParameterNames.toArray(new String[queryParameterNames.size()]);
            if (strArr2 != null && strArr2.length > 0) {
                for (String str : strArr2) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static Map<String, String> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("371c4c73", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return h(Uri.parse(str));
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11258675", new Object[]{context});
        }
        return context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).getString("tb_taopassword_save_key", null);
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4b4feab", new Object[]{context, str});
        }
        return context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).getString(str, null);
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdc49bc", new Object[]{context, str});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).edit();
        edit.putString("tb_taopassword_save_key", str);
        edit.apply();
    }

    public static void g(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a0fc86", new Object[]{context, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("tb_share_copy_content", 0).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (d(r5, r6) == false) goto L_0x0032;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.kwr.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "24b18058"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            boolean r2 = d(r5, r6)
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = "com.tencent.mobileqq"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0032
            java.lang.String r6 = "com.tencent.qqlite"
            boolean r2 = d(r5, r6)
            if (r2 != 0) goto L_0x0033
        L_0x0032:
            return r1
        L_0x0033:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            android.content.Intent r6 = r2.getLaunchIntentForPackage(r6)     // Catch: Exception -> 0x004b
            java.lang.String r2 = "visa"
            java.lang.String r3 = "5abd4435a4075ad0"
            r6.putExtra(r2, r3)     // Catch: Exception -> 0x004b
            com.ut.share.utils.IFlowOutHelper r2 = com.ut.share.utils.FlowOutFacade.getInstance()     // Catch: Exception -> 0x004b
            r2.startActivity(r5, r6)     // Catch: Exception -> 0x004b
            return r0
        L_0x004b:
            r5 = move-exception
            r5.printStackTrace()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "openApp failed: "
            r6.<init>(r0)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kwr.e(android.content.Context, java.lang.String):boolean");
    }
}
