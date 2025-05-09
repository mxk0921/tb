package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface mwm extends gtd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792432);
        }

        public static void a(mwm mwmVar, pwm pwmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ac30ea3", new Object[]{mwmVar, pwmVar});
            } else {
                ckf.g(pwmVar, "priceInfo");
            }
        }
    }

    void a(pwm pwmVar);
}
