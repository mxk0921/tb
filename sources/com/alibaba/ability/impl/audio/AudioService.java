package com.alibaba.ability.impl.audio;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow;
import com.alibaba.ability.impl.audio.floatwindow.FloatWindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.nav.Nav;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.uc.webview.export.extension.UCCore;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.asc;
import tb.b1m;
import tb.ckf;
import tb.fub;
import tb.hbl;
import tb.iih;
import tb.jsb;
import tb.kei;
import tb.lei;
import tb.lfi;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.te;
import tb.u1a;
import tb.ue;
import tb.ve;
import tb.we;
import tb.wua;
import tb.xhv;
import tb.zkq;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static te g;
    public static String i;
    public static WeakReference<lfi> j;
    public static s k;

    /* renamed from: a  reason: collision with root package name */
    public te f1905a;
    public s b;
    public WeakReference<lfi> c;
    public String d;
    public AudioFloatWindow e;
    public boolean f;
    public static final b Companion = new b(null);
    public static ue h = new ue();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ue f1908a = new ue();
        public lfi b;
        public final String c;

        static {
            t2o.a(98566158);
        }

        public a(String str) {
            ckf.g(str, "bizId");
            this.c = str;
        }

        public static /* synthetic */ void b(a aVar, Context context, int i, Bundle bundle, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ea4c0e1", new Object[]{aVar, context, new Integer(i), bundle, new Integer(i2), obj});
                return;
            }
            if ((i2 & 4) != 0) {
                bundle = null;
            }
            aVar.a(context, i, bundle);
        }

        public final void c(lei leiVar) {
            kei keiVar;
            long j;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d66c91f2", new Object[]{this, leiVar});
                return;
            }
            ckf.g(leiVar, "callback");
            if (!ckf.b(this.c, AudioService.b())) {
                leiVar.a(null);
                return;
            }
            te c = AudioService.c();
            if (c == null || (keiVar = c.c) == null) {
                leiVar.a(null);
                return;
            }
            we weVar = new we();
            weVar.b = keiVar;
            s e = AudioService.e();
            if (e == null || e.m(1500) != 1) {
                z = false;
            }
            zkq zkqVar = new zkq(z);
            s e2 = AudioService.e();
            long j2 = 0;
            if (e2 != null) {
                j = e2.m(1502);
            } else {
                j = 0;
            }
            zkqVar.b = j;
            s e3 = AudioService.e();
            if (e3 != null) {
                j2 = e3.m(1501);
            }
            zkqVar.d = j2;
            xhv xhvVar = xhv.INSTANCE;
            weVar.f30652a = zkqVar;
            leiVar.a(weVar);
        }

        public final void d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b01342eb", new Object[]{this, context});
                return;
            }
            ckf.g(context, "ctx");
            b(this, context, 1, null, 4, null);
        }

        public final void e(Context context, te teVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a666c09a", new Object[]{this, context, teVar});
                return;
            }
            ckf.g(context, "ctx");
            ckf.g(teVar, "params");
            AudioService.h(teVar);
            AudioService.g(this.c);
            AudioService.j(new WeakReference(this.b));
            AudioService.i(this.f1908a);
            context.startService(new Intent(context, AudioService.class));
        }

        public final void f(ve veVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6216598c", new Object[]{this, veVar});
                return;
            }
            ckf.g(veVar, "propCallback");
            if (ckf.b(this.c, AudioService.b())) {
                veVar.a(AudioService.d());
            } else {
                veVar.a(this.f1908a);
            }
        }

        public final void g(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37f1c014", new Object[]{this, context});
                return;
            }
            ckf.g(context, "ctx");
            b(this, context, 2, null, 4, null);
        }

        public final void h(Context context, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd12e67a", new Object[]{this, context, new Integer(i)});
                return;
            }
            ckf.g(context, "ctx");
            Bundle bundle = new Bundle();
            bundle.putInt("seek_position", i);
            xhv xhvVar = xhv.INSTANCE;
            a(context, 4, bundle);
        }

        public final void i(lfi lfiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb419891", new Object[]{this, lfiVar});
                return;
            }
            ckf.g(lfiVar, DataReceiveMonitor.CB_LISTENER);
            this.b = lfiVar;
            if (ckf.b(this.c, AudioService.b())) {
                AudioService.j(new WeakReference(lfiVar));
            }
        }

        public final void j(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5217c6c9", new Object[]{this, map});
                return;
            }
            ckf.g(map, wua.KEY_PROPERTIES);
            this.f1908a.c(map);
            if (ckf.b(this.c, AudioService.b())) {
                s e = AudioService.e();
                if (e != null) {
                    this.f1908a.a(e);
                }
                AudioService.i(this.f1908a);
            }
        }

        public final void k(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6f0ac5f", new Object[]{this, context});
                return;
            }
            ckf.g(context, "ctx");
            b(this, context, 3, null, 4, null);
        }

        public final void a(Context context, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fda473c", new Object[]{this, context, new Integer(i), bundle});
            } else if (!ckf.b(this.c, AudioService.b())) {
                lfi lfiVar = this.b;
                if (lfiVar == null) {
                    return;
                }
                if (AudioService.b() == null) {
                    lfiVar.onError("noPlayingAudio", "当前页面没有正在播放的音频");
                } else {
                    lfiVar.onError("controlForbidden", "不支持操作非当前业务播放的后台音频");
                }
            } else if (i == 3) {
                context.stopService(new Intent(context, AudioService.class));
            } else {
                Intent intent = new Intent(context, AudioService.class);
                if (bundle != null) {
                    intent.replaceExtras(bundle);
                }
                intent.putExtra("control_action_type", i);
                xhv xhvVar = xhv.INSTANCE;
                context.startService(intent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        static {
            t2o.a(98566159);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements AudioFloatWindow.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.alibaba.ability.impl.audio.floatwindow.AudioFloatWindow.a
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe348b80", new Object[]{this, new Integer(i), obj});
            } else if (i == 0) {
                s a2 = AudioService.a(AudioService.this);
                if (a2 != null) {
                    a2.F();
                }
            } else if (i == 1) {
                s a3 = AudioService.a(AudioService.this);
                if (a3 != null) {
                    a3.u();
                }
            } else if (i == 2) {
                AudioService.this.stopSelf();
            } else if (i == 3) {
                AudioService.f(AudioService.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements jsb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(kei keiVar, te teVar) {
        }

        @Override // tb.jsb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d161a8c5", new Object[]{this});
            } else {
                AudioService.f(AudioService.this);
            }
        }

        @Override // tb.jsb
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c91fc33", new Object[]{this});
            } else {
                AudioService.k(AudioService.this, AudioService$setupPlayer$instance$1$2$onSkipToNext$1.INSTANCE);
            }
        }

        @Override // tb.jsb
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6436c5b7", new Object[]{this});
            } else {
                AudioService.k(AudioService.this, AudioService$setupPlayer$instance$1$2$onSkipToPrevious$1.INSTANCE);
            }
        }

        @Override // tb.jsb
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c00935", new Object[]{this});
            } else {
                AudioService.this.stopSelf();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f1911a;

        public e(kei keiVar, s sVar) {
            this.f1911a = sVar;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            Bitmap bitmap;
            BitmapDrawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null || (drawable = succPhenixEvent.getDrawable()) == null) {
                bitmap = null;
            } else {
                bitmap = drawable.getBitmap();
            }
            ckf.f(succPhenixEvent, "event");
            if (!succPhenixEvent.isIntermediate()) {
                this.f1911a.D(4017, bitmap);
            }
            return true;
        }
    }

    static {
        t2o.a(98566157);
    }

    public static final /* synthetic */ s a(AudioService audioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("3160051b", new Object[]{audioService});
        }
        return audioService.b;
    }

    public static final /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce6a0d99", new Object[0]);
        }
        return i;
    }

    public static final /* synthetic */ te c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (te) ipChange.ipc$dispatch("69fe7834", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ ue d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue) ipChange.ipc$dispatch("a998c28c", new Object[0]);
        }
        return h;
    }

    public static final /* synthetic */ s e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("c77d60c8", new Object[0]);
        }
        return k;
    }

    public static final /* synthetic */ void f(AudioService audioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d3c481", new Object[]{audioService});
        } else {
            audioService.m();
        }
    }

    public static final /* synthetic */ void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81156165", new Object[]{str});
        } else {
            i = str;
        }
    }

    public static final /* synthetic */ void h(te teVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c94c36", new Object[]{teVar});
        } else {
            g = teVar;
        }
    }

    public static final /* synthetic */ void i(ue ueVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abb0d24", new Object[]{ueVar});
        } else {
            h = ueVar;
        }
    }

    public static /* synthetic */ Object ipc$super(AudioService audioService, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioService");
    }

    public static final /* synthetic */ void j(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c6214", new Object[]{weakReference});
        } else {
            j = weakReference;
        }
    }

    public static final /* synthetic */ void k(AudioService audioService, u1a u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8346e2de", new Object[]{audioService, u1aVar});
        } else {
            audioService.q(u1aVar);
        }
    }

    public static final /* synthetic */ void l(AudioService audioService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c797003e", new Object[]{audioService, new Boolean(z)});
        } else {
            audioService.r(z);
        }
    }

    public final void m() {
        Map<?, ?> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606afadf", new Object[]{this});
            return;
        }
        te teVar = this.f1905a;
        if (teVar != null && (map = teVar.d) != null && (obj = map.get("url")) != null) {
            try {
                Uri.Builder buildUpon = Uri.parse(obj.toString()).buildUpon();
                ckf.f(buildUpon, "Uri.parse(urlStr).buildUpon()");
                buildUpon.appendQueryParameter("from", "MegaBGAudio");
                Intent intentForUri = Nav.from(this).intentForUri(buildUpon.build());
                if (intentForUri != null) {
                    intentForUri.addFlags(268435456);
                    intentForUri.addFlags(4194304);
                    intentForUri.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                    startActivity(intentForUri);
                }
            } catch (ClassNotFoundException | Exception | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
            }
        }
    }

    public final void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bd43b6", new Object[]{this, str, str2});
        } else if (this.f) {
            Intent intent = new Intent("com.taobao.taobao.mega.BACKGROUND_SERVICE");
            intent.putExtra("bizID", str);
            intent.putExtra("status", str2);
            LocalBroadcastManager.getInstance(this).sendBroadcastSync(intent);
        }
    }

    public final void o(te teVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e55d71", new Object[]{this, teVar});
        } else if (hbl.k()) {
            AudioFloatWindow audioFloatWindow = this.e;
            if (audioFloatWindow == null) {
                audioFloatWindow = new AudioFloatWindow(this, new c(), null, 0, 12, null);
                this.e = audioFloatWindow;
            }
            audioFloatWindow.play(teVar);
            FloatWindowManager.Companion.a().b(this, audioFloatWindow);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        s sVar = this.b;
        if (sVar != null) {
            sVar.c("close", null);
            sVar.h();
            this.b = null;
        }
        String str = this.d;
        if (str != null) {
            n(str, "stop");
        }
        q(AudioService$onDestroy$4.INSTANCE);
        k = null;
        g = null;
        i = null;
        AudioFloatWindow audioFloatWindow = this.e;
        if (audioFloatWindow != null) {
            FloatWindowManager.Companion.a().c(this, audioFloatWindow);
        }
        super.onDestroy();
    }

    public final void q(u1a<? super lfi, ? super kei, xhv> u1aVar) {
        lfi lfiVar;
        te teVar;
        kei keiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bd35cc", new Object[]{this, u1aVar});
            return;
        }
        WeakReference<lfi> weakReference = this.c;
        if (weakReference != null && (lfiVar = weakReference.get()) != null && (teVar = this.f1905a) != null && (keiVar = teVar.c) != null) {
            u1aVar.invoke(lfiVar, keiVar);
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8067582a", new Object[]{this, new Boolean(z)});
            return;
        }
        AudioFloatWindow audioFloatWindow = this.e;
        if (audioFloatWindow == null) {
            return;
        }
        if (z) {
            audioFloatWindow.play();
        } else {
            audioFloatWindow.pause();
        }
    }

    public final void p(final te teVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c03cc2", new Object[]{this, teVar});
            return;
        }
        final kei keiVar = teVar.c;
        s sVar = this.b;
        if (sVar != null) {
            sVar.c("close", null);
            sVar.h();
            this.b = null;
        }
        this.f = hbl.j(this.d);
        s.d dVar = new s.d();
        dVar.h = getApplicationContext();
        dVar.Y = true;
        dVar.h0 = true;
        dVar.i = false;
        dVar.j = "MegaBackgroundAudioService";
        dVar.l = keiVar.f22616a;
        HashMap<String, String> hashMap = dVar.g0;
        ckf.f(hashMap, "this");
        hashMap.put("title", keiVar.b);
        hashMap.put("subtitle", keiVar.c);
        dVar.i0 = this.f;
        dVar.j0 = teVar.f28654a;
        dVar.n = "MegaBGAudio";
        dVar.o = "MegaBGAudio_" + this.d;
        dVar.B = teVar.b;
        dVar.k0 = new d(keiVar, teVar);
        dVar.J = new fub(keiVar, teVar) { // from class: com.alibaba.ability.impl.audio.AudioService$setupPlayer$$inlined$apply$lambda$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.audio.AudioService$setupPlayer$$inlined$apply$lambda$2$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class AnonymousClass1 extends Lambda implements u1a<lfi, kei, xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ s $it;
                public final /* synthetic */ int $position$inlined;
                public final /* synthetic */ AudioService$setupPlayer$$inlined$apply$lambda$2 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(s sVar, AudioService$setupPlayer$$inlined$apply$lambda$2 audioService$setupPlayer$$inlined$apply$lambda$2, int i) {
                    super(2);
                    this.$it = sVar;
                    this.this$0 = audioService$setupPlayer$$inlined$apply$lambda$2;
                    this.$position$inlined = i;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioService$setupPlayer$$inlined$apply$lambda$2$1");
                }

                @Override // tb.u1a
                public /* bridge */ /* synthetic */ xhv invoke(lfi lfiVar, kei keiVar) {
                    invoke2(lfiVar, keiVar);
                    return xhv.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(lfi lfiVar, kei keiVar) {
                    boolean z = true;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6aa25972", new Object[]{this, lfiVar, keiVar});
                        return;
                    }
                    ckf.g(lfiVar, DataReceiveMonitor.CB_LISTENER);
                    ckf.g(keiVar, "info");
                    if (this.$it.m(1500) != 1) {
                        z = false;
                    }
                    zkq zkqVar = new zkq(z);
                    zkqVar.b = this.$position$inlined;
                    zkqVar.d = this.$it.m(1501);
                    xhv xhvVar = xhv.INSTANCE;
                    lfiVar.e(keiVar, zkqVar);
                }
            }

            @Override // tb.fub
            public void onSeekCompletion(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5db52709", new Object[]{this, new Integer(i2)});
                    return;
                }
                s a2 = AudioService.a(AudioService.this);
                if (a2 != null) {
                    AudioService.k(AudioService.this, new AnonymousClass1(a2, this, i2));
                }
            }
        };
        dVar.t = new asc(keiVar, teVar) { // from class: com.alibaba.ability.impl.audio.AudioService$setupPlayer$$inlined$apply$lambda$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.audio.AudioService$setupPlayer$$inlined$apply$lambda$3$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class AnonymousClass1 extends Lambda implements u1a<lfi, kei, xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ boolean $isByUser;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(boolean z) {
                    super(2);
                    this.$isByUser = z;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioService$setupPlayer$$inlined$apply$lambda$3$1");
                }

                @Override // tb.u1a
                public /* bridge */ /* synthetic */ xhv invoke(lfi lfiVar, kei keiVar) {
                    invoke2(lfiVar, keiVar);
                    return xhv.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(lfi lfiVar, kei keiVar) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6aa25972", new Object[]{this, lfiVar, keiVar});
                        return;
                    }
                    ckf.g(lfiVar, DataReceiveMonitor.CB_LISTENER);
                    ckf.g(keiVar, "info");
                    lfiVar.b(keiVar, this.$isByUser);
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.audio.AudioService$setupPlayer$$inlined$apply$lambda$3$2  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class AnonymousClass2 extends Lambda implements u1a<lfi, kei, xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ String $msg;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str) {
                    super(2);
                    this.$msg = str;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioService$setupPlayer$$inlined$apply$lambda$3$2");
                }

                @Override // tb.u1a
                public /* bridge */ /* synthetic */ xhv invoke(lfi lfiVar, kei keiVar) {
                    invoke2(lfiVar, keiVar);
                    return xhv.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(lfi lfiVar, kei keiVar) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6aa25972", new Object[]{this, lfiVar, keiVar});
                        return;
                    }
                    ckf.g(lfiVar, DataReceiveMonitor.CB_LISTENER);
                    ckf.g(keiVar, "<anonymous parameter 1>");
                    lfiVar.onError(MonitorMediaPlayer.mornitorPlayerError, this.$msg);
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.audio.AudioService$setupPlayer$$inlined$apply$lambda$3$3  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class AnonymousClass3 extends Lambda implements u1a<lfi, kei, xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ int $cache;
                public final /* synthetic */ int $current;
                public final /* synthetic */ int $total;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(int i, int i2, int i3) {
                    super(2);
                    this.$current = i;
                    this.$total = i2;
                    this.$cache = i3;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioService$setupPlayer$$inlined$apply$lambda$3$3");
                }

                @Override // tb.u1a
                public /* bridge */ /* synthetic */ xhv invoke(lfi lfiVar, kei keiVar) {
                    invoke2(lfiVar, keiVar);
                    return xhv.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(lfi lfiVar, kei keiVar) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6aa25972", new Object[]{this, lfiVar, keiVar});
                        return;
                    }
                    ckf.g(lfiVar, DataReceiveMonitor.CB_LISTENER);
                    ckf.g(keiVar, "<anonymous parameter 1>");
                    zkq zkqVar = new zkq(true);
                    zkqVar.b = this.$current;
                    long j = this.$total;
                    zkqVar.d = j;
                    zkqVar.c = (j * this.$cache) / 100;
                    xhv xhvVar = xhv.INSTANCE;
                    lfiVar.c(zkqVar);
                }
            }

            @Override // tb.asc
            public void onMediaClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("71919eba", new Object[]{this});
                }
            }

            @Override // tb.asc
            public void onMediaComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3cf4b25", new Object[]{this});
                    return;
                }
                AudioService.k(AudioService.this, AudioService$setupPlayer$instance$1$4$onMediaComplete$2.INSTANCE);
                AudioService.l(AudioService.this, false);
            }

            @Override // tb.asc
            public void onMediaError(IMediaPlayer iMediaPlayer, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i3)});
                    return;
                }
                String str = "what: " + i2 + ", extra: " + i3;
                iih.INSTANCE.a("BackgroundAudioService", "onVideoError: " + str);
                AudioService.k(AudioService.this, new AnonymousClass2(str));
            }

            @Override // tb.asc
            public void onMediaInfo(IMediaPlayer iMediaPlayer, long j2, long j3, long j4, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j2), new Long(j3), new Long(j4), obj});
                }
            }

            @Override // tb.asc
            public void onMediaPause(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
                    return;
                }
                AudioService.k(AudioService.this, new AnonymousClass1(z));
                AudioService.l(AudioService.this, false);
            }

            @Override // tb.asc
            public void onMediaPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c715ea20", new Object[]{this});
                    return;
                }
                AudioService.k(AudioService.this, AudioService$setupPlayer$instance$1$4$onMediaPlay$2.INSTANCE);
                AudioService.l(AudioService.this, true);
            }

            @Override // tb.asc
            public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                }
            }

            @Override // tb.asc
            public void onMediaProgressChanged(int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
                } else {
                    AudioService.k(AudioService.this, new AnonymousClass3(i2, i4, i3));
                }
            }

            @Override // tb.asc
            public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
                } else {
                    ckf.g(mediaPlayScreenType, "type");
                }
            }

            @Override // tb.asc
            public void onMediaSeekTo(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // tb.asc
            public void onMediaStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f694024", new Object[]{this});
                    return;
                }
                AudioService.k(AudioService.this, AudioService$setupPlayer$instance$1$4$onMediaStart$2.INSTANCE);
                s a2 = AudioService.a(AudioService.this);
                if (a2 != null) {
                    AudioService.d().a(a2);
                }
                AudioService.l(AudioService.this, true);
            }
        };
        xhv xhvVar = xhv.INSTANCE;
        s c2 = s.c.c("", dVar);
        this.b = c2;
        k = c2;
        c2.F();
        try {
            s0m.B().T(keiVar.d).succListener(new e(keiVar, c2)).fetch();
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        String str;
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i2), new Integer(i3)})).intValue();
        }
        if (intent == null) {
            stopSelf();
            return 2;
        }
        if (!intent.hasExtra("control_action_type") || this.f1905a == null) {
            te teVar = g;
            String str2 = i;
            WeakReference<lfi> weakReference = j;
            if (teVar != null) {
                if (!(this.f1905a == null || (str = this.d) == null || ckf.b(str, str2))) {
                    n(str, "stop");
                    q(AudioService$onStartCommand$1$1$1$2.INSTANCE);
                }
                this.f1905a = teVar;
                this.c = weakReference;
                this.d = str2;
                p(teVar);
                if (str2 != null) {
                    n(str2, "start");
                }
                o(teVar);
            } else {
                stopSelf();
            }
        } else {
            int intExtra = intent.getIntExtra("control_action_type", -1);
            if (intExtra == 1) {
                s sVar2 = this.b;
                if (sVar2 != null) {
                    sVar2.u();
                }
            } else if (intExtra == 2) {
                s sVar3 = this.b;
                if (sVar3 != null) {
                    sVar3.F();
                }
            } else if (intExtra == 3) {
                stopSelf();
            } else if (intExtra == 4 && (sVar = this.b) != null) {
                sVar.y(intent.getIntExtra("seek_position", 0), false);
            }
        }
        return 2;
    }
}
