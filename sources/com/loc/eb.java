package com.loc;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class eb extends dz implements Serializable {
    public int j = 0;
    public int k = 0;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public int n = Integer.MAX_VALUE;
    public int o = Integer.MAX_VALUE;

    public eb() {
    }

    @Override // com.loc.dz
    /* renamed from: a */
    public final dz clone() {
        eb ebVar = new eb(this.h, this.i);
        ebVar.a(this);
        ebVar.j = this.j;
        ebVar.k = this.k;
        ebVar.l = this.l;
        ebVar.m = this.m;
        ebVar.n = this.n;
        ebVar.o = this.o;
        return ebVar;
    }

    @Override // com.loc.dz
    public final String toString() {
        return "AmapCellGsm{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", arfcn=" + this.m + ", bsic=" + this.n + ", timingAdvance=" + this.o + ", mcc='" + this.f5660a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public eb(boolean z, boolean z2) {
        super(z, z2);
    }
}
