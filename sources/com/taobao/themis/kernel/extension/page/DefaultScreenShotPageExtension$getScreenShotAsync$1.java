package com.taobao.themis.kernel.extension.page;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.fnd;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public /* synthetic */ class DefaultScreenShotPageExtension$getScreenShotAsync$1 extends FunctionReferenceImpl implements g1a<Bitmap, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DefaultScreenShotPageExtension$getScreenShotAsync$1(Object obj) {
        super(1, obj, fnd.b.class, "onScreenShot", "onScreenShot(Landroid/graphics/Bitmap;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(DefaultScreenShotPageExtension$getScreenShotAsync$1 defaultScreenShotPageExtension$getScreenShotAsync$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/DefaultScreenShotPageExtension$getScreenShotAsync$1");
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
        } else {
            ((fnd.b) this.receiver).a(bitmap);
        }
    }
}
