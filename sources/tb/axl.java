package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class axl extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814240);
    }

    public static /* synthetic */ Object ipc$super(axl axlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/wireless/membershop/core/PerfectDeliveryNavProcessorNodeUriFilterItem1");
    }

    @Override // tb.env, tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        if (str.equals("/m/searchbar.htm") || str.equals("/m/search.htm") || str.equals("/search_product.htm") || str.equals("/m/supermarket.htm") || str.equals("/search.htm") || str.equals("/m/chaoshi.htm") || str.equals("/chaoshi.htm")) {
            return true;
        }
        return false;
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

    @Override // tb.env, tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return str.equals("list.tmall.com") || str.equals("s.m.tmall.com");
    }
}
