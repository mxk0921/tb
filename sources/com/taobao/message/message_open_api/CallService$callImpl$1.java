package com.taobao.message.message_open_api;

import android.content.Context;
import android.os.Handler;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.launcher.init.FeatureInitHelper;
import java.util.Map;
import kotlin.Metadata;
import tb.xhv;
import tb.xpc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/taobao/message/message_open_api/CallService$callImpl$1", "Lcom/taobao/message/kit/threadpool/BaseRunnable;", "Ltb/xhv;", xpc.RECORD_EXECUTE, "()V", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CallService$callImpl$1 extends BaseRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $api;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ Map $ext;
    public final /* synthetic */ Handler $handler;
    public final /* synthetic */ IObserver $observer;
    public final /* synthetic */ Map $options;

    public CallService$callImpl$1(Handler handler, Class cls, Context context, String str, JSONObject jSONObject, Map map, Map map2, IObserver iObserver) {
        this.$handler = handler;
        this.$clazz = cls;
        this.$context = context;
        this.$api = str;
        this.$data = jSONObject;
        this.$options = map;
        this.$ext = map2;
        this.$observer = iObserver;
    }

    public static /* synthetic */ Object ipc$super(CallService$callImpl$1 callService$callImpl$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/message_open_api/CallService$callImpl$1");
    }

    @Override // com.taobao.message.kit.threadpool.BaseRunnable
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        FeatureInitHelper.directInit(CallService$callImpl$1$execute$1.INSTANCE);
        this.$handler.post(new Runnable() { // from class: com.taobao.message.message_open_api.CallService$callImpl$1$execute$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                Object invoke = CallService$callImpl$1.this.$clazz.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                if (invoke instanceof ICallService) {
                    ICallService iCallService = (ICallService) invoke;
                    CallService.access$setMService$p(CallService.INSTANCE, iCallService);
                    CallService$callImpl$1 callService$callImpl$1 = CallService$callImpl$1.this;
                    iCallService.call(callService$callImpl$1.$context, callService$callImpl$1.$api, callService$callImpl$1.$data, callService$callImpl$1.$options, callService$callImpl$1.$ext, callService$callImpl$1.$observer);
                    xhv xhvVar = xhv.INSTANCE;
                    return;
                }
                CallService$callImpl$1.this.$observer.onError(new RuntimeException("callManager is null"));
            }
        });
    }
}
