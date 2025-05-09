package com.taobao.android.livehome.plugin.atype.flexalocal.dxengine;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.b0h;
import tb.j5h;
import tb.lrq;
import tb.nlc;
import tb.p0;
import tb.qyg;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveHomeController2 implements nlc, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = LiveHomeController2.class.getSimpleName();
    private DinamicSdkManager2 mDinamicSdkManager2;
    private b0h mLiveHomeContext;
    private TemplateCardListOwner mTemplateCardListOwner;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends TemplateCardListOwner {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(LiveHomeController2 liveHomeController2) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dxengine/LiveHomeController2$1");
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
        public TemplateRequest h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateRequest) ipChange.ipc$dispatch("81bfb25", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
        public List<TemplateObject> t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e469afeb", new Object[]{this, str});
            }
            return null;
        }
    }

    static {
        t2o.a(310378616);
        t2o.a(806355483);
    }

    public LiveHomeController2(b0h b0hVar) {
        qyg.c().f(this);
        this.mLiveHomeContext = b0hVar;
    }

    private void checkTemplateCardListOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dac00a", new Object[]{this});
        } else if (this.mTemplateCardListOwner == null) {
            this.mTemplateCardListOwner = new a(this);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qyg.c().j(this);
        DinamicSdkManager2 dinamicSdkManager2 = this.mDinamicSdkManager2;
        if (dinamicSdkManager2 != null) {
            dinamicSdkManager2.onDestroy();
        }
    }

    public void downloadTemplates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5a8798", new Object[]{this});
        } else if (this.mDinamicSdkManager2 != null) {
            checkTemplateCardListOwner();
            List<TemplateObject> k = this.mTemplateCardListOwner.k();
            if (!j5h.b(k)) {
                ArrayList<DXTemplateItem> arrayList = new ArrayList<>();
                for (TemplateObject templateObject : k) {
                    if (templateObject != null && !lrq.a(templateObject.url4Android)) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f7343a = templateObject.name;
                        dXTemplateItem.b = templateObject.version4Android;
                        dXTemplateItem.c = templateObject.url4Android;
                        arrayList.add(dXTemplateItem);
                    }
                }
                if (p0.g(this.mLiveHomeContext.t())) {
                    this.mLiveHomeContext.A(arrayList);
                } else {
                    this.mDinamicSdkManager2.downloadTemplates(arrayList);
                }
            }
        }
    }

    public DinamicSdkManager2 getDinamicSdkManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicSdkManager2) ipChange.ipc$dispatch("6b04efe8", new Object[]{this});
        }
        return this.mDinamicSdkManager2;
    }

    public TemplateObject getTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("899bb865", new Object[]{this, str});
        }
        checkTemplateCardListOwner();
        return this.mTemplateCardListOwner.j(str);
    }

    public TemplateCardListOwner getTemplateCardListOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateCardListOwner) ipChange.ipc$dispatch("2571aa6a", new Object[]{this});
        }
        checkTemplateCardListOwner();
        return this.mTemplateCardListOwner;
    }

    public void loadTemplate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd7fdc", new Object[]{this, new Integer(i)});
            return;
        }
        checkTemplateCardListOwner();
        this.mTemplateCardListOwner.o(i);
    }

    @Override // tb.nlc
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if ("com.taobao.live.home.template_list_ready".equals(str)) {
            r0h.d(TAG, "onLiveEvent template list ready");
            downloadTemplates();
        }
    }

    public void setDinamicSdkManager(DinamicSdkManager2 dinamicSdkManager2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5937be", new Object[]{this, dinamicSdkManager2});
        } else {
            this.mDinamicSdkManager2 = dinamicSdkManager2;
        }
    }

    public void setTemplateCardListOwner(TemplateCardListOwner templateCardListOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31497c0", new Object[]{this, templateCardListOwner});
        } else {
            this.mTemplateCardListOwner = templateCardListOwner;
        }
    }
}
