package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveLifeCycleEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.interact.ShareDo;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import tb.bmc;
import tb.d9m;
import tb.dpd;
import tb.jbt;
import tb.lbt;
import tb.m2g;
import tb.nqo;
import tb.pvs;
import tb.q4q;
import tb.qbt;
import tb.t2o;
import tb.tfi;
import tb.u90;
import tb.v2d;
import tb.v2s;
import tb.voj;
import tb.vvs;
import tb.w36;
import tb.x2d;
import tb.x5t;
import tb.xpd;
import tb.yj4;
import tb.yqq;
import tb.yrk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShopTwoFloorSingleRoomController extends yrk implements xpd, x2d, bmc, v2d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String i = ShopTwoFloorSingleRoomController.class.getSimpleName();
    public static boolean j;
    public boolean b;
    public Context c;
    public xpd.c d;
    public JSONObject e;
    public TaoliveOpenLiveRoom f;
    public jbt g;
    public View h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ShopLoftLifeCycle implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FragmentActivity f13151a;

        static {
            t2o.a(779092866);
        }

        public ShopLoftLifeCycle(FragmentActivity fragmentActivity) {
            this.f13151a = fragmentActivity;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onActivityFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8226c848", new Object[]{this});
                return;
            }
            x5t.h(ShopTwoFloorSingleRoomController.H(), "onActivityFinish, remove LifeCycle.");
            FragmentActivity fragmentActivity = this.f13151a;
            if (fragmentActivity != null) {
                fragmentActivity.getLifecycle().removeObserver(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements q4q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.q4q
        public void onSmallWindowClick(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
            } else {
                voj.b(ShopTwoFloorSingleRoomController.G(ShopTwoFloorSingleRoomController.this), u90.e(ShopTwoFloorSingleRoomController.F(ShopTwoFloorSingleRoomController.this).getString("id")), null, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, false);
            }
        }
    }

    static {
        t2o.a(779092864);
        t2o.a(766509126);
        t2o.a(806355736);
        t2o.a(806355733);
        t2o.a(806355734);
    }

    public static /* synthetic */ JSONObject F(ShopTwoFloorSingleRoomController shopTwoFloorSingleRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("477586d8", new Object[]{shopTwoFloorSingleRoomController});
        }
        return shopTwoFloorSingleRoomController.e;
    }

    public static /* synthetic */ Context G(ShopTwoFloorSingleRoomController shopTwoFloorSingleRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4ce1be31", new Object[]{shopTwoFloorSingleRoomController});
        }
        return shopTwoFloorSingleRoomController.c;
    }

    public static /* synthetic */ String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ Object ipc$super(ShopTwoFloorSingleRoomController shopTwoFloorSingleRoomController, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/ShopTwoFloorSingleRoomController");
    }

    @Override // tb.yrk
    public void D(String str) {
        xpd.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba11571", new Object[]{this, str});
        } else if ("close".equals(str) && (cVar = this.d) != null) {
            cVar.p(xpd.c.EVENT_ON_SHOW_BAR, null);
        }
    }

    public void J(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24dd49a", new Object[]{this, context});
            return;
        }
        HashMap hashMap = new HashMap();
        lbt lbtVar = new lbt();
        lbtVar.f(this);
        lbtVar.h(this);
        lbtVar.i(this);
        lbtVar.g(this);
        this.g = qbt.h().b(context, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString(), null, lbtVar, hashMap);
        qbt.h().g(this.g);
        this.f = qbt.h().c(this.g);
        this.h = qbt.h().d(this.g, this.f);
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6778591a", new Object[]{this});
            return;
        }
        String str = i;
        x5t.h(str, "onMockActivityOnCreate:" + this);
        L();
    }

    @Override // tb.v2d
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad806b", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.v2d
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59b963a", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.x2d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2dbcc", new Object[]{this});
            return;
        }
        xpd.c cVar = this.d;
        if (cVar != null) {
            cVar.p(xpd.c.EVENT_ON_SCROLL_ENABLE, null);
        }
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        String str = i;
        x5t.h(str, "didDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidDisappear, null);
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.f;
        if (taoliveOpenLiveRoom2 != null) {
            taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
        }
        if (nqo.d()) {
            Context context = this.c;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                ((Activity) this.c).getWindow().clearFlags(128);
            }
        }
    }

    @Override // tb.v2d
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcea941", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // tb.z2d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbec7b7", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return "Page_TaobaoLiveWatch";
    }

    @Override // tb.xpd
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom == null) {
            return null;
        }
        Object callPlatform = taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.callFetchUTArgsWithParams, new Object[0]);
        if (callPlatform instanceof Map) {
            return (Map) callPlatform;
        }
        return null;
    }

    @Override // tb.xpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.a3d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79dc178c", new Object[]{this});
        }
    }

    @Override // tb.y2d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1f44ae", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        String str = i;
        x5t.h(str, "initWithData " + this);
        this.c = context;
        this.d = cVar;
        I(jSONObject);
        this.e = jSONObject;
        if (!j) {
            K();
            j = true;
        }
        J(this.c);
    }

    @Override // tb.y2d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c610301b", new Object[]{this});
        }
    }

    @Override // tb.z2d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9880272", new Object[]{this});
        }
    }

    @Override // tb.w2d
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da11895b", new Object[]{this});
        }
    }

    @Override // tb.x2d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b00893f", new Object[]{this});
        }
    }

    @Override // tb.a3d
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab030dfb", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        x5t.h(i, "onActivityPause");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onPause, null);
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        String str = i;
        x5t.h(str, "onActivityResume: " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onResume, null);
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        x5t.h(i, "onActivityStop");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onStop, null);
        }
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // tb.x2d
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa10b06d", new Object[]{this});
            return;
        }
        xpd.c cVar = this.d;
        if (cVar != null) {
            cVar.p(xpd.c.EVENT_ON_SCROLL_DISABLE, null);
        }
    }

    @Override // tb.xpd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        }
    }

    @Override // tb.w2d
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bffdd", new Object[]{this});
        }
    }

    @Override // tb.z2d
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebae02d", new Object[]{this});
        }
    }

    @Override // tb.x2d
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0ba0ba", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // tb.v2d
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed10667", new Object[]{this, str});
        }
    }

    @Override // tb.xpd
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        String str = i;
        x5t.h(str, "willAppear " + this);
        if (this.c != null) {
            if (nqo.d()) {
                Context context = this.c;
                if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                    ((Activity) this.c).getWindow().addFlags(128);
                }
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onCreate, this.e);
                this.f.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
            }
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        String str = i;
        x5t.h(str, "willDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onWillDisappear, null);
        }
    }

    @Override // tb.yrk
    public void x(String str) {
        xpd.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56aa90f6", new Object[]{this, str});
        } else if ("close".equals(str) && (cVar = this.d) != null) {
            cVar.p(xpd.c.EVENT_ON_HIDE_BAR, null);
        }
    }

    @Override // tb.yrk
    public void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9cacc9", new Object[]{this, map});
        } else if (map != null) {
            this.b = yqq.h(map.get("isMuted"));
            if (this.d != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isMuted", (Object) Boolean.valueOf(this.b));
                this.d.p(xpd.c.EVENT_ON_MUTE_STATUS_CHANGED, jSONObject);
            }
        }
    }

    public final void I(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337a062e", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.b = yqq.h(jSONObject.getString("initMuteStatus"));
            jSONObject.put("liveId", (Object) jSONObject.getString("id"));
            if (TextUtils.isEmpty(jSONObject.getString("livesource"))) {
                jSONObject.put("livesource", "shop2F");
            }
            String string = jSONObject.getString("sellerId");
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("accountId", (Object) string);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("liveTransParams");
            if (jSONObject3 != null) {
                jSONObject.put(yj4.PARAM_IGNORE_PV, (Object) jSONObject3.getString(yj4.PARAM_IGNORE_PV));
            }
            String string2 = jSONObject.getString("itemId");
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put(yj4.PARAM_SJSD_ITEM_ID, (Object) string2);
            }
            String str = "a2141.23201685";
            jSONObject.put("spmCnt", (Object) str);
            String str2 = null;
            String string3 = (jSONObject.getJSONObject("spmParams") == null || jSONObject.getJSONObject("spmParams").getJSONObject("args") == null) ? null : jSONObject.getJSONObject("spmParams").getJSONObject("args").getString("entryBizScene");
            jSONObject.put("livePointTab3", (Object) string3);
            if ("livePointTab3".equals(string3)) {
                if (jSONObject.getString("liveShopUrl") != null) {
                    jSONObject.put("shop2fSkipTab3Url", (Object) jSONObject.getString("liveShopUrl"));
                }
                str = "a2141.b60453322";
            }
            jSONObject.put("spm", (Object) str);
            String string4 = jSONObject.getString("playerViewToken");
            if (TextUtils.isEmpty(string4) || tfi.i().m(string4)) {
                str2 = string4;
            }
            jSONObject.put("playerViewToken", (Object) str2);
            JSONObject jSONObject4 = jSONObject.getJSONObject("spmParams");
            if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("args")) != null) {
                Integer integer = jSONObject2.getInteger("cardnum");
                String string5 = jSONObject.getString(yj4.PARAM_PRODUCT_TYPE);
                if (integer != null && integer.intValue() == 0 && RecModel.MEDIA_TYPE_TIMEMOVE.equals(string5)) {
                    jSONObject.put("entryByShop2F", (Object) String.valueOf(true));
                }
            }
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5f9c86", new Object[]{this});
        } else if (!j) {
            boolean b = vvs.b("goodlist", "shopLoftCycle", true);
            if ((this.c instanceof FragmentActivity) && b) {
                x5t.h(i, "init, initUltronServerConfig.");
                ((FragmentActivity) this.c).getLifecycle().addObserver(new ShopLoftLifeCycle((FragmentActivity) this.c));
            }
            j = true;
        }
    }

    @Override // tb.xpd
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        String str = i;
        x5t.h(str, "onDestroyed " + this);
        w36.k().c();
        j = false;
        this.c = null;
        this.d = null;
        if (this.f != null) {
            x5t.f(str, "OpenArch Lifecycle👉🏻 releaseEntity");
            m2g fetchEntity = d9m.P().fetchEntity(this.f.kmpIdentifier);
            if (fetchEntity != null) {
                d9m.P().releaseEntity(fetchEntity);
            }
        }
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        String str = i;
        x5t.h(str, "didAppear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
        }
        a aVar = new a();
        HashMap hashMap = new HashMap();
        hashMap.put(DataReceiveMonitor.CB_LISTENER, aVar);
        this.f.callPlatform(PlatformListenerEnum.setSmallWindowClickListener, hashMap);
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        if (this.f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isMute", String.valueOf(z));
            this.f.callPlatform(PlatformListenerEnum.mute, hashMap);
        }
    }

    @Override // tb.xpd
    public ShareContent getShareContent() {
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        String format;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f;
        if (taoliveOpenLiveRoom != null) {
            Object callPlatform = taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.getVideoInfo, null);
            if (callPlatform instanceof VideoInfo) {
                videoInfo = (VideoInfo) callPlatform;
                if (videoInfo != null || (accountInfo = videoInfo.broadCaster) == null || videoInfo.shareUrlDO == null || !(this.c instanceof Activity)) {
                    return null;
                }
                String str2 = accountInfo.accountName;
                if (TextUtils.isEmpty(pvs.x2())) {
                    format = this.c.getString(R.string.taolive_share_live, str2, videoInfo.title);
                } else {
                    format = String.format(pvs.x2(), str2, videoInfo.title);
                }
                dpd y = v2s.o().y();
                Activity activity = (Activity) this.c;
                if (TextUtils.isEmpty(videoInfo.shareUrlDO.bgImgUrl)) {
                    str = videoInfo.coverImg;
                } else {
                    str = videoInfo.shareUrlDO.bgImgUrl;
                }
                String str3 = videoInfo.liveId;
                String str4 = videoInfo.topic;
                ShareDo shareDo = videoInfo.shareUrlDO;
                return (ShareContent) y.b(activity, format, str, str3, str4, false, shareDo.shareUrl, shareDo.shareCardUrl, "zhibo", null);
            }
        }
        videoInfo = null;
        if (videoInfo != null) {
        }
        return null;
    }
}
