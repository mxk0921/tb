package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.v2.RateViewPagerFragmentV2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class nin implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RateViewPagerFragmentV2 f24754a;

    public nin(RateViewPagerFragmentV2 rateViewPagerFragmentV2) {
        this.f24754a = rateViewPagerFragmentV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            this.f24754a.dismiss();
        }
    }
}
