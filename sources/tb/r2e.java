package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface r2e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements r2e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714744);
            t2o.a(468714743);
        }

        @Override // tb.r2e
        public void onAnimationEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            }
        }

        @Override // tb.r2e
        public void onAnimationStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771cb104", new Object[]{this});
            }
        }
    }

    void onAnimationEnd();

    void onAnimationStart();
}
