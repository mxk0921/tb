package com.taobao.tao.powermsg.outter;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import anet.channel.appmonitor.AppMonitor;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.CountPowerMessage;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.managers.MsgManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a71;
import tb.ibd;
import tb.kbd;
import tb.kpw;
import tb.m2r;
import tb.mlm;
import tb.n2r;
import tb.nsw;
import tb.p70;
import tb.sjl;
import tb.t2o;
import tb.xuf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PowerMsg4WW extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL = "windvane";
    public static final String EVENT_DISPATCH = "powermsg.dispatch";
    public static final String EVENT_DISPATCH_BATCH = "powermsg.dispatch.batch";
    public static final String KEY_BIZ = "bizCode";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_CODE = "errorCode";
    public static final String KEY_CONTEXT = "context";
    public static final String KEY_DATA = "data";
    public static final String KEY_DELAY = "delay";
    public static final String KEY_DUP = "needAck";
    public static final String KEY_END_SEQ = "endSeq";
    public static final String KEY_FROM = "from";
    public static final String KEY_FULL_TAGS = "sendFullTags";
    public static final String KEY_ID = "messageId";
    public static final String KEY_INDEX = "index";
    public static final String KEY_INFO = "info";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_MODE = "mode";
    public static final String KEY_NAMESPACE = "namespace";
    public static final String KEY_PARAM = "param";
    public static final String KEY_PRIORITY = "priority";
    public static final String KEY_QOS = "Qos";
    public static final String KEY_REENTRANT = "reentrant";
    public static final String KEY_ROUTE_GROUP = "routeGroup";
    public static final String KEY_SEQ = "seqNr";
    public static final String KEY_SEQ_INTERVAL = "seqSnapshotInterval";
    public static final String KEY_SIZE = "pageSize";
    public static final String KEY_START_SEQ = "startSeq";
    public static final String KEY_STREAM = "streamId";
    public static final String KEY_SYNC_TIMEOUT = "syncTimeoutInMill";
    private static final String KEY_TAG = "bizTag";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_TO = "to";
    public static final String KEY_TOPIC = "topic";
    public static final String KEY_TYPE = "subType";
    public static final String KEY_USER = "userId";
    public static final String MODULE = "powermsg";
    private static final String TAG = "MESSAGES_4WW";
    private Dispatcher dispatcher;
    private final Map<Integer, HashMap<String, Integer>> mDispatchers = new ConcurrentHashMap();
    private IWVWebView webView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class Dispatcher implements kbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12599a;
        public final Map<String, Pair<AtomicInteger, PriorityQueue<PowerMessage>>> b;
        public String c;
        public long d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Comparator<PowerMessage> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(Dispatcher dispatcher) {
            }

            /* renamed from: a */
            public int compare(PowerMessage powerMessage, PowerMessage powerMessage2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("faac369f", new Object[]{this, powerMessage, powerMessage2})).intValue();
                }
                return (int) (powerMessage.seqNum - powerMessage2.seqNum);
            }
        }

        static {
            t2o.a(628097332);
            t2o.a(628097219);
        }

        public Dispatcher() {
            this.f12599a = 1;
            this.b = new ConcurrentHashMap();
        }

        @Override // tb.kbd
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
            } else if (PowerMsg4WW.access$200(PowerMsg4WW.this) != null) {
                new StringBuilder("onError ").append(i);
                WVStandardEventCenter.postNotificationToJS(PowerMsg4WW.access$200(PowerMsg4WW.this), PowerMsg4WW.EVENT_DISPATCH, new JSONObject(i, obj) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.Dispatcher.3
                    public final /* synthetic */ int val$code;
                    public final /* synthetic */ Object val$param;

                    {
                        this.val$code = i;
                        this.val$param = obj;
                        put("errorCode", (Object) Integer.valueOf(i));
                        put("data", obj);
                    }
                }.toString());
            }
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2fe44df", new Object[]{this, new Integer(i)});
            } else {
                this.f12599a = Math.max(1, i);
            }
        }

        public /* synthetic */ Dispatcher(PowerMsg4WW powerMsg4WW, b bVar) {
            this();
        }

        public final void c(PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff8c8b20", new Object[]{this, powerMessage});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) 1000);
                jSONObject.put("namespace", Integer.valueOf(powerMessage.bizCode));
                jSONObject.put("topic", powerMessage.topic);
                jSONObject.put("streamId", powerMessage.streamId);
                jSONObject.put("seqNr", Long.valueOf(powerMessage.seqNum));
                long j = 0;
                if (powerMessage.dataList != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (PowerMessage.a aVar : powerMessage.dataList) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("messageId", (Object) aVar.a());
                        jSONObject2.put("data", (Object) Base64.encodeToString(aVar.b(), 2));
                        jSONArray.add(jSONObject2);
                        j = PowerMsg4WW.getDownRT(aVar, powerMessage, powerMessage.dataList.size());
                    }
                    jSONObject.put("list", (Object) jSONArray);
                }
                jSONObject.put("delay", Long.valueOf(j));
                WVStandardEventCenter.postNotificationToJS(PowerMsg4WW.access$200(PowerMsg4WW.this), PowerMsg4WW.EVENT_DISPATCH_BATCH, jSONObject.toString());
                MsgLog.g(PowerMsg4WW.TAG, "postStreamMessage to js", "topic:", powerMessage.topic, "msgId:", powerMessage.messageId, "seqNum:", Long.valueOf(powerMessage.seqNum), "stream:", powerMessage.streamId);
            } catch (Throwable th) {
                MsgLog.f(PowerMsg4WW.TAG, th, "postStreamMessage err");
            }
            if (TextUtils.isEmpty(this.c) || !this.c.equals(powerMessage.streamId)) {
                this.c = powerMessage.streamId;
                this.d = powerMessage.seqNum;
            } else {
                long j2 = powerMessage.seqNum;
                long j3 = this.d;
                if (j2 < j3 || j2 - j3 > 1) {
                    MsgLog.g(PowerMsg4WW.TAG, "out of order: ", "msgId:", powerMessage.messageId, "seqNum:", Long.valueOf(j2), "streamCacheSeq", Long.valueOf(this.d));
                    a71.a(a71.POINT_MSG_ORDER, "", "", "");
                } else {
                    a71.b(a71.POINT_MSG_ORDER, "");
                }
            }
            this.d = Math.max(powerMessage.seqNum, this.d);
        }

        @Override // tb.kbd
        public void b(PowerMessage powerMessage) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97513d8e", new Object[]{this, powerMessage});
            } else if (powerMessage == null) {
                MsgLog.g(PowerMsg4WW.TAG, "onDispatch() msg = NULL");
            } else if (PowerMsg4WW.access$200(PowerMsg4WW.this) == null) {
                MsgLog.g(PowerMsg4WW.TAG, "onDispatch() webView = NULL");
            } else if (!TextUtils.isEmpty(powerMessage.streamId)) {
                Pair pair = (Pair) ((ConcurrentHashMap) this.b).get(powerMessage.streamId);
                if (pair == null) {
                    pair = Pair.create(new AtomicInteger(this.f12599a), new PriorityQueue(64, new a(this)));
                    ((ConcurrentHashMap) this.b).put(powerMessage.streamId, pair);
                }
                AtomicInteger atomicInteger = (AtomicInteger) pair.first;
                PriorityQueue priorityQueue = (PriorityQueue) pair.second;
                synchronized (pair) {
                    try {
                        int i = (int) powerMessage.seqNum;
                        if (i < atomicInteger.get()) {
                            MsgLog.g(PowerMsg4WW.TAG, "onDispatch() seqNr < startSeq", "seqNr", Integer.valueOf(i), "mSeq", atomicInteger);
                        } else if (i > atomicInteger.get()) {
                            MsgLog.g(PowerMsg4WW.TAG, "onDispatch() offer queue", "seqNr", Integer.valueOf(i), "mSeq", atomicInteger);
                            if (!priorityQueue.contains(powerMessage)) {
                                priorityQueue.offer(powerMessage);
                            } else {
                                MsgLog.e(PowerMsg4WW.TAG, "onDispatch() contains", "seqNr", Integer.valueOf(i));
                            }
                        } else {
                            do {
                                int incrementAndGet = atomicInteger.incrementAndGet();
                                c(powerMessage);
                                powerMessage = (PowerMessage) priorityQueue.peek();
                                if (powerMessage == null || powerMessage.seqNum != incrementAndGet) {
                                    z = false;
                                } else {
                                    powerMessage = (PowerMessage) priorityQueue.poll();
                                }
                                if (!z) {
                                    break;
                                }
                            } while (powerMessage != null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                WVStandardEventCenter.postNotificationToJS(PowerMsg4WW.access$200(PowerMsg4WW.this), PowerMsg4WW.EVENT_DISPATCH, new JSONObject(powerMessage) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.Dispatcher.2
                    public final /* synthetic */ PowerMessage val$tmpMsg;

                    {
                        this.val$tmpMsg = powerMessage;
                        put("errorCode", (Object) 1000);
                        put("data", (Object) PowerMsg4WW.this.toMap(powerMessage));
                    }
                }.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12600a;
        public final /* synthetic */ WVCallBackContext b;

        public a(String str, WVCallBackContext wVCallBackContext) {
            this.f12600a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12600a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12601a;
        public final /* synthetic */ WVCallBackContext b;

        public b(String str, WVCallBackContext wVCallBackContext) {
            this.f12601a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12601a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12602a;
        public final /* synthetic */ WVCallBackContext b;

        public c(String str, WVCallBackContext wVCallBackContext) {
            this.f12602a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12602a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12603a;
        public final /* synthetic */ WVCallBackContext b;

        public d(String str, WVCallBackContext wVCallBackContext) {
            this.f12603a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12603a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12604a;
        public final /* synthetic */ WVCallBackContext b;

        public e(String str, WVCallBackContext wVCallBackContext) {
            this.f12604a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12604a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12605a;
        public final /* synthetic */ WVCallBackContext b;

        public f(String str, WVCallBackContext wVCallBackContext) {
            this.f12605a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12605a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12606a;
        public final /* synthetic */ WVCallBackContext b;

        public g(String str, WVCallBackContext wVCallBackContext) {
            this.f12606a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12606a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12607a;
        public final /* synthetic */ WVCallBackContext b;

        public h(String str, WVCallBackContext wVCallBackContext) {
            this.f12607a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12607a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12608a;
        public final /* synthetic */ WVCallBackContext b;

        public i(String str, WVCallBackContext wVCallBackContext) {
            this.f12608a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4WW.access$100(PowerMsg4WW.this, i, map, this.f12608a, this.b);
            }
        }
    }

    static {
        t2o.a(628097316);
    }

    public static /* synthetic */ void access$100(PowerMsg4WW powerMsg4WW, int i2, Map map, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22655e1", new Object[]{powerMsg4WW, new Integer(i2), map, str, wVCallBackContext});
        } else {
            powerMsg4WW.invoke(i2, map, str, wVCallBackContext);
        }
    }

    public static /* synthetic */ IWVWebView access$200(PowerMsg4WW powerMsg4WW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("57cdf4a1", new Object[]{powerMsg4WW});
        }
        return powerMsg4WW.webView;
    }

    private void invoke(int i2, Map<String, Object> map, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20b0c68", new Object[]{this, new Integer(i2), map, str, wVCallBackContext});
            return;
        }
        new StringBuilder("invoke ").append(i2);
        wVCallBackContext.success(new JSONObject(i2, map, str) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.12
            public final /* synthetic */ String val$context;
            public final /* synthetic */ Map val$map;
            public final /* synthetic */ int val$result;

            {
                this.val$result = i2;
                this.val$map = map;
                this.val$context = str;
                put("errorCode", (Object) Integer.valueOf(i2));
                put("data", (Object) map);
                put("context", (Object) str);
            }
        }.toString());
    }

    public static /* synthetic */ Object ipc$super(PowerMsg4WW powerMsg4WW, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/outter/PowerMsg4WW");
    }

    public void count(int i2, String str, boolean z, Map<String, Double> map, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c7426f", new Object[]{this, new Integer(i2), str, new Boolean(z), map, str2, wVCallBackContext});
        } else {
            mlm.b(i2, str, map, z, new a(str2, wVCallBackContext), str2);
        }
    }

    public void multiRegisterCallback(int i2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a9ec58", new Object[]{this, new Integer(i2), wVCallBackContext});
        } else {
            registerCallback(i2, wVCallBackContext);
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MsgLog.g(TAG, "onDestroy()");
        synchronized (this.mDispatchers) {
            try {
                for (Map.Entry<Integer, HashMap<String, Integer>> entry : this.mDispatchers.entrySet()) {
                    HashMap<String, Integer> value = entry.getValue();
                    if (value != null) {
                        for (String str : value.keySet()) {
                            unSubscribeStream(entry.getKey().intValue(), str, null, null, false, null);
                        }
                    }
                }
                this.mDispatchers.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void queryMessagesByStream(int i2, String str, sjl sjlVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b4b993", new Object[]{this, new Integer(i2), str, sjlVar, wVCallBackContext});
        } else if (mlm.f(i2, str, sjlVar)) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error(nsw.RET_FAIL);
        }
    }

    public void registerCallback(int i2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322e8991", new Object[]{this, new Integer(i2), wVCallBackContext});
            return;
        }
        new StringBuilder("registerCallback ").append(i2);
        this.webView = wVCallBackContext.getWebview();
    }

    public void requestTopicStatus(int i2, String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828af2fb", new Object[]{this, new Integer(i2), str, str2, wVCallBackContext});
        } else {
            mlm.l(i2, str, 402, 0, 0, new ibd(this) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ibd
                public void a(int i3, Map<String, Object> map, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i3), map, objArr});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (i3 == 1000 && map != null) {
                        Object obj = map.get("data");
                        if (obj instanceof m2r) {
                            m2r m2rVar = (m2r) obj;
                            int i4 = m2rVar.c;
                            hashMap.put("visitNum", Integer.valueOf(m2rVar.f23744a));
                            hashMap.put("onlineNum", Integer.valueOf(m2rVar.b));
                            hashMap.put("totalNum", Integer.valueOf(m2rVar.c));
                            hashMap.put("msgNum", Integer.valueOf(m2rVar.d));
                            hashMap.put("digNum", Integer.valueOf(m2rVar.e));
                        }
                    }
                    wVCallBackContext.success(new JSONObject(i3, hashMap) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.10.1
                        public final /* synthetic */ HashMap val$data;
                        public final /* synthetic */ int val$result;

                        {
                            this.val$result = i3;
                            this.val$data = hashMap;
                            put("errorCode", (Object) Integer.valueOf(i3));
                            put("status", (Object) hashMap);
                            put("context", (Object) str2);
                        }
                    }.toString());
                }
            }, str2);
        }
    }

    public void requestTopicUserList(int i2, String str, int i3, int i4, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41fd064", new Object[]{this, new Integer(i2), str, new Integer(i3), new Integer(i4), str2, wVCallBackContext});
        } else {
            mlm.l(i2, str, 403, i3, i4, new ibd(this) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ibd
                public void a(int i5, Map<String, Object> map, Object... objArr) {
                    n2r.a[] aVarArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i5), map, objArr});
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (i5 == 1000 && map != null) {
                        Object obj = map.get("data");
                        if (obj instanceof n2r) {
                            for (n2r.a aVar : ((n2r) obj).f24471a) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("userId", aVar.f24472a);
                                hashMap.put("nick", aVar.b);
                                hashMap.put("addTime", Long.valueOf(aVar.c));
                                arrayList.add(hashMap);
                            }
                        }
                    }
                    wVCallBackContext.success(new JSONObject(i5, arrayList) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.9.1
                        public final /* synthetic */ List val$data;
                        public final /* synthetic */ int val$result;

                        {
                            this.val$result = i5;
                            this.val$data = arrayList;
                            put("errorCode", (Object) Integer.valueOf(i5));
                            put("users", (Object) arrayList.toArray());
                            put("context", (Object) str2);
                        }
                    }.toString());
                }
            }, str2);
        }
    }

    public void sendMessage(int i2, Map<String, Object> map, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5c6c8f", new Object[]{this, new Integer(i2), map, str, wVCallBackContext});
        } else {
            mlm.k(i2, fromMap(0, i2, map), new h(str, wVCallBackContext), str);
        }
    }

    public void sendStreamMessage(int i2, Map<String, Object> map, sjl sjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b234ebc9", new Object[]{this, new Integer(i2), map, sjlVar});
        } else {
            mlm.m(i2, fromMap(0, i2, map), sjlVar, null, new Object[0]);
        }
    }

    public void sendTextMessage(int i2, Map<String, Object> map, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec43ce2", new Object[]{this, new Integer(i2), map, str, wVCallBackContext});
        } else {
            mlm.n(i2, (TextPowerMessage) fromMap(101, i2, map), new i(str, wVCallBackContext), str);
        }
    }

    public void setMsgFetchMode(int i2, String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i2), str, new Integer(i3)});
            return;
        }
        StringBuilder sb = new StringBuilder("setMsgFetchMode ");
        sb.append(i2);
        sb.append(" ");
        sb.append(i3);
        mlm.o(i2, str, i3);
    }

    public void subscribeByTag(int i2, String str, String str2, String str3, String str4, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7bcb48", new Object[]{this, new Integer(i2), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        Dispatcher dispatcher = new Dispatcher(this, null);
        this.dispatcher = dispatcher;
        mlm.h(i2, dispatcher);
        mlm.r(i2, str, str2, str3, "", new b(str4, wVCallBackContext), str4);
    }

    public Map<String, Object> toMap(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce5810db", new Object[]{this, powerMessage});
        }
        return new HashMap<String, Object>(powerMessage) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.13
            public final /* synthetic */ PowerMessage val$msg;

            {
                Object encodeToString;
                String str;
                this.val$msg = powerMessage;
                put("subType", Integer.valueOf(powerMessage.type));
                put("messageId", powerMessage.messageId);
                put("priority", Integer.valueOf(powerMessage.priority));
                put("Qos", Integer.valueOf(powerMessage.qosLevel));
                put("sendFullTags", Boolean.valueOf(powerMessage.sendFullTags));
                put("tags", powerMessage.tags);
                put("userId", powerMessage.userId);
                put("needAck", Boolean.valueOf(powerMessage.needAck));
                put("bizCode", Integer.valueOf(powerMessage.bizCode));
                put("topic", powerMessage.topic);
                put("from", powerMessage.from);
                put("to", powerMessage.to);
                put("timestamp", Long.valueOf(powerMessage.timestamp));
                int i2 = powerMessage.type;
                if (i2 == 101) {
                    put("message", ((TextPowerMessage) powerMessage).text);
                    encodeToString = ((TextPowerMessage) powerMessage).value;
                    str = "param";
                } else if (i2 == 102) {
                    encodeToString = ((CountPowerMessage) powerMessage).value;
                    str = "info";
                } else if (i2 == 103) {
                    xuf xufVar = (xuf) powerMessage;
                    put("totalCount", Integer.valueOf(xufVar.f31613a));
                    put("onlineCount", Integer.valueOf(xufVar.b));
                    put("addUsers", xufVar.c);
                    encodeToString = Long.valueOf(xufVar.d);
                    str = "pageViewCount";
                } else {
                    encodeToString = Base64.encodeToString(powerMessage.data, 2);
                    str = "data";
                }
                put(str, encodeToString);
            }
        };
    }

    public void unSubscribeByTag(int i2, String str, String str2, String str3, String str4, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f34df6f", new Object[]{this, new Integer(i2), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        mlm.w(i2, str, str2, str3, "", new d(str4, wVCallBackContext), str4);
        this.dispatcher = null;
    }

    public PowerMessage fromMap(int i2, int i3, Map<String, Object> map) {
        TextPowerMessage textPowerMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("d18e22aa", new Object[]{this, new Integer(i2), new Integer(i3), map});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        PowerMessage powerMessage = new PowerMessage();
        if (i2 == 101) {
            TextPowerMessage textPowerMessage2 = new TextPowerMessage();
            textPowerMessage2.text = (String) map.get("message");
            Object obj = map.get("param");
            textPowerMessage = textPowerMessage2;
            if (obj instanceof JSONObject) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : ((JSONObject) obj).entrySet()) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
                textPowerMessage2.value = hashMap;
                textPowerMessage = textPowerMessage2;
            }
        } else {
            Integer num = (Integer) map.get("subType");
            textPowerMessage = powerMessage;
            if (num != null) {
                powerMessage.type = num.intValue();
                textPowerMessage = powerMessage;
            }
        }
        textPowerMessage.bizCode = i3;
        textPowerMessage.topic = (String) map.get("topic");
        textPowerMessage.userId = (String) map.get("userId");
        textPowerMessage.from = (String) map.get("from");
        textPowerMessage.to = (String) map.get("to");
        Boolean bool = (Boolean) map.get("sendFullTags");
        if (bool != null) {
            textPowerMessage.sendFullTags = bool.booleanValue();
        }
        List list = (List) map.get("tags");
        if (list != null) {
            textPowerMessage.tags = (String[]) list.toArray(new String[list.size()]);
        }
        Integer num2 = (Integer) map.get("Qos");
        if (num2 != null) {
            textPowerMessage.qosLevel = num2.intValue();
        }
        Integer num3 = (Integer) map.get("priority");
        if (num3 != null) {
            textPowerMessage.priority = num3.intValue();
        }
        Boolean bool2 = (Boolean) map.get("needAck");
        if (bool2 != null) {
            textPowerMessage.needAck = bool2.booleanValue();
        }
        String str = (String) map.get("data");
        if (str != null) {
            textPowerMessage.data = Base64.decode(str, 2);
        }
        return textPowerMessage;
    }

    private synchronized void registerStableDispatcher(int i2, String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fefa2", new Object[]{this, new Integer(i2), str, new Integer(i3)});
            return;
        }
        if (mlm.d(i2, str) == null) {
            MsgLog.g(TAG, "registerStableDispatcher bizCode=" + i2 + " startSeq=" + i3);
            Dispatcher dispatcher = new Dispatcher(this, null);
            dispatcher.d(i3);
            mlm.i(i2, str, dispatcher);
        }
    }

    public void multiSubscribeByTag(int i2, String str, String str2, String str3, String str4, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334e04cf", new Object[]{this, new Integer(i2), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        Dispatcher dispatcher = new Dispatcher(this, null);
        this.dispatcher = dispatcher;
        mlm.g(i2, "windvane", dispatcher);
        mlm.q(i2, str, "windvane", str2, str3, "", new f(str4, wVCallBackContext), str4);
    }

    public static long getDownRT(PowerMessage.a aVar, PowerMessage powerMessage, int i2) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b154a6d", new Object[]{aVar, powerMessage, new Integer(i2)})).longValue();
        }
        try {
            StreamFullLinkMonitor e2 = MsgManager.e(aVar.a());
            if (e2 == null) {
                return 0L;
            }
            e2.accsDataId = powerMessage.messageId;
            e2.msgId = aVar.a();
            e2.setPmDownTime(powerMessage.pmDownTime);
            StreamFullLinkMonitor streamFullLinkMonitor = powerMessage.fullLink;
            if (streamFullLinkMonitor != null) {
                e2.setAccsDownTime(streamFullLinkMonitor.getAccsDownTime());
                e2.setNetSDKReceivedTime(powerMessage.fullLink.getNetSDKReceivedTime());
                e2.setAccsReceivedTime(powerMessage.fullLink.getAccsReceivedTime());
                e2.setPmReceivedTime(powerMessage.fullLink.getPmReceivedTime());
                e2.setPmCallbackTime(p70.a());
                j = e2.getPmCallbackTime() - e2.getPmDownTime();
            } else {
                j = 0;
            }
            AppMonitor.getInstance().commitStat(e2);
            long pmCallbackTime = e2.getPmCallbackTime() - e2.getPmUpTime();
            if (MsgLog.k(MsgLog.Level.D)) {
                MsgLog.e(TAG, "postStreamMessage monitor", "dataid:", powerMessage.messageId, "msgid:", aVar.a(), "fullDelay:", Long.valueOf(pmCallbackTime), "monitor:" + e2);
            }
            return j;
        } catch (Throwable th) {
            MsgLog.f(TAG, th, "getDownRT err");
            return 0L;
        }
    }

    public void multiUnSubscribeByTag(int i2, String str, String str2, String str3, String str4, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5ed336", new Object[]{this, new Integer(i2), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        mlm.v(i2, str, "windvane", str2, str3, "", new g(str4, wVCallBackContext), str4);
        this.dispatcher = null;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str2);
        try {
            int intValue = parseObject.getIntValue("bizCode");
            int intValue2 = parseObject.getIntValue("namespace");
            String string = parseObject.getString("topic");
            String string2 = parseObject.getString("context");
            if ("registerCallback".equals(str)) {
                registerCallback(intValue, wVCallBackContext);
                return true;
            } else if ("registerCallback2".equals(str)) {
                registerCallback(intValue, wVCallBackContext);
                wVCallBackContext.success();
                return true;
            } else if ("multiRegisterCallback".equals(str)) {
                multiRegisterCallback(intValue, wVCallBackContext);
                return true;
            } else if ("setMsgFetchMode".equals(str)) {
                setMsgFetchMode(intValue, string, parseObject.getIntValue("mode"));
                return true;
            } else if ("setMsgFetchMode2".equals(str)) {
                setMsgFetchMode(intValue, string, parseObject.getIntValue("mode"));
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            } else if ("subscribeByTag".equals(str)) {
                subscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
                return true;
            } else if ("multiSubscribeByStream".equals(str)) {
                registerCallback(intValue2, wVCallBackContext);
                if (parseObject.get(KEY_START_SEQ) instanceof Integer) {
                    sjl sjlVar = new sjl();
                    sjlVar.n(parseObject.getIntValue(KEY_START_SEQ));
                    sjlVar.p(parseObject.getLongValue(KEY_SYNC_TIMEOUT));
                    sjlVar.m(parseObject.getIntValue(KEY_SEQ_INTERVAL));
                    sjlVar.l(parseObject.getString(KEY_ROUTE_GROUP));
                    sjlVar.k(parseObject.getBooleanValue(KEY_REENTRANT));
                    if ("mtop".equals(parseObject.getString("channel"))) {
                        sjlVar.i(1);
                    } else {
                        sjlVar.i(2);
                    }
                    subscribeStream(intValue2, string, parseObject.getString("from"), string2, sjlVar, wVCallBackContext);
                    return true;
                }
                wVCallBackContext.error("param 'startSeq' not instanceof int");
                return false;
            } else {
                if ("unSubscribeByTag".equals(str)) {
                    unSubscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
                } else if ("multiUnSubscribeByStream".equals(str)) {
                    unSubscribeStream(intValue2, string, parseObject.getString("from"), string2, true, wVCallBackContext);
                    return true;
                } else if ("multiSubscribeByTag".equals(str)) {
                    multiSubscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
                    return true;
                } else if ("multiUnSubscribeByTag".equals(str)) {
                    multiUnSubscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
                    return true;
                } else if ("sendMessage".equals(str)) {
                    sendMessage(intValue, parseObject, string2, wVCallBackContext);
                    return true;
                } else if ("sendMessageByStream".equals(str)) {
                    if (com.taobao.tao.powermsg.managers.a.f(intValue2, string) != null) {
                        String string3 = parseObject.getString("streamId");
                        if (!TextUtils.isEmpty(string3)) {
                            sjl sjlVar2 = new sjl();
                            sjlVar2.o(string3);
                            if ("accs1".equals(parseObject.getString("channel"))) {
                                sjlVar2.i(0);
                            } else {
                                sjlVar2.i(2);
                            }
                            sendStreamMessage(intValue2, parseObject, sjlVar2);
                            if (wVCallBackContext != null) {
                                wVCallBackContext.success();
                            }
                            return true;
                        } else if (wVCallBackContext == null) {
                            return false;
                        } else {
                            wVCallBackContext.error("param 'streamId' is NULL");
                            return false;
                        }
                    } else if (wVCallBackContext == null) {
                        return false;
                    } else {
                        wVCallBackContext.error("Not login or subscribe");
                        return false;
                    }
                } else if ("queryMessagesByStream".equals(str)) {
                    try {
                        sjl sjlVar3 = new sjl();
                        sjlVar3.n(parseObject.getIntValue(KEY_START_SEQ));
                        sjlVar3.j(parseObject.getIntValue(KEY_END_SEQ));
                        queryMessagesByStream(intValue2, string, sjlVar3, wVCallBackContext);
                        return true;
                    } catch (Exception e2) {
                        if (wVCallBackContext == null) {
                            return false;
                        }
                        wVCallBackContext.error("queryMessagesByStream err: " + e2);
                        return false;
                    }
                } else if ("sendTextMessage".equals(str)) {
                    sendTextMessage(intValue, parseObject, string2, wVCallBackContext);
                    return true;
                } else if ("requestTopicUserList".equals(str)) {
                    requestTopicUserList(intValue, string, parseObject.getIntValue("index"), parseObject.getIntValue("pageSize"), string2, wVCallBackContext);
                    return true;
                } else if ("requestTopicStatus".equals(str)) {
                    requestTopicStatus(intValue, string, string2, wVCallBackContext);
                    return true;
                } else if ("count".equals(str)) {
                    JSONObject jSONObject = parseObject.getJSONObject("param");
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        hashMap.put(entry.getKey(), Double.valueOf(Double.parseDouble(entry.getValue().toString())));
                    }
                    count(intValue, string, parseObject.getBooleanValue("needAck"), hashMap, string2, wVCallBackContext);
                    return true;
                }
                return false;
            }
        } catch (Exception e3) {
            MsgLog.f(TAG, e3, "execute err");
            return false;
        }
    }

    private void subscribeStream(int i2, String str, String str2, String str3, sjl sjlVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713449de", new Object[]{this, new Integer(i2), str, str2, str3, sjlVar, wVCallBackContext});
            return;
        }
        MsgLog.g(TAG, "subscribeStream ", Integer.valueOf(i2), str);
        synchronized (this.mDispatchers) {
            try {
                if (this.mDispatchers.get(Integer.valueOf(i2)) == null) {
                    this.mDispatchers.put(Integer.valueOf(i2), new HashMap<>());
                }
                this.mDispatchers.get(Integer.valueOf(i2)).put(str, Integer.valueOf(sjlVar.a()));
            } catch (Throwable th) {
                throw th;
            }
        }
        registerStableDispatcher(i2, str, sjlVar.e());
        mlm.p(i2, str, null, str2, "", "", new c(str3, wVCallBackContext), sjlVar, str3);
    }

    private void unSubscribeStream(int i2, String str, String str2, String str3, boolean z, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2d3a8", new Object[]{this, new Integer(i2), str, str2, str3, new Boolean(z), wVCallBackContext});
            return;
        }
        MsgLog.g(TAG, "unSubscribeStream ", Integer.valueOf(i2), str);
        sjl sjlVar = new sjl();
        synchronized (this.mDispatchers) {
            try {
                HashMap<String, Integer> hashMap = this.mDispatchers.get(Integer.valueOf(i2));
                if (hashMap != null) {
                    sjlVar.i(hashMap.get(str).intValue());
                    if (z) {
                        hashMap.remove(str);
                    }
                }
                if (z && (hashMap == null || hashMap.size() == 0)) {
                    this.mDispatchers.remove(Integer.valueOf(i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mlm.t(i2, str);
        mlm.u(i2, str, null, str2, "", "", new e(str3, wVCallBackContext), sjlVar, str3);
    }
}
