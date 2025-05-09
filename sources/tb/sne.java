package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ImagePreviewContainerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class sne {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public List<tne> f28158a;
    public int b;
    public final vne c;
    public String d;
    public final lne e;
    public final boolean f;
    public final boolean g;
    public final mne h;
    public final mne i;
    public final mne j;
    public final une k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337224);
        }

        public a() {
        }

        @JvmStatic
        public final sne a(List<tne> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sne) ipChange.ipc$dispatch("e99046fb", new Object[]{this, list});
            }
            ckf.g(list, "sources");
            sne sneVar = new sne((a07) null);
            sneVar.f28158a = list;
            return sneVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337223);
    }

    public sne() {
        this.f28158a = yz3.i();
        this.d = "PAGE";
    }

    @JvmStatic
    public static final sne a(List<tne> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sne) ipChange.ipc$dispatch("e99046fb", new Object[]{list});
        }
        return Companion.a(list);
    }

    public /* synthetic */ sne(a07 a07Var) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sne(Map<String, ? extends Object> map) {
        this();
        une uneVar;
        List<Object> o = MegaUtils.o(map, "sources");
        if (o != null) {
            List<Object> list = o;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                uneVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    if (next instanceof Map) {
                        uneVar = next;
                    }
                    arrayList.add(new tne((Map) uneVar));
                } catch (Exception e) {
                    throw new RuntimeException("sources 参数类型错误， 必须是 List<ImagePreviewSourceParam> 类型！" + e.getMessage());
                }
            }
            this.f28158a = arrayList;
            boolean z = false;
            Integer m = MegaUtils.m(map, "index", 0);
            this.b = m != null ? m.intValue() : 0;
            this.c = (map == null || !map.containsKey("config")) ? null : new vne(MegaUtils.s(map, "config"));
            String str = "PAGE";
            String a2 = ImagePreviewContainerType.Companion.a(MegaUtils.x(map, "containerType", str));
            this.d = a2 != null ? a2 : str;
            this.e = (map == null || !map.containsKey("animation")) ? null : new lne(MegaUtils.s(map, "animation"));
            Boolean bool = Boolean.FALSE;
            Boolean h = MegaUtils.h(map, "hideImageGradientMask", bool);
            this.f = h != null ? h.booleanValue() : false;
            Boolean h2 = MegaUtils.h(map, "hideVideoGradientMask", bool);
            this.g = h2 != null ? h2.booleanValue() : z;
            this.h = (map == null || !map.containsKey("upperExtensionParams")) ? null : new mne(MegaUtils.s(map, "upperExtensionParams"));
            this.i = (map == null || !map.containsKey("lowerExtensionParams")) ? null : new mne(MegaUtils.s(map, "lowerExtensionParams"));
            this.j = (map == null || !map.containsKey("combinedExtensionParams")) ? null : new mne(MegaUtils.s(map, "combinedExtensionParams"));
            if (map != null && map.containsKey("topRightExtensionParams")) {
                uneVar = new une(MegaUtils.s(map, "topRightExtensionParams"));
            }
            this.k = uneVar;
            return;
        }
        throw new RuntimeException("sources 参数必传！");
    }
}
