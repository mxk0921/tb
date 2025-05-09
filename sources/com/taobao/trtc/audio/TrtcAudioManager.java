package com.taobao.trtc.audio;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.utils.TrtcLog;
import java.util.HashSet;
import java.util.Set;
import tb.cju;
import tb.f7l;
import tb.kmu;
import tb.t2o;
import tb.tmu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcAudioManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13895a;
    public final Runnable b;
    public final AudioManager d;
    public kmu j;
    public BroadcastReceiver m;
    public AudioManager.OnAudioFocusChangeListener n;
    public boolean c = false;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public TrtcDefines.TrtcAudioRouteDevice h = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_NONE;
    public final Set<AudioDevice> l = new HashSet();
    public BroadcastReceiver o = null;
    public boolean p = false;
    public boolean q = false;
    public Handler r = null;
    public f s = null;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = -1;
    public int x = 0;
    public boolean y = false;
    public String i = "speaker";
    public AudioDevice k = AudioDevice.UNKNOWN;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum AudioDevice {
        UNKNOWN,
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH_HEADSET;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AudioDevice audioDevice, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/audio/TrtcAudioManager$AudioDevice");
        }

        public static AudioDevice valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioDevice) ipChange.ipc$dispatch("8fe2be98", new Object[]{str});
            }
            return (AudioDevice) Enum.valueOf(AudioDevice.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class ScoBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(395313467);
        }

        public ScoBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(ScoBroadcastReceiver scoBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/audio/TrtcAudioManager$ScoBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothClass bluetoothClass;
            BluetoothClass bluetoothClass2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (!(bluetoothDevice == null || (bluetoothClass2 = bluetoothDevice.getBluetoothClass()) == null)) {
                    int majorDeviceClass = bluetoothClass2.getMajorDeviceClass();
                    int deviceClass = bluetoothClass2.getDeviceClass();
                    TrtcLog.j("TrtcAudioManager", "BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED, major class:" + majorDeviceClass + "," + deviceClass);
                }
                TrtcAudioManager.j(TrtcAudioManager.this, intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1));
                TrtcLog.j("TrtcAudioManager", "BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED: " + TrtcAudioManager.i(TrtcAudioManager.this));
                if (TrtcAudioManager.i(TrtcAudioManager.this) == 2) {
                    if (TrtcAudioManager.k(TrtcAudioManager.this) && TrtcAudioManager.l(TrtcAudioManager.this) && TrtcAudioManager.m(TrtcAudioManager.this) != null) {
                        TrtcAudioManager.m(TrtcAudioManager.this).sendEmptyMessageDelayed(0, 0L);
                    }
                } else if (TrtcAudioManager.i(TrtcAudioManager.this) == 0 && TrtcAudioManager.k(TrtcAudioManager.this)) {
                    TrtcAudioManager.h(TrtcAudioManager.this).stopBluetoothSco();
                }
            } else if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (!(bluetoothDevice2 == null || (bluetoothClass = bluetoothDevice2.getBluetoothClass()) == null)) {
                    int majorDeviceClass2 = bluetoothClass.getMajorDeviceClass();
                    int deviceClass2 = bluetoothClass.getDeviceClass();
                    TrtcLog.j("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, major class:" + majorDeviceClass2 + "," + deviceClass2);
                }
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                TrtcLog.j("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, state: " + intExtra + ", prev state: " + intExtra2);
                if (intExtra == 0 && TrtcAudioManager.n(TrtcAudioManager.this) != -1 && intExtra2 == 1) {
                    TrtcLog.j("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is disconnected");
                    TrtcAudioManager.p(TrtcAudioManager.this, false);
                    tmu.f("TrtcAudioManager", "bluetooth disconnected");
                    if (TrtcAudioManager.c(TrtcAudioManager.this) != null) {
                        TrtcAudioManager.c(TrtcAudioManager.this).onBlueToothDeviceDisconnected();
                    }
                    TrtcAudioManager trtcAudioManager = TrtcAudioManager.this;
                    TrtcAudioManager.b(trtcAudioManager, TrtcAudioManager.d(trtcAudioManager));
                    TrtcAudioManager.e(TrtcAudioManager.this);
                }
                TrtcAudioManager.o(TrtcAudioManager.this, intExtra);
                TrtcAudioManager.g(TrtcAudioManager.this, intExtra2);
                if (TrtcAudioManager.n(TrtcAudioManager.this) == 1 && TrtcAudioManager.f(TrtcAudioManager.this) == 2) {
                    TrtcLog.j("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is connected");
                    TrtcAudioManager.p(TrtcAudioManager.this, true);
                    tmu.f("TrtcAudioManager", "bluetooth connected");
                    if (TrtcAudioManager.c(TrtcAudioManager.this) != null) {
                        TrtcAudioManager.c(TrtcAudioManager.this).a();
                    }
                    TrtcAudioManager trtcAudioManager2 = TrtcAudioManager.this;
                    TrtcAudioManager.b(trtcAudioManager2, TrtcAudioManager.d(trtcAudioManager2));
                    TrtcAudioManager.e(TrtcAudioManager.this);
                }
                if (TrtcAudioManager.n(TrtcAudioManager.this) == 0 && TrtcAudioManager.f(TrtcAudioManager.this) == 2) {
                    TrtcAudioManager trtcAudioManager3 = TrtcAudioManager.this;
                    TrtcAudioManager.b(trtcAudioManager3, TrtcAudioManager.d(trtcAudioManager3));
                    TrtcAudioManager.e(TrtcAudioManager.this);
                }
            }
        }

        public /* synthetic */ ScoBroadcastReceiver(TrtcAudioManager trtcAudioManager, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TrtcAudioManager.a(TrtcAudioManager.this);
            }
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
                TrtcAudioManager.a(TrtcAudioManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/audio/TrtcAudioManager$5");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 0) {
                try {
                    TrtcAudioManager.h(TrtcAudioManager.this).startBluetoothSco();
                    TrtcAudioManager.h(TrtcAudioManager.this).setBluetoothScoOn(true);
                } catch (NullPointerException unused) {
                    TrtcLog.j("TrtcAudioManager", "startBluetoothSco() failed. no bluetooth device connected.");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$trtc$audio$TrtcAudioManager$AudioDevice;

        static {
            int[] iArr = new int[AudioDevice.values().length];
            $SwitchMap$com$taobao$trtc$audio$TrtcAudioManager$AudioDevice = iArr;
            try {
                iArr[AudioDevice.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$trtc$audio$TrtcAudioManager$AudioDevice[AudioDevice.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$trtc$audio$TrtcAudioManager$AudioDevice[AudioDevice.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$trtc$audio$TrtcAudioManager$AudioDevice[AudioDevice.BLUETOOTH_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
        void a();

        void b(boolean z);

        void onAudioRouteChanged(int i);

        void onBlueToothDeviceDisconnected();
    }

    static {
        t2o.a(395313458);
    }

    public TrtcAudioManager(Context context, Runnable runnable) {
        this.j = null;
        this.f13895a = context;
        this.b = runnable;
        this.d = (AudioManager) context.getSystemService("audio");
        this.j = kmu.a(context, new a());
        cju.c("TrtcAudioManager");
    }

    public static /* synthetic */ void a(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5aa759a", new Object[]{trtcAudioManager});
        } else {
            trtcAudioManager.y();
        }
    }

    public static /* synthetic */ void b(TrtcAudioManager trtcAudioManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196f9259", new Object[]{trtcAudioManager, new Boolean(z)});
        } else {
            trtcAudioManager.J(z);
        }
    }

    public static /* synthetic */ f c(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("83e6e8b7", new Object[]{trtcAudioManager});
        }
        return trtcAudioManager.s;
    }

    public static /* synthetic */ boolean d(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49706e0e", new Object[]{trtcAudioManager})).booleanValue();
        }
        return trtcAudioManager.v();
    }

    public static /* synthetic */ void e(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beea944b", new Object[]{trtcAudioManager});
        } else {
            trtcAudioManager.q();
        }
    }

    public static /* synthetic */ int f(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3464ba7f", new Object[]{trtcAudioManager})).intValue();
        }
        return trtcAudioManager.x;
    }

    public static /* synthetic */ int g(TrtcAudioManager trtcAudioManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb222528", new Object[]{trtcAudioManager, new Integer(i)})).intValue();
        }
        trtcAudioManager.x = i;
        return i;
    }

    public static /* synthetic */ AudioManager h(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioManager) ipChange.ipc$dispatch("ba523c27", new Object[]{trtcAudioManager});
        }
        return trtcAudioManager.d;
    }

    public static /* synthetic */ int i(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab930e91", new Object[]{trtcAudioManager})).intValue();
        }
        return trtcAudioManager.v;
    }

    public static /* synthetic */ int j(TrtcAudioManager trtcAudioManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39be5356", new Object[]{trtcAudioManager, new Integer(i)})).intValue();
        }
        trtcAudioManager.v = i;
        return i;
    }

    public static /* synthetic */ boolean k(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("210d34e3", new Object[]{trtcAudioManager})).booleanValue();
        }
        return trtcAudioManager.p;
    }

    public static /* synthetic */ boolean l(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96875b24", new Object[]{trtcAudioManager})).booleanValue();
        }
        return trtcAudioManager.q;
    }

    public static /* synthetic */ Handler m(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a08ac7c5", new Object[]{trtcAudioManager});
        }
        return trtcAudioManager.r;
    }

    public static /* synthetic */ int n(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("817ba795", new Object[]{trtcAudioManager})).intValue();
        }
        return trtcAudioManager.w;
    }

    public static /* synthetic */ int o(TrtcAudioManager trtcAudioManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20e8dad2", new Object[]{trtcAudioManager, new Integer(i)})).intValue();
        }
        trtcAudioManager.w = i;
        return i;
    }

    public static /* synthetic */ boolean p(TrtcAudioManager trtcAudioManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ab3bc93", new Object[]{trtcAudioManager, new Boolean(z)})).booleanValue();
        }
        trtcAudioManager.y = z;
        return z;
    }

    public static TrtcAudioManager s(Context context, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcAudioManager) ipChange.ipc$dispatch("624cccf6", new Object[]{context, runnable});
        }
        return new TrtcAudioManager(context, runnable);
    }

    public final void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93eda6e8", new Object[]{this, new Boolean(z)});
        } else if (this.d.isMicrophoneMute() != z) {
            tmu.d("setMicrophoneMute: " + z);
            this.d.setMicrophoneMute(z);
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62ffbf3", new Object[]{this});
        } else {
            this.i = "auto";
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2381cc00", new Object[]{this});
        } else {
            this.i = "ear";
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbe7d1d", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAudioManager", "set speaker on:" + z);
        this.d.setSpeakerphoneOn(z);
        q();
    }

    public final void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4cc6df", new Object[]{this, new Boolean(z)});
            return;
        }
        tmu.f("TrtcAudioManager", "updateAudioDeviceState, hasWiredHeadset:" + z);
        ((HashSet) this.l).clear();
        if (this.y) {
            ((HashSet) this.l).add(AudioDevice.BLUETOOTH_HEADSET);
        } else if (z) {
            ((HashSet) this.l).add(AudioDevice.WIRED_HEADSET);
        } else {
            ((HashSet) this.l).add(AudioDevice.SPEAKER_PHONE);
            if (u()) {
                ((HashSet) this.l).add(AudioDevice.EARPIECE);
            }
        }
        TrtcLog.j("TrtcAudioManager", "audioDevices: " + this.l);
        if (this.y) {
            C(AudioDevice.BLUETOOTH_HEADSET);
        } else if (z) {
            C(AudioDevice.WIRED_HEADSET);
        } else if (this.i.equals("auto")) {
            C(AudioDevice.SPEAKER_PHONE);
        } else if (this.i.equals("speaker")) {
            C(AudioDevice.SPEAKER_PHONE);
        } else if (u()) {
            C(AudioDevice.EARPIECE);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAudioManager", "close");
        if (this.c) {
            I();
            if (this.p) {
                H();
            }
            G(this.f);
            D(this.g);
            this.d.setMode(this.e);
            this.d.abandonAudioFocus(this.n);
            this.n = null;
            TrtcLog.j("TrtcAudioManager", "Abandoned audio focus for VOICE_CALL streams");
            kmu kmuVar = this.j;
            if (kmuVar != null) {
                kmuVar.f();
                this.j = null;
            }
            this.c = false;
        }
    }

    public AudioDevice t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioDevice) ipChange.ipc$dispatch("f1dac3af", new Object[]{this});
        }
        return this.k;
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87fc119d", new Object[]{this})).booleanValue();
        }
        return this.f13895a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Deprecated
    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1a5cac8", new Object[]{this})).booleanValue();
        }
        return this.d.isWiredHeadsetOn();
    }

    public void w(boolean z, f fVar) {
        BluetoothAdapter bluetoothAdapter;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a576a5e7", new Object[]{this, new Boolean(z), fVar});
            return;
        }
        TrtcLog.j("TrtcAudioManager", "init, preferBlueTooth:" + z);
        if (!this.c) {
            if (this.j == null) {
                this.j = kmu.a(this.f13895a, new b());
            }
            this.e = this.d.getMode();
            this.f = this.d.isSpeakerphoneOn();
            this.g = this.d.isMicrophoneMute();
            TrtcLog.j("TrtcAudioManager", "init, saved audiomanager mode:" + this.e + ", speakeron:" + this.f + ", micmute:" + this.g);
            c cVar = new c(this, fVar);
            this.n = cVar;
            int requestAudioFocus = this.d.requestAudioFocus(cVar, 0, 2);
            if (requestAudioFocus == 1) {
                TrtcLog.j("TrtcAudioManager", "Audio focus request granted for VOICE_CALL streams");
            } else {
                TrtcLog.i("TrtcAudioManager", "Audio focus request failed");
            }
            if (fVar != null) {
                if (requestAudioFocus == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fVar.b(z2);
            }
            D(false);
            boolean v = v();
            TrtcLog.j("TrtcAudioManager", "init, has headset:" + v);
            J(v);
            B();
            this.p = z;
            if (z) {
                if (Build.VERSION.SDK_INT < 31) {
                    bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                } else if (ContextCompat.checkSelfPermission(this.f13895a, "android.permission.BLUETOOTH_CONNECT") == 0) {
                    bluetoothAdapter = ((BluetoothManager) this.f13895a.getSystemService("bluetooth")).getAdapter();
                } else {
                    tmu.g("TrtcAudioManager", "android.permission.BLUETOOTH_CONNECT not granted");
                    bluetoothAdapter = null;
                }
                if (bluetoothAdapter != null) {
                    for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                        if (bluetoothClass != null) {
                            int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
                            int deviceClass = bluetoothClass.getDeviceClass();
                            TrtcLog.j("TrtcAudioManager", "bonded bluetooth device:" + majorDeviceClass + "/" + deviceClass);
                        }
                    }
                }
                this.s = fVar;
                A();
            }
            this.c = true;
            this.h = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_NONE;
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0b359e", new Object[]{this});
        } else if (this.i.equals("auto")) {
            TrtcLog.j("TrtcAudioManager", "onProximitySensorChangedState, effective");
            if (((HashSet) this.l).size() == 2) {
                Set<AudioDevice> set = this.l;
                AudioDevice audioDevice = AudioDevice.EARPIECE;
                if (((HashSet) set).contains(audioDevice)) {
                    Set<AudioDevice> set2 = this.l;
                    AudioDevice audioDevice2 = AudioDevice.SPEAKER_PHONE;
                    if (((HashSet) set2).contains(audioDevice2)) {
                        if (!this.j.d()) {
                            C(audioDevice2);
                        } else if (u()) {
                            C(audioDevice);
                        }
                        E();
                    }
                }
            }
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cda7b3", new Object[]{this});
        } else if (!this.d.isBluetoothScoAvailableOffCall()) {
            TrtcLog.j("TrtcAudioManager", "Bluetooth recording is not supported by current system");
        } else {
            TrtcLog.j("TrtcAudioManager", "Bluetooth recording is supported by current system");
            this.r = new d(Looper.getMainLooper());
            try {
                this.o = new ScoBroadcastReceiver(this, null);
                IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                intentFilter.addAction("android.media.SCO_AUDIO_STATE_CHANGED");
                intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                if (this.f13895a.registerReceiver(this.o, intentFilter) != null) {
                    this.u = true;
                    TrtcLog.j("TrtcAudioManager", "sco receiver reg");
                }
            } catch (Throwable th) {
                TrtcLog.i("TrtcAudioManager", "exception when start sco broadcast: " + th.getMessage());
            }
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc71d83", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.trtc.audio.TrtcAudioManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/audio/TrtcAudioManager$4");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String str;
                String str2;
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                int intExtra = intent.getIntExtra("state", 0);
                int intExtra2 = intent.getIntExtra("microphone", 0);
                String stringExtra = intent.getStringExtra("name");
                StringBuilder sb = new StringBuilder("BroadcastReceiver.onReceive");
                sb.append(cju.b());
                sb.append(": a=");
                sb.append(intent.getAction());
                sb.append(", s=");
                if (intExtra == 0) {
                    str = "unplugged";
                } else {
                    str = "plugged";
                }
                sb.append(str);
                sb.append(", m=");
                if (intExtra2 == 1) {
                    str2 = "mic";
                } else {
                    str2 = "no mic";
                }
                sb.append(str2);
                sb.append(", n=");
                sb.append(stringExtra);
                sb.append(", sb=");
                sb.append(isInitialStickyBroadcast());
                TrtcLog.j("TrtcAudioManager", sb.toString());
                if (intExtra == 1) {
                    z = true;
                }
                if (intExtra == 0) {
                    TrtcAudioManager.b(TrtcAudioManager.this, z);
                } else if (intExtra != 1) {
                    TrtcLog.i("TrtcAudioManager", "Invalid state");
                } else {
                    TrtcAudioManager.b(TrtcAudioManager.this, z);
                }
            }
        };
        this.m = broadcastReceiver;
        try {
            if (this.f13895a.registerReceiver(broadcastReceiver, intentFilter) != null) {
                this.t = true;
                TrtcLog.j("TrtcAudioManager", "wired headset receiver reg");
            }
        } catch (Throwable th) {
            TrtcLog.i("TrtcAudioManager", "exception when start wired headset broadcast: " + th.getMessage());
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca83903a", new Object[]{this});
            return;
        }
        Handler handler = this.r;
        if (handler != null) {
            handler.removeMessages(0);
            this.r = null;
        }
        this.d.stopBluetoothSco();
        if (this.u) {
            this.f13895a.unregisterReceiver(this.o);
            this.u = false;
            TrtcLog.j("TrtcAudioManager", "sco receiver unreg");
        }
        this.o = null;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f0dcdc", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.m;
        if (broadcastReceiver != null && this.t) {
            this.f13895a.unregisterReceiver(broadcastReceiver);
            this.t = false;
            TrtcLog.j("TrtcAudioManager", "wired headset receiver unreg");
        }
        this.m = null;
    }

    public void K(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2408db5", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcAudioManager", "useSpeaker, " + z);
        if (z) {
            z2 = !this.i.equals("speaker");
            this.i = "speaker";
        } else {
            z2 = !this.i.equals("ear");
            this.i = "ear";
        }
        if (z2) {
            J(v());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements AudioManager.OnAudioFocusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f13900a;

        public c(TrtcAudioManager trtcAudioManager, f fVar) {
            this.f13900a = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAudioFocusChange(int r6) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.trtc.audio.TrtcAudioManager.c.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001a
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r6)
                java.lang.Object[] r6 = new java.lang.Object[r2]
                r6[r1] = r5
                r6[r0] = r4
                java.lang.String r0 = "6a40fd0b"
                r3.ipc$dispatch(r0, r6)
                return
            L_0x001a:
                r3 = -3
                if (r6 == r3) goto L_0x0043
                r3 = -2
                if (r6 == r3) goto L_0x0040
                r3 = -1
                if (r6 == r3) goto L_0x003c
                if (r6 == r0) goto L_0x0039
                if (r6 == r2) goto L_0x0036
                r1 = 3
                if (r6 == r1) goto L_0x0033
                r1 = 4
                if (r6 == r1) goto L_0x0030
                java.lang.String r6 = "AUDIOFOCUS_INVALID"
                goto L_0x0046
            L_0x0030:
                java.lang.String r6 = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE"
                goto L_0x0046
            L_0x0033:
                java.lang.String r6 = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK"
                goto L_0x0046
            L_0x0036:
                java.lang.String r6 = "AUDIOFOCUS_GAIN_TRANSIENT"
                goto L_0x0046
            L_0x0039:
                java.lang.String r6 = "AUDIOFOCUS_GAIN"
                goto L_0x0046
            L_0x003c:
                java.lang.String r6 = "AUDIOFOCUS_LOSS"
            L_0x003e:
                r0 = 0
                goto L_0x0046
            L_0x0040:
                java.lang.String r6 = "AUDIOFOCUS_LOSS_TRANSIENT"
                goto L_0x003e
            L_0x0043:
                java.lang.String r6 = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK"
                goto L_0x003e
            L_0x0046:
                com.taobao.trtc.audio.TrtcAudioManager$f r1 = r5.f13900a
                if (r1 == 0) goto L_0x004d
                r1.b(r0)
            L_0x004d:
                java.lang.String r0 = "onAudioFocusChange: "
                java.lang.String r6 = r0.concat(r6)
                java.lang.String r0 = "TrtcAudioManager"
                com.taobao.trtc.utils.TrtcLog.j(r0, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.audio.TrtcAudioManager.c.onAudioFocusChange(int):void");
        }
    }

    public final void q() {
        TrtcDefines.TrtcAudioRouteDevice trtcAudioRouteDevice;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2197bf28", new Object[]{this});
            return;
        }
        if (this.d.isBluetoothScoOn() && this.y) {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_BLUETOOTH_HEADSET;
        } else if (this.d.isSpeakerphoneOn()) {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_SPEAKER;
        } else if (this.d.isWiredHeadsetOn()) {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_WIRED_HEADSET;
        } else {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_EARPIECE;
        }
        StringBuilder sb = new StringBuilder("new routeDevice: ");
        sb.append(trtcAudioRouteDevice.name());
        sb.append(", cur routeDevice: ");
        sb.append(this.h.name());
        sb.append(", audio device changed: ");
        if (this.h.ordinal() != trtcAudioRouteDevice.ordinal()) {
            z = true;
        }
        sb.append(z);
        TrtcLog.i("TrtcAudioManager", sb.toString());
        if (this.h != trtcAudioRouteDevice) {
            tmu.f("TrtcAudioManager", "new routeDevice: " + trtcAudioRouteDevice.name() + ", cur routeDevice: " + this.h.name());
            f fVar = this.s;
            if (fVar != null) {
                fVar.onAudioRouteChanged(trtcAudioRouteDevice.ordinal());
            }
            this.h = trtcAudioRouteDevice;
        }
    }

    public final void x() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222c72da", new Object[]{this});
            return;
        }
        TrtcLog.j("TrtcAudioManager", "onAudioManagerChangedState: devices=" + this.l + ", selected=" + this.k);
        if (((HashSet) this.l).size() == 2) {
            if (((HashSet) this.l).contains(AudioDevice.EARPIECE) && ((HashSet) this.l).contains(AudioDevice.SPEAKER_PHONE)) {
                z = true;
            }
            cju.a(z);
            kmu kmuVar = this.j;
            if (kmuVar != null) {
                kmuVar.e();
            }
        } else if (((HashSet) this.l).size() == 1) {
            kmu kmuVar2 = this.j;
            if (kmuVar2 != null) {
                kmuVar2.f();
            }
        } else {
            TrtcLog.i("TrtcAudioManager", "Invalid device list");
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void C(AudioDevice audioDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11584dac", new Object[]{this, audioDevice});
            return;
        }
        TrtcLog.j("TrtcAudioManager", "setAudioDevice(device=" + audioDevice + f7l.BRACKET_END_STR);
        cju.a(((HashSet) this.l).contains(audioDevice));
        int i = e.$SwitchMap$com$taobao$trtc$audio$TrtcAudioManager$AudioDevice[audioDevice.ordinal()];
        if (i == 1) {
            G(true);
            this.k = AudioDevice.SPEAKER_PHONE;
        } else if (i == 2) {
            G(false);
            this.k = AudioDevice.EARPIECE;
        } else if (i == 3) {
            G(false);
            this.k = AudioDevice.WIRED_HEADSET;
        } else if (i != 4) {
            TrtcLog.i("TrtcAudioManager", "Invalid audio device selection");
            this.k = AudioDevice.UNKNOWN;
        } else {
            this.k = AudioDevice.BLUETOOTH_HEADSET;
        }
        x();
    }

    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38df6074", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (this.d.requestAudioFocus(this.n, 0, 2) == 1) {
                TrtcLog.j("TrtcAudioManager", "prepare4Talk: Audio focus request granted for VOICE_CALL streams");
            } else {
                TrtcLog.i("TrtcAudioManager", "prepare4Talk: Audio focus request failed");
            }
            this.e = this.d.getMode();
            this.f = this.d.isSpeakerphoneOn();
            this.g = this.d.isMicrophoneMute();
            if (this.p) {
                this.q = true;
                if (this.r != null) {
                    TrtcLog.j("TrtcAudioManager", "signalVoipRuning, try to start bluetooth SCO by myself");
                    this.r.sendEmptyMessageDelayed(0, 0L);
                }
            }
            TrtcLog.j("TrtcAudioManager", "prepare4Talk true, saved audiomanager mode:" + this.e + ", speakeron:" + this.f + ", micmute:" + this.g);
        } else {
            if (this.p) {
                this.q = false;
                TrtcLog.j("TrtcAudioManager", "signalVoipRuning, stop bluetooth SCO");
                this.d.stopBluetoothSco();
            }
            G(this.f);
            D(this.g);
            this.d.setMode(this.e);
            this.d.abandonAudioFocus(this.n);
        }
    }
}
