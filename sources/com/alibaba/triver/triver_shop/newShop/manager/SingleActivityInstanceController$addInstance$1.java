package com.alibaba.triver.triver_shop.newShop.manager;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* JADX WARN: Incorrect field signature: TA; */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SingleActivityInstanceController$addInstance$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Activity $removeFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TA;)V */
    public SingleActivityInstanceController$addInstance$1(Activity activity) {
        super(0);
        this.$removeFirst = activity;
    }

    public static /* synthetic */ Object ipc$super(SingleActivityInstanceController$addInstance$1 singleActivityInstanceController$addInstance$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/manager/SingleActivityInstanceController$addInstance$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Activity activity = this.$removeFirst;
        if (activity != null) {
            activity.finish();
        }
    }
}
