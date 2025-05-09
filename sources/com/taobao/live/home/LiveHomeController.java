package com.taobao.live.home;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.live.home.dinamic.business.TemplateCardListOwner;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.live.home.dinamic.sdk.DinamicSdkManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.arq;
import tb.j5h;
import tb.nlc;
import tb.qyg;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveHomeController implements nlc, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = LiveHomeController.class.getSimpleName();
    private static LiveHomeController sInstance = null;
    private DinamicSdkManager mDinamicSdkManager;
    private TemplateCardListOwner mTemplateCardListOwner;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TemplateCardListOwner {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(LiveHomeController liveHomeController) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/LiveHomeController$1");
        }

        @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
        public TemplateRequest h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateRequest) ipChange.ipc$dispatch("81bfb25", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
        public List<TemplateObject> u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e469afeb", new Object[]{this, str});
            }
            return null;
        }
    }

    static {
        t2o.a(806355327);
        t2o.a(806355483);
    }

    private LiveHomeController() {
        qyg.c().f(this);
    }

    private void checkTemplateCardListOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dac00a", new Object[]{this});
        } else if (this.mTemplateCardListOwner == null) {
            this.mTemplateCardListOwner = new a(this);
        }
    }

    public static LiveHomeController instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveHomeController) ipChange.ipc$dispatch("a561d4e6", new Object[0]);
        }
        if (sInstance == null) {
            sInstance = new LiveHomeController();
        }
        return sInstance;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qyg.c().j(this);
        DinamicSdkManager dinamicSdkManager = this.mDinamicSdkManager;
        if (dinamicSdkManager != null) {
            dinamicSdkManager.onDestroy();
        }
        sInstance = null;
    }

    public void downloadTemplates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5a8798", new Object[]{this});
        } else if (this.mDinamicSdkManager != null) {
            checkTemplateCardListOwner();
            List<TemplateObject> k = this.mTemplateCardListOwner.k();
            if (!j5h.b(k)) {
                ArrayList arrayList = new ArrayList();
                for (TemplateObject templateObject : k) {
                    if (templateObject != null && !arq.a(templateObject.url4Android)) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f7343a = templateObject.name;
                        dXTemplateItem.b = templateObject.version4Android;
                        dXTemplateItem.c = templateObject.url4Android;
                        arrayList.add(dXTemplateItem);
                    }
                }
                this.mDinamicSdkManager.downloadTemplates(arrayList);
            }
        }
    }

    public DinamicSdkManager getDinamicSdkManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicSdkManager) ipChange.ipc$dispatch("8b6cef25", new Object[]{this});
        }
        return this.mDinamicSdkManager;
    }

    public TemplateObject getTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("edc3a633", new Object[]{this, str});
        }
        checkTemplateCardListOwner();
        return this.mTemplateCardListOwner.j(str);
    }

    public TemplateCardListOwner getTemplateCardListOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateCardListOwner) ipChange.ipc$dispatch("bb93dbb1", new Object[]{this});
        }
        checkTemplateCardListOwner();
        return this.mTemplateCardListOwner;
    }

    public void loadTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af717407", new Object[]{this});
            return;
        }
        checkTemplateCardListOwner();
        this.mTemplateCardListOwner.o();
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

    public void setDinamicSdkManager(DinamicSdkManager dinamicSdkManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90af0609", new Object[]{this, dinamicSdkManager});
        } else {
            this.mDinamicSdkManager = dinamicSdkManager;
        }
    }

    public void setTemplateCardListOwner(TemplateCardListOwner templateCardListOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a456c455", new Object[]{this, templateCardListOwner});
        } else {
            this.mTemplateCardListOwner = templateCardListOwner;
        }
    }

    public void loadTemplate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd7fdc", new Object[]{this, new Integer(i)});
            return;
        }
        checkTemplateCardListOwner();
        this.mTemplateCardListOwner.p(i);
    }
}
