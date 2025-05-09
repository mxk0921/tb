package com.taobao.taolive.room.openarchitecture.single;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.kmp.OpenArchSingleEntityAdapter;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.translateUtils.OpenBizcodeTranslateBean;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.bte;
import tb.cba;
import tb.cdr;
import tb.d4s;
import tb.e7w;
import tb.gmr;
import tb.hlc;
import tb.iba;
import tb.nqo;
import tb.phr;
import tb.pvs;
import tb.qmh;
import tb.rbu;
import tb.rnv;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.up6;
import tb.v2s;
import tb.vx9;
import tb.w36;
import tb.w3d;
import tb.w4l;
import tb.wvs;
import tb.x5t;
import tb.yj4;
import tb.yqq;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OpenSingleViewContainer implements w3d, s3c, hlc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OpenSingleViewController f13200a;
    public cba b;
    public final cdr c;
    public Context d;
    public View e;
    public int f;
    public OpenBizcodeTranslateBean g;
    public final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.taolive.room.openarchitecture.single.OpenSingleViewContainer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/single/OpenSingleViewContainer$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (TextUtils.equals(intent.getAction(), "com.taobao.live.room.init")) {
                long intExtra = intent.getIntExtra("seqId", -1);
                if (intExtra != -1 && intExtra != OpenSingleViewContainer.a(OpenSingleViewContainer.this)) {
                    OpenSingleViewContainer.b(OpenSingleViewContainer.this);
                }
            }
        }
    };

    static {
        t2o.a(779093064);
        t2o.a(779093061);
        t2o.a(806355016);
        t2o.a(806356090);
    }

    public OpenSingleViewContainer() {
        a.a("com.taobao.taolive", null);
        wvs.a(null);
        OpenSingleViewController openSingleViewController = new OpenSingleViewController();
        this.f13200a = openSingleViewController;
        this.c = openSingleViewController.getFrameContext();
        openSingleViewController.initKMPKMPEntityAdapter(this);
        qmh.f().d(this.d);
        qmh.f().i();
    }

    public static /* synthetic */ int a(OpenSingleViewContainer openSingleViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d22a688", new Object[]{openSingleViewContainer})).intValue();
        }
        return openSingleViewContainer.f;
    }

    public static /* synthetic */ void b(OpenSingleViewContainer openSingleViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b160c74", new Object[]{openSingleViewContainer});
        } else {
            openSingleViewContainer.n();
        }
    }

    public static /* synthetic */ Context c(OpenSingleViewContainer openSingleViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3c08c84b", new Object[]{openSingleViewContainer});
        }
        return openSingleViewContainer.d;
    }

    public static /* synthetic */ cba d(OpenSingleViewContainer openSingleViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("683cda1", new Object[]{openSingleViewContainer});
        }
        return openSingleViewContainer.b;
    }

    public static void u(RecModel recModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d60bed", new Object[]{recModel});
        } else if (recModel != null && (map = recModel.initParams) != null) {
            map.put(yj4.PARAM_BACK_TO_LIVE, "true");
            recModel.initParams.remove(yj4.PARAM_GOOD_INFO_JSON);
            recModel.initParams.remove(yj4.PARAM_SJSD_ITEM_ID);
            recModel.initParams.remove(yj4.PARAM_TIMEMOVING_ITEM_ID);
            recModel.initParams.remove("keyPointId");
            recModel.initParams.remove(yj4.PARAM_TIME_PLAY_URL);
            recModel.initParams.remove(yj4.PARAM_CUSTOM_PLAY_CTRL);
            recModel.initParams.remove(yj4.PARAM_PLAY_VIEW_TOKEN);
            recModel.initParams.remove("timeMovingSpfPlayVideo");
            recModel.initParams.remove("timeMovingPcmIdParam");
            recModel.initParams.remove(yj4.PARAM_PRODUCT_TYPE);
            recModel.initParams.remove("highlightSignByRePlay");
            recModel.liveUrlList = null;
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "OpenSingleViewContainer";
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c547228d", new Object[]{this});
        } else if (!iba.v(this.b)) {
            Context context = this.d;
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT >= 23) {
                    ((Activity) context).getWindow().getDecorView().addOnLayoutChangeListener(new w4l(this));
                } else {
                    iba.M0(false, this.b);
                    iba.Y(0, this.b);
                    iba.b1(0, this.b);
                }
                gmr.a(this.b);
            }
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23e54330", new Object[]{this});
        }
        String valueOf = String.valueOf(hashCode());
        Random random = new Random();
        return valueOf + "_" + System.currentTimeMillis() + random.nextInt(1000);
    }

    @Override // tb.w3d
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.w3d
    public cdr getFrameContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cdr) ipChange.ipc$dispatch("52a2fd", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            return openSingleViewController.getFrameContext();
        }
        return null;
    }

    @Override // tb.w3d
    public cba getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.w3d
    public OpenArchSingleEntityAdapter getOpenArchEntityAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchSingleEntityAdapter) ipChange.ipc$dispatch("82df1a77", new Object[]{this});
        }
        return this.f13200a.getOpenArchEntityAdapter();
    }

    @Override // tb.w3d
    public RecModel getRecModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("733b4e04", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            return openSingleViewController.mRecModel;
        }
        return null;
    }

    @Override // tb.w3d
    public TBLiveBizDataModel getTBLiveBizDataModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveBizDataModel) ipChange.ipc$dispatch("b169bccd", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            return openSingleViewController.getTBLiveBizDataModel();
        }
        return null;
    }

    @Override // tb.w3d
    public String getUniStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ada47542", new Object[]{this});
        }
        return null;
    }

    @Override // tb.w3d
    public Map<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            return openSingleViewController.getUtParams();
        }
        return null;
    }

    public final RecModel h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("37df693b", new Object[]{this, str});
        }
        RecModel recModel = new RecModel(true, this.b);
        HashMap hashMap = new HashMap();
        recModel.initParams = hashMap;
        hashMap.put("id", str);
        recModel.liveId = str;
        return recModel;
    }

    @Override // tb.w3d
    public void initParams(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33fb2d9", new Object[]{this, obj});
            return;
        }
        this.f = hashCode();
        if (obj instanceof OpenBizcodeTranslateBean) {
            OpenBizcodeTranslateBean openBizcodeTranslateBean = (OpenBizcodeTranslateBean) obj;
            this.g = openBizcodeTranslateBean;
            onBindView(g(openBizcodeTranslateBean));
            w(openBizcodeTranslateBean);
        }
    }

    public final void j(String str) {
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17529e60", new Object[]{this, str});
            return;
        }
        up6.c(this.c, VideoStatus.VIDEO_NORMAL_STATUS);
        if (!e7w.a(this.c)) {
            if (TextUtils.isEmpty(str)) {
                recModel = g(this.g);
            } else {
                recModel = h(str);
            }
            u(recModel);
            s(recModel);
        }
    }

    public void k(Context context, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e14feb", new Object[]{this, context, taoliveOpenLiveRoom});
            return;
        }
        this.d = context;
        cba cbaVar = new cba(this.d);
        this.b = cbaVar;
        cbaVar.a0(this.d);
        this.b.k0(f());
        iba.n1(this.b, new gmr());
        w36.k().g(context);
        this.e = LayoutInflater.from(this.d).inflate(R.layout.taolive_vh_liveroom, (ViewGroup) null);
        this.b.q0(taoliveOpenLiveRoom);
        this.b.i0(taoliveOpenLiveRoom);
        iba.Z(true, this.b);
        if (this.b.X() != null) {
            iba.X0(this.b.X().e(), this.b);
            iba.G0(this.b.X().d(), this.b);
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.setGlobalContext(this.b);
            this.f13200a.init(context, this.e);
        }
        if (nqo.d()) {
            Context context2 = this.d;
            if ((context2 instanceof Activity) && ((Activity) context2).getWindow() != null) {
                ((Activity) this.d).getWindow().addFlags(128);
            }
        }
        m(taoliveOpenLiveRoom.kmpIdentifier);
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30d11a", new Object[]{this, str});
        } else if (bte.d()) {
            p("initMute preMute = " + str);
            boolean h = yqq.h(str);
            cba cbaVar = this.b;
            if (cbaVar != null) {
                cbaVar.n0(h);
            }
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b58ee5", new Object[]{this, str});
        } else {
            this.f13200a.getOpenArchEntityAdapter().n(str);
        }
    }

    @Override // tb.w3d
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.mute(z);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ddd084", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onDestroy();
        }
        LocalBroadcastManager.getInstance(v2s.o().f().getApplication()).unregisterReceiver(this.h);
        w36.k().c();
        vx9.b(this.b.g());
        sjr.g().b(this);
    }

    @Override // tb.w3d
    public void needPresentAvatarPage(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bd5651", new Object[]{this, map});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.needPresentAvatarPage(map);
        }
    }

    public boolean o() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc14c7ab", new Object[]{this})).booleanValue();
        }
        if (this.f13200a == null) {
            return false;
        }
        String b = phr.b(this.d);
        if (yqq.e(b) || this.b.X() == null || this.b.X().a() == null) {
            z = true;
        } else {
            z = b.contains(this.b.X().a());
        }
        if (!z || !this.f13200a.mIsDestroyed) {
            return false;
        }
        return true;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.mediaplatform_switch_room", FullScreenFrame.EVENT_BACK_TO_LIVE, "com.taobao.taolive.room.replay_backToLive"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        cdr cdrVar = this.c;
        if (cdrVar == null) {
            return null;
        }
        return cdrVar.C();
    }

    @Override // tb.w3d
    public void onBindView(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c73abac", new Object[]{this, recModel});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onBindView(recModel);
        }
    }

    @Override // tb.w3d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        n();
        cba cbaVar = this.b;
        if (cbaVar != null) {
            cbaVar.destroy();
        }
        if (v2s.o().k() != null && pvs.b2()) {
            v2s.o().k().destroy();
        }
        if (nqo.d()) {
            Context context = this.d;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                ((Activity) this.d).getWindow().clearFlags(128);
            }
        }
    }

    @Override // tb.w3d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onDidAppear();
        }
    }

    @Override // tb.w3d
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onDidDisappear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.mediaplatform_switch_room".equals(str)) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String str2 = (String) map.get("url");
                if (!TextUtils.isEmpty(str2)) {
                    Map<String, String> e = rnv.e(Uri.parse(str2));
                    e.put("highlightSignByRePlay", map.get("highlightSignByRePlay"));
                    s(i(e));
                }
            }
        } else if (FullScreenFrame.EVENT_BACK_TO_LIVE.equals(str)) {
            j(null);
            rbu.G(this.c, z9u.CALCK_SHIFTTIME, null);
        } else if ("com.taobao.taolive.room.replay_backToLive".equals(str) && (obj instanceof String)) {
            j((String) obj);
        }
    }

    @Override // tb.hlc.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
        } else {
            this.f13200a.onGetFandomInfoSuccess(fandomInfo, str);
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
        } else {
            this.f13200a.onGetVideoInfoFail(str);
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
        } else {
            this.f13200a.onGetVideoInfoSuccess(videoInfo, str);
        }
    }

    @Override // tb.w3d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onPause();
        }
    }

    @Override // tb.w3d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.f13200a == null) {
        } else {
            if (o()) {
                onWillAppear();
                onDidAppear();
                return;
            }
            this.f13200a.onResume();
        }
    }

    @Override // tb.w3d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (this.f13200a != null && d4s.e("enablePMIrregularTrack", true)) {
            this.f13200a.onStart();
        }
    }

    @Override // tb.w3d
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onStop(z);
        }
    }

    @Override // tb.w3d
    public void onViewHolderDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef86571", new Object[]{this});
        } else {
            this.f13200a.onViewHolderDestroy();
        }
    }

    @Override // tb.w3d
    public void onViewHolderDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
        } else {
            this.f13200a.onViewHolderDidAppear();
        }
    }

    @Override // tb.w3d
    public void onViewHolderDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
        } else {
            this.f13200a.onViewHolderDidDisappear();
        }
    }

    @Override // tb.w3d
    public void onViewHolderWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
        } else {
            this.f13200a.onViewHolderWillAppear();
        }
    }

    @Override // tb.w3d
    public void onViewHolderWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
        } else {
            this.f13200a.onViewHolderWillDisappear();
        }
    }

    @Override // tb.w3d
    public void onViewHolderWillLoad(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1ce313", new Object[]{this, recModel});
        } else {
            this.f13200a.onViewHolderWillLoad(recModel);
        }
    }

    @Override // tb.w3d
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        q();
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onWillAppear();
            if (d4s.e("enablePMIrregularTrack", true)) {
                e7w.o(this.c);
            }
        }
        sjr.g().a(this);
    }

    @Override // tb.w3d
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.onWillDisappear();
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        x5t.h("OpenSingleViewContainer", str + " id = " + hashCode());
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa67034", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (context != null) {
            v(context, false);
            t();
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7966d9c3", new Object[]{this});
            return;
        }
        rbu.l0(this.c, this.d, "Page_TaobaoLiveWatch");
        rbu.D(this.c, this.d);
        rbu.B(this.c, this.d);
    }

    @Override // tb.w3d
    public void reportRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841661c2", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.reportRequest();
        }
    }

    @Override // tb.w3d
    public void retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6555dba", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.retryVideo();
        }
    }

    @Override // tb.w3d
    public void setContainerOffset(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03b86d7", new Object[]{this, jSONObject});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.setContainerOffset(jSONObject);
        }
    }

    @Override // tb.w3d
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.setSmallWindowClickListener(iSmallWindowStrategy);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d392ab05", new Object[]{this});
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(v2s.o().f().getApplication());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.live.room.init");
        instance.registerReceiver(this.h, intentFilter);
    }

    @Override // tb.w3d
    public void updatePerformanceTrack(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe38e7ff", new Object[]{this, str, str2});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.updatePerformanceTrack(str, str2);
        }
    }

    @Override // tb.w3d
    public void updateUserTrackData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829410bd", new Object[]{this, map});
            return;
        }
        OpenSingleViewController openSingleViewController = this.f13200a;
        if (openSingleViewController != null) {
            openSingleViewController.updateUserTrackData(map);
        }
    }

    public final void v(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4609bfc0", new Object[]{this, context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        int hashCode = hashCode();
        this.f = hashCode;
        intent.putExtra("seqId", hashCode);
        intent.putExtra("hasPlayerViewToken", z);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
        LocalBroadcastManager.getInstance(this.d).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
    }

    public final void w(OpenBizcodeTranslateBean openBizcodeTranslateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361cc263", new Object[]{this, openBizcodeTranslateBean});
        } else if (openBizcodeTranslateBean != null) {
            if (!TextUtils.isEmpty(openBizcodeTranslateBean.spmCnt)) {
                iba.k1(openBizcodeTranslateBean.spmCnt, this.b);
                this.b.P = openBizcodeTranslateBean.spmCnt;
            }
            this.b.X = yqq.i(openBizcodeTranslateBean.entryByShop2F, false);
            l(openBizcodeTranslateBean.isLiveMute);
            e();
        }
    }

    public final RecModel g(OpenBizcodeTranslateBean openBizcodeTranslateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("d6b48b38", new Object[]{this, openBizcodeTranslateBean});
        }
        RecModel recModel = new RecModel(true, this.b);
        recModel.liveId = openBizcodeTranslateBean.liveId;
        recModel.accountId = openBizcodeTranslateBean.accountId;
        recModel.imageUrl = openBizcodeTranslateBean.coverPicUrl;
        recModel.isFirst = true;
        recModel.sjsdItemId = openBizcodeTranslateBean.sjsdItemId;
        iba.p0(openBizcodeTranslateBean.livesource, this.b);
        iba.w0(openBizcodeTranslateBean.entrySpm, this.b);
        HashMap hashMap = new HashMap();
        recModel.initParams = hashMap;
        hashMap.put(yj4.PARAM_CUSTOM_PLAY_CTRL, openBizcodeTranslateBean.queryParam);
        recModel.initParams.put("id", recModel.liveId);
        recModel.initParams.put("userId", recModel.accountId);
        recModel.initParams.put(yj4.PARAM_PLAY_VIEW_TOKEN, openBizcodeTranslateBean.playerViewToken);
        recModel.initParams.put("livesource", openBizcodeTranslateBean.livesource);
        recModel.initParams.put(yj4.PARAM_SJSD_ITEM_ID, recModel.sjsdItemId);
        recModel.initParams.put(yj4.PARAM_HIGH_PRIORITY_BIZ_CODE, openBizcodeTranslateBean.highPriorityBizCode);
        recModel.initParams.put("timeMoveId", openBizcodeTranslateBean.timeMoveId);
        recModel.initParams.put("livePointTab3", openBizcodeTranslateBean.Shop2FEntryBizScene);
        recModel.initParams.put("shop2fSkipTab3Url", openBizcodeTranslateBean.shop2fSkipTab3Url);
        if (TextUtils.isEmpty(openBizcodeTranslateBean.spm)) {
            openBizcodeTranslateBean.spm = "a2141.b49677444";
        }
        recModel.initParams.put("spm", openBizcodeTranslateBean.spm);
        recModel.initParams.put(yj4.PARAM_ITEM_IDS, openBizcodeTranslateBean.holdItemIds);
        recModel.initParams.put(yj4.PARAM_CATEGORY_ID, openBizcodeTranslateBean.defaultCategoryId);
        recModel.initParams.put(yj4.PARAM_ITEM_HOLD_TYPE, openBizcodeTranslateBean.itemHoldType);
        recModel.initParams.put(yj4.PARAM_IGNORE_PV, openBizcodeTranslateBean.ignorePv);
        return recModel;
    }

    public final RecModel i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("7b41c26a", new Object[]{this, map});
        }
        RecModel recModel = new RecModel(true, this.b);
        recModel.initParams = map;
        recModel.liveId = map.get("id");
        recModel.accountId = recModel.initParams.get("userId");
        return recModel;
    }

    public void s(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a31d906", new Object[]{this, recModel});
            return;
        }
        r();
        if (!getOpenArchEntityAdapter().h("scrollContainerLifecycle", true)) {
            onDidDisappear();
        }
        onBindView(recModel);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("needClearData", "true");
        if (!getOpenArchEntityAdapter().j("scrollContainerLifecycle", getRecModel(), this.c, true, hashMap)) {
            onWillAppear();
        }
        if (!getOpenArchEntityAdapter().g("scrollContainerLifecycle", getRecModel(), this.c, true)) {
            onDidAppear();
        }
        cdr cdrVar = this.c;
        if (cdrVar != null && cdrVar.A() != null) {
            this.c.A().accessListener(AccessListenerEnum.onVerticalScrollEnable, new Object[0]);
        }
    }
}
