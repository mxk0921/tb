package com.taobao.unit.center.sync;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.sync.constant.SyncConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "curEnv", "lastEnv", "Ltb/xhv;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class LayoutSyncManager$checkSync$1 extends Lambda implements u1a<Integer, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ LayoutSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutSyncManager$checkSync$1(LayoutSyncManager layoutSyncManager) {
        super(2);
        this.this$0 = layoutSyncManager;
    }

    public static /* synthetic */ Object ipc$super(LayoutSyncManager$checkSync$1 layoutSyncManager$checkSync$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/sync/LayoutSyncManager$checkSync$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06fe99f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "layout reset for env change from " + i2 + " to " + i);
        LayoutSyncManager.access$getSyncable$p(this.this$0).updateLocalIncTimeStamp(0L);
    }
}
