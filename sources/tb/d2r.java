package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d2r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e2r f17531a = new e2r();
    public final Handler b;
    public static final Comparator<f2r> comparator = new a();
    public static d2r c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Comparator<f2r> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(f2r f2rVar, f2r f2rVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0ceaa39", new Object[]{this, f2rVar, f2rVar2})).intValue();
            }
            return f2rVar.b() - f2rVar2.b();
        }
    }

    static {
        t2o.a(343933178);
    }

    public d2r() {
        HandlerThread handlerThread = new HandlerThread("ACCS-SyncManager");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), new b());
    }

    public static /* synthetic */ e2r a(d2r d2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2r) ipChange.ipc$dispatch("992b89df", new Object[]{d2rVar});
        }
        return d2rVar.f17531a;
    }

    public static d2r b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d2r) ipChange.ipc$dispatch("f244162b", new Object[0]);
        }
        if (c == null) {
            synchronized (d2r.class) {
                try {
                    if (c == null) {
                        c = new d2r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void c(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc8895e", new Object[]{this, f2rVar});
        } else {
            Message.obtain(this.b, 1, f2rVar).sendToTarget();
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9fd69d5", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f17531a.g(str);
    }

    public void e(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbaa955", new Object[]{this, f2rVar});
        } else {
            Message.obtain(this.b, 2, f2rVar).sendToTarget();
        }
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d51c16", new Object[]{this, str, str2});
            return;
        }
        Message message = new Message();
        message.what = 5;
        Bundle bundle = new Bundle();
        bundle.putString("scv_id", str);
        message.setData(bundle);
        this.b.sendMessage(message);
    }

    public void f(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fd2683", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i > i2) {
            pmo.c("SyncManager", "query() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 6;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            bundle.putString(Constants.KEY_STREAM_ID, str2);
            bundle.putInt("start_seq", i);
            bundle.putInt("end_seq", i2);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942e3b7f", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            pmo.c("SyncManager", "recover() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 7;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            bundle.putString(Constants.KEY_STREAM_ID, str2);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fe9aac", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            pmo.c("SyncManager", "unSubscribeStream() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 4;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public void h(String str, String str2, int i, int i2, long j, boolean z, x1r x1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593910e2", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Long(j), new Boolean(z), x1rVar});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            pmo.c("SyncManager", "subscribeStream() IllegalArguments", new Object[0]);
        } else {
            Message message = new Message();
            message.what = 3;
            message.obj = x1rVar;
            Bundle bundle = new Bundle();
            bundle.putString("scv_id", str);
            bundle.putInt("start_seq", i);
            bundle.putInt("snap_interval", i2);
            bundle.putLong("timeout", j);
            bundle.putBoolean("saveDB", z);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            int i = message.what;
            Bundle data = message.getData();
            if (data != null) {
                String string = data.getString("scv_id");
                str2 = data.getString(Constants.KEY_STREAM_ID);
                str = string;
            } else {
                str2 = null;
                str = null;
            }
            switch (i) {
                case 1:
                    d2r.a(d2r.this).f((f2r) message.obj);
                    break;
                case 2:
                    d2r.a(d2r.this).h((f2r) message.obj);
                    break;
                case 3:
                    d2r.a(d2r.this).l(str, null, data.getInt("start_seq"), data.getInt("snap_interval"), data.getLong("timeout"), data.getBoolean("saveDB"), (x1r) message.obj);
                    break;
                case 4:
                    d2r.a(d2r.this).n(str, null);
                    break;
                case 5:
                    d2r.a(d2r.this).m(str);
                    break;
                case 6:
                    d2r.a(d2r.this).i(str, str2, data.getInt("start_seq"), data.getInt("end_seq"));
                    break;
                case 7:
                    d2r.a(d2r.this).j(str, str2);
                    break;
            }
            return true;
        }
    }
}
