package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pu8 extends FBTemplateDeciderTemplateModelCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String b;
    public final /* synthetic */ FBFullTplInfo c;
    public final /* synthetic */ a d;
    public final /* synthetic */ FBTemplateDecider i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu8(FBTemplateDecider fBTemplateDecider, a.C0245a aVar, String str, FBFullTplInfo fBFullTplInfo, a aVar2) {
        super(aVar);
        this.i = fBTemplateDecider;
        this.b = str;
        this.c = fBFullTplInfo;
        this.d = aVar2;
    }

    public static /* synthetic */ Object ipc$super(pu8 pu8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/deploy/FBTemplateDecider$3");
    }

    @Override // com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback
    public void call(FBTemplateContent fBTemplateContent, String str, int i, long j, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af7da99", new Object[]{this, fBTemplateContent, str, new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
            return;
        }
        a.C0245a aVar = this.f4995a;
        aVar.resultCode = i2;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        aVar.isForceUpdated = z;
        if (i == 0) {
            z2 = false;
        }
        aVar.hasUpdated = z2;
        aVar.costTimeMillis = j;
        aVar.updateSource = i3;
        try {
            if (!TextUtils.isEmpty(str)) {
                aVar.locals.add(FBFullTplInfo.fromJSONString(str));
            }
        } catch (Throwable th) {
            FBTemplateDecider fBTemplateDecider = this.i;
            String str2 = this.b;
            String message = th.getMessage();
            IpChange ipChange2 = FBTemplateDecider.$ipChange;
            fBTemplateDecider.f(str2, "e:decider:enhanceLocalEx", "", message);
            pgh.g("_updateAndGetTplInfoEnhancedAsync got an error when adding locals", th);
        }
        if (fBTemplateContent != null) {
            aVar.successRequests.add(this.c);
            fBTemplateContent.fillTplTrace(this.c.getTplTrace());
            pgh.h("_updateAndGetTplInfoEnhancedAsync success on " + this + " tplId: " + this.c + " callback ctx: " + aVar);
            FBTemplateDecider fBTemplateDecider2 = this.i;
            IpChange ipChange3 = FBTemplateDecider.$ipChange;
            fBTemplateDecider2.d(fBTemplateContent, aVar);
            this.d.onSuccess(Collections.singletonList(fBTemplateContent), aVar);
            return;
        }
        pgh.d("_updateAndGetTplInfoEnhancedAsync failed on " + this + " tplId: " + this.c + " callback ctx: " + aVar);
        aVar.failedRequests.add(this.c);
        FBTemplateDecider fBTemplateDecider3 = this.i;
        IpChange ipChange4 = FBTemplateDecider.$ipChange;
        fBTemplateDecider3.d(null, aVar);
        this.d.onFailure(aVar);
    }
}
