package com.taobao.tab2interact.core.component.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.tab2interact.core.component.browser.data.BrowserTaskManager;
import com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bmi;
import tb.cbu;
import tb.dm2;
import tb.em2;
import tb.j0r;
import tb.jmi;
import tb.r7;
import tb.s6o;
import tb.t0j;
import tb.t2o;
import tb.vff;
import tb.vgh;
import tb.vv1;
import tb.wff;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BrowserBadge extends r7 implements BrowserBadgeViewController.h, dm2.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAUSE_ANIMATE_SCENE_COMPONENT_STOPPED = "ComponentStopped";
    public static final String PAUSE_ANIMATE_SCENE_MAX_TIMING_DURATION_REACHED = "MaxTimingDurationReached";
    public static final String PAUSE_ANIMATE_SCENE_VIDEO_FINISHED = "VideoFinished";
    public static final String PAUSE_ANIMATE_SCENE_VIDEO_PAUSED = "VideoPaused";
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public boolean F;
    public String G;
    public boolean H;
    public boolean J;
    public JSONObject K;
    public boolean L;
    public JSONObject M;
    public boolean N;
    public JSONObject O;
    public Map<String, String> P;
    public d Q;
    public Runnable h;
    public Runnable i;
    public Runnable j;
    public BrowserBadgeViewController k;
    public dm2 l;
    public BroadcastReceiver m;
    public boolean n;
    public String p;
    public boolean q;
    public BrowserBadgeModel r;
    public boolean s;
    public boolean t;
    public BrowserBadgeModel.UserType u;
    public BrowserBadgeModel.UserStage v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Handler g = new Handler(Looper.getMainLooper());
    public boolean o = true;
    public final Deque<JSONObject> I = new ArrayDeque();
    public final BrowserTaskManager R = new BrowserTaskManager();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vgh.c(this, "BrowserBadge", "延迟隐藏浏览挂角View，设置浏览挂角不可见");
            BrowserBadge.H0(BrowserBadge.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11793a;

        public b(String str) {
            this.f11793a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vgh.c(this, "BrowserBadge", this.f11793a + "完成超时逻辑命中，开启金币任务");
            BrowserBadge.I0(BrowserBadge.this, this.f11793a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f11794a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public c(long j, long j2, long j3) {
            this.f11794a = j;
            this.b = j2;
            this.c = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BrowserBadge.this.f1(this.f11794a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    static {
        t2o.a(689963016);
        t2o.a(689963074);
        t2o.a(689963025);
    }

    public BrowserBadge(Context context, FrameLayout frameLayout, jmi jmiVar, vv1 vv1Var) {
        super(context, frameLayout, jmiVar, vv1Var);
        c1();
    }

    public static /* synthetic */ void G0(BrowserBadge browserBadge, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c0792c", new Object[]{browserBadge, intent});
        } else {
            browserBadge.U0(intent);
        }
    }

    public static /* synthetic */ void H0(BrowserBadge browserBadge, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646681c6", new Object[]{browserBadge, new Boolean(z)});
        } else {
            browserBadge.r1(z);
        }
    }

    public static /* synthetic */ void I0(BrowserBadge browserBadge, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507e1fb7", new Object[]{browserBadge, str});
        } else {
            browserBadge.v1(str);
        }
    }

    public static /* synthetic */ Object ipc$super(BrowserBadge browserBadge, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.A0();
                return null;
            case -1983604863:
                super.p0();
                return null;
            case -1545875607:
                super.j0();
                return null;
            case -1494410735:
                super.z((Map) objArr[0]);
                return null;
            case -1340399519:
                return super.e0((String) objArr[0]);
            case -1274969358:
                return super.a0();
            case -1163236760:
                return super.F();
            case -963065531:
                return super.Z();
            case -883769061:
                return super.c0();
            case -172691066:
                super.C((String) objArr[0], (String) objArr[1]);
                return null;
            case -27800917:
                return super.b0();
            case 52847910:
                super.h0();
                return null;
            case 77799095:
                return super.f0();
            case 366006912:
                super.l0();
                return null;
            case 795706955:
                super.g0((String) objArr[0], (String) objArr[1]);
                return null;
            case 884691673:
                super.m0();
                return null;
            case 1194532976:
                super.d0();
                return null;
            case 1531977961:
                super.k0(((Number) objArr[0]).intValue());
                return null;
            case 1713617801:
                super.C0();
                return null;
            case 2100837169:
                super.n0((String) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/BrowserBadge");
        }
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe43e4f", new Object[]{this});
        } else {
            wff.INSTANCE.e(t0(), this);
        }
    }

    @Override // tb.r7, tb.wx1
    public void C(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f186", new Object[]{this, str, str2});
            return;
        }
        super.C(str, str2);
        if (!F0(str)) {
            m1();
        }
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        super.C0();
        this.n = false;
        this.p = Login.getUserId();
        K0();
        ((em2) this.Q).d0();
    }

    @Override // tb.r7
    public boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        return j0r.c();
    }

    @Override // tb.xff
    public JSONObject F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("baaa6a68", new Object[]{this});
        }
        JSONObject F = super.F();
        JSONObject jSONObject = new JSONObject();
        boolean E0 = E0();
        jSONObject.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_ENABLE, (Object) Boolean.valueOf(E0));
        if (E0) {
            JSONObject jSONObject2 = new JSONObject();
            int t = BrowserBadgeViewController.t() + s6o.J(s0(), s6o.z(s0()));
            int s = BrowserBadgeViewController.s();
            jSONObject2.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR_TOP_MARGIN, (Object) Integer.valueOf(t));
            jSONObject2.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR_RIGHT_MARGIN, (Object) Integer.valueOf(s));
            jSONObject.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR, (Object) jSONObject2);
            if (j0r.d()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM_TOP_MARGIN, (Object) Integer.valueOf(t + 34));
                jSONObject3.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM_RIGHT_MARGIN, (Object) Integer.valueOf(s));
                jSONObject.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM, (Object) jSONObject3);
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER, (Object) jSONObject);
        F.put("data", (Object) jSONObject4);
        return F;
    }

    @Override // tb.r7
    public boolean F0(String str) {
        List<String> p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f00afc8", new Object[]{this, str})).booleanValue();
        }
        if (!E0() || (p = j0r.p()) == null) {
            return false;
        }
        return p.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject J0(com.alibaba.fastjson.JSONObject r5) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tab2interact.core.component.browser.BrowserBadge.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "54770a9f"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            return r5
        L_0x0018:
            r1 = 0
            if (r5 != 0) goto L_0x001c
            return r1
        L_0x001c:
            java.lang.String r2 = "entranceList"
            java.lang.Object r3 = r5.get(r2)
            if (r3 == 0) goto L_0x0039
            com.alibaba.fastjson.JSONArray r5 = r5.getJSONArray(r2)
            int r2 = r5.size()
            if (r2 <= 0) goto L_0x0039
            java.lang.Object r2 = r5.get(r0)
            if (r2 == 0) goto L_0x0039
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r0)
            goto L_0x003a
        L_0x0039:
            r5 = r1
        L_0x003a:
            if (r5 != 0) goto L_0x003d
            return r1
        L_0x003d:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            java.util.List r1 = tb.j0r.h()
            if (r1 == 0) goto L_0x006c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x006c
            java.util.Iterator r1 = r1.iterator()
        L_0x0052:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r5.get(r2)
            r0.put(r2, r3)
            goto L_0x0052
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.core.component.browser.BrowserBadge.J0(com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    public final void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1f182c", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadge", "延迟隐藏浏览挂角View");
        if (this.h == null) {
            this.h = new a();
        }
        this.g.postDelayed(this.h, j0r.j());
    }

    public void L0(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc20a498", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        this.g.removeCallbacks(this.i);
        c cVar = new c(j, j2, j3);
        this.i = cVar;
        this.g.postDelayed(cVar, j4);
    }

    public final void M0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ed1f43", new Object[]{this, str});
            return;
        }
        if (this.j == null) {
            this.j = new b(str);
        }
        this.g.postDelayed(this.j, j0r.o());
    }

    public long N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2499e09a", new Object[]{this})).longValue();
        }
        return this.C;
    }

    public BrowserBadgeModel O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel) ipChange.ipc$dispatch("b1bf6e47", new Object[]{this});
        }
        return this.r;
    }

    public final Map<String, String> P0(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("33940392", new Object[]{this, str, new Long(j)});
        }
        Map<String, String> R0 = R0();
        R0.put("action", str);
        R0.put("costTime", String.valueOf(j));
        return R0;
    }

    public final Map<String, String> Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2613a94c", new Object[]{this});
        }
        Map<String, String> R0 = R0();
        R0.put("spm", "a21afv.28088452.activity.7");
        return R0;
    }

    public final Map<String, String> R0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("51edeef9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (this.u == BrowserBadgeModel.UserType.REWARD_ENHANCED) {
            str = "lowactive";
        } else {
            BrowserBadgeModel.UserStage userStage = this.v;
            if (userStage == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                str = "new";
            } else if (userStage == BrowserBadgeModel.UserStage.DEFAULT) {
                str = "usual";
            } else {
                str = "unknown";
            }
        }
        hashMap.put("x_user_status", str);
        Map<String, String> map = this.P;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("enableTab2GlobalInteract", "true");
        hashMap.put("tab2GlobalInteractVersion", "2.0");
        return hashMap;
    }

    public String S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26f9ba8e", new Object[]{this});
        }
        return this.G;
    }

    public final void T0(String str, BrowserBadgeModel browserBadgeModel) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdb975", new Object[]{this, str, browserBadgeModel});
        } else if (browserBadgeModel != null) {
            BrowserBadgeModel.BrowserTaskModel browserTaskModel = browserBadgeModel.e;
            long j = browserTaskModel == null ? 0L : browserTaskModel.f11806a;
            long j2 = browserTaskModel == null ? 0L : browserTaskModel.b;
            if (this.s) {
                vgh.c(this, "BrowserBadge", "处理浏览任务进度，当天所有任务都已完成，重置计时器");
                BrowserTaskManager browserTaskManager = this.R;
                if (browserTaskManager.g(browserTaskManager.e())) {
                    V0(0L, 0L);
                } else {
                    V0(j2, j);
                }
            } else if (j > 0 && j2 >= 0) {
                vgh.c(this, "BrowserBadge", "处理浏览任务进度，totalTimingDuration=" + j + "，accumulatedTimingDuration=" + j2 + "，mTotalDurationWhenLastRequest=" + this.D + "，mAccumulatedDurationWhenLastRequest=" + this.C);
                if (TextUtils.equals("render", str) || (!TextUtils.equals("refresh", str) ? !(i != 0 && j == this.D && j2 == this.C) : this.D <= 0 || this.C < 0)) {
                    vgh.c(this, "BrowserBadge", "处理浏览任务进度，重新初始化计时器");
                    s1(j, j2);
                    V0(j2, j);
                }
                d dVar = this.Q;
                if (dVar != null) {
                    ((em2) dVar).b0();
                }
            }
        }
    }

    public final void U0(Intent intent) {
        BrowserBadgeModel.UserType userType;
        BrowserBadgeModel.UserStage userStage;
        BrowserBadgeModel.UserType userType2;
        BrowserBadgeModel.UserStage userStage2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd9dacb", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("data");
            if (!(obj instanceof JSONObject)) {
                vgh.c(this, "BrowserBadge", "处理红包数据，data为空");
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            Object obj2 = jSONObject.get("96352");
            if (!(obj2 instanceof JSONObject)) {
                vgh.c(this, "BrowserBadge", "处理红包数据，96352数据不为JSONObject类型");
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj2;
            Object obj3 = jSONObject2.get("userPop");
            if (!(obj3 instanceof JSONObject)) {
                vgh.c(this, "BrowserBadge", "处理红包数据，userPop不为JSONObject类型");
                return;
            }
            boolean equals = TextUtils.equals("NW", ((JSONObject) obj3).getString("type"));
            String string = jSONObject.getString("status");
            String string2 = jSONObject2.getString("enhanceFlag");
            String string3 = jSONObject2.getString("activityStage");
            if (equals) {
                vgh.c(this, "BrowserBadge", "处理红包数据，判断为新用户，status=" + string);
                if (TextUtils.equals("init", string)) {
                    if (TextUtils.equals("true", string2)) {
                        userType2 = BrowserBadgeModel.UserType.REWARD_ENHANCED;
                    } else {
                        userType2 = BrowserBadgeModel.UserType.DEFAULT;
                    }
                    this.u = userType2;
                    if (TextUtils.equals("fresh", string3)) {
                        userStage2 = BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER;
                    } else {
                        userStage2 = BrowserBadgeModel.UserStage.DEFAULT;
                    }
                    this.v = userStage2;
                } else if (TextUtils.equals("opened", string) && Login.checkSessionValid()) {
                    vgh.c(this, "BrowserBadge", "处理红包数据，判断为新用户且已开启红包且为登录状态，userId=" + Login.getUserId());
                    g1("REDPACKET_NEW_USER_OPENED");
                }
            } else {
                vgh.c(this, "BrowserBadge", "处理红包数据，判断为老用户，status=" + string);
                if (!this.w) {
                    vgh.c(this, "BrowserBadge", "处理红包数据，判断为老用户且首次接口请求未完成且为登录状态，userId=" + Login.getUserId());
                    if (TextUtils.equals("true", string2)) {
                        userType = BrowserBadgeModel.UserType.REWARD_ENHANCED;
                    } else {
                        userType = BrowserBadgeModel.UserType.DEFAULT;
                    }
                    this.u = userType;
                    if (TextUtils.equals("fresh", string3)) {
                        userStage = BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER;
                    } else {
                        userStage = BrowserBadgeModel.UserStage.DEFAULT;
                    }
                    this.v = userStage;
                }
            }
        }
    }

    public boolean W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("868b0075", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f088f1", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public final void Y0(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce420a1", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
        } else if (this.s) {
            vgh.c(this, "BrowserBadge", "浏览任务进度回调，当天所有任务都已完成");
        } else if (j2 <= 0 || j < 0) {
            vgh.c(this, "BrowserBadge", "浏览任务进度回调，totalDuration或accumulatedDuration不满足条件");
        } else {
            this.A = j;
            this.B = j2;
            d dVar = this.Q;
            if (dVar != null) {
                ((em2) dVar).a0(j, j2, j3);
            }
        }
    }

    @Override // tb.xff
    public JSONObject Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c698c945", new Object[]{this});
        }
        JSONObject Z = super.Z();
        Z.put("result", (Object) Boolean.valueOf(this.N));
        Z.put("data", (Object) this.O);
        return Z;
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController.h
    public void a(float f, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6712aba0", new Object[]{this, new Float(f), new Long(j), new Long(j2), new Long(j3)});
        } else if (this.v != BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
            Y0(j, j2, j3);
        }
    }

    @Override // tb.xff
    public JSONObject a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b40182f2", new Object[]{this});
        }
        JSONObject a0 = super.a0();
        a0.put("result", (Object) Boolean.valueOf(this.J));
        a0.put("data", (Object) this.K);
        return a0;
    }

    @Override // tb.xff
    public JSONObject b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe57caab", new Object[]{this});
        }
        JSONObject b0 = super.b0();
        b0.put("result", (Object) Boolean.valueOf(this.H));
        b0.put(bmi.CALLBACK_DATA_LIST, (Object) this.I);
        return b0;
    }

    @Override // tb.xff
    public JSONObject c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb52c11b", new Object[]{this});
        }
        JSONObject c0 = super.c0();
        c0.put("result", (Object) Boolean.valueOf(this.L));
        c0.put("data", (Object) this.M);
        return c0;
    }

    public final void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb7f7e", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vff.GET_INTERACT_LOCAL_CONFIG_NAME);
        arrayList.add(vff.GET_BROWSE_TASK_STATE_NAME);
        arrayList.add(vff.H5_TASK_STATE_CHANGE_NAME);
        wff.INSTANCE.a(t0(), arrayList, this);
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController.h
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437547fd", new Object[]{this, new Boolean(z)});
        } else {
            l1(z);
        }
    }

    @Override // tb.xff
    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47332070", new Object[]{this});
            return;
        }
        super.d0();
        long j = this.A;
        f1(j, this.B, j - this.C);
        this.k.Z();
    }

    public final void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9acd3b6", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vff.WEB_VIEW_RELOAD_NAME);
        arrayList.add(vff.IS_SHOW_EXTRA_BROWSER_BADGE_NAME);
        arrayList.add(vff.IS_INTERACTION_NEW_USER_UPGRADED_NAME);
        arrayList.add(vff.IS_SHOW_INTERACTION_TASK_PANEL_NAME);
        arrayList.add(vff.IS_BROWSER_BADGE_COUNTDOWN_FINISHED_NAME);
        arrayList.add(vff.H5_INTERACTION_COMPONENT_RENDER_FINISHED_NAME);
        arrayList.add(vff.INTERACTION_TASK_COMPLETED_NAME);
        arrayList.add(vff.INTERACTION_NEW_USER_UPGRADE_POP_RENDERED_NAME);
        arrayList.add(vff.INTERACTION_TASK_PANEL_BROWSER_BUTTON_CLICKED_NAME);
        arrayList.add(vff.BROWSE_WITHDRAW_BUBBLE_HIDDEN_NAME);
        arrayList.add(vff.REFRESH_BROWSER_BADGE_DATA_NAME);
        arrayList.add(vff.GET_NATIVE_LEFT_BUBBLE_STATE_NAME);
        wff.INSTANCE.a(t0(), arrayList, this);
    }

    @Override // tb.xff
    public JSONObject e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b01b2061", new Object[]{this, str});
        }
        JSONObject e0 = super.e0(str);
        e0.put("state", (Object) this.R.c(str));
        e0.put("pageUrlQuery", (Object) this.R.b(str));
        return e0;
    }

    public final void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619693bf", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter("ggredpackagestatuschanged");
        this.m = new BroadcastReceiver() { // from class: com.taobao.tab2interact.core.component.browser.BrowserBadge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/BrowserBadge$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    BrowserBadge.G0(BrowserBadge.this, intent);
                }
            }
        };
        LocalBroadcastManager.getInstance(s0()).registerReceiver(this.m, intentFilter);
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController.h
    public void f(BrowserBadgeModel.TaskType taskType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240e2ba1", new Object[]{this, taskType});
            return;
        }
        vgh.c(this, "BrowserBadge", "倒计时完成，relatedTaskType=" + taskType);
        long j = this.A;
        f1(j, this.B, j - this.C);
        k1(taskType);
    }

    @Override // tb.xff
    public JSONObject f0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4a31eb7", new Object[]{this});
        }
        JSONObject f0 = super.f0();
        if (this.k.G()) {
            str = "visible";
        } else {
            str = "invisible";
        }
        f0.put("result", (Object) str);
        return f0;
    }

    public void f1(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6765f89", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        vgh.c(this, "BrowserBadge", "上报距离上次请求的间隔时长，accumulatedDuration=" + j + "，totalDuration=" + j2 + "，requestIntervalDuration=" + j3);
        this.g.removeCallbacks(this.i);
        if (j >= 0 && j2 > 0 && j3 >= 0) {
            this.l.i("watch", j3, this.R.d());
            s1(j2, j);
        }
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d02f230", new Object[]{this});
            return;
        }
        t0j.d("BrowserViewClick", null);
        y1();
        p1();
    }

    @Override // tb.xff
    public void g0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6d864b", new Object[]{this, str, str2});
            return;
        }
        super.g0(str, str2);
        String e = this.R.e();
        String c2 = this.R.c(e);
        vgh.c(this, "BrowserBadge", "收到h5任务变更：" + str + "=>" + str2 + ",当前正在处理任务：" + e + "=>" + c2);
        if (e.equals(str) && !this.R.g(str) && "finish".equals(c2)) {
            if ("success".equals(str2) || "fail".equals(str2)) {
                Runnable runnable = this.j;
                if (runnable != null) {
                    this.g.removeCallbacks(runnable);
                    this.j = null;
                }
                vgh.c(this, "BrowserBadge", "收到h5任务变更：匹配上当前已经结束的当前任务，开始金币任务");
                v1(str);
            }
        }
    }

    public void g1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1bb050", new Object[]{this, str});
        } else if (this.l != null) {
            if (!this.y) {
                this.R.h(this.R.f(r0().e()));
            }
            String e = this.R.e();
            if ("unknown".equals(this.R.c(e))) {
                this.R.k(e, "init");
            }
            this.l.i("render", 0L, this.R.d());
        }
    }

    @Override // tb.xff
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3266526", new Object[]{this});
            return;
        }
        super.h0();
        this.k.w();
    }

    public final void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[]{this});
            return;
        }
        this.q = false;
        this.r = null;
        this.s = false;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = false;
        this.z = false;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = false;
        this.F = false;
        this.G = null;
        this.H = false;
        ((ArrayDeque) this.I).clear();
        this.J = false;
        this.K = null;
        this.L = false;
        this.M = null;
        this.N = false;
        this.O = null;
        this.k.L();
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController.h
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c6ee4a", new Object[]{this});
            return;
        }
        this.z = true;
        t0j.d("BrowserViewExpose", null);
        z1();
    }

    public void i1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6254872c", new Object[]{this, jSONObject});
        } else {
            wff.INSTANCE.b(t0(), vff.BROWSERTASK_BALANCE_UPDATE, jSONObject, null);
        }
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController.h
    public void j(int i, int i2, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2533a5dd", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), new Long(j2), new Long(j3)});
        } else {
            Y0(j, j2, j3);
        }
    }

    @Override // tb.xff
    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dbcf69", new Object[]{this});
            return;
        }
        super.j0();
        this.q = true;
        g1("USER_UPGRADE_POP_END");
    }

    public final void j1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb3352e", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taskType", (Object) str);
        jSONObject.put("state", (Object) this.R.c(str));
        jSONObject.put("pageUrlQuery", (Object) this.R.b(str));
        wff.INSTANCE.b(t0(), vff.BROWSE_TASK_STATE_CHANGE_NAME, jSONObject, null);
    }

    @Override // tb.xff
    public void k0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5020e9", new Object[]{this, new Integer(i)});
            return;
        }
        super.k0(i);
        this.k.l(i);
    }

    @Override // tb.xff
    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d0d280", new Object[]{this});
            return;
        }
        super.l0();
        this.k.X();
    }

    public final void l1(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9acc5f", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "visible";
        } else {
            str = "invisible";
        }
        jSONObject.put("state", (Object) str);
        wff.INSTANCE.b(t0(), vff.NATIVE_LEFT_BUBBLE_STATE_CHANGE_NAME, jSONObject, null);
    }

    @Override // tb.xff
    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bb52d9", new Object[]{this});
            return;
        }
        super.m0();
        this.H = false;
        ((ArrayDeque) this.I).clear();
        this.J = false;
        this.K = null;
        this.L = false;
        this.M = null;
        this.N = false;
        this.O = null;
    }

    public final void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e0808d", new Object[]{this});
            return;
        }
        wff.INSTANCE.b(t0(), vff.HIDE_EXTRA_BROWSER_BADGE_NAME, null, null);
        this.H = false;
    }

    @Override // tb.xff
    public void n0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d383b31", new Object[]{this, str});
            return;
        }
        super.n0(str);
        long j = this.A;
        f1(j, this.B, j - this.C);
    }

    public final void n1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d624d1fb", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!(jSONObject == null || jSONObject.get("freshUpgradePop") == null)) {
            jSONObject2.put("freshUpgradePop", (Object) jSONObject.getJSONObject("freshUpgradePop"));
        }
        wff.INSTANCE.b(t0(), vff.INTERACTION_NEW_USER_UPGRADED_NAME, jSONObject2, null);
        this.J = true;
        this.K = jSONObject2;
    }

    public final void o1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec46c28", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            wff.INSTANCE.b(t0(), vff.SHOW_EXTRA_BROWSER_BADGE_NAME, jSONObject, null);
            this.H = true;
            ((ArrayDeque) this.I).offerLast(jSONObject);
            if (((ArrayDeque) this.I).size() > 5) {
                ((ArrayDeque) this.I).pollFirst();
            }
        }
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.p0();
        BrowserBadgeViewController browserBadgeViewController = this.k;
        if (browserBadgeViewController != null) {
            browserBadgeViewController.q();
        }
        this.g.removeCallbacksAndMessages(null);
        if (this.m != null) {
            LocalBroadcastManager.getInstance(s0()).unregisterReceiver(this.m);
        }
        A1();
        this.R.a();
    }

    public final void p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42f9dc", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) vff.SHOW_INTERACTION_TASK_PANEL_ARGS_FROM_CLICK);
        wff.INSTANCE.b(t0(), vff.SHOW_INTERACTION_TASK_PANEL_NAME, jSONObject, null);
        this.L = true;
        this.M = jSONObject;
    }

    public void q1(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ffa5ff", new Object[]{this, dVar});
        } else {
            this.Q = dVar;
        }
    }

    public final void s1(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b90110", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        vgh.c(this, "BrowserBadge", "设置上一次请求时的时长，totalTimingDuration=" + j + "，accumulatedTimingDuration=" + j2);
        this.D = j;
        this.C = j2;
    }

    public void t1(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed663ee", new Object[]{this, map});
        } else {
            this.P = map;
        }
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public View u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.k.u();
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public FrameLayout.LayoutParams v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("9b39d05b", new Object[]{this});
        }
        return this.k.v();
    }

    public final void w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7672605", new Object[]{this});
            return;
        }
        Map<String, String> R0 = R0();
        vgh.c(this, "BrowserBadge", "浏览挂角初始化数据失败埋点，properties=" + R0);
        cbu.c("Page_VideoCash_BrowserBadgeInitDataFail", R0);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadge", "初始化浏览挂角数据");
        d1();
        e1();
        this.l = new dm2(this);
        if (!Login.checkSessionValid()) {
            vgh.c(this, "BrowserBadge", "初始化浏览挂角数据，判断为非登录状态");
            w1();
            return;
        }
        vgh.c(this, "BrowserBadge", "初始化浏览挂角数据，判断为登录状态，userId=" + Login.getUserId());
        g1(ModuleConstants.VI_MODULE_NAME_INIT);
    }

    public final void x1(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3504f4c2", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, String> P0 = P0(str, j);
        vgh.c(this, "BrowserBadge", "浏览挂角请求数据失败埋点，properties=" + P0);
        cbu.c("Page_VideoCash_BrowserBadgeRequestDataFail", P0);
    }

    public final void y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaf8044", new Object[]{this});
            return;
        }
        Map<String, String> Q0 = Q0();
        vgh.c(this, "BrowserBadge", "浏览挂角View点击埋点，properties=" + Q0);
        cbu.b("Button-FingerWatch", Q0);
    }

    @Override // tb.wx1
    public void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ed1a11", new Object[]{this, map});
            return;
        }
        super.z(map);
        this.R.i(map);
    }

    public final void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac22b6", new Object[]{this});
            return;
        }
        Map<String, String> Q0 = Q0();
        vgh.c(this, "BrowserBadge", "浏览挂角View曝光埋点，properties=" + Q0);
        cbu.d("Page_VideoCash_Show-FingerWatch", Q0);
    }

    public final void V0(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cdb378", new Object[]{this, new Long(j), new Long(j2)});
        } else if (this.k == null) {
        } else {
            if (this.v == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                vgh.c(this, "BrowserBadge", "初始化浏览挂角View动画，判断当前用户所处阶段为新人简化阶段");
                this.k.y(j, j2);
                if (this.s) {
                    this.k.C(j, j2);
                } else if (!this.E) {
                    this.k.D();
                    this.E = true;
                }
            } else {
                vgh.c(this, "BrowserBadge", "初始化浏览挂角View动画，判断当前用户所处阶段为其他阶段");
                this.k.y(0L, 0L);
                this.k.C(j, j2);
            }
        }
    }

    public void Z0(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3c201c", new Object[]{this, str, new Long(j)});
            return;
        }
        vgh.c(this, "BrowserBadge", "数据请求失败回调，action=" + str + "，costTime=" + j);
        this.w = true;
        if (TextUtils.equals("render", str)) {
            this.x = true;
        }
        x1(str, j);
        if (TextUtils.equals("render", str) || TextUtils.equals("refresh", str)) {
            K0();
            m1();
        }
    }

    public void b1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4259919c", new Object[]{this, str});
            return;
        }
        vgh.c(this, "BrowserBadge", "暂停浏览挂角View动画，scene=" + str);
        BrowserBadgeViewController browserBadgeViewController = this.k;
        if (browserBadgeViewController == null || !browserBadgeViewController.H()) {
            vgh.c(this, "BrowserBadge", "暂停浏览挂角View动画，浏览挂角View不可见");
        } else if (this.s) {
            vgh.c(this, "BrowserBadge", "暂停浏览挂角View动画，当天所有任务都已完成");
        } else {
            this.F = false;
            this.G = str;
            if (this.v == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                this.k.J();
            }
            this.k.K();
        }
    }

    public final void k1(BrowserBadgeModel.TaskType taskType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1877d02", new Object[]{this, taskType});
        } else if (taskType != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(vff.BROWSER_BADGE_COUNTDOWN_FINISHED_ARGS_TASK_TYPE, (Object) taskType.toString());
            wff.INSTANCE.b(t0(), vff.BROWSER_BADGE_COUNTDOWN_FINISHED_NAME, jSONObject, null);
            this.N = true;
            this.O = jSONObject;
        }
    }

    public void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e0d666", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadge", "开启浏览挂角View动画");
        if (!this.n) {
            vgh.c(this, "BrowserBadge", "开启浏览挂角View动画，组件未开启");
            return;
        }
        BrowserBadgeViewController browserBadgeViewController = this.k;
        if (browserBadgeViewController == null || !browserBadgeViewController.H()) {
            vgh.c(this, "BrowserBadge", "开启浏览挂角View动画，浏览挂角View不可见");
        } else if (this.s) {
            vgh.c(this, "BrowserBadge", "开启浏览挂角View动画，当天所有任务都已完成");
        } else {
            this.F = true;
            if (this.v == BrowserBadgeModel.UserStage.SIMPLE_FOR_NEW_USER) {
                this.k.a0();
            }
            this.k.b0();
        }
    }

    public final void v1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e4e569", new Object[]{this, str});
            return;
        }
        vgh.c(this, "BrowserBadge", str + "完成，开启金币任务");
        this.R.h(null);
        g1("AFTER_BELONG_TASK_DONE");
        this.k.T(false);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadge", "初始化浏览挂角View");
        this.k = new BrowserBadgeViewController(s0());
        r1(false);
        this.k.M(this);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.A0();
        this.n = true;
        this.g.removeCallbacksAndMessages(null);
        if (!this.o) {
            if (Login.checkSessionValid()) {
                vgh.c(this, "BrowserBadge", "非首次开启浏览挂角，判断为登录状态，userId=" + Login.getUserId() + "，mUserIdOnComponentStopped=" + this.p);
                if (TextUtils.equals(Login.getUserId(), this.p)) {
                    this.l.i("refresh", 0L, this.R.d());
                } else {
                    h1();
                    g1("USER_CHANGE");
                }
            } else {
                vgh.c(this, "BrowserBadge", "非首次开启浏览挂角，判断为非登录状态");
                K0();
                m1();
            }
        }
        d dVar = this.Q;
        if (dVar != null) {
            ((em2) dVar).c0();
        }
        this.o = false;
    }

    public void a1(String str, JSONObject jSONObject, BrowserBadgeModel browserBadgeModel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b319a4", new Object[]{this, str, jSONObject, browserBadgeModel, new Long(j)});
            return;
        }
        vgh.c(this, "BrowserBadge", "数据请求成功回调，action=" + str + "，costTime=" + j);
        this.w = true;
        if (TextUtils.equals("render", str)) {
            this.x = false;
        }
        if (jSONObject == null || browserBadgeModel == null) {
            vgh.c(this, "BrowserBadge", "浏览挂角数据成功回调，dataJSONObject为空或browserBadgeModel为空");
            return;
        }
        this.r = browserBadgeModel;
        BrowserBadgeModel.UserType userType = browserBadgeModel.f11795a;
        if (userType != this.u) {
            this.u = userType;
            if (this.z) {
                t0j.d("BrowserViewExpose", null);
                z1();
            }
        }
        BrowserBadgeModel.UserStage userStage = browserBadgeModel.b;
        if (userStage != this.v) {
            this.v = userStage;
            if (this.z) {
                t0j.d("BrowserViewExpose", null);
                z1();
            }
        }
        boolean z = this.t || browserBadgeModel.c;
        this.t = z;
        this.s = browserBadgeModel.d;
        if (!z || this.q) {
            Pair<String, Boolean> j2 = this.R.j(browserBadgeModel);
            if (j2 != null) {
                String str2 = (String) j2.first;
                boolean booleanValue = ((Boolean) j2.second).booleanValue();
                String c2 = this.R.c(str2);
                vgh.c(this, "BrowserBadge", "数据请求成功回调，任务" + str2 + "的状态是否发生变化：" + booleanValue + ",当前最新状态：" + c2);
                if (!TextUtils.isEmpty(str2)) {
                    if (booleanValue) {
                        j1(str2);
                    }
                    if (!this.R.g(str2)) {
                        this.k.T(true);
                        if (booleanValue && "finish".equals(c2)) {
                            vgh.c(this, "BrowserBadge", str2 + "已完成，开始金币任务的兜底逻辑");
                            M0(str2);
                        }
                    } else {
                        this.k.T(false);
                    }
                }
            }
            this.k.Q(browserBadgeModel.f);
            this.y = true;
            r1(true);
            JSONObject J0 = J0(jSONObject);
            if (this.n) {
                o1(J0);
            }
            if (J0 != null && J0.containsKey("paddingComponent")) {
                this.k.w();
            }
            T0(str, browserBadgeModel);
            return;
        }
        n1(jSONObject);
    }

    public final void r1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a4b63d", new Object[]{this, new Boolean(z)});
        } else if (this.k != null) {
            vgh.c(this, "BrowserBadge", "设置浏览挂角View的可见性，当前浏览挂角View的可见性为" + this.k.H());
            if (!z) {
                vgh.c(this, "BrowserBadge", "设置浏览挂角View的可见性，将View设置为不可见");
                this.k.W(false);
            } else if (this.n) {
                vgh.c(this, "BrowserBadge", "设置浏览挂角View的可见性，将View设置为可见");
                this.k.W(true);
            }
        }
    }
}
