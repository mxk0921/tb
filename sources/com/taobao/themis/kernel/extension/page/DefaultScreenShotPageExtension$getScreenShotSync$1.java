package com.taobao.themis.kernel.extension.page;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DefaultScreenShotPageExtension$getScreenShotSync$1 extends Lambda implements g1a<Bitmap, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CountDownLatch $latch;
    public final /* synthetic */ Ref$ObjectRef<Bitmap> $resultBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScreenShotPageExtension$getScreenShotSync$1(Ref$ObjectRef<Bitmap> ref$ObjectRef, CountDownLatch countDownLatch) {
        super(1);
        this.$resultBitmap = ref$ObjectRef;
        this.$latch = countDownLatch;
    }

    public static /* synthetic */ Object ipc$super(DefaultScreenShotPageExtension$getScreenShotSync$1 defaultScreenShotPageExtension$getScreenShotSync$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/DefaultScreenShotPageExtension$getScreenShotSync$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda89a0f", new Object[]{this, bitmap});
            return;
        }
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        this.$resultBitmap.element = bitmap;
        this.$latch.countDown();
    }
}
