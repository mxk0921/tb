package com.alibaba.triver.triver_shop.container.shopLoft;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentListAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $content;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ long $showTimeBySecond;
    public final /* synthetic */ String $subContent;
    public final /* synthetic */ ShopLoftComponentListAdapter this$0;
    public final /* synthetic */ ShopLoftComponentListAdapter.ShopLoftItemViewHolder this$1;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ShopLoftComponentListAdapter.ShopLoftItemViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopLoftComponentListAdapter.ShopLoftItemViewHolder shopLoftItemViewHolder) {
            super(0);
            this.this$0 = shopLoftItemViewHolder;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            View c0 = this.this$0.c0();
            if (c0 != null) {
                kew.B(c0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1(JSONObject jSONObject, ShopLoftComponentListAdapter shopLoftComponentListAdapter, ShopLoftComponentListAdapter.ShopLoftItemViewHolder shopLoftItemViewHolder, String str, String str2, String str3, long j) {
        super(0);
        this.$data = jSONObject;
        this.this$0 = shopLoftComponentListAdapter;
        this.this$1 = shopLoftItemViewHolder;
        this.$content = str;
        this.$subContent = str2;
        this.$iconUrl = str3;
        this.$showTimeBySecond = j;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1 shopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftComponentListAdapter$ShopLoftItemViewHolder$tryToShowTransitionCard$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!ckf.b("true", this.$data.getString("alreadyLeave"))) {
            this.$data.put((JSONObject) "alreadyShowBottomGuid", "true");
            if (ckf.b(this.this$0.W(), this.this$1)) {
                ShopLoftComponentListAdapter.ShopLoftItemViewHolder.b0(this.this$1, this.$content, this.$subContent, this.$iconUrl);
                r54.E(new AnonymousClass1(this.this$1), this.$showTimeBySecond * 1000);
            }
        }
    }
}
