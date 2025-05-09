package kotlinx.coroutines.channels;

import com.alibaba.wireless.security.SecExceptionCode;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import tb.ar4;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, SecExceptionCode.SEC_ERROR_INIT_CLAZZ_NULL_ERROR}, m = PromotionFilterBean.SINGLE, n = {"$this$consume$iv", pg1.ATOM_EXT_iterator, "$this$consume$iv", PromotionFilterBean.SINGLE}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ChannelsKt__DeprecatedKt$single$1<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$single$1(ar4<? super ChannelsKt__DeprecatedKt$single$1> ar4Var) {
        super(ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        p = ChannelsKt__DeprecatedKt.p(null, this);
        return p;
    }
}
