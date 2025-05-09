package com.flybird.deploy;

import android.os.ConditionVariable;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.a;
import tb.y0a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b implements y0a<a.b, Void, Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.b[] f4994a;
    public final /* synthetic */ ConditionVariable b;
    public final /* synthetic */ Throwable[] c;

    public b(a.b[] bVarArr, ConditionVariable conditionVariable, Throwable[] thArr) {
        this.f4994a = bVarArr;
        this.b = conditionVariable;
        this.c = thArr;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Void, java.lang.Object] */
    @Override // tb.y0a
    public Void apply(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7a74adc1", new Object[]{this, bVar});
        }
        this.f4994a[0] = bVar;
        this.b.open();
        return null;
    }

    @Override // tb.y0a
    public void error(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25621cab", new Object[]{this, th});
            return;
        }
        this.c[0] = th;
        this.b.open();
    }
}
