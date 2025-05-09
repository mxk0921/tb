package com.taobao.themis.pub.titlebar.action;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/ImageView;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Landroid/widget/ImageView;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubMoreCloseAction$getView$4$1 extends Lambda implements g1a<ImageView, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ PubMoreCloseAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubMoreCloseAction$getView$4$1(PubMoreCloseAction pubMoreCloseAction) {
        super(1);
        this.this$0 = pubMoreCloseAction;
    }

    public static /* synthetic */ Object ipc$super(PubMoreCloseAction$getView$4$1 pubMoreCloseAction$getView$4$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubMoreCloseAction$getView$4$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(ImageView imageView) {
        invoke2(imageView);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600507f9", new Object[]{this, imageView});
            return;
        }
        ckf.g(imageView, AdvanceSetting.NETWORK_TYPE);
        this.this$0.C();
    }
}
