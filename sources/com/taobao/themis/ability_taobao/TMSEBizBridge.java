package com.taobao.themis.ability_taobao;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.address.wrapper.weex.AddressKinshipBridge;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.vivo.push.BuildConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.g1a;
import tb.hq9;
import tb.j8s;
import tb.jnj;
import tb.k75;
import tb.me0;
import tb.p8s;
import tb.q2q;
import tb.q9s;
import tb.r4p;
import tb.r8s;
import tb.sf0;
import tb.t2o;
import tb.tck;
import tb.wds;
import tb.wsq;
import tb.xds;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J-\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ-\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\t2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\t2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010!\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u001f\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"J-\u0010$\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b$\u0010\u0015J-\u0010%\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\u000eJ-\u0010&\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b&\u0010\u000eJ-\u0010'\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b'\u0010\u000eJW\u0010-\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\t2\b\b\u0001\u0010)\u001a\u00020\t2\b\b\u0001\u0010*\u001a\u00020\t2\b\b\u0001\u0010+\u001a\u00020\t2\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSEBizBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "id", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "collectGoods", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "unCollectGoods", "checkGoodsCollectedStatus", "", "forceH5", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "openDetail", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Z)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "appCode", "Lcom/alibaba/fastjson/JSONObject;", "appParams", "navigateToTaobaoPage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "sellerNick", "params", "openMessage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Z)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "itemIds", Constants.KEY_EXTS, me0.EVENT_TYPE, "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "cartType", "openCart", "favorShop", "checkShopFavoredStatus", "unFavorShop", "itemId", "sourceType", q2q.KEY_SKU_ID, r4p.KEY_MSOA_TRANS_KEY, "exParams", "showSku", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", AddressKinshipBridge.ACTION_CHOOSE_ADDRESS, "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "Companion", "a", "themis_ability_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSEBizBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int ERROR_CODE = 10;
    public static final int ERROR_NEED_PARAMS = 106;
    public static final int ERROR_UNSUPPORTED_APP = 101;
    public static final int SKU_ADDCART_FINAL = 2;
    public static final int SKU_ADDCART_SUCCESS = 1;
    public static final int SKU_DOBUY_FINAL = 4;
    public static final int SKU_DOBUY_SUCCESS = 3;
    public static final int SKU_RESULT_CANCELED = 7;
    public static final int SKU_RESULT_CONFIRM = 5;
    public static final int SKU_RESULT_INVALID_INPUT = 9;
    public static final int SKU_RESULT_NONEXIST_GOODS = 11;
    public static final int SKU_RESULT_NOSKU = 10;
    public static final int SKU_RESULT_QUERYDATA_FAILED = 8;
    public static final int SKU_RESULT_UNSUPPORTED_TYPE = 6;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(832569350);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13451a;

        public b(BridgeCallback bridgeCallback) {
            this.f13451a = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f13451a.sendBridgeResponse(BridgeResponse.newError(11, "用户拒绝"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements jnj.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13452a;

        public c(BridgeCallback bridgeCallback) {
            this.f13452a = bridgeCallback;
        }

        @Override // tb.jnj.a
        public void a(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("686685d4", new Object[]{this, new Integer(i), new Integer(i2), intent});
            } else if (i2 == 0) {
                this.f13452a.sendBridgeResponse(BridgeResponse.newError(11, "用户取消"));
            } else if (intent != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "name", intent.getStringExtra("fullName"));
                jSONObject.put((JSONObject) "telNumber", intent.getStringExtra("mobile"));
                jSONObject.put((JSONObject) "detailInfo", intent.getStringExtra("addressDetail"));
                jSONObject.put((JSONObject) "countyName", intent.getStringExtra("area"));
                jSONObject.put((JSONObject) r4p.KEY_CITY_NAME, intent.getStringExtra("city"));
                jSONObject.put((JSONObject) "provinceName", intent.getStringExtra("province"));
                jSONObject.put((JSONObject) "streetName", intent.getStringExtra("town"));
                jSONObject.put((JSONObject) "streetCode", intent.getStringExtra("townDivisionCode"));
                jSONObject.put((JSONObject) "type", "deliveryAddress");
                this.f13452a.sendJSONResponse(jSONObject);
            } else {
                this.f13452a.sendBridgeResponse(BridgeResponse.newError(12, "Data Null"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ ApiContext c;
        public final /* synthetic */ BridgeCallback d;

        public d(String str, ApiContext apiContext, BridgeCallback bridgeCallback) {
            this.b = str;
            this.c = apiContext;
            this.d = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                TMSEBizBridge.access$collectOrUnCollectGoods(TMSEBizBridge.this, true, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13454a;

        public e(BridgeCallback bridgeCallback) {
            this.f13454a = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f13454a.sendBridgeResponse(BridgeResponse.newError(11, "用户拒绝"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements jnj.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13455a;
        public final /* synthetic */ String b;

        public f(BridgeCallback bridgeCallback, String str) {
            this.f13455a = bridgeCallback;
            this.b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:28:0x0086, B:30:0x0096, B:33:0x00a3, B:36:0x00ac, B:37:0x00b2, B:39:0x00b6, B:45:0x00bf, B:46:0x00c7, B:48:0x00cd, B:49:0x00e7), top: B:64:0x0086 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:28:0x0086, B:30:0x0096, B:33:0x00a3, B:36:0x00ac, B:37:0x00b2, B:39:0x00b6, B:45:0x00bf, B:46:0x00c7, B:48:0x00cd, B:49:0x00e7), top: B:64:0x0086 }] */
        @Override // tb.jnj.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(int r7, int r8, android.content.Intent r9) {
            /*
                Method dump skipped, instructions count: 486
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability_taobao.TMSEBizBridge.f.a(int, int, android.content.Intent):void");
        }
    }

    static {
        t2o.a(832569349);
        t2o.a(839909427);
    }

    public static final /* synthetic */ void access$collectOrUnCollectGoods(TMSEBizBridge tMSEBizBridge, boolean z, String str, ApiContext apiContext, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e1b4e", new Object[]{tMSEBizBridge, new Boolean(z), str, apiContext, bridgeCallback});
        } else {
            tMSEBizBridge.b(z, str, apiContext, bridgeCallback);
        }
    }

    public static final /* synthetic */ void access$favorOrUnFavorShop(TMSEBizBridge tMSEBizBridge, boolean z, String str, bbs bbsVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ab2677", new Object[]{tMSEBizBridge, new Boolean(z), str, bbsVar, bridgeCallback});
        } else {
            tMSEBizBridge.c(z, str, bbsVar, bridgeCallback);
        }
    }

    public static final /* synthetic */ String access$getSpm(TMSEBizBridge tMSEBizBridge, bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbbe5b6f", new Object[]{tMSEBizBridge, bbsVar});
        }
        return tMSEBizBridge.d(bbsVar);
    }

    public static /* synthetic */ void monitor$default(TMSEBizBridge tMSEBizBridge, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5944b2", new Object[]{tMSEBizBridge, str, str2, str3, str4, str5, str6, str7, map, new Integer(i), obj});
        } else {
            tMSEBizBridge.e(str, str2, str3, (8 & i) != 0 ? null : str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : map);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void addToCart(@BindingApiContext final ApiContext apiContext, @BindingParam({"itemIds"}) final String str, @BindingParam({"exts"}) final String str2, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5317b028", new Object[]{this, apiContext, str, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "itemIds");
        ckf.g(str2, Constants.KEY_EXTS);
        ckf.g(bridgeCallback, "bridgeCallback");
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            new AlertDialog.Builder(apiContext.a()).setMessage("是否确认加入到购物车？").setPositiveButton("同意", new DialogInterface.OnClickListener() { // from class: com.taobao.themis.ability_taobao.TMSEBizBridge$addToCart$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "response", "Ltb/xhv;", "invoke", "(Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                /* renamed from: com.taobao.themis.ability_taobao.TMSEBizBridge$addToCart$1$2  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                public static final class AnonymousClass2 extends Lambda implements g1a<IMtopInnerAdapter.Response, xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ ApiContext $apiContext;
                    public final /* synthetic */ BridgeCallback $bridgeCallback;
                    public final /* synthetic */ TMSEBizBridge this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(BridgeCallback bridgeCallback, TMSEBizBridge tMSEBizBridge, ApiContext apiContext) {
                        super(1);
                        this.$bridgeCallback = bridgeCallback;
                        this.this$0 = tMSEBizBridge;
                        this.$apiContext = apiContext;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/TMSEBizBridge$addToCart$1$2");
                    }

                    @Override // tb.g1a
                    public /* bridge */ /* synthetic */ xhv invoke(IMtopInnerAdapter.Response response) {
                        invoke2(response);
                        return xhv.INSTANCE;
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(7:8|(2:36|9)|(5:15|16|34|17|(4:23|(4:26|(2:28|40)(2:29|39)|30|24)|38|42)(2:31|41))|11|34|17|(0)(0)) */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
                        kotlin.Result.m1108constructorimpl(kotlin.b.a(r0));
                     */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void invoke2(com.taobao.themis.kernel.network.IMtopInnerAdapter.Response r19) {
                        /*
                            r18 = this;
                            r1 = r18
                            r0 = r19
                            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.themis.ability_taobao.TMSEBizBridge$addToCart$1.AnonymousClass2.$ipChange
                            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                            if (r3 == 0) goto L_0x0019
                            java.lang.String r3 = "14f3a00a"
                            r4 = 2
                            java.lang.Object[] r4 = new java.lang.Object[r4]
                            r5 = 0
                            r4[r5] = r1
                            r5 = 1
                            r4[r5] = r0
                            r2.ipc$dispatch(r3, r4)
                            return
                        L_0x0019:
                            java.lang.String r2 = "response"
                            tb.ckf.g(r0, r2)
                            boolean r2 = r19.getSuccess()
                            if (r2 == 0) goto L_0x00b3
                            r2 = 0
                            com.alibaba.fastjson.JSONObject r0 = r19.getData()     // Catch: all -> 0x0046
                            if (r0 != 0) goto L_0x002e
                        L_0x002c:
                            r3 = r2
                            goto L_0x003e
                        L_0x002e:
                            java.lang.String r3 = "data"
                            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r3)     // Catch: all -> 0x0046
                            if (r0 != 0) goto L_0x0037
                            goto L_0x002c
                        L_0x0037:
                            java.lang.String r3 = "bizIds"
                            com.alibaba.fastjson.JSONArray r0 = r0.getJSONArray(r3)     // Catch: all -> 0x0046
                            r3 = r0
                        L_0x003e:
                            tb.xhv r0 = tb.xhv.INSTANCE     // Catch: all -> 0x0044
                            kotlin.Result.m1108constructorimpl(r0)     // Catch: all -> 0x0044
                            goto L_0x004f
                        L_0x0044:
                            r0 = move-exception
                            goto L_0x0048
                        L_0x0046:
                            r0 = move-exception
                            r3 = r2
                        L_0x0048:
                            java.lang.Object r0 = kotlin.b.a(r0)
                            kotlin.Result.m1108constructorimpl(r0)
                        L_0x004f:
                            if (r3 == 0) goto L_0x00a5
                            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r1.$bridgeCallback
                            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
                            r4.<init>()
                            java.lang.String r5 = "itemIds"
                            r4.put(r5, r3)
                            java.lang.Boolean r5 = java.lang.Boolean.TRUE
                            java.lang.String r6 = "success"
                            r4.put(r6, r5)
                            r0.sendJSONResponse(r4)
                            com.taobao.themis.ability_taobao.TMSEBizBridge r0 = r1.this$0
                            com.taobao.themis.kernel.ability.base.ApiContext r4 = r1.$apiContext
                            java.util.Iterator r3 = r3.iterator()
                        L_0x0071:
                            boolean r5 = r3.hasNext()
                            if (r5 == 0) goto L_0x00e4
                            java.lang.Object r5 = r3.next()
                            tb.bbs r6 = r4.b()
                            if (r6 != 0) goto L_0x0083
                            r10 = r2
                            goto L_0x0088
                        L_0x0083:
                            java.lang.String r6 = r6.L()
                            r10 = r6
                        L_0x0088:
                            java.lang.String r11 = r5.toString()
                            tb.bbs r5 = r4.b()
                            java.lang.String r12 = com.taobao.themis.ability_taobao.TMSEBizBridge.access$getSpm(r0, r5)
                            r16 = 192(0xc0, float:2.69E-43)
                            r17 = 0
                            java.lang.String r8 = "TRVTbApiPage"
                            java.lang.String r9 = "TRVaddToCart"
                            java.lang.String r13 = "/mapp.guide.pdp"
                            r14 = 0
                            r15 = 0
                            r7 = r0
                            com.taobao.themis.ability_taobao.TMSEBizBridge.monitor$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                            goto L_0x0071
                        L_0x00a5:
                            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r1.$bridgeCallback
                            r2 = 5
                            java.lang.String r3 = "服务端数据解析错误"
                            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r2 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.newError(r2, r3)
                            r0.sendBridgeResponse(r2)
                            goto L_0x00e4
                        L_0x00b3:
                            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject
                            r2.<init>()
                            java.lang.String r3 = "errorCode"
                            java.lang.String r4 = r19.getErrorCode()
                            r2.put(r3, r4)
                            java.lang.String r3 = "message"
                            java.lang.String r4 = r19.getErrorMsg()
                            r2.put(r3, r4)
                            java.lang.String r3 = "errorMessage"
                            java.lang.String r0 = r19.getErrorMsg()
                            r2.put(r3, r0)
                            r0 = 10
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                            java.lang.String r3 = "error"
                            r2.put(r3, r0)
                            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r1.$bridgeCallback
                            r0.sendJSONResponse(r2)
                        L_0x00e4:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability_taobao.TMSEBizBridge$addToCart$1.AnonymousClass2.invoke2(com.taobao.themis.kernel.network.IMtopInnerAdapter$Response):void");
                    }
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
                    if (iMtopInnerAdapter != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str3 = str;
                        String str4 = str2;
                        jSONObject.put((JSONObject) "itemIds", str3);
                        jSONObject.put((JSONObject) Constants.KEY_EXTS, str4);
                        IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.tmall.retail.cart.new.add", "1.0", jSONObject, null, true, null, null, null, null, new AnonymousClass2(bridgeCallback, this, apiContext), BuildConfig.VERSION_CODE, null);
                    }
                }
            }).setNegativeButton("拒绝", new b(bridgeCallback)).create().show();
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void checkShopFavoredStatus(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab53991d", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "id");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        if (wsq.a0(str)) {
            str = r8s.v(b2);
        }
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        ckf.d(str);
        Boolean a2 = a(str, bridgeCallback);
        if (a2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "id", str);
            jSONObject.put((JSONObject) "isFavor", (String) a2);
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void collectGoods(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae16aa2", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "id");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            new AlertDialog.Builder(apiContext.a()).setMessage("是否收藏该商品? ").setPositiveButton("同意", new d(str, apiContext, bridgeCallback)).setNegativeButton("拒绝", new e(bridgeCallback)).create().show();
        }
    }

    public final String d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4abb6e3", new Object[]{this, bbsVar});
        }
        if (bbsVar == null) {
            return "";
        }
        String b0 = bbsVar.b0();
        if (b0 == null) {
            b0 = wds.a(bbsVar.I(), bbsVar.e0());
        }
        if (b0 == null) {
            return "";
        }
        return b0;
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void favorShop(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb7c39a", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "id");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        if (wsq.a0(str)) {
            str = r8s.v(b2);
        }
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        ckf.d(str);
        Boolean a2 = a(str, bridgeCallback);
        if (a2 != null) {
            if (a2.booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "error", "12");
                jSONObject.put((JSONObject) "message", "用户已订阅");
                jSONObject.put((JSONObject) "errorMessage", "用户已订阅");
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            }
            CommonExtKt.o(new TMSEBizBridge$favorShop$2(apiContext, this, str, b2, bridgeCallback));
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void unCollectGoods(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37161349", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "id");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            b(false, str, apiContext, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void unFavorShop(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92213453", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "id");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        if (wsq.a0(str)) {
            str = r8s.v(b2);
        }
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        ckf.d(str);
        Boolean a2 = a(str, bridgeCallback);
        if (a2 != null) {
            if (!a2.booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "error", "12");
                jSONObject.put((JSONObject) "message", "用户未订阅");
                jSONObject.put((JSONObject) "errorMessage", "用户未订阅");
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            }
            c(false, str, b2, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void chooseAddress(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2aacbb", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (!q9s.INSTANCE.K()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            AuthUtils authUtils = AuthUtils.INSTANCE;
            String j = r8s.j(b2);
            String L = b2.L();
            ckf.f(L, "instance.appId");
            if (!authUtils.j(b2, j, L, false).getJSONObject("authSetting").getBooleanValue("scope.addressList")) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(10, "未授权读取用户信息"));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(sf0.KEY_NEEDFULLADDRESSINFO, true);
            jnj.b g = new jnj.b().f(bundle).h("http://my.m.taobao.com/deliver/select_address_list.htm").g(1002);
            jnj jnjVar = jnj.INSTANCE;
            Activity a2 = apiContext.a();
            ckf.f(a2, "apiContext.activity");
            jnjVar.a(a2, g, new c(bridgeCallback));
        }
    }

    public final void b(boolean z, String str, ApiContext apiContext, BridgeCallback bridgeCallback) {
        String str2;
        String str3;
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5952da", new Object[]{this, new Boolean(z), str, apiContext, bridgeCallback});
            return;
        }
        if (z) {
            str2 = "mtop.taobao.miniapp.items.collection.collect";
        } else {
            str2 = "mtop.taobao.miniapp.items.collection.del";
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "itemId", str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            bbs b2 = apiContext.b();
            String str4 = "";
            if (b2 == null || (str3 = b2.L()) == null) {
                str3 = str4;
            }
            linkedHashMap.put("x-container-miniapp-id", str3);
            bbs b3 = apiContext.b();
            if (!(b3 == null || (d2 = r8s.d(b3)) == null)) {
                str4 = d2;
            }
            linkedHashMap.put("x-container-miniapp-key", str4);
            IMtopInnerAdapter.a.a(iMtopInnerAdapter, str2, "1.0", jSONObject, null, true, null, linkedHashMap, null, null, new TMSEBizBridge$collectOrUnCollectGoods$3(z, bridgeCallback, this, apiContext, str), TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
        }
    }

    public final void c(boolean z, String str, bbs bbsVar, BridgeCallback bridgeCallback) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fe3983", new Object[]{this, new Boolean(z), str, bbsVar, bridgeCallback});
            return;
        }
        if (z) {
            str2 = "mtop.taobao.social.follow.weitao.add";
        } else {
            str2 = "mtop.taobao.weitao.follow.remove";
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "pubAccountId", str);
            jSONObject.put((JSONObject) "accountType", "1");
            jSONObject.put((JSONObject) "originBiz", "shoutao_miniapp");
            IMtopInnerAdapter.a.a(iMtopInnerAdapter, str2, k75.VIDEOCONFIG_API_VERSION_3, jSONObject, null, true, null, null, null, null, new TMSEBizBridge$favorOrUnFavorShop$2(bridgeCallback, z, bbsVar, this, str), BuildConfig.VERSION_CODE, null);
        }
    }

    public final Boolean a(String str, BridgeCallback bridgeCallback) {
        IMtopInnerAdapter.Response response;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d9c93636", new Object[]{this, str, bridgeCallback});
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter == null) {
            response = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "pubAccountId", str);
            jSONObject2.put((JSONObject) "accountType", "1");
            response = IMtopInnerAdapter.a.b(iMtopInnerAdapter, "mtop.cybertron.follow.detail", "2.0", jSONObject2, null, true, null, null, null, null, BuildConfig.VERSION_CODE, null);
        }
        if (response != null && response.getSuccess()) {
            JSONObject data = response.getData();
            Boolean bool = (data == null || (jSONObject = data.getJSONObject("data")) == null) ? null : jSONObject.getBoolean("follow");
            if (bool != null) {
                return bool;
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(5, "服务端数据解析错误"));
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "error", response == null ? null : response.getErrorCode());
        jSONObject3.put((JSONObject) "message", response == null ? null : response.getErrorMsg());
        jSONObject3.put((JSONObject) "errorMessage", response == null ? null : response.getErrorMsg());
        bridgeCallback.sendJSONResponse(jSONObject3);
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void checkGoodsCollectedStatus(@BindingApiContext ApiContext apiContext, @BindingParam({"id"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        String str2;
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8737b441", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "id");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "itemId", str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            bbs b2 = apiContext.b();
            String str3 = "";
            if (b2 == null || (str2 = b2.L()) == null) {
                str2 = str3;
            }
            linkedHashMap.put("x-container-miniapp-id", str2);
            bbs b3 = apiContext.b();
            if (!(b3 == null || (d2 = r8s.d(b3)) == null)) {
                str3 = d2;
            }
            linkedHashMap.put("x-container-miniapp-key", str3);
            IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.taobao.miniapp.items.collection.check", "1.0", jSONObject, null, true, null, linkedHashMap, null, null, new TMSEBizBridge$checkGoodsCollectedStatus$3(bridgeCallback, str), TypedValues.CycleType.TYPE_WAVE_OFFSET, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.IDLE)
    @com.taobao.themis.kernel.ability.base.annotation.AutoCallback
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse navigateToTaobaoPage(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r15, @com.taobao.themis.kernel.ability.base.annotation.BindingParam({"appCode"}) java.lang.String r16, @com.taobao.themis.kernel.ability.base.annotation.BindingParam({"appParams"}) com.alibaba.fastjson.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability_taobao.TMSEBizBridge.navigateToTaobaoPage(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, com.alibaba.fastjson.JSONObject):com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse");
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse openDetail(@BindingApiContext ApiContext apiContext, @BindingParam({"itemId"}) String str, @BindingParam({"forceH5"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("c8f3d29b", new Object[]{this, apiContext, str, new Boolean(z)});
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "id");
        if (TextUtils.isEmpty(str)) {
            BridgeResponse bridgeResponse = BridgeResponse.INVALID_PARAM;
            ckf.f(bridgeResponse, "INVALID_PARAM");
            return bridgeResponse;
        }
        Uri parse = Uri.parse("https://detail.m.tmall.com/item.htm");
        bbs b2 = apiContext.b();
        if (b2 != null) {
            ckf.f(parse, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            xds.a(parse, b2);
        }
        Uri.Builder appendQueryParameter = parse.buildUpon().appendQueryParameter("id", str);
        bbs b3 = apiContext.b();
        String str2 = null;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("fromAppId", b3 == null ? null : b3.L());
        if (z) {
            appendQueryParameter2.appendQueryParameter("hybrid", "true");
        }
        bbs b4 = apiContext.b();
        if (b4 != null) {
            str2 = b4.L();
        }
        monitor$default(this, "TRVTbApiPage", "TRVopenDetail", str2, str, d(apiContext.b()), "", null, null, 128, null);
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a2 = apiContext.a();
            ckf.f(a2, "apiContext.activity");
            String uri = appendQueryParameter2.build().toString();
            ckf.f(uri, "uriBuilder.build().toString()");
            iNavigatorAdapter.openURL(a2, uri, null, null, null);
        }
        BridgeResponse bridgeResponse2 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse2, "SUCCESS");
        return bridgeResponse2;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse openCart(@BindingApiContext ApiContext apiContext, @BindingParam({"cartType"}) String str, @BindingParam({"forceH5"}) boolean z) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("3948e66c", new Object[]{this, apiContext, str, new Boolean(z)});
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "cartType");
        if (ckf.b(hq9.TMALL, str)) {
            uri = Uri.parse("https://cart.m.tmall.com/cart/myCart.htm?cartfrom=triver");
        } else {
            uri = Uri.parse("https://h5.m.taobao.com/awp/base/cart.htm?hasback=true&cartfrom=triver");
        }
        bbs b2 = apiContext.b();
        if (b2 != null) {
            ckf.f(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            xds.a(uri, b2);
        }
        Uri.Builder buildUpon = uri.buildUpon();
        bbs b3 = apiContext.b();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("fromAppId", b3 == null ? null : b3.L());
        if (z) {
            appendQueryParameter.appendQueryParameter("hybrid", "true");
        }
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a2 = apiContext.a();
            ckf.f(a2, "apiContext.activity");
            String uri2 = appendQueryParameter.build().toString();
            ckf.f(uri2, "builder.build().toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, a2, uri2, null, null, null, 16, null);
        }
        bbs b4 = apiContext.b();
        monitor$default(this, "TRVTbApiPage", "TRVopenCart", b4 == null ? null : b4.L(), null, d(apiContext.b()), null, null, null, 232, null);
        BridgeResponse bridgeResponse = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse, "SUCCESS");
        return bridgeResponse;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse openMessage(@BindingApiContext ApiContext apiContext, @BindingParam({"sellerNick"}) String str, @BindingParam({"params"}) JSONObject jSONObject, @BindingParam({"forceH5"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("3b4fb27f", new Object[]{this, apiContext, str, jSONObject, new Boolean(z)});
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "sellerNick");
        if (TextUtils.isEmpty(str)) {
            BridgeResponse bridgeResponse = BridgeResponse.INVALID_PARAM;
            ckf.f(bridgeResponse, "INVALID_PARAM");
            return bridgeResponse;
        }
        Uri parse = Uri.parse("https://h5.m.taobao.com/wx/h5chat.html?targetType=7&bizType=11001");
        bbs b2 = apiContext.b();
        if (b2 != null) {
            ckf.f(parse, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            xds.a(parse, b2);
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("targetId", ckf.p(MessageNavProcessorV2.KEY_BC_TAOBAO, str));
        if (z) {
            buildUpon.appendQueryParameter("hybrid", "true");
        }
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a2 = apiContext.a();
            ckf.f(a2, "apiContext.activity");
            String uri = buildUpon.build().toString();
            ckf.f(uri, "builder.build().toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, a2, uri, null, null, null, 16, null);
        }
        bbs b3 = apiContext.b();
        String L = b3 == null ? null : b3.L();
        String d2 = d(apiContext.b());
        HashMap hashMap = new HashMap();
        hashMap.put("sellerNick", str);
        xhv xhvVar = xhv.INSTANCE;
        monitor$default(this, "TRVTbApiPage", "openMessage", L, null, d2, null, null, hashMap, 104, null);
        BridgeResponse bridgeResponse2 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse2, "SUCCESS");
        return bridgeResponse2;
    }

    public final void e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923fcb7e", new Object[]{this, str, str2, str3, str4, str5, str6, str7, map});
        } else if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            HashMap hashMap = new HashMap();
            hashMap.put("trv_appid", str3);
            hashMap.put("miniapp_id", str3);
            if (str4 != null) {
                hashMap.put("item_id", str4);
            }
            if (str7 != null) {
                hashMap.put("shopId", str7);
            }
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("spm_ori", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                hashMap.put("logkey", str6);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "trv_appid", str3);
            jSONObject.put((JSONObject) "miniapp_id", str3);
            if (str4 != null) {
                jSONObject.put((JSONObject) "item_id", str4);
            }
            if (str7 != null) {
                jSONObject.put((JSONObject) "shopId", str7);
            }
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter != null) {
                iUserTrackerAdapter.customAdvance("2101", str, str2, "", "", kotlin.collections.a.r(hashMap), kotlin.collections.a.h());
            }
            IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
            if (iMonitorAdapter != null) {
                iMonitorAdapter.trackCounter(str, str2, 1, jSONObject.toJSONString());
            }
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void showSku(@BindingApiContext ApiContext apiContext, @BindingParam({"itemId"}) String str, @BindingParam({"sourceType"}) String str2, @BindingParam({"skuId"}) String str3, @BindingParam({"transparent_key"}) String str4, @BindingParam({"exParams"}) JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        String str5 = str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea43398", new Object[]{this, apiContext, str, str2, str3, str5, jSONObject, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "itemId");
        ckf.g(str2, "sourceType");
        ckf.g(str3, q2q.KEY_SKU_ID);
        ckf.g(str5, r4p.KEY_MSOA_TRANS_KEY);
        ckf.g(bridgeCallback, "bridgeCallback");
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        String str6 = wsq.a0(str2) ? "0" : str2;
        Uri.Builder buildUpon = Uri.parse("https://a.m.taobao.com/sku" + str + ".htm?skuId=" + str3).buildUpon();
        if (wsq.a0(str4)) {
            str5 = null;
        }
        if (str5 != null) {
            buildUpon.appendQueryParameter(r4p.KEY_MSOA_TRANS_KEY, str5);
        }
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("bizName", "miniapp");
        int parseInt = Integer.parseInt(str6);
        if (parseInt == 1) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm_addcart");
        } else if (parseInt == 2) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm_buy");
        } else if (parseInt == 3) {
            bundle.putString("bottom_bar_style", "bottombar_style_confirm");
        } else if (parseInt == 5) {
            bundle.putString("bottom_bar_style", "bottombar_style_addcartonly");
        } else if (parseInt != 6) {
            bundle.putString("bottom_bar_style", "bottombar_style_buyaddcart");
        } else {
            bundle.putString("bottom_bar_style", "bottombar_style_buyonly");
        }
        bbs b2 = apiContext.b();
        monitor$default(this, "TRVTbApiPage", "TRVshowSku", b2 == null ? null : b2.L(), str, d(apiContext.b()), "/mapp.guide.pdp", null, null, tck.DETECT_WIDTH, null);
        jnj.b g = new jnj.b().f(bundle).h(buildUpon.build().toString()).g(101);
        jnj jnjVar = jnj.INSTANCE;
        Activity a2 = apiContext.a();
        ckf.f(a2, "apiContext.activity");
        jnjVar.a(a2, g, new f(bridgeCallback, str2));
    }
}
