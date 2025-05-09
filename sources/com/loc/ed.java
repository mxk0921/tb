package com.loc;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ed extends dz implements Serializable {
    public int j = 0;
    public int k = 0;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;

    public ed() {
    }

    @Override // com.loc.dz
    /* renamed from: a */
    public final dz clone() {
        ed edVar = new ed(this.h, this.i);
        edVar.a(this);
        edVar.j = this.j;
        edVar.k = this.k;
        edVar.l = this.l;
        edVar.m = this.m;
        return edVar;
    }

    @Override // com.loc.dz
    public final String toString() {
        return "AmapCellWcdma{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", uarfcn=" + this.m + ", mcc='" + this.f5660a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public ed(boolean z, boolean z2) {
        super(z, z2);
    }
}
