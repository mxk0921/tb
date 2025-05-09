package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface nzf {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1029701652);
        }

        public static nzf a(nzf nzfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nzf) ipChange.ipc$dispatch("3c1f65", new Object[]{nzfVar});
            }
            nzfVar.setUuid(ozf.INSTANCE.a(nzfVar));
            return nzfVar;
        }

        public static void b(nzf nzfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26fc9439", new Object[]{nzfVar});
            } else {
                ozf.INSTANCE.b(nzfVar.getUuid());
            }
        }
    }

    String getUuid();

    void setUuid(String str);
}
