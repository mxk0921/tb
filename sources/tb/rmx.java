package tb;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.v2.RateViewPagerFragmentV2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rmx extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long XRATEOPENPREVIEWV2 = 2989033931282006034L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public rmx build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rmx) ipChange.ipc$dispatch("4562b4c6", new Object[]{this, obj});
            }
            return new rmx();
        }
    }

    public static /* synthetic */ Object ipc$super(rmx rmxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/XRateOpenPreviewV2Ability");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        String n = qrf.n("", n8Var.h(), "params", "tagId");
        if (TextUtils.isEmpty(n)) {
            return new f8();
        }
        Bundle bundle = new Bundle();
        bundle.putString("tagId", n);
        RateViewPagerFragmentV2 rateViewPagerFragmentV2 = new RateViewPagerFragmentV2();
        rateViewPagerFragmentV2.setArguments(bundle);
        FragmentTransaction beginTransaction = ((FragmentActivity) k8Var.d()).getSupportFragmentManager().beginTransaction();
        beginTransaction.add(rateViewPagerFragmentV2, "RateViewPagerFragmentV2");
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
        return new f8();
    }
}
