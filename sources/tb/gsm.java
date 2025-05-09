package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long d = TimeUnit.SECONDS.toMillis(90);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Long> f20195a = new HashMap<>();
    public final LruCache<String, lgi> b = new LruCache<>(100);
    public final LruCache<String, mln> c = new LruCache<>(100);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gsm f20196a = new gsm();

        static {
            t2o.a(779093121);
        }

        public static /* synthetic */ gsm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gsm) ipChange.ipc$dispatch("4deb1257", new Object[0]);
            }
            return f20196a;
        }
    }

    static {
        t2o.a(779093120);
    }

    public static gsm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsm) ipChange.ipc$dispatch("180aeedc", new Object[0]);
        }
        return a.a();
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc074496", new Object[]{this, str});
        }
        mln mlnVar = this.c.get(str);
        if (mlnVar != null) {
            return mlnVar.f24123a;
        }
        return null;
    }

    public lgi c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgi) ipChange.ipc$dispatch("bf26ebf6", new Object[]{this, str});
        }
        d("查找预创建：" + str);
        return this.b.get(str);
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7c0831", new Object[]{this, str});
        }
    }

    public void e(String str, lgi lgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf00f69", new Object[]{this, str, lgiVar});
        } else if (str == null) {
            x5t.h("MediaPlayerPool", "直播间 id 为 空，should not happen！");
        } else {
            d("liveId : " + str + "\t");
            this.f20195a.put(str, Long.valueOf(System.currentTimeMillis()));
            this.b.put(str, lgiVar);
        }
    }

    public void f(String str, mln mlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62432499", new Object[]{this, str, mlnVar});
            return;
        }
        d("liveSource: " + str + "\t");
        mlnVar.b = System.currentTimeMillis() + d;
        this.c.put(str, mlnVar);
    }

    public boolean g(String str) {
        mln mlnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7c0b3f8", new Object[]{this, str})).booleanValue();
        }
        vnm c = vnm.c();
        if (!c.e(vnm.PRE_CREATE_ROOM_REC + str) || (mlnVar = this.c.get(str)) == null || mlnVar.b == 0) {
            return true;
        }
        if (System.currentTimeMillis() <= mlnVar.b) {
            return false;
        }
        this.c.remove(str);
        return true;
    }
}
