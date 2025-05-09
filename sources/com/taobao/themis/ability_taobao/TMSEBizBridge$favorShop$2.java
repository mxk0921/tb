package com.taobao.themis.ability_taobao;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bbs;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSEBizBridge$favorShop$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ApiContext $apiContext;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ bbs $instance;
    public final /* synthetic */ String $sellerId;
    public final /* synthetic */ TMSEBizBridge this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSEBizBridge f13456a;
        public final /* synthetic */ String b;
        public final /* synthetic */ bbs c;
        public final /* synthetic */ BridgeCallback d;

        public a(TMSEBizBridge tMSEBizBridge, String str, bbs bbsVar, BridgeCallback bridgeCallback) {
            this.f13456a = tMSEBizBridge;
            this.b = str;
            this.c = bbsVar;
            this.d = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                TMSEBizBridge.access$favorOrUnFavorShop(this.f13456a, true, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13457a;

        public b(BridgeCallback bridgeCallback) {
            this.f13457a = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f13457a.sendBridgeResponse(BridgeResponse.newError(11, "用户拒绝"));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$favorShop$2(ApiContext apiContext, TMSEBizBridge tMSEBizBridge, String str, bbs bbsVar, BridgeCallback bridgeCallback) {
        super(0);
        this.$apiContext = apiContext;
        this.this$0 = tMSEBizBridge;
        this.$sellerId = str;
        this.$instance = bbsVar;
        this.$bridgeCallback = bridgeCallback;
    }

    public static /* synthetic */ Object ipc$super(TMSEBizBridge$favorShop$2 tMSEBizBridge$favorShop$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/TMSEBizBridge$favorShop$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            new AlertDialog.Builder(this.$apiContext.a()).setMessage("是否订阅该店铺？").setPositiveButton("同意", new a(this.this$0, this.$sellerId, this.$instance, this.$bridgeCallback)).setNegativeButton("拒绝", new b(this.$bridgeCallback)).create().show();
        }
    }
}
