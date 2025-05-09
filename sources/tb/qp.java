package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qp implements nnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile fdb f26864a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements fdb.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ psk f26865a;

        public a(qp qpVar, psk pskVar) {
            this.f26865a = pskVar;
        }

        @Override // tb.fdb.i
        public void onObjectSetCallback(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c2b525a", new Object[]{this, str, new Boolean(z)});
            } else {
                this.f26865a.a(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements fdb.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ psk f26866a;

        public b(qp qpVar, psk pskVar) {
            this.f26866a = pskVar;
        }

        @Override // tb.fdb.g
        public void onObjectRemoveCallback(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbe537fc", new Object[]{this, str, new Boolean(z)});
            } else {
                this.f26866a.a(z);
            }
        }
    }

    public qp() {
        d();
    }

    @Override // tb.nnd
    public void a(String str, Object obj, psk pskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a534e660", new Object[]{this, str, obj, pskVar});
        } else {
            f26864a.m0(str, obj, new a(this, pskVar));
        }
    }

    @Override // tb.nnd
    public void b(String str, psk pskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c97b65a", new Object[]{this, str, pskVar});
        } else {
            f26864a.D(str, new b(this, pskVar));
        }
    }

    @Override // tb.nnd
    public Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3a030ef6", new Object[]{this, str});
        }
        return f26864a.d0(str);
    }

    public final nnd d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnd) ipChange.ipc$dispatch("30e01412", new Object[]{this});
        }
        return e("favorite_sdk");
    }

    public final nnd e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnd) ipChange.ipc$dispatch("6b3dfd9c", new Object[]{this, str});
        }
        if (f26864a == null) {
            synchronized (qp.class) {
                try {
                    if (f26864a == null) {
                        f26864a = AVFSCacheManager.getInstance().cacheForModule(str).Z(qp.class.getClassLoader()).L(new op()).w();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this;
    }
}
