package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel.HighlightContentRequest;
import com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel.HighlightContentResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vwa extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092605);
    }

    public vwa(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(vwa vwaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/highlight/contentListModel/HighlightContentBusiness");
    }

    public void K(ux9 ux9Var, String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ef4fb5", new Object[]{this, ux9Var, str, str2, new Integer(i), new Integer(i2), str3});
        } else if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            HighlightContentRequest highlightContentRequest = new HighlightContentRequest();
            highlightContentRequest.liveId = str;
            highlightContentRequest.s = i;
            highlightContentRequest.n = i2;
            highlightContentRequest.transParams = str3;
            highlightContentRequest.entryLiveSource = iba.o(vx9.f(ux9Var));
            highlightContentRequest.liveSource = up6.L(ux9Var);
            highlightContentRequest.keyPointId = str2;
            C(0, highlightContentRequest, HighlightContentResponse.class);
        }
    }
}
