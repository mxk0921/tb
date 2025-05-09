package com.taobao.message.activity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LoadingChatActivity$onCreate$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $loadingStartTime;
    public final /* synthetic */ LoadingChatActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingChatActivity$onCreate$2(LoadingChatActivity loadingChatActivity, long j) {
        super(0);
        this.this$0 = loadingChatActivity;
        this.$loadingStartTime = j;
    }

    public static /* synthetic */ Object ipc$super(LoadingChatActivity$onCreate$2 loadingChatActivity$onCreate$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/activity/LoadingChatActivity$onCreate$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        RemoteMonitorUtil.INSTANCE.loadingDurationStat(System.currentTimeMillis() - this.$loadingStartTime, "chat");
        LoadingChatActivity.access$setLoading$p(this.this$0, false);
        if (!LoadingChatActivity.access$getEnterH5$p(this.this$0)) {
            this.this$0.navChat();
        }
    }
}
