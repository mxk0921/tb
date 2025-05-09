package com.taobao.message.message_open_api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.BundleSplitUtil;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J}\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017Ji\u0010\u0018\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001a0\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/taobao/message/message_open_api/CallService;", "Lcom/taobao/message/message_open_api/ICallService;", "<init>", "()V", "T", "Landroid/os/Handler;", "handler", "Ljava/lang/Class;", "clazz", "Landroid/content/Context;", "context", "", "api", "Lcom/alibaba/fastjson/JSONObject;", "data", "", "", "options", "ext", "Lcom/taobao/message/kit/core/IObserver;", "observer", "Ltb/xhv;", "callImpl", "(Landroid/os/Handler;Ljava/lang/Class;Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Ljava/util/Map;Ljava/util/Map;Lcom/taobao/message/kit/core/IObserver;)V", "call", "(Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Ljava/util/Map;Ljava/util/Map;Lcom/taobao/message/kit/core/IObserver;)V", "", "getVersions", "()Ljava/util/Map;", "tag", "unsubscribe", "(Ljava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "CALL_CLAZZ", "mService", "Lcom/taobao/message/message_open_api/ICallService;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CallService implements ICallService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CALL_CLAZZ = "com.taobao.message.message_open_api.core.CallManager";
    public static final CallService INSTANCE = new CallService();
    private static final String TAG = "CallService";
    private static ICallService mService;

    static {
        t2o.a(529531037);
        t2o.a(529531043);
    }

    private CallService() {
    }

    public static final /* synthetic */ void access$callImpl(CallService callService, Handler handler, Class cls, Context context, String str, JSONObject jSONObject, Map map, Map map2, IObserver iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d40ffef", new Object[]{callService, handler, cls, context, str, jSONObject, map, map2, iObserver});
        } else {
            callService.callImpl(handler, cls, context, str, jSONObject, map, map2, iObserver);
        }
    }

    public static final /* synthetic */ ICallService access$getMService$p(CallService callService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICallService) ipChange.ipc$dispatch("e2de830", new Object[]{callService});
        }
        return mService;
    }

    public static final /* synthetic */ void access$setMService$p(CallService callService, ICallService iCallService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a1cae", new Object[]{callService, iCallService});
        } else {
            mService = iCallService;
        }
    }

    private final <T> void callImpl(Handler handler, Class<?> cls, Context context, String str, JSONObject jSONObject, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, IObserver<T> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86beed38", new Object[]{this, handler, cls, context, str, jSONObject, map, map2, iObserver});
        } else {
            Coordinator.doBackGroundTask(new CallService$callImpl$1(handler, cls, context, str, jSONObject, map, map2, iObserver));
        }
    }

    public final Map<String, Integer> getVersions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e27d84d", new Object[]{this});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("dataSDK", 2);
        return hashMap;
    }

    @Override // com.taobao.message.message_open_api.ICallService
    public void unsubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844202a2", new Object[]{this, str});
            return;
        }
        ICallService iCallService = mService;
        if (iCallService != null) {
            iCallService.unsubscribe(str);
        }
    }

    @Override // com.taobao.message.message_open_api.ICallService
    public <T> void call(Context context, String str, JSONObject jSONObject, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, IObserver<T> iObserver) {
        Handler handler;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("967aacfb", new Object[]{this, context, str, jSONObject, map, map2, iObserver});
            return;
        }
        ckf.h(context, "context");
        ckf.h(str, "api");
        ckf.h(iObserver, "observer");
        if (Looper.myLooper() == null) {
            handler = new Handler(Looper.getMainLooper());
        } else {
            handler = new Handler();
        }
        ICallService iCallService = mService;
        if (!(iCallService instanceof ICallService)) {
            if (map2 == null || !map2.containsKey("disableInit") || !Boolean.parseBoolean(String.valueOf(map2.get("disableInit")))) {
                z = false;
            }
            BundleSplitUtil bundleSplitUtil = BundleSplitUtil.INSTANCE;
            if (bundleSplitUtil.isMsgBundleReady()) {
                callImpl(handler, Class.forName(CALL_CLAZZ), context, str, jSONObject, map, map2, iObserver);
            } else if (!z) {
                bundleSplitUtil.checkClazzReady(CALL_CLAZZ, false, new CallService$call$1(handler, context, str, jSONObject, map, map2, iObserver), new CallService$call$2(iObserver));
            } else {
                iObserver.onError(new RuntimeException("msg bundle is not ready"));
            }
        } else if (iCallService != null) {
            iCallService.call(context, str, jSONObject, map, map2, iObserver);
        } else {
            ckf.s();
            throw null;
        }
    }
}
