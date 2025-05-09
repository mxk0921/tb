package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.lifecycle.popupWindow")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c9r extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837498);
    }

    public static /* synthetic */ Object ipc$super(c9r c9rVar, String str, Object... objArr) {
        if (str.hashCode() == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/popupwindow/TBBuyPopupWindowLifecycleExtension");
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (dl.PARSE_SERVICE_CODE.equals(cgVar.b())) {
            Serializable data = aURAInputData.getData();
            if (!(data instanceof AURAParseIO)) {
                ck.g().d("TBBuyPopupWindowErrorExtension input is null");
                return;
            }
            AURAParseIO aURAParseIO = (AURAParseIO) data;
            AURAGlobalData L0 = L0();
            if (L0 == null) {
                ck.g().d("TBBuyPopupWindowErrorExtension globalData is null");
            } else {
                L0.update(b9r.KEY_GLOBAL_PARSE_DATA, aURAParseIO);
            }
        }
    }
}
