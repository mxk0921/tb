package com.taobao.share.multiapp;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.adapter.biz.ShareEngine;
import com.ut.share.ShareEnv;
import com.ut.share.business.ShareBusiness;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.aib;
import tb.c4d;
import tb.doc;
import tb.eqb;
import tb.fwr;
import tb.gpd;
import tb.igb;
import tb.ipd;
import tb.j8c;
import tb.nv3;
import tb.t2o;
import tb.upd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareBizAdapter implements IShareBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String SHARE_BIZ_ADAPTER_CLASS = "com.taobao.tao.adapter.biz.TBShareBiz";
    private aib backFlowEngine;
    private IShareBiz shareBiz;
    private ipd shareEngine;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface FriendsType {
        public static final int ALL_FRIENDS = 1;
        public static final int RECENT_FRIENDS = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ShareBizAdapter f11756a = new ShareBizAdapter();

        static {
            t2o.a(665845793);
        }

        public static /* synthetic */ ShareBizAdapter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShareBizAdapter) ipChange.ipc$dispatch("f716f712", new Object[0]);
            }
            return f11756a;
        }
    }

    static {
        t2o.a(665845787);
        t2o.a(665845786);
    }

    private IShareBiz getDefaultShareBiz() {
        try {
            this.shareBiz = (IShareBiz) Class.forName(SHARE_BIZ_ADAPTER_CLASS).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (this.shareBiz == null) {
            this.shareBiz = new IShareBiz() { // from class: com.taobao.share.multiapp.ShareBizAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.share.multiapp.ShareBizAdapter$1$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                public class a implements igb {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public a(AnonymousClass1 r1) {
                    }

                    @Override // tb.igb
                    public String b() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("1b68c695", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.igb
                    public String c() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("b76d18c8", new Object[]{this});
                        }
                        return ShareBusiness.getCacheTaopassword();
                    }

                    @Override // tb.igb
                    public boolean d() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("dff16f29", new Object[]{this})).booleanValue();
                        }
                        return false;
                    }

                    @Override // tb.igb
                    public boolean e() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("c1d5dc3a", new Object[]{this})).booleanValue();
                        }
                        return false;
                    }

                    @Override // tb.igb
                    public boolean f(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("dbad9c6b", new Object[]{this, str})).booleanValue();
                        }
                        return true;
                    }

                    @Override // tb.igb
                    public boolean g() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("642edb74", new Object[]{this})).booleanValue();
                        }
                        return false;
                    }

                    @Override // tb.igb
                    public Application getApplication() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
                        }
                        return ShareEnv.getApplication();
                    }

                    @Override // tb.igb
                    public String getTTID() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.igb
                    public Activity getTopActivity() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (Activity) ipChange.ipc$dispatch("1d7099f3", new Object[]{this});
                        }
                        return null;
                    }

                    @Override // tb.igb
                    public void h(Application application) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8056250b", new Object[]{this, application});
                        }
                    }

                    @Override // tb.igb
                    public String i(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("d539b50b", new Object[]{this, str});
                        }
                        return null;
                    }

                    @Override // tb.igb
                    public void j(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("3e771b9b", new Object[]{this, str});
                        } else {
                            ShareBusiness.putCacheTaopassword(str);
                        }
                    }

                    @Override // tb.igb
                    public List<String> k() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (List) ipChange.ipc$dispatch("495743ef", new Object[]{this});
                        }
                        return null;
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.taobao.share.multiapp.ShareBizAdapter$1$b */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                public class b implements gpd {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public b(AnonymousClass1 r1) {
                    }

                    @Override // tb.gpd
                    public String a() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("8ea889bd", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.gpd
                    public String b() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("dabe1775", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.gpd
                    public String c() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("db1cbadd", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.gpd
                    public String d() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("a7495e89", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.gpd
                    public String e() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("5e756818", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.gpd
                    public String f() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("9fbf8bf3", new Object[]{this});
                        }
                        return "";
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.taobao.share.multiapp.ShareBizAdapter$1$c */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
                public class c implements doc {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public c(AnonymousClass1 r1) {
                    }

                    @Override // tb.doc
                    public void a(BroadcastReceiver broadcastReceiver) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("d0b55244", new Object[]{this, broadcastReceiver});
                        }
                    }

                    @Override // tb.doc
                    public void b(BroadcastReceiver broadcastReceiver) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("f1a1572b", new Object[]{this, broadcastReceiver});
                        }
                    }

                    @Override // tb.doc
                    public boolean checkSessionValid() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[]{this})).booleanValue();
                        }
                        return false;
                    }

                    @Override // tb.doc
                    public String getHeadPicLink() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.doc
                    public String getUserId() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
                        }
                        return "";
                    }

                    @Override // tb.doc
                    public void login(boolean z) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("95000964", new Object[]{this, new Boolean(z)});
                        }
                    }
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public igb getAppEnv() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (igb) ipChange.ipc$dispatch("8f961b9c", new Object[]{this});
                    }
                    return new a(this);
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public eqb getContactsInfoProvider() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (eqb) ipChange.ipc$dispatch("da65eb9c", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public j8c getFriendsProvider() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (j8c) ipChange.ipc$dispatch("ec35325a", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public doc getLogin() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (doc) ipChange.ipc$dispatch("35f5fb14", new Object[]{this});
                    }
                    return new c(this);
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public c4d getOrangeDefaultValueHelper() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (c4d) ipChange.ipc$dispatch("1260dc", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public upd getShareBackWeexSdk(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (upd) ipChange.ipc$dispatch("464e231d", new Object[]{this, str});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public gpd getShareChannel() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (gpd) ipChange.ipc$dispatch("678bb25c", new Object[]{this});
                    }
                    return new b(this);
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public upd getShareWeexSdk() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (upd) ipChange.ipc$dispatch("add789e0", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public void initShareMenu() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3ca4bc35", new Object[]{this});
                    }
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public upd getShareWeexSdk(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (upd) ipChange.ipc$dispatch("5eed1596", new Object[]{this, str});
                    }
                    return null;
                }
            };
        }
        return this.shareBiz;
    }

    public static ShareBizAdapter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareBizAdapter) ipChange.ipc$dispatch("bbc87cec", new Object[0]);
        }
        return a.a();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public igb getAppEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (igb) ipChange.ipc$dispatch("8f961b9c", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getAppEnv();
    }

    public aib getBackFlowEngine() {
        if (this.backFlowEngine == null) {
            try {
                IpChange ipChange = nv3.$ipChange;
                this.backFlowEngine = (aib) nv3.class.getMethod("instance", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
                fwr.b("ShareBizAdapter", "getShareEngine err");
            }
        }
        return this.backFlowEngine;
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public eqb getContactsInfoProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqb) ipChange.ipc$dispatch("da65eb9c", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getContactsInfoProvider();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public j8c getFriendsProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8c) ipChange.ipc$dispatch("ec35325a", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getFriendsProvider();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public doc getLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (doc) ipChange.ipc$dispatch("35f5fb14", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getLogin();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public c4d getOrangeDefaultValueHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4d) ipChange.ipc$dispatch("1260dc", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getOrangeDefaultValueHelper();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public upd getShareBackWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd) ipChange.ipc$dispatch("464e231d", new Object[]{this, str});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareBackWeexSdk(str);
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public gpd getShareChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gpd) ipChange.ipc$dispatch("678bb25c", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareChannel();
    }

    public ipd getShareEngine() {
        if (this.shareEngine == null) {
            try {
                IpChange ipChange = ShareEngine.$ipChange;
                this.shareEngine = (ipd) ShareEngine.class.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                fwr.b("ShareBizAdapter", "getShareEngine err");
            }
        }
        return this.shareEngine;
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public upd getShareWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd) ipChange.ipc$dispatch("5eed1596", new Object[]{this, str});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareWeexSdk(str);
    }

    public void initShareAdapter() {
        if (this.shareBiz == null) {
            String str = "";
            if (TextUtils.isEmpty(str)) {
                str = SHARE_BIZ_ADAPTER_CLASS;
            }
            try {
                this.shareBiz = (IShareBiz) Class.forName(str).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public void initShareMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca4bc35", new Object[]{this});
            return;
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        this.shareBiz.initShareMenu();
    }

    public void setAdapter(IShareBiz iShareBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba961c14", new Object[]{this, iShareBiz});
        } else {
            this.shareBiz = iShareBiz;
        }
    }

    public void setBackFlowEngine(aib aibVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c71a98", new Object[]{this, aibVar});
        } else {
            this.backFlowEngine = aibVar;
        }
    }

    public void setShareEngine(ipd ipdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e1185a", new Object[]{this, ipdVar});
        } else {
            this.shareEngine = ipdVar;
        }
    }

    private ShareBizAdapter() {
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public upd getShareWeexSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd) ipChange.ipc$dispatch("add789e0", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareWeexSdk("");
    }
}
