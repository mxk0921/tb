package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveLifeCycleEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.bmc;
import tb.d4s;
import tb.dzd;
import tb.giv;
import tb.jbt;
import tb.lbt;
import tb.nqo;
import tb.nwv;
import tb.o3s;
import tb.qbt;
import tb.r6t;
import tb.s3c;
import tb.sjr;
import tb.sxk;
import tb.t2o;
import tb.tbt;
import tb.v2d;
import tb.x2d;
import tb.yj4;
import tb.yqq;
import tb.yrk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLVOpenShopCardComponent extends yrk implements x2d, bmc, v2d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String l = TBLVOpenShopCardComponent.class.getSimpleName();
    public final Context b;
    public d c;
    public TaoliveOpenLiveRoom d;
    public final JSONObject e;
    public boolean f;
    public float g;
    public String h;
    public final dzd i = new a();
    public final s3c j = new b();
    public View k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TBLVOpenShopCardComponentClickType {
        DEFAULT(0),
        GOODS_CARD(1);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int value;

        TBLVOpenShopCardComponentClickType(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(TBLVOpenShopCardComponentClickType tBLVOpenShopCardComponentClickType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/TBLVOpenShopCardComponent$TBLVOpenShopCardComponentClickType");
        }

        public static TBLVOpenShopCardComponentClickType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLVOpenShopCardComponentClickType) ipChange.ipc$dispatch("eb705417", new Object[]{str});
            }
            return (TBLVOpenShopCardComponentClickType) Enum.valueOf(TBLVOpenShopCardComponentClickType.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements dzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dzd
        public Float f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("9548d518", new Object[]{this});
            }
            return Float.valueOf(0.0f);
        }

        @Override // tb.dzd
        public Float l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("6afaae6e", new Object[]{this});
            }
            return Float.valueOf(TBLVOpenShopCardComponent.F(TBLVOpenShopCardComponent.this));
        }

        @Override // tb.dzd
        public View m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("fda446e1", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements s3c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.s3c
        public String bizCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
            }
            return "TBLVOpenShopCardComponent";
        }

        @Override // tb.s3c
        public String[] observeEvents() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
            }
            return new String[]{"com.taobao.taolive.goods.pop.card.click", "com.taobao.taolive.room.live.end.without.replay"};
        }

        @Override // tb.s3c
        public String observeUniqueIdentification() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
            }
            return TBLVOpenShopCardComponent.J(TBLVOpenShopCardComponent.this);
        }

        @Override // tb.s3c
        public void onEvent(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
                return;
            }
            str.hashCode();
            if (!str.equals("com.taobao.taolive.room.live.end.without.replay")) {
                if (str.equals("com.taobao.taolive.goods.pop.card.click")) {
                    TBLVOpenShopCardComponent.G(TBLVOpenShopCardComponent.this, obj);
                }
            } else if (TBLVOpenShopCardComponent.H(TBLVOpenShopCardComponent.this) != null) {
                o3s.b(TBLVOpenShopCardComponent.I(), "playerDidEnd live end without replay");
                TBLVOpenShopCardComponent.H(TBLVOpenShopCardComponent.this).c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements r6t {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13155a;
        public final /* synthetic */ View b;

        public c(TBLVOpenShopCardComponent tBLVOpenShopCardComponent, String str, View view) {
            this.f13155a = str;
            this.b = view;
        }

        @Override // tb.r6t
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5c4ec32", new Object[]{this});
                return;
            }
            sjr.g().c("taolive.more.live.status", "VISIBLE", this.f13155a);
            View view = this.b;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @Override // tb.r6t
        public ArrayList c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("c9056293", new Object[]{this});
            }
            return null;
        }

        @Override // tb.r6t
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a03b43f7", new Object[]{this});
                return;
            }
            sjr.g().c("taolive.more.live.status", "GONE", this.f13155a);
            View view = this.b;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void a(TBLVOpenShopCardComponentClickType tBLVOpenShopCardComponentClickType, Map<String, Object> map);

        void b();

        void c();

        void d();
    }

    static {
        t2o.a(779092870);
        t2o.a(806355736);
        t2o.a(806355733);
        t2o.a(806355734);
    }

    public TBLVOpenShopCardComponent(Context context, Map map) {
        o3s.b(l, "init " + map.toString());
        this.b = context;
        this.e = new JSONObject(map);
        Q(context);
    }

    public static /* synthetic */ float F(TBLVOpenShopCardComponent tBLVOpenShopCardComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("478a1abe", new Object[]{tBLVOpenShopCardComponent})).floatValue();
        }
        return tBLVOpenShopCardComponent.g;
    }

    public static /* synthetic */ void G(TBLVOpenShopCardComponent tBLVOpenShopCardComponent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db14a09", new Object[]{tBLVOpenShopCardComponent, obj});
        } else {
            tBLVOpenShopCardComponent.P(obj);
        }
    }

    public static /* synthetic */ d H(TBLVOpenShopCardComponent tBLVOpenShopCardComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b35bacab", new Object[]{tBLVOpenShopCardComponent});
        }
        return tBLVOpenShopCardComponent.c;
    }

    public static /* synthetic */ String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
        }
        return l;
    }

    public static /* synthetic */ String J(TBLVOpenShopCardComponent tBLVOpenShopCardComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f675496", new Object[]{tBLVOpenShopCardComponent});
        }
        return tBLVOpenShopCardComponent.h;
    }

    public static /* synthetic */ Object ipc$super(TBLVOpenShopCardComponent tBLVOpenShopCardComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/TBLVOpenShopCardComponent");
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7e2388", new Object[]{this});
            return;
        }
        String str = l;
        o3s.b(str, "didDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidDisappear, null);
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.d;
        if (taoliveOpenLiveRoom2 != null) {
            taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
        }
        sjr.g().b(this.j);
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b21d76b", new Object[]{this});
            return;
        }
        String str = l;
        o3s.b(str, "willAppear " + this);
        if (this.b != null) {
            if (nqo.d()) {
                Context context = this.b;
                if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                    ((Activity) this.b).getWindow().addFlags(128);
                }
            }
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
            if (taoliveOpenLiveRoom != null) {
                taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onCreate, this.e);
                this.d.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
            }
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4f8c7b", new Object[]{this});
            return;
        }
        String str = l;
        o3s.b(str, "willDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onWillDisappear, null);
        }
    }

    public final void O(JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5500f397", new Object[]{this, jSONObject, map});
            return;
        }
        if (jSONObject != null) {
            try {
                this.f = yqq.h(jSONObject.getString("initMuteStatus"));
                this.g = jSONObject.getFloat("shopBottomOffset").floatValue();
                this.e.put(yj4.PARAM_IS_LIVE_MUTE, (Object) Boolean.valueOf(this.f));
                map.put("shopCardDisableComment", jSONObject.getString("shopCardDisableComment"));
                map.put("shopCardDisableGoodsCard", jSONObject.getString("shopCardDisableGoodsCard"));
            } catch (Exception e) {
                String str = l;
                o3s.b(str, "fixParams 参数解析失败" + e.getMessage());
                e.printStackTrace();
                return;
            }
        }
        map.put("OpenWatchType", "shop2F");
        map.put("enableReplayStatusShowLiveEnd", "true");
    }

    public final void P(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a33c07", new Object[]{this, obj});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (this.c != null) {
                String string = jSONObject.getString("itemId");
                String str = l;
                o3s.b(str, "click good itemId:" + string);
                this.c.a(TBLVOpenShopCardComponentClickType.GOODS_CARD, jSONObject);
            }
        }
    }

    public final void Q(Context context) {
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
        O(this.e, hashMap);
        jbt b2 = qbt.h().b(context, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString(), this.i, lbtVar, hashMap);
        qbt.h().g(b2);
        this.d = qbt.h().c(b2);
        this.k = qbt.h().d(b2, this.d);
        this.h = b2.hashCode() + "_" + System.currentTimeMillis() + new Random().nextInt(1000);
        if (d4s.e("enableShopMoreLiveListener", true)) {
            R();
        }
    }

    public final void R() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f23baff", new Object[]{this});
            return;
        }
        View findViewById = this.k.findViewById(R.id.btn_close);
        if (findViewById != null) {
            if (giv.d() == null || giv.d().c() == null) {
                str = null;
            } else {
                str = giv.d().c().C();
            }
            tbt.c().l(new c(this, str, findViewById));
        }
    }

    public void S(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41178ea1", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
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
        }
    }

    @Override // tb.v2d
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcea941", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = l;
        o3s.b(str, "onClickCleanScreen " + z);
        d dVar = this.c;
        if (dVar != null) {
            dVar.a(TBLVOpenShopCardComponentClickType.DEFAULT, null);
        }
    }

    @Override // tb.z2d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbec7b7", new Object[]{this});
        }
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.k;
    }

    @Override // tb.a3d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79dc178c", new Object[]{this});
            return;
        }
        String str = l;
        o3s.b(str, "liveRoomUserLeave " + this);
        d dVar = this.c;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // tb.y2d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1f44ae", new Object[]{this});
            return;
        }
        String str = l;
        o3s.b(str, "playerError " + this);
        d dVar = this.c;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // tb.y2d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c610301b", new Object[]{this});
            return;
        }
        String str = l;
        o3s.b(str, "playerFirstFrameRender " + this);
        d dVar = this.c;
        if (dVar != null) {
            dVar.b();
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
            return;
        }
        String str = l;
        o3s.b(str, "liveRoomEnd " + this);
        d dVar = this.c;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // tb.x2d
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa10b06d", new Object[]{this});
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

    @Override // tb.v2d
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed10667", new Object[]{this, str});
        }
    }

    @Override // tb.yrk
    public void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9cacc9", new Object[]{this, map});
        }
    }

    public static Map customizedPluginMap(Map map, Map map2) {
        sxk sxkVar;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("979c6744", new Object[]{map, map2});
        }
        if (map == null) {
            map = new HashMap();
        }
        Object obj2 = map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent);
        if ((obj2 instanceof sxk) && (obj = (sxkVar = (sxk) obj2).c) != null) {
            boolean o = nwv.o(map2.get("shopCardDisableGoodsCard"), false);
            boolean o2 = nwv.o(map2.get("shopCardDisableComment"), false);
            JSONObject parseObject = JSON.parseObject((String) obj);
            JSONArray jSONArray = parseObject.getJSONArray("cList");
            for (int i = 0; jSONArray != null && i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("cName");
                if (string.equals(ComponentGroupConfig.GROUP_LEFT_BOTTOM) && o2) {
                    jSONObject.put("cList", (Object) new JSONArray());
                }
                if (string.equals(ComponentGroupConfig.GROUP_RIGHT_BOTTOM) && o) {
                    jSONObject.put("cList", (Object) new JSONArray());
                }
            }
            sxkVar.c = parseObject.toJSONString();
        }
        return map;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be0637e", new Object[]{this});
            return;
        }
        String str = l;
        o3s.b(str, "didAppear " + this);
        sjr.g().a(this.j);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
            if (d4s.e("enableCompensateShopMute", true)) {
                HashMap hashMap = new HashMap();
                hashMap.put("isMute", String.valueOf(this.f));
                this.d.callPlatform(PlatformListenerEnum.mute, hashMap);
            }
        }
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97583b0", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = l;
        o3s.b(str, "setLiveMuted " + z);
        if (this.d != null) {
            this.f = z;
            HashMap hashMap = new HashMap();
            hashMap.put("isMute", String.valueOf(z));
            this.d.callPlatform(PlatformListenerEnum.mute, hashMap);
        }
    }
}
