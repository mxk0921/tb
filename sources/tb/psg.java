package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface psg {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FROM_CLOSE = "FROM_SKIP";
        public static final String FROM_FINISH = "FROM_OTHER";

        /* renamed from: a  reason: collision with root package name */
        public int f26271a;
        public int b;
        public int c;
        public int d;
        public float e;

        static {
            t2o.a(736100449);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "LinkedSplashAnimOptions{fromAction='null', width=" + this.f26271a + ", height=" + this.b + ", positionX=" + this.c + ", positionY=" + this.d + ", targetCornerRadius=" + this.e + '}';
        }
    }

    void a();

    String c();

    void d();

    boolean e(a aVar);

    void f(LinkedSplashData linkedSplashData);

    boolean g(LinkedSplashData linkedSplashData);

    boolean h(LinkedSplashData linkedSplashData);

    void onAnimationEnd();

    void onAnimationStart();
}
