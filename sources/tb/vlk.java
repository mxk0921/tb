package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.render.b;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareTargetType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vlk extends ksa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894443);
    }

    public vlk(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ Object ipc$super(vlk vlkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/interceptor/OfficeToolHandlerInterceptor");
    }

    @Override // tb.ksa
    public void b(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0736b2", new Object[]{this, context, ma4Var, new Integer(i), bVar});
        } else if (ma4Var.b() != null) {
            kjp.c(ma4Var.b(), null);
            AnalyticsUtil.traceViewClickOthers(ma4Var, null);
        }
    }

    @Override // tb.ksa
    public boolean c(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d18e050", new Object[]{this, context, ma4Var, new Integer(i), bVar})).booleanValue();
        }
        if (ma4Var == null || (!TextUtils.equals(ShareTargetType.Share2QRCode.getValue(), ma4Var.b()) && !TextUtils.equals(ShareTargetType.Share2ScanCode.getValue(), ma4Var.b()))) {
            return false;
        }
        return true;
    }
}
