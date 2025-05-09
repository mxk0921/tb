package com.taobao.taolive.room;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ali.user.mobile.info.AppInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.login4android.api.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.taobao.taolive.room.TaoLiveVideoActivity;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.utils.RRoomProxy;
import com.taobao.taolive.sdk.history.RecentlyOftenWatchService;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.utils.MediaCaptureObserver;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.acq;
import tb.b8e;
import tb.bl9;
import tb.bqg;
import tb.cba;
import tb.cv1;
import tb.d1j;
import tb.d7r;
import tb.d9m;
import tb.df8;
import tb.dgw;
import tb.ejr;
import tb.fee;
import tb.g9c;
import tb.h4s;
import tb.hee;
import tb.hv9;
import tb.hw0;
import tb.iba;
import tb.isk;
import tb.iws;
import tb.j7t;
import tb.jyd;
import tb.k0r;
import tb.k7t;
import tb.l7t;
import tb.ljr;
import tb.m7t;
import tb.mcd;
import tb.mxg;
import tb.n7t;
import tb.nei;
import tb.o3s;
import tb.pvs;
import tb.q6f;
import tb.qmh;
import tb.qp0;
import tb.qvs;
import tb.rbu;
import tb.rc;
import tb.sbt;
import tb.scd;
import tb.sj9;
import tb.sjr;
import tb.t0u;
import tb.t2o;
import tb.tfi;
import tb.tsd;
import tb.tvv;
import tb.ufi;
import tb.uvg;
import tb.ux9;
import tb.v2s;
import tb.vbt;
import tb.vc;
import tb.vnm;
import tb.vx9;
import tb.vxm;
import tb.wng;
import tb.wnm;
import tb.wqg;
import tb.wvs;
import tb.x5t;
import tb.xca;
import tb.xj7;
import tb.yfb;
import tb.yfd;
import tb.yj4;
import tb.yrr;
import tb.z9u;
import tb.znm;
import tb.zqq;
import tb.zrm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveVideoActivity extends CustomBaseActivity implements ShareContentCallBack, wqg, b8e, IUtActivityNotTrack, hee, yfb, tsd, fee, isk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_KILL_SELF = "com.taobao.taolive.room.TaoLiveVideoActivity.killself";
    public static final String J = TaoLiveVideoActivity.class.getSimpleName();
    public String A;
    public MediaData B;
    public boolean C;
    public boolean E;
    public ViewGroup G;

    /* renamed from: a  reason: collision with root package name */
    public jyd f13118a;
    public String d;
    public String e;
    public d1j f;
    public hv9 h;
    public mcd p;
    public long r;
    public boolean u;
    public MediaCaptureObserver v;
    public String x;
    public String y;
    public String z;
    public final ArrayList<fee> b = new ArrayList<>();
    public final ArrayList<tsd> c = new ArrayList<>();
    public final Handler g = new Handler(Looper.getMainLooper());
    public boolean i = false;
    public String j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public BroadcastReceiver q = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/TaoLiveVideoActivity$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if ("com.taobao.taolive.room.TaoLiveVideoActivity.killself".equals(intent.getAction())) {
                TaoLiveVideoActivity.this.finish();
            }
        }
    };
    public boolean s = false;
    public final df8 t = new df8(this);
    public final PanguApplication.CrossActivityLifecycleCallback w = new ljr(getPanguApplication());
    public final HashMap<String, String> D = new HashMap<>();
    public final BroadcastReceiver F = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.9
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/TaoLiveVideoActivity$9");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                String action = intent.getAction();
                if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
                    TaoLiveVideoActivity taoLiveVideoActivity = TaoLiveVideoActivity.this;
                    TaoLiveVideoActivity.w3(taoLiveVideoActivity, taoLiveVideoActivity);
                    TLog.loge("TBLive", TaoLiveVideoActivity.G3() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_SUCCESS");
                    TaoLiveVideoActivity.v3(TaoLiveVideoActivity.this);
                } else if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_CANCEL.name())) {
                    TaoLiveVideoActivity taoLiveVideoActivity2 = TaoLiveVideoActivity.this;
                    TaoLiveVideoActivity.w3(taoLiveVideoActivity2, taoLiveVideoActivity2);
                    TLog.loge("TBLive", TaoLiveVideoActivity.G3() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_CANCEL");
                    TaoLiveVideoActivity.this.finish();
                }
            }
        }
    };
    public final cv1.a H = new a();
    public final TBPublicMenu.TBOnPublicMenuClickListener I = new b(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements cv1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.cv1.a
        public void m(boolean z) {
            Uri data;
            Uri x3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
            } else if (TaoLiveVideoActivity.this.getIntent() != null && (data = TaoLiveVideoActivity.this.getIntent().getData()) != null && (x3 = TaoLiveVideoActivity.x3(TaoLiveVideoActivity.this, data, yj4.PARAM_IS_LIVE_MUTE, String.valueOf(z))) != null) {
                TaoLiveVideoActivity.this.getIntent().setData(x3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TaoLiveVideoActivity taoLiveVideoActivity) {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                return;
            }
            ux9 d = vx9.d();
            if (d != null) {
                str = d.C();
            } else {
                str = null;
            }
            if (tBPublicMenuItem.getId() == R.id.taolive_global_report) {
                sjr.g().c("com.taobao.taolive.room.start_report_from_btns", tBPublicMenuItem, str);
            } else {
                sjr.g().c("com.taobao.taolive.room.share", tBPublicMenuItem, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f13123a;
        public final /* synthetic */ String b;
        public final /* synthetic */ double c;
        public final /* synthetic */ String d;

        public c(Uri uri, String str, double d, String str2) {
            this.f13123a = uri;
            this.b = str;
            this.c = d;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f13123a != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("action", this.b);
                hashMap.put("currentTimeOpt", String.valueOf(this.c));
                hashMap.put("liveId", String.valueOf(this.f13123a.getQueryParameter("id")));
                hashMap.put("livesource", this.f13123a.getQueryParameter("livesource"));
                hashMap.put("deviceLevel", String.valueOf(xj7.a()));
                hashMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
                hashMap.put("liveSession", String.valueOf(this.d));
                hashMap.put(yj4.PARAM_PLAY_MODE, this.f13123a.getQueryParameter(yj4.PARAM_PLAY_VIEW_TOKEN));
                rbu.K(null, "NewArchitecturePlayStart", hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements ISmartLandingProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(TaoLiveVideoActivity taoLiveVideoActivity) {
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
    public class e implements MediaCaptureObserver.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.taolive.sdk.utils.MediaCaptureObserver.b
        public void a(List<MediaCaptureObserver.CapatureData> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e67cb25f", new Object[]{this, list});
            } else if (v2s.o().E() != null) {
                try {
                    HashMap hashMap = new HashMap();
                    String jSONString = JSON.toJSONString(list);
                    hashMap.put("screenShots", jSONString);
                    v2s.o().E().updatePageProperties(TaoLiveVideoActivity.this, hashMap);
                    String G3 = TaoLiveVideoActivity.G3();
                    o3s.b(G3, "上报截屏/录屏数据成功：" + jSONString);
                } catch (Exception e) {
                    String G32 = TaoLiveVideoActivity.G3();
                    o3s.b(G32, "上报截屏/录屏数据失败：" + e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TaoLiveVideoActivity.n3(TaoLiveVideoActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements g9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.g9c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b48357", new Object[]{this});
            } else {
                TaoLiveVideoActivity.F3(TaoLiveVideoActivity.this);
            }
        }

        @Override // tb.g9c
        public void b(SimpleVideoInfo simpleVideoInfo) {
            ArrayList<MediaData.QualityLiveItem> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e066f337", new Object[]{this, simpleVideoInfo});
                return;
            }
            sj9.D("setResponseListener enablePreLoadVideoSimpleData onGetVideoInfoSuccess");
            TaoLiveVideoActivity.o3(TaoLiveVideoActivity.this, simpleVideoInfo);
            MediaData m = znm.m(simpleVideoInfo);
            if (m == null || (arrayList = m.liveUrlList) == null || arrayList.isEmpty()) {
                TaoLiveVideoActivity.F3(TaoLiveVideoActivity.this);
                return;
            }
            TaoLiveVideoActivity.C3(TaoLiveVideoActivity.this, true);
            sj9.D("setResponseListener LayoutInflater asyncMediaPlayer");
            TaoLiveVideoActivity taoLiveVideoActivity = TaoLiveVideoActivity.this;
            TaoLiveVideoActivity.E3(taoLiveVideoActivity, taoLiveVideoActivity.getIntent(), m, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                TaoLiveVideoActivity.H3(TaoLiveVideoActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements g9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
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
                return;
            }
            sj9.D("setResponseListener addSimplePageTrackFeedId onGetVideoInfoSuccess");
            TaoLiveVideoActivity.o3(TaoLiveVideoActivity.this, simpleVideoInfo);
        }
    }

    static {
        t2o.a(779092758);
        t2o.a(927989801);
        t2o.a(775946454);
        t2o.a(779093548);
        t2o.a(779093547);
        t2o.a(336592972);
        t2o.a(336592973);
        t2o.a(779093129);
    }

    public static /* synthetic */ boolean A3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a6c2dd0", new Object[]{taoLiveVideoActivity})).booleanValue();
        }
        return taoLiveVideoActivity.k;
    }

    public static /* synthetic */ jyd B3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyd) ipChange.ipc$dispatch("608e4693", new Object[]{taoLiveVideoActivity});
        }
        return taoLiveVideoActivity.f13118a;
    }

    public static /* synthetic */ boolean C3(TaoLiveVideoActivity taoLiveVideoActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ecb734a", new Object[]{taoLiveVideoActivity, new Boolean(z)})).booleanValue();
        }
        taoLiveVideoActivity.k = z;
        return z;
    }

    public static /* synthetic */ TBPublicMenu.TBOnPublicMenuClickListener D3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu.TBOnPublicMenuClickListener) ipChange.ipc$dispatch("c3308a9f", new Object[]{taoLiveVideoActivity});
        }
        return taoLiveVideoActivity.I;
    }

    public static /* synthetic */ void E3(TaoLiveVideoActivity taoLiveVideoActivity, Intent intent, MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9366b0", new Object[]{taoLiveVideoActivity, intent, mediaData, str});
        } else {
            taoLiveVideoActivity.N3(intent, mediaData, str);
        }
    }

    public static /* synthetic */ void F3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e190ce", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.o4();
        }
    }

    public static /* synthetic */ String G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c2ab464", new Object[0]);
        }
        return J;
    }

    public static /* synthetic */ void H3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af56f3d0", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.i4();
        }
    }

    public static /* synthetic */ void I3(TaoLiveVideoActivity taoLiveVideoActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32edc7e1", new Object[]{taoLiveVideoActivity, view});
        } else {
            taoLiveVideoActivity.L3(view);
        }
    }

    public static /* synthetic */ Handler J3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d04d72b4", new Object[]{taoLiveVideoActivity});
        }
        return taoLiveVideoActivity.g;
    }

    public static /* synthetic */ boolean K3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57070857", new Object[]{taoLiveVideoActivity})).booleanValue();
        }
        return taoLiveVideoActivity.a4();
    }

    public static /* synthetic */ Object ipc$super(TaoLiveVideoActivity taoLiveVideoActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1398848845:
                super.onPostResume();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 79457038:
                return new Boolean(super.isImmersiveStatus());
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/TaoLiveVideoActivity");
        }
    }

    public static /* synthetic */ void n3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff6caca", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.D4();
        }
    }

    public static /* synthetic */ void o3(TaoLiveVideoActivity taoLiveVideoActivity, SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d95c2a", new Object[]{taoLiveVideoActivity, simpleVideoInfo});
        } else {
            taoLiveVideoActivity.M3(simpleVideoInfo);
        }
    }

    public static /* synthetic */ mcd p3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mcd) ipChange.ipc$dispatch("2a3610e5", new Object[]{taoLiveVideoActivity});
        }
        return taoLiveVideoActivity.p;
    }

    public static /* synthetic */ HashMap q3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ea244a1d", new Object[]{taoLiveVideoActivity});
        }
        return taoLiveVideoActivity.D;
    }

    public static /* synthetic */ boolean r3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e75760bf", new Object[]{taoLiveVideoActivity})).booleanValue();
        }
        return taoLiveVideoActivity.C;
    }

    public static /* synthetic */ boolean s3(TaoLiveVideoActivity taoLiveVideoActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f469e3b", new Object[]{taoLiveVideoActivity, new Boolean(z)})).booleanValue();
        }
        taoLiveVideoActivity.C = z;
        return z;
    }

    public static /* synthetic */ void t3(TaoLiveVideoActivity taoLiveVideoActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2eda516", new Object[]{taoLiveVideoActivity, view});
        } else {
            taoLiveVideoActivity.s4(view);
        }
    }

    public static /* synthetic */ void u3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccc3bd", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.O3();
        }
    }

    public static void updateApmDataInvalid(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d114fed3", new Object[]{view});
        } else if (view != null) {
            Log.e("updateApmData", "updateApmDataInvalid: invalid_view:" + view.hashCode());
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_INVALID);
        }
    }

    public static void updateApmDataValid(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30beceee", new Object[]{view});
        } else if (view != null) {
            Log.e("updateApmData", "updateApmDataValid:valid_view:" + view.hashCode());
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        }
    }

    public static /* synthetic */ void v3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f07753e", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.g4();
        }
    }

    public static /* synthetic */ void w3(TaoLiveVideoActivity taoLiveVideoActivity, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd374d1", new Object[]{taoLiveVideoActivity, activity});
        } else {
            taoLiveVideoActivity.C4(activity);
        }
    }

    public static /* synthetic */ Uri x3(TaoLiveVideoActivity taoLiveVideoActivity, Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d7ef5d2", new Object[]{taoLiveVideoActivity, uri, str, str2});
        }
        return taoLiveVideoActivity.y4(uri, str, str2);
    }

    public static /* synthetic */ void y3(TaoLiveVideoActivity taoLiveVideoActivity, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6f77a4", new Object[]{taoLiveVideoActivity, map});
        } else {
            taoLiveVideoActivity.e4(map);
        }
    }

    public static /* synthetic */ boolean z3(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f23b46", new Object[]{taoLiveVideoActivity})).booleanValue();
        }
        return taoLiveVideoActivity.t4();
    }

    public final void A4(Activity activity, boolean z) {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13a01ee", new Object[]{this, activity, new Boolean(z)});
        } else if (activity != null && activity.getWindow() != null && (decorView = activity.getWindow().getDecorView()) != null) {
            if (z) {
                decorView.setSystemUiVisibility(9216);
                return;
            }
            decorView.setSystemUiVisibility(1280);
            getWindow().setStatusBarColor(0);
        }
    }

    public final void B4() {
        MediaCaptureObserver mediaCaptureObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1104d0e7", new Object[]{this});
        } else if (W3() && (mediaCaptureObserver = this.v) != null) {
            mediaCaptureObserver.i();
        }
    }

    public final void C4(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5293fc", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(activity, this.F);
        }
    }

    public final void D4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78329e", new Object[]{this});
        } else if (v2s.o().p() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enableInitUCCoreOrange", "true");
            hashMap.put("isNeedShowH5LiveSourceBlackList", "");
            hashMap.put("isNeedShowH5EntryLiveSourceBlackList", "");
            hashMap.put("enableLiveAndHomeMixOrange", "true");
            hashMap.put("liveAndHomeMixTemplate", "taolive_home_and_live_tab");
            hashMap.put("liveAndHomeMixTemplateHeight", "40");
            hashMap.put("enableKandianRecommendPopView", "true");
            hashMap.put("enablePreLoadVideoSimpleData2", "false");
            hashMap.put("closeAsyncStartUpOrg1", "true");
            hashMap.put("enableDxSmartPreLoad", "true");
            v2s.o().p().a("tblive", hashMap);
        }
    }

    public final void E4() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb50e384", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data != null) {
            HashMap hashMap = new HashMap();
            String str2 = "a2141.8001249";
            if ("true".equals(data.getQueryParameter(iws.PARAM_LIVEHOMEMIX))) {
                String queryParameter = data.getQueryParameter(iws.PARAM_LIVEHOME_SPM);
                boolean isEmpty = TextUtils.isEmpty(queryParameter);
                str = z9u.PAGE_HOME_LIVETAB;
                if (!isEmpty) {
                    str2 = queryParameter;
                }
            } else {
                str = "Page_TaobaoLiveWatch";
            }
            rbu.l0(null, this, str);
            hashMap.put("spm-cnt", str2);
            String queryParameter2 = data.getQueryParameter("livesource");
            this.d = queryParameter2;
            if (!TextUtils.isEmpty(queryParameter2)) {
                hashMap.put("livesource", this.d);
                hashMap.put("entryLiveSource", this.d);
            }
            String queryParameter3 = data.getQueryParameter("spm");
            this.e = queryParameter3;
            if (!TextUtils.isEmpty(queryParameter3)) {
                hashMap.put("entrySpm", queryParameter3);
            }
            String queryParameter4 = data.getQueryParameter("userId");
            if (!TextUtils.isEmpty(queryParameter4)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, queryParameter4);
            }
            String queryParameter5 = data.getQueryParameter("id");
            if (!TextUtils.isEmpty(queryParameter5)) {
                hashMap.put("feed_id", queryParameter5);
            }
            hashMap.put("isAfcColdContext", String.valueOf(this.i));
            this.j = data.getQueryParameter("_afc_link");
            if (v2s.o().E() != null) {
                v2s.o().E().updatePageProperties(this, hashMap);
            }
            if (this.i && znm.k().p()) {
                znm.k().v(new j());
            }
        }
    }

    @Override // tb.isk
    public void F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f965b158", new Object[]{this});
        } else {
            s4(this.G);
        }
    }

    @Override // tb.tsd
    public void G(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator<tsd> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().G(str, jSONObject);
        }
    }

    @Override // tb.hee
    public void I1(fee feeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a387060e", new Object[]{this, feeVar});
        } else {
            this.b.add(feeVar);
        }
    }

    public final void L3(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f182f183", new Object[]{this, view});
            return;
        }
        df8 df8Var = this.t;
        if (df8Var == null || !df8Var.g()) {
            setContentView(view);
        } else {
            this.t.b(view);
        }
        updateApmDataInvalid(view);
    }

    public final void M3(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2931e928", new Object[]{this, simpleVideoInfo});
        } else if (simpleVideoInfo != null) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(simpleVideoInfo.liveId)) {
                hashMap.put("feed_id", simpleVideoInfo.liveId);
            }
            if (!TextUtils.isEmpty(simpleVideoInfo.accountId)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, simpleVideoInfo.accountId);
            } else if (!TextUtils.isEmpty(simpleVideoInfo.encodeAccountId)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, simpleVideoInfo.encodeAccountId);
            }
            if (!hashMap.isEmpty() && v2s.o().E() != null) {
                v2s.o().E().updatePageProperties(this, hashMap);
                sj9.D("setResponseListener enablePreLoadVideoSimpleData addSimplePageTrackFeedId " + simpleVideoInfo.liveId + " " + simpleVideoInfo.accountId);
            }
        }
    }

    public final void Q3() {
        jyd jydVar;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee1221d", new Object[]{this});
        } else if (sbt.b() && (jydVar = this.f13118a) != null && jydVar.isDestroyed() && (viewGroup = this.G) != null) {
            viewGroup.removeAllViews();
            this.G.setId(View.generateViewId());
            h4();
            jyd jydVar2 = this.f13118a;
            if (!(jydVar2 == null || jydVar2.getGlobalContext() == null)) {
                this.f13118a.getGlobalContext().l0(true);
            }
            this.G.addView(this.f13118a.getView());
        }
    }

    public final boolean R3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcc12090", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return true;
        }
        if (!this.i || Login.checkInit()) {
            O3();
        } else {
            x4();
        }
        return false;
    }

    @Override // tb.tsd
    public void S0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee651ff0", new Object[]{this, jSONObject});
            return;
        }
        Iterator<tsd> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().S0(jSONObject);
        }
    }

    public final void S3(Uri uri, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e956912", new Object[]{this, uri, str});
        } else if (TextUtils.isEmpty(this.z)) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter(yj4.PARAM_PLAY_VIEW_TOKEN, str);
            if (zqq.a(this.x)) {
                str2 = "OptPlay";
            } else {
                str2 = this.x;
            }
            buildUpon.appendQueryParameter(yj4.PARAM_PLAY_MODE, str2);
            getIntent().setData(buildUpon.build());
        } else if (!str.equalsIgnoreCase(this.z)) {
            String uri2 = uri.toString();
            getIntent().setData(Uri.parse(uri2.replace("playViewToken=" + this.z, "playViewToken=".concat(str))));
        }
    }

    public final void V3() {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2df863", new Object[]{this});
            return;
        }
        try {
            if (getIntent().getData() != null && (queryParameter = getIntent().getData().getQueryParameter(yj4.P2FF_REUSE_TOKEN)) != null) {
                boolean h2 = yrr.c().h(queryParameter, 0L);
                String str = J;
                TLog.loge("TBLive", str, "需要兜底销毁p2ff 播放器:" + h2);
            }
        } catch (Throwable th) {
            String str2 = J;
            TLog.loge("TBLive", str2, "destroyP2FFMediaPlayerIfNeed " + th);
        }
    }

    public final void X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80119d30", new Object[]{this});
            return;
        }
        new SystemBarDecorator(this).enableImmersiveStatusBar(true);
        xca.c = SystemBarDecorator.getStatusBarHeight(this);
    }

    public final void Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d56d9b0", new Object[]{this});
        } else if (!zqq.a(this.y)) {
            wnm.b().f(this.y, this);
        } else {
            final Runnable h7tVar = new Runnable() { // from class: tb.h7t
                @Override // java.lang.Runnable
                public final void run() {
                    TaoLiveVideoActivity.this.l4();
                }
            };
            if (qp0.c() > 20.0f || !qvs.z()) {
                this.g.postAtFrontOfQueue(h7tVar);
            } else {
                Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: tb.i7t
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j2) {
                        TaoLiveVideoActivity.this.m4(h7tVar, j2);
                    }
                });
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void b4() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14cca73c", new Object[]{this});
            return;
        }
        if (vc.a()) {
            try {
                d7r.a(this);
            } catch (Throwable unused) {
                TLog.loge("tblive", J, "TBAutoSize 兜底崩溃");
            }
        }
        if (k0r.v()) {
            X3();
        } else {
            getWindow().addFlags(1024);
        }
        j4();
        uvg.g().i(this);
        MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
        if (sj9.v()) {
            vxm vxmVar = vxm.b;
            vxmVar.e().a("taolive_session_id", sj9.k());
            vxmVar.e().a("taolive_create_time", Long.valueOf(SystemClock.uptimeMillis()));
            vxmVar.e().a("taolive_create_isAfcColdContext", Boolean.valueOf(this.i));
        }
        this.f = new d1j(this);
        if (pvs.U()) {
            this.h = new hv9();
        }
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(this.q, new IntentFilter("com.taobao.taolive.room.TaoLiveVideoActivity.killself"));
        if (!this.t.g() && (findViewById = findViewById(16908290)) != null) {
            findViewById.setBackgroundColor(-16777216);
        }
    }

    public final void d4(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda74afb", new Object[]{this, intent});
            return;
        }
        hv9 hv9Var = this.h;
        if (hv9Var != null) {
            hv9Var.c();
            this.h.b();
        }
    }

    public final void e4(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8907da87", new Object[]{this, map});
            return;
        }
        hv9 hv9Var = this.h;
        if (hv9Var != null) {
            hv9Var.c();
            this.h.b();
        }
    }

    public final void f4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6efde2", new Object[]{this});
            return;
        }
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        this.t.h();
    }

    @Override // tb.yfb
    public void g0(tsd tsdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c530150c", new Object[]{this, tsdVar});
        } else {
            this.c.add(tsdVar);
        }
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("febe4434", new Object[]{this});
        }
        d1j d1jVar = this.f;
        if (d1jVar != null) {
            return d1jVar.b();
        }
        return null;
    }

    @Override // tb.fee
    public void h(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator<fee> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().h(str, jSONObject);
        }
    }

    public final void i4() {
        IUniversalProxy.c volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb1ef79", new Object[]{this});
        } else if (d9m.L() != null && (volumeChangeUploadManager = d9m.L().getVolumeChangeUploadManager()) != null) {
            volumeChangeUploadManager.init(this);
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        if (k0r.v()) {
            return true;
        }
        return super.isImmersiveStatus();
    }

    @Override // tb.isk
    public void j2(nei neiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5c8e6c", new Object[]{this, neiVar});
        } else if (isDestroyed() || isFinishing()) {
            String str = J;
            TLog.loge("TBLive", str, "Activity " + this + "已经销毁 不预播");
        } else {
            if (neiVar.g()) {
                if (neiVar.f()) {
                    String e2 = neiVar.e();
                    if (getIntent().getData() != null) {
                        Uri.Builder buildUpon = getIntent().getData().buildUpon();
                        buildUpon.appendQueryParameter("replayUrl", Uri.encode(e2));
                        buildUpon.appendQueryParameter(yj4.PARAM_REPLAY_URL_PLAY_MODE, "cdnReplayUrlPreRequest");
                        getIntent().setData(buildUpon.build());
                    }
                } else {
                    N3(getIntent(), neiVar.d(), null);
                    return;
                }
            }
            s4(this.G);
        }
    }

    public final boolean k4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("917c018b", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public final /* synthetic */ void l4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaedc304", new Object[]{this});
            return;
        }
        MediaData mediaData = this.B;
        if (mediaData == null) {
            mediaData = mxg.a(JSON.parseObject(this.A));
        }
        N3(getIntent(), mediaData, this.z);
    }

    public final /* synthetic */ void m4(Runnable runnable, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb936a1", new Object[]{this, runnable, new Long(j2)});
        } else {
            this.g.postAtFrontOfQueue(runnable);
        }
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        super.onActivityResult(i2, i3, intent);
        jyd jydVar = this.f13118a;
        if (jydVar == null) {
            return;
        }
        if (i2 == 20000) {
            jydVar.J();
        } else if (i2 == 20001) {
            jydVar.u();
        } else if (i2 != 10000) {
        } else {
            if (i3 == 8) {
                jydVar.j(false);
            } else if (i3 == 1) {
                jydVar.j(true);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        FlexaLiveX.u();
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            jydVar.onConfigurationChanged(configuration);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        d1j d1jVar = this.f;
        if (d1jVar != null && (menu instanceof MenuBuilder)) {
            d1jVar.c(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ux9 d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 == 4 && (((d2 = vx9.d()) == null || !pvs.f() || !d2.I()) && t4())) {
            return true;
        }
        jyd jydVar = this.f13118a;
        if (jydVar == null || !jydVar.onKeyDown(i2, keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            jydVar.onLowMemory();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        d1j d1jVar = this.f;
        if (d1jVar == null || !d1jVar.d(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9f42b3", new Object[]{this});
            return;
        }
        super.onPostResume();
        if (!this.u) {
            p4();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        d1j d1jVar = this.f;
        if (d1jVar != null) {
            d1jVar.e(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // tb.wqg
    public void onSetActivityTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e714bbe", new Object[]{this});
        } else {
            setTheme(R.style.Theme_NoBackgroundAndOverLayingActionBar_Taobao);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        String str = J;
        h4s.c(str, "onStart");
        if (!this.u) {
            r4();
        }
        TLog.loge("TBLive", str + "_APM", "onStart isAfcColdContext " + this.i + " isAfcContextCallback " + this.l + " mIsNewIntentAfcColdContext " + this.n);
        h4s.e();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onTrimMemory(i2);
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            jydVar.onTrimMemory(i2);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            View decorView = getWindow().getDecorView();
            if (k0r.v()) {
                decorView.setSystemUiVisibility(1280);
                getWindow().setStatusBarColor(0);
                return;
            }
            decorView.setSystemUiVisibility(5376);
        }
    }

    public final void p4() {
        cba cbaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("102f0bbf", new Object[]{this});
            return;
        }
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            cbaVar = jydVar.getGlobalContext();
        } else {
            cbaVar = null;
        }
        rbu.m0(cbaVar, this, "Page_TaobaoLiveWatch");
    }

    public final void q4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3923367f", new Object[]{this});
            return;
        }
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            if (!jydVar.g()) {
                Q3();
            }
            this.f13118a.onResume();
        }
    }

    public final void r4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f106a56", new Object[]{this});
            return;
        }
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            jydVar.onStart();
        }
    }

    public final void s4(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2beb43a5", new Object[]{this, view});
        } else if (!this.E && !isDestroyed()) {
            if (!c4()) {
                b4();
            }
            z4("firstFrame");
            sj9.g(null);
            updateApmDataValid(view);
            this.E = true;
            o4();
            r4();
            q4();
            p4();
            this.u = false;
        }
    }

    public final void v4() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b03720", new Object[]{this});
        } else if (W3() && (data = getIntent().getData()) != null) {
            MediaCaptureObserver mediaCaptureObserver = new MediaCaptureObserver(this, String.valueOf(data.getQueryParameter("id")));
            this.v = mediaCaptureObserver;
            mediaCaptureObserver.h(new e());
        }
    }

    public final void w4(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a203df5", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(activity, this.F);
        }
    }

    public final void x4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca88d13", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/TaoLiveVideoActivity$7");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                if (AppInfo.INITED_ACTION.equals(intent.getAction())) {
                    TLog.loge("TBLive", TaoLiveVideoActivity.G3() + "_APM", "onCreate registerLoginInitAction onReceive INITED_ACTION");
                    if (!Login.checkSessionValid()) {
                        TaoLiveVideoActivity.u3(TaoLiveVideoActivity.this);
                    } else {
                        TaoLiveVideoActivity.v3(TaoLiveVideoActivity.this);
                    }
                }
            }
        }, new IntentFilter(AppInfo.INITED_ACTION));
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.i));
        hashMap.put("isAfcContextCallback", String.valueOf(this.l));
        rbu.K(vx9.d(), "IsAfcColdContext_checkLoginInit", hashMap);
        TLog.loge("TBLive", J + "_APM", "onCreate registerLoginInitAction");
    }

    public final Uri y4(Uri uri, String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b70682d3", new Object[]{this, uri, str, str2});
        }
        if (uri == null || str == null || str2 == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        buildUpon.clearQuery();
        for (String str3 : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str3);
            if (str.equals(str3)) {
                buildUpon.appendQueryParameter(str3, str2);
                z = true;
            } else {
                buildUpon.appendQueryParameter(str3, queryParameter);
            }
        }
        if (!z) {
            buildUpon.appendQueryParameter(str, str2);
        }
        return buildUpon.build();
    }

    public void z4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a03ab", new Object[]{this, str});
        } else if (getIntent() != null && Y3()) {
            Coordinator.execute(new c(getIntent().getData(), str, System.currentTimeMillis(), getIntent().getStringExtra("newLiveSession")));
            x5t.h("TBLiveOpt_" + str, String.valueOf(System.currentTimeMillis()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements scd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f13128a;
        public final /* synthetic */ FrameLayout b;
        public final /* synthetic */ Intent c;

        public i(View view, FrameLayout frameLayout, Intent intent) {
            this.f13128a = view;
            this.b = frameLayout;
            this.c = intent;
        }

        @Override // tb.scd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe17d436", new Object[]{this});
            }
        }

        @Override // tb.scd
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82c35aa2", new Object[]{this});
            } else if (TaoLiveVideoActivity.K3(TaoLiveVideoActivity.this) && this.c.getExtras() != null) {
                String string = this.c.getExtras().getString("coverImage");
                if (!TextUtils.isEmpty(string) && TaoLiveVideoActivity.p3(TaoLiveVideoActivity.this) != null) {
                    TaoLiveVideoActivity.p3(TaoLiveVideoActivity.this).f(string);
                }
            }
        }

        @Override // tb.scd
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7d615fd", new Object[]{this});
            }
        }

        @Override // tb.scd
        public void e(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97b6435a", new Object[]{this, viewGroup});
            } else if (!TaoLiveVideoActivity.A3(TaoLiveVideoActivity.this) || !pvs.c1()) {
                this.b.addView(viewGroup);
            } else {
                this.b.addView(viewGroup, 0);
            }
        }

        @Override // tb.scd
        public void f(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93f493d0", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.scd
        public void g(mcd mcdVar) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616bf76b", new Object[]{this, mcdVar});
                return;
            }
            TaoLiveVideoActivity.I3(TaoLiveVideoActivity.this, this.f13128a);
            if (this.b != null) {
                TaoLiveVideoActivity taoLiveVideoActivity = TaoLiveVideoActivity.this;
                if (!taoLiveVideoActivity.E) {
                    Handler J3 = TaoLiveVideoActivity.J3(taoLiveVideoActivity);
                    final View view = this.f13128a;
                    Runnable p7tVar = new Runnable() { // from class: tb.p7t
                        @Override // java.lang.Runnable
                        public final void run() {
                            TaoLiveVideoActivity.i.this.k(view);
                        }
                    };
                    if (TaoLiveVideoActivity.A3(TaoLiveVideoActivity.this)) {
                        j = 16;
                    } else {
                        j = 0;
                    }
                    J3.postDelayed(p7tVar, j);
                }
            }
        }

        @Override // tb.scd
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bed2268", new Object[]{this});
            } else {
                TaoLiveVideoActivity.I3(TaoLiveVideoActivity.this, this.f13128a);
            }
        }

        public final /* synthetic */ void k(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0331bd", new Object[]{this, view});
            } else {
                TaoLiveVideoActivity.t3(TaoLiveVideoActivity.this, view);
            }
        }

        public final /* synthetic */ void l(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0f486a", new Object[]{this, view});
            } else {
                TaoLiveVideoActivity.t3(TaoLiveVideoActivity.this, view);
            }
        }

        @Override // tb.scd
        public void onSuccess() {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            rc.d(TaoLiveVideoActivity.this.getActivity());
            if (this.b != null) {
                TaoLiveVideoActivity taoLiveVideoActivity = TaoLiveVideoActivity.this;
                if (!taoLiveVideoActivity.E) {
                    Handler J3 = TaoLiveVideoActivity.J3(taoLiveVideoActivity);
                    final View view = this.f13128a;
                    Runnable q7tVar = new Runnable() { // from class: tb.q7t
                        @Override // java.lang.Runnable
                        public final void run() {
                            TaoLiveVideoActivity.i.this.l(view);
                        }
                    };
                    if (TaoLiveVideoActivity.A3(TaoLiveVideoActivity.this)) {
                        j = 16;
                    } else {
                        j = 0;
                    }
                    J3.postDelayed(q7tVar, j);
                }
            }
        }

        @Override // tb.scd
        public void onTimeout() {
            FrameLayout frameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a13bc209", new Object[]{this});
                return;
            }
            TaoLiveVideoActivity.t3(TaoLiveVideoActivity.this, this.f13128a);
            if (TaoLiveVideoActivity.A3(TaoLiveVideoActivity.this) && (frameLayout = this.b) != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // tb.scd
        public void c(BaseStatePlayer baseStatePlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdb6d58f", new Object[]{this, baseStatePlayer, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            int i = (int) j;
            if (i == 3) {
                o3s.b(TaoLiveVideoActivity.G3(), "[Metrics-VideoPrePlay]onVideoInfo()MEDIA_INFO_VIDEO_RENDERING_START");
                TaoLiveVideoActivity.q3(TaoLiveVideoActivity.this).put("kPlayerFirstFinishTime", String.valueOf(j2));
            } else if (i == 12101) {
                o3s.b(TaoLiveVideoActivity.G3(), "[Metrics-VideoPrePlay]onVideoInfo()MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE");
                if (!TaoLiveVideoActivity.r3(TaoLiveVideoActivity.this)) {
                    TaoLiveVideoActivity.q3(TaoLiveVideoActivity.this).put("kLivePlayerSuccess", String.valueOf(System.currentTimeMillis()));
                    TaoLiveVideoActivity.q3(TaoLiveVideoActivity.this).put("kLiveLowerPlayerSuccess", String.valueOf(j2));
                    h4s.b("KLifecycle_first_frame_pre");
                    h4s.e();
                    TaoLiveVideoActivity.s3(TaoLiveVideoActivity.this, true);
                }
            }
        }
    }

    public final void O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175806b2", new Object[]{this});
            return;
        }
        w4(this);
        Login.login(true);
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.i));
        hashMap.put("isAfcContextCallback", String.valueOf(this.l));
        rbu.K(vx9.d(), "IsAfcColdContext_checkSessionValid", hashMap);
        TLog.loge("TBLive", J + "_APM", "onCreate checkSessionValidFalse " + this.i);
    }

    public final boolean U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73f77c96", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().getStringSharedPreference("tblive", "closeAsyncStartUpOrg1", "true"));
        }
        return true;
    }

    public final boolean W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40931444", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableCaptureObserver", "true"));
        }
        return true;
    }

    public final boolean Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee04a188", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableTbliveUtBugfix", "true"));
        }
        return false;
    }

    public final boolean a4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80815579", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "fixCoverImageRelease", "true"));
        }
        return false;
    }

    public final boolean c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453b6a4f", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "handleLiveMethodCreateFix", "true"));
        }
        return true;
    }

    public final void g4() {
        ViewGroup viewGroup;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        getIntent().putExtra("firstTime", this.r);
        if (!(getIntent() == null || (data = getIntent().getData()) == null)) {
            data.getQueryParameter("newRoomType");
        }
        h4();
        if (this.k || this.u) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(16908290);
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundResource(0);
                viewGroup2.addView(this.f13118a.getView(), 0);
                RecyclerView recyclerView = this.f13118a.getRecyclerView();
                if (pvs.d1() && recyclerView != null) {
                    recyclerView.addOnLayoutChangeListener(new j7t(this, recyclerView));
                }
            }
            viewGroup = viewGroup2;
        } else {
            viewGroup = this.f13118a.getView();
            if (this.t.g()) {
                this.t.b(viewGroup);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.G == null) {
            this.G = viewGroup;
        }
        hv9 hv9Var = this.h;
        if (hv9Var != null) {
            hv9Var.b();
        }
    }

    public final void h4() {
        Uri data;
        Uri y4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1acf53", new Object[]{this});
            return;
        }
        if (pvs.F1()) {
            this.f13118a = new vbt(this, getIntent());
        } else {
            this.f13118a = new wvs(this, getIntent());
        }
        if (this.f13118a.getGlobalContext() != null) {
            this.t.c(this.f13118a.getGlobalContext());
        }
        this.f13118a.h(true);
        this.f13118a.z(new k7t(this));
        this.f13118a.v(new l7t(this));
        TBPublicMenu publicMenu = getPublicMenu();
        this.f13118a.e(new m7t(this, publicMenu));
        if (sbt.h()) {
            TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
            builder.setTitle("킊:直播举报").setMenuNeedtoBeClosedAfterItemClicked(true).setName("live_report").setId(R.id.taolive_global_report);
            TBPublicMenuItem build = builder.build();
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            if (build != null) {
                arrayList.add(build);
            }
            publicMenu.removeCustomMenuItemsByType("report");
            publicMenu.clearExternalMenus();
            publicMenu.addExternalMenus(arrayList, this.I);
        }
        this.f13118a.setSmallWindowClickListener(new n7t(this));
        if (this.f13118a.getGlobalContext() != null) {
            if (!(getIntent() == null || (data = getIntent().getData()) == null || (y4 = y4(data, yj4.PARAM_IS_LIVE_MUTE, String.valueOf(this.f13118a.getGlobalContext().e0()))) == null)) {
                getIntent().setData(y4);
            }
            this.f13118a.getGlobalContext().a(this.H);
        }
    }

    public final void j4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4ce5c8", new Object[]{this});
            return;
        }
        FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, this);
        FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, this);
        bl9.g().c();
        yfd.c().a(IRRoomProxy.KEY, RRoomProxy.getInstance());
    }

    public final void o4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9b77ff", new Object[]{this});
            return;
        }
        String str = J;
        x5t.d(str, "onCreateOldLive useNewArchitectureFirst: " + this.u);
        b4();
        g4();
        jyd jydVar = this.f13118a;
        if (!(jydVar == null || jydVar.getGlobalContext() == null || this.D.isEmpty())) {
            this.f13118a.getGlobalContext().W().putAll(this.D);
            this.D.clear();
        }
        jyd jydVar2 = this.f13118a;
        if (!(jydVar2 == null || jydVar2.getGlobalContext() == null)) {
            iba.O0(true, this.f13118a.getGlobalContext());
        }
        uvg.g().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T0);
        x5t.f("LIVE_CODE_BOOT_STAGE", "stage:t0");
        if (bl9.g().b()) {
            i4();
        } else {
            bl9.g().i(new h());
        }
        jyd jydVar3 = this.f13118a;
        if (jydVar3 != null) {
            jydVar3.onCreate();
        }
        v4();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        String str = J;
        h4s.c(str, "onPause");
        if (isFinishing() && v2s.o().E() != null) {
            qmh.f().f26825a.f("liveRoom", "Page_TaobaoLiveWatch", v2s.o().E().getPageAllProperties(this));
        }
        TLog.loge("TBLive", str + "_APM", "onPause isAfcColdContext " + this.i + " isAfcContextCallback " + this.l + " mIsNewIntentAfcColdContext " + this.n);
        super.onPause();
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            jydVar.x();
            this.f13118a.onPause();
        }
        uvg.g().c();
        if (!k4()) {
            if (!this.i) {
                rbu.D(null, this);
            } else if (this.n && this.m) {
                rbu.D(null, this);
                this.m = false;
            }
        }
        tvv.setUtVariables("Page_TaobaoLiveWatch");
        h4s.e();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        mcd mcdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        h4s.c(J, "onStop");
        if (this.k && (mcdVar = this.p) != null) {
            mcdVar.d();
            this.p = null;
        }
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            jydVar.onStop();
        }
        if (!k4() && this.i && this.m) {
            rbu.D(null, this);
            this.m = false;
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.i));
            hashMap.put("isAfcContextCallback", String.valueOf(this.l));
            hashMap.put("isNewIntentAfcColdContext", String.valueOf(this.n));
            rbu.K(vx9.d(), "IsAfcColdContext_onStop_pageDisAppear", hashMap);
        }
        h4s.e();
    }

    public final boolean u4(ISmartLandingProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ddc6b3e", new Object[]{this, aVar})).booleanValue();
        }
        jyd jydVar = this.f13118a;
        if (jydVar == null || jydVar.getGlobalContext() == null || this.f13118a.getGlobalContext().u == null) {
            return false;
        }
        return this.f13118a.getGlobalContext().u.g("leave", aVar);
    }

    public final boolean P3(String str, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("729428e3", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        this.o = false;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (TextUtils.equals("/tbopen/index.html", parse.getPath())) {
                str = parse.getQueryParameter("h5Url");
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                parse = Uri.parse(str);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                HashMap hashMap = new HashMap();
                hashMap.put("url_intent", str);
                rbu.K(vx9.d(), "IsAfcColdContext_change_url_nav", hashMap);
            }
            if (parse != null && !TextUtils.equals(q6f.PATH_TAOLIVE, parse.getPath()) && !TextUtils.equals("/act/talent/live.html", parse.getPath())) {
                if (z) {
                    rbu.D(null, this);
                    this.o = true;
                }
                NotifyApm.b().c(this);
                finish(true);
                Nav.from(this).toUri(str);
                overridePendingTransition(0, 0);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url_intent", str);
                rbu.K(vx9.d(), "IsAfcColdContext_newIntent_Nav", hashMap2);
                TLog.loge("TBLive", J + "_APM", "changeUrlNav " + str);
                return true;
            } else if (z2 && parse != null) {
                Intent intent = getIntent();
                intent.setData(parse);
                setIntent(intent);
            }
        }
        return false;
    }

    public final boolean T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9de8ad8c", new Object[]{this})).booleanValue();
        }
        if (hw0.m()) {
            return true;
        }
        Toast.makeText(this, "亲,你的机型暂不支持直播T.T", 1).show();
        finish();
        TLog.loge("TBLive", J + "_APM", "onCreate isArmV7CpuType false ");
        return false;
    }

    public final boolean n4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51ad215c", new Object[]{this})).booleanValue();
        }
        boolean checkSessionValid = Login.checkSessionValid();
        String userId = Login.getUserId();
        String nick = Login.getNick();
        if (this.i) {
            vxm.b.e().a("taolive_check_login_session_valid", Boolean.valueOf(checkSessionValid));
            if (!checkSessionValid && ((TextUtils.isEmpty(userId) || TextUtils.isEmpty(nick)) && !R3(checkSessionValid))) {
                return false;
            }
        } else if (!R3(checkSessionValid)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        h4s.b("KLifecycle_activity_create");
        h4s.e();
        String str = J;
        h4s.c(str, "onCreate");
        wng.f30792a = System.currentTimeMillis();
        wng.b = true;
        getPanguApplication().registerCrossActivityLifecycleCallback(this.w);
        this.t.i(bundle);
        TaoLiveLaunchInitializer.init();
        rc.d = false;
        wng.e = SystemClock.uptimeMillis();
        x5t.h(str, "[SavedInstanceState_startTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        super.onCreate(bundle);
        if (bundle != null) {
            this.D.put("kRestoreInstance", String.valueOf(Boolean.TRUE));
        }
        x5t.h(str, "[SavedInstanceState_endTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        this.t.m();
        this.u = false;
        this.E = false;
        Intent intent = getIntent();
        this.i = bqg.b(intent);
        this.l = bqg.c(intent);
        Coordinator.execute(new f());
        TLog.loge("TBLive", str + "_APM", "onCreate isAfcColdContext " + this.i + " isAfcContextCallback " + this.l + " mIsNewIntentAfcColdContext " + this.n);
        String dataString = intent.getDataString();
        if (this.i) {
            if (U3()) {
                HashMap hashMap = new HashMap();
                hashMap.put("isAfcColdContext", String.valueOf(this.i));
                hashMap.put("isAfcContextCallback", String.valueOf(this.l));
                hashMap.put("isAfcColdContext_rul", dataString);
                rbu.K(vx9.d(), "IsAfcColdContext_create2", hashMap);
            }
            if (this.l && P3(dataString, false)) {
                return;
            }
        }
        f4();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.taolive_bg));
        this.r = System.currentTimeMillis();
        E4();
        sj9.i(this.r, this.i, this.j, this.e, this.d, true, dataString);
        if (T3() && n4()) {
            if ((this.i || q6f.b) && pvs.c1() && znm.k().p()) {
                this.k = false;
                sj9.D("setResponseListener enablePreLoadVideoSimpleData");
                znm.k().v(new g());
            } else {
                if (intent.getData() == null || this.t.g()) {
                    this.u = false;
                } else {
                    Uri data = intent.getData();
                    this.z = data.getQueryParameter(yj4.PARAM_PLAY_VIEW_TOKEN);
                    if (intent.getStringExtra(yj4.PARAM_MEDIA_INFO) != null) {
                        this.A = intent.getStringExtra(yj4.PARAM_MEDIA_INFO);
                    } else if (intent.getSerializableExtra("liveUrlList") instanceof ArrayList) {
                        MediaData mediaData = new MediaData();
                        this.B = mediaData;
                        mediaData.liveUrlList = (ArrayList) intent.getSerializableExtra("liveUrlList");
                    } else if ("prePlayCustomPlayCtrlParams".equalsIgnoreCase(data.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL)) && !zqq.a(data.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL))) {
                        this.A = data.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL);
                    }
                    if (!zqq.a(this.z) || !zqq.a(this.A) || this.B != null) {
                        this.u = true;
                    }
                    if (!this.u && bundle == null) {
                        this.y = getIntent().getStringExtra("mediaInfoPreRequestKey");
                        this.x = getIntent().getStringExtra("preRequestUrlPlayMode");
                        if (!zqq.a(this.y)) {
                            this.u = true;
                        }
                    }
                }
                if (!this.u) {
                    o4();
                }
            }
            h4s.e();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IUniversalProxy.c volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        String str = J;
        h4s.c(str, "onDestroy");
        this.t.n();
        getPanguApplication().unregisterCrossActivityLifecycleCallback(this.w);
        this.G = null;
        hv9 hv9Var = this.h;
        if (hv9Var != null) {
            hv9Var.c();
        }
        hv9 hv9Var2 = this.h;
        if (hv9Var2 != null) {
            hv9Var2.a();
        }
        d1j d1jVar = this.f;
        if (d1jVar != null) {
            d1jVar.a();
        }
        RecentlyOftenWatchService.d().k();
        jyd jydVar = this.f13118a;
        if (jydVar != null) {
            jydVar.onDestroy();
        }
        C4(this);
        if (this.q != null) {
            LocalBroadcastManager.getInstance(getBaseContext()).unregisterReceiver(this.q);
            this.q = null;
        }
        jyd jydVar2 = this.f13118a;
        if (!(jydVar2 == null || jydVar2.getGlobalContext() == null)) {
            iba.O0(true, this.f13118a.getGlobalContext());
            iba.X("", this.f13118a.getGlobalContext());
        }
        vnm.c().a();
        znm.k().h();
        q6f.b = false;
        if (!(d9m.L() == null || (volumeChangeUploadManager = d9m.L().getVolumeChangeUploadManager()) == null)) {
            volumeChangeUploadManager.destroy();
        }
        bl9.g().c();
        B4();
        jyd jydVar3 = this.f13118a;
        sjr.g().j(this, (jydVar3 == null || jydVar3.getGlobalContext() == null) ? null : this.f13118a.getGlobalContext().V());
        if (pvs.d1() && this.p != null) {
            TLog.loge("tblive", str, "onDestroy 兜底对预播播放器引用计数-1");
            this.p.a(false);
            if (getIntent().getData() != null) {
                String queryParameter = getIntent().getData().getQueryParameter(yj4.WARMUP_PLAYER_TOKEN);
                if (!zqq.a(queryParameter)) {
                    yrr.c().h(queryParameter, 0L);
                }
            }
        }
        this.g.removeCallbacksAndMessages(null);
        if (!zqq.a(this.y)) {
            wnm.b().g(this.y);
        }
        V3();
        if (pvs.Q() && this.p != null) {
            TLog.loge("tblive", str, "onDestroy 清空预创建的播放器实例");
            this.p = null;
        }
        h4s.e();
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        wng.f30792a = System.currentTimeMillis();
        wng.c = true;
        this.u = false;
        this.n = bqg.b(intent);
        boolean c2 = bqg.c(intent);
        StringBuilder sb = new StringBuilder();
        String str = J;
        sb.append(str);
        sb.append("_APM");
        TLog.loge("TBLive", sb.toString(), "onNewIntent isAfcColdContext " + this.i + " isAfcContextCallback " + this.l + " mIsNewIntentAfcColdContext " + this.n + " isAfcContextCallback " + c2);
        if (this.i) {
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.i));
            hashMap.put("isAfcContextCallback", String.valueOf(this.l));
            hashMap.put("isNewIntentAfcColdContext", String.valueOf(this.n));
            hashMap.put("isAfcContextCallbackNewIntent", String.valueOf(c2));
            rbu.K(vx9.d(), "IsAfcColdContext_newIntent2", hashMap);
        }
        if (!this.i || !this.n || !c2) {
            if (intent != null) {
                setIntent(intent);
                Uri data = intent.getData();
                if (data != null) {
                    z = data.getBooleanQueryParameter("forceRefresh", false);
                }
            }
            if (this.f13118a != null) {
                Q3();
                this.f13118a.y(intent, z);
            }
            jyd jydVar = this.f13118a;
            if (!(jydVar == null || jydVar.getGlobalContext() == null)) {
                iba.O0(true, this.f13118a.getGlobalContext());
            }
            d4(intent);
            return;
        }
        TLog.loge("TBLive", str + "_APM", "onNewIntent return mIsAfcContextCallback " + this.l);
        if (!this.l) {
            P3(intent.getDataString(), true);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        String str = J;
        h4s.c(str, "onResume");
        z4("onResumeStart");
        if (k0r.v()) {
            A4(this, false);
        }
        TLog.loge("TBLive", str + "_APM", "onResume isAfcColdContext " + this.i + " isAfcContextCallback " + this.l + " mIsNewIntentAfcColdContext " + this.n);
        if (!this.i) {
            rbu.z(null, this);
        } else if (!this.m) {
            rbu.z(null, this);
            this.m = true;
        }
        z4("onResumeEnd");
        if (!this.u) {
            q4();
        } else {
            Z3();
        }
        h4s.e();
    }

    public final boolean t4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ad511b", new Object[]{this})).booleanValue();
        }
        if (this.i) {
            if (this.s) {
                return false;
            }
            this.s = true;
            t0u.c(getApplicationContext(), "亲，不再看一会儿了吗？");
            return true;
        } else if (!pvs.e()) {
            return u4(new d(this));
        } else {
            return false;
        }
    }

    public final void N3(Intent intent, MediaData mediaData, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664f6a0d", new Object[]{this, intent, mediaData, str});
            return;
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.taolive_root_layout, (ViewGroup) null, false);
        ufi ufiVar = new ufi();
        Uri data = intent.getData();
        if (data == null || TextUtils.isEmpty(str) || !tfi.i().m(str)) {
            String b2 = com.taobao.taolive.sdk.ui.media.a.b(mediaData, null);
            ufiVar.b = b2;
            ufiVar.f29342a = tfi.h(b2);
        } else {
            ufiVar.f29342a = str;
        }
        i iVar = new i(inflate, (FrameLayout) inflate.findViewById(R.id.rootVideoFrameLayout), intent);
        long a2 = ejr.a() + 300;
        PreloadParams.a V = new PreloadParams.a(this).L(data).f0(ufiVar).Q(mediaData).b0(1).V(iVar);
        if (this.k) {
            a2 = 5000;
        }
        mcd a3 = zrm.a(V.H(a2).G());
        this.p = a3;
        a3.b();
        boolean g2 = this.p.g();
        StringBuilder sb = new StringBuilder("公域直播间秒开create source：");
        sb.append(this.p.e());
        sb.append(", 有首帧：");
        sb.append(g2);
        sb.append(" 使用:");
        if (this.p.h()) {
            str2 = "SurfaceView";
        } else {
            str2 = "TextureView";
        }
        sb.append(str2);
        TLog.loge("TBLive", J, sb.toString());
        if (data != null && !TextUtils.isEmpty(this.p.c())) {
            S3(data, this.p.c());
        }
        Uri data2 = getIntent().getData();
        if (data2 != null) {
            Uri.Builder buildUpon = data2.buildUpon();
            if (this.p.e() == 2) {
                buildUpon.appendQueryParameter(yj4._PARAM_PLAY_MODE, "defaultInit");
            } else {
                buildUpon.appendQueryParameter(yj4._PARAM_PLAY_MODE, "viewToken");
            }
            intent.setData(buildUpon.build());
        }
        if (!pvs.d1()) {
            this.p.a(true);
        }
    }
}
