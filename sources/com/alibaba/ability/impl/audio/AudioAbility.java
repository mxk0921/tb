package com.alibaba.ability.impl.audio;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAudioContextAbility;
import com.taobao.android.abilityidl.ability.AudioContextStatusInfo;
import com.taobao.android.abilityidl.ability.AudioContextTimeUpdateInfo;
import java.util.Map;
import tb.a07;
import tb.ai1;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.mar;
import tb.shb;
import tb.t2o;
import tb.xh1;
import tb.xhv;
import tb.yh1;
import tb.zh1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioAbility extends AbsAudioContextAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mar f1901a;
    public String b;
    public shb c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements mar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mar f1902a;
        public final /* synthetic */ shb b;

        public a(mar marVar, shb shbVar) {
            this.f1902a = marVar;
            this.b = shbVar;
        }

        @Override // tb.mar.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d765fc", new Object[]{this, str});
            } else {
                this.b.O0();
            }
        }

        @Override // tb.mar.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7775d5e1", new Object[]{this, str});
            } else {
                this.b.g();
            }
        }

        @Override // tb.mar.a
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd41f1d1", new Object[]{this, str});
            } else {
                this.b.onEnd();
            }
        }

        @Override // tb.mar.a
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5cd676c", new Object[]{this, str});
            } else {
                this.b.onEnd();
            }
        }

        @Override // tb.mar.a
        public void e(long j, long j2, long j3, Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49df7f36", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj, str});
                return;
            }
            shb shbVar = this.b;
            AudioContextTimeUpdateInfo audioContextTimeUpdateInfo = new AudioContextTimeUpdateInfo();
            audioContextTimeUpdateInfo.currentTime = Integer.valueOf((int) this.f1902a.a(str));
            audioContextTimeUpdateInfo.duration = Integer.valueOf((int) this.f1902a.b(str));
            xhv xhvVar = xhv.INSTANCE;
            shbVar.c1(audioContextTimeUpdateInfo);
        }

        @Override // tb.mar.a
        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a1d9ccd", new Object[]{this, str});
                return;
            }
            shb shbVar = this.b;
            AudioContextStatusInfo audioContextStatusInfo = new AudioContextStatusInfo();
            audioContextStatusInfo.currentTime = Integer.valueOf((int) this.f1902a.a(str));
            audioContextStatusInfo.duration = Integer.valueOf((int) this.f1902a.b(str));
            xhv xhvVar = xhv.INSTANCE;
            shbVar.W0(audioContextStatusInfo);
        }

        @Override // tb.mar.a
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a12b8ab0", new Object[]{this, str});
            } else {
                this.b.c();
            }
        }

        @Override // tb.mar.a
        public void onError(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724a699a", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            shb shbVar = this.b;
            shbVar.O(new ErrorResult("PLAYER_ERROR", "播放器错误, " + i + ", " + i2, (Map) null, 4, (a07) null));
        }

        @Override // tb.mar.a
        public void onPause(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb560aa8", new Object[]{this, str});
            } else {
                this.b.onPause();
            }
        }

        @Override // tb.mar.a
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            } else {
                this.b.a();
            }
        }
    }

    static {
        t2o.a(98566149);
    }

    public static /* synthetic */ Object ipc$super(AudioAbility audioAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioAbility");
    }

    public final mar a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mar) ipChange.ipc$dispatch("6836e423", new Object[]{this, context});
        }
        mar marVar = this.f1901a;
        if (marVar != null) {
            return marVar;
        }
        mar marVar2 = new mar(context);
        this.f1901a = marVar2;
        return marVar2;
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mar marVar = this.f1901a;
        if (marVar != null) {
            marVar.o();
            this.f1901a = null;
        }
        this.c = null;
        this.b = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void pause(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199759e8", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        String str = this.b;
        if (str != null) {
            Context context = kdbVar.l().getContext();
            if (context != null) {
                a(context).m(str);
            } else {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void play(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab26f0a6", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        String str = this.b;
        if (str != null) {
            Context context = kdbVar.l().getContext();
            if (context != null) {
                a(context).x(str);
            } else {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setEventListener(kdb kdbVar, shb shbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cae0d", new Object[]{this, kdbVar, shbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(shbVar, "events");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            mar a2 = a(context);
            a2.q(new a(a2, shbVar));
            this.c = shbVar;
            return;
        }
        shbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setPauseInBackground(kdb kdbVar, xh1 xh1Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd805c", new Object[]{this, kdbVar, xh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(xh1Var, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            a(context).u(xh1Var.f31393a);
        } else {
            jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void stop(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b8f2f4", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        String str = this.b;
        if (str != null) {
            Context context = kdbVar.l().getContext();
            if (context != null) {
                a(context).y(str);
                shb shbVar = this.c;
                if (shbVar != null) {
                    shbVar.onStop();
                }
                this.b = null;
                return;
            }
            jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            return;
        }
        jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void prepare(kdb kdbVar, zh1 zh1Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25729cc", new Object[]{this, kdbVar, zh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(zh1Var, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            mar a2 = a(context);
            String str = this.b;
            if (str != null) {
                a2.y(str);
            }
            String r = a2.r("", zh1Var.f32767a);
            if (r != null) {
                this.b = r;
                a2.n(r);
                a2.v(this.b, 1000L);
                return;
            }
            jdbVar.O(new ErrorResult("PREPARE_FAILED", "播放器准备失败", (Map) null, 4, (a07) null));
            return;
        }
        jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void seek(kdb kdbVar, ai1 ai1Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876573cc", new Object[]{this, kdbVar, ai1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(ai1Var, "params");
        ckf.g(jdbVar, "callback");
        String str = this.b;
        if (str != null) {
            Context context = kdbVar.l().getContext();
            if (context != null) {
                a(context).p(str, ai1Var.f15755a);
            } else {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setLoop(kdb kdbVar, xh1 xh1Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1171163b", new Object[]{this, kdbVar, xh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(xh1Var, "params");
        ckf.g(jdbVar, "callback");
        String str = this.b;
        if (str != null) {
            Context context = kdbVar.l().getContext();
            if (context != null) {
                a(context).s(str, xh1Var.f31393a);
            } else {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setMuted(kdb kdbVar, xh1 xh1Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bd87fe", new Object[]{this, kdbVar, xh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(xh1Var, "params");
        ckf.g(jdbVar, "callback");
        String str = this.b;
        if (str != null) {
            Context context = kdbVar.l().getContext();
            if (context != null) {
                a(context).t(str, xh1Var.f31393a);
            } else {
                jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAudioContextAbility
    public void setVolume(kdb kdbVar, yh1 yh1Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e60e18", new Object[]{this, kdbVar, yh1Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(yh1Var, "params");
        ckf.g(jdbVar, "callback");
        String str = this.b;
        if (str != null) {
            Context context = kdbVar.l().getContext();
            if (context != null) {
                mar a2 = a(context);
                double d = yh1Var.f32084a;
                a2.w(str, (float) d, (float) d);
                return;
            }
            jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            return;
        }
        jdbVar.O(new ErrorResult("UNPREPARED", "请先调用 prepare 接口", (Map) null, 4, (a07) null));
    }
}
