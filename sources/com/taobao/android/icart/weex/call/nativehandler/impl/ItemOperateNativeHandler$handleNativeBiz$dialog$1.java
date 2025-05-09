package com.taobao.android.icart.weex.call.nativehandler.impl;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.icart.weex.dialog.ItemOperateDialog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/android/icart/weex/dialog/ItemOperateDialog$a;", "item", "Ltb/xhv;", "invoke", "(Lcom/taobao/android/icart/weex/dialog/ItemOperateDialog$a;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ItemOperateNativeHandler$handleNativeBiz$dialog$1 extends Lambda implements g1a<ItemOperateDialog.a, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $callbackID;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemOperateNativeHandler$handleNativeBiz$dialog$1(String str) {
        super(1);
        this.$callbackID = str;
    }

    public static /* synthetic */ Object ipc$super(ItemOperateNativeHandler$handleNativeBiz$dialog$1 itemOperateNativeHandler$handleNativeBiz$dialog$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/ItemOperateNativeHandler$handleNativeBiz$dialog$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(ItemOperateDialog.a aVar) {
        invoke2(aVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ItemOperateDialog.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c69fc74", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "item");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "event", aVar.a());
        g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(this.$callbackID);
        if (f != null) {
            f.invoke(jSONObject);
        }
    }
}
