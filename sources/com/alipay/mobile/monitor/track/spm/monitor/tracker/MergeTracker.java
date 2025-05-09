package com.alipay.mobile.monitor.track.spm.monitor.tracker;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MergeTracker extends BaseTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4278a;

    public MergeTracker(String str, Behavor.Builder builder) {
        super(builder);
        this.f4278a = str;
    }

    public static /* synthetic */ Object ipc$super(MergeTracker mergeTracker, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/monitor/track/spm/monitor/tracker/MergeTracker");
    }

    @Override // com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker
    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.f4278a) && this.mBehavorBuilder != null) {
            LoggerFactory.getBehavorLogger().event(this.f4278a, this.mBehavorBuilder.build());
            SpmUtils.printBehaviour(BaseTracker.TAG, this.mBehavorBuilder, this.f4278a);
        }
    }

    public String getBehavorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab786e17", new Object[]{this});
        }
        return this.f4278a;
    }
}
