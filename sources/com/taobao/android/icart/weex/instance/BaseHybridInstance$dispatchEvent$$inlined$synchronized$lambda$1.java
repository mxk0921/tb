package com.taobao.android.icart.weex.instance;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "invoke", "()V", "com/taobao/android/icart/weex/instance/BaseHybridInstance$dispatchEvent$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class BaseHybridInstance$dispatchEvent$$inlined$synchronized$lambda$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $callbackID$inlined;
    public final /* synthetic */ String $method$inlined;
    public final /* synthetic */ List $methods;
    public final /* synthetic */ JSONObject $params$inlined;
    public final /* synthetic */ BaseHybridInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHybridInstance$dispatchEvent$$inlined$synchronized$lambda$1(List list, BaseHybridInstance baseHybridInstance, String str, String str2, JSONObject jSONObject) {
        super(0);
        this.$methods = list;
        this.this$0 = baseHybridInstance;
        this.$method$inlined = str;
        this.$callbackID$inlined = str2;
        this.$params$inlined = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(BaseHybridInstance$dispatchEvent$$inlined$synchronized$lambda$1 baseHybridInstance$dispatchEvent$$inlined$synchronized$lambda$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/instance/BaseHybridInstance$dispatchEvent$$inlined$synchronized$lambda$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        this.$methods.add(this.$method$inlined);
        BaseHybridInstance.n(this.this$0, this.$callbackID$inlined, this.$method$inlined, this.$params$inlined);
    }
}
