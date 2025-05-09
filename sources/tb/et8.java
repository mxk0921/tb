package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class et8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements nmd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18803a;

        public a(String str) {
            this.f18803a = str;
        }

        @Override // tb.nmd
        public HashMap<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("5f815aaa", new Object[]{this});
            }
            HashMap<String, String> hashMap = new HashMap<>(3);
            hashMap.put("spm", this.f18803a);
            return hashMap;
        }
    }

    static {
        t2o.a(760217724);
    }

    public static nmd a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmd) ipChange.ipc$dispatch("69c552b5", new Object[]{str});
        }
        return new a(str);
    }
}
