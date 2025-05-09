package com.taobao.android.turbo.core.service.windvane;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;
import tb.z0d;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/z0d;", DataReceiveMonitor.CB_LISTENER, "Ltb/xhv;", "invoke", "(Ltb/z0d;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WindvaneService$JsEventListener$onEvent$1 extends Lambda implements g1a<z0d, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $event;
    public final /* synthetic */ JSONObject $param;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindvaneService$JsEventListener$onEvent$1(String str, JSONObject jSONObject) {
        super(1);
        this.$event = str;
        this.$param = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(WindvaneService$JsEventListener$onEvent$1 windvaneService$JsEventListener$onEvent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/windvane/WindvaneService$JsEventListener$onEvent$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(z0d z0dVar) {
        invoke2(z0dVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(z0d z0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271a0dc7", new Object[]{this, z0dVar});
            return;
        }
        ckf.g(z0dVar, DataReceiveMonitor.CB_LISTENER);
        z0dVar.c(this.$event, this.$param);
    }
}
