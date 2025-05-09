package com.loc;

import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import org.json.JSONObject;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ew extends AMapLocation {
    private int i;
    protected String d = "";
    private String g = null;
    private String h = "";
    private String j = "";
    private int k = 0;
    private String l = "new";
    private JSONObject m = null;
    private String n = "";
    boolean e = true;
    String f = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
    private String o = "";
    private String p = null;

    public ew(String str) {
        super(str);
    }

    private void i(String str) {
        this.n = str;
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.h;
    }

    public final int c() {
        return this.i;
    }

    public final String d() {
        return this.j;
    }

    public final String e() {
        return this.l;
    }

    public final JSONObject f() {
        return this.m;
    }

    public final String g() {
        return this.n;
    }

    public final ew h() {
        String g = g();
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        String[] split = g.split(",");
        if (split.length != 3) {
            return null;
        }
        ew ewVar = new ew("");
        ewVar.setProvider(getProvider());
        ewVar.setLongitude(fy.c(split[0]));
        ewVar.setLatitude(fy.c(split[1]));
        ewVar.setAccuracy(fy.d(split[2]));
        ewVar.setCityCode(getCityCode());
        ewVar.setAdCode(getAdCode());
        ewVar.setCountry(getCountry());
        ewVar.setProvince(getProvince());
        ewVar.setCity(getCity());
        ewVar.setTime(getTime());
        ewVar.e(e());
        ewVar.c(String.valueOf(c()));
        if (!fy.a(ewVar)) {
            return null;
        }
        return ewVar;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.p;
    }

    public final int l() {
        return this.k;
    }

    @Override // com.amap.api.location.AMapLocation
    public final JSONObject toJson(int i) {
        try {
            JSONObject json = super.toJson(i);
            if (i == 1) {
                json.put("retype", this.j);
                json.put("cens", this.o);
                json.put("coord", this.i);
                json.put("mcell", this.n);
                json.put("desc", this.d);
                json.put(WXAddressModule2.PLUGIN_NAME, getAddress());
                if (this.m != null && fy.a(json, "offpct")) {
                    json.put("offpct", this.m.getString("offpct"));
                }
            } else if (!(i == 2 || i == 3)) {
                return json;
            }
            json.put("type", this.l);
            json.put("isReversegeo", this.e);
            json.put("geoLanguage", this.f);
            return json;
        } catch (Throwable th) {
            fr.a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr() {
        return toStr(1);
    }

    private void j(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\*");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2)) {
                    String[] split2 = str2.split(",");
                    setLongitude(fy.c(split2[0]));
                    setLatitude(fy.c(split2[1]));
                    setAccuracy(fy.e(split2[2]));
                    break;
                }
                i++;
            }
            this.o = str;
        }
    }

    public final void a(int i) {
        this.k = i;
    }

    public final void b(String str) {
        this.h = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "0"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            r2 = 0
        L_0x000f:
            r1.i = r2
            goto L_0x001e
        L_0x0012:
            java.lang.String r0 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x001c
            r2 = 1
            goto L_0x000f
        L_0x001c:
            r2 = -1
            goto L_0x000f
        L_0x001e:
            int r2 = r1.i
            if (r2 != 0) goto L_0x0028
            java.lang.String r2 = "WGS84"
        L_0x0024:
            super.setCoordType(r2)
            return
        L_0x0028:
            java.lang.String r2 = "GCJ02"
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ew.c(java.lang.String):void");
    }

    public final void d(String str) {
        this.j = str;
    }

    public final void e(String str) {
        this.l = str;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final void g(String str) {
        this.d = str;
    }

    public final void h(String str) {
        this.p = str;
    }

    public final boolean i() {
        return this.e;
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr(int i) {
        JSONObject jSONObject;
        try {
            jSONObject = toJson(i);
            jSONObject.put("nb", this.p);
        } catch (Throwable th) {
            fr.a(th, "AMapLocation", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void b(JSONObject jSONObject) {
        try {
            fr.a(this, jSONObject);
            e(jSONObject.optString("type", this.l));
            d(jSONObject.optString("retype", this.j));
            j(jSONObject.optString("cens", this.o));
            g(jSONObject.optString("desc", this.d));
            c(jSONObject.optString("coord", String.valueOf(this.i)));
            i(jSONObject.optString("mcell", this.n));
            a(jSONObject.optBoolean("isReversegeo", this.e));
            f(jSONObject.optString("geoLanguage", this.f));
            if (fy.a(jSONObject, "poiid")) {
                setBuildingId(jSONObject.optString("poiid"));
            }
            if (fy.a(jSONObject, MspDBHelper.BizEntry.COLUMN_NAME_PID)) {
                setBuildingId(jSONObject.optString(MspDBHelper.BizEntry.COLUMN_NAME_PID));
            }
            if (fy.a(jSONObject, pg1.ATOM_EXT_floor)) {
                setFloor(jSONObject.optString(pg1.ATOM_EXT_floor));
            }
            if (fy.a(jSONObject, "flr")) {
                setFloor(jSONObject.optString("flr"));
            }
        } catch (Throwable th) {
            fr.a(th, "AmapLoc", "AmapLoc");
        }
    }

    public final void a(JSONObject jSONObject) {
        this.m = jSONObject;
    }

    public final void a(boolean z) {
        this.e = z;
    }
}
