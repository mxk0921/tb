package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class UTAnalyticsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_SHARE = "Page_Share";
    public static final int PAGE_SHARE_EVENT_ID = 19999;

    static {
        t2o.a(666894620);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (r4.equals("0") == false) goto L_0x003a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getContactClickEventName(tb.rk4 r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.util.UTAnalyticsHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "bffc67aa"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            com.taobao.tao.friends.model.SourceType r2 = r4.n()
            com.taobao.tao.friends.model.SourceType r3 = com.taobao.tao.friends.model.SourceType.RECOMMEND
            if (r2 != r3) goto L_0x0020
            java.lang.String r4 = "Page_Share_Contact_Recommend-Share-Click"
            return r4
        L_0x0020:
            tb.uk4 r4 = r4.g()
            com.taobao.tao.friends.model.ContactType r2 = r4.c
            com.taobao.tao.friends.model.ContactType r3 = com.taobao.tao.friends.model.ContactType.MORE_CONTACT
            if (r2 != r3) goto L_0x002d
            java.lang.String r4 = "Page_Contacts_Button-IntoList"
            return r4
        L_0x002d:
            java.lang.String r4 = r4.d
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case 48: goto L_0x0089;
                case 1571: goto L_0x007e;
                case 46730162: goto L_0x0073;
                case 46730163: goto L_0x0068;
                case 46730164: goto L_0x005d;
                case 46730165: goto L_0x0052;
                case 46730166: goto L_0x0047;
                case 46730169: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r0 = -1
            goto L_0x0092
        L_0x003c:
            java.lang.String r0 = "10008"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0045
            goto L_0x003a
        L_0x0045:
            r0 = 7
            goto L_0x0092
        L_0x0047:
            java.lang.String r0 = "10005"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0050
            goto L_0x003a
        L_0x0050:
            r0 = 6
            goto L_0x0092
        L_0x0052:
            java.lang.String r0 = "10004"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005b
            goto L_0x003a
        L_0x005b:
            r0 = 5
            goto L_0x0092
        L_0x005d:
            java.lang.String r0 = "10003"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x003a
        L_0x0066:
            r0 = 4
            goto L_0x0092
        L_0x0068:
            java.lang.String r0 = "10002"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0071
            goto L_0x003a
        L_0x0071:
            r0 = 3
            goto L_0x0092
        L_0x0073:
            java.lang.String r0 = "10001"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x007c
            goto L_0x003a
        L_0x007c:
            r0 = 2
            goto L_0x0092
        L_0x007e:
            java.lang.String r0 = "14"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0087
            goto L_0x003a
        L_0x0087:
            r0 = 1
            goto L_0x0092
        L_0x0089:
            java.lang.String r1 = "0"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0092
            goto L_0x003a
        L_0x0092:
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x009d;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x0097;
                case 5: goto L_0x0097;
                case 6: goto L_0x0097;
                case 7: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            r4 = 0
            return r4
        L_0x0097:
            java.lang.String r4 = "Page_Share_Contact_Temporary-Click"
            return r4
        L_0x009a:
            java.lang.String r4 = "Page_Share_Contact_Friends-Click"
            return r4
        L_0x009d:
            java.lang.String r4 = "Page_Share_Contact_Team-Click"
            return r4
        L_0x00a0:
            java.lang.String r4 = "Page_Share_Contact_Group-Click"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.UTAnalyticsHelper.getContactClickEventName(tb.rk4):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (r4.equals("0") == false) goto L_0x0045;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getContactShowEventName(tb.rk4 r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.util.UTAnalyticsHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "7bbc1c01"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            com.taobao.tao.friends.model.SourceType r2 = r4.n()
            com.taobao.tao.friends.model.SourceType r3 = com.taobao.tao.friends.model.SourceType.RECOMMEND
            if (r2 != r3) goto L_0x0020
            java.lang.String r4 = "Page_Share_Contact_Recommend-Share-Show"
            return r4
        L_0x0020:
            tb.uk4 r4 = r4.g()
            com.taobao.tao.friends.model.ContactType r2 = r4.c
            com.taobao.tao.friends.model.ContactType r3 = com.taobao.tao.friends.model.ContactType.MORE_CONTACT
            if (r2 != r3) goto L_0x002d
            java.lang.String r4 = "Page_Share_Contact_More-Show"
            return r4
        L_0x002d:
            java.lang.String r2 = r4.d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0038
            java.lang.String r4 = "Page_Share_Contact_NullBizSubType"
            return r4
        L_0x0038:
            java.lang.String r4 = r4.d
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case 48: goto L_0x0094;
                case 1571: goto L_0x0089;
                case 46730162: goto L_0x007e;
                case 46730163: goto L_0x0073;
                case 46730164: goto L_0x0068;
                case 46730165: goto L_0x005d;
                case 46730166: goto L_0x0052;
                case 46730169: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            r0 = -1
            goto L_0x009d
        L_0x0047:
            java.lang.String r0 = "10008"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0050
            goto L_0x0045
        L_0x0050:
            r0 = 7
            goto L_0x009d
        L_0x0052:
            java.lang.String r0 = "10005"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005b
            goto L_0x0045
        L_0x005b:
            r0 = 6
            goto L_0x009d
        L_0x005d:
            java.lang.String r0 = "10004"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x0045
        L_0x0066:
            r0 = 5
            goto L_0x009d
        L_0x0068:
            java.lang.String r0 = "10003"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0071
            goto L_0x0045
        L_0x0071:
            r0 = 4
            goto L_0x009d
        L_0x0073:
            java.lang.String r0 = "10002"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x007c
            goto L_0x0045
        L_0x007c:
            r0 = 3
            goto L_0x009d
        L_0x007e:
            java.lang.String r0 = "10001"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0087
            goto L_0x0045
        L_0x0087:
            r0 = 2
            goto L_0x009d
        L_0x0089:
            java.lang.String r0 = "14"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0092
            goto L_0x0045
        L_0x0092:
            r0 = 1
            goto L_0x009d
        L_0x0094:
            java.lang.String r1 = "0"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x009d
            goto L_0x0045
        L_0x009d:
            switch(r0) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a2;
                case 5: goto L_0x00a2;
                case 6: goto L_0x00a2;
                case 7: goto L_0x00a2;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r4 = 0
            return r4
        L_0x00a2:
            java.lang.String r4 = "Page_Share_Contact_Temporary-Show"
            return r4
        L_0x00a5:
            java.lang.String r4 = "Page_Share_Contact_Friends-Show"
            return r4
        L_0x00a8:
            java.lang.String r4 = "Page_Share_Contact_Team-Show"
            return r4
        L_0x00ab:
            java.lang.String r4 = "Page_Share_Contact_Group-Show"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.UTAnalyticsHelper.getContactShowEventName(tb.rk4):java.lang.String");
    }
}
