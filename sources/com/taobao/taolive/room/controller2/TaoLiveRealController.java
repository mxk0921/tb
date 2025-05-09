package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.ChatRecyclerView2;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.nav.Nav;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.lpm_android.event.LpmEventType;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.business.common.GoodItem;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.mediaplatform.service.monitor.AdMonitorBusiness;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.room.utils.RRoomProxy;
import com.taobao.taolive.room.widget.RightDrawerLayout;
import com.taobao.taolive.sdk.business.InteractBusiness;
import com.taobao.taolive.sdk.controller.BaseListAdapter;
import com.taobao.taolive.sdk.controller.BaseListAdapterV2;
import com.taobao.taolive.sdk.controller.BaseListController;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.controller.TaoLiveLayoutManager;
import com.taobao.taolive.sdk.controller.TaoLiveRecyclerView;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.ContentType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.LiveCommonTipsMsg;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.uc.webview.export.media.CommandID;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import tb.a4u;
import tb.agj;
import tb.air;
import tb.azd;
import tb.bia;
import tb.bl9;
import tb.bte;
import tb.cba;
import tb.cdr;
import tb.cir;
import tb.cwd;
import tb.cxg;
import tb.d6q;
import tb.d9m;
import tb.dba;
import tb.du4;
import tb.e51;
import tb.e7w;
import tb.f9f;
import tb.fkx;
import tb.g9c;
import tb.gmr;
import tb.gq0;
import tb.hjr;
import tb.hnr;
import tb.hw0;
import tb.i0m;
import tb.iba;
import tb.ibt;
import tb.iws;
import tb.j5m;
import tb.jbt;
import tb.jyd;
import tb.k0r;
import tb.kmr;
import tb.kyt;
import tb.ls0;
import tb.m09;
import tb.mcd;
import tb.mgj;
import tb.muk;
import tb.mxf;
import tb.mxg;
import tb.myb;
import tb.naj;
import tb.nkr;
import tb.nqo;
import tb.nxq;
import tb.o3s;
import tb.o6t;
import tb.p6t;
import tb.phr;
import tb.ppv;
import tb.pvs;
import tb.q0j;
import tb.q6q;
import tb.qmh;
import tb.qt9;
import tb.qvs;
import tb.r4p;
import tb.r6t;
import tb.rbu;
import tb.rc;
import tb.rir;
import tb.rnv;
import tb.s3c;
import tb.scw;
import tb.sj9;
import tb.sjr;
import tb.slq;
import tb.sqj;
import tb.sr4;
import tb.sya;
import tb.t0u;
import tb.t2o;
import tb.tbt;
import tb.tcd;
import tb.tfi;
import tb.tz3;
import tb.u0u;
import tb.u0v;
import tb.u7e;
import tb.u90;
import tb.ufi;
import tb.up6;
import tb.utk;
import tb.uwa;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.v3d;
import tb.v60;
import tb.vc;
import tb.vgb;
import tb.voj;
import tb.vx9;
import tb.w36;
import tb.w44;
import tb.w54;
import tb.wir;
import tb.x3d;
import tb.x5t;
import tb.xbf;
import tb.xca;
import tb.xda;
import tb.xfj;
import tb.y3s;
import tb.yfd;
import tb.yh6;
import tb.yir;
import tb.yj4;
import tb.ylr;
import tb.yqq;
import tb.z3s;
import tb.z9u;
import tb.zlr;
import tb.znm;
import tb.zrm;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveRealController extends BaseListController implements jyd, s3c, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String B0;
    public kmr A;
    public boolean A0;
    public yir B;
    public HashMap<String, String> C;
    public long D;
    public sjr F;
    public int G;
    public String H;
    public GoodItem O;
    public Activity Q;
    public ViewGroup R;
    public Map<String, String> S;
    public Map<String, String> T;
    public long V;
    public boolean W;
    public boolean X;
    public naj Y;
    public Uri Z;
    public final cba a0;
    public IBottomProxy.a b0;
    public iws c0;
    public s3c d0;
    public myb e0;
    public String f0;
    public x3d g0;
    public d6q h0;
    public AdMonitorBusiness i0;
    public v3d j0;
    public View m0;
    public String n;
    public ISmallWindowStrategy n0;
    public String o;
    public u0v o0;
    public JSONObject p;
    public String p0;
    public String q;
    public String r;
    public mcd r0;
    public String s;
    public String t;
    public utk t0;
    public String u;
    public View.OnClickListener u0;
    public String v;
    public View.OnClickListener v0;
    public String w;
    public muk w0;
    public String x;
    public y3s x0;
    public String y;
    public int y0;
    public boolean z0;
    public boolean z = false;
    public long E = 0;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean L = false;
    public int M = 0;
    public WindowInsets N = null;
    public int P = 0;
    public String U = null;
    public final BroadcastReceiver l0 = new BroadcastReceiver() { // from class: com.taobao.taolive.room.controller2.TaoLiveRealController.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/TaoLiveRealController$5");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TextUtils.equals(intent.getAction(), "com.taobao.live.room.init")) {
                String stringExtra = intent.getStringExtra("force");
                long intExtra = intent.getIntExtra("seqId", -1);
                if (TaoLiveRealController.l0() == null) {
                    return;
                }
                if ((intExtra != -1 && intExtra != TaoLiveRealController.G(TaoLiveRealController.this)) || "true".equals(stringExtra)) {
                    TaoLiveRealController.I(TaoLiveRealController.this, "true".equals(stringExtra));
                    TaoLiveRealController.C(TaoLiveRealController.this).y = true;
                    TaoLiveRealController.K(TaoLiveRealController.this, true);
                }
            }
        }
    };
    public boolean q0 = false;
    public boolean s0 = false;
    public boolean k0 = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements g9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.room.controller2.TaoLiveRealController$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0751a implements ISmartLandingProxy.d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SimpleVideoInfo f13159a;

            public C0751a(SimpleVideoInfo simpleVideoInfo) {
                this.f13159a = simpleVideoInfo;
            }

            @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
            public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
                }
                o3s.b("TaoLiveRealController", "SmartLanding preloadSmartLayerWithBizId onTaskActionListener popId " + str2 + " actionData " + jSONObject);
                if (jSONObject != null) {
                    String string = jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                    String string2 = jSONObject.getString("smartBizId");
                    String string3 = jSONObject.getString("benefitType");
                    ViewGroup viewGroup = TaoLiveRealController.F(TaoLiveRealController.this) != null ? (ViewGroup) TaoLiveRealController.F(TaoLiveRealController.this).findViewById(R.id.taolive_open_popview_frame) : null;
                    if (viewGroup == null) {
                        viewGroup = iba.c(TaoLiveRealController.W(TaoLiveRealController.this), TaoLiveRealController.C(TaoLiveRealController.this));
                        sj9.D("SmartLayer preloadSmartLayerWithBizId layout findGlobalLayoutPad");
                    }
                    if (viewGroup == null && TaoLiveRealController.W(TaoLiveRealController.this).getWindow() != null) {
                        viewGroup = (ViewGroup) TaoLiveRealController.W(TaoLiveRealController.this).getWindow().getDecorView();
                        sj9.D("SmartLayer preloadSmartLayerWithBizId layout DecorView");
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put(yj4.PARAM_FANDOM_INTERACTTYPE, string3);
                    hashMap.put(yh6.CONFIG_KEY_TEMPLATE_NAME, string);
                    hashMap.put("popId", str2);
                    if (((dba) TaoLiveRealController.C(TaoLiveRealController.this)).k0 != null) {
                        sj9.D("SmartLayer preloadSmartLayerWithBizId " + string2);
                        ((dba) TaoLiveRealController.C(TaoLiveRealController.this)).k0.i(string2, hashMap, q6q.a(TaoLiveRealController.W(TaoLiveRealController.this), TaoLiveRealController.C(TaoLiveRealController.this), this.f13159a, jSONObject, TaoLiveRealController.f0(TaoLiveRealController.this)), TaoLiveRealController.W(TaoLiveRealController.this), viewGroup, new q6q.a(TaoLiveRealController.C(TaoLiveRealController.this), str, str2));
                    }
                }
                return true;
            }
        }

        public a() {
        }

        @Override // tb.g9c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b48357", new Object[]{this});
            }
        }

        @Override // tb.g9c
        public void b(SimpleVideoInfo simpleVideoInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e066f337", new Object[]{this, simpleVideoInfo});
            } else if (simpleVideoInfo != null && !TextUtils.isEmpty(simpleVideoInfo.accountId) && !TextUtils.isEmpty(simpleVideoInfo.liveId) && TaoLiveRealController.C(TaoLiveRealController.this) != null && TaoLiveRealController.C(TaoLiveRealController.this).u != null && ((dba) TaoLiveRealController.C(TaoLiveRealController.this)).k0 != null && d9m.F() != null) {
                sj9.D("SmartLayer onGetVideoInfoSuccess ");
                ((dba) TaoLiveRealController.C(TaoLiveRealController.this)).k0.j(true);
                TaoLiveRealController.C(TaoLiveRealController.this).u.j(false, "dx_smart", new C0751a(simpleVideoInfo));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomSheetDialogFragment f13160a;
        public final /* synthetic */ FragmentActivity b;

        public b(BottomSheetDialogFragment bottomSheetDialogFragment, FragmentActivity fragmentActivity) {
            this.f13160a = bottomSheetDialogFragment;
            this.b = fragmentActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f13160a.show(this.b.getSupportFragmentManager(), "TaoLiveWebBottomFragment_waitou");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TaoLiveRealController.X(TaoLiveRealController.this, view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13162a;

        public d(int i) {
            this.f13162a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TaoLiveRealController.j0(TaoLiveRealController.this).q(this.f13162a);
            TaoLiveRealController.Y(TaoLiveRealController.this, this.f13162a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e extends tcd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f13163a;

        public e(Map map) {
            this.f13163a = map;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1812687920) {
                super.f(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode == -790391893) {
                super.onSuccess();
                return null;
            } else if (hashCode == 1634465643) {
                super.g((mcd) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/controller2/TaoLiveRealController$13");
            }
        }

        @Override // tb.tcd, tb.scd
        public void e(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97b6435a", new Object[]{this, viewGroup});
            } else if (viewGroup != null) {
                o3s.b("TaoLiveRealController", "BottomSlideNewGuide 创建播放器 onAddVideoFrame()");
                if (TaoLiveRealController.F(TaoLiveRealController.this) != null) {
                    TaoLiveRealController.F(TaoLiveRealController.this).addView(viewGroup, 1, 1);
                    viewGroup.setTag("bottomSlideNewGuideMediaView");
                }
                sjr.g().c(uyg.f29673a, this.f13163a, TaoLiveRealController.this.observeUniqueIdentification());
            }
        }

        @Override // tb.tcd, tb.scd
        public void f(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93f493d0", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.f(i, i2);
            o3s.b("TaoLiveRealController", "BottomSlideNewGuide 播放器onError code: " + i + " extra: " + i2);
            if (TaoLiveRealController.C(TaoLiveRealController.this) != null && TaoLiveRealController.C(TaoLiveRealController.this).d()) {
                sjr.g().c(uyg.d, MonitorMediaPlayer.mornitorPlayerError, TaoLiveRealController.this.observeUniqueIdentification());
            }
        }

        @Override // tb.tcd, tb.scd
        public void g(mcd mcdVar) {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616bf76b", new Object[]{this, mcdVar});
                return;
            }
            super.g(mcdVar);
            o3s.b("TaoLiveRealController", "BottomSlideNewGuide 创建播放器 onFailed()");
            if (TaoLiveRealController.Z(TaoLiveRealController.this) != null) {
                TaoLiveRealController.Z(TaoLiveRealController.this).a(false);
                o3s.b("TaoLiveRealController", "BottomSlideNewGuide 冒头推直播 onFailed() 背景播放器已销毁");
            }
            if (TaoLiveRealController.C(TaoLiveRealController.this) != null && TaoLiveRealController.C(TaoLiveRealController.this).d()) {
                sjr.g().c(uyg.d, MonitorMediaPlayer.mornitorPlayerError, TaoLiveRealController.this.observeUniqueIdentification());
            } else if (TaoLiveRealController.C(TaoLiveRealController.this) != null && !TaoLiveRealController.C(TaoLiveRealController.this).d() && (map = this.f13163a) != null) {
                map.remove("enableUpDownGuideLiveBg");
                sjr.g().c(uyg.f29673a, this.f13163a, TaoLiveRealController.this.observeUniqueIdentification());
            }
        }

        @Override // tb.tcd, tb.scd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            super.onSuccess();
            if (!TaoLiveRealController.a0(TaoLiveRealController.this)) {
                o3s.b("TaoLiveRealController", "BottomSlideNewGuide 创建播放器 首帧回调 onSuccess()");
                Map map = this.f13163a;
                if (map == null || !map.containsKey("isTab2")) {
                    sjr.g().c(uyg.f, null, TaoLiveRealController.this.observeUniqueIdentification());
                } else {
                    sjr.g().c(uyg.f, "isTab2", TaoLiveRealController.this.observeUniqueIdentification());
                }
                TaoLiveRealController.b0(TaoLiveRealController.this, true);
                return;
            }
            o3s.b("TaoLiveRealController", "BottomSlideNewGuide 触发第二次首帧回调 onSuccess() 防止重复触发，不展示");
            if (TaoLiveRealController.C(TaoLiveRealController.this) != null && !TaoLiveRealController.C(TaoLiveRealController.this).d()) {
                sjr.g().c(uyg.i, null, TaoLiveRealController.this.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements ISmartLandingProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(TaoLiveRealController taoLiveRealController) {
        }

        @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements i0m.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13164a;
        public final /* synthetic */ boolean b;

        public g(String str, boolean z) {
            this.f13164a = str;
            this.b = z;
        }

        @Override // tb.i0m.b
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else if (this.b) {
                TaoLiveRealController.d0(TaoLiveRealController.this);
            }
        }

        @Override // tb.i0m.b
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                TaoLiveRealController.e0(TaoLiveRealController.this, this.f13164a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements i0m.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13165a;
        public final /* synthetic */ boolean b;

        public h(String str, boolean z) {
            this.f13165a = str;
            this.b = z;
        }

        @Override // tb.i0m.b
        public void onDenied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
            } else if (this.b) {
                TaoLiveRealController.d0(TaoLiveRealController.this);
            }
        }

        @Override // tb.i0m.b
        public void onGranted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48392e63", new Object[]{this});
            } else {
                TaoLiveRealController.e0(TaoLiveRealController.this, this.f13165a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
                return;
            }
            o3s.b("TaoLiveRealController", "LPM init by callback");
            e51 e51Var = new e51();
            e51Var.c(j5m.e(TaoLiveRealController.W(TaoLiveRealController.this)));
            e51Var.d(j5m.f(TaoLiveRealController.W(TaoLiveRealController.this)));
            qmh.f().k(e51Var);
            qmh.f().d(TaoLiveRealController.W(TaoLiveRealController.this));
            qmh.f().i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements bl9.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13168a;

        public k(String str) {
            this.f13168a = str;
        }

        @Override // tb.bl9.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbd6452", new Object[]{this});
            } else {
                TaoLiveRealController.k0(TaoLiveRealController.this, this.f13168a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements RightDrawerLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // com.taobao.taolive.room.widget.RightDrawerLayout.b
        public void onDrawerClosed(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5382042f", new Object[]{this, view});
            } else if (TaoLiveRealController.L(TaoLiveRealController.this) != null) {
                TaoLiveRealController.i0(TaoLiveRealController.this, true);
                TaoLiveRealController.L(TaoLiveRealController.this).onPause();
                TaoLiveRealController.L(TaoLiveRealController.this).onStop();
            }
        }

        @Override // com.taobao.taolive.room.widget.RightDrawerLayout.b
        public void onDrawerOpened(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c01b9092", new Object[]{this, view});
            } else if (TaoLiveRealController.L(TaoLiveRealController.this) != null) {
                TaoLiveRealController.i0(TaoLiveRealController.this, false);
                TaoLiveRealController.L(TaoLiveRealController.this).onStart();
                TaoLiveRealController.L(TaoLiveRealController.this).onResume();
            }
        }

        @Override // com.taobao.taolive.room.widget.RightDrawerLayout.b
        public void onDrawerStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e863a89", new Object[]{this, new Integer(i)});
            }
        }
    }

    static {
        t2o.a(779092886);
        t2o.a(779092845);
        t2o.a(806355016);
        t2o.a(779092743);
    }

    public TaoLiveRealController(Activity activity, String str, y3s y3sVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        super(activity);
        m1("Constructor url = " + str);
        dba dbaVar = new dba(activity);
        this.a0 = dbaVar;
        dbaVar.a0(activity);
        H1(activity);
        D1(activity);
        iba.n1(dbaVar, new gmr());
        J1(y3sVar);
        if (taoliveOpenLiveRoom != null) {
            G1(taoliveOpenLiveRoom);
        }
        R1(taoliveOpenLiveRoom);
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            Uri parse = Uri.parse(str);
            this.Z = parse;
            intent.setData(parse);
            d1(intent);
            S0(activity, this.n, this.o, this.q, this.U, this.S);
        }
    }

    public static /* synthetic */ cba C(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("ebfed18a", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.a0;
    }

    public static /* synthetic */ ViewGroup F(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c84dfe9b", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.R;
    }

    public static /* synthetic */ int G(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f15fb7f", new Object[]{taoLiveRealController})).intValue();
        }
        return taoLiveRealController.y0;
    }

    public static /* synthetic */ boolean I(TaoLiveRealController taoLiveRealController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daea948f", new Object[]{taoLiveRealController, new Boolean(z)})).booleanValue();
        }
        taoLiveRealController.k0 = z;
        return z;
    }

    public static /* synthetic */ void K(TaoLiveRealController taoLiveRealController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2d204a", new Object[]{taoLiveRealController, new Boolean(z)});
        } else {
            taoLiveRealController.B0(z);
        }
    }

    public static /* synthetic */ x3d L(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3d) ipChange.ipc$dispatch("2be76072", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.g0;
    }

    public static /* synthetic */ WindowInsets M(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("5dc95e09", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.N;
    }

    public static /* synthetic */ WindowInsets N(TaoLiveRealController taoLiveRealController, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("4bd74a8c", new Object[]{taoLiveRealController, windowInsets});
        }
        taoLiveRealController.N = windowInsets;
        return windowInsets;
    }

    public static /* synthetic */ boolean O(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9203a42b", new Object[]{taoLiveRealController})).booleanValue();
        }
        return taoLiveRealController.L;
    }

    public static /* synthetic */ boolean P(TaoLiveRealController taoLiveRealController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49f08393", new Object[]{taoLiveRealController, new Boolean(z)})).booleanValue();
        }
        taoLiveRealController.L = z;
        return z;
    }

    public static /* synthetic */ int Q(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc332c39", new Object[]{taoLiveRealController})).intValue();
        }
        return taoLiveRealController.M;
    }

    public static /* synthetic */ int R(TaoLiveRealController taoLiveRealController, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25b1bf72", new Object[]{taoLiveRealController, new Integer(i2)})).intValue();
        }
        taoLiveRealController.M = i2;
        return i2;
    }

    public static /* synthetic */ int S(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6662b458", new Object[]{taoLiveRealController})).intValue();
        }
        return taoLiveRealController.P;
    }

    public static /* synthetic */ int T(TaoLiveRealController taoLiveRealController, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1733b33", new Object[]{taoLiveRealController, new Integer(i2)})).intValue();
        }
        taoLiveRealController.P = i2;
        return i2;
    }

    public static /* synthetic */ void U(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0923c84", new Object[]{taoLiveRealController});
        } else {
            taoLiveRealController.m0();
        }
    }

    public static /* synthetic */ d6q V(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d6q) ipChange.ipc$dispatch("a1ef800e", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.h0;
    }

    public static /* synthetic */ Activity W(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2a7b39ef", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.Q;
    }

    public static /* synthetic */ void X(TaoLiveRealController taoLiveRealController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb5c65", new Object[]{taoLiveRealController, view});
        } else {
            taoLiveRealController.o1(view);
        }
    }

    public static /* synthetic */ int Y(TaoLiveRealController taoLiveRealController, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7758510c", new Object[]{taoLiveRealController, new Integer(i2)})).intValue();
        }
        taoLiveRealController.g = i2;
        return i2;
    }

    public static /* synthetic */ mcd Z(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mcd) ipChange.ipc$dispatch("78266a53", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.r0;
    }

    public static /* synthetic */ boolean a0(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99660fae", new Object[]{taoLiveRealController})).booleanValue();
        }
        return taoLiveRealController.s0;
    }

    public static /* synthetic */ boolean b0(TaoLiveRealController taoLiveRealController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2edb8870", new Object[]{taoLiveRealController, new Boolean(z)})).booleanValue();
        }
        taoLiveRealController.s0 = z;
        return z;
    }

    public static /* synthetic */ TaoLiveLayoutManager c0(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveLayoutManager) ipChange.ipc$dispatch("333b889d", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.c;
    }

    public static /* synthetic */ void d0(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc51fe8", new Object[]{taoLiveRealController});
        } else {
            taoLiveRealController.D0();
        }
    }

    public static /* synthetic */ void e0(TaoLiveRealController taoLiveRealController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35887e11", new Object[]{taoLiveRealController, str});
        } else {
            taoLiveRealController.M1(str);
        }
    }

    public static /* synthetic */ String f0(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7999e928", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.u;
    }

    public static /* synthetic */ View g0(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc1c9319", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.m0;
    }

    public static /* synthetic */ boolean h0(TaoLiveRealController taoLiveRealController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95ac9ee4", new Object[]{taoLiveRealController, new Boolean(z)})).booleanValue();
        }
        taoLiveRealController.W = z;
        return z;
    }

    public static /* synthetic */ void i0(TaoLiveRealController taoLiveRealController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ef2a9f", new Object[]{taoLiveRealController, new Boolean(z)});
        } else {
            taoLiveRealController.F1(z);
        }
    }

    public static /* synthetic */ Object ipc$super(TaoLiveRealController taoLiveRealController, String str, Object... objArr) {
        if (str.hashCode() == 2022597206) {
            super.A();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/TaoLiveRealController");
    }

    public static /* synthetic */ yir j0(TaoLiveRealController taoLiveRealController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yir) ipChange.ipc$dispatch("f15aacaa", new Object[]{taoLiveRealController});
        }
        return taoLiveRealController.B;
    }

    public static /* synthetic */ void k0(TaoLiveRealController taoLiveRealController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6609e1d", new Object[]{taoLiveRealController, str});
        } else {
            taoLiveRealController.K1(str);
        }
    }

    public static /* synthetic */ String l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c30efe0", new Object[0]);
        }
        return B0;
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListController
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.A();
        I1(true);
    }

    public final void A0(RecModel recModel, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f407985d", new Object[]{this, recModel, map});
            return;
        }
        MediaData L0 = L0(recModel);
        if (L0 != null) {
            String b2 = com.taobao.taolive.sdk.ui.media.a.b(L0, null);
            ufi ufiVar = new ufi();
            ufiVar.f29342a = tfi.h(b2);
            ufiVar.b = b2;
            mcd a2 = zrm.a(new PreloadParams.a(this.Q).f0(ufiVar).Q(L0).V(new e(map)).G());
            this.r0 = a2;
            a2.b();
            o3s.b("TaoLiveRealController", "BottomSlideNewGuide 冒头推直播 背景播放器已创建");
        }
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f990ecf", new Object[]{this});
            return;
        }
        iba.q1(null, this.a0);
        iba.X0(false, this.a0);
        iba.L0(null, this.a0);
        iba.L0(null, this.a0);
        iba.I0(false, this.a0);
        iba.G0(false, this.a0);
        iba.E0(false, this.a0);
        iba.b0(false, this.a0);
        iba.Z(false, this.a0);
        iba.c0(false, this.a0);
        iba.J0(false, this.a0);
        iba.T(null, this.a0);
        iba.K0(false, this.a0);
        iba.d0(0L, this.a0);
        iba.d0(0L, this.a0);
        if (vx9.d() != null) {
            iba.P(false, this.a0);
            iba.Q(null, this.a0);
            iba.S(null, this.a0);
            iba.R(null, this.a0);
        }
        iba.f0(true, this.a0);
        iba.e0(true, this.a0);
        iba.a0(false, this.a0);
        iba.c1(null, this.a0);
    }

    public final void B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e338499c", new Object[]{this});
            return;
        }
        y3s y3sVar = this.x0;
        if (y3sVar != null) {
            iba.E0(y3sVar.d, this.a0);
        } else if (!iba.t(this.a0)) {
            iba.E0(false, this.a0);
        }
    }

    public final void C0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9281ad", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.R;
        if (viewGroup instanceof RightDrawerLayout) {
            if (z) {
                ((RightDrawerLayout) viewGroup).setDrawerLockMode(0);
            } else {
                ((RightDrawerLayout) viewGroup).setDrawerLockMode(1);
            }
        }
    }

    public final void C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43586f8f", new Object[]{this});
            return;
        }
        try {
            if (wir.a().b() != null) {
                wir.a().b().d();
                wir.a().b().destroy();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.jyd
    public Map<String, String> D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5cb7969", new Object[]{this, str});
        }
        m1("updateUri");
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap();
        if (parse == null) {
            return hashMap;
        }
        String queryParameter = parse.getQueryParameter("spm");
        this.r = queryParameter;
        this.S.put("spm", queryParameter);
        cba cbaVar = this.a0;
        Map<String, String> Y = rbu.Y(cbaVar, this.Q, this.t, iba.e(cbaVar), this.x, this.y, false);
        Y.put("pageName", "Page_TaobaoLiveWatch");
        iba.j1(this.r, this.a0);
        return Y;
    }

    public final void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        utk utkVar = this.t0;
        if (utkVar != null) {
            utkVar.onFinish();
        } else {
            E0();
        }
    }

    public final void D1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76ba594", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        int hashCode = hashCode();
        this.y0 = hashCode;
        intent.putExtra("seqId", hashCode);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
    }

    @Override // tb.jyd
    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b7fe04c", new Object[]{this});
        }
        yir yirVar = this.B;
        if (yirVar != null) {
            return String.valueOf(yirVar.i());
        }
        return null;
    }

    public final void E1(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d8e1e4", new Object[]{this, bundle});
            return;
        }
        String string = bundle.getString(yj4.PARAM_MEDIA_INFO_ADTRANSPARAMS);
        if (!TextUtils.isEmpty(string)) {
            JSONObject parseObject = JSON.parseObject(string);
            if (parseObject != null && parseObject.containsKey("action_list") && parseObject.containsKey("pay_url")) {
                String string2 = parseObject.getString("action_list");
                String string3 = parseObject.getString("pay_url");
                String string4 = parseObject.getString("adLiveId");
                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                    List parseArray = JSON.parseArray(string2, String.class);
                    LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2 = new LiveDetailMessinfoResponseData.AlimamaInfo2();
                    ArrayList<String> arrayList = alimamaInfo2.action_list;
                    if (arrayList == null) {
                        alimamaInfo2.action_list = new ArrayList<>();
                    } else {
                        arrayList.clear();
                    }
                    alimamaInfo2.action_list.addAll(parseArray);
                    alimamaInfo2.pay_url = string3;
                    alimamaInfo2.adLiveId = string4;
                    iba.O(alimamaInfo2, this.a0);
                    return;
                }
                return;
            }
            return;
        }
        iba.O(null, this.a0);
    }

    public final String F0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23e54330", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.n)) {
            str = String.valueOf(this.n.hashCode());
        } else {
            str = "";
        }
        Random random = new Random();
        return str + "_" + System.currentTimeMillis() + random.nextInt(1000);
    }

    public final String G0() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c08308c", new Object[]{this});
        }
        Intent intent = this.Q.getIntent();
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        return data.getQueryParameter("clickid");
    }

    public final void G1(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234e4e92", new Object[]{this, taoliveOpenLiveRoom});
            return;
        }
        cba cbaVar = this.a0;
        if (cbaVar != null) {
            cbaVar.q0(taoliveOpenLiveRoom);
        }
        if (taoliveOpenLiveRoom != null && (azdVar = taoliveOpenLiveRoom.abilityCompontent) != null) {
            iba.E0(((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Container_HideCloseICON), this.a0);
        }
    }

    @Override // tb.jyd
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4a6e0d", new Object[]{this});
            return;
        }
        rbu.m0(this.a0, this.Q, "Page_TaobaoLiveWatch");
        cba cbaVar = this.a0;
        rbu.Y(cbaVar, this.Q, this.t, iba.e(cbaVar), this.x, this.y, true);
    }

    public final Intent H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.Q.getIntent();
    }

    public final LinearSmoothScroller I0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearSmoothScroller) ipChange.ipc$dispatch("f623f549", new Object[]{this, new Integer(i2)});
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.b.getContext()) { // from class: com.taobao.taolive.room.controller2.TaoLiveRealController.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass14 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/TaoLiveRealController$14");
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                }
                return pvs.Y2() / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (PointF) ipChange2.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i3)});
                }
                return TaoLiveRealController.c0(TaoLiveRealController.this).computeScrollVectorForPosition(i3);
            }
        };
        linearSmoothScroller.setTargetPosition(i2);
        return linearSmoothScroller;
    }

    public final void I1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e3cc46", new Object[]{this, new Boolean(z)});
            return;
        }
        cir.a("BaseListController", "setScrollEnableByDesign " + z);
        this.a0.I = z;
        this.c.y(z);
    }

    @Override // tb.jyd
    public void J() {
        cba cbaVar;
        VideoInfo T;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05a9ba0", new Object[]{this});
        } else if (!this.q0 && pvs.U2() && (cbaVar = this.a0) != null && (T = cbaVar.T()) != null && (accountInfo = T.broadCaster) != null) {
            InteractBusiness.l(T.liveId, accountInfo.accountId, T.topic, 10010, null, null, null, e7w.i(null));
        }
    }

    public boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8f9e31", new Object[]{this})).booleanValue();
        }
        ux9 d2 = vx9.d();
        if (d2 == null || d2.x() == null) {
            return true;
        }
        return d2.x().isMuted();
    }

    public void J1(y3s y3sVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6df94", new Object[]{this, y3sVar});
            return;
        }
        if (y3sVar != null) {
            this.P = y3sVar.b;
            if (y3sVar.d && (view = this.m0) != null) {
                view.setVisibility(8);
            }
            iba.I0(y3sVar.n, this.a0);
            iba.G0(y3sVar.h, this.a0);
            iba.E0(y3sVar.d, this.a0);
            cba cbaVar = this.a0;
            cbaVar.B = y3sVar.j;
            iba.b0(y3sVar.f31831a, cbaVar);
            iba.K0(y3sVar.c, this.a0);
            iba.T(y3sVar.g, this.a0);
            iba.v0(y3sVar.g, this.a0);
            iba.v0(y3sVar.g, this.a0);
            iba.J0(y3sVar.i, this.a0);
            iba.Z(y3sVar.e, this.a0);
            iba.c0(y3sVar.f, this.a0);
            iba.d0(System.currentTimeMillis() + y3sVar.k, this.a0);
            iba.f0(y3sVar.l, this.a0);
            iba.e0(y3sVar.m, this.a0);
            iba.a0(y3sVar.o, this.a0);
            this.a0.getClass();
        }
        this.x0 = y3sVar;
    }

    public final String K0(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47303a3b", new Object[]{this, uri});
        }
        if (uri == null) {
            return "";
        }
        if (kyt.TMCS_PAY_SUCCESS_HOST.equals(uri.getHost())) {
            return uri.getQueryParameter(yj4.PARAM_ELEVEN_LIVE_ID);
        }
        String queryParameter = uri.getQueryParameter("id");
        return TextUtils.isEmpty(queryParameter) ? uri.getQueryParameter(yj4.PARAM_ELEVEN_LIVE_ID) : queryParameter;
    }

    public final void K1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b1e3d1", new Object[]{this, str});
            return;
        }
        IBottomProxy.a createShareFission = d9m.g().createShareFission();
        this.b0 = createShareFission;
        if (createShareFission != null) {
            createShareFission.b(iba.C(this.a0), str);
        }
    }

    public final MediaData L0(RecModel recModel) {
        ArrayList<QualitySelectItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("7bd50f13", new Object[]{this, recModel});
        }
        if (recModel == null || (arrayList = recModel.liveUrlList) == null || arrayList.isEmpty()) {
            return null;
        }
        return mxg.a(mxf.e(fkx.i(recModel)));
    }

    public final void L1(boolean z, String str) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dcdf390", new Object[]{this, new Boolean(z), str});
            return;
        }
        sjr.g().c(uyg.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, null, observeUniqueIdentification());
        cir.a("TBLiveService", "showGlobalMiniWindow");
        if (Build.VERSION.SDK_INT >= 24) {
            canDrawOverlays = Settings.canDrawOverlays(this.Q);
            if (canDrawOverlays) {
                M1(str);
            } else if ("ZoomBtn".equals(str)) {
                cir.a("TBLiveService", "showGlobalMiniWindow checkFloatWindowPermisson");
                i0m.a(this.Q, new g(str, z));
            } else {
                cir.a("TBLiveService", "showGlobalMiniWindow checkFloatWindowPermisson");
                i0m.b(this.Q, new h(str, z));
            }
        } else {
            M1(str);
        }
    }

    public final long M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca7171aa", new Object[]{this})).longValue();
        }
        return (System.currentTimeMillis() - this.V) / 1000;
    }

    public final void M1(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf85076", new Object[]{this, str});
            return;
        }
        cir.a("TBLiveService", "startZoomWindow triggerMode = " + str);
        HashMap hashMap = new HashMap();
        ux9 d2 = vx9.d();
        if (!(d2 == null || d2.x() == null || TextUtils.isEmpty(d2.x().b()))) {
            hashMap.put(yj4.PARAM_PLAY_URL, d2.x().b());
            hashMap.put(CommandID.seekTo, String.valueOf(d2.x().getCurrentPosition()));
            if (d2.x().u()) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            hashMap.put("loop", str2);
            hashMap.put(yj4.PARAM_IS_LIVE_MUTE, String.valueOf(d2.x().isMuted()));
            if (vx9.d() instanceof cdr) {
                hashMap.put(sya.IS_REPLAY_UPDATE, String.valueOf(((cdr) vx9.d()).Y0()));
            }
        }
        hashMap.put("triggerMode", str);
        hashMap.put("liveSource", up6.L(vx9.d()));
        hashMap.put("entryLiveSource", up6.r(vx9.d()));
        hashMap.put("spm", up6.U(vx9.d()));
        hashMap.put("trackInfo", up6.a0(vx9.d()));
        wir.a().b().a(this.Q, up6.c0(vx9.d()), "zoom", hashMap, d2 instanceof air ? ((air) d2).H0() : null);
        D0();
    }

    public final int N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62ff57fc", new Object[]{this})).intValue();
        }
        cba cbaVar = this.a0;
        if (cbaVar == null || !cbaVar.Q() || iba.w(this.a0) == 2) {
            return 1;
        }
        return 2;
    }

    public final void O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97044d52", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(v2s.o().f().getApplication()).unregisterReceiver(this.l0);
        }
    }

    public void P1() {
        long j2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d1248b", new Object[]{this});
        } else if (this.B != null) {
            VideoInfo c0 = up6.c0(vx9.d());
            if (c0 == null || c0.broadCaster == null) {
                j2 = 0;
                z = false;
            } else {
                long j3 = c0.viewCount;
                qt9 qt9Var = new qt9();
                qt9Var.f26917a = c0.broadCaster.accountId;
                z = v2s.o().k().e(qt9Var);
                j2 = j3;
            }
            this.B.A(this.n, System.currentTimeMillis() - this.D, z, j2, m09.e().c());
        }
    }

    public final void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01f5ccd", new Object[]{this});
            return;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null && c0.isOfficialType() && H0() != null && H0().getData() != null) {
            Uri data = H0().getData();
            String queryParameter = data.getQueryParameter("id");
            String queryParameter2 = data.getQueryParameter("userId");
            if (!TextUtils.isEmpty(queryParameter)) {
                this.n = queryParameter;
                this.o = queryParameter2;
            }
        }
    }

    public void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8223af34", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.R.findViewById(R.id.taolive_close_btn);
        if (iws.b()) {
            cba cbaVar = this.a0;
            if (cbaVar instanceof dba) {
                ((dba) cbaVar).u0(true);
            }
            iws iwsVar = new iws(this.Q, frameLayout, (FrameLayout) this.R.findViewById(R.id.taolive_home_page_tab));
            this.c0 = iwsVar;
            iwsVar.f();
            return;
        }
        ((dba) this.a0).u0(false);
        frameLayout.setBackgroundResource(R.drawable.taolive_room_close_btn_background_small);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = hw0.b(this.Q, 64.0f);
        layoutParams.height = hw0.b(this.Q, 28.0f);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.removeAllViews();
        Y0(frameLayout);
    }

    public final void S0(Activity activity, String str, String str2, String str3, String str4, Map<String, String> map) {
        Activity activity2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ce9294", new Object[]{this, activity, str, str2, str3, str4, map});
            return;
        }
        sj9.D("TaoLiveController2_init");
        i1(activity, str);
        d9m.n().initUltronServerConfig(activity);
        C1();
        this.Q = activity;
        this.q0 = false;
        this.n = str;
        this.a0.k0(F0());
        this.o = str2;
        this.q = str3;
        this.S = map;
        this.i0 = new AdMonitorBusiness(null);
        y1(activity, str3, str4);
        if (bl9.g().b()) {
            o3s.b("TaoLiveRealController", "LPM init");
            e51 e51Var = new e51();
            e51Var.c(j5m.e(this.Q));
            e51Var.d(j5m.f(this.Q));
            qmh.f().k(e51Var);
            qmh.f().d(this.Q);
            qmh.f().i();
        } else {
            o3s.b("TaoLiveRealController", "LPM init callback added");
            bl9.g().i(new i());
        }
        cba cbaVar = this.a0;
        this.h0 = new d6q(cbaVar, this.Q);
        String C = iba.C(cbaVar);
        this.h0.d(C, this.q, this.n, this.o);
        d6q d6qVar = this.h0;
        String str5 = this.q;
        d6qVar.e(true, C, str5, str5, this.n, this.o);
        g1();
        if (!pvs.x()) {
            s0(this.a0);
        }
        hnr.a(true);
        B0 = toString();
        kmr d2 = kmr.d();
        this.A = d2;
        d2.e();
        U0(false);
        if (pvs.x()) {
            s0(this.a0);
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(v2s.o().f().getApplication());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.live.room.init");
        instance.registerReceiver(this.l0, intentFilter);
        w36.k().g(this.Q);
        ppv.c(this.Q).e();
        cba cbaVar2 = this.a0;
        if (!(cbaVar2 instanceof dba) || !((dba) cbaVar2).r0()) {
            tbt.c().g();
        }
        tbt.c().l(new j());
        if (bl9.g().a()) {
            K1(str);
        } else {
            bl9.g().h(new k(str));
        }
        if (!(!nqo.d() || (activity2 = this.Q) == null || activity2.getWindow() == null)) {
            this.Q.getWindow().addFlags(128);
        }
        Activity activity3 = this.Q;
        if (activity3 != null) {
            rir.j(activity3, activity3.hashCode());
        }
        this.j0 = d9m.l().createLiveRoomOpenPushManager(this.Q);
    }

    public final void S1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0067c9", new Object[]{this, new Boolean(z)});
            return;
        }
        cba cbaVar = this.a0;
        if (cbaVar instanceof dba) {
            ((dba) cbaVar).m0 = z;
        }
    }

    public void T1(boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5738a2", new Object[]{this, new Boolean(z)});
            return;
        }
        cir.a("BaseListController", "updateScrollEnabled " + z + " totalDy = " + this.f + " mItemHeight = " + this.e + " singleDy = " + this.C0);
        C0(z);
        if (z || !this.z0) {
            this.l = z;
            if (!pvs.g3() || !((i2 = this.e) == 0 || this.C0 % i2 == 0)) {
                TaoLiveLayoutManager taoLiveLayoutManager = this.c;
                if (taoLiveLayoutManager != null) {
                    int i3 = this.e;
                    if (i3 == 0 || this.f % i3 == 0) {
                        taoLiveLayoutManager.y(z);
                        cir.a("BaseListController", "real updateScrollEnabled " + z);
                        return;
                    }
                    return;
                }
                return;
            }
            this.c.y(z);
            cir.a("BaseListController", "real updateScrollEnabled " + z);
        }
    }

    public final void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef77db5c", new Object[]{this, new Boolean(z)});
            return;
        }
        sj9.D("TaoLiveController2_initAll");
        V0(z, false);
    }

    public final void V0(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8442f8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        yfd.c().a(IRRoomProxy.KEY, RRoomProxy.getInstance());
        this.W = false;
        B1();
        LocalBroadcastManager.getInstance(this.Q).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
        if (this.Y == null) {
            this.Y = new naj();
        }
        System.currentTimeMillis();
        if (this.F == null) {
            sjr g2 = sjr.g();
            this.F = g2;
            g2.a(this);
        }
        c1(z);
        if (kmr.f(this.n)) {
            X0();
            e1(this.q, this.S);
            x1(pvs.A2(), this.o, this.q, null, this.S, false, false, false);
            return;
        }
        h1(z2);
        if (z) {
            A();
            yir yirVar = this.B;
            if (yirVar != null) {
                yirVar.z();
                this.B = null;
            }
            T0();
        } else {
            X0();
        }
        e1(this.q, this.S);
        Z0();
        this.D = System.currentTimeMillis();
        this.G = this.Q.getRequestedOrientation();
        q0("EnterRoom");
    }

    public final JSONObject W0(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afc500", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("anchorGuard");
        String queryParameter2 = uri.getQueryParameter("timestamp");
        String queryParameter3 = uri.getQueryParameter(SimpleProfile.KEY_SIGNATURE);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(queryParameter)) {
            jSONObject.put("anchorGuard", (Object) queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            jSONObject.put("timestamp", (Object) queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) queryParameter3);
        }
        return jSONObject;
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f38fcd", new Object[]{this});
            return;
        }
        y0();
        rc.e(this.R);
        sj9.B(this.R, true);
        this.R.setKeepScreenOn(true);
        View findViewById = this.R.findViewById(R.id.taolive_close_btn);
        ViewProxy.setOnClickListener(findViewById, this);
        if (Build.VERSION.SDK_INT < 23) {
            findViewById.setAlpha(1.0f);
        }
        this.b = (TaoLiveRecyclerView) this.R.findViewById(R.id.taolive_recyclerview);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRecyclerView2.class);
        this.b.setNestedScrollChilds(arrayList);
        this.b.setBackgroundColor(-13223097);
        this.b.setGlobalContext(this.a0);
        n(this.b);
        this.a0.J(this.b);
        T0();
        if (nqo.f(this.a0)) {
            z0();
            p0((RightDrawerLayout) this.R);
        }
    }

    public final void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3308211d", new Object[]{this});
            return;
        }
        View findViewById = this.R.findViewById(R.id.taolive_close_btn);
        this.m0 = findViewById;
        if (findViewById != null) {
            if (!v2s.o().I("closeBtn") || iba.t(this.a0)) {
                this.m0.setVisibility(8);
            } else {
                this.m0.setVisibility(0);
            }
            if (this.d0 == null) {
                this.d0 = new o6t(this);
            }
            sjr.g().a(this.d0);
        }
        Q1();
        ViewGroup viewGroup = (ViewGroup) this.R.findViewById(R.id.taolive_global_layout);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (hw0.l() && this.B != null) {
            d9m.j().createDebugPanel(this.Q, this.R, new p6t(this), true);
            this.e0 = d9m.j().createDisplayView(this.Q, this.R, true);
        }
    }

    public final void a1(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e5a15b", new Object[]{this, uri, map});
            return;
        }
        String queryParameter = uri.getQueryParameter("timeMovingSpfPlayVideo");
        if (!TextUtils.isEmpty(queryParameter)) {
            map.put("timeMovingSpfPlayVideo", queryParameter);
        }
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListController
    public void b() {
        yir yirVar;
        myb mybVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeda1fb5", new Object[]{this});
            return;
        }
        x5t.h("AutoDownController", "afterUpDownSwitchEnd");
        yir yirVar2 = this.B;
        if (yirVar2 != null) {
            yirVar2.u(this.h);
        }
        this.z0 = false;
        if (vx9.d() != null) {
            vx9.d().q0(true);
        }
        if (hw0.l() && (yirVar = this.B) != null && (mybVar = this.e0) != null) {
            mybVar.refreshData(yirVar.h(), this.B.g());
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TaoLiveController2";
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListController
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794dc532", new Object[]{this});
            return;
        }
        P1();
        if (vx9.d() != null) {
            vx9.d().k0(true);
        }
    }

    @Override // tb.jyd
    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8722e3", new Object[]{this, onClickListener});
            return;
        }
        m1("setClickCloseRoomListener");
        this.v0 = onClickListener;
    }

    public final void e1(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f224be52", new Object[]{this, str, map});
        } else if (iba.h(this.a0)) {
            f1();
        } else {
            if (this.B == null) {
                if (map == null || TextUtils.isEmpty(map.get(yj4.PARAM_SWITCH_RT_RCMD))) {
                    str2 = "1";
                } else {
                    str2 = this.S.get(yj4.PARAM_SWITCH_RT_RCMD);
                }
                if (qvs.c0()) {
                    this.B = new ylr("1".equals(str2), (dba) this.a0, this.Q);
                } else {
                    this.B = new zlr("1".equals(str2), (dba) this.a0, this.Q);
                }
            }
            this.B.y(this.b);
            if (this.C == null) {
                this.C = new HashMap<>();
            }
            if (map != null) {
                this.C.put(zlr.PARAM_ENTRY_LIVE_ID, map.get("id"));
                if (!TextUtils.isEmpty(str)) {
                    this.C.put("entryLiveSource", str);
                } else {
                    this.C.put("entryLiveSource", map.get("livesource"));
                }
                this.C.put(zlr.PARAM_ENTRY_SJSD_ITEM_ID, map.get(yj4.PARAM_SJSD_ITEM_ID));
                this.C.put(zlr.PARAM_ENTRY_TIMESHIFT_ITEM_ID, map.get(yj4.PARAM_TIMEMOVING_ITEM_ID));
                this.C.put("appkey", v2s.o().f().getAppKey());
                this.C.put("queryKey", map.get("queryKey"));
                this.C.put("queryDetailInfo", map.get("queryDetailInfo"));
                String valueOf = String.valueOf(System.currentTimeMillis());
                this.C.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, valueOf);
                this.S.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, valueOf);
                this.C.put("entryLiveSourcePre", iba.p(this.a0));
                this.C.put("liveBucket", iba.y(this.a0));
                this.C.put("LiveAbid", iba.x(this.a0));
                this.C.put("singleLiveTabSessionId", iba.H(this.a0));
                this.C.put(yj4.REF_PID, map.get(yj4.REF_PID));
                this.C.put("entrySpm", iba.r(this.a0));
                this.C.put("platform", "android");
                TBLocationDTO d2 = TBLocationClient.d();
                if (d2 != null) {
                    this.C.put(r4p.KEY_CITY_CODE, d2.cityCode);
                    this.C.put(r4p.KEY_CITY_NAME, d2.cityName);
                }
                if (TextUtils.equals("true", iba.F(this.a0))) {
                    this.C.put("realExposure", "true");
                }
                if (iba.u(this.a0) != null) {
                    this.C.put("homepageFeedList", iba.u(this.a0).toJSONString());
                }
                if (!TextUtils.isEmpty(iba.G(this.a0))) {
                    this.C.put("source", iba.G(this.a0));
                } else {
                    this.C.put("source", "source_live");
                }
            }
            yir yirVar = this.B;
            if (yirVar != null) {
                yirVar.d(this.n, this.o, this.S, this.u);
                this.B.v(this.d);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListController
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b28a82b", new Object[]{this});
        } else if (this.a0.d()) {
            this.F.c(uyg.d, "switch", observeUniqueIdentification());
        }
    }

    public final void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf6d1ff", new Object[]{this});
        } else if (this.d != null) {
            ArrayList<IRecyclerModel> arrayList = new ArrayList<>();
            RecModel recModel = new RecModel(true, this.a0);
            recModel.liveId = this.n;
            recModel.accountId = this.o;
            recModel.initParams = this.S;
            recModel.visit = true;
            recModel.isFirst = true;
            recModel.trackInfo = this.u;
            arrayList.add(recModel);
            this.d.Z(arrayList);
            this.d.notifyDataSetChanged();
            I1(false);
        }
    }

    @Override // tb.jyd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47de00e4", new Object[]{this})).booleanValue();
        }
        return this.k0;
    }

    public final void g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e5abf", new Object[]{this});
        } else if (pvs.H() && sj9.t() && znm.k().p()) {
            dba dbaVar = (dba) this.a0;
            if (dbaVar.k0 == null) {
                dbaVar.k0 = new q6q(this.a0);
            }
            znm.k().v(new a());
            sj9.D("SmartLayer initSmartLayer ");
        }
    }

    @Override // tb.jyd
    public cba getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        return this.a0;
    }

    @Override // tb.jyd
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.jyd
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        m1("getView mRootView = " + this.R);
        return this.R;
    }

    @Override // tb.jyd
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4667d7", new Object[]{this, new Boolean(z)});
        } else {
            this.A0 = z;
        }
    }

    public final void h1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb8efe0", new Object[]{this, new Boolean(z)});
        } else {
            e7w.k();
        }
    }

    @Override // tb.jyd
    public void i(utk utkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4834220", new Object[]{this, utkVar});
        } else {
            this.t0 = utkVar;
        }
    }

    public final void i1(Activity activity, String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ffbca7", new Object[]{this, activity, str});
        } else if (xbf.k() && xbf.g() && activity.getIntent() != null && (data = activity.getIntent().getData()) != null) {
            String queryParameter = data.getQueryParameter(yj4.PARAM_ITEM_IDS);
            String queryParameter2 = data.getQueryParameter(yj4.PARAM_ITEM_HOLD_TYPE);
            if (!TextUtils.isEmpty(queryParameter) && bia.UNDER_TAKE_INSIDE_DETAIL.equals(queryParameter2)) {
                ArrayList arrayList = new ArrayList();
                if (xbf.i()) {
                    arrayList.add(queryParameter);
                }
                xbf.x(activity, iba.o(this.a0), str, arrayList, "hold", "hold");
            }
        }
    }

    @Override // tb.jyd
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.q0;
    }

    @Override // tb.jyd
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4a3165", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            t0u.b(this.Q, R.string.taolive_sku_query_data_failed);
        } else if (this.E != 0) {
            sjr.g().e("com.taobao.taolive.room.addcart", Long.valueOf(this.E));
        }
    }

    @Override // tb.jyd
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3e51b4", new Object[]{this, new Boolean(z)});
            return;
        }
        m1("调用了开放的清屏能力" + z);
        sjr.g().c(uyg.EVENT_CLEAR_SCREEN_NEW, Boolean.valueOf(z), observeUniqueIdentification());
    }

    public final boolean k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252586c1", new Object[]{this})).booleanValue();
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null) {
            return "1".equals(c0.roomStatus);
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListController
    public void l(boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1ec26c", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        yir yirVar = this.B;
        if (yirVar != null) {
            if (!z) {
                i2 = i3;
            }
            yirVar.x(i2);
        }
    }

    public final boolean l1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a28a2397", new Object[]{this, context})).booleanValue();
        }
        if (!vc.a() || !vc.h(context)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListController
    public void m(boolean z, int i2, int i3) {
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fea474", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        yir yirVar = this.B;
        if (yirVar != null) {
            if (z) {
                recModel = yirVar.c();
            } else {
                recModel = yirVar.b();
            }
            iba.i1(this.B.i(), this.a0);
            up6.T0(fkx.i(recModel), vx9.d());
            R0(recModel, z);
        }
        q0("UpDown");
    }

    public final void m0() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421867b3", new Object[]{this});
            return;
        }
        if (this.L) {
            v2s.o().A().a("TBLive", "adaptDisplayCutout mCutoutHeight = " + this.M);
            if (!pvs.N() ? this.Q.getRequestedOrientation() == 1 : this.Q.getResources().getConfiguration().orientation == 1) {
                z = true;
            }
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.taolive_close_btn);
                if (!(findViewById == null || (layoutParams2 = findViewById.getLayoutParams()) == null)) {
                    if (z) {
                        v2s.o().A().a("TBLive", "adaptDisplayCutout  portrait mCutoutHeight = " + this.M);
                        if (k0r.v()) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = hw0.b(this.Q, 12.0f) + Math.max(this.M, xca.c);
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = hw0.b(this.Q, 12.0f) + this.M;
                        }
                    } else if (k0r.v()) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = xca.c;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = hw0.b(this.Q, 12.0f);
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin += hw0.b(this.Q, 4.0f);
                    findViewById.setLayoutParams(layoutParams2);
                }
                View findViewById2 = this.R.findViewById(R.id.taolive_stop_game_btn);
                if (!(findViewById2 == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                    if (z) {
                        if (k0r.v()) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hw0.b(this.Q, 12.0f) + Math.max(this.M, xca.c);
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hw0.b(this.Q, 12.0f) + this.M;
                        }
                    } else if (k0r.v()) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = xca.c;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hw0.b(this.Q, 12.0f);
                    }
                }
            }
        } else {
            o0();
        }
        n0(this.L);
    }

    public final void m1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        x5t.h("TaoLiveRealController", str + " id = " + hashCode());
    }

    public void n0(boolean z) {
        View findViewById;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd6a84d", new Object[]{this, new Boolean(z)});
        } else if (this.R != null && iws.b() && (layoutParams = (findViewById = this.R.findViewById(R.id.taolive_home_page_tab)).getLayoutParams()) != null) {
            cwd A = v2s.o().A();
            A.a("TBLive", "adaptDisplayCutout  portrait mCutoutHeight = " + this.M);
            if (!z) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = xca.c;
            } else if (k0r.v()) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = Math.max(this.M, xca.c) - iws.d();
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.M - iws.d();
            }
            findViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // tb.jyd
    public void o(u0v u0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5323171f", new Object[]{this, u0vVar});
        } else {
            this.o0 = u0vVar;
        }
    }

    public void o0() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71931bf2", new Object[]{this});
        } else if (this.R != null && k0r.v()) {
            View findViewById = this.R.findViewById(R.id.taolive_close_btn);
            if (!(findViewById == null || (layoutParams2 = findViewById.getLayoutParams()) == null)) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = hw0.b(this.Q, 14.0f) + xca.c;
                findViewById.setLayoutParams(layoutParams2);
            }
            View findViewById2 = this.R.findViewById(R.id.taolive_stop_game_btn);
            if (findViewById2 != null && (layoutParams = findViewById2.getLayoutParams()) != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hw0.b(this.Q, 14.0f) + xca.c;
            }
        }
    }

    public final void o1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71ec657", new Object[]{this, view});
        } else if (this.Q.isFinishing()) {
        } else {
            if (this.v0 == null) {
                new a4u(this.Q).show();
            } else if (this.b.getScrollState() == 0) {
                this.v0.onClick(view);
                HashMap hashMap = new HashMap();
                hashMap.put("client", "taobao");
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "Page_TaobaoLive_Button-Button-UpShare", hashMap);
            }
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_TRACK, "com.taobao.taolive.room.killself", "com.taobao.taolive.room.show_btn_close", "com.taobao.taolive.room.hide_btn_close", "com.taobao.taolive.room.enable_updown_switch", "com.taobao.taolive.room.disable_updown_switch", "com.taobao.taolive.room.mediaplatform_switch_room", "com.taobao.taolive.room.mediaplatform_close_room", FullScreenFrame.EVENT_BACK_TO_LIVE, "com.taobao.taolive.room.replay_backToLive", "com.taobao.taolive.room.addcarting", "com.taobao.taolive.room.goods_list_showing", "com.taobao.taolive.room.show_error", "com.taobao.taolive.room.need_back", "com.taobao.taolive.room.enter_ut_track", "com.taobao.taolive.room.update_params", "com.taobao.taolive.room.updownswitch.init", "com.taobao.taolive.room.updownswitch.official.dedup", "com.taobao.taolive.room.refresh.recmodel", "com.taobao.taolive.room.updownswitch.willappear", uyg.EVENT_START_SHOW_GLOBAL_MINILIVE, "com.taobao.taolive.room.sliding_close_page", "com.taobao.taolive.room.switch.liveroom.down", "com.taobao.taolive.room.more_btn_click", uyg.EVENT_NEGATIVE_FEEDBACK, uyg.EVENT_NEW_PROFILE__IS_SHOWING, uyg.EVENT_REWARD_PANEL_SHOWING, "com.taobao.taolive.room.auto_down", "com.taobao.taolive.room.auto_up", "com.taobao.taolive.room.check_rv_foreground", "com.taobao.taolive.room.refresh", uyg.d, uyg.g, "smartlanding_event_action_hotReservation", uyg.h, uyg.i};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if ((pvs.p1() && d9m.l() != null && d9m.l().getRealRIdMap() != null && d9m.l().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN) != null && view.getId() == d9m.l().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN).intValue()) || (!pvs.p1() && view.getId() == R.id.taolive_close_btn)) {
            if (this.u0 == null || (k1() && up6.d0(vx9.d()) == VideoStatus.VIDEO_TIMESHIFT_STATUS && up6.Y(vx9.d()) == 0 && pvs.i2())) {
                n1(false);
            } else {
                this.u0.onClick(view);
            }
        }
    }

    @Override // tb.jyd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            m1("onCreate");
        }
    }

    @Override // tb.jyd
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        n1(true);
        return true;
    }

    @Override // tb.jyd
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else if (v2s.o().e() != null) {
            vgb e2 = v2s.o().e();
            String str = this.n;
            e2.commitFail("taolive", "liveRoomMemoryWarning", str, str);
        }
    }

    @Override // tb.jyd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        m1("onStart");
        BaseListAdapter baseListAdapter = this.d;
        if (baseListAdapter != null) {
            baseListAdapter.T();
        }
    }

    @Override // tb.jyd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            onStop(true);
        }
    }

    @Override // tb.jyd
    public void onTrimMemory(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i2)});
        } else if (v2s.o().e() != null) {
            String valueOf = String.valueOf(i2);
            v2s.o().e().commitFail("taolive", "liveRoomMemoryTrimMemory", valueOf, valueOf, valueOf);
        }
    }

    @Override // com.taobao.taolive.sdk.controller.BaseListController
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d42326", new Object[]{this});
        } else if (!iba.h(this.a0)) {
            t0u.c(this.Q, "猜中你的喜欢有点难，再滑一下试试~");
            yir yirVar = this.B;
            if (yirVar != null) {
                yirVar.e();
            }
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("TBLiveUpDownWatch", "onReachBottom_return======" + iba.h(this.a0));
        }
    }

    public final void p0(RightDrawerLayout rightDrawerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925a4f65", new Object[]{this, rightDrawerLayout});
        } else {
            rightDrawerLayout.addDrawerListener(new l());
        }
    }

    public final void p1(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcc817b", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        S1(true);
        e7w.m(null);
        if (z && this.a0.f0()) {
            rbu.E(this.a0, this.Q);
        }
        if (z2 && (this.a0.r() instanceof ATaoLiveOpenEntity) && ((ATaoLiveOpenEntity) this.a0.r()).bizCode != null && ((ATaoLiveOpenEntity) this.a0.r()).bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
            rbu.E(this.a0, this.Q);
        }
        BaseListAdapter baseListAdapter = this.d;
        if (baseListAdapter != null) {
            baseListAdapter.P();
        }
        ISmartLayerServiceProxy.a aVar = this.a0.v;
        if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
            ((ISmartLayerServiceProxy.c) aVar).f(this.Q);
        }
        rbu.g(this.a0, this.p0, this.n, new String[0]);
        iba.f1(null, this.a0);
        v3d v3dVar = this.j0;
        if (v3dVar != null) {
            v3dVar.setEnabled(false);
        }
    }

    public final void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cef1b5a", new Object[]{this, str});
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("liveId", this.n);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        qmh.f().a(LpmEventType.SYSTEM, str, jSONObject, "liveRoom", "");
    }

    public final void q1(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594cbc50", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        S1(false);
        this.p0 = String.valueOf(System.nanoTime());
        sj9.D("TaoLiveController2_onResume");
        y3s y3sVar = this.x0;
        if (y3sVar == null || !y3sVar.p || this.o0 == null) {
            rbu.m0(this.a0, this.Q, "Page_TaobaoLiveWatch");
            cba cbaVar = this.a0;
            rbu.Y(cbaVar, this.Q, this.t, iba.e(cbaVar), this.x, this.y, true);
        }
        e7w.n(null);
        if (z && this.a0.f0()) {
            rbu.A(this.a0, this.Q);
            rbu.j0(this.a0);
        }
        if (z2 && (this.a0.r() instanceof ATaoLiveOpenEntity) && ((ATaoLiveOpenEntity) this.a0.r()).bizCode != null && ((ATaoLiveOpenEntity) this.a0.r()).bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
            rbu.C(this.a0, this.Q);
        }
        String x = rbu.x(this.a0, this.Q);
        if (!TextUtils.isEmpty(x)) {
            iba.s1(x, this.a0);
        }
        if (nqo.l(this.a0, this.V)) {
            sjr.g().d("com.taobao.taolive.room.check_rv_foreground");
        }
        w0();
        BaseListAdapter baseListAdapter = this.d;
        if (baseListAdapter != null) {
            baseListAdapter.Q();
        }
        ISmartLayerServiceProxy.a aVar = this.a0.v;
        if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
            ((ISmartLayerServiceProxy.c) aVar).l(this.Q);
        }
        IBottomProxy.a aVar2 = this.b0;
        if (aVar2 != null) {
            aVar2.b(iba.C(this.a0), iba.m(this.a0));
        }
        if (!z2) {
            t1();
        }
        v3d v3dVar = this.j0;
        if (v3dVar != null) {
            v3dVar.setEnabled(true);
        }
    }

    @Override // tb.jyd
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ece154", new Object[]{this});
        } else {
            n1(false);
        }
    }

    public void r1(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df4207f", new Object[]{this, obj});
            return;
        }
        Map d2 = sr4.d(obj, null);
        if (!tz3.b(d2)) {
            sjr.g().c(uyg.EVENT_TAB2_MORE_LIVE_RIGHT_GUIDE_FRAME_IS_SHOW, d2, observeUniqueIdentification());
        }
    }

    @Override // tb.jyd
    public View s(boolean z) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d69c511", new Object[]{this, new Boolean(z)});
        }
        if (!z || (viewGroup = this.R) == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.taolive_top_ubee_container_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        return this.R.findViewById(R.id.taolive_ubee_container);
    }

    public final void s0(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33145092", new Object[]{this, cbaVar});
            return;
        }
        this.L = false;
        if (Build.VERSION.SDK_INT >= 23) {
            this.Q.getWindow().getDecorView().addOnLayoutChangeListener(new m());
        } else {
            int i2 = this.P;
            if (i2 > 0) {
                iba.M0(true, this.a0);
                iba.Y(this.P, this.a0);
                iba.b1(0, this.a0);
                m0();
            } else if (i2 == 0) {
                iba.M0(false, this.a0);
                iba.Y(0, this.a0);
                iba.b1(0, this.a0);
                m0();
            }
        }
        gmr.a(this.a0);
    }

    public void s1(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3e9f2d", new Object[]{this, obj});
            return;
        }
        Map d2 = sr4.d(obj, null);
        if (!tz3.b(d2)) {
            z1(d2);
        }
    }

    @Override // tb.jyd
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        m1("setSmallWindowClickListener");
        this.n0 = iSmallWindowStrategy;
        scw.b(this.Y, iSmallWindowStrategy);
    }

    public final boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d6eba5", new Object[]{this})).booleanValue();
        }
        if (!qvs.Z() && u0() && up6.d0(vx9.d()) != VideoStatus.VIDEO_TIMESHIFT_STATUS && this.A0 && pvs.P0() && z3s.b("KEY_WINDOW_ZOOM_SWITCH", true)) {
            return z3s.b("KEY_ENABLE_SHOW_AUTO", true);
        }
        return false;
    }

    public final void t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa19b9d1", new Object[]{this});
        } else if (N1()) {
            this.S.remove(yj4.PARAM_WEB_VIEW_LAYER_URL);
            this.S.remove(yj4.PARAM_ITEM_HOLD_TYPE);
        }
    }

    @Override // tb.jyd
    public void u() {
        VideoInfo c0;
        LiveDetailMessinfoResponseData liveDetailMessinfoResponseData;
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b923d2", new Object[]{this});
        } else if (pvs.U2() && (c0 = up6.c0(vx9.d())) != null && c0.broadCaster != null) {
            LiveCommonTipsMsg liveCommonTipsMsg = new LiveCommonTipsMsg();
            liveCommonTipsMsg.userNick = yqq.d(gq0.i().getNick());
            liveCommonTipsMsg.userId = gq0.i().getUserId();
            if (vx9.d() == null || vx9.d().q() == null) {
                liveDetailMessinfoResponseData = null;
            } else {
                liveDetailMessinfoResponseData = vx9.d().q().f();
            }
            if (liveDetailMessinfoResponseData == null || (hashMap = liveDetailMessinfoResponseData.visitorIdentity) == null) {
                liveCommonTipsMsg.identify = c0.visitorIdentity;
            } else {
                liveCommonTipsMsg.identify = hashMap;
            }
            liveCommonTipsMsg.text = this.Q.getString(R.string.taolive_bulk_hint);
            liveCommonTipsMsg.bgColor = "#ff2851";
            InteractBusiness.l(c0.liveId, c0.broadCaster.accountId, c0.topic, PowerMsgType.commonTipsMsg, JSON.toJSONString(liveCommonTipsMsg), null, null, e7w.i(null));
        }
    }

    public final boolean u0() {
        VideoInfo c0;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b685c6ea", new Object[]{this})).booleanValue();
        }
        cba cbaVar = this.a0;
        if ((cbaVar != null && !cbaVar.N()) || !yqq.i(this.S.get(yj4.PARAM_MINILIVE_ENABLE_SHOW), true) || (c0 = up6.c0(vx9.d())) == null || (i2 = c0.status) == -1 || i2 == 3 || i2 == 4 || c0.closeXiaochuang) {
            return false;
        }
        ux9 d2 = vx9.d();
        if (!(d2 instanceof cdr) || !((cdr) d2).a1()) {
            return true;
        }
        m1("checkZoomWindowAbility isLivePunish被拉停，不展示小窗");
        return false;
    }

    public final void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7966d9c3", new Object[]{this});
            return;
        }
        rbu.E(this.a0, this.Q);
        rbu.C(this.a0, this.Q);
        rbu.m0(this.a0, this.Q, "Page_TaobaoLiveWatch");
    }

    @Override // tb.jyd
    public void v(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ec3811", new Object[]{this, onClickListener});
            return;
        }
        m1("setClickCloseRoomListener");
        this.u0 = onClickListener;
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76627729", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.R;
        if (viewGroup instanceof RightDrawerLayout) {
            ((RightDrawerLayout) viewGroup).openDrawer();
        }
    }

    public final void v1(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcef3c60", new Object[]{this, new Boolean(z)});
            return;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null) {
            z2 = up6.w0(c0, vx9.c());
        }
        if (c0 != null && !c0.closeUpAndDownSlide) {
            if ((z2 && !pvs.B2()) || this.W) {
                return;
            }
            if (!up6.v0(vx9.d()) || l1(this.Q)) {
                T1(z);
            }
        }
    }

    public final void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac1c3e8", new Object[]{this});
            return;
        }
        cba cbaVar = this.a0;
        String str = this.p0;
        String str2 = this.n;
        rbu.c(cbaVar, str, str2, "liveoprt_id=" + this.w);
        this.V = System.currentTimeMillis();
    }

    @Override // tb.jyd
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e6b4d6", new Object[]{this});
            return;
        }
        yir yirVar = this.B;
        if (yirVar != null) {
            yirVar.t(this.Q);
        }
    }

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4647525", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.Q).inflate(R.layout.taolive_activity_video_2, (ViewGroup) null);
        if (nqo.f(this.a0)) {
            RightDrawerLayout rightDrawerLayout = new RightDrawerLayout(this.Q, null);
            this.R = rightDrawerLayout;
            rightDrawerLayout.addView(viewGroup, new ViewGroup.MarginLayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(this.Q);
            linearLayout.setGravity(GravityCompat.END);
            linearLayout.setBackgroundColor(Color.parseColor("#66000000"));
            linearLayout.setId(R.id.taolive_drawer_container);
            linearLayout.setOrientation(1);
            this.R.addView(linearLayout, new ViewGroup.MarginLayoutParams(-1, -1));
            return;
        }
        this.R = viewGroup;
    }

    @Override // tb.jyd
    public void z(muk mukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85e17f", new Object[]{this, mukVar});
        } else {
            this.w0 = mukVar;
        }
    }

    public final void z0() {
        String str = ibt.CLASS_MAPPING.get(this.f0);
        if (!TextUtils.isEmpty(str)) {
            try {
                Class<?> cls = Class.forName(str);
                this.g0 = (x3d) cls.getMethod("createLiveCustomView", ViewGroup.class).invoke(cls.newInstance(), this.R.findViewById(R.id.taolive_drawer_container));
            } catch (Exception e2) {
                o3s.c("TaoLiveRealController", "createComponentWithContext", e2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements r6t {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.r6t
        public ArrayList c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("c9056293", new Object[]{this});
            }
            if (TaoLiveRealController.j0(TaoLiveRealController.this) != null) {
                return TaoLiveRealController.j0(TaoLiveRealController.this).l();
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
            sjr.g().c("taolive.more.live.status", "GONE", TaoLiveRealController.this.observeUniqueIdentification());
            if (TaoLiveRealController.g0(TaoLiveRealController.this) != null && !up6.s0(vx9.d())) {
                TaoLiveRealController.g0(TaoLiveRealController.this).setVisibility(0);
            }
            TaoLiveRealController.h0(TaoLiveRealController.this, false);
            TaoLiveRealController.this.T1(true);
            TaoLiveRealController.i0(TaoLiveRealController.this, false);
        }

        @Override // tb.r6t
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5c4ec32", new Object[]{this});
                return;
            }
            sjr.g().c("taolive.more.live.status", "VISIBLE", TaoLiveRealController.this.observeUniqueIdentification());
            if (TaoLiveRealController.g0(TaoLiveRealController.this) != null) {
                TaoLiveRealController.g0(TaoLiveRealController.this).setVisibility(8);
            }
            TaoLiveRealController.h0(TaoLiveRealController.this, true);
            TaoLiveRealController.this.T1(false);
            TaoLiveRealController.i0(TaoLiveRealController.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f13171a;

            public a(View view) {
                this.f13171a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f13171a.setAlpha(1.0f);
                }
            }
        }

        public m() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            WindowInsets rootWindowInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            v2s.o().A().a("TBLive", "onLayoutChange ========= ");
            if (TaoLiveRealController.M(TaoLiveRealController.this) == null) {
                TaoLiveRealController taoLiveRealController = TaoLiveRealController.this;
                rootWindowInsets = TaoLiveRealController.W(taoLiveRealController).getWindow().getDecorView().getRootWindowInsets();
                TaoLiveRealController.N(taoLiveRealController, rootWindowInsets);
                cwd A = v2s.o().A();
                A.a("TBLive", "mInsets ========= " + TaoLiveRealController.M(TaoLiveRealController.this));
                if (nxq.b(TaoLiveRealController.W(TaoLiveRealController.this)) && TaoLiveRealController.M(TaoLiveRealController.this) != null) {
                    TaoLiveRealController taoLiveRealController2 = TaoLiveRealController.this;
                    TaoLiveRealController.P(taoLiveRealController2, nxq.r(TaoLiveRealController.W(taoLiveRealController2), TaoLiveRealController.M(TaoLiveRealController.this)));
                    iba.M0(TaoLiveRealController.O(TaoLiveRealController.this), TaoLiveRealController.C(TaoLiveRealController.this));
                    if (TaoLiveRealController.O(TaoLiveRealController.this)) {
                        TaoLiveRealController taoLiveRealController3 = TaoLiveRealController.this;
                        TaoLiveRealController.R(taoLiveRealController3, nxq.g(TaoLiveRealController.W(taoLiveRealController3), TaoLiveRealController.M(TaoLiveRealController.this)));
                        cwd A2 = v2s.o().A();
                        A2.a("TBLive", "mCutoutHeight = " + TaoLiveRealController.Q(TaoLiveRealController.this));
                        if (iws.b()) {
                            TaoLiveRealController taoLiveRealController4 = TaoLiveRealController.this;
                            TaoLiveRealController.T(taoLiveRealController4, TaoLiveRealController.S(taoLiveRealController4) + TaoLiveRealController.Q(TaoLiveRealController.this));
                        }
                        iba.Y(Math.max(TaoLiveRealController.S(TaoLiveRealController.this), TaoLiveRealController.Q(TaoLiveRealController.this)), TaoLiveRealController.C(TaoLiveRealController.this));
                        iba.b1(TaoLiveRealController.Q(TaoLiveRealController.this), TaoLiveRealController.C(TaoLiveRealController.this));
                        TaoLiveRealController taoLiveRealController5 = TaoLiveRealController.this;
                        TaoLiveRealController.R(taoLiveRealController5, Math.max(TaoLiveRealController.S(taoLiveRealController5), TaoLiveRealController.Q(TaoLiveRealController.this)));
                        TaoLiveRealController.U(TaoLiveRealController.this);
                    } else if (TaoLiveRealController.S(TaoLiveRealController.this) > 0) {
                        if (iws.b()) {
                            TaoLiveRealController taoLiveRealController6 = TaoLiveRealController.this;
                            TaoLiveRealController.T(taoLiveRealController6, TaoLiveRealController.S(taoLiveRealController6) + xca.c);
                        }
                        iba.M0(true, TaoLiveRealController.C(TaoLiveRealController.this));
                        iba.Y(TaoLiveRealController.S(TaoLiveRealController.this), TaoLiveRealController.C(TaoLiveRealController.this));
                        iba.b1(0, TaoLiveRealController.C(TaoLiveRealController.this));
                        TaoLiveRealController.U(TaoLiveRealController.this);
                    } else {
                        iba.M0(false, TaoLiveRealController.C(TaoLiveRealController.this));
                        iba.Y(0, TaoLiveRealController.C(TaoLiveRealController.this));
                        iba.b1(0, TaoLiveRealController.C(TaoLiveRealController.this));
                        TaoLiveRealController.U(TaoLiveRealController.this);
                    }
                } else if (TaoLiveRealController.S(TaoLiveRealController.this) > 0) {
                    iba.M0(true, TaoLiveRealController.C(TaoLiveRealController.this));
                    iba.Y(TaoLiveRealController.S(TaoLiveRealController.this), TaoLiveRealController.C(TaoLiveRealController.this));
                    iba.b1(0, TaoLiveRealController.C(TaoLiveRealController.this));
                    TaoLiveRealController.U(TaoLiveRealController.this);
                } else {
                    iba.M0(false, TaoLiveRealController.C(TaoLiveRealController.this));
                    iba.Y(0, TaoLiveRealController.C(TaoLiveRealController.this));
                    iba.b1(0, TaoLiveRealController.C(TaoLiveRealController.this));
                    TaoLiveRealController.U(TaoLiveRealController.this);
                }
                gmr.a(TaoLiveRealController.C(TaoLiveRealController.this));
                if (TaoLiveRealController.F(TaoLiveRealController.this) != null) {
                    View findViewById = TaoLiveRealController.F(TaoLiveRealController.this).findViewById(R.id.taolive_close_btn);
                    findViewById.postDelayed(new a(findViewById), 100L);
                }
                TaoLiveRealController.W(TaoLiveRealController.this).getWindow().getDecorView().removeOnLayoutChangeListener(this);
            }
        }
    }

    public static void H1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586c4111", new Object[]{context});
            return;
        }
        FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, context);
        FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, context);
        d9m.n().setActionAdapter(new xfj());
        d9m.n().setNavAdapter(new agj());
        d9m.n().setTrackAdapter(new mgj());
        d9m.n().setH5TabFrameAdapter(d9m.p().createGoodsH5TabFrameAdapter());
        d9m.n().setGoodFrameAdapter(new xda());
    }

    public final void E0() {
        Map<String, String> map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afedc23", new Object[]{this});
            return;
        }
        if (hjr.E("enableReopenShopWindow", true) && (map = this.S) != null && yqq.i(map.get("needReopenShopWindow"), true) && (str = this.S.get("reopenUrl")) != null) {
            String decode = Uri.decode(str);
            if (!TextUtils.isEmpty(decode)) {
                Nav.from(this.Q).toUri(decode);
            }
        }
        if (phr.a(this.a0) && this.x0 == null) {
            this.Q.finish();
        }
    }

    public final void F1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73c57bb", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b("TaoLiveRealController", "setCanShowPopFlag，setCanShowPopFlag发送事件");
        slq.b(vx9.d(), !z);
    }

    public final void O0(boolean z, Object obj) {
        yir yirVar;
        RecModel f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbc1022", new Object[]{this, new Boolean(z), obj});
            return;
        }
        x5t.h("AutoDownController", "receive EVENT_AUTO_DOWN mIsMoreLive = " + this.W);
        if (this.b != null && this.c != null && this.d != null && (yirVar = this.B) != null && !this.W && this.a0.I && (f2 = yirVar.f()) != null && (obj instanceof String) && obj.equals(f2.liveId) && this.m == 0) {
            x5t.h("AutoDownController", "smoothScrollToPosition liveId = " + f2.liveId);
            int i2 = this.B.i();
            if (z) {
                i2++;
            } else if (i2 > 0) {
                i2--;
            }
            if (this.d.getItemCount() > i2) {
                this.z0 = true;
                T1(true);
                this.b.smoothScrollToPosition(i2);
            }
        }
    }

    public final void P0(boolean z) {
        yir yirVar;
        RecModel f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a149bc58", new Object[]{this, new Boolean(z)});
            return;
        }
        x5t.h("AutoDownSlowlyController", "mIsMoreLive = " + this.W);
        if (this.b != null && this.c != null && this.d != null && (yirVar = this.B) != null && !this.W && this.a0.I && (f2 = yirVar.f()) != null && this.m == 0) {
            x5t.h("AutoDownSlowlyController", "smoothScrollToPosition liveId = " + f2.liveId);
            int i2 = this.B.i();
            if (z) {
                i2++;
            } else if (i2 > 0) {
                i2--;
            }
            if (this.d.getItemCount() > i2) {
                this.z0 = true;
                T1(true);
                this.c.startSmoothScroll(I0(i2));
            }
        }
    }

    public final void R1(TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        jbt jbtVar;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fad8cd", new Object[]{this, taoliveOpenLiveRoom});
        } else if (taoliveOpenLiveRoom != null && (jbtVar = taoliveOpenLiveRoom.taoliveOpenContext) != null && (map = jbtVar.f) != null) {
            this.a0.J = map.get("utPage");
            this.f0 = yqq.g(taoliveOpenLiveRoom.taoliveOpenContext.f.get("OpenWatchType"));
            Object obj = taoliveOpenLiveRoom.taoliveOpenContext.f.get("enableReplayStatusShowLiveEnd");
            if (obj instanceof Boolean) {
                this.a0.K = ((Boolean) obj).booleanValue();
            }
            if (!TextUtils.isEmpty(this.f0)) {
                this.a0.K = true;
            }
        }
    }

    public final void Y0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4147ee48", new Object[]{this, frameLayout});
            return;
        }
        LayoutInflater.from(this.Q).inflate(d9m.l().getRealRIdMap().get(IFullScreenProxy.R_LAYOUT_TAOLIVE_CLOSE_BTN_LAYOUT).intValue(), frameLayout);
        frameLayout.setImportantForAccessibility(2);
        View findViewById = frameLayout.findViewById(d9m.l().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_MORE_BTN).intValue());
        View findViewById2 = frameLayout.findViewById(d9m.l().getRealRIdMap().get(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN).intValue());
        NewStyleUtils.b(this.Q, frameLayout, NewStyleUtils.NewStyleType.SMALL);
        if (!(findViewById == null || findViewById2 == null)) {
            ((ImageView) findViewById).setImageResource(R.drawable.taolive_room_new_style_topbar_more_flexalocal);
            ((ImageView) findViewById2).setImageResource(R.drawable.taolive_room_new_style_topbar_close_flexalocal);
        }
        if (!(findViewById == null || findViewById2 == null)) {
            findViewById.getLayoutParams().width = hw0.b(this.Q, 16.0f);
            findViewById.getLayoutParams().height = hw0.b(this.Q, 16.0f);
            findViewById2.getLayoutParams().width = hw0.b(this.Q, 16.0f);
            findViewById2.getLayoutParams().height = hw0.b(this.Q, 16.0f);
        }
        if (findViewById != null) {
            ViewProxy.setOnClickListener(findViewById, new c());
        }
        if (pvs.p1() && findViewById2 != null) {
            ViewProxy.setOnClickListener(findViewById2, this);
        }
        if (findViewById2 != null) {
            findViewById2.setContentDescription("关闭");
        }
        if (findViewById != null) {
            findViewById.setContentDescription(sqj.MORE_BUTTON);
        }
        v60.a(findViewById2);
        v60.a(findViewById);
    }

    public final void b1(Uri uri) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dbfc3f7", new Object[]{this, uri});
            return;
        }
        String queryParameter = uri.getQueryParameter(yj4.PARAM_IS_LIVE_MUTE);
        m1("initMute preMute = " + queryParameter);
        if (TextUtils.isEmpty(queryParameter)) {
            z = bte.f();
        } else {
            z = yqq.h(queryParameter);
        }
        m1("initMute result liveRoomMute = " + z);
        cba cbaVar = this.a0;
        if (cbaVar != null) {
            cbaVar.o0(z, true);
        }
    }

    public boolean j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97890f26", new Object[]{this})).booleanValue();
        }
        if (vx9.d() == null || vx9.d().x() == null) {
            return false;
        }
        boolean J = vx9.d().x().J();
        m1("小窗isInSmallMode：" + J);
        return J;
    }

    @Override // tb.jyd
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        m1("onDestroy");
        B0(false);
        this.a0.destroy();
        Activity activity = this.Q;
        if (activity != null) {
            rir.n(activity.hashCode());
        }
        mcd mcdVar = this.r0;
        if (mcdVar != null) {
            mcdVar.a(false);
            o3s.b("TaoLiveRealController", "BottomSlideNewGuide 上下滑框架destroy 冒头直播背景流播放器销毁");
        }
    }

    @Override // tb.jyd
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        m1("onStop");
        BaseListAdapter baseListAdapter = this.d;
        if (baseListAdapter != null) {
            baseListAdapter.U(z);
        }
        cba cbaVar = this.a0;
        rbu.j(cbaVar, "stay", "time=" + M0());
        this.V = System.currentTimeMillis();
    }

    public final void r0(boolean z) {
        String C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6974a1f", new Object[]{this, new Boolean(z)});
            return;
        }
        up6.c(null, VideoStatus.VIDEO_NORMAL_STATUS);
        if (!e7w.a(null)) {
            d6q d6qVar = this.h0;
            if (d6qVar != null) {
                d6qVar.f();
            }
            u1();
            this.S.put(yj4.PARAM_BACK_TO_LIVE, "true");
            this.S.remove(yj4.PARAM_GOOD_INFO_JSON);
            this.S.remove(yj4.PARAM_SJSD_ITEM_ID);
            this.S.remove(yj4.PARAM_TIMEMOVING_ITEM_ID);
            this.S.remove(yj4.PARAM_TIME_PLAY_URL);
            this.S.remove("keyPointId");
            this.S.remove(yj4.PARAM_TIMEMOVE_SINGLE_CARD);
            this.S.remove(yj4.PARAM_CUSTOM_PLAY_CTRL);
            this.S.remove(yj4.PARAM_PLAY_VIEW_TOKEN);
            this.S.remove("timeMovingSpfPlayVideo");
            this.S.remove("timeMovingPcmIdParam");
            this.S.remove("highlightSignByRePlay");
            this.S.remove(yj4.PRE_REQUEST_TIME_MOVE_KEY);
            this.S.remove(yj4.PARAM_PRODUCT_TYPE);
            naj najVar = this.Y;
            if (najVar != null) {
                najVar.b();
            }
            e7w.e(vx9.d(), true, null);
            Q0();
            if (this.h0 != null) {
                if (pvs.p()) {
                    this.q = this.S.get("livesource");
                    C = u90.e(this.n) + "&livesource=" + this.q;
                } else {
                    C = iba.C(this.a0);
                }
                this.h0.e(false, C, iba.o(this.a0), this.q, this.n, this.o);
            }
            V0(true, true);
        }
    }

    public void w1(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eb03cf", new Object[]{this, uri, new Boolean(z)});
            return;
        }
        m1("refresh");
        t(uri, z, false);
    }

    public final void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fbe4fc", new Object[]{this});
            return;
        }
        cba cbaVar = this.a0;
        rbu.j(cbaVar, "stay", "time=" + M0());
        this.V = System.currentTimeMillis();
        rbu.e(this.a0, null, new String[0]);
    }

    public final void x1(String str, String str2, String str3, String str4, Map<String, String> map, boolean z, boolean z2, boolean z3) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d4c439", new Object[]{this, str, str2, str3, str4, map, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (this.q0) {
            m1("refresh but isDestroyed");
        } else {
            ViewGroup viewGroup = this.R;
            if (viewGroup instanceof RightDrawerLayout) {
                ((RightDrawerLayout) viewGroup).closeDrawer();
            }
            String str6 = map.get(yj4.PARAM_TIMEMOVING_ITEM_ID);
            Map<String, String> map2 = this.S;
            String str7 = map2 != null ? map2.get(yj4.PARAM_TIMEMOVING_ITEM_ID) : null;
            if (!TextUtils.isEmpty(str2) && str2.equals(this.o) && !z && (TextUtils.isEmpty(str6) || str6.equals(str7))) {
                return;
            }
            if (TextUtils.isEmpty(str) || !str.equals(this.n) || z || (!TextUtils.isEmpty(str6) && !str6.equals(str7))) {
                d6q d6qVar = this.h0;
                if (d6qVar != null) {
                    d6qVar.f();
                }
                p1(z2, true);
                if (!z3 || !pvs.R1()) {
                    m1("refresh isRefreshAllData = false");
                    this.S = map;
                    IBottomProxy.a aVar = this.b0;
                    if (aVar != null) {
                        aVar.a(map, str);
                    }
                    cba cbaVar = this.a0;
                    cbaVar.P = str4;
                    iba.U(null, cbaVar);
                } else {
                    m1("refresh isRefreshAllData = true");
                    Intent intent = new Intent();
                    intent.setData(this.Z);
                    d1(intent);
                    y1(this.Q, str3, this.U);
                }
                qmh.f().f.b("liveRoom", "query", this.S);
                q1(z2, true);
                this.n = str;
                this.o = str2;
                this.q = str3;
                U0(true);
                if (this.h0 != null) {
                    if (pvs.n0()) {
                        str5 = this.S.get(yj4.PARAM_INTENT_URL);
                    } else {
                        Uri uri = this.Z;
                        if (uri != null) {
                            str5 = uri.toString();
                        } else {
                            str5 = "";
                        }
                    }
                    this.h0.e(false, str5, iba.o(this.a0), this.q, this.n, this.o);
                }
            }
        }
    }

    public final void y1(Activity activity, String str, String str2) {
        String str3;
        Bundle extras;
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0278a55", new Object[]{this, activity, str, str2});
            return;
        }
        if (!(activity == null || activity.getIntent() == null || (uri = this.Z) == null)) {
            iba.Y0(uri.toString(), this.a0);
        }
        iba.d1(str2, this.a0);
        iba.T0(this.S, this.a0);
        iba.W0(this.q, this.a0);
        iba.r1(this.S.get(yj4.PARAM_USE_CDN), this.a0);
        String str4 = null;
        iba.l0(null, this.a0);
        iba.g0(this.a0, true);
        iba.h0(true, this.a0);
        iba.p0(str, this.a0);
        iba.U0(this.S.get(yj4.PARAM_LIVE_IS_AD), this.a0);
        String C = iba.C(this.a0);
        if (!TextUtils.isEmpty(C)) {
            Uri uri2 = this.Z;
            if (uri2 == null) {
                uri2 = Uri.parse(C);
            }
            iba.r0(uri2.getQueryParameter(yj4.PARAM_PVID), this.a0);
            iba.k0(uri2.getQueryParameter("feedId"), this.a0);
            iba.j0(uri2.getQueryParameter("contentId"), this.a0);
            iba.i0(uri2.getQueryParameter("accountId"), this.a0);
            iba.o0(uri2.getQueryParameter(yj4.PARAM_LIVESCM), this.a0);
            String queryParameter = uri2.getQueryParameter(yj4.PARAM_UT_PARAMS);
            if (activity == null || activity.getIntent() == null || (extras = activity.getIntent().getExtras()) == null) {
                str3 = null;
            } else {
                str4 = extras.getString(yj4.PARAM_UT_PARAMS);
                str3 = extras.getString(yj4.PARAM_ENTRY_UT_PARAM);
            }
            if (!TextUtils.isEmpty(str4)) {
                queryParameter = str4;
            }
            if (!pvs.U0() || !TextUtils.isEmpty(queryParameter)) {
                str3 = queryParameter;
            } else if (TextUtils.isEmpty(str3)) {
                str3 = uri2.getQueryParameter(yj4.PARAM_ENTRY_UT_PARAM);
            }
            iba.z0(Uri.encode(str3), this.a0);
            this.S.put(yj4.PARAM_UT_PARAMS, str3);
            iba.S0(uri2.getQueryParameter("liveBucket"), this.a0);
            iba.Q0(uri2.getQueryParameter("liveAbid"), this.a0);
            iba.u0(uri2.getQueryParameter("scmPre"), this.a0);
            iba.x0(uri2.getQueryParameter("spmPre"), this.a0);
            iba.A0(Uri.encode(uri2.getQueryParameter("utparamPre")), this.a0);
            iba.q0(uri2.getQueryParameter("livesourcePre"), this.a0);
            iba.g1(uri2.getQueryParameter("singleLiveTabSessionId"), this.a0);
            if (TextUtils.isEmpty(iba.H(this.a0))) {
                iba.g1(UTDevice.getUtdid(activity) + "_" + System.currentTimeMillis(), this.a0);
            }
            iba.n0(cxg.d(uri2.getQueryParameter("liveItemId"), str, str3), this.a0);
        }
        iba.s0(this.S.get("queryKey"), this.a0);
        iba.w0(this.S.get("spm"), this.a0);
        iba.t0(this.S.get("scm"), this.a0);
        if (this.S.get("traceId") != null) {
            iba.y0(this.S.get("traceId"), this.a0);
        } else {
            iba.y0(this.S.get(zlr.PARAM_ENTRY_LIVE_TRACE_ID), this.a0);
        }
        iba.m1(0L, this.a0);
        iba.P0(N0(), this.a0);
        this.a0.O = true;
    }

    public final void B0(boolean z) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecf0b73", new Object[]{this, new Boolean(z)});
        } else if (!this.q0) {
            this.q0 = true;
            this.x0 = null;
            rbu.e(this.a0, null, new String[0]);
            ISmartLayerServiceProxy.a aVar = this.a0.v;
            if (aVar != null && (aVar instanceof ISmartLayerServiceProxy.c)) {
                ((ISmartLayerServiceProxy.c) aVar).e(this.Q);
            }
            d6q d6qVar = this.h0;
            if (d6qVar != null) {
                d6qVar.f();
                this.h0.b();
                this.h0 = null;
            }
            ((dba) this.a0).k0 = null;
            w36.k().c();
            tbt.c().b();
            O1();
            ppv.c(this.Q).f();
            ppv.c(this.Q).b();
            hnr.a(false);
            m09.e().a();
            A1();
            v2s.o().k().destroy();
            x3d x3dVar = this.g0;
            if (x3dVar != null) {
                x3dVar.onDestroy();
                this.g0 = null;
            }
            sjr sjrVar = this.F;
            if (sjrVar != null) {
                sjrVar.b(this);
                this.F = null;
            }
            if (this.d0 != null) {
                sjr.g().b(this.d0);
            }
            yir yirVar = this.B;
            if (yirVar != null) {
                yirVar.z();
            }
            try {
                TaoLiveRecyclerView taoLiveRecyclerView = this.b;
                if (taoLiveRecyclerView != null) {
                    taoLiveRecyclerView.setAdapter(null);
                }
            } catch (Exception e2) {
                o3s.b("TaoLiveRealController", "mRecyclerView.setAdapter null error:" + e2.getMessage());
            }
            cba cbaVar = this.a0;
            if (!(cbaVar == null || cbaVar.s() == null || !(this.a0.s() instanceof u7e))) {
                ((u7e) this.a0.s()).onDestroy();
                this.a0.K(null);
            }
            iws iwsVar = this.c0;
            if (iwsVar != null) {
                iwsVar.a();
                this.c0 = null;
            }
            if (TextUtils.equals(B0, toString())) {
                v2s.o().A().a("TBLiveXXX", "onDestroy same instance");
                e7w.d(this.a0.g());
                kmr kmrVar = this.A;
                if (kmrVar != null) {
                    kmrVar.c();
                    this.A = null;
                }
            } else {
                v2s.o().A().a("TBLiveXXX", "onDestroy not same instance");
            }
            naj najVar = this.Y;
            if (najVar != null) {
                najVar.a();
                this.Y = null;
            }
            iba.p1(null, this.a0);
            iba.j1(null, this.a0);
            iba.v1(null, this.a0);
            iba.O(null, this.a0);
            iba.s1(null, this.a0);
            iba.Z0("", this.a0);
            t0u.a();
            vx9.b(this.a0.g());
            q0("QuitRoom");
            if (hw0.l()) {
                d9m.j().destroyDebugPanel(this.Q);
            }
            if (!(!nqo.d() || (activity = this.Q) == null || activity.getWindow() == null)) {
                this.Q.getWindow().clearFlags(128);
            }
            v3d v3dVar = this.j0;
            if (v3dVar != null) {
                v3dVar.destroy();
            }
        }
    }

    public final boolean N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21c88e70", new Object[]{this})).booleanValue();
        }
        if (!this.S.containsKey(yj4.PARAM_ITEM_HOLD_TYPE) || !this.S.containsKey(yj4.PARAM_WEB_VIEW_LAYER_URL) || !"showWebViewLayer".equals(this.S.get(yj4.PARAM_ITEM_HOLD_TYPE))) {
            return false;
        }
        String str = this.S.get(yj4.PARAM_WEB_VIEW_LAYER_URL);
        Uri parse = Uri.parse(Uri.decode(str));
        IInteractiveProxy.k createTaoLiveWebBottomFragment = d9m.p().createTaoLiveWebBottomFragment();
        if (parse.getQueryParameter("maxHeight") != null) {
            createTaoLiveWebBottomFragment.b(Float.parseFloat(parse.getQueryParameter("maxHeight")));
        }
        if (parse.getQueryParameter("panEnable") != null) {
            createTaoLiveWebBottomFragment.d(Boolean.parseBoolean(parse.getQueryParameter("panEnable")));
        }
        nkr nkrVar = new nkr(this.Q, "Waitou_LiveRoomHalf", new w54(), new w44(), new String[]{f9f.a()});
        createTaoLiveWebBottomFragment.c(nkrVar);
        createTaoLiveWebBottomFragment.a(this.Q);
        BottomSheetDialogFragment build = createTaoLiveWebBottomFragment.build();
        Activity activity = this.Q;
        if (activity instanceof FragmentActivity) {
            nkrVar.k(str);
            new Handler().post(new b(build, (FragmentActivity) activity));
        }
        return true;
    }

    public void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        this.e = 0;
        this.j = true;
        BaseListAdapterV2 baseListAdapterV2 = new BaseListAdapterV2(this.Q);
        this.d = baseListAdapterV2;
        baseListAdapterV2.k0(this);
        if (hw0.l()) {
            Activity activity = this.Q;
            u0u.a(activity, "命中新数据管理器开关：" + qvs.c0() + ", 对齐标准生命周期开关：" + qvs.u());
        }
        this.d.X(this.a0);
        BaseListAdapter.a aVar = new BaseListAdapter.a();
        cba cbaVar = this.a0;
        if (!(cbaVar == null || cbaVar.r() == null)) {
            aVar.f13273a = OpenLiveSingleRoomVH.class;
        }
        aVar.b = R.layout.taolive_vh_liveroom;
        this.d.M(ContentType.Live.ordinal(), aVar);
        this.d.Y(this.Y);
        BaseListAdapter.a aVar2 = new BaseListAdapter.a();
        aVar2.f13273a = TaoLiveGoodCardVH.class;
        aVar2.b = R.layout.taolive_vh_good_card;
        this.d.M(ContentType.Good_Card.ordinal(), aVar2);
        TaoLiveRecyclerView taoLiveRecyclerView = this.b;
        if (taoLiveRecyclerView != null) {
            taoLiveRecyclerView.setAdapter(this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c1(boolean z) {
        GoodItem goodItem;
        HashMap hashMap;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7f4237", new Object[]{this, new Boolean(z)});
            return;
        }
        qvs.K0();
        iba.t1(null, this.a0);
        iba.R0(null, this.a0);
        iba.o1("", this.a0);
        iba.D0(false, this.a0);
        up6.O0(false, vx9.d());
        iba.U(G0(), this.a0);
        this.I = false;
        this.J = false;
        Map<String, String> map = this.S;
        if (map != null) {
            iba.a1(map.get("queryKey"), this.a0);
            iba.R0(this.S.get(yj4.PARAM_LIVE_AD_PARAMS), this.a0);
            sjr.g().e("com.taobao.taolive.room.querykey.change", iba.D(this.a0));
            if (TextUtils.isEmpty(this.S.get(yj4.PARAM_SJSD_ITEM_ID))) {
                String str = this.S.get(yj4.PARAM_GOOD_INFO_JSON);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        goodItem = (GoodItem) JSON.parseObject(str, GoodItem.class);
                    } catch (Exception unused) {
                    }
                    if (goodItem != null || TextUtils.isEmpty(goodItem.itemId)) {
                        hashMap = (HashMap) JSON.parseObject(this.S.get(yj4.PARAM_GOOD_INFO_WEITAO), HashMap.class);
                        if (hashMap != null && !TextUtils.isEmpty((CharSequence) hashMap.get("itemId"))) {
                            this.S.put(yj4.PARAM_SJSD_ITEM_ID, hashMap.get("itemId"));
                        }
                    } else {
                        this.S.put(yj4.PARAM_SJSD_ITEM_ID, goodItem.itemId);
                    }
                }
                goodItem = null;
                if (goodItem != null) {
                }
                hashMap = (HashMap) JSON.parseObject(this.S.get(yj4.PARAM_GOOD_INFO_WEITAO), HashMap.class);
                if (hashMap != null) {
                    this.S.put(yj4.PARAM_SJSD_ITEM_ID, hashMap.get("itemId"));
                }
            }
            this.r = this.S.get("spm");
            this.s = this.S.get("content");
            this.t = this.S.get("scm");
            this.u = this.S.get("trackInfo");
            this.w = this.S.get(yj4.PARAM_TRACK_LIVEOPRT_ID);
            this.v = this.S.get("clickid");
            if (!TextUtils.isEmpty(this.S.get("livesource"))) {
                this.q = this.S.get("livesource");
            }
            if (!z) {
                this.x = this.S.get(yj4.PARAM_SEARCH_KEYWORD_RN);
                this.y = this.S.get(yj4.PARAM_SEARCH_KEYWORD_POS);
            }
            String str2 = this.S.get(yj4.PARAM_HIDE_DYNAMIC);
            iba.F0(!TextUtils.isEmpty(str2) && Boolean.parseBoolean(str2), this.a0);
            String str3 = this.S.get(yj4.PARAM_HIDE_H5_DYNAMIC);
            if (TextUtils.isEmpty(str3) || !Boolean.parseBoolean(str3)) {
                z2 = false;
            }
            iba.H0(z2, this.a0);
            this.p = null;
            this.H = this.S.get(yj4.PARAM_TIME_PLAY_URL);
            try {
                String str4 = this.S.get(yj4.PARAM_CUSTOM_PLAY_CTRL);
                if (!TextUtils.isEmpty(str4)) {
                    this.p = mxf.e(str4);
                }
                JSONObject jSONObject = this.p;
                if (jSONObject != null && this.H == null) {
                    String string = jSONObject.getString("timeMovingUrl");
                    if (!TextUtils.isEmpty(string)) {
                        this.H = string;
                    }
                }
                this.O = (GoodItem) fkx.f(this.S.get(yj4.PARAM_GOOD_INFO_JSON), GoodItem.class);
                String str5 = this.S.get(yj4.PARAM_BACK_TO_LIVE);
                if (!v2s.o().I("timeShift") || TextUtils.equals("true", str5)) {
                    this.H = null;
                }
                GoodItem goodItem2 = this.O;
                if (goodItem2 != null) {
                    iba.o1(goodItem2.itemId, this.a0);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.z = false;
        iba.V(this.s, this.a0);
        iba.j1(this.r, this.a0);
        iba.p1(this.u, this.a0);
        iba.V0(this.w, this.a0);
        iba.R0(null, this.a0);
        iba.D0(false, this.a0);
    }

    @Override // tb.jyd
    public boolean d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd937839", new Object[]{this})).booleanValue();
        }
        if (this.I || this.J || this.K) {
            z = true;
        }
        m1("互动浮层是否展开：" + z);
        return z;
    }

    public final void n1(boolean z) {
        cba cbaVar;
        ISmartLandingProxy.b bVar;
        VideoInfo c0;
        yir yirVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0b684", new Object[]{this, new Boolean(z)});
            return;
        }
        cba cbaVar2 = this.a0;
        if (cbaVar2 != null && cbaVar2.f() != null && !this.a0.f().a()) {
            return;
        }
        if (!pvs.K0() || !tbt.c().d()) {
            if (this.X) {
                sjr.g().e("com.taobao.taolive.room.fandom.close_item_rank", Boolean.FALSE);
                this.X = false;
            } else if (this.I) {
                sjr.g().d("com.taobao.taolive.room.hide_goods_list");
            } else if (this.J) {
                sjr.g().d(uyg.EVENT_AVATAR_CARD__HIDE);
            } else if (this.K) {
                sjr.g().d(uyg.EVENT_HIDE_REWARD_PANEL);
            } else if (this.z) {
                sjr.g().d("com.taobao.taolive.room.mediaplatform_switch_to_portrait");
                this.z = false;
            } else {
                if (up6.d0(vx9.d()) == VideoStatus.VIDEO_TIMESHIFT_STATUS && pvs.i2() && (c0 = up6.c0(vx9.d())) != null && (c0.status == 0 || pvs.G1())) {
                    cba cbaVar3 = this.a0;
                    if ((cbaVar3 instanceof dba) && !((dba) cbaVar3).h0 && (yirVar = this.B) != null && yirVar.i() == 0) {
                        if (this.S != null) {
                            String str = "timemoveReturn";
                            if (this.a0 != null && uwa.p() && !TextUtils.isEmpty(this.a0.F)) {
                                str = "timemoveReturn." + this.a0.F;
                            }
                            this.S.put("livesource", str);
                        }
                        r0(false);
                        rbu.H(this.a0, z9u.CALCK_SHIFTTIME, null);
                        return;
                    }
                }
                if (pvs.e() && (cbaVar = this.a0) != null && (bVar = cbaVar.u) != null && bVar.g("leave", new f(this))) {
                    return;
                }
                if (z) {
                    cir.a("TBLiveService", "KeyBackDown event");
                    if (!t0() || vx9.d() == null || vx9.d().F()) {
                        D0();
                        return;
                    }
                    L1(true, "KeyBackDown");
                    cir.a("TBLiveService", "KeyBackDown showGlobalMiniWindow");
                    return;
                }
                D0();
            }
        } else if (tbt.c().e() != null) {
            tbt.c().e().b();
        }
    }

    @Override // tb.jyd
    public void onConfigurationChanged(Configuration configuration) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        m1("onConfigurationChanged");
        if (this.G != configuration.orientation) {
            sjr g2 = sjr.g();
            if (configuration.orientation == 0) {
                str = "landscape";
            } else {
                str = "portrait";
            }
            g2.e(uyg.EVENT_SCREEN_ORIENTATION_CHANGED, str);
            this.G = configuration.orientation;
            if (vc.a() && (vc.i(this.Q) || vc.d(this.Q))) {
                this.f = 0;
                this.I = false;
                this.J = false;
                this.K = false;
                T1(true);
            }
            m0();
        }
    }

    @Override // tb.jyd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        m1("onPause");
        p1(true, false);
    }

    @Override // tb.jyd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        m1("onResume");
        q1(true, false);
    }

    @Override // tb.jyd
    public void t(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67628e5", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
            return;
        }
        m1("refresh");
        Map<String, String> e2 = rnv.e(uri);
        String queryParameter = uri.getQueryParameter(yj4.PARAM_LIVE_ROOM_SPM_PARAM);
        boolean booleanQueryParameter = (!pvs.C() || uri.getBooleanQueryParameter(yj4.PARAM_ENTRY_QUERY_KEEP_LAST, false)) ? uri.getBooleanQueryParameter(yj4.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, false) : true;
        this.Z = uri;
        if (e2 != null) {
            x1(e2.get("id"), e2.get("userId"), e2.get("livesource"), queryParameter, e2, z, z2, booleanQueryParameter);
        }
    }

    @Override // tb.jyd
    public void y(Intent intent, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d7315", new Object[]{this, intent, new Boolean(z)});
            return;
        }
        m1("refresh");
        if (intent != null) {
            Uri data = intent.getData();
            Map<String, String> e2 = rnv.e(data);
            this.Z = data;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                E1(extras);
            } else {
                iba.R0(null, this.a0);
            }
            String queryParameter = data != null ? data.getQueryParameter(yj4.PARAM_LIVE_ROOM_SPM_PARAM) : null;
            if (data != null) {
                z2 = (!pvs.C() || data.getBooleanQueryParameter(yj4.PARAM_ENTRY_QUERY_KEEP_LAST, false)) ? data.getBooleanQueryParameter(yj4.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, false) : true;
            } else {
                z2 = false;
            }
            if (e2 != null) {
                cba cbaVar = this.a0;
                if (cbaVar != null) {
                    cbaVar.n = false;
                }
                x1(e2.get("id"), e2.get("userId"), e2.get("livesource"), queryParameter, e2, z, false, z2);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r6.equals("tab") == false) goto L_0x0047;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z1(java.util.Map r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.taolive.room.controller2.TaoLiveRealController.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "3fdd6fc3"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            tb.cba r3 = r5.a0
            if (r3 == 0) goto L_0x007a
            boolean r3 = r3.R()
            if (r3 == 0) goto L_0x007a
            java.lang.String r3 = "type"
            java.lang.Object r6 = r6.get(r3)
            r3 = 0
            java.lang.String r6 = tb.sr4.e(r6, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x007a
            boolean r3 = r5.q0
            if (r3 != 0) goto L_0x007a
            boolean r3 = r5.j1()
            if (r3 == 0) goto L_0x003c
            goto L_0x007a
        L_0x003c:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1332194002: goto L_0x005f;
                case 114581: goto L_0x0055;
                case 3433103: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            r0 = -1
            goto L_0x0069
        L_0x0049:
            java.lang.String r0 = "page"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0053
            goto L_0x0047
        L_0x0053:
            r0 = 2
            goto L_0x0069
        L_0x0055:
            java.lang.String r1 = "tab"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0069
            goto L_0x0047
        L_0x005f:
            java.lang.String r0 = "background"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0068
            goto L_0x0047
        L_0x0068:
            r0 = 0
        L_0x0069:
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x006d;
                case 2: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x007a
        L_0x006d:
            tb.l6m r6 = tb.l6m.c()
            tb.cba r0 = r5.a0
            java.lang.String r0 = r0.g()
            r6.e(r0)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.controller2.TaoLiveRealController.z1(java.util.Map):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:143:0x073f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final void d1(android.content.Intent r37) {
        /*
            Method dump skipped, instructions count: 2237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.controller2.TaoLiveRealController.d1(android.content.Intent):void");
    }

    public final void R0(RecModel recModel, boolean z) {
        LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        String str;
        Map<String, String> map;
        String str2;
        String str3;
        String str4;
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6053a970", new Object[]{this, recModel, new Boolean(z)});
        } else if (recModel != null) {
            LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo = recModel.alimama;
            if (alimamaInfo != null) {
                iba.v1(alimamaInfo, this.a0);
                LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo2 = recModel.alimama;
                if (alimamaInfo2 != null) {
                    ls0.a(alimamaInfo2.ifsUrl, alimamaInfo2.pid, "liveUpAndDown");
                    AdMonitorBusiness adMonitorBusiness = this.i0;
                    if (adMonitorBusiness != null) {
                        adMonitorBusiness.K(recModel.alimama.pid, "impression", "");
                    }
                }
            } else {
                iba.v1(null, this.a0);
            }
            LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo22 = recModel.adTransParams;
            if (alimamaInfo22 != null) {
                iba.O(alimamaInfo22, this.a0);
            } else {
                iba.O(null, this.a0);
            }
            rbu.H(this.a0, z9u.CLICK_SWITCHROOM, this.r);
            if (!TextUtils.isEmpty(recModel.actionUrl)) {
                if (!recModel.actionUrl.contains("spm=")) {
                    String str5 = "a2141.8001249";
                    if (!iws.c() || (map = recModel.initParams) == null) {
                        if (!TextUtils.isEmpty(this.a0.P)) {
                            str5 = this.a0.P;
                        }
                        if (recModel.actionUrl.contains("?")) {
                            recModel.actionUrl += "&spm=" + str5;
                        } else {
                            recModel.actionUrl += "?spm=" + str5;
                        }
                        Map<String, String> map3 = recModel.initParams;
                        if (map3 != null) {
                            map3.put("spm", str5);
                        }
                    } else {
                        String str6 = map.get(iws.PARAM_LIVEHOME_SPM);
                        if (TextUtils.isEmpty(str6) && (map2 = this.S) != null) {
                            str6 = map2.get(iws.PARAM_LIVEHOME_SPM);
                        }
                        if (recModel.actionUrl.contains("?")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(recModel.actionUrl);
                            if (TextUtils.isEmpty(str6)) {
                                str3 = "";
                            } else {
                                str3 = "&spm=" + str6;
                            }
                            sb.append(str3);
                            if (TextUtils.isEmpty(str6)) {
                                str4 = "";
                            } else {
                                str4 = "&livehomeSpm=" + str6;
                            }
                            sb.append(str4);
                            recModel.actionUrl = sb.toString();
                        } else {
                            recModel.actionUrl += "?spm=a2141.8001249";
                        }
                        if (recModel.actionUrl.contains("?")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(recModel.actionUrl);
                            sb2.append("&spm=");
                            if (!TextUtils.isEmpty(str6)) {
                                str5 = str6;
                            }
                            sb2.append(str5);
                            recModel.actionUrl = sb2.toString();
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(recModel.actionUrl);
                            sb3.append("?spm=");
                            if (!TextUtils.isEmpty(str6)) {
                                str5 = str6;
                            }
                            sb3.append(str5);
                            recModel.actionUrl = sb3.toString();
                        }
                        recModel.initParams.put("spm", str6);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(recModel.actionUrl);
                        if (TextUtils.isEmpty(str6)) {
                            str2 = "";
                        } else {
                            str2 = "&livehomeSpm=" + str6;
                        }
                        sb4.append(str2);
                        recModel.actionUrl = sb4.toString();
                        recModel.initParams.put(iws.PARAM_LIVEHOME_SPM, str6);
                        Map<String, String> map4 = this.S;
                        if (map4 != null && !TextUtils.isEmpty(map4.get(iws.PARAM_LIVEHOMEMIX))) {
                            recModel.initParams.put(iws.PARAM_LIVEHOMEMIX, this.S.get(iws.PARAM_LIVEHOMEMIX));
                        }
                    }
                }
                if (!recModel.actionUrl.contains("trackInfo=")) {
                    if (recModel.actionUrl.contains("?")) {
                        recModel.actionUrl += "&trackInfo=" + recModel.trackInfo;
                    } else {
                        recModel.actionUrl += "?trackInfo=" + recModel.trackInfo;
                    }
                }
                Map<String, String> map5 = this.S;
                if (map5 != null && !yqq.i(map5.get(yj4.PARAM_MINILIVE_ENABLE_SHOW), true)) {
                    if (recModel.actionUrl.contains("?")) {
                        recModel.actionUrl += "&enableminilive=false";
                    } else {
                        recModel.actionUrl += "?enableminilive=false";
                    }
                }
            }
            if (!TextUtils.isEmpty(recModel.actionUrl)) {
                if (iws.b() && !recModel.actionUrl.contains(iws.PARAM_LIVEHOMEMIX)) {
                    if (recModel.actionUrl.contains("?")) {
                        recModel.actionUrl += "&liveHomeMix=true";
                    } else {
                        recModel.actionUrl += "?liveHomeMix=true";
                    }
                }
                Uri parse = Uri.parse(recModel.actionUrl);
                if (parse != null) {
                    str = parse.getQueryParameter("trackInfo");
                    iba.Z0(cxg.b(str, parse), this.a0);
                    try {
                        if (recModel.isFirst) {
                            this.Q.getIntent().setData(this.Z);
                        } else {
                            this.Q.getIntent().setData(parse);
                        }
                        if (pvs.z()) {
                            this.Q.getIntent().putExtra(yj4.PARAM_MEDIA_INFO, "");
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    str = "";
                }
                rbu.i0(this.a0, str);
                rbu.j(this.a0, "switch", "newFeedId=" + K0(parse), "isUp=" + (z ? 1 : 0));
            }
            x0();
            LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo3 = recModel.alimama;
            if (alimamaInfo3 != null) {
                iba.v1(alimamaInfo3, this.a0);
            }
            LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo23 = recModel.adTransParams;
            if (alimamaInfo23 != null) {
                iba.O(alimamaInfo23, this.a0);
            }
            muk mukVar = this.w0;
            if (mukVar != null) {
                if (z) {
                    mukVar.f(recModel.initParams);
                } else {
                    mukVar.a(recModel.initParams);
                }
            }
            if (z) {
                iba.m1(iba.K(this.a0) - 1, this.a0);
                iba.P0(1, this.a0);
            } else {
                iba.m1(iba.K(this.a0) + 1, this.a0);
                iba.P0(0, this.a0);
            }
            if (this.x0 == null || this.o0 == null) {
                rbu.E(this.a0, this.Q);
                HashMap hashMap = new HashMap();
                if (recModel.recommendCardInfo == null && ((reserveItemCardInfo = recModel.reserveItemCardInfo) == null || reserveItemCardInfo.cardInfo == null)) {
                    hashMap.put(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, "");
                } else {
                    hashMap.put(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, "recommendGoodsCard");
                }
                du4.c(vx9.d(), rbu.u(this.a0, this.Q), hashMap);
                if (!(this.a0.r() instanceof ATaoLiveOpenEntity) || ((ATaoLiveOpenEntity) this.a0.r()).bizCode == null || !((ATaoLiveOpenEntity) this.a0.r()).bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
                    rbu.A(this.a0, this.Q);
                } else {
                    rbu.C(this.a0, this.Q);
                }
                rbu.m0(this.a0, this.Q, "Page_TaobaoLiveWatch");
            } else {
                rbu.m0(this.a0, this.Q, "Page_TaobaoLiveWatch");
                rbu.E(this.a0, this.Q);
                rbu.C(this.a0, this.Q);
                rbu.m0(this.a0, this.Q, "Page_TaobaoLiveWatch");
            }
            d6q d6qVar = this.h0;
            if (d6qVar != null) {
                d6qVar.f();
                Map<String, String> map6 = recModel.initParams;
                this.h0.e(false, recModel.actionUrl, iba.o(this.a0), map6 != null ? map6.get("livesource") : null, recModel.liveId, recModel.anchorId);
            }
            if (v2s.o().A() != null && pvs.L1()) {
                v2s.o().A().c("handleUpDownSwitch", "isUp" + z + "liveId" + recModel.liveId + hashCode());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        mcd mcdVar;
        cba cbaVar;
        yir yirVar;
        TaoLiveLayoutManager taoLiveLayoutManager;
        int findLastVisibleItemPosition;
        int findLastVisibleItemPosition2;
        TaoLiveLayoutManager taoLiveLayoutManager2;
        RecModel recModel;
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        AccountInfo accountInfo;
        Map<String, String> map;
        Uri parse;
        Map<String, String> e2;
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_TRACK.equals(str)) {
            if (!(obj instanceof String)) {
                return;
            }
            if (up6.p0(vx9.d())) {
                rbu.N(this.a0, (String) obj, "feed_id=" + this.n, z9u.ARG_SCM + this.t);
                return;
            }
            rbu.H(this.a0, (String) obj, this.r);
        } else if ("com.taobao.taolive.room.killself".equals(str)) {
            D0();
        } else if (FullScreenFrame.EVENT_PREVIEW_VIDEO_FULL_SCREEN.equals(str)) {
            this.R.findViewById(R.id.taolive_close_btn).setVisibility(8);
        } else if (FullScreenFrame.EVENT_PREVIEW_VIDEO_NORMAL_SCREEN.equals(str)) {
            if (!v2s.o().I("closeBtn") || iba.t(this.a0)) {
                this.R.findViewById(R.id.taolive_close_btn).setVisibility(8);
            } else {
                this.R.findViewById(R.id.taolive_close_btn).setVisibility(0);
            }
        } else if ("com.taobao.taolive.room.hide_btn_close".equals(str)) {
            this.R.findViewById(R.id.taolive_close_btn).setVisibility(8);
        } else if (!"com.taobao.taolive.room.show_btn_close".equals(str)) {
            String str2 = "unknown";
            if (!"com.taobao.taolive.room.enable_updown_switch".equals(str)) {
                String str3 = null;
                if ("com.taobao.taolive.room.mediaplatform_switch_room".equals(str)) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        String str4 = (String) map2.get("url");
                        if (!TextUtils.isEmpty(str4) && (e2 = rnv.e((parse = Uri.parse(str4)))) != 0) {
                            e2.put("highlightSignByRePlay", map2.get("highlightSignByRePlay"));
                            if (!TextUtils.isEmpty((CharSequence) map2.get(yj4.HIGHLIGHT_TRANSPARENT_PARAMS))) {
                                e2.put(yj4.PARAM_TRANSPARENT_PARAMS, map2.get(yj4.HIGHLIGHT_TRANSPARENT_PARAMS));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map2.get(yj4.PARAM_HOLD_REPLAY_URL))) {
                                e2.put(yj4.PARAM_HOLD_REPLAY_URL, map2.get(yj4.PARAM_HOLD_REPLAY_URL));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map2.get("replayCurrentPosition"))) {
                                e2.put("replayCurrentPosition", map2.get("replayCurrentPosition"));
                            }
                            a1(parse, e2);
                            rbu.h0(this.a0);
                            u1();
                            x1((String) e2.get("id"), (String) e2.get("userId"), (String) e2.get("livesource"), parse != null ? parse.getQueryParameter(yj4.PARAM_LIVE_ROOM_SPM_PARAM) : null, e2, parse.getBooleanQueryParameter("forceRefresh", false), false, false);
                        }
                    }
                } else if ("com.taobao.taolive.room.disable_updown_switch".equals(str)) {
                    if (obj != null) {
                        str2 = (String) obj;
                    }
                    o3s.b("TaoLiveRealController", "receive disable upDown switch ".concat(str2));
                    if (!TextUtils.isEmpty(str2) && yj4.TAOLIVE_MORE_LIVE.equals(str2)) {
                        this.W = true;
                    } else if ("liveShop".equals(str2)) {
                        this.X = true;
                    }
                    T1(false);
                } else if ("com.taobao.taolive.room.mediaplatform_close_room".equals(str)) {
                    D0();
                } else {
                    String str5 = "PlayBackToLive";
                    if (FullScreenFrame.EVENT_BACK_TO_LIVE.equals(str)) {
                        if ((obj instanceof String) && (map = this.S) != null) {
                            map.put("livesource", (String) obj);
                        }
                        if (pvs.X0() && uwa.p() && obj == null) {
                            cba cbaVar2 = this.a0;
                            if (cbaVar2 != null && !TextUtils.isEmpty(cbaVar2.F)) {
                                str5 = "PlayBackToLive." + this.a0.F;
                            }
                            this.S.put("livesource", str5);
                        }
                        r0(false);
                        rbu.H(this.a0, z9u.CALCK_SHIFTTIME, null);
                    } else if ("com.taobao.taolive.room.replay_backToLive".equals(str)) {
                        if (obj instanceof String) {
                            String str6 = (String) obj;
                            if (this.a0 != null && uwa.p() && !TextUtils.isEmpty(this.a0.F)) {
                                str5 = "PlayBackToLive." + this.a0.F;
                            }
                            voj.a(this.Q, u90.e(str6) + "&livesource=" + str5 + "&backwardSwitch=true");
                        }
                    } else if ("com.taobao.taolive.room.addcarting".equals(str)) {
                        if (obj instanceof Long) {
                            this.E = ((Long) obj).longValue();
                        }
                    } else if ("com.taobao.taolive.room.goods_list_showing".equals(str)) {
                        if (obj instanceof Boolean) {
                            this.I = ((Boolean) obj).booleanValue();
                        }
                    } else if (uyg.EVENT_NEW_PROFILE__IS_SHOWING.equals(str)) {
                        if (obj instanceof Boolean) {
                            this.J = ((Boolean) obj).booleanValue();
                            o3s.b("TaoLiveRealController", "赋值 mIsProfilePageShowing：" + this.J);
                        }
                    } else if (uyg.EVENT_REWARD_PANEL_SHOWING.equals(str)) {
                        if (obj instanceof Boolean) {
                            this.K = ((Boolean) obj).booleanValue();
                        }
                    } else if ("com.taobao.taolive.room.updownswitch.init".equals(str)) {
                        if (this.B != null && (videoInfo2 = (VideoInfo) obj) != null && (accountInfo = videoInfo2.broadCaster) != null) {
                            String str7 = videoInfo2.liveId;
                            String str8 = accountInfo.accountId;
                            if (videoInfo2.isOfficialType()) {
                                VideoInfo.OfficialLiveInfo officialLiveInfo = videoInfo2.officialLiveInfo;
                                str7 = officialLiveInfo.officialLiveId;
                                str8 = officialLiveInfo.accountId;
                            }
                            this.B.n(str7, str8, videoInfo2.recommendBindId, this.C);
                        }
                    } else if ("com.taobao.taolive.room.updownswitch.official.dedup".equals(str)) {
                        if (this.B != null && (videoInfo = (VideoInfo) obj) != null && videoInfo.broadCaster != null && videoInfo.isOfficialLive()) {
                            this.B.o(videoInfo);
                        }
                    } else if ("com.taobao.taolive.room.refresh.recmodel".equals(str)) {
                        yir yirVar2 = this.B;
                        if (yirVar2 != null && (recModel = (RecModel) obj) != null) {
                            yirVar2.p(recModel);
                        }
                    } else if (uyg.EVENT_START_SHOW_GLOBAL_MINILIVE.equals(str)) {
                        if (u0()) {
                            L1(false, "ZoomBtn");
                        } else {
                            D0();
                        }
                    } else if ("com.taobao.taolive.room.show_error".equals(str)) {
                        y3s y3sVar = this.x0;
                        if (y3sVar != null && y3sVar.p && this.o0 != null) {
                            cba cbaVar3 = this.a0;
                            Map<String, String> Y = rbu.Y(cbaVar3, this.Q, this.t, iba.e(cbaVar3), this.x, this.y, false);
                            Y.put("pageName", "Page_TaobaoLiveWatch");
                            this.o0.a(Y);
                        }
                    } else if ("com.taobao.taolive.room.need_back".equals(str)) {
                        this.z = true;
                    } else if ("com.taobao.taolive.room.enter_ut_track".equals(str)) {
                        y3s y3sVar2 = this.x0;
                        if (y3sVar2 == null || !y3sVar2.p || this.o0 == null) {
                            cba cbaVar4 = this.a0;
                            rbu.Z(cbaVar4, this.Q, this.t, iba.e(cbaVar4), this.x, this.y, true, false);
                            return;
                        }
                        cba cbaVar5 = this.a0;
                        Map<String, String> Y2 = rbu.Y(cbaVar5, this.Q, this.t, iba.e(cbaVar5), this.x, this.y, false);
                        Y2.put("pageName", "Page_TaobaoLiveWatch");
                        this.o0.a(Y2);
                    } else if ("com.taobao.taolive.room.update_params".equals(str)) {
                        this.D = System.currentTimeMillis();
                        TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
                        if (tBLiveDataModel != null) {
                            Map<String, String> map3 = tBLiveDataModel.mInitParams;
                            if (map3 != null) {
                                this.t = map3.get("scm");
                            }
                            VideoInfo videoInfo3 = tBLiveDataModel.mVideoInfo;
                            if (videoInfo3 != null) {
                                this.n = videoInfo3.liveId;
                                BaseListAdapter baseListAdapter = this.d;
                                if (baseListAdapter != null) {
                                    baseListAdapter.W(tBLiveDataModel.mViewItemId);
                                }
                                AccountInfo accountInfo2 = videoInfo3.broadCaster;
                                if (accountInfo2 != null) {
                                    this.o = accountInfo2.accountId;
                                }
                                if (videoInfo3.isOfficialType()) {
                                    VideoInfo.OfficialLiveInfo officialLiveInfo2 = videoInfo3.officialLiveInfo;
                                    this.n = officialLiveInfo2.officialLiveId;
                                    this.o = officialLiveInfo2.accountId;
                                }
                            }
                        }
                    } else if ("com.taobao.taolive.room.sliding_close_page".equals(str)) {
                        cir.a("TBLiveService", "SideSlip event");
                        cba cbaVar6 = this.a0;
                        if (cbaVar6 != null && cbaVar6.f() != null && !this.a0.f().a()) {
                            return;
                        }
                        if (!t0() || vx9.d() == null || vx9.d().F()) {
                            D0();
                            return;
                        }
                        L1(true, "SideSlip");
                        cir.a("TBLiveService", "SideSlip showGlobalMiniWindow");
                    } else if ("com.taobao.taolive.room.switch.liveroom.down".equals(str)) {
                        if (this.b != null && (taoLiveLayoutManager2 = this.c) != null && this.d != null) {
                            int findLastVisibleItemPosition3 = taoLiveLayoutManager2.findLastVisibleItemPosition() + 1;
                            if (this.d.getItemCount() > findLastVisibleItemPosition3) {
                                this.b.smoothScrollToPosition(findLastVisibleItemPosition3);
                            } else {
                                D0();
                            }
                        }
                    } else if ("com.taobao.taolive.room.more_btn_click".equals(str)) {
                        o1((View) obj);
                    } else if (uyg.EVENT_NEGATIVE_FEEDBACK.equals(str)) {
                        if (pvs.K() && !vc.h(this.Q) && this.z) {
                            sjr.g().c("com.taobao.taolive.room.mediaplatform_switch_to_portrait", "landscapeNegativeFeedback", observeUniqueIdentification());
                            this.z = false;
                        } else if (this.b != null && (taoLiveLayoutManager = this.c) != null && this.d != null && this.d.getItemCount() > (findLastVisibleItemPosition2 = (findLastVisibleItemPosition = taoLiveLayoutManager.findLastVisibleItemPosition()) + 1)) {
                            if (pvs.L()) {
                                v1(true);
                            }
                            this.b.smoothScrollToPosition(findLastVisibleItemPosition2);
                            m(false, findLastVisibleItemPosition, this.c.findLastVisibleItemPosition());
                            this.b.postDelayed(new d(findLastVisibleItemPosition), pvs.O2());
                        }
                    } else if ("com.taobao.taolive.room.auto_down".equals(str)) {
                        O0(true, obj);
                    } else if ("com.taobao.taolive.room.auto_up".equals(str)) {
                        O0(false, obj);
                    } else if ("com.taobao.taolive.room.check_rv_foreground".equals(str)) {
                        yir yirVar3 = this.B;
                        if (yirVar3 != null) {
                            yirVar3.m();
                        }
                    } else if ("com.taobao.taolive.room.refresh".equals(str)) {
                        if (obj instanceof Uri) {
                            w1((Uri) obj, true);
                        }
                    } else if ("com.taobao.taolive.room.remove".equals(str)) {
                        yir yirVar4 = this.B;
                        if (yirVar4 != null) {
                            yirVar4.q(yirVar4.i());
                        }
                    } else if (pvs.s() && "smartlanding_event_action_hotReservation".equals(str)) {
                        o3s.b("TaoLiveRealController", "BottomSlideNewGuide：收到smartlanding发送的展示下滑引导event");
                        if ((obj instanceof JSONObject) && (cbaVar = this.a0) != null && !cbaVar.d()) {
                            HashMap hashMap = new HashMap();
                            cba cbaVar7 = this.a0;
                            if (cbaVar7 == null || !(cbaVar7.r() instanceof ATaoLiveOpenEntity) || ((ATaoLiveOpenEntity) this.a0.r()).bizCode == null || !((ATaoLiveOpenEntity) this.a0.r()).bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
                                z2 = false;
                            }
                            JSONObject jSONObject = (JSONObject) obj;
                            if (jSONObject.getJSONObject("actionData") != null) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("actionData");
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("bizData");
                                if (jSONObject3 != null) {
                                    str3 = jSONObject3.getString("bizType");
                                }
                                hashMap.put("actionData", jSONObject2);
                                hashMap.put("behavior", jSONObject.getString("behavior"));
                                hashMap.put("popId", jSONObject.getString("popId"));
                            }
                            yir yirVar5 = this.B;
                            if (yirVar5 != null) {
                                hashMap.put("preLiveIdList", yirVar5.k());
                                if (!(this.B.j() == null || this.B.j().reserveItemCardInfo == null || this.B.j().reserveItemCardInfo.bottomInfo == null)) {
                                    hashMap.put("bottomInfo", this.B.j().reserveItemCardInfo.bottomInfo);
                                    if (this.B.j().reserveItemCardInfo.cardInfo != null) {
                                        hashMap.put("hasNextCardInfo", Boolean.TRUE);
                                    }
                                }
                            }
                            if ("4".equals(str3) && z2) {
                                hashMap.put("isTab2", "true");
                                if (!(vx9.d() == null || vx9.d().A() == null)) {
                                    vx9.d().A().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
                                }
                            }
                            if (!pvs.K1() || !"4".equals(str3) || (yirVar = this.B) == null || yirVar.j() == null) {
                                sjr.g().c(uyg.f29673a, hashMap, observeUniqueIdentification());
                                return;
                            }
                            hashMap.put("enableUpDownGuideLiveBg", "true");
                            A0(this.B.j(), hashMap);
                        }
                    } else if (uyg.g.equals(str)) {
                        if (obj instanceof JSONObject) {
                            this.B.a((JSONObject) obj);
                            P0(true);
                        }
                    } else if ("com.taobao.taolive.room.updownswitch.vh.willdisappear".equals(str)) {
                        yir yirVar6 = this.B;
                        if (yirVar6 != null) {
                            yirVar6.r();
                        }
                    } else if (uyg.h.equals(str)) {
                        yir yirVar7 = this.B;
                        if (yirVar7 != null) {
                            yirVar7.s();
                        }
                    } else if (uyg.i.equals(str) && (mcdVar = this.r0) != null) {
                        mcdVar.a(false);
                        o3s.b("TaoLiveRealController", "BottomSlideNewGuide 冒头推直播 背景播放器已销毁");
                    }
                }
            } else if (!this.I && !this.K && !this.J) {
                if (obj != null) {
                    str2 = (String) obj;
                }
                o3s.b("TaoLiveRealController", "receive enable upDown switch ".concat(str2));
                if (!TextUtils.isEmpty(str2) && "liveShop".equals(str2)) {
                    this.X = false;
                }
                VideoInfo c0 = up6.c0(vx9.d());
                if (c0 != null) {
                    z = up6.w0(c0, vx9.c());
                }
                if (c0 != null && !c0.closeUpAndDownSlide) {
                    if ((z && !pvs.B2()) || this.W) {
                        return;
                    }
                    if (!up6.v0(vx9.d()) || l1(this.Q)) {
                        T1(true);
                    }
                }
            }
        } else if (!v2s.o().I("closeBtn") || iba.t(this.a0)) {
            this.R.findViewById(R.id.taolive_close_btn).setVisibility(8);
        } else {
            this.R.findViewById(R.id.taolive_close_btn).setVisibility(0);
        }
    }

    public TaoLiveRealController(Activity activity, Intent intent, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        super(activity);
        dba dbaVar = new dba(activity);
        this.a0 = dbaVar;
        dbaVar.a0(activity);
        H1(activity);
        if (intent != null) {
            this.Z = intent.getData();
        }
        m1("Constructor intent = null");
        D1(activity);
        iba.n1(dbaVar, new gmr());
        if (taoliveOpenLiveRoom != null) {
            G1(taoliveOpenLiveRoom);
        }
        R1(taoliveOpenLiveRoom);
        A1();
        d1(intent);
        S0(activity, this.n, this.o, this.q, this.U, this.S);
    }
}
