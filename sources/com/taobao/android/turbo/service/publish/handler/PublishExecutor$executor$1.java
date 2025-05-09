package com.taobao.android.turbo.service.publish.handler;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.azc;
import tb.ckf;
import tb.dov;
import tb.j7j;
import tb.mqu;
import tb.tpu;
import tb.u1a;
import tb.vaj;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", Constants.SEND_TYPE_RES, "Ltb/j7j;", "<anonymous parameter 1>", "Ltb/xhv;", "invoke", "(Ljava/util/Map;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PublishExecutor$executor$1 extends Lambda implements u1a<Map<String, ? extends Object>, j7j, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $params;
    public final /* synthetic */ String $tabId;
    public final /* synthetic */ PublishExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishExecutor$executor$1(PublishExecutor publishExecutor, JSONObject jSONObject, String str) {
        super(2);
        this.this$0 = publishExecutor;
        this.$params = jSONObject;
        this.$tabId = str;
    }

    public static /* synthetic */ Object ipc$super(PublishExecutor$executor$1 publishExecutor$executor$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/publish/handler/PublishExecutor$executor$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map, j7j j7jVar) {
        invoke2(map, j7jVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map, j7j j7jVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245731b4", new Object[]{this, map, j7jVar});
            return;
        }
        ckf.g(map, Constants.SEND_TYPE_RES);
        ckf.g(j7jVar, "<anonymous parameter 1>");
        Object obj = map.get("data");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Object obj2 = null;
            if (mqu.Companion.d(jSONObject.get("status"), 0) == 0) {
                Object obj3 = jSONObject.get("publishParams");
                JSONObject jSONObject2 = this.$params;
                if (jSONObject2 != null) {
                    obj2 = jSONObject2.get("activityResource");
                }
                if (obj3 instanceof JSONObject) {
                    if (obj2 != null) {
                        z = obj2 instanceof JSONObject;
                    }
                    if (z) {
                        String str = "video";
                        if (ckf.b(this.$tabId, str) || ckf.b(this.$tabId, "home")) {
                            str = this.$tabId;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(vaj.KEY_TAB_ID, (Object) str);
                        xhv xhvVar = xhv.INSTANCE;
                        ((Map) obj3).put(dov.KEY_BACK_PARAMS, jSONObject3);
                        PublishExecutor.a(this.this$0, (JSONObject) obj3, (JSONObject) obj2, str);
                        return;
                    }
                }
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "PublishExecutor", "执行发布，接口请求成功，参数类型不满足条件，responseData=" + obj, null, 4, null);
                return;
            }
            Object obj4 = jSONObject.get("actionUrl");
            if (obj4 instanceof String) {
                ((azc) PublishExecutor.c(this.this$0).getService(azc.class)).e(PublishExecutor.b(this.this$0), (String) obj4, null);
                return;
            }
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "PublishExecutor", "执行发布，接口请求成功，actionUrl非String类型，responseData=" + obj, null, 4, null);
        }
    }
}
