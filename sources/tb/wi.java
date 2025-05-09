package tb;

import com.alibaba.android.aura.IAURAInputField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, List<IAURAInputField>> f30709a = new ConcurrentHashMap();

    static {
        t2o.a(79691784);
    }

    public IAURAInputField a(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAInputField) ipChange.ipc$dispatch("258c2e6f", new Object[]{this, cls, str});
        }
        List<IAURAInputField> list = (List) ((ConcurrentHashMap) this.f30709a).get(cls);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (IAURAInputField iAURAInputField : list) {
            if (str.equals(iAURAInputField.getFieldName())) {
                return iAURAInputField;
            }
        }
        return null;
    }

    public <DATA> void b(IAURAInputField<DATA> iAURAInputField) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be2777f", new Object[]{this, iAURAInputField});
            return;
        }
        Class targetClass = iAURAInputField.getTargetClass();
        List list = (List) ((ConcurrentHashMap) this.f30709a).get(targetClass);
        if (list == null) {
            list = new ArrayList();
            ((ConcurrentHashMap) this.f30709a).put(targetClass, list);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IAURAInputField iAURAInputField2 = (IAURAInputField) it.next();
            if (iAURAInputField2.getClass() == iAURAInputField.getClass()) {
                list.remove(iAURAInputField2);
                rbb g = ck.g();
                g.c("AURAExtInputPool", "push", "remove duplicate,sourceInputField=" + iAURAInputField.getFieldName());
                break;
            }
        }
        list.add(iAURAInputField);
    }
}
