package tb;

import com.alibaba.android.ultron.common.page.UltronCommonActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q6v implements PtrBase.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UltronCommonActivity f26552a;

    public q6v(UltronCommonActivity ultronCommonActivity) {
        this.f26552a = ultronCommonActivity;
    }

    @Override // com.taobao.ptr.PtrBase.e
    public void a(PtrBase ptrBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
        } else if (UltronCommonActivity.m3(this.f26552a) != null) {
            UltronCommonActivity.m3(this.f26552a).k();
        }
    }

    @Override // com.taobao.ptr.PtrBase.e
    public void b(PtrBase ptrBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
        } else {
            UltronCommonActivity.m3(this.f26552a).o(2);
        }
    }
}
