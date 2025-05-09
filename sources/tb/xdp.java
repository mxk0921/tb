package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xdp extends b02<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Executor e;
    public final Class[] f;
    public final b02.b g;
    public String h;
    public final Object[] i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends b02.a<xdp, b, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Object[] d;
        public Class[] e;
        public b02.b f;

        static {
            t2o.a(676331659);
        }

        public b(Context context, String str) {
            super(context, str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/request/ServiceRequest$Builder");
        }

        @Override // tb.b02.a
        public void e() {
            Object[] objArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4060229d", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.b)) {
                Class[] clsArr = this.e;
                if (clsArr != null && this.d == null) {
                    throw new IllegalArgumentException("parameterTypes can not match instantce args!");
                } else if (clsArr == null && this.d != null) {
                    throw new IllegalArgumentException("parameterTypes can not match instantce args!");
                } else if (clsArr != null && (objArr = this.d) != null && clsArr.length != objArr.length) {
                    throw new IllegalArgumentException("parameterTypes can not match instantce args!");
                }
            } else {
                throw new IllegalArgumentException("className can not be empty!");
            }
        }

        public b f(b02.b<Object> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("92b26aeb", new Object[]{this, bVar});
            }
            this.f = bVar;
            return c();
        }

        /* renamed from: g */
        public xdp b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xdp) ipChange.ipc$dispatch("2cb4dabb", new Object[]{this});
            }
            return new xdp(this.f16107a, this.b, this.c, this.e, this.d, this.f, null);
        }

        public b h(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dee60f00", new Object[]{this, objArr});
            }
            this.d = objArr;
            return c();
        }

        public b i(Class<?>... clsArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f3f76230", new Object[]{this, clsArr});
            }
            this.e = clsArr;
            return c();
        }

        /* renamed from: j */
        public b c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c966140b", new Object[]{this});
            }
            return this;
        }
    }

    static {
        t2o.a(676331657);
    }

    public static /* synthetic */ Object ipc$super(xdp xdpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/request/ServiceRequest");
    }

    public static b l(Context context, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6f105b87", new Object[]{context, cls});
        }
        return new b(context, cls.getName());
    }

    @Override // tb.b02
    public b02.b<Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("1ecda33e", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.b02
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "service";
    }

    public Object[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("60d4303b", new Object[]{this});
        }
        return this.i;
    }

    public Executor i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[]{this});
        }
        return this.e;
    }

    public Class[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("9d194e71", new Object[]{this});
        }
        return this.f;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3fb7d15", new Object[]{this});
        }
        return this.h;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b6b401", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public xdp(Context context, String str, Bundle bundle, Class[] clsArr, Object[] objArr, b02.b bVar, Executor executor) {
        super(context, str, bundle);
        this.f = clsArr;
        this.i = objArr;
        this.g = bVar;
        this.e = executor;
    }
}
