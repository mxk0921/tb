package com.loc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cf extends ci {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f5627a = new StringBuilder();
    private boolean b = true;

    public cf() {
    }

    @Override // com.loc.ci
    public final byte[] a(byte[] bArr) {
        byte[] a2 = x.a(this.f5627a.toString());
        this.d = a2;
        this.b = true;
        StringBuilder sb = this.f5627a;
        sb.delete(0, sb.length());
        return a2;
    }

    @Override // com.loc.ci
    public final void b(byte[] bArr) {
        String a2 = x.a(bArr);
        if (this.b) {
            this.b = false;
        } else {
            this.f5627a.append(",");
        }
        StringBuilder sb = this.f5627a;
        sb.append("{\"log\":\"");
        sb.append(a2);
        sb.append("\"}");
    }

    public cf(ci ciVar) {
        super(ciVar);
    }
}
