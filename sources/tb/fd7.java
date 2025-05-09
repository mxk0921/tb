package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.m;
import com.taobao.themis.external.embed.TMSEmbed;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fd7 implements m.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f19211a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TMSEmbed c;

    public fd7(Ref$ObjectRef ref$ObjectRef, long j, TMSEmbed tMSEmbed) {
        this.f19211a = ref$ObjectRef;
        this.b = j;
        this.c = tMSEmbed;
    }

    @Override // com.taobao.falco.m.a
    public final void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            return;
        }
        m e = ((tz8) this.f19211a.element).d(m.MODULE, "tap").f(mVar).e();
        e.r0(mVar);
        e.u0(Long.valueOf(this.b));
        i2c i2cVar = (i2c) this.c.g(i2c.class);
        if (i2cVar != null) {
            i2cVar.T(e);
        }
    }
}
