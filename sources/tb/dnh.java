package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dnh<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public K f17966a;
    public V b;
    public int c;
    public int d;
    public dnh<K, V> e;
    public dnh<K, V> f;
    public boolean g;
    public boolean h;

    static {
        t2o.a(620757031);
    }

    public dnh(K k, V v, int i) {
        b(k, v, i);
    }

    public void a(dnh<K, V> dnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128c276a", new Object[]{this, dnhVar});
            return;
        }
        dnh<K, V> dnhVar2 = this.e;
        if (!(dnhVar2 == null || dnhVar2 == this)) {
            dnhVar2.f = this.f;
        }
        dnh<K, V> dnhVar3 = this.f;
        if (!(dnhVar3 == null || dnhVar3 == this)) {
            dnhVar3.e = dnhVar2;
        }
        this.f = dnhVar;
        dnh<K, V> dnhVar4 = dnhVar.e;
        if (dnhVar4 != null) {
            dnhVar4.f = this;
        }
        this.e = dnhVar4;
        dnhVar.e = this;
    }

    public void b(K k, V v, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1935e4b5", new Object[]{this, k, v, new Integer(i)});
            return;
        }
        this.f17966a = k;
        this.b = v;
        this.d = 1;
        this.c = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LruNode@" + hashCode() + "[key:" + this.f17966a + ", value:" + this.b + ", visitCount:" + this.d + ", size:" + this.c + ", isColdNode:" + this.g + ", unlinked:false]";
    }
}
