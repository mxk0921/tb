package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.observe.OpenArchObservableStateCompareResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface i3d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536534);
        }

        public static OpenArchObservableStateCompareResult a(i3d i3dVar, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OpenArchObservableStateCompareResult) ipChange.ipc$dispatch("49bd82e4", new Object[]{i3dVar, obj, obj2});
            }
            if (i3dVar.b(obj, obj2)) {
                return OpenArchObservableStateCompareResult.Equal;
            }
            return OpenArchObservableStateCompareResult.Undetermined;
        }
    }

    OpenArchObservableStateCompareResult a(Object obj, Object obj2);

    boolean b(Object obj, Object obj2);

    String getName();

    Object getValue();
}
