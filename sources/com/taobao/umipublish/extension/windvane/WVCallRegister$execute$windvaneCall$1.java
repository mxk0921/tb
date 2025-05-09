package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()Ltb/xhv;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WVCallRegister$execute$windvaneCall$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $actionName;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $params;
    public final /* synthetic */ WVCallBackContext $wvCallBackContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVCallRegister$execute$windvaneCall$1(String str, Context context, WVCallBackContext wVCallBackContext, JSONObject jSONObject) {
        super(0);
        this.$actionName = str;
        this.$context = context;
        this.$wvCallBackContext = wVCallBackContext;
        this.$params = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(WVCallRegister$execute$windvaneCall$1 wVCallRegister$execute$windvaneCall$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/WVCallRegister$execute$windvaneCall$1");
    }

    @Override // tb.d1a
    public final xhv invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c1e1c5fe", new Object[]{this});
        }
        WindvaneCall a2 = WVCallRegister.a(WVCallRegister.INSTANCE, this.$actionName, this.$context, this.$wvCallBackContext);
        if (a2 == null) {
            return null;
        }
        a2.call(this.$params);
        return xhv.INSTANCE;
    }
}
