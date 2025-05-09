package com.taobao.tao.powermsg.outter;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.security.ccrc.service.build.F;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.android.abilityidl.ability.AbsPowerMsgAbility;
import com.taobao.android.abilityidl.ability.PowerMsgCountMessage;
import com.taobao.android.abilityidl.ability.PowerMsgHistoryMessagesResult;
import com.taobao.android.abilityidl.ability.PowerMsgJoinMessage;
import com.taobao.android.abilityidl.ability.PowerMsgMessageHeader;
import com.taobao.android.abilityidl.ability.PowerMsgPowerMessage;
import com.taobao.android.abilityidl.ability.PowerMsgSendResult;
import com.taobao.android.abilityidl.ability.PowerMsgStreamCommonResult;
import com.taobao.android.abilityidl.ability.PowerMsgStreamMessageDataResult;
import com.taobao.android.abilityidl.ability.PowerMsgStreamMessagesResult;
import com.taobao.android.abilityidl.ability.PowerMsgSubscribeResult;
import com.taobao.android.abilityidl.ability.PowerMsgTextMessage;
import com.taobao.android.abilityidl.ability.PowerMsgTopicStatusResult;
import com.taobao.android.abilityidl.ability.PowerMsgTopicUser;
import com.taobao.android.abilityidl.ability.PowerMsgTopicUsersResult;
import com.taobao.android.abilityidl.ability.PowerMsgUnSubscribeResult;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.CountPowerMessage;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a71;
import tb.amm;
import tb.ibd;
import tb.ilm;
import tb.jbd;
import tb.jdb;
import tb.kbd;
import tb.kdb;
import tb.lbd;
import tb.llm;
import tb.m2r;
import tb.mbd;
import tb.mlm;
import tb.n2r;
import tb.n8l;
import tb.nbd;
import tb.nlm;
import tb.obd;
import tb.olm;
import tb.pbd;
import tb.plm;
import tb.qbd;
import tb.qlm;
import tb.qqt;
import tb.sbd;
import tb.sjl;
import tb.slm;
import tb.t2o;
import tb.tbd;
import tb.tkm;
import tb.ubd;
import tb.vlm;
import tb.xkm;
import tb.xuf;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PowerMsgAbility extends AbsPowerMsgAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADDPMEVENTLISTENER = "-5091826342477277518";
    public static final String API_ADD_EVENT_LISTENER = "addStreamEventListener";
    public static final String API_PRE_CONNECT = "preConnect";
    public static final String API_QUERY = "query";
    public static final String API_REMOVE_EVENT_LISTENER = "removeStreamEventListener";
    public static final String API_SEND = "send";
    public static final String KEY_DELAY = "delay";
    public static final String KEY_SEQ = "seqNr";
    public static final String KEY_STREAM = "streamId";
    public static final String MSG = "msg";
    public static final String PMQUERY = "5213502467903443194";
    public static final String PMSEND = "9931827644667565";
    public static final String REMOVEPMEVENTLISTENER = "4968369330651823386";
    public static volatile ScheduledThreadPoolExecutor b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, w> f12609a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vlm f12610a;
        public final /* synthetic */ obd b;

        public a(vlm vlmVar, obd obdVar) {
            this.f12610a = vlmVar;
            this.b = obdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$900(PowerMsgAbility.this, this.f12610a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nlm f12611a;
        public final /* synthetic */ sbd b;

        public b(PowerMsgAbility powerMsgAbility, nlm nlmVar, sbd sbdVar) {
            this.f12611a = nlmVar;
            this.b = sbdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgStreamCommonResult powerMsgStreamCommonResult = new PowerMsgStreamCommonResult();
            powerMsgStreamCommonResult.code = Integer.valueOf(i);
            powerMsgStreamCommonResult.context = this.f12611a.c;
            powerMsgStreamCommonResult.data = null;
            this.b.i0(powerMsgStreamCommonResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ plm f12612a;
        public final /* synthetic */ tbd b;

        public c(PowerMsgAbility powerMsgAbility, plm plmVar, tbd tbdVar) {
            this.f12612a = plmVar;
            this.b = tbdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgStreamCommonResult powerMsgStreamCommonResult = new PowerMsgStreamCommonResult();
            powerMsgStreamCommonResult.code = Integer.valueOf(i);
            powerMsgStreamCommonResult.context = this.f12612a.c;
            powerMsgStreamCommonResult.data = null;
            this.b.B0(powerMsgStreamCommonResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qlm f12613a;
        public final /* synthetic */ ubd b;

        public d(PowerMsgAbility powerMsgAbility, qlm qlmVar, ubd ubdVar) {
            this.f12613a = qlmVar;
            this.b = ubdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgStreamCommonResult powerMsgStreamCommonResult = new PowerMsgStreamCommonResult();
            powerMsgStreamCommonResult.code = Integer.valueOf(i);
            powerMsgStreamCommonResult.context = this.f12613a.c;
            powerMsgStreamCommonResult.data = null;
            this.b.r0(powerMsgStreamCommonResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ slm f12614a;
        public final /* synthetic */ w b;

        public e(PowerMsgAbility powerMsgAbility, slm slmVar, w wVar) {
            this.f12614a = slmVar;
            this.b = wVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgSubscribeResult powerMsgSubscribeResult = new PowerMsgSubscribeResult();
            powerMsgSubscribeResult.code = Integer.valueOf(i);
            powerMsgSubscribeResult.topic = this.f12614a.b;
            powerMsgSubscribeResult.data = null;
            this.b.b.u0(powerMsgSubscribeResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ amm f12615a;
        public final /* synthetic */ w b;

        public f(PowerMsgAbility powerMsgAbility, amm ammVar, w wVar) {
            this.f12615a = ammVar;
            this.b = wVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgUnSubscribeResult powerMsgUnSubscribeResult = new PowerMsgUnSubscribeResult();
            powerMsgUnSubscribeResult.code = Integer.valueOf(i);
            powerMsgUnSubscribeResult.topic = this.f12615a.b;
            powerMsgUnSubscribeResult.data = null;
            this.b.b.P(powerMsgUnSubscribeResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pbd f12616a;

        public g(PowerMsgAbility powerMsgAbility, pbd pbdVar) {
            this.f12616a = pbdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgSendResult powerMsgSendResult = new PowerMsgSendResult();
            powerMsgSendResult.code = Integer.valueOf(i);
            powerMsgSendResult.data = null;
            this.f12616a.K(powerMsgSendResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qbd f12617a;

        public h(PowerMsgAbility powerMsgAbility, qbd qbdVar) {
            this.f12617a = qbdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgSendResult powerMsgSendResult = new PowerMsgSendResult();
            powerMsgSendResult.code = Integer.valueOf(i);
            powerMsgSendResult.data = null;
            this.f12617a.L0(powerMsgSendResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jbd f12618a;

        public i(PowerMsgAbility powerMsgAbility, jbd jbdVar) {
            this.f12618a = jbdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgSendResult powerMsgSendResult = new PowerMsgSendResult();
            powerMsgSendResult.code = Integer.valueOf(i);
            powerMsgSendResult.data = null;
            this.f12618a.Z0(powerMsgSendResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mbd f12619a;

        public j(PowerMsgAbility powerMsgAbility, mbd mbdVar) {
            this.f12619a = mbdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgHistoryMessagesResult powerMsgHistoryMessagesResult = new PowerMsgHistoryMessagesResult();
            powerMsgHistoryMessagesResult.code = Integer.valueOf(i);
            powerMsgHistoryMessagesResult.textMessages = new LinkedList();
            powerMsgHistoryMessagesResult.countMessages = new LinkedList();
            powerMsgHistoryMessagesResult.joinMessages = new LinkedList();
            powerMsgHistoryMessagesResult.commonMessages = new LinkedList();
            PowerMsgAbility.access$1100(powerMsgHistoryMessagesResult, map);
            this.f12619a.m1(powerMsgHistoryMessagesResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tkm f12620a;
        public final /* synthetic */ lbd b;

        public k(tkm tkmVar, lbd lbdVar) {
            this.f12620a = tkmVar;
            this.b = lbdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$000(PowerMsgAbility.this, this.f12620a.f28771a.intValue(), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbd f12621a;

        public l(PowerMsgAbility powerMsgAbility, nbd nbdVar) {
            this.f12621a = nbdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgTopicStatusResult powerMsgTopicStatusResult = new PowerMsgTopicStatusResult();
            powerMsgTopicStatusResult.code = Integer.valueOf(i);
            PowerMsgAbility.access$1200(powerMsgTopicStatusResult, map);
            this.f12621a.w(powerMsgTopicStatusResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements ibd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ obd f12622a;

        public m(PowerMsgAbility powerMsgAbility, obd obdVar) {
            this.f12622a = obdVar;
        }

        @Override // tb.ibd
        public void a(int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c437f98c", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            PowerMsgTopicUsersResult powerMsgTopicUsersResult = new PowerMsgTopicUsersResult();
            powerMsgTopicUsersResult.code = Integer.valueOf(i);
            powerMsgTopicUsersResult.users = new LinkedList();
            PowerMsgAbility.access$1300(powerMsgTopicUsersResult, map);
            this.f12622a.H(powerMsgTopicUsersResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class n implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "PowerMsgAbility";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tkm f12623a;

        public o(tkm tkmVar) {
            this.f12623a = tkmVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$100(PowerMsgAbility.this).remove(this.f12623a.f28771a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ slm f12624a;
        public final /* synthetic */ jdb b;

        public p(slm slmVar, jdb jdbVar) {
            this.f12624a = slmVar;
            this.b = jdbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$200(PowerMsgAbility.this, this.f12624a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ amm f12625a;
        public final /* synthetic */ jdb b;

        public q(amm ammVar, jdb jdbVar) {
            this.f12625a = ammVar;
            this.b = jdbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$300(PowerMsgAbility.this, this.f12625a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ilm f12626a;
        public final /* synthetic */ pbd b;

        public r(ilm ilmVar, pbd pbdVar) {
            this.f12626a = ilmVar;
            this.b = pbdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$400(PowerMsgAbility.this, this.f12626a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class s implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ llm f12627a;
        public final /* synthetic */ qbd b;

        public s(llm llmVar, qbd qbdVar) {
            this.f12627a = llmVar;
            this.b = qbdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$500(PowerMsgAbility.this, this.f12627a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class t implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xkm f12628a;
        public final /* synthetic */ jbd b;

        public t(xkm xkmVar, jbd jbdVar) {
            this.f12628a = xkmVar;
            this.b = jbdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$600(PowerMsgAbility.this, this.f12628a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class u implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vlm f12629a;
        public final /* synthetic */ mbd b;

        public u(vlm vlmVar, mbd mbdVar) {
            this.f12629a = vlmVar;
            this.b = mbdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$700(PowerMsgAbility.this, this.f12629a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class v implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vlm f12630a;
        public final /* synthetic */ nbd b;

        public v(vlm vlmVar, nbd nbdVar) {
            this.f12630a = vlmVar;
            this.b = nbdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PowerMsgAbility.access$800(PowerMsgAbility.this, this.f12630a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class w {

        /* renamed from: a  reason: collision with root package name */
        public final kbd f12631a;
        public final lbd b;
        public final Map<String, z> c = new HashMap();

        static {
            t2o.a(628097360);
        }

        public w(kbd kbdVar, lbd lbdVar) {
            this.f12631a = kbdVar;
            this.b = lbdVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class x implements kbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lbd f12632a;

        static {
            t2o.a(628097361);
            t2o.a(628097219);
        }

        public x(lbd lbdVar) {
            this.f12632a = lbdVar;
        }

        @Override // tb.kbd
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
            } else {
                this.f12632a.O(new ErrorResult(String.valueOf(i), "Dispatcher occurred an error"));
            }
        }

        @Override // tb.kbd
        public void b(PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97513d8e", new Object[]{this, powerMessage});
            } else if (powerMessage == null) {
                MsgLog.g("PowerMsgAbility", "[onDispatch] msg is null");
            } else {
                switch (powerMessage.type) {
                    case 101:
                        PowerMsgTextMessage access$1600 = PowerMsgAbility.access$1600(powerMessage);
                        if (access$1600 != null) {
                            this.f12632a.s0(access$1600);
                            return;
                        }
                        return;
                    case 102:
                        PowerMsgCountMessage access$1700 = PowerMsgAbility.access$1700(powerMessage);
                        if (access$1700 != null) {
                            this.f12632a.v1(access$1700);
                            return;
                        }
                        return;
                    case 103:
                        PowerMsgJoinMessage access$1800 = PowerMsgAbility.access$1800(powerMessage);
                        if (access$1800 != null) {
                            this.f12632a.z0(access$1800);
                            return;
                        }
                        return;
                    default:
                        PowerMsgPowerMessage access$1900 = PowerMsgAbility.access$1900(powerMessage);
                        if (access$1900 != null) {
                            this.f12632a.x(access$1900);
                            return;
                        }
                        return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class z {

        /* renamed from: a  reason: collision with root package name */
        public String f12635a;
        public String b;

        static {
            t2o.a(628097365);
        }

        public z() {
        }

        public /* synthetic */ z(k kVar) {
            this();
        }
    }

    static {
        t2o.a(628097337);
    }

    public static /* synthetic */ void access$000(PowerMsgAbility powerMsgAbility, int i2, lbd lbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6326815", new Object[]{powerMsgAbility, new Integer(i2), lbdVar});
        } else {
            powerMsgAbility.a(i2, lbdVar);
        }
    }

    public static /* synthetic */ Map access$100(PowerMsgAbility powerMsgAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70bdb937", new Object[]{powerMsgAbility});
        }
        return powerMsgAbility.f12609a;
    }

    public static /* synthetic */ void access$1100(PowerMsgHistoryMessagesResult powerMsgHistoryMessagesResult, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0293f2", new Object[]{powerMsgHistoryMessagesResult, map});
        } else {
            n(powerMsgHistoryMessagesResult, map);
        }
    }

    public static /* synthetic */ void access$1200(PowerMsgTopicStatusResult powerMsgTopicStatusResult, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507b8234", new Object[]{powerMsgTopicStatusResult, map});
        } else {
            u(powerMsgTopicStatusResult, map);
        }
    }

    public static /* synthetic */ void access$1300(PowerMsgTopicUsersResult powerMsgTopicUsersResult, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d31cd9", new Object[]{powerMsgTopicUsersResult, map});
        } else {
            v(powerMsgTopicUsersResult, map);
        }
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor access$1500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("27a7a1ac", new Object[0]);
        }
        return k();
    }

    public static /* synthetic */ PowerMsgTextMessage access$1600(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgTextMessage) ipChange.ipc$dispatch("e5d52f8f", new Object[]{powerMessage});
        }
        return t(powerMessage);
    }

    public static /* synthetic */ PowerMsgCountMessage access$1700(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgCountMessage) ipChange.ipc$dispatch("97431916", new Object[]{powerMessage});
        }
        return l(powerMessage);
    }

    public static /* synthetic */ PowerMsgJoinMessage access$1800(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgJoinMessage) ipChange.ipc$dispatch("20e1a5ca", new Object[]{powerMessage});
        }
        return o(powerMessage);
    }

    public static /* synthetic */ PowerMsgPowerMessage access$1900(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgPowerMessage) ipChange.ipc$dispatch("bc65378e", new Object[]{powerMessage});
        }
        return s(powerMessage);
    }

    public static /* synthetic */ void access$200(PowerMsgAbility powerMsgAbility, slm slmVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9027882", new Object[]{powerMsgAbility, slmVar, jdbVar});
        } else {
            powerMsgAbility.h(slmVar, jdbVar);
        }
    }

    public static /* synthetic */ void access$300(PowerMsgAbility powerMsgAbility, amm ammVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e95852a", new Object[]{powerMsgAbility, ammVar, jdbVar});
        } else {
            powerMsgAbility.i(ammVar, jdbVar);
        }
    }

    public static /* synthetic */ void access$400(PowerMsgAbility powerMsgAbility, ilm ilmVar, pbd pbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db743728", new Object[]{powerMsgAbility, ilmVar, pbdVar});
        } else {
            powerMsgAbility.f(ilmVar, pbdVar);
        }
    }

    public static /* synthetic */ void access$500(PowerMsgAbility powerMsgAbility, llm llmVar, qbd qbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e402664", new Object[]{powerMsgAbility, llmVar, qbdVar});
        } else {
            powerMsgAbility.g(llmVar, qbdVar);
        }
    }

    public static /* synthetic */ void access$600(PowerMsgAbility powerMsgAbility, xkm xkmVar, jbd jbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cceae3", new Object[]{powerMsgAbility, xkmVar, jbdVar});
        } else {
            powerMsgAbility.b(xkmVar, jbdVar);
        }
    }

    public static /* synthetic */ void access$700(PowerMsgAbility powerMsgAbility, vlm vlmVar, mbd mbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90ac5d1", new Object[]{powerMsgAbility, vlmVar, mbdVar});
        } else {
            powerMsgAbility.c(vlmVar, mbdVar);
        }
    }

    public static /* synthetic */ void access$800(PowerMsgAbility powerMsgAbility, vlm vlmVar, nbd nbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99bddc0f", new Object[]{powerMsgAbility, vlmVar, nbdVar});
        } else {
            powerMsgAbility.d(vlmVar, nbdVar);
        }
    }

    public static /* synthetic */ void access$900(PowerMsgAbility powerMsgAbility, vlm vlmVar, obd obdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497f22d6", new Object[]{powerMsgAbility, vlmVar, obdVar});
        } else {
            powerMsgAbility.e(vlmVar, obdVar);
        }
    }

    public static /* synthetic */ Object ipc$super(PowerMsgAbility powerMsgAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/outter/PowerMsgAbility");
    }

    public static long j(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80e6f1f4", new Object[]{str, new Long(j2)})).longValue();
        }
        if (str == null) {
            return j2;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j2;
        }
    }

    public static ScheduledThreadPoolExecutor k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("ffa49318", new Object[0]);
        }
        if (b == null) {
            synchronized (PowerMsgAbility.class) {
                try {
                    if (b == null) {
                        b = (ScheduledThreadPoolExecutor) VExecutors.getThreadPoolFactory().createScheduledExecutorService(1, new n(), new ThreadPoolExecutor.AbortPolicy());
                        b.setKeepAliveTime(30L, TimeUnit.SECONDS);
                        b.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static PowerMsgCountMessage l(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgCountMessage) ipChange.ipc$dispatch("a6525333", new Object[]{powerMessage});
        }
        if (!(powerMessage instanceof CountPowerMessage)) {
            return null;
        }
        CountPowerMessage countPowerMessage = (CountPowerMessage) powerMessage;
        PowerMsgCountMessage powerMsgCountMessage = new PowerMsgCountMessage();
        powerMsgCountMessage.header = p(countPowerMessage);
        powerMsgCountMessage.values = countPowerMessage.value;
        return powerMsgCountMessage;
    }

    public static void m(PowerMsgHistoryMessagesResult powerMsgHistoryMessagesResult, PowerMessage powerMessage) {
        Object t2;
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44f5c79", new Object[]{powerMsgHistoryMessagesResult, powerMessage});
            return;
        }
        switch (powerMessage.type) {
            case 101:
                t2 = t(powerMessage);
                if (t2 != null) {
                    list = powerMsgHistoryMessagesResult.textMessages;
                    break;
                } else {
                    return;
                }
            case 102:
                t2 = l(powerMessage);
                if (t2 != null) {
                    list = powerMsgHistoryMessagesResult.countMessages;
                    break;
                } else {
                    return;
                }
            case 103:
                t2 = o(powerMessage);
                if (t2 != null) {
                    list = powerMsgHistoryMessagesResult.joinMessages;
                    break;
                } else {
                    return;
                }
            default:
                t2 = s(powerMessage);
                if (t2 != null) {
                    list = powerMsgHistoryMessagesResult.commonMessages;
                    break;
                } else {
                    return;
                }
        }
        list.add(t2);
    }

    public static void n(PowerMsgHistoryMessagesResult powerMsgHistoryMessagesResult, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56004427", new Object[]{powerMsgHistoryMessagesResult, map});
        } else if (map != null) {
            Object obj = map.get("data");
            if (obj instanceof List) {
                try {
                    for (Object obj2 : (List) obj) {
                        if (obj2 instanceof PowerMessage) {
                            m(powerMsgHistoryMessagesResult, (PowerMessage) obj2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public static PowerMsgJoinMessage o(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgJoinMessage) ipChange.ipc$dispatch("fc9ad7ff", new Object[]{powerMessage});
        }
        if (!(powerMessage instanceof xuf)) {
            return null;
        }
        xuf xufVar = (xuf) powerMessage;
        PowerMsgJoinMessage powerMsgJoinMessage = new PowerMsgJoinMessage();
        powerMsgJoinMessage.header = p(xufVar);
        powerMsgJoinMessage.totalCount = Integer.valueOf(xufVar.f31613a);
        powerMsgJoinMessage.onlineCount = Integer.valueOf(xufVar.b);
        powerMsgJoinMessage.pageViewCount = Integer.valueOf((int) xufVar.d);
        powerMsgJoinMessage.addUsers = xufVar.c;
        return powerMsgJoinMessage;
    }

    public static PowerMsgMessageHeader p(PowerMessage powerMessage) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgMessageHeader) ipChange.ipc$dispatch("bddead51", new Object[]{powerMessage});
        }
        PowerMsgMessageHeader powerMsgMessageHeader = new PowerMsgMessageHeader();
        powerMsgMessageHeader.type = Integer.valueOf(powerMessage.type);
        powerMsgMessageHeader.priority = Integer.valueOf(powerMessage.priority);
        powerMsgMessageHeader.qosLevel = Integer.valueOf(powerMessage.qosLevel);
        powerMsgMessageHeader.needACK = Boolean.valueOf(powerMessage.needAck);
        powerMsgMessageHeader.sendFullTags = Boolean.valueOf(powerMessage.sendFullTags);
        powerMsgMessageHeader.timestamp = String.valueOf(powerMessage.timestamp);
        powerMsgMessageHeader.messageID = powerMessage.messageId;
        powerMsgMessageHeader.userID = powerMessage.userId;
        powerMsgMessageHeader.topic = powerMessage.topic;
        powerMsgMessageHeader.from = powerMessage.from;
        powerMsgMessageHeader.to = powerMessage.to;
        String[] strArr = powerMessage.tags;
        if (strArr == null) {
            list = null;
        } else {
            list = Arrays.asList(strArr);
        }
        powerMsgMessageHeader.tags = list;
        return powerMsgMessageHeader;
    }

    public static void q(PowerMsgMessageHeader powerMsgMessageHeader, PowerMessage powerMessage) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2123ea1b", new Object[]{powerMsgMessageHeader, powerMessage});
            return;
        }
        Integer num = powerMsgMessageHeader.type;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        powerMessage.type = i2;
        Integer num2 = powerMsgMessageHeader.priority;
        if (num2 == null) {
            i3 = 0;
        } else {
            i3 = num2.intValue();
        }
        powerMessage.priority = i3;
        Integer num3 = powerMsgMessageHeader.qosLevel;
        if (num3 == null) {
            i4 = 0;
        } else {
            i4 = num3.intValue();
        }
        powerMessage.qosLevel = i4;
        Boolean bool = powerMsgMessageHeader.needACK;
        if (bool == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        powerMessage.needAck = z2;
        Boolean bool2 = powerMsgMessageHeader.sendFullTags;
        if (bool2 == null) {
            z3 = false;
        } else {
            z3 = bool2.booleanValue();
        }
        powerMessage.sendFullTags = z3;
        powerMessage.timestamp = j(powerMsgMessageHeader.timestamp, 0L);
        powerMessage.messageId = powerMsgMessageHeader.messageID;
        powerMessage.userId = powerMsgMessageHeader.userID;
        powerMessage.topic = powerMsgMessageHeader.topic;
        powerMessage.from = powerMsgMessageHeader.from;
        powerMessage.to = powerMsgMessageHeader.to;
        List<String> list = powerMsgMessageHeader.tags;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        powerMessage.tags = strArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r7.equals("PULL_EXT") == false) goto L_0x002e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(java.lang.String r7) {
        /*
            r0 = 4
            r1 = 2
            r2 = 3
            r3 = 0
            r4 = 1
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.tao.powermsg.outter.PowerMsgAbility.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001c
            java.lang.String r0 = "d05aafcb"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            java.lang.Object r7 = r5.ipc$dispatch(r0, r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L_0x001c:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 == 0) goto L_0x0023
            return r2
        L_0x0023:
            r7.hashCode()
            r5 = -1
            int r6 = r7.hashCode()
            switch(r6) {
                case -1931790073: goto L_0x005c;
                case -573808441: goto L_0x0051;
                case 244338022: goto L_0x0046;
                case 249381714: goto L_0x003b;
                case 2047379889: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r3 = -1
            goto L_0x0065
        L_0x0030:
            java.lang.String r3 = "PUSH_ONLY"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0039
            goto L_0x002e
        L_0x0039:
            r3 = 4
            goto L_0x0065
        L_0x003b:
            java.lang.String r3 = "PUSH_AND_PULL"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0044
            goto L_0x002e
        L_0x0044:
            r3 = 3
            goto L_0x0065
        L_0x0046:
            java.lang.String r3 = "PULL_ONLY"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x004f
            goto L_0x002e
        L_0x004f:
            r3 = 2
            goto L_0x0065
        L_0x0051:
            java.lang.String r3 = "PULL_WHEN_DISCONNECT"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x005a
            goto L_0x002e
        L_0x005a:
            r3 = 1
            goto L_0x0065
        L_0x005c:
            java.lang.String r6 = "PULL_EXT"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0065
            goto L_0x002e
        L_0x0065:
            switch(r3) {
                case 0: goto L_0x006f;
                case 1: goto L_0x006e;
                case 2: goto L_0x006c;
                case 3: goto L_0x0068;
                case 4: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            r0 = 3
            goto L_0x006f
        L_0x006a:
            r0 = 1
            goto L_0x006f
        L_0x006c:
            r0 = 2
            goto L_0x006f
        L_0x006e:
            r0 = 5
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.powermsg.outter.PowerMsgAbility.r(java.lang.String):int");
    }

    public static PowerMsgPowerMessage s(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgPowerMessage) ipChange.ipc$dispatch("fa35a573", new Object[]{powerMessage});
        }
        PowerMsgPowerMessage powerMsgPowerMessage = new PowerMsgPowerMessage();
        powerMsgPowerMessage.header = p(powerMessage);
        powerMsgPowerMessage.data = new String(powerMessage.data);
        return powerMsgPowerMessage;
    }

    public static PowerMsgTextMessage t(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMsgTextMessage) ipChange.ipc$dispatch("62d4b645", new Object[]{powerMessage});
        }
        if (!(powerMessage instanceof TextPowerMessage)) {
            return null;
        }
        TextPowerMessage textPowerMessage = (TextPowerMessage) powerMessage;
        PowerMsgTextMessage powerMsgTextMessage = new PowerMsgTextMessage();
        powerMsgTextMessage.header = p(textPowerMessage);
        powerMsgTextMessage.text = textPowerMessage.text;
        powerMsgTextMessage.values = textPowerMessage.value;
        return powerMsgTextMessage;
    }

    public static void u(PowerMsgTopicStatusResult powerMsgTopicStatusResult, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1fdae6", new Object[]{powerMsgTopicStatusResult, map});
        } else if (map != null) {
            Object obj = map.get("data");
            if (obj instanceof m2r) {
                m2r m2rVar = (m2r) obj;
                powerMsgTopicStatusResult.digNUM = Integer.valueOf(m2rVar.e);
                powerMsgTopicStatusResult.onlineNUM = Integer.valueOf(m2rVar.b);
                powerMsgTopicStatusResult.msgNUM = Integer.valueOf(m2rVar.d);
                powerMsgTopicStatusResult.totalNUM = Integer.valueOf(m2rVar.c);
                powerMsgTopicStatusResult.visitNUM = Integer.valueOf(m2rVar.f23744a);
            }
        }
    }

    public static void v(PowerMsgTopicUsersResult powerMsgTopicUsersResult, Map<String, Object> map) {
        n2r.a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14aafba", new Object[]{powerMsgTopicUsersResult, map});
        } else if (map != null) {
            Object obj = map.get("data");
            if ((obj instanceof n2r) && (aVarArr = ((n2r) obj).f24471a) != null) {
                for (n2r.a aVar : aVarArr) {
                    if (aVar != null) {
                        PowerMsgTopicUser powerMsgTopicUser = new PowerMsgTopicUser();
                        powerMsgTopicUser.nick = aVar.b;
                        powerMsgTopicUser.userID = aVar.f24472a;
                        powerMsgTopicUser.addTime = String.valueOf(aVar.c);
                        powerMsgTopicUsersResult.users.add(powerMsgTopicUser);
                    }
                }
            }
        }
    }

    public final void a(int i2, lbd lbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ce9c92", new Object[]{this, new Integer(i2), lbdVar});
        } else if (((HashMap) this.f12609a).containsKey(Integer.valueOf(i2))) {
            lbdVar.O(new ErrorResult("CREATE_CLIENT_FAILED", "Client already exists: " + i2));
        } else {
            x xVar = new x(lbdVar);
            ((HashMap) this.f12609a).put(Integer.valueOf(i2), new w(xVar, lbdVar));
            mlm.h(i2, xVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void addStreamEventListener(kdb kdbVar, nlm nlmVar, sbd sbdVar) {
        int i2;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f333cc59", new Object[]{this, kdbVar, nlmVar, sbdVar});
        } else if (nlmVar.f24812a == null || TextUtils.isEmpty(nlmVar.b) || nlmVar.d == null) {
            sbdVar.O(new ErrorResult("ADD_STREAM_LISTENER_FAILED", F.a.d));
        } else {
            sjl sjlVar = new sjl();
            sjlVar.n(nlmVar.d.intValue());
            Integer num = nlmVar.e;
            if (num == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            sjlVar.m(i2);
            sjlVar.l(nlmVar.f);
            Boolean bool = nlmVar.g;
            if (bool == null) {
                z2 = false;
            } else {
                z2 = bool.booleanValue();
            }
            sjlVar.k(z2);
            sjlVar.p(j(nlmVar.h, 0L));
            if (n8l.e()) {
                sjlVar.i(2);
            }
            if (mlm.d(nlmVar.f24812a.intValue(), nlmVar.b) == null) {
                MsgLog.g("PowerMsgAbility", "[addStreamEventListener] bizCode=" + nlmVar.f24812a + ", startSeq=" + nlmVar.d);
                mlm.i(nlmVar.f24812a.intValue(), nlmVar.b, new y(nlmVar.d.intValue(), sbdVar));
                mlm.p(nlmVar.f24812a.intValue(), nlmVar.b, "", "", "", "", new b(this, nlmVar, sbdVar), sjlVar, nlmVar.c);
                return;
            }
            sbdVar.O(new ErrorResult("ADD_STREAM_LISTENER_FAILED", "has added"));
        }
    }

    public final void b(xkm xkmVar, jbd jbdVar) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b5c2b6", new Object[]{this, xkmVar, jbdVar});
        } else if (((w) ((HashMap) this.f12609a).get(xkmVar.f31443a)) == null) {
            jbdVar.O(new ErrorResult("COUNT_VALUE_FAILED", "Client does not exist"));
        } else {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ? extends Object> entry : xkmVar.d.entrySet()) {
                if (entry.getValue() != null) {
                    try {
                        hashMap.put(entry.getKey(), Double.valueOf(entry.getValue().toString()));
                    } catch (Exception unused) {
                    }
                }
            }
            int intValue = xkmVar.f31443a.intValue();
            String str = xkmVar.c;
            Boolean bool = xkmVar.b;
            if (bool == null) {
                z2 = false;
            } else {
                z2 = bool.booleanValue();
            }
            mlm.b(intValue, str, hashMap, z2, new i(this, jbdVar), xkmVar.c);
        }
    }

    public final void c(vlm vlmVar, mbd mbdVar) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4801b616", new Object[]{this, vlmVar, mbdVar});
        } else if (((w) ((HashMap) this.f12609a).get(vlmVar.f30088a)) == null) {
            mbdVar.O(new ErrorResult("REQUEST_HISTORY_FAILED", "Client does not exist"));
        } else {
            Integer num = vlmVar.b;
            if (num == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            Integer num2 = vlmVar.c;
            if (num2 == null) {
                i3 = 0;
            } else {
                i3 = num2.intValue();
            }
            int intValue = vlmVar.f30088a.intValue();
            String str = vlmVar.d;
            mlm.l(intValue, str, 404, i2, i3, new j(this, mbdVar), str);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void constructClient(kdb kdbVar, tkm tkmVar, lbd lbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a75e90b", new Object[]{this, kdbVar, tkmVar, lbdVar});
        } else if (tkmVar.f28771a == null) {
            lbdVar.O(new ErrorResult("CREATE_CLIENT_FAILED", F.a.d));
        } else {
            k().submit(new k(tkmVar, lbdVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void countValue(kdb kdbVar, xkm xkmVar, jbd jbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f2cd98", new Object[]{this, kdbVar, xkmVar, jbdVar});
        } else if (xkmVar.f31443a == null || TextUtils.isEmpty(xkmVar.c) || xkmVar.d == null) {
            jbdVar.O(new ErrorResult("COUNT_VALUE_FAILED", F.a.d));
        } else {
            k().submit(new t(xkmVar, jbdVar));
        }
    }

    public final void d(vlm vlmVar, nbd nbdVar) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a24a94", new Object[]{this, vlmVar, nbdVar});
        } else if (((w) ((HashMap) this.f12609a).get(vlmVar.f30088a)) == null) {
            nbdVar.O(new ErrorResult("REQUEST_STATUS_FAILED", "Client does not exist"));
        } else {
            Integer num = vlmVar.b;
            if (num == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            Integer num2 = vlmVar.c;
            if (num2 == null) {
                i3 = 0;
            } else {
                i3 = num2.intValue();
            }
            int intValue = vlmVar.f30088a.intValue();
            String str = vlmVar.d;
            mlm.l(intValue, str, 402, i2, i3, new l(this, nbdVar), str);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void destroyClient(kdb kdbVar, tkm tkmVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5693d7", new Object[]{this, kdbVar, tkmVar, jdbVar});
        } else if (tkmVar.f28771a == null) {
            jdbVar.O(new ErrorResult("DESTROY_CLIENT_FAILED", F.a.d));
        } else {
            k().submit(new o(tkmVar));
        }
    }

    public final void e(vlm vlmVar, obd obdVar) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7186dc90", new Object[]{this, vlmVar, obdVar});
        } else if (((w) ((HashMap) this.f12609a).get(vlmVar.f30088a)) == null) {
            obdVar.O(new ErrorResult("REQUEST_USERS_FAILED", "Client does not exist"));
        } else {
            Integer num = vlmVar.b;
            if (num == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            Integer num2 = vlmVar.c;
            if (num2 == null) {
                i3 = 0;
            } else {
                i3 = num2.intValue();
            }
            int intValue = vlmVar.f30088a.intValue();
            String str = vlmVar.d;
            mlm.l(intValue, str, 403, i2, i3, new m(this, obdVar), str);
        }
    }

    public final void f(ilm ilmVar, pbd pbdVar) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793403e", new Object[]{this, ilmVar, pbdVar});
        } else if (((w) ((HashMap) this.f12609a).get(ilmVar.f21390a)) == null) {
            pbdVar.O(new ErrorResult("SEND_FAILED", "Client does not exist"));
        } else {
            PowerMessage powerMessage = new PowerMessage();
            q(ilmVar.b.header, powerMessage);
            String str = ilmVar.b.data;
            if (str == null) {
                bArr = null;
            } else {
                bArr = str.getBytes();
            }
            powerMessage.data = bArr;
            mlm.k(ilmVar.f21390a.intValue(), powerMessage, new g(this, pbdVar), ilmVar.b.data);
        }
    }

    public final void g(llm llmVar, qbd qbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff93d07c", new Object[]{this, llmVar, qbdVar});
        } else if (((w) ((HashMap) this.f12609a).get(llmVar.f23398a)) == null) {
            qbdVar.O(new ErrorResult("SEND_TEXT_FAILED", "Client does not exist"));
        } else {
            TextPowerMessage textPowerMessage = new TextPowerMessage();
            q(llmVar.b.header, textPowerMessage);
            textPowerMessage.text = llmVar.b.text;
            textPowerMessage.value = new HashMap();
            Map<String, ? extends Object> map = llmVar.b.values;
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        textPowerMessage.value.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
            mlm.n(llmVar.f23398a.intValue(), textPowerMessage, new h(this, qbdVar), llmVar.b.text);
        }
    }

    public final void h(slm slmVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67747dc5", new Object[]{this, slmVar, jdbVar});
            return;
        }
        w wVar = (w) ((HashMap) this.f12609a).get(slmVar.f28133a);
        if (wVar == null) {
            jdbVar.O(new ErrorResult("SUBSCRIBE_FAILED", "Client does not exist"));
        } else if (((HashMap) wVar.c).containsKey(slmVar.b)) {
            MsgLog.g("PowerMsgAbility", "[subscribe] topic has subscribed");
        } else {
            z zVar = new z(null);
            zVar.f12635a = slmVar.d;
            zVar.b = slmVar.e;
            ((HashMap) wVar.c).put(slmVar.b, zVar);
            mlm.o(slmVar.f28133a.intValue(), slmVar.b, r(slmVar.c));
            int intValue = slmVar.f28133a.intValue();
            String str = slmVar.b;
            mlm.s(intValue, str, slmVar.d, slmVar.e, new e(this, slmVar, wVar), str);
        }
    }

    public final void i(amm ammVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83777d93", new Object[]{this, ammVar, jdbVar});
            return;
        }
        w wVar = (w) ((HashMap) this.f12609a).get(ammVar.f15838a);
        if (wVar == null) {
            jdbVar.O(new ErrorResult("UNSUBSCRIBE_FAILED", "Client does not exist"));
            return;
        }
        z zVar = (z) ((HashMap) wVar.c).remove(ammVar.b);
        if (zVar == null) {
            MsgLog.g("PowerMsgAbility", "[unSubscribe] Topic not subscribed");
            return;
        }
        int intValue = ammVar.f15838a.intValue();
        String str = ammVar.b;
        mlm.x(intValue, str, zVar.f12635a, zVar.b, new f(this, ammVar, wVar), str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void preConnect(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb737f9", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        try {
            ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).isAccsConnected();
        } catch (Exception e2) {
            jdbVar.O(new ErrorResult("PRE_CONNECT_FAILED", e2.toString()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void removeStreamEventListener(kdb kdbVar, plm plmVar, tbd tbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b499e0", new Object[]{this, kdbVar, plmVar, tbdVar});
        } else if (plmVar.f26156a == null || TextUtils.isEmpty(plmVar.b)) {
            tbdVar.O(new ErrorResult("REMOVE_STREAM_LISTENER_FAILED", F.a.d));
        } else {
            sjl sjlVar = sjl.empty;
            if (n8l.e()) {
                sjlVar = new sjl();
                sjlVar.i(2);
            }
            mlm.t(plmVar.f26156a.intValue(), plmVar.b);
            mlm.u(plmVar.f26156a.intValue(), plmVar.b, "", "", "", "", new c(this, plmVar, tbdVar), sjlVar, plmVar.c);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void requestHistoryMessages(kdb kdbVar, vlm vlmVar, mbd mbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17977876", new Object[]{this, kdbVar, vlmVar, mbdVar});
        } else if (vlmVar.f30088a == null || TextUtils.isEmpty(vlmVar.d)) {
            mbdVar.O(new ErrorResult("REQUEST_HISTORY_FAILED", F.a.d));
        } else {
            k().submit(new u(vlmVar, mbdVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void requestTopicStatus(kdb kdbVar, vlm vlmVar, nbd nbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d881e96", new Object[]{this, kdbVar, vlmVar, nbdVar});
        } else if (vlmVar.f30088a == null || TextUtils.isEmpty(vlmVar.d)) {
            nbdVar.O(new ErrorResult("REQUEST_STATUS_FAILED", F.a.d));
        } else {
            k().submit(new v(vlmVar, nbdVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void requestTopicUsers(kdb kdbVar, vlm vlmVar, obd obdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4005ec98", new Object[]{this, kdbVar, vlmVar, obdVar});
        } else if (vlmVar.f30088a == null || TextUtils.isEmpty(vlmVar.d)) {
            obdVar.O(new ErrorResult("REQUEST_USERS_FAILED", F.a.d));
        } else {
            k().submit(new a(vlmVar, obdVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void sendMessage(kdb kdbVar, ilm ilmVar, pbd pbdVar) {
        PowerMsgPowerMessage powerMsgPowerMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b55db8", new Object[]{this, kdbVar, ilmVar, pbdVar});
        } else if (ilmVar.f21390a == null || (powerMsgPowerMessage = ilmVar.b) == null || powerMsgPowerMessage.header == null) {
            pbdVar.O(new ErrorResult("SEND_FAILED", F.a.d));
        } else {
            k().submit(new r(ilmVar, pbdVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void sendText(kdb kdbVar, llm llmVar, qbd qbdVar) {
        PowerMsgTextMessage powerMsgTextMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741596b", new Object[]{this, kdbVar, llmVar, qbdVar});
        } else if (llmVar.f23398a == null || (powerMsgTextMessage = llmVar.b) == null || powerMsgTextMessage.header == null) {
            qbdVar.O(new ErrorResult("SEND_TEXT_FAILED", F.a.d));
        } else {
            k().submit(new s(llmVar, qbdVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void subscribe(kdb kdbVar, slm slmVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79e0c89", new Object[]{this, kdbVar, slmVar, jdbVar});
        } else if (slmVar.f28133a == null || TextUtils.isEmpty(slmVar.b)) {
            jdbVar.O(new ErrorResult("SUBSCRIBE_FAILED", F.a.d));
        } else {
            k().submit(new p(slmVar, jdbVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void unSubscribe(kdb kdbVar, amm ammVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6683f629", new Object[]{this, kdbVar, ammVar, jdbVar});
        } else if (ammVar.f15838a == null || TextUtils.isEmpty(ammVar.b)) {
            jdbVar.O(new ErrorResult("UNSUBSCRIBE_FAILED", F.a.d));
        } else {
            k().submit(new q(ammVar, jdbVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void query(kdb kdbVar, olm olmVar, jdb jdbVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f095c0e9", new Object[]{this, kdbVar, olmVar, jdbVar});
        } else if (olmVar.f25461a == null || TextUtils.isEmpty(olmVar.b)) {
            jdbVar.O(new ErrorResult("QUERY_FAILED", F.a.d));
        } else {
            sjl sjlVar = new sjl();
            Integer num = olmVar.c;
            sjlVar.n(num == null ? 0 : num.intValue());
            Integer num2 = olmVar.d;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            sjlVar.j(i2);
            if (!mlm.f(olmVar.f25461a.intValue(), olmVar.b, sjlVar)) {
                jdbVar.O(new ErrorResult("QUERY_FAILED", "some error happened"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class y implements kbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f12633a;
        public final sbd b;
        public final Map<String, Pair<AtomicInteger, PriorityQueue<PowerMessage>>> c = new HashMap();
        public String d;
        public long e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PowerMessage f12634a;

            public a(PowerMessage powerMessage) {
                this.f12634a = powerMessage;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    y.c(y.this, this.f12634a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Comparator<PowerMessage> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b(y yVar) {
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
            t2o.a(628097362);
            t2o.a(628097219);
        }

        public y(int i, sbd sbdVar) {
            this.f12633a = Math.max(1, i);
            this.b = sbdVar;
        }

        public static /* synthetic */ void c(y yVar, PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd1f757d", new Object[]{yVar, powerMessage});
            } else {
                yVar.e(powerMessage);
            }
        }

        @Override // tb.kbd
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
            } else {
                this.b.O(new ErrorResult(String.valueOf(i), "Dispatcher occurred an error"));
            }
        }

        @Override // tb.kbd
        public void b(PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97513d8e", new Object[]{this, powerMessage});
            } else if (powerMessage == null || TextUtils.isEmpty(powerMessage.streamId)) {
                MsgLog.g("PowerMsgAbility", "[onDispatch] msg or streamId is null");
            } else {
                PowerMsgAbility.access$1500().submit(new a(powerMessage));
            }
        }

        public final void d(PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8635fd5a", new Object[]{this, powerMessage});
                return;
            }
            PowerMsgStreamMessagesResult powerMsgStreamMessagesResult = new PowerMsgStreamMessagesResult();
            powerMsgStreamMessagesResult.code = 1000;
            powerMsgStreamMessagesResult.bizCode = Integer.valueOf(powerMessage.bizCode);
            powerMsgStreamMessagesResult.topic = powerMessage.topic;
            powerMsgStreamMessagesResult.streamID = powerMessage.streamId;
            powerMsgStreamMessagesResult.seqNUM = Long.valueOf(powerMessage.seqNum);
            powerMsgStreamMessagesResult.messages = new ArrayList();
            List<PowerMessage.a> list = powerMessage.dataList;
            long j = 0;
            if (list != null) {
                for (PowerMessage.a aVar : list) {
                    PowerMsgStreamMessageDataResult powerMsgStreamMessageDataResult = new PowerMsgStreamMessageDataResult();
                    powerMsgStreamMessageDataResult.messageID = aVar.a();
                    powerMsgStreamMessageDataResult.data = Base64.encodeToString(aVar.b(), 2);
                    powerMsgStreamMessagesResult.messages.add(powerMsgStreamMessageDataResult);
                    j = PowerMsg4WW.getDownRT(aVar, powerMessage, powerMessage.dataList.size());
                }
            }
            powerMsgStreamMessagesResult.downRT = Long.valueOf(j);
            this.b.T(powerMsgStreamMessagesResult);
            if (TextUtils.isEmpty(this.d) || !this.d.equals(powerMessage.streamId)) {
                this.d = powerMessage.streamId;
                this.e = powerMessage.seqNum;
            } else {
                long j2 = powerMessage.seqNum;
                long j3 = this.e;
                if (j2 < j3 || j2 - j3 > 1) {
                    MsgLog.g("PowerMsgAbility", "out of order: ", "msgId:", powerMessage.messageId, "seqNum:", Long.valueOf(j2), "streamCacheSeq", Long.valueOf(this.e));
                    a71.a(a71.POINT_MSG_ORDER, "", "", "");
                } else {
                    a71.b(a71.POINT_MSG_ORDER, "");
                }
            }
            this.e = Math.max(powerMessage.seqNum, this.e);
        }

        public final void e(PowerMessage powerMessage) {
            PowerMessage powerMessage2 = powerMessage;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c6e8862", new Object[]{this, powerMessage2});
                return;
            }
            Pair pair = (Pair) ((HashMap) this.c).get(powerMessage2.streamId);
            if (pair == null) {
                pair = Pair.create(new AtomicInteger(this.f12633a), new PriorityQueue(64, new b(this)));
                ((HashMap) this.c).put(powerMessage2.streamId, pair);
            }
            AtomicInteger atomicInteger = (AtomicInteger) pair.first;
            PriorityQueue priorityQueue = (PriorityQueue) pair.second;
            int i = (powerMessage2.seqNum > atomicInteger.get() ? 1 : (powerMessage2.seqNum == atomicInteger.get() ? 0 : -1));
            long j = powerMessage2.seqNum;
            if (i < 0) {
                MsgLog.g("PowerMsgAbility", "[onDispatch] seqNum < currentSeq", z2k.d.ATTACHED_RESPONSE_HEADER_REQ_NUM, Long.valueOf(j), "currentSeqNum", atomicInteger);
            } else if (j <= atomicInteger.get()) {
                do {
                    d(powerMessage2);
                    int incrementAndGet = atomicInteger.incrementAndGet();
                    PowerMessage powerMessage3 = (PowerMessage) priorityQueue.peek();
                    if (powerMessage3 == null || powerMessage3.seqNum != incrementAndGet) {
                        powerMessage2 = powerMessage3;
                        z = false;
                    } else {
                        powerMessage2 = (PowerMessage) priorityQueue.poll();
                    }
                    if (!z) {
                        return;
                    }
                } while (powerMessage2 != null);
            } else if (!priorityQueue.contains(powerMessage2)) {
                priorityQueue.offer(powerMessage2);
                MsgLog.g("PowerMsgAbility", "[onDispatch] offer queue", z2k.d.ATTACHED_RESPONSE_HEADER_REQ_NUM, Long.valueOf(powerMessage2.seqNum), "currentSeqNum", atomicInteger);
            } else {
                MsgLog.e("PowerMsgAbility", "[onDispatch] contains", z2k.d.ATTACHED_RESPONSE_HEADER_REQ_NUM, Long.valueOf(powerMessage2.seqNum));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPowerMsgAbility
    public void send(kdb kdbVar, qlm qlmVar, ubd ubdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fb03e", new Object[]{this, kdbVar, qlmVar, ubdVar});
        } else if (qlmVar.f26815a == null || TextUtils.isEmpty(qlmVar.b) || TextUtils.isEmpty(qlmVar.c)) {
            ubdVar.O(new ErrorResult("SEND_FAILED", F.a.d));
        } else if (com.taobao.tao.powermsg.managers.a.f(qlmVar.f26815a.intValue(), qlmVar.b) == null) {
            ubdVar.O(new ErrorResult("", "unLogin or unSubscribed"));
        } else {
            sjl sjlVar = new sjl();
            sjlVar.o(qlmVar.c);
            if (n8l.e()) {
                sjlVar.i(2);
            }
            PowerMessage powerMessage = new PowerMessage();
            Integer num = qlmVar.d;
            powerMessage.type = num == null ? 0 : num.intValue();
            powerMessage.bizCode = qlmVar.f26815a.intValue();
            powerMessage.userId = qlmVar.f;
            powerMessage.from = qlmVar.g;
            powerMessage.to = qlmVar.h;
            Boolean bool = qlmVar.i;
            powerMessage.sendFullTags = bool == null ? false : bool.booleanValue();
            List<String> list = qlmVar.j;
            byte[] bArr = null;
            powerMessage.tags = list == null ? null : (String[]) list.toArray(new String[list.size()]);
            Integer num2 = qlmVar.k;
            powerMessage.qosLevel = num2 == null ? 0 : num2.intValue();
            Integer num3 = qlmVar.l;
            powerMessage.priority = num3 == null ? 0 : num3.intValue();
            Boolean bool2 = qlmVar.m;
            powerMessage.needAck = bool2 == null ? false : bool2.booleanValue();
            String str = qlmVar.n;
            if (str != null) {
                bArr = Base64.decode(str, 2);
            }
            powerMessage.data = bArr;
            mlm.m(qlmVar.f26815a.intValue(), powerMessage, sjlVar, new d(this, qlmVar, ubdVar), qlmVar.c);
        }
    }
}
