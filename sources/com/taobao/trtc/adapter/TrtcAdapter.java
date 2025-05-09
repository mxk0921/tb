package com.taobao.trtc.adapter;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.ArtcConfig;
import com.taobao.artc.api.ArtcEngine;
import com.taobao.artc.api.ArtcEngineEventHandler;
import com.taobao.artc.api.ArtcException;
import com.taobao.artc.api.ArtcExternalAudioProcess;
import com.taobao.artc.api.ArtcVideoLayout;
import com.taobao.artc.api.IArtcExternalVideoCapturer;
import com.taobao.artc.api.IArtcExternalVideoRender;
import com.taobao.artc.api.IAudioRecordEventHandler;
import com.taobao.artc.internal.ArtcParams;
import com.taobao.common.inspector.DeviceInspector;
import com.taobao.trtc.accs.TrtcAccsHandler;
import com.taobao.trtc.adapter.TrtcAdapter;
import com.taobao.trtc.api.ITrtcCallInterface;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoCapturer;
import tb.aju;
import tb.au2;
import tb.cmu;
import tb.dpm;
import tb.kd0;
import tb.kju;
import tb.nf;
import tb.olu;
import tb.omu;
import tb.plu;
import tb.t2o;
import tb.tmu;
import tb.umu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcAdapter extends ArtcEngine implements ITrtcInputStream.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context d;

    /* renamed from: a  reason: collision with root package name */
    public TrtcEngineImpl f13849a = null;
    public ArtcConfig b = null;
    public String c = "";
    public final ReentrantLock e = new ReentrantLock();
    public VideoCapturer h = null;
    public plu i = null;
    public int k = 720;
    public int l = 1280;
    public int m = 20;
    public final byte[] n = new byte[1024];
    public boolean o = false;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public au2 g = new au2(this);
    public final aju j = new aju(this.g);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13850a;

        public a(String str) {
            this.f13850a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).l = this.f13850a;
                TrtcAdapter.e(TrtcAdapter.this).b("setBroadcast");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13851a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.f13851a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.g(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                au2 e = TrtcAdapter.e(TrtcAdapter.this);
                String str = this.b;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                e.x = str;
                if (TrtcAdapter.h(TrtcAdapter.this).z0()) {
                    TrtcLog.i("TrtcAdapter", "in call, don't joinchannel");
                    return;
                }
                if (TrtcAdapter.e(TrtcAdapter.this).t == null && TrtcAdapter.e(TrtcAdapter.this).i) {
                    TrtcAdapter.e(TrtcAdapter.this).t = TrtcAdapter.h(TrtcAdapter.this).h().startCapture(new TrtcStreamConfig.a().f(TrtcAdapter.e(TrtcAdapter.this).r, TrtcAdapter.e(TrtcAdapter.this).q, TrtcAdapter.e(TrtcAdapter.this).s).b(true).e(true).a());
                }
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                TrtcDefines.g gVar = new TrtcDefines.g();
                gVar.f13881a = this.c;
                if (TrtcAdapter.e(TrtcAdapter.this).n != null) {
                    str2 = TrtcAdapter.e(TrtcAdapter.this).n;
                }
                gVar.b = str2;
                gVar.d = TrtcAdapter.e(TrtcAdapter.this).j;
                gVar.e = TrtcAdapter.e(TrtcAdapter.this).i;
                gVar.c = TrtcAdapter.e(TrtcAdapter.this).t;
                TrtcAdapter.h(TrtcAdapter.this).j(gVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13852a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f13852a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.g(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                au2 e = TrtcAdapter.e(TrtcAdapter.this);
                String str2 = this.b;
                if (str2 == null) {
                    str2 = "";
                }
                e.x = str2;
                if (TrtcAdapter.h(TrtcAdapter.this).z0()) {
                    TrtcLog.i("TrtcAdapter", "in call, don't joinchannel");
                    return;
                }
                if (TrtcAdapter.e(TrtcAdapter.this).t == null && TrtcAdapter.e(TrtcAdapter.this).i) {
                    TrtcAdapter.e(TrtcAdapter.this).t = TrtcAdapter.h(TrtcAdapter.this).h().startCapture(new TrtcStreamConfig.a().f(TrtcAdapter.e(TrtcAdapter.this).r, TrtcAdapter.e(TrtcAdapter.this).q, TrtcAdapter.e(TrtcAdapter.this).s).b(true).e(true).a());
                }
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                TrtcDefines.h hVar = new TrtcDefines.h();
                hVar.d = new HashMap();
                hVar.b = TrtcAdapter.e(TrtcAdapter.this).m;
                hVar.f13882a = TrtcAdapter.e(TrtcAdapter.this).l;
                if (TrtcAdapter.e(TrtcAdapter.this).n != null) {
                    str = TrtcAdapter.e(TrtcAdapter.this).n;
                } else {
                    str = TrtcAdapter.e(TrtcAdapter.this).x;
                }
                hVar.c = str;
                hVar.e = TrtcAdapter.e(TrtcAdapter.this).t;
                if (!TrtcAdapter.h(TrtcAdapter.this).t1(hVar)) {
                    TrtcLog.i("TrtcAdapter", "start live error");
                } else {
                    hVar.e.setStatsObserver(TrtcAdapter.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.g(TrtcAdapter.this) && TrtcAdapter.h(TrtcAdapter.this).h() != null) {
                TrtcAdapter.h(TrtcAdapter.this).h().stopCapture();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13854a;

        public e(boolean z) {
            this.f13854a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                synchronized (TrtcAdapter.e(TrtcAdapter.this)) {
                    TrtcAdapter.e(TrtcAdapter.this).o = this.f13854a;
                    TrtcAdapter.e(TrtcAdapter.this).b("setEnableSpeakerphone");
                }
            } else if (TrtcAdapter.g(TrtcAdapter.this)) {
                TrtcAdapter.h(TrtcAdapter.this).g().enableSpeakerphone(this.f13854a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13855a;

        public f(String str) {
            this.f13855a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).k = this.f13855a;
                TrtcAdapter.e(TrtcAdapter.this).b("registUser");
            } else if (TrtcAdapter.g(TrtcAdapter.this)) {
                TrtcAdapter.h(TrtcAdapter.this).e1(this.f13855a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13856a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public g(boolean z, int i, int i2, String str, String str2, String str3) {
            this.f13856a = z;
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            ITrtcInputStream iTrtcInputStream;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.h(TrtcAdapter.this) != null) {
                TrtcAdapter.h(TrtcAdapter.this).q1(this.f13856a);
                TrtcDefines.g gVar = new TrtcDefines.g();
                if (TrtcAdapter.e(TrtcAdapter.this).h == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
                    if (TrtcAdapter.e(TrtcAdapter.this).u == null) {
                        TrtcAdapter.h(TrtcAdapter.this).h().setSubCaptureParams(cmu.e("multiCallWidth", this.b), cmu.e("multiCallHeight", this.c), cmu.e("multiCallFps", 20));
                        iTrtcInputStream = TrtcAdapter.h(TrtcAdapter.this).h().startSubCapture();
                        TrtcAdapter.e(TrtcAdapter.this).u = iTrtcInputStream;
                    } else {
                        iTrtcInputStream = TrtcAdapter.e(TrtcAdapter.this).u;
                    }
                    gVar.c = iTrtcInputStream;
                }
                gVar.f13881a = this.d;
                gVar.h = this.f13856a;
                gVar.b = this.e;
                gVar.g = this.f;
                TrtcAdapter.h(TrtcAdapter.this).C0(gVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f13857a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ITrtcInputStream e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ int g;
        public final /* synthetic */ String h;

        public h(ArrayList arrayList, int i, String str, String str2, ITrtcInputStream iTrtcInputStream, boolean z, int i2, String str3) {
            this.f13857a = arrayList;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = iTrtcInputStream;
            this.f = z;
            this.g = i2;
            this.h = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ITrtcCallInterface.d V0 = TrtcAdapter.h(TrtcAdapter.this).V0();
            Iterator it = this.f13857a.iterator();
            while (it.hasNext()) {
                V0.b((String) it.next(), TrtcDefines.TrtcUserRole.values()[this.b], this.c, "");
            }
            V0.d(this.d);
            V0.e(this.e).c(this.f).f(this.g).a(this.h).start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13858a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TrtcDefines.TrtcAnswerType c;
        public final /* synthetic */ ITrtcInputStream d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ String f;

        public i(String str, String str2, TrtcDefines.TrtcAnswerType trtcAnswerType, ITrtcInputStream iTrtcInputStream, boolean z, String str3) {
            this.f13858a = str;
            this.b = str2;
            this.c = trtcAnswerType;
            this.d = iTrtcInputStream;
            this.e = z;
            this.f = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcAdapter.h(TrtcAdapter.this).S0().g(this.f13858a, this.b).f(this.c).e(this.d).c(this.e).a(this.f).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f13859a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;

        public j(ArrayList arrayList, String str, boolean z, String str2) {
            this.f13859a = arrayList;
            this.b = str;
            this.c = z;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ITrtcCallInterface.c U0 = TrtcAdapter.h(TrtcAdapter.this).U0();
            Iterator it = this.f13859a.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                U0.b(str, TrtcDefines.TrtcUserRole.values()[TrtcAdapter.h(TrtcAdapter.this).h0().c(str)], "", this.b);
                if (str == TrtcAdapter.this.getUserId()) {
                    TrtcAdapter.e(TrtcAdapter.this).u = null;
                }
            }
            U0.e(this.b);
            U0.c(this.c);
            U0.a(this.d);
            U0.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArtcEngineEventHandler f13860a;

        public k(ArtcEngineEventHandler artcEngineEventHandler) {
            this.f13860a = artcEngineEventHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcAdapter.d(TrtcAdapter.this).V(this.f13860a);
            TrtcAdapter.e(TrtcAdapter.this).c = this.f13860a;
            TrtcLog.j("TrtcAdapter", "cachedInfoHandler.artcEngineEventHandler: " + this.f13860a);
            if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).b("registerHandler");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13861a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TrtcDefines.TrtcAnswerType c;
        public final /* synthetic */ ITrtcInputStream d;

        public l(String str, String str2, TrtcDefines.TrtcAnswerType trtcAnswerType, ITrtcInputStream iTrtcInputStream) {
            this.f13861a = str;
            this.b = str2;
            this.c = trtcAnswerType;
            this.d = iTrtcInputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcAdapter.h(TrtcAdapter.this).S0().g(this.f13861a, this.b).f(this.c).e(this.d).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13862a;
        public final /* synthetic */ String b;

        public m(String str, String str2) {
            this.f13862a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcAdapter.h(TrtcAdapter.this).U0().b(this.f13862a, TrtcDefines.TrtcUserRole.values()[TrtcAdapter.e(TrtcAdapter.this).v], "", this.b).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13863a;
        public final /* synthetic */ String b;

        public n(String str, String str2) {
            this.f13863a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcAdapter.h(TrtcAdapter.this).T0().b(this.f13863a, TrtcDefines.TrtcUserRole.values()[TrtcAdapter.e(TrtcAdapter.this).v], "", this.b).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13864a;
        public final /* synthetic */ boolean b;

        public o(boolean z, boolean z2) {
            this.f13864a = z;
            this.b = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).d = this.f13864a;
                TrtcAdapter.e(TrtcAdapter.this).e = this.b;
                TrtcAdapter.e(TrtcAdapter.this).b("setVideoMirror");
            } else if (TrtcAdapter.g(TrtcAdapter.this)) {
                TrtcAdapter.h(TrtcAdapter.this).h().setVideoMirror(this.f13864a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcAdapter.d(TrtcAdapter.this).V(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).b("setVideoProfile");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13867a;

        public r(boolean z) {
            this.f13867a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (TrtcAdapter.g(TrtcAdapter.this) && TrtcAdapter.h(TrtcAdapter.this) != null) {
                TrtcAdapter.h(TrtcAdapter.this).h().enableTorch(this.f13867a);
            }
            TrtcLog.j("TrtcAdapter", "enableTorch done");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class t implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AConstants.ArtcMediaType f13869a;
        public final /* synthetic */ AConstants.ArtcTransportProfile b;

        public t(AConstants.ArtcMediaType artcMediaType, AConstants.ArtcTransportProfile artcTransportProfile) {
            this.f13869a = artcMediaType;
            this.b = artcTransportProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                TrtcAdapter.e(TrtcAdapter.this).b("setTransportProfile");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class u implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AConstants.ArtcChannelProfile f13870a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        public u(AConstants.ArtcChannelProfile artcChannelProfile, boolean z, boolean z2) {
            this.f13870a = artcChannelProfile;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcAdapter.e(TrtcAdapter.this).h = this.f13870a;
            TrtcAdapter.e(TrtcAdapter.this).i = this.b;
            TrtcAdapter.e(TrtcAdapter.this).j = this.c;
            if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).b("setChannelProfile");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class v implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13871a;

        public v(String str) {
            this.f13871a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcAdapter.e(TrtcAdapter.this).k = this.f13871a;
            if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).b("setUserId");
            }
        }
    }

    static {
        t2o.a(395313348);
        t2o.a(395313388);
    }

    public TrtcAdapter(Context context, DeviceInspector deviceInspector) throws ArtcException {
        TrtcLog.j("TrtcAdapter", "CTOR");
        this.d = context.getApplicationContext();
    }

    public static /* synthetic */ aju d(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aju) ipChange.ipc$dispatch("55f813a1", new Object[]{trtcAdapter});
        }
        return trtcAdapter.j;
    }

    public static /* synthetic */ au2 e(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (au2) ipChange.ipc$dispatch("b5e35f3c", new Object[]{trtcAdapter});
        }
        return trtcAdapter.g;
    }

    public static /* synthetic */ boolean f(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbcfac39", new Object[]{trtcAdapter})).booleanValue();
        }
        return trtcAdapter.s();
    }

    public static /* synthetic */ boolean g(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ebc1598", new Object[]{trtcAdapter})).booleanValue();
        }
        return trtcAdapter.o();
    }

    public static /* synthetic */ TrtcEngineImpl h(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcEngineImpl) ipChange.ipc$dispatch("e34b5235", new Object[]{trtcAdapter});
        }
        return trtcAdapter.f13849a;
    }

    public static /* synthetic */ boolean i(TrtcAdapter trtcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("494e856", new Object[]{trtcAdapter})).booleanValue();
        }
        return trtcAdapter.o;
    }

    public static /* synthetic */ Object ipc$super(TrtcAdapter trtcAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/adapter/TrtcAdapter");
    }

    public static /* synthetic */ boolean j(TrtcAdapter trtcAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("588bb248", new Object[]{trtcAdapter, new Boolean(z)})).booleanValue();
        }
        trtcAdapter.o = z;
        return z;
    }

    private native String nativeGetSdkVersion();

    @Override // com.taobao.artc.api.ArtcEngine
    public void answer(String str, String str2, String str3, int i2, int i3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73b4503", new Object[]{this, str, str2, str3, new Integer(i2), new Integer(i3)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "answer");
        answer2(str, str2, str3, i2, i3, false, "", "");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void answer2(String str, String str2, String str3, int i2, int i3, boolean z, String str4, String str5) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866a5d0f", new Object[]{this, str, str2, str3, new Integer(i2), new Integer(i3), new Boolean(z), str4, str5});
        } else {
            answer2(str, str2, str3, i2, i3, z, str4, str5, 360, 640);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void answerNotifyChannel(String str, String str2, TrtcDefines.TrtcAnswerType trtcAnswerType, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791e764e", new Object[]{this, str, str2, trtcAnswerType, str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "answerNotifyChannel");
        this.f13849a.g0(str, str2, trtcAnswerType, str3);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void call(String str, String str2, int i2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6dbbaa", new Object[]{this, str, str2, new Integer(i2)});
        } else {
            call2(str, str2, i2, 2, "", "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void call2(String str, String str2, int i2, int i3, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ca99e3", new Object[]{this, str, str2, new Integer(i2), new Integer(i3), str3, str4});
        } else {
            call2(str, str2, i2, i3, str3, str4, 360, 640);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void cancelCall(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7803a13", new Object[]{this, str, str2});
        } else {
            cancelCall2(str, str2, "", "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void cancelCall2(String str, String str2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a269de9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TrtcLog.j("TrtcAdapter", "cancelCall2");
        if (o()) {
            k(new n(str2, str4));
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void cancelNotifyChannel(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcad445", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "cancelNotifyChannel");
        this.f13849a.a(str, str2, str3);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void createChannel(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810a83b8", new Object[]{this, str});
        } else {
            createChannel2(str, "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void createChannel2(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90967c6", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("TrtcAdapter", "createChannel2, bizId:" + str + ", opt: " + str2);
        au2 au2Var = this.g;
        au2Var.m = str;
        au2Var.n = str2;
        if (s()) {
            this.g.b("createChannel2");
        } else if (o()) {
            TrtcLog.j("TrtcAdapter", "createChannel2, artcEngineEventHandler: " + this.g.c);
            au2 au2Var2 = this.g;
            ArtcEngineEventHandler artcEngineEventHandler = au2Var2.c;
            if (artcEngineEventHandler != null) {
                artcEngineEventHandler.onCreateChannelSuccess(au2Var2.e());
            } else {
                TrtcLog.j("TrtcAdapter", "createChannel2, artcEngineEventHandler is null");
            }
        }
        TrtcLog.j("TrtcAdapter", "createChannel2 done ");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void customUTPerf(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99112a5", new Object[]{this, map});
            return;
        }
        TrtcEngineImpl trtcEngineImpl = this.f13849a;
        if (trtcEngineImpl != null) {
            trtcEngineImpl.n0(map);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void customUTTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52630226", new Object[]{this, str});
            return;
        }
        TrtcEngineImpl trtcEngineImpl = this.f13849a;
        if (trtcEngineImpl != null) {
            trtcEngineImpl.o0(str);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "enableTorch");
        k(new r(z));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public IArtcExternalVideoCapturer getExternalVideoCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IArtcExternalVideoCapturer) ipChange.ipc$dispatch("af5d6eae", new Object[]{this});
        }
        ArtcConfig artcConfig = this.b;
        if (artcConfig != null && artcConfig.useExternalVideoCapturer().booleanValue()) {
            return (IArtcExternalVideoCapturer) l();
        }
        return null;
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public IArtcExternalVideoRender getExternalVideoRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IArtcExternalVideoRender) ipChange.ipc$dispatch("5958d8c0", new Object[]{this});
        }
        TrtcLog.j("TrtcAdapter", "getExternalVideoRender");
        if (!this.b.useExternalVideoRenderer().booleanValue()) {
            return null;
        }
        return m();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public String getUserId() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        TrtcLog.j("TrtcAdapter", "getUserId");
        if (o()) {
            return this.f13849a.x0();
        }
        return "";
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void initConfig(ArtcConfig artcConfig) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38f1255", new Object[]{this, artcConfig});
            return;
        }
        TrtcLog.j("TrtcAdapter", "initConfig");
        this.b = artcConfig;
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void initialize(ArtcConfig artcConfig) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c65e73", new Object[]{this, artcConfig});
        } else {
            initialize2(artcConfig, "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void initialize2(ArtcConfig artcConfig, String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98378b0f", new Object[]{this, artcConfig, str});
            return;
        }
        try {
            this.e.lock();
            n(artcConfig, str);
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void invite(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97ff424", new Object[]{this, str, str2});
        } else {
            invite2(str, str2, "", "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void joinCall(String str, boolean z, String str2, int i2, int i3, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812d556f", new Object[]{this, str, new Boolean(z), str2, new Integer(i2), new Integer(i3), str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "joinCall, channelId: " + str + " ,isMutliChatMode: " + z + " ,extension: " + str2 + " ,width: " + i2 + " ,height: " + i3);
        if (o()) {
            k(new g(z, i2, i3, str, str2, str3));
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void joinChannel(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afe9e4a", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "joinChannel");
        joinChannel2(str, "", "");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void joinChannel2(String str, String str2, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3be4be", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "joinChannel2");
        k(new b(str3, str2, str));
    }

    public final void k(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            nf.g(runnable, 0L);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void kick(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4433e61", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("TrtcAdapter", "kick");
        kick2(str, str2, "", "");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void kick2(String str, String str2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce1d25b", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TrtcLog.j("TrtcAdapter", "kick2");
        if (o()) {
            this.g.u = null;
            k(new m(str2, str4));
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void kickMutli(ArrayList<String> arrayList, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f36c54", new Object[]{this, arrayList, str, new Boolean(z), str2});
            return;
        }
        TrtcLog.j("TrtcAdapter", "kickMutli");
        if (o()) {
            k(new j(arrayList, str, z, str2));
        }
    }

    public final VideoCapturer l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoCapturer) ipChange.ipc$dispatch("6f2af0b8", new Object[]{this});
        }
        if (this.h == null) {
            this.h = umu.b();
        }
        return this.h;
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void leaveChannel() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4d98d3", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAdapter", "leaveChannel");
        if (o()) {
            leaveChannel2("", "");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void leaveChannel2(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645a9381", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("TrtcAdapter", "leaveChannel2");
        if (o()) {
            if (this.f13849a.z0()) {
                this.f13849a.U0().b(this.g.g, TrtcDefines.TrtcUserRole.values()[this.g.v], "", str2).start();
            }
            this.f13849a.k(this.g.w, str2);
        }
    }

    public final plu m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plu) ipChange.ipc$dispatch("2197df48", new Object[]{this});
        }
        if (this.i == null) {
            plu pluVar = new plu();
            this.i = pluVar;
            pluVar.b();
        }
        return this.i;
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteLocalAudioStream(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc39eee9", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "muteLocalAudioStream");
        if (o() && this.f13849a.g() != null) {
            this.f13849a.g().muteLocal(z);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteLocalVideoStream(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdc0d24", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "muteLocalVideoStream");
        if (o() && this.f13849a.h() != null) {
            this.f13849a.h().muteLocalVideo(z);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteRemoteAudio(ArrayList<String> arrayList, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47bfb8c", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "muteRemoteAudio, remoteStreamIdList: " + arrayList.toString() + " ,mute: " + z + " ,remoteNotify: " + z2);
        if (o()) {
            this.f13849a.Q0(arrayList, z, z2);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteRemoteAudioStream(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e845efd6", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "muteRemoteAudioStream, muted: " + z);
        if (o() && this.f13849a.g() != null) {
            this.f13849a.g().muteRemote("", z);
        }
    }

    public final void n(ArtcConfig artcConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2da49a", new Object[]{this, artcConfig, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "Initialize");
        if (this.f.get()) {
            TrtcLog.i("TrtcAdapter", "already initialized");
            return;
        }
        this.f.set(true);
        this.b = artcConfig;
        if (this.g == null) {
            this.g = new au2(this);
        }
        aju ajuVar = this.j;
        if (ajuVar != null) {
            ajuVar.W(this.g);
        }
        kju kjuVar = new kju();
        kjuVar.c = artcConfig.appkey();
        kjuVar.b = UTDevice.getUtdid(this.d);
        kjuVar.d = artcConfig.sdkVersion;
        kjuVar.f22712a = artcConfig.getLocalUserId();
        kjuVar.e = artcConfig.getServiceName();
        tmu.j(kjuVar);
        if (artcConfig.protocal().equals(TrtcSignalChannel.f13972a)) {
            TrtcEngineImpl.A0(this.d, artcConfig.isCheckAccsConnection(), artcConfig.getLocalUserId(), artcConfig.appkey(), artcConfig.environment(), artcConfig.getAccsCfgTag());
        }
        this.c = "grtn";
        v();
        this.f.set(true);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void notifyChannel(String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4899c6df", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "notifyChannel");
        TrtcDefines.m mVar = new TrtcDefines.m();
        mVar.f13887a = str;
        mVar.b = str2;
        mVar.e = str3;
        mVar.c = z;
        mVar.d = z2;
        this.f13849a.m(mVar);
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6ecddfa", new Object[]{this})).booleanValue();
        }
        if (!this.c.equals("grtn") || this.f13849a == null) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void p(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4887e9", new Object[]{this, bVar});
            return;
        }
        ArtcExternalAudioProcess.AudioFrame audioFrame = new ArtcExternalAudioProcess.AudioFrame();
        bVar.g.get(this.n, 0, bVar.f);
        bVar.g.rewind();
        audioFrame.audio_data = this.n;
        audioFrame.audio_data_len = bVar.f;
        audioFrame.audio_level = bVar.d;
        audioFrame.channels = bVar.b;
        audioFrame.is_speech = bVar.e;
        audioFrame.sample_per_channel = bVar.c;
        audioFrame.sample_rate = bVar.f13873a;
        ArtcConfig artcConfig = this.b;
        if (!(artcConfig == null || artcConfig.externalAudioProcess() == null)) {
            this.b.externalAudioProcess().onTrtcAudioFrame(audioFrame, ArtcExternalAudioProcess.ArtcExtProcessAudioFrameType.E_OBSERVER);
        }
        bVar.g.put(audioFrame.audio_data);
        bVar.g.rewind();
    }

    public final /* synthetic */ void q(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991329c8", new Object[]{this, bVar});
            return;
        }
        ArtcExternalAudioProcess.AudioFrame audioFrame = new ArtcExternalAudioProcess.AudioFrame();
        bVar.g.get(this.n, 0, bVar.f);
        bVar.g.rewind();
        audioFrame.audio_data = this.n;
        audioFrame.audio_data_len = bVar.f;
        audioFrame.audio_level = bVar.d;
        audioFrame.channels = bVar.b;
        audioFrame.is_speech = bVar.e;
        audioFrame.sample_per_channel = bVar.c;
        audioFrame.sample_rate = bVar.f13873a;
        ArtcConfig artcConfig = this.b;
        if (!(artcConfig == null || artcConfig.externalAudioProcess() == null)) {
            this.b.externalAudioProcess().onTrtcAudioFrame(audioFrame, ArtcExternalAudioProcess.ArtcExtProcessAudioFrameType.E_PROCESSOR);
        }
        bVar.g.put(audioFrame.audio_data);
        bVar.g.rewind();
    }

    public final /* synthetic */ void r(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ddcba7", new Object[]{this, bVar});
            return;
        }
        ArtcExternalAudioProcess.AudioFrame audioFrame = new ArtcExternalAudioProcess.AudioFrame();
        bVar.g.get(this.n, 0, bVar.f);
        bVar.g.rewind();
        audioFrame.audio_data = this.n;
        audioFrame.audio_data_len = bVar.f;
        audioFrame.audio_level = bVar.d;
        audioFrame.channels = bVar.b;
        audioFrame.is_speech = bVar.e;
        audioFrame.sample_per_channel = bVar.c;
        audioFrame.sample_rate = bVar.f13873a;
        ArtcConfig artcConfig = this.b;
        if (!(artcConfig == null || artcConfig.externalAudioProcess() == null)) {
            this.b.externalAudioProcess().onTrtcAudioFrame(audioFrame, ArtcExternalAudioProcess.ArtcExtProcessAudioFrameType.E_PLAYER);
        }
        bVar.g.put(audioFrame.audio_data);
        bVar.g.rewind();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void registUser(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9d2832", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "registUser, userId: " + str);
        this.g.k = str;
        k(new f(str));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void registerAccsObserver(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224cf698", new Object[]{this, arrayList});
            return;
        }
        TrtcLog.j("TrtcAdapter", "registerAccsObserver, accsApiList: " + arrayList);
        if (!arrayList.isEmpty()) {
            omu.q(this.d, arrayList);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void registerHandler(ArtcEngineEventHandler artcEngineEventHandler) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9c771a", new Object[]{this, artcEngineEventHandler});
            return;
        }
        TrtcLog.j("TrtcAdapter", "registerHandler: " + artcEngineEventHandler);
        aju ajuVar = this.j;
        if (ajuVar != null) {
            ajuVar.V(artcEngineEventHandler);
        }
        if (this.g == null) {
            this.g = new au2(this);
        }
        this.g.c = artcEngineEventHandler;
        k(new k(artcEngineEventHandler));
    }

    public final synchronized boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f98edf79", new Object[]{this})).booleanValue();
        }
        if (this.g == null) {
            this.g = new au2(this);
        }
        return true ^ this.g.a();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendChannelBroadcastMsg(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e35e60", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "sendChannelBroadcastMsg, channelId: " + str + " ,message: " + str2 + " ,extInfo: " + str3);
        TrtcEngineImpl trtcEngineImpl = this.f13849a;
        if (trtcEngineImpl != null) {
            trtcEngineImpl.k1(str, str2, str3);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendCustomSei(String str, String str2, boolean z) throws ArtcException {
        au2 au2Var;
        ITrtcInputStream iTrtcInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323a595b", new Object[]{this, str, str2, new Boolean(z)});
        } else if (str != null && str2 != null) {
            TrtcLog.j("TrtcAdapter", "sendCustomSei, stream id:" + str + ", withKeyframe:" + z);
            if (o() && (au2Var = this.g) != null) {
                if (!str.equals(au2Var.k) || (iTrtcInputStream = this.g.t) == null) {
                    ITrtcInputStream iTrtcInputStream2 = this.g.u;
                    if (iTrtcInputStream2 != null) {
                        iTrtcInputStream2.inputSei(str2, z);
                        return;
                    }
                    return;
                }
                iTrtcInputStream.inputSei(str2, z);
            }
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendMessage(String str, String str2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b42f67a", new Object[]{this, str, str2});
            return;
        }
        TrtcLog.j("TrtcAdapter", "sendMessage: " + str2);
        if (this.f13849a != null) {
            this.g.getClass();
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setAudioEventHandler(IAudioRecordEventHandler iAudioRecordEventHandler) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2539c55b", new Object[]{this, iAudioRecordEventHandler});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setAudioEventHandler");
        if (o()) {
            this.j.U(iAudioRecordEventHandler);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setBroadcast(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8609dbd0", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setBroadcast");
        k(new a(str));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setChannelProfile(AConstants.ArtcChannelProfile artcChannelProfile, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a337600d", new Object[]{this, artcChannelProfile, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setChannelProfile");
        setChannelProfile(artcChannelProfile, z, true);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setEnableSpeakerphone(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343421b9", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setEnableSpeakerphone, enable:" + z);
        k(new e(z));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setLocalVideoFreeze(TrtcDefines.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c238d00", new Object[]{this, jVar});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setlocalVideoFreeze freeze: " + jVar.f13884a + " ,send type: " + jVar.b);
        k(new s(jVar));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setLocalView(SurfaceViewRenderer surfaceViewRenderer) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415f16a6", new Object[]{this, surfaceViewRenderer});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setLocalView: " + surfaceViewRenderer);
        if (s()) {
            au2 au2Var = this.g;
            au2Var.f = surfaceViewRenderer;
            au2Var.b("setLocalView");
        } else if (o()) {
            this.f13849a.h().setLocalView(surfaceViewRenderer);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setRemoteVideoFreeze(ArrayList<TrtcDefines.p> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d636039", new Object[]{this, arrayList});
        } else if (arrayList.isEmpty()) {
            TrtcLog.i("TrtcAdapter", "setRemoteVideoFreeze, remoteVideoFreezeList is empty.");
        } else {
            TrtcInnerDefines.TrtcRemoteVideoFreezeParams trtcRemoteVideoFreezeParams = new TrtcInnerDefines.TrtcRemoteVideoFreezeParams();
            trtcRemoteVideoFreezeParams.userInfos = new ArrayList<>();
            Iterator<TrtcDefines.p> it = arrayList.iterator();
            while (it.hasNext()) {
                TrtcDefines.p next = it.next();
                trtcRemoteVideoFreezeParams.userInfos.add(new TrtcInnerDefines.TrtcRemoteVideoFreezeInfo(next.f13890a, next.b));
            }
            TrtcEngineImpl trtcEngineImpl = this.f13849a;
            if (trtcEngineImpl != null) {
                trtcEngineImpl.r1(trtcRemoteVideoFreezeParams);
            }
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setRemoteView(SurfaceViewRenderer surfaceViewRenderer) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6efac5", new Object[]{this, surfaceViewRenderer});
        } else {
            setRemoteView(surfaceViewRenderer, "old");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setTransportProfile(AConstants.ArtcMediaType artcMediaType, AConstants.ArtcTransportProfile artcTransportProfile) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3f73bd", new Object[]{this, artcMediaType, artcTransportProfile});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setTransportProfile");
        k(new t(artcMediaType, artcTransportProfile));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setUserId(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setUserId");
        k(new v(str));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoLayout(ArtcVideoLayout artcVideoLayout) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a606e43", new Object[]{this, artcVideoLayout});
        } else {
            setVideoLayout(artcVideoLayout, false);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoMirror(boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30b57d5", new Object[]{this, new Boolean(z)});
        } else if (this.f13849a != null) {
            au2 au2Var = this.g;
            au2Var.e = z;
            au2Var.d = z;
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoProfile(AConstants.ArtcVideoProfile artcVideoProfile, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc4fc5d", new Object[]{this, artcVideoProfile, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setVideoProfile, profile: " + artcVideoProfile + ", landscape: " + z);
        u(artcVideoProfile, z);
        this.g.getClass();
        this.g.getClass();
        au2 au2Var = this.g;
        au2Var.q = this.k;
        au2Var.r = this.l;
        au2Var.s = this.m;
        k(new q());
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void startLive(String str, String str2, String str3) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7361e13", new Object[]{this, str, str2, str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "startLive");
        k(new c(str3, str2));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void startPreview() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
        } else {
            startPreview2("");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void stopLive() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f2995", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAdapter", "leaveChannel2");
        if (o()) {
            if (this.f13849a.h0().d(this.f13849a.v0())) {
                this.f13849a.U0().b(this.g.g, TrtcDefines.TrtcUserRole.values()[this.g.v], "", "").start();
            }
            this.f13849a.u1();
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void stopPreview() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        } else {
            stopPreview2("");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void stopPreview2(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199ea91d", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "stopPreview2");
        k(new d());
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void switchCamera() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46484f80", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAdapter", "switchCamera");
        switchCamera(null);
    }

    public void t(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f1cba4", new Object[]{this, iVar});
            return;
        }
        ArtcEngineEventHandler artcEngineEventHandler = this.g.c;
        if (artcEngineEventHandler != null) {
            artcEngineEventHandler.onTrtcLocalStats(iVar);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unInitialize() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f349e310", new Object[]{this});
        } else {
            unInitialize2("");
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unInitialize2(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f29c41a", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "UnInitialize2");
        try {
            this.e.lock();
            w(str);
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unRegisterHandler() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf744d5", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAdapter", "unRegisterHandler");
        k(new p());
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void unregistUser() throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c945741", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAdapter", "unregistUser");
        if (this.b.protocal().equals(TrtcSignalChannel.f13972a)) {
            TrtcAccsHandler.p();
        }
        if (o()) {
            this.f13849a.z1();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class s implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcDefines.j f13868a;

        public s(TrtcDefines.j jVar) {
            this.f13868a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter trtcAdapter = TrtcAdapter.this;
                if (cmu.b("enablePic", false) && this.f13868a.f13884a) {
                    z = true;
                }
                TrtcAdapter.j(trtcAdapter, z);
                TrtcAdapter.e(TrtcAdapter.this).y = new TrtcInnerDefines.TrtcLocalVideoFreezeInfo(TrtcAdapter.i(TrtcAdapter.this), this.f13868a.b.ordinal());
                TrtcAdapter.e(TrtcAdapter.this).b("setlocalVideoFreeze");
            } else {
                if (TrtcAdapter.g(TrtcAdapter.this)) {
                    TrtcAdapter trtcAdapter2 = TrtcAdapter.this;
                    if (cmu.b("enablePic", false) && this.f13868a.f13884a) {
                        z = true;
                    }
                    TrtcAdapter.j(trtcAdapter2, z);
                    TrtcInnerDefines.TrtcLocalVideoFreezeInfo trtcLocalVideoFreezeInfo = new TrtcInnerDefines.TrtcLocalVideoFreezeInfo(TrtcAdapter.i(TrtcAdapter.this), this.f13868a.b.ordinal());
                    if (TrtcAdapter.h(TrtcAdapter.this) != null) {
                        TrtcAdapter.h(TrtcAdapter.this).p1(trtcLocalVideoFreezeInfo);
                    }
                }
                TrtcLog.j("TrtcAdapter", "setlocalVideoFreeze done");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class w implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArtcVideoLayout f13872a;
        public final /* synthetic */ boolean b;

        public w(ArtcVideoLayout artcVideoLayout, boolean z) {
            this.f13872a = artcVideoLayout;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TrtcAdapter.f(TrtcAdapter.this)) {
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                TrtcAdapter.e(TrtcAdapter.this).getClass();
                TrtcAdapter.e(TrtcAdapter.this).b("setVideoLayout");
            } else if (TrtcAdapter.g(TrtcAdapter.this)) {
                com.taobao.trtc.api.b X0 = TrtcAdapter.h(TrtcAdapter.this).X0();
                ArtcVideoLayout artcVideoLayout = this.f13872a;
                X0.a(artcVideoLayout.bg_width, artcVideoLayout.bg_height);
                int i = this.f13872a.bg_color;
                X0.g((i >> 16) & 255, (i >> 8) & 255, i & 255);
                ArtcVideoLayout artcVideoLayout2 = this.f13872a;
                X0.b(artcVideoLayout2.sub_width, artcVideoLayout2.sub_height);
                for (int i2 = 0; i2 < this.f13872a.desc.size(); i2++) {
                    X0.f(this.f13872a.desc.get(i2).x, this.f13872a.desc.get(i2).y, this.f13872a.desc.get(i2).z, this.f13872a.desc.get(i2).width, this.f13872a.desc.get(i2).height, this.f13872a.desc.get(i2).uid);
                }
                String str = this.f13872a.extension;
                if (str != null) {
                    X0.d(str);
                }
                TrtcDefines.TrtcBackgroundImageType[] values = TrtcDefines.TrtcBackgroundImageType.values();
                ArtcVideoLayout artcVideoLayout3 = this.f13872a;
                X0.e(values[artcVideoLayout3.bg_from_type], artcVideoLayout3.background_imge_url);
                X0.c(this.f13872a.bg_type);
                X0.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    @Override // com.taobao.artc.api.ArtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void answer2(java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, int r17, boolean r18, java.lang.String r19, java.lang.String r20, int r21, int r22) throws com.taobao.artc.api.ArtcException {
        /*
            r12 = this;
            r6 = r12
            r2 = r15
            r0 = r17
            r1 = r21
            r3 = r22
            r4 = 2
            r5 = 1
            com.android.alibaba.ip.runtime.IpChange r7 = com.taobao.trtc.adapter.TrtcAdapter.$ipChange
            boolean r8 = r7 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r8 == 0) goto L_0x0059
            java.lang.Integer r8 = new java.lang.Integer
            r9 = r16
            r8.<init>(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r0)
            java.lang.Boolean r0 = new java.lang.Boolean
            r10 = r18
            r0.<init>(r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r3)
            r3 = 11
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r11 = 0
            r3[r11] = r6
            r3[r5] = r13
            r3[r4] = r14
            r4 = 3
            r3[r4] = r2
            r2 = 4
            r3[r2] = r8
            r2 = 5
            r3[r2] = r9
            r2 = 6
            r3[r2] = r0
            r0 = 7
            r3[r0] = r19
            r0 = 8
            r3[r0] = r20
            r0 = 9
            r3[r0] = r10
            r0 = 10
            r3[r0] = r1
            java.lang.String r0 = "9555b5af"
            r7.ipc$dispatch(r0, r3)
            return
        L_0x0059:
            java.lang.String r7 = "TrtcAdapter"
            java.lang.String r8 = "answer2"
            com.taobao.trtc.utils.TrtcLog.j(r7, r8)
            boolean r7 = r12.o()
            if (r7 == 0) goto L_0x00a7
            tb.au2 r7 = r6.g
            r7.g = r2
            r7.v = r4
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r8 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE
            if (r0 != r5) goto L_0x0074
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r0 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE
        L_0x0072:
            r4 = r0
            goto L_0x007a
        L_0x0074:
            if (r0 != r4) goto L_0x0079
            com.taobao.trtc.api.TrtcDefines$TrtcAnswerType r0 = com.taobao.trtc.api.TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT
            goto L_0x0072
        L_0x0079:
            r4 = r8
        L_0x007a:
            com.taobao.artc.api.AConstants$ArtcChannelProfile r0 = r7.h
            com.taobao.artc.api.AConstants$ArtcChannelProfile r5 = com.taobao.artc.api.AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST
            if (r0 != r5) goto L_0x0097
            com.taobao.trtc.impl.TrtcEngineImpl r0 = r6.f13849a
            com.taobao.trtc.api.TrtcVideoDevice r0 = r0.h()
            r5 = 20
            r0.setSubCaptureParams(r1, r3, r5)
            com.taobao.trtc.impl.TrtcEngineImpl r0 = r6.f13849a
            com.taobao.trtc.api.TrtcVideoDevice r0 = r0.h()
            com.taobao.trtc.api.ITrtcInputStream r0 = r0.startSubCapture()
        L_0x0095:
            r5 = r0
            goto L_0x009a
        L_0x0097:
            com.taobao.trtc.api.ITrtcInputStream r0 = r7.t
            goto L_0x0095
        L_0x009a:
            com.taobao.trtc.adapter.TrtcAdapter$l r7 = new com.taobao.trtc.adapter.TrtcAdapter$l
            r0 = r7
            r1 = r12
            r2 = r15
            r3 = r20
            r0.<init>(r2, r3, r4, r5)
            r12.k(r7)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.adapter.TrtcAdapter.answer2(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, java.lang.String, int, int):void");
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void call2(String str, String str2, int i2, int i3, String str3, String str4, int i4, int i5) throws ArtcException {
        ITrtcInputStream iTrtcInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9a0d83", new Object[]{this, str, str2, new Integer(i2), new Integer(i3), str3, str4, new Integer(i4), new Integer(i5)});
            return;
        }
        au2 au2Var = this.g;
        au2Var.v = i3;
        au2Var.g = str2;
        if (au2Var.h == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
            this.f13849a.h().setSubCaptureParams(i4, i5, 20);
            iTrtcInputStream = this.f13849a.h().startSubCapture();
            this.g.u = iTrtcInputStream;
        } else {
            iTrtcInputStream = au2Var.t;
        }
        this.f13849a.V0().b(str2, TrtcDefines.TrtcUserRole.values()[this.g.v], "", str4).d(str4).e(iTrtcInputStream).start();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public boolean isFrontFacingCamera() {
        TrtcEngineImpl trtcEngineImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08a01e9", new Object[]{this})).booleanValue();
        }
        TrtcLog.j("TrtcAdapter", "isFrontFacingCamera");
        if (!o() || (trtcEngineImpl = this.f13849a) == null) {
            return false;
        }
        return trtcEngineImpl.h().isFrontFacing();
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setRemoteView(SurfaceViewRenderer surfaceViewRenderer, String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d546dd4f", new Object[]{this, surfaceViewRenderer, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setRemoteView: " + surfaceViewRenderer + ", id:" + str);
        if (s()) {
            this.g.getClass();
            this.g.getClass();
            this.g.b("setRemoteView");
        } else if (o()) {
            this.f13849a.h().setRemoteVideoView(surfaceViewRenderer, str);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoLayout(ArtcVideoLayout artcVideoLayout, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ae0cf1", new Object[]{this, artcVideoLayout, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setVideoLayout");
        k(new w(artcVideoLayout, z));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void startPreview2(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4d7d7d", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "startPreview2");
        if (s()) {
            this.g.getClass();
            this.g.b("startPreview2");
            return;
        }
        if (o()) {
            TrtcStreamConfig.a aVar = new TrtcStreamConfig.a();
            au2 au2Var = this.g;
            this.g.t = this.f13849a.h().startCapture(aVar.f(au2Var.r, au2Var.q, au2Var.s).b(true).e(true).a());
        }
        TrtcLog.j("TrtcAdapter", "startPreview2 done");
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcee840b", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAdapter", "process cached grtn api");
        this.f13849a = (TrtcEngineImpl) com.taobao.trtc.api.c.c(this.d);
        String str = "";
        try {
            str = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
            TrtcLog.j("TrtcAdapter", "get appVersion: " + str);
        } catch (PackageManager.NameNotFoundException e2) {
            TrtcLog.j("TrtcAdapter", "get appVersion error, e: " + e2);
            e2.printStackTrace();
        }
        TrtcConfig a2 = new TrtcConfig.a().s(this.b.useExternalVideoCapturer().booleanValue(), this.b.useExternalVideoRenderer().booleanValue()).q(this.b.getServiceName()).c(this.b.appkey()).v(this.b.getLocalUserId()).g(kd0.b(this.d)).r(this.b.isPreferBlueTooth()).t(false).i(this.j).e(this.j).f(this.j).j(this.b.environment()).b(this.b.getAccsCfgTag()).h(this.b.getEnableSpeechDetect()).m(this.b.getIsChatroom()).d(str).a();
        if (!this.f13849a.i(a2)) {
            this.j.H(TrtcDefines.TrtcErrorEvent.E_ERROR_EVENT_INITIALIZE, 2000, "trtc engine initialize error");
            return;
        }
        this.f13849a.h().setEventObserver(this.j);
        TrtcAudioDevice g2 = this.f13849a.g();
        g2.setAudioEventObserver(this.j);
        g2.setAEDEnable(false);
        g2.setAudioObserver(new TrtcAudioDevice.a() { // from class: tb.xiu
            @Override // com.taobao.trtc.api.TrtcAudioDevice.a
            public final void a(TrtcAudioDevice.b bVar) {
                TrtcAdapter.this.p(bVar);
            }
        });
        g2.setAudioProcessObserver(new TrtcAudioDevice.a() { // from class: tb.yiu
            @Override // com.taobao.trtc.api.TrtcAudioDevice.a
            public final void a(TrtcAudioDevice.b bVar) {
                TrtcAdapter.this.q(bVar);
            }
        });
        g2.setAudioPlayoutObserver(new TrtcAudioDevice.a() { // from class: tb.ziu
            @Override // com.taobao.trtc.api.TrtcAudioDevice.a
            public final void a(TrtcAudioDevice.b bVar) {
                TrtcAdapter.this.r(bVar);
            }
        });
        if (a2.isUseExternalVideoCapture() || a2.isUseExternalVideoRender()) {
            TrtcEngineImpl trtcEngineImpl = this.f13849a;
            plu pluVar = null;
            olu oluVar = a2.isUseExternalVideoCapture() ? (olu) l() : null;
            if (a2.isUseExternalVideoRender()) {
                pluVar = m();
            }
            trtcEngineImpl.l0(oluVar, pluVar);
        }
        this.f13849a.n1(this.j);
        au2 au2Var = this.g;
        if (au2Var != null) {
            au2Var.f(this.f13849a);
        }
    }

    public final void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e806f7", new Object[]{this, str});
        } else if (!this.f.get()) {
            TrtcLog.i("TrtcAdapter", "no need unInitialize");
        } else {
            if (this.b.protocal.equals(TrtcSignalChannel.f13972a)) {
                omu.g();
            }
            VideoCapturer videoCapturer = this.h;
            if (videoCapturer != null) {
                videoCapturer.dispose();
                this.h = null;
            }
            plu pluVar = this.i;
            if (pluVar != null) {
                pluVar.d();
                this.i = null;
            }
            au2 au2Var = this.g;
            if (au2Var != null) {
                au2Var.d();
                this.g = null;
            }
            if (o()) {
                this.f13849a.u1();
                this.f13849a.q();
            }
            this.f.set(false);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setChannelProfile(AConstants.ArtcChannelProfile artcChannelProfile, boolean z, boolean z2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b55467", new Object[]{this, artcChannelProfile, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setChannelProfile, profile: " + artcChannelProfile + ", audio: " + z2 + ", video:" + z2);
        k(new u(artcChannelProfile, z, z2));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void setVideoMirror(boolean z, boolean z2) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e60559f", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrtcLog.j("TrtcAdapter", "setVideoMirror, push: " + z + ", preview: " + z2);
        k(new o(z, z2));
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void switchCamera(String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3068994a", new Object[]{this, str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "switchCamera");
        if (o() && this.f13849a.h() != null) {
            this.f13849a.h().switchCamera();
        }
    }

    public final void u(AConstants.ArtcVideoProfile artcVideoProfile, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec44026e", new Object[]{this, artcVideoProfile, new Boolean(z)});
            return;
        }
        AConstants.ArtcVideoProfile artcVideoProfile2 = AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_15FPS;
        if (!(artcVideoProfile == artcVideoProfile2 || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_180P_10FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P_20FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_244P_20FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_270P_12FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_20FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P2_20FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_25FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_15FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_20FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_480P_15FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_20FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_25FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_20FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_30FPS || artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P2_20FPS)) {
            z2 = false;
        }
        dpm.a("trtc video profile's value is not valid.", z2);
        if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_180P_10FPS) {
            this.k = 320;
            this.l = ArtcParams.SD180pVideoParams.HEIGHT;
            this.m = 10;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P_20FPS) {
            this.k = 320;
            this.l = 240;
            this.m = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_244P_20FPS) {
            this.k = ArtcParams.SD244pVideoParams.WIDTH;
            this.l = 400;
            this.m = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_270P_12FPS) {
            this.k = 480;
            this.l = 480;
            this.m = 12;
        } else if (artcVideoProfile == artcVideoProfile2) {
            this.k = 640;
            this.l = 360;
            this.m = 15;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_20FPS) {
            this.k = 640;
            this.l = 360;
            this.m = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P2_20FPS) {
            this.l = 288;
            this.k = 288;
            this.m = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_360P_25FPS) {
            this.k = 640;
            this.l = 360;
            this.m = 25;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_15FPS) {
            this.k = 640;
            this.l = ArtcParams.SD368pVideoParams.HEIGHT;
            this.m = 15;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_368P_20FPS) {
            this.k = 640;
            this.l = ArtcParams.SD368pVideoParams.HEIGHT;
            this.m = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_480P_15FPS) {
            this.k = 640;
            this.l = 480;
            this.m = 15;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_20FPS) {
            this.k = 1280;
            this.l = 720;
            this.m = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_720P_25FPS) {
            this.k = 1280;
            this.l = 720;
            this.m = 25;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_20FPS) {
            this.k = 1920;
            this.l = 1080;
            this.m = 20;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_1080P_30FPS) {
            this.k = 1920;
            this.l = 1080;
            this.m = 30;
        } else if (artcVideoProfile == AConstants.ArtcVideoProfile.ARTC_VIDEO_PROFILE_240P2_20FPS) {
            this.l = 240;
            this.k = 240;
            this.m = 20;
        } else {
            TrtcLog.l("TrtcAdapter", "setVideoProfile, currently unsupported profile: " + artcVideoProfile.ordinal());
        }
        if (z) {
            int i2 = this.k;
            this.k = this.l;
            this.l = i2;
        }
        TrtcLog.j("TrtcAdapter", "setVideoProfile: " + artcVideoProfile + " landscape:" + z + ", size: " + this.k + "x" + this.l);
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void sendMessage(String str, String str2, String str3, String str4) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ddf68e", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TrtcLog.j("TrtcAdapter", "sendMessage, remoteUserId: " + str + " ,deviceId: " + str3 + " ,appkey: " + str4 + " ,msg: " + str2);
        if (o()) {
            this.f13849a.l1(str, str2, str3, str4);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void muteRemoteAudioStream(boolean z, String str) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17b1020", new Object[]{this, new Boolean(z), str});
            return;
        }
        TrtcLog.j("TrtcAdapter", "muteRemoteAudioStream, muted:" + z + ", id: " + str);
        if (o() && this.f13849a.g() != null) {
            this.f13849a.g().muteRemote(str, z);
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void callMutli(ArrayList<String> arrayList, int i2, String str, boolean z, int i3, int i4, int i5, String str2, String str3) {
        ITrtcInputStream iTrtcInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283d2f98", new Object[]{this, arrayList, new Integer(i2), str, new Boolean(z), new Integer(i3), new Integer(i4), new Integer(i5), str2, str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "callMutli, userIdList: " + arrayList.toString());
        if (o()) {
            this.f13849a.q1(z);
            au2 au2Var = this.g;
            if (au2Var.h == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
                if (au2Var.u == null) {
                    this.f13849a.h().setSubCaptureParams(cmu.e("multiCallWidth", i3), cmu.e("multiCallHeight", i4), cmu.e("multiCallFps", 20));
                    this.g.u = this.f13849a.h().startSubCapture();
                }
                iTrtcInputStream = this.g.u;
            } else {
                iTrtcInputStream = au2Var.t;
            }
            k(new h(arrayList, i2, str3, str, iTrtcInputStream, z, i5, str2));
        }
    }

    @Override // com.taobao.artc.api.ArtcEngine
    public void answerMutli(String str, int i2, String str2, boolean z, int i3, int i4, String str3) {
        ITrtcInputStream iTrtcInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720de08d", new Object[]{this, str, new Integer(i2), str2, new Boolean(z), new Integer(i3), new Integer(i4), str3});
            return;
        }
        TrtcLog.j("TrtcAdapter", "answerMutli");
        if (o()) {
            this.f13849a.q1(z);
            TrtcDefines.TrtcAnswerType trtcAnswerType = TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_NONE;
            if (i2 == 1) {
                trtcAnswerType = TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_AGREE;
            } else if (i2 == 2) {
                trtcAnswerType = TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT;
            }
            au2 au2Var = this.g;
            if (au2Var.h == AConstants.ArtcChannelProfile.ARTC_CHANNEL_PROFILE_BROADCAST) {
                if (au2Var.u == null) {
                    this.f13849a.h().setSubCaptureParams(cmu.e("multiCallWidth", i3), cmu.e("multiCallHeight", i4), cmu.e("multiCallFps", 20));
                    this.g.u = this.f13849a.h().startSubCapture();
                }
                iTrtcInputStream = this.g.u;
            } else {
                iTrtcInputStream = au2Var.t;
            }
            k(new i(str, str2, trtcAnswerType, iTrtcInputStream, z, str3));
            if (trtcAnswerType == TrtcDefines.TrtcAnswerType.E_ANSWER_TYPE_REJECT) {
                this.g.u = null;
            }
        }
    }
}
