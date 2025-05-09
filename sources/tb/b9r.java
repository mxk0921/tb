package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.adjust.popupWindow")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class b9r extends ls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GLOBAL_PARSE_DATA = "globalDataCacheParseIO";

    static {
        t2o.a(708837497);
    }

    public static /* synthetic */ Object ipc$super(b9r b9rVar, String str, Object... objArr) {
        if (str.hashCode() == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/popupwindow/TBBuyPopupWindowErrorExtension");
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4f91cb", new Object[]{this});
        } else {
            pi.b(x().c(), zh.EVENT_TYPE, new qi());
        }
    }

    @Override // tb.wab
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
        } else if ("-1000_EMPTY_RENDER_TREE".equals(miVar.b())) {
            AURAGlobalData r = r();
            if (r == null) {
                ck.g().d("TBBuyPopupWindowErrorExtension globalData is null");
                return;
            }
            AURAParseIO aURAParseIO = (AURAParseIO) r.get(KEY_GLOBAL_PARSE_DATA, AURAParseIO.class);
            if (aURAParseIO == null) {
                ck.g().d("TBBuyPopupWindowErrorExtension cacheParseIO is null");
                return;
            }
            B();
            AliBuyPresenterImpl aliBuyPresenterImpl = (AliBuyPresenterImpl) x().g(AliBuyPresenterImpl.class.getSimpleName(), AliBuyPresenterImpl.class);
            if (aliBuyPresenterImpl != null) {
                aliBuyPresenterImpl.d(aURAParseIO);
            } else {
                ck.g().d("TBBuyPopupWindowErrorExtension dataUpdate aliBuyPresenter is null");
            }
        }
    }

    @Override // tb.ls, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.ls, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
