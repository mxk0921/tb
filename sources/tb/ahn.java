package tb;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ahn extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long RATELOADINGVIEWFIRSTFRAMEPICTURERENDER = 95290952468497626L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ahn build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ahn) ipChange.ipc$dispatch("98f00efa", new Object[]{this, obj});
            }
            return new ahn();
        }
    }

    public static /* synthetic */ Object ipc$super(ahn ahnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/RateLoadingViewFirstFramePictureRenderAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        RateFeedsFragment d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            return new f8();
        }
        String i = n8Var.i("pictureType");
        int e = n8Var.e("index");
        String i2 = n8Var.i("timeStamp");
        JSONObject g = n8Var.g("exParams");
        if (!TextUtils.isEmpty(i) && !TextUtils.isEmpty(i2) && (k8Var.d() instanceof FragmentActivity) && (d = i6v.INSTANCE.d((FragmentActivity) k8Var.d(), k8Var.a())) != null) {
            eme emeVar = new eme("endImageLoaded", Long.parseLong(i2), g, i, e);
            if (d.J2() != null) {
                d.J2().a(emeVar);
            }
        }
        return new f8();
    }
}
