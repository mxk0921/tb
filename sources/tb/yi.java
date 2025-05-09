package tb;

import com.alibaba.android.aura.IAURAInputField;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<lbb> f32108a;
    public final wi b;

    static {
        t2o.a(79691786);
    }

    public yi(wi wiVar) {
        this.b = wiVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        List<lbb> list = this.f32108a;
        if (list != null) {
            list.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            a();
        }
    }

    public List<lbb> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b230efe1", new Object[]{this});
        }
        List<lbb> list = this.f32108a;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public <T> T d(Object obj, String str, Class<T> cls) {
        wi wiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6d36f4dd", new Object[]{this, obj, str, cls});
        }
        if (!(obj == null || (wiVar = this.b) == null)) {
            IAURAInputField a2 = wiVar.a(obj.getClass(), str);
            if (a2 == null) {
                ck.g().b("AURAExtensionManager", obj.getClass() + ".getExtInputField", "参数【" + str + "】没有注入");
                return null;
            }
            try {
                return (T) a2.getData();
            } catch (Throwable th) {
                ck.g().b("AURAExtensionManager", obj.getClass() + ".getExtInputField", a2.getErrorMessage() + "|类型转换失败，error=" + th.getMessage());
            }
        }
        return null;
    }

    public <E extends lbb> E e(Class<E> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ((lbb) ipChange.ipc$dispatch("8238fa46", new Object[]{this, cls}));
        }
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            List<lbb> list = this.f32108a;
            if (list == null || list.isEmpty()) {
                rbb g = ck.g();
                g.c("AURAExtensionManager", "getExtensionImpl", "未注册该扩展点，请确认是否正确,extensionImplInterfaceClass=" + cls);
                return null;
            }
            Iterator<lbb> it = this.f32108a.iterator();
            while (it.hasNext()) {
                E e = (E) it.next();
                if (cls.isAssignableFrom(e.getClass())) {
                    return e;
                }
            }
            return null;
        }
        rbb g2 = ck.g();
        g2.b("AURAExtensionManager", "getExtensionImpl", "请确保传入的extensionImplInterfaceClass是一个扩展点类(接口或者抽象类),extensionImplInterfaceClass=" + cls);
        return null;
    }

    public <E extends lbb> List<E> f(Class<E> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2972b73b", new Object[]{this, cls});
        }
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            List<lbb> list = this.f32108a;
            if (list == null || list.isEmpty()) {
                rbb g = ck.g();
                g.c("AURAExtensionManager", "getExtensionImpls", "未注册该扩展点，请确认是否正确,extensionImplInterfaceClass=" + cls);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (lbb lbbVar : this.f32108a) {
                if (cls.isAssignableFrom(lbbVar.getClass())) {
                    try {
                        arrayList.add(lbbVar);
                    } catch (Throwable th) {
                        ck.g().b("AURAExtensionManager", "getExtensionImpls", th.getMessage());
                    }
                }
            }
            return arrayList;
        }
        rbb g2 = ck.g();
        g2.b("AURAExtensionManager", "getExtensionImpls", "请确保传入的extensionImplInterfaceClass是一个扩展点类(接口或者抽象类),extensionImplInterfaceClass=" + cls);
        return Collections.emptyList();
    }

    public void g(lbb lbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c852a8a6", new Object[]{this, lbbVar});
            return;
        }
        if (this.f32108a == null) {
            if (fj.e("useCopyOnWriteForExtensionManager", true, true)) {
                this.f32108a = new CopyOnWriteArrayList();
            } else {
                this.f32108a = new ArrayList();
            }
        }
        if (!this.f32108a.contains(lbbVar)) {
            this.f32108a.add(lbbVar);
        }
    }
}
