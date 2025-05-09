package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.phenix.compat.PhenixInitializer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kt0 implements cq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fdb f22898a;
    public final String b;
    public lt0 c;

    public kt0(String str) {
        if (TextUtils.isEmpty(str)) {
            this.b = "phximgs_KV";
            return;
        }
        this.b = "phximgs_KV_" + str;
    }

    public void e(lt0 lt0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667f07cf", new Object[]{this, lt0Var});
        } else {
            this.c = lt0Var;
        }
    }

    @Override // tb.cq7
    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        fdb fdbVar = this.f22898a;
        if (fdbVar != null) {
            return (String) fdbVar.d0(str);
        }
        xv8.b(6, "AlivfsDiskKV", "please call init before use!!!");
        return "";
    }

    @Override // tb.cq7
    public void init() {
        np cacheForModule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.f22898a == null && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule(this.b)) != null) {
            op opVar = new op();
            opVar.f25538a = Long.valueOf(2097152);
            cacheForModule.L(opVar);
            this.f22898a = cacheForModule.C();
        }
    }

    @Override // tb.cq7
    public boolean c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e68da68", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        if (this.f22898a != null) {
            long a2 = a();
            if (a2 > 0) {
                return this.f22898a.N(str, String.valueOf(a2 + j));
            }
            return false;
        }
        xv8.b(6, "AlivfsDiskKV", "please call init before use!!!");
        return false;
    }

    @Override // tb.cq7
    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf132b", new Object[]{this})).longValue();
        }
        try {
            lt0 lt0Var = this.c;
            if (lt0Var != null) {
                return ((PhenixInitializer.f) lt0Var).a();
            }
            return -1L;
        } catch (Exception e) {
            xv8.c("TTL", "ttl getCurrentTime error=%s", e);
            return -1L;
        }
    }

    @Override // tb.cq7
    public boolean b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9f3bc92", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            lt0 lt0Var = this.c;
            if (lt0Var != null) {
                return ((PhenixInitializer.f) lt0Var).b(j);
            }
            return false;
        } catch (Exception e) {
            xv8.c("TTL", "ttl isExpectedTime error=%s", e);
            return false;
        }
    }

    @Override // tb.cq7
    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3b21db", new Object[]{this, str})).booleanValue();
        }
        try {
            if (this.c == null || TextUtils.isEmpty(str)) {
                return false;
            }
            return ((PhenixInitializer.f) this.c).c(str);
        } catch (Exception e) {
            xv8.c("TTL", "ttl isTTLDomain error=%s", e);
            return false;
        }
    }
}
