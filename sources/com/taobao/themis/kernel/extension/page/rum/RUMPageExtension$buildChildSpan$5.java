package com.taobao.themis.kernel.extension.page.rum;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.tsq;
import tb.u1a;
import tb.uy8;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "key", "", "value", "Ltb/xhv;", "invoke", "(Ljava/lang/String;J)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class RUMPageExtension$buildChildSpan$5 extends Lambda implements u1a<String, Long, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $stageTime;
    public final /* synthetic */ uy8 $startLoadActionSpan;
    public final /* synthetic */ RUMPageExtension this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RUMPageExtension$buildChildSpan$5(uy8 uy8Var, long j, RUMPageExtension rUMPageExtension) {
        super(2);
        this.$startLoadActionSpan = uy8Var;
        this.$stageTime = j;
        this.this$0 = rUMPageExtension;
    }

    public static /* synthetic */ Object ipc$super(RUMPageExtension$buildChildSpan$5 rUMPageExtension$buildChildSpan$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/rum/RUMPageExtension$buildChildSpan$5");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, Long l) {
        invoke(str, l.longValue());
        return xhv.INSTANCE;
    }

    public final void invoke(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5588c2db", new Object[]{this, str, new Long(j)});
            return;
        }
        ckf.g(str, "key");
        if (tsq.I(str, "H5_JST", false, 2, null)) {
            this.$startLoadActionSpan.f(str, Long.valueOf(this.$stageTime + j));
        }
        if (RUMPageExtension.d(this.this$0).contains(str)) {
            this.$startLoadActionSpan.f(str, Long.valueOf(j + this.$stageTime));
        }
    }
}
