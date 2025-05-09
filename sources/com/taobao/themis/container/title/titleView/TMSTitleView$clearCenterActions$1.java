package com.taobao.themis.container.title.titleView;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a90;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/a90;", AdvanceSetting.NETWORK_TYPE, "", "invoke", "(Ltb/a90;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTitleView$clearCenterActions$1 extends Lambda implements g1a<a90, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSTitleView$clearCenterActions$1 INSTANCE = new TMSTitleView$clearCenterActions$1();

    public TMSTitleView$clearCenterActions$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(TMSTitleView$clearCenterActions$1 tMSTitleView$clearCenterActions$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/title/titleView/TMSTitleView$clearCenterActions$1");
    }

    public final Boolean invoke(a90 a90Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("2003c906", new Object[]{this, a90Var});
        }
        ckf.g(a90Var, AdvanceSetting.NETWORK_TYPE);
        if (a90Var.j() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
