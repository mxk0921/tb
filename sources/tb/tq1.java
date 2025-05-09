package tb;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import com.taobao.android.order.bundle.base.BaseActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tq1 implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f28878a;

    public tq1(BaseActivity baseActivity) {
        this.f28878a = baseActivity;
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onActivityChanged(Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        BaseActivity.l3(this.f28878a);
        BaseActivity baseActivity = this.f28878a;
        if (baseActivity instanceof TBOrderDetailActivity) {
            ((TBOrderDetailActivity) baseActivity).j4();
        }
        BaseActivity.m3(this.f28878a);
    }
}
