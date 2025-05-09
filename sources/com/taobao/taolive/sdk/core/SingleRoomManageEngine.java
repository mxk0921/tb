package com.taobao.taolive.sdk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.taolive.sdk.business.InteractBusiness;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.TBTVProgramInfo;
import com.taobao.taolive.sdk.model.common.UserLevelAvatar;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TaskStatusMsg;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.air;
import tb.bwd;
import tb.cba;
import tb.cir;
import tb.cpr;
import tb.cxg;
import tb.fee;
import tb.fkx;
import tb.gtc;
import tb.hbd;
import tb.hee;
import tb.hjr;
import tb.hmc;
import tb.igq;
import tb.k9e;
import tb.l6t;
import tb.m09;
import tb.m6t;
import tb.ncc;
import tb.nxf;
import tb.o3s;
import tb.pvs;
import tb.qvs;
import tb.t2o;
import tb.tjl;
import tb.tsd;
import tb.tz3;
import tb.u2j;
import tb.ujl;
import tb.up6;
import tb.ux9;
import tb.v2s;
import tb.vwl;
import tb.xlr;
import tb.yfb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SingleRoomManageEngine implements cpr.b, hmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String t = SingleRoomManageEngine.class.getSimpleName();
    public cpr c;
    public l6t d;
    public TBLiveDataModel e;
    public ncc f;
    public String g;
    public final ux9 h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean r;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<k9e> f13280a = new ArrayList<>();
    public HashMap<gtc, MessageTypeFilter> b = new HashMap<>();
    public boolean i = true;
    public final b n = new b();
    public final a o = new a();
    public boolean p = false;
    public Object q = null;
    public final BroadcastReceiver s = new BroadcastReceiver() { // from class: com.taobao.taolive.sdk.core.SingleRoomManageEngine.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/core/SingleRoomManageEngine$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Context S;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (SingleRoomManageEngine.q(SingleRoomManageEngine.this) != null && (SingleRoomManageEngine.q(SingleRoomManageEngine.this).j() instanceof cba) && (S = ((cba) SingleRoomManageEngine.q(SingleRoomManageEngine.this).j()).S()) != null && intent != null && intent.getAction() != null) {
                String str = "";
                if (intent.getAction().equals("mega.stdPop.broadcast.windowStateChanged")) {
                    SingleRoomManageEngine singleRoomManageEngine = SingleRoomManageEngine.this;
                    if (intent.getStringExtra("windowState") != null) {
                        str = intent.getStringExtra("windowState");
                    }
                    SingleRoomManageEngine.o(singleRoomManageEngine, S, str, nxf.a(intent));
                } else if (intent.getAction().equals("mega.stdPop.broadcast.popStateChanged")) {
                    SingleRoomManageEngine singleRoomManageEngine2 = SingleRoomManageEngine.this;
                    if (intent.getStringExtra("popState") != null) {
                        str = intent.getStringExtra("popState");
                    }
                    SingleRoomManageEngine.p(singleRoomManageEngine2, S, str, nxf.a(intent));
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements tsd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f13282a;

        static {
            t2o.a(779093441);
            t2o.a(336592972);
        }

        public a() {
        }

        @Override // tb.tsd
        public void G(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
            } else {
                SingleRoomManageEngine.p(SingleRoomManageEngine.this, this.f13282a, str, jSONObject);
            }
        }

        @Override // tb.tsd
        public void S0(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee651ff0", new Object[]{this, jSONObject});
            }
        }

        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caed17af", new Object[]{this, context});
            } else {
                this.f13282a = context;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements fee {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f13283a;

        static {
            t2o.a(779093442);
            t2o.a(336592973);
        }

        public b() {
        }

        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caed17af", new Object[]{this, context});
            } else {
                this.f13283a = context;
            }
        }

        @Override // tb.fee
        public void h(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
            } else {
                SingleRoomManageEngine.o(SingleRoomManageEngine.this, this.f13283a, str, jSONObject);
            }
        }
    }

    static {
        t2o.a(779093439);
        t2o.a(806356196);
        t2o.a(806356058);
    }

    public SingleRoomManageEngine(ux9 ux9Var) {
        this.h = ux9Var;
    }

    public static /* synthetic */ void o(SingleRoomManageEngine singleRoomManageEngine, Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d602915", new Object[]{singleRoomManageEngine, context, str, jSONObject});
        } else {
            singleRoomManageEngine.n(context, str, jSONObject);
        }
    }

    public static /* synthetic */ void p(SingleRoomManageEngine singleRoomManageEngine, Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27115456", new Object[]{singleRoomManageEngine, context, str, jSONObject});
        } else {
            singleRoomManageEngine.m(context, str, jSONObject);
        }
    }

    public static /* synthetic */ ux9 q(SingleRoomManageEngine singleRoomManageEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("6e7acba5", new Object[]{singleRoomManageEngine});
        }
        return singleRoomManageEngine.h;
    }

    public TBLiveDataModel A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("82cec8ab", new Object[]{this});
        }
        return this.e;
    }

    public bwd B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwd) ipChange.ipc$dispatch("80c7fafa", new Object[]{this});
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            return cprVar.E();
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            return l6tVar.n();
        }
        return null;
    }

    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a62424", new Object[]{this, new Boolean(z)});
            return;
        }
        this.r = z;
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.J(z);
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.o(this.r);
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7396911", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.h;
        if (ux9Var != null && (ux9Var.j() instanceof cba)) {
            Context S = ((cba) this.h.j()).S();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("mega.stdPop.broadcast.windowStateChanged");
            intentFilter.addAction("mega.stdPop.broadcast.popStateChanged");
            intentFilter.addAction("mega.stdPop.broadcast.positionChanged");
            LocalBroadcastManager.getInstance(S).registerReceiver(this.s, intentFilter);
        }
    }

    public void F(ux9 ux9Var, String str, TBLiveDataModel tBLiveDataModel) {
        boolean z;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b98e74b", new Object[]{this, ux9Var, str, tBLiveDataModel});
        } else if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
            String str3 = t;
            cir.a(str3, "initRoomInfo liveContextKey = " + str + " mLiveContextKey = " + this.g);
            this.e = tBLiveDataModel;
            this.j = true;
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            String str4 = videoInfo.topic;
            String str5 = videoInfo.channel;
            boolean z2 = videoInfo.fetchCommentsUseMtop;
            boolean z3 = videoInfo.fetchCommentsUseLMSDK;
            if (videoInfo.status == 1) {
                z = true;
            } else {
                z = false;
            }
            ChatRoomInfo chatRoomInfo = new ChatRoomInfo();
            tBLiveDataModel.mRoomInfo = chatRoomInfo;
            VideoInfo videoInfo2 = tBLiveDataModel.mVideoInfo;
            chatRoomInfo.roomId = videoInfo2.topic;
            AccountInfo accountInfo = videoInfo2.broadCaster;
            if (accountInfo != null) {
                str2 = accountInfo.anchorSideKey;
            } else {
                str2 = "";
            }
            this.g = str;
            P(ux9Var, str, tBLiveDataModel, str4, str5, str2, z, z2, z3);
            if (!(!(ux9Var instanceof air) || tBLiveDataModel.mVideoInfo == null || this.f == null)) {
                ((air) ux9Var).O0(new tjl(str5, "1".equals(tBLiveDataModel.mVideoInfo.roomStatus), str4, tBLiveDataModel.mVideoInfo.liveId, this.f.getHeartParams()));
            }
            Q(this.h);
            this.m = true;
        }
    }

    public final void G(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eecf7ad", new Object[]{this, new Integer(i), obj});
        } else if (5 == i && up6.d0(this.h) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            this.p = true;
            this.q = obj;
        } else {
            ArrayList<k9e> arrayList = this.f13280a;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<k9e> it = this.f13280a.iterator();
                while (it.hasNext()) {
                    it.next().onStatusChange(i, obj);
                }
            }
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.O();
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.q();
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.P();
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.r();
        }
    }

    public final void L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c12c82", new Object[]{this, context});
            return;
        }
        this.n.a(context);
        this.o.a(context);
        if (context instanceof hee) {
            ((hee) context).I1(this.n);
        }
        if (context instanceof yfb) {
            ((yfb) context).g0(this.o);
        }
    }

    public void M(k9e k9eVar) {
        ArrayList<k9e> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0f858b", new Object[]{this, k9eVar});
        } else if (k9eVar != null && (arrayList = this.f13280a) != null) {
            arrayList.add(k9eVar);
        }
    }

    public void N(ncc nccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74714414", new Object[]{this, nccVar});
            return;
        }
        this.f = nccVar;
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.a0(nccVar);
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.u(nccVar);
        }
    }

    public void O(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfb151", new Object[]{this, tBLiveDataModel});
        } else {
            this.e = tBLiveDataModel;
        }
    }

    public final void P(ux9 ux9Var, String str, TBLiveDataModel tBLiveDataModel, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec8e57a", new Object[]{this, ux9Var, str, tBLiveDataModel, str2, str3, str4, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!vwl.e().c()) {
            if (hjr.i() || pvs.j0()) {
                R(ux9Var, tBLiveDataModel, str2, str3, str4, z);
            } else if (hjr.y()) {
                T(ux9Var, str, tBLiveDataModel, str2, str3, z2, z3, z, str4);
            } else {
                S(ux9Var, str, tBLiveDataModel, str2, str3, z2, z3, z, str4);
            }
        }
    }

    public final void Q(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3a5406", new Object[]{this, ux9Var});
        } else if (hjr.y()) {
            String str = t;
            cir.a(str, "subscribeInsideDetail liveContextKey = " + this.g);
            if (ux9Var != null && (ux9Var.j() instanceof cba)) {
                if (((cba) ux9Var.j()).O()) {
                    E();
                    return;
                }
                Context S = ((cba) ux9Var.j()).S();
                if (S != null) {
                    L(S);
                }
            }
        }
    }

    public final void R(ux9 ux9Var, TBLiveDataModel tBLiveDataModel, String str, String str2, String str3, boolean z) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4c4df", new Object[]{this, ux9Var, tBLiveDataModel, str, str2, str3, new Boolean(z)});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null) {
            if (!z) {
                up6.Y0(cxg.c(videoInfo), ux9Var);
            }
            m6t m6tVar = new m6t(str2, "1".equals(tBLiveDataModel.mVideoInfo.roomStatus), str, tBLiveDataModel.mVideoInfo.liveId, this.f);
            m6tVar.v(true);
            m6tVar.w(true);
            m6tVar.n(str3);
            m6tVar.r(false);
            m6tVar.A(z);
            m6tVar.p(tBLiveDataModel.mVideoInfo.fetchCommentsUseMtop);
            m6tVar.o(tBLiveDataModel.mVideoInfo.fetchCommentsUseLMSDK);
            m6tVar.s(tBLiveDataModel.mVideoInfo.forceCommentsUseCdn);
            m6tVar.q(pvs.j0());
            m6tVar.u(ux9Var.n());
            if (tBLiveDataModel.mVideoInfo.isOfficialType()) {
                m6tVar.t(true);
                m6tVar.x(tBLiveDataModel.mVideoInfo.officialLiveInfo.encryptAnchorId);
                m6tVar.y(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
                m6tVar.z(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveTopic);
            }
            l6t l6tVar = new l6t();
            this.d = l6tVar;
            l6tVar.v(this);
            this.d.y(m6tVar);
            U();
        }
    }

    public final void S(ux9 ux9Var, String str, TBLiveDataModel tBLiveDataModel, String str2, String str3, boolean z, boolean z2, boolean z3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287fd53e", new Object[]{this, ux9Var, str, tBLiveDataModel, str2, str3, new Boolean(z), new Boolean(z2), new Boolean(z3), str4});
            return;
        }
        this.g = str;
        ujl.d().f(ux9Var, str, tBLiveDataModel, str2, str3, z, z2, z3, str4, false, null, this.f, this.r, this);
        this.c = ujl.d().e();
    }

    public final void T(ux9 ux9Var, String str, TBLiveDataModel tBLiveDataModel, String str2, String str3, boolean z, boolean z2, boolean z3, String str4) {
        boolean z4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ae631a", new Object[]{this, ux9Var, str, tBLiveDataModel, str2, str3, new Boolean(z), new Boolean(z2), new Boolean(z3), str4});
            return;
        }
        this.g = str;
        if (this.c != null) {
            V();
            this.c.l0();
        }
        if (z3) {
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            this.c = new cpr(1, videoInfo.topic, str4, z2, z, videoInfo.forceCommentsUseCdn, false, this);
        } else {
            up6.Y0(cxg.c(tBLiveDataModel.mVideoInfo), ux9Var);
            if (!TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl) || (tBLiveDataModel.mVideoInfo.fetchItemUseCdn && qvs.n0() && !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl))) {
                z4 = true;
            } else {
                z4 = false;
            }
            VideoInfo videoInfo2 = tBLiveDataModel.mVideoInfo;
            this.c = new xlr(1, str2, str4, str3, z2, z, videoInfo2.forceCommentsUseCdn, false, "1".equals(videoInfo2.roomStatus), false, z4, this);
            igq.n().s("Page_TaobaoLiveWatch", "LiveRoomInit", igq.n().m());
        }
        if (tBLiveDataModel.mVideoInfo.isOfficialType()) {
            this.c.b0(true);
            this.c.e0(tBLiveDataModel.mVideoInfo.officialLiveInfo.encryptAnchorId);
            this.c.f0(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            this.c.g0(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveTopic);
        }
        this.c.h0(null);
        this.c.a0(this.f);
        this.c.J(this.r);
        this.c.d0(tBLiveDataModel.mVideoInfo.liveId);
        this.c.c0(tBLiveDataModel.mVideoInfo.fetchItemUseCdnUrl);
        this.c.Z(tBLiveDataModel.mVideoInfo.fetchMSGCdnUrl);
        this.c.i0();
        U();
    }

    public void W(k9e k9eVar) {
        ArrayList<k9e> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456cb832", new Object[]{this, k9eVar});
        } else if (k9eVar != null && (arrayList = this.f13280a) != null) {
            arrayList.remove(k9eVar);
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd50eb8", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (hjr.i()) {
                u();
            } else if (hjr.y()) {
                w();
            } else {
                v();
            }
        }
    }

    public final void Y() {
        Context S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f940916a", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.h;
        if (ux9Var != null && (ux9Var.j() instanceof cba) && (S = ((cba) this.h.j()).S()) != null) {
            LocalBroadcastManager.getInstance(S).unregisterReceiver(this.s);
        }
    }

    @Override // tb.hmc
    public void a(gtc gtcVar) {
        HashMap<gtc, MessageTypeFilter> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b54f89c", new Object[]{this, gtcVar});
        } else if (gtcVar != null && (hashMap = this.b) != null) {
            hashMap.remove(gtcVar);
        }
    }

    @Override // tb.hmc
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1002ca60", new Object[]{this, str});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.n(str);
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.b(str);
        }
    }

    @Override // tb.hmc
    public void e(hbd hbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef6cf7", new Object[]{this, hbdVar});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.q(hbdVar);
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.c(hbdVar);
        }
    }

    @Override // tb.hmc
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ed8ef2", new Object[]{this});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.S();
        }
    }

    @Override // tb.hmc
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879aefa9", new Object[]{this});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.Y();
        }
    }

    @Override // tb.hmc
    public void k(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88896dbb", new Object[]{this, tLiveMsg});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.x(tLiveMsg);
        }
    }

    @Override // tb.hmc
    public void l(gtc gtcVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8a8362", new Object[]{this, gtcVar, messageTypeFilter});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap<>();
        }
        if (gtcVar != null) {
            this.b.put(gtcVar, messageTypeFilter);
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e3d359", new Object[]{this})).booleanValue();
        }
        String str = t;
        cir.a(str, "backToLive mLiveContextKey = " + this.g);
        if (!this.p) {
            return false;
        }
        this.p = false;
        this.q = null;
        ArrayList<k9e> arrayList = this.f13280a;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<k9e> it = this.f13280a.iterator();
            while (it.hasNext()) {
                it.next().onStatusChange(5, this.q);
            }
        }
        y(1004, this.q);
        return true;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2056d6", new Object[]{this});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.s();
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.d();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec10943", new Object[]{this});
            return;
        }
        cpr cprVar = this.c;
        if (cprVar != null) {
            cprVar.t();
        }
        l6t l6tVar = this.d;
        if (l6tVar != null) {
            l6tVar.e();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59343d7a", new Object[]{this});
        } else if (this.d != null) {
            V();
            this.d.B();
            this.d = null;
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ed09bd", new Object[]{this});
        } else {
            ujl.d().b(this.g);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbf2f61", new Object[]{this});
        } else if (this.c != null) {
            V();
            this.c.l0();
            this.c = null;
        }
    }

    public void x(ux9 ux9Var, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64197ec", new Object[]{this, ux9Var, new Boolean(z), str});
            return;
        }
        String str2 = t;
        cir.a(str2, "destroyRoomInfo liveContextKey = " + str + " mLiveContextKey = " + this.g);
        up6.Y0("", ux9Var);
        this.j = false;
        Y();
        X();
        HashMap<gtc, MessageTypeFilter> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.f = null;
        this.g = null;
        this.q = null;
        this.p = false;
        this.m = false;
    }

    public final void y(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75cf76b", new Object[]{this, new Integer(i), obj});
            return;
        }
        try {
            HashMap<gtc, MessageTypeFilter> hashMap = this.b;
            if (hashMap != null && hashMap.size() > 0) {
                Set<gtc> keySet = this.b.keySet();
                if (keySet.size() > 0) {
                    for (gtc gtcVar : keySet) {
                        MessageTypeFilter messageTypeFilter = this.b.get(gtcVar);
                        if (messageTypeFilter != null && messageTypeFilter.filter(i)) {
                            gtcVar.onMessageReceived(i, obj);
                        }
                    }
                }
            }
        } catch (Exception e) {
            String str = t;
            o3s.b(str, "Exception: " + fkx.i(e));
        }
    }

    public final void C(Object obj) {
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822cdd0c", new Object[]{this, obj});
        } else if (pvs.x0()) {
            String str = t;
            o3s.b(str, "拉停PM消息,进入handleLivePunish");
            if (obj instanceof TLiveMsg) {
                JSONObject d = fkx.d(new String(((TLiveMsg) obj).data));
                if (!tz3.b(d)) {
                    o3s.b(str, "拉停PM消息：" + d);
                    String string = d.getString("actionType");
                    if (TextUtils.equals(string, "1")) {
                        TBLiveDataModel tBLiveDataModel = this.e;
                        if (!(tBLiveDataModel == null || (videoInfo2 = tBLiveDataModel.mVideoInfo) == null)) {
                            videoInfo2.status = 3;
                            videoInfo2.streamStatus = "0";
                        }
                        G(12, obj);
                    } else if (TextUtils.equals(string, "2")) {
                        TBLiveDataModel tBLiveDataModel2 = this.e;
                        if (!(tBLiveDataModel2 == null || (videoInfo = tBLiveDataModel2.mVideoInfo) == null)) {
                            videoInfo.status = 0;
                            videoInfo.streamStatus = "1";
                        }
                        G(13, obj);
                    }
                }
            }
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        String str = t;
        cir.a(str, "onStart liveContextKey = " + this.g);
        this.i = true;
        if (hjr.y()) {
            U();
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        String str = t;
        cir.a(str, "onStop liveContextKey = " + this.g);
        this.i = false;
        if (hjr.y()) {
            V();
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6194e1d7", new Object[]{this});
        } else if (hjr.y()) {
            String str = t;
            cir.a(str, "tryEnterChatRoom liveContextKey = " + this.g + " isSubscribedPM = " + this.l + " hasLiveInfo = " + this.j + " isPageVisible = " + this.i + " isFullInsideDetailOpen = " + this.k + " mMessageProvider = " + this.c);
            if (this.c != null && this.j && this.i && !this.k && !this.l) {
                cir.a(str, "tryEnterChatRoom success liveContextKey = " + this.g);
                this.c.y();
                this.l = true;
            }
            if (this.d != null && this.j && this.i && !this.k && !this.l) {
                cir.a(str, "tryEnterChatRoom success liveContextKey = " + this.g);
                this.d.i();
                this.l = true;
            }
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a6bf73", new Object[]{this});
        } else if (hjr.y()) {
            String str = t;
            cir.a(str, "tryExitChatRoom liveContextKey = " + this.g + " isSubscribedPM = " + this.l);
            if (this.c != null && this.l) {
                cir.a(str, "tryExitChatRoom success liveContextKey = " + this.g);
                this.c.z();
                this.l = false;
            }
            if (this.d != null && this.l) {
                cir.a(str, "tryExitChatRoom success liveContextKey = " + this.g);
                this.d.j();
                this.l = false;
            }
        }
    }

    public final void m(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23b6f1b", new Object[]{this, context, str, jSONObject});
        } else if (!this.m || !z(context, jSONObject)) {
        } else {
            if (IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                String str2 = t;
                cir.a(str2, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_INSIDE_DESTROY liveContextKey = " + this.g);
                this.k = false;
                U();
            } else if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                String str3 = t;
                cir.a(str3, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_INSIDE_CREATE liveContextKey = " + this.g);
            }
        }
    }

    public final void n(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bdec5b6", new Object[]{this, context, str, jSONObject});
        } else if (!this.m || !z(context, jSONObject)) {
        } else {
            if (IAKPopRender.WindowState.STD_POP_HALF.equals(str)) {
                String str2 = t;
                cir.a(str2, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_HALF_SCREEN liveContextKey = " + this.g);
                this.k = false;
                U();
            } else if (IAKPopRender.WindowState.STD_POP_FULL_SCREEN.equals(str)) {
                String str3 = t;
                cir.a(str3, "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_FULL_SCREEN liveContextKey = " + this.g);
                this.k = true;
                V();
            }
        }
    }

    public final boolean z(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1e93494", new Object[]{this, context, jSONObject})).booleanValue();
        }
        return (jSONObject == null || context == null || !String.valueOf(context.hashCode()).equals(jSONObject.getString("popId"))) ? false : true;
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        VideoInfo videoInfo;
        JoinNotifyMessage joinNotifyMessage;
        VideoInfo videoInfo2;
        CountInfoMessage countInfoMessage;
        Map<String, Long> map;
        VideoInfo videoInfo3;
        VideoInfo videoInfo4;
        ShareGoodsListMessage shareGoodsListMessage;
        VideoInfo videoInfo5;
        VideoInfo videoInfo6;
        VideoInfo videoInfo7;
        VideoInfo videoInfo8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        igq.n().g("onMessageReceived", String.valueOf(i), 1.0d);
        if (i == 102) {
            TBLiveDataModel tBLiveDataModel = this.e;
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || videoInfo.status == 1 || (joinNotifyMessage = (JoinNotifyMessage) obj) == null)) {
                videoInfo.joinCount = joinNotifyMessage.onlineCount;
                videoInfo.totalJoinCount = joinNotifyMessage.totalCount;
                videoInfo.viewCount = joinNotifyMessage.pageViewCount;
            }
        } else if (i == 1002) {
            TBLiveDataModel tBLiveDataModel2 = this.e;
            if (!(tBLiveDataModel2 == null || (videoInfo2 = tBLiveDataModel2.mVideoInfo) == null || videoInfo2.status == 1 || (map = (countInfoMessage = (CountInfoMessage) obj).value) == null || map.get(PowerMsgType.KEY_FAVOR) == null)) {
                this.e.mVideoInfo.praiseCount = countInfoMessage.value.get(PowerMsgType.KEY_FAVOR).longValue();
            }
        } else if (i == 1004) {
            TBLiveDataModel tBLiveDataModel3 = this.e;
            if (!(tBLiveDataModel3 == null || (videoInfo3 = tBLiveDataModel3.mVideoInfo) == null)) {
                videoInfo3.status = 1;
                videoInfo3.roomStatus = "2";
            }
            G(5, obj);
        } else if (i != 1009) {
            VideoInfo videoInfo9 = null;
            if (i == 1039) {
                TBLiveDataModel tBLiveDataModel4 = this.e;
                if (!(tBLiveDataModel4 == null || (videoInfo5 = tBLiveDataModel4.mVideoInfo) == null || videoInfo5.tbtvLiveDO == null || !(obj instanceof TBTVProgramMessage))) {
                    TBTVProgramMessage tBTVProgramMessage = (TBTVProgramMessage) obj;
                    if (!TextUtils.equals(videoInfo5.liveId, tBTVProgramMessage.liveDO.liveId) && !TextUtils.equals(this.e.mVideoInfo.tbtvLiveDO.liveId, tBTVProgramMessage.liveDO.liveId)) {
                        VideoInfo videoInfo10 = this.e.mVideoInfo;
                        TBTVProgramInfo tBTVProgramInfo = tBTVProgramMessage.liveDO;
                        videoInfo10.tbtvLiveDO = tBTVProgramInfo;
                        videoInfo10.curItemNum = 0;
                        videoInfo10.millionBaby = tBTVProgramInfo.millionBaby;
                        G(6, null);
                    } else {
                        return;
                    }
                }
            } else if (i == 1053) {
                TBLiveDataModel tBLiveDataModel5 = this.e;
                if (!(tBLiveDataModel5 == null || (videoInfo6 = tBLiveDataModel5.mVideoInfo) == null)) {
                    videoInfo9 = videoInfo6;
                }
                if (!(videoInfo9 == null || videoInfo9.broadCaster == null || !(obj instanceof TaskStatusMsg))) {
                    UserLevelAvatar userLevelAvatar = new UserLevelAvatar();
                    userLevelAvatar.userid = v2s.o().u().getUserId();
                    userLevelAvatar.nick = v2s.o().u().getNick();
                    if (userLevelAvatar.identify == null) {
                        userLevelAvatar.identify = new HashMap<>();
                    }
                    userLevelAvatar.identify.put(m09.FANS_LEVEL_RENDER, ((TaskStatusMsg) obj).currentLevel);
                    InteractBusiness.l(videoInfo9.liveId, videoInfo9.broadCaster.accountId, videoInfo9.topic, PowerMsgType.fansLevelUpgrade, JSON.toJSONString(userLevelAvatar), null, null, B());
                }
            } else if (i == 880000291) {
                C(obj);
            } else if (i == 1006) {
                TBLiveDataModel tBLiveDataModel6 = this.e;
                if (!(tBLiveDataModel6 == null || (videoInfo7 = tBLiveDataModel6.mVideoInfo) == null)) {
                    videoInfo7.status = 3;
                    videoInfo7.streamStatus = "0";
                }
                G(3, null);
            } else if (i == 1007) {
                TBLiveDataModel tBLiveDataModel7 = this.e;
                if (!(tBLiveDataModel7 == null || (videoInfo8 = tBLiveDataModel7.mVideoInfo) == null)) {
                    videoInfo8.status = 0;
                    videoInfo8.streamStatus = "1";
                }
                G(4, null);
                return;
            }
        } else {
            TBLiveDataModel tBLiveDataModel8 = this.e;
            if (!(tBLiveDataModel8 == null || (videoInfo4 = tBLiveDataModel8.mVideoInfo) == null || videoInfo4.status == 1 || (shareGoodsListMessage = (ShareGoodsListMessage) obj) == null)) {
                videoInfo4.curItemNum = shareGoodsListMessage.totalCount;
                if (shareGoodsListMessage.goodsList != null) {
                    videoInfo4.curItemList = new ArrayList<>();
                    for (ShareGoodMessage shareGoodMessage : shareGoodsListMessage.goodsList) {
                        LiveItem d = u2j.d(shareGoodMessage);
                        if (d != null) {
                            int i2 = shareGoodsListMessage.goodsIndex;
                            d.goodsIndex = i2;
                            d.groupNum = i2;
                        }
                        this.e.mVideoInfo.curItemList.add(d);
                    }
                }
            }
        }
        if (!(1004 == i && up6.d0(this.h) == VideoStatus.VIDEO_TIMESHIFT_STATUS)) {
            y(i, obj);
        }
    }
}
