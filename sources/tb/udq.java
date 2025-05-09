package tb;

import com.alibaba.android.split.access.AbstractAccessSplitDetector;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class udq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f29312a;

    static {
        t2o.a(676331698);
        f29312a = new ArrayList();
        try {
            f29312a = Arrays.asList(((AbstractAccessSplitDetector) Class.forName("com.alibaba.android.split.access.AccessSplitDetectorImpl").newInstance()).getAccessClasses());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ecb8fdd", new Object[]{str})).booleanValue();
        }
        return f29312a.contains(str);
    }
}
