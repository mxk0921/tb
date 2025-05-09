package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class id8 {
    public static final cgd EMPTY_CONFIG = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements cgd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.cgd
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("86fd28c7", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            return false;
        }

        @Override // tb.cgd
        public List<String> b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("7b413ea7", new Object[]{this, str, str2});
            }
            return Collections.emptyList();
        }

        @Override // tb.cgd
        public long c(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53ef7cd5", new Object[]{this, str, new Long(j)})).longValue();
            }
            return 0L;
        }

        @Override // tb.cgd
        public String d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68e2387e", new Object[]{this, str, str2});
            }
            return null;
        }

        @Override // tb.cgd
        public List<String> e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("65375c31", new Object[]{this, str});
            }
            return Collections.emptyList();
        }

        @Override // tb.cgd
        public String f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("45a83c1d", new Object[]{this, str});
            }
            return null;
        }

        @Override // tb.cgd
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            }
        }

        @Override // tb.cgd
        public boolean h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9ac927ec", new Object[]{this, str})).booleanValue();
            }
            return false;
        }
    }
}
