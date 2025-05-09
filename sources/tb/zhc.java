package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSUTCommitAction;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface zhc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438831);
        }

        public static /* synthetic */ void a(zhc zhcVar, KSUTCommitAction kSUTCommitAction, g1a g1aVar, g1a g1aVar2, g1a g1aVar3, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64b97da0", new Object[]{zhcVar, kSUTCommitAction, g1aVar, g1aVar2, g1aVar3, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    g1aVar = null;
                }
                if ((i & 4) != 0) {
                    g1aVar2 = null;
                }
                if ((i & 8) != 0) {
                    g1aVar3 = null;
                }
                zhcVar.u(kSUTCommitAction, g1aVar, g1aVar2, g1aVar3);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commitEvent");
            }
        }

        public static /* synthetic */ void b(zhc zhcVar, String str, String str2, String str3, String str4, Map map, Integer num, int i, Object obj) {
            String str5;
            String str6;
            Integer num2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7ad3fcb", new Object[]{zhcVar, str, str2, str3, str4, map, num, new Integer(i), obj});
            } else if (obj == null) {
                if ((4 & i) != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if ((8 & i) != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if ((i & 32) != 0) {
                    num2 = 19999;
                } else {
                    num2 = num;
                }
                zhcVar.K(str, str2, str5, str6, map, num2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackCustom");
            }
        }
    }

    void K(String str, String str2, String str3, String str4, Map<String, String> map, Integer num);

    void track4Click(String str, String str2, Map<String, String> map);

    void u(KSUTCommitAction kSUTCommitAction, g1a<? super c1g, xhv> g1aVar, g1a<? super Boolean, xhv> g1aVar2, g1a<? super n0g, xhv> g1aVar3);
}
