package com.taobao.message.conversation;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CompatMessageTabHost$onCreate$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CompatMessageTabHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatMessageTabHost$onCreate$1(CompatMessageTabHost compatMessageTabHost) {
        super(0);
        this.this$0 = compatMessageTabHost;
    }

    public static /* synthetic */ Object ipc$super(CompatMessageTabHost$onCreate$1 compatMessageTabHost$onCreate$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/conversation/CompatMessageTabHost$onCreate$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        try {
            CompatMessageTabHost.access$createHost(this.this$0, false);
        } catch (Throwable th) {
            TLog.loge(BundleSplitUtil.TAG, Log.getStackTraceString(th));
        }
    }
}
