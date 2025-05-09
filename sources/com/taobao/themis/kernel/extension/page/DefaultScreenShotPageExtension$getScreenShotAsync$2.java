package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.fnd;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultScreenShotPageExtension$getScreenShotAsync$2 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ fnd.b $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScreenShotPageExtension$getScreenShotAsync$2(fnd.b bVar) {
        super(1);
        this.$listener = bVar;
    }

    public static /* synthetic */ Object ipc$super(DefaultScreenShotPageExtension$getScreenShotAsync$2 defaultScreenShotPageExtension$getScreenShotAsync$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/DefaultScreenShotPageExtension$getScreenShotAsync$2");
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
        TMSLogger.b("DefaultScreenShotPageExtension", ckf.p("getScreenShotAsync Failed: ", Integer.valueOf(i)));
        this.$listener.a(null);
    }
}
