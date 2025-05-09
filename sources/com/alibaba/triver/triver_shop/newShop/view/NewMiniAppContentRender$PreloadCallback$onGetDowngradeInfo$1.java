package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.ariver.app.api.App;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NewMiniAppContentRender$PreloadCallback$onGetDowngradeInfo$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $downgradeInfo;
    public final /* synthetic */ NewMiniAppContentRender this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewMiniAppContentRender f3136a;
        public final /* synthetic */ String b;

        public a(NewMiniAppContentRender newMiniAppContentRender, String str) {
            this.f3136a = newMiniAppContentRender;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            App K = this.f3136a.K();
            if (K != null) {
                K.putStringValue("shopDowngradeConfig", this.b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMiniAppContentRender$PreloadCallback$onGetDowngradeInfo$1(NewMiniAppContentRender newMiniAppContentRender, String str) {
        super(0);
        this.this$0 = newMiniAppContentRender;
        this.$downgradeInfo = str;
    }

    public static /* synthetic */ Object ipc$super(NewMiniAppContentRender$PreloadCallback$onGetDowngradeInfo$1 newMiniAppContentRender$PreloadCallback$onGetDowngradeInfo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/NewMiniAppContentRender$PreloadCallback$onGetDowngradeInfo$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        NewMiniAppContentRender newMiniAppContentRender = this.this$0;
        a aVar = new a(newMiniAppContentRender, this.$downgradeInfo);
        if (NewMiniAppContentRender.A(newMiniAppContentRender)) {
            aVar.run();
        } else {
            NewMiniAppContentRender.z(this.this$0).add(aVar);
        }
    }
}
