package com.alibaba.ability.impl.audio;

import android.content.Context;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.impl.audio.AudioService;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ariver.kernel.RVConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.media.MessageID;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.kdb;
import tb.kei;
import tb.lei;
import tb.lfi;
import tb.t2o;
import tb.te;
import tb.ue;
import tb.ve;
import tb.vq;
import tb.we;
import tb.wsq;
import tb.wua;
import tb.zkq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioServiceAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1912a;
    public AudioService.a b;
    public vq c;
    public final c d = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements lei {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f1913a;

        public a(vq vqVar) {
            this.f1913a = vqVar;
        }

        @Override // tb.lei
        public void a(we weVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb719086", new Object[]{this, weVar});
            } else {
                this.f1913a.a(new FinishResult(weVar != null ? weVar.a() : null, "onData"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements ve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f1914a;

        public b(vq vqVar) {
            this.f1914a = vqVar;
        }

        @Override // tb.ve
        public void a(ue ueVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88eb42ea", new Object[]{this, ueVar});
                return;
            }
            ckf.g(ueVar, wua.KEY_PROPERTIES);
            this.f1914a.a(new FinishResult(ueVar.b(), "onData"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements lfi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public kdb f1915a;

        public c() {
        }

        @Override // tb.lfi
        public void a(kei keiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1c4f222", new Object[]{this, keiVar});
                return;
            }
            ckf.g(keiVar, "info");
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(keiVar.a(), "onEnd"));
            }
        }

        @Override // tb.lfi
        public void b(kei keiVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13fcc6b7", new Object[]{this, keiVar, new Boolean(z)});
                return;
            }
            ckf.g(keiVar, "info");
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(null, "onPause"));
            }
        }

        @Override // tb.lfi
        public void d(kei keiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ef4ad19", new Object[]{this, keiVar});
                return;
            }
            ckf.g(keiVar, "info");
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(keiVar.a(), "onPlay"));
            }
        }

        @Override // tb.lfi
        public void f(kei keiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ca80a92", new Object[]{this, keiVar});
                return;
            }
            ckf.g(keiVar, "info");
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(null, "onResume"));
            }
        }

        @Override // tb.lfi
        public void g(kei keiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7807f167", new Object[]{this, keiVar});
                return;
            }
            ckf.g(keiVar, "info");
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new FinishResult(null, "onStop"));
            }
        }

        @Override // tb.lfi
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e081c90", new Object[]{this});
                return;
            }
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(null, "onTapPrev"));
            }
        }

        @Override // tb.lfi
        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5aa2b75e", new Object[]{this});
                return;
            }
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(null, "onTapNext"));
            }
        }

        public final void j(kdb kdbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b248007", new Object[]{this, kdbVar});
            } else {
                this.f1915a = kdbVar;
            }
        }

        @Override // tb.lfi
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "code");
            ckf.g(str2, "msg");
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ErrorResult(str, str2, (Map) null, 4, (a07) null));
            }
        }

        @Override // tb.lfi
        public void c(zkq zkqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4d9ed63", new Object[]{this, zkqVar});
                return;
            }
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(zkqVar != null ? zkqVar.a(true) : null, "onTimeUpdate"));
            }
        }

        @Override // tb.lfi
        public void e(kei keiVar, zkq zkqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76e9d469", new Object[]{this, keiVar, zkqVar});
                return;
            }
            ckf.g(keiVar, "info");
            ckf.g(zkqVar, "statusInfo");
            vq access$getCurCallback$p = AudioServiceAbility.access$getCurCallback$p(AudioServiceAbility.this);
            if (access$getCurCallback$p != null) {
                access$getCurCallback$p.a(new ExecutingResult(zkqVar.a(true), MessageID.onSeekComplete));
            }
        }
    }

    static {
        t2o.a(98566176);
    }

    public static final /* synthetic */ vq access$getCurCallback$p(AudioServiceAbility audioServiceAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq) ipChange.ipc$dispatch("c14a7b12", new Object[]{audioServiceAbility});
        }
        return audioServiceAbility.c;
    }

    public static final /* synthetic */ void access$setCurCallback$p(AudioServiceAbility audioServiceAbility, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8403c740", new Object[]{audioServiceAbility, vqVar});
        } else {
            audioServiceAbility.c = vqVar;
        }
    }

    public static /* synthetic */ Object ipc$super(AudioServiceAbility audioServiceAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/AudioServiceAbility");
    }

    public final void a(kdb kdbVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b15c5ea", new Object[]{this, kdbVar, context});
            return;
        }
        AudioService.a aVar = this.b;
        if (aVar != null) {
            aVar.d(context);
        } else {
            ckf.y("client");
            throw null;
        }
    }

    public final ExecuteResult b(kdb kdbVar, Context context, te teVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("7aa26d20", new Object[]{this, kdbVar, context, teVar});
        }
        AudioService.a aVar = this.b;
        if (aVar != null) {
            aVar.e(context, teVar);
            return new FinishResult(null, null, 3, null);
        }
        ckf.y("client");
        throw null;
    }

    public final void c(kdb kdbVar, lei leiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc7a0b1", new Object[]{this, kdbVar, leiVar});
            return;
        }
        AudioService.a aVar = this.b;
        if (aVar != null) {
            aVar.c(leiVar);
        } else {
            ckf.y("client");
            throw null;
        }
    }

    public final void d(kdb kdbVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1d6ae1", new Object[]{this, kdbVar, context});
            return;
        }
        AudioService.a aVar = this.b;
        if (aVar != null) {
            aVar.g(context);
        } else {
            ckf.y("client");
            throw null;
        }
    }

    public final ExecuteResult e(kdb kdbVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("46cc5d48", new Object[]{this, kdbVar, context, new Integer(i)});
        }
        AudioService.a aVar = this.b;
        if (aVar != null) {
            aVar.h(context, i);
            return new FinishResult(null, null, 3, null);
        }
        ckf.y("client");
        throw null;
    }

    public final ExecuteResult f(kdb kdbVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("fcb280c9", new Object[]{this, kdbVar, context});
        }
        AudioService.a aVar = this.b;
        if (aVar != null) {
            aVar.k(context);
            return new FinishResult(null, null, 3, null);
        }
        ckf.y("client");
        throw null;
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return ErrorResult.a.Companion.g("NoAppCtx");
        }
        if (!this.f1912a) {
            String businessID = kdbVar.l().getBusinessID();
            if (businessID == null || wsq.a0(businessID)) {
                return new ErrorResult("unsupportedContainer", "当前容器不支持播放", (Map) null, 4, (a07) null);
            }
            this.d.j(kdbVar);
            AudioService.a aVar = new AudioService.a(businessID);
            this.b = aVar;
            aVar.i(this.d);
        }
        this.f1912a = true;
        Object obj = null;
        switch (str.hashCode()) {
            case -934426579:
                if (str.equals("resume")) {
                    d(kdbVar, context);
                    return null;
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case -449670347:
                if (str.equals("setProperties")) {
                    AudioService.a aVar2 = this.b;
                    if (aVar2 != null) {
                        aVar2.j(map);
                        return null;
                    }
                    ckf.y("client");
                    throw null;
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case 3443508:
                if (str.equals("play")) {
                    try {
                        Map<String, Object> f = kdbVar.f();
                        Object obj2 = f != null ? f.get(RVConstants.EXTRA_APPINFO) : null;
                        if (obj2 instanceof Map) {
                            obj = obj2;
                        }
                        return b(kdbVar, context, new te(map, (Map) obj));
                    } catch (Throwable th) {
                        return ErrorResult.a.Companion.g(th.getMessage());
                    }
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case 3526264:
                if (str.equals("seek")) {
                    Integer l = MegaUtils.l(map, "position", 0);
                    ckf.d(l);
                    e(kdbVar, context, l.intValue());
                    return null;
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case 3540994:
                if (str.equals("stop")) {
                    f(kdbVar, context);
                    return null;
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case 106440182:
                if (str.equals("pause")) {
                    a(kdbVar, context);
                    return null;
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case 338146594:
                if (str.equals("requestProperties")) {
                    AudioService.a aVar3 = this.b;
                    if (aVar3 != null) {
                        aVar3.f(new b(vqVar));
                        return null;
                    }
                    ckf.y("client");
                    throw null;
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case 783057964:
                if (str.equals("setEventListener")) {
                    this.c = vqVar;
                    return new FinishResult(null, null, 3, null);
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            case 1149758429:
                if (str.equals("requestInfo")) {
                    c(kdbVar, new a(vqVar));
                    return null;
                }
                return ErrorResult.a.Companion.a(str.concat(" not found"));
            default:
                return ErrorResult.a.Companion.a(str.concat(" not found"));
        }
    }
}
