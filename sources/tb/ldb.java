package tb;

import android.content.Context;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ldb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(144703527);
        }

        public static Context a(ldb ldbVar) {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("553065f5", new Object[]{ldbVar});
            }
            WeakReference<Context> e = ldbVar.e();
            if (e == null || (context = e.get()) == null) {
                return MegaUtils.f();
            }
            return context;
        }

        public static <T> T b(ldb ldbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("e39fd488", new Object[]{ldbVar});
            }
            T t = (T) ldbVar.a();
            if (!(t instanceof Object)) {
                return null;
            }
            return t;
        }

        public static ldb c(ldb ldbVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ldb) ipChange.ipc$dispatch("39b1d7e8", new Object[]{ldbVar, context});
            }
            if (context != null) {
                ldbVar.d(new WeakReference<>(context));
            }
            return ldbVar;
        }

        public static ldb d(ldb ldbVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ldb) ipChange.ipc$dispatch("8ec05823", new Object[]{ldbVar, obj});
            }
            ldbVar.b(obj);
            return ldbVar;
        }
    }

    Object a();

    ldb a(Context context);

    void b(Object obj);

    void c(AbilityHubAdapter abilityHubAdapter);

    void d(WeakReference<Context> weakReference);

    WeakReference<Context> e();

    AbilityHubAdapter getAdapter();

    String getBusinessID();

    Context getContext();

    String getNamespace();
}
