package com.taobao.message.kit.util;

import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "onDismiss", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BundleSplitUtil$checkTargetBundleReady$request$2 implements DialogInterface.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BundleSplitUtil$checkTargetBundleReady$request$2 INSTANCE = new BundleSplitUtil$checkTargetBundleReady$request$2();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
        }
    }
}
