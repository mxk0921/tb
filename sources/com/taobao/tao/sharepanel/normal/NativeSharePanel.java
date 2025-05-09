package com.taobao.tao.sharepanel.normal;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.PopupWindow;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.b;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.ChannelProvider;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.AnalyticsUtil;
import java.util.List;
import tb.a22;
import tb.bwr;
import tb.gwr;
import tb.j8c;
import tb.li3;
import tb.ma4;
import tb.mip;
import tb.s02;
import tb.t2o;
import tb.ukj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NativeSharePanel extends s02 implements j8c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "TBShareMain";
    private ukj nativePanel;

    static {
        t2o.a(666894555);
        t2o.a(665845805);
    }

    public static /* synthetic */ ukj access$000(NativeSharePanel nativeSharePanel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukj) ipChange.ipc$dispatch("a480860", new Object[]{nativeSharePanel});
        }
        return nativeSharePanel.nativePanel;
    }

    public static /* synthetic */ Object ipc$super(NativeSharePanel nativeSharePanel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/normal/NativeSharePanel");
    }

    private void prepareChannelData(li3 li3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34c0965", new Object[]{this, li3Var});
        } else {
            this.nativePanel.h().f(ChannelProvider.n().b(li3Var.i(), this.mShareContext));
        }
    }

    private void prepareFriendsData(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cf3ad5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (TextUtils.equals("false", mip.s())) {
            z = false;
        }
        if (ShareBizAdapter.getInstance().getFriendsProvider() != null) {
            z2 = z;
        }
        if (TextUtils.isEmpty(ShareBizAdapter.getInstance().getLogin().getUserId())) {
            this.nativePanel.h().g(null, new BubbleTipsBean());
        } else if (z2) {
            try {
                if (ShareBizAdapter.getInstance().getFriendsProvider() == null) {
                    this.nativePanel.k();
                } else {
                    ShareBizAdapter.getInstance().getFriendsProvider().a(1, this);
                }
            } catch (Exception e) {
                TLog.loge("TBShareMain", "onFriendsProvider setDataAndSendPoint err:" + e.getMessage());
                e.printStackTrace();
                this.nativePanel.k();
            }
        } else {
            this.nativePanel.k();
        }
    }

    private void prepareShareView(TBShareContent tBShareContent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d2feeb", new Object[]{this, tBShareContent, new Boolean(z)});
            return;
        }
        this.nativePanel.o(tBShareContent.templateId, z);
        a22 a22Var = new a22();
        a22Var.d(this.mShareContext);
        a22Var.g(tBShareContent);
        this.nativePanel.d(a22Var);
    }

    private void prepareWeexData(TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785fdede", new Object[]{this, tBShareContent, str});
        } else if (!TextUtils.isEmpty(str)) {
            gwr gwrVar = new gwr();
            gwrVar.f20274a = str;
            this.nativePanel.l(tBShareContent, gwrVar);
        }
    }

    @Override // tb.s02
    public void initPanelData(TBShareContent tBShareContent, li3 li3Var, String str, int i, boolean z, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5916ac99", new Object[]{this, tBShareContent, li3Var, str, new Integer(i), new Boolean(z), str2, str3, str4});
            return;
        }
        tBShareContent.templateId = "common";
        if (!Localization.p()) {
            prepareShareView(tBShareContent, false);
            prepareChannelData(li3Var);
            return;
        }
        prepareShareView(tBShareContent, z);
        prepareFriendsData(z);
        prepareChannelData(li3Var);
        prepareWeexData(tBShareContent, str4);
    }

    @Override // tb.s02
    public void initSharePanel(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4f16ee", new Object[]{this, activity});
            return;
        }
        this.nativePanel = new ukj(activity, this.mShareActionDispatcher);
        b bVar = new b(activity);
        this.mSharePanel = bVar;
        bVar.g(this.nativePanel);
        this.mSharePanel.e(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.sharepanel.normal.NativeSharePanel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                Activity activity2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                try {
                    NativeSharePanel.access$000(NativeSharePanel.this).e();
                    if (NativeSharePanel.access$000(NativeSharePanel.this).m() && (activity2 = activity) != null) {
                        LocalBroadcastManager.getInstance(activity2.getApplication()).sendBroadcast(new Intent("action.share_dialog_close"));
                    }
                } catch (Exception unused) {
                }
            }
        });
        this.mShareActionDispatcher.k(this.mSharePanel);
        ChannelProvider.n().j(this.mShareContext.a(), this, true);
    }

    @Override // tb.j8c.a
    public void onFriendsProvider(Object obj, Object obj2, int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba85066", new Object[]{this, obj, obj2, new Integer(i), new Integer(i2)});
            return;
        }
        List<ma4> list = (List) obj;
        BubbleTipsBean bubbleTipsBean = (BubbleTipsBean) obj2;
        TBShareContent e = bwr.h().e();
        if (e != null) {
            str = e.businessId + "," + e.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId();
        } else {
            str = null;
        }
        String str2 = "";
        if (list == null || list.size() <= 0) {
            this.nativePanel.k();
            if (e != null) {
                str2 = e.businessId;
            }
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Contact_NoData", str2, null, str);
            return;
        }
        for (ma4 ma4Var : list) {
            ma4Var.d(this.mShareContext);
        }
        this.nativePanel.h().g(list, bubbleTipsBean);
        if (i2 == 0 && i > 0) {
            if (e != null) {
                str2 = e.businessId;
            }
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Contact_AllRecommend-Show", str2, null, str);
        }
        if (i > 0 && list.size() - 1 > i && e != null) {
            this.nativePanel.r(e.templateId);
        }
        AnalyticsUtil.contactShowEvent(list, e, bwr.h().l(), str);
    }
}
