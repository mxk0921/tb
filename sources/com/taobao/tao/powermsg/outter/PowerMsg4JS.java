package com.taobao.tao.powermsg.outter;

import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.common.CountPowerMessage;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ibd;
import tb.kbd;
import tb.m2r;
import tb.mlm;
import tb.n2r;
import tb.t2o;
import tb.xuf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PowerMsg4JS extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL = "weex";
    public static final String KEY_BIZ = "bizCode";
    public static final String KEY_CODE = "errorCode";
    public static final String KEY_CONTEXT = "context";
    public static final String KEY_DATA = "data";
    public static final String KEY_DUP = "needAck";
    public static final String KEY_FROM = "from";
    public static final String KEY_FULL_TAGS = "sendFullTags";
    public static final String KEY_ID = "messageId";
    public static final String KEY_INFO = "info";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_PARAM = "param";
    public static final String KEY_PRIORITY = "priority";
    public static final String KEY_QOS = "Qos";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_TO = "to";
    public static final String KEY_TOPIC = "topic";
    public static final String KEY_TYPE = "subType";
    public static final String KEY_USER = "userId";
    public static final String MODULE = "powermsg";
    private static final String TAG = "MESSAGES_4JS";
    private Dispatcher dispatcher;
    private JSCallback jsCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class Dispatcher implements kbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097313);
            t2o.a(628097219);
        }

        public Dispatcher() {
        }

        @Override // tb.kbd
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
                return;
            }
            new StringBuilder("onError ").append(i);
            PowerMsg4JS.access$200(PowerMsg4JS.this).invokeAndKeepAlive(new HashMap<String, Object>(i, obj) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.Dispatcher.2
                public final /* synthetic */ int val$code;
                public final /* synthetic */ Object val$param;

                {
                    this.val$code = i;
                    this.val$param = obj;
                    put("errorCode", Integer.valueOf(i));
                    put("data", obj);
                }
            });
        }

        @Override // tb.kbd
        public void b(PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97513d8e", new Object[]{this, powerMessage});
                return;
            }
            new StringBuilder("onDispatch ").append(powerMessage.topic);
            PowerMsg4JS.access$200(PowerMsg4JS.this).invokeAndKeepAlive(new HashMap<String, Object>(powerMessage) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.Dispatcher.1
                public final /* synthetic */ PowerMessage val$msg;

                {
                    this.val$msg = powerMessage;
                    put("errorCode", 1000);
                    put("data", PowerMsg4JS.this.toMap(powerMessage));
                }
            });
        }

        public /* synthetic */ Dispatcher(PowerMsg4JS powerMsg4JS, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12590a;
        public final /* synthetic */ JSCallback b;

        public a(String str, JSCallback jSCallback) {
            this.f12590a = str;
            this.b = jSCallback;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4JS.access$100(PowerMsg4JS.this, i, map, this.f12590a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12591a;
        public final /* synthetic */ JSCallback b;

        public b(String str, JSCallback jSCallback) {
            this.f12591a = str;
            this.b = jSCallback;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4JS.access$100(PowerMsg4JS.this, i, map, this.f12591a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12592a;
        public final /* synthetic */ JSCallback b;

        public c(String str, JSCallback jSCallback) {
            this.f12592a = str;
            this.b = jSCallback;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4JS.access$100(PowerMsg4JS.this, i, map, this.f12592a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12593a;
        public final /* synthetic */ JSCallback b;

        public d(String str, JSCallback jSCallback) {
            this.f12593a = str;
            this.b = jSCallback;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4JS.access$100(PowerMsg4JS.this, i, map, this.f12593a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12594a;
        public final /* synthetic */ JSCallback b;

        public e(String str, JSCallback jSCallback) {
            this.f12594a = str;
            this.b = jSCallback;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4JS.access$100(PowerMsg4JS.this, i, map, this.f12594a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12595a;
        public final /* synthetic */ JSCallback b;

        public f(String str, JSCallback jSCallback) {
            this.f12595a = str;
            this.b = jSCallback;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4JS.access$100(PowerMsg4JS.this, i, map, this.f12595a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12596a;
        public final /* synthetic */ JSCallback b;

        public g(String str, JSCallback jSCallback) {
            this.f12596a = str;
            this.b = jSCallback;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
            } else {
                PowerMsg4JS.access$100(PowerMsg4JS.this, i, map, this.f12596a, this.b);
            }
        }
    }

    static {
        t2o.a(628097299);
    }

    public static /* synthetic */ void access$100(PowerMsg4JS powerMsg4JS, int i, Map map, String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc052cd", new Object[]{powerMsg4JS, new Integer(i), map, str, jSCallback});
        } else {
            powerMsg4JS.invoke(i, map, str, jSCallback);
        }
    }

    public static /* synthetic */ JSCallback access$200(PowerMsg4JS powerMsg4JS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSCallback) ipChange.ipc$dispatch("90d4c968", new Object[]{powerMsg4JS});
        }
        return powerMsg4JS.jsCallback;
    }

    private void invoke(int i, Map<String, Object> map, String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f39c3fd", new Object[]{this, new Integer(i), map, str, jSCallback});
            return;
        }
        new StringBuilder("invoke ").append(i);
        jSCallback.invoke(new HashMap<String, Object>(i, map, str) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.10
            public final /* synthetic */ String val$context;
            public final /* synthetic */ Map val$map;
            public final /* synthetic */ int val$result;

            {
                this.val$result = i;
                this.val$map = map;
                this.val$context = str;
                put("errorCode", Integer.valueOf(i));
                put("data", map);
                put("context", str);
            }
        });
    }

    public static /* synthetic */ Object ipc$super(PowerMsg4JS powerMsg4JS, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/outter/PowerMsg4JS");
    }

    @WXModuleAnno
    public void count(int i, String str, boolean z, Map<String, Double> map, String str2, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd728316", new Object[]{this, new Integer(i), str, new Boolean(z), map, str2, jSCallback});
        } else {
            mlm.b(i, str, map, z, new g(str2, jSCallback), str2);
        }
    }

    @WXModuleAnno
    public void multiRegisterCallback(int i, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ed460d", new Object[]{this, new Integer(i), jSCallback});
        } else {
            registerCallback(i, jSCallback);
        }
    }

    @WXModuleAnno
    public void registerCallback(int i, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330dcbb4", new Object[]{this, new Integer(i), jSCallback});
            return;
        }
        new StringBuilder("registerDispatcher ").append(i);
        this.jsCallback = jSCallback;
    }

    @WXModuleAnno
    public void requestTopicStatus(int i, String str, final String str2, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb12f90a", new Object[]{this, new Integer(i), str, str2, jSCallback});
        } else {
            mlm.l(i, str, 402, 0, 0, new ibd(this) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ibd
                public void a(int i2, Map<String, Object> map, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i2), map, objArr});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (i2 == 1000 && map != null) {
                        Object obj = map.get("data");
                        if (obj instanceof m2r) {
                            m2r m2rVar = (m2r) obj;
                            int i3 = m2rVar.c;
                            hashMap.put("visitNum", Integer.valueOf(m2rVar.f23744a));
                            hashMap.put("onlineNum", Integer.valueOf(m2rVar.b));
                            hashMap.put("totalNum", Integer.valueOf(m2rVar.c));
                            hashMap.put("msgNum", Integer.valueOf(m2rVar.d));
                            hashMap.put("digNum", Integer.valueOf(m2rVar.e));
                        }
                    }
                    jSCallback.invoke(new HashMap<String, Object>(i2, hashMap) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.8.1
                        public final /* synthetic */ HashMap val$data;
                        public final /* synthetic */ int val$result;

                        {
                            this.val$result = i2;
                            this.val$data = hashMap;
                            put("errorCode", Integer.valueOf(i2));
                            put("status", hashMap);
                            put("context", str2);
                        }
                    });
                }
            }, str2);
        }
    }

    @WXModuleAnno
    public void requestTopicUserList(int i, String str, int i2, int i3, final String str2, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5501881", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), str2, jSCallback});
        } else {
            mlm.l(i, str, 403, i2, i3, new ibd(this) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ibd
                public void a(int i4, Map<String, Object> map, Object... objArr) {
                    n2r.a[] aVarArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i4), map, objArr});
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (i4 == 1000 && map != null) {
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
                    jSCallback.invoke(new HashMap<String, Object>(i4, arrayList) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.7.1
                        public final /* synthetic */ List val$data;
                        public final /* synthetic */ int val$result;

                        {
                            this.val$result = i4;
                            this.val$data = arrayList;
                            put("errorCode", Integer.valueOf(i4));
                            put("users", arrayList.toArray());
                            put("context", str2);
                        }
                    });
                }
            }, str2);
        }
    }

    @WXModuleAnno
    public void sendMessage(int i, Map<String, Object> map, String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9f54f6", new Object[]{this, new Integer(i), map, str, jSCallback});
        } else {
            mlm.k(i, fromMap(0, i, map), new e(str, jSCallback), str);
        }
    }

    @WXModuleAnno
    public void sendTextMessage(int i, Map<String, Object> map, String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f10e843", new Object[]{this, new Integer(i), map, str, jSCallback});
        } else {
            mlm.n(i, (TextPowerMessage) fromMap(101, i, map), new f(str, jSCallback), str);
        }
    }

    @WXModuleAnno
    public void setMsgFetchMode(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        StringBuilder sb = new StringBuilder("setMsgFetchMode ");
        sb.append(i);
        sb.append(i2);
        mlm.o(i, str, i2);
    }

    @WXModuleAnno
    public void subscribeByTag(int i, String str, String str2, String str3, String str4, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f3e91d", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        Dispatcher dispatcher = new Dispatcher(this, null);
        this.dispatcher = dispatcher;
        mlm.h(i, dispatcher);
        mlm.r(i, str, str2, str3, "", new a(str4, jSCallback), str4);
    }

    public Map<String, Object> toMap(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce5810db", new Object[]{this, powerMessage});
        }
        return new HashMap<String, Object>(powerMessage) { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.11
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
                int i = powerMessage.type;
                if (i == 101) {
                    put("message", ((TextPowerMessage) powerMessage).text);
                    encodeToString = ((TextPowerMessage) powerMessage).value;
                    str = "param";
                } else if (i == 102) {
                    encodeToString = ((CountPowerMessage) powerMessage).value;
                    str = "info";
                } else if (i == 103) {
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

    @WXModuleAnno
    public void unSubscribeByTag(int i, String str, String str2, String str3, String str4, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc434616", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        mlm.w(i, str, str2, str3, "", new b(str4, jSCallback), str4);
        this.dispatcher = null;
    }

    public PowerMessage fromMap(int i, int i2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("d18e22aa", new Object[]{this, new Integer(i), new Integer(i2), map});
        }
        PowerMessage powerMessage = new PowerMessage();
        try {
            if (i == 101) {
                TextPowerMessage textPowerMessage = new TextPowerMessage();
                textPowerMessage.text = (String) map.get("message");
                Object obj = map.get("param");
                if (obj instanceof JSONObject) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, Object> entry : ((JSONObject) obj).entrySet()) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                    textPowerMessage.value = hashMap;
                }
                powerMessage = textPowerMessage;
            } else {
                Integer num = (Integer) map.get("subType");
                if (num != null) {
                    powerMessage.type = num.intValue();
                }
            }
            powerMessage.bizCode = i2;
            powerMessage.topic = (String) map.get("topic");
            powerMessage.userId = (String) map.get("userId");
            powerMessage.from = (String) map.get("from");
            powerMessage.to = (String) map.get("to");
            Boolean bool = (Boolean) map.get("sendFullTags");
            if (bool != null) {
                powerMessage.sendFullTags = bool.booleanValue();
            }
            List list = (List) map.get("tags");
            if (list != null) {
                powerMessage.tags = (String[]) list.toArray(new String[list.size()]);
            }
            Integer num2 = (Integer) map.get("Qos");
            if (num2 != null) {
                powerMessage.qosLevel = num2.intValue();
            }
            Integer num3 = (Integer) map.get("priority");
            if (num3 != null) {
                powerMessage.priority = num3.intValue();
            }
            Boolean bool2 = (Boolean) map.get("needAck");
            if (bool2 != null) {
                powerMessage.needAck = bool2.booleanValue();
            }
            String str = (String) map.get("data");
            if (str != null) {
                powerMessage.data = Base64.decode(str, 2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return powerMessage;
    }

    @WXModuleAnno
    public void multiSubscribeByTag(int i, String str, String str2, String str3, String str4, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3134b6", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        Dispatcher dispatcher = new Dispatcher(this, null);
        this.dispatcher = dispatcher;
        mlm.g(i, "weex", dispatcher);
        mlm.q(i, str, "weex", str2, str3, "", new c(str4, jSCallback), str4);
    }

    @WXModuleAnno
    public void multiUnSubscribeByTag(int i, String str, String str2, String str3, String str4, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335c0f6f", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        mlm.v(i, str, "weex", str2, str3, "", new d(str4, jSCallback), str4);
        this.dispatcher = null;
    }
}
