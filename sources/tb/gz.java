package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.node.service.IUMFService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class gz<INPUT extends UMFBaseIO, OUTPUT extends UMFBaseIO> implements IUMFService<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<Class<? extends v3e>, String> f20319a;
    public Map<String, List<v3e>> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends dz<List<Ext>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f20320a;

        public a(gz gzVar, List list) {
            this.f20320a = list;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/impl/AbsUMFService$1");
        }

        /* JADX WARN: Unknown type variable: Ext in type: java.util.List<Ext> */
        /* renamed from: b */
        public List<Ext> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ab9fe3ca", new Object[]{this});
            }
            return this.f20320a;
        }
    }

    static {
        t2o.a(79692013);
        t2o.a(79692012);
    }

    public final <Ext extends v3e> dz<List<Ext>> a(Class<Ext> cls, x3e<Ext> x3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dz) ipChange.ipc$dispatch("4720e9da", new Object[]{this, cls, x3eVar});
        }
        List<Ext> b = b(cls);
        if (b != null) {
            for (Ext ext : b) {
                x3eVar.a(ext);
            }
        }
        return new a(this, b);
    }

    public final <Ext extends v3e> List<Ext> b(Class<Ext> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9ed35efa", new Object[]{this, cls});
        }
        if (cls.isInterface()) {
            Map<Class<? extends v3e>, String> map = this.f20319a;
            if (map == null) {
                return null;
            }
            return (List) ((HashMap) this.b).get((String) ((HashMap) map).get(cls));
        }
        throw new IllegalArgumentException(cls.getSimpleName().concat("must be interface"));
    }

    public final void c(String str, int i, v3e v3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e6f00f", new Object[]{this, str, new Integer(i), v3eVar});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        List<v3e> list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(str, list);
        }
        list.add(Math.max(0, Math.min(i, list.size())), v3eVar);
    }

    public final void d(String str, Class<? extends v3e> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a790d989", new Object[]{this, str, cls});
            return;
        }
        if (this.f20319a == null) {
            this.f20319a = new HashMap();
        }
        this.f20319a.put(cls, str);
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onAfterExecute(OUTPUT output, txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3271a2ff", new Object[]{this, output, txuVar});
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onBeforeExecute(INPUT input, txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73865d9e", new Object[]{this, input, txuVar});
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Map<Class<? extends v3e>, String> map = this.f20319a;
        if (map != null) {
            ((HashMap) map).clear();
        }
        Map<String, List<v3e>> map2 = this.b;
        if (map2 != null) {
            ((HashMap) map2).clear();
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public final void registerExtension(String str, String str2, int i, v3e v3eVar, Class<? extends v3e> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfa24ec", new Object[]{this, str, str2, new Integer(i), v3eVar, cls});
        } else if (!TextUtils.isEmpty(str)) {
            d(str, cls);
            c(str, i, v3eVar);
        }
    }
}
