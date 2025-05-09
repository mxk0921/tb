package com.taobao.taobao.ability;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsTradePayAbility;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.buw;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.ldb;
import tb.xrz;
import tb.yrz;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/taobao/ability/TradePayAbility;", "Lcom/taobao/android/abilityidl/ability/AbsTradePayAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/xrz;", "params", "Ltb/jdb;", "callback", "Ltb/xhv;", "openAlipayEntrust", "(Ltb/kdb;Ltb/xrz;Ltb/jdb;)V", "Ltb/yrz;", "openWeChatEntrust", "(Ltb/kdb;Ltb/yrz;Ltb/jdb;)V", "cashdesk_aar_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TradePayAbility extends AbsTradePayAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TradePayAbility tradePayAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/ability/TradePayAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradePayAbility
    public void openAlipayEntrust(kdb kdbVar, xrz xrzVar, jdb jdbVar) {
        Context context;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b7802b", new Object[]{this, kdbVar, xrzVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(xrzVar, "params");
        ckf.g(jdbVar, "callback");
        ldb a2 = kdbVar.a();
        if (!(a2 == null || (context = a2.getContext()) == null)) {
            Intent intent = new Intent(xrzVar.f31568a);
            intent.setPackage("com.taobao.taobao");
            Map<String, ? extends Object> map = xrzVar.b;
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                        if (ckf.b(entry.getKey(), "signed")) {
                            z = ckf.b(String.valueOf(entry.getValue()), "true");
                        }
                    }
                }
            }
            if (!(context instanceof FragmentActivity)) {
                context = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity != null) {
                fragmentActivity.startActivityForResult(intent, z ? 1001 : 1000);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradePayAbility
    public void openWeChatEntrust(kdb kdbVar, yrz yrzVar, jdb jdbVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6313ab", new Object[]{this, kdbVar, yrzVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(yrzVar, "params");
        ckf.g(jdbVar, "callback");
        ldb a2 = kdbVar.a();
        if (a2 != null && (context = a2.getContext()) != null) {
            WXOpenBusinessWebview.Req req = new WXOpenBusinessWebview.Req();
            req.businessType = 12;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("pre_entrustweb_id", yrzVar.f32312a);
            req.queryInfo = hashMap;
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, buw.a(), true);
            createWXAPI.registerApp(buw.a());
            createWXAPI.sendReq(req);
        }
    }
}
