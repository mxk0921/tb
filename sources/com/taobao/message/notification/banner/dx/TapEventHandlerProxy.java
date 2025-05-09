package com.taobao.message.notification.banner.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.ob5;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R2\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0015j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/taobao/message/notification/banner/dx/TapEventHandlerProxy;", "Ltb/ob5;", "<init>", "()V", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "event", "", "", "args", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "runtimeContext", "Ltb/xhv;", "handleEvent", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "", "id", "handler", "addHandler", "(Ljava/lang/String;Ltb/ob5;)V", "removeHandler", "(Ljava/lang/String;)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "mDXEventHandlers", "Ljava/util/LinkedHashMap;", "notification_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TapEventHandlerProxy extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TapEventHandlerProxy INSTANCE = new TapEventHandlerProxy();
    private static LinkedHashMap<String, ob5> mDXEventHandlers = new LinkedHashMap<>();

    static {
        t2o.a(610271256);
    }

    private TapEventHandlerProxy() {
    }

    public static /* synthetic */ Object ipc$super(TapEventHandlerProxy tapEventHandlerProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/dx/TapEventHandlerProxy");
    }

    public final void addHandler(String str, ob5 ob5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31b8b6c", new Object[]{this, str, ob5Var});
            return;
        }
        ckf.h(str, "id");
        ckf.h(ob5Var, "handler");
        mDXEventHandlers.put(str, ob5Var);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (mDXEventHandlers.size() > 0) {
            Set<Map.Entry<String, ob5>> entrySet = mDXEventHandlers.entrySet();
            ckf.c(entrySet, "mDXEventHandlers.entries");
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                (entry != null ? (ob5) entry.getValue() : null).handleEvent(dXEvent, objArr, dXRuntimeContext);
            }
        } else {
            TLog.loge(DynamicSimpleComponent.TAG, "handlers size == 0");
        }
    }

    public final void removeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc959437", new Object[]{this, str});
            return;
        }
        ckf.h(str, "id");
        mDXEventHandlers.remove(str);
    }
}
