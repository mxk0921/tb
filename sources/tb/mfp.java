package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheEventListener;
import com.taobao.alivfssdk.fresco.cache.common.a;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mfp implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ps2 f24020a;
    public long b;
    public IOException c;

    static {
        t2o.a(374341735);
        t2o.a(374341695);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcdafec1", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public IOException b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOException) ipChange.ipc$dispatch("eae72684", new Object[]{this});
        }
        return this.c;
    }

    public mfp c(ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfp) ipChange.ipc$dispatch("bb900d07", new Object[]{this, ps2Var});
        }
        this.f24020a = ps2Var;
        return this;
    }

    public mfp d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfp) ipChange.ipc$dispatch("4cdae606", new Object[]{this, new Long(j)});
        }
        return this;
    }

    public mfp e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfp) ipChange.ipc$dispatch("26814c40", new Object[]{this, new Long(j)});
        }
        return this;
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ce4ca3", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public mfp g(CacheEventListener.EvictionReason evictionReason) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfp) ipChange.ipc$dispatch("7179179f", new Object[]{this, evictionReason});
        }
        return this;
    }

    public mfp h(IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfp) ipChange.ipc$dispatch("13785884", new Object[]{this, iOException});
        }
        this.c = iOException;
        return this;
    }

    public mfp i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfp) ipChange.ipc$dispatch("32549dcb", new Object[]{this, new Long(j)});
        }
        return this;
    }

    public mfp j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mfp) ipChange.ipc$dispatch("a923f100", new Object[]{this, str});
        }
        return this;
    }
}
