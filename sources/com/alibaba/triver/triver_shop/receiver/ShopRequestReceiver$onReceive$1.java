package com.alibaba.triver.triver_shop.receiver;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopRequestReceiver$onReceive$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $changeToFollow;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $star;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopRequestReceiver$onReceive$1(boolean z, Context context, boolean z2) {
        super(1);
        this.$star = z;
        this.$context = context;
        this.$changeToFollow = z2;
    }

    public static /* synthetic */ Object ipc$super(ShopRequestReceiver$onReceive$1 shopRequestReceiver$onReceive$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/receiver/ShopRequestReceiver$onReceive$1");
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
            JSONObject jSONObject2 = new JSONObject();
            Object obj = jSONObject.get("data");
            if (obj instanceof JSONObject) {
                jSONObject2 = obj;
            }
            if (ckf.b("true", jSONObject2.getString("result"))) {
                String str = "设置成功";
                if (this.$star) {
                    Context context = this.$context;
                    if (!this.$changeToFollow) {
                        str = "星标订阅成功";
                    }
                    r54.S(context, str);
                    return;
                }
                Context context2 = this.$context;
                if (!this.$changeToFollow) {
                    str = "取消星标成功";
                }
                r54.S(context2, str);
            }
        }
    }
}
