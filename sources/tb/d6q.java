package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.login4android.api.Login;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d6q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APP_NAME = "SmartLandingAppName";
    public static final String KEY_FOLLOW_STATUS = "followStatus";
    public static final String KEY_TAOLIVEOPENBIZCODE = "TaoLiveOpenBizCode";

    /* renamed from: a  reason: collision with root package name */
    public final cba f17624a;
    public final Context b;
    public ISmartLandingProxy.b c;

    static {
        t2o.a(779092867);
    }

    public d6q(cba cbaVar, Context context) {
        this.f17624a = cbaVar;
        this.b = context;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee4ed7b", new Object[]{this, str, str2});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar != null) {
            bVar.f(str, str2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar != null) {
            bVar.destroy();
            this.c = null;
        }
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("51abd7da", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entrySpm", (Object) iba.r(this.f17624a));
        jSONObject.put("isPad", (Object) Boolean.valueOf(vc.i(this.b)));
        jSONObject.put("isFoldDevice", (Object) Boolean.valueOf(vc.d(this.b)));
        jSONObject.put("switchIndex", (Object) Long.valueOf(iba.I(this.f17624a)));
        return jSONObject;
    }

    public void e(boolean z, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d30d86", new Object[]{this, new Boolean(z), str, str2, str3, str4, str5});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar != null) {
            bVar.b(z, str, str2, str3, str4, str5, c());
            this.c.g(g4.b.i, null);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        ISmartLandingProxy.b bVar = this.c;
        if (bVar != null) {
            bVar.onExit();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ISmartLandingProxy.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(d6q d6qVar) {
        }

        @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.e
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
            }
        }

        @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.e
        public boolean a(Context context, String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("96ed61f9", new Object[]{this, context, str, str2, str3, jSONObject})).booleanValue();
            }
            if (TextUtils.equals("alive", str3)) {
                ux9 d = vx9.d();
                if (d instanceof t54) {
                    t54 t54Var = (t54) d;
                    if (t54Var.z0() != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("actionData", jSONObject);
                        t54Var.z0().v("TBLiveWVPlugin.Event.smartLanding", hashMap);
                    }
                }
                return true;
            } else if (!TextUtils.equals("event", str3)) {
                return false;
            } else {
                ux9 d2 = vx9.d();
                if (!(jSONObject == null || d2 == null)) {
                    String string = jSONObject.getString("actionEvent");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("behavior", (Object) str);
                    jSONObject2.put("popId", (Object) str2);
                    jSONObject2.put("actionData", (Object) jSONObject);
                    f3c h = d2.h();
                    h.e("smartlanding_event_" + string, jSONObject2);
                }
                return true;
            }
        }
    }

    public void g(Object obj) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d13202", new Object[]{this, obj});
        } else if (obj instanceof TBLiveDataModel) {
            ux9 d = vx9.d();
            TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
            a("userId", Login.getUserId());
            a("showLiveShopEntry", String.valueOf(false));
            a("enableDoubleClickFav", String.valueOf(up6.B0(d)));
            cba cbaVar = this.f17624a;
            if (cbaVar != null) {
                a("enableZoomLiveRoom", String.valueOf(cbaVar.k().j2()));
            }
            a("switchIndex", String.valueOf(up6.W(d)));
            a("isUp", String.valueOf(up6.G(d)));
            String w = up6.w(d);
            a("entrySpm", String.valueOf(w));
            if (!TextUtils.isEmpty(w) && (split = w.split("\\.")) != null && split.length >= 2) {
                a("entrySpmAB", split[0] + "." + split[1]);
            }
            a(yj4.PARAM_ENTRY_SOURCE, String.valueOf(up6.r(d)));
            a(smh.entryQuery, String.valueOf(up6.t(d)));
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            if (videoInfo != null) {
                a("liveId", videoInfo.liveId);
                a("roomStatus", videoInfo.roomStatus);
                a("isMember", String.valueOf(videoInfo.shopVip));
                AccountInfo accountInfo = videoInfo.broadCaster;
                if (accountInfo != null) {
                    a(RequestConfig.KEY_ANCHOR_ID, accountInfo.accountId);
                    if ("shop".equalsIgnoreCase(videoInfo.broadCaster.type)) {
                        a("accountType", "1");
                    } else {
                        a("accountType", "2");
                    }
                    a("headImg", videoInfo.broadCaster.headImg);
                    a("accountName", videoInfo.broadCaster.accountName);
                    a("followStatus", String.valueOf(videoInfo.broadCaster.follow));
                }
            }
        }
    }

    public void d(String str, String str2, String str3, String str4) {
        jbt jbtVar;
        Map<String, Object> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cf61ed", new Object[]{this, str, str2, str3, str4});
            return;
        }
        cba cbaVar = this.f17624a;
        if (cbaVar != null) {
            String valueOf = (!(cbaVar.r() instanceof ATaoLiveOpenEntity) || (jbtVar = ((ATaoLiveOpenEntity) this.f17624a.r()).taoliveOpenContext) == null || (map = jbtVar.f) == null || (obj = map.get("aliveChanel")) == null) ? null : String.valueOf(obj);
            a aVar = new a(this);
            ISmartLandingProxy.c n = znm.k().n();
            sj9.D("createSmartLanding " + n);
            if (n != null) {
                this.c = d9m.E().createSmartLanding(this.b, n, aVar);
            } else {
                this.c = d9m.E().createSmartLanding(this.b, "liveRoomPage", valueOf, str2, str2, str3, str4, str, c(), aVar);
            }
            this.f17624a.u = this.c;
            if (pvs.q1()) {
                String generateLiveContextKey = OpenSingleViewController.generateLiveContextKey(this.f17624a, str3, str4);
                znm.k().u(generateLiveContextKey);
                this.c.m(generateLiveContextKey);
            }
        }
    }
}
