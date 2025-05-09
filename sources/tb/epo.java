package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.lang.ref.WeakReference;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class epo extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean c = false;
    public static final Random d = new Random(System.currentTimeMillis());

    /* renamed from: a  reason: collision with root package name */
    public boolean f18743a;
    public final WeakReference<Activity> b;

    static {
        t2o.a(775946270);
    }

    public epo() {
        this.f18743a = true;
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f123f59", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static /* synthetic */ Object ipc$super(epo epoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 40891567) {
            return new Boolean(super.sendMessageAtTime((Message) objArr[0], ((Number) objArr[1]).longValue()));
        }
        if (hashCode == 72182663) {
            super.dispatchMessage((Message) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/util/SafeHandler");
    }

    public void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b15ca4e", new Object[]{this, message});
            return;
        }
        message.what = 0;
        message.arg1 = 0;
        message.arg2 = 0;
        message.obj = null;
        message.replyTo = null;
        message.setTarget(null);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f18743a = false;
        }
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
        } else if (this.f18743a) {
            if (c) {
                WeakReference<Activity> weakReference = this.b;
                if (weakReference == null) {
                    super.dispatchMessage(message);
                } else if (weakReference.get() != null) {
                    super.dispatchMessage(message);
                }
            } else {
                try {
                    WeakReference<Activity> weakReference2 = this.b;
                    if (weakReference2 == null) {
                        super.dispatchMessage(message);
                    } else if (weakReference2.get() != null) {
                        super.dispatchMessage(message);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (d.nextInt(100) < 0) {
                        TBS.Adv.onCaughException(e);
                    }
                }
            }
            a(message);
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ff4af", new Object[]{this, message, new Long(j)})).booleanValue();
        }
        if (!this.f18743a) {
            return false;
        }
        return super.sendMessageAtTime(message, j);
    }

    public epo(Handler.Callback callback) {
        super(callback);
        this.f18743a = true;
    }

    public epo(Activity activity, Handler.Callback callback) {
        this(callback);
        this.b = new WeakReference<>(activity);
    }

    public epo(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f18743a = true;
    }

    public epo(Looper looper) {
        super(looper);
        this.f18743a = true;
    }
}
