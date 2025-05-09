package com.loc;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ea extends dz implements Serializable {
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m;
    public int n;

    public ea() {
    }

    @Override // com.loc.dz
    /* renamed from: a */
    public final dz clone() {
        ea eaVar = new ea(this.h, this.i);
        eaVar.a(this);
        eaVar.j = this.j;
        eaVar.k = this.k;
        eaVar.l = this.l;
        eaVar.m = this.m;
        eaVar.n = this.n;
        return eaVar;
    }

    @Override // com.loc.dz
    public final String toString() {
        return "AmapCellCdma{sid=" + this.j + ", nid=" + this.k + ", bid=" + this.l + ", latitude=" + this.m + ", longitude=" + this.n + ", mcc='" + this.f5660a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public ea(boolean z, boolean z2) {
        super(z, z2);
    }
}
