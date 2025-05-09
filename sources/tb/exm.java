package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class exm extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String b = "PriorityScheduler";
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 5;
    private static long f = 0;
    private static long g = 0;
    private static int h = 0;
    private static int i = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f18870a = new a(getLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/playerCachePriority/PriorityScheduler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                Map map = (Map) message.obj;
                String str = (String) map.get("videoId");
                String str2 = (String) map.get(VideoControllerManager.KEY_CACHEKEY);
                if (!TextUtils.isEmpty(str2)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean o = qmm.o(Globals.getApplication(), str, str2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (exm.a() < 5) {
                        exm.d(exm.c() + (currentTimeMillis2 - currentTimeMillis));
                        exm.b();
                        if (exm.a() == 5) {
                            exm.e(exm.this, "upgrade", exm.a(), exm.c());
                        }
                    }
                    ir9.b(exm.b, "提升优先级：" + str + "," + str2 + " => " + o + "||" + Thread.currentThread().getName());
                }
            } else if (i == 1) {
                Map map2 = (Map) message.obj;
                String str3 = (String) map2.get("videoId");
                String str4 = (String) map2.get(VideoControllerManager.KEY_CACHEKEY);
                if (!TextUtils.isEmpty(str4)) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    boolean b = qmm.b(Globals.getApplication(), str3, str4);
                    long currentTimeMillis4 = System.currentTimeMillis();
                    if (exm.f() < 5) {
                        exm.i(exm.h() + (currentTimeMillis4 - currentTimeMillis3));
                        exm.g();
                        if (exm.f() == 5) {
                            exm.e(exm.this, "degrade", exm.f(), exm.h());
                        }
                    }
                    ir9.b(exm.b, "降低优先级：" + str3 + "," + str4 + " => " + b + "||" + Thread.currentThread().getName());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final exm f18872a = new exm();

        static {
            t2o.a(468714690);
        }

        public static /* synthetic */ exm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (exm) ipChange.ipc$dispatch("c8d46790", new Object[0]);
            }
            return f18872a;
        }
    }

    static {
        t2o.a(468714688);
    }

    public exm() {
        super(b);
        start();
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return h;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f22cfeb3", new Object[0])).intValue();
        }
        int i2 = h;
        h = i2 + 1;
        return i2;
    }

    public static /* synthetic */ long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27ded", new Object[0])).longValue();
        }
        return f;
    }

    public static /* synthetic */ long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117691d", new Object[]{new Long(j)})).longValue();
        }
        f = j;
        return j;
    }

    public static /* synthetic */ void e(exm exmVar, String str, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5179c036", new Object[]{exmVar, str, new Integer(i2), new Long(j)});
        } else {
            exmVar.l(str, i2, j);
        }
    }

    public static /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906ef46e", new Object[0])).intValue();
        }
        return i;
    }

    public static /* synthetic */ int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90dfb076", new Object[0])).intValue();
        }
        int i2 = i;
        i = i2 + 1;
        return i2;
    }

    public static /* synthetic */ long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5552fb0", new Object[0])).longValue();
        }
        return g;
    }

    public static /* synthetic */ long i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8baefba", new Object[]{new Long(j)})).longValue();
        }
        g = j;
        return j;
    }

    public static /* synthetic */ Object ipc$super(exm exmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/playerCachePriority/PriorityScheduler");
    }

    public static exm k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (exm) ipChange.ipc$dispatch("2f017755", new Object[0]);
        }
        return b.a();
    }

    private void l(String str, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89510200", new Object[]{this, str, new Integer(i2), new Long(j)});
            return;
        }
        ryr.b(null, null, "playerCachePriority");
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("upgradeCount", Integer.valueOf(i2));
        hashMap.put("upgradeCostTime", Long.valueOf(j));
        ryr.d(null, null, "playerCachePriority", hashMap);
        ir9.b(b, "reportCostTime: " + str + " upgradeCount=" + i2 + " upgradeCostTime=" + j);
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63669e54", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("videoId", str);
        hashMap.put(VideoControllerManager.KEY_CACHEKEY, str2);
        Handler handler = this.f18870a;
        handler.sendMessage(Message.obtain(handler, 1, hashMap));
    }

    public void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364a548d", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("videoId", str);
        hashMap.put(VideoControllerManager.KEY_CACHEKEY, str2);
        Handler handler = this.f18870a;
        handler.sendMessage(Message.obtain(handler, 0, hashMap));
    }
}
