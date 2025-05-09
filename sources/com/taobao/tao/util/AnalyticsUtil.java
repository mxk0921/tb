package com.taobao.tao.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.friends.model.ContactType;
import java.util.List;
import java.util.Properties;
import tb.bwr;
import tb.kjp;
import tb.ma4;
import tb.mip;
import tb.rk4;
import tb.t2o;
import tb.uk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AnalyticsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894617);
    }

    public static void traceChannelSelect(ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f19bff", new Object[]{ma4Var});
            return;
        }
        TBShareContent e = bwr.h().e();
        if (e != null && ma4Var != null) {
            TBS.Ext.commitEvent("Page_Share", 19999, "ChannelSelect", e.businessId, e.detailSharePosition, e.businessId + "," + e.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + ma4Var.b() + ",true,suId=" + e.suId);
        }
    }

    public static void tracePopupEvent(TBShareContent tBShareContent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a447f1", new Object[]{tBShareContent, new Long(j)});
        } else if (tBShareContent != null) {
            String str = tBShareContent.businessId;
            String str2 = tBShareContent.detailSharePosition;
            TBS.Ext.commitEvent("Page_Share", 19999, "Popup", str, str2, tBShareContent.businessId + "," + tBShareContent.templateId + "," + j + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + bwr.h().m() + ",suId=" + tBShareContent.suId);
            StringBuilder sb = new StringBuilder();
            sb.append(tBShareContent.businessId);
            sb.append(",");
            sb.append(tBShareContent.templateId);
            sb.append(",");
            sb.append(j);
            TBS.Ext.commitEvent("UT", 19999, "Page_Share-Popup", tBShareContent.businessId, tBShareContent.detailSharePosition, sb.toString());
        }
    }

    public static void traceShowShareView(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d098624", new Object[]{tBShareContent});
        } else {
            TBS.Ext.commitEventEnd("ShareLoadTime", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void traceViewClickOthers(tb.ma4 r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "withPic=0&passwordKey="
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.util.AnalyticsUtil.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r0 = "7a126250"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            r9 = 1
            r2[r9] = r10
            r1.ipc$dispatch(r0, r2)
            return
        L_0x0018:
            tb.bwr r1 = tb.bwr.h()
            com.taobao.share.globalmodel.TBShareContent r1 = r1.e()
            if (r1 != 0) goto L_0x0023
            return
        L_0x0023:
            com.ut.share.business.ShareTargetType r2 = com.ut.share.business.ShareTargetType.Share2Contact
            java.lang.String r2 = r2.getValue()
            java.lang.String r3 = r9.b()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0034
            return
        L_0x0034:
            java.lang.String r5 = r1.businessId
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x003d
            return
        L_0x003d:
            java.lang.String r2 = r9.b()
            tb.kjp$a r2 = tb.kjp.b(r2)
            if (r2 != 0) goto L_0x0059
            tb.kjp$a r2 = new tb.kjp$a
            tb.pxr r3 = new tb.pxr
            r3.<init>()
            java.lang.String r4 = r9.b()
            java.lang.String r6 = r9.b()
            r2.<init>(r3, r4, r6)
        L_0x0059:
            com.ut.share.business.ShareTargetType r3 = com.ut.share.business.ShareTargetType.Share2Copy
            java.lang.String r3 = r3.getValue()
            java.lang.String r9 = r9.b()
            boolean r9 = android.text.TextUtils.equals(r3, r9)
            if (r9 == 0) goto L_0x0088
            com.taobao.share.multiapp.ShareBizAdapter r9 = com.taobao.share.multiapp.ShareBizAdapter.getInstance()
            tb.igb r9 = r9.getAppEnv()
            java.lang.String r9 = r9.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0088
            r3.<init>(r0)     // Catch: all -> 0x0088
            java.lang.String r0 = "UTF-8"
            java.lang.String r9 = java.net.URLEncoder.encode(r9, r0)     // Catch: all -> 0x0088
            r3.append(r9)     // Catch: all -> 0x0088
            java.lang.String r9 = r3.toString()     // Catch: all -> 0x0088
            goto L_0x008b
        L_0x0088:
            java.lang.String r9 = "withPic=0"
        L_0x008b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = "&"
            r0.append(r9)
            java.lang.String r9 = r1.originUTArgs()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            if (r10 == 0) goto L_0x00b4
            java.lang.String r6 = r2.b
            java.lang.String[] r8 = new java.lang.String[]{r9}
            java.lang.String r3 = "Page_Extend"
            r4 = 5002(0x138a, float:7.009E-42)
            r7 = r10
            com.taobao.statistic.TBS.Ext.commitEvent(r3, r4, r5, r6, r7, r8)
            goto L_0x00c3
        L_0x00b4:
            java.lang.String r6 = r2.b
            java.lang.String r7 = r1.url
            java.lang.String[] r8 = new java.lang.String[]{r9}
            java.lang.String r3 = "Page_Extend"
            r4 = 5002(0x138a, float:7.009E-42)
            com.taobao.statistic.TBS.Ext.commitEvent(r3, r4, r5, r6, r7, r8)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.AnalyticsUtil.traceViewClickOthers(tb.ma4, java.lang.String):void");
    }

    public static void traceWXAndQQShare(ma4 ma4Var, String str, boolean z, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d4aaa1", new Object[]{ma4Var, str, new Boolean(z), str2});
            return;
        }
        kjp.a b = kjp.b(ma4Var.b());
        String b2 = ma4Var.b();
        TBShareContent a2 = ma4Var.a().a();
        String str4 = "";
        String str5 = b != null ? b.b : str4;
        if (b != null) {
            str4 = b.c;
        }
        if (!TextUtils.isEmpty(b2) && bwr.h().e() != null) {
            String str6 = a2.businessId;
            if (z) {
                str3 = "withPic=1&PicUrl=" + a2.imageUrl + "&passwordKey=" + str2;
            } else {
                str3 = "withPic=0&PicUrl=" + a2.imageUrl + "&passwordKey=" + str2;
            }
            String str7 = str3 + "&" + a2.originUTArgs();
            if (!TextUtils.isEmpty(str6)) {
                TBS.Ext.commitEvent("Page_Extend", 5002, str6, str5, str, str7);
            }
            Properties properties = new Properties();
            if (!TextUtils.isEmpty(str4)) {
                properties.put("Type", str4);
            }
            if (!TextUtils.isEmpty(str6)) {
                properties.put("bizID", str6);
            }
            a2.fillUTProperties(properties);
            TBS.Ext.commitEvent("ShareTypes", properties);
        }
    }

    public static void wxAndQQOnClick(ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b152da18", new Object[]{ma4Var});
        } else if (!mip.e()) {
            kjp.a b = kjp.b(ma4Var.b());
            TBShareContent a2 = ma4Var.a().a();
            if (!TextUtils.isEmpty(ma4Var.b()) && bwr.h().e() != null) {
                String str = a2.businessId;
                if (!TextUtils.isEmpty(str)) {
                    TBS.Ext.commitEvent(5002, str, b.b, a2.url, a2.originUTArgs());
                }
                Properties properties = new Properties();
                if (!TextUtils.isEmpty(b.c)) {
                    properties.put("Type", b.c);
                }
                if (!TextUtils.isEmpty(str)) {
                    properties.put("bizID", str);
                }
                a2.fillUTProperties(properties);
                TBS.Ext.commitEvent("ShareTypes", properties);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r4.equals("alipay") == false) goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getPlatformByTag(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.util.AnalyticsUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "e6326195"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1414960566: goto L_0x0068;
                case -904024897: goto L_0x005c;
                case 3616: goto L_0x0050;
                case 114009: goto L_0x0044;
                case 3059573: goto L_0x0039;
                case 113011944: goto L_0x002d;
                case 133862058: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = -1
            goto L_0x0071
        L_0x0022:
            java.lang.String r0 = "dingtalk"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r0 = 6
            goto L_0x0071
        L_0x002d:
            java.lang.String r0 = "weibo"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0037
            goto L_0x0020
        L_0x0037:
            r0 = 5
            goto L_0x0071
        L_0x0039:
            java.lang.String r0 = "copy"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0042
            goto L_0x0020
        L_0x0042:
            r0 = 4
            goto L_0x0071
        L_0x0044:
            java.lang.String r0 = "sms"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004e
            goto L_0x0020
        L_0x004e:
            r0 = 3
            goto L_0x0071
        L_0x0050:
            java.lang.String r0 = "qq"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005a
            goto L_0x0020
        L_0x005a:
            r0 = 2
            goto L_0x0071
        L_0x005c:
            java.lang.String r0 = "wxfriend"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x0020
        L_0x0066:
            r0 = 1
            goto L_0x0071
        L_0x0068:
            java.lang.String r1 = "alipay"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0071
            goto L_0x0020
        L_0x0071:
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0086;
                case 2: goto L_0x0083;
                case 3: goto L_0x0080;
                case 4: goto L_0x007d;
                case 5: goto L_0x007a;
                case 6: goto L_0x0077;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r4 = "Other"
            return r4
        L_0x0077:
            java.lang.String r4 = "DingTalk"
            return r4
        L_0x007a:
            java.lang.String r4 = "SinaWeibo"
            return r4
        L_0x007d:
            java.lang.String r4 = "Copy"
            return r4
        L_0x0080:
            java.lang.String r4 = "SMS"
            return r4
        L_0x0083:
            java.lang.String r4 = "TaoPassword-QQ"
            return r4
        L_0x0086:
            java.lang.String r4 = "TaoPassword-WeiXin"
            return r4
        L_0x0089:
            java.lang.String r4 = "AliPay"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.AnalyticsUtil.getPlatformByTag(java.lang.String):java.lang.String");
    }

    public static void contactShowEvent(List<ma4> list, TBShareContent tBShareContent, String str, String str2) {
        rk4 rk4Var;
        uk4 g;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8df14c", new Object[]{list, tBShareContent, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        for (ma4 ma4Var : list) {
            if ((ma4Var instanceof rk4) && (g = (rk4Var = (rk4) ma4Var).g()) != null) {
                str4 = rk4Var.i();
                str5 = rk4Var.l();
                str6 = rk4Var.m();
                if (rk4Var.j() != null) {
                    String userId = rk4Var.j().getUserId();
                    if (TextUtils.isEmpty(userId)) {
                        userId = rk4Var.j().getCcode();
                    }
                    sb.append(userId);
                    sb.append("^");
                }
                if (g.c == ContactType.LINK && !TextUtils.isEmpty(rk4Var.h()) && "14".equals(g.d)) {
                    TBS.Ext.commitEvent("Page_Share", 19999, "Page_Detail_creatgroup_expose", (Object) null, (Object) null);
                }
                if (tBShareContent != null) {
                    String contactShowEventName = UTAnalyticsHelper.getContactShowEventName(rk4Var);
                    if (rk4Var.j() != null) {
                        str3 = rk4Var.j().getUserId();
                        if (TextUtils.isEmpty(str3)) {
                            str3 = rk4Var.j().getCcode();
                        }
                    } else {
                        str3 = null;
                    }
                    TBS.Ext.commitEvent("Page_Share", 19999, contactShowEventName, tBShareContent.businessId, str3, str2);
                }
            }
        }
        if (tBShareContent != null) {
            String userId2 = ShareBizAdapter.getInstance().getLogin().getUserId();
            String str7 = tBShareContent.businessId;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tBShareContent.businessId);
            sb2.append(",");
            sb2.append(userId2 != null);
            sb2.append(",");
            sb2.append(userId2);
            TBS.Ext.commitEvent("Page_Share", 19999, "ContactsShow", str7, null, sb2.toString());
            String str8 = tBShareContent.url;
            if ("detail".equals(tBShareContent.templateId)) {
                str8 = bwr.h().j();
            } else if ("shop".equals(tBShareContent.templateId)) {
                try {
                    str8 = tBShareContent.url.split(".")[0].split("shop")[1];
                } catch (Throwable unused) {
                }
            }
            String sb3 = sb.toString();
            if (sb3.endsWith("^")) {
                sb3 = sb3.substring(0, sb3.length() - 1);
            }
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Friends_expose", tBShareContent.businessId, null, "shareTraceId=" + str6 + ",userId=" + userId2 + ",recommendUserIds=" + sb3 + ",timeStamp=" + System.currentTimeMillis() + ",shareContent=" + str8 + ",templateId=" + tBShareContent.templateId + ",pvid=" + str4 + ",scm=" + str5);
        }
    }
}
