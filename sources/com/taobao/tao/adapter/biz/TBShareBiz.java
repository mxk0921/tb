package com.taobao.tao.adapter.biz;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.multiapp.IShareBiz;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.adapter.biz.friends.TBContactsInfoProvider;
import com.taobao.tao.adapter.biz.friends.TBFriendsProvider;
import com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.interf.ILog;
import com.ut.share.utils.FlowOutFacade;
import tb.c4d;
import tb.doc;
import tb.eht;
import tb.eqb;
import tb.ewr;
import tb.fwr;
import tb.gpd;
import tb.h6r;
import tb.hg8;
import tb.i8t;
import tb.igb;
import tb.j8c;
import tb.kip;
import tb.mwr;
import tb.nor;
import tb.nv3;
import tb.nwr;
import tb.sgt;
import tb.spj;
import tb.t2o;
import tb.upd;
import tb.xjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBShareBiz implements IShareBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ClipUrlWatcherControl.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public Activity a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("1d7099f3", new Object[]{this});
            }
            if (TBShareBiz.this.getAppEnv() == null) {
                return null;
            }
            return TBShareBiz.this.getAppEnv().getTopActivity();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ILog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TBShareBiz tBShareBiz) {
        }

        @Override // com.ut.share.business.interf.ILog
        public void logd(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
            } else {
                fwr.a(str, str2);
            }
        }

        @Override // com.ut.share.business.interf.ILog
        public void loge(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
            } else {
                fwr.b(str, str2);
            }
        }

        @Override // com.ut.share.business.interf.ILog
        public void logr(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccae41c9", new Object[]{this, str, str2});
            } else {
                fwr.c(str, str2);
            }
        }
    }

    static {
        t2o.a(793772036);
        t2o.a(665845786);
    }

    public TBShareBiz() {
        ClipUrlWatcherControl.z().M(new a());
        ShareBizAdapter.getInstance().setShareEngine(new ShareEngine());
        ShareBizAdapter.getInstance().setBackFlowEngine(nv3.h());
        xjp.b().e(new SystemImageSharePlugin());
        initInject();
    }

    private void initInject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af952ac8", new Object[]{this});
            return;
        }
        ShareBusiness.getInstance().setIHasTaoPassword(new i8t());
        ShareBusiness.getInstance().setILog(new b(this));
        FlowOutFacade.injectIFlowOutHelper(new sgt());
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public igb getAppEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (igb) ipChange.ipc$dispatch("8f961b9c", new Object[]{this});
        }
        return h6r.a();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public eqb getContactsInfoProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqb) ipChange.ipc$dispatch("da65eb9c", new Object[]{this});
        }
        return TBContactsInfoProvider.k();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public j8c getFriendsProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8c) ipChange.ipc$dispatch("ec35325a", new Object[]{this});
        }
        return TBFriendsProvider.n();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public doc getLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (doc) ipChange.ipc$dispatch("35f5fb14", new Object[]{this});
        }
        return nor.c();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public c4d getOrangeDefaultValueHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4d) ipChange.ipc$dispatch("1260dc", new Object[]{this});
        }
        return new eht();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public upd getShareBackWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd) ipChange.ipc$dispatch("464e231d", new Object[]{this, str});
        }
        return nwr.l();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public gpd getShareChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gpd) ipChange.ipc$dispatch("678bb25c", new Object[]{this});
        }
        return ewr.g();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public upd getShareWeexSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd) ipChange.ipc$dispatch("add789e0", new Object[]{this});
        }
        if (kip.x("")) {
            return nwr.l();
        }
        return mwr.i();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public void initShareMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca4bc35", new Object[]{this});
            return;
        }
        spj.f().i();
        hg8.b(Globals.getApplication());
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public upd getShareWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd) ipChange.ipc$dispatch("5eed1596", new Object[]{this, str});
        }
        if (kip.x(str)) {
            return nwr.l();
        }
        return mwr.i();
    }
}
