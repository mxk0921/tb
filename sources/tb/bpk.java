package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface bpk {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements bpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714455);
            t2o.a(468714454);
        }

        @Override // tb.bpk
        public void k(uq9 uq9Var, uq9 uq9Var2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d85cf3e9", new Object[]{this, uq9Var, uq9Var2});
            }
        }

        @Override // tb.bpk
        public void m(uq9 uq9Var, uq9 uq9Var2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3112268", new Object[]{this, uq9Var, uq9Var2});
            }
        }
    }

    void k(uq9 uq9Var, uq9 uq9Var2);

    void m(uq9 uq9Var, uq9 uq9Var2);
}
