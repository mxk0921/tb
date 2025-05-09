package com.taobao.android.turbo.core.service.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d7d;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/d7d;", "observer", "Ltb/xhv;", "invoke", "(Ltb/d7d;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BasePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1 extends Lambda implements g1a<d7d, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BasePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1 INSTANCE = new BasePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1();

    public BasePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(BasePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1 basePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/page/BasePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(d7d d7dVar) {
        invoke2(d7dVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(d7d d7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1f64b9", new Object[]{this, d7dVar});
            return;
        }
        ckf.g(d7dVar, "observer");
        d7dVar.a();
    }
}
