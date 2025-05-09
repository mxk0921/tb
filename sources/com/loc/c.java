package com.loc;

import android.os.Bundle;
import com.amap.api.fence.GeoFence;
import com.amap.api.fence.PoiItem;
import com.amap.api.location.DPoint;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static long f5621a;

    private static double a(DPoint dPoint, DPoint dPoint2, DPoint dPoint3) {
        double d;
        double d2;
        double longitude = dPoint.getLongitude() - dPoint2.getLongitude();
        double latitude = dPoint.getLatitude() - dPoint2.getLatitude();
        double longitude2 = dPoint3.getLongitude() - dPoint2.getLongitude();
        double latitude2 = dPoint3.getLatitude() - dPoint2.getLatitude();
        double d3 = ((longitude * longitude2) + (latitude * latitude2)) / ((longitude2 * longitude2) + (latitude2 * latitude2));
        boolean z = dPoint2.getLongitude() == dPoint3.getLongitude() && dPoint2.getLatitude() == dPoint3.getLatitude();
        if (d3 < vu3.b.GEO_NOT_SUPPORT || z) {
            d2 = dPoint2.getLongitude();
            d = dPoint2.getLatitude();
        } else if (d3 > 1.0d) {
            d2 = dPoint3.getLongitude();
            d = dPoint3.getLatitude();
        } else {
            d2 = dPoint2.getLongitude() + (longitude2 * d3);
            d = dPoint2.getLatitude() + (d3 * latitude2);
        }
        return fy.a(new DPoint(dPoint.getLatitude(), dPoint.getLongitude()), new DPoint(d, d2));
    }

    public static int b(String str, List<GeoFence> list, Bundle bundle) {
        return a(str, list, bundle);
    }

    public static int a(String str, List<GeoFence> list, Bundle bundle) {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            char c = 0;
            int optInt = jSONObject.optInt("status", 0);
            int optInt2 = jSONObject.optInt("infocode", 0);
            if (optInt == 1 && (optJSONArray = jSONObject.optJSONArray("pois")) != null) {
                int i = 0;
                while (i < optJSONArray.length()) {
                    GeoFence geoFence = new GeoFence();
                    PoiItem poiItem = new PoiItem();
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    poiItem.setPoiId(jSONObject2.optString("id"));
                    poiItem.setPoiName(jSONObject2.optString("name"));
                    poiItem.setPoiType(jSONObject2.optString("type"));
                    poiItem.setTypeCode(jSONObject2.optString("typecode"));
                    poiItem.setAddress(jSONObject2.optString(WXAddressModule2.PLUGIN_NAME));
                    String optString = jSONObject2.optString("location");
                    if (optString != null) {
                        String[] split = optString.split(",");
                        poiItem.setLongitude(Double.parseDouble(split[c]));
                        poiItem.setLatitude(Double.parseDouble(split[1]));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        optInt2 = optInt2;
                        DPoint dPoint = new DPoint(poiItem.getLatitude(), poiItem.getLongitude());
                        arrayList2.add(dPoint);
                        arrayList.add(arrayList2);
                        geoFence.setPointList(arrayList);
                        geoFence.setCenter(dPoint);
                    } else {
                        optInt2 = optInt2;
                    }
                    poiItem.setTel(jSONObject2.optString("tel"));
                    poiItem.setProvince(jSONObject2.optString("pname"));
                    poiItem.setCity(jSONObject2.optString("cityname"));
                    poiItem.setAdname(jSONObject2.optString("adname"));
                    geoFence.setPoiItem(poiItem);
                    StringBuilder sb = new StringBuilder();
                    sb.append(a());
                    geoFence.setFenceId(sb.toString());
                    if (bundle != null) {
                        geoFence.setCustomId(bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID));
                        geoFence.setPendingIntentAction(bundle.getString("pendingIntentAction"));
                        geoFence.setType(2);
                        geoFence.setRadius(bundle.getFloat("fenceRadius"));
                        geoFence.setExpiration(bundle.getLong("expiration"));
                        geoFence.setActivatesAction(bundle.getInt("activatesAction", 1));
                    }
                    if (list != null) {
                        list.add(geoFence);
                    }
                    i++;
                    c = 0;
                }
            }
            return optInt2;
        } catch (Throwable unused) {
            return 5;
        }
    }

    public static synchronized long a() {
        long j;
        synchronized (c.class) {
            try {
                long b = fy.b();
                long j2 = f5621a;
                if (b > j2) {
                    f5621a = b;
                } else {
                    f5621a = j2 + 1;
                }
                j = f5621a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.amap.api.fence.DistrictItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.loc.c] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List<com.amap.api.fence.GeoFence>, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.lang.String r33, java.util.List<com.amap.api.fence.GeoFence> r34, android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.c.c(java.lang.String, java.util.List, android.os.Bundle):int");
    }

    private List<DPoint> a(List<DPoint> list, float f) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        DPoint dPoint = list.get(0);
        DPoint dPoint2 = list.get(list.size() - 1);
        double d = vu3.b.GEO_NOT_SUPPORT;
        int i = 0;
        for (int i2 = 1; i2 < list.size() - 1; i2++) {
            double a2 = a(list.get(i2), dPoint, dPoint2);
            if (a2 > d) {
                i = i2;
                d = a2;
            }
        }
        if (d < f) {
            arrayList.add(dPoint);
            arrayList.add(dPoint2);
            return arrayList;
        }
        List<DPoint> a3 = a(list.subList(0, i + 1), f);
        List<DPoint> a4 = a(list.subList(i, list.size()), f);
        arrayList.addAll(a3);
        arrayList.remove(arrayList.size() - 1);
        arrayList.addAll(a4);
        return arrayList;
    }
}
