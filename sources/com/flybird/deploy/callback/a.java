package com.flybird.deploy.callback;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.IFBTplInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface a {

    /* compiled from: Taobao */
    /* renamed from: com.flybird.deploy.callback.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class C0245a extends GenericCallbackContext<IFBTplInfo, FBFullTplInfo, FBTemplateContent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(C0245a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/deploy/callback/FBTemplateDeciderCallback$CallbackContext");
        }

        @Override // com.flybird.deploy.callback.GenericCallbackContext
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FBTemplateDeciderCallback.CallbackContext{requests=" + this.requests + ", locals=" + this.locals + ", isForceUpdated=" + this.isForceUpdated + ", costTimeMillis=" + this.costTimeMillis + ", onlyUpdateFlowType='" + this.onlyUpdateFlowType + "', customInfo=" + this.customInfo + ", errors=" + this.errors + ", successRequests=" + this.successRequests + ", failedRequests=" + this.failedRequests + ", resultCode=" + this.resultCode + ", deploymentType=" + this.deploymentType + '}';
        }
    }

    void onFailure(C0245a aVar);

    void onSuccess(List<FBTemplateContent> list, C0245a aVar);
}
