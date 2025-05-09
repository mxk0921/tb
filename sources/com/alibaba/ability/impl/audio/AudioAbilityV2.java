package com.alibaba.ability.impl.audio;

import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAudioContextAbility;
import com.taobao.android.abilityidl.ability.AudioContextStatusInfo;
import com.taobao.android.abilityidl.ability.AudioContextTimeUpdateInfo;
import java.util.Map;
import tb.a07;
import tb.ai1;
import tb.cj1;
import tb.ckf;
import tb.d1a;
import tb.jdb;
import tb.kdb;
import tb.ldb;
import tb.mar;
import tb.njg;
import tb.shb;
import tb.t2o;
import tb.xh1;
import tb.xhv;
import tb.yh1;
import tb.zh1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioAbilityV2 extends AbsAudioContextAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public cj1 f1903a;
    public String b;
    public cj1.a c;
    public shb d;
    public final njg e = kotlin.a.b(new AudioAbilityV2$id$2(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(98566152);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements cj1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ shb f1904a;

        public b(shb shbVar) {
            this.f1904a = shbVar;
        }

        @Override // tb.cj1.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150378ba", new Object[]{this});
            } else {
                this.f1904a.a();
            }
        }

        @Override // tb.cj1.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b967c2a", new Object[]{this});
            } else {
                this.f1904a.c();
            }
        }

        @Override // tb.cj1.a
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38a753d7", new Object[]{this});
            } else {
                this.f1904a.g();
            }
        }

        @Override // tb.cj1.a
        public void h(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9695a4bc", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            shb shbVar = this.f1904a;
            AudioContextTimeUpdateInfo audioContextTimeUpdateInfo = new AudioContextTimeUpdateInfo();
            audioContextTimeUpdateInfo.currentTime = Integer.valueOf((int) j);
            audioContextTimeUpdateInfo.duration = Integer.valueOf((int) j2);
            xhv xhvVar = xhv.INSTANCE;
            shbVar.c1(audioContextTimeUpdateInfo);
        }

        @Override // tb.cj1.a
        public void i(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deeab34b", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            shb shbVar = this.f1904a;
            AudioContextStatusInfo audioContextStatusInfo = new AudioContextStatusInfo();
            audioContextStatusInfo.currentTime = Integer.valueOf((int) j);
            audioContextStatusInfo.duration = Integer.valueOf((int) j2);
            xhv xhvVar = xhv.INSTANCE;
            shbVar.W0(audioContextStatusInfo);
        }

        @Override // tb.cj1.a
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326344b2", new Object[]{this});
            } else {
                this.f1904a.O0();
            }
        }

        @Override // tb.cj1.a
        public void onEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc72903", new Object[]{this});
            } else {
                this.f1904a.onEnd();
            }
        }

        @Override // tb.cj1.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            ckf.g(str, "error");
            this.f1904a.O(new ErrorResult("PLAYER_ERROR", str, (Map) null, 4, (a07) null));
        }

        @Override // tb.cj1.a
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                this.f1904a.onPause();
            }
        }
    }

    static {
        t2o.a(98566151);
    }

    public static final /* synthetic */ String access$getToken$p(AudioAbilityV2 audioAbilityV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baeaeac7", new Object[]{audioAbilityV2});
        }
        return audioAbilityV2.b;
    }

    public static final /* synthetic */ void access$setToken$p(AudioAbilityV2 audioAbilityV2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1d938f", new Object[]{audioAbilityV2, str});
        } else {
            audioAbilityV2.b = str;
        }
    }

    public static /* synthetic */ Object ipc$super(AudioAbilityV2 audioAbilityV2, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioAbilityV2");
    }

    public static /* synthetic */ AbilityHubAdapter safeGetAdapter$default(AudioAbilityV2 audioAbilityV2, kdb kdbVar, jdb jdbVar, d1a d1aVar, int i, Object obj) {
        ldb l;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("46df4a35", new Object[]{audioAbilityV2, kdbVar, jdbVar, d1aVar, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            jdbVar = null;
        }
        if (kdbVar != null && (l = kdbVar.l()) != null && (adapter = l.getAdapter()) != null) {
            return adapter;
        }
        if (jdbVar != null) {
            jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
        }
        return (AbilityHubAdapter) d1aVar.invoke();
    }

    public static /* synthetic */ Context safeGetContext$default(AudioAbilityV2 audioAbilityV2, kdb kdbVar, jdb jdbVar, d1a d1aVar, int i, Object obj) {
        ldb l;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("48687260", new Object[]{audioAbilityV2, kdbVar, jdbVar, d1aVar, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            jdbVar = null;
        }
        if (kdbVar != null && (l = kdbVar.l()) != null && (context = l.getContext()) != null) {
            return context;
        }
        if (jdbVar != null) {
            jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        }
        return (Context) d1aVar.invoke();
    }

    public final cj1 a(Context context, AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cj1) ipChange.ipc$dispatch("1a7eede5", new Object[]{this, context, abilityHubAdapter});
        }
        cj1 cj1Var = this.f1903a;
        if (cj1Var == null) {
            synchronized (this) {
                cj1Var = this.f1903a;
                if (cj1Var == null) {
                    Object obj = abilityHubAdapter.q().get("AudioContextPlayer");
                    if (!(obj instanceof cj1)) {
                        obj = null;
                    }
                    cj1Var = (cj1) obj;
                    if (cj1Var == null) {
                        cj1Var = new cj1(context);
                        abilityHubAdapter.q().put("AudioContextPlayer", cj1Var);
                    }
                    this.f1903a = cj1Var;
                }
            }
        }
        return cj1Var;
    }

    public final String b() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("81e05888", new Object[]{this});
        } else {
            value = this.e.getValue();
        }
        return (String) value;
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        cj1 cj1Var = this.f1903a;
        if (cj1Var != null) {
            String str = this.b;
            if (str != null) {
                cj1Var.g(str);
            }
            cj1Var.f(b());
            this.f1903a = null;
        }
        this.c = null;
        this.d = null;
        this.b = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void pause(kdb kdbVar, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199759e8", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        String access$getToken$p = access$getToken$p(this);
        if (access$getToken$p != null) {
            ldb l = kdbVar.l();
            if (l == null || (context = l.getContext()) == null) {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            ldb l2 = kdbVar.l();
            if (l2 == null || (adapter = l2.getAdapter()) == null) {
                jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
            } else {
                a(context, adapter).d().m(access$getToken$p);
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void play(kdb kdbVar, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab26f0a6", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        String access$getToken$p = access$getToken$p(this);
        if (access$getToken$p != null) {
            ldb l = kdbVar.l();
            if (l == null || (context = l.getContext()) == null) {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            ldb l2 = kdbVar.l();
            if (l2 == null || (adapter = l2.getAdapter()) == null) {
                jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
            } else {
                a(context, adapter).d().x(access$getToken$p);
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setEventListener(kdb kdbVar, shb shbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cae0d", new Object[]{this, kdbVar, shbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(shbVar, "events");
        ldb l = kdbVar.l();
        if (l == null || (context = l.getContext()) == null) {
            shbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            return;
        }
        ldb l2 = kdbVar.l();
        if (l2 == null || (adapter = l2.getAdapter()) == null) {
            shbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
            return;
        }
        b bVar = new b(shbVar);
        String str = this.b;
        if (str != null) {
            a(context, adapter).k(str, bVar);
        }
        xhv xhvVar = xhv.INSTANCE;
        this.c = bVar;
        this.d = shbVar;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setPauseInBackground(kdb kdbVar, xh1 xh1Var, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd805c", new Object[]{this, kdbVar, xh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(xh1Var, "params");
        ckf.g(jdbVar, "callback");
        ldb l = kdbVar.l();
        if (l == null || (context = l.getContext()) == null) {
            jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            return;
        }
        ldb l2 = kdbVar.l();
        if (l2 == null || (adapter = l2.getAdapter()) == null) {
            jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
        } else {
            a(context, adapter).d().u(xh1Var.f31393a);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void stop(kdb kdbVar, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b8f2f4", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        String access$getToken$p = access$getToken$p(this);
        if (access$getToken$p != null) {
            ldb l = kdbVar.l();
            if (l == null || (context = l.getContext()) == null) {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            ldb l2 = kdbVar.l();
            if (l2 == null || (adapter = l2.getAdapter()) == null) {
                jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
                return;
            }
            a(context, adapter).d().y(access$getToken$p);
            shb shbVar = this.d;
            if (shbVar != null) {
                shbVar.onStop();
            }
            this.b = null;
            return;
        }
        jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
    }

    public static /* synthetic */ String checkAndGetToken$default(AudioAbilityV2 audioAbilityV2, jdb jdbVar, d1a d1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("746135d5", new Object[]{audioAbilityV2, jdbVar, d1aVar, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            jdbVar = null;
        }
        String access$getToken$p = access$getToken$p(audioAbilityV2);
        if (access$getToken$p != null) {
            return access$getToken$p;
        }
        if (jdbVar != null) {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
        return (String) d1aVar.invoke();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void prepare(kdb kdbVar, zh1 zh1Var, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25729cc", new Object[]{this, kdbVar, zh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(zh1Var, "params");
        ckf.g(jdbVar, "callback");
        ldb l = kdbVar.l();
        if (l == null || (context = l.getContext()) == null) {
            jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            return;
        }
        ldb l2 = kdbVar.l();
        if (l2 == null || (adapter = l2.getAdapter()) == null) {
            jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
            return;
        }
        cj1 a2 = a(context, adapter);
        a2.c(b());
        String str = this.b;
        if (str != null) {
            a2.g(str);
        }
        mar d = a2.d();
        String r = d.r("", zh1Var.f32767a);
        if (r != null) {
            cj1.a aVar = this.c;
            if (aVar != null) {
                a2.k(r, aVar);
            }
            xhv xhvVar = xhv.INSTANCE;
            this.b = r;
            d.n(r);
            d.v(this.b, 1000L);
            return;
        }
        jdbVar.O(new ErrorResult("PREPARE_FAILED", "播放器准备失败", (Map) null, 4, (a07) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void seek(kdb kdbVar, ai1 ai1Var, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876573cc", new Object[]{this, kdbVar, ai1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(ai1Var, "params");
        ckf.g(jdbVar, "callback");
        String access$getToken$p = access$getToken$p(this);
        if (access$getToken$p != null) {
            ldb l = kdbVar.l();
            if (l == null || (context = l.getContext()) == null) {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            ldb l2 = kdbVar.l();
            if (l2 == null || (adapter = l2.getAdapter()) == null) {
                jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
            } else {
                a(context, adapter).d().p(access$getToken$p, ai1Var.f15755a);
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setLoop(kdb kdbVar, xh1 xh1Var, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1171163b", new Object[]{this, kdbVar, xh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(xh1Var, "params");
        ckf.g(jdbVar, "callback");
        String access$getToken$p = access$getToken$p(this);
        if (access$getToken$p != null) {
            ldb l = kdbVar.l();
            if (l == null || (context = l.getContext()) == null) {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            ldb l2 = kdbVar.l();
            if (l2 == null || (adapter = l2.getAdapter()) == null) {
                jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
            } else {
                a(context, adapter).d().s(access$getToken$p, xh1Var.f31393a);
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setMuted(kdb kdbVar, xh1 xh1Var, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bd87fe", new Object[]{this, kdbVar, xh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(xh1Var, "params");
        ckf.g(jdbVar, "callback");
        String access$getToken$p = access$getToken$p(this);
        if (access$getToken$p != null) {
            ldb l = kdbVar.l();
            if (l == null || (context = l.getContext()) == null) {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            ldb l2 = kdbVar.l();
            if (l2 == null || (adapter = l2.getAdapter()) == null) {
                jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
            } else {
                a(context, adapter).d().t(access$getToken$p, xh1Var.f31393a);
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setVolume(kdb kdbVar, yh1 yh1Var, jdb jdbVar) {
        Context context;
        AbilityHubAdapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e60e18", new Object[]{this, kdbVar, yh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(yh1Var, "params");
        ckf.g(jdbVar, "callback");
        String access$getToken$p = access$getToken$p(this);
        if (access$getToken$p != null) {
            ldb l = kdbVar.l();
            if (l == null || (context = l.getContext()) == null) {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
                return;
            }
            ldb l2 = kdbVar.l();
            if (l2 == null || (adapter = l2.getAdapter()) == null) {
                jdbVar.O(new ErrorResult("500", "env.adapter is null", (Map) null, 4, (a07) null));
                return;
            }
            mar d = a(context, adapter).d();
            double d2 = yh1Var.f32084a;
            d.w(access$getToken$p, (float) d2, (float) d2);
            return;
        }
        jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
    }
}
