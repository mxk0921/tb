package com.taobao.android.dressup.common.service.dresslist;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.e1c;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/e1c;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/e1c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpHostService$onScrollStateChanged$1 extends Lambda implements g1a<e1c, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $newState;
    public final /* synthetic */ ViewGroup $p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DressUpHostService$onScrollStateChanged$1(ViewGroup viewGroup, int i) {
        super(1);
        this.$p0 = viewGroup;
        this.$newState = i;
    }

    public static /* synthetic */ Object ipc$super(DressUpHostService$onScrollStateChanged$1 dressUpHostService$onScrollStateChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dresslist/DressUpHostService$onScrollStateChanged$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(e1c e1cVar) {
        invoke2(e1cVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(e1c e1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664bdd20", new Object[]{this, e1cVar});
            return;
        }
        ckf.g(e1cVar, AdvanceSetting.NETWORK_TYPE);
        e1cVar.onScrollStateChanged(this.$p0, this.$newState);
    }
}
