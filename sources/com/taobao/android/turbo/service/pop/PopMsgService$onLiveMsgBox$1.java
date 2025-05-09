package com.taobao.android.turbo.service.pop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.turbo.base.service.pop.PopType;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.cgm;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/cgm;", AdvanceSetting.NETWORK_TYPE, "", "invoke", "(Ltb/cgm;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PopMsgService$onLiveMsgBox$1 extends Lambda implements g1a<cgm, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PopMsgService$onLiveMsgBox$1 INSTANCE = new PopMsgService$onLiveMsgBox$1();

    public PopMsgService$onLiveMsgBox$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(PopMsgService$onLiveMsgBox$1 popMsgService$onLiveMsgBox$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/pop/PopMsgService$onLiveMsgBox$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(cgm cgmVar) {
        return Boolean.valueOf(invoke2(cgmVar));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(cgm cgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abddfd30", new Object[]{this, cgmVar})).booleanValue();
        }
        ckf.g(cgmVar, AdvanceSetting.NETWORK_TYPE);
        return cgmVar.c() == PopType.POP_LIVE;
    }
}
