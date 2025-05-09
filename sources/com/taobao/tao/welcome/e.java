package com.taobao.tao.welcome;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a.d f12893a;
    public final Activity b;

    static {
        t2o.a(734003236);
    }

    public e(Activity activity, a.d dVar) {
        if (activity == null || dVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = activity;
        this.f12893a = dVar;
    }

    public abstract void a();
}
