package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static bkt c;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<qja> f16452a;
    public boolean b;

    static {
        t2o.a(404750699);
    }

    public bkt() {
        b();
    }

    public static bkt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bkt) ipChange.ipc$dispatch("b8fe4b19", new Object[0]);
        }
        if (c == null) {
            synchronized (bkt.class) {
                try {
                    if (c == null) {
                        c = new bkt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f16452a == null) {
            this.f16452a = new ArrayList<>();
        }
        this.f16452a.add(new k9t());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void f(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6d9e10", new Object[]{this, hashMap});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            this.b = a(hashMap);
        }
    }

    public final boolean a(HashMap<String, Object> hashMap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("656bbc4f", new Object[]{this, hashMap})).booleanValue();
        }
        try {
            String str = (String) hashMap.get(qja.IS_GRAY_VERSION);
            if (str != null) {
                z = Boolean.valueOf(str).booleanValue();
            } else {
                ArrayList<qja> arrayList = this.f16452a;
                if (arrayList != null) {
                    Iterator<qja> it = arrayList.iterator();
                    while (it.hasNext()) {
                        qja next = it.next();
                        if (next.b(hashMap) && next.a(hashMap)) {
                            break;
                        }
                    }
                }
                z = false;
            }
            return z;
        } catch (Throwable th) {
            TLog.loge("TestConfigUtils", "isGrayVersion exception", th);
            return false;
        }
    }
}
