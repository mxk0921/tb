package com.taobao.tao.sharepanel.weex;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.PopupWindow;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.b;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.share.ui.engine.weex.c;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.ChannelInfo;
import com.taobao.tao.channel.ChannelProvider;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.tao.util.SpUtils;
import com.taobao.vessel.VesselView;
import java.util.List;
import java.util.Map;
import tb.bwr;
import tb.dmp;
import tb.f3w;
import tb.fb4;
import tb.gj8;
import tb.gjp;
import tb.j8c;
import tb.kip;
import tb.kkp;
import tb.kp6;
import tb.li3;
import tb.lz9;
import tb.ma4;
import tb.s02;
import tb.t2o;
import tb.upd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WeexSharePanel extends s02 implements j8c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_SHOW_CHANNEL_TYPE_KEY = "ShowChannelType";

    /* renamed from: a  reason: collision with root package name */
    public kp6 f12764a;
    public String b;

    static {
        t2o.a(666894574);
        t2o.a(665845805);
    }

    public WeexSharePanel(String str) {
        this.b = str;
    }

    public static /* synthetic */ b a(WeexSharePanel weexSharePanel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8a780dbc", new Object[]{weexSharePanel});
        }
        return weexSharePanel.mSharePanel;
    }

    public static /* synthetic */ Object ipc$super(WeexSharePanel weexSharePanel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/WeexSharePanel");
    }

    public kp6 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kp6) ipChange.ipc$dispatch("8c59c425", new Object[]{this});
        }
        return this.f12764a;
    }

    public final void c(TBShareContent tBShareContent, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51a51e", new Object[]{this, tBShareContent, str});
        } else if (!TextUtils.isEmpty(str)) {
            ShareBizAdapter instance = ShareBizAdapter.getInstance();
            if (tBShareContent != null) {
                str2 = tBShareContent.businessId;
            } else {
                str2 = "";
            }
            upd shareWeexSdk = instance.getShareWeexSdk(str2);
            if (shareWeexSdk != null) {
                shareWeexSdk.b();
            }
            gj8.i(str, tBShareContent);
        }
    }

    @Override // tb.s02
    public void initSharePanel(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4f16ee", new Object[]{this, activity});
            return;
        }
        kkp e = kkp.e();
        e.a(kkp.KEY_SHAREPANELINITSHAREPANELSTART);
        if (ShareBizAdapter.getInstance().getContactsInfoProvider() != null) {
            ShareBizAdapter.getInstance().getContactsInfoProvider().a();
        }
        TBShareContent a2 = this.mShareContext.a();
        ChannelProvider.n().j(a2, this, false);
        this.f12764a = new kp6();
        fb4.a();
        e.a(kkp.KEY_SHAREPANELINITSHAREPANELEND);
        if (a2 == null || !kip.x(a2.businessId)) {
            VesselView g = c.g(activity, this.b, this, "");
            b bVar = new b(activity);
            this.mSharePanel = bVar;
            bVar.i(g);
        } else {
            String str = a2.businessId;
            String d = kip.d();
            this.b = d;
            WeexBizView h = c.h(activity, d, this, str);
            this.mSharePanel = new b(activity);
            e.a(kkp.KEY_SHAREPANELSHOWWEEX2START);
            this.mSharePanel.h(h);
        }
        this.mSharePanel.e(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.sharepanel.weex.WeexSharePanel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                WeexSharePanel.a(WeexSharePanel.this).d();
                WeexSharePanel.this.f12764a.i();
                ChannelProvider.n().p(null);
            }
        });
        this.mShareActionDispatcher.k(this.mSharePanel);
        if (kip.x(a2.businessId)) {
            this.mShareActionDispatcher.f();
        } else {
            this.mShareActionDispatcher.e();
        }
    }

    @Override // tb.j8c.a
    public void onFriendsProvider(Object obj, Object obj2, int i, int i2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba85066", new Object[]{this, obj, obj2, new Integer(i), new Integer(i2)});
            return;
        }
        List<ma4> list = (List) obj;
        this.f12764a.n((BubbleTipsBean) obj2);
        TBShareContent e = bwr.h().e();
        if (e != null) {
            String str = e.businessId + "," + e.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId();
            if (list == null || list.size() <= 0) {
                gj8.d();
                TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Contact_NoData", e.businessId, null, str);
                return;
            }
            for (ma4 ma4Var : list) {
                ma4Var.d(this.mShareContext);
            }
            this.f12764a.c(list);
            boolean z2 = i > 0 && list.size() - 1 > i;
            if (!SpUtils.getGuide(gjp.a(), SpUtils.START_GUIDE_NEW) && !TextUtils.equals("common", e.templateId)) {
                z = true;
            }
            if (z2 && z) {
                gj8.j();
                SpUtils.cacheSaveGuide(SpUtils.START_GUIDE_NEW, true);
            }
            AnalyticsUtil.contactShowEvent(list, e, bwr.h().l(), str);
        }
    }

    @Override // tb.s02
    public void initPanelData(TBShareContent tBShareContent, li3 li3Var, String str, int i, boolean z, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5916ac99", new Object[]{this, tBShareContent, li3Var, str, new Integer(i), new Boolean(z), str2, str3, str4});
            return;
        }
        kkp e = kkp.e();
        e.a(kkp.KEY_SHAREPANELINITSHAREPANELDATASTART);
        String d = dmp.d(CACHE_SHOW_CHANNEL_TYPE_KEY, "2");
        String str6 = "";
        if (TextUtils.equals("2", d)) {
            f3w.b("2");
            ChannelProvider.n().p(ChannelProvider.n().d(li3Var.i(), this.mShareContext, false));
            Map<String, List<ChannelInfo>> f = ChannelProvider.n().f(li3Var.i(), this.mShareContext);
            if (f != null) {
                str6 = JSON.toJSONString(f.get(ChannelProvider.CHANNEL_LIST_KEY));
                str5 = JSON.toJSONString(f.get(ChannelProvider.TOOL_LIST_KEY));
            } else {
                str5 = str6;
            }
        } else {
            f3w.b("1");
            this.f12764a.b(ChannelProvider.n().d(li3Var.i(), this.mShareContext, true));
            this.f12764a.d(ChannelProvider.n().k(li3Var.i(), this.mShareContext, false));
            str6 = str6;
            str5 = str6;
        }
        gj8.l(tBShareContent, str6, str5, str, i, z, str2, d);
        dmp.a(CACHE_SHOW_CHANNEL_TYPE_KEY, str3);
        c(tBShareContent, str4);
        if (!z) {
            gj8.d();
        } else if (TextUtils.equals("2", str2)) {
            f3w.c("2");
            lz9.a(null, null);
        } else {
            f3w.c("1");
            lz9.a(this, null);
        }
        e.a(kkp.KEY_SHAREPANELINITSHAREPANELDATAEND);
    }
}
