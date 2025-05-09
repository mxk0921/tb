package com.taobao.android.favsdk.favtaobaouse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FavWVAPIPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAV_GROUPS = "favorites";
    public static final String IS_DEGRADE_JSBRIDGE = "isDegradeJSbridge";

    public static /* synthetic */ Object ipc$super(FavWVAPIPlugin favWVAPIPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/favsdk/favtaobaouse/FavWVAPIPlugin");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r7, java.lang.String r8, android.taobao.windvane.jsbridge.WVCallBackContext r9) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.favsdk.favtaobaouse.FavWVAPIPlugin.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = "bcd41fd1"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r7 = 2
            r4[r7] = r8
            r7 = 3
            r4[r7] = r9
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0022:
            if (r7 != 0) goto L_0x0025
            return r1
        L_0x0025:
            com.taobao.orange.OrangeConfig r2 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r3 = "false"
            java.lang.String r4 = "favorites"
            java.lang.String r5 = "isDegradeJSbridge"
            java.lang.String r2 = r2.getConfig(r4, r5, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: Exception -> 0x0043
            if (r3 != 0) goto L_0x0047
            java.lang.String r2 = r2.trim()     // Catch: Exception -> 0x0043
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: Exception -> 0x0043
            goto L_0x0048
        L_0x0043:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x0062
            tb.nsw r7 = new tb.nsw
            r7.<init>()
            java.lang.String r8 = "errorCode"
            java.lang.String r1 = "degrade_jsbridge"
            r7.b(r8, r1)
            java.lang.String r8 = "errorMsg"
            java.lang.String r1 = "收藏jsbridge降级到mtop"
            r7.b(r8, r1)
            r9.error(r7)
            return r0
        L_0x0062:
            com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl r0 = new com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl
            r0.<init>()
            com.alibaba.fastjson.JSONObject r8 = com.alibaba.fastjson.JSON.parseObject(r8)
            java.lang.String r2 = "bizCode"
            java.lang.String r2 = r8.getString(r2)
            r0.setBizCode(r2)
            java.lang.String r2 = "isFavoriteItem"
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "addFavoriteItem"
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "deleteFavoriteItem"
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "deleteFavoriteItems"
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "updateFavoriteItemCache"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x009f
            goto L_0x00c4
        L_0x009f:
            java.lang.String r2 = "isFavoriteContent"
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x00ba
            java.lang.String r2 = "addFavoriteContent"
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x00ba
            java.lang.String r2 = "deleteFavoriteContent"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            return r1
        L_0x00ba:
            tb.d29 r1 = new tb.d29
            r1.<init>()
            boolean r7 = r1.b(r7, r8, r0, r9)
            return r7
        L_0x00c4:
            tb.j29 r1 = new tb.j29
            r1.<init>()
            boolean r7 = r1.b(r7, r8, r0, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.favsdk.favtaobaouse.FavWVAPIPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
