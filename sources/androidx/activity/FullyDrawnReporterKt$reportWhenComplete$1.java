package androidx.activity;

import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import tb.ar4;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
@DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {WSContextConstant.HANDSHAKE_RECEIVE_SIZE}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FullyDrawnReporterKt$reportWhenComplete$1(ar4<? super FullyDrawnReporterKt$reportWhenComplete$1> ar4Var) {
        super(ar4Var);
    }

    public static /* synthetic */ Object ipc$super(FullyDrawnReporterKt$reportWhenComplete$1 fullyDrawnReporterKt$reportWhenComplete$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/FullyDrawnReporterKt$reportWhenComplete$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
    }
}
