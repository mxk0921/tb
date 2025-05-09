package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class so2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, c> f28168a = new HashMap();
    public static final z4a[] b = {z4a.REC_ORDER_LIST, z4a.REC_ORDER_LIST_CATAPULT, z4a.REC_ORDER_DETAIL, z4a.REC_LOGISTICS, z4a.REC_CART, z4a.REC_FAVORITE, z4a.REC_PAY_SUCCESS, z4a.REC_CONFIRM_RECEIPT};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.so2.c
        public ro2 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ro2) ipChange.ipc$dispatch("445438c", new Object[]{this, str});
            }
            return ro2.a(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z4a f28169a;
        public final /* synthetic */ String b;

        public b(z4a z4aVar, String str) {
            this.f28169a = z4aVar;
            this.b = str;
        }

        @Override // tb.so2.c
        public ro2 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ro2) ipChange.ipc$dispatch("445438c", new Object[]{this, str});
            }
            return ro2.b(this.f28169a.c, this.b, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        ro2 a(String str);
    }

    static {
        t2o.a(729808965);
        c();
    }

    public static ro2 a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ro2) ipChange.ipc$dispatch("c739c248", new Object[]{str, str2});
        }
        c cVar = (c) ((HashMap) f28168a).get(str);
        if (cVar != null) {
            return cVar.a(str2);
        }
        hrg.e("createBxFeatureRequestParam", "BxFeatureParamCreator", "builder 未注册" + str);
        return null;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7cae18", new Object[0]);
            return;
        }
        int length = b.length;
        for (int i = 0; i < length; i++) {
            z4a z4aVar = b[i];
            String str = z4aVar.f32522a;
            ((HashMap) f28168a).put(str, new b(z4aVar, str));
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4de5a4", new Object[0]);
            return;
        }
        ((HashMap) f28168a).put(z4a.NEW_FACE_CHILD.f32522a, new a());
        b();
    }
}
