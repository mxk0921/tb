package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.zr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, a> f16585a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f16586a;
        public double b;
        public final HashMap<String, Integer> c;
        public final HashMap<String, Integer> d;

        public a(HashMap<String, Integer> hashMap, HashMap<String, Integer> hashMap2, double d, double d2) {
            this.c = hashMap;
            this.d = hashMap2;
            this.f16586a = d;
            this.b = d2;
        }
    }

    public void a(zr.d dVar, HashMap<String, a> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3494baf3", new Object[]{this, dVar, hashMap});
        } else if (hashMap == null) {
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            if (dVar.f32961a.d) {
                hashMap2.put(dVar.f32961a.c, 1);
            } else {
                hashMap3.put(dVar.f32961a.c, 1);
            }
            hashMap.put(dVar.f32961a.b, new a(hashMap2, hashMap3, dVar.b.doubleValue(), dVar.c.doubleValue()));
        } else {
            a aVar = hashMap.get(dVar.f32961a.b);
            if (aVar == null) {
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                if (dVar.f32961a.d) {
                    hashMap4.put(dVar.f32961a.c, 1);
                } else {
                    hashMap5.put(dVar.f32961a.c, 1);
                }
                hashMap.put(dVar.f32961a.b, new a(hashMap4, hashMap5, dVar.b.doubleValue(), dVar.c.doubleValue()));
            } else if (dVar.f32961a.d) {
                aVar.f16586a += dVar.b.doubleValue();
                if (aVar.c.get(dVar.f32961a.c) == null) {
                    aVar.c.put(dVar.f32961a.c, 1);
                } else {
                    aVar.c.put(dVar.f32961a.c, Integer.valueOf(aVar.c.get(dVar.f32961a.c).intValue() + 1));
                }
            } else {
                aVar.b += dVar.c.doubleValue();
                if (aVar.d.get(dVar.f32961a.c) == null) {
                    aVar.d.put(dVar.f32961a.c, 1);
                } else {
                    aVar.d.put(dVar.f32961a.c, Integer.valueOf(aVar.d.get(dVar.f32961a.c).intValue() + 1));
                }
            }
        }
    }
}
