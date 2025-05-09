package com.taobao.tao.powermsg;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.monitor.model.DataReceiveMonitor;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.model.Command;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.managers.MsgManager;
import com.taobao.tao.powermsg.managers.MultiSubscribeManager;
import com.taobao.tao.powermsg.model.Count;
import com.taobao.tao.powermsg.model.Report;
import com.taobao.tao.powermsg.model.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.b2o;
import tb.b5n;
import tb.bh2;
import tb.cyx;
import tb.dh2;
import tb.dva;
import tb.f4y;
import tb.f7l;
import tb.gay;
import tb.h3m;
import tb.ibd;
import tb.ikl;
import tb.iyv;
import tb.jg4;
import tb.kbd;
import tb.l5y;
import tb.lkd;
import tb.lzx;
import tb.n8l;
import tb.p2j;
import tb.p70;
import tb.rbd;
import tb.sjl;
import tb.stj;
import tb.sxx;
import tb.t2o;
import tb.vxx;
import tb.x4u;
import tb.yd2;
import tb.ykm;
import tb.zkm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PowerMsgServiceImpl implements rbd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INTERVAL_TIME = 5;
    private static final String TAG = "PowerMsgRouter";
    private h3m<ikl<BaseMessage>> endStream = new h3m<>();
    private MultiSubscribeManager subscribeManager = new MultiSubscribeManager();
    private b5n pullManager = new b5n();
    private MsgManager msgManager = new MsgManager();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikl f12564a;
        public final /* synthetic */ ibd b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                c cVar = c.this;
                PowerMsgServiceImpl.invoke(i, map, cVar.b, cVar.c);
                Integer valueOf = Integer.valueOf(i);
                c cVar2 = c.this;
                MsgLog.i(PowerMsgServiceImpl.TAG, "countValue >", valueOf, cVar2.d, "biz:", Integer.valueOf(cVar2.e));
                if (i == 1000) {
                    MsgMonitor.f("POWERMSG", "POWERMSG_COUNT_RATE");
                    return;
                }
                MsgMonitor.c("POWERMSG", "POWERMSG_COUNT_RATE", "" + i, null);
            }
        }

        public c(PowerMsgServiceImpl powerMsgServiceImpl, ikl iklVar, ibd ibdVar, Object[] objArr, String str, int i) {
            this.f12564a = iklVar;
            this.b = ibdVar;
            this.c = objArr;
            this.d = str;
            this.e = i;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(((BaseMessage) this.f12564a.f21366a).header.f, new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements vxx<ikl<BaseMessage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(PowerMsgServiceImpl powerMsgServiceImpl) {
        }

        /* renamed from: a */
        public void accept(ikl<BaseMessage> iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d52d87ce", new Object[]{this, iklVar});
                return;
            }
            MsgLog.e(PowerMsgServiceImpl.TAG, "Error Result >");
            MsgLog.d(PowerMsgServiceImpl.TAG, iklVar);
            iyv.h(iklVar, iklVar.f21366a.header.c);
            b2o.a(iklVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements lkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12568a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ ibd e;
        public final /* synthetic */ Object[] f;

        public g(int i, String str, String str2, boolean z, ibd ibdVar, Object[] objArr) {
            this.f12568a = i;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = ibdVar;
            this.f = objArr;
        }

        @Override // tb.lkd
        public void onResult(int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                return;
            }
            if (map != null && (map.get("data") instanceof dh2)) {
                dh2 dh2Var = (dh2) map.get("data");
                PowerMsgServiceImpl.access$000(PowerMsgServiceImpl.this).f(this.f12568a, this.b, this.c, dh2Var.b, dh2Var.d);
            }
            if (!this.d) {
                PowerMsgServiceImpl.invoke(i, map, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements lkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ibd f12569a;
        public final /* synthetic */ Object[] b;

        public h(PowerMsgServiceImpl powerMsgServiceImpl, ibd ibdVar, Object[] objArr) {
            this.f12569a = ibdVar;
            this.b = objArr;
        }

        @Override // tb.lkd
        public void onResult(int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
            } else {
                PowerMsgServiceImpl.invoke(i, map, this.f12569a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikl f12570a;
        public final /* synthetic */ ibd b;
        public final /* synthetic */ Object[] c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                i iVar = i.this;
                PowerMsgServiceImpl.invoke(i, map, iVar.b, iVar.c);
                if (i == 1000) {
                    MsgMonitor.f("POWERMSG", "POWERMSG_SENDMSG_RATE");
                    return;
                }
                MsgMonitor.c("POWERMSG", "POWERMSG_SENDMSG_RATE", "" + i, null);
            }
        }

        public i(PowerMsgServiceImpl powerMsgServiceImpl, ikl iklVar, ibd ibdVar, Object[] objArr) {
            this.f12570a = iklVar;
            this.b = ibdVar;
            this.c = objArr;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(((BaseMessage) this.f12570a.f21366a).header.f, new a());
            }
        }
    }

    static {
        t2o.a(628097185);
        t2o.a(628097220);
    }

    public PowerMsgServiceImpl() {
        initDownStream(MsgRouter.e().d());
        MsgLog.i(TAG, "init>>>");
        MsgMonitor.g("POWERMSG", "POWERMSG_SUBSCRIBE_DURATION", new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.1
            {
                add("POWERMSG_DIMENS_BIZ");
            }
        }, new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.2
            {
                add("POWERMSG_MEASURE_DURATION");
            }
        });
        MsgMonitor.g("POWERMSG", "pullCost", new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.3
            {
                add("POWERMSG_DIMENS_BIZ");
                add("MKT_DIMENS_TOPIC");
                add("code");
                add("mode");
                add("time");
            }
        }, new ArrayList<String>() { // from class: com.taobao.tao.powermsg.PowerMsgServiceImpl.4
            {
                add("POWERMSG_MEASURE_DURATION");
            }
        });
        this.endStream.a().g(gay.a()).b(new e(this));
    }

    public static /* synthetic */ b5n access$000(PowerMsgServiceImpl powerMsgServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5n) ipChange.ipc$dispatch("5f94d001", new Object[]{powerMsgServiceImpl});
        }
        return powerMsgServiceImpl.pullManager;
    }

    private void initDownStream(h3m<ikl> h3mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db66ea4", new Object[]{this, h3mVar});
            return;
        }
        MsgLog.i(TAG, "initDownStream");
        if (h3mVar == null) {
            MsgLog.g(TAG, "initDownStream downStream is null");
        }
        h3mVar.a().g(gay.a()).f(new f()).i(downObserver());
    }

    public static boolean invoke(int i2, Map<String, Object> map, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7955fb5e", new Object[]{new Integer(i2), map, ibdVar, objArr})).booleanValue();
        }
        if (i2 == 2021) {
            Command create = Command.create(1);
            create.header.g = 304;
            l5y.m(new ikl(create)).a(MsgRouter.e().c());
        }
        if (ibdVar != null) {
            try {
                ibdVar.a(i2, map, objArr);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private void sendRequestInterval(BaseMessage baseMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541ab7e2", new Object[]{this, baseMessage});
        } else {
            l5y.f(0L, 5L, TimeUnit.SECONDS).A(gay.a()).G(new d(this, baseMessage)).a(MsgRouter.e().j());
        }
    }

    @Override // tb.rbd
    public void countValue(int i2, String str, Map<String, Double> map, boolean z, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f580588", new Object[]{this, new Integer(i2), str, map, new Boolean(z), ibdVar, objArr});
            return;
        }
        Count create = Count.create();
        create.header.f18091a = str;
        create.body.f28030a = map;
        create.needACK = z;
        ikl iklVar = new ikl(create);
        ((BaseMessage) iklVar.f21366a).bizCode = i2;
        l5y.m(iklVar).F(new c(this, iklVar, ibdVar, objArr, str, i2)).a(MsgRouter.e().j());
    }

    @Override // tb.rbd
    public void doFullLink(PowerMessage powerMessage, zkm zkmVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b42054d", new Object[]{this, powerMessage, zkmVar});
        } else if (powerMessage == null || zkmVar == null) {
            MsgLog.g(TAG, "doFullLink param is illegal");
        } else if (powerMessage.fullLinkFlag == 1) {
            zkm zkmVar2 = new zkm();
            zkmVar2.b = zkmVar.b;
            zkmVar2.e = powerMessage.messageId;
            zkmVar2.j = p2j.d();
            if (powerMessage.sourceType == 2) {
                i2 = 200;
            } else {
                i2 = 100;
            }
            zkmVar2.d = i2;
            zkmVar2.c = 1;
            ykm.l().h(zkmVar2);
        }
    }

    public cyx<ikl> downObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyx) ipChange.ipc$dispatch("3e0d4713", new Object[]{this});
        }
        return this.msgManager;
    }

    public h3m<ikl<BaseMessage>> endStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3m) ipChange.ipc$dispatch("24d2afaf", new Object[]{this});
        }
        return this.endStream;
    }

    public b5n getPullManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5n) ipChange.ipc$dispatch("e3b31a16", new Object[]{this});
        }
        return this.pullManager;
    }

    @Override // tb.rbd
    public kbd getStableDispatcher(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kbd) ipChange.ipc$dispatch("3eb6cee1", new Object[]{this, str});
        }
        return yd2.f(str);
    }

    public List<PowerMessage> getStashMessages(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9762e04c", new Object[]{this, new Integer(i2), str});
        }
        MsgManager msgManager = this.msgManager;
        List<ikl<BaseMessage>> f2 = msgManager.f("" + i2, str);
        ArrayList arrayList = new ArrayList();
        if (f2 != null) {
            for (ikl<BaseMessage> iklVar : f2) {
                arrayList.add(iyv.b(iklVar.f21366a));
            }
        }
        return arrayList;
    }

    @Override // tb.rbd
    public int registerDispatcher(int i2, String str, kbd kbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a29c1063", new Object[]{this, new Integer(i2), str, kbdVar})).intValue();
        }
        return yd2.g(i2, str, kbdVar);
    }

    @Override // tb.rbd
    public void registerStableDispatcher(String str, kbd kbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5dc3c0a", new Object[]{this, str, kbdVar});
        } else {
            yd2.h(str, kbdVar);
        }
    }

    public void report(int i2, BaseMessage baseMessage, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861411a1", new Object[]{this, new Integer(i2), baseMessage, new Integer(i3), new Integer(i4), str});
        } else if (baseMessage != null) {
            ikl iklVar = new ikl(new Report(baseMessage, i3, iyv.c(baseMessage), i4));
            ((BaseMessage) iklVar.f21366a).bizCode = i2;
            if (!TextUtils.isEmpty(str)) {
                ((BaseMessage) iklVar.f21366a).header.f = str;
            }
            l5y.m(iklVar).a(MsgRouter.e().j());
            MsgLog.i(TAG, "reportMessage >");
            MsgLog.d(TAG, iklVar);
        }
    }

    public int returnCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85a1e537", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.rbd
    public void sendMessage(int i2, PowerMessage powerMessage, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998375aa", new Object[]{this, new Integer(i2), powerMessage, ibdVar, objArr});
        } else {
            sendMessageImpl(i2, powerMessage, null, ibdVar, objArr);
        }
    }

    @Override // tb.rbd
    public void sendText(int i2, TextPowerMessage textPowerMessage, ibd ibdVar, Object... objArr) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cd04c1", new Object[]{this, new Integer(i2), textPowerMessage, ibdVar, objArr});
        } else if (!TextUtils.isEmpty(textPowerMessage.text) || ((map = textPowerMessage.value) != null && map.size() >= 1)) {
            sendMessage(i2, textPowerMessage, ibdVar, objArr);
        } else {
            invoke(-3005, null, ibdVar, objArr);
        }
    }

    @Override // tb.rbd
    public void setMsgFetchMode(int i2, String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i2), str, new Integer(i3)});
            return;
        }
        yd2.i("" + i2, str, i3);
    }

    @Deprecated
    public void setSubscribeMode(int i2, String str, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3b568", new Object[]{this, new Integer(i2), str, new Integer(i3)});
            return;
        }
        yd2.j("" + i2, str, i3);
    }

    @Override // tb.rbd
    public void subscribe(int i2, String str, String str2, String str3, String str4, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fc75a1", new Object[]{this, new Integer(i2), str, str2, str3, str4, ibdVar, objArr});
        } else {
            subscribe(i2, str, null, str2, str3, str4, ibdVar, objArr);
        }
    }

    @Deprecated
    public void subscribeDirectly(int i2, String str, String str2, String str3, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd76e281", new Object[]{this, new Integer(i2), str, str2, str3, ibdVar, objArr});
            return;
        }
        MsgLog.i(TAG, "force subscribe >", str, "biz:", Integer.valueOf(i2));
        invoke(-3005, null, ibdVar, objArr);
    }

    @Override // tb.rbd
    public void unRegisterStableDispatcher(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104cf0cf", new Object[]{this, str});
        } else {
            yd2.k(str);
        }
    }

    @Override // tb.rbd
    public void unSubscribe(int i2, String str, String str2, String str3, String str4, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ad8748", new Object[]{this, new Integer(i2), str, str2, str3, str4, ibdVar, objArr});
        } else {
            unSubscribe(i2, str, null, str2, str3, str4, ibdVar, objArr);
        }
    }

    @Override // tb.rbd
    @Deprecated
    public void report(int i2, PowerMessage powerMessage, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b301645d", new Object[]{this, new Integer(i2), powerMessage, new Integer(i3)});
        } else if (powerMessage != null) {
            report(i2, iyv.l(powerMessage), i3, 0, powerMessage.messageId);
        }
    }

    @Override // tb.rbd
    public void subscribe(int i2, String str, String str2, String str3, String str4, String str5, ibd ibdVar, sjl sjlVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff23553a", new Object[]{this, new Integer(i2), str, str2, str3, str4, str5, ibdVar, sjlVar, objArr});
        } else {
            subscribeImpl(i2, str, str2, str3, str4, str5, ibdVar, sjlVar, objArr);
        }
    }

    @Override // tb.rbd
    public void unSubscribe(int i2, String str, String str2, String str3, String str4, String str5, ibd ibdVar, sjl sjlVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcd4f33", new Object[]{this, new Integer(i2), str, str2, str3, str4, str5, ibdVar, sjlVar, objArr});
            return;
        }
        MsgLog.g(TAG, "unSubscribe >", str, "biz:", Integer.valueOf(i2), "biztag:", str4, str2);
        if (!com.taobao.tao.powermsg.managers.a.b(i2, str, str4, str2)) {
            MsgLog.g(TAG, Integer.valueOf(i2), "unSubscribe:", str, "biztag:", str4, str2, "biztag not bind");
            invoke(-3005, null, ibdVar, objArr);
            return;
        }
        MsgRouter.e().i().c(i2, str, str2, str3, str4);
        Pair<Integer, Integer> d2 = com.taobao.tao.powermsg.managers.a.d(str, str4);
        if (this.subscribeManager.g(i2, str, str2, str3, str4, str5, d2.first.intValue(), d2.second.intValue(), sjlVar, new h(this, ibdVar, objArr)) == 1) {
            this.pullManager.f(i2, str, str4, 1, 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikl f12560a;
        public final /* synthetic */ ibd b;
        public final /* synthetic */ Object[] c;

        public a(PowerMsgServiceImpl powerMsgServiceImpl, ikl iklVar, ibd ibdVar, Object[] objArr) {
            this.f12560a = iklVar;
            this.b = ibdVar;
            this.c = objArr;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(((BaseMessage) this.f12560a.f21366a).header.f, new C0717a());
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.powermsg.PowerMsgServiceImpl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0717a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0717a() {
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                MsgLog.e(PowerMsgServiceImpl.TAG, "receiveRequest >", Integer.valueOf(((BaseMessage) a.this.f12560a.f21366a).header.g), "topic:", ((BaseMessage) a.this.f12560a.f21366a).header.f18091a, "code:", Integer.valueOf(i));
                a aVar = a.this;
                PowerMsgServiceImpl.invoke(i, map, aVar.b, aVar.c);
                if (i == 1000) {
                    MsgMonitor.f("POWERMSG", "POWERMSG_REQUEST_RATE");
                    return;
                }
                MsgMonitor.c("POWERMSG", "POWERMSG_REQUEST_RATE", "" + i, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f12562a;
        public final /* synthetic */ ibd b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        public b(PowerMsgServiceImpl powerMsgServiceImpl, Request request, ibd ibdVar, Object[] objArr, String str, int i) {
            this.f12562a = request;
            this.b = ibdVar;
            this.c = objArr;
            this.d = str;
            this.e = i;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(this.f12562a.header.f, new a());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                b bVar = b.this;
                PowerMsgServiceImpl.invoke(i, map, bVar.b, bVar.c);
                Integer valueOf = Integer.valueOf(i);
                b bVar2 = b.this;
                MsgLog.i(PowerMsgServiceImpl.TAG, "pullMessages >", valueOf, bVar2.d, "biz:", Integer.valueOf(bVar2.e));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements f4y<ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        /* renamed from: a */
        public boolean test(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a95860dc", new Object[]{this, iklVar})).booleanValue();
            }
            int returnCode = PowerMsgServiceImpl.this.returnCode();
            int i = iklVar.b;
            boolean z = returnCode == i;
            if (!z) {
                MsgLog.g(PowerMsgServiceImpl.TAG, "not syscode:", Integer.valueOf(i), "biz:", Integer.valueOf(iklVar.f21366a.bizCode()), "topic:", iklVar.f21366a.topic(), "msgId:", iklVar.f21366a.getID());
            }
            DataReceiveMonitor dataReceiveMonitor = iklVar.o;
            if (dataReceiveMonitor != null) {
                dataReceiveMonitor.streamFilterTime = SystemClock.elapsedRealtime();
            }
            return z;
        }
    }

    private boolean filterMsg(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f04bdd54", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(jg4.c("subtype_limit", ""));
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(f7l.PLUS);
            sb.append(i3);
            return System.currentTimeMillis() % 1000 < ((long) parseObject.getIntValue(sb.toString()));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.rbd
    public boolean queryMessagesByStream(int i2, String str, sjl sjlVar) {
        x4u f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a514315a", new Object[]{this, new Integer(i2), str, sjlVar})).booleanValue();
        }
        try {
            f2 = com.taobao.tao.powermsg.managers.a.f(i2, str);
        } catch (Throwable th) {
            MsgLog.f(TAG, th, "queryMessagesByStream err");
        }
        if (f2 != null) {
            AccsStreamConfig accsStreamConfig = new AccsStreamConfig("powermsg3");
            accsStreamConfig.setStreamId(f2.b());
            accsStreamConfig.setStartSeq(sjlVar.e());
            accsStreamConfig.setEndSeq(sjlVar.b());
            ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).queryStream(accsStreamConfig);
            return true;
        }
        MsgLog.g(TAG, "queryMessagesByStream topicInfo = null");
        return false;
    }

    @Override // tb.rbd
    public void subscribe(int i2, String str, String str2, String str3, String str4, String str5, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fff8497", new Object[]{this, new Integer(i2), str, str2, str3, str4, str5, ibdVar, objArr});
        } else {
            subscribeImpl(i2, str, str2, str3, str4, str5, ibdVar, null, objArr);
        }
    }

    @Override // tb.rbd
    public void unSubscribe(int i2, String str, String str2, String str3, String str4, String str5, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a141a7e", new Object[]{this, new Integer(i2), str, str2, str3, str4, str5, ibdVar, objArr});
        } else {
            unSubscribe(i2, str, str2, str3, str4, str5, ibdVar, null, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements lzx<Long, ikl<BaseMessage>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseMessage f12566a;

        public d(PowerMsgServiceImpl powerMsgServiceImpl, BaseMessage baseMessage) {
            this.f12566a = baseMessage;
        }

        /* renamed from: a */
        public ikl<BaseMessage> apply(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ikl) ipChange.ipc$dispatch("6714db61", new Object[]{this, l});
            }
            Request request = new Request(this.f12566a);
            request.header.g = 401;
            request.needACK = false;
            bh2 bh2Var = request.body;
            bh2Var.f16382a = 0L;
            bh2Var.b = 5;
            MsgLog.e(PowerMsgServiceImpl.TAG, "sendRequest >", 0L, "interval:", 5, "topic:", this.f12566a.header.f18091a);
            return new ikl<>(request);
        }
    }

    @Override // tb.rbd
    public void sendStreamMessage(int i2, PowerMessage powerMessage, sjl sjlVar, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b567543b", new Object[]{this, new Integer(i2), powerMessage, sjlVar, ibdVar, objArr});
            return;
        }
        ikl iklVar = new ikl(iyv.l(powerMessage));
        ((BaseMessage) iklVar.f21366a).bizCode = i2;
        try {
            if (!TextUtils.isEmpty(sjlVar.f())) {
                ((BaseMessage) iklVar.f21366a).header.p = sjlVar.f();
            }
            iklVar.m = true;
            int i3 = sjlVar.a() == 2 ? 5 : 1;
            ((BaseMessage) iklVar.f21366a).sysCode = i3;
            iklVar.b = i3;
            if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                M m = iklVar.f21366a;
                if (((BaseMessage) m).header.n == null) {
                    ((BaseMessage) m).header.n = new HashMap(2);
                }
                ((BaseMessage) iklVar.f21366a).header.n.put("userId", Launcher_InitAccs.mUserId);
                Map<String, String> map = ((BaseMessage) iklVar.f21366a).header.n;
                map.put("clientSendTime", p70.a() + "");
            }
            String id = ((BaseMessage) iklVar.f21366a).getID();
            MsgManager.i(id, i2 + "", powerMessage.topic);
            MsgLog.g(TAG, "start sendStreamMessage", "namespace:", Integer.valueOf(i2), "topic:", powerMessage.topic, "msgid:", ((BaseMessage) iklVar.f21366a).getID());
            stj.c(iklVar.k).h(iklVar);
        } catch (Throwable unused) {
        }
    }

    public void pullMessages(int i2, String str, int i3, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f29f4d", new Object[]{this, new Integer(i2), str, new Integer(i3), ibdVar, objArr});
            return;
        }
        Request create = Request.create();
        create.bizCode = i2;
        create.needACK = false;
        dva dvaVar = create.header;
        dvaVar.f18091a = str;
        dvaVar.g = 401;
        bh2 bh2Var = create.body;
        bh2Var.b = i3;
        MsgLog.e(TAG, "pullMessages >", Long.valueOf(bh2Var.f16382a), "duration:", Integer.valueOf(i3), "topic:", create.header.f18091a);
        l5y.m(new ikl(create)).F(new b(this, create, ibdVar, objArr, str, i2)).a(MsgRouter.e().j());
    }

    private void subscribeImpl(int i2, String str, String str2, String str3, String str4, String str5, ibd ibdVar, sjl sjlVar, Object... objArr) {
        int i3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5323bfa", new Object[]{this, new Integer(i2), str, str2, str3, str4, str5, ibdVar, sjlVar, objArr});
            return;
        }
        MsgLog.g(TAG, "subscribe >", str, "biz:", Integer.valueOf(i2), "biztag:", str4, str2);
        int a2 = com.taobao.tao.powermsg.managers.a.a(i2, str, str4, str2);
        if (1000 != a2) {
            MsgLog.g(TAG, Integer.valueOf(i2), "subscribe:", str, "biztag:", str4, str2, "error in states", Integer.valueOf(a2));
            invoke(a2, null, ibdVar, objArr);
            return;
        }
        MsgRouter.e().i().b(i2, str, str2, str3, str4);
        int a3 = jg4.a("push_aside_pull_duration", 3);
        int d2 = yd2.d("" + i2, str);
        int a4 = jg4.a("force_pull_type", -1);
        int i4 = (d2 == 4 || a4 <= 0) ? d2 : a4;
        if (!b5n.a(i4)) {
            i3 = 1;
            a3 = jg4.a("pull_duration", 1);
        } else {
            i3 = 1;
        }
        if (i3 != i4 && sjlVar == null) {
            invoke(1000, null, ibdVar, objArr);
            Integer valueOf = Integer.valueOf(i2);
            Object[] objArr2 = new Object[5];
            objArr2[0] = "subscribe >";
            objArr2[i3] = 1000;
            objArr2[2] = str;
            objArr2[3] = "biz:";
            objArr2[4] = valueOf;
            MsgLog.i(TAG, objArr2);
            z = true;
        }
        if (this.subscribeManager.f(i2, str, str2, str3, str4, str5, i4, a3, sjlVar, new g(i2, str, str4, z, ibdVar, objArr)) == 1) {
            this.pullManager.f(i2, str, str4, i4, a3);
        }
    }

    private void sendMessageImpl(int i2, PowerMessage powerMessage, sjl sjlVar, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea1ec9b", new Object[]{this, new Integer(i2), powerMessage, sjlVar, ibdVar, objArr});
        } else if (filterMsg(i2, powerMessage.type)) {
            invoke(4001, null, ibdVar, objArr);
        } else {
            ikl iklVar = new ikl(iyv.l(powerMessage));
            ((BaseMessage) iklVar.f21366a).bizCode = i2;
            try {
                if (n8l.d(GlobalClientInfo.getContext()) && sjlVar != null) {
                    if (!TextUtils.isEmpty(sjlVar.f())) {
                        ((BaseMessage) iklVar.f21366a).header.p = sjlVar.f();
                    }
                    iklVar.m = true;
                    ((BaseMessage) iklVar.f21366a).sysCode = 5;
                    iklVar.b = 5;
                    if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                        M m = iklVar.f21366a;
                        if (((BaseMessage) m).header.n == null) {
                            ((BaseMessage) m).header.n = new HashMap(2);
                        }
                        ((BaseMessage) iklVar.f21366a).header.n.put("userId", Launcher_InitAccs.mUserId);
                        Map<String, String> map = ((BaseMessage) iklVar.f21366a).header.n;
                        map.put("clientSendTime", p70.a() + "");
                    }
                }
                String id = ((BaseMessage) iklVar.f21366a).getID();
                MsgManager.i(id, i2 + "", powerMessage.topic);
                MsgLog.g(TAG, "start sendStreamMessage", "namespace:", Integer.valueOf(i2), "topic:", powerMessage.topic, "msgid:", ((BaseMessage) iklVar.f21366a).getID());
            } catch (Throwable unused) {
            }
            l5y.m(iklVar).F(new i(this, iklVar, ibdVar, objArr)).a(MsgRouter.e().j());
        }
    }

    @Override // tb.rbd
    public void sendRequest(int i2, String str, int i3, int i4, int i5, ibd ibdVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af477c77", new Object[]{this, new Integer(i2), str, new Integer(i3), new Integer(i4), new Integer(i5), ibdVar, objArr});
            return;
        }
        Request create = Request.create();
        create.bizCode = i2;
        dva dvaVar = create.header;
        dvaVar.g = i3;
        dvaVar.f18091a = str;
        bh2 bh2Var = create.body;
        bh2Var.f16382a = i4;
        bh2Var.b = i5;
        ikl iklVar = new ikl(create);
        l5y.m(iklVar).A(gay.a()).F(new a(this, iklVar, ibdVar, objArr)).a(MsgRouter.e().j());
        MsgLog.e(TAG, "sendRequest >", str, "biz:", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }
}
