package androidx.fragment.app;

import android.os.Bundle;
import androidx.fragment.app.FragmentKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import kotlin.Metadata;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "Ltb/xhv;", "setFragmentResult", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V", "clearFragmentResult", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "bundle", DataReceiveMonitor.CB_LISTENER, "setFragmentResultListener", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ltb/u1a;)V", "clearFragmentResultListener", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void clearFragmentResult(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a2a043", new Object[]{fragment, str});
        } else {
            fragment.getParentFragmentManager().clearFragmentResult(str);
        }
    }

    public static final void clearFragmentResultListener(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd90817", new Object[]{fragment, str});
        } else {
            fragment.getParentFragmentManager().clearFragmentResultListener(str);
        }
    }

    public static final void setFragmentResult(Fragment fragment, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebdf9fc", new Object[]{fragment, str, bundle});
        } else {
            fragment.getParentFragmentManager().setFragmentResult(str, bundle);
        }
    }

    public static final void setFragmentResultListener(Fragment fragment, String str, final u1a<? super String, ? super Bundle, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d00d1", new Object[]{fragment, str, u1aVar});
        } else {
            fragment.getParentFragmentManager().setFragmentResultListener(str, fragment, new FragmentResultListener() { // from class: tb.tw9
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(String str2, Bundle bundle) {
                    FragmentKt.setFragmentResultListener$lambda$0(u1a.this, str2, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$0(u1a u1aVar, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44ef96a", new Object[]{u1aVar, str, bundle});
        } else {
            u1aVar.invoke(str, bundle);
        }
    }
}
