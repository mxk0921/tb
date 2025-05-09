package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sur implements xhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28286a;

    static {
        t2o.a(666894417);
        t2o.a(666894439);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r0 == 0) goto L_0x009b;
     */
    @Override // tb.xhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.sur.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "9de08c55"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            r7 = 2
            r2[r7] = r8
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            if (r8 == 0) goto L_0x002f
            java.lang.String r7 = "isSuperUser"
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "1"
            java.lang.Object r7 = r8.get(r7)
            boolean r7 = r0.equals(r7)
            r6.f28286a = r7
        L_0x002f:
            tb.bwr r7 = tb.bwr.h()
            com.taobao.share.globalmodel.TBShareContent r7 = r7.e()
            com.ut.share.data.ShareData r1 = new com.ut.share.data.ShareData
            r1.<init>()
            java.lang.String r8 = r7.businessId
            r1.setBusinessId(r8)
            java.lang.String r8 = r7.title
            r1.setTitle(r8)
            java.lang.String r8 = r7.description
            r1.setText(r8)
            java.lang.String r8 = r7.url
            r1.setLink(r8)
            tb.bwr r8 = tb.bwr.h()
            java.lang.String r8 = r8.o()
            r1.setSourceType(r8)
            java.util.Map<java.lang.String, java.lang.String> r8 = r7.activityParams
            r1.setUserInfo(r8)
            java.lang.String r8 = r7.imageUrl
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0091
            java.lang.String r8 = r7.imageUrl
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x007b
            java.lang.String r8 = r7.imageUrl
            java.lang.String r0 = "http://"
            boolean r8 = r8.startsWith(r0)
            if (r8 != 0) goto L_0x0086
        L_0x007b:
            java.lang.String r8 = r7.imageUrl
            java.lang.String r0 = "https://"
            boolean r8 = r8.startsWith(r0)
            if (r8 == 0) goto L_0x008c
        L_0x0086:
            java.lang.String r8 = r7.imageUrl
            r1.setImageUrl(r8)
            goto L_0x0091
        L_0x008c:
            java.lang.String r8 = r7.imageUrl
            r1.setImagePath(r8)
        L_0x0091:
            java.util.List<java.lang.String> r8 = r7.snapshotImages
            if (r8 == 0) goto L_0x009b
            int r0 = r8.size()
            if (r0 != 0) goto L_0x00ad
        L_0x009b:
            java.lang.String r0 = r7.imageUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ad
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r0 = r7.imageUrl
            r8.add(r0)
        L_0x00ad:
            r2 = r8
            java.util.Map<java.lang.String, java.lang.String> r8 = r7.extraParams
            if (r8 == 0) goto L_0x00bd
            java.lang.String r0 = "price"
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
        L_0x00bb:
            r3 = r8
            goto L_0x00c0
        L_0x00bd:
            java.lang.String r8 = ""
            goto L_0x00bb
        L_0x00c0:
            com.alibaba.fastjson.JSONObject r4 = r7.qrConfig
            com.taobao.share.multiapp.ShareBizAdapter r7 = com.taobao.share.multiapp.ShareBizAdapter.getInstance()
            tb.ipd r7 = r7.getShareEngine()
            tb.med r0 = r7.getQRCodeScanEngine()
            if (r0 == 0) goto L_0x00d5
            boolean r5 = r6.f28286a
            r0.a(r1, r2, r3, r4, r5)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sur.a(java.lang.String, java.util.Map):void");
    }
}
