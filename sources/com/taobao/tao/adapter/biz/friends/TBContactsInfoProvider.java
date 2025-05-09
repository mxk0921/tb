package com.taobao.tao.adapter.biz.friends;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.Contacts;
import com.taobao.message.kit.core.IObserver;
import com.taobao.share.core.contacts.mtop.request.ContactsInfoRequest;
import com.taobao.share.core.contacts.mtop.response.RecentContactsModel;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bwr;
import tb.dmp;
import tb.eqb;
import tb.fwr;
import tb.gj8;
import tb.gjp;
import tb.mip;
import tb.oj8;
import tb.t2o;
import tb.tap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBContactsInfoProvider implements eqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f11880a;
    public final AtomicBoolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements IObserver<List<Contacts>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f11881a;
        public final /* synthetic */ eqb.a b;
        public final /* synthetic */ long c;

        public a(List list, eqb.a aVar, long j) {
            this.f11881a = list;
            this.b = aVar;
            this.c = j;
        }

        /* renamed from: a */
        public void onNext(List<Contacts> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d15fbea", new Object[]{this, list});
            } else if (list != null) {
                this.f11881a.addAll(list);
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            tap.d().g(this.f11881a);
            TBContactsInfoProvider.c(TBContactsInfoProvider.this, this.f11881a, this.b, this.c);
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                TBContactsInfoProvider.c(TBContactsInfoProvider.this, this.f11881a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TBContactsInfoProvider f11882a = new TBContactsInfoProvider(null);

        static {
            t2o.a(793772053);
        }

        public static /* synthetic */ TBContactsInfoProvider a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBContactsInfoProvider) ipChange.ipc$dispatch("61a9c573", new Object[0]);
            }
            return f11882a;
        }
    }

    static {
        t2o.a(793772050);
        t2o.a(665845802);
    }

    public /* synthetic */ TBContactsInfoProvider(a aVar) {
        this();
    }

    public static /* synthetic */ void c(TBContactsInfoProvider tBContactsInfoProvider, List list, eqb.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ff621a", new Object[]{tBContactsInfoProvider, list, aVar, new Long(j)});
        } else {
            tBContactsInfoProvider.l(list, aVar, j);
        }
    }

    public static /* synthetic */ String d(TBContactsInfoProvider tBContactsInfoProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5be0e2f", new Object[]{tBContactsInfoProvider});
        }
        return tBContactsInfoProvider.f11880a;
    }

    public static /* synthetic */ String e(TBContactsInfoProvider tBContactsInfoProvider, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68193b67", new Object[]{tBContactsInfoProvider, str});
        }
        tBContactsInfoProvider.f11880a = str;
        return str;
    }

    public static /* synthetic */ String f(TBContactsInfoProvider tBContactsInfoProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad39e7f0", new Object[]{tBContactsInfoProvider});
        }
        return tBContactsInfoProvider.i();
    }

    public static /* synthetic */ void g(TBContactsInfoProvider tBContactsInfoProvider, eqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7b92fe", new Object[]{tBContactsInfoProvider, aVar});
        } else {
            tBContactsInfoProvider.m(aVar);
        }
    }

    public static TBContactsInfoProvider k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBContactsInfoProvider) ipChange.ipc$dispatch("9558574d", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.eqb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186cdbcb", new Object[]{this});
        } else {
            this.b.set(false);
        }
    }

    @Override // tb.eqb
    public synchronized void b(eqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceff24f", new Object[]{this, aVar});
        } else if (!mip.a() || aVar != null) {
            if (this.b.compareAndSet(false, true)) {
                j(aVar);
            }
        }
    }

    public final String h(List<Contacts> list) {
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
            int c = mip.c();
            if (size > c) {
                size = c;
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

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efa32470", new Object[]{this});
        }
        String c = dmp.c("TBContactsInfo" + ShareBizAdapter.getInstance().getLogin().getUserId());
        if (c == null) {
            return "";
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r1 <= 0) goto L_0x0049;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(tb.eqb.a r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.adapter.biz.friends.TBContactsInfoProvider.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "1344047d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            long r8 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            tb.bwr r0 = tb.bwr.h()
            com.taobao.share.globalmodel.TBShareContent r0 = r0.e()
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.businessId
            goto L_0x002d
        L_0x002b:
            java.lang.String r0 = ""
        L_0x002d:
            boolean r1 = tb.kip.v()
            if (r1 == 0) goto L_0x003d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = tb.kip.i()
            r0.<init>(r1)
            goto L_0x0041
        L_0x003d:
            java.util.List r0 = tb.mip.d(r0)
        L_0x0041:
            if (r0 == 0) goto L_0x0049
            int r1 = r0.size()
            if (r1 > 0) goto L_0x0071
        L_0x0049:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "0"
            r0.add(r1)
            java.lang.String r1 = "14"
            r0.add(r1)
            java.lang.String r1 = "10001"
            r0.add(r1)
            java.lang.String r1 = "10002"
            r0.add(r1)
            java.lang.String r1 = "10003"
            r0.add(r1)
            java.lang.String r1 = "10004"
            r0.add(r1)
            java.lang.String r1 = "10005"
            r0.add(r1)
        L_0x0071:
            com.taobao.message.kit.core.GlobalContainer r1 = com.taobao.message.kit.core.GlobalContainer.getInstance()
            java.lang.Class<com.taobao.message.biz.contacts.ContactsService> r2 = com.taobao.message.biz.contacts.ContactsService.class
            java.lang.Object r1 = r1.get(r2)
            com.taobao.message.biz.contacts.ContactsService r1 = (com.taobao.message.biz.contacts.ContactsService) r1
            if (r1 != 0) goto L_0x008b
            java.lang.String r0 = "TBContactsInfoProvider"
            java.lang.String r1 = "getContactsService null"
            com.taobao.tao.log.TLog.logd(r0, r1)
            r10.l(r6, r11, r8)
            return
        L_0x008b:
            com.taobao.tao.adapter.biz.friends.TBContactsInfoProvider$a r2 = new com.taobao.tao.adapter.biz.friends.TBContactsInfoProvider$a
            r4 = r2
            r5 = r10
            r7 = r11
            r4.<init>(r6, r7, r8)
            r1.getRecentContacts(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.adapter.biz.friends.TBContactsInfoProvider.j(tb.eqb$a):void");
    }

    public final void m(eqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d601bfb6", new Object[]{this, aVar});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.CC_LIST_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        oj8.d().b();
        fwr.b("TIMECOST", "cc_list_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
        if (aVar != null) {
            aVar.a(this.f11880a);
        } else {
            gj8.c(this.f11880a);
        }
    }

    public TBContactsInfoProvider() {
        this.b = new AtomicBoolean(false);
    }

    public final void l(List<Contacts> list, final eqb.a aVar, long j) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e8eace", new Object[]{this, list, aVar, new Long(j)});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.CC_LIST_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(gjp.a().getApplicationContext(), "android.permission.READ_CONTACTS") != 0) {
            z = false;
        }
        String h = h(list);
        HashMap hashMap = new HashMap();
        TBShareContent e = bwr.h().e();
        if (e != null) {
            hashMap.put("bizid", e.businessId);
            hashMap.put("url", e.url);
        }
        hashMap.put("contactMsgs", h);
        hashMap.put("allowContactAccess", Boolean.valueOf(z));
        ContactsInfoRequest contactsInfoRequest = new ContactsInfoRequest();
        contactsInfoRequest.params = hashMap;
        final String str = hashMap.get("bizid") + "," + hashMap.get("url") + "," + ShareBizAdapter.getInstance().getLogin().getUserId();
        ((RemoteBusiness) RemoteBusiness.build((IMTOPDataObject) contactsInfoRequest, ShareBizAdapter.getInstance().getAppEnv().getTTID()).useWua().reqMethod(MethodEnum.POST)).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.adapter.biz.friends.TBContactsInfoProvider.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_FAILED", Localization.q(R.string.taobao_app_1010_1_18156), str);
                TBContactsInfoProvider tBContactsInfoProvider = TBContactsInfoProvider.this;
                TBContactsInfoProvider.e(tBContactsInfoProvider, TBContactsInfoProvider.f(tBContactsInfoProvider));
                TBContactsInfoProvider.g(TBContactsInfoProvider.this, aVar);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    TBContactsInfoProvider.e(TBContactsInfoProvider.this, mtopResponse.getDataJsonObject().toString());
                    dmp.a("TBContactsInfo" + ShareBizAdapter.getInstance().getLogin().getUserId(), TBContactsInfoProvider.d(TBContactsInfoProvider.this));
                    AppMonitor.Alarm.commitSuccess("share", "taofriendlist", str);
                    TBContactsInfoProvider.g(TBContactsInfoProvider.this, aVar);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_ERR", Localization.q(R.string.taobao_app_1010_1_18164), str);
                    TBContactsInfoProvider tBContactsInfoProvider = TBContactsInfoProvider.this;
                    TBContactsInfoProvider.e(tBContactsInfoProvider, TBContactsInfoProvider.f(tBContactsInfoProvider));
                    TBContactsInfoProvider.g(TBContactsInfoProvider.this, aVar);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "taofriendlist", "SHARE_TAOFRIENDLIST_FAILED", Localization.q(R.string.taobao_app_1010_1_18156), str);
                TBContactsInfoProvider tBContactsInfoProvider = TBContactsInfoProvider.this;
                TBContactsInfoProvider.e(tBContactsInfoProvider, TBContactsInfoProvider.f(tBContactsInfoProvider));
                TBContactsInfoProvider.g(TBContactsInfoProvider.this, aVar);
            }
        }).startRequest();
    }
}
