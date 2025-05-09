package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rmm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRE_DOWNLOAD_FINISH = 1;
    public static final int PRE_DOWNLOAD_PROGRESS = 2;
    public static volatile rmm e;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f27468a = new a(Looper.getMainLooper());
    public final Map<String, List<WeakReference<wbd>>> b = new HashMap();
    public final Map<String, String> c = new HashMap();
    public final Map<String, String> d = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/PreDownloadStatusManager$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                rmm.a(rmm.this, (String) message.obj, message.arg1);
            } else if (i == 2) {
                rmm.b(rmm.this, (String) message.obj, message.arg1);
            }
        }
    }

    static {
        t2o.a(774897753);
    }

    public static /* synthetic */ void a(rmm rmmVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29304689", new Object[]{rmmVar, str, new Integer(i)});
        } else {
            rmmVar.f(str, i);
        }
    }

    public static /* synthetic */ void b(rmm rmmVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03c2d8a", new Object[]{rmmVar, str, new Integer(i)});
        } else {
            rmmVar.g(str, i);
        }
    }

    public static rmm e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rmm) ipChange.ipc$dispatch("b380d309", new Object[0]);
        }
        if (e == null) {
            synchronized (rmm.class) {
                try {
                    if (e == null) {
                        e = new rmm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public synchronized void c(String str, String str2, wbd wbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3558ba51", new Object[]{this, str, str2, wbdVar});
            return;
        }
        if (!TextUtils.isEmpty(str) && wbdVar != null) {
            List list = (List) ((HashMap) this.b).get(str);
            if (list == null) {
                list = new LinkedList();
            }
            list.add(new WeakReference(wbdVar));
            ((HashMap) this.b).put(str, list);
            ((HashMap) this.c).put(str2, str);
            ((HashMap) this.d).put(str, str2);
        }
    }

    public synchronized String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efa860fd", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !((HashMap) this.c).containsKey(str)) {
            return null;
        } else {
            return (String) ((HashMap) this.c).get(str);
        }
    }

    public final synchronized void f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968e8b00", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (((HashMap) this.b).containsKey(str)) {
                for (WeakReference weakReference : (List) ((HashMap) this.b).get(str)) {
                    wbd wbdVar = (wbd) weakReference.get();
                    if (wbdVar != null) {
                        wbdVar.onFinish(i);
                    }
                }
            }
            j(str);
        }
        k(str);
    }

    public final synchronized void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && ((HashMap) this.b).containsKey(str)) {
                for (WeakReference weakReference : (List) ((HashMap) this.b).get(str)) {
                    wbd wbdVar = (wbd) weakReference.get();
                    if (wbdVar != null) {
                        wbdVar.onProgress(i);
                    } else {
                        j(str);
                    }
                }
            }
        } catch (AbstractMethodError unused) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "IPreDownloadListener has't onProgress method");
        }
    }

    public void h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf444de", new Object[]{this, str, new Integer(i)});
        } else {
            this.f27468a.sendMessage(Message.obtain(this.f27468a, 1, i, 0, str));
        }
    }

    public void i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920100f8", new Object[]{this, str, new Integer(i)});
        } else {
            this.f27468a.sendMessage(Message.obtain(this.f27468a, 2, i, 0, str));
        }
    }

    public synchronized void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158785e9", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str) && ((HashMap) this.b).containsKey(str)) {
            ((HashMap) this.b).remove(str);
        }
    }

    public synchronized void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7b9e8e", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str) && ((HashMap) this.d).containsKey(str)) {
            String str2 = (String) ((HashMap) this.d).get(str);
            ((HashMap) this.d).remove(str);
            if (!TextUtils.isEmpty(str2)) {
                ((HashMap) this.c).remove(str2);
            }
        }
    }

    public synchronized void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ddcea80", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str) && ((HashMap) this.c).containsKey(str)) {
            String str2 = (String) ((HashMap) this.c).get(str);
            ((HashMap) this.c).remove(str);
            if (!TextUtils.isEmpty(str)) {
                ((HashMap) this.d).remove(str2);
            }
        }
    }
}
