package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class a02 implements ijd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Call f15462a;

    static {
        t2o.a(393216033);
        t2o.a(393216034);
    }

    public a02(Call call) {
        this.f15462a = call;
    }

    @Override // tb.ijd
    public Reply a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("f6cc3eda", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Object[] a2 = fql.a(this.f15462a.getParameterWrappers(), arrayList);
        long currentTimeMillis = System.currentTimeMillis();
        Reply invokeTime = Reply.obtain().setResult(b(a2)).setInvokeTime(System.currentTimeMillis() - currentTimeMillis);
        if (!arrayList.isEmpty()) {
            ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                parameterWrapperArr[intValue] = ParameterWrapper.obtain().setData(a2[((Integer) arrayList.get(intValue)).intValue()]);
            }
            invokeTime.setFlowParameterWrappers(parameterWrapperArr);
        }
        return invokeTime;
    }

    public abstract Object b(Object[] objArr) throws IPCException;
}
