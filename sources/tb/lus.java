package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import tb.ftt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lus INSTANCE = new lus();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f23580a = a.a(LazyThreadSafetyMode.PUBLICATION, new d1a() { // from class: tb.ius
        @Override // tb.d1a
        public final Object invoke() {
            boolean d;
            d = lus.d();
            return Boolean.valueOf(d);
        }
    });

    static {
        t2o.a(1003487238);
    }

    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("813bbe6b", new Object[0])).booleanValue();
        }
        return mhr.e0().getBoolean("enableKMPHttpNoInline", true);
    }

    public static /* synthetic */ void g(lus lusVar, String str, wyf wyfVar, u1a u1aVar, u1a u1aVar2, Map map, int i, Object obj) {
        u1a u1aVar3;
        u1a u1aVar4;
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe58706", new Object[]{lusVar, str, wyfVar, u1aVar, u1aVar2, map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            u1aVar3 = null;
        } else {
            u1aVar3 = u1aVar;
        }
        if ((i & 8) != 0) {
            u1aVar4 = null;
        } else {
            u1aVar4 = u1aVar2;
        }
        if ((i & 16) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        lusVar.f(str, wyfVar, u1aVar3, u1aVar4, map2);
    }

    public static final xhv h(wyf wyfVar, u1a u1aVar, String str, u1a u1aVar2, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("884825b8", new Object[]{wyfVar, u1aVar, str, u1aVar2, serializable});
        }
        mus musVar = new mus();
        ftt.a aVar = ftt.Companion;
        musVar.c(Long.valueOf(bvt.d(aVar)));
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(wyfVar.getSimpleName());
        pusVar.f(valueOf, "", "成功: model: " + serializable);
        if (serializable != null) {
            String valueOf2 = String.valueOf(wyfVar.getSimpleName());
            pusVar.f(valueOf2, "", "HttpResp ktModel: " + serializable);
            musVar.d(Long.valueOf(bvt.d(aVar)));
            if (u1aVar != null) {
                u1aVar.invoke(serializable, musVar);
            }
        } else {
            String valueOf3 = String.valueOf(((ns3) dun.b(INSTANCE.getClass())).getSimpleName());
            pusVar.g(valueOf3, "", "HttpResp Model Is Null，url= " + str);
            if (u1aVar2 != null) {
                u1aVar2.invoke(500, "HttpResp Model Is Null");
            }
        }
        return xhv.INSTANCE;
    }

    public static final xhv i(wyf wyfVar, u1a u1aVar, Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("5a0d674c", new Object[]{wyfVar, u1aVar, num, str});
        }
        pus pusVar = pus.INSTANCE;
        String valueOf = String.valueOf(wyfVar.getSimpleName());
        pusVar.g(valueOf, "", "失败: 错误代码: " + num + ", 消息: " + str);
        if (u1aVar != null) {
            u1aVar.invoke(num, str);
        }
        return xhv.INSTANCE;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d2cc622", new Object[]{this})).booleanValue();
        }
        return ((Boolean) f23580a.getValue()).booleanValue();
    }

    public final <T extends Serializable> void f(final String str, final wyf<T> wyfVar, final u1a<? super T, ? super mus, xhv> u1aVar, final u1a<? super Integer, ? super String, xhv> u1aVar2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b910939", new Object[]{this, str, wyfVar, u1aVar, u1aVar2, map});
            return;
        }
        ckf.g(str, "url");
        ckf.g(wyfVar, "clazz");
        Map<String, String> k = kotlin.collections.a.k(jpu.a(pg1.ATOM_callee, "KMP"));
        if (map != null) {
            k.putAll(map);
        }
        mhr.X().c(str, new g1a() { // from class: tb.jus
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv h;
                u1a u1aVar3 = u1aVar;
                String str2 = str;
                h = lus.h(wyf.this, u1aVar3, str2, u1aVar2, (Serializable) obj);
                return h;
            }
        }, new u1a() { // from class: tb.kus
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                xhv i;
                i = lus.i(wyf.this, u1aVar2, (Integer) obj, (String) obj2);
                return i;
            }
        }, k, wyfVar);
    }
}
