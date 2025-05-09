package tb;

import android.app.Application;
import android.net.Uri;
import androidx.core.util.Pair;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import com.taobao.zcache.ResourceResponse;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, b> f28555a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends mqo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28556a;
        public final /* synthetic */ b b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* renamed from: tb.t7x$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C1060a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1060a() {
            }

            public static /* synthetic */ Object ipc$super(C1060a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/downloader/WeexPreDownloader$1$1");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                } else {
                    t7x.a(a.this.c);
                }
            }
        }

        public a(String str, b bVar, String str2) {
            this.f28556a = str;
            this.b = bVar;
            this.c = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/downloader/WeexPreDownloader$1");
        }

        @Override // tb.mqo
        public void a(ResourceResponse resourceResponse) {
            rpc.c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5b31fc5", new Object[]{this, resourceResponse});
            } else if (resourceResponse == null) {
                c("PARSE_02", "ZCache response null");
            } else {
                Error error = resourceResponse.getError();
                if (error != null) {
                    c("PARSE_02", "ZCacheError(" + error.getCode() + "): " + error.getMessage());
                    return;
                }
                byte[] data = resourceResponse.getData();
                if (data == null || data.length == 0) {
                    c("PARSE_02", "ZCache response bytes empty");
                    return;
                }
                boolean isAllFromCache = resourceResponse.isAllFromCache();
                String str = resourceResponse.getHeader().get("X-ZCache-Info");
                dwh.p(gxh.LOG_TAG, "Http pre-request by zcache success: " + this.f28556a + ", isCache: " + isAllFromCache + ", zcacheInfo: " + str);
                if (isAllFromCache) {
                    cVar = rpc.c.b(data, this.f28556a, "zcache", str);
                } else {
                    cVar = rpc.c.c(data, this.f28556a, jxh.b(), str);
                }
                b.a(this.b, cVar);
                d();
            }
        }

        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            dwh.f(gxh.LOG_TAG, "Http pre-request failed, code: " + str + ", msg: " + str2);
            t7x.a(this.c);
            b.b(this.b, str, str2);
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10099a51", new Object[]{this});
            } else {
                hxh.e(new C1060a(), RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f28557a;
        public final String b;
        public rpc.c c;
        public String d;
        public String e;
        public final List<lu7> f = new LinkedList();

        static {
            t2o.a(982515871);
        }

        public b(String str) {
            this.b = str;
        }

        public static /* synthetic */ void a(b bVar, rpc.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e103f281", new Object[]{bVar, cVar});
            } else {
                bVar.e(cVar);
            }
        }

        public static /* synthetic */ void b(b bVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b115182b", new Object[]{bVar, str, str2});
            } else {
                bVar.d(str, str2);
            }
        }

        public void c(lu7 lu7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e5d7e8", new Object[]{this, lu7Var});
                return;
            }
            synchronized (this) {
                try {
                    if (!this.f28557a) {
                        ((LinkedList) this.f).add(lu7Var);
                    } else if (this.c != null) {
                        dwh.p(gxh.LOG_TAG, "Http pre-request hit cache: " + this.b);
                        lu7Var.b(this.c);
                    } else {
                        dwh.f(gxh.LOG_TAG, "Http pre-request hit cached error: " + this.b);
                        lu7Var.a(this.d, this.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("473ddc54", new Object[]{this, str, str2});
                return;
            }
            synchronized (this) {
                try {
                    if (!this.f28557a) {
                        this.f28557a = true;
                        this.d = str;
                        this.e = str2;
                        dwh.p(gxh.LOG_TAG, "Http pre-request failed: " + this.b);
                        for (lu7 lu7Var : this.f) {
                            lu7Var.a(this.d, this.e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e(rpc.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efd26b8b", new Object[]{this, cVar});
                return;
            }
            synchronized (this) {
                try {
                    if (!this.f28557a) {
                        this.f28557a = true;
                        this.c = cVar;
                        dwh.p(gxh.LOG_TAG, "Http pre-request success: " + this.b);
                        for (lu7 lu7Var : this.f) {
                            lu7Var.b(this.c);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        t2o.a(982515868);
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            c(str);
        }
    }

    public static synchronized b b(String str) {
        synchronized (t7x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ad57b16c", new Object[]{str});
            }
            return (b) ((HashMap) f28555a).get(str);
        }
    }

    public static synchronized void c(String str) {
        synchronized (t7x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75b785fa", new Object[]{str});
            } else {
                ((HashMap) f28555a).remove(str);
            }
        }
    }

    public static void d(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96289659", new Object[]{application, str});
            return;
        }
        Pair<Uri, Integer> v = gxh.v(str);
        if (v == null) {
            dwh.f(gxh.LOG_TAG, "Template pre-request start error, url: " + str);
            return;
        }
        e(str, v.first.toString(), v);
    }

    public static synchronized b e(String str, String str2, Pair<Uri, Integer> pair) {
        synchronized (t7x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4bbce802", new Object[]{str, str2, pair});
            }
            Map<String, b> map = f28555a;
            b bVar = (b) ((HashMap) map).get(str2);
            if (bVar != null) {
                dwh.p(gxh.LOG_TAG, "Template pre-request start skip, already has one, url: " + str2);
                return bVar;
            }
            b bVar2 = new b(str);
            ((HashMap) map).put(str2, bVar2);
            dwh.p(gxh.LOG_TAG, "Http pre-request by zcache: " + str);
            yox.i(gxh.t(str, pair), new a(str, bVar2, str2));
            return bVar2;
        }
    }

    public static boolean f(String str, lu7 lu7Var) {
        b b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f12e1bd8", new Object[]{str, lu7Var})).booleanValue();
        }
        Pair<Uri, Integer> v = gxh.v(str);
        if (v == null || (b2 = b(v.first.toString())) == null) {
            return false;
        }
        b2.c(lu7Var);
        return true;
    }
}
