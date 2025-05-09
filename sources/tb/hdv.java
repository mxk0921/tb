package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c79;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final c79<UMLinkLogInterface> f20566a = new c79<>(UMLinkLogInterface.class);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements c79.a<UMLinkLogInterface> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public UMLinkLogInterface b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UMLinkLogInterface) ipChange.ipc$dispatch("a21632e", new Object[]{this});
            }
            return new yxu();
        }
    }

    public static UMLinkLogInterface a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMLinkLogInterface) ipChange.ipc$dispatch("54c64252", new Object[0]);
        }
        return f20566a.a(new a());
    }
}
