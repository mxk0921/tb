package tb;

import android.media.AudioRecord;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class tf2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BLOW_HANDLER_BLOWING = 4101;
    public static final int BLOW_HANDLER_FAIL = 4102;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f28679a;
    public Timer b;
    public final AudioRecord c;
    public int d;
    public byte[] f;
    public int e = 1;
    public long g = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/BlowSensor$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tf2.a(tf2.this);
            }
        }
    }

    static {
        t2o.a(989856240);
    }

    public tf2(Handler handler) {
        this.d = 100;
        this.f28679a = handler;
        this.d = AudioRecord.getMinBufferSize(JosStatusCodes.RTN_CODE_COMMON_ERROR, 16, 2);
        this.c = new AudioRecord(1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16, 2, this.d);
    }

    public static /* synthetic */ void a(tf2 tf2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97427650", new Object[]{tf2Var});
        } else {
            tf2Var.b();
        }
    }

    public final void b() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fc7aaa", new Object[]{this});
            return;
        }
        try {
            this.e++;
            Thread.sleep(8L);
            long currentTimeMillis = System.currentTimeMillis();
            int read = this.c.read(this.f, 0, this.d) + 1;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.f;
                if (i >= bArr.length) {
                    break;
                }
                byte b = bArr[i];
                i2 += b * b;
                i++;
            }
            int i3 = i2 / read;
            long currentTimeMillis2 = this.g + (System.currentTimeMillis() - currentTimeMillis);
            this.g = currentTimeMillis2;
            if ((currentTimeMillis2 >= 500 || this.e > 5) && i3 > 3000) {
                this.f28679a.sendEmptyMessage(4101);
                this.e = 1;
                this.g = 1L;
            }
        } catch (Exception unused) {
            this.f28679a.sendEmptyMessage(4102);
            d();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        try {
            this.c.startRecording();
            this.f = new byte[this.d];
            Timer timer = new Timer("WVBlowTimer");
            this.b = timer;
            timer.scheduleAtFixedRate(new a(), 0L, 100L);
        } catch (Exception unused) {
            d();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        try {
            AudioRecord audioRecord = this.c;
            if (audioRecord != null) {
                audioRecord.stop();
                this.c.release();
                this.d = 100;
            }
        } catch (Exception unused) {
        }
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
        }
    }
}
