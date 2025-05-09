package com.taobao.themis.ability.basic.prerender;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.jdb;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSClientPrerenderAbility$start$1 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ jdb $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSClientPrerenderAbility$start$1(jdb jdbVar) {
        super(1);
        this.$callback = jdbVar;
    }

    public static /* synthetic */ Object ipc$super(TMSClientPrerenderAbility$start$1 tMSClientPrerenderAbility$start$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/prerender/TMSClientPrerenderAbility$start$1");
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
        } else if (!z) {
            this.$callback.O(ErrorResult.a.g("start prerender failed"));
        }
    }
}
