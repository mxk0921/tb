package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.ArrayList;
import tb.dv7;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class arh implements dv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dv7.a f15950a;

        public a(arh arhVar, dv7.a aVar) {
            this.f15950a = aVar;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            dv7.a aVar = this.f15950a;
            if (aVar != null) {
                aVar.a(false, new MRTRuntimeException(i, str2), null);
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            dv7.a aVar = this.f15950a;
            if (aVar != null) {
                aVar.a(true, null, str2);
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    @Override // tb.dv7
    public int a(String str, String str2, dv7.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("892b5868", new Object[]{this, str, str2, aVar})).intValue();
        }
        return rv7.e().b(b(str, str2, null, null), new a(this, aVar));
    }

    public final zu7 b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu7) ipChange.ipc$dispatch("b4f356b1", new Object[]{this, str, str2, str3, str4});
        }
        zu7 zu7Var = new zu7();
        zu7Var.f33016a = new ArrayList();
        onf onfVar = new onf();
        onfVar.f25507a = str;
        onfVar.c = str2;
        onfVar.d = str4;
        zu7Var.f33016a.add(onfVar);
        upl uplVar = new upl();
        uplVar.g = str3;
        uplVar.c = 7;
        uplVar.f29547a = "mrt";
        zu7Var.b = uplVar;
        return zu7Var;
    }
}
