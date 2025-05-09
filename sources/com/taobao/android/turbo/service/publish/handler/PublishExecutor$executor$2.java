package com.taobao.android.turbo.service.publish.handler;

import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.j7j;
import tb.jk;
import tb.tpu;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", jk.KEY_RET_CODE, jk.KEY_RET_MSG, "Ltb/j7j;", "<anonymous parameter 2>", "Ltb/xhv;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PublishExecutor$executor$2 extends Lambda implements w1a<String, String, j7j, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PublishExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishExecutor$executor$2(PublishExecutor publishExecutor) {
        super(3);
        this.this$0 = publishExecutor;
    }

    public static /* synthetic */ Object ipc$super(PublishExecutor$executor$2 publishExecutor$executor$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/publish/handler/PublishExecutor$executor$2");
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
        ckf.g(str, jk.KEY_RET_CODE);
        ckf.g(str2, jk.KEY_RET_MSG);
        ckf.g(j7jVar, "<anonymous parameter 2>");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "PublishExecutor", "执行发布，接口请求失败，retCode=" + str + "，retMsg=" + str2, null, 4, null);
        Toast.makeText(PublishExecutor.b(this.this$0), "网络异常, 请稍后重试", 0).show();
    }
}
