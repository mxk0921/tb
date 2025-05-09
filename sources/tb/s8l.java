package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.flexbox.layoutmanager.core.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s8l implements hpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267918);
        t2o.a(503316580);
    }

    @Override // tb.hpb
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a331ceb", new Object[]{this, str})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(o.J(), str);
    }

    @Override // tb.hpb
    public Object b(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9e2bf76d", new Object[]{this, str, obj});
        }
        String obj2 = obj != null ? obj.toString() : null;
        int indexOf = str.indexOf(".");
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            str2 = "tnode";
        }
        return vfs.g().e(str2, str, obj2);
    }
}
