package com.taobao.themis.ability.basic.container;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ContainerTabSwitchDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.xhv;
import tb.zqb;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "targetIndex", "", "fromUrl", "Ltb/xhv;", "invoke", "(ILjava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSContainerAbility$addTabSwitchListener$1 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ zqb $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSContainerAbility$addTabSwitchListener$1(zqb zqbVar) {
        super(2);
        this.$callback = zqbVar;
    }

    public static /* synthetic */ Object ipc$super(TMSContainerAbility$addTabSwitchListener$1 tMSContainerAbility$addTabSwitchListener$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/container/TMSContainerAbility$addTabSwitchListener$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return xhv.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
            return;
        }
        ContainerTabSwitchDetail containerTabSwitchDetail = new ContainerTabSwitchDetail();
        containerTabSwitchDetail.result = Integer.valueOf(i);
        containerTabSwitchDetail.index = Integer.valueOf(i);
        containerTabSwitchDetail.fromURL = str;
        this.$callback.x1(containerTabSwitchDetail);
    }
}
