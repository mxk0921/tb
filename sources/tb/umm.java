package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class umm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f29496a = Localization.q(R.string.taobao_app_1028_1_21674);
    public static final String b = Localization.q(R.string.taobao_app_1028_1_21654);
    public static final String c = Localization.q(R.string.taobao_app_1028_1_21652);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends gmb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f29497a;

        public a(Context context) {
            this.f29497a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/utils/PreHeatUtil$1");
        }

        @Override // tb.cfb
        public void n(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873d70b", new Object[]{this, alertConfirmInfo});
                return;
            }
            Context context = this.f29497a;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.getClass().getName().contains("TBMainActivity")) {
                    hd3.a(this.f29497a);
                    activity.finish();
                }
            }
        }
    }

    static {
        t2o.a(479199583);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc996783", new Object[]{context});
        } else if (context instanceof Activity) {
            xk0 a2 = xk0.a();
            a2.b = b;
            a2.f31435a = f29496a;
            a2.d = c;
            bii.a().b((Activity) context, a2, new a(context));
        }
    }

    public static void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138091e1", new Object[]{context, mtopResponse});
        } else if (mtopResponse != null && mtopResponse.getRet() != null && mtopResponse.getRet().length > 0) {
            String str = mtopResponse.getRet()[0];
            if (!TextUtils.isEmpty(str) && str.contains("CART_PRESALE_TIMEOUT")) {
                b(context);
                ub3.d("preheatTimeout", "预热态过期", false, 1.0f);
            }
        }
    }
}
