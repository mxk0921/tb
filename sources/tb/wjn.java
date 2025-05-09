package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.request.Response;
import java.util.List;
import tb.drc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wjn<T> implements drc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final erc f30732a;
    public final List<drc> b;
    public final Class<T> c;
    public int d = -1;

    static {
        t2o.a(782237930);
        t2o.a(782237923);
    }

    public wjn(erc ercVar, Class<T> cls, List<drc> list) {
        this.f30732a = ercVar;
        this.c = cls;
        this.b = list;
    }

    public erc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (erc) ipChange.ipc$dispatch("ef19f0d6", new Object[]{this});
        }
        return this.f30732a;
    }

    public Class<T> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("57a5feb5", new Object[]{this});
        }
        return this.c;
    }

    public Response c(erc ercVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("e17ec971", new Object[]{this, ercVar});
        }
        int i = this.d + 1;
        this.d = i;
        if (i < this.b.size()) {
            return this.b.get(this.d).a(this);
        }
        return null;
    }
}
