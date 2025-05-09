package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xvr implements fj4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31629a;

    static {
        t2o.a(815793415);
        t2o.a(993001564);
    }

    @Override // tb.fj4
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e284ffa", new Object[]{this});
        }
        return r4p.SERVER_VERSION_VALUE;
    }

    @Override // tb.fj4
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8aef5bf0", new Object[]{this})).intValue();
        }
        return 89;
    }

    @Override // tb.fj4
    public String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return TaoHelper.getTTID();
    }

    @Override // tb.fj4
    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        if (this.f31629a == null) {
            try {
                this.f31629a = UTDevice.getUtdid(Globals.getApplication());
            } catch (Exception e) {
                b4p.p("TBSearchConstantAdapter", "获取utdid失败", e);
            }
        }
        return this.f31629a;
    }

    @Override // tb.fj4
    public boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        return rv6.a();
    }
}
