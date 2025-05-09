package com.taobao.themis.open.ability.audio;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.themis.open.utils.LocalPathType;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.d1a;
import tb.eoh;
import tb.f7m;
import tb.gcs;
import tb.iwd;
import tb.jr;
import tb.k8s;
import tb.mcs;
import tb.ncs;
import tb.t2o;
import tb.tmu;
import tb.uq;
import tb.vva;
import tb.wc9;
import tb.ws4;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class MegaPlayerInstance implements iwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion = new c(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f13622a;
    public final ITMSPage b;
    public iwd.a c;
    public final String e;
    public String f;
    public volatile boolean g;
    public volatile boolean h;
    public boolean i;
    public int l;
    public int m;
    public boolean d = true;
    public float j = 1.0f;
    public int k = 3;
    public final d n = new d(this);
    public final AtomicBoolean o = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/themis/open/ability/audio/MegaPlayerInstance$PlayerState;", "", "(Ljava/lang/String;I)V", ModuleConstants.VI_MODULE_NAME_INIT, "START_PREPARE", "PREPARED", "WAIT_SEEKING", "WAIT_SEEKING_COMPLETE", "PLAYING", "PAUSED", "ENDED", FilterManager.STOP, "ERROR", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class PlayerState extends Enum<PlayerState> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final PlayerState INIT = new PlayerState(ModuleConstants.VI_MODULE_NAME_INIT, 0);
        public static final PlayerState START_PREPARE = new PlayerState("START_PREPARE", 1);
        public static final PlayerState PREPARED = new PlayerState("PREPARED", 2);
        public static final PlayerState WAIT_SEEKING = new PlayerState("WAIT_SEEKING", 3);
        public static final PlayerState WAIT_SEEKING_COMPLETE = new PlayerState("WAIT_SEEKING_COMPLETE", 4);
        public static final PlayerState PLAYING = new PlayerState("PLAYING", 5);
        public static final PlayerState PAUSED = new PlayerState("PAUSED", 6);
        public static final PlayerState ENDED = new PlayerState("ENDED", 7);
        public static final PlayerState STOP = new PlayerState(FilterManager.STOP, 8);
        public static final PlayerState ERROR = new PlayerState("ERROR", 9);
        private static final /* synthetic */ PlayerState[] $VALUES = $values();

        private static final /* synthetic */ PlayerState[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PlayerState[]) ipChange.ipc$dispatch("872f4074", new Object[0]) : new PlayerState[]{INIT, START_PREPARE, PREPARED, WAIT_SEEKING, WAIT_SEEKING_COMPLETE, PLAYING, PAUSED, ENDED, STOP, ERROR};
        }

        private PlayerState(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(PlayerState playerState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/ability/audio/MegaPlayerInstance$PlayerState");
        }

        public static PlayerState valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("116eee9", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(PlayerState.class, str);
            }
            return (PlayerState) valueOf;
        }

        public static PlayerState[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("50f4ed18", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (PlayerState[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ITMSPage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f13624a;

        public b() {
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void f(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b96e2075", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.c(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void h(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3516433", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.d(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void l(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7a6418b", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.e(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void n(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b526f91", new Object[]{this, iTMSPage});
            } else {
                ITMSPage.a.C0773a.f(this, iTMSPage);
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebcc1e", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            if (this.f13624a) {
                MegaPlayerInstance.this.play();
                this.f13624a = false;
            }
        }

        @Override // com.taobao.themis.kernel.page.ITMSPage.a
        public void g(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("485e7409", new Object[]{this, iTMSPage});
                return;
            }
            ckf.g(iTMSPage, "page");
            if (!MegaPlayerInstance.this.g()) {
                this.f13624a = true;
                MegaPlayerInstance.this.pause();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        static {
            t2o.a(843055150);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            t2o.a(843055155);
            int[] iArr = new int[ApPathType.values().length];
            iArr[ApPathType.AP_PATH_TYPE_USR.ordinal()] = 1;
            iArr[ApPathType.AP_PATH_TYPE_TEMP.ordinal()] = 2;
            iArr[ApPathType.AP_PATH_TYPE_NETWORK.ordinal()] = 3;
            iArr[ApPathType.AP_PATH_TYPE_UNKNOWN.ordinal()] = 4;
            iArr[ApPathType.AP_PATH_TYPE_PKG.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocalPathType.values().length];
            iArr2[LocalPathType.LOCAL_PATH_TYPE_USR.ordinal()] = 1;
            iArr2[LocalPathType.LOCAL_PATH_TYPE_TEMP.ordinal()] = 2;
            iArr2[LocalPathType.LOCAL_PATH_TYPE_UNKNOWN.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlayerState.values().length];
            iArr3[PlayerState.INIT.ordinal()] = 1;
            iArr3[PlayerState.START_PREPARE.ordinal()] = 2;
            iArr3[PlayerState.PREPARED.ordinal()] = 3;
            iArr3[PlayerState.STOP.ordinal()] = 4;
            iArr3[PlayerState.ENDED.ordinal()] = 5;
            iArr3[PlayerState.PLAYING.ordinal()] = 6;
            iArr3[PlayerState.PAUSED.ordinal()] = 7;
            iArr3[PlayerState.ERROR.ordinal()] = 8;
            iArr3[PlayerState.WAIT_SEEKING_COMPLETE.ordinal()] = 9;
            iArr3[PlayerState.WAIT_SEEKING.ordinal()] = 10;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final f INSTANCE = new f();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public g(String str) {
            this.b = str;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.START_PREPARE);
            } else {
                TMSLogger.b("MegaPlayerInstance", ckf.p("cache local audio failed: ", this.b));
                MegaPlayerInstance.j(MegaPlayerInstance.this, ckf.p("cache local audio failed:", this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final h INSTANCE = new h();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class i implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final i INSTANCE = new i();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class j implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final j INSTANCE = new j();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class k implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final k INSTANCE = new k();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class l implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final l INSTANCE = new l();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class m implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final m INSTANCE = new m();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class n implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final n INSTANCE = new n();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class o implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final o INSTANCE = new o();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class p implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final p INSTANCE = new p();

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (!jrVar.d()) {
                TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
            }
        }
    }

    static {
        t2o.a(843055145);
        t2o.a(839909483);
    }

    public MegaPlayerInstance(String str, ITMSPage iTMSPage) {
        ckf.g(str, "mPlayerId");
        ckf.g(iTMSPage, "mPage");
        this.f13622a = str;
        this.b = iTMSPage;
        String d2 = mcs.d(ncs.c(iTMSPage));
        this.e = d2;
        k8s j2 = k8s.j();
        bbs instance = iTMSPage.getInstance();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "Audio");
        xhv xhvVar = xhv.INSTANCE;
        j2.d(instance, TMSCalendarBridge.namespace, d2, str, MUSMonitor.MODULE_DIM_ABILITY, "create", jSONObject, a.INSTANCE);
        U(false);
        k8s.j().d(iTMSPage.getInstance(), TMSCalendarBridge.namespace, d2, str, "AudioContext", "setEventListener", new JSONObject(), new uq() { // from class: com.taobao.themis.open.ability.audio.MegaPlayerInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: com.taobao.themis.open.ability.audio.MegaPlayerInstance$3$2  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ MegaPlayerInstance this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(MegaPlayerInstance megaPlayerInstance) {
                    super(0);
                    this.this$0 = megaPlayerInstance;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/ability/audio/MegaPlayerInstance$3$2");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                    } else {
                        this.this$0.play();
                    }
                }
            }

            @Override // tb.uq
            public final void a(jr jrVar, boolean z) {
                String str2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                    return;
                }
                TMSLogger.a("MegaPlayerInstance", ckf.p("event listener: ", jrVar.a()));
                if (!jrVar.d()) {
                    TMSLogger.b("MegaPlayerInstance", ckf.p("mega fail! ", jrVar.a()));
                    MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.ERROR);
                    MegaPlayerInstance megaPlayerInstance = MegaPlayerInstance.this;
                    String c2 = jrVar.c();
                    if (c2 == null) {
                        c2 = "";
                    }
                    MegaPlayerInstance.j(megaPlayerInstance, c2);
                } else if (MegaPlayerInstance.this.G()) {
                    Object obj = jrVar.a().get("type");
                    Integer num = null;
                    String obj2 = obj == null ? null : obj.toString();
                    if (obj2 != null) {
                        switch (obj2.hashCode()) {
                            case -1842374802:
                                str2 = "onWaiting";
                                break;
                            case -1340212393:
                                str2 = "onPause";
                                break;
                            case -1338265852:
                                if (obj2.equals("onReady")) {
                                    JSONObject jSONObject2 = jrVar.a().getJSONObject("data");
                                    Object obj3 = jSONObject2 == null ? null : jSONObject2.get(tmu.CURRENT_TIME);
                                    Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                                    Object obj4 = jSONObject2 == null ? null : jSONObject2.get("duration");
                                    if (obj4 instanceof Integer) {
                                        num = (Integer) obj4;
                                    }
                                    if (num2 == null || num == null) {
                                        TMSLogger.b("MegaPlayerInstance", "mega on time update currentTime or duration is null");
                                        return;
                                    }
                                    MegaPlayerInstance.v(MegaPlayerInstance.this, num2.intValue());
                                    MegaPlayerInstance.w(MegaPlayerInstance.this, num.intValue());
                                    MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.PREPARED);
                                    return;
                                }
                                return;
                            case -1013169885:
                                if (obj2.equals("onLoop")) {
                                    MegaPlayerInstance.E(MegaPlayerInstance.this, "onForegroundAudioPlay", null, 2, null);
                                    return;
                                }
                                return;
                            case -1013054029:
                                if (obj2.equals("onPlay") && MegaPlayerInstance.n(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) >= 0) {
                                    MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.PLAYING);
                                    return;
                                }
                                return;
                            case -1012956543:
                                if (obj2.equals("onStop") && MegaPlayerInstance.n(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) >= 0) {
                                    MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.STOP);
                                    return;
                                }
                                return;
                            case -986867829:
                                str2 = "onSeeking";
                                break;
                            case -800580979:
                                str2 = "onWaitingEnd";
                                break;
                            case -503449776:
                                if (obj2.equals(MessageID.onSeekComplete) && MegaPlayerInstance.n(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) >= 0) {
                                    if (MegaPlayerInstance.s(MegaPlayerInstance.this).get()) {
                                        MegaPlayerInstance.s(MegaPlayerInstance.this).set(false);
                                        MegaPlayerInstance.E(MegaPlayerInstance.this, "onForegroundAudioSeeked", null, 2, null);
                                    }
                                    if (MegaPlayerInstance.n(MegaPlayerInstance.this).a() == PlayerState.WAIT_SEEKING) {
                                        MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.WAIT_SEEKING_COMPLETE);
                                        CommonExtKt.r(new AnonymousClass2(MegaPlayerInstance.this), 0L, 2, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case -107951819:
                                if (obj2.equals("onTimeUpdate")) {
                                    JSONObject jSONObject3 = jrVar.a().getJSONObject("data");
                                    Object obj5 = jSONObject3 == null ? null : jSONObject3.get(tmu.CURRENT_TIME);
                                    Integer num3 = obj5 instanceof Integer ? (Integer) obj5 : null;
                                    Object obj6 = jSONObject3 == null ? null : jSONObject3.get("duration");
                                    if (obj6 instanceof Integer) {
                                        num = (Integer) obj6;
                                    }
                                    if (num3 == null || num == null) {
                                        TMSLogger.b("MegaPlayerInstance", "mega on time update currentTime or duration is null");
                                        return;
                                    }
                                    MegaPlayerInstance.v(MegaPlayerInstance.this, num3.intValue());
                                    MegaPlayerInstance megaPlayerInstance2 = MegaPlayerInstance.this;
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put((JSONObject) tmu.CURRENT_TIME, (String) Float.valueOf(num3.intValue() / 1000.0f));
                                    jSONObject4.put((JSONObject) "duration", (String) Float.valueOf(num.intValue() / 1000.0f));
                                    xhv xhvVar2 = xhv.INSTANCE;
                                    MegaPlayerInstance.k(megaPlayerInstance2, "onForegroundAudioTimeUpdate", jSONObject4);
                                    return;
                                }
                                return;
                            case 105857660:
                                if (obj2.equals("onEnd")) {
                                    if (MegaPlayerInstance.m(MegaPlayerInstance.this)) {
                                        MegaPlayerInstance.E(MegaPlayerInstance.this, "onForegroundAudioEnded", null, 2, null);
                                        return;
                                    } else {
                                        MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.ENDED);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            case 1463983852:
                                if (obj2.equals("onResume") && MegaPlayerInstance.n(MegaPlayerInstance.this).a().compareTo(PlayerState.PREPARED) >= 0) {
                                    MegaPlayerInstance.n(MegaPlayerInstance.this).b(PlayerState.PLAYING);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                        obj2.equals(str2);
                    }
                }
            }
        });
        iTMSPage.C(new b());
        TMSLogger.a("MegaPlayerInstance", ckf.p("MegaPlayerInstance: mPlayerId=", str));
    }

    public static final /* synthetic */ void A(MegaPlayerInstance megaPlayerInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29ed7ac", new Object[]{megaPlayerInstance, new Boolean(z)});
        } else {
            megaPlayerInstance.h = z;
        }
    }

    public static final /* synthetic */ void B(MegaPlayerInstance megaPlayerInstance, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2f293e", new Object[]{megaPlayerInstance, new Double(d2)});
        } else {
            megaPlayerInstance.V(d2);
        }
    }

    public static /* synthetic */ void E(MegaPlayerInstance megaPlayerInstance, String str, JSONObject jSONObject, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4a21c8", new Object[]{megaPlayerInstance, str, jSONObject, new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            jSONObject = new JSONObject();
        }
        megaPlayerInstance.D(str, jSONObject);
    }

    public static final /* synthetic */ void j(MegaPlayerInstance megaPlayerInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dac609c", new Object[]{megaPlayerInstance, str});
        } else {
            megaPlayerInstance.C(str);
        }
    }

    public static final /* synthetic */ void k(MegaPlayerInstance megaPlayerInstance, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc7fd9a", new Object[]{megaPlayerInstance, str, jSONObject});
        } else {
            megaPlayerInstance.D(str, jSONObject);
        }
    }

    public static final /* synthetic */ boolean l(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29393424", new Object[]{megaPlayerInstance})).booleanValue();
        }
        return megaPlayerInstance.g;
    }

    public static final /* synthetic */ boolean m(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e74fe3", new Object[]{megaPlayerInstance})).booleanValue();
        }
        return megaPlayerInstance.i;
    }

    public static final /* synthetic */ d n(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("2eae2d14", new Object[]{megaPlayerInstance});
        }
        return megaPlayerInstance.n;
    }

    public static final /* synthetic */ String o(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("886cec34", new Object[]{megaPlayerInstance});
        }
        return megaPlayerInstance.f;
    }

    public static final /* synthetic */ int p(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3f368f3", new Object[]{megaPlayerInstance})).intValue();
        }
        return megaPlayerInstance.m;
    }

    public static final /* synthetic */ boolean q(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("574fab20", new Object[]{megaPlayerInstance})).booleanValue();
        }
        return megaPlayerInstance.h;
    }

    public static final /* synthetic */ float r(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fc91e19", new Object[]{megaPlayerInstance})).floatValue();
        }
        return megaPlayerInstance.j;
    }

    public static final /* synthetic */ AtomicBoolean s(MegaPlayerInstance megaPlayerInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("13fa0659", new Object[]{megaPlayerInstance});
        }
        return megaPlayerInstance.o;
    }

    public static final /* synthetic */ void t(MegaPlayerInstance megaPlayerInstance, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cd9ff5", new Object[]{megaPlayerInstance, str, new Boolean(z)});
        } else {
            megaPlayerInstance.P(str, z);
        }
    }

    public static final /* synthetic */ void u(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911844df", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.R(i2);
        }
    }

    public static final /* synthetic */ void v(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76a36a", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.l = i2;
        }
    }

    public static final /* synthetic */ void w(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30539c00", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.k = i2;
        }
    }

    public static final /* synthetic */ void x(MegaPlayerInstance megaPlayerInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f55fede", new Object[]{megaPlayerInstance, new Boolean(z)});
        } else {
            megaPlayerInstance.T(z);
        }
    }

    public static final /* synthetic */ void y(MegaPlayerInstance megaPlayerInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f5d36", new Object[]{megaPlayerInstance, new Boolean(z)});
        } else {
            megaPlayerInstance.U(z);
        }
    }

    public static final /* synthetic */ void z(MegaPlayerInstance megaPlayerInstance, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3904a77", new Object[]{megaPlayerInstance, new Integer(i2)});
        } else {
            megaPlayerInstance.m = i2;
        }
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e31764", new Object[]{this, str});
            return;
        }
        TMSLogger.b("MegaPlayerInstance", "broadcastError id=" + this.f13622a + " ,error = " + str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "audioPlayerID", this.f13622a);
        jSONObject2.put((JSONObject) "error", str);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "data", (String) jSONObject2);
        if (H() != null) {
            iwd.a H = H();
            if (H != null) {
                H.fireEvent("onForegroundAudioError", jSONObject);
                return;
            }
            return;
        }
        this.b.y("onForegroundAudioError", jSONObject);
    }

    public final void D(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb59fc06", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put((JSONObject) "audioPlayerID", this.f13622a);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject2.put((JSONObject) "data", (String) jSONObject);
        if (H() != null) {
            iwd.a H = H();
            if (H != null) {
                H.fireEvent(str, jSONObject2);
                return;
            }
            return;
        }
        this.b.y(str, jSONObject2);
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c67f0b04", new Object[]{this})).booleanValue();
        }
        TMSLogger.a("MegaPlayerInstance", "getAutoPlay: playerId:" + this.f13622a + " autoPlay:" + this.g);
        return this.g;
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffcb8eac", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public iwd.a H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwd.a) ipChange.ipc$dispatch("6016c9e", new Object[]{this});
        }
        return this.c;
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25696a5", new Object[]{this})).booleanValue();
        }
        TMSLogger.a("MegaPlayerInstance", "getLoop: " + this.i + " id=" + this.f13622a);
        return this.i;
    }

    public final int K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b93", new Object[]{this})).intValue();
        }
        TMSLogger.a("MegaPlayerInstance", "getStartTime: " + (this.m / 1000.0f) + " id=" + this.f13622a);
        return this.m / 1000;
    }

    public final float L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91a40687", new Object[]{this})).floatValue();
        }
        TMSLogger.a("MegaPlayerInstance", "getVolume: " + this.j + " id=" + this.f13622a);
        return this.j;
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf8c006", new Object[]{this});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", "pauseByMega");
        k8s.j().d(this.b.getInstance(), TMSCalendarBridge.namespace, this.e, this.f13622a, "AudioContext", "pause", new JSONObject(), h.INSTANCE);
    }

    public final void O(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a61435", new Object[]{this, str, new Integer(i2)});
        } else if (this.o.get()) {
            this.n.b(PlayerState.WAIT_SEEKING);
        } else {
            TMSLogger.a("MegaPlayerInstance", "playByMega: " + str + ", " + i2);
            k8s j2 = k8s.j();
            bbs instance = this.b.getInstance();
            String str2 = this.e;
            String str3 = this.f13622a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "src", str);
            jSONObject.put((JSONObject) "startPosition", (String) Integer.valueOf(i2));
            xhv xhvVar = xhv.INSTANCE;
            j2.d(instance, TMSCalendarBridge.namespace, str2, str3, "AudioContext", "play", jSONObject, i.INSTANCE);
        }
    }

    public final void P(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2441e713", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", "prepareByMega: " + str + ", " + z);
        k8s j2 = k8s.j();
        bbs instance = this.b.getInstance();
        String str2 = this.e;
        String str3 = this.f13622a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "src", str);
        jSONObject.put((JSONObject) "shouldLoop", (String) Boolean.valueOf(z));
        xhv xhvVar = xhv.INSTANCE;
        j2.d(instance, TMSCalendarBridge.namespace, str2, str3, "AudioContext", "prepare", jSONObject, j.INSTANCE);
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ee497d", new Object[]{this});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", "resumeByMega");
        k8s.j().d(this.b.getInstance(), TMSCalendarBridge.namespace, this.e, this.f13622a, "AudioContext", "play", new JSONObject(), k.INSTANCE);
    }

    public final void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d27b38", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a58255e", new Object[]{this, new Boolean(z)});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", ckf.p("setLoopByMega: ", Boolean.valueOf(z)));
        k8s j2 = k8s.j();
        bbs instance = this.b.getInstance();
        String str = this.e;
        String str2 = this.f13622a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "value", (String) Boolean.valueOf(z));
        xhv xhvVar = xhv.INSTANCE;
        j2.d(instance, TMSCalendarBridge.namespace, str, str2, "AudioContext", "setLoop", jSONObject, m.INSTANCE);
    }

    public final void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7aa86", new Object[]{this, new Boolean(z)});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", ckf.p("setPauseInBackground: ", Boolean.valueOf(z)));
        k8s j2 = k8s.j();
        bbs instance = this.b.getInstance();
        String str = this.e;
        String str2 = this.f13622a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "value", (String) Boolean.valueOf(z));
        xhv xhvVar = xhv.INSTANCE;
        j2.d(instance, TMSCalendarBridge.namespace, str, str2, "AudioContext", "setPauseInBackground", jSONObject, n.INSTANCE);
    }

    public final void V(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44001512", new Object[]{this, new Double(d2)});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", ckf.p("setVolumeByMega: ", Double.valueOf(d2)));
        k8s j2 = k8s.j();
        bbs instance = this.b.getInstance();
        String str = this.e;
        String str2 = this.f13622a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "value", (String) Double.valueOf(d2));
        xhv xhvVar = xhv.INSTANCE;
        j2.d(instance, TMSCalendarBridge.namespace, str, str2, "AudioContext", CommandID.setVolume, jSONObject, o.INSTANCE);
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61c8312", new Object[]{this});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", "stopByMega");
        k8s.j().d(this.b.getInstance(), TMSCalendarBridge.namespace, this.e, this.f13622a, "AudioContext", "stop", new JSONObject(), p.INSTANCE);
    }

    @Override // tb.iwd
    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue();
        }
        if (this.n.a().compareTo(PlayerState.PREPARED) < 0) {
            return 0.0f;
        }
        return this.l / 1000.0f;
    }

    @Override // tb.iwd
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ce40d68", new Object[]{this})).intValue();
        }
        return 100;
    }

    @Override // tb.iwd
    public void d(iwd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6046615a", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // tb.iwd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        W();
        k8s j2 = k8s.j();
        bbs instance = this.b.getInstance();
        String str = this.e;
        String str2 = this.f13622a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "audio");
        xhv xhvVar = xhv.INSTANCE;
        j2.d(instance, TMSCalendarBridge.namespace, str, str2, "AudioContext", "destroy", jSONObject, f.INSTANCE);
    }

    @Override // tb.iwd
    public boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c175601b", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    @Override // tb.iwd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        if (this.n.a() != PlayerState.PLAYING) {
            return true;
        }
        return false;
    }

    @Override // tb.iwd
    public float getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a81", new Object[]{this})).floatValue();
        }
        if (this.n.a().compareTo(PlayerState.PREPARED) < 0) {
            return 0.0f;
        }
        return this.k / 1000.0f;
    }

    @Override // tb.iwd
    public boolean h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d71591", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // tb.iwd
    public boolean i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c396e4c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.n.a().compareTo(PlayerState.PREPARED) > 0) {
            C("autoPlay can not change after setting");
            return false;
        }
        this.g = z;
        return true;
    }

    @Override // tb.iwd
    public boolean seek(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9bfbe8", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        int i3 = e.$EnumSwitchMapping$2[this.n.a().ordinal()];
        if (i3 == 1 || i3 == 2) {
            C("can not seek before onCanPlay");
        } else if (i3 == 4) {
            C("call seek only support in play or paused status ,not stop");
        } else if (i3 == 5) {
            this.l = i2;
            R(i2 * 1000);
            return true;
        } else if (i3 != 8) {
            R(i2 * 1000);
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public PlayerState f13625a = PlayerState.INIT;
        public final /* synthetic */ MegaPlayerInstance b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(843055154);
                int[] iArr = new int[PlayerState.values().length];
                iArr[PlayerState.INIT.ordinal()] = 1;
                iArr[PlayerState.START_PREPARE.ordinal()] = 2;
                iArr[PlayerState.PREPARED.ordinal()] = 3;
                iArr[PlayerState.PLAYING.ordinal()] = 4;
                iArr[PlayerState.PAUSED.ordinal()] = 5;
                iArr[PlayerState.ENDED.ordinal()] = 6;
                iArr[PlayerState.STOP.ordinal()] = 7;
                iArr[PlayerState.ERROR.ordinal()] = 8;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            t2o.a(843055153);
        }

        public d(MegaPlayerInstance megaPlayerInstance) {
            ckf.g(megaPlayerInstance, "this$0");
            this.b = megaPlayerInstance;
        }

        public final PlayerState a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PlayerState) ipChange.ipc$dispatch("c70c0492", new Object[]{this});
            }
            return this.f13625a;
        }

        public final void b(PlayerState playerState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffcb0bc", new Object[]{this, playerState});
                return;
            }
            ckf.g(playerState, "state");
            if (playerState != this.f13625a) {
                this.f13625a = playerState;
                switch (a.$EnumSwitchMapping$0[playerState.ordinal()]) {
                    case 2:
                        MegaPlayerInstance.E(this.b, "onForegroundAudioWaiting", null, 2, null);
                        MegaPlayerInstance megaPlayerInstance = this.b;
                        String o = MegaPlayerInstance.o(megaPlayerInstance);
                        if (o != null) {
                            MegaPlayerInstance.t(megaPlayerInstance, o, MegaPlayerInstance.m(this.b));
                            return;
                        } else {
                            ckf.y("mSrc");
                            throw null;
                        }
                    case 3:
                        MegaPlayerInstance.E(this.b, "onForegroundAudioCanPlay", null, 2, null);
                        MegaPlayerInstance megaPlayerInstance2 = this.b;
                        MegaPlayerInstance.x(megaPlayerInstance2, MegaPlayerInstance.m(megaPlayerInstance2));
                        MegaPlayerInstance megaPlayerInstance3 = this.b;
                        MegaPlayerInstance.B(megaPlayerInstance3, MegaPlayerInstance.r(megaPlayerInstance3));
                        MegaPlayerInstance.y(this.b, false);
                        if (MegaPlayerInstance.p(this.b) > 0) {
                            MegaPlayerInstance megaPlayerInstance4 = this.b;
                            MegaPlayerInstance.u(megaPlayerInstance4, MegaPlayerInstance.p(megaPlayerInstance4));
                        }
                        if (MegaPlayerInstance.l(this.b) || MegaPlayerInstance.q(this.b)) {
                            this.b.play();
                            return;
                        }
                        return;
                    case 4:
                        MegaPlayerInstance.A(this.b, false);
                        MegaPlayerInstance.E(this.b, "onForegroundAudioPlay", null, 2, null);
                        return;
                    case 5:
                        MegaPlayerInstance.E(this.b, "onForegroundAudioPause", null, 2, null);
                        return;
                    case 6:
                        MegaPlayerInstance.E(this.b, "onForegroundAudioEnded", null, 2, null);
                        return;
                    case 7:
                        MegaPlayerInstance.A(this.b, false);
                        MegaPlayerInstance.z(this.b, 0);
                        MegaPlayerInstance.v(this.b, 0);
                        MegaPlayerInstance.E(this.b, "onForegroundAudioStop", null, 2, null);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final String J() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bd8590b", new Object[]{this});
        }
        String str2 = this.f;
        if (str2 != null) {
            int i2 = e.$EnumSwitchMapping$1[ws4.e(str2).ordinal()];
            if (i2 == 1) {
                String f2 = TMSInstanceExtKt.f(this.b.getInstance());
                String str3 = this.f;
                if (str3 != null) {
                    str = ws4.f(f2, str3, ApPathType.AP_PATH_TYPE_USR);
                } else {
                    ckf.y("mSrc");
                    throw null;
                }
            } else if (i2 == 2) {
                String f3 = TMSInstanceExtKt.f(this.b.getInstance());
                String str4 = this.f;
                if (str4 != null) {
                    str = ws4.f(f3, str4, ApPathType.AP_PATH_TYPE_TEMP);
                } else {
                    ckf.y("mSrc");
                    throw null;
                }
            } else if (i2 == 3) {
                str = this.f;
                if (str == null) {
                    ckf.y("mSrc");
                    throw null;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (str == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder("getSrc: mSrc:");
            String str5 = this.f;
            if (str5 != null) {
                sb.append(str5);
                sb.append(", src:");
                sb.append(str);
                TMSLogger.a("MegaPlayerInstance", sb.toString());
                if (str.length() == 0) {
                    StringBuilder sb2 = new StringBuilder("getSrc error: mSrc:");
                    String str6 = this.f;
                    if (str6 != null) {
                        sb2.append(str6);
                        sb2.append(", src is empty");
                        TMSLogger.b("MegaPlayerInstance", sb2.toString());
                    } else {
                        ckf.y("mSrc");
                        throw null;
                    }
                }
                return str;
            }
            ckf.y("mSrc");
            throw null;
        }
        ckf.y("mSrc");
        throw null;
    }

    public final String M(String str, ITMSPage iTMSPage) {
        String str2;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aedadcfb", new Object[]{this, str, iTMSPage});
        }
        byte[] b2 = gcs.b(str, iTMSPage.getInstance());
        if (b2 == null) {
            return str;
        }
        String a2 = vva.a(eoh.a(b2));
        if (a2.length() == 0) {
            return str;
        }
        int e0 = wsq.e0(str, ".", 0, false, 6, null);
        if (e0 != -1) {
            str2 = str.substring(e0);
            ckf.f(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = ".mp3";
        }
        String f2 = TMSInstanceExtKt.f(iTMSPage.getInstance());
        String a3 = ws4.a(f2, "https://tmp/audio/" + a2 + str2, ApPathType.AP_PATH_TYPE_TEMP);
        if (a3 == null || a3.length() == 0) {
            return str;
        }
        File file = new File(a3);
        if (!file.exists() || file.length() != b2.length) {
            try {
                parentFile = file.getParentFile();
            } catch (Exception e2) {
                TMSLogger.c("MegaPlayerInstance", "create local audio file failed: " + ((Object) a3) + ", " + ((Object) e2.getMessage()), e2);
            }
            if (parentFile != null && parentFile.exists()) {
                file.createNewFile();
                wc9 wc9Var = wc9.INSTANCE;
                bbs instance = iTMSPage.getInstance();
                ByteBuffer wrap = ByteBuffer.wrap(b2);
                ckf.f(wrap, "wrap(audioData)");
                wc9Var.n(instance, a3, wrap, "ArrayBuffer", new g(a3));
                String absolutePath = file.getAbsolutePath();
                ckf.f(absolutePath, "file.absolutePath");
                return absolutePath;
            }
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null) {
                parentFile2.mkdirs();
            }
            file.createNewFile();
            wc9 wc9Var2 = wc9.INSTANCE;
            bbs instance2 = iTMSPage.getInstance();
            ByteBuffer wrap2 = ByteBuffer.wrap(b2);
            ckf.f(wrap2, "wrap(audioData)");
            wc9Var2.n(instance2, a3, wrap2, "ArrayBuffer", new g(a3));
            String absolutePath2 = file.getAbsolutePath();
            ckf.f(absolutePath2, "file.absolutePath");
            return absolutePath2;
        }
        String absolutePath3 = file.getAbsolutePath();
        ckf.f(absolutePath3, "file.absolutePath");
        return absolutePath3;
    }

    public final void R(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29df05fb", new Object[]{this, new Integer(i2)});
            return;
        }
        TMSLogger.a("MegaPlayerInstance", "seekByMega id=" + this.f13622a + " ,position = " + i2);
        this.o.set(true);
        k8s j2 = k8s.j();
        bbs instance = this.b.getInstance();
        String str = this.e;
        String str2 = this.f13622a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "position", (String) Integer.valueOf(i2));
        xhv xhvVar = xhv.INSTANCE;
        j2.d(instance, TMSCalendarBridge.namespace, str, str2, "AudioContext", "seek", jSONObject, l.INSTANCE);
    }

    @Override // tb.iwd
    public boolean setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d0b0cb", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        TMSLogger.a("MegaPlayerInstance", "setLoop: " + z + " id=" + this.f13622a);
        this.i = z;
        T(z);
        return true;
    }

    @Override // tb.iwd
    public boolean c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0c94373", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.n.a().compareTo(PlayerState.PREPARED) > 0) {
            C("startTime can not change after setting");
            return false;
        }
        this.m = i2 * 1000;
        return true;
    }

    @Override // tb.iwd
    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        int i2 = e.$EnumSwitchMapping$2[this.n.a().ordinal()];
        if (i2 == 1) {
            C("src is null , can not pause");
            return false;
        } else if (i2 != 6) {
            return false;
        } else {
            N();
            this.n.b(PlayerState.PAUSED);
            return true;
        }
    }

    @Override // tb.iwd
    public boolean play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue();
        }
        switch (e.$EnumSwitchMapping$2[this.n.a().ordinal()]) {
            case 1:
                C("src is null , can not play");
                return false;
            case 2:
                this.h = true;
                break;
            case 3:
                String str = this.f;
                if (str != null) {
                    O(str, this.m);
                    break;
                } else {
                    ckf.y("mSrc");
                    throw null;
                }
            case 4:
                this.m = 0;
                Q();
                break;
            case 5:
                String str2 = this.f;
                if (str2 != null) {
                    O(str2, 0);
                    this.n.b(PlayerState.PLAYING);
                    break;
                } else {
                    ckf.y("mSrc");
                    throw null;
                }
            case 6:
                break;
            case 7:
                Q();
                break;
            case 8:
            case 10:
                return false;
            case 9:
                String str3 = this.f;
                if (str3 != null) {
                    O(str3, this.m);
                    break;
                } else {
                    ckf.y("mSrc");
                    throw null;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    @Override // tb.iwd
    public boolean setVolume(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3942a781", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            TMSLogger.b("MegaPlayerInstance", "setVolume invalid param.");
            return false;
        }
        this.j = f2;
        V(f2);
        return true;
    }

    @Override // tb.iwd
    public boolean stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6623bb8d", new Object[]{this})).booleanValue();
        }
        int i2 = e.$EnumSwitchMapping$2[this.n.a().ordinal()];
        if (i2 != 1) {
            if (i2 != 4) {
                W();
                this.n.b(PlayerState.STOP);
            }
            return true;
        }
        C("src is null , can not stop");
        return false;
    }

    @Override // tb.iwd
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dbfab37", new Object[]{this, str})).booleanValue();
        }
        if (this.f != null) {
            C("src can not change after setting");
            return false;
        } else if (str == null || str.length() == 0) {
            this.n.b(PlayerState.ERROR);
            return false;
        } else {
            ApPathType d2 = ws4.d(str, this.b.getInstance());
            int i2 = e.$EnumSwitchMapping$0[d2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                String a2 = ws4.a(TMSInstanceExtKt.f(this.b.getInstance()), str, d2);
                if (a2 != null) {
                    str = a2;
                }
            } else if (i2 == 3 || i2 == 4) {
                if (!TMSPermissionManager.INSTANCE.d(this.b.getInstance(), str, TMSPermissionManager.SpecialConfigType.RESOURCE)) {
                    C(f7m.ERROR_URL_NOT_IN_WHITE_LIST);
                    return false;
                }
            } else if (i2 == 5) {
                String M = M(str, this.b);
                if (ckf.b(M, str)) {
                    this.n.b(PlayerState.ERROR);
                    return false;
                }
                str = M;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.f = str;
            this.n.b(PlayerState.START_PREPARE);
            return true;
        }
    }
}
