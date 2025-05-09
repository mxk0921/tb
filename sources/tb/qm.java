package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qm implements vcb<ncb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f26822a;

    public qm(pm pmVar, View view) {
        this.f26822a = view;
    }

    /* renamed from: b */
    public void a(ncb ncbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbeb35c0", new Object[]{this, ncbVar});
        } else {
            ncbVar.onContentViewCreated(this.f26822a);
        }
    }
}
