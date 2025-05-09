package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.exception.PoplayerException;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = fig.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f19314a;
    public final HashMap<String, Class<? extends PopLayerBaseView>> b;
    public final Set<String> c;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fig f19315a = new fig();

        static {
            t2o.a(625999907);
        }

        public static /* synthetic */ fig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fig) ipChange.ipc$dispatch("591d3dd", new Object[0]);
            }
            return f19315a;
        }
    }

    static {
        t2o.a(625999905);
    }

    public static fig c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fig) ipChange.ipc$dispatch("ba7e3ac1", new Object[0]);
        }
        return b.a();
    }

    public PopLayerBaseView a(Context context, String str, com.alibaba.poplayer.trigger.a aVar) {
        int i = this.f19314a;
        if (i == 0) {
            Class<? extends PopLayerBaseView> cls = this.b.get(str);
            if (cls == null) {
                TextUtils.isEmpty(str);
            }
            if (cls == null) {
                wdm.d("%s.create:can't find type.", TAG);
                return null;
            }
            try {
                Constructor<? extends PopLayerBaseView> declaredConstructor = cls.getDeclaredConstructor(Context.class);
                declaredConstructor.setAccessible(true);
                return (PopLayerBaseView) declaredConstructor.newInstance(context);
            } catch (Throwable th) {
                wdm.h(TAG + ".newInstance fail!", th);
                return null;
            }
        } else if (i != 1) {
            return null;
        } else {
            if (PopLayer.getReference().getPopLayerViewFactoryAdapter() == null) {
                wdm.d("%s.getPopLayerViewFactoryAdapter == null.", TAG);
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.d;
            }
            return PopLayer.getReference().getPopLayerViewFactoryAdapter().generatePopLayerViewByType(context, str, aVar);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5263e8f", new Object[]{this});
        }
        return this.d;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb4991c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashSet) this.c).add(str);
        } else {
            throw new PoplayerException("viewType is empty;");
        }
    }

    public fig() {
        this.f19314a = 0;
        this.b = new HashMap<>();
        this.c = new HashSet();
        this.d = "";
    }

    public void d(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf77ba5", new Object[]{this, list, str});
        } else if (list == null || list.isEmpty()) {
            throw new PoplayerException("viewTypes is empty;");
        } else if (TextUtils.isEmpty(str) || !list.contains(str)) {
            throw new PoplayerException("defaultType is empty or viewTypes don't contains defaultType.");
        } else {
            this.f19314a = 1;
            this.c.addAll(list);
            this.d = str;
        }
    }
}
