package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tur implements xhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28974a = "qrcode";
    public boolean b;

    static {
        t2o.a(666894418);
        t2o.a(666894439);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        if (r13 == 0) goto L_0x00ac;
     */
    @Override // tb.xhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.tur.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "9de08c55"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            r3 = 1
            r2[r3] = r12
            r12 = 2
            r2[r12] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            if (r13 == 0) goto L_0x002f
            java.lang.String r12 = "isSuperUser"
            boolean r0 = r13.containsKey(r12)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "1"
            java.lang.Object r12 = r13.get(r12)
            boolean r12 = r0.equals(r12)
            r11.b = r12
        L_0x002f:
            boolean r12 = tb.blo.p()
            if (r12 == 0) goto L_0x003b
            java.lang.String r12 = "qrcode"
            r11.f28974a = r12
            goto L_0x0040
        L_0x003b:
            java.lang.String r12 = "gen3Code"
            r11.f28974a = r12
        L_0x0040:
            tb.bwr r12 = tb.bwr.h()
            com.taobao.share.globalmodel.TBShareContent r1 = r12.e()
            com.ut.share.data.ShareData r2 = new com.ut.share.data.ShareData
            r2.<init>()
            java.lang.String r12 = r1.businessId
            r2.setBusinessId(r12)
            java.lang.String r12 = r1.title
            r2.setTitle(r12)
            java.lang.String r12 = r1.description
            r2.setText(r12)
            java.lang.String r12 = r1.url
            r2.setLink(r12)
            tb.bwr r12 = tb.bwr.h()
            java.lang.String r12 = r12.o()
            r2.setSourceType(r12)
            java.util.Map<java.lang.String, java.lang.String> r12 = r1.activityParams
            r2.setUserInfo(r12)
            java.lang.String r12 = r1.imageUrl
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x00a2
            java.lang.String r12 = r1.imageUrl
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x008c
            java.lang.String r12 = r1.imageUrl
            java.lang.String r13 = "http://"
            boolean r12 = r12.startsWith(r13)
            if (r12 != 0) goto L_0x0097
        L_0x008c:
            java.lang.String r12 = r1.imageUrl
            java.lang.String r13 = "https://"
            boolean r12 = r12.startsWith(r13)
            if (r12 == 0) goto L_0x009d
        L_0x0097:
            java.lang.String r12 = r1.imageUrl
            r2.setImageUrl(r12)
            goto L_0x00a2
        L_0x009d:
            java.lang.String r12 = r1.imageUrl
            r2.setImagePath(r12)
        L_0x00a2:
            java.util.List<java.lang.String> r12 = r1.snapshotImages
            if (r12 == 0) goto L_0x00ac
            int r13 = r12.size()
            if (r13 != 0) goto L_0x00be
        L_0x00ac:
            java.lang.String r13 = r1.imageUrl
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x00be
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r13 = r1.imageUrl
            r12.add(r13)
        L_0x00be:
            r3 = r12
            java.util.Map<java.lang.String, java.lang.String> r12 = r1.extraParams
            if (r12 == 0) goto L_0x00ce
            java.lang.String r13 = "price"
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
        L_0x00cc:
            r4 = r12
            goto L_0x00d1
        L_0x00ce:
            java.lang.String r12 = ""
            goto L_0x00cc
        L_0x00d1:
            com.alibaba.fastjson.JSONObject r5 = r1.qrConfig
            com.taobao.share.multiapp.ShareBizAdapter r12 = com.taobao.share.multiapp.ShareBizAdapter.getInstance()
            tb.ipd r12 = r12.getShareEngine()
            tb.hwd r0 = r12.getTLongPicEngine()
            if (r0 == 0) goto L_0x00ee
            java.lang.String r6 = r1.headUrl
            boolean r7 = r1.disableQrcode
            boolean r8 = r1.disableTextInfo
            java.lang.String r9 = r11.f28974a
            boolean r10 = r11.b
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tur.a(java.lang.String, java.util.Map):void");
    }
}
