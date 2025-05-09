package com.taobao.taolive.room.openarchitecture.kmp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.kmp.live.flexa.openArch.IOpenArchProxy;
import com.taobao.kmp.nexus.arch.openArch.definition.OpenArchBizCode;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.bxl;
import tb.cir;
import tb.d4s;
import tb.d9m;
import tb.fkx;
import tb.fyk;
import tb.g1a;
import tb.gyk;
import tb.hlc;
import tb.jzk;
import tb.kzk;
import tb.lzk;
import tb.m2g;
import tb.mzk;
import tb.n2g;
import tb.nxf;
import tb.o3s;
import tb.p2g;
import tb.pvs;
import tb.q2g;
import tb.qvs;
import tb.r2g;
import tb.t2o;
import tb.toy;
import tb.ux9;
import tb.w3d;
import tb.x5t;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OpenArchSingleEntityAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final w3d f13192a;
    public String c;
    public final g1a<n2g<Object>, xhv> d = new a();
    public final g1a<n2g<Object>, xhv> e = new b();
    public final g1a<n2g<Object>, xhv> f = new c();
    public final mzk.a g = new d();
    public final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.taolive.room.openarchitecture.kmp.OpenArchSingleEntityAdapter.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/kmp/OpenArchSingleEntityAdapter$5");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && intent.getAction() != null && intent.getAction().equals("mega.stdPop.broadcast.windowStateChanged") && intent.getStringExtra("windowState") != null) {
                OpenArchSingleEntityAdapter openArchSingleEntityAdapter = OpenArchSingleEntityAdapter.this;
                OpenArchSingleEntityAdapter.r(openArchSingleEntityAdapter, OpenArchSingleEntityAdapter.b(openArchSingleEntityAdapter).getContext(), intent.getStringExtra("windowState"), nxf.a(intent));
            }
        }
    };
    public final mzk b = new mzk();
    public final IOpenArchProxy i = d9m.P();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public xhv invoke(n2g<Object> n2gVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("cd729a02", new Object[]{this, n2gVar});
            }
            String d = n2gVar.b().d();
            String b = lzk.b(n2gVar);
            if ("compensateLifecycle".equals(b)) {
                x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 " + d + " | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                return null;
            }
            jzk.a aVar = jzk.Companion;
            if (aVar.k().b().equals(d)) {
                Object obj = (n2gVar.a() == null || !(n2gVar.a() instanceof kzk)) ? null : ((kzk) n2gVar.a()).a().b().get("LifeCycleNativeParams");
                if ("activityLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 initParams | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).initParams(obj);
                } else if ("scrollContainerLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onBindView | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    if (obj instanceof RecModel) {
                        OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onBindView((RecModel) obj);
                    }
                } else if ("viewHolderLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onViewHolderWillLoad | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    if (obj instanceof RecModel) {
                        OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onViewHolderWillLoad((RecModel) obj);
                    }
                }
            } else if (aVar.r().b().equals(d)) {
                if ("activityLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onStart | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onStart();
                } else if ("scrollContainerLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onWillAppear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onWillAppear();
                } else if ("viewHolderLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onViewHolderWillAppear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onViewHolderWillAppear();
                }
            } else if (aVar.m().b().equals(d)) {
                if ("activityLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onResume | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onResume();
                } else if ("scrollContainerLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onDidAppear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onDidAppear();
                } else if ("viewHolderLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onViewHolderDidAppear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onViewHolderDidAppear();
                }
            } else if (aVar.s().b().equals(d)) {
                if ("activityLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onPause | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onPause();
                } else if ("scrollContainerLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onWillDisappear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onWillDisappear();
                } else if ("viewHolderLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onViewHolderWillDisappear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onViewHolderWillDisappear();
                }
            } else if (aVar.n().b().equals(d)) {
                if ("activityLifecycle".equals(b)) {
                    if (n2gVar.a() == null || !(n2gVar.a() instanceof kzk)) {
                        x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onStop | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                        OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onStop(true);
                    } else {
                        x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onStop | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                        Object obj2 = ((kzk) n2gVar.a()).a().b().get("isOpenSmallWindowOnce");
                        if (obj2 instanceof Boolean) {
                            z = ((Boolean) obj2).booleanValue();
                        }
                        OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onStop(z);
                    }
                } else if ("scrollContainerLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onDidDisappear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onDidDisappear();
                } else if ("viewHolderLifecycle".equals(b)) {
                    x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onViewHolderDidDisappear | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onViewHolderDidDisappear();
                }
            } else if (!aVar.l().b().equals(d)) {
                x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 unKnow lifecycle" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
            } else if ("activityLifecycle".equals(b)) {
                x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onDestroy | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onDestroy();
            } else if ("viewHolderLifecycle".equals(b)) {
                x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 onViewHolderDestroy | kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).onViewHolderDestroy();
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements g1a<n2g<Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public xhv invoke(n2g<Object> n2gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("cd729a02", new Object[]{this, n2gVar});
            }
            if (!jzk.Companion.c().b().equals(n2gVar.b().d()) || n2gVar.a() == null || !(n2gVar.a() instanceof kzk)) {
                return null;
            }
            Object obj = ((kzk) n2gVar.a()).a().b().get("liveDetailResponseOriginalData");
            if (!(OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this) instanceof hlc.a)) {
                return null;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject((Map) obj);
                x5t.f("OpenArchSingleEntityAdapter", "OpenArch DataService👉🏻 WhenLiveDetailResponseCallback kmpIdentifier=" + OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                if ("2".equals(jSONObject.getString("detailType"))) {
                    b((kzk) n2gVar.a());
                    ((hlc.a) OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this)).onGetFandomInfoSuccess((FandomInfo) fkx.j(jSONObject, FandomInfo.class), jSONObject.toJSONString());
                    return null;
                }
                b((kzk) n2gVar.a());
                ((hlc.a) OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this)).onGetVideoInfoSuccess((VideoInfo) fkx.j(jSONObject, VideoInfo.class), jSONObject.toJSONString());
                return null;
            }
            x5t.d("OpenArchSingleEntityAdapter", "OpenArch DataService👉🏻 WhenLiveDetailResponseCallback Value Type Error");
            ((hlc.a) OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this)).onGetVideoInfoFail("");
            return null;
        }

        public final void b(kzk kzkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5a6041", new Object[]{this, kzkVar});
                return;
            }
            Object obj = kzkVar.a().b().get("liveDetailPerformance");
            if (OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).getGlobalContext() != null && (obj instanceof Map)) {
                try {
                    Map map = (Map) obj;
                    String valueOf = String.valueOf(map.get(bxl.DETAIL_START_TS));
                    String valueOf2 = String.valueOf(map.get(bxl.DETAIL_RECEIVE_TS));
                    String valueOf3 = String.valueOf(map.get(bxl.DETAIL_MODEL_TS));
                    String valueOf4 = String.valueOf(map.get(bxl.DETAIL_MTOP_END_TS));
                    String valueOf5 = String.valueOf(map.get(bxl.DETAIL_SUCCESS));
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).updatePerformanceTrack(bxl.DETAIL_START_TS, valueOf);
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).updatePerformanceTrack(bxl.DETAIL_RECEIVE_TS, valueOf2);
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).updatePerformanceTrack(bxl.DETAIL_MODEL_TS, valueOf3);
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).updatePerformanceTrack(bxl.DETAIL_MTOP_END_TS, valueOf4);
                    OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).updatePerformanceTrack(bxl.DETAIL_SUCCESS, valueOf5);
                } catch (Exception e) {
                    o3s.c("OpenArchSingleEntityAdapter", "Update detail performance track error", e);
                }
            }
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
            if (!"OpenArch_WhenInstanceWillRelease".equals(n2gVar.b().d())) {
                return null;
            }
            OpenArchSingleEntityAdapter.c(OpenArchSingleEntityAdapter.this).c(false, OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).getGlobalContext());
            OpenArchSingleEntityAdapter.d(OpenArchSingleEntityAdapter.this);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements mzk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a(jzk jzkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db30adbe", new Object[]{this, jzkVar});
                return;
            }
            jzk.a aVar = jzk.Companion;
            RecModel recModel = null;
            if (jzkVar == aVar.r()) {
                OpenArchSingleEntityAdapter openArchSingleEntityAdapter = OpenArchSingleEntityAdapter.this;
                if (OpenArchSingleEntityAdapter.b(openArchSingleEntityAdapter).getFrameContext() != null) {
                    recModel = OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).getFrameContext().w0();
                }
                openArchSingleEntityAdapter.j("compensateLifecycle", recModel, OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).getFrameContext(), true, null);
            } else if (jzkVar == aVar.m()) {
                OpenArchSingleEntityAdapter openArchSingleEntityAdapter2 = OpenArchSingleEntityAdapter.this;
                if (OpenArchSingleEntityAdapter.b(openArchSingleEntityAdapter2).getFrameContext() != null) {
                    recModel = OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).getFrameContext().w0();
                }
                openArchSingleEntityAdapter2.g("compensateLifecycle", recModel, OpenArchSingleEntityAdapter.b(OpenArchSingleEntityAdapter.this).getFrameContext(), true);
            } else if (jzkVar == aVar.n()) {
                OpenArchSingleEntityAdapter.this.h("compensateLifecycle", true);
            } else {
                m2g fetchEntity = OpenArchSingleEntityAdapter.e(OpenArchSingleEntityAdapter.this).fetchEntity(OpenArchSingleEntityAdapter.a(OpenArchSingleEntityAdapter.this));
                HashMap hashMap = new HashMap();
                hashMap.put("paramsLifecycleType", "compensateLifecycle");
                if (fetchEntity != null && fetchEntity.l() != null) {
                    fetchEntity.l().q(new r2g(jzkVar, hashMap));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum;

        static {
            int[] iArr = new int[PlatformListenerEnum.values().length];
            $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum = iArr;
            try {
                iArr[PlatformListenerEnum.onCreate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onBindView.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onViewHolderWillLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onStart.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onWillAppear.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onViewHolderWillAppear.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onResume.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onDidAppear.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onViewHolderDidAppear.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onWillDisappear.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onPause.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onViewHolderWillDisappear.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onDidDisappear.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onStop.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onViewHolderDidDisappear.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onDestory.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onViewHolderDestroy.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    static {
        t2o.a(779093031);
    }

    public OpenArchSingleEntityAdapter(w3d w3dVar) {
        this.f13192a = w3dVar;
    }

    public static /* synthetic */ String a(OpenArchSingleEntityAdapter openArchSingleEntityAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77918bab", new Object[]{openArchSingleEntityAdapter});
        }
        return openArchSingleEntityAdapter.c;
    }

    public static /* synthetic */ w3d b(OpenArchSingleEntityAdapter openArchSingleEntityAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w3d) ipChange.ipc$dispatch("b3f3819", new Object[]{openArchSingleEntityAdapter});
        }
        return openArchSingleEntityAdapter.f13192a;
    }

    public static /* synthetic */ mzk c(OpenArchSingleEntityAdapter openArchSingleEntityAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mzk) ipChange.ipc$dispatch("6706b809", new Object[]{openArchSingleEntityAdapter});
        }
        return openArchSingleEntityAdapter.b;
    }

    public static /* synthetic */ void d(OpenArchSingleEntityAdapter openArchSingleEntityAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ba798", new Object[]{openArchSingleEntityAdapter});
        } else {
            openArchSingleEntityAdapter.q();
        }
    }

    public static /* synthetic */ IOpenArchProxy e(OpenArchSingleEntityAdapter openArchSingleEntityAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchProxy) ipChange.ipc$dispatch("8b0531ec", new Object[]{openArchSingleEntityAdapter});
        }
        return openArchSingleEntityAdapter.i;
    }

    public static /* synthetic */ void r(OpenArchSingleEntityAdapter openArchSingleEntityAdapter, Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3690e38", new Object[]{openArchSingleEntityAdapter, context, str, jSONObject});
        } else {
            openArchSingleEntityAdapter.o(context, str, jSONObject);
        }
    }

    public final void f() {
        fyk fykVar;
        m2g fetchEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f3f04e", new Object[]{this});
            return;
        }
        x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 createOpenArchEntity");
        gyk gykVar = new gyk();
        gykVar.k(OpenArchBizCode.SingleLiveRoomPublic);
        if (this.f13192a.getFrameContext() == null || this.f13192a.getFrameContext().A() == null || (fetchEntity = this.i.fetchEntity(this.f13192a.getFrameContext().A().kmpIdentifier)) == null) {
            fykVar = null;
        } else {
            fykVar = (fyk) fetchEntity.g();
        }
        m2g createEntity = this.i.createEntity(new fyk(fykVar, gykVar));
        if (createEntity != null) {
            this.c = createEntity.k();
        }
        if (this.f13192a.getFrameContext() != null) {
            this.f13192a.getFrameContext().d0(this.c);
        }
        n(this.c);
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58495eb8", new Object[]{this});
        }
        return this.c;
    }

    public void m() {
        m2g fetchEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa39ee82", new Object[]{this});
        } else if (pvs.k0()) {
            x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 initSingleEntity kmpIdentifier");
            String str = this.c;
            if (!(str == null || (fetchEntity = this.i.fetchEntity(str)) == null)) {
                x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 releaseEntity");
                this.i.releaseEntity(fetchEntity);
                this.c = null;
            }
            f();
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48253bcc", new Object[]{this, str});
        } else if (pvs.k0()) {
            x5t.f("OpenArchSingleEntityAdapter", "OpenArch Lifecycle👉🏻 initSingleEntity kmpIdentifier  =" + str);
            this.c = str;
            m2g fetchEntity = this.i.fetchEntity(str);
            if (!(fetchEntity == null || fetchEntity.j() == null)) {
                p2g j = fetchEntity.j();
                q2g.a aVar = q2g.Companion;
                q2g b2 = aVar.b();
                toy.a aVar2 = toy.Companion;
                j.g(b2, aVar2.b(), this.d);
                fetchEntity.j().g(aVar.b(), aVar2.a(), this.e);
                fetchEntity.j().g(aVar.b(), aVar2.c(), this.f);
            }
            if (this.f13192a.getFrameContext() != null) {
                this.f13192a.getFrameContext().d0(str);
            }
            p();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90cb6df", new Object[]{this});
        } else if (this.f13192a.getContext() != null) {
            Context context = this.f13192a.getContext();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("mega.stdPop.broadcast.windowStateChanged");
            LocalBroadcastManager.getInstance(context).registerReceiver(this.h, intentFilter);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2a6a18", new Object[]{this});
        } else if (this.f13192a.getContext() != null) {
            LocalBroadcastManager.getInstance(this.f13192a.getContext()).unregisterReceiver(this.h);
        }
    }

    public boolean g(String str, RecModel recModel, ux9 ux9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81f7b841", new Object[]{this, str, recModel, ux9Var, new Boolean(z)})).booleanValue();
        }
        if (!pvs.k0()) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("inputParams", lzk.a(recModel, ux9Var));
        Map<String, Object> c2 = lzk.c(ux9Var);
        c2.put("needRequestLiveDetail", String.valueOf(z));
        hashMap.put("localParams", c2);
        return i(PlatformListenerEnum.onDidAppear, str, hashMap);
    }

    public boolean h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b6a129", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (!pvs.k0()) {
            return false;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("needClearData", Boolean.toString(z));
        hashMap.put("config", hashMap2);
        return i(PlatformListenerEnum.onDidDisappear, str, hashMap);
    }

    public final void o(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40adc0d7", new Object[]{this, context, str, jSONObject});
        } else if (k(context, jSONObject)) {
            if (IAKPopRender.WindowState.STD_POP_HALF.equals(str)) {
                cir.a("OpenArchSingleEntityAdapter", "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_HALF_SCREEN kmpIdentifier=" + this.c);
            } else if (IAKPopRender.WindowState.STD_POP_FULL_SCREEN.equals(str)) {
                cir.a("OpenArchSingleEntityAdapter", "onReceive INSIDE_DETAIL_BROADCAST_ACTION SCENE_FULL_SCREEN kmpIdentifier=" + this.c);
                if (pvs.j0()) {
                    h("compensateLifecycle", false);
                }
            }
        }
    }

    public boolean i(PlatformListenerEnum platformListenerEnum, String str, Map<String, Object> map) {
        m2g fetchEntity;
        jzk jzkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e063467f", new Object[]{this, platformListenerEnum, str, map})).booleanValue();
        }
        if (!pvs.k0() || (fetchEntity = this.i.fetchEntity(this.c)) == null || fetchEntity.l() == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("paramsLifecycleType", str);
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        switch (e.$SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[platformListenerEnum.ordinal()]) {
            case 1:
            case 2:
            case 3:
                jzkVar = jzk.Companion.k();
                break;
            case 4:
            case 5:
            case 6:
                jzkVar = jzk.Companion.r();
                break;
            case 7:
            case 8:
            case 9:
                jzkVar = jzk.Companion.m();
                break;
            case 10:
            case 11:
            case 12:
                jzkVar = jzk.Companion.s();
                break;
            case 13:
            case 14:
            case 15:
                jzkVar = jzk.Companion.n();
                break;
            case 16:
            case 17:
                jzkVar = jzk.Companion.l();
                break;
            default:
                jzkVar = null;
                break;
        }
        if (jzkVar != null) {
            if (d4s.e("enableCycleCompensator", true) && !this.b.b(jzkVar, this.g)) {
                return false;
            }
            fetchEntity.l().q(new r2g(jzkVar, hashMap));
        }
        return true;
    }

    public boolean j(String str, RecModel recModel, ux9 ux9Var, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26067ba1", new Object[]{this, str, recModel, ux9Var, new Boolean(z), hashMap})).booleanValue();
        }
        if (!pvs.k0()) {
            return false;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("inputParams", lzk.a(recModel, ux9Var));
        Map<String, Object> c2 = lzk.c(ux9Var);
        c2.put("needRequestLiveDetail", String.valueOf(z));
        if (!d4s.e("enableCycleCompensator", true) && !qvs.u()) {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put("needClearData", "true");
        }
        if (hashMap != null) {
            hashMap2.put("config", hashMap);
        }
        hashMap2.put("localParams", c2);
        return i(PlatformListenerEnum.onWillAppear, str, hashMap2);
    }

    public final boolean k(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1e93494", new Object[]{this, context, jSONObject})).booleanValue();
        }
        return (jSONObject == null || context == null || !String.valueOf(context.hashCode()).equals(jSONObject.getString("popId"))) ? false : true;
    }
}
