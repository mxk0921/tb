package com.taobao.message.message_open_api_adapter;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.jsi.manager.JSIHandler;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.dqf;
import tb.esf;
import tb.oqf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/taobao/message/message_open_api_adapter/OpenAPI4JSI$call$disposable$1", "Lcom/taobao/message/kit/core/IObserver;", "", "value", "Ltb/xhv;", "onNext", "(Ljava/lang/Object;)V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "()V", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenAPI4JSI$call$disposable$1 implements IObserver<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ dqf $jsiCtx;
    public final /* synthetic */ Ref$ObjectRef $onComplete;
    public final /* synthetic */ Ref$ObjectRef $onFail;
    public final /* synthetic */ Ref$ObjectRef $onNext;

    public OpenAPI4JSI$call$disposable$1(Ref$ObjectRef ref$ObjectRef, dqf dqfVar, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.$onNext = ref$ObjectRef;
        this.$jsiCtx = dqfVar;
        this.$onFail = ref$ObjectRef2;
        this.$onComplete = ref$ObjectRef3;
    }

    @Override // com.taobao.message.kit.core.IObserver
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (((oqf) this.$onComplete.element) != null) {
            final esf esfVar = new esf(JSON.toJSONString(CallResponse.complete()));
            TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onComplete called");
            JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onComplete$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
                    if (r0 == null) goto L_0x004b;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
                    return;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r5 = this;
                        r0 = 0
                        r1 = 1
                        com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onComplete$1.$ipChange
                        boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r3 == 0) goto L_0x0012
                        java.lang.String r3 = "5c510192"
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r0] = r5
                        r2.ipc$dispatch(r3, r1)
                        return
                    L_0x0012:
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r2 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this     // Catch: all -> 0x0033
                        tb.dqf r2 = r2.$jsiCtx     // Catch: all -> 0x0033
                        boolean r2 = r2.r()     // Catch: all -> 0x0033
                        if (r2 != 0) goto L_0x003e
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r2 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this     // Catch: all -> 0x0033
                        kotlin.jvm.internal.Ref$ObjectRef r3 = r2.$onComplete     // Catch: all -> 0x0033
                        T r3 = r3.element     // Catch: all -> 0x0033
                        tb.oqf r3 = (tb.oqf) r3     // Catch: all -> 0x0033
                        if (r3 == 0) goto L_0x0035
                        tb.dqf r2 = r2.$jsiCtx     // Catch: all -> 0x0033
                        tb.esf r4 = r2     // Catch: all -> 0x0033
                        tb.esf[] r1 = new tb.esf[r1]     // Catch: all -> 0x0033
                        r1[r0] = r4     // Catch: all -> 0x0033
                        r0 = 0
                        r3.M(r2, r0, r1)     // Catch: all -> 0x0033
                        goto L_0x0035
                    L_0x0033:
                        r0 = move-exception
                        goto L_0x0051
                    L_0x0035:
                        com.taobao.message.kit.jsi.manager.JSIHandler r0 = com.taobao.message.kit.jsi.manager.JSIHandler.INSTANCE     // Catch: all -> 0x0033
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r1 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this     // Catch: all -> 0x0033
                        tb.dqf r1 = r1.$jsiCtx     // Catch: all -> 0x0033
                        r0.checkException(r1)     // Catch: all -> 0x0033
                    L_0x003e:
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r0 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this
                        kotlin.jvm.internal.Ref$ObjectRef r0 = r0.$onComplete
                        T r0 = r0.element
                        tb.oqf r0 = (tb.oqf) r0
                        if (r0 == 0) goto L_0x004b
                    L_0x0048:
                        r0.delete()
                    L_0x004b:
                        tb.esf r0 = r2
                        r0.delete()
                        goto L_0x0065
                    L_0x0051:
                        java.lang.String r1 = "cbq@jsi"
                        java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch: all -> 0x0066
                        com.taobao.tao.log.TLog.loge(r1, r0)     // Catch: all -> 0x0066
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r0 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this
                        kotlin.jvm.internal.Ref$ObjectRef r0 = r0.$onComplete
                        T r0 = r0.element
                        tb.oqf r0 = (tb.oqf) r0
                        if (r0 == 0) goto L_0x004b
                        goto L_0x0048
                    L_0x0065:
                        return
                    L_0x0066:
                        r0 = move-exception
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r1 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this
                        kotlin.jvm.internal.Ref$ObjectRef r1 = r1.$onComplete
                        T r1 = r1.element
                        tb.oqf r1 = (tb.oqf) r1
                        if (r1 == 0) goto L_0x0074
                        r1.delete()
                    L_0x0074:
                        tb.esf r1 = r2
                        r1.delete()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onComplete$1.run():void");
                }
            });
        }
    }

    @Override // com.taobao.message.kit.core.IObserver
    public void onError(Throwable th) {
        String str;
        String stackTraceString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        ckf.h(th, "e");
        if (((oqf) this.$onFail.element) != null) {
            if (th instanceof CallException) {
                CallException callException = (CallException) th;
                str = callException.errCode;
                stackTraceString = callException.errMsg;
            } else {
                str = "-1";
                stackTraceString = Log.getStackTraceString(th);
            }
            final esf esfVar = new esf(JSON.toJSONString(CallResponse.error(str, stackTraceString)));
            TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onError called: " + esfVar);
            JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onError$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
                    if (r0 == null) goto L_0x0052;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
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
                        java.lang.String r2 = "cbq@jsi"
                        com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onError$1.$ipChange
                        boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r4 == 0) goto L_0x0014
                        java.lang.String r2 = "5c510192"
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r0] = r6
                        r3.ipc$dispatch(r2, r1)
                        return
                    L_0x0014:
                        java.lang.String r3 = "JSIBridge onError posted"
                        com.taobao.tao.log.TLog.loge(r2, r3)     // Catch: all -> 0x003a
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r3 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this     // Catch: all -> 0x003a
                        tb.dqf r3 = r3.$jsiCtx     // Catch: all -> 0x003a
                        boolean r3 = r3.r()     // Catch: all -> 0x003a
                        if (r3 != 0) goto L_0x0045
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r3 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this     // Catch: all -> 0x003a
                        kotlin.jvm.internal.Ref$ObjectRef r4 = r3.$onFail     // Catch: all -> 0x003a
                        T r4 = r4.element     // Catch: all -> 0x003a
                        tb.oqf r4 = (tb.oqf) r4     // Catch: all -> 0x003a
                        if (r4 == 0) goto L_0x003c
                        tb.dqf r3 = r3.$jsiCtx     // Catch: all -> 0x003a
                        tb.esf r5 = r2     // Catch: all -> 0x003a
                        tb.esf[] r1 = new tb.esf[r1]     // Catch: all -> 0x003a
                        r1[r0] = r5     // Catch: all -> 0x003a
                        r0 = 0
                        r4.M(r3, r0, r1)     // Catch: all -> 0x003a
                        goto L_0x003c
                    L_0x003a:
                        r0 = move-exception
                        goto L_0x0058
                    L_0x003c:
                        com.taobao.message.kit.jsi.manager.JSIHandler r0 = com.taobao.message.kit.jsi.manager.JSIHandler.INSTANCE     // Catch: all -> 0x003a
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r1 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this     // Catch: all -> 0x003a
                        tb.dqf r1 = r1.$jsiCtx     // Catch: all -> 0x003a
                        r0.checkException(r1)     // Catch: all -> 0x003a
                    L_0x0045:
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r0 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this
                        kotlin.jvm.internal.Ref$ObjectRef r0 = r0.$onFail
                        T r0 = r0.element
                        tb.oqf r0 = (tb.oqf) r0
                        if (r0 == 0) goto L_0x0052
                    L_0x004f:
                        r0.delete()
                    L_0x0052:
                        tb.esf r0 = r2
                        r0.delete()
                        goto L_0x006a
                    L_0x0058:
                        java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch: all -> 0x006b
                        com.taobao.tao.log.TLog.loge(r2, r0)     // Catch: all -> 0x006b
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r0 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this
                        kotlin.jvm.internal.Ref$ObjectRef r0 = r0.$onFail
                        T r0 = r0.element
                        tb.oqf r0 = (tb.oqf) r0
                        if (r0 == 0) goto L_0x0052
                        goto L_0x004f
                    L_0x006a:
                        return
                    L_0x006b:
                        r0 = move-exception
                        com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1 r1 = com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1.this
                        kotlin.jvm.internal.Ref$ObjectRef r1 = r1.$onFail
                        T r1 = r1.element
                        tb.oqf r1 = (tb.oqf) r1
                        if (r1 == 0) goto L_0x0079
                        r1.delete()
                    L_0x0079:
                        tb.esf r1 = r2
                        r1.delete()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onError$1.run():void");
                }
            });
        }
    }

    @Override // com.taobao.message.kit.core.IObserver
    public void onNext(final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, obj});
            return;
        }
        ckf.h(obj, "value");
        if (((oqf) this.$onNext.element) != null) {
            JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onNext$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    esf esfVar = new esf(JSON.toJSONString(CallResponse.next(obj), SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString));
                    TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onNext called");
                    try {
                        if (!OpenAPI4JSI$call$disposable$1.this.$jsiCtx.r()) {
                            OpenAPI4JSI$call$disposable$1 openAPI4JSI$call$disposable$1 = OpenAPI4JSI$call$disposable$1.this;
                            ((oqf) openAPI4JSI$call$disposable$1.$onNext.element).M(openAPI4JSI$call$disposable$1.$jsiCtx, null, new esf[]{esfVar});
                            JSIHandler.INSTANCE.checkException(OpenAPI4JSI$call$disposable$1.this.$jsiCtx);
                        } else {
                            ((oqf) OpenAPI4JSI$call$disposable$1.this.$onNext.element).delete();
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
    }
}
