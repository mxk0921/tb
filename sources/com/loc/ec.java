package com.loc;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ec extends dz implements Serializable {
    public int j = 0;
    public int k = 0;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public int n = Integer.MAX_VALUE;

    public ec() {
    }

    @Override // com.loc.dz
    /* renamed from: a */
    public final dz clone() {
        ec ecVar = new ec(this.h);
        ecVar.a(this);
        ecVar.j = this.j;
        ecVar.k = this.k;
        ecVar.l = this.l;
        ecVar.m = this.m;
        ecVar.n = this.n;
        return ecVar;
    }

    @Override // com.loc.dz
    public final String toString() {
        return "AmapCellLte{tac=" + this.j + ", ci=" + this.k + ", pci=" + this.l + ", earfcn=" + this.m + ", timingAdvance=" + this.n + ", mcc='" + this.f5660a + "', mnc='" + this.b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + '}';
    }

    public ec(boolean z) {
        super(z, true);
    }
}
