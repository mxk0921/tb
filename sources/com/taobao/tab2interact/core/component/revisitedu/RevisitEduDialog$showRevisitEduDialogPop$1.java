package com.taobao.tab2interact.core.component.revisitedu;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.tab2interact.core.component.revisitedu.RevisitEduDialog;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.vgh;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RevisitEduDialog$showRevisitEduDialogPop$1 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RevisitEduDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevisitEduDialog$showRevisitEduDialogPop$1(RevisitEduDialog revisitEduDialog) {
        super(1);
        this.this$0 = revisitEduDialog;
    }

    public static /* synthetic */ Object ipc$super(RevisitEduDialog$showRevisitEduDialogPop$1 revisitEduDialog$showRevisitEduDialogPop$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/revisitedu/RevisitEduDialog$showRevisitEduDialogPop$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
            return;
        }
        ckf.g(map, AdvanceSetting.NETWORK_TYPE);
        vgh.c(this.this$0, "RevisitEduDialog", "展示回访教育弹窗Pop，收到隐藏回调");
        for (RevisitEduDialog.b bVar : RevisitEduDialog.d(this.this$0)) {
            bVar.c();
        }
    }
}
