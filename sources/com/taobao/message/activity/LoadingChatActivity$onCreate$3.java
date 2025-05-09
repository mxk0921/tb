package com.taobao.message.activity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "errorMsg", "Ltb/xhv;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LoadingChatActivity$onCreate$3 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LoadingChatActivity$onCreate$3 INSTANCE = new LoadingChatActivity$onCreate$3();

    public LoadingChatActivity$onCreate$3() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(LoadingChatActivity$onCreate$3 loadingChatActivity$onCreate$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/activity/LoadingChatActivity$onCreate$3");
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
        TLog.loge(LoadingChatActivity.TAG, "page loading error: ".concat(str));
    }
}
