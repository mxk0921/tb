package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mf7 implements g3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321540);
        t2o.a(352321892);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r4.equals(tb.se7.OPERATE_OPEN_IMMEDIATELY_FIRST_FRAME_READY) == false) goto L_0x0031;
     */
    @Override // tb.g3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.android.trade.event.Event> a(com.alibaba.fastjson.JSONObject r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.mf7.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "6d430705"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.util.List r8 = (java.util.List) r8
            return r8
        L_0x0018:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r8 != 0) goto L_0x0020
            return r3
        L_0x0020:
            java.lang.String r4 = "eventKey"
            java.lang.String r4 = r8.getString(r4)
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -2012580847: goto L_0x0084;
                case -1804140217: goto L_0x007a;
                case -931774717: goto L_0x006f;
                case -890016359: goto L_0x0063;
                case 203287846: goto L_0x0057;
                case 257484748: goto L_0x004b;
                case 1215098123: goto L_0x003f;
                case 1536672141: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            r0 = -1
            goto L_0x008f
        L_0x0033:
            java.lang.String r0 = "renderSuccess"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x003d
            goto L_0x0031
        L_0x003d:
            r0 = 7
            goto L_0x008f
        L_0x003f:
            java.lang.String r0 = "videoFirstFrameReady"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0049
            goto L_0x0031
        L_0x0049:
            r0 = 6
            goto L_0x008f
        L_0x004b:
            java.lang.String r0 = "storePlaceHolderImageMode"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0055
            goto L_0x0031
        L_0x0055:
            r0 = 5
            goto L_0x008f
        L_0x0057:
            java.lang.String r0 = "pageNavStatus"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0061
            goto L_0x0031
        L_0x0061:
            r0 = 4
            goto L_0x008f
        L_0x0063:
            java.lang.String r0 = "openImmediatelyRenderSuccess"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x006d
            goto L_0x0031
        L_0x006d:
            r0 = 3
            goto L_0x008f
        L_0x006f:
            java.lang.String r0 = "autoScrollToNextFrame"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0078
            goto L_0x0031
        L_0x0078:
            r0 = 2
            goto L_0x008f
        L_0x007a:
            java.lang.String r1 = "videoFirstFrameOpenImmediatelyReady"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x008f
            goto L_0x0031
        L_0x0084:
            java.lang.String r0 = "mediaChannelToNative"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x008e
            goto L_0x0031
        L_0x008e:
            r0 = 0
        L_0x008f:
            switch(r0) {
                case 0: goto L_0x0093;
                case 1: goto L_0x0093;
                case 2: goto L_0x0093;
                case 3: goto L_0x0093;
                case 4: goto L_0x0093;
                case 5: goto L_0x0093;
                case 6: goto L_0x0093;
                case 7: goto L_0x0093;
                default: goto L_0x0092;
            }
        L_0x0092:
            return r3
        L_0x0093:
            tb.se7 r0 = new tb.se7
            java.lang.String r1 = "uniqueId"
            java.lang.Object r1 = r8.get(r1)
            r0.<init>(r1, r8)
            r3.add(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mf7.a(com.alibaba.fastjson.JSONObject):java.util.List");
    }
}
