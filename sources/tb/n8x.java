package tb;

import android.text.TextUtils;
import com.alibaba.ability.impl.file.FileAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n8x implements ede {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile fdb f24576a;
    public final String b;

    static {
        t2o.a(982515946);
        t2o.a(982515944);
    }

    public n8x(String str) {
        this.b = str;
    }

    @Override // tb.ede
    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94dbc8ae", new Object[]{this, str, obj})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str) || obj == null) {
                return false;
            }
            if (this.f24576a == null) {
                c();
            }
            return this.f24576a.N(str, obj);
        } catch (Throwable th) {
            dwh.h("WeexStorage", th);
            return false;
        }
    }

    @Override // tb.ede
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ae396f", new Object[]{this, str});
            return;
        }
        try {
            if (this.f24576a == null) {
                c();
            }
            this.f24576a.A0(str);
        } catch (Throwable th) {
            dwh.h("WeexStorage", th);
        }
    }

    public final synchronized boolean c() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2f1c0c6f", new Object[]{this})).booleanValue();
            }
            if (this.f24576a == null) {
                AVFSCacheManager instance = AVFSCacheManager.getInstance();
                np cacheForModule = instance.cacheForModule("WeexStorage_" + this.b, false);
                if (cacheForModule != null) {
                    op opVar = new op();
                    opVar.f25538a = Long.valueOf((long) FileAbility.MAX_FILE_SIZE);
                    cacheForModule.L(opVar);
                    this.f24576a = cacheForModule.w();
                }
            }
            if (this.f24576a != null) {
                z = true;
            }
            return z;
        }
    }

    @Override // tb.ede
    public Object load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("51b7551b", new Object[]{this, str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (this.f24576a == null) {
                c();
            }
            return this.f24576a.d0(str);
        } catch (Throwable th) {
            dwh.h("WeexStorage", th);
            return null;
        }
    }
}
