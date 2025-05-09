package com.taobao.android.nanocompose.platform_registry;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.update.dynamicfeature.utils.Constants;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.iiz;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AndroidDownload$Companion$download$2 extends Lambda implements g1a<String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AndroidDownload$Companion$download$2 INSTANCE = new AndroidDownload$Companion$download$2();

    public AndroidDownload$Companion$download$2() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(AndroidDownload$Companion$download$2 androidDownload$Companion$download$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/platform_registry/AndroidDownload$Companion$download$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(String str) {
        invoke2(str);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, str});
            return;
        }
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        iiz.Companion.j(Constants.ErrorDesc.downloadError);
    }
}
