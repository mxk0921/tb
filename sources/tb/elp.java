package tb;

import kotlinx.coroutines.flow.SharedFlowImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class elp extends n30<SharedFlowImpl<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f18664a = -1;
    public ar4<? super xhv> b;

    /* renamed from: c */
    public boolean a(SharedFlowImpl<?> sharedFlowImpl) {
        if (this.f18664a >= 0) {
            return false;
        }
        this.f18664a = sharedFlowImpl.c0();
        return true;
    }

    /* renamed from: d */
    public ar4<xhv>[] b(SharedFlowImpl<?> sharedFlowImpl) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        long j = this.f18664a;
        this.f18664a = -1L;
        this.b = null;
        return sharedFlowImpl.b0(j);
    }
}
