package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.jsi.manager.JSIHandler;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.tao.log.TLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.dqf;
import tb.esf;
import tb.jb1;
import tb.ksf;
import tb.msf;
import tb.oqf;
import tb.t2o;
import tb.xhv;
import tb.xpc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4JSI;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Ltb/dqf;", "jsiCtx", "", "api", "request", "Ltb/jb1;", "args", "", "count", "Ltb/xhv;", "call", "(Landroid/content/Context;Ltb/dqf;Ljava/lang/String;Ljava/lang/String;Ltb/jb1;I)V", "Ltb/ksf;", xpc.RECORD_EXECUTE, "(Landroid/content/Context;Ltb/dqf;Ltb/jb1;)Ltb/ksf;", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "Lcom/taobao/message/message_open_api/ICallService;", "mService", "Lcom/taobao/message/message_open_api/ICallService;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenAPI4JSI {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final OpenAPI4JSI INSTANCE = new OpenAPI4JSI();
    public static final String TAG = "cbq@jsi";
    private static ICallService mService;

    static {
        t2o.a(529531056);
    }

    private OpenAPI4JSI() {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, tb.oqf] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, tb.oqf] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, tb.oqf] */
    private final void call(Context context, dqf dqfVar, String str, String str2, jb1 jb1Var, int i) {
        Map<String, Object> linkedHashMap;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null || (jSONObject2 = parseObject.getJSONObject("ext")) == null || (linkedHashMap = jSONObject2.getInnerMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        linkedHashMap.put(Constants.KEY_SUBSCRIBE_TAG, dqfVar.o());
        linkedHashMap.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_WEEX);
        System.currentTimeMillis();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        if (i >= 3) {
            ksf c = jb1Var.c(2);
            if (c != null) {
                ref$ObjectRef.element = (oqf) c;
                JSIHandler.INSTANCE.addRecycleValue(dqfVar.i(), (oqf) ref$ObjectRef.element);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
            }
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = null;
        if (i >= 4) {
            ksf c2 = jb1Var.c(3);
            if (c2 != null) {
                ref$ObjectRef2.element = (oqf) c2;
                JSIHandler.INSTANCE.addRecycleValue(dqfVar.i(), (oqf) ref$ObjectRef2.element);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
            }
        }
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef3.element = null;
        if (i >= 5) {
            ksf c3 = jb1Var.c(4);
            if (c3 != null) {
                ref$ObjectRef3.element = (oqf) c3;
                JSIHandler.INSTANCE.addRecycleValue(dqfVar.i(), (oqf) ref$ObjectRef3.element);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
            }
        }
        if (mService == null) {
            Object invoke = Class.forName("com.taobao.message.message_open_api.core.CallManager").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (invoke instanceof ICallService) {
                mService = (ICallService) invoke;
            }
        }
        ICallService iCallService = mService;
        if (iCallService != null) {
            iCallService.call(context, str, jSONObject, null, linkedHashMap, new OpenAPI4JSI$call$disposable$1(ref$ObjectRef, dqfVar, ref$ObjectRef2, ref$ObjectRef3));
            xhv xhvVar = xhv.INSTANCE;
            return;
        }
        ckf.s();
        throw null;
    }

    public final ksf execute(Context context, final dqf dqfVar, jb1 jb1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("238836a5", new Object[]{this, context, dqfVar, jb1Var});
        }
        ckf.h(context, "ctx");
        ckf.h(dqfVar, "jsiCtx");
        ckf.h(jb1Var, "args");
        int b = jb1Var.b();
        ksf c = jb1Var.c(0);
        if (c != null) {
            esf esfVar = (esf) c;
            String u = esfVar.u();
            esfVar.delete();
            if (!ckf.b(u, "jsc.getVersions")) {
                ksf c2 = jb1Var.c(1);
                if (c2 != null) {
                    esf esfVar2 = (esf) c2;
                    String u2 = esfVar2.u();
                    esfVar2.delete();
                    TLog.loge(TAG, "api is " + u + ", request is " + u2);
                    ckf.c(u, "jsSApi");
                    ckf.c(u2, "jSSRequest");
                    call(context, dqfVar, u, u2, jb1Var, b);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSString");
                }
            } else if (b >= 3) {
                ksf c3 = jb1Var.c(2);
                if (c3 != null) {
                    final oqf oqfVar = (oqf) c3;
                    TLog.loge(TAG, "api is " + u);
                    JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$execute$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
                            if (r0 == null) goto L_0x005d;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
                            return;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                r6 = this;
                                r0 = 0
                                r1 = 1
                                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$execute$1.$ipChange
                                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                                if (r3 == 0) goto L_0x0012
                                java.lang.String r3 = "5c510192"
                                java.lang.Object[] r1 = new java.lang.Object[r1]
                                r1[r0] = r6
                                r2.ipc$dispatch(r3, r1)
                                return
                            L_0x0012:
                                tb.esf r2 = new tb.esf
                                com.taobao.message.message_open_api.CallService r3 = com.taobao.message.message_open_api.CallService.INSTANCE
                                java.util.Map r3 = r3.getVersions()
                                java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)
                                r2.<init>(r3)
                                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                java.lang.String r4 = "JSIBridge onNext is "
                                r3.<init>(r4)
                                java.lang.String r4 = r2.u()
                                r3.append(r4)
                                java.lang.String r3 = r3.toString()
                                java.lang.String r4 = "cbq@jsi"
                                com.taobao.tao.log.TLog.loge(r4, r3)
                                tb.dqf r3 = tb.dqf.this     // Catch: all -> 0x0054
                                boolean r3 = r3.r()     // Catch: all -> 0x0054
                                if (r3 != 0) goto L_0x0056
                                tb.oqf r3 = r2     // Catch: all -> 0x0054
                                tb.dqf r5 = tb.dqf.this     // Catch: all -> 0x0054
                                tb.esf[] r1 = new tb.esf[r1]     // Catch: all -> 0x0054
                                r1[r0] = r2     // Catch: all -> 0x0054
                                r0 = 0
                                r3.M(r5, r0, r1)     // Catch: all -> 0x0054
                                com.taobao.message.kit.jsi.manager.JSIHandler r0 = com.taobao.message.kit.jsi.manager.JSIHandler.INSTANCE     // Catch: all -> 0x0054
                                tb.dqf r1 = tb.dqf.this     // Catch: all -> 0x0054
                                r0.checkException(r1)     // Catch: all -> 0x0054
                                goto L_0x0056
                            L_0x0054:
                                r0 = move-exception
                                goto L_0x0061
                            L_0x0056:
                                tb.oqf r0 = r2
                                if (r0 == 0) goto L_0x005d
                            L_0x005a:
                                r0.delete()
                            L_0x005d:
                                r2.delete()
                                goto L_0x006d
                            L_0x0061:
                                java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch: all -> 0x006e
                                com.taobao.tao.log.TLog.loge(r4, r0)     // Catch: all -> 0x006e
                                tb.oqf r0 = r2
                                if (r0 == 0) goto L_0x005d
                                goto L_0x005a
                            L_0x006d:
                                return
                            L_0x006e:
                                r0 = move-exception
                                tb.oqf r1 = r2
                                if (r1 == 0) goto L_0x0076
                                r1.delete()
                            L_0x0076:
                                r2.delete()
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$execute$1.run():void");
                        }
                    });
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
                }
            }
            return new msf();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSString");
    }
}
