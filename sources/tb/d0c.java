package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface d0c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements d0c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468713945);
            t2o.a(468713944);
        }

        @Override // tb.d0c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
            }
        }

        @Override // tb.d0c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
            }
        }

        @Override // tb.d0c
        public boolean e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            return false;
        }

        @Override // tb.d0c
        public void f(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
            }
        }

        @Override // tb.d0c
        public void g(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
            }
        }

        @Override // tb.d0c
        public void h(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
            }
        }
    }

    void c();

    void d();

    boolean e(boolean z);

    void f(float f, float f2);

    void g(float f, float f2);

    void h(float f, float f2);
}
