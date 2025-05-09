package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBLiveDataModel f19540a;
    public final Context b;
    public final DXRootView c;
    public final ux9 d;
    public VideoInfo e;
    public String f;
    public long g;
    public d h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements njb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.njb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2feb909", new Object[]{this});
            } else if (fut.a(fut.this) == null || fut.a(fut.this).mInitParams == null || fut.b(fut.this) == null) {
                fut.c(fut.this);
            } else if (!"livePointTab3".equals(fut.a(fut.this).mInitParams.get("livePointTab3")) || !uwa.e()) {
                fut.c(fut.this);
            } else {
                String str = fut.a(fut.this).mInitParams.get("shop2fSkipTab3Url");
                if (!TextUtils.isEmpty(str)) {
                    voj.a(fut.b(fut.this), str);
                }
            }
        }

        @Override // tb.njb
        public void b() {
            VideoInfo videoInfo;
            VideoInfo.CurPreLiveInfo curPreLiveInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea821b8c", new Object[]{this});
            } else if (fut.this.e != null) {
                if (!uwa.b() || (curPreLiveInfo = (videoInfo = fut.this.e).curPreLiveInfo) == null) {
                    VideoInfo videoInfo2 = fut.this.e;
                    if (!(videoInfo2 == null || videoInfo2.latestPreLiveId == null || videoInfo2.broadCaster == null)) {
                        itd z = v2s.o().z();
                        fut futVar = fut.this;
                        String str = futVar.e.latestPreLiveId;
                        Context b = fut.b(futVar);
                        fut futVar2 = fut.this;
                        VideoInfo videoInfo3 = futVar2.e;
                        z.a(str, "tblive_siyu", "taoLiveStartNotify", b, new e(videoInfo3.latestPreLiveId, videoInfo3.broadCaster.accountId, futVar2.h));
                    }
                } else if (!(videoInfo == null || curPreLiveInfo == null || videoInfo.broadCaster == null)) {
                    itd z2 = v2s.o().z();
                    fut futVar3 = fut.this;
                    String str2 = futVar3.e.curPreLiveInfo.curPreLiveId;
                    Context b2 = fut.b(futVar3);
                    fut futVar4 = fut.this;
                    VideoInfo videoInfo4 = futVar4.e;
                    z2.a(str2, "tblive_siyu", "taoLiveStartNotify", b2, new e(videoInfo4.curPreLiveInfo.curPreLiveId, videoInfo4.broadCaster.accountId, futVar4.h));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("type", "2");
                sbu.f(fut.d(fut.this), "jiangjieintolivebottom-click", hashMap);
            }
        }

        @Override // tb.njb
        public void c() {
            VideoInfo videoInfo;
            VideoInfo.CurPreLiveInfo curPreLiveInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db1f17c5", new Object[]{this});
                return;
            }
            if (!uwa.b() || (curPreLiveInfo = (videoInfo = fut.this.e).curPreLiveInfo) == null) {
                VideoInfo videoInfo2 = fut.this.e;
                if (!(videoInfo2 == null || videoInfo2.latestPreLiveId == null || videoInfo2.broadCaster == null)) {
                    itd z = v2s.o().z();
                    fut futVar = fut.this;
                    String str = futVar.e.latestPreLiveId;
                    Context b = fut.b(futVar);
                    fut futVar2 = fut.this;
                    VideoInfo videoInfo3 = futVar2.e;
                    z.b(str, "tblive_siyu", "taoLiveStartNotify", b, new e(videoInfo3.latestPreLiveId, videoInfo3.broadCaster.accountId, futVar2.h));
                }
            } else if (!(videoInfo == null || curPreLiveInfo == null || videoInfo.broadCaster == null)) {
                itd z2 = v2s.o().z();
                fut futVar3 = fut.this;
                String str2 = futVar3.e.curPreLiveInfo.curPreLiveId;
                Context b2 = fut.b(futVar3);
                fut futVar4 = fut.this;
                VideoInfo videoInfo4 = futVar4.e;
                z2.b(str2, "tblive_siyu", "taoLiveStartNotify", b2, new e(videoInfo4.curPreLiveInfo.curPreLiveId, videoInfo4.broadCaster.accountId, futVar4.h));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", "3");
            sbu.f(fut.d(fut.this), "jiangjieintolivebottom-click", hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c590c340", new Object[]{this});
                return;
            }
            fut futVar = fut.this;
            VideoInfo videoInfo = futVar.e;
            if (videoInfo != null && videoInfo.latestPreLiveId != null) {
                fut.e(futVar, true, null, fut.d(futVar));
                Context b = fut.b(fut.this);
                s0u.a(b, "您已成功预约" + fut.this.e.broadCaster.accountName + "直播间");
            }
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5306c0d", new Object[]{this, str, str2});
                return;
            }
            fut futVar = fut.this;
            VideoInfo videoInfo = futVar.e;
            if (videoInfo != null && videoInfo.latestPreLiveId != null) {
                fut.e(futVar, false, null, fut.d(futVar));
                Context b = fut.b(fut.this);
                s0u.a(b, "您已成功取消预约" + fut.this.e.broadCaster.accountName + "直播间");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXWidgetNode f19543a;
        public final /* synthetic */ DXWidgetRefreshOption b;

        public c(DXWidgetNode dXWidgetNode, DXWidgetRefreshOption dXWidgetRefreshOption) {
            this.f19543a = dXWidgetNode;
            this.b = dXWidgetRefreshOption;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                axa.f().f16057a.I0(this.f19543a, 0, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    static {
        t2o.a(779092544);
    }

    public fut(ux9 ux9Var, TBLiveDataModel tBLiveDataModel, Context context, DXRootView dXRootView) {
        this.f19540a = tBLiveDataModel;
        this.b = context;
        this.c = dXRootView;
        this.d = ux9Var;
        n();
    }

    public static /* synthetic */ TBLiveDataModel a(fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("def5ff85", new Object[]{futVar});
        }
        return futVar.f19540a;
    }

    public static /* synthetic */ Context b(fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8d7cc143", new Object[]{futVar});
        }
        return futVar.b;
    }

    public static /* synthetic */ void c(fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298a074c", new Object[]{futVar});
        } else {
            futVar.f();
        }
    }

    public static /* synthetic */ ux9 d(fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("2d9c6551", new Object[]{futVar});
        }
        return futVar.d;
    }

    public static /* synthetic */ void e(fut futVar, boolean z, JSONObject jSONObject, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3125392", new Object[]{futVar, new Boolean(z), jSONObject, ux9Var});
        } else {
            futVar.l(z, jSONObject, ux9Var);
        }
    }

    public final void g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6a947a", new Object[]{this, jSONObject});
            return;
        }
        VideoInfo videoInfo = this.e;
        if (videoInfo == null || !"1".equals(videoInfo.roomStatus) || "0".equals(this.e.streamStatus)) {
            VideoInfo videoInfo2 = this.e;
            if (videoInfo2 != null && !"1".equals(videoInfo2.roomStatus)) {
                this.f = null;
                if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("model")) == null || !zqq.c(jSONObject2.getString("hasLivingNow")))) {
                    String string = jSONObject2.getString("livingRoomId");
                    String string2 = jSONObject2.getString("livingStreamStatus");
                    if (!TextUtils.isEmpty(string) && !"0".equals(string2)) {
                        this.f = string;
                    }
                }
                if (this.f != null) {
                    k(true, jSONObject);
                } else {
                    k(false, jSONObject);
                }
            }
        } else {
            k(true, jSONObject);
        }
    }

    public final JSONObject h(boolean z) {
        VideoInfo.CurPreLiveInfo curPreLiveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("353e5c29", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        if (!uwa.b() || (curPreLiveInfo = this.e.curPreLiveInfo) == null) {
            jSONObject.put("latestPreLiveId", (Object) this.e.latestPreLiveId);
            jSONObject.put("latestPreLiveStartTimeDesc", (Object) this.e.latestPreLiveStartTimeDesc);
            jSONObject.put("preUserSubscribe", (Object) Boolean.valueOf(z));
        } else {
            jSONObject.put("latestPreLiveId", (Object) curPreLiveInfo.curPreLiveId);
            jSONObject.put("latestPreLiveStartTimeDesc", (Object) this.e.curPreLiveInfo.curPreLiveStartTimeDesc);
            jSONObject.put("preUserSubscribe", (Object) Boolean.valueOf(z));
        }
        return jSONObject;
    }

    public void i(boolean z) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773a7b34", new Object[]{this, new Boolean(z)});
            return;
        }
        DXRootView dXRootView = this.c;
        if (dXRootView != null && (data = dXRootView.getData()) != null) {
            data.put("enableMuteAbility", (Object) Boolean.valueOf(z));
            DXRootView dXRootView2 = this.c;
            if (dXRootView2 != null && dXRootView2.getExpandWidgetNode() != null) {
                p(this.c.getExpandWidgetNode().queryWidgetNodeByUserId("highlightBottomLayout"));
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abeaba40", new Object[]{this});
            return;
        }
        dxa.b(this.d).t(new a());
        this.h = new b();
    }

    public final void k(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a3d5d", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        DXRootView dXRootView = this.c;
        if (dXRootView != null) {
            if (jSONObject == null) {
                jSONObject = dXRootView.getData();
            }
            if (jSONObject != null) {
                jSONObject.put("isLiving", (Object) Boolean.valueOf(z));
                DXRootView dXRootView2 = this.c;
                if (!(dXRootView2 == null || dXRootView2.getExpandWidgetNode() == null)) {
                    p(this.c.getExpandWidgetNode().queryWidgetNodeByUserId("liveroomStatusTip"));
                }
            }
            if (o()) {
                sbu.k(this.d, "Page_TaobaoLiveWatch_Show-Timeshiftintolive", null);
            }
        }
    }

    public final void l(boolean z, JSONObject jSONObject, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1a766f", new Object[]{this, new Boolean(z), jSONObject, ux9Var});
            return;
        }
        DXRootView dXRootView = this.c;
        if (dXRootView != null && this.e != null) {
            if (jSONObject == null) {
                jSONObject = dXRootView.getData();
            }
            if (jSONObject != null) {
                jSONObject.put("highlightLastPreLiveInfo", (Object) h(z));
                DXRootView dXRootView2 = this.c;
                if (!(dXRootView2 == null || dXRootView2.getExpandWidgetNode() == null)) {
                    DXWidgetNode queryWidgetNodeByUserId = this.c.getExpandWidgetNode().queryWidgetNodeByUserId("liveroomStatusTip");
                    String str = this.c.getDxTemplateItem().f7343a;
                    if (queryWidgetNodeByUserId != null) {
                        p(queryWidgetNodeByUserId);
                    } else if ("highlight_room_status_action".equals(str)) {
                        axa.f().h(this.c, (JSONObject) jSONObject.clone(), ux9Var);
                    }
                }
            }
            if (ux9Var != null && ux9Var.f && ux9Var.h() != null) {
                ux9Var.h().e(uyg.EVENT_HIGHLIGHT_SUBSCRIBE_CALLBACK_EVENT, h(z));
            }
        }
    }

    public JSONObject m(JSONObject jSONObject) {
        VideoInfo.CurPreLiveInfo curPreLiveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("30bc5e2a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        VideoInfo videoInfo = this.e;
        if (videoInfo != null) {
            jSONObject.put("goodsNumber", (Object) String.valueOf(videoInfo.curItemNum));
            LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = this.e.timeMovingPlayInfo;
            if (timeMovingPlayInfo == null || TextUtils.isEmpty(timeMovingPlayInfo.liveGuideTxt)) {
                jSONObject.put("liveGuideTxt", "直播间抢购中");
            } else {
                jSONObject.put("liveGuideTxt", (Object) this.e.timeMovingPlayInfo.liveGuideTxt);
            }
            jSONObject.put("enableMuteAbility", (Object) Boolean.valueOf(bte.b(this.d)));
            boolean z = this.e.latestPreUserSubscribe;
            if (uwa.b() && (curPreLiveInfo = this.e.curPreLiveInfo) != null) {
                z = curPreLiveInfo.curPreUserSubscribe;
            }
            l(z, jSONObject, this.d);
            g(jSONObject);
        }
        return jSONObject;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        this.g = System.currentTimeMillis();
        VideoInfo e2 = cxg.e(this.f19540a);
        this.e = e2;
        if (e2 != null) {
            j();
        }
    }

    public void p(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a1562b", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            new Handler().postDelayed(new c(dXWidgetNode, new DXWidgetRefreshOption.a().c(2).d(true).g(true).a()), 100L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements jtd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19544a;
        public final String b;
        public final d c;

        static {
            t2o.a(779092549);
            t2o.a(806355938);
        }

        public e(String str, String str2, d dVar) {
            this.f19544a = str;
            this.b = str2;
            this.c = dVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            }
        }

        public void c(nuq nuqVar) {
            List<ouq> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bddf6e5a", new Object[]{this, nuqVar});
            } else if (nuqVar == null || zqq.a(nuqVar.a())) {
                s0u.a(fut.b(fut.this), "订阅失败");
            } else if ("SUCCESS".equals(nuqVar.a()) && (b = nuqVar.b()) != null) {
                for (int i = 0; i < b.size(); i++) {
                    ouq ouqVar = b.get(i);
                    if (!zqq.a(ouqVar.b()) && ouqVar.b().equals(this.f19544a) && "1".equals(ouqVar.a())) {
                        d dVar = this.c;
                        if (dVar != null) {
                            ((b) dVar).a();
                            return;
                        }
                        return;
                    } else if (!zqq.a(ouqVar.b()) && ouqVar.b().equals(this.f19544a) && "0".equals(ouqVar.a())) {
                        d dVar2 = this.c;
                        if (dVar2 != null) {
                            ((b) dVar2).b(this.f19544a, this.b);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e3d355", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.e;
        if (videoInfo != null && videoInfo.broadCaster != null) {
            dxa b2 = dxa.b(this.d);
            if ("1".equals(this.e.roomStatus)) {
                HashMap hashMap = new HashMap();
                VideoInfo videoInfo2 = this.e;
                if (videoInfo2 != null) {
                    AccountInfo accountInfo = videoInfo2.broadCaster;
                    if (accountInfo != null) {
                        hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
                    }
                    hashMap.put("feed_id", this.e.liveId);
                }
                hashMap.put("istimeshift", "1");
                hashMap.put("duration", (System.currentTimeMillis() - this.g) + "");
                ux9 ux9Var = this.d;
                if ((ux9Var instanceof air) && ((air) ux9Var).g() != null) {
                    hashMap.put("item_id", ((air) this.d).g().P());
                }
                hashMap.put("click_time", Long.toString(System.currentTimeMillis()));
                hashMap.put("type", "1");
                sbu.f(this.d, "Gotolive", hashMap);
                s0u.a(this.b, "正在传送到直播中状态...");
                if (b2.f() != null) {
                    b2.f().j(this.d, null);
                }
                sbu.f(this.d, "jiangjieintolivebottom-click", hashMap);
            } else if (!TextUtils.isEmpty(this.f) && b2.f() != null) {
                b2.f().c(this.d, this.f);
                sbu.g(this.d, "PlaybackToLive", new String[0]);
            }
        }
    }

    public final boolean o() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be223a5d", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.f19540a;
        if (tBLiveDataModel == null || (map = tBLiveDataModel.mInitParams) == null) {
            return false;
        }
        return TextUtils.equals(map.get(yj4.PARAM_IS_FIRST_ENTER), "true");
    }
}
