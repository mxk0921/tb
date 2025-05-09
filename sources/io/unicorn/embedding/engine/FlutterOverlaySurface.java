package io.unicorn.embedding.engine;

import android.view.Surface;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    static {
        t2o.a(945815690);
    }

    public FlutterOverlaySurface(int i, Surface surface) {
        this.id = i;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
