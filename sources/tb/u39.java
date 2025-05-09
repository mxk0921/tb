package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u39 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAV_BIG_SALE = "IsOpenBigSaleFilter";
    public static final String FAV_BIG_SALE_IMAGE = "BigSaleFilterImage";
    public static final String FAV_CONTENT_BLACKLIST = "content_fav_url_param_blacklist";
    public static final String FAV_GOODS_NOTICE = "FavGoodNotice";
    public static final String FAV_GROUPS = "favorites";
    public static final String FAV_IS_SIMILAR_CLOSE = "IsSimilarClose";
    public static final String FAV_PROPERTIES_DEGRADE_SWITCH = "FavPropertyViewDegrade";
    public static final String TAG = "fav.FavoriteSwitch";

    static {
        t2o.a(707788896);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2efc79a4", new Object[0])).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.utils.FavoriteSwitch", "public static boolean isUseFavSdkService()", "20180112");
        return a(OrangeConfig.getInstance().getConfig("favorites", "IsUseFavSdk", "-1"), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r9, boolean r10) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "favLog"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.u39.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0023
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r10)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r1] = r9
            r10[r0] = r2
            java.lang.String r9 = "3a5c67ca"
            java.lang.Object r9 = r3.ipc$dispatch(r9, r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0023:
            java.lang.String r3 = "private static boolean isRightUser(@NonNull String switchValue, boolean defaultValue)"
            java.lang.String r4 = "20180112"
            java.lang.String r5 = "CodeTrack-favorite"
            java.lang.String r6 = "offline"
            java.lang.String r7 = "com.taobao.favorites.utils.FavoriteSwitch"
            com.alibaba.mtl.appmonitor.AppMonitor.Alarm.commitFail(r5, r6, r7, r3, r4)
            int r3 = java.lang.Integer.parseInt(r9)
            java.lang.String r4 = com.taobao.login4android.api.Login.getUserId()     // Catch: NumberFormatException -> 0x0052
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: NumberFormatException -> 0x0050
            if (r5 != 0) goto L_0x0084
            long r5 = java.lang.Long.parseLong(r4)     // Catch: NumberFormatException -> 0x0050
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 % r7
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004e
            r10 = 1
            goto L_0x0084
        L_0x004e:
            r10 = 0
            goto L_0x0084
        L_0x0050:
            r0 = move-exception
            goto L_0x0054
        L_0x0052:
            r0 = move-exception
            r4 = 0
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "FavoriteSwitch.isRightUser parse userId error, switchValue="
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r3 = ",userId="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ",defaultValue="
            r1.append(r3)
            r1.append(r10)
            java.lang.String r3 = ", error="
            r1.append(r3)
            java.lang.String r3 = r0.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.taobao.tao.log.TLog.loge(r2, r1)
            r0.printStackTrace()
        L_0x0084:
            if (r10 != 0) goto L_0x009f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FavoriteSwitch.isRightUser false, userIdString="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ",switchValue="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.taobao.tao.log.TLog.loge(r2, r9)
        L_0x009f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u39.a(java.lang.String, boolean):boolean");
    }
}
