package com.taobao.android.turbo.service.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.turbo.model.PageModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.eyb;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/eyb;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/eyb;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DataService$notifyPageDataLoaded$1 extends Lambda implements g1a<eyb, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PageModel $pageModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataService$notifyPageDataLoaded$1(PageModel pageModel) {
        super(1);
        this.$pageModel = pageModel;
    }

    public static /* synthetic */ Object ipc$super(DataService$notifyPageDataLoaded$1 dataService$notifyPageDataLoaded$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/data/DataService$notifyPageDataLoaded$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(eyb eybVar) {
        invoke2(eybVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(eyb eybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc277cad", new Object[]{this, eybVar});
            return;
        }
        ckf.g(eybVar, AdvanceSetting.NETWORK_TYPE);
        eybVar.B(this.$pageModel);
    }
}
