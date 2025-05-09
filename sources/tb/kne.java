package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kne implements jne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jne f22778a = new klo();

    static {
        t2o.a(815793349);
        t2o.a(815793403);
        t2o.a(815792811);
    }

    public void a(boolean z, ListStyle listStyle, List<BaseCellBean> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83a520", new Object[]{this, new Boolean(z), listStyle, list, new Integer(i)});
            return;
        }
        if (i == 0) {
            i = zuo.e();
        }
        jne jneVar = this.f22778a;
        if (jneVar != null) {
            ((klo) jneVar).a(z, listStyle, list, i);
        }
    }
}
