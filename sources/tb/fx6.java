package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fx6<E> extends LruCache<E, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f19601a = new Object();

    public fx6(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(fx6 fx6Var, String str, Object... objArr) {
        if (str.hashCode() == -605927644) {
            return fx6Var.put(objArr[0], objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/process/DeduplicationSet");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            evictAll();
        }
    }

    public boolean b(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a727e4f4", new Object[]{this, e})).booleanValue();
        }
        if (e == null || put(e, f19601a) != null) {
            return false;
        }
        return true;
    }
}
