package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class of9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final b f25348a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public nf9 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nf9) ipChange.ipc$dispatch("adea01ce", new Object[]{this, str});
            }
            return new lf9(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
    }

    static {
        t2o.a(481296417);
    }

    public static nf9 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nf9) ipChange.ipc$dispatch("adea01ce", new Object[]{str});
        }
        return ((a) f25348a).a(str);
    }
}
