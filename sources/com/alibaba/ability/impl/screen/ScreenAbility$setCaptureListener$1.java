package com.alibaba.ability.impl.screen;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bnd;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ScreenAbility$setCaptureListener$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ bnd $events;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenAbility$setCaptureListener$1(bnd bndVar) {
        super(0);
        this.$events = bndVar;
    }

    public static /* synthetic */ Object ipc$super(ScreenAbility$setCaptureListener$1 screenAbility$setCaptureListener$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/screen/ScreenAbility$setCaptureListener$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.$events.W();
        }
    }
}
