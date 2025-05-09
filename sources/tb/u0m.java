package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageCreatorInterface;
import com.taobao.android.AliImageInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u0m implements AliImageInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s0m f29061a;

    public u0m(s0m s0mVar) {
        this.f29061a = s0mVar;
    }

    @Override // com.taobao.android.AliImageInterface
    public AliImageCreatorInterface load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageCreatorInterface) ipChange.ipc$dispatch("7e863e6b", new Object[]{this, str});
        }
        return new a1m(this.f29061a.T(str));
    }
}
