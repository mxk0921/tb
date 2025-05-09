package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.a;
import tb.ckf;
import tb.cu;
import tb.kdb;
import tb.ldb;
import tb.t2o;
import tb.vq;
import tb.xpc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4Uni;", "Ltb/cu;", "<init>", "()V", "", "api", "Ltb/kdb;", "context", "", "", "params", "Ltb/vq;", "callback", "Lcom/alibaba/ability/result/ExecuteResult;", xpc.RECORD_EXECUTE, "(Ljava/lang/String;Ltb/kdb;Ljava/util/Map;Ltb/vq;)Lcom/alibaba/ability/result/ExecuteResult;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenAPI4Uni extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529531062);
    }

    public static /* synthetic */ Object ipc$super(OpenAPI4Uni openAPI4Uni, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/message_open_api_adapter/OpenAPI4Uni");
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, final vq vqVar) {
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.h(str, "api");
        ckf.h(kdbVar, "context");
        ckf.h(map, "params");
        ckf.h(vqVar, "callback");
        if (ckf.b("trigger", str) && map.containsKey("api")) {
            if (map.containsKey("ext")) {
                Object obj = map.get("ext");
                if (obj != null) {
                    map2 = (Map) obj;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                }
            } else {
                map2 = new LinkedHashMap();
            }
            Map<String, ? extends Object> t = a.t(map2);
            String pageId = kdbVar.getPageId();
            if (pageId == null) {
                pageId = "";
            }
            t.put(Constants.KEY_SUBSCRIBE_TAG, pageId);
            t.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_UNI);
            CallService callService = CallService.INSTANCE;
            ldb l = kdbVar.l();
            ckf.c(l, "context.abilityEnv");
            Context context = l.getContext();
            if (context == null) {
                context = ApplicationUtil.getApplication();
                ckf.c(context, "ApplicationUtil.getApplication()");
            }
            callService.call(context, String.valueOf(map.get("api")), map.containsKey("data") ? JSON.parseObject(JSON.toJSONString(map.get("data"))) : null, null, t, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4Uni$execute$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    } else {
                        vq.this.c(new FinishResult(CallResponse.complete2map()));
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        return;
                    }
                    ckf.h(th, "e");
                    vq.this.d(new ExecutingResult(CallResponse.error2map("-1", th.toString())));
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onNext(Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj2});
                        return;
                    }
                    ckf.h(obj2, "var1");
                    vq.this.d(new ExecutingResult(CallResponse.next2map(obj2)));
                }
            });
        }
        return new ExecutingResult();
    }
}
