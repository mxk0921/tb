package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class Tab3LiveContentRender$doLiveRoomInit$2 extends FunctionReferenceImpl implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Tab3LiveContentRender$doLiveRoomInit$2(Tab3LiveContentRender tab3LiveContentRender) {
        super(1, tab3LiveContentRender, Tab3LiveContentRender.class, "updateFollowStateToLive", "updateFollowStateToLive(Z)V", 0);
    }

    public static /* synthetic */ Object ipc$super(Tab3LiveContentRender$doLiveRoomInit$2 tab3LiveContentRender$doLiveRoomInit$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$doLiveRoomInit$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else {
            Tab3LiveContentRender.B((Tab3LiveContentRender) this.receiver, z);
        }
    }
}
