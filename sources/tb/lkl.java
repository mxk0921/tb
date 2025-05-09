package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.packages.PackageManager;
import com.taobao.themis.open.resource.PackageInfo;
import com.taobao.update.dynamicfeature.utils.Constants;
import kotlin.Metadata;
import tb.m5d;
import tb.n5d;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lkl implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PackageManager f23383a;
    public final /* synthetic */ jkl b;
    public final /* synthetic */ PackageInfo.TYPE c;
    public final /* synthetic */ n5d.b d;

    public lkl(PackageManager packageManager, jkl jklVar, PackageInfo.TYPE type, n5d.b bVar) {
        this.f23383a = packageManager;
        this.b = jklVar;
        this.c = type;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String b;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        m5d.a b2 = PackageManager.b(this.f23383a, this.b);
        if (b2.c()) {
            s8o s8oVar = new s8o(new PackageInfo(this.b.c(), this.b.a(), this.b.d(), this.c, b2.b()));
            PackageManager packageManager = this.f23383a;
            n5d.b bVar = this.d;
            if (s8oVar.d()) {
                ekd ekdVar = (ekd) packageManager.W().getExtension(ekd.class);
                if (ekdVar != null) {
                    ekdVar.m(s8oVar);
                }
                if (bVar != null) {
                    bVar.a(b2.b(), false);
                }
            } else if (bVar != null) {
                bVar.b(2, "parse error");
            }
        } else {
            n5d.b bVar2 = this.d;
            if (bVar2 != null) {
                m5d.b a2 = b2.a();
                if (a2 != null) {
                    i = a2.a();
                }
                m5d.b a3 = b2.a();
                String str = Constants.ErrorDesc.downloadError;
                if (!(a3 == null || (b = a3.b()) == null)) {
                    str = b;
                }
                bVar2.b(i, str);
            }
        }
    }
}
