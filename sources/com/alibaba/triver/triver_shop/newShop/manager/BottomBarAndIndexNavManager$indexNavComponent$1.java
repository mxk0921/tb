package com.alibaba.triver.triver_shop.newShop.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.si2;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BottomBarAndIndexNavManager$indexNavComponent$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ si2 this$0;

    public BottomBarAndIndexNavManager$indexNavComponent$1(si2 si2Var) {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(BottomBarAndIndexNavManager$indexNavComponent$1 bottomBarAndIndexNavManager$indexNavComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/manager/BottomBarAndIndexNavManager$indexNavComponent$1");
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
            return;
        }
        int j = si2.b(null).j(si2.a(null), i);
        u1a c = si2.c(null);
        if (c != null) {
            c.invoke(Integer.valueOf(j), Boolean.TRUE);
        }
        si2.d(null, i);
    }
}
