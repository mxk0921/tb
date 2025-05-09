package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class i7v implements xit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21147a;

    static {
        t2o.a(157286624);
        t2o.a(157286720);
    }

    public i7v(String str, xit xitVar) {
        this.f21147a = str;
    }

    public void a(yit yitVar) {
        ArrayList<o58> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd279a15", new Object[]{this, yitVar});
        } else if (yitVar != null && (arrayList = yitVar.f32119a) != null && arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            Iterator<o58> it = yitVar.f32119a.iterator();
            while (it.hasNext()) {
                o58 next = it.next();
                if (next != null) {
                    sb.append(next.c);
                    sb.append(",");
                }
            }
            hav.b(this.f21147a, "#组件下载失败:", sb.toString());
        }
    }
}
