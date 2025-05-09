package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AuctionBaseBean f31426a;
    public final ViewGroup b;

    static {
        t2o.a(815793622);
    }

    public xjh(AuctionBaseBean auctionBaseBean, ViewGroup viewGroup) {
        this.f31426a = auctionBaseBean;
        this.b = viewGroup;
    }

    public static xjh a(AuctionBaseBean auctionBaseBean, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xjh) ipChange.ipc$dispatch("e906592", new Object[]{auctionBaseBean, viewGroup});
        }
        return new xjh(auctionBaseBean, viewGroup);
    }
}
