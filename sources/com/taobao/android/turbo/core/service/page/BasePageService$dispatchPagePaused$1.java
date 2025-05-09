package com.taobao.android.turbo.core.service.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.p6d;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/p6d;", "observer", "Ltb/xhv;", "invoke", "(Ltb/p6d;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BasePageService$dispatchPagePaused$1 extends Lambda implements g1a<p6d, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BasePageService$dispatchPagePaused$1 INSTANCE = new BasePageService$dispatchPagePaused$1();

    public BasePageService$dispatchPagePaused$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(BasePageService$dispatchPagePaused$1 basePageService$dispatchPagePaused$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/page/BasePageService$dispatchPagePaused$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(p6d p6dVar) {
        invoke2(p6dVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(p6d p6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ccd1b6", new Object[]{this, p6dVar});
            return;
        }
        ckf.g(p6dVar, "observer");
        p6dVar.onPagePause();
    }
}
