package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class vfe extends mwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vfe INSTANCE = new vfe();

    static {
        t2o.a(815793002);
    }

    public static /* synthetic */ Object ipc$super(vfe vfeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/IconImageAdapter");
    }

    @Override // tb.mwl
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881925d4", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
