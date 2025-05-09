package com.taobao.message.kit.jsi.manager;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import tb.ckf;
import tb.dqf;
import tb.kqf;
import tb.ksf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a4\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\t`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aRF\u0010\u001b\u001a4\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\t`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/taobao/message/kit/jsi/manager/JSIHandler;", "", "<init>", "()V", "Ljava/util/HashMap;", "", "Ljava/util/HashSet;", "Ltb/ksf;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/HashSet;", "getRecyclerCache", "()Ljava/util/HashMap;", "Ltb/dqf;", "jsCtx", "Ltb/xhv;", "checkException", "(Ltb/dqf;)V", "jsiId", "jsValue", "addRecycleValue", "(JLtb/ksf;)V", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "checkInitHandler", "mJSHandler", "Landroid/os/Handler;", "recycleCache", "Ljava/util/HashMap;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class JSIHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Handler mJSHandler;
    public static final JSIHandler INSTANCE = new JSIHandler();
    private static final HashMap<Long, HashSet<ksf>> recycleCache = new HashMap<>(8);

    static {
        t2o.a(529530945);
    }

    private JSIHandler() {
    }

    public static final /* synthetic */ HashMap access$getRecycleCache$p(JSIHandler jSIHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("25e1c55d", new Object[]{jSIHandler});
        }
        return recycleCache;
    }

    public final void addRecycleValue(final long j, final ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815153ff", new Object[]{this, new Long(j), ksfVar});
            return;
        }
        ckf.h(ksfVar, "jsValue");
        checkInitHandler();
        Handler handler = mJSHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.taobao.message.kit.jsi.manager.JSIHandler$addRecycleValue$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSIHandler jSIHandler = JSIHandler.INSTANCE;
                    synchronized (JSIHandler.access$getRecycleCache$p(jSIHandler)) {
                        try {
                            if (JSIHandler.access$getRecycleCache$p(jSIHandler).get(Long.valueOf(j)) == null) {
                                JSIHandler.access$getRecycleCache$p(jSIHandler).put(Long.valueOf(j), new HashSet(16));
                            }
                            HashSet hashSet = (HashSet) JSIHandler.access$getRecycleCache$p(jSIHandler).get(Long.valueOf(j));
                            if (hashSet != null) {
                                hashSet.add(ksfVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public final void checkException(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8baaaf9", new Object[]{this, dqfVar});
            return;
        }
        ckf.h(dqfVar, "jsCtx");
        if (dqfVar.q()) {
            kqf g = dqfVar.g();
            if (g != null) {
                g.delete();
                TLog.loge("JSIHandler", "excuteJS exception: " + ((((("name: " + g.c(dqfVar)) + "\nmessage: ") + g.b(dqfVar)) + "\nstack: ") + g.d(dqfVar)));
                return;
            }
            TLog.loge("JSIHandler", "excuteJS success");
        }
    }

    public final void checkInitHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e278c179", new Object[]{this});
        } else if (mJSHandler == null) {
            HandlerThread handlerThread = new HandlerThread("JSI");
            handlerThread.start();
            mJSHandler = new Handler(handlerThread.getLooper());
        }
    }

    public final Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        checkInitHandler();
        Handler handler = mJSHandler;
        if (handler != null) {
            return handler;
        }
        ckf.s();
        throw null;
    }

    public final HashMap<Long, HashSet<ksf>> getRecyclerCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b0e56937", new Object[]{this});
        }
        return recycleCache;
    }
}
