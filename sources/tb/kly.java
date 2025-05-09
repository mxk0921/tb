package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.xjy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class kly implements xjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f22750a = "";

    static {
        t2o.a(839909583);
        t2o.a(839909561);
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            xjy.a.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            xjy.a.b(this);
        }
    }

    @Override // tb.xjy
    public String getRealUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbf55f1e", new Object[]{this});
        }
        return this.f22750a;
    }

    @Override // tb.xjy
    public void setRealUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ba0d80", new Object[]{this, str});
            return;
        }
        ckf.g(str, "realUrl");
        this.f22750a = str;
    }
}
