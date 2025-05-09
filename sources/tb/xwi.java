package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class xwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31646a = true;
    public final List<RectF> b;
    public final List<Float> c;
    public final String d;
    public final String e;

    static {
        t2o.a(482344969);
    }

    public xwi(List<RectF> list, List<Float> list2, String str, String str2) {
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = str2;
    }

    public List<RectF> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38860ea3", new Object[]{this});
        }
        return this.b;
    }
}
