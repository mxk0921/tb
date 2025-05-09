package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f27877a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f27878a = true;
        public boolean b = true;
        public boolean c = true;
        public boolean d = true;
        public boolean e = true;
        public int f = 0;
        public float g = 0.4f;
        public float h = 0.6f;
        public float i = 5.0f;
        public int j = 3;
        public int k = 3;

        static {
            t2o.a(468713930);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ace0bd8b", new Object[]{aVar})).booleanValue();
            }
            return aVar.f27878a;
        }

        public static /* synthetic */ boolean b(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc5cbdef", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.f27878a = z;
            return z;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("909fad8c", new Object[]{aVar})).booleanValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ int d(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("677dbf7e", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.k = i;
            return i;
        }

        public static /* synthetic */ boolean e(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("607bce0e", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.d = z;
            return z;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("745e9d8d", new Object[]{aVar})).booleanValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ boolean g(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f49ade2d", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.e = z;
            return z;
        }

        public static /* synthetic */ boolean h(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88b9ee4c", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.b = z;
            return z;
        }

        public static /* synthetic */ boolean i(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1cd8fe6b", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.c = z;
            return z;
        }

        public static /* synthetic */ int j(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b0f7cea8", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.f = i;
            return i;
        }

        public static /* synthetic */ float k(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4516d381", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.g = f;
            return f;
        }

        public static /* synthetic */ float l(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d935e3a0", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.h = f;
            return f;
        }

        public static /* synthetic */ float m(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6d54f3bf", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.i = f;
            return f;
        }

        public static /* synthetic */ int n(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1740f24", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.j = i;
            return i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "OrangeData{needRebuildWeex=" + this.f27878a + ", rebuildWeexImmediately=" + this.b + ", rebuildThread=" + this.c + ", rebuildWeexWhenJSException=" + this.d + ", checkInstance=" + this.e + ", checkInterval=" + this.f + ", singlePingCostThrehold=" + this.g + ", levelOneTimeout=" + this.h + ", levelTwoTimeout=" + this.i + ", pingCount=" + this.j + ", threadCount=" + this.k + '}';
        }
    }

    static {
        t2o.a(468713929);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fcdb3c8", new Object[0])).booleanValue();
        }
        return a.f(f27877a);
    }

    public static void b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e1d487", new Object[0]);
            return;
        }
        int intValue = od0.D().i().m(o.J()).getIntValue("deviceLevel");
        if (intValue == 0) {
            str = "ShortVideo.weexV2CheckMsgPileConfig_h_v2";
        } else if (intValue == 1) {
            str = "ShortVideo.weexV2CheckMsgPileConfig_m_v2";
        } else {
            str = "ShortVideo.weexV2CheckMsgPileConfig_l_v2";
        }
        f27877a = new a();
        String H2 = akt.H2(str, null);
        if (!TextUtils.isEmpty(H2)) {
            JSONObject parseObject = JSON.parseObject(H2);
            if (parseObject != null) {
                a.b(f27877a, nwv.o(parseObject.getString("needRebuildWeex"), true));
                a.h(f27877a, nwv.o(parseObject.getString("rebuildWeexImmediately"), true));
                a.i(f27877a, nwv.o(parseObject.getString("rebuildThread"), true));
                a.e(f27877a, nwv.o(parseObject.getString("rebuildWeexWhenJSException"), true));
                a.g(f27877a, nwv.o(parseObject.getString("checkInstance"), true));
                a.j(f27877a, nwv.t(parseObject.getString("checkInterval"), 0));
                a.k(f27877a, nwv.q(parseObject.getString("singlePingCostThrehold"), 0.4f));
                a.l(f27877a, nwv.q(parseObject.getString("levelOneTimeout"), 0.6f));
                a.m(f27877a, nwv.r(parseObject.getString("levelTwoTimeout"), 5));
                a.n(f27877a, nwv.t(parseObject.getString("pingCount"), 3));
                a.d(f27877a, nwv.t(parseObject.getString("threadCount"), 3));
            } else {
                return;
            }
        }
        ir9.b("WeexThreadOrangeHelper", "CardWeeXV2MessageHandler getWeexV2CheckMsgPileConfig " + f27877a.toString());
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bc2f41", new Object[0]);
        } else if (f27877a == null) {
            b();
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ecf25d1", new Object[0])).booleanValue();
        }
        return a.a(f27877a);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc955bbb", new Object[0])).booleanValue();
        }
        return a.c(f27877a);
    }
}
