package com.taobao.android.turbo.service.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.j7j;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", Constants.SEND_TYPE_RES, "Ltb/j7j;", "statistics", "Ltb/xhv;", "invoke", "(Ljava/util/Map;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DataService$requestPageDataInternal$1 extends Lambda implements u1a<Map<String, ? extends Object>, j7j, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DataService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataService$requestPageDataInternal$1(DataService dataService) {
        super(2);
        this.this$0 = dataService;
    }

    public static /* synthetic */ Object ipc$super(DataService$requestPageDataInternal$1 dataService$requestPageDataInternal$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/data/DataService$requestPageDataInternal$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map, j7j j7jVar) {
        invoke2(map, j7jVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245731b4", new Object[]{this, map, j7jVar});
            return;
        }
        ckf.g(map, Constants.SEND_TYPE_RES);
        ckf.g(j7jVar, "statistics");
        DataService dataService = this.this$0;
        DataService.M1(dataService, false);
        DataService.K1(dataService, map, j7jVar);
    }
}
