package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s16 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, byte[]> f27740a = new LruCache<>(500);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXRuntimeContext f27741a;
        public boolean b;
        public DXTemplateItem c;
        public byte[] d;

        static {
            t2o.a(444596955);
        }

        public a(DXRuntimeContext dXRuntimeContext, boolean z) {
            this.f27741a = dXRuntimeContext;
            this.b = z;
        }

        public byte[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("3a3b0c4a", new Object[]{this});
            }
            return this.d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> map;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DXTemplateItem p = this.f27741a.p();
                h36.a("isMainTemplate:" + this.b + ":" + JSON.toJSONString(p) + " pack " + JSON.toJSONString(p.k));
                xh6 xh6Var = p.k;
                if (!(xh6Var == null || (map = xh6Var.b) == null)) {
                    if (this.b) {
                        str = map.get("index.dx");
                    } else {
                        str = map.get(p.f7343a + "_" + p.b + "_index.dx");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        h36.a(str);
                        byte[] g = dx5.d().g(str, this.f27741a);
                        this.d = g;
                        if (g != null) {
                            h36.a("isMainTemplate:" + this.b + ": 设置对应模版的js信息" + str);
                            s16.c().d(this.c, this.d);
                        }
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final s16 f27742a = new s16();

        static {
            t2o.a(444596956);
        }

        public static /* synthetic */ s16 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s16) ipChange.ipc$dispatch("4cc2e55e", new Object[0]);
            }
            return f27742a;
        }
    }

    static {
        t2o.a(444596954);
    }

    public static s16 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s16) ipChange.ipc$dispatch("785e14b9", new Object[0]);
        }
        return b.a();
    }

    public final String a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c26903f2", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        return dXTemplateItem.d();
    }

    public byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3bfd20", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c().f27740a.get(str);
    }

    public void d(DXTemplateItem dXTemplateItem, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e576eea", new Object[]{this, dXTemplateItem, bArr});
        } else {
            e(a(dXTemplateItem), bArr);
        }
    }

    public void e(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f98c3cb", new Object[]{this, str, bArr});
        } else if (!TextUtils.isEmpty(str) && bArr != null) {
            c().f27740a.put(str, bArr);
        }
    }
}
