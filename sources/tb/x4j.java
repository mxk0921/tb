package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.LiveDetailResponseData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class x4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LiveDetailResponseData f31142a;

    static {
        t2o.a(1004535861);
    }

    public x4j() {
        this(null, 1, null);
    }

    public final LiveDetailResponseData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailResponseData) ipChange.ipc$dispatch("34503d1d", new Object[]{this});
        }
        return this.f31142a;
    }

    public final void b(LiveDetailResponseData liveDetailResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edeb9bfb", new Object[]{this, liveDetailResponseData});
            return;
        }
        ckf.g(liveDetailResponseData, "<set-?>");
        this.f31142a = liveDetailResponseData;
    }

    public x4j(LiveDetailResponseData liveDetailResponseData) {
        ckf.g(liveDetailResponseData, "liveDetailInfoModel");
        this.f31142a = liveDetailResponseData;
    }

    public /* synthetic */ x4j(LiveDetailResponseData liveDetailResponseData, int i, a07 a07Var) {
        this((i & 1) != 0 ? new LiveDetailResponseData() : liveDetailResponseData);
    }
}
