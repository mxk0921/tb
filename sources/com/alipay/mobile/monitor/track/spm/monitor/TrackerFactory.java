package com.alipay.mobile.monitor.track.spm.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TrackerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r5.equals(com.alipay.mobile.common.logging.api.behavor.BehavorID.SLIDE) == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker createTracker(java.lang.String r5, com.alipay.mobile.common.logging.api.behavor.Behavor.Builder r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.monitor.track.spm.monitor.TrackerFactory.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "55af7291"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r5 = r3.ipc$dispatch(r4, r2)
            com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker r5 = (com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker) r5
            return r5
        L_0x0018:
            r5.hashCode()
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1926005497: goto L_0x003a;
                case -899647277: goto L_0x0030;
                case 860524583: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0044
        L_0x0025:
            java.lang.String r0 = "clicked"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 2
            goto L_0x0044
        L_0x0030:
            java.lang.String r1 = "slided"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0044
            goto L_0x0023
        L_0x003a:
            java.lang.String r0 = "exposure"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0043
            goto L_0x0023
        L_0x0043:
            r0 = 0
        L_0x0044:
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x004f;
                case 2: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            r5 = 0
            return r5
        L_0x0049:
            com.alipay.mobile.monitor.track.spm.monitor.tracker.ClickTracker r5 = new com.alipay.mobile.monitor.track.spm.monitor.tracker.ClickTracker
            r5.<init>(r6)
            return r5
        L_0x004f:
            com.alipay.mobile.monitor.track.spm.monitor.tracker.SlideTracker r5 = new com.alipay.mobile.monitor.track.spm.monitor.tracker.SlideTracker
            r5.<init>(r6)
            return r5
        L_0x0055:
            com.alipay.mobile.monitor.track.spm.monitor.tracker.ExposeTracker r5 = new com.alipay.mobile.monitor.track.spm.monitor.tracker.ExposeTracker
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.monitor.track.spm.monitor.TrackerFactory.createTracker(java.lang.String, com.alipay.mobile.common.logging.api.behavor.Behavor$Builder):com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker");
    }
}
