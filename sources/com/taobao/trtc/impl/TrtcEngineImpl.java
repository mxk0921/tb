package com.taobao.trtc.impl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.j3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.ACCSClient;
import com.taobao.common.inspector.SystemProperties;
import com.taobao.trtc.accs.TrtcAccsHandler;
import com.taobao.trtc.api.ITrtcCallInterface;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.ITrtcOutputStream;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcException;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.api.TrtcVideoDevice;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.impl.a;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.TrtcPhoneStats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.NativeLibrary;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoFrame;
import org.webrtc.audio.WebRtcExtProcessAudioFrame;
import tb.amu;
import tb.bju;
import tb.cmu;
import tb.emu;
import tb.jju;
import tb.kju;
import tb.lmu;
import tb.nf;
import tb.nlu;
import tb.olu;
import tb.omu;
import tb.plu;
import tb.pr3;
import tb.rlu;
import tb.slu;
import tb.t2o;
import tb.tmu;
import tb.vlu;
import tb.vmu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcEngineImpl extends com.taobao.trtc.api.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lmu b;
    public TrtcDefines.TrtcWorkMode e;
    public com.taobao.trtc.impl.e f;
    public bju g;
    public com.taobao.trtc.impl.c h;
    public TrtcPhoneStats i;
    public nlu j;
    public final omu n;
    public com.taobao.trtc.impl.b o;
    public TrtcDefines.h q;
    public TrtcInnerDefines.TrtcMakeCallParams r;
    public TrtcInnerDefines.TrtcAnswerCallParams s;
    public TrtcDefines.g t;
    public String v;
    public final Handler x;
    public final TrtcInnerConfig c = new TrtcInnerConfig();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicLong l = new AtomicLong(0);
    public volatile boolean m = false;
    public TrtcDefines.TrtcMixMode p = TrtcDefines.TrtcMixMode.MIX_LOCAL;
    public final AtomicBoolean u = new AtomicBoolean(false);
    public vlu w = null;
    public final vmu k = new vmu();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcDefines.h f13912a;

        public a(TrtcDefines.h hVar) {
            this.f13912a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcLog.j("TrtcEngine", "nativeStartLive start");
            TrtcEngineImpl.M(TrtcEngineImpl.this, new TrtcInnerDefines.StartLiveParams(this.f13912a));
            TrtcLog.j("TrtcEngine", "nativeStartLive done");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcEngineImpl.N(TrtcEngineImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcEngineImpl.Q(TrtcEngineImpl.this, new TrtcInnerDefines.TrtcJoinChannelParams(TrtcEngineImpl.O(TrtcEngineImpl.this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13915a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public d(String str, int i, String str2) {
            this.f13915a = str;
            this.b = i;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcEngineImpl.R(TrtcEngineImpl.this, this.f13915a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcDefines.m f13916a;
        public final /* synthetic */ TrtcInnerDefines.ChannelNotifyAction b;

        public e(TrtcDefines.m mVar, TrtcInnerDefines.ChannelNotifyAction channelNotifyAction) {
            this.f13916a = mVar;
            this.b = channelNotifyAction;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcEngineImpl trtcEngineImpl = TrtcEngineImpl.this;
            TrtcDefines.m mVar = this.f13916a;
            String str = mVar.f13887a;
            String str2 = mVar.b;
            int ordinal = this.b.ordinal();
            TrtcDefines.m mVar2 = this.f13916a;
            TrtcEngineImpl.S(trtcEngineImpl, str, str2, ordinal, mVar2.c, mVar2.d, mVar2.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcInnerDefines.TrtcMakeCallParams f13917a;

        public f(TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams) {
            this.f13917a = trtcMakeCallParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcEngineImpl.T(TrtcEngineImpl.this, this.f13917a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcInnerDefines.TrtcAnswerCallParams f13918a;

        public g(TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams) {
            this.f13918a = trtcAnswerCallParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcEngineImpl.U(TrtcEngineImpl.this, this.f13918a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcInnerDefines.TrtcHangUpCallParams f13919a;

        public h(TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams) {
            this.f13919a = trtcHangUpCallParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcEngineImpl.V(TrtcEngineImpl.this, this.f13919a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcLog.j("TrtcEngine", "updateAudioProcessConfig ");
            TrtcEngineImpl trtcEngineImpl = TrtcEngineImpl.this;
            TrtcEngineImpl.c0(trtcEngineImpl, TrtcEngineImpl.E(trtcEngineImpl).g(), TrtcEngineImpl.E(TrtcEngineImpl.this).h(), TrtcEngineImpl.E(TrtcEngineImpl.this).e());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13922a;
        public final /* synthetic */ TrtcConfig b;

        public k(boolean z, TrtcConfig trtcConfig) {
            this.f13922a = z;
            this.b = trtcConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AtomicLong P = TrtcEngineImpl.P(TrtcEngineImpl.this);
            TrtcEngineImpl trtcEngineImpl = TrtcEngineImpl.this;
            P.set(TrtcEngineImpl.G(trtcEngineImpl, TrtcEngineImpl.e0(trtcEngineImpl), TrtcEngineImpl.e0(TrtcEngineImpl.this).getEngineConfigFlags(), TrtcEngineImpl.F(TrtcEngineImpl.this).k()));
            if (!this.f13922a) {
                TrtcEngineImpl.d0(TrtcEngineImpl.this).s(this.b, false);
            }
            TrtcEngineImpl.d0(TrtcEngineImpl.this).r(this.b.getServerName(), true);
            TrtcEngineImpl.H(TrtcEngineImpl.this).sendEmptyMessage(3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    TrtcEngineImpl.I(TrtcEngineImpl.this);
                } catch (Exception e) {
                    tmu.f("TrtcEngine", "trtc unInitialize exception: " + e.getMessage() + " ms");
                }
            } finally {
                TrtcEngineImpl.J(TrtcEngineImpl.this).a(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13924a;

        public m(String str) {
            this.f13924a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcEngineImpl.F(TrtcEngineImpl.this).t(this.f13924a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13925a;
        public final /* synthetic */ ITrtcInputStream b;

        public n(String str, ITrtcInputStream iTrtcInputStream) {
            this.f13925a = str;
            this.b = iTrtcInputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcInnerDefines.TrtcUpdateStreamParams trtcUpdateStreamParams = new TrtcInnerDefines.TrtcUpdateStreamParams(this.f13925a, this.b);
            tmu.f("TrtcEngine", "API - update local stream, " + trtcUpdateStreamParams.mediaConfig.toString());
            TrtcEngineImpl.K(TrtcEngineImpl.this, trtcUpdateStreamParams);
        }
    }

    static {
        t2o.a(395313499);
    }

    public TrtcEngineImpl(Context context) throws TrtcException {
        i iVar = new i(Looper.getMainLooper());
        this.x = iVar;
        jju.b("context is null", context);
        jju.c("Trtc engine create");
        TrtcLog.j("TrtcEngine", "new trtcEngine, " + this);
        this.n = new omu(iVar);
        rlu.f27461a = context.getApplicationContext();
        lmu lmuVar = new lmu();
        this.b = lmuVar;
        lmuVar.h(rlu.f27461a, null);
    }

    public static void A0(Context context, boolean z, String str, String str2, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49670544", new Object[]{context, new Boolean(z), str, str2, new Integer(i2), str3});
            return;
        }
        if (!str3.isEmpty()) {
            TrtcAccsHandler.j(str3);
        }
        TrtcAccsHandler.k(str2);
        TrtcAccsHandler.l(i2);
        TrtcAccsHandler.c(context, null, z);
        TrtcSignalChannel.a(TrtcSignalChannel.f13972a, str);
    }

    public static /* synthetic */ void D(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87eed7b", new Object[]{trtcEngineImpl});
        } else {
            trtcEngineImpl.i1();
        }
    }

    public static /* synthetic */ bju E(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bju) ipChange.ipc$dispatch("e63fdfec", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.g;
    }

    public static /* synthetic */ com.taobao.trtc.impl.e F(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.impl.e) ipChange.ipc$dispatch("5f014795", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.f;
    }

    public static /* synthetic */ long G(TrtcEngineImpl trtcEngineImpl, TrtcInnerConfig trtcInnerConfig, int i2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e2890a4", new Object[]{trtcEngineImpl, trtcInnerConfig, new Integer(i2), new Long(j2)})).longValue();
        }
        return trtcEngineImpl.nativeInitialize(trtcInnerConfig, i2, j2);
    }

    public static /* synthetic */ Handler H(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b4843e1c", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.x;
    }

    public static /* synthetic */ void I(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdda1dc9", new Object[]{trtcEngineImpl});
        } else {
            trtcEngineImpl.y1();
        }
    }

    public static /* synthetic */ vmu J(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmu) ipChange.ipc$dispatch("aa313f61", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.k;
    }

    public static /* synthetic */ void K(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcUpdateStreamParams trtcUpdateStreamParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be04645", new Object[]{trtcEngineImpl, trtcUpdateStreamParams});
        } else {
            trtcEngineImpl.nativeUpdateStream(trtcUpdateStreamParams);
        }
    }

    public static /* synthetic */ void L(TrtcEngineImpl trtcEngineImpl, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bbf344", new Object[]{trtcEngineImpl, str, str2, str3});
        } else {
            trtcEngineImpl.nativeStopStreamProcess(str, str2, str3);
        }
    }

    public static /* synthetic */ int M(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.StartLiveParams startLiveParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f376ba70", new Object[]{trtcEngineImpl, startLiveParams})).intValue();
        }
        return trtcEngineImpl.nativeStartLive(startLiveParams);
    }

    public static /* synthetic */ void N(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc782ca4", new Object[]{trtcEngineImpl});
        } else {
            trtcEngineImpl.nativeStopLive();
        }
    }

    public static /* synthetic */ TrtcDefines.g O(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.g) ipChange.ipc$dispatch("1d50623f", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.t;
    }

    public static /* synthetic */ AtomicLong P(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("3fe3c5d9", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.l;
    }

    public static /* synthetic */ void Q(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcJoinChannelParams trtcJoinChannelParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f64937", new Object[]{trtcEngineImpl, trtcJoinChannelParams});
        } else {
            trtcEngineImpl.nativeJoinChannel(trtcJoinChannelParams);
        }
    }

    public static /* synthetic */ void R(TrtcEngineImpl trtcEngineImpl, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119119f7", new Object[]{trtcEngineImpl, str, new Integer(i2), str2});
        } else {
            trtcEngineImpl.nativeLeaveChannel(str, i2, str2);
        }
    }

    public static /* synthetic */ void S(TrtcEngineImpl trtcEngineImpl, String str, String str2, int i2, boolean z, boolean z2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30ebaae", new Object[]{trtcEngineImpl, str, str2, new Integer(i2), new Boolean(z), new Boolean(z2), str3});
        } else {
            trtcEngineImpl.nativeNotifyChannel(str, str2, i2, z, z2, str3);
        }
    }

    public static /* synthetic */ void T(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923b9e5", new Object[]{trtcEngineImpl, trtcMakeCallParams});
        } else {
            trtcEngineImpl.nativeMakeCall(trtcMakeCallParams);
        }
    }

    public static /* synthetic */ void U(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7f8b34", new Object[]{trtcEngineImpl, trtcAnswerCallParams});
        } else {
            trtcEngineImpl.nativeAnswerCall(trtcAnswerCallParams);
        }
    }

    public static /* synthetic */ void V(TrtcEngineImpl trtcEngineImpl, TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c45c984", new Object[]{trtcEngineImpl, trtcHangUpCallParams});
        } else {
            trtcEngineImpl.nativeHangUpCall(trtcHangUpCallParams);
        }
    }

    public static /* synthetic */ void W(TrtcEngineImpl trtcEngineImpl, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77a7d8f", new Object[]{trtcEngineImpl, str, str2, str3, str4});
        } else {
            trtcEngineImpl.nativeSendCustomMessage(str, str2, str3, str4);
        }
    }

    public static TrtcInnerDefines.LocalMediaConfig W0(ITrtcInputStream iTrtcInputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInnerDefines.LocalMediaConfig) ipChange.ipc$dispatch("18acc88a", new Object[]{iTrtcInputStream});
        }
        TrtcInnerDefines.LocalMediaConfig localMediaConfig = new TrtcInnerDefines.LocalMediaConfig();
        if (iTrtcInputStream != null) {
            TrtcStreamConfig streamConfig = iTrtcInputStream.streamConfig();
            if (streamConfig != null) {
                localMediaConfig.videoMaxHeight = streamConfig.getVideoHeight();
                localMediaConfig.videoMaxWidth = streamConfig.getVideoWidth();
                localMediaConfig.videoMaxFps = streamConfig.getVideoFps();
                localMediaConfig.audioEnable = streamConfig.isAudioEnable();
                localMediaConfig.videoEnable = streamConfig.isVideoEnable();
                localMediaConfig.dataEnable = streamConfig.isDataEnable();
            }
        } else {
            localMediaConfig.videoEnable = false;
            localMediaConfig.dataEnable = false;
            localMediaConfig.audioEnable = true;
        }
        return localMediaConfig;
    }

    public static /* synthetic */ AtomicBoolean X(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("241220d8", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.d;
    }

    public static /* synthetic */ TrtcPhoneStats Y(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcPhoneStats) ipChange.ipc$dispatch("c0adbbe3", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.i;
    }

    public static /* synthetic */ TrtcPhoneStats Z(TrtcEngineImpl trtcEngineImpl, TrtcPhoneStats trtcPhoneStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcPhoneStats) ipChange.ipc$dispatch("174b4801", new Object[]{trtcEngineImpl, trtcPhoneStats});
        }
        trtcEngineImpl.i = trtcPhoneStats;
        return trtcPhoneStats;
    }

    public static /* synthetic */ nlu a0(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nlu) ipChange.ipc$dispatch("f7e70fe6", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.j;
    }

    public static /* synthetic */ com.taobao.trtc.impl.c b0(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.impl.c) ipChange.ipc$dispatch("fc520129", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.h;
    }

    public static /* synthetic */ void c0(TrtcEngineImpl trtcEngineImpl, boolean z, boolean z2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c250ef", new Object[]{trtcEngineImpl, new Boolean(z), new Boolean(z2), new Integer(i2)});
        } else {
            trtcEngineImpl.nativeUpdateAudioProcessConfig(z, z2, i2);
        }
    }

    public static /* synthetic */ omu d0(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omu) ipChange.ipc$dispatch("3ffa08bf", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.n;
    }

    public static /* synthetic */ TrtcInnerConfig e0(TrtcEngineImpl trtcEngineImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInnerConfig) ipChange.ipc$dispatch("da05f4c8", new Object[]{trtcEngineImpl});
        }
        return trtcEngineImpl.c;
    }

    public static /* synthetic */ Object ipc$super(TrtcEngineImpl trtcEngineImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcEngineImpl");
    }

    private native void nativeAnswerCall(TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams);

    private native void nativeCancelCall(TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams);

    private native String nativeCreateChannelId(String str);

    private native void nativeCustomUt(String str, boolean z, boolean z2);

    private native String nativeGetVersion();

    private native void nativeHangUpCall(TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams);

    private native long nativeInitialize(TrtcInnerConfig trtcInnerConfig, int i2, long j2);

    private native void nativeJoinChannel(TrtcInnerDefines.TrtcJoinChannelParams trtcJoinChannelParams);

    private native void nativeLeaveChannel(String str, int i2, String str2);

    private native void nativeMakeCall(TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams);

    private native void nativeMuteAudio(boolean z, boolean z2, String str, String str2);

    private native void nativeMuteRemoteAudio(ArrayList<String> arrayList, boolean z, boolean z2);

    private native void nativeNotifyChannel(String str, String str2, int i2, boolean z, boolean z2, String str3);

    private native void nativeSendChannelBroadcastMsg(String str, String str2, String str3);

    private native void nativeSendCustomMessage(String str, String str2, String str3, String str4);

    private native void nativeSendData(String str, byte[] bArr, int i2);

    private native void nativeSetLocalVideoFreeze(TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo);

    private native void nativeSetRemoteVideoFreeze(TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams);

    private native void nativeSetVideoLayout(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams);

    private native int nativeStartLive(TrtcInnerDefines.StartLiveParams startLiveParams);

    private native String nativeStartStreamProcess(TrtcInnerDefines.TrtcStreamProcessParams trtcStreamProcessParams);

    private native void nativeStopLive();

    private native void nativeStopStreamProcess(String str, String str2, String str3);

    private native void nativeUnInitialize();

    private native void nativeUpdateAudioProcessConfig(boolean z, boolean z2, int i2);

    private native void nativeUpdateStream(TrtcInnerDefines.TrtcUpdateStreamParams trtcUpdateStreamParams);

    public static void onLogCallback(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963aaa9c", new Object[]{new Integer(i2), str});
        } else {
            TrtcLog.d(i2, str);
        }
    }

    public static void w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c847c202", new Object[0]);
            return;
        }
        TrtcAccsHandler.n();
        TrtcSignalChannel.e();
    }

    public void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742bd58b", new Object[]{this});
        } else {
            s0(new j());
        }
    }

    public synchronized void C0(TrtcDefines.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62e20fd", new Object[]{this, gVar});
        } else {
            j(gVar);
        }
    }

    public void C1(ITrtcInputStream iTrtcInputStream) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243e5d7d", new Object[]{this, iTrtcInputStream});
            return;
        }
        if (this.q != null) {
            str = "TrtcLiveStream";
        } else {
            str = "TrtcLocalStream";
        }
        s0(new n(str, iTrtcInputStream));
    }

    public final /* synthetic */ void D0(TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1d881d", new Object[]{this, trtcCancelCallParams});
        } else {
            nativeCancelCall(trtcCancelCallParams);
        }
    }

    public void D1(TrtcConfig trtcConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecde3438", new Object[]{this, trtcConfig});
            return;
        }
        kju kjuVar = new kju();
        kjuVar.c = trtcConfig.getAppKey();
        kjuVar.f22712a = trtcConfig.getUserId();
        kjuVar.b = trtcConfig.getDeviceId();
        try {
            if (NativeLibrary.isLoaded()) {
                kjuVar.d = nativeGetVersion();
            }
        } catch (Throwable th) {
            TrtcLog.i("TrtcEngine", "native load error: " + th.getMessage());
            kjuVar.d = "unkown";
        }
        kjuVar.e = trtcConfig.getServerName();
        tmu.j(kjuVar);
    }

    public final /* synthetic */ void E0(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb2e34", new Object[]{this, map});
        } else {
            nativeCustomUt(JSON.toJSONString(map), true, true);
        }
    }

    public void E1(TrtcDefines.TrtcWorkMode trtcWorkMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb4b3d5", new Object[]{this, trtcWorkMode});
        } else {
            this.e = trtcWorkMode;
        }
    }

    public final /* synthetic */ void F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6ff49e", new Object[]{this, str});
        } else {
            nativeCustomUt(str, false, false);
        }
    }

    public final /* synthetic */ void G0(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ed187", new Object[]{this, new Boolean(z), str});
        } else {
            nativeMuteAudio(false, z, "", str);
        }
    }

    public final /* synthetic */ void H0(ArrayList arrayList, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a92c79", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
        } else {
            nativeMuteRemoteAudio(arrayList, z, z2);
        }
    }

    public final /* synthetic */ void I0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef2f209", new Object[]{this, new Boolean(z)});
        } else {
            nativeMuteAudio(true, z, "", "");
        }
    }

    public final /* synthetic */ void J0(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bb094", new Object[]{this, str, str2, str3});
        } else {
            nativeSendChannelBroadcastMsg(str, str2, str3);
        }
    }

    public final /* synthetic */ void K0(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a106913", new Object[]{this, str, str2, str3, str4});
        } else {
            nativeSendCustomMessage(str, str2, str3, str4);
        }
    }

    public final /* synthetic */ void L0(TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8ec8fa", new Object[]{this, trtcLocalVideoFreezeInfo});
        } else {
            nativeSetLocalVideoFreeze(trtcLocalVideoFreezeInfo);
        }
    }

    public final /* synthetic */ void M0(TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d530375", new Object[]{this, trtcRemoteVideoFreezeParams});
        } else {
            nativeSetRemoteVideoFreeze(trtcRemoteVideoFreezeParams);
        }
    }

    public final /* synthetic */ void N0(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96ccee", new Object[]{this, trtcVideoLayoutParams});
            return;
        }
        TrtcLog.j("TrtcEngine", "native send video layout");
        nativeSetVideoLayout(trtcVideoLayoutParams);
    }

    public void P0(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149b34e3", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (this.g == null) {
            TrtcLog.i("TrtcEngine", "mute remote audio error");
        }
        tmu.f("TrtcEngine", "mute remote id: " + str + ", mute: " + z);
        s0(new Runnable() { // from class: tb.pju
            @Override // java.lang.Runnable
            public final void run() {
                TrtcEngineImpl.this.G0(z, str);
            }
        });
    }

    public synchronized void Q0(final ArrayList<String> arrayList, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47bfb8c", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
        } else if (k0("muteRemoteAudio")) {
            if (arrayList != null && !arrayList.isEmpty()) {
                s0(new Runnable() { // from class: tb.rju
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrtcEngineImpl.this.H0(arrayList, z, z2);
                    }
                });
                return;
            }
            TrtcLog.i("TrtcEngine", "muteRemoteAudio error, remoteStreamIdList is null or remoteStreamIdList is empty.");
        }
    }

    public void R0(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6736f618", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.g == null) {
            TrtcLog.i("TrtcEngine", "mute local audio error");
        }
        tmu.f("TrtcEngine", "mute local: " + z);
        s0(new Runnable() { // from class: tb.wju
            @Override // java.lang.Runnable
            public final void run() {
                TrtcEngineImpl.this.I0(z);
            }
        });
    }

    public synchronized ITrtcCallInterface.a S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.a) ipChange.ipc$dispatch("a97c793d", new Object[]{this});
        }
        return new a.C0784a(this);
    }

    public synchronized ITrtcCallInterface.b T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.b) ipChange.ipc$dispatch("222d2bbd", new Object[]{this});
        }
        return new a.b(this);
    }

    public synchronized ITrtcCallInterface.c U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.c) ipChange.ipc$dispatch("42ff1dd", new Object[]{this});
        }
        return new a.c(this);
    }

    public synchronized ITrtcCallInterface.d V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallInterface.d) ipChange.ipc$dispatch("a0060ebd", new Object[]{this});
        }
        return new a.d(this);
    }

    public com.taobao.trtc.api.b X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.b) ipChange.ipc$dispatch("f16cb3e6", new Object[]{this});
        }
        return new com.taobao.trtc.impl.f(this);
    }

    public final void Y0(TrtcInnerDefines.ChannelNotifyAction channelNotifyAction, TrtcDefines.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3462279f", new Object[]{this, channelNotifyAction, mVar});
            return;
        }
        if (k0("notifyChannel, action: " + channelNotifyAction)) {
            tmu.f("TrtcEngine", "API - notifyChannel, action: " + channelNotifyAction + ", id: " + mVar.f13887a + ", remoteUserId:" + mVar.b + ", a: " + mVar.c + ", v: " + mVar.d);
            s0(new e(mVar, channelNotifyAction));
        }
    }

    public void Z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f12cc8", new Object[]{this, str});
            return;
        }
        tmu.f("TrtcEngine", "Call destory, remote user id: " + str);
        this.u.set(false);
        this.p = TrtcDefines.TrtcMixMode.MIX_LOCAL;
        h0().b(str);
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.stopSubCapture();
        }
        g1(str);
    }

    @Override // com.taobao.trtc.api.c
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcad445", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcDefines.m mVar = new TrtcDefines.m();
        mVar.f13887a = str;
        mVar.b = str2;
        mVar.e = str3;
        mVar.c = true;
        mVar.d = false;
        Y0(TrtcInnerDefines.ChannelNotifyAction.E_CANCEL_INVITE, mVar);
    }

    public void a1(String str, boolean z) {
        ITrtcInputStream iTrtcInputStream;
        TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11635ec3", new Object[]{this, str, new Boolean(z)});
            return;
        }
        tmu.f("TrtcEngine", "Call setup, remote user id: " + str + ", mixMode: " + this.p);
        this.u.set(true);
        h0().f(str, TrtcInnerDefines.CallState.E_CALL_SETUP);
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.n(str);
            this.f.q(this.p);
        }
        if (!z || (trtcMakeCallParams = this.r) == null) {
            TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams = this.s;
            if (trtcAnswerCallParams != null) {
                iTrtcInputStream = trtcAnswerCallParams.inputStream;
            } else {
                TrtcLog.i("TrtcEngine", "Call setup , but can not get cached call params");
                return;
            }
        } else {
            iTrtcInputStream = trtcMakeCallParams.inputStream;
        }
        nlu nluVar = this.j;
        if (nluVar != null) {
            String streamId = iTrtcInputStream.streamId();
            if (this.p != TrtcDefines.TrtcMixMode.MIX_LOCAL) {
                z2 = false;
            }
            nluVar.l(streamId, z2);
        }
    }

    public void b1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a89c37a", new Object[]{this, new Boolean(z)});
            return;
        }
        bju bjuVar = this.g;
        if (bjuVar != null) {
            bjuVar.j(z);
        }
    }

    public void c1(TrtcDefines.TrtcMixMode trtcMixMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49108c2", new Object[]{this, trtcMixMode});
            return;
        }
        this.p = trtcMixMode;
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.q(trtcMixMode);
        }
    }

    @Override // com.taobao.trtc.api.c
    public synchronized String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad0057e8", new Object[]{this, str});
        }
        String nativeCreateChannelId = nativeCreateChannelId(str);
        tmu.f("TrtcEngine", "API - Create channel id: " + nativeCreateChannelId);
        return nativeCreateChannelId;
    }

    public synchronized void d1(TrtcDefines.i iVar, TrtcDefines.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9847c168", new Object[]{this, iVar, oVar});
            return;
        }
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.p(iVar, oVar);
        }
    }

    @Override // com.taobao.trtc.api.c
    public synchronized ITrtcInputStream e(String str, TrtcStreamConfig trtcStreamConfig, ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("864082c9", new Object[]{this, str, trtcStreamConfig, aVar});
        } else if (!k0("createInputStream")) {
            return null;
        } else {
            tmu.f("TrtcEngine", "API - createInputStream, id: " + str);
            return this.f.c(str, trtcStreamConfig, aVar);
        }
    }

    public void e1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96832b", new Object[]{this, str});
            return;
        }
        tmu.f("TrtcEngine", "API - registeUser: " + str);
        TrtcAccsHandler.b(str);
    }

    @Override // com.taobao.trtc.api.c
    public synchronized ITrtcOutputStream f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcOutputStream) ipChange.ipc$dispatch("f44cc86c", new Object[]{this, str});
        }
        return m0(str);
    }

    public synchronized boolean f0(TrtcInnerDefines.TrtcAnswerCallParams trtcAnswerCallParams) {
        boolean z;
        com.taobao.trtc.impl.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("121c3452", new Object[]{this, trtcAnswerCallParams})).booleanValue();
        }
        if (!k0("answerCall")) {
            return false;
        }
        String str = trtcAnswerCallParams.remoteUserId;
        if (trtcAnswerCallParams.answerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        tmu.f("TrtcEngine", "API answer call, params: " + com.taobao.trtc.impl.a.d(trtcAnswerCallParams));
        if (trtcAnswerCallParams.extension == null) {
            trtcAnswerCallParams.extension = "";
        }
        if (!(this.g == null || trtcAnswerCallParams.audioTransProfile == TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal())) {
            this.g.k(this.x);
        }
        if (!z) {
            Z0(str);
            if (!this.u.get() && (eVar = this.f) != null) {
                eVar.stopSubCapture();
                q1(false);
            }
        } else if (trtcAnswerCallParams.inputStream != null || trtcAnswerCallParams.videoTransProfile == TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
            if (trtcAnswerCallParams.videoTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                TrtcInputStreamImpl.o(trtcAnswerCallParams.inputStream, true);
            }
            h0().f(str, TrtcInnerDefines.CallState.E_CALL_SETUP);
        } else {
            TrtcLog.i("TrtcEngine", "answer call error, enable video but no input stream");
            h0().b(str);
            return false;
        }
        this.s = trtcAnswerCallParams;
        s0(new g(trtcAnswerCallParams));
        return true;
    }

    public synchronized void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8f7afc", new Object[]{this});
        } else {
            tmu.f("TrtcEngine", "API - releaseMediaProcessor");
        }
    }

    @Override // com.taobao.trtc.api.c
    public synchronized TrtcAudioDevice g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcAudioDevice) ipChange.ipc$dispatch("c7f8fe93", new Object[]{this});
        }
        k0("getAudioDevice");
        return this.g;
    }

    public void g0(String str, String str2, TrtcDefines.TrtcAnswerType trtcAnswerType, String str3) {
        TrtcInnerDefines.ChannelNotifyAction channelNotifyAction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791e764e", new Object[]{this, str, str2, trtcAnswerType, str3});
            return;
        }
        if (trtcAnswerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE) {
            channelNotifyAction = TrtcInnerDefines.ChannelNotifyAction.E_AGREE;
        } else {
            channelNotifyAction = TrtcInnerDefines.ChannelNotifyAction.E_DISAGREE;
        }
        TrtcDefines.m mVar = new TrtcDefines.m();
        mVar.f13887a = str;
        mVar.b = str2;
        mVar.e = str3;
        mVar.c = true;
        mVar.d = false;
        Y0(channelNotifyAction, mVar);
    }

    public synchronized void g1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df9c4d36", new Object[]{this, str});
        } else if (k0("releaseOutputStreamInternal")) {
            tmu.f("TrtcEngine", "releaseOutputStream, id: " + str);
            this.f.u(str);
        }
    }

    @Override // com.taobao.trtc.api.c
    public synchronized TrtcVideoDevice h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcVideoDevice) ipChange.ipc$dispatch("6d0c9233", new Object[]{this});
        }
        k0("getVideoDevice");
        return this.f;
    }

    public com.taobao.trtc.impl.b h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.impl.b) ipChange.ipc$dispatch("6f53954d", new Object[]{this});
        }
        if (this.o == null) {
            this.o = new com.taobao.trtc.impl.b();
        }
        return this.o;
    }

    @Override // com.taobao.trtc.api.c
    public boolean i(TrtcConfig trtcConfig) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76cb3d7", new Object[]{this, trtcConfig})).booleanValue();
        }
        tmu.f("TrtcEngine", "API - initialize");
        jju.c("initialize()");
        if (trtcConfig != null && omu.h(this, trtcConfig.getServerName())) {
            x1(this.n.k(this.c.config.getServerName()));
        }
        return B0(trtcConfig, false);
    }

    public synchronized boolean i0(final TrtcInnerDefines.TrtcCancelCallParams trtcCancelCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a9d67d2", new Object[]{this, trtcCancelCallParams})).booleanValue();
        } else if (!k0("cancelCall")) {
            return false;
        } else {
            tmu.f("TrtcEngine", "API - cancel call, params: " + com.taobao.trtc.impl.a.e(trtcCancelCallParams));
            Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = trtcCancelCallParams.userInfos.iterator();
            while (it.hasNext()) {
                h0().b(it.next().userId);
            }
            s0(new Runnable() { // from class: tb.tju
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.this.D0(trtcCancelCallParams);
                }
            });
            return true;
        }
    }

    public final boolean j0(TrtcDefines.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a768a7c8", new Object[]{this, gVar})).booleanValue();
        }
        String str = gVar.b;
        if (str == null) {
            str = "";
        }
        gVar.b = str;
        if (TextUtils.isEmpty(gVar.f13881a)) {
            TrtcLog.i("TrtcEngine", "checkParams error, channel id is empty");
            return false;
        } else if (!gVar.e || gVar.c != null) {
            return true;
        } else {
            TrtcLog.i("TrtcEngine", "checkParams error, no input stream but video enabled");
            return false;
        }
    }

    public lmu j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lmu) ipChange.ipc$dispatch("c7d97092", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.taobao.trtc.api.c
    public synchronized void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6182067", new Object[]{this, str, str2});
        } else {
            l(str, str2, 0);
        }
    }

    public synchronized void k1(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e35e60", new Object[]{this, str, str2, str3});
        } else if (k0("sendChannelBroadcastMsg")) {
            tmu.f("TrtcEngine", "API - sendChannelBroadcastMsg, id: " + str);
            if (!(str == null || str2 == null)) {
                s0(new Runnable() { // from class: tb.mju
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrtcEngineImpl.this.J0(str, str2, str3);
                    }
                });
                return;
            }
            TrtcLog.j("TrtcEngine", "channelId is empty or message is empty");
        }
    }

    public void l0(olu oluVar, plu pluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8244204", new Object[]{this, oluVar, pluVar});
            return;
        }
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.b(oluVar, pluVar);
        } else {
            TrtcLog.i("TrtcEngine", "create external stream error");
        }
    }

    public synchronized void l1(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916f195d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (!(str == null || str2 == null || !k0("sendCustomMessage"))) {
            tmu.f("TrtcEngine", "API - sendCustomMessage, remote id:" + str + ", len:" + str2.length());
            s0(new Runnable() { // from class: tb.nju
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.this.K0(str, str2, str3, str4);
                }
            });
        }
    }

    @Override // com.taobao.trtc.api.c
    public void m(TrtcDefines.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d69e8a", new Object[]{this, mVar});
        } else {
            Y0(TrtcInnerDefines.ChannelNotifyAction.E_INVITE, mVar);
        }
    }

    public synchronized emu m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emu) ipChange.ipc$dispatch("54a8d9ee", new Object[]{this, str});
        } else if (!k0("createOutputStreamInternal")) {
            return null;
        } else {
            tmu.f("TrtcEngine", "createOutputStream, id: " + str);
            return this.f.d(str);
        }
    }

    public void m1(String str, TrtcDefines.f fVar) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a870c645", new Object[]{this, str, fVar});
        } else if (fVar == null || (bArr = fVar.f13880a) == null) {
            TrtcLog.i("TrtcEngine", "sendData, var error");
        } else {
            nativeSendData(str, bArr, fVar.b);
        }
    }

    @Override // com.taobao.trtc.api.c
    public synchronized void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabed7b4", new Object[]{this, str});
        } else if (!k0("releaseInputStream")) {
            TrtcLog.i("TrtcEngine", "trtc engine need initialize success first");
        } else {
            tmu.f("TrtcEngine", "API - releaseInputStream, id: " + str);
            this.x.post(new m(str));
        }
    }

    public void n0(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99112a5", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            t0(new Runnable() { // from class: tb.sju
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.this.E0(map);
                }
            });
        }
    }

    public synchronized void n1(ITrtcObserver.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7ff221", new Object[]{this, dVar});
        } else if (k0("setCustomMessageObserver")) {
            TrtcLog.j("TrtcEngine", "set custom msg observer: " + dVar);
            com.taobao.trtc.impl.c cVar = this.h;
            if (cVar != null) {
                cVar.M(dVar);
            }
        }
    }

    @Override // com.taobao.trtc.api.c
    public synchronized void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c45e19", new Object[]{this, str});
        } else {
            g1(str);
        }
    }

    public void o0(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52630226", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            t0(new Runnable() { // from class: tb.vju
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.this.F0(str);
                }
            });
        }
    }

    public void o1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdad628", new Object[]{this, new Boolean(z)});
        } else {
            this.u.set(z);
        }
    }

    public void onAudioFrame(WebRtcExtProcessAudioFrame webRtcExtProcessAudioFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffaf422", new Object[]{this, webRtcExtProcessAudioFrame});
            return;
        }
        bju bjuVar = this.g;
        if (bjuVar != null) {
            bjuVar.i(webRtcExtProcessAudioFrame);
        }
    }

    public void onData(String str, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543e2ce2", new Object[]{this, str, bArr, new Integer(i2)});
            return;
        }
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.o(str, bArr, i2);
        }
    }

    public Object[] onGetIPFromHttpDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("ed5656eb", new Object[]{this, str});
        }
        return slu.c(str);
    }

    public void onNativeEvent(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cad8842", new Object[]{this, new Integer(i2), str});
            return;
        }
        com.taobao.trtc.impl.c cVar = this.h;
        if (cVar != null) {
            cVar.c(i2, str);
        }
    }

    public void onSei(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa76013", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("TrtcEngine", "recv sei, id: " + str + ", len: " + str2.length());
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.r(str, str2);
        }
    }

    public void onVideoFrame(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37b7b36", new Object[]{this, str, videoFrame});
            return;
        }
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.s(str, videoFrame);
        }
    }

    public void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20499eae", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcEngine", "API - enableBeauty: " + z);
        com.taobao.trtc.impl.e eVar = this.f;
        if (eVar != null) {
            eVar.enableBeauty(z);
        }
    }

    public void q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e03d47b", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcEngine", "API - enableSpeakerphone: " + z);
        bju bjuVar = this.g;
        if (bjuVar != null) {
            bjuVar.enableSpeakerphone(z);
        }
    }

    public synchronized void q1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b6263b", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public TrtcInnerConfig r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInnerConfig) ipChange.ipc$dispatch("5aa578f", new Object[]{this});
        }
        return this.c;
    }

    public final void s0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            nf.g(runnable, 0L);
        }
    }

    public final void t0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348ef2aa", new Object[]{this, runnable});
        } else {
            nf.h(runnable);
        }
    }

    public boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf45d424", new Object[]{this})).booleanValue();
        }
        return this.u.get();
    }

    public String v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d3bed9e", new Object[]{this});
        }
        return this.v;
    }

    public TrtcStreamProcessorImpl v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcStreamProcessorImpl) ipChange.ipc$dispatch("e1a706c7", new Object[]{this});
        }
        return null;
    }

    public synchronized boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b601fc59", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public String x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        TrtcConfig trtcConfig = this.c.config;
        if (trtcConfig != null) {
            return trtcConfig.getUserId();
        }
        return "";
    }

    public synchronized boolean y0(TrtcInnerDefines.TrtcHangUpCallParams trtcHangUpCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("171d2932", new Object[]{this, trtcHangUpCallParams})).booleanValue();
        } else if (!k0("hangUpCall")) {
            return false;
        } else {
            tmu.f("TrtcEngine", "API - hangup call, params: " + com.taobao.trtc.impl.a.f(trtcHangUpCallParams));
            Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = trtcHangUpCallParams.userInfos.iterator();
            while (it.hasNext()) {
                TrtcInnerDefines.TrtcCallUserInfo next = it.next();
                Z0(next.userId);
                if (!trtcHangUpCallParams.isMultiChatMode) {
                    this.u.set(false);
                    h0().b(this.v);
                    h().stopSubCapture();
                }
                if (trtcHangUpCallParams.isMultiChatMode && next.userId == this.v) {
                    this.u.set(false);
                    q1(false);
                    h().stopSubCapture();
                    h0().a();
                }
            }
            s0(new h(trtcHangUpCallParams));
            return true;
        }
    }

    public final void y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e28f7ae", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcEngine", "engine sync unInitialize run");
        nativeUnInitialize();
    }

    public boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1051c2e", new Object[]{this})).booleanValue();
        }
        return this.u.get();
    }

    public void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49623c8", new Object[]{this});
            return;
        }
        tmu.f("TrtcEngine", "API - unRegisteUser: " + r0().config.getUserId());
        TrtcAccsHandler.p();
    }

    public final void B1(TrtcConfig trtcConfig) {
        String str;
        TrtcLog.j("TrtcEngine", "updateInnerConfig");
        TrtcInnerConfig trtcInnerConfig = this.c;
        trtcInnerConfig.config = trtcConfig;
        trtcInnerConfig.isEnvOnline = trtcConfig.getEnvironment() == 0;
        TrtcDefines.TrtcWorkMode workMode = trtcConfig.getWorkMode();
        this.e = workMode;
        if (workMode == TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_UNKOWN) {
            TrtcDefines.TrtcWorkMode trtcWorkMode = TrtcDefines.TrtcWorkMode.E_TRTC_WORK_MODE_LIVE;
            this.e = trtcWorkMode;
            trtcConfig.setWorkMode(trtcWorkMode);
            TrtcLog.i("TrtcEngine", "engine initialize, set to default work mode: " + this.e);
        }
        if (TextUtils.isEmpty(trtcConfig.getDeviceId())) {
            trtcConfig.setDeviceId(UTDevice.getUtdid(rlu.f27461a));
            TrtcLog.j("TrtcEngine", "Get deviceId: " + trtcConfig.getDeviceId());
        }
        if (TextUtils.isEmpty(trtcConfig.getRegId())) {
            try {
                trtcConfig.setRegId((String) ACCSClient.class.getMethod("getRegId", Context.class).invoke(null, rlu.f27461a));
            } catch (Throwable unused) {
            }
        }
        Context context = rlu.f27461a;
        lmu lmuVar = this.b;
        trtcInnerConfig.networkType = lmuVar.f(context);
        trtcInnerConfig.osVersion = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        trtcInnerConfig.model = str2;
        TelephonyManager telephonyManager = (TelephonyManager) rlu.f27461a.getSystemService("phone");
        if (telephonyManager != null && !TextUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            trtcInnerConfig.carriers = telephonyManager.getNetworkOperatorName();
        }
        String a2 = SystemProperties.a("ro.board.platform");
        if (a2 != null) {
            trtcInnerConfig.board = a2;
        }
        D1(trtcConfig);
        pr3 c2 = lmuVar.c();
        if (c2 != null) {
            if (TextUtils.isEmpty(c2.id)) {
                str = "";
            } else {
                str = c2.id;
            }
            trtcInnerConfig.chipset = str;
            tmu.f("TrtcEngine", "\"Brand\":\"" + Build.BRAND + "\",\"Model\":\"" + str2 + "\",\"UserId\":\"" + trtcInnerConfig.config.getUserId() + "\",\"DeviceInfo\":" + JSON.toJSONString(c2));
        }
        if (!TextUtils.isEmpty(trtcConfig.getRegId())) {
            tmu.f("TrtcEngine", "accs regId: " + trtcConfig.getRegId());
        }
        trtcInnerConfig.orangeConfigs = cmu.c();
        if (this.w != null || trtcConfig.isChatroom()) {
            TrtcLog.j("TrtcEngine", "not use hw decoder, isChatroom: " + trtcConfig.isChatroom());
            return;
        }
        vlu vluVar = new vlu();
        this.w = vluVar;
        vluVar.g();
        vlu.a f2 = this.w.f(j3.m);
        if (f2 != null) {
            trtcInnerConfig.hwH264DecodeEnable = true;
            trtcInnerConfig.hwH264DecoderName = f2.f30095a;
            if (!((HashMap) f2.b).isEmpty()) {
                trtcInnerConfig.hwH264DecodeLowLatencyConfigStr = JSON.toJSONString(f2.b);
            }
            TrtcLog.j("TrtcEngine", "hw_decoder: " + trtcInnerConfig.hwH264DecoderName + ", config: " + trtcInnerConfig.hwH264DecodeLowLatencyConfigStr + ", CPU : " + vlu.b());
        }
        vlu.a f3 = this.w.f("video/hevc");
        if (f3 != null) {
            trtcInnerConfig.hwH265DecodeEnable = true;
            trtcInnerConfig.hwH265DecoderName = f3.f30095a;
            if (!((HashMap) f3.b).isEmpty()) {
                trtcInnerConfig.hwH265DecodeLowLatencyConfigStr = JSON.toJSONString(f3.b);
            }
            TrtcLog.j("TrtcEngine", "hw_decoder: " + trtcInnerConfig.hwH265DecoderName + ", config: " + trtcInnerConfig.hwH265DecodeLowLatencyConfigStr + ", CPU : " + vlu.b());
        }
    }

    public final void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ea3b3c", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcEngine", "releaseResource");
        this.b.i();
        f1();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            try {
                i1();
            } catch (Exception e2) {
                tmu.f("TrtcEngine", "release source on main error: " + e2.getMessage());
            }
        } else {
            this.x.sendEmptyMessage(0);
        }
    }

    public final void i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa151fd4", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcEngine", "releaseResourceOnMain");
        TrtcPhoneStats trtcPhoneStats = this.i;
        if (trtcPhoneStats != null) {
            trtcPhoneStats.d();
            this.i = null;
        }
        this.g.j(false);
        this.g.c();
        this.f.e();
        TrtcLog.j("TrtcEngine", "releaseResourceOnMain done");
    }

    @Override // com.taobao.trtc.api.c
    public synchronized void j(TrtcDefines.g gVar) {
        bju bjuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebcd3c8c", new Object[]{this, gVar});
            return;
        }
        tmu.f("TrtcEngine", "API - join channel id: " + gVar.f13881a);
        if (k0("joinChannel")) {
            tmu.f("TrtcEngine", "joinChannel, id: " + gVar.f13881a + ", extInfo: " + gVar.b);
            if (j0(gVar)) {
                if (gVar.d && (bjuVar = this.g) != null) {
                    bjuVar.k(this.x);
                }
                if (gVar.e) {
                    TrtcInputStreamImpl.o(gVar.c, true);
                }
                this.t = gVar;
                s0(new c());
            }
        }
    }

    @Override // com.taobao.trtc.api.c
    public void l(String str, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcec5f7c", new Object[]{this, str, str2, new Integer(i2)});
        } else if (k0("leaveChannel")) {
            tmu.f("TrtcEngine", "API - leaveChannel, id: " + str + ", code: " + i2);
            TrtcDefines.g gVar = this.t;
            if (gVar == null) {
                TrtcLog.j("TrtcEngine", "no need process this leave channel, id: " + str);
                return;
            }
            if (gVar.e) {
                TrtcInputStreamImpl.o(gVar.c, false);
            }
            this.t = null;
            h0().a();
            s0(new d(str, i2, str2));
        }
    }

    @Override // com.taobao.trtc.api.c
    public void p() throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f946ca", new Object[]{this});
            return;
        }
        tmu.f("TrtcEngine", "API - unInitiaEngine");
        jju.c("unInitiaEngine()");
        x1(true);
    }

    @Override // com.taobao.trtc.api.c
    public void q() throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f349e310", new Object[]{this});
            return;
        }
        tmu.f("TrtcEngine", "API - unInitialize");
        jju.c("unInitialize()");
        x1(false);
    }

    public synchronized boolean s1(final TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786e7832", new Object[]{this, trtcVideoLayoutParams})).booleanValue();
        }
        tmu.f("TrtcEngine", "API - setVideoLayout: " + com.taobao.trtc.impl.f.h(trtcVideoLayoutParams));
        if (this.f != null && this.p == TrtcDefines.TrtcMixMode.MIX_LOCAL) {
            TrtcLog.j("TrtcEngine", "local mix, set layout to video process");
            this.f.v(trtcVideoLayoutParams);
        }
        s0(new Runnable() { // from class: tb.qju
            @Override // java.lang.Runnable
            public final void run() {
                TrtcEngineImpl.this.N0(trtcVideoLayoutParams);
            }
        });
        return true;
    }

    public synchronized void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f2995", new Object[]{this});
            return;
        }
        tmu.f("TrtcEngine", "API - stop live");
        if (k0("stopLive") && this.q != null) {
            tmu.f("TrtcEngine", "stop live");
            this.h.b(false);
            if (this.g != null) {
                this.q.getClass();
                this.g.l(this.x);
            }
            TrtcDefines.h hVar = this.q;
            if (hVar != null) {
                TrtcInputStreamImpl.o(hVar.e, false);
            }
            this.q = null;
            this.u.set(false);
            com.taobao.trtc.impl.b bVar = this.o;
            if (bVar != null) {
                bVar.a();
                this.o = null;
            }
            s0(new b());
        }
    }

    public synchronized void x1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3cdc207", new Object[]{this, new Boolean(z)});
        } else if (!this.d.get()) {
            TrtcLog.i("TrtcEngine", "no need uninitialize");
        } else {
            tmu.f("TrtcEngine", "trtc unInitialize start");
            if (!z) {
                this.n.u(this.c.config.getServerName());
            } else {
                this.n.r(this.c.config.getServerName(), false);
            }
            q1(false);
            com.taobao.trtc.impl.b bVar = this.o;
            if (bVar != null) {
                bVar.a();
                this.o = null;
            }
            this.u.set(false);
            h1();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s0(new l());
            this.k.b(0, 3000);
            cmu.a();
            this.h = null;
            this.j = null;
            this.w = null;
            nf.u();
            this.d.set(false);
            tmu.f("TrtcEngine", "trtc unInitialize done, elapsed: " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/impl/TrtcEngineImpl$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                TrtcEngineImpl.D(TrtcEngineImpl.this);
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AtomicBoolean X = TrtcEngineImpl.X(TrtcEngineImpl.this);
                        if (TrtcEngineImpl.P(TrtcEngineImpl.this).get() == 0) {
                            z = false;
                        }
                        X.set(z);
                        tmu.f("TrtcEngine", "trtc natiave initialize done, native engine: 0x" + Long.toHexString(TrtcEngineImpl.P(TrtcEngineImpl.this).get()));
                        TrtcEngineImpl.Z(TrtcEngineImpl.this, new TrtcPhoneStats(rlu.f27461a, TrtcEngineImpl.a0(TrtcEngineImpl.this)));
                        TrtcEngineImpl.Y(TrtcEngineImpl.this).c();
                        if (TrtcEngineImpl.b0(TrtcEngineImpl.this) != null) {
                            TrtcEngineImpl.b0(TrtcEngineImpl.this).a(TrtcEngineImpl.X(TrtcEngineImpl.this).get());
                        }
                    }
                } else if (TrtcEngineImpl.E(TrtcEngineImpl.this) != null) {
                    TrtcEngineImpl.E(TrtcEngineImpl.this).l(null);
                }
            } else if (TrtcEngineImpl.E(TrtcEngineImpl.this) != null) {
                TrtcEngineImpl.E(TrtcEngineImpl.this).k(null);
            }
        }
    }

    public final synchronized boolean B0(TrtcConfig trtcConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd7654a8", new Object[]{this, trtcConfig, new Boolean(z)})).booleanValue();
        }
        if (!(rlu.f27461a == null || trtcConfig == null)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.d.get()) {
                TrtcLog.i("TrtcEngine", "engine already initialized");
            }
            nf.v();
            cmu.g();
            D1(trtcConfig);
            amu.g(cmu.b(rlu.TRTC_ORANGE_DEF_BOOL_ENABLE_AVCODEC_REMOTE_CHECK, true));
            PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(rlu.f27461a).setNativeLibraryName("artc_engine").createInitializationOptions());
            if (!NativeLibrary.isLoaded()) {
                tmu.f("TrtcEngine", "artc native library load error");
                return false;
            }
            this.b.j();
            B1(trtcConfig);
            tmu.f("TrtcEngine", " trtc initialize with config: " + trtcConfig.ToString());
            this.j = new nlu(trtcConfig.getEngineObserver(), trtcConfig.getChannelEventObserver(), trtcConfig.getCallEventObserver(), trtcConfig.getEventHandler());
            if (this.h == null) {
                this.h = new com.taobao.trtc.impl.c(this, this.j);
            }
            bju bjuVar = new bju(this, this.j);
            this.g = bjuVar;
            bjuVar.f();
            this.g.j(true);
            TrtcLog.j("TrtcEngine", "trtc audio device init done");
            this.v = trtcConfig.getUserId();
            com.taobao.trtc.impl.e eVar = new com.taobao.trtc.impl.e(this, this.j);
            this.f = eVar;
            eVar.m();
            TrtcLog.j("TrtcEngine", "trtc video device init done");
            this.u.set(false);
            s0(new k(z, trtcConfig));
            this.d.set(true);
            tmu.f("TrtcEngine", "trtc initialize done, elapsed:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            return true;
        }
        TrtcLog.i("TrtcEngine", "initializeInternal error, var error");
        return false;
    }

    public synchronized boolean O0(TrtcInnerDefines.TrtcMakeCallParams trtcMakeCallParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf08052", new Object[]{this, trtcMakeCallParams})).booleanValue();
        } else if (!k0("makeCall")) {
            return false;
        } else {
            tmu.f("TrtcEngine", "API - make call, params: " + com.taobao.trtc.impl.a.g(trtcMakeCallParams));
            if (trtcMakeCallParams.inputStream != null || trtcMakeCallParams.videoTransProfile == TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                if (!(this.g == null || trtcMakeCallParams.audioTransProfile == TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal())) {
                    this.g.k(this.x);
                }
                if (trtcMakeCallParams.videoTransProfile != TrtcDefines.TrtcMediaTransportProfile.E_MEDIA_INACTIVE.ordinal()) {
                    TrtcInputStreamImpl.o(trtcMakeCallParams.inputStream, true);
                }
                Iterator<TrtcInnerDefines.TrtcCallUserInfo> it = trtcMakeCallParams.userInfos.iterator();
                while (it.hasNext()) {
                    TrtcInnerDefines.TrtcCallUserInfo next = it.next();
                    h0().e(next.userId, TrtcDefines.TrtcUserRole.values()[next.role]);
                }
                this.r = trtcMakeCallParams;
                s0(new f(trtcMakeCallParams));
                return true;
            }
            TrtcLog.i("TrtcEngine", "make call error, enable video but no input stream");
            return false;
        }
    }

    public boolean k0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764ea641", new Object[]{this, str})).booleanValue();
        }
        if (this.d.get()) {
            return true;
        }
        tmu.g("TrtcEngine", "trtc engine need initialize first, api: " + str);
        return false;
    }

    public synchronized void p1(final TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8d68c8", new Object[]{this, trtcLocalVideoFreezeInfo});
            } else if (k0("setLocalVideoFreeze")) {
                if (!cmu.b("chatroomDisablePushVideo", false)) {
                    TrtcLog.j("TrtcEngine", "chatroom can push video");
                    return;
                }
                com.taobao.trtc.impl.e eVar = this.f;
                if (trtcLocalVideoFreezeInfo.sendVideoType != TrtcDefines.TrtcSendVideoType.E_SEND_VIDEO_TYPE_NO_SEND.ordinal()) {
                    z = false;
                }
                eVar.f(z);
                tmu.f("TrtcEngine", "API - set local video freeze, freeze: " + trtcLocalVideoFreezeInfo.freeze + " ,sendVideoType: " + trtcLocalVideoFreezeInfo.sendVideoType);
                s0(new Runnable() { // from class: tb.oju
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrtcEngineImpl.this.L0(trtcLocalVideoFreezeInfo);
                    }
                });
            }
        }
    }

    @Override // com.taobao.trtc.api.c
    public void r(TrtcDefines.g gVar) {
        ITrtcInputStream iTrtcInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5244b46b", new Object[]{this, gVar});
        } else if (k0("updateChannel")) {
            tmu.f("TrtcEngine", "API - updateChannel, id: " + gVar.f13881a);
            if (this.t == null || !j0(gVar)) {
                tmu.g("TrtcEngine", "updateChannel check params error");
                return;
            }
            TrtcDefines.g gVar2 = this.t;
            if (gVar2.d) {
                boolean z = gVar.d;
            }
            boolean z2 = gVar2.e;
            if (z2 && (iTrtcInputStream = gVar2.c) != null && !gVar.e) {
                TrtcInputStreamImpl.o(iTrtcInputStream, false);
            } else if (!z2 && gVar.e) {
                TrtcInputStreamImpl.o(gVar.c, true);
            }
            this.t = gVar;
            C1(gVar.c);
        }
    }

    public synchronized boolean r1(final TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be1da164", new Object[]{this, trtcRemoteVideoFreezeParams})).booleanValue();
        } else if (!k0("setRemoteVideoFreeze")) {
            return false;
        } else {
            tmu.f("TrtcEngine", "API - set remote video freeze, params: " + trtcRemoteVideoFreezeParams.toString());
            s0(new Runnable() { // from class: tb.uju
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcEngineImpl.this.M0(trtcRemoteVideoFreezeParams);
                }
            });
            return true;
        }
    }

    public synchronized boolean t1(TrtcDefines.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3758374c", new Object[]{this, hVar})).booleanValue();
        }
        tmu.f("TrtcEngine", "API - start live, bizId:" + hVar.b + " extInfo: " + hVar.b + " customInfo: " + hVar.d.toString() + " url: " + hVar.f13882a);
        if (!k0("startLive")) {
            return false;
        }
        this.h.b(true);
        if (hVar.e == null) {
            TrtcLog.i("TrtcEngine", "start live error: video enable but no video input set");
            return false;
        }
        this.h.b(true);
        bju bjuVar = this.g;
        if (bjuVar != null) {
            bjuVar.k(this.x);
        }
        TrtcInputStreamImpl.p(hVar.e, true, TrtcDefines.TrtcFrameType.E_FRAME_PRI);
        this.q = hVar;
        s0(new a(hVar));
        return true;
    }
}
