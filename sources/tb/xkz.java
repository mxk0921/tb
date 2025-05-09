package tb;

import android.os.Looper;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xkz extends ktm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xmh<List<btm>> f31450a = new xmh<>();
    public final ReentrantLock d = new ReentrantLock();

    public static /* synthetic */ Object ipc$super(xkz xkzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preload/random/RandomPreloadTaskStore");
    }

    @Override // tb.ktm
    public btm a(String str) {
        String[] strArr;
        List<btm> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btm) ipChange.ipc$dispatch("e0f77701", new Object[]{this, str});
        }
        try {
            for (String str2 : this.b) {
                for (String str3 : this.c) {
                    LruCache<String, List<btm>> d = this.f31450a.d(str2, str3);
                    if (!(d == null || (list = d.get(str)) == null)) {
                        for (btm btmVar : list) {
                            if (!(btmVar == null || btmVar.a() || !TextUtils.isEmpty(btmVar.k))) {
                                return btmVar;
                            }
                        }
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            wsm.b(csm.a("RandomPreloadTaskStore"), "get cache error", e);
            return null;
        }
    }

    @Override // tb.ktm
    public btm d(btm btmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btm) ipChange.ipc$dispatch("a1228f80", new Object[]{this, btmVar});
        }
        try {
            LruCache<String, List<btm>> e = this.f31450a.e(btmVar);
            List<btm> list = e.get(btmVar.d);
            if (list == null) {
                list = new ArrayList<>();
                e.put(btmVar.d, list);
            }
            list.add(btmVar);
            if (cw6.b()) {
                String a2 = csm.a("RandomPreloadTaskStore");
                wsm.c(a2, "save cache success" + btmVar.toString());
            }
            String a3 = csm.a("RandomPreloadTaskStore");
            wsm.c(a3, "save cache success: cache_size:" + e.size() + "max_size:" + e.maxSize());
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            wsm.b(csm.a("RandomPreloadTaskStore"), "save cache error", e2);
            return null;
        }
    }

    @Override // tb.ktm
    public void f(String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea815dfc", new Object[]{this, str});
            return;
        }
        try {
            for (String str2 : this.b) {
                for (String str3 : this.c) {
                    LruCache<String, List<btm>> d = this.f31450a.d(str2, str3);
                    if (d != null) {
                        d.remove(str);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            wsm.b(csm.a("RandomPreloadTaskStore"), "get cache error", e);
        }
    }

    @Override // tb.ktm
    public btm g(String str, String str2) {
        Exception e;
        String[] strArr;
        List<btm> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btm) ipChange.ipc$dispatch("8d9eb90b", new Object[]{this, str, str2});
        }
        btm btmVar = null;
        try {
            try {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    this.d.lock();
                } else {
                    this.d.tryLock(1000L, TimeUnit.MILLISECONDS);
                }
                btm btmVar2 = null;
                for (String str3 : this.b) {
                    try {
                        for (String str4 : this.c) {
                            LruCache<String, List<btm>> d = this.f31450a.d(str3, str4);
                            if (!(d == null || (list = d.get(str)) == null)) {
                                for (btm btmVar3 : list) {
                                    if (btmVar3 != null && !btmVar3.a()) {
                                        if (TextUtils.equals(btmVar3.k, str2)) {
                                            this.d.unlock();
                                            return btmVar3;
                                        } else if (TextUtils.isEmpty(btmVar3.k) && btmVar == null) {
                                            btmVar = btmVar3;
                                        } else if (!TextUtils.isEmpty(btmVar3.k) && btmVar2 == null) {
                                            btmVar2 = btmVar3;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        btmVar = btmVar2;
                        e.printStackTrace();
                        wsm.b(csm.a("RandomPreloadTaskStore"), "get cache error", e);
                        this.d.unlock();
                        return btmVar;
                    }
                }
                if (btmVar != null) {
                    btmVar.k = str2;
                    this.d.unlock();
                    return btmVar;
                }
                if (btmVar2 != null) {
                    btmVar2.k = str2;
                }
                this.d.unlock();
                return btmVar2;
            } catch (Throwable th) {
                this.d.unlock();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
