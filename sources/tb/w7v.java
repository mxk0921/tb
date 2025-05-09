package tb;

import androidx.recyclerview.widget.DiffUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class w7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DiffUtil.DiffResult f30509a;
    public final int b;

    static {
        t2o.a(157286556);
    }

    public w7v(DiffUtil.DiffResult diffResult, int i) {
        this.f30509a = diffResult;
        this.b = i;
    }

    public DiffUtil.DiffResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffUtil.DiffResult) ipChange.ipc$dispatch("40c9ce4d", new Object[]{this});
        }
        return this.f30509a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55460a16", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
