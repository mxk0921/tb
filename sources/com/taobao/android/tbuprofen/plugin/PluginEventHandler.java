package com.taobao.android.tbuprofen.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.common.TBPEvent;
import com.taobao.android.tbuprofen.plugin.PluginEventHandler;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.mur;
import tb.n8m;
import tb.t2o;
import tb.urr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PluginEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PluginEventHandler";
    private final List<n8m> eventListeners = new CopyOnWriteArrayList();

    static {
        t2o.a(824180799);
    }

    private static String[] getInfo(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fe3ee93d", new Object[]{str, new Integer(i)});
        }
        String[] split = str.split("::", i);
        if (split.length != i) {
            return null;
        }
        return split;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPluginEvent$0(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96eb1eeb", new Object[]{this, new Integer(i), str, obj});
        } else {
            handleEvent(i, str, obj);
        }
    }

    private void onClassPrepare(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d2e3ff", new Object[]{this, str});
            return;
        }
        for (n8m n8mVar : this.eventListeners) {
            n8mVar.b(str);
        }
    }

    private void onExceptionCatch(String str, Object obj) {
        StackTraceElement stackTraceElement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e9b098", new Object[]{this, str, obj});
        } else if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                stackTraceElement = stackTrace[0];
            } else {
                stackTraceElement = null;
            }
            for (n8m n8mVar : this.eventListeners) {
                n8mVar.c(th, stackTraceElement, str);
            }
        }
    }

    private void onMainThreadLongWait(String str, Object obj) {
        int i;
        StackTraceElement[] stackTraceElementArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305739c0", new Object[]{this, str, obj});
            return;
        }
        String[] info = getInfo(str, 3);
        if (info != null) {
            try {
                i = Integer.parseInt(info[1]);
            } catch (Exception unused) {
                i = -1;
            }
            if (obj instanceof StackTraceElement[]) {
                stackTraceElementArr = (StackTraceElement[]) obj;
            } else {
                stackTraceElementArr = null;
            }
            for (n8m n8mVar : this.eventListeners) {
                n8mVar.d(info[0], i, stackTraceElementArr, info[2]);
            }
        }
    }

    private void onObjectAlloc(String str, Object obj) {
        long j;
        StackTraceElement[] stackTraceElementArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebaed04", new Object[]{this, str, obj});
            return;
        }
        String[] info = getInfo(str, 4);
        if (info != null) {
            try {
                j = Long.parseLong(info[3]);
            } catch (Exception unused) {
                j = -1;
            }
            if (obj instanceof StackTraceElement[]) {
                stackTraceElementArr = (StackTraceElement[]) obj;
            } else {
                stackTraceElementArr = null;
            }
            for (n8m n8mVar : this.eventListeners) {
                n8mVar.a(info[0], info[1], info[2], j, stackTraceElementArr);
            }
        }
    }

    public void addEventListener(n8m n8mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a74515", new Object[]{this, n8mVar});
        } else if (n8mVar != null && !this.eventListeners.contains(n8mVar)) {
            this.eventListeners.add(n8mVar);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.eventListeners.clear();
        }
    }

    public void handleEvent(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3f370", new Object[]{this, new Integer(i), str, obj});
            return;
        }
        urr.f(TAG, "handle event: %d, ret: %s", Integer.valueOf(i), str);
        if (i == TBPEvent.TBP_EVENT_CLASS_PREPARE.getIndex()) {
            onClassPrepare(str);
        } else if (i == PluginEvent.CUSTOM_EVENT_BIG_MEM_ALLOC.getIndex()) {
            onObjectAlloc(str, obj);
        } else if (i == TBPEvent.TBP_EVENT_EXCEPTION_CATCH.getIndex()) {
            onExceptionCatch(str, obj);
        } else if (i == PluginEvent.CUSTOM_EVENT_MAIN_THREAD_LONG_BLOCK.getIndex()) {
            onMainThreadLongWait(str, obj);
        } else {
            urr.g(TAG, "Unsupported event: " + i, new Object[0]);
        }
    }

    public void removeListener(n8m n8mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b8f9ea", new Object[]{this, n8mVar});
        } else if (n8mVar != null) {
            this.eventListeners.remove(n8mVar);
        }
    }

    public void onPluginEvent(final int i, final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cfb9ba", new Object[]{this, new Integer(i), str, obj});
            return;
        }
        try {
            if (!this.eventListeners.isEmpty()) {
                urr.f(TAG, String.format("onPluginEvent type=%d, ret=%s", Integer.valueOf(i), str), new Object[0]);
                if (!(i == TBPEvent.TBP_EVENT_CLASS_LOAD.getIndex() || i == TBPEvent.TBP_EVENT_CLASS_PREPARE.getIndex() || i == TBPEvent.TBP_EVENT_THREAD_START.getIndex() || i == TBPEvent.TBP_EVENT_THREAD_END.getIndex())) {
                    mur.b().a(new Runnable() { // from class: tb.m8m
                        @Override // java.lang.Runnable
                        public final void run() {
                            PluginEventHandler.this.lambda$onPluginEvent$0(i, str, obj);
                        }
                    });
                }
            }
        } catch (Exception e) {
            urr.c(TAG, e, "Exception onPluginEvent", new Object[0]);
        }
    }
}
