package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class enh<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public K f18697a;
    public V b;
    public int c;
    public int d;
    public enh<K, V> e;
    public enh<K, V> f;
    public boolean g;
    public boolean h;

    static {
        t2o.a(374341683);
    }

    public enh(K k, V v, int i) {
        b(k, v, i);
    }

    public void a(enh<K, V> enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad0af37", new Object[]{this, enhVar});
            return;
        }
        enh<K, V> enhVar2 = this.e;
        if (!(enhVar2 == null || enhVar2 == this)) {
            enhVar2.f = this.f;
        }
        enh<K, V> enhVar3 = this.f;
        if (!(enhVar3 == null || enhVar3 == this)) {
            enhVar3.e = enhVar2;
        }
        this.f = enhVar;
        enh<K, V> enhVar4 = enhVar.e;
        if (enhVar4 != null) {
            enhVar4.f = this;
        }
        this.e = enhVar4;
        enhVar.e = this;
    }

    public void b(K k, V v, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1935e4b5", new Object[]{this, k, v, new Integer(i)});
            return;
        }
        this.f18697a = k;
        this.b = v;
        this.d = 1;
        this.c = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LruNode@" + hashCode() + "[key:" + this.f18697a + ", value:" + this.b + ", visitCount:" + this.d + ", size:" + this.c + ", isColdNode:" + this.g + ", unlinked:false]";
    }
}
