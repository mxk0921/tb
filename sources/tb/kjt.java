package tb;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kjt<T extends RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, y9e<T>> f22711a = new HashMap();
    public final Map<Integer, String> b = new HashMap();

    static {
        t2o.a(352321904);
    }

    public T a(cxj cxjVar, dh7 dh7Var, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((RecyclerView.ViewHolder) ipChange.ipc$dispatch("a7c7a657", new Object[]{this, cxjVar, dh7Var, viewGroup, new Integer(i)}));
        }
        y9e y9eVar = (y9e) ((HashMap) this.f22711a).get((String) ((HashMap) this.b).get(Integer.valueOf(i)));
        if (y9eVar == null) {
            return null;
        }
        try {
            return (T) y9eVar.a(viewGroup, dh7Var, cxjVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c7c85b9", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        int hashCode = str.hashCode();
        ((HashMap) this.b).put(Integer.valueOf(hashCode), str);
        return hashCode;
    }

    public void c(String str, y9e<T> y9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25643cf", new Object[]{this, str, y9eVar});
        } else {
            ((HashMap) this.f22711a).put(str, y9eVar);
        }
    }
}
