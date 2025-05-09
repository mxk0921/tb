package tb;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x3r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static x3r f;
    public static AudioManager g;
    public static TelephonyManager i;
    public static PhoneStateListener k;
    public Runnable b;
    public static final int e = 1000;
    public static boolean h = false;
    public static boolean j = false;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f31120a = new Handler(Looper.getMainLooper());
    public final AtomicInteger c = new AtomicInteger(0);
    public final Set<MonitorMediaPlayer> d = Collections.synchronizedSet(new HashSet());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x3r.a().abandonAudioFocus(null);
            x3r.b(x3r.this, null);
            x3r.c(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (x3r.d() == null) {
                    x3r.e(new a());
                }
                if (x3r.g() != null && x3r.d() != null) {
                    x3r.g().listen(x3r.d(), 32);
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, "SystemServiceManager " + this + ", PhoneStateListener Start");
                }
            } catch (Throwable th) {
                AVSDKLog.e("AVDSK", "TELEPHONY_SERVICE listen LISTEN_CALL_STATE error: " + th.getMessage());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends PhoneStateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == -1198008378) {
                    super.onCallStateChanged(((Number) objArr[0]).intValue(), (String) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/recycle/SystemServiceManager$2$1");
            }

            @Override // android.telephony.PhoneStateListener
            public void onCallStateChanged(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b897d7c6", new Object[]{this, new Integer(i), str});
                    return;
                }
                super.onCallStateChanged(i, str);
                synchronized (x3r.f(x3r.this)) {
                    try {
                        for (MonitorMediaPlayer monitorMediaPlayer : x3r.f(x3r.this)) {
                            if (monitorMediaPlayer instanceof TaobaoMediaPlayer) {
                                if (!TaobaoMediaPlayer.isLibLoaded()) {
                                    return;
                                }
                                if (i != 0) {
                                    if (i == 1 && ((TaobaoMediaPlayer) monitorMediaPlayer).isPlaying()) {
                                        ((TaobaoMediaPlayer) monitorMediaPlayer).setAutoPause(true);
                                        AVSDKLog.e(monitorMediaPlayer.getLogContext(), "pause in CALL_STATE_RINGING");
                                        ((TaobaoMediaPlayer) monitorMediaPlayer).pause();
                                    }
                                } else if (((TaobaoMediaPlayer) monitorMediaPlayer).getAutoPause()) {
                                    ((TaobaoMediaPlayer) monitorMediaPlayer).setAutoPause(false);
                                    try {
                                        ((TaobaoMediaPlayer) monitorMediaPlayer).start();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        t2o.a(774897932);
    }

    public x3r(Context context) {
        if (g == null || i == null) {
            g = (AudioManager) context.getApplicationContext().getSystemService("audio");
            i = (TelephonyManager) context.getSystemService("phone");
        }
    }

    public static /* synthetic */ AudioManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioManager) ipChange.ipc$dispatch("c50575ec", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ Runnable b(x3r x3rVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5ce1975d", new Object[]{x3rVar, runnable});
        }
        x3rVar.b = runnable;
        return runnable;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        h = z;
        return z;
    }

    public static /* synthetic */ PhoneStateListener d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneStateListener) ipChange.ipc$dispatch("356dde1d", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ PhoneStateListener e(PhoneStateListener phoneStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneStateListener) ipChange.ipc$dispatch("fb6033fa", new Object[]{phoneStateListener});
        }
        k = phoneStateListener;
        return phoneStateListener;
    }

    public static /* synthetic */ Set f(x3r x3rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("16dc82a7", new Object[]{x3rVar});
        }
        return x3rVar.d;
    }

    public static /* synthetic */ TelephonyManager g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TelephonyManager) ipChange.ipc$dispatch("e2814f7d", new Object[0]);
        }
        return i;
    }

    public static synchronized x3r j(Context context) {
        synchronized (x3r.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x3r) ipChange.ipc$dispatch("a2f6ceb9", new Object[]{context});
            }
            if (f == null) {
                f = new x3r(context);
            }
            return f;
        }
    }

    public void i(MonitorMediaPlayer monitorMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49d957c", new Object[]{this, monitorMediaPlayer});
            return;
        }
        this.d.add(monitorMediaPlayer);
        AVSDKLog.e(monitorMediaPlayer.getLogContext(), "PhoneStateListener add successed");
        if (!j) {
            dq.b().execute(new b());
            j = true;
        }
    }

    public void k(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285e35ca", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        this.c.decrementAndGet();
        if (h) {
            if (this.b == null && this.c.get() == 0) {
                a aVar = new a();
                this.b = aVar;
                this.f31120a.postDelayed(aVar, e);
            }
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "releaseAudioFocus has postDelayed");
        }
    }

    public void l(MonitorMediaPlayer monitorMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ee39f", new Object[]{this, monitorMediaPlayer});
            return;
        }
        this.d.remove(monitorMediaPlayer);
        AVSDKLog.e(monitorMediaPlayer.getLogContext(), "Removed From learSystemTelephoneService.");
    }

    public void h(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10f2008", new Object[]{this, onAudioFocusChangeListener, new Integer(i2)});
            return;
        }
        this.c.incrementAndGet();
        Runnable runnable = this.b;
        if (runnable != null) {
            this.f31120a.removeCallbacks(runnable);
            this.b = null;
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "removeCallbacks AudioFocusReleaseRunnable");
        }
        if (h) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "acquireAudioFocus, but has acquired focusCount is " + this.c.get());
            return;
        }
        AudioManager audioManager = g;
        if (audioManager != null) {
            audioManager.requestAudioFocus(null, 3, i2);
            h = true;
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "acquireAudioFocus successed");
        }
    }
}
