package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lyn implements uzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AliLogInterface f23647a = jq0.c();

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4508586", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f23647a;
        if (aliLogInterface != null) {
            aliLogInterface.a(str, str2, str3);
        }
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e727b88a", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f23647a;
        if (aliLogInterface != null) {
            aliLogInterface.b(str, str2, str3);
        }
    }
}
