package tb;

import com.android.alibaba.ip.common.PatchInfo;
import com.android.alibaba.ip.common.PatchResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import com.taobao.update.instantpatch.flow.PatchChecker;
import com.taobao.update.instantpatch.model.InstantUpdateInfo;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class utl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zcf f29605a;

    static {
        t2o.a(952107029);
    }

    public utl(zcf zcfVar) {
        this.f29605a = zcfVar;
    }

    public void install(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5187e874", new Object[]{this, instantUpdateInfo});
            return;
        }
        PatchResult patchResult = new PatchResult();
        PatchInfo createPatchInfo = InstantPatchUpdater.instance().createPatchInfo(instantUpdateInfo);
        try {
            InstantPatcher.create(this.f29605a.context).setiPatchVerifier(new PatchChecker());
            patchResult = InstantPatcher.create(this.f29605a.context).handlePatches(this.f29605a.path, createPatchInfo);
        } catch (IOException e) {
            e.printStackTrace();
            patchResult.resCode = 3;
        }
        switch (patchResult.resCode) {
            case 0:
                this.f29605a.success = true;
                return;
            case 1:
                this.f29605a.success = true;
                return;
            case 2:
                zcf zcfVar = this.f29605a;
                zcfVar.success = false;
                zcfVar.errorCode = 2;
                zcfVar.errorMsg = "patch verify failed";
                return;
            case 3:
                zcf zcfVar2 = this.f29605a;
                zcfVar2.success = false;
                zcfVar2.errorCode = 3;
                zcfVar2.errorMsg = patchResult.msg;
                return;
            case 4:
                zcf zcfVar3 = this.f29605a;
                zcfVar3.success = false;
                zcfVar3.errorCode = 4;
                zcfVar3.errorMsg = "patch has no dex";
                return;
            case 5:
                zcf zcfVar4 = this.f29605a;
                zcfVar4.success = false;
                zcfVar4.errorCode = 5;
                zcfVar4.errorMsg = "patch is mismatch";
                return;
            case 6:
                zcf zcfVar5 = this.f29605a;
                zcfVar5.success = false;
                zcfVar5.errorCode = 6;
                zcfVar5.errorMsg = patchResult.msg;
                return;
            default:
                return;
        }
    }
}
