package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class c4t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c4t INSTANCE = new c4t();

    static {
        t2o.a(1010827403);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel a(java.util.Map<java.lang.String, ? extends java.lang.Object> r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.c4t.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "17969bfc"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            java.lang.Object r7 = r0.ipc$dispatch(r1, r2)
            com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel r7 = (com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel) r7
            return r7
        L_0x0018:
            tb.l1t r0 = tb.l1t.INSTANCE
            r1 = 0
            if (r7 != 0) goto L_0x001f
        L_0x001d:
            r7 = r1
            goto L_0x006e
        L_0x001f:
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r2 = new com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject     // Catch: Exception -> 0x0038
            boolean r3 = r7 instanceof java.lang.Object     // Catch: Exception -> 0x0038
            if (r3 == 0) goto L_0x0027
            r3 = r7
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            r2.<init>(r3)     // Catch: Exception -> 0x0038
            com.taobao.uniinfra_kmp.common_utils.serialization.a$a r3 = com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion     // Catch: Exception -> 0x0038
            java.lang.Class<com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel> r4 = com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel.class
            tb.wyf r4 = tb.dun.b(r4)     // Catch: Exception -> 0x0038
            java.io.Serializable r7 = com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt.decodeFromJsonObject(r3, r2, r4)     // Catch: Exception -> 0x0038
            goto L_0x006e
        L_0x0038:
            r2 = move-exception
            tb.pus r3 = tb.pus.INSTANCE
            java.lang.Class r0 = r0.getClass()
            tb.wyf r0 = tb.dun.b(r0)
            tb.ns3 r0 = (tb.ns3) r0
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "modelFromMap === "
            r4.<init>(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = ", data === "
            r4.append(r2)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.String r2 = ""
            r3.f(r0, r2, r7)
            goto L_0x001d
        L_0x006e:
            com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel r7 = (com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel) r7
            if (r7 != 0) goto L_0x0073
            return r1
        L_0x0073:
            java.lang.String r0 = r7.getNativeFeedDetailUrl()
            java.lang.String r1 = "livesource"
            java.lang.String r2 = "upDownSwitch.guide"
            java.lang.String r0 = r6.b(r0, r1, r2)
            r7.setActionUrl(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c4t.a(java.util.Map):com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel");
    }

    public final String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e5880ce", new Object[]{this, str, str2, str3});
        }
        if (str == null || str.length() == 0) {
            return str;
        }
        if (tsq.I(str, itw.URL_SEPARATOR, false, 2, null)) {
            str = uyv.HTTPS_SCHEMA.concat(str);
        }
        if (!wsq.O(str, "&" + str2 + '=', false, 2, null)) {
            if (!wsq.O(str, "?" + str2 + '=', false, 2, null)) {
                if (wsq.O(str, "?", false, 2, null)) {
                    return str + '&' + str2 + '=' + str3;
                }
                return str + f7l.CONDITION_IF + str2 + '=' + str3;
            }
        }
        Regex regex = new Regex(str2 + "=[^&]*");
        return regex.replace(str, str2 + '=' + str3);
    }
}
