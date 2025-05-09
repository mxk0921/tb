package com.loc;

import android.os.Bundle;
import android.text.TextUtils;
import com.amap.api.location.AMapLocationClientOption;
import com.taobao.media.MediaConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fo {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f5705a = new StringBuilder();
    private AMapLocationClientOption b = new AMapLocationClientOption();

    private static String b(String str) {
        if (MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(str)) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0292 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(com.loc.ew r21, byte[] r22, com.loc.eq r23) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fo.a(com.loc.ew, byte[], com.loc.eq):com.loc.ew");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r3.length() <= 0) goto L_0x007d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
        r10.setCity(r3);
        r4 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0001, B:5:0x0050, B:7:0x0058, B:9:0x0060, B:12:0x0069, B:14:0x0073, B:16:0x0079, B:17:0x007d, B:19:0x0083, B:20:0x0087, B:23:0x00d8, B:25:0x00ea, B:27:0x00f6, B:28:0x0105), top: B:31:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[Catch: all -> 0x010c, TRY_ENTER, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0001, B:5:0x0050, B:7:0x0058, B:9:0x0060, B:12:0x0069, B:14:0x0073, B:16:0x0079, B:17:0x007d, B:19:0x0083, B:20:0x0087, B:23:0x00d8, B:25:0x00ea, B:27:0x00f6, B:28:0x0105), top: B:31:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0001, B:5:0x0050, B:7:0x0058, B:9:0x0060, B:12:0x0069, B:14:0x0073, B:16:0x0079, B:17:0x007d, B:19:0x0083, B:20:0x0087, B:23:0x00d8, B:25:0x00ea, B:27:0x00f6, B:28:0x0105), top: B:31:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            com.loc.ew r10 = new com.loc.ew     // Catch: all -> 0x010c
            java.lang.String r1 = ""
            r10.<init>(r1)     // Catch: all -> 0x010c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: all -> 0x010c
            r1.<init>(r14)     // Catch: all -> 0x010c
            java.lang.String r14 = "regeocode"
            org.json.JSONObject r14 = r1.optJSONObject(r14)     // Catch: all -> 0x010c
            java.lang.String r1 = "addressComponent"
            org.json.JSONObject r1 = r14.optJSONObject(r1)     // Catch: all -> 0x010c
            java.lang.String r2 = "country"
            java.lang.String r2 = r1.optString(r2)     // Catch: all -> 0x010c
            java.lang.String r2 = b(r2)     // Catch: all -> 0x010c
            r10.setCountry(r2)     // Catch: all -> 0x010c
            java.lang.String r2 = "province"
            java.lang.String r2 = r1.optString(r2)     // Catch: all -> 0x010c
            java.lang.String r3 = b(r2)     // Catch: all -> 0x010c
            r10.setProvince(r3)     // Catch: all -> 0x010c
            java.lang.String r2 = "citycode"
            java.lang.String r2 = r1.optString(r2)     // Catch: all -> 0x010c
            java.lang.String r2 = b(r2)     // Catch: all -> 0x010c
            r10.setCityCode(r2)     // Catch: all -> 0x010c
            java.lang.String r4 = "city"
            java.lang.String r4 = r1.optString(r4)     // Catch: all -> 0x010c
            java.lang.String r5 = "010"
            boolean r5 = r2.endsWith(r5)     // Catch: all -> 0x010c
            if (r5 != 0) goto L_0x0071
            java.lang.String r5 = "021"
            boolean r5 = r2.endsWith(r5)     // Catch: all -> 0x010c
            if (r5 != 0) goto L_0x0071
            java.lang.String r5 = "022"
            boolean r5 = r2.endsWith(r5)     // Catch: all -> 0x010c
            if (r5 != 0) goto L_0x0071
            java.lang.String r5 = "023"
            boolean r2 = r2.endsWith(r5)     // Catch: all -> 0x010c
            if (r2 == 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.String r4 = b(r4)     // Catch: all -> 0x010c
            r10.setCity(r4)     // Catch: all -> 0x010c
            goto L_0x007d
        L_0x0071:
            if (r3 == 0) goto L_0x007d
            int r2 = r3.length()     // Catch: all -> 0x010c
            if (r2 <= 0) goto L_0x007d
            r10.setCity(r3)     // Catch: all -> 0x010c
            r4 = r3
        L_0x007d:
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x010c
            if (r2 == 0) goto L_0x0087
            r10.setCity(r3)     // Catch: all -> 0x010c
            r4 = r3
        L_0x0087:
            java.lang.String r2 = "district"
            java.lang.String r2 = r1.optString(r2)     // Catch: all -> 0x010c
            java.lang.String r5 = b(r2)     // Catch: all -> 0x010c
            r10.setDistrict(r5)     // Catch: all -> 0x010c
            java.lang.String r2 = "adcode"
            java.lang.String r2 = r1.optString(r2)     // Catch: all -> 0x010c
            java.lang.String r9 = b(r2)     // Catch: all -> 0x010c
            r10.setAdCode(r9)     // Catch: all -> 0x010c
            java.lang.String r2 = "streetNumber"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch: all -> 0x010c
            java.lang.String r2 = "street"
            java.lang.String r2 = r1.optString(r2)     // Catch: all -> 0x010c
            java.lang.String r6 = b(r2)     // Catch: all -> 0x010c
            r10.setStreet(r6)     // Catch: all -> 0x010c
            r10.setRoad(r6)     // Catch: all -> 0x010c
            java.lang.String r2 = "number"
            java.lang.String r1 = r1.optString(r2)     // Catch: all -> 0x010c
            java.lang.String r7 = b(r1)     // Catch: all -> 0x010c
            r10.setNumber(r7)     // Catch: all -> 0x010c
            java.lang.String r1 = "pois"
            org.json.JSONArray r1 = r14.optJSONArray(r1)     // Catch: all -> 0x010c
            int r2 = r1.length()     // Catch: all -> 0x010c
            java.lang.String r8 = "name"
            r11 = 0
            if (r2 <= 0) goto L_0x00e9
            org.json.JSONObject r1 = r1.getJSONObject(r11)     // Catch: all -> 0x010c
            java.lang.String r1 = r1.optString(r8)     // Catch: all -> 0x010c
            java.lang.String r1 = b(r1)     // Catch: all -> 0x010c
            r10.setPoiName(r1)     // Catch: all -> 0x010c
            r12 = r1
            goto L_0x00ea
        L_0x00e9:
            r12 = r0
        L_0x00ea:
            java.lang.String r1 = "aois"
            org.json.JSONArray r14 = r14.optJSONArray(r1)     // Catch: all -> 0x010c
            int r1 = r14.length()     // Catch: all -> 0x010c
            if (r1 <= 0) goto L_0x0105
            org.json.JSONObject r14 = r14.getJSONObject(r11)     // Catch: all -> 0x010c
            java.lang.String r14 = r14.optString(r8)     // Catch: all -> 0x010c
            java.lang.String r14 = b(r14)     // Catch: all -> 0x010c
            r10.setAoiName(r14)     // Catch: all -> 0x010c
        L_0x0105:
            r1 = r13
            r2 = r10
            r8 = r12
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: all -> 0x010c
            return r10
        L_0x010c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fo.a(java.lang.String):com.loc.ew");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #1 {all -> 0x006b, blocks: (B:9:0x0057, B:12:0x0064, B:17:0x006d, B:18:0x0080, B:20:0x0096), top: B:29:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(java.lang.String r10, android.content.Context r11, com.loc.bu r12, com.loc.eq r13) {
        /*
            r9 = this;
            java.lang.String r0 = "#0701"
            java.lang.String r1 = "#0702"
            java.lang.String r2 = "status"
            com.loc.ew r3 = new com.loc.ew
            java.lang.String r4 = ""
            r3.<init>(r4)
            r4 = 7
            r3.setErrorCode(r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r5 = 0
            java.lang.String r6 = "#SHA1AndPackage#"
            r4.append(r6)     // Catch: all -> 0x0057
            java.lang.String r11 = com.loc.l.e(r11)     // Catch: all -> 0x0057
            r4.append(r11)     // Catch: all -> 0x0057
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11 = r12.b     // Catch: all -> 0x0057
            java.lang.String r6 = "gsid"
            java.lang.Object r11 = r11.get(r6)     // Catch: all -> 0x0057
            java.util.List r11 = (java.util.List) r11     // Catch: all -> 0x0057
            java.lang.Object r11 = r11.get(r5)     // Catch: all -> 0x0057
            java.lang.String r11 = (java.lang.String) r11     // Catch: all -> 0x0057
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: all -> 0x0057
            if (r6 != 0) goto L_0x0042
            java.lang.String r6 = "#gsid#"
            r4.append(r6)     // Catch: all -> 0x0057
            r4.append(r11)     // Catch: all -> 0x0057
        L_0x0042:
            java.lang.String r11 = r12.c     // Catch: all -> 0x0057
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: all -> 0x0057
            if (r6 != 0) goto L_0x0057
            java.lang.String r6 = "#csid#"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: all -> 0x0057
            java.lang.String r11 = r6.concat(r11)     // Catch: all -> 0x0057
            r4.append(r11)     // Catch: all -> 0x0057
        L_0x0057:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: all -> 0x006b
            r11.<init>(r10)     // Catch: all -> 0x006b
            boolean r6 = r11.has(r2)     // Catch: all -> 0x006b
            java.lang.String r7 = "info"
            if (r6 == 0) goto L_0x006d
            boolean r6 = r11.has(r7)     // Catch: all -> 0x006b
            if (r6 != 0) goto L_0x0080
            goto L_0x006d
        L_0x006b:
            r10 = move-exception
            goto L_0x00af
        L_0x006d:
            r13.f(r1)     // Catch: all -> 0x006b
            java.lang.StringBuilder r6 = r9.f5705a     // Catch: all -> 0x006b
            java.lang.String r8 = "json is error:"
            r6.append(r8)     // Catch: all -> 0x006b
            r6.append(r10)     // Catch: all -> 0x006b
            r6.append(r4)     // Catch: all -> 0x006b
            r6.append(r1)     // Catch: all -> 0x006b
        L_0x0080:
            java.lang.String r10 = r11.getString(r2)     // Catch: all -> 0x006b
            java.lang.String r1 = r11.getString(r7)     // Catch: all -> 0x006b
            java.lang.String r2 = "infocode"
            java.lang.String r11 = r11.getString(r2)     // Catch: all -> 0x006b
            java.lang.String r2 = "0"
            boolean r10 = r2.equals(r10)     // Catch: all -> 0x006b
            if (r10 == 0) goto L_0x00d1
            r13.f(r0)     // Catch: all -> 0x006b
            java.lang.StringBuilder r10 = r9.f5705a     // Catch: all -> 0x006b
            java.lang.String r2 = "auth fail:"
            r10.append(r2)     // Catch: all -> 0x006b
            r10.append(r1)     // Catch: all -> 0x006b
            r10.append(r4)     // Catch: all -> 0x006b
            r10.append(r0)     // Catch: all -> 0x006b
            java.lang.String r10 = r12.d     // Catch: all -> 0x006b
            com.loc.fw.a(r10, r11, r1)     // Catch: all -> 0x006b
            goto L_0x00d1
        L_0x00af:
            java.lang.String r11 = "#0703"
            r13.f(r11)
            java.lang.StringBuilder r12 = r9.f5705a
            java.lang.String r13 = "json exception error:"
            r12.append(r13)
            java.lang.String r13 = r10.getMessage()
            r12.append(r13)
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = "parser"
            java.lang.String r12 = "paseAuthFailurJson"
            com.loc.fr.a(r10, r11, r12)
        L_0x00d1:
            java.lang.StringBuilder r10 = r9.f5705a
            java.lang.String r10 = r10.toString()
            r3.setLocationDetail(r10)
            java.lang.StringBuilder r10 = r9.f5705a
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x00eb
            java.lang.StringBuilder r10 = r9.f5705a
            int r11 = r10.length()
            r10.delete(r5, r11)
        L_0x00eb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fo.a(java.lang.String, android.content.Context, com.loc.bu, com.loc.eq):com.loc.ew");
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            this.b = new AMapLocationClientOption();
        } else {
            this.b = aMapLocationClientOption;
        }
    }

    private void a(ew ewVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str2)) {
            a(str, str2, sb);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(str4);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(str5);
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(str6)) {
            a(str7, str6, sb, ewVar);
        }
        Bundle bundle = new Bundle();
        bundle.putString("citycode", ewVar.getCityCode());
        bundle.putString("desc", sb.toString());
        bundle.putString("adcode", ewVar.getAdCode());
        ewVar.setExtras(bundle);
        ewVar.g(sb.toString());
        String adCode = ewVar.getAdCode();
        ewVar.setAddress((adCode == null || adCode.trim().length() <= 0 || this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) ? sb.toString() : sb.toString().replace(" ", ""));
    }

    private static void a(ew ewVar, short s) {
        if (!"-1".equals(ewVar.d())) {
            if (s == -1) {
                s = 0;
            } else if (s == 0) {
                s = -1;
            }
            ewVar.setConScenario(s);
            return;
        }
        if (s == 101) {
            s = 100;
        }
        ewVar.setConScenario(s);
    }

    private void a(String str, String str2, StringBuilder sb) {
        if (this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) {
            if (!str2.equals(str)) {
                sb.append(str2);
                sb.append(" ");
            }
        } else if (!str.contains("市") || !str.equals(str2)) {
            sb.append(str2);
            sb.append(" ");
        }
    }

    private void a(String str, String str2, StringBuilder sb, ew ewVar) {
        String concat;
        if (TextUtils.isEmpty(str) || this.b.getGeoLanguage() == AMapLocationClientOption.GeoLanguage.EN) {
            sb.append("Near ".concat(String.valueOf(str2)));
            concat = "Near ".concat(String.valueOf(str2));
        } else {
            sb.append("靠近");
            sb.append(str2);
            sb.append(" ");
            concat = "在" + str2 + "附近";
        }
        ewVar.setDescription(concat);
    }
}
