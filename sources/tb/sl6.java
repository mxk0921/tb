package tb;

import android.util.Pair;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray;
import com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXReadWriteLongSparseArray<nvb> f28127a;
    public DXLongSparseArray<ivb> b;
    public SparseArray<byte[]> c;
    public SparseArray<Object> d;
    public Map<String, twb> g;
    public yub h;
    public Map<Integer, List<DXExtensionSectionLoader.a>> j;
    public List<ac5> l;
    public Map<String, yl6> e = Collections.synchronizedMap(new LinkedHashMap());
    public List<og5> f = new ArrayList();
    public b i = new b(this);
    public a k = new a(this);
    public float m = 1.0f;
    public float n = 1.0f;
    public int o = 0;
    public int p = 0;
    public float q = 0.0f;
    public float r = 0.0f;
    public float s = 0.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public DXNativeLogicEngine f28128a;

        static {
            t2o.a(444597965);
        }

        public a(sl6 sl6Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public List<Pair<String, byte[]>> f28129a;

        static {
            t2o.a(444597966);
        }

        public b(sl6 sl6Var) {
        }
    }

    static {
        t2o.a(444597964);
    }

    public void A(DXReadWriteLongSparseArray<nvb> dXReadWriteLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fe5024", new Object[]{this, dXReadWriteLongSparseArray});
        } else {
            this.f28127a = dXReadWriteLongSparseArray;
        }
    }

    public void B(SparseArray<byte[]> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a05d15b", new Object[]{this, sparseArray});
        } else {
            this.c = sparseArray;
        }
    }

    public void C(List<Pair<String, byte[]>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("235cda5e", new Object[]{this, list});
        } else {
            this.i.f28129a = list;
        }
    }

    public void D(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a085950", new Object[]{this, new Float(f)});
        } else {
            this.q = f;
        }
    }

    public void E(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e51ca6f", new Object[]{this, new Float(f)});
        } else {
            this.r = f;
        }
    }

    public void F(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429b3b8e", new Object[]{this, new Float(f)});
        } else {
            this.s = f;
        }
    }

    public void G(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7e0b58", new Object[]{this, new Float(f)});
        } else {
            this.m = f;
        }
    }

    public void H(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c77c77", new Object[]{this, new Float(f)});
        } else {
            this.n = f;
        }
    }

    public void I(Map<String, twb> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0ed971", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ffc4c2", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4935e1", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void L(Map<String, yl6> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c5a54b", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public sl6 a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sl6) ipChange.ipc$dispatch("c0678cc0", new Object[]{this, new Boolean(z)});
        }
        sl6 sl6Var = new sl6();
        sl6Var.f28127a = this.f28127a;
        sl6Var.b = this.b;
        sl6Var.c = this.c;
        sl6Var.d = this.d;
        sl6Var.f = this.f;
        sl6Var.g = this.g;
        sl6Var.h = this.h;
        sl6Var.i = this.i;
        sl6Var.j = this.j;
        sl6Var.k = this.k;
        Map<String, yl6> map = this.e;
        if (map == null) {
            return sl6Var;
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            sl6Var.e = linkedHashMap;
            for (Map.Entry<String, yl6> entry : this.e.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().c());
            }
            if (this.l != null) {
                ArrayList arrayList = new ArrayList();
                sl6Var.l = arrayList;
                for (ac5 ac5Var : this.l) {
                    arrayList.add(ac5Var.a());
                }
            }
        } else {
            sl6Var.e = map;
            sl6Var.l = this.l;
        }
        sl6Var.m = this.m;
        sl6Var.n = this.n;
        sl6Var.o = this.o;
        sl6Var.p = this.p;
        sl6Var.q = this.q;
        sl6Var.r = this.r;
        sl6Var.s = this.s;
        return sl6Var;
    }

    public List<ac5> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30f31f08", new Object[]{this});
        }
        return this.l;
    }

    public SparseArray<Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("1db0e933", new Object[]{this});
        }
        return this.d;
    }

    public List<DXExtensionSectionLoader.a> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4f189f5", new Object[]{this});
        }
        Map<Integer, List<DXExtensionSectionLoader.a>> map = this.j;
        if (map == null) {
            return null;
        }
        return map.get(1);
    }

    public List<og5> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4d84c2d3", new Object[]{this});
        }
        return this.f;
    }

    public DXNativeLogicEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNativeLogicEngine) ipChange.ipc$dispatch("a0622788", new Object[]{this});
        }
        return this.k.f28128a;
    }

    public DXLongSparseArray<ivb> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("22bae186", new Object[]{this});
        }
        return this.b;
    }

    public DXReadWriteLongSparseArray<nvb> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXReadWriteLongSparseArray) ipChange.ipc$dispatch("2ca9cd9a", new Object[]{this});
        }
        return this.f28127a;
    }

    public SparseArray<byte[]> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("dd425d0d", new Object[]{this});
        }
        return this.c;
    }

    public yub j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yub) ipChange.ipc$dispatch("b586fbaa", new Object[]{this});
        }
        return this.h;
    }

    public List<Pair<String, byte[]>> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eea8402e", new Object[]{this});
        }
        return this.i.f28129a;
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37d58fec", new Object[]{this})).floatValue();
        }
        return this.q;
    }

    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc19feed", new Object[]{this})).floatValue();
        }
        return this.r;
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("605e6dee", new Object[]{this})).floatValue();
        }
        return this.s;
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9fd214c", new Object[]{this})).floatValue();
        }
        return this.m;
    }

    public float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e41904d", new Object[]{this})).floatValue();
        }
        return this.n;
    }

    public Map<String, twb> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("82e8f0bd", new Object[]{this});
        }
        return this.g;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("daccb48", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1f13a49", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public Map<String, yl6> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb64533b", new Object[]{this});
        }
        return this.e;
    }

    public void u(List<ac5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580a2fc4", new Object[]{this, list});
        } else {
            this.l = list;
        }
    }

    public void v(SparseArray<Object> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2e955d", new Object[]{this, sparseArray});
        } else {
            this.d = sparseArray;
        }
    }

    public void w(List<og5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5334f859", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    public void x(DXNativeLogicEngine dXNativeLogicEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cf72b2", new Object[]{this, dXNativeLogicEngine});
        } else {
            this.k.f28128a = dXNativeLogicEngine;
        }
    }

    public void y(DXLongSparseArray<ivb> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c061a8a0", new Object[]{this, dXLongSparseArray});
        } else {
            this.b = dXLongSparseArray;
        }
    }

    public void z(Map<Integer, List<DXExtensionSectionLoader.a>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7a78a4", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }
}
