package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.autoTrack.config")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cm0 implements yab {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_Name";

    /* renamed from: a  reason: collision with root package name */
    public lo f17148a;

    static {
        t2o.a(301989968);
        t2o.a(81788994);
    }

    @Override // tb.yab
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        String str = (String) this.f17148a.g(PAGE_NAME, String.class);
        if (TextUtils.isEmpty(str)) {
            return "Page_ConfirmOrder";
        }
        return str;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f17148a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
