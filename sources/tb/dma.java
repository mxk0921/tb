package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dma extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578813970);
    }

    public dma() {
        addQueryFilter("tnodepush");
        addQueryFilter("tnode");
    }

    public static /* synthetic */ Object ipc$super(dma dmaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/allspark/GuangGuangNavProcessorNodeUriFilterItem1");
    }

    @Override // tb.env, tb.dnv
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("http") || str.equals("https")) {
            return true;
        }
        return false;
    }
}
