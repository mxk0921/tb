package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ab0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f15639a;
    public final Object b;

    public ab0(Class<?> cls, Object obj) {
        this.f15639a = cls;
        this.b = obj;
    }

    public static Object a(Class<?> cls, String str, Object obj, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception e) {
            TLog.loge("TBAutoSize.EmbeddingComponent", "invokeMethod: ", e);
            return null;
        }
    }

    public boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de4faee0", new Object[]{this, activity})).booleanValue();
        }
        Object obj = this.b;
        if (obj == null) {
            return false;
        }
        Object a2 = a(this.f15639a, "isActivityEmbedded", obj, new Class[]{Activity.class}, new Object[]{activity});
        TLog.loge("TBAutoSize.EmbeddingComponent", "isActivityEmbedded: activity=" + activity + " result=" + a2);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }
}
