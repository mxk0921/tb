package com.etao.feimagesearch.immerse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.gnf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpManager$widgetEventBus$2 extends Lambda implements d1a<gnf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final IrpManager$widgetEventBus$2 INSTANCE = new IrpManager$widgetEventBus$2();

    public IrpManager$widgetEventBus$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(IrpManager$widgetEventBus$2 irpManager$widgetEventBus$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/immerse/IrpManager$widgetEventBus$2");
    }

    @Override // tb.d1a
    public final gnf invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gnf) ipChange.ipc$dispatch("177bd54b", new Object[]{this}) : new gnf();
    }
}
