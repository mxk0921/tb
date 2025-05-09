package tb;

import android.content.Context;
import android.widget.Toast;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.redpackage.pop.FakeGuidePop;
import com.taobao.tab2interact.core.redpackage.pop.GuidePop;
import com.taobao.tab2interact.core.redpackage.pop.NewUserPop;
import com.taobao.tab2interact.core.redpackage.pop.RedpackageGuidePop;
import com.taobao.tab2interact.core.redpackage.pop.RedpackageResultPop;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yfm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String POP_FAKE_GUIDE = "fake_guide";
    public static final String POP_GUIDE = "guide";
    public static final String POP_NEW_USER = "new_user";
    public static final String POP_RED_PACKAGE_GUIDE = "red_package_guide";
    public static final String POP_RED_PACKAGE_RESULT = "red_package_result";
    public static final String TAG = "PopManager";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Class<? extends yey<Map<String, Object>>>> f32052a;
    public yey<Map<String, Object>> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963159);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements g1a<Map<String, ? extends Object>, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ g1a b;

        public b(g1a g1aVar) {
            this.b = g1aVar;
        }

        public void a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
                return;
            }
            ckf.g(map, p1.d);
            this.b.invoke(map);
            yfm.a(yfm.this, null);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map) {
            a(map);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(689963158);
    }

    public yfm() {
        HashMap<String, Class<? extends yey<Map<String, Object>>>> hashMap = new HashMap<>();
        this.f32052a = hashMap;
        hashMap.put(POP_FAKE_GUIDE, FakeGuidePop.class);
        hashMap.put(POP_NEW_USER, NewUserPop.class);
        hashMap.put(POP_RED_PACKAGE_GUIDE, RedpackageGuidePop.class);
        hashMap.put(POP_RED_PACKAGE_RESULT, RedpackageResultPop.class);
        hashMap.put("guide", GuidePop.class);
    }

    public static final /* synthetic */ void a(yfm yfmVar, yey yeyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ba4581", new Object[]{yfmVar, yeyVar});
        } else {
            yfmVar.b = yeyVar;
        }
    }

    public final void b(Context context, String str, Map<String, ? extends Object> map, g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        ckf.g(context, "context");
        ckf.g(str, "name");
        ckf.g(map, "data");
        ckf.g(g1aVar, "dismissCallback");
        Class<? extends yey<Map<String, Object>>> cls = this.f32052a.get(str);
        if (cls != null) {
            yey<Map<String, Object>> yeyVar = this.b;
            if (yeyVar != null) {
                yeyVar.dismiss();
                this.b = null;
            }
            yey<Map<String, Object>> yeyVar2 = (yey) cls.getConstructor(Context.class).newInstance(context);
            yeyVar2.show(map, new b(g1aVar));
            this.b = yeyVar2;
            if (l91.Companion.c()) {
                Toast.makeText(context, "native红包弹窗", 0).show();
            }
        }
    }
}
