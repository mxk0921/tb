package tb;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.task.Coordinator;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.mediaplatform.service.monitor.AdMonitorBusiness;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.uvt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qet implements s3c, uvt.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String j = qet.class.getSimpleName();
    public ls0 b;
    public final dgc d;
    public LiveDetailMessinfoResponseData.AdEurlParams e;
    public final ux9 f;
    public uvt g;
    public final f9z k;

    /* renamed from: a  reason: collision with root package name */
    public int f26708a = 0;
    public long c = pvs.e2();
    public final Handler h = new Handler(Coordinator.getWorkerLooper());
    public final AdMonitorBusiness i = new AdMonitorBusiness(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveDetailMessinfoResponseData.AlimamaInfo f26709a;

        public a(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo) {
            this.f26709a = alimamaInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (qet.b(qet.this) == null) {
                qet.c(qet.this, new ls0());
            }
            LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo = this.f26709a;
            if (alimamaInfo != null && alimamaInfo.clickid != null) {
                qet.b(qet.this).c(this.f26709a.clickid);
                qet.d(qet.this).K(this.f26709a.pid, "click", "");
                ux9 e = qet.e(qet.this);
                rbu.L(e, "Alimama_Click", "alimamaClickId=" + this.f26709a.clickid);
            }
        }
    }

    static {
        t2o.a(779092982);
        t2o.a(806355016);
        t2o.a(779093379);
        t2o.a(779093378);
    }

    public qet(IInteractiveProxy.h hVar, VideoInfo videoInfo, boolean z, ux9 ux9Var) {
        this.d = hVar.u(videoInfo, z);
        this.k = hVar.a(videoInfo, z);
        hVar.getContext();
        sjr.g().a(this);
        uvt uvtVar = new uvt();
        this.g = uvtVar;
        uvtVar.f(this);
        this.f = ux9Var;
    }

    public static /* synthetic */ ls0 b(qet qetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ls0) ipChange.ipc$dispatch("7a1bbede", new Object[]{qetVar});
        }
        return qetVar.b;
    }

    public static /* synthetic */ ls0 c(qet qetVar, ls0 ls0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ls0) ipChange.ipc$dispatch("ec8157bd", new Object[]{qetVar, ls0Var});
        }
        qetVar.b = ls0Var;
        return ls0Var;
    }

    public static /* synthetic */ AdMonitorBusiness d(qet qetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorBusiness) ipChange.ipc$dispatch("6456aff9", new Object[]{qetVar});
        }
        return qetVar.i;
    }

    public static /* synthetic */ ux9 e(qet qetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("5896d385", new Object[]{qetVar});
        }
        return qetVar.f;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TaskInteractiveManager";
    }

    public final void f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b15f38", new Object[]{this, str, jSONObject});
        } else if (this.d == null) {
        } else {
            if (up6.p0(this.f)) {
                this.d.a(str, jSONObject, iba.B(vx9.f(this.f)), up6.B(this.f));
            } else {
                this.d.b(str, jSONObject, up6.c0(this.f));
            }
        }
    }

    public final String g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a8dce3", new Object[]{this});
        }
        if (v2s.o().f() != null) {
            str = v2s.o().f().getAppKey();
        } else {
            str = "21646297";
        }
        String U = up6.U(this.f);
        String L = up6.L(this.f);
        return "appKey=" + str + "#livesource=" + L + "#spm=" + U;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        if (v2s.o().f() != null) {
            return v2s.o().f().getAppKey();
        }
        return "21646297";
    }

    public final String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26183fac", new Object[]{this, str});
        }
        Matcher matcher = Pattern.compile("feedid=(\\d+)").matcher(Uri.decode(str));
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public final void k(String str) {
        LiveDetailMessinfoResponseData.AlimamaInfo2 d;
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ea241e", new Object[]{this, str});
        } else if (pvs.z0() && (d = up6.d(this.f)) != null) {
            if (this.b == null) {
                this.b = new ls0();
            }
            VideoInfo c0 = up6.c0(this.f);
            if (c0 == null) {
                return;
            }
            if (((!TextUtils.isEmpty(c0.liveId) && !TextUtils.isEmpty(d.adLiveId) && d.adLiveId.equals(c0.liveId)) || TextUtils.isEmpty(d.adLiveId)) && (arrayList = d.action_list) != null && arrayList.size() > 0 && d.action_list.contains(str)) {
                System.out.println(d.pay_url);
                String str2 = d.pay_url + "&acttype=${" + str + "}";
                this.b.d(str2, str, d.action_list);
                rbu.L(this.f, "Alimama_AdTransParams_Click", "url=" + str2 + " actionType=" + str + " action_list=" + d.action_list + " live_os=Android liveType=2");
            }
        }
    }

    public final void l(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb1b18", new Object[]{this, alimamaInfo});
        } else {
            this.h.postDelayed(new a(alimamaInfo), this.c * 1000);
        }
    }

    public final void m() {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a209cf2b", new Object[]{this});
            return;
        }
        LiveDetailMessinfoResponseData.AlimamaInfo e0 = up6.e0(this.f);
        if (e0 != null) {
            if (this.b == null) {
                this.b = new ls0();
            }
            if (e0.clickid == null && (d = fkx.d(up6.I(this.f))) != null) {
                Integer integer = d.getInteger("pay_time");
                String string = d.getString("pay_url");
                if (integer.intValue() > 0) {
                    e0.pay_time = integer.intValue();
                }
                if (string != null) {
                    e0.clickid = string;
                }
            }
            LiveDetailMessinfoResponseData.AdEurlParams adEurlParams = this.e;
            if (adEurlParams != null) {
                long j2 = adEurlParams.pay_time;
                if (j2 > 0) {
                    e0.pay_time = j2;
                }
                String str = adEurlParams.eurl;
                if (str != null) {
                    e0.clickid = str;
                }
            }
            long j3 = e0.pay_time;
            if (j3 > 0) {
                this.c = j3;
            }
            l(e0);
        }
    }

    public final void n() {
        VideoInfo.AlimamaEnjoyFirst alimamaEnjoyFirst;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb1ab14", new Object[]{this});
            return;
        }
        VideoInfo c0 = up6.c0(this.f);
        if (c0 != null && (alimamaEnjoyFirst = c0.alimamaEnjoyFirst) != null && alimamaEnjoyFirst.ifs != null && pvs.m()) {
            if (qvs.k()) {
                String str2 = c0.alimamaEnjoyFirst.ifs;
                str = str2.replaceAll("__APPINFO__", h() + "_0");
            } else {
                str = c0.alimamaEnjoyFirst.ifs;
            }
            ls0.a(str, g(), "TargetQzt");
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.addcart", "com.taobao.taolive.room.gotoDetail", "com.taobao.taolive.room.gotoShop", uyg.EVENT_ACTION_FOLLOW, "com.taobao.taolive.room.share", uyg.EVENT_ADD_ITEM, "com.taobao.taolive.room.add_item_new", uyg.EVENT_ACTION_ADD_FAVOR, uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, "com.taobao.taolive.room.enter", "com.taobao.taolive.room.fandom.subscribe_live_success", "com.taobao.taolive.room.good_click", uyg.EVENT_KMP_COMMENT_SEND};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.f;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    public final void p() {
        JSONObject d;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46f9bba", new Object[]{this});
            return;
        }
        LiveDetailMessinfoResponseData.AdEurlParams adEurlParams = this.e;
        if (adEurlParams != null) {
            long j2 = adEurlParams.pay_time;
            if (j2 >= 0) {
                this.c = j2;
            }
            if (this.f26708a == this.c) {
                if (this.b == null) {
                    this.b = new ls0();
                }
                String str = j;
                o3s.b(str, "1 handleAlimamaWithDelayIfNecessary, mAdEurlParams mAlimamaDelayTime = " + this.c);
                this.b.c(this.e.eurl);
                if (up6.e0(this.f) != null) {
                    this.i.K(up6.e0(this.f).pid, "click", "");
                }
                ux9 ux9Var = this.f;
                rbu.L(ux9Var, "Alimama_Click", "alimamaClickId=" + this.e.eurl);
                return;
            }
            return;
        }
        LiveDetailMessinfoResponseData.AlimamaInfo e0 = up6.e0(this.f);
        if (e0 != null) {
            long j3 = e0.pay_time;
            if (j3 >= 0) {
                this.c = j3;
            }
            if (this.f26708a == this.c) {
                if (this.b == null) {
                    this.b = new ls0();
                }
                String str2 = j;
                o3s.b(str2, "2 handleAlimamaWithDelayIfNecessary, data.pay_time = " + this.c);
                this.b.c(e0.clickid);
                this.i.K(e0.pid, "click", "");
                ux9 ux9Var2 = this.f;
                rbu.L(ux9Var2, "Alimama_Click", "alimamaClickId=" + e0.clickid);
            }
        } else if (up6.I(this.f) != null && pvs.h() && (d = fkx.d(up6.I(this.f))) != null && (integer = d.getInteger("pay_time")) != null && integer.intValue() == this.f26708a && d.getString("pay_url") != null) {
            if (this.b == null) {
                this.b = new ls0();
            }
            String str3 = j;
            o3s.b(str3, "3 handleAlimamaWithDelayIfNecessary, liveAdParams pay_time = " + integer);
            this.b.c(d.getString("pay_url"));
            this.i.K("", "click", "");
            ux9 ux9Var3 = this.f;
            rbu.L(ux9Var3, "Alimama_Click", "alimamaClickId=" + d.getString("pay_url"));
        }
    }

    public final /* synthetic */ void q(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f412615", new Object[]{this, str, jSONObject});
        } else {
            j(str, jSONObject);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        uvt uvtVar = this.g;
        if (uvtVar != null) {
            uvtVar.e();
            this.g = null;
        }
        this.f26708a = 0;
        this.h.removeCallbacksAndMessages(null);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        uvt uvtVar = this.g;
        if (uvtVar != null) {
            uvtVar.g();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        uvt uvtVar = this.g;
        if (uvtVar != null) {
            uvtVar.h();
        }
    }

    public void u(LiveDetailMessinfoResponseData.AdEurlParams adEurlParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16febce4", new Object[]{this, adEurlParams});
        } else {
            this.e = adEurlParams;
        }
    }

    public final void j(String str, JSONObject jSONObject) {
        JSONObject d;
        Integer integer;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7469341", new Object[]{this, str, jSONObject});
            return;
        }
        LiveDetailMessinfoResponseData.AlimamaInfo e0 = up6.e0(this.f);
        if (e0 != null) {
            if (this.b == null) {
                this.b = new ls0();
            }
            if (!g4.b.i.equals(str)) {
                String str3 = e0.interactiveid;
                if (TextUtils.isEmpty(str3) || up6.c0(this.f) == null || up6.c0(this.f).broadCaster == null || gq0.i() == null) {
                    o3s.b(j, "5 enter, Alimama_Interactive_urlerror: url = " + str3);
                    rbu.L(this.f, "Alimama_Interactive_urlerror", new String[0]);
                    return;
                }
                if (str3.contains("?")) {
                    str2 = str3 + "&action=" + str + "&liveId=" + up6.c0(this.f).liveId + "&userId=" + gq0.i().getUserId() + "&anchorId=" + up6.c0(this.f).broadCaster.accountId;
                } else {
                    str2 = str3 + "?action=" + str + "&liveId=" + up6.c0(this.f).liveId + "&userId=" + gq0.i().getUserId() + "&anchorId=" + up6.c0(this.f).broadCaster.accountId;
                }
                if ((to8.ADD_CART.equals(str) || to8.GOTO_DETAIL.equals(str)) && jSONObject != null) {
                    str2 = str2 + "&itemId=" + jSONObject.getString("itemId");
                }
                this.b.c(str2);
                this.i.K(e0.pid, "", str);
                rbu.L(this.f, "Alimama_Interactive", "alimamaInteractiveId=" + e0.interactiveid);
            } else if (pvs.n()) {
                m();
            } else {
                long j2 = e0.pay_time;
                if (j2 >= 0) {
                    this.c = j2;
                }
                if (this.c == 0) {
                    o3s.b(j, "4 enter, mAlimamaDelayTime = 0");
                    this.b.c(e0.clickid);
                    rbu.L(this.f, "Alimama_Click", "alimamaClickId=" + e0.clickid);
                }
            }
        } else if (up6.I(this.f) != null && pvs.h() && g4.b.i.equals(str) && (d = fkx.d(up6.I(this.f))) != null && (integer = d.getInteger("pay_time")) != null && integer.intValue() == 0 && d.getString("pay_url") != null) {
            if (this.b == null) {
                this.b = new ls0();
            }
            o3s.b(j, "6 getLiveAdParams, alimamaClickId= " + d.getString("pay_url") + ", pay_time = " + integer);
            this.b.c(d.getString("pay_url"));
            this.i.K("", "click", str);
            rbu.L(this.f, "Alimama_Click", "alimamaClickId=" + d.getString("pay_url"));
        }
    }

    @Override // tb.uvt.b
    public void onTick(long j2) {
        f9z f9zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j2)});
            return;
        }
        this.f26708a++;
        if (!pvs.n()) {
            p();
        }
        if (this.f26708a % 60 == 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stayTime", (Object) Integer.valueOf(this.f26708a));
            f("stay", jSONObject);
        }
        if (hjr.e() && (f9zVar = this.k) != null) {
            int b = f9zVar.b();
            if (this.f26708a % b == 0) {
                this.k.a(b);
            }
        }
    }

    public final void o(String[] strArr) {
        VideoInfo.AlimamaEnjoyFirst alimamaEnjoyFirst;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c671b3a", new Object[]{this, strArr});
            return;
        }
        VideoInfo c0 = up6.c0(this.f);
        if (pvs.m() && c0 != null && (alimamaEnjoyFirst = c0.alimamaEnjoyFirst) != null && (str = alimamaEnjoyFirst.eurl) != null) {
            String str3 = strArr[0];
            String str4 = strArr[1];
            String i = i(str);
            if (this.b == null) {
                this.b = new ls0();
            }
            String replaceAll = c0.alimamaEnjoyFirst.eurl.replaceAll("__INTERACT_TYPE__", to8.GOTO_DETAIL).replaceAll(bps.ITEM_ID_PLACE_HOLDER, str4).replaceAll("__TIMESTAMP__", String.valueOf(System.currentTimeMillis() / 1000));
            this.b.b(replaceAll.replaceAll("__APPINFO__", h() + "_0"), g());
            HashMap hashMap = new HashMap();
            hashMap.put("liveId", str3);
            hashMap.put("itemId", str4);
            hashMap.put("alimamaLiveId", i);
            if (TextUtils.equals(str3, i)) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            hashMap.put("isSame", str2);
            rbu.P("alimamaTcpReportCheck", hashMap);
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        if (!qvs.k() || !"com.taobao.taolive.room.good_click".equals(str) || !(obj instanceof String[])) {
            final String str2 = null;
            try {
                switch (str.hashCode()) {
                    case -1832948174:
                        if (str.equals("com.taobao.taolive.room.add_item_new")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1473773571:
                        if (str.equals(uyg.EVENT_ACTION_ADD_FAVOR)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1450449455:
                        if (str.equals(uyg.EVENT_ADD_ITEM)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -833264487:
                        if (str.equals(uyg.EVENT_KMP_COMMENT_SEND)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -830550742:
                        if (str.equals(uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -554098287:
                        if (str.equals(uyg.EVENT_ACTION_FOLLOW)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -462319263:
                        if (str.equals("com.taobao.taolive.room.addcart")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 119727352:
                        if (str.equals("com.taobao.taolive.room.enter")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 132460031:
                        if (str.equals("com.taobao.taolive.room.share")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 458859892:
                        if (str.equals("com.taobao.taolive.room.gotoDetail")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 1053794852:
                        if (str.equals("com.taobao.taolive.room.fandom.subscribe_live_success")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2061259993:
                        if (str.equals("com.taobao.taolive.room.gotoShop")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        str2 = "subscribe";
                        break;
                    case 1:
                        str2 = to8.ADD_CART;
                        jSONObject.put("itemId", obj);
                        break;
                    case 2:
                        str2 = to8.GOTO_DETAIL;
                        jSONObject.put("itemId", obj);
                        break;
                    case 3:
                        str2 = "gotoShop";
                        jSONObject.put(mop.KEY_APM_SHOP_URL, obj);
                        break;
                    case 4:
                        str2 = "addFavor";
                        if (obj != null && (obj instanceof Map)) {
                            HashMap hashMap = (HashMap) obj;
                            jSONObject.put("favorCount", hashMap.get("favorCount"));
                            jSONObject.put("totalFavorCount", hashMap.get("totalFavorCount"));
                            Integer.parseInt((String) hashMap.get("totalFavorCount"));
                            break;
                        }
                        break;
                    case 5:
                    case 6:
                        str2 = "follow";
                        jSONObject.put("accountId", obj);
                        break;
                    case 7:
                        str2 = "share";
                        break;
                    case '\b':
                    case '\t':
                        if (obj != null && (obj instanceof ChatMessage)) {
                            HashMap<String, String> hashMap2 = ((ChatMessage) obj).renders;
                            if (hashMap2 == null || !"joinMember".equals(hashMap2.get(yj4.PARAM_CHAT_RENDERS_ENHANCE))) {
                                jSONObject.put("commentContent", (Object) ((ChatMessage) obj).mContent);
                                str2 = to8.COMMENT;
                                break;
                            } else {
                                return;
                            }
                        }
                        break;
                    case '\n':
                        if (obj instanceof TaoLiveKtCommentEntity) {
                            TaoLiveKtCommentEntity taoLiveKtCommentEntity = (TaoLiveKtCommentEntity) obj;
                            if (!taoLiveKtCommentEntity.enhancedTypeValue().equals("joinMember")) {
                                jSONObject.put("commentContent", (Object) taoLiveKtCommentEntity.getContent());
                                str2 = to8.COMMENT;
                                break;
                            } else {
                                return;
                            }
                        }
                        break;
                    case 11:
                        str2 = g4.b.i;
                        n();
                        break;
                }
            } catch (Exception unused) {
            }
            f(str2, jSONObject);
            this.h.post(new Runnable() { // from class: tb.pet
                @Override // java.lang.Runnable
                public final void run() {
                    qet.this.q(str2, jSONObject);
                }
            });
            k(str2);
            return;
        }
        o((String[]) obj);
    }
}
