package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.y1a;
import tb.y7a;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public /* synthetic */ class LiveDetailResponseData$conventionList$2 extends FunctionReferenceImpl implements y1a<Object, String, KMPJsonObject, String, List<? extends ConventionList>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LiveDetailResponseData$conventionList$2 INSTANCE = new LiveDetailResponseData$conventionList$2();

    public LiveDetailResponseData$conventionList$2() {
        super(4, y7a.class, "getPropertyByKey", "getPropertyByKey(Ljava/lang/Object;Ljava/lang/String;Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;Ljava/lang/String;)Ljava/lang/Object;", 1);
    }

    public static /* synthetic */ Object ipc$super(LiveDetailResponseData$conventionList$2 liveDetailResponseData$conventionList$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveDetailResponseData$conventionList$2");
    }

    public final List<ConventionList> invoke(Object obj, String str, KMPJsonObject kMPJsonObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9418543a", new Object[]{this, obj, str, kMPJsonObject, str2});
        }
        ckf.g(str, p1.d);
        ckf.g(str2, "p3");
        return (List) y7a.a(obj, str, kMPJsonObject, str2);
    }
}
