package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.XRateFlowLayout;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class gss<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f20200a;
    public ouk<T> b;

    public gss(List<T> list) {
        this.f20200a = list;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<T> list = this.f20200a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<T> list = this.f20200a;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public abstract View d(XRateFlowLayout xRateFlowLayout, int i, T t);

    public void e(ouk<T> oukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3608eb", new Object[]{this, oukVar});
        } else {
            this.b = oukVar;
        }
    }
}
