package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface w2w {
    public static final w2w EMPTY_LISTENER = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements w2w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.w2w
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7bea48f", new Object[]{this});
            }
        }

        @Override // tb.w2w
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d695bb4", new Object[]{this});
            }
        }

        @Override // tb.w2w
        public void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1a47724", new Object[]{this, new Integer(i)});
            }
        }
    }

    void c();

    void d();

    void g(int i);
}
