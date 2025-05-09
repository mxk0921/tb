package com.alibaba.triver.triver_shop.newShop;

import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.nav.Nav;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.gbv;
import tb.mop;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$onFetchDataOk$1 extends Lambda implements g1a<View, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$onFetchDataOk$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<JSONObject, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity this$0;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$onFetchDataOk$1$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3067a;
            public final /* synthetic */ JSONObject b;

            public a(NativeShopActivity nativeShopActivity, JSONObject jSONObject) {
                this.f3067a = nativeShopActivity;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ShopDataParser I3 = NativeShopActivity.I3(this.f3067a);
                if (I3 != null) {
                    if (I3.e2()) {
                        DinamicXEngine B3 = NativeShopActivity.B3(this.f3067a);
                        if (B3 != null) {
                            View w3 = NativeShopActivity.w3(this.f3067a);
                            if (w3 != null) {
                                ShopExtKt.w0(B3, w3, mop.KEY_SUBSCRIBE_SUBJECT_TYPE_RED_DOT, Boolean.TRUE);
                                NativeShopActivity.p3(this.f3067a, "Page_Shop_Dynamic_RedDot_Expose");
                            } else {
                                ckf.y("bottomView");
                                throw null;
                            }
                        } else {
                            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                            throw null;
                        }
                    }
                    ShopDataParser I32 = NativeShopActivity.I3(this.f3067a);
                    if (I32 == null) {
                        ckf.y("shopDataParser");
                        throw null;
                    } else if (I32.c2()) {
                        Nav from = Nav.from(this.f3067a);
                        JSONObject jSONObject = this.b;
                        ShopDataParser I33 = NativeShopActivity.I3(this.f3067a);
                        if (I33 != null) {
                            from.toUri(ShopExtKt.E(jSONObject, I33));
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeShopActivity nativeShopActivity) {
            super(1);
            this.this$0 = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$onFetchDataOk$1$1");
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
            } else if (jSONObject != null) {
                String string = jSONObject.getString("subjectType");
                String queryParameter = Uri.parse(jSONObject.getString("url")).getQueryParameter("subscribe_bizdata");
                ShopDataParser I3 = NativeShopActivity.I3(this.this$0);
                if (I3 != null) {
                    I3.M2(queryParameter);
                    ShopDataParser I32 = NativeShopActivity.I3(this.this$0);
                    if (I32 != null) {
                        I32.N2(string);
                        NativeShopActivity nativeShopActivity = this.this$0;
                        nativeShopActivity.runOnUiThread(new a(nativeShopActivity, jSONObject));
                        return;
                    }
                    ckf.y("shopDataParser");
                    throw null;
                }
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$onFetchDataOk$1(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$onFetchDataOk$1 nativeShopActivity$onFetchDataOk$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$onFetchDataOk$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(View view) {
        invoke2(view);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, view});
            return;
        }
        ckf.g(view, "bottomBarView");
        NativeShopActivity.g4(this.this$0, view);
        ShopView L3 = NativeShopActivity.L3(this.this$0);
        if (L3 != null) {
            View w3 = NativeShopActivity.w3(this.this$0);
            if (w3 != null) {
                L3.setBottomView(w3);
                NativeShopActivity nativeShopActivity = this.this$0;
                ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
                if (I3 != null) {
                    NativeShopActivity.r4(nativeShopActivity, I3.Y1());
                    DinamicXEngine B3 = NativeShopActivity.B3(this.this$0);
                    if (B3 != null) {
                        View w32 = NativeShopActivity.w3(this.this$0);
                        if (w32 != null) {
                            ShopDataParser I32 = NativeShopActivity.I3(this.this$0);
                            if (I32 != null) {
                                ShopExtKt.w0(B3, w32, "offService", I32.f1());
                                if (!NativeShopActivity.W3(this.this$0)) {
                                    ShopMoreUtils shopMoreUtils = ShopMoreUtils.INSTANCE;
                                    NativeShopActivity nativeShopActivity2 = this.this$0;
                                    ShopDataParser I33 = NativeShopActivity.I3(nativeShopActivity2);
                                    if (I33 != null) {
                                        String W0 = I33.W0();
                                        ShopDataParser I34 = NativeShopActivity.I3(this.this$0);
                                        if (I34 != null) {
                                            shopMoreUtils.o(nativeShopActivity2, W0, I34.N0(), new AnonymousClass1(this.this$0));
                                        } else {
                                            ckf.y("shopDataParser");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("shopDataParser");
                                        throw null;
                                    }
                                }
                            } else {
                                ckf.y("shopDataParser");
                                throw null;
                            }
                        } else {
                            ckf.y("bottomView");
                            throw null;
                        }
                    } else {
                        ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                        throw null;
                    }
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                ckf.y("bottomView");
                throw null;
            }
        } else {
            ckf.y("shopView");
            throw null;
        }
    }
}
