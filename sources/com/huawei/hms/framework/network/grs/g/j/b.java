package com.huawei.hms.framework.network.grs.g.j;

import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.g.d;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Future<d> f5353a;
    private final long b = SystemClock.elapsedRealtime();

    public b(Future<d> future) {
        this.f5353a = future;
    }

    public Future<d> a() {
        return this.f5353a;
    }

    public boolean b() {
        if (SystemClock.elapsedRealtime() - this.b <= 300000) {
            return true;
        }
        return false;
    }
}
