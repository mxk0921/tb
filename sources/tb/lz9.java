package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import tb.eqb;
import tb.j8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lz9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FriendsDataProvider";

    static {
        t2o.a(666894408);
    }

    public static void a(j8c.a aVar, eqb.a aVar2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f05b32", new Object[]{aVar, aVar2});
        } else if (TextUtils.equals("false", mip.s())) {
            gj8.d();
        } else {
            try {
                TBShareContent e = bwr.h().e();
                if (e != null) {
                    String[] split = OrangeConfig.getInstance().getConfig("android_share", "hideFriendBizIds", "").split(",");
                    int length = split.length;
                    while (true) {
                        if (i < length) {
                            if (split[i].equals(e.businessId)) {
                                break;
                            }
                            i++;
                        } else if (aVar == null) {
                            if (ShareBizAdapter.getInstance().getContactsInfoProvider() != null) {
                                ShareBizAdapter.getInstance().getContactsInfoProvider().b(aVar2);
                                return;
                            }
                        } else if (aVar2 == null && ShareBizAdapter.getInstance().getFriendsProvider() != null) {
                            ShareBizAdapter.getInstance().getFriendsProvider().a(1, aVar);
                            return;
                        }
                    }
                    gj8.d();
                }
            } catch (Exception e2) {
                fwr.b(TAG, "onFriendsProvider setDataAndSendPoint err:" + e2.getMessage());
                e2.printStackTrace();
            }
        }
    }
}
