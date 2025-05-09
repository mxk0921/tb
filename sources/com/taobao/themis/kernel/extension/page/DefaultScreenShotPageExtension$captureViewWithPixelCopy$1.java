package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultScreenShotPageExtension$captureViewWithPixelCopy$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DefaultScreenShotPageExtension$captureViewWithPixelCopy$1 INSTANCE = new DefaultScreenShotPageExtension$captureViewWithPixelCopy$1();

    public DefaultScreenShotPageExtension$captureViewWithPixelCopy$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(DefaultScreenShotPageExtension$captureViewWithPixelCopy$1 defaultScreenShotPageExtension$captureViewWithPixelCopy$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/DefaultScreenShotPageExtension$captureViewWithPixelCopy$1");
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
        } else {
            TMSLogger.b("PixelCopy", ckf.p("Failed: ", Integer.valueOf(i)));
        }
    }
}
