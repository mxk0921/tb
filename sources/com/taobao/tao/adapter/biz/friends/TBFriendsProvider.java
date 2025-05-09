package com.taobao.tao.adapter.biz.friends;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.message.biz.contacts.Contacts;
import com.taobao.message.kit.core.IObserver;
import com.taobao.share.core.contacts.mtop.request.ComTaobaoGetContactsMessagesRequest;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoGetContactsMessageResponse;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoGetContactsMessageResponseData;
import com.taobao.share.core.contacts.mtop.response.RecentContactsModel;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.statistic.TBS;
import com.taobao.tao.friends.model.ContactType;
import com.taobao.tao.friends.model.SourceType;
import com.taobao.tao.log.TLog;
import com.taobao.tao.msgcenter.aidl.IMessageBoxService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bwr;
import tb.fwr;
import tb.gjp;
import tb.j8c;
import tb.kip;
import tb.mbl;
import tb.mip;
import tb.rk4;
import tb.t2o;
import tb.tap;
import tb.uk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBFriendsProvider implements j8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f11883a;
    public int b;
    public int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AsyncTask<Void, Void, IMessageBoxService> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11884a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public a(TBFriendsProvider tBFriendsProvider, String str, int i, int i2, String str2, int i3, String str3) {
            this.f11884a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
            this.e = i3;
            this.f = str3;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/adapter/biz/friends/TBFriendsProvider$1");
        }

        /* renamed from: a */
        public IMessageBoxService doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMessageBoxService) ipChange.ipc$dispatch("ba877560", new Object[]{this, voidArr});
            }
            return Services.get(ShareBizAdapter.getInstance().getAppEnv().getTopActivity(), (Class<IMessageBoxService>) IMessageBoxService.class);
        }

        /* renamed from: b */
        public void onPostExecute(IMessageBoxService iMessageBoxService) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb6faefe", new Object[]{this, iMessageBoxService});
            } else if (iMessageBoxService != null) {
                try {
                    iMessageBoxService.sendImgMessage(this.f11884a, this.b, this.c, this.d, this.e, this.f);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IObserver<List<Contacts>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f11885a;
        public final /* synthetic */ int b;
        public final /* synthetic */ j8c.a c;
        public final /* synthetic */ long d;

        public b(List list, int i, j8c.a aVar, long j) {
            this.f11885a = list;
            this.b = i;
            this.c = aVar;
            this.d = j;
        }

        /* renamed from: a */
        public void onNext(List<Contacts> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d15fbea", new Object[]{this, list});
            } else if (list != null) {
                this.f11885a.addAll(list);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (this.b == 0) {
                this.c.onFriendsProvider(TBFriendsProvider.h(TBFriendsProvider.this, this.f11885a), null, 0, 0);
            } else {
                tap.d().g(this.f11885a);
                TBFriendsProvider.g(TBFriendsProvider.this, this.f11885a, this.c, this.d);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else if (this.b == 0) {
                this.c.onFriendsProvider(null, null, 0, 0);
            } else {
                TBFriendsProvider.g(TBFriendsProvider.this, this.f11885a, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TBFriendsProvider f11886a = new TBFriendsProvider(null);

        static {
            t2o.a(793772058);
        }

        public static /* synthetic */ TBFriendsProvider a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBFriendsProvider) ipChange.ipc$dispatch("38b7246b", new Object[0]);
            }
            return f11886a;
        }
    }

    static {
        t2o.a(793772054);
        t2o.a(665845804);
    }

    public /* synthetic */ TBFriendsProvider(a aVar) {
        this();
    }

    public static /* synthetic */ void g(TBFriendsProvider tBFriendsProvider, List list, j8c.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f234e8", new Object[]{tBFriendsProvider, list, aVar, new Long(j)});
        } else {
            tBFriendsProvider.o(list, aVar, j);
        }
    }

    public static /* synthetic */ String h(TBFriendsProvider tBFriendsProvider, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3fab8e8", new Object[]{tBFriendsProvider, list});
        }
        return tBFriendsProvider.m(list);
    }

    public static /* synthetic */ int i(TBFriendsProvider tBFriendsProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff3f843b", new Object[]{tBFriendsProvider})).intValue();
        }
        return tBFriendsProvider.b;
    }

    public static /* synthetic */ int j(TBFriendsProvider tBFriendsProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9b524bc", new Object[]{tBFriendsProvider})).intValue();
        }
        return tBFriendsProvider.c;
    }

    public static TBFriendsProvider n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFriendsProvider) ipChange.ipc$dispatch("23975251", new Object[0]);
        }
        return c.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r2 <= 0) goto L_0x0051;
     */
    @Override // tb.j8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(@com.taobao.share.multiapp.ShareBizAdapter.FriendsType int r11, tb.j8c.a r12) {
        /*
            r10 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.adapter.biz.friends.TBFriendsProvider.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r11)
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r0] = r10
            r0 = 1
            r11[r0] = r2
            r0 = 2
            r11[r0] = r12
            java.lang.String r12 = "2869cc0a"
            r1.ipc$dispatch(r12, r11)
            return
        L_0x001d:
            long r7 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            tb.bwr r1 = tb.bwr.h()
            com.taobao.share.globalmodel.TBShareContent r1 = r1.e()
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = r1.businessId
            goto L_0x0035
        L_0x0033:
            java.lang.String r1 = ""
        L_0x0035:
            boolean r2 = tb.kip.v()
            if (r2 == 0) goto L_0x0045
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r2 = tb.kip.i()
            r1.<init>(r2)
            goto L_0x0049
        L_0x0045:
            java.util.List r1 = tb.mip.d(r1)
        L_0x0049:
            if (r1 == 0) goto L_0x0051
            int r2 = r1.size()
            if (r2 > 0) goto L_0x0079
        L_0x0051:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "0"
            r1.add(r2)
            java.lang.String r2 = "14"
            r1.add(r2)
            java.lang.String r2 = "10001"
            r1.add(r2)
            java.lang.String r2 = "10002"
            r1.add(r2)
            java.lang.String r2 = "10003"
            r1.add(r2)
            java.lang.String r2 = "10004"
            r1.add(r2)
            java.lang.String r2 = "10005"
            r1.add(r2)
        L_0x0079:
            com.taobao.message.kit.core.GlobalContainer r2 = com.taobao.message.kit.core.GlobalContainer.getInstance()
            java.lang.Class<com.taobao.message.biz.contacts.ContactsService> r3 = com.taobao.message.biz.contacts.ContactsService.class
            java.lang.Object r2 = r2.get(r3)
            r9 = r2
            com.taobao.message.biz.contacts.ContactsService r9 = (com.taobao.message.biz.contacts.ContactsService) r9
            if (r9 != 0) goto L_0x009b
            if (r11 != 0) goto L_0x008f
            r11 = 0
            r12.onFriendsProvider(r11, r11, r0, r0)
            goto L_0x0092
        L_0x008f:
            r10.o(r4, r12, r7)
        L_0x0092:
            java.lang.String r11 = r10.f11883a
            java.lang.String r12 = "getContactsService null"
            com.taobao.tao.log.TLog.logd(r11, r12)
            return
        L_0x009b:
            com.taobao.tao.adapter.biz.friends.TBFriendsProvider$b r0 = new com.taobao.tao.adapter.biz.friends.TBFriendsProvider$b
            r2 = r0
            r3 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r4, r5, r6, r7)
            r9.getRecentContacts(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.adapter.biz.friends.TBFriendsProvider.a(int, tb.j8c$a):void");
    }

    @Override // tb.j8c
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ceb5707", new Object[]{this});
        }
        return mbl.b();
    }

    @Override // tb.j8c
    public void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2537e6", new Object[]{this, activity});
        } else {
            tap.d().c(activity);
        }
    }

    @Override // tb.j8c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11d8247", new Object[]{this});
        } else {
            tap.d().a();
        }
    }

    public final String m(List<Contacts> list) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5577baa4", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list);
            int size = arrayList2.size();
            int c2 = mip.c();
            if (size > c2) {
                size = c2;
            }
            for (int i = 0; i < size; i++) {
                Contacts contacts = (Contacts) arrayList2.get(i);
                RecentContactsModel recentContactsModel = new RecentContactsModel();
                recentContactsModel.setLastContactTime(contacts.getLastContactTime());
                String str3 = "";
                if (contacts.getUserId() == null) {
                    str = str3;
                } else {
                    str = contacts.getUserId();
                }
                recentContactsModel.setUserId(str);
                if (contacts.getGroupId() == null) {
                    str2 = str3;
                } else {
                    str2 = contacts.getGroupId();
                }
                recentContactsModel.setGroupId(str2);
                recentContactsModel.setBizType(contacts.getBizType());
                String entityType = contacts.getEntityType();
                if (TextUtils.equals("U", entityType)) {
                    recentContactsModel.setContactType("1");
                    if (contacts.getUserId() != null) {
                        str3 = contacts.getUserId();
                    }
                    recentContactsModel.setCcode(str3);
                } else if (TextUtils.equals("G", entityType)) {
                    if (contacts.getGroupId() != null) {
                        str3 = contacts.getGroupId();
                    }
                    recentContactsModel.setCcode(str3);
                    recentContactsModel.setContactType("2");
                }
                arrayList.add(recentContactsModel);
            }
        }
        return JSON.toJSONString(arrayList);
    }

    public TBFriendsProvider() {
        this.f11883a = "TBFriendsProvider";
        this.b = 0;
        this.c = 0;
    }

    @Override // tb.j8c
    public boolean b(String str, TBShareContent tBShareContent, Object obj, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b62d7c4", new Object[]{this, str, tBShareContent, obj, list, list2})).booleanValue();
        }
        try {
            return tap.d().f(str, tBShareContent, (List) obj, list, list2);
        } catch (Exception e) {
            e.printStackTrace();
            String str2 = this.f11883a;
            fwr.b(str2, "sendShareToMsgClient err:" + e.getMessage());
            return false;
        }
    }

    @Override // tb.j8c
    public void d(String str, int i, int i2, String str2, int i3, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f555aef4", new Object[]{this, str, new Integer(i), new Integer(i2), str2, new Integer(i3), str3});
            return;
        }
        try {
            new a(this, str, i, i2, str2, i3, str3).execute(new Void[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            String str4 = this.f11883a;
            fwr.b(str4, "sendShareToMsgClient sendImageToMsgClient err: " + th.getMessage());
        }
    }

    public final void o(List<Contacts> list, final j8c.a aVar, final long j) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e52708", new Object[]{this, list, aVar, new Long(j)});
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(gjp.a().getApplicationContext(), "android.permission.READ_CONTACTS") != 0) {
            z = false;
        }
        String m = m(list);
        HashMap hashMap = new HashMap();
        TBShareContent e = bwr.h().e();
        if (e != null) {
            hashMap.put("bizid", e.businessId);
            hashMap.put("url", e.url);
        }
        hashMap.put("contactMsgs", m);
        hashMap.put("allowContactAccess", Boolean.valueOf(z));
        ComTaobaoGetContactsMessagesRequest comTaobaoGetContactsMessagesRequest = new ComTaobaoGetContactsMessagesRequest();
        comTaobaoGetContactsMessagesRequest.params = hashMap;
        final String str = hashMap.get("bizid") + "," + hashMap.get("url") + "," + ShareBizAdapter.getInstance().getLogin().getUserId();
        ((RemoteBusiness) RemoteBusiness.build((IMTOPDataObject) comTaobaoGetContactsMessagesRequest, ShareBizAdapter.getInstance().getAppEnv().getTTID()).useWua().reqMethod(MethodEnum.POST)).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.adapter.biz.friends.TBFriendsProvider.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_FAILED", Localization.q(R.string.taobao_app_1010_1_18156), str);
                aVar.onFriendsProvider(null, null, 0, 0);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_FAILED", Localization.q(R.string.taobao_app_1010_1_18156), str);
                aVar.onFriendsProvider(null, null, 0, 0);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                BubbleTipsBean bubbleTipsBean;
                List<rk4> list2;
                TBShareContent e2;
                boolean z2 = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    ComTaobaoGetContactsMessageResponseData comTaobaoGetContactsMessageResponseData = (ComTaobaoGetContactsMessageResponseData) baseOutDo.getData();
                    if (comTaobaoGetContactsMessageResponseData != null) {
                        ComTaobaoGetContactsMessageResponseData.DataBean data = comTaobaoGetContactsMessageResponseData.getData();
                        bubbleTipsBean = data.getTips();
                        String recPicUrl = data.getRecPicUrl();
                        if (!TextUtils.isEmpty(data.abtestParam)) {
                            UTABTest.activateServer(data.abtestParam);
                        }
                        List<ComTaobaoGetContactsMessageResponseData.DataBean.ContactsBean> contacts = data.getContacts();
                        if (contacts != null) {
                            list2 = TBFriendsProvider.this.k(TBFriendsProvider.this.l(contacts), (contacts.get(0) == null || contacts.get(0).getExtra() == null) ? null : contacts.get(0).getExtra().getGuideSaoHuoData(), recPicUrl, data.pvid, data.scm, comTaobaoGetContactsMessageResponseData.shareTraceId);
                        } else {
                            list2 = null;
                        }
                    } else {
                        list2 = null;
                        bubbleTipsBean = null;
                    }
                    if (bwr.h().e() != null) {
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        if (ShareBizAdapter.getInstance().getLogin().getUserId() == null) {
                            z2 = false;
                        }
                        TBS.Ext.commitEvent("UT", 19999, "Page_Share-ContactsShow", null, null, e2.businessId + "," + e2.templateId + "," + z2 + "," + currentTimeMillis);
                    }
                    AppMonitor.Alarm.commitSuccess("share", "taofriendlist", str);
                    aVar.onFriendsProvider(list2, bubbleTipsBean, TBFriendsProvider.i(TBFriendsProvider.this), TBFriendsProvider.j(TBFriendsProvider.this));
                } catch (Exception e3) {
                    e3.printStackTrace();
                    AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_ERR", Localization.q(R.string.taobao_app_1010_1_18164), str);
                    aVar.onFriendsProvider(null, null, 0, 0);
                }
            }
        }).startRequest(ComTaobaoGetContactsMessageResponse.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.contacts.data.member.RecentMember> l(java.util.List<com.taobao.share.core.contacts.mtop.response.ComTaobaoGetContactsMessageResponseData.DataBean.ContactsBean> r10) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.adapter.biz.friends.TBFriendsProvider.l(java.util.List):java.util.List");
    }

    public List<rk4> k(List<RecentMember> list, ComTaobaoGetContactsMessageResponseData.DataBean.ContactsBean.ExtraBean.GuideSaoHuoDataBean guideSaoHuoDataBean, String str, String str2, String str3, String str4) {
        SourceType sourceType;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("51fb779", new Object[]{this, list, guideSaoHuoDataBean, str, str2, str3, str4});
        }
        ArrayList arrayList = new ArrayList();
        this.c = 0;
        if (guideSaoHuoDataBean != null && TextUtils.equals("true", guideSaoHuoDataBean.getIsShow())) {
            uk4 uk4Var = new uk4(guideSaoHuoDataBean.getText(), "https://gw.alicdn.com/tfs/TB1DchCr3mTBuNjy1XbXXaMrVXa-160-160.png", 0, "14");
            rk4 rk4Var = new rk4();
            rk4Var.s(str);
            uk4Var.c = ContactType.LINK;
            rk4Var.p(guideSaoHuoDataBean.getLink());
            rk4Var.f(ComponentType.CONTACT_ITEM);
            rk4Var.e(ShareTargetType.Share2Other.getValue());
            rk4Var.o(uk4Var);
            rk4Var.v(SourceType.NONE);
            rk4Var.q(str2);
            rk4Var.t(str3);
            rk4Var.u(str4);
            TLog.logi(this.f11883a, Localization.q(R.string.taobao_app_1010_1_18153) + uk4Var);
            arrayList.add(rk4Var);
        }
        int b2 = mip.b();
        int i2 = 0;
        while (i2 < b2 && i2 < list.size()) {
            rk4 rk4Var2 = new rk4();
            rk4Var2.s(str);
            RecentMember recentMember = list.get(i2);
            if (recentMember.isTaoFriend()) {
                sourceType = SourceType.RECENT;
            } else {
                sourceType = SourceType.RECOMMEND;
            }
            rk4Var2.v(sourceType);
            rk4Var2.f(ComponentType.CONTACT_ITEM);
            rk4Var2.e(ShareTargetType.Share2Contact.getValue());
            if (recentMember.isTaoFriend()) {
                this.c += i;
            }
            if (TextUtils.isEmpty(recentMember.getHeadUrl())) {
                recentMember.setHeadUrl("http://gtms03.alicdn.com/tps/i3/TB1ET85IVXXXXaXapXXEBEd5pXX-225-225.png");
            }
            uk4 uk4Var2 = new uk4(recentMember.getName(), recentMember.getHeadUrl(), recentMember.getShareChannel(), recentMember.getBizSubType());
            uk4Var2.c = ContactType.CONTINGENT;
            rk4Var2.o(uk4Var2);
            rk4Var2.r(recentMember);
            rk4Var2.q(str2);
            rk4Var2.t(str3);
            rk4Var2.u(str4);
            arrayList.add(rk4Var2);
            i2++;
            i = 1;
        }
        if (!kip.v() && arrayList.size() > 0) {
            rk4 rk4Var3 = new rk4();
            uk4 uk4Var3 = new uk4(Localization.q(R.string.share_app_more_options), "", 0);
            uk4Var3.c = ContactType.MORE_CONTACT;
            uk4Var3.b = gjp.a().getString(R.string.share_more_icon);
            rk4Var3.f(ComponentType.CONTACT_ITEM);
            rk4Var3.e(ShareTargetType.Share2Contact.getValue());
            rk4Var3.o(uk4Var3);
            rk4Var3.v(SourceType.NONE);
            rk4Var3.q(str2);
            rk4Var3.t(str3);
            rk4Var3.u(str4);
            arrayList.add(rk4Var3);
        }
        return arrayList;
    }
}
