package com.taobao.android.dressup.common.prefetch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.j7j;
import tb.tpu;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "<anonymous parameter 0>", "Ltb/j7j;", "<anonymous parameter 1>", "Ltb/xhv;", "invoke", "(Ljava/util/Map;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpMtopRequest$requestDetailMtop$1 extends Lambda implements u1a<Map<String, ? extends Object>, j7j, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DressUpMtopRequest$requestDetailMtop$1 INSTANCE = new DressUpMtopRequest$requestDetailMtop$1();

    public DressUpMtopRequest$requestDetailMtop$1() {
        super(2);
    }

    public static /* synthetic */ Object ipc$super(DressUpMtopRequest$requestDetailMtop$1 dressUpMtopRequest$requestDetailMtop$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/prefetch/DressUpMtopRequest$requestDetailMtop$1");
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
        ckf.g(map, "<anonymous parameter 0>");
        ckf.g(j7jVar, "<anonymous parameter 1>");
        tpu.a.b(tpu.Companion, "DataService", "prefetchDetailMtop success", null, 4, null);
    }
}
