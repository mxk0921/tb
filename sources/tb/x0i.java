package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.StringUtils;
import com.ut.device.UTDevice;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x0i implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "MainProcessUpload";
    public static x0i c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31051a = false;
    public boolean b = false;

    static {
        t2o.a(962592821);
        t2o.a(962592825);
    }

    public x0i() {
        x2r.f().i(KEY, this);
        a(KEY, x2r.f().e(KEY));
    }

    public static synchronized x0i b() {
        synchronized (x0i.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x0i) ipChange.ipc$dispatch("45f0a7fd", new Object[0]);
            }
            if (c == null) {
                c = new x0i();
            }
            return c;
        }
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            d(str2);
        }
    }

    public synchronized boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        } else if (this.f31051a) {
            nhh.f("MainProcessUploadConfigListener", "bEnable", Boolean.valueOf(this.b));
            return this.b;
        } else {
            String a2 = iaq.a(vyp.i().g(), KEY);
            if (!TextUtils.isEmpty(a2)) {
                int parseInt = Integer.parseInt(a2);
                int abs = Math.abs(StringUtils.hashCode(UTDevice.getUtdid(vyp.i().g()))) % 10000;
                nhh.f("MainProcessUploadConfigListener", "utdidMod", Integer.valueOf(abs));
                this.b = abs < parseInt;
            } else {
                this.b = false;
            }
            this.f31051a = true;
            nhh.f("MainProcessUploadConfigListener", "bEnable", Boolean.valueOf(this.b));
            return this.b;
        }
    }

    public final synchronized void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("MainProcessUploadConfigListener", "parseConfig value", str);
        if (!TextUtils.isEmpty(str)) {
            String a2 = iaq.a(vyp.i().g(), KEY);
            nhh.f("MainProcessUploadConfigListener", "modSp", a2);
            if (!str.equalsIgnoreCase(a2)) {
                iaq.b(vyp.i().g(), KEY, str);
            }
        }
    }
}
