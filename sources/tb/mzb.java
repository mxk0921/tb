package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface mzb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements mzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714375);
            t2o.a(468714374);
        }

        @Override // tb.mzb
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a66d3491", new Object[]{this});
            }
        }

        @Override // tb.mzb
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd31c367", new Object[]{this});
            }
        }
    }

    void c();

    void d();
}
