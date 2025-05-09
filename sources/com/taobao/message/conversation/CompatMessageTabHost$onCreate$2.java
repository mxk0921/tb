package com.taobao.message.conversation;

import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "errorMsg", "Ltb/xhv;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CompatMessageTabHost$onCreate$2 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CompatMessageTabHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatMessageTabHost$onCreate$2(CompatMessageTabHost compatMessageTabHost) {
        super(1);
        this.this$0 = compatMessageTabHost;
    }

    public static /* synthetic */ Object ipc$super(CompatMessageTabHost$onCreate$2 compatMessageTabHost$onCreate$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/conversation/CompatMessageTabHost$onCreate$2");
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
        RemoteMonitorUtil.INSTANCE.remoteLoadFailCount("category", str);
        IErrorViewService iErrorViewService = (IErrorViewService) GlobalContainer.getInstance().get(IErrorViewService.class);
        if (iErrorViewService != null) {
            CompatMessageTabHost compatMessageTabHost = this.this$0;
            FragmentActivity access$getMActivity$p = CompatMessageTabHost.access$getMActivity$p(compatMessageTabHost);
            if (access$getMActivity$p != null) {
                CompatMessageTabHost.access$replaceContentView(compatMessageTabHost, iErrorViewService.getErrorView(access$getMActivity$p, DisplayUtil.localizedString(R.string.mp_download_timeout), DisplayUtil.localizedString(R.string.mp_don_t_worry_try_to_reload), DisplayUtil.localizedString(R.string.mp_refresh), 0, new CompatMessageTabHost$onCreate$2$$special$$inlined$let$lambda$1(this)));
            } else {
                ckf.s();
                throw null;
            }
        }
    }
}
