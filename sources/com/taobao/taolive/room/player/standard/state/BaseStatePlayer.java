package com.taobao.taolive.room.player.standard.state;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ali.user.mobile.exception.ErrorCode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.taobao.R;
import com.taobao.taolive.room.player.so.SoFetchController;
import com.taobao.taolive.room.player.standard.StandardVideoFrame;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.asc;
import tb.aub;
import tb.cdr;
import tb.dba;
import tb.e12;
import tb.e7m;
import tb.ekr;
import tb.hw0;
import tb.hz0;
import tb.jgi;
import tb.nj9;
import tb.o3s;
import tb.pvs;
import tb.sfi;
import tb.sj4;
import tb.sr4;
import tb.t2o;
import tb.t92;
import tb.tz3;
import tb.uvd;
import tb.v2s;
import tb.x5t;
import tb.yqq;
import tb.yvd;
import tb.z1i;
import tb.z3s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BaseStatePlayer implements nj9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_PLAY_RATE = 1.0f;
    public static final String KEY_ERROR_CODE = "ERROR_CODE";
    public static final String KEY_FIRST_FRAME_DECODE_COMPLETE_TS = "FIRST_FRAME_DECODE_COMPLETE_TS";
    public static final String KEY_FIRST_FRAME_UPDATE_SCREEN_TS = "KEY_FIRST_FRAME_UPDATE_SCREEN_TS";
    public static final String TAG = "BaseStatePlayer";
    public final List<IMediaPlayer.c> A;
    public final List<IMediaPlayer.c> B;
    public final List<IMediaPlayer.e> C;
    public final List<IMediaPlayer.b> D;
    public final List<IMediaPlayer.d> E;
    public final List<IMediaPlayer.h> F;
    public final List<IMediaPlayer.i> G;
    public final List<IMediaPlayer.f> H;
    public final List<IMediaPlayer.g> I;
    public boolean J;
    public String K;
    public boolean L;
    public long M;
    public final Random N;

    /* renamed from: a  reason: collision with root package name */
    public int f13225a;
    public i b;
    public cdr c;
    public final Context d;
    public s e;
    public final s.d f;
    public j g;
    public FrameLayout h;
    public RoomPlayerObserver i;
    public final String j;
    public final h k;
    public final Handler l;
    public final t92 m;
    public WarmState n;
    public int o;
    public boolean p;
    public boolean q;
    public final SoFetchController r;
    public float s;
    public boolean t;
    public int u;
    public boolean v;
    public long w;
    public final aub x;
    public final asc y;
    public asc z;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface CreateSourceType {
        public static final int SOURCE_BY_TOKEN = 0;
        public static final int SOURCE_BY_TOPIC_ID = 1;
        public static final int SOURCE_NEW = 2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum WarmState {
        NORMAL,
        WARMING,
        WARMED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WarmState warmState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/state/BaseStatePlayer$WarmState");
        }

        public static WarmState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WarmState) ipChange.ipc$dispatch("a232ac23", new Object[]{str});
            }
            return (WarmState) Enum.valueOf(WarmState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f13226a;

        public a(HashMap hashMap) {
            this.f13226a = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseStatePlayer baseStatePlayer = BaseStatePlayer.this;
            StringBuilder sb = new StringBuilder("首帧劣化排查，onReceiveFirstFrame，mDecodeFirstFrameTs = ");
            sb.append(BaseStatePlayer.a(BaseStatePlayer.this));
            sb.append("mCurMediaState = ");
            BaseStatePlayer baseStatePlayer2 = BaseStatePlayer.this;
            sb.append(baseStatePlayer2.d0(baseStatePlayer2.f13225a));
            baseStatePlayer.C0(sb.toString());
            BaseStatePlayer.c(BaseStatePlayer.this, this.f13226a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends sfi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/state/BaseStatePlayer$2");
        }

        @Override // tb.sfi, tb.asc
        public void onMediaError(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            for (int i3 = 0; i3 < BaseStatePlayer.l(BaseStatePlayer.this).size(); i3++) {
                if (BaseStatePlayer.m(BaseStatePlayer.this).get(i3) != null) {
                    ((IMediaPlayer.c) BaseStatePlayer.m(BaseStatePlayer.this).get(i3)).onError(null, i, i2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseStatePlayer baseStatePlayer = BaseStatePlayer.this;
            StringBuilder sb = new StringBuilder("onReceiveErrorToReplay mCurMediaState = ");
            BaseStatePlayer baseStatePlayer2 = BaseStatePlayer.this;
            sb.append(baseStatePlayer2.d0(baseStatePlayer2.f13225a));
            baseStatePlayer.C0(sb.toString());
            BaseStatePlayer.i(BaseStatePlayer.this, 8);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements uvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f13231a;
        public final /* synthetic */ Drawable b;

        public f(s sVar, Drawable drawable) {
            this.f13231a = sVar;
            this.b = drawable;
        }

        @Override // tb.uvd
        public void onError(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                return;
            }
            BaseStatePlayer baseStatePlayer = BaseStatePlayer.this;
            baseStatePlayer.C0("setVideoCoverImage onFail = " + BaseStatePlayer.k(BaseStatePlayer.this));
            s sVar = this.f13231a;
            if (sVar != null) {
                sVar.z(this.b);
            }
        }

        @Override // tb.uvd
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
            s sVar = this.f13231a;
            if (sVar != null) {
                sVar.z(bitmapDrawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$AspectRatio;

        static {
            int[] iArr = new int[IMediaPlayer.AspectRatio.values().length];
            $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$AspectRatio = iArr;
            try {
                iArr[IMediaPlayer.AspectRatio.FIT_X_Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$AspectRatio[IMediaPlayer.AspectRatio.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$AspectRatio[IMediaPlayer.AspectRatio.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f13232a;

        static {
            t2o.a(779093195);
        }

        public h() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("387d4ac2", new Object[]{this, new Boolean(z)});
            } else {
                this.f13232a = z;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameLayout frameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseStatePlayer.this.C0("mDelayedDestroyTask run hasRef = ");
            BaseStatePlayer.this.N(0L);
            if (this.f13232a && (frameLayout = BaseStatePlayer.this.h) != null) {
                frameLayout.removeAllViews();
                BaseStatePlayer.this.h.setBackground(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface i {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface j {
        void I(int i, Map<String, String> map);
    }

    static {
        t2o.a(779093185);
        t2o.a(774897668);
    }

    public BaseStatePlayer(Context context) {
        this(context, null);
    }

    public static /* synthetic */ long a(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692e341f", new Object[]{baseStatePlayer})).longValue();
        }
        return baseStatePlayer.w;
    }

    public static /* synthetic */ long b(BaseStatePlayer baseStatePlayer, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f3be6ef", new Object[]{baseStatePlayer, new Long(j2)})).longValue();
        }
        baseStatePlayer.w = j2;
        return j2;
    }

    public static /* synthetic */ void c(BaseStatePlayer baseStatePlayer, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6fca4a9", new Object[]{baseStatePlayer, hashMap});
        } else {
            baseStatePlayer.I0(hashMap);
        }
    }

    public static /* synthetic */ void d(BaseStatePlayer baseStatePlayer, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2decbd28", new Object[]{baseStatePlayer, new Long(j2)});
        } else {
            baseStatePlayer.n0(j2);
        }
    }

    public static /* synthetic */ void e(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adfbdbb", new Object[]{baseStatePlayer});
        } else {
            baseStatePlayer.G0();
        }
    }

    public static /* synthetic */ List f(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2a0df4ad", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.C;
    }

    public static /* synthetic */ void g(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca07ef9", new Object[]{baseStatePlayer});
        } else {
            baseStatePlayer.E0();
        }
    }

    public static /* synthetic */ List h(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("99e6cfaf", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.D;
    }

    public static /* synthetic */ void i(BaseStatePlayer baseStatePlayer, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc739ac", new Object[]{baseStatePlayer, new Integer(i2)});
        } else {
            baseStatePlayer.I(i2);
        }
    }

    public static /* synthetic */ void j(BaseStatePlayer baseStatePlayer, s sVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9b87bf", new Object[]{baseStatePlayer, sVar, drawable});
        } else {
            baseStatePlayer.F1(sVar, drawable);
        }
    }

    public static /* synthetic */ String k(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19e66bcb", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.K;
    }

    public static /* synthetic */ List l(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8a023dbe", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.A;
    }

    public static /* synthetic */ List m(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("41eeab3f", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.B;
    }

    public static /* synthetic */ List n(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f9db18c0", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.E;
    }

    public static /* synthetic */ void o(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85901746", new Object[]{baseStatePlayer});
        } else {
            baseStatePlayer.D0();
        }
    }

    public static /* synthetic */ List p(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("69b3f3c2", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.H;
    }

    public static /* synthetic */ List q(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21a06143", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.I;
    }

    public static /* synthetic */ List r(BaseStatePlayer baseStatePlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d98ccec4", new Object[]{baseStatePlayer});
        }
        return baseStatePlayer.F;
    }

    public static /* synthetic */ void s(BaseStatePlayer baseStatePlayer, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3accb1", new Object[]{baseStatePlayer, hashMap});
        } else {
            baseStatePlayer.F0(hashMap);
        }
    }

    public void A(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a173e2c5", new Object[]{this, str, jSONObject});
            return;
        }
        RoomPlayerObserver roomPlayerObserver = this.i;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.N(str, jSONObject);
        }
    }

    public boolean A0(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf871c9f", new Object[]{this, sVar})).booleanValue();
        }
        if (this.e == sVar) {
            return z0();
        }
        return false;
    }

    public void A1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
        } else {
            this.f.o = str;
        }
    }

    public void B(IMediaPlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560f6140", new Object[]{this, iVar});
        } else if (!this.G.contains(iVar)) {
            C0("addOnStartListener,不存在Listener，添加");
            this.G.add(iVar);
        } else {
            C0("addOnStartListener,存在Listener，不添加");
        }
    }

    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9128cb0f", new Object[]{this})).booleanValue();
        }
        C0("isWarmInstance,mIsReuseWarmupInstance = " + this.q);
        return this.q;
    }

    public final void B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f7c0d1", new Object[]{this});
            return;
        }
        float G = G();
        C0("setTranslationY,translationY = " + G);
    }

    public void C(IMediaPlayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df95dc74", new Object[]{this, cVar});
        } else if (!((CopyOnWriteArrayList) this.B).contains(cVar)) {
            ((CopyOnWriteArrayList) this.B).add(cVar);
        }
    }

    public void C0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.c != null) {
            x5t.h("StatePlayer", this.c.p() + " " + str + ", mTBPlayerInstance= " + this.e);
        } else {
            x5t.h("StatePlayer", str + "直播间外实例没有mFrameContext, mTBPlayerInstance= " + this.e);
        }
    }

    public void C1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d004160", new Object[]{this, new Boolean(z)});
        } else if (!pvs.T(this.d)) {
            this.J = z;
            this.f.p = z;
        }
    }

    public void D(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3d2b71", new Object[]{this, map});
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.D(4001, map);
        }
    }

    public final void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fba1d09", new Object[]{this});
            return;
        }
        for (int i2 = 0; i2 < ((CopyOnWriteArrayList) this.G).size(); i2++) {
            if (((CopyOnWriteArrayList) this.G).get(i2) != null) {
                ((IMediaPlayer.i) ((CopyOnWriteArrayList) this.G).get(i2)).onStart(null);
            }
        }
    }

    public void D1(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e46aedb", new Object[]{this, new Long(j2)});
        } else {
            this.M = j2;
        }
    }

    public void E(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca70c3c5", new Object[]{this, viewGroup, view});
        } else if (view != null && viewGroup != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    public final void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6f5364", new Object[]{this});
            return;
        }
        C0("onReceiveComplete mCurMediaState = " + d0(this.f13225a));
        int i2 = this.f13225a;
        if (i2 == 2 || i2 == 5) {
            J(7, null);
        }
    }

    public final void E1(s sVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d323793", new Object[]{this, sVar});
        } else if (this.L && sVar != null) {
            C0("setVideoBackground imageUrl = " + this.K);
            if (this.e != null && (context = this.d) != null) {
                Drawable drawable = context.getResources().getDrawable(R.drawable.taolive_slice_scroll_common);
                sVar.z(drawable);
                if (!TextUtils.isEmpty(this.K)) {
                    yvd n = v2s.o().n();
                    n.load(this.K + pvs.p2()).b(new f(sVar, drawable)).a();
                }
            }
        }
    }

    public final void F1(s sVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bb26f7", new Object[]{this, sVar, drawable});
        } else if (sVar != null) {
            sVar.A(drawable, true);
            if (pvs.T(this.d)) {
                sVar.z(drawable);
            }
        }
    }

    public final float G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("275aecb2", new Object[]{this})).floatValue();
        }
        float dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
        int g2 = (int) (hw0.g() * 0.2f);
        if (((hw0.h() * 9) / 16) + g2 + ekr.s <= hw0.g()) {
            return g2;
        }
        return dimensionPixelSize;
    }

    public final void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6efc4d", new Object[]{this});
        } else {
            z1i.a().c(new e());
        }
    }

    public void H(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
        } else if (this.e != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("params", map);
            this.e.c("callWithMsg", hashMap);
        }
    }

    public final void H0(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90740eb", new Object[]{this, hashMap});
        } else if (pvs.b1()) {
            z1i.a().c(new a(hashMap));
        } else {
            C0("收到首帧回调消息直接抛出");
            I0(hashMap);
        }
    }

    public void H1(WarmState warmState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec373889", new Object[]{this, warmState});
            return;
        }
        C0("setWarmState = " + warmState);
        this.n = warmState;
    }

    public final void I(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c69a16", new Object[]{this, new Integer(i2)});
        } else {
            J(i2, null);
        }
    }

    public boolean I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df56d28f", new Object[]{this})).booleanValue();
        }
        return J1(false);
    }

    public void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da42c80", new Object[]{this});
        } else {
            C0("onStateCompleted");
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0239", new Object[]{this});
        } else {
            M(null, null);
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d836fc3", new Object[]{this, str});
        } else {
            M(str, null);
        }
    }

    public void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279b1936", new Object[]{this});
            return;
        }
        C0("onStateFirstFrame");
        RoomPlayerObserver roomPlayerObserver = this.i;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.E(c0());
        }
    }

    public void M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9262f5", new Object[]{this});
            return;
        }
        C0("销毁缩略图播放器实例,thumbnailDestroy");
        s sVar = this.e;
        if (sVar != null) {
            sVar.G();
        }
    }

    public void N(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececf63", new Object[]{this, new Long(j2)});
            return;
        }
        C0("destroy mCurMediaState = " + d0(this.f13225a));
        if (this.e != null) {
            switch (this.f13225a) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                    O(j2, false);
                    return;
                case 4:
                default:
                    return;
            }
        }
    }

    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8320cda9", new Object[]{this});
            return;
        }
        C0("onStateInit");
        if (!this.t) {
            L1();
        }
        A(RoomPlayerObserver.CommonRoomPlayerEventType.PLAYER_CORE_CREATE, null);
    }

    public View N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1daf8c58", new Object[]{this});
        }
        C0("获取缩略图视图,thumbnailGetView");
        s sVar = this.e;
        if (sVar != null) {
            return sVar.H();
        }
        return null;
    }

    public final void O(long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd93d20", new Object[]{this, new Long(j2), new Boolean(z)});
            return;
        }
        P(j2);
        HashMap hashMap = new HashMap();
        hashMap.put("isOnlyChangeState", String.valueOf(z));
        J(4, hashMap);
    }

    public void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248855ab", new Object[]{this});
            return;
        }
        C0("onStatePause");
        RoomPlayerObserver roomPlayerObserver = this.i;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.r();
        }
    }

    public void O1(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29f410f", new Object[]{this, context, str});
            return;
        }
        C0("初始化缩略图播放器实例,thumbnailInit,videoPath = " + str);
        if (this.e != null) {
            if (this.z == null) {
                this.z = new b();
            }
            this.e.I(context, str, this.z);
        }
    }

    public void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1285063", new Object[]{this});
            return;
        }
        C0("onStatePlaying");
        t92 t92Var = this.m;
        if (t92Var != null) {
            t92Var.j();
        }
    }

    public void P1(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32275e", new Object[]{this, new Long(j2)});
            return;
        }
        C0("将缩略图播放器定位到指定位置,thumbnailSeekTo,position = " + j2);
        s sVar = this.e;
        if (sVar != null) {
            sVar.J((int) j2);
        }
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a204efe", new Object[]{this})).booleanValue();
        }
        cdr cdrVar = this.c;
        if (cdrVar == null || !(cdrVar.j() instanceof dba) || this.c.w0() == null || ((dba) this.c.j()).g0 || !this.c.j().b0() || !this.c.w0().isFirst) {
            return false;
        }
        return true;
    }

    public void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b9389e", new Object[]{this});
        } else {
            C0("onStateWarm");
        }
    }

    public void Q1(long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4127ea", new Object[]{this, new Long(j2), new Boolean(z)});
            return;
        }
        this.k.a(z);
        this.l.postDelayed(this.k, j2);
    }

    public final String R() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("859fbdf9", new Object[]{this});
        }
        if (v2s.o().u() != null) {
            str = v2s.o().u().getUserId();
        } else {
            str = "";
        }
        return str + "_" + this.N.nextInt(1000) + "_" + System.currentTimeMillis();
    }

    public void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        C0("pause mCurMediaState = " + d0(this.f13225a));
        s sVar = this.e;
        if (sVar != null) {
            int i2 = this.f13225a;
            if (i2 == 2 || i2 == 5 || i2 == 8) {
                sVar.u();
                I(3);
            }
        }
    }

    public void R1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc549bad", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("__livePushControlInfo", str);
        }
        H(hashMap);
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d25640a7", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public final void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62ff2bf", new Object[]{this});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("context", this.d);
        this.e.c("reattach", hashMap);
    }

    public void S1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfef77c1", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(sj4.KEY_VIDEO_UPDATE_PARAMS, str);
        H(hashMap);
    }

    public Bitmap T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.k();
        }
        return null;
    }

    public void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b344752", new Object[]{this});
            return;
        }
        this.i = null;
        P(0L);
    }

    public boolean T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62468bf6", new Object[]{this})).booleanValue();
        }
        s.d dVar = this.f;
        if (dVar != null) {
            return dVar.p;
        }
        return false;
    }

    public long U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e207", new Object[]{this})).longValue();
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.m(1502);
        }
        return 0L;
    }

    public void U0(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee1eec9", new Object[]{this, eVar});
        } else {
            ((CopyOnWriteArrayList) this.C).remove(eVar);
        }
    }

    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f537a88", new Object[]{this})).intValue();
        }
        return this.f13225a;
    }

    public void V0() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388fe023", new Object[]{this});
            return;
        }
        ViewGroup l0 = l0();
        if (l0 != null && (viewGroup = (ViewGroup) l0.getParent()) != null) {
            viewGroup.removeView(l0);
        }
    }

    public long W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.m(1501);
        }
        return 0L;
    }

    public boolean W0() {
        s.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb3302", new Object[]{this})).booleanValue();
        }
        s sVar = this.e;
        if (sVar == null || (dVar = sVar.e) == null || dVar.U == null) {
            return false;
        }
        return true;
    }

    public boolean X(cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5e28e7", new Object[]{this, cdrVar})).booleanValue();
        }
        if (cdrVar == null || cdrVar.j() == null) {
            return false;
        }
        boolean e0 = cdrVar.j().e0();
        o3s.b(TAG, "getLiveRoomMute  ret = " + e0 + " mLiveContextKey = " + cdrVar.p());
        return e0;
    }

    public String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("987f86c2", new Object[]{this});
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.p(ErrorCode.OAUTH_CODE_FAIL);
        }
        return null;
    }

    public void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ec21b3", new Object[]{this});
            return;
        }
        C0("上报强制播放兜底埋点");
        RoomPlayerObserver roomPlayerObserver = this.i;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.h();
        }
    }

    public float Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50466f21", new Object[]{this})).floatValue();
        }
        C0("获取当前倍速,playRate = " + this.s);
        return this.s;
    }

    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62305078", new Object[]{this});
            return;
        }
        s.d dVar = this.f;
        dVar.U = null;
        dVar.V = null;
        dVar.l = null;
        dVar.m = null;
    }

    public int a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bfb9a2e", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        C0("resume mCurMediaState = " + d0(this.f13225a));
        if (this.e != null) {
            RoomPlayerObserver roomPlayerObserver = this.i;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.t();
            }
            if (this.f13225a == 3) {
                this.e.F();
                I(2);
            }
        }
    }

    public String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9b7f9a", new Object[]{this});
        }
        return this.j;
    }

    public String c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eacc3d02", new Object[]{this});
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.p(3002);
        }
        return null;
    }

    public void c1(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.y(i2, z);
        }
    }

    public String d0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c26f1e90", new Object[]{this, new Integer(i2)});
        }
        switch (i2) {
            case 0:
                return "STATE_INITIAL";
            case 1:
                return "STATE_WARMUP";
            case 2:
                return "STATE_START_PLAYING";
            case 3:
                return "STATE_PAUSED";
            case 4:
                return "STATE_DESTROY";
            case 5:
                return "STATE_FIRST_FRAME";
            case 6:
                return "STATE_ERROR";
            case 7:
                return "STATE_COMPLETED";
            case 8:
                return "STATE_ERROR_TO_REPLAY";
            default:
                return "NONE";
        }
    }

    public void d1(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b30379e", new Object[]{this, drawable});
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.z(drawable);
        }
    }

    public s.d e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s.d) ipChange.ipc$dispatch("9ae72974", new Object[]{this});
        }
        return this.f;
    }

    public void e1(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfa74ab", new Object[]{this, hashMap});
            return;
        }
        s.d dVar = this.f;
        if (dVar != null) {
            if (tz3.b(dVar.w)) {
                this.f.w = new HashMap<>();
            }
            this.f.w.putAll(hashMap);
        }
    }

    public String f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        s.d dVar = this.f;
        if (dVar != null) {
            return dVar.h();
        }
        return null;
    }

    public void f1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d769b006", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public int g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        s sVar = this.e;
        if (sVar != null) {
            return (int) sVar.m(1003);
        }
        return 0;
    }

    public void g1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e17bcb", new Object[]{this, str});
        } else {
            this.K = str;
        }
    }

    @Override // tb.nj9
    public long getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.M;
    }

    public float h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f9486ab", new Object[]{this})).floatValue();
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.l(2002);
        }
        return -1.0f;
    }

    public final void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d44503", new Object[]{this});
            return;
        }
        C0("setDynamicResolutionDetection mEnableHorizontalReplayUseTextureView = " + this.p);
        if (this.p) {
            HashMap hashMap = new HashMap();
            hashMap.put("isPlayBack", "1");
            H(hashMap);
        }
    }

    public long i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b47", new Object[]{this})).longValue();
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.m(1500);
        }
        return 0L;
    }

    public void i1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e34284", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public View j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fdace493", new Object[]{this});
        }
        s sVar = this.e;
        if (sVar != null) {
            return sVar.o();
        }
        return null;
    }

    public void j1(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d11fea", new Object[]{this, new Long(j2)});
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.C(1023, j2);
        }
    }

    public int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        s sVar = this.e;
        if (sVar != null) {
            return (int) sVar.m(1002);
        }
        return 0;
    }

    public void k1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad3159a", new Object[]{this, new Boolean(z)});
            return;
        }
        t92 t92Var = this.m;
        if (t92Var != null) {
            t92Var.i(z);
        }
    }

    public ViewGroup l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.h;
    }

    public void l1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f.A = z;
        if (z && pvs.Y1()) {
            this.f.I = this.x;
        }
    }

    public WarmState m0() {
        WarmState warmState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WarmState) ipChange.ipc$dispatch("5db22047", new Object[]{this});
        }
        WarmState warmState2 = WarmState.NORMAL;
        if (B0()) {
            WarmState warmState3 = this.n;
            if (warmState3 == null || warmState3 != (warmState = WarmState.WARMED)) {
                warmState2 = WarmState.WARMING;
            } else {
                warmState2 = warmState;
            }
        }
        C0("getWarmState,warmState = " + warmState2);
        return warmState2;
    }

    public void m1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
            return;
        }
        s sVar = this.e;
        if (sVar != null) {
            sVar.E(3009, str);
        }
    }

    public final void n0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd78fd58", new Object[]{this, new Long(j2)});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(KEY_FIRST_FRAME_UPDATE_SCREEN_TS, String.valueOf(j2));
        hashMap.put(KEY_FIRST_FRAME_DECODE_COMPLETE_TS, String.valueOf(this.w));
        H0(hashMap);
    }

    public void n1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        C0("设置是否静音，setMuted " + z + ", mIsMute = " + w0());
        if (this.v != z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMute", (Object) Boolean.valueOf(z));
            A(RoomPlayerObserver.CommonRoomPlayerEventType.CHANGE_MUTE, jSONObject);
        }
        this.v = z;
        s sVar = this.e;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    public boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60d284dc", new Object[]{this})).booleanValue();
        }
        if (this.f13225a == 7) {
            return true;
        }
        return false;
    }

    public void o1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7092721", new Object[]{this, new Boolean(z)});
        } else {
            this.L = z;
        }
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca37cbe2", new Object[]{this})).booleanValue();
        }
        return q0("first_frame_rendering_time");
    }

    public void p1(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb09693", new Object[]{this, iVar});
        } else {
            this.b = iVar;
        }
    }

    public final boolean q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6bba6c9", new Object[]{this, str})).booleanValue();
        }
        s sVar = this.e;
        if (sVar == null) {
            return false;
        }
        Map d2 = sr4.d(sVar.n(4500), null);
        if (tz3.b(d2) || !(d2.get(str) instanceof String) || yqq.n((String) d2.get(str), 0L) <= 0) {
            return false;
        }
        return true;
    }

    public void q1(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206b1211", new Object[]{this, new Float(f2), new Boolean(z)});
        } else if (this.e != null) {
            if (z) {
                this.s = f2;
            }
            C0("设置当前倍速,playRate = " + f2 + ",needRecord = " + z);
            this.e.B(2000, f2);
        }
    }

    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c4ca3b", new Object[]{this})).booleanValue();
        }
        return q0("first_frame_update_ts");
    }

    public final void r1(String str, int i2) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d31c7e", new Object[]{this, str, new Integer(i2)});
            return;
        }
        C0("setPlayerCover imageUrl = " + str);
        if (this.e != null && (context = this.d) != null) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.taolive_slice_scroll_common);
            F1(this.e, drawable);
            if (!TextUtils.isEmpty(str)) {
                yvd n = v2s.o().n();
                n.load(str + pvs.p2()).b(new e12(this, str, i2, drawable)).a();
            }
        }
    }

    public void s1(cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e327dbd2", new Object[]{this, cdrVar});
            return;
        }
        this.c = cdrVar;
        if (cdrVar != null) {
            w1(cdrVar.I0());
        }
    }

    public void t(IMediaPlayer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb01f600", new Object[]{this, cVar});
        } else if (!this.A.contains(cVar)) {
            this.A.add(cVar);
        }
    }

    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539f89f7", new Object[]{this});
        }
    }

    public void t1(e7m e7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1fac7b", new Object[]{this, e7mVar});
            return;
        }
        SoFetchController soFetchController = this.r;
        if (soFetchController != null) {
            soFetchController.g(e7mVar);
        }
    }

    public void u(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bedf90c", new Object[]{this, eVar});
        } else if (!this.C.contains(eVar)) {
            this.C.add(eVar);
        }
    }

    public boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e04a9b7", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    public void v(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ceb691", new Object[]{this, bVar});
        } else if (!this.D.contains(bVar)) {
            this.D.add(bVar);
        }
    }

    public boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("985c30bf", new Object[]{this})).booleanValue();
        }
        return this.f.A;
    }

    public void v1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17065538", new Object[]{this, str});
        } else if (this.f != null && !TextUtils.isEmpty(str)) {
            this.f.n(str);
        }
    }

    public void w(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80efd3c0", new Object[]{this, fVar});
        } else if (!this.H.contains(fVar)) {
            this.H.add(fVar);
        }
    }

    public boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        s sVar = this.e;
        if (sVar == null || sVar.m(1007) != 1) {
            return false;
        }
        return true;
    }

    public void w1(RoomPlayerObserver roomPlayerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8416b852", new Object[]{this, roomPlayerObserver});
            return;
        }
        this.i = roomPlayerObserver;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.H(this.j);
        }
    }

    public void x(IMediaPlayer.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90da300", new Object[]{this, gVar});
        } else if (!((CopyOnWriteArrayList) this.I).contains(gVar)) {
            ((CopyOnWriteArrayList) this.I).add(gVar);
        }
    }

    public boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        return this.f.i;
    }

    public void y(IMediaPlayer.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78517c42", new Object[]{this, dVar});
        } else if (!((CopyOnWriteArrayList) this.E).contains(dVar)) {
            ((CopyOnWriteArrayList) this.E).add(dVar);
        }
    }

    public boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        int i2 = this.f13225a;
        if (i2 == 2 || i2 == 5 || i2 == 8) {
            return true;
        }
        return false;
    }

    public void y1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f9eac8", new Object[]{this, new Integer(i2)});
        } else {
            this.f.B = i2;
        }
    }

    public void z(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d5dfee", new Object[]{this, hVar});
        } else if (!this.F.contains(hVar)) {
            this.F.add(hVar);
        }
    }

    public void z1(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce64a55", new Object[]{this, jVar});
        } else {
            this.g = jVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements aub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.aub
        public void onLoopCompletion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
                return;
            }
            BaseStatePlayer.this.C0("收到onLoopCompletion");
            if (pvs.Y1()) {
                for (int i = 0; i < BaseStatePlayer.n(BaseStatePlayer.this).size(); i++) {
                    if (BaseStatePlayer.n(BaseStatePlayer.this).get(i) != null) {
                        ((IMediaPlayer.d) BaseStatePlayer.n(BaseStatePlayer.this).get(i)).onHighLightLoopCompletion(null);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
                return;
            }
            BaseStatePlayer baseStatePlayer = BaseStatePlayer.this;
            if (!baseStatePlayer.f.A) {
                BaseStatePlayer.g(baseStatePlayer);
                while (i < BaseStatePlayer.h(BaseStatePlayer.this).size()) {
                    if (BaseStatePlayer.h(BaseStatePlayer.this).get(i) != null) {
                        ((IMediaPlayer.b) BaseStatePlayer.h(BaseStatePlayer.this).get(i)).onCompletion(null);
                    }
                    i++;
                }
            } else if (!pvs.Y1()) {
                while (i < BaseStatePlayer.n(BaseStatePlayer.this).size()) {
                    if (BaseStatePlayer.n(BaseStatePlayer.this).get(i) != null) {
                        ((IMediaPlayer.d) BaseStatePlayer.n(BaseStatePlayer.this).get(i)).onHighLightLoopCompletion(null);
                    }
                    i++;
                }
            }
        }

        @Override // tb.asc
        public void onMediaError(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(BaseStatePlayer.KEY_ERROR_CODE, String.valueOf(i));
            BaseStatePlayer.s(BaseStatePlayer.this, hashMap);
            for (int i3 = 0; i3 < BaseStatePlayer.l(BaseStatePlayer.this).size(); i3++) {
                if (BaseStatePlayer.l(BaseStatePlayer.this).get(i3) != null) {
                    ((IMediaPlayer.c) BaseStatePlayer.l(BaseStatePlayer.this).get(i3)).onError(null, i, i2);
                }
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
                return;
            }
            for (int i = 0; i < BaseStatePlayer.p(BaseStatePlayer.this).size(); i++) {
                if (BaseStatePlayer.p(BaseStatePlayer.this).get(i) != null) {
                    ((IMediaPlayer.f) BaseStatePlayer.p(BaseStatePlayer.this).get(i)).onPause(null);
                }
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                return;
            }
            for (int i = 0; i < BaseStatePlayer.r(BaseStatePlayer.this).size(); i++) {
                if (BaseStatePlayer.r(BaseStatePlayer.this).get(i) != null) {
                    ((IMediaPlayer.h) BaseStatePlayer.r(BaseStatePlayer.this).get(i)).onPrepared(null);
                }
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
                return;
            }
            BaseStatePlayer.this.C0("收到onMediaStart");
            BaseStatePlayer.o(BaseStatePlayer.this);
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
                return;
            }
            BaseStatePlayer.this.C0("收到onMediaPlay");
            for (int i = 0; i < BaseStatePlayer.q(BaseStatePlayer.this).size(); i++) {
                if (BaseStatePlayer.q(BaseStatePlayer.this).get(i) != null) {
                    ((IMediaPlayer.g) BaseStatePlayer.q(BaseStatePlayer.this).get(i)).onPlay(null);
                }
            }
        }

        @Override // tb.asc
        public void onMediaInfo(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            int i = (int) j;
            if (i == 3) {
                BaseStatePlayer.b(BaseStatePlayer.this, j2);
                BaseStatePlayer baseStatePlayer = BaseStatePlayer.this;
                baseStatePlayer.C0("首帧劣化排查，MEDIA_INFO_VIDEO_RENDERING_START，extra = " + BaseStatePlayer.a(BaseStatePlayer.this));
            } else if (i == 12000) {
                BaseStatePlayer.this.C0("预热成功");
            } else if (i == 12101) {
                BaseStatePlayer baseStatePlayer2 = BaseStatePlayer.this;
                baseStatePlayer2.C0("首帧劣化排查，MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE，mDecodeFirstFrameTs = " + BaseStatePlayer.a(BaseStatePlayer.this) + "，extra = " + j2);
                BaseStatePlayer.d(BaseStatePlayer.this, j2);
            } else if (i == 12102) {
                BaseStatePlayer.e(BaseStatePlayer.this);
            }
            i iVar = BaseStatePlayer.this.b;
            if (iVar != null) {
                ((StandardVideoFrame) iVar).m0(j, j2, j3, obj);
            }
            if (j == 4502) {
                BaseStatePlayer.this.C0("baseStatePlayer收到TBPlayerPropertyInstanceCommunication");
            }
            for (int i2 = 0; i2 < BaseStatePlayer.f(BaseStatePlayer.this).size(); i2++) {
                if (BaseStatePlayer.f(BaseStatePlayer.this).get(i2) != null) {
                    ((IMediaPlayer.e) BaseStatePlayer.f(BaseStatePlayer.this).get(i2)).onInfo(null, j, j2, j3, obj);
                }
            }
        }
    }

    public BaseStatePlayer(Context context, cdr cdrVar) {
        this.f13225a = 0;
        this.k = new h();
        this.n = WarmState.NORMAL;
        this.o = 2;
        this.p = false;
        this.s = 1.0f;
        this.t = false;
        this.v = true;
        this.x = new c();
        this.y = new d();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.C = new CopyOnWriteArrayList();
        this.D = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = new CopyOnWriteArrayList();
        this.J = false;
        this.N = new Random();
        this.d = context;
        this.f = new s.d();
        this.j = R();
        s1(cdrVar);
        s0(cdrVar);
        this.f13225a = 4;
        this.l = new Handler(Looper.getMainLooper());
        C0("new BaseStatePlayer() mCurMediaState = " + d0(this.f13225a));
        this.m = new t92(this);
        this.r = new SoFetchController(this.c);
        A(RoomPlayerObserver.CommonRoomPlayerEventType.PLAYER_INIT, null);
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84851d3a", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("needLoadingUI", String.valueOf(true));
        hashMap.put("retryAfterNetError", String.valueOf(true));
        e1(hashMap);
    }

    public void G1(String str, int i2) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e37bff5", new Object[]{this, str, new Integer(i2)});
            return;
        }
        C0("setVideoCoverImage imageUrl = " + str);
        if (Q()) {
            Drawable c2 = hz0.c(this.d);
            if (c2 == null || (sVar = this.e) == null) {
                r1(str, i2);
            } else {
                sVar.A(c2, true);
                C0("setVideoCoverImage useExternalImage");
            }
        } else {
            r1(str, i2);
        }
        cdr cdrVar = this.c;
        if (cdrVar != null && (cdrVar.j() instanceof dba)) {
            ((dba) this.c.j()).g0 = true;
        }
    }

    public final void I0(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3689e6e", new Object[]{this, hashMap});
            return;
        }
        C0("onReceiveFirstFrame mCurMediaState = " + d0(this.f13225a));
        if (this.f13225a == 2) {
            J(5, hashMap);
        }
    }

    public final void J(int i2, Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41cd12af", new Object[]{this, new Integer(i2), map});
            return;
        }
        if (!tz3.b(map)) {
            z = sr4.a(map.get("isOnlyChangeState"), false);
        }
        this.f13225a = i2;
        if (z) {
            C0("只改变状态机，不向业务发送回调");
            return;
        }
        switch (i2) {
            case 0:
                N0();
                break;
            case 1:
                Q0();
                break;
            case 2:
                P0();
                break;
            case 3:
                O0();
                break;
            case 4:
                K0();
                break;
            case 5:
                M0();
                break;
            case 6:
                L0(map);
                break;
            case 7:
                J0();
                break;
        }
        C0("mStateChangeCallback：" + this.g);
        j jVar = this.g;
        if (jVar != null) {
            jVar.I(this.f13225a, map);
        }
    }

    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca25a2f", new Object[]{this});
            return;
        }
        C0("onStateDestroy");
        RoomPlayerObserver roomPlayerObserver = this.i;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.o();
        }
        this.w = 0L;
        ((CopyOnWriteArrayList) this.D).clear();
        ((CopyOnWriteArrayList) this.F).clear();
        ((CopyOnWriteArrayList) this.A).clear();
        ((CopyOnWriteArrayList) this.B).clear();
        ((CopyOnWriteArrayList) this.C).clear();
        ((CopyOnWriteArrayList) this.G).clear();
        ((CopyOnWriteArrayList) this.H).clear();
        ((CopyOnWriteArrayList) this.I).clear();
        ((CopyOnWriteArrayList) this.E).clear();
        this.p = false;
        this.q = false;
    }

    public final void L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7a5ea5", new Object[]{this});
            return;
        }
        boolean r0 = r0();
        C0("设置封面，首帧是否渲染完成 = " + r0);
        if (!r0) {
            G1(this.K, 0);
        }
    }

    public void M(String str, jgi jgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5a95e3", new Object[]{this, str, jgiVar});
            return;
        }
        C0("createPlayerInstance mCurMediaState = " + d0(this.f13225a) + ",playToken = " + str);
        if (this.f13225a == 4) {
            this.l.removeCallbacks(this.k);
            v1(str);
            if (jgiVar != null) {
                this.e = s.c.b(this.f, jgiVar);
            } else {
                this.e = s.c.c(null, this.f);
            }
            C0("创建播放器实例：是否使用surfaceView：" + this.f.p + "，canUse:" + this.f.d() + ",isRuse:" + this.f.j() + ",mute:" + this.f.i + ", reuse state: " + this.f.f);
            if (this.e != null) {
                S0();
                FrameLayout frameLayout = new FrameLayout(this.d);
                this.h = frameLayout;
                E(frameLayout, this.e.o());
                C0("添加播放器视图到rootView上，播放器复用时的状态:" + this.f.f);
                b1();
                I(0);
                B1();
                E1(this.e);
                h1();
                j1(0L);
            }
        }
    }

    public void U1() {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1baa9487", new Object[]{this});
            return;
        }
        C0("warmUp mCurMediaState = " + d0(this.f13225a));
        if (this.f13225a == 0 && (sVar = this.e) != null) {
            sVar.M(new MediaLiveWarmupConfig());
            I(1);
        }
    }

    public final void X0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980f966a", new Object[]{this, map});
            return;
        }
        String str = map != null ? map.get(KEY_ERROR_CODE) : null;
        C0("onStateError,errCode = " + str);
        RoomPlayerObserver roomPlayerObserver = this.i;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.p(yqq.l(str, 0));
        }
    }

    public final void F0(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a118e8", new Object[]{this, hashMap});
            return;
        }
        C0("onReceiveError mCurMediaState = " + d0(this.f13225a));
        X0(hashMap);
        int i2 = this.f13225a;
        if (i2 == 1 || i2 == 2 || i2 == 5 || i2 == 8) {
            J(6, hashMap);
        }
    }

    public boolean J1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8431ad", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        C0("startForResult mCurMediaState = " + d0(this.f13225a) + ",needForceStart = " + z);
        this.l.removeCallbacks(this.k);
        if (this.e == null) {
            return false;
        }
        if (z) {
            K1();
            return true;
        }
        int i2 = this.f13225a;
        if (i2 == 0 || i2 == 1 || i2 == 3) {
            K1();
            return true;
        } else if (i2 == 4) {
            K();
            A(RoomPlayerObserver.CommonRoomPlayerEventType.PLAYER_CORE_RECREATE, null);
            K1();
            return true;
        } else if (i2 != 6 && i2 != 7 && i2 != 8) {
            return false;
        } else {
            O(0L, true);
            V0();
            K();
            A(RoomPlayerObserver.CommonRoomPlayerEventType.PLAYER_CORE_RECREATE, null);
            K1();
            return true;
        }
    }

    public final void K1() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9c5a9a", new Object[]{this});
            return;
        }
        x1(0, -1);
        this.e.F();
        I(2);
        if (this.i != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMute", (Object) String.valueOf(this.v));
            jSONObject.put("playRate", (Object) String.valueOf(Z()));
            if (z3s.b("KEY_WINDOW_ZOOM_SWITCH", false) || z3s.b("KEY_WINDOW_OUTSIDE_SWITCH", false)) {
                z = true;
            }
            jSONObject.put("backgroundWindow", (Object) String.valueOf(z));
            this.i.G(jSONObject);
            this.i.s();
        }
    }

    public void L0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4610128", new Object[]{this, map});
            return;
        }
        C0("onStateError");
        x1(2, yqq.l(map != null ? map.get(KEY_ERROR_CODE) : null, 0));
    }

    public final void P(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8840a6", new Object[]{this, new Long(j2)});
            return;
        }
        C0("直播未销毁排查,destroyInternal");
        x1(1, -1);
        s sVar = this.e;
        if (sVar != null) {
            sVar.i(j2);
        }
        A(RoomPlayerObserver.CommonRoomPlayerEventType.PLAYER_CORE_DESTROY, null);
        t92 t92Var = this.m;
        if (t92Var != null) {
            t92Var.k();
        }
        this.n = WarmState.NORMAL;
        this.o = 2;
        this.s = 1.0f;
    }

    public final void b1() {
        s.d dVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a1787e", new Object[]{this});
            return;
        }
        s sVar = this.e;
        if (sVar != null && (dVar = sVar.e) != null) {
            int i2 = dVar.f;
            this.u = i2;
            if (i2 != 0) {
                if (yqq.e(this.f.h())) {
                    this.o = 0;
                } else {
                    this.o = 1;
                }
                C0("播放器复用成功，复用前一个实例的状态：" + this.e.e.f);
                if (this.e.e.f == 1) {
                    z = true;
                }
                this.q = z;
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("playerInstanceObj", this.e);
                hashMap.put("playerReuseState", Integer.valueOf(this.e.e.f));
                this.e.c("instanceCommunication", hashMap);
            }
        }
    }

    public final void s0(cdr cdrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6144a52c", new Object[]{this, cdrVar});
            return;
        }
        s.d dVar = this.f;
        dVar.h = this.d;
        dVar.i = X(cdrVar);
        s.d dVar2 = this.f;
        dVar2.j = "TBVideo";
        dVar2.t = this.y;
        dVar2.p = this.J;
        dVar2.r = 0;
        dVar2.s = true;
        dVar2.u = this;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
        hashMap.put("isLiveDomainRequiredParams", "true");
        this.f.w = hashMap;
        if (pvs.y1()) {
            this.f.q = DWAspectRatio.DW_FIT_ADAPT;
        }
        t0();
    }

    public void u1(IMediaPlayer.AspectRatio aspectRatio) {
        DWAspectRatio dWAspectRatio;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e0336d", new Object[]{this, aspectRatio});
            return;
        }
        if (pvs.y1()) {
            int i2 = g.$SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$AspectRatio[aspectRatio.ordinal()];
            if (i2 == 1) {
                dWAspectRatio = DWAspectRatio.DW_FIT_X_Y;
            } else if (i2 == 2) {
                dWAspectRatio = DWAspectRatio.DW_FIT_CENTER;
            } else if (i2 != 3) {
                dWAspectRatio = DWAspectRatio.DW_FIT_ADAPT;
            } else {
                dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
            }
        } else {
            int i3 = g.$SwitchMap$com$taobao$taolive$sdk$ui$media$IMediaPlayer$AspectRatio[aspectRatio.ordinal()];
            if (i3 == 1) {
                dWAspectRatio = DWAspectRatio.DW_FIT_X_Y;
            } else if (i3 != 2) {
                dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
            } else {
                dWAspectRatio = DWAspectRatio.DW_FIT_CENTER;
            }
        }
        s.d dVar = this.f;
        if (dVar != null) {
            dVar.q = dWAspectRatio;
        }
        C0("setRationType,aspectRatio = " + aspectRatio);
    }

    public final void x1(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8f3a5c", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.r != null) {
            C0("setSoFetchState state = " + i2 + ", errorWhat = " + i3);
            if (i2 == 0) {
                this.r.d();
            } else if (i2 == 1) {
                this.r.h();
            } else if (i2 == 2) {
                this.r.f(i3);
            }
        }
    }

    public boolean z0() {
        s.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbc1f2a", new Object[]{this})).booleanValue();
        }
        s sVar = this.e;
        if (sVar == null || (dVar = sVar.e) == null) {
            return false;
        }
        if (dVar.f != 0) {
            return true;
        }
        C0("isReuseInstance播放器非复用态");
        return false;
    }
}
