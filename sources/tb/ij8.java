package tb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ij8 {
    public static final ExecutorService e = Executors.newCachedThreadPool();
    public boolean c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21342a = true;
    public boolean b = true;
    public final ExecutorService d = e;

    public hj8 a() {
        return new hj8(this);
    }

    public ij8 b(boolean z) {
        this.b = z;
        return this;
    }

    public ij8 c(boolean z) {
        this.f21342a = z;
        return this;
    }

    public ij8 d(boolean z) {
        this.c = z;
        return this;
    }
}
