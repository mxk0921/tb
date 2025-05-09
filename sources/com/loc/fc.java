package com.loc;

import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.Objects;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fc {

    /* renamed from: a  reason: collision with root package name */
    public int f5693a = 0;
    public double b = vu3.b.GEO_NOT_SUPPORT;
    public double c = vu3.b.GEO_NOT_SUPPORT;
    public long d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 63;
    public int h = 0;

    public final String a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("time", this.d);
            jSONObject.put("lon", this.c);
            jSONObject.put(DispatchConstants.LATITUDE, this.b);
            jSONObject.put("radius", this.e);
            jSONObject.put("locationType", this.f5693a);
            jSONObject.put("reType", this.g);
            jSONObject.put("reSubType", this.h);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fc.class == obj.getClass()) {
            fc fcVar = (fc) obj;
            if (this.f5693a == fcVar.f5693a && Double.compare(fcVar.b, this.b) == 0 && Double.compare(fcVar.c, this.c) == 0 && this.d == fcVar.d && this.e == fcVar.e && this.f == fcVar.f && this.g == fcVar.g && this.h == fcVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5693a), Double.valueOf(this.b), Double.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.b = jSONObject.optDouble(DispatchConstants.LATITUDE, this.b);
            this.c = jSONObject.optDouble("lon", this.c);
            this.f5693a = jSONObject.optInt("locationType", this.f5693a);
            this.g = jSONObject.optInt("reType", this.g);
            this.h = jSONObject.optInt("reSubType", this.h);
            this.e = jSONObject.optInt("radius", this.e);
            this.d = jSONObject.optLong("time", this.d);
        } catch (Throwable th) {
            fr.a(th, "CoreUtil", "transformLocation");
        }
    }
}
