package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.b;
import com.taobao.statistic.TBS;
import com.taobao.tao.friends.model.ContactType;
import com.taobao.tao.util.UTAnalyticsHelper;
import com.ut.share.business.ShareTargetType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sk4 extends ksa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894441);
    }

    public sk4(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ Object ipc$super(sk4 sk4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/interceptor/ContactHandlerInterceptor");
    }

    @Override // tb.ksa
    public boolean c(Context context, ma4 ma4Var, int i, b bVar) {
        ComponentType c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d18e050", new Object[]{this, context, ma4Var, new Integer(i), bVar})).booleanValue();
        }
        if (ma4Var == null) {
            c = ComponentType.CONTACT_ITEM;
        } else {
            c = ma4Var.c();
        }
        return TextUtils.equals(c.desc, ComponentType.CONTACT_ITEM.desc);
    }

    @Override // tb.ksa
    public void b(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0736b2", new Object[]{this, context, ma4Var, new Integer(i), bVar});
            return;
        }
        TBShareContent e = bwr.h().e();
        if (e == null || !(ma4Var instanceof rk4)) {
            kjp.c(ShareTargetType.Share2Contact.getValue(), null);
        } else {
            rk4 rk4Var = (rk4) ma4Var;
            uk4 g = rk4Var.g();
            String str = "";
            gj8.b(ma4Var.b(), str, JSON.toJSONString(rk4Var.j()));
            if (g.c != ContactType.LINK || TextUtils.isEmpty(rk4Var.h())) {
                if (rk4Var.j() != null) {
                    str = rk4Var.j().getUserId();
                    if (TextUtils.isEmpty(str)) {
                        str = rk4Var.j().getCcode();
                    }
                }
                String contactClickEventName = UTAnalyticsHelper.getContactClickEventName(rk4Var);
                if (!TextUtils.isEmpty(contactClickEventName)) {
                    TBS.Ext.commitEvent("Page_Share", 19999, contactClickEventName, e.businessId, str, e.businessId + "," + e.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + ma4Var.b() + ",");
                }
                String str2 = e.url;
                if ("detail".equals(e.templateId)) {
                    str2 = bwr.h().j();
                } else if ("shop".equals(e.templateId)) {
                    try {
                        str2 = e.url.split(".")[0].split("shop")[1];
                    } catch (Throwable unused) {
                    }
                }
                TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Friends_click", e.businessId, null, "shareTraceId=" + rk4Var.m() + ",userId=" + ShareBizAdapter.getInstance().getLogin().getUserId() + ",targetUserId=" + str + ",position=" + (i + 1) + ",timeStamp=" + System.currentTimeMillis() + ",shareContent=" + str2 + ",templateId=" + e.templateId + ",pvid=" + rk4Var.i() + ",scm=" + rk4Var.l());
                RecentMember j = rk4Var.j();
                if (j == null) {
                    kjp.c(ShareTargetType.Share2Contact.getValue(), null);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", j.getName());
                    hashMap.put("userId", j.getUserId());
                    hashMap.put("headUrl", j.getHeadUrl());
                    hashMap.put("timeStamp", String.valueOf(j.getTimeStamp()));
                    hashMap.put("phone", j.getPhone());
                    hashMap.put("taoFlag", j.getTaoFlag());
                    hashMap.put("taoFriendName", j.getTaoFriendName());
                    if (j.isTaoFriend()) {
                        hashMap.put("taoFriend", "true");
                    } else {
                        hashMap.put("taoFriend", "false");
                    }
                    hashMap.put("type", String.valueOf(j.getType()));
                    hashMap.put("ccode", j.getCcode());
                    hashMap.put("recordNum", String.valueOf(j.getRecordNum()));
                    kjp.c(ShareTargetType.Share2Contact.getValue(), hashMap);
                }
            } else {
                Nav.from(context).toUri(rk4Var.h());
                if ("14".equals(g.d)) {
                    TBS.Ext.commitEvent("Page_Share", 19999, "Page_Detail_creatgroup_click", (Object) null, (Object) null);
                }
            }
        }
        if (bVar != null) {
            bVar.c();
        }
    }
}
