package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchDoorContext f16795a;
    public final vnd b;
    public final a c;
    public boolean d = true;

    static {
        t2o.a(815793112);
    }

    public c2p(SearchDoorContext searchDoorContext, vnd vndVar, a aVar) {
        this.f16795a = searchDoorContext;
        this.b = vndVar;
        this.c = aVar;
    }

    public SearchDoorContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorContext) ipChange.ipc$dispatch("78270159", new Object[]{this});
        }
        return this.f16795a;
    }

    public vnd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vnd) ipChange.ipc$dispatch("ba684f3c", new Object[]{this});
        }
        return this.b;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fb3b3a9", new Object[]{this});
        }
        return this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f122fd6b", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a074585", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }
}
