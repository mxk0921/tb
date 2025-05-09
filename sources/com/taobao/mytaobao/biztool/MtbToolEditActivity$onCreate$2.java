package com.taobao.mytaobao.biztool;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "dstPosition", "Ltb/xhv;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbToolEditActivity$onCreate$2 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MtbToolEditActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbToolEditActivity$onCreate$2(MtbToolEditActivity mtbToolEditActivity) {
        super(1);
        this.this$0 = mtbToolEditActivity;
    }

    public static /* synthetic */ Object ipc$super(MtbToolEditActivity$onCreate$2 mtbToolEditActivity$onCreate$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/biztool/MtbToolEditActivity$onCreate$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else {
            MtbToolEditActivity.l3(this.this$0, i);
        }
    }
}
