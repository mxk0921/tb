package tb;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile tzt j;

    /* renamed from: a  reason: collision with root package name */
    public Object f29052a = null;
    public Object b = null;
    public Method c = null;
    public Object d = null;
    public Method e = null;
    public Method f = null;
    public boolean g = false;
    public String h = "";
    public boolean i = true;

    static {
        t2o.a(962592949);
    }

    public static tzt c() {
        tzt tztVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzt) ipChange.ipc$dispatch("20c6260", new Object[0]);
        }
        if (j != null) {
            return j;
        }
        synchronized (tzt.class) {
            try {
                if (j == null) {
                    j = new tzt();
                    j.d();
                }
                tztVar = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tztVar;
    }

    public byte[] a(String str) {
        Object obj;
        Method method = this.f;
        if (!(method == null || (obj = this.d) == null)) {
            try {
                Object invoke = method.invoke(obj, str);
                if (invoke == null) {
                    return null;
                }
                return (byte[]) invoke;
            } catch (Throwable th) {
                nhh.h(null, th, new Object[0]);
            }
        }
        return null;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2674e54d", new Object[]{this})).booleanValue();
        }
        if (!this.i) {
            return false;
        }
        nhh.r("", "mInitSecurityCheck", Boolean.valueOf(this.g));
        return this.g;
    }

    public int e(String str, byte[] bArr) {
        Object obj;
        Method method = this.e;
        if (method == null || (obj = this.d) == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(obj, str, bArr);
            if (invoke == null) {
                return 0;
            }
            Integer num = (Integer) invoke;
            int intValue = num.intValue();
            nhh.f("", rb.RESULT_KEY, num);
            return intValue;
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
            return -1;
        }
    }

    public final synchronized void d() {
        nhh.q();
        x4e q = o2w.k().q();
        if (q instanceof yzu) {
            this.g = false;
        }
        if (q != null) {
            IpChange ipChange = SecurityGuardManager.$ipChange;
            if (q instanceof v2v) {
                this.h = ((v2v) q).getAuthcode();
            }
            this.f29052a = SecurityGuardManager.class.getMethod("getInstance", Context.class).invoke(null, o2w.k().g());
            this.b = SecurityGuardManager.class.getMethod("getStaticDataEncryptComp", new Class[0]).invoke(this.f29052a, new Object[0]);
            this.d = SecurityGuardManager.class.getMethod("getDynamicDataStoreComp", new Class[0]).invoke(this.f29052a, new Object[0]);
            this.c = IStaticDataEncryptComponent.class.getMethod("staticBinarySafeDecryptNoB64", Integer.TYPE, String.class, byte[].class, String.class);
            this.e = IDynamicDataStoreComponent.class.getMethod("putByteArray", String.class, byte[].class);
            this.f = IDynamicDataStoreComponent.class.getMethod("getByteArray", String.class);
            this.g = true;
        }
    }

    public byte[] g(int i, String str, byte[] bArr) {
        Object obj;
        Method method = this.c;
        if (!(method == null || (obj = this.b) == null)) {
            try {
                Object invoke = method.invoke(obj, Integer.valueOf(i), str, bArr, this.h);
                nhh.m("", "mStaticDataEncryptCompObj", this.b, bmv.MSGTYPE_INTERVAL, Integer.valueOf(i), "str", str, "bArr", bArr, "authcode", this.h, IconCompat.EXTRA_OBJ, invoke);
                if (invoke == null) {
                    return null;
                }
                return (byte[]) invoke;
            } catch (Throwable th) {
                nhh.h(null, th, new Object[0]);
            }
        }
        return null;
    }
}
