package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBUpdatePolicy$DeploymentType;
import com.flybird.deploy.model.a;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class qu8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f26935a;
    public final /* synthetic */ com.flybird.deploy.callback.a b;
    public final /* synthetic */ FBTemplateDecider c;

    public qu8(FBTemplateDecider fBTemplateDecider, a aVar, com.flybird.deploy.callback.a aVar2) {
        this.c = fBTemplateDecider;
        this.f26935a = aVar;
        this.b = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th;
        Throwable th2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        FBTemplateDecider fBTemplateDecider = this.c;
        a aVar = this.f26935a;
        com.flybird.deploy.callback.a aVar2 = this.b;
        IpChange ipChange2 = FBTemplateDecider.$ipChange;
        fBTemplateDecider.getClass();
        pgh.h("_triggerDelayedTplUpdateAsync called on " + fBTemplateDecider + " options: " + aVar);
        jst.a();
        fBTemplateDecider.b();
        ArrayList arrayList = new ArrayList();
        a.C0245a aVar3 = new a.C0245a();
        aVar3.deploymentType = FBUpdatePolicy$DeploymentType.EnhancedDeployment;
        aVar3.customToken = aVar.b();
        aVar3.customInfo.a(aVar.a());
        boolean z = false;
        try {
            String delayedGetWaitQueueTpls = FBTemplateDecider.delayedGetWaitQueueTpls(fBTemplateDecider.j);
            if (TextUtils.isEmpty(delayedGetWaitQueueTpls)) {
                pgh.h("_triggerDelayedTplUpdateAsync nothing to update");
                aVar2.onSuccess(arrayList, aVar3);
                return;
            }
            JSONArray jSONArray = new JSONArray(delayedGetWaitQueueTpls);
            int length = jSONArray.length();
            pgh.h("_triggerDelayedTplUpdateAsync waiting for " + length + " tpl_arr: " + delayedGetWaitQueueTpls);
            CountDownLatch countDownLatch = new CountDownLatch(length);
            while (i < length) {
                try {
                    String optString = jSONArray.optString(i);
                    FBFullTplInfo fromJSONString = FBFullTplInfo.fromJSONString(optString);
                    String tplId = fromJSONString.getTplId();
                    aVar3.requests.add(fromJSONString);
                    pgh.h("_triggerDelayedTplUpdateAsync trying to download #" + i + " " + fromJSONString);
                    countDownLatch = countDownLatch;
                    length = length;
                    jSONArray = jSONArray;
                    aVar3 = aVar3;
                    try {
                        FBTemplateDecider.basicDownloadTplByTplInfo(fBTemplateDecider.j, optString, new ru8(fBTemplateDecider, aVar3, tplId, fromJSONString, arrayList, i, countDownLatch));
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            fBTemplateDecider.f("", "e:decider:delayedUpdateEx", "", th2.getMessage());
                            aVar3.errors.add(th2);
                            pgh.g("_triggerDelayedTplUpdateAsync exception", th2);
                            countDownLatch.countDown();
                            i++;
                            z = false;
                        } catch (Throwable th4) {
                            th = th4;
                            fBTemplateDecider.f("", "e:decider:delayedOverallEx", "", th.getMessage());
                            aVar3.errors.add(th);
                            fBTemplateDecider.d(null, aVar3);
                            pgh.g("_triggerDelayedTplUpdateAsync error, cb:" + aVar3, th);
                            aVar2.onFailure(aVar3);
                            return;
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    countDownLatch = countDownLatch;
                    length = length;
                    jSONArray = jSONArray;
                    aVar3 = aVar3;
                }
                i++;
                z = false;
            }
            aVar3 = aVar3;
            countDownLatch.await();
            pgh.h("_triggerDelayedTplUpdateAsync all done: " + arrayList + " cb: " + aVar3);
            aVar2.onSuccess(arrayList, aVar3);
        } catch (Throwable th6) {
            th = th6;
            aVar3 = aVar3;
        }
    }
}
