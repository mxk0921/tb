package com.alipay.mobile.monitor.track.spm.monitor.tracker;

import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ClickTracker extends BaseTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ClickTracker(Behavor.Builder builder) {
        super(builder);
    }

    public static /* synthetic */ Object ipc$super(ClickTracker clickTracker, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/monitor/track/spm/monitor/tracker/ClickTracker");
    }

    @Override // com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker
    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        this.mBehavorBuilder.click();
        SpmUtils.printBehaviour(BaseTracker.TAG, this.mBehavorBuilder, BehavorID.CLICK);
    }
}
