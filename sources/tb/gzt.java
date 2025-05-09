package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gzt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_TYPE_PHA = "phaPreRender";

    /* renamed from: a  reason: collision with root package name */
    public static final gzt f20330a = new gzt();

    public gzt() {
        new HashSet();
    }

    public static gzt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzt) ipChange.ipc$dispatch("5527c89a", new Object[0]);
        }
        return f20330a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18d2eb44", new Object[]{this});
        }
        return null;
    }
}
