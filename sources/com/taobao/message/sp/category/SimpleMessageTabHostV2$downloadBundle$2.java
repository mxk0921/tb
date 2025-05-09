package com.taobao.message.sp.category;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "errorMsg", "Ltb/xhv;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleMessageTabHostV2$downloadBundle$2 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a $onError;
    public final /* synthetic */ SimpleMessageTabHostV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleMessageTabHostV2$downloadBundle$2(SimpleMessageTabHostV2 simpleMessageTabHostV2, g1a g1aVar) {
        super(1);
        this.this$0 = simpleMessageTabHostV2;
        this.$onError = g1aVar;
    }

    public static /* synthetic */ Object ipc$super(SimpleMessageTabHostV2$downloadBundle$2 simpleMessageTabHostV2$downloadBundle$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/SimpleMessageTabHostV2$downloadBundle$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
            return;
        }
        ckf.h(str, "errorMsg");
        SimpleMessageTabHostV2.access$setLoading$p(this.this$0, false);
        TLog.loge(BundleSplitUtil.TAG, "checkMsgBundleReady error: ".concat(str));
        g1a g1aVar = this.$onError;
        if (g1aVar != null) {
            xhv xhvVar = (xhv) g1aVar.invoke(str);
        }
    }
}
