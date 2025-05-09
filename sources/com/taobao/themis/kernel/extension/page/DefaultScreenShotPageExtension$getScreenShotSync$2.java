package com.taobao.themis.kernel.extension.page;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultScreenShotPageExtension$getScreenShotSync$2 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CountDownLatch $latch;
    public final /* synthetic */ Ref$ObjectRef<Bitmap> $resultBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScreenShotPageExtension$getScreenShotSync$2(Ref$ObjectRef<Bitmap> ref$ObjectRef, CountDownLatch countDownLatch) {
        super(1);
        this.$resultBitmap = ref$ObjectRef;
        this.$latch = countDownLatch;
    }

    public static /* synthetic */ Object ipc$super(DefaultScreenShotPageExtension$getScreenShotSync$2 defaultScreenShotPageExtension$getScreenShotSync$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/DefaultScreenShotPageExtension$getScreenShotSync$2");
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
        TMSLogger.b("DefaultScreenShotPageExtension", ckf.p("getScreenShotSync Failed: ", Integer.valueOf(i)));
        this.$resultBitmap.element = null;
        this.$latch.countDown();
    }
}
