package com.alibaba.triver.triver_shop.shop2023.template;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023BaseTemplateComponent this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject $it;
        public final /* synthetic */ Shop2023BaseTemplateComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent, JSONObject jSONObject) {
            super(0);
            this.this$0 = shop2023BaseTemplateComponent;
            this.$it = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            final Shop2023BaseTemplateComponent shop2023BaseTemplateComponent = this.this$0;
            final JSONObject jSONObject = this.$it;
            Runnable shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1 = new Runnable() { // from class: com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements d1a<xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public AnonymousClass1(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent) {
                        super(0, shop2023BaseTemplateComponent, Shop2023BaseTemplateComponent.class, "onRootViewAppear", "onRootViewAppear()V", 0);
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1$1");
                    }

                    @Override // tb.d1a
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        } else {
                            ((Shop2023BaseTemplateComponent) this.receiver).o();
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Shop2023BaseTemplateComponent shop2023BaseTemplateComponent2 = Shop2023BaseTemplateComponent.this;
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 == null) {
                        jSONObject2 = null;
                    } else {
                        jSONObject2 = jSONObject3.getJSONObject("data");
                    }
                    shop2023BaseTemplateComponent2.y("asyncData", jSONObject2);
                    r54.F(new AnonymousClass1(Shop2023BaseTemplateComponent.this));
                }
            };
            if (!shop2023BaseTemplateComponent.l()) {
                this.this$0.B(shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1);
            } else {
                shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1.run();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1(Shop2023BaseTemplateComponent shop2023BaseTemplateComponent) {
        super(1);
        this.this$0 = shop2023BaseTemplateComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1 shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else {
            r54.C(new AnonymousClass1(this.this$0, jSONObject));
        }
    }
}
