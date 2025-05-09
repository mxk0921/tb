package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18603a;
    public long b;
    public String c;
    public String d;
    public int e = 10000;
    public ze4 f = ze4.FALSE;
    public final List<x80> g = new ArrayList();

    static {
        t2o.a(615514202);
    }

    public cio a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cio) ipChange.ipc$dispatch("838a9569", new Object[]{this});
        }
        return new w64(this.f18603a, this.b, this.c, this.d, this.f, this.g, this.e);
    }

    public eio b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eio) ipChange.ipc$dispatch("7129f862", new Object[]{this, str});
        }
        this.f18603a = str;
        return this;
    }

    public eio c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eio) ipChange.ipc$dispatch("6f38498b", new Object[]{this, new Integer(i)});
        }
        this.e = i;
        return this;
    }

    public eio d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eio) ipChange.ipc$dispatch("ad4853e0", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public eio e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eio) ipChange.ipc$dispatch("d427b2fc", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public eio f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eio) ipChange.ipc$dispatch("b35fcea7", new Object[]{this, new Long(j)});
        }
        this.b = j;
        return this;
    }

    public eio g(List<x80> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eio) ipChange.ipc$dispatch("b015f2cb", new Object[]{this, list});
        }
        if (list != null) {
            ((ArrayList) this.g).addAll(list);
        }
        return this;
    }

    public eio h(ze4 ze4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eio) ipChange.ipc$dispatch("68f8128c", new Object[]{this, ze4Var});
        }
        if (ze4Var != null) {
            this.f = ze4Var;
        }
        return this;
    }
}
