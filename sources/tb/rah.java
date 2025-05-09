package tb;

import com.alibaba.ability.localization.LocalizationManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(456130642);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef78baf8", new Object[0])).booleanValue();
        }
        String language = LocalizationManager.INSTANCE.d().getLanguage();
        return "ru".equalsIgnoreCase(language) || "kk".equalsIgnoreCase(language);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r5.equals("ms") == false) goto L_0x0032;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.ability.localization.constants.Language b(java.lang.String r5) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.rah.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0016
            java.lang.String r0 = "d848b348"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            java.lang.Object r5 = r3.ipc$dispatch(r0, r1)
            com.alibaba.ability.localization.constants.Language r5 = (com.alibaba.ability.localization.constants.Language) r5
            return r5
        L_0x0016:
            boolean r3 = com.taobao.tao.util.StringUtil.isEmpty(r5)
            if (r3 != 0) goto L_0x007e
            int r3 = r5.length()
            if (r3 >= r0) goto L_0x0023
            goto L_0x007e
        L_0x0023:
            java.lang.String r5 = r5.substring(r2, r0)
            r5.hashCode()
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case 3241: goto L_0x0062;
                case 3424: goto L_0x0056;
                case 3494: goto L_0x004c;
                case 3651: goto L_0x0040;
                case 3700: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            r0 = -1
            goto L_0x006c
        L_0x0034:
            java.lang.String r0 = "th"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x003e
            goto L_0x0032
        L_0x003e:
            r0 = 4
            goto L_0x006c
        L_0x0040:
            java.lang.String r0 = "ru"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x004a
            goto L_0x0032
        L_0x004a:
            r0 = 3
            goto L_0x006c
        L_0x004c:
            java.lang.String r1 = "ms"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x006c
            goto L_0x0032
        L_0x0056:
            java.lang.String r0 = "kk"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0060
            goto L_0x0032
        L_0x0060:
            r0 = 1
            goto L_0x006c
        L_0x0062:
            java.lang.String r0 = "en"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x006b
            goto L_0x0032
        L_0x006b:
            r0 = 0
        L_0x006c:
            switch(r0) {
                case 0: goto L_0x007b;
                case 1: goto L_0x0078;
                case 2: goto L_0x0075;
                case 3: goto L_0x0078;
                case 4: goto L_0x0072;
                default: goto L_0x006f;
            }
        L_0x006f:
            com.alibaba.ability.localization.constants.Language r5 = com.alibaba.ability.localization.constants.Language.SIMPLIFIED_CHINESE
            return r5
        L_0x0072:
            com.alibaba.ability.localization.constants.Language r5 = com.alibaba.ability.localization.constants.Language.THAI
            return r5
        L_0x0075:
            com.alibaba.ability.localization.constants.Language r5 = com.alibaba.ability.localization.constants.Language.MALAY
            return r5
        L_0x0078:
            com.alibaba.ability.localization.constants.Language r5 = com.alibaba.ability.localization.constants.Language.RUSSIAN
            return r5
        L_0x007b:
            com.alibaba.ability.localization.constants.Language r5 = com.alibaba.ability.localization.constants.Language.ENGLISH
            return r5
        L_0x007e:
            com.alibaba.ability.localization.constants.Language r5 = com.alibaba.ability.localization.constants.Language.SIMPLIFIED_CHINESE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rah.b(java.lang.String):com.alibaba.ability.localization.constants.Language");
    }
}
