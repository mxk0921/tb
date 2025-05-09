package com.loc;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ev {

    /* renamed from: a  reason: collision with root package name */
    ew f5682a = null;
    long b = 0;
    long c = 0;
    private boolean h = true;
    int d = 0;
    long e = 0;
    AMapLocation f = null;
    long g = 0;

    private ew b(ew ewVar) {
        int i;
        if (fy.a(ewVar)) {
            if (!this.h || !fq.a(ewVar.getTime())) {
                i = this.d;
            } else if (ewVar.getLocationType() == 5 || ewVar.getLocationType() == 6) {
                i = 4;
            }
            ewVar.setLocationType(i);
        }
        return ewVar;
    }

    public final AMapLocation a(AMapLocation aMapLocation) {
        if (!fy.a(aMapLocation)) {
            return aMapLocation;
        }
        long b = fy.b() - this.g;
        this.g = fy.b();
        if (b > 5000) {
            return aMapLocation;
        }
        AMapLocation aMapLocation2 = this.f;
        if (aMapLocation2 == null) {
            this.f = aMapLocation;
            return aMapLocation;
        } else if (1 != aMapLocation2.getLocationType() && !"gps".equalsIgnoreCase(this.f.getProvider())) {
            this.f = aMapLocation;
            return aMapLocation;
        } else if (this.f.getAltitude() == aMapLocation.getAltitude() && this.f.getLongitude() == aMapLocation.getLongitude()) {
            this.f = aMapLocation;
            return aMapLocation;
        } else {
            long abs = Math.abs(aMapLocation.getTime() - this.f.getTime());
            if (30000 < abs) {
                this.f = aMapLocation;
                return aMapLocation;
            } else if (fy.a(aMapLocation, this.f) > (((this.f.getSpeed() + aMapLocation.getSpeed()) * ((float) abs)) / 2000.0f) + ((this.f.getAccuracy() + aMapLocation.getAccuracy()) * 2.0f) + 3000.0f) {
                return this.f;
            } else {
                this.f = aMapLocation;
                return aMapLocation;
            }
        }
    }

    public final ew a(ew ewVar) {
        if (fy.b() - this.e > 30000) {
            this.f5682a = ewVar;
            this.e = fy.b();
            return this.f5682a;
        }
        this.e = fy.b();
        if (!fy.a(this.f5682a) || !fy.a(ewVar)) {
            this.b = fy.b();
            this.f5682a = ewVar;
            return ewVar;
        } else if (ewVar.getTime() == this.f5682a.getTime() && ewVar.getAccuracy() < 300.0f) {
            return ewVar;
        } else {
            if ("gps".equals(ewVar.getProvider())) {
                this.b = fy.b();
                this.f5682a = ewVar;
                return ewVar;
            } else if (ewVar.c() != this.f5682a.c()) {
                this.b = fy.b();
                this.f5682a = ewVar;
                return ewVar;
            } else if (ewVar.getBuildingId() == null || ewVar.getBuildingId().equals(this.f5682a.getBuildingId()) || TextUtils.isEmpty(ewVar.getBuildingId())) {
                this.d = ewVar.getLocationType();
                float a2 = fy.a(ewVar, this.f5682a);
                float accuracy = this.f5682a.getAccuracy();
                float accuracy2 = ewVar.getAccuracy();
                float f = accuracy2 - accuracy;
                long b = fy.b();
                long j = b - this.b;
                boolean z = false;
                boolean z2 = accuracy <= 100.0f && accuracy2 > 299.0f;
                int i = (accuracy > 299.0f ? 1 : (accuracy == 299.0f ? 0 : -1));
                if (i > 0 && accuracy2 > 299.0f) {
                    z = true;
                }
                if (z2 || z) {
                    long j2 = this.c;
                    if (j2 == 0) {
                        this.c = b;
                    } else if (b - j2 > 30000) {
                        this.b = b;
                        this.f5682a = ewVar;
                        this.c = 0L;
                        return ewVar;
                    }
                    ew b2 = b(this.f5682a);
                    this.f5682a = b2;
                    return b2;
                } else if (accuracy2 >= 100.0f || i <= 0) {
                    if (accuracy2 <= 299.0f) {
                        this.c = 0L;
                    }
                    if (a2 >= 10.0f || a2 <= 0.1d || accuracy2 <= 5.0f) {
                        if (f < 300.0f) {
                            this.b = fy.b();
                            this.f5682a = ewVar;
                            return ewVar;
                        } else if (j >= 30000) {
                            this.b = fy.b();
                            this.f5682a = ewVar;
                            return ewVar;
                        } else {
                            ew b3 = b(this.f5682a);
                            this.f5682a = b3;
                            return b3;
                        }
                    } else if (f >= -300.0f) {
                        ew b4 = b(this.f5682a);
                        this.f5682a = b4;
                        return b4;
                    } else if (accuracy / accuracy2 >= 2.0f) {
                        this.b = b;
                        this.f5682a = ewVar;
                        return ewVar;
                    } else {
                        ew b5 = b(this.f5682a);
                        this.f5682a = b5;
                        return b5;
                    }
                } else {
                    this.b = b;
                    this.f5682a = ewVar;
                    this.c = 0L;
                    return ewVar;
                }
            } else {
                this.b = fy.b();
                this.f5682a = ewVar;
                return ewVar;
            }
        }
    }

    public final void a() {
        this.f5682a = null;
        this.b = 0L;
        this.c = 0L;
        this.f = null;
        this.g = 0L;
    }

    public final void a(boolean z) {
        this.h = z;
    }
}
