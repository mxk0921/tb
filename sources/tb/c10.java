package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class c10<ExposeKey, ExposeData> implements m4c<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = "default_exposure";

    /* renamed from: a  reason: collision with root package name */
    public final String f16764a;

    static {
        t2o.a(444597122);
        t2o.a(444597128);
    }

    public c10(String str) {
        if (str == null) {
            this.f16764a = b;
        } else {
            this.f16764a = str;
        }
    }

    @Override // tb.m4c
    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
        } else {
            ((RecyclerViewZone) this).a().a();
        }
    }

    @Override // tb.m4c
    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        } else {
            ((RecyclerViewZone) this).a().destroy();
        }
    }

    @Override // tb.m4c
    public String key() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6b891fa", new Object[]{this});
        }
        return this.f16764a;
    }
}
