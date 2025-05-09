package com.taobao.android.nanocompose.foundation.components.async_image;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;
import tb.zbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public /* synthetic */ class AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1 extends FunctionReferenceImpl implements d1a<zbn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1 INSTANCE = new AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1();

    public AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1() {
        super(0, zbn.class, "<init>", "<init>()V", 0);
    }

    public static /* synthetic */ Object ipc$super(AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1 asyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/async_image/AsyncImageDefinesKt$ASYNC_IMAGE_PROVIDER$1");
    }

    @Override // tb.d1a
    public final zbn invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (zbn) ipChange.ipc$dispatch("a85684ed", new Object[]{this}) : new zbn();
    }
}
