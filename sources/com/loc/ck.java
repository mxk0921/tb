package com.loc;

import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ck extends co {

    /* renamed from: a  reason: collision with root package name */
    private int f5629a = 30;
    private String b;

    public ck(String str, co coVar) {
        super(coVar);
        this.b = str;
    }

    private static int a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return 0;
            }
            return file.list().length;
        } catch (Throwable th) {
            av.b(th, "fus", "gfn");
            return 0;
        }
    }

    @Override // com.loc.co
    public final boolean a() {
        return a(this.b) >= this.f5629a;
    }
}
