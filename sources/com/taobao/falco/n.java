package com.taobao.falco;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.j;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.weex.ui.component.WXImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cck;
import tb.ckh;
import tb.ess;
import tb.lca;
import tb.mfq;
import tb.paq;
import tb.pz8;
import tb.s9u;
import tb.tz8;
import tb.uqq;
import tb.utn;
import tb.uz8;
import tb.wy8;
import tb.xy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n extends pz8 implements m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LEAVE_TYPE_BACK = "back";
    public static final String LEAVE_TYPE_F2B = "F2B";
    public static final String LEAVE_TYPE_JUMP_NEXT_PAGE = "jumpNextPage";
    public static volatile wy8 a0;
    public long J;
    public String K;
    public final String L;
    public long M;
    public volatile xy8 R;
    public volatile boolean S;
    public volatile boolean T;
    public volatile m U;
    public volatile boolean V;
    public volatile String W;
    public volatile String X;
    public volatile String e0;
    public FalcoLoadActionMonitor h0;
    public int i0;
    public FullTraceAnalysis.l j0;
    public FullTraceAnalysis.l k0;
    public FullTraceAnalysis.l l0;
    public FullTraceAnalysis.l m0;
    public volatile boolean n0;
    public volatile FullTraceAnalysis.l o0;
    public volatile FullTraceAnalysis.l p0;
    public volatile FullTraceAnalysis.l q0;
    public volatile FullTraceAnalysis.l r0;
    public static final uqq FALCO_ID = new uqq("falcoId");
    public static final uqq FROM_TOUCH_FALCO_ID = new uqq("touchFalcoId");
    public static final uqq FROM_LOAD_FALCO_ID = new uqq("parentFalcoId");
    public static final uqq TOUCH_CATEGORY = new uqq("touchCategory");
    public static final uqq TECH_STACK = new uqq("techStack");
    public static final uqq USER_ID = new uqq("uid");
    public static final uqq FROM_PAGE_NAME = new uqq("fromPageName");
    public static final uqq FROM_SUB_PAGE_NAME = new uqq("fromSubPageName");
    public static final uqq FROM_PAGE_URL = new uqq("fromPageURL");
    public static final uqq PAGE_NAME = new uqq("pageName");
    public static final uqq PAGE_URL = new uqq("pageURL");
    public static final uqq PAGE_SPM = new uqq("pageSpm");
    public static final uqq PAGE_SCM = new uqq("pageScm");
    public static final uqq PAGE_TYPE = new uqq("pageType");
    public static final uqq PAGE_LEVEL = new uqq("pageLevel");
    public static final uqq IS_PRE_LOAD = new uqq("isPreload");
    public static final uqq TRANSITION_TYPE = new uqq("transition");
    public static final uqq TOPIC = new uqq("topic");
    public static final uqq AB_BUCKET_IDS = new uqq("abBucketIds");
    public static final uqq IS_FIRST_LOAD = new uqq("isFirstLoad");
    public static final uqq ERROR_CODE = new uqq("errorCode");
    public static final ckh TOUCH_START_TIME = new ckh("touchStartT");
    public static final ckh FIRST_TOUCH_UP_TIME = new ckh("firstTouchUpT");
    public static final ckh BIZ_USER_ACTION_TIME = new ckh("bizStartTime");
    public static final ckh OPEN_PAGE = new ckh(BehavorID.OPENPAGE);
    public static final ckh ROUTE_START = new ckh(IMultiTabPerformanceListener.ON_ROUTE_START);
    public static final ckh ROUTE_END = new ckh(IMultiTabPerformanceListener.ON_ROUTE_END);
    public static final ckh PAGE_START_TIME = new ckh("pageStartT");
    public static final ckh PAGE_CREATE_START = new ckh("pageCreateS");
    public static final ckh CONTAINER_INIT_START = new ckh(IMultiTabPerformanceListener.ON_CONTAINER_INIT_START);
    public static final ckh CONTAINER_INIT_END = new ckh(IMultiTabPerformanceListener.ON_CONTAINER_INIT_END);
    public static final ckh ENGINE_INIT_START = new ckh(IMultiTabPerformanceListener.ON_ENGINE_INIT_START);
    public static final ckh ENGINE_INIT_END = new ckh(IMultiTabPerformanceListener.ON_ENGINE_INIT_END);
    public static final ckh PAGE_CREATE_END = new ckh("pageCreateE");
    public static final ckh MAIN_DOC_REQUEST_START = new ckh(IMultiTabPerformanceListener.ON_REQUEST_START);
    public static final ckh MAIN_DOC_REQUEST_END = new ckh(IMultiTabPerformanceListener.ON_REQUEST_END);
    public static final ckh PAGE_READY_VISIBLE_START = new ckh("readyVisibleS");
    public static final ckh PAGE_READY_VISIBLE_END = new ckh("readyVisibleE");
    public static final ckh PAGE_READY_FIRST_FRAME_START = new ckh("readyFirstFrameS");
    public static final ckh PAGE_READY_FIRST_FRAME_END = new ckh("readyFirstFrameE");
    public static final ckh PAGE_FIRST_FRAME_RENDER_START = new ckh("firstFrameRenderS");
    public static final ckh PAGE_FIRST_FRAME_RENDER_END = new ckh("firstFrameRenderE");
    public static final ckh PAGE_BIZ_DISPLAY_TIME = new ckh("bizDisplayT");
    public static final ckh PAGE_DISPLAY_TIME = new ckh("displayT");
    public static final ckh PAGE_FCP_TIME = new ckh("fcp");
    public static final ckh PAGE_FMP_TIME = new ckh("fmp");
    public static final ckh PAGE_FSP_TIME = new ckh("fsp");
    public static final ckh PAGE_FFSP_TIME = new ckh("ffsp");
    public static final ckh PAGE_INTERACTIVE_TIME = new ckh("tti");
    public static final uqq CONTAINER_COLD_LAUNCH = new uqq("containerColdLaunch");
    public static final uqq RENDER_TYPE = new uqq("renderType");
    public static final uqq HIT_SNAPSHOT = new uqq("hitSnapshot");
    public static final uqq KERNEL_TYPE = new uqq("kernelType");
    public static final uqq CONTAINER_APP_ID = new uqq("containerAppId");
    public static final uqq IS_HIT_CACHE = new uqq("isHitCache");
    public static final uqq IS_RECOVERY = new uqq("systemRecovery");
    public static final ckh LEAVE_TIME = new ckh("leaveTime");
    public static final uqq LEAVE_TYPE = new uqq("leaveType");
    public static final uqq LOW_BUYER = new uqq("lowBuyer");
    public static final uqq ERROR_DESC = new uqq(WXImage.ERRORDESC);
    public static final uqq ERROR_SIGNAL = new uqq("errorSignal");
    public static final ckh TAP_RESPONSE = new ckh("tapResponse");
    public static final ckh BIZ_FIRST_SCREEN = new ckh("bizFirstScreen");
    public static final ckh FIRST_SCREEN = new ckh("firstScreen");
    public static final ckh INTERACTIVE = new ckh(lca.STAGE_INTERACTIVE);
    public long c0 = -1;
    public long N = -1;
    public long O = -1;
    public long d0 = -1;
    public boolean P = false;
    public final List<ckh> Q = new CopyOnWriteArrayList();
    public volatile long Y = -1;
    public volatile long Z = -1;
    public volatile long f0 = -1;
    public volatile boolean g0 = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static final a DEFAULT = new a();

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f10473a;
        public final List<String> b;

        public a() {
            ArrayList arrayList = new ArrayList(6);
            this.f10473a = arrayList;
            ArrayList arrayList2 = new ArrayList(2);
            this.b = arrayList2;
            arrayList.add(n.FALCO_ID.getKey());
            arrayList.add(n.FROM_LOAD_FALCO_ID.getKey());
            arrayList.add(n.x1().getKey());
            arrayList.add(n.FROM_TOUCH_FALCO_ID.getKey());
            arrayList.add(n.PAGE_NAME.getKey());
            arrayList.add(n.FROM_PAGE_NAME.getKey());
            arrayList2.add(n.PAGE_URL.getKey());
            arrayList2.add(n.FROM_PAGE_URL.getKey());
        }
    }

    public n(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list) {
        super(s9uVar, str, str2, j, map, list, "MobileService");
        this.M = -1L;
        this.M = j;
        c2(USER_ID, uz8.e());
        String a2 = uz8.a();
        this.L = a2;
        c2(FALCO_ID, a2);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -914382501) {
            return super.X((String) objArr[0], (String) objArr[1]);
        }
        if (hashCode == 419863331) {
            return super.f((String) objArr[0], (Number) objArr[1]);
        }
        if (hashCode == 504520428) {
            return super.J0((ess) objArr[0], objArr[1]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/falco/FalcoLoadActionSpanImpl");
    }

    public static /* synthetic */ uqq x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqq) ipChange.ipc$dispatch("adb7b439", new Object[0]);
        }
        return pz8.ENV_FALCO_ID;
    }

    public void A1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42eaf6f0", new Object[]{this, str});
        } else {
            c2(FROM_LOAD_FALCO_ID, str);
        }
    }

    @Override // com.taobao.falco.m
    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ef0f67", new Object[]{this, str});
        } else {
            c2(FROM_PAGE_URL, M1(str, 512));
        }
    }

    public void B1(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8b112e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.V = z;
        uqq uqqVar = IS_RECOVERY;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        c2(uqqVar, str);
    }

    public void C1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62719c14", new Object[]{this, str});
        } else {
            c2(FROM_TOUCH_FALCO_ID, str);
        }
    }

    @Override // com.taobao.falco.m
    public void D(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874e79f7", new Object[]{this, l});
        } else {
            i0(CONTAINER_INIT_START, l.longValue());
        }
    }

    public boolean D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66da2c31", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    @Override // com.taobao.falco.m
    public void E(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5c531", new Object[]{this, l});
        } else {
            i0(MAIN_DOC_REQUEST_END, l.longValue());
        }
    }

    public String E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8b498c3", new Object[]{this});
        }
        return this.X;
    }

    @Override // com.taobao.falco.m
    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7251c3a", new Object[]{this, str});
        } else {
            c2(PAGE_TYPE, str);
        }
    }

    public long F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1eace0d", new Object[]{this})).longValue();
        }
        return this.J;
    }

    @Override // com.taobao.falco.m
    public void G(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78347f5f", new Object[]{this, l});
        } else {
            c2(PAGE_FFSP_TIME, Long.valueOf(cck.v0(l) - z()));
        }
    }

    public long G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("425825e5", new Object[]{this})).longValue();
        }
        return this.Y;
    }

    public long H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f142685", new Object[]{this})).longValue();
        }
        return this.Z;
    }

    public boolean I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("685bf258", new Object[]{this})).booleanValue();
        }
        return this.S;
    }

    @Override // com.taobao.falco.m
    public void J(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b99b14f", new Object[]{this, l});
        } else {
            i0(ENGINE_INIT_END, l.longValue());
        }
    }

    @Override // tb.cck
    public synchronized <T> paq J0(ess<T> essVar, T t) {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            return this;
        }
        return (paq) ipChange.ipc$dispatch("1e125eec", new Object[]{this, essVar, t});
    }

    public boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29404483", new Object[]{this})).booleanValue();
        }
        return this.V;
    }

    @Override // com.taobao.falco.m
    public void K(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bb6336", new Object[]{this, l});
        } else {
            i0(PAGE_CREATE_END, l.longValue());
        }
    }

    public boolean K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9570c05", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    @Override // com.taobao.falco.m
    public void L(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e53b06", new Object[]{this, l});
        } else {
            i0(PAGE_FIRST_FRAME_RENDER_START, l.longValue());
        }
    }

    public void L1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2da662", new Object[]{this, str});
        } else {
            c2(LEAVE_TYPE, str);
        }
    }

    @Override // com.taobao.falco.m
    public void M(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aab6d37", new Object[]{this, new Boolean(z)});
            return;
        }
        uqq uqqVar = IS_FIRST_LOAD;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        c2(uqqVar, str);
    }

    public final String M1(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("513e23fa", new Object[]{this, str, new Integer(i)});
        }
        if (str == null || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    @Override // com.taobao.falco.m
    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4658ff06", new Object[]{this, str});
        } else {
            c2(PAGE_LEVEL, str);
        }
    }

    @Override // com.taobao.falco.m
    public void O(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752b6081", new Object[]{this, mVar});
        } else {
            this.U = mVar;
        }
    }

    public void O1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e8e03f", new Object[]{this, l});
        } else {
            i0(OPEN_PAGE, l.longValue());
        }
    }

    @Override // com.taobao.falco.m
    public void P(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e204fd6", new Object[]{this, l});
        } else {
            i0(ENGINE_INIT_START, l.longValue());
        }
    }

    public void P1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0faf81", new Object[]{this, new Long(j)});
        } else {
            this.J = j;
        }
    }

    @Override // com.taobao.falco.m
    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6aea315", new Object[]{this, str});
            return;
        }
        this.e0 = str;
        c2(FROM_PAGE_NAME, str);
    }

    public boolean Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2af9b564", new Object[]{this})).booleanValue();
        }
        return j0().containsKey(PAGE_CREATE_START.getKey());
    }

    @Override // com.taobao.falco.m
    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd242868", new Object[]{this, str});
        } else {
            c2(KERNEL_TYPE, str);
        }
    }

    public void R1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97175366", new Object[]{this, l});
            return;
        }
        this.Y = cck.v0(l);
        i0(PAGE_DISPLAY_TIME, this.Y);
    }

    @Override // tb.cck, tb.paq
    public synchronized paq S(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            return this;
        }
        return (paq) ipChange.ipc$dispatch("738fef3", new Object[]{this, str, new Boolean(z)});
    }

    public void S1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a38906", new Object[]{this, l});
            return;
        }
        this.Z = cck.v0(l);
        ckh ckhVar = PAGE_INTERACTIVE_TIME;
        m0(ckhVar, i0(ckhVar, this.Z));
    }

    public void T1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86851317", new Object[]{this, l});
        } else {
            i0(PAGE_READY_FIRST_FRAME_START, l.longValue());
        }
    }

    @Override // com.taobao.falco.m
    public void U(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9384ff98", new Object[]{this, l});
        } else {
            i0(ROUTE_END, l.longValue());
        }
    }

    @Override // tb.pz8
    public void U0(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7266a477", new Object[]{this, new Long(j), str});
            return;
        }
        long j2 = this.O;
        if (j2 >= 0) {
            long j3 = this.N;
            if (j3 >= 0) {
                c2(BIZ_FIRST_SCREEN, Long.valueOf(j2 - j3));
            }
        }
        if (this.Y >= 0 && this.N >= 0) {
            c2(FIRST_SCREEN, Long.valueOf(this.Y - this.N));
        }
        if (this.Z >= 0 && this.Y >= 0) {
            c2(INTERACTIVE, Long.valueOf(this.Z - this.Y));
        }
        i0(LEAVE_TIME, j);
        X1();
    }

    public void U1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41784746", new Object[]{this, l});
        } else {
            i0(PAGE_START_TIME, l.longValue());
        }
    }

    @Override // com.taobao.falco.m
    public void V(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58712fdf", new Object[]{this, l});
        } else {
            i0(ROUTE_START, l.longValue());
        }
    }

    public final void V1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c00390", new Object[]{this, new Long(j)});
            return;
        }
        A("pageName=" + A0(PAGE_NAME.getKey()) + ",falcoId=" + getFalcoId() + ",tapResponse=" + j);
    }

    public long W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5ea6e1b", new Object[]{this})).longValue();
        }
        long j = this.N - this.M;
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    public xy8 W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xy8) ipChange.ipc$dispatch("b0d587ac", new Object[]{this});
        }
        xy8 xy8Var = this.R;
        this.R = null;
        return xy8Var;
    }

    @Override // tb.cck, tb.paq
    public synchronized paq X(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            return this;
        }
        return (paq) ipChange.ipc$dispatch("c97fa15b", new Object[]{this, str, str2});
    }

    public long Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("814d4b00", new Object[]{this})).longValue();
        }
        long j = this.Z - this.M;
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    public void Y1(xy8 xy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640864e4", new Object[]{this, xy8Var});
        } else {
            this.R = xy8Var;
        }
    }

    @Override // com.taobao.falco.m
    public void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caa9ea3", new Object[]{this, str});
        } else {
            c2(TECH_STACK, str);
        }
    }

    public void Z1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b0cbbb", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    @Override // com.taobao.falco.m
    public void a0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62e0b47", new Object[]{this, l});
            return;
        }
        this.M = cck.v0(l);
        long z = z();
        this.d = this.M;
        Iterator it = ((CopyOnWriteArrayList) this.Q).iterator();
        while (it.hasNext()) {
            ckh ckhVar = (ckh) it.next();
            c2(ckhVar, Long.valueOf((((Long) A0(ckhVar.getKey())).longValue() + z) - z()));
        }
    }

    public void a2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07af35e", new Object[]{this, str});
        } else {
            c2(ERROR_CODE, str);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af58449c", new Object[]{this});
        } else {
            this.i0++;
        }
    }

    public void b2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eaaa113", new Object[]{this, str});
        } else {
            this.X = str;
        }
    }

    public void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1db349d", new Object[]{this, l});
        } else if (this.f0 == -1) {
            this.f0 = y1(l);
        }
    }

    @Override // com.taobao.falco.m
    public void c0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89d23fd", new Object[]{this, l});
        } else {
            i0(PAGE_CREATE_START, l.longValue());
        }
    }

    public final <T> void c2(ess<T> essVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a87821", new Object[]{this, essVar, t});
        } else {
            super.J0(essVar, t);
        }
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc2b551", new Object[]{this})).longValue();
        }
        return this.c0;
    }

    public void d2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3b1674", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("416906df", new Object[]{this})).longValue();
        }
        long j = this.O - this.M;
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    @Override // com.taobao.falco.m
    public void e0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c6f338", new Object[]{this, l});
        } else {
            i0(MAIN_DOC_REQUEST_START, l.longValue());
        }
    }

    public void e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4628200b", new Object[]{this});
        } else {
            this.P = true;
        }
    }

    @Override // tb.cck, tb.paq
    public synchronized paq f(String str, Number number) {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            return this;
        }
        return (paq) ipChange.ipc$dispatch("19069b23", new Object[]{this, str, number});
    }

    @Override // com.taobao.falco.m
    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7dc0f6c", new Object[]{this, str});
        } else {
            c2(CONTAINER_APP_ID, str);
        }
    }

    @Override // tb.pz8
    public List<String> f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ef41017", new Object[]{this});
        }
        return a.DEFAULT.f10473a;
    }

    public void f2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8859782e", new Object[]{this, str});
        } else {
            c2(TOUCH_CATEGORY, str);
        }
    }

    public void g2(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82d4896", new Object[]{this, l});
        } else {
            c2(TOUCH_START_TIME, Long.valueOf(cck.v0(l)));
        }
    }

    @Override // com.taobao.falco.m
    public String getFalcoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d91c337", new Object[]{this});
        }
        return this.L;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.W;
    }

    @Override // com.taobao.falco.m
    public void h(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8be6351", new Object[]{this, l});
            return;
        }
        long v0 = cck.v0(l);
        this.O = v0;
        ckh ckhVar = PAGE_BIZ_DISPLAY_TIME;
        m0(ckhVar, i0(ckhVar, v0));
    }

    @Override // com.taobao.falco.m
    public void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc56a80", new Object[]{this, str});
        } else {
            c2(TOPIC, str);
        }
    }

    @Override // com.taobao.falco.m
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8ab081", new Object[]{this, str});
        } else {
            c2(RENDER_TYPE, str);
        }
    }

    public final long i0(ckh ckhVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37e08779", new Object[]{this, ckhVar, new Long(j)})).longValue();
        }
        long y1 = y1(Long.valueOf(j));
        c2(ckhVar, Long.valueOf(y1));
        ((CopyOnWriteArrayList) this.Q).add(ckhVar);
        return y1;
    }

    @Override // com.taobao.falco.m
    public void j(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f26a10e", new Object[]{this, new Boolean(z)});
            return;
        }
        uqq uqqVar = IS_PRE_LOAD;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        c2(uqqVar, str);
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86e9dc7", new Object[]{this});
        } else if (this.n0 && !this.g0) {
            this.o0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo("network");
            this.q0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo("picture");
            this.p0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo("mtop");
            this.r0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo(mfq.MODULE_SSR);
        }
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b47593f", new Object[]{this});
        }
        return this.e0;
    }

    @Override // com.taobao.falco.m
    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d065ef1", new Object[]{this, str});
            return;
        }
        this.K = str;
        c2(PAGE_URL, M1(str, 512));
    }

    public final void m0(ckh ckhVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712ac4db", new Object[]{this, ckhVar, new Long(j)});
            return;
        }
        k0();
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.h0;
        if (falcoLoadActionMonitor != null) {
            falcoLoadActionMonitor.P0(ckhVar, j, this);
        }
    }

    public void n0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bfef13", new Object[]{this, new Long(j)});
        } else {
            this.c0 = j;
        }
    }

    public long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b20f225a", new Object[]{this})).longValue();
        }
        long j = this.d0 - this.M;
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    public void o0(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583e3ef8", new Object[]{this, falcoLoadActionMonitor});
        } else {
            this.h0 = falcoLoadActionMonitor;
        }
    }

    @Override // com.taobao.falco.m
    public void p(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa70c4de", new Object[]{this, new Boolean(z)});
            return;
        }
        uqq uqqVar = IS_HIT_CACHE;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        c2(uqqVar, str);
    }

    @Override // com.taobao.falco.m
    public boolean p0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a3bb1d", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.falco.m
    public void q(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65de2f15", new Object[]{this, new Boolean(z)});
            return;
        }
        uqq uqqVar = CONTAINER_COLD_LAUNCH;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        c2(uqqVar, str);
    }

    @Override // com.taobao.falco.m
    public void q0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383ec377", new Object[]{this, l});
        } else {
            i0(PAGE_FCP_TIME, cck.v0(l));
        }
    }

    @Override // com.taobao.falco.m
    public void r(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ddefb0", new Object[]{this, l});
        } else {
            i0(CONTAINER_INIT_END, l.longValue());
        }
    }

    @Override // com.taobao.falco.m
    public void r0(m mVar) {
        s e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e853367", new Object[]{this, mVar});
            return;
        }
        z1(mVar);
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null && (e = tz8Var.e()) != null) {
            a0(Long.valueOf(e.g()));
        }
    }

    @Override // tb.pz8
    public boolean r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("573aacde", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd35f804", new Object[]{this})).intValue();
        }
        return this.i0;
    }

    @Override // com.taobao.falco.m
    public void t0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c69b80", new Object[]{this, str});
        } else {
            c2(TRANSITION_TYPE, str);
        }
    }

    @Override // com.taobao.falco.m
    public void u(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d3f567", new Object[]{this, l});
            return;
        }
        long v0 = cck.v0(l);
        this.d0 = v0;
        long z = v0 - z();
        ckh ckhVar = PAGE_FSP_TIME;
        c2(ckhVar, Long.valueOf(z));
        m0(ckhVar, z);
    }

    @Override // com.taobao.falco.m
    public void u0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2aca534", new Object[]{this, l});
        } else {
            i0(BIZ_USER_ACTION_TIME, l.longValue());
        }
    }

    @Override // com.taobao.falco.m
    public long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce74bfc6", new Object[]{this})).longValue();
        }
        return this.M;
    }

    @Override // com.taobao.falco.m
    public void w(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ffa87f", new Object[]{this, l});
            return;
        }
        long v0 = cck.v0(l);
        this.N = v0;
        ckh ckhVar = PAGE_FIRST_FRAME_RENDER_END;
        long i0 = i0(ckhVar, v0);
        long j = this.M;
        if (j >= 0) {
            long j2 = this.N - j;
            c2(TAP_RESPONSE, Long.valueOf(j2));
            V1(j2);
        }
        m0(ckhVar, i0);
    }

    @Override // tb.pz8
    public List<String> w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f1f8722d", new Object[]{this});
        }
        return a.DEFAULT.b;
    }

    @Override // com.taobao.falco.m
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838144cb", new Object[]{this, str});
            return;
        }
        this.W = str;
        c2(PAGE_NAME, str);
    }

    public final long y1(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0765be0", new Object[]{this, l})).longValue();
        }
        return cck.v0(l) - z();
    }

    public final void z1(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c514c9f", new Object[]{this, mVar});
            return;
        }
        mVar.O(this);
        this.d = mVar.z();
        Map<String, ?> j0 = mVar.j0();
        if (!j0.isEmpty()) {
            Q((String) j0.get(FROM_PAGE_NAME.getKey()));
            B((String) j0.get(FROM_PAGE_URL.getKey()));
            y((String) j0.get(PAGE_NAME.getKey()));
            l0((String) j0.get(PAGE_URL.getKey()));
            t0((String) j0.get(TRANSITION_TYPE.getKey()));
            h0((String) j0.get(TOPIC.getKey()));
            a2((String) j0.get(ERROR_CODE.getKey()));
            M("1".equals(j0.get(IS_FIRST_LOAD.getKey())));
            p("1".equals(j0.get(IS_HIT_CACHE.getKey())));
            Z((String) j0.get(TECH_STACK.getKey()));
            A1((String) j0.get(FROM_LOAD_FALCO_ID.getKey()));
            C1((String) j0.get(FROM_TOUCH_FALCO_ID.getKey()));
            N((String) j0.get(PAGE_LEVEL.getKey()));
            f2((String) j0.get(TOUCH_CATEGORY.getKey()));
            if (mVar.v() != -1) {
                this.M = mVar.v();
            }
        }
    }

    @Override // tb.pz8
    public void V0(long j, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eff74e", new Object[]{this, new Long(j), str});
            return;
        }
        k0();
        this.g0 = true;
        if (this.f0 != -1) {
            c2(FIRST_TOUCH_UP_TIME, Long.valueOf(this.f0));
        }
        j.c j2 = j.j();
        if (j2 != null) {
            c2(ERROR_CODE, j2.t());
            c2(ERROR_DESC, j2.u());
            c2(ERROR_SIGNAL, String.valueOf(j2.v()));
        }
        xy8 W1 = W1();
        if (W1 != null) {
            W1.F();
        }
        try {
            if (!TextUtils.isEmpty(this.K)) {
                Uri parse = Uri.parse(this.K);
                String queryParameter = parse.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter)) {
                    c2(PAGE_SPM, queryParameter);
                    String queryParameter2 = parse.getQueryParameter("scm");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        c2(PAGE_SCM, queryParameter2);
                    }
                }
            }
        } catch (Exception unused) {
        }
        uqq uqqVar = LOW_BUYER;
        if (SceneIdentifier.isLowBuyer()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        c2(uqqVar, str2);
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2109a606", new Object[]{this});
            return;
        }
        this.n0 = true;
        this.j0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo("network");
        this.l0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo("picture");
        this.k0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo("mtop");
        this.m0 = FullTraceAnalysis.getInstance().getRequestStatisticInfo(mfq.MODULE_SSR);
    }

    public final void X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34658365", new Object[]{this});
        } else if (!s9u.u().z()) {
            ALog.e("falco.LoadActionSpan", "[reportIfException]", null, "error", "not enabled");
        } else {
            Object A0 = A0(TECH_STACK.getKey());
            String str = A0 instanceof String ? (String) A0 : null;
            if (TextUtils.isEmpty(str)) {
                ALog.e("falco.LoadActionSpan", "[reportIfException]", null, "error", "techStack is null");
                return;
            }
            long j = -1;
            if ("native".equals(str)) {
                Object A02 = A0(PAGE_DISPLAY_TIME.getKey());
                if (A02 instanceof Long) {
                    j = ((Long) A02).longValue();
                }
            } else if ("h5".equals(str) || "weex".equals(str)) {
                Object A03 = A0(PAGE_FSP_TIME.getKey());
                if (A03 instanceof Long) {
                    j = ((Long) A03).longValue();
                }
            }
            if (j > s9u.u().t()) {
                if (a0 == null) {
                    a0 = new wy8("fsp_slowest_monitor", s9u.u().s());
                }
                a0.a(j0());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r7.equals(tb.mfq.MODULE_SSR) == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.analysis.fulltrace.FullTraceAnalysis.l x(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.falco.n.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "d7958d55"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r7 = (com.taobao.analysis.fulltrace.FullTraceAnalysis.l) r7
            return r7
        L_0x0018:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
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
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x002f
            goto L_0x0023
        L_0x002f:
            r0 = 3
            goto L_0x0052
        L_0x0031:
            java.lang.String r0 = "mtop"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003b
            goto L_0x0023
        L_0x003b:
            r0 = 2
            goto L_0x0052
        L_0x003d:
            java.lang.String r1 = "mtop_ssr"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0052
            goto L_0x0023
        L_0x0047:
            java.lang.String r0 = "picture"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0051
            goto L_0x0023
        L_0x0051:
            r0 = 0
        L_0x0052:
            switch(r0) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0062;
                case 2: goto L_0x005d;
                case 3: goto L_0x0058;
                default: goto L_0x0055;
            }
        L_0x0055:
            r7 = 0
            r0 = r7
            goto L_0x006b
        L_0x0058:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r7 = r6.j0
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r0 = r6.o0
            goto L_0x006b
        L_0x005d:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r7 = r6.k0
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r0 = r6.p0
            goto L_0x006b
        L_0x0062:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r7 = r6.m0
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r0 = r6.r0
            goto L_0x006b
        L_0x0067:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r7 = r6.l0
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r0 = r6.q0
        L_0x006b:
            com.taobao.analysis.fulltrace.FullTraceAnalysis$l r1 = new com.taobao.analysis.fulltrace.FullTraceAnalysis$l
            r1.<init>()
            if (r7 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
            int r2 = r0.f6237a
            int r3 = r7.f6237a
            int r2 = r2 - r3
            r1.f6237a = r2
            long r2 = r0.b
            long r4 = r7.b
            long r2 = r2 - r4
            r1.b = r2
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.falco.n.x(java.lang.String):com.taobao.analysis.fulltrace.FullTraceAnalysis$l");
    }
}
