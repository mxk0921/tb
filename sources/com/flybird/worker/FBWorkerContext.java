package com.flybird.worker;

import android.content.Context;
import android.os.Message;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.worker.FBWorkerContext;
import com.flybird.worker.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import tb.dv8;
import tb.jst;
import tb.ks9;
import tb.pgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBWorkerContext implements a.AbstractC0248a, JSPlugin.ISession {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int JS_SUCCESS = 0;
    private static final String NS_EXTHUB = "exthub.";
    private static final String NS_FB = "fb.";
    private static final String TAG = "FBWorkerCtx";
    private Context androidContext;
    private c delegate;
    private BirdNestEngine engine;
    private long nWorker;
    private List<ks9<FBWorkerContext, Void>> onDestroyTasks;
    private dv8 safeHandler;
    private com.flybird.worker.a timer = new com.flybird.worker.a(this);
    private String tplId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Response {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements JSPluginManager.ExtHubCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5007a;

        public a(d dVar, boolean z) {
            this.f5007a = z;
        }

        @Override // com.alipay.android.app.template.JSPluginManager.ExtHubCallback
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            } else {
                FBWorkerContext.access$000(FBWorkerContext.this, null, jSONObject, this.f5007a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements JSPluginManager.ExtHubCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5008a;

        public b(d dVar, boolean z) {
            this.f5008a = z;
        }

        @Override // com.alipay.android.app.template.JSPluginManager.ExtHubCallback
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            } else {
                FBWorkerContext.access$000(FBWorkerContext.this, null, jSONObject, this.f5008a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d {
    }

    public FBWorkerContext() {
        this.nWorker = 0L;
        this.nWorker = nCreate();
    }

    private void _handleJSInvokeNoSpace(JSPluginManager jSPluginManager, boolean z, String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2ed337", new Object[]{this, jSPluginManager, new Boolean(z), str, str2, dVar});
            return;
        }
        Context context = this.androidContext;
        BirdNestEngine birdNestEngine = this.engine;
        JSPlugin.FromCall fromCall = JSPlugin.FromCall.INVOKE;
        JSPlugin registeredPlugin = jSPluginManager.getRegisteredPlugin(context, birdNestEngine, fromCall, str, true);
        if (registeredPlugin != null) {
            sendInvokeResult(dVar, registeredPlugin.execute(fromCall, str, str2, null, 0L, this.androidContext, this), z);
        }
    }

    public static /* synthetic */ void access$000(FBWorkerContext fBWorkerContext, d dVar, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4ae17c", new Object[]{fBWorkerContext, dVar, obj, new Boolean(z)});
        } else {
            fBWorkerContext.sendInvokeResult(dVar, obj, z);
        }
    }

    private Response buildJSResponse(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("639c6559", new Object[]{this, new Integer(i), str, str2});
        }
        Response response = new Response();
        if (i == 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.getInt("code");
                jSONObject.optString("message");
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    optJSONObject.toString();
                }
            } catch (Throwable th) {
                pgh.f(TAG, "buildJSResponse, data = " + str, th);
            }
        }
        return response;
    }

    private void cancelTimer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4219f551", new Object[]{this, new Integer(i)});
        } else {
            this.timer.c.removeMessages(i);
        }
    }

    private String clientInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fe4d980", new Object[]{this});
        }
        BirdNestEngine birdNestEngine = this.engine;
        if (birdNestEngine == null || birdNestEngine.getConfig() == null || this.engine.getConfig().getDevicePropProvider() == null) {
            return "{}";
        }
        return this.engine.getConfig().getDevicePropProvider().getProperty("getClientInfo", null);
    }

    private int createTimer(int i, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9361c2f6", new Object[]{this, new Integer(i), new Boolean(z), new Long(j)})).intValue();
        }
        com.flybird.worker.a aVar = this.timer;
        a.b bVar = new a.b(aVar);
        int andIncrement = aVar.b.getAndIncrement();
        bVar.f5010a = andIncrement;
        bVar.b = i;
        bVar.c = z;
        bVar.d = j;
        aVar.c.sendMessageDelayed(Message.obtain(aVar.c, andIncrement, bVar), bVar.b);
        return bVar.f5010a;
    }

    private String getStorageForKey(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2efbe118", new Object[]{this, str, new Boolean(z)});
        }
        return FBDocumentAssistor.a(getEngine().inMemKV, str, z);
    }

    private void handleConsoleLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18b7f86", new Object[]{this, str});
            return;
        }
        throw null;
    }

    private void handleJSException(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff237df9", new Object[]{this, str, str2});
        } else {
            FBDocumentAssistor.a(this.tplId, str, str2);
        }
    }

    private boolean handleJSInvoke(long j, String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c02d7940", new Object[]{this, new Long(j), str, str2, new Long(j2)})).booleanValue();
        }
        throw null;
    }

    private /* synthetic */ void lambda$handleJSInvoke$1(boolean z, boolean z2, String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99754819", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, dVar});
        } else {
            _handleJSInvoke(z, z2, str, str2, dVar);
        }
    }

    private /* synthetic */ void lambda$handleTick$0(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470fb2d4", new Object[]{this, bVar});
            return;
        }
        long j = this.nWorker;
        pgh.i(TAG, "nFireTimer, worker = " + j + ", callback = " + bVar.d);
        if (0 == j) {
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        nFireTimer(j, bVar.d);
    }

    private /* synthetic */ void lambda$sendInvokeResult$2(Object obj, d dVar) {
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06461b6", new Object[]{this, obj, dVar});
            return;
        }
        if (obj == null) {
            obj2 = "{}";
        } else {
            obj2 = obj.toString();
        }
        long j = this.nWorker;
        dVar.getClass();
        nInvokeJSCallback(j, 0L, obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerOnDestroyTasks$3(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596099f5", new Object[]{this, list});
            return;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ks9) it.next()).apply(this);
            }
        } catch (Throwable th) {
            pgh.f(TAG, "triggerOnDestroyTasks err", th);
        }
    }

    private native boolean nConstructWorker(long j, String str, boolean z);

    private native long nCreate();

    private native void nDestroy(long j);

    private native boolean nFireTimer(long j, long j2);

    private native Response nInvokeJS(long j, String str, String str2);

    private native void nInvokeJSCallback(long j, long j2, String str);

    private native void nNotifyEvent(long j, String str, String str2);

    private native boolean nRunWorker(long j, String str);

    private String readFile(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de2a0e80", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    private void sendInvokeResult(d dVar, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6720609", new Object[]{this, dVar, obj, new Boolean(z)});
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    private void setStorage(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c76ac80", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            FBDocumentAssistor.a(getEngine().inMemKV, str, str2, z);
        }
    }

    private void triggerOnDestroyTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7802a12", new Object[]{this});
            return;
        }
        final List<ks9<FBWorkerContext, Void>> list = this.onDestroyTasks;
        if (list != null) {
            this.onDestroyTasks = null;
            jst.d.submit(new Runnable() { // from class: tb.cv8
                @Override // java.lang.Runnable
                public final void run() {
                    FBWorkerContext.this.lambda$triggerOnDestroyTasks$3(list);
                }
            });
        }
    }

    public void addOnDestroyTask(ks9<FBWorkerContext, Void> ks9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38413119", new Object[]{this, ks9Var});
        } else if (this.nWorker != 0) {
            synchronized (this) {
                try {
                    if (this.nWorker != 0) {
                        List<ks9<FBWorkerContext, Void>> list = this.onDestroyTasks;
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        list.add(ks9Var);
                        this.onDestroyTasks = list;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean constructWorker(String str, String str2, c cVar, Context context, BirdNestEngine birdNestEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d5e36ef", new Object[]{this, str, str2, cVar, context, birdNestEngine})).booleanValue();
        }
        this.engine = birdNestEngine;
        this.androidContext = context;
        this.tplId = str2;
        return nConstructWorker(this.nWorker, str, AppContextHolder.b);
    }

    public void destroyWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8347349f", new Object[]{this});
            return;
        }
        long j = this.nWorker;
        if (j != 0) {
            this.timer.c.removeCallbacksAndMessages(null);
            this.nWorker = 0L;
            nDestroy(j);
            triggerOnDestroyTasks();
            this.safeHandler = null;
            pgh.i(TAG, "destroyWorker, worker = " + j);
        }
    }

    public BirdNestEngine getEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine) ipChange.ipc$dispatch("66fb5877", new Object[]{this});
        }
        return this.engine;
    }

    public dv8 getSafeHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dv8) ipChange.ipc$dispatch("1e88de94", new Object[]{this});
        }
        return this.safeHandler;
    }

    @Override // com.flybird.worker.a.AbstractC0248a
    public void handleTick(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6f623d", new Object[]{this, bVar});
            return;
        }
        throw null;
    }

    public Response invokeJS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("2cdf885d", new Object[]{this, str, str2});
        }
        return nInvokeJS(this.nWorker, str, str2);
    }

    public void notifyEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae6dec", new Object[]{this, str, str2});
        } else {
            nNotifyEvent(this.nWorker, str, str2);
        }
    }

    public boolean runWithData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90a07190", new Object[]{this, str})).booleanValue();
        }
        return nRunWorker(this.nWorker, str);
    }

    public void setSafeHandler(dv8 dv8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a8d04e", new Object[]{this, dv8Var});
        } else {
            this.safeHandler = dv8Var;
        }
    }

    private void _handleJSInvoke(boolean z, boolean z2, String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b727dae", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, dVar});
            return;
        }
        JSPluginManager instanse = JSPluginManager.getInstanse();
        if (!z) {
            _handleJSInvokeNoSpace(instanse, z2, str, str2, dVar);
        } else if (str.startsWith(NS_FB)) {
            String substring = str.substring(3);
            Context context = this.androidContext;
            BirdNestEngine birdNestEngine = this.engine;
            JSPlugin.FromCall fromCall = JSPlugin.FromCall.INVOKE;
            JSPlugin registeredPlugin = instanse.getRegisteredPlugin(context, birdNestEngine, fromCall, substring, true);
            if (registeredPlugin != null) {
                sendInvokeResult(dVar, registeredPlugin.execute(fromCall, substring, str2, null, 0L, this.androidContext, this), z2);
            } else if (instanse.isExtHubValid(substring)) {
                instanse.invokeOnExtHub(this.androidContext, substring, str2, new a(dVar, z2), this);
            }
        } else if (str.startsWith(NS_EXTHUB)) {
            try {
                instanse.invokeOnExtHub(this.androidContext, str.substring(7), str2, new b(dVar, z2), this);
            } catch (Throwable th) {
                pgh.f(TAG, "handleJs failed", th);
            }
        } else {
            _handleJSInvokeNoSpace(instanse, z2, str, str2, dVar);
        }
    }
}
