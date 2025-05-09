package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ru8 extends FBTemplateDeciderTemplateModelCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String b;
    public final /* synthetic */ FBFullTplInfo c;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ int f;
    public final /* synthetic */ CountDownLatch g;
    public final /* synthetic */ FBTemplateDecider h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru8(FBTemplateDecider fBTemplateDecider, a.C0245a aVar, String str, FBFullTplInfo fBFullTplInfo, ArrayList arrayList, int i, CountDownLatch countDownLatch) {
        super(aVar);
        this.h = fBTemplateDecider;
        this.b = str;
        this.c = fBFullTplInfo;
        this.e = arrayList;
        this.f = i;
        this.g = countDownLatch;
    }

    public static /* synthetic */ Object ipc$super(ru8 ru8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/deploy/FBTemplateDecider$5");
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
        if (aVar.isForceUpdated || i == 3) {
            z = true;
        } else {
            z = false;
        }
        aVar.isForceUpdated = z;
        if (!z && i == 0) {
            z2 = false;
        }
        aVar.hasUpdated = z2;
        aVar.updateSource = i3;
        try {
            if (!TextUtils.isEmpty(str)) {
                aVar.locals.add(FBFullTplInfo.fromJSONString(str));
            }
        } catch (Throwable th) {
            FBTemplateDecider fBTemplateDecider = this.h;
            String str2 = this.b;
            String message = th.getMessage();
            IpChange ipChange2 = FBTemplateDecider.$ipChange;
            fBTemplateDecider.f(str2, "e:decider:delayedLocalEx", "", message);
            pgh.g("_updateAndGetTplInfoEnhancedAsync got an error when adding locals", th);
        }
        if (fBTemplateContent != null || i2 == 0) {
            aVar.successRequests.add(this.c);
            this.e.add(fBTemplateContent);
            FBTemplateDecider fBTemplateDecider2 = this.h;
            IpChange ipChange3 = FBTemplateDecider.$ipChange;
            fBTemplateDecider2.d(fBTemplateContent, aVar);
            pgh.h("_triggerDelayedTplUpdateAsync succeed to download #" + this.f + " " + this.c);
        } else {
            FBTemplateDecider fBTemplateDecider3 = this.h;
            IpChange ipChange4 = FBTemplateDecider.$ipChange;
            fBTemplateDecider3.d(null, aVar);
            aVar.failedRequests.add(this.c);
            pgh.d("_triggerDelayedTplUpdateAsync failed to download #" + this.f + " " + this.c);
        }
        this.g.countDown();
    }
}
