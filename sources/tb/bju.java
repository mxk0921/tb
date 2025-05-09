package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.audio.TrtcAudioManager;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.utils.TrtcLog;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.audio.WebRtcExtProcessAudioFrame;
import org.webrtc.voiceengine.WebRtcAudioManager;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bju implements TrtcAudioDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TrtcEngineImpl f16433a;
    public TrtcAudioDevice.a c;
    public TrtcAudioDevice.a d;
    public TrtcAudioDevice.a e;
    public nlu f;
    public TrtcAudioManager h;
    public final Object b = new Object();
    public boolean g = false;
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements WebRtcAudioRecord.WebRtcAudioRecordErrorCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback
        public void onWebRtcAudioRecordError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("971ea69e", new Object[]{this, str});
                return;
            }
            synchronized (bju.a(bju.this)) {
                try {
                    if (bju.b(bju.this) != null) {
                        bju.b(bju.this).i1(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback
        public void onWebRtcAudioRecordInitError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d42f4ee", new Object[]{this, str});
                return;
            }
            synchronized (bju.a(bju.this)) {
                try {
                    if (bju.b(bju.this) != null) {
                        bju.b(bju.this).h1(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback
        public void onWebRtcAudioRecordStartError(WebRtcAudioRecord.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59e57c83", new Object[]{this, audioRecordStartErrorCode, str});
                return;
            }
            synchronized (bju.a(bju.this)) {
                try {
                    if (bju.b(bju.this) != null) {
                        bju.b(bju.this).j1(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements TrtcAudioManager.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.trtc.audio.TrtcAudioManager.f
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1580a46b", new Object[]{this});
                return;
            }
            TrtcLog.j("TrtcAudioDevice", "audio blue tooth connected");
            if (bju.b(bju.this) != null) {
                bju.b(bju.this).l1();
            }
        }

        @Override // com.taobao.trtc.audio.TrtcAudioManager.f
        public void b(boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a4a957a", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                str = "gained";
            } else {
                str = "loss";
            }
            TrtcLog.j("TrtcAudioDevice", "audio focus changed to: ".concat(str));
            if (bju.b(bju.this) != null) {
                bju.b(bju.this).g1(z);
            }
        }

        @Override // com.taobao.trtc.audio.TrtcAudioManager.f
        public void onAudioRouteChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66a6119a", new Object[]{this, new Integer(i)});
                return;
            }
            TrtcLog.j("TrtcAudioDevice", "audio route changed to: " + TrtcDefines.TrtcAudioRouteDevice.values()[i]);
            if (bju.b(bju.this) != null) {
                bju.b(bju.this).k1(i);
            }
        }

        @Override // com.taobao.trtc.audio.TrtcAudioManager.f
        public void onBlueToothDeviceDisconnected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8c28207", new Object[]{this});
                return;
            }
            TrtcLog.j("TrtcAudioDevice", "audio blue tooth disconnected");
            if (bju.b(bju.this) != null) {
                bju.b(bju.this).m1();
            }
        }
    }

    static {
        t2o.a(395313485);
        t2o.a(395313403);
    }

    public bju(TrtcEngineImpl trtcEngineImpl, nlu nluVar) {
        this.f16433a = trtcEngineImpl;
        this.f = nluVar;
    }

    public static /* synthetic */ Object a(bju bjuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ae35192b", new Object[]{bjuVar});
        }
        return bjuVar.b;
    }

    public static /* synthetic */ nlu b(bju bjuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nlu) ipChange.ipc$dispatch("b9e55578", new Object[]{bjuVar});
        }
        return bjuVar.f;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff784138", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAudioDevice", "deInit");
        WebRtcAudioRecord.setErrorCallback(null);
        l(null);
        synchronized (this.b) {
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.f16433a = null;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db097471", new Object[]{this, new Boolean(z)});
        } else {
            WebRtcAudioManager.setStereoOutput(z);
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f426598b", new Object[]{this})).intValue();
        }
        return 48000;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void enableSpeakerphone(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e03d47b", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - enableSpeakerphone:" + z);
        TrtcAudioManager trtcAudioManager = this.h;
        if (trtcAudioManager != null) {
            trtcAudioManager.K(z);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fae8ec64", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public TrtcDefines.TrtcAudioRouteDevice getCurrentDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcDefines.TrtcAudioRouteDevice) ipChange.ipc$dispatch("64d253d2", new Object[]{this});
        }
        TrtcAudioManager trtcAudioManager = this.h;
        if (trtcAudioManager != null) {
            TrtcAudioManager.AudioDevice t = trtcAudioManager.t();
            if (t == TrtcAudioManager.AudioDevice.SPEAKER_PHONE) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_SPEAKER;
            }
            if (t == TrtcAudioManager.AudioDevice.EARPIECE) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_EARPIECE;
            }
            if (t == TrtcAudioManager.AudioDevice.WIRED_HEADSET) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_WIRED_HEADSET;
            }
            if (t == TrtcAudioManager.AudioDevice.BLUETOOTH_HEADSET) {
                return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_BLUETOOTH_HEADSET;
            }
        }
        return TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_NONE;
    }

    public synchronized boolean h() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e44dab9b", new Object[]{this})).booleanValue();
            }
            if (this.e != null) {
                z = true;
            }
            return z;
        }
    }

    public void i(WebRtcExtProcessAudioFrame webRtcExtProcessAudioFrame) {
        TrtcAudioDevice.a aVar;
        TrtcAudioDevice.a aVar2;
        TrtcAudioDevice.a aVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffaf422", new Object[]{this, webRtcExtProcessAudioFrame});
            return;
        }
        TrtcAudioDevice.b bVar = new TrtcAudioDevice.b();
        bVar.f13873a = webRtcExtProcessAudioFrame.getSampleRate();
        bVar.b = webRtcExtProcessAudioFrame.getChannels();
        bVar.c = webRtcExtProcessAudioFrame.getSamplePerChannel();
        bVar.d = webRtcExtProcessAudioFrame.getAudioLevel();
        bVar.e = webRtcExtProcessAudioFrame.isSpeech();
        bVar.f = bVar.c * bVar.b * 2;
        bVar.g = webRtcExtProcessAudioFrame.getAudioData();
        bVar.h = webRtcExtProcessAudioFrame.getAudioDb();
        synchronized (this.b) {
            try {
                if (webRtcExtProcessAudioFrame.getType() == 0 && (aVar3 = this.c) != null) {
                    aVar3.a(bVar);
                } else if (webRtcExtProcessAudioFrame.getType() == 1 && (aVar2 = this.d) != null) {
                    aVar2.a(bVar);
                } else if (webRtcExtProcessAudioFrame.getType() == 2 && (aVar = this.e) != null) {
                    aVar.a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38df6074", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcAudioManager trtcAudioManager = this.h;
        if (trtcAudioManager != null) {
            trtcAudioManager.z(z);
        }
    }

    public synchronized void k(Handler handler) {
        TrtcEngineImpl trtcEngineImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d93a899", new Object[]{this, handler});
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            if (this.h == null) {
                this.h = TrtcAudioManager.s(rlu.f27461a, null);
            }
            if (!(this.h == null || (trtcEngineImpl = this.f16433a) == null || trtcEngineImpl.r0() == null)) {
                this.h.w(this.f16433a.r0().config.isUseBlueTooth(), new b());
            }
        } else if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public synchronized void l(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8960c39", new Object[]{this, handler});
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            TrtcAudioManager trtcAudioManager = this.h;
            if (trtcAudioManager != null) {
                trtcAudioManager.r();
                this.h = null;
                this.f = null;
            }
        } else if (handler != null) {
            handler.sendEmptyMessage(2);
        }
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void muteLocal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bbed9b", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - muteLocal:" + z);
        TrtcEngineImpl trtcEngineImpl = this.f16433a;
        if (trtcEngineImpl != null) {
            trtcEngineImpl.R0(z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void muteRemote(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5e03c4", new Object[]{this, str, new Boolean(z)});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - muteRemote:" + str + ", enable:" + z);
        TrtcEngineImpl trtcEngineImpl = this.f16433a;
        if (trtcEngineImpl != null) {
            trtcEngineImpl.P0(str, z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAEDEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8283ac", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - setAEDEnable, enable:" + z);
        this.g = z;
        TrtcEngineImpl trtcEngineImpl = this.f16433a;
        if (trtcEngineImpl != null && trtcEngineImpl.k0("setAEDEnable")) {
            this.f16433a.A1();
        }
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioEventObserver(ITrtcObserver.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7335ea97", new Object[]{this, aVar});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - setAudioEventObserver: " + aVar);
        this.f.I1(aVar);
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioObserver(TrtcAudioDevice.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2f0103", new Object[]{this, aVar});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - AudioDataObserver: " + aVar);
        this.c = aVar;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioPlayoutObserver(TrtcAudioDevice.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8776ff1", new Object[]{this, aVar});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - setAudioPlayoutObserver: " + aVar);
        this.e = aVar;
    }

    @Override // com.taobao.trtc.api.TrtcAudioDevice
    public void setAudioProcessObserver(TrtcAudioDevice.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653e74fc", new Object[]{this, aVar});
            return;
        }
        tmu.f("TrtcAudioDevice", "API - setAudioProcessObserver: " + aVar);
        this.d = aVar;
    }

    public synchronized void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.i.get()) {
            TrtcLog.j("TrtcAudioDevice", "init");
            WebRtcAudioUtils.setWebRtcBasedAcousticEchoCanceler(true);
            d(false);
            WebRtcAudioRecord.setErrorCallback(new a());
            this.h = TrtcAudioManager.s(rlu.f27461a, null);
            if (this.f16433a.r0().config.isPreferHandset()) {
                TrtcLog.j("TrtcAudioDevice", "preferHandset");
                this.h.F();
            }
            this.i.set(true);
        }
    }
}
