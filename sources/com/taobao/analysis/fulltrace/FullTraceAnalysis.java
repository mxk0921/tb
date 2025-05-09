package com.taobao.analysis.fulltrace;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.stat.FullTraceMonitor;
import com.taobao.analysis.stat.FullTraceSSRMonitor;
import com.taobao.analysis.stat.FullTraceStatistic;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.FalcoEnvironmentImpl;
import com.taobao.falco.m;
import com.taobao.falco.p;
import com.taobao.falco.q;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.crt;
import tb.ctf;
import tb.e1r;
import tb.k4o;
import tb.mfq;
import tb.o8c;
import tb.qd0;
import tb.rg0;
import tb.ryi;
import tb.tz8;
import tb.v4s;
import tb.zxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FullTraceAnalysis implements o8c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FALCO_LOG_TAG = "FalcoEye";
    private static final long MAX_HISTORY_SIZE = 512;
    private static final long MAX_TIME_OUT = 60000;
    public static final String SEPARATOR = "|";
    public static final String TAG = "falco.FullTraceV2";
    private Map<String, Object> extraInfos;
    private long falcoExtendTimeout;
    private List<String> importantApis;
    private List<String> importantNetworkUrls;
    private volatile boolean isFalcoExtendEnable;
    private volatile boolean isFalcoSSRMonitorEnable;
    private volatile boolean isImportantUser;
    private volatile boolean isTimeoutFix;
    private boolean mIsTLogTraceEnable;
    private boolean mIsTlogTraceError;
    private final l mtopSsrTypeInfo;
    private final l mtopTypeInfo;
    private final l networkTypeInfo;
    private final l pictureTypeInfo;
    private ConcurrentHashMap<String, FullTraceStatistic> requestMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6230a;
        public final /* synthetic */ String b;

        public e(String str, String str2) {
            this.f6230a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ryi ryiVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.i(FullTraceAnalysis.TAG, "[forceCommit]", this.f6230a, "module", this.b);
            FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(this.f6230a);
            if (fullTraceStatistic != null && (ryiVar = fullTraceStatistic.modules.get(this.b)) != null) {
                ryiVar.e = true;
                FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6232a;
        public final /* synthetic */ String b;

        public g(String str, String str2) {
            this.f6232a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FullTraceStatistic fullTraceStatistic = new FullTraceStatistic(this.f6232a);
            FullTraceAnalysis.access$200(FullTraceAnalysis.this).put(this.b, fullTraceStatistic);
            FullTraceAnalysis.access$400(FullTraceAnalysis.this, this.b, fullTraceStatistic);
            ctf.j().q(this.b, fullTraceStatistic);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6233a;

        public h(String str) {
            this.f6233a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FullTraceAnalysis.access$200(FullTraceAnalysis.this).remove(this.f6233a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6234a;
        public final /* synthetic */ String b;
        public final /* synthetic */ k4o c;

        public i(String str, String str2, k4o k4oVar) {
            this.f6234a = str;
            this.b = str2;
            this.c = k4oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            m f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(this.f6234a);
            if (fullTraceStatistic != null) {
                boolean equals = this.b.equals(fullTraceStatistic.reqType);
                k4o k4oVar = this.c;
                if (k4oVar != null) {
                    if (equals) {
                        fullTraceStatistic.falcoId = this.f6234a;
                        fullTraceStatistic.bizId = k4oVar.d;
                        fullTraceStatistic.ret = k4oVar.g;
                        fullTraceStatistic.topic = k4oVar.O;
                        fullTraceStatistic.pageIndex = k4oVar.P;
                        fullTraceStatistic.isReqMain = k4oVar.K ? 1 : 0;
                        fullTraceStatistic.isReqSync = k4oVar.J ? 1 : 0;
                        fullTraceStatistic.isStreamMode = k4oVar.T ? 1 : 0;
                    }
                    if (this.b.equals("network")) {
                        k4o k4oVar2 = this.c;
                        fullTraceStatistic.url = k4oVar2.f22397a;
                        fullTraceStatistic.host = k4oVar2.b;
                        fullTraceStatistic.protocolType = k4oVar2.f;
                        fullTraceStatistic.retryTimes = k4oVar2.c;
                        fullTraceStatistic.netType = k4oVar2.e;
                        fullTraceStatistic.netReqStart = k4oVar2.j;
                        fullTraceStatistic.netReqServiceBindEnd = k4oVar2.k;
                        fullTraceStatistic.netReqProcessStart = k4oVar2.l;
                        fullTraceStatistic.netReqSendStart = k4oVar2.m;
                        fullTraceStatistic.netRspRecvEnd = k4oVar2.n;
                        fullTraceStatistic.netRspCbDispatch = k4oVar2.o;
                        fullTraceStatistic.netRspCbStart = k4oVar2.p;
                        fullTraceStatistic.netRspCbEnd = k4oVar2.q;
                        fullTraceStatistic.reqInflateSize = k4oVar2.v;
                        fullTraceStatistic.reqDeflateSize = k4oVar2.w;
                        fullTraceStatistic.rspDeflateSize = k4oVar2.x;
                        fullTraceStatistic.rspInflateSize = k4oVar2.y;
                        fullTraceStatistic.serverRT = k4oVar2.z;
                        fullTraceStatistic.sendDataTime = k4oVar2.C;
                        fullTraceStatistic.firstDataTime = k4oVar2.D;
                        fullTraceStatistic.recvDataTime = k4oVar2.E;
                        fullTraceStatistic.isCbMain = 0;
                        fullTraceStatistic.netErrorCode = k4oVar2.L;
                        fullTraceStatistic.multiNetworkStatus = k4oVar2.Q;
                        fullTraceStatistic.useMultiPath = k4oVar2.R;
                        fullTraceStatistic.pageReferer = k4oVar2.S;
                    } else {
                        if ("cache".equalsIgnoreCase(this.c.f)) {
                            k4o k4oVar3 = this.c;
                            fullTraceStatistic.url = k4oVar3.f22397a;
                            fullTraceStatistic.host = k4oVar3.b;
                            fullTraceStatistic.protocolType = k4oVar3.f;
                            fullTraceStatistic.rspInflateSize = k4oVar3.y;
                        }
                        if (this.b.equals("mtop") || this.b.equals(mfq.MODULE_SSR)) {
                            k4o k4oVar4 = this.c;
                            fullTraceStatistic.isCbMain = k4oVar4.I ? 1 : 0;
                            fullTraceStatistic.serverRT = k4oVar4.z;
                            fullTraceStatistic.serverBizRT = k4oVar4.A;
                            fullTraceStatistic.serverCrossUnit = k4oVar4.B;
                            fullTraceStatistic.reqFrom = k4oVar4.U ? 1 : 0;
                            fullTraceStatistic.signTime = k4oVar4.G;
                            fullTraceStatistic.bizFirstChunkInflateSize = k4oVar4.X;
                            fullTraceStatistic.bizFirstChunkTime = k4oVar4.W;
                            fullTraceStatistic.isLoginRedo = k4oVar4.Z ? 1 : 0;
                        } else if (this.b.equals("picture")) {
                            fullTraceStatistic.isCbMain = 1;
                        }
                        if (this.b.equals("picture")) {
                            k4o k4oVar5 = this.c;
                            fullTraceStatistic.format = k4oVar5.V;
                            fullTraceStatistic.hitServerCache = k4oVar5.Y;
                        }
                        k4o k4oVar6 = this.c;
                        fullTraceStatistic.serverTraceId = k4oVar6.H;
                        fullTraceStatistic.bizReqStart = k4oVar6.h;
                        fullTraceStatistic.bizReqProcessStart = k4oVar6.i;
                        fullTraceStatistic.bizRspProcessStart = k4oVar6.r;
                        fullTraceStatistic.bizRspCbDispatch = k4oVar6.s;
                        fullTraceStatistic.bizRspCbStart = k4oVar6.t;
                        fullTraceStatistic.bizRspCbEnd = k4oVar6.u;
                        fullTraceStatistic.deserializeTime = k4oVar6.F;
                        fullTraceStatistic.bizErrorCode = k4oVar6.M;
                    }
                    if (equals) {
                        fullTraceStatistic.startType = SceneIdentifier.getStartType();
                        fullTraceStatistic.isFromExternal = SceneIdentifier.isUrlLaunch() ? 1 : 0;
                        fullTraceStatistic.appLaunch = SceneIdentifier.getAppLaunchTime();
                        fullTraceStatistic.lastAppLaunch = SceneIdentifier.getLastLaunchTime();
                        fullTraceStatistic.homeCreate = SceneIdentifier.getHomeCreateTime();
                        fullTraceStatistic.deviceLevel = SceneIdentifier.getDeviceLevel();
                        fullTraceStatistic.pageName = SceneIdentifier.getCurrentPageNameWithFragment();
                        fullTraceStatistic.pageUrl = SceneIdentifier.getCurrentPageUrl();
                        fullTraceStatistic.isBg = SceneIdentifier.isAppBackground() ? 1 : 0;
                        fullTraceStatistic.pageResumeTime = SceneIdentifier.getPageResumeTime();
                        fullTraceStatistic.pageCreateTime = SceneIdentifier.getPageCreateTime();
                        fullTraceStatistic.speedBucket = SceneIdentifier.getBucketInfo();
                        fullTraceStatistic.userType = SceneIdentifier.getUserType();
                        fullTraceStatistic.processId = SceneIdentifier.getProcessId();
                        fullTraceStatistic.processStart = SceneIdentifier.getProcessStartTime();
                        fullTraceStatistic.processType = SceneIdentifier.getProcessName();
                        fullTraceStatistic.lowBuyer = SceneIdentifier.isLowBuyer() ? 1 : 0;
                        tz8 tz8Var = FalcoGlobalTracer.get();
                        if (!(tz8Var == null || (f = tz8Var.f()) == null)) {
                            fullTraceStatistic.loadFalcoId = f.getFalcoId();
                        }
                        FalcoEnvironmentImpl m = FalcoEnvironmentImpl.m();
                        if (m != null) {
                            String c = m.c();
                            com.taobao.falco.e k = m.k();
                            q s = m.s();
                            com.taobao.falco.l a2 = m.a();
                            com.taobao.falco.k l = m.l();
                            p g = m.g();
                            com.taobao.falco.c d = m.d();
                            fullTraceStatistic.envFalcoId = c;
                            fullTraceStatistic.afcId = l.f10470a;
                            fullTraceStatistic.afcType = l.b;
                            fullTraceStatistic.processStart = s.c;
                            fullTraceStatistic.launchStart = a2.b;
                            fullTraceStatistic.launchType = a2.f10471a;
                            fullTraceStatistic.installation = a2.d;
                            fullTraceStatistic.launchStatus = a2.f;
                            fullTraceStatistic.lowPowerMode = d.c;
                            fullTraceStatistic.temperature = d.d;
                            fullTraceStatistic.netType = g.f10475a;
                            fullTraceStatistic.netQualityLevel = g.k;
                            fullTraceStatistic.deviceType = k.f10462a;
                        }
                        l access$500 = FullTraceAnalysis.access$500(FullTraceAnalysis.this, this.b);
                        if (access$500 != null) {
                            access$500.f6237a++;
                            access$500.b += fullTraceStatistic.reqDeflateSize;
                        }
                        if (fullTraceStatistic.isFromExternal == 1) {
                            fullTraceStatistic.landingUrl = SceneIdentifier.getLandingUrl();
                            fullTraceStatistic.landingCreate = SceneIdentifier.getLandingCreateTime();
                            fullTraceStatistic.landingCompletion = SceneIdentifier.getLandingCompletionTime();
                            str = SceneIdentifier.getJumpUrl();
                        } else {
                            str = null;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                jSONObject.put(rg0.JUMP_URL, str);
                            }
                            for (Map.Entry entry : FullTraceAnalysis.access$600(FullTraceAnalysis.this).entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        fullTraceStatistic.extra = jSONObject.toString();
                        fullTraceStatistic.pTraceId = this.c.N;
                        fullTraceStatistic.isTargetFinished = true;
                        if (!FullTraceAnalysis.access$700(FullTraceAnalysis.this) || fullTraceStatistic.reqFrom != 1 || fullTraceStatistic.isFalcoExtendCommit) {
                            FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
                        } else {
                            FullTraceAnalysis.access$800(FullTraceAnalysis.this, this.f6234a);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6235a;

        public j(String str) {
            this.f6235a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.i(FullTraceAnalysis.TAG, "[delayCommit]", null, "falcoId", this.f6235a);
            FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(this.f6235a);
            if (fullTraceStatistic == null) {
                ALog.i(FullTraceAnalysis.TAG, "[delayCommit] commit already, return.", null, new Object[0]);
                return;
            }
            fullTraceStatistic.isFalcoExtendCommit = true;
            FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final FullTraceAnalysis f6236a = new FullTraceAnalysis(null);

        public static /* synthetic */ FullTraceAnalysis a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FullTraceAnalysis) ipChange.ipc$dispatch("3f8ad6f0", new Object[0]);
            }
            return f6236a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        public int f6237a;
        public long b;
    }

    public /* synthetic */ FullTraceAnalysis(b bVar) {
        this();
    }

    public static /* synthetic */ ConcurrentHashMap access$200(FullTraceAnalysis fullTraceAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("f91069d7", new Object[]{fullTraceAnalysis});
        }
        return fullTraceAnalysis.requestMap;
    }

    public static /* synthetic */ void access$300(FullTraceAnalysis fullTraceAnalysis, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14de511e", new Object[]{fullTraceAnalysis, fullTraceStatistic});
        } else {
            fullTraceAnalysis.checkAndCommit(fullTraceStatistic);
        }
    }

    public static /* synthetic */ void access$400(FullTraceAnalysis fullTraceAnalysis, String str, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35644c55", new Object[]{fullTraceAnalysis, str, fullTraceStatistic});
        } else {
            fullTraceAnalysis.handlerTimeoutClean(str, fullTraceStatistic);
        }
    }

    public static /* synthetic */ l access$500(FullTraceAnalysis fullTraceAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("c44ee3d5", new Object[]{fullTraceAnalysis, str});
        }
        return fullTraceAnalysis.getRequestStatisticInfoInner(str);
    }

    public static /* synthetic */ Map access$600(FullTraceAnalysis fullTraceAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f1c9b5a0", new Object[]{fullTraceAnalysis});
        }
        return fullTraceAnalysis.extraInfos;
    }

    public static /* synthetic */ boolean access$700(FullTraceAnalysis fullTraceAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e80f7d8e", new Object[]{fullTraceAnalysis})).booleanValue();
        }
        return fullTraceAnalysis.isFalcoExtendEnable;
    }

    public static /* synthetic */ void access$800(FullTraceAnalysis fullTraceAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1911f3", new Object[]{fullTraceAnalysis, str});
        } else {
            fullTraceAnalysis.delayCommit(str);
        }
    }

    private void delayCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429fcbab", new Object[]{this, str});
        } else {
            crt.l(new j(str), this.falcoExtendTimeout, TimeUnit.MILLISECONDS);
        }
    }

    private String generateFalcoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96bff4d6", new Object[]{this});
        }
        return zxv.b();
    }

    public static FullTraceAnalysis getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FullTraceAnalysis) ipChange.ipc$dispatch("a453114a", new Object[0]);
        }
        return k.a();
    }

    public void addExtraInfo(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce94f86a", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str) && obj != null) {
            this.extraInfos.put(str, obj);
        }
    }

    public void commitModuleTrace(String str, String str2, String str3, Map<String, Pair<Long, Long>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26126f7e", new Object[]{this, str, str2, str3, map});
        } else {
            crt.k(new f(str, str2, str3, map));
        }
    }

    public void commitRequest(String str, String str2, k4o k4oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d0356a", new Object[]{this, str, str2, k4oVar});
        } else if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            crt.k(new i(str, str2, k4oVar));
        }
    }

    public String createRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d2fcdc", new Object[]{this, str});
        }
        String generateFalcoId = generateFalcoId();
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            return generateFalcoId;
        }
        crt.k(new g(str, generateFalcoId));
        return generateFalcoId;
    }

    @Override // tb.o8c
    public void end(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a300860a", new Object[]{this, str, str2, str3, str4});
        } else {
            crt.k(new d(str, str2, str3, str4, System.currentTimeMillis()));
        }
    }

    public void falcoExtend(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1542627d", new Object[]{this, str, map});
        } else {
            crt.k(new a(str, map));
        }
    }

    @Override // tb.o8c
    public void forceCommit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f21c1d", new Object[]{this, str, str2});
        } else {
            crt.k(new e(str, str2));
        }
    }

    @Override // tb.o8c
    public String getFalcoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d91c337", new Object[]{this});
        }
        return createRequest("mtop");
    }

    public l getRequestStatisticInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("d7958d55", new Object[]{this, str});
        }
        l lVar = new l();
        l requestStatisticInfoInner = getRequestStatisticInfoInner(str);
        if (requestStatisticInfoInner != null) {
            lVar.f6237a = requestStatisticInfoInner.f6237a;
            lVar.b = requestStatisticInfoInner.b;
        }
        return lVar;
    }

    @Deprecated
    public String getTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return getFalcoId();
    }

    public boolean isImportantMtopApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6efc50f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.importantApis.contains(str);
    }

    public boolean isImportantMtopUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("314db2a4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i2 = 0; i2 < this.importantApis.size(); i2++) {
            String str2 = this.importantApis.get(i2);
            if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isImportantUser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b15c90e", new Object[]{this})).booleanValue();
        }
        if (this.isImportantUser || SceneIdentifier.getUserType() == 2 || SceneIdentifier.getUserType() == 1) {
            return true;
        }
        return false;
    }

    @Override // tb.o8c
    public void registerStages(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd6d3a", new Object[]{this, str, list});
        } else {
            crt.k(new b(str, list));
        }
    }

    public void setFalcoExtendEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eebe555", new Object[]{this, new Boolean(z)});
        } else {
            this.isFalcoExtendEnable = z;
        }
    }

    public void setFalcoExtendTimeout(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477951f1", new Object[]{this, new Long(j2)});
        } else if (j2 >= 0) {
            this.falcoExtendTimeout = j2;
        }
    }

    public void setFalcoSSRMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4502a47", new Object[]{this, new Boolean(z)});
        } else {
            this.isFalcoSSRMonitorEnable = z;
        }
    }

    public void setImportantUser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d5c42", new Object[]{this, new Boolean(z)});
        } else {
            this.isImportantUser = z;
        }
    }

    public void setTLogTraceEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c969f2d7", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsTLogTraceEnable = z;
        }
    }

    public void setTimeoutFix(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9aa3f7", new Object[]{this, new Boolean(z)});
        } else {
            this.isTimeoutFix = z;
        }
    }

    @Override // tb.o8c
    public void start(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6015f711", new Object[]{this, str, str2, str3, str4});
        } else {
            crt.k(new c(str, str2, str3, str4, System.currentTimeMillis()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6226a;
        public final /* synthetic */ Map b;

        public a(String str, Map map) {
            this.f6226a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FullTraceAnalysis.access$700(FullTraceAnalysis.this)) {
                ALog.i(FullTraceAnalysis.TAG, "[falcoExtend]", null, "falcoId", this.f6226a, "params", this.b);
                FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(this.f6226a);
                if (fullTraceStatistic != null) {
                    try {
                        long longValue = ((Long) this.b.get("preProcessStart")).longValue();
                        long longValue2 = ((Long) this.b.get("postProcessEnd")).longValue();
                        fullTraceStatistic.preProcessStart = longValue;
                        fullTraceStatistic.postProcessEnd = longValue2;
                        fullTraceStatistic.isFalcoExtendCommit = true;
                        FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
                    } catch (Exception unused) {
                        ALog.e(FullTraceAnalysis.TAG, "[falcoExtend]params error", null, new Object[0]);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6227a;
        public final /* synthetic */ List b;

        public b(String str, List list) {
            this.f6227a = str;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.i(FullTraceAnalysis.TAG, "[registerStages]", null, "module", this.f6227a, "stages", this.b.toString());
            if (!TextUtils.isEmpty(this.f6227a) && (list = this.b) != null && list.size() > 0) {
                ryi.a(this.f6227a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6228a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;

        public c(String str, String str2, String str3, String str4, long j) {
            this.f6228a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FullTraceStatistic fullTraceStatistic;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.i(FullTraceAnalysis.TAG, "[start]", this.f6228a, "module", this.b, "tag", this.c, v4s.PARAM_UPLOAD_STAGE, this.d, "time", Long.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f6228a) && !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.d) && (fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(this.f6228a)) != null) {
                ryi ryiVar = fullTraceStatistic.modules.get(this.b);
                if (ryiVar == null) {
                    ryiVar = new ryi(this.b);
                    fullTraceStatistic.modules.put(this.b, ryiVar);
                }
                if (!TextUtils.isEmpty(this.c)) {
                    ryiVar.b = this.c;
                }
                if (ryiVar.c(this.d)) {
                    ((HashMap) ryiVar.c).put(this.d, new Pair(Long.valueOf(this.e), 0L));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6229a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;

        public d(String str, String str2, String str3, String str4, long j) {
            this.f6229a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FullTraceStatistic fullTraceStatistic;
            ryi ryiVar;
            Pair pair;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.i(FullTraceAnalysis.TAG, "[end]", this.f6229a, "module", this.b, "tag", this.c, v4s.PARAM_UPLOAD_STAGE, this.d, "time", Long.valueOf(this.e));
            if (!TextUtils.isEmpty(this.f6229a) && !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.d) && (fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(this.f6229a)) != null && (ryiVar = fullTraceStatistic.modules.get(this.b)) != null && (pair = (Pair) ((HashMap) ryiVar.c).get(this.d)) != null && ((Long) pair.first).longValue() > 0) {
                if (ryiVar.c(this.d)) {
                    ((HashMap) ryiVar.c).put(this.d, new Pair(pair.first, Long.valueOf(this.e)));
                }
                FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6231a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public f(String str, String str2, String str3, Map map) {
            this.f6231a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map map;
            FullTraceStatistic fullTraceStatistic;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.i(FullTraceAnalysis.TAG, "[commitModuleTrace]", this.f6231a, "module", this.b, "tag", this.c, "stages", this.d);
            if (!TextUtils.isEmpty(this.f6231a) && !TextUtils.isEmpty(this.b) && (map = this.d) != null && map.size() > 0 && (fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(this.f6231a)) != null) {
                ryi ryiVar = fullTraceStatistic.modules.get(this.b);
                if (ryiVar == null) {
                    ryiVar = new ryi(this.b);
                    fullTraceStatistic.modules.put(this.b, ryiVar);
                }
                if (!TextUtils.isEmpty(this.c)) {
                    ryiVar.b = this.c;
                }
                ((HashMap) ryiVar.c).putAll(this.d);
                ryiVar.e = true;
                FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
            }
        }
    }

    private FullTraceAnalysis() {
        this.requestMap = new ConcurrentHashMap<>();
        this.extraInfos = new ConcurrentHashMap();
        this.importantApis = new CopyOnWriteArrayList();
        this.importantNetworkUrls = new CopyOnWriteArrayList();
        this.isImportantUser = false;
        this.mIsTLogTraceEnable = false;
        this.mIsTlogTraceError = false;
        this.isFalcoExtendEnable = false;
        this.falcoExtendTimeout = 3000L;
        this.isFalcoSSRMonitorEnable = true;
        this.isTimeoutFix = true;
        this.networkTypeInfo = new l();
        this.mtopTypeInfo = new l();
        this.pictureTypeInfo = new l();
        this.mtopSsrTypeInfo = new l();
    }

    private void checkAndCommit(FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b23563f", new Object[]{this, fullTraceStatistic});
        } else if (fullTraceStatistic.isTargetFinished) {
            for (ryi ryiVar : fullTraceStatistic.modules.values()) {
                if (!ryiVar.b()) {
                    return;
                }
            }
            fullTraceStatistic.moduleTrace = fullTraceStatistic.buildModuleTrace();
            if (!TextUtils.isEmpty(fullTraceStatistic.url)) {
                if (e1r.b()) {
                    Log.e(TAG, fullTraceStatistic.toString());
                } else {
                    ALog.e(TAG, fullTraceStatistic.toString(), null, new Object[0]);
                }
                reportTraceLog(fullTraceStatistic.falcoId, fullTraceStatistic.pTraceId, fullTraceStatistic.ret, fullTraceStatistic.netErrorCode, fullTraceStatistic.bizErrorCode, fullTraceStatistic.toTraceLog());
                AppMonitor.getInstance().commitStat(fullTraceStatistic);
                ctf.j().f(fullTraceStatistic.falcoId, fullTraceStatistic);
                if (isImportantMtopUrl(fullTraceStatistic.url) || isImportantUser() || isImportantNetworkUrl(fullTraceStatistic.url)) {
                    AppMonitor.getInstance().commitStat(new FullTraceMonitor(fullTraceStatistic));
                }
                if (this.isFalcoSSRMonitorEnable && mfq.MODULE_SSR.equals(fullTraceStatistic.reqType)) {
                    AppMonitor.getInstance().commitStat(new FullTraceSSRMonitor(fullTraceStatistic));
                }
                this.requestMap.remove(fullTraceStatistic.falcoId);
                Runnable runnable = fullTraceStatistic.timeoutRunnable;
                if (runnable != null) {
                    crt.c(runnable);
                }
            }
        }
    }

    public void log(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08b82f3", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(str3);
            sb.append("|");
            if (!TextUtils.isEmpty(str4)) {
                sb.append(str4);
            }
            AdapterForTLog.loge(FALCO_LOG_TAG, sb.toString());
        } catch (Throwable unused) {
            ALog.e(TAG, "log error.", null, new Object[0]);
        }
    }

    public boolean isImportantNetworkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e0f66e", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i2 = 0; i2 < this.importantNetworkUrls.size(); i2++) {
            try {
                String str2 = this.importantNetworkUrls.get(i2);
                if (!TextUtils.isEmpty(str2) && str.toLowerCase().contains(str2)) {
                    return true;
                }
            } catch (Exception unused) {
                ALog.e(TAG, "[isImportantNetworkUrl]error", null, new Object[0]);
            }
        }
        return false;
    }

    public void setImportantMtopApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6c4a43", new Object[]{this, str});
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                copyOnWriteArrayList.add(jSONArray.getString(i2));
            }
        } catch (Exception unused) {
            ALog.e(TAG, "parse important mtop apis error", null, new Object[0]);
        }
        this.importantApis = copyOnWriteArrayList;
    }

    public void setImportantNetworkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9873c632", new Object[]{this, str});
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                copyOnWriteArrayList.add(jSONArray.getString(i2));
            }
        } catch (Exception unused) {
            ALog.e(TAG, "parse important network urls error", null, new Object[0]);
        }
        this.importantNetworkUrls = copyOnWriteArrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r6.equals(tb.mfq.MODULE_SSR) == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.analysis.fulltrace.FullTraceAnalysis.l getRequestStatisticInfoInner(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.analysis.fulltrace.FullTraceAnalysis.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "8d359509"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r6 = (com.taobao.analysis.fulltrace.FullTraceAnalysis.l) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -577741570: goto L_0x0047;
                case -151775461: goto L_0x003d;
                case 3362248: goto L_0x0031;
                case 1843485230: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0052
        L_0x0025:
            java.lang.String r0 = "network"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002f
            goto L_0x0023
        L_0x002f:
            r0 = 3
            goto L_0x0052
        L_0x0031:
            java.lang.String r0 = "mtop"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003b
            goto L_0x0023
        L_0x003b:
            r0 = 2
            goto L_0x0052
        L_0x003d:
            java.lang.String r1 = "mtop_ssr"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0052
            goto L_0x0023
        L_0x0047:
            java.lang.String r0 = "picture"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0051
            goto L_0x0023
        L_0x0051:
            r0 = 0
        L_0x0052:
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x005d;
                case 2: goto L_0x005a;
                case 3: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            r6 = 0
            goto L_0x0062
        L_0x0057:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r6 = r5.networkTypeInfo
            goto L_0x0062
        L_0x005a:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r6 = r5.mtopTypeInfo
            goto L_0x0062
        L_0x005d:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r6 = r5.mtopSsrTypeInfo
            goto L_0x0062
        L_0x0060:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r6 = r5.pictureTypeInfo
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.fulltrace.FullTraceAnalysis.getRequestStatisticInfoInner(java.lang.String):com.taobao.analysis.fulltrace.FullTraceAnalysis$l");
    }

    private void handlerTimeoutClean(String str, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a806e69", new Object[]{this, str, fullTraceStatistic});
        } else if (this.isTimeoutFix) {
            h hVar = new h(str);
            fullTraceStatistic.timeoutRunnable = hVar;
            crt.l(hVar, 60000L, TimeUnit.MILLISECONDS);
        } else if (this.requestMap.size() > 512) {
            ALog.e(TAG, "requestMap record check.", null, "size", Integer.valueOf(this.requestMap.size()));
            Iterator<Map.Entry<String, FullTraceStatistic>> it = this.requestMap.entrySet().iterator();
            while (it.hasNext()) {
                if (System.currentTimeMillis() - it.next().getValue().createTimestamp > 60000) {
                    it.remove();
                }
            }
        }
    }

    private void reportTraceLog(String str, String str2, int i2, String str3, String str4, String str5) {
        String valueOf;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b228b3", new Object[]{this, str, str2, new Integer(i2), str3, str4, str5});
        } else if (this.mIsTLogTraceEnable && !this.mIsTlogTraceError) {
            try {
                String str7 = TextUtils.isEmpty(str2) ? "empty" : str2;
                long currentTimeMillis = System.currentTimeMillis();
                if (i2 == 0) {
                    valueOf = "1";
                } else if (i2 == 1) {
                    valueOf = "0";
                } else {
                    valueOf = String.valueOf(i2);
                }
                String str8 = "";
                if (i2 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(TextUtils.isEmpty(str3) ? str8 : str3);
                    sb.append("_");
                    if (!TextUtils.isEmpty(str4)) {
                        str8 = str4;
                    }
                    sb.append(str8);
                    str6 = sb.toString();
                } else {
                    str6 = str8;
                }
                qd0.b(str, str7, "AliFulltraceSDK", currentTimeMillis, "request_finish", valueOf, str6, str5);
            } catch (Throwable unused) {
                ALog.e(TAG, "[reportTraceLog]error.", null, new Object[0]);
                this.mIsTlogTraceError = true;
            }
        }
    }
}
