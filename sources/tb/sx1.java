package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.rgi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class sx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, rgi> f28332a;
    public rgi.a b;
    public rgi c;
    public boolean d;
    public final feh e = new feh(toString(), "Global");

    static {
        t2o.a(774897923);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : this.f28332a.snapshot().keySet()) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public rgi b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgi) ipChange.ipc$dispatch("9a474efb", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.c != null) {
            rgi rgiVar = new rgi(str);
            rgi rgiVar2 = this.c;
            rgiVar.h = rgiVar2.h;
            rgiVar.b = rgiVar2.b;
            rgiVar.c = rgiVar2.c;
            rgiVar.d = rgiVar2.d;
            rgiVar.j = rgiVar2.j;
            rgiVar.i = rgiVar2.i;
            this.c = null;
            return rgiVar;
        }
        rgi rgiVar3 = new rgi(str, this.b);
        this.b = null;
        return rgiVar3;
    }

    public void c(boolean z, String str, rgi rgiVar) {
        List<rgi.a> list;
        rgi.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0bc7b", new Object[]{this, new Boolean(z), str, rgiVar});
        } else if (!TextUtils.isEmpty(str) && rgiVar != null && (list = rgiVar.h) != null && !this.d) {
            rgi.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.release(true);
                this.b = null;
            } else if (list.size() > 0 && rgiVar.f != null && (aVar = rgiVar.h.get(0)) != null) {
                rgiVar.b = aVar.getCurrentPosition();
                rgiVar.c = rgiVar.e;
                rgiVar.d = true;
                rgiVar.e = aVar.getDestoryState();
                aVar.release(true);
            }
        }
    }

    public Map<String, rgi> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ffa20a8", new Object[]{this});
        }
        h();
        return this.f28332a.snapshot();
    }

    public abstract int e();

    public rgi f(String str, rgi.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgi) ipChange.ipc$dispatch("fc92b57c", new Object[]{this, str, aVar});
        }
        if (TextUtils.isEmpty(str) || aVar == null) {
            return null;
        }
        h();
        Map<String, rgi> snapshot = this.f28332a.snapshot();
        if (snapshot.size() == e()) {
            j();
        }
        for (String str2 : snapshot.keySet()) {
            if (str.equals(str2)) {
                rgi rgiVar = this.f28332a.get(str2);
                if (rgiVar.h == null) {
                    rgiVar.h = new LinkedList();
                }
                if (!rgiVar.h.contains(aVar)) {
                    rgiVar.h.add(0, aVar);
                }
                return rgiVar;
            }
        }
        this.b = aVar;
        return this.f28332a.get(str);
    }

    public rgi g(rgi rgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgi) ipChange.ipc$dispatch("b4f2e5cf", new Object[]{this, rgiVar});
        }
        if (rgiVar == null || TextUtils.isEmpty(rgiVar.f27360a)) {
            return rgiVar;
        }
        if (this.f28332a == null) {
            this.f28332a = new ngi(e());
        }
        Map<String, rgi> snapshot = this.f28332a.snapshot();
        if (snapshot.size() == e()) {
            j();
        }
        for (String str : snapshot.keySet()) {
            if (rgiVar.f27360a.equals(str)) {
                return this.f28332a.get(str);
            }
        }
        this.c = rgiVar;
        return this.f28332a.get(rgiVar.f27360a);
    }

    public abstract void h();

    public void i(String str, rgi.a aVar) {
        rgi rgiVar;
        List<rgi.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ceeb12", new Object[]{this, str, aVar});
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : this.f28332a.snapshot().keySet()) {
                if (str.equals(str2) && (list = (rgiVar = this.f28332a.get(str2)).h) != null) {
                    list.remove(aVar);
                    if (rgiVar.h.size() == 0) {
                        this.b = aVar;
                        this.f28332a.remove(str);
                    }
                }
            }
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8f34951", new Object[]{this})).booleanValue();
        }
        LruCache<String, rgi> lruCache = this.f28332a;
        if (lruCache == null || lruCache.size() >= e()) {
            return false;
        }
        return true;
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7e7acc", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return d().size();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7523da98", new Object[]{this});
            return;
        }
        LruCache<String, rgi> lruCache = this.f28332a;
        if (lruCache != null) {
            Map<String, rgi> snapshot = lruCache.snapshot();
            if (!snapshot.isEmpty()) {
                try {
                    for (rgi rgiVar : snapshot.values()) {
                        List<rgi.a> list = rgiVar.h;
                        if (list != null && list.size() > 0 && rgiVar.h.get(0).isVisible()) {
                            feh fehVar = this.e;
                            AVSDKLog.e(fehVar, "recycler " + rgiVar.h.get(0) + " is Visible");
                            this.f28332a.get(rgiVar.f27360a);
                        }
                    }
                    for (rgi rgiVar2 : snapshot.values()) {
                        List<rgi.a> list2 = rgiVar2.h;
                        if (list2 != null && list2.size() > 0 && rgiVar2.h.get(0).isPlaying()) {
                            this.f28332a.get(rgiVar2.f27360a);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
