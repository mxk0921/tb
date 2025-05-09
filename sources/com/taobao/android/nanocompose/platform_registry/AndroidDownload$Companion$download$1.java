package com.taobao.android.nanocompose.platform_registry;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.g1a;
import tb.iiz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AndroidDownload$Companion$download$1 extends Lambda implements g1a<byte[], xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$ObjectRef<byte[]> $ret;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDownload$Companion$download$1(Ref$ObjectRef<byte[]> ref$ObjectRef) {
        super(1);
        this.$ret = ref$ObjectRef;
    }

    public static /* synthetic */ Object ipc$super(AndroidDownload$Companion$download$1 androidDownload$Companion$download$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/platform_registry/AndroidDownload$Companion$download$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(byte[] bArr) {
        invoke2(bArr);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a077fe06", new Object[]{this, bArr});
            return;
        }
        ckf.g(bArr, AdvanceSetting.NETWORK_TYPE);
        iiz.Companion.j("download success");
        this.$ret.element = bArr;
    }
}
