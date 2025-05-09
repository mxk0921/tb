package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.OpenArchMessageSource;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wkr extends cpr implements xdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String K;
    public final boolean M;
    public final boolean N;
    public boolean O;
    public boolean P = true;
    public tsy X = null;
    public boolean R = false;
    public boolean S = false;
    public final u1a<tsy, epy, xhv> T = new a();
    public final g1a<List<String>, xhv> U = new b();
    public final g1a<n2g<Object>, xhv> V = new c();
    public final g1a<Map<String, ? extends Object>, Map<String, ? extends Object>> W = new d();
    public final String L = uqi.g();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements u1a<tsy, epy, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public xhv invoke(tsy tsyVar, epy epyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("7c487d8d", new Object[]{this, tsyVar, epyVar});
            }
            TLiveMsg c = wkr.c(wkr.this, epyVar);
            if (c == null) {
                return xhv.INSTANCE;
            }
            wkr.this.w(c);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements g1a<List<String>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public xhv invoke(List<String> list) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("bbb0936f", new Object[]{this, list});
            }
            list.clear();
            int b = iw0.b(v2s.o().f().getApplication());
            byte[] bArr = new byte[8];
            Arrays.fill(bArr, (byte) 0);
            bArr[0] = wkr.r0(wkr.this) ? (byte) 1 : (byte) 0;
            bArr[1] = (byte) b;
            if (wkr.s0(wkr.this)) {
                i = 2;
            } else if (!wkr.t0(wkr.this)) {
                i = 0;
            }
            bArr[2] = (byte) i;
            long j = 0;
            for (int i2 = 7; i2 >= 0; i2--) {
                j = (j << 8) | (bArr[i2] & 255);
            }
            list.add(String.valueOf(j));
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public xhv invoke(n2g<Object> n2gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("cd729a02", new Object[]{this, n2gVar});
            }
            if (!jzk.Companion.a().b().equals(n2gVar.b().d()) || n2gVar.a() == null || !(n2gVar.a() instanceof kzk)) {
                return null;
            }
            Object obj = ((kzk) n2gVar.a()).a().b().get("PowerMsgData");
            if (!(obj instanceof epy)) {
                return null;
            }
            TLiveMsg c = wkr.c(wkr.this, (epy) obj);
            if (c == null) {
                return xhv.INSTANCE;
            }
            wkr.this.w(c);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements g1a<Map<String, ? extends Object>, Map<String, ? extends Object>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public Map<String, Object> invoke(Map<String, ? extends Object> map) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("fa88885b", new Object[]{this, map});
            }
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            int b = iw0.b(v2s.o().f().getApplication());
            byte[] bArr = new byte[8];
            Arrays.fill(bArr, (byte) 0);
            bArr[0] = wkr.r0(wkr.this) ? (byte) 1 : (byte) 0;
            bArr[1] = (byte) b;
            if (wkr.s0(wkr.this)) {
                i = 2;
            } else if (!wkr.t0(wkr.this)) {
                i = 0;
            }
            bArr[2] = (byte) i;
            long j = 0;
            for (int i2 = 7; i2 >= 0; i2--) {
                j = (j << 8) | (bArr[i2] & 255);
            }
            arrayList.add(String.valueOf(j));
            hashMap.put("heartbeatStateList", arrayList);
            return hashMap;
        }
    }

    static {
        t2o.a(806356177);
        t2o.a(806355919);
    }

    public wkr(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, cpr.b bVar, boolean z5, boolean z6) {
        super(i, str, str2, z, z2, z3, z4, new tgr(), bVar);
        this.K = str;
        this.M = z5;
        this.N = z6;
    }

    public static /* synthetic */ TLiveMsg c(wkr wkrVar, epy epyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLiveMsg) ipChange.ipc$dispatch("be372c3a", new Object[]{wkrVar, epyVar});
        }
        return wkrVar.d(epyVar);
    }

    public static /* synthetic */ Object ipc$super(wkr wkrVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1645671784:
                super.H((TLiveMsg) objArr[0]);
                return null;
            case -1512649357:
                super.P();
                return null;
            case 44570194:
                super.y();
                return null;
            case 225283992:
                super.z();
                return null;
            case 797441118:
                super.O();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/TBLiveKMPMessageProvider");
        }
    }

    public static /* synthetic */ boolean r0(wkr wkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f3bfb3a", new Object[]{wkrVar})).booleanValue();
        }
        return wkrVar.O;
    }

    public static /* synthetic */ boolean s0(wkr wkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c37a6ad9", new Object[]{wkrVar})).booleanValue();
        }
        wkrVar.getClass();
        return false;
    }

    public static /* synthetic */ boolean t0(wkr wkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57b8da78", new Object[]{wkrVar})).booleanValue();
        }
        return wkrVar.P;
    }

    @Override // tb.cpr
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.O();
        this.P = false;
    }

    @Override // tb.cpr
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.P();
        this.P = true;
    }

    @Override // tb.xdb
    public void b(Boolean bool, int i, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1dd991b", new Object[]{this, bool, new Integer(i), str});
            return;
        }
        if (bool != null && !bool.booleanValue()) {
            z = false;
        }
        this.O = z;
    }

    public final TLiveMsg d(epy epyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLiveMsg) ipChange.ipc$dispatch("299e7eba", new Object[]{this, epyVar});
        }
        if (epyVar == null) {
            return null;
        }
        TLiveMsg tLiveMsg = new TLiveMsg();
        if (epyVar.o() != null) {
            tLiveMsg.data = epyVar.o().getBytes();
        }
        tLiveMsg.topic = epyVar.r();
        if (epyVar.p() == OpenArchMessageSource.PM && epyVar.q() != null) {
            if (epyVar.q().getType() != null) {
                tLiveMsg.type = epyVar.q().getType().intValue();
            }
            tLiveMsg.bizCode = this.f17221a;
            tLiveMsg.from = epyVar.q().getFrom();
            tLiveMsg.messageId = epyVar.q().getMessageId();
            if (epyVar.q().getNeedAck() != null) {
                tLiveMsg.needAck = epyVar.q().getNeedAck().booleanValue();
            }
            if (epyVar.q().getPriority() != null) {
                tLiveMsg.priority = epyVar.q().getPriority().intValue();
            }
            if (epyVar.q().getQosLevel() != null) {
                tLiveMsg.qosLevel = epyVar.q().getQosLevel().intValue();
            }
            if (epyVar.q().getSendFullTags() != null) {
                tLiveMsg.sendFullTags = epyVar.q().getSendFullTags().booleanValue();
            }
            if (epyVar.q().getTags() != null) {
                tLiveMsg.tags = (String[]) epyVar.q().getTags().toArray(new String[0]);
            }
            tLiveMsg.timestamp = zqq.h(epyVar.q().getTimestamp());
            tLiveMsg.to = epyVar.q().getTo();
            tLiveMsg.userId = epyVar.q().getUserId();
        } else if (epyVar.p() == OpenArchMessageSource.CDN && epyVar.n() != null) {
            if (epyVar.n().getSubType() != null) {
                tLiveMsg.type = epyVar.n().getSubType().intValue();
            }
            tLiveMsg.bizCode = this.f17221a;
            tLiveMsg.messageId = epyVar.n().getMsgId();
            if (epyVar.n().getPushTime() != null) {
                tLiveMsg.timestamp = epyVar.n().getPushTime().longValue();
            }
        }
        return tLiveMsg;
    }

    public void v0(m6t m6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35b2c07", new Object[]{this, m6tVar});
        } else if (m6tVar.a() != null) {
            m2g fetchEntity = d9m.P().fetchEntity(m6tVar.a());
            if (!(fetchEntity == null || fetchEntity.j() == null)) {
                fetchEntity.j().h(q2g.Companion.a("DataServiceIntent_PowerMsgReceiveMessage"), toy.Companion.d(), this.V);
            }
            if (fetchEntity != null && d9m.P().getChannelComponent(fetchEntity) != null) {
                d9m.P().getChannelComponent(fetchEntity).a(1, this.W);
            }
        }
    }

    public void w0(m6t m6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b1c131", new Object[]{this, m6tVar});
            return;
        }
        this.S = m6tVar.g();
        if (m6tVar.a() != null) {
            m2g fetchEntity = d9m.P().fetchEntity(m6tVar.a());
            if (fetchEntity != null) {
                if (fetchEntity.j() != null) {
                    fetchEntity.j().g(q2g.Companion.a("DataServiceIntent_PowerMsgReceiveMessage"), toy.Companion.d(), this.V);
                }
                if (d9m.P().getChannelComponent(fetchEntity) != null) {
                    d9m.P().getChannelComponent(fetchEntity).a(1, this.W);
                    return;
                }
                return;
            }
            eir.a("TaoLiveKMPPMProvider", "PM registerEventListener failed, topic = " + m6tVar.c);
            return;
        }
        eir.a("TaoLiveKMPPMProvider", "KmpIdentifier Is Null , topic = " + m6tVar.c);
    }

    @Override // tb.cpr
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81652", new Object[]{this});
            return;
        }
        super.y();
        eir.a("TaoLiveKMPPMProvider", "enterChatRoom  topic = " + this.K);
        if (qvs.X() || this.u != LiveEmbedType.SHOP_CARD) {
            y0();
        }
        j0();
    }

    @Override // tb.cpr
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8f98", new Object[]{this});
            return;
        }
        super.z();
        eir.a("TaoLiveKMPPMProvider", "exitChatRoom  topic = " + this.K);
        z0(this.K);
        m0();
    }

    @Override // tb.cpr
    public void H(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de90a98", new Object[]{this, tLiveMsg});
        } else if (TextUtils.isEmpty(tLiveMsg.topic) || !TextUtils.equals(tLiveMsg.topic, this.K)) {
            cwd A = v2s.o().A();
            A.c("TaoLiveKMPPMProvider", "powerMessage is error. PM topic = " + this.K + "  current PMProvider topic = " + this.K);
        } else {
            if (tLiveMsg.type == 10181) {
                tLiveMsg.type = 10101;
            }
            if (tLiveMsg.data == null) {
                tLiveMsg.data = new byte[1];
            }
            super.H(tLiveMsg);
        }
    }

    public final void z0(String str) {
        tsy tsyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae551836", new Object[]{this, str});
            return;
        }
        eir.a("TaoLiveKMPPMProvider", "stopSubscribePM  topic = " + str);
        if (!this.R) {
            eir.a("TaoLiveKMPPMProvider", "stopSubscribePM failed by repeat , topic = " + str);
            return;
        }
        if (this.A) {
            hnk.h().o();
        }
        if (!this.S) {
            if (!(str == null || (tsyVar = this.X) == null || !str.equals(tsyVar.o()))) {
                d9m.O().unSubscribe(this.X);
                this.X = null;
            }
            v2s.o().m().b(v2s.o().f().getApplication(), this);
        }
        this.R = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f9, code lost:
        r0 = new com.alibaba.fastjson.JSONObject();
        r1 = r4.split("#");
        r3 = r1.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0206, code lost:
        if (r4 >= r3) goto L_0x0229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0208, code lost:
        r5 = r1[r4].split(com.xiaomi.mipush.sdk.Constants.WAVE_SEPARATOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0211, code lost:
        if (r5 == null) goto L_0x0224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0215, code lost:
        if (r5.length < 2) goto L_0x0221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0217, code lost:
        r9 = 1;
        r0.put(r5[0], (java.lang.Object) r5[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0222, code lost:
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0227, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0229, code lost:
        r10.put("liveAlgoParams", (java.lang.Object) r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject u0(tb.ncc r27) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wkr.u0(tb.ncc):com.alibaba.fastjson.JSONObject");
    }

    public final void y0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5877e90c", new Object[]{this});
            return;
        }
        eir.a("TaoLiveKMPPMProvider", "startSubscribePM  topic = " + this.K);
        if (this.K != null && !this.R) {
            JSONObject u0 = u0(this.t);
            if (this.A) {
                hnk h = hnk.h();
                String str2 = this.x;
                String str3 = this.y;
                String str4 = this.z;
                if (u0 != null) {
                    str = u0.toJSONString();
                } else {
                    str = "";
                }
                h.m(str2, str3, str4, str);
            }
            if (!this.S) {
                tsy tsyVar = new tsy();
                this.X = tsyVar;
                tsyVar.D(this.K);
                this.X.s(this.F);
                this.X.v(this.M);
                this.X.w(this.N);
                this.X.x(u0);
                this.X.u(false);
                String str5 = this.L;
                if (str5 != null) {
                    this.X.z(str5);
                }
                ncc nccVar = this.t;
                if (nccVar != null) {
                    this.X.t(nccVar.getHeartParams().get("liveToken"));
                }
                this.X.q(this.T);
                this.X.E(this.U);
                d9m.O().subscribe(this.X);
                v2s.o().m().a(v2s.o().f().getApplication(), this);
            }
            this.R = true;
        }
    }
}
