package com.taobao.android.dressup.common.prefetch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.j7j;
import tb.tpu;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "Ltb/j7j;", "<anonymous parameter 2>", "Ltb/xhv;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpMtopRequest$requestDetailMtop$2 extends Lambda implements w1a<String, String, j7j, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DressUpMtopRequest$requestDetailMtop$2 INSTANCE = new DressUpMtopRequest$requestDetailMtop$2();

    public DressUpMtopRequest$requestDetailMtop$2() {
        super(3);
    }

    public static /* synthetic */ Object ipc$super(DressUpMtopRequest$requestDetailMtop$2 dressUpMtopRequest$requestDetailMtop$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/prefetch/DressUpMtopRequest$requestDetailMtop$2");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, String str2, j7j j7jVar) {
        invoke2(str, str2, j7jVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b63ba7", new Object[]{this, str, str2, j7jVar});
            return;
        }
        ckf.g(str, "<anonymous parameter 0>");
        ckf.g(str2, "<anonymous parameter 1>");
        ckf.g(j7jVar, "<anonymous parameter 2>");
        tpu.a.b(tpu.Companion, "DataService", "prefetchDetailMtop error", null, 4, null);
    }
}
