package com.taobao.android.turbo.service.redpoint;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.foc;
import tb.g1a;
import tb.ud0;
import tb.xhv;
import tb.zrt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RedpointService$requestRedpointMtop$1 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Map $params;
    public final /* synthetic */ TriggerType $trigger;
    public final /* synthetic */ RedpointService this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RedpointService$requestRedpointMtop$1 redpointService$requestRedpointMtop$1 = RedpointService$requestRedpointMtop$1.this;
            RedpointService.g1(redpointService$requestRedpointMtop$1.this$0, redpointService$requestRedpointMtop$1.$trigger, redpointService$requestRedpointMtop$1.$params);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpointService$requestRedpointMtop$1(RedpointService redpointService, Map map, TriggerType triggerType) {
        super(1);
        this.this$0 = redpointService;
        this.$params = map;
        this.$trigger = triggerType;
    }

    public static /* synthetic */ Object ipc$super(RedpointService$requestRedpointMtop$1 redpointService$requestRedpointMtop$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/RedpointService$requestRedpointMtop$1");
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
        if (map != null) {
            this.$params.put("features", map);
        }
        foc d = ud0.Companion.d();
        if (d.isLogin()) {
            RedpointService.g1(this.this$0, this.$trigger, this.$params);
            return;
        }
        d.login(false);
        zrt.Companion.b(new a());
    }
}
