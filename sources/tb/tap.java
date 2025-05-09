package tb;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.contacts.data.member.ShareResultMember;
import com.taobao.message.biz.contacts.Contacts;
import com.taobao.message.biz.share.ShareGoodsParams;
import com.taobao.message.biz.share.ShareMessageService;
import com.taobao.message.biz.share.ShareType;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.AmpUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tap {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_TEMPLATE = "detail";
    public static final String TAG = "SendMsgBridge";

    /* renamed from: a  reason: collision with root package name */
    public List<Contacts> f28601a;
    public Contacts b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final tap f28602a = new tap(null);

        static {
            t2o.a(793772049);
        }

        public static /* synthetic */ tap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tap) ipChange.ipc$dispatch("66f51861", new Object[0]);
            }
            return f28602a;
        }
    }

    static {
        t2o.a(793772047);
    }

    public /* synthetic */ tap(sap sapVar) {
        this();
    }

    public static tap d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tap) ipChange.ipc$dispatch("ccf5e8fd", new Object[0]);
        }
        return a.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11d8247", new Object[]{this});
            return;
        }
        List<Contacts> list = this.f28601a;
        if (list != null) {
            list.clear();
        }
    }

    public final List<Contacts> b(String str) {
        List<Contacts> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("26308a35", new Object[]{this, str});
        }
        if (!(TextUtils.isEmpty(str) || (list = this.f28601a) == null || list.size() == 0)) {
            ArrayList arrayList = new ArrayList();
            for (Contacts contacts : this.f28601a) {
                if (str.equals(contacts.getUserId())) {
                    this.b = contacts;
                    arrayList.add(contacts);
                } else if (str.equals(AmpUtil.getOldGroupCcodeFromGroupId(contacts.getGroupId()))) {
                    this.b = contacts;
                    arrayList.add(contacts);
                }
            }
            if (arrayList.size() == 1) {
                return arrayList;
            }
        }
        return null;
    }

    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2537e6", new Object[]{this, activity});
        } else if (this.b == null) {
            fwr.c(TAG, "goChatWithContacts err:null");
        } else {
            TBS.Page.ctrlClicked(CT.Button, "GotoChat");
            Bundle bundle = new Bundle();
            if (TextUtils.equals("G", this.b.getEntityType())) {
                bundle.putString("conversation_code", AmpUtil.getOldGroupCcodeFromGroupId(this.b.getGroupId()));
            } else {
                bundle.putLong("amp_uid", Long.valueOf(this.b.getUserId()).longValue());
                bundle.putString("amp_displayname", this.b.getDisplayName());
            }
            Nav.from(hjp.a()).withExtras(bundle).toUri(ShareBizAdapter.getInstance().getFriendsProvider().c());
            if (activity != null) {
                activity.finish();
            } else {
                AppMonitor.Alarm.commitSuccess("share", "Share");
            }
        }
    }

    public void g(List<Contacts> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ff5048", new Object[]{this, list});
        } else {
            this.f28601a = list;
        }
    }

    public tap() {
    }

    public final boolean e(List<ShareResultMember> list, List<String> list2, List<String> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f0251a7", new Object[]{this, list, list2, list3})).booleanValue();
        }
        if (list.size() != 0 || ((list2.size() != 1 && list3.size() != 1) || (list2.size() == 1 && list3.size() == 1))) {
            return false;
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isSendToMsgClient", "true"));
    }

    public boolean f(String str, TBShareContent tBShareContent, List<ShareResultMember> list, List<String> list2, List<String> list3) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef3ff959", new Object[]{this, str, tBShareContent, list, list2, list3})).booleanValue();
        }
        try {
            if (tBShareContent == null) {
                fwr.c(TAG, "content: null");
                return false;
            } else if (!e(list, list2, list3)) {
                fwr.c(TAG, "isNeedSendToMsgClient: false");
                return false;
            } else {
                Map<String, String> map = tBShareContent.extraParams;
                String str3 = "";
                if (map != null) {
                    str2 = map.get("price");
                    if (str2.contains("-")) {
                        str2 = str2.split("-")[0];
                    }
                } else {
                    str2 = str3;
                }
                String j = bwr.h().j();
                if (TextUtils.isEmpty(j)) {
                    fwr.c(TAG, "itemId : null");
                    return false;
                }
                if (list2.size() == 1) {
                    str3 = list2.get(0);
                } else if (list3.size() == 1) {
                    str3 = list3.get(0);
                }
                List<Contacts> b = b(str3);
                if (b == null) {
                    fwr.c(TAG, "getRecentContactById err: null");
                    return false;
                } else if (TextUtils.isEmpty(str2)) {
                    fwr.c(TAG, "price : null");
                    return false;
                } else {
                    ShareGoodsParams shareGoodsParams = new ShareGoodsParams(b, tBShareContent.url, j, tBShareContent.imageUrl, str2, tBShareContent.description);
                    shareGoodsParams.setShareRemark(str);
                    return ((ShareMessageService) GlobalContainer.getInstance().get(ShareMessageService.class)).sendShareMessage(ShareType.GOODS, shareGoodsParams);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b(TAG, "sendShareToMsgClient err: " + th.getMessage());
            return false;
        }
    }
}
