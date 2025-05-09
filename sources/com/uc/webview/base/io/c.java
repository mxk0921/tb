package com.uc.webview.base.io;

import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final File f14274a;
    public final File b;
    private final File c;

    public c(File file, String str) {
        this(file, str, (byte) 0);
    }

    public final boolean a() {
        if (c()) {
            return true;
        }
        d.c("FlagMarker-mf", this.f14274a);
        return d.b("FlagMarker-mf", this.b);
    }

    public final boolean b() {
        d.c("FlagMarker-cl", this.b);
        d.c("FlagMarker-cl", this.f14274a);
        if (this.f14274a.exists() || this.b.exists()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (this.f14274a.exists() || !this.b.exists()) {
            return false;
        }
        File file = this.c;
        if (file == null || file.exists()) {
            return true;
        }
        return false;
    }

    private c(File file, String str, byte b) {
        this.f14274a = new File(file, str + "_s");
        this.b = new File(file, str + "_f");
        this.c = null;
    }
}
