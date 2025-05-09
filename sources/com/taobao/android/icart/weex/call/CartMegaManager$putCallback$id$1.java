package com.taobao.android.icart.weex.call;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.emb;
import tb.fmb;
import tb.g1a;
import tb.jdb;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartMegaManager$putCallback$id$1 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ jdb $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartMegaManager$putCallback$id$1(jdb jdbVar) {
        super(1);
        this.$callback = jdbVar;
    }

    public static /* synthetic */ Object ipc$super(CartMegaManager$putCallback$id$1 cartMegaManager$putCallback$id$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/CartMegaManager$putCallback$id$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
            return;
        }
        jdb jdbVar = this.$callback;
        if (jdbVar instanceof fmb) {
            fmb fmbVar = (fmb) jdbVar;
            if (map == null) {
                map = new JSONObject();
            }
            fmbVar.onSuccess(map);
        } else if (jdbVar instanceof emb) {
            emb embVar = (emb) jdbVar;
            if (map == null) {
                map = new JSONObject();
            }
            embVar.onSuccess(map);
        }
    }
}
