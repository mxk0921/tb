package com.alibaba.triver.triver_shop.shop2023.template;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023BaseTemplateComponent this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Shop2023BaseTemplateComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent) {
            super(0);
            this.this$0 = shop2023BaseTemplateComponent;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            g1a<Shop2023BaseTemplateComponent, xhv> E = this.this$0.E();
            if (E != null) {
                E.invoke(this.this$0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent) {
        super(0);
        this.this$0 = shop2023BaseTemplateComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2 shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            r54.C(new AnonymousClass1(this.this$0));
        }
    }
}
