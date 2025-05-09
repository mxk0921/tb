package com.taobao.android.turbo.core.subpage;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.impl.uttracker.UTTrackerAbility;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent.SubPageModel;
import com.taobao.monitor.procedure.IPage;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.nuo;
import tb.pl4;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001-BA\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent;", "Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "MODEL", "Landroid/view/View;", "VIEW", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent;", "Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;", OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE, "", "componentId", "Landroid/content/Context;", "context", "", "host", "pageURL", "engineId", "Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;", "serviceDelegate", "<init>", "(Lcom/taobao/android/turbo/core/component/BaseOuterComponent$OuterComponentType;Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/android/turbo/core/service/BaseServiceDelegate;)V", "", "args", "Ltb/xhv;", "onRefresh", "(Ljava/util/Map;)V", "Lcom/taobao/android/turbo/core/service/page/IPageBackLifecycle$TriggerType;", "triggerType", "", "handleBack", "(Lcom/taobao/android/turbo/core/service/page/IPageBackLifecycle$TriggerType;)Z", "handleShare", "()V", "isCustomShareIcon", "()Z", pl4.KEY_PAGE_ID, "Ltb/nuo;", "getInitSchedulerMessage", "(Ljava/lang/String;)Ltb/nuo;", "Lcom/taobao/monitor/procedure/IPage;", "getApmPage", "(Ljava/lang/String;)Lcom/taobao/monitor/procedure/IPage;", "", "state", "onMultiTabScrollStateChanged", "(I)V", "SubPageModel", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseSubPageComponent<MODEL extends SubPageModel, VIEW extends View> extends BaseOuterComponent<MODEL, VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/taobao/android/turbo/core/subpage/BaseSubPageComponent$SubPageModel;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "pageName", UTTrackerAbility.API_GET_PAGE_NAME, "setPageName", "spm", "getSpm", "setSpm", "type", NetworkAbility.API_GET_TYPE, "setType", "url", "getUrl", "setUrl", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class SubPageModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String id;
        public String pageName;
        private String spm;
        public String type;
        private String url;

        static {
            t2o.a(919601360);
        }

        public final String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            String str = this.id;
            if (str != null) {
                return str;
            }
            ckf.y("id");
            throw null;
        }

        public final String getPageName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
            }
            String str = this.pageName;
            if (str != null) {
                return str;
            }
            ckf.y("pageName");
            throw null;
        }

        public final String getSpm() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
            }
            return this.spm;
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            String str = this.type;
            if (str != null) {
                return str;
            }
            ckf.y("type");
            throw null;
        }

        public final String getUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.url;
        }

        public final void setId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.id = str;
        }

        public final void setPageName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.pageName = str;
        }

        public final void setSpm(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
            } else {
                this.spm = str;
            }
        }

        public final void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
                return;
            }
            ckf.g(str, "<set-?>");
            this.type = str;
        }

        public final void setUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            } else {
                this.url = str;
            }
        }
    }

    static {
        t2o.a(919601359);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubPageComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        super(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        ckf.g(outerComponentType, OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE);
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "pageURL");
        ckf.g(str3, "engineId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
    }

    public static /* synthetic */ Object ipc$super(BaseSubPageComponent baseSubPageComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/subpage/BaseSubPageComponent");
    }

    public IPage getApmPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("c71f6329", new Object[]{this, str});
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        return getServiceDelegate().o(str);
    }

    public nuo getInitSchedulerMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuo) ipChange.ipc$dispatch("ed0333bc", new Object[]{this, str});
        }
        ckf.g(str, pl4.KEY_PAGE_ID);
        return getServiceDelegate().U(str);
    }

    public void handleShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de66eb9e", new Object[]{this});
        }
    }

    public boolean isCustomShareIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("757b8c08", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onMultiTabScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b067dbf1", new Object[]{this, new Integer(i)});
        }
    }

    public abstract void onRefresh(Map<String, ? extends Object> map);

    public boolean handleBack(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        return false;
    }
}
