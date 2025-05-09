package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mo1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24175a = pvs.q();
    public final long b = pvs.c();
    public Handler c;
    public final String d;
    public final b e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/BackupStartController$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 0) {
                mo1.a(mo1.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
    }

    static {
        t2o.a(779093141);
    }

    public mo1(b bVar, String str) {
        this.e = bVar;
        this.d = str;
    }

    public static /* synthetic */ void a(mo1 mo1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf45142", new Object[]{mo1Var, new Boolean(z)});
        } else {
            mo1Var.c(z);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b88747b6", new Object[]{this})).booleanValue();
        }
        return this.f24175a;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c126fc", new Object[]{this, new Boolean(z)});
            return;
        }
        e("handleDelayBackUpPlay，播放优化,isBackUpPlay" + z);
        b bVar = this.e;
        if (bVar != null) {
            ((com.taobao.taolive.room.player.standard.manager.a) bVar).R0(z);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e19fa1", new Object[]{this});
        } else if (this.c == null) {
            this.c = new a(Looper.getMainLooper());
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(this.d)) {
            o3s.b("BackupStartController", this.d + " " + str);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f061a964", new Object[]{this});
        } else if (b()) {
            e("播放优化stopBackupPlayTask,mHandler:" + this.c);
            Handler handler = this.c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631e5d90", new Object[]{this, new Boolean(z)});
        } else if (b()) {
            if (!z) {
                e("startBackupPlayTask，直接播放优化无需延迟");
                g();
                c(false);
                return;
            }
            d();
            Handler handler = this.c;
            if (handler != null) {
                if (handler.hasMessages(0)) {
                    g();
                }
                e("startBackupPlayTask，延迟播放优化：" + this.b + " ms");
                this.c.sendEmptyMessageDelayed(0, this.b);
            }
        }
    }
}
