package com.taobao.android.turbo.core.service.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.k7d;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/k7d;", "observer", "Ltb/xhv;", "invoke", "(Ltb/k7d;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BasePageService$updatePageUrl$1 extends Lambda implements g1a<k7d, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Map $query;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePageService$updatePageUrl$1(String str, Map map) {
        super(1);
        this.$url = str;
        this.$query = map;
    }

    public static /* synthetic */ Object ipc$super(BasePageService$updatePageUrl$1 basePageService$updatePageUrl$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/page/BasePageService$updatePageUrl$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(k7d k7dVar) {
        invoke2(k7dVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(k7d k7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f14677", new Object[]{this, k7dVar});
            return;
        }
        ckf.g(k7dVar, "observer");
        k7dVar.onUrlChanged(this.$url, this.$query);
    }
}
