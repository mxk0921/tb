package com.alipay.android.msp.core.section;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.section.MqpSectionModel.BaseParams;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.hpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MqpSectionModel<P extends BaseParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f3558a;
    public final P b;
    public final MqpSectionModel<P>.Env c = new Env();
    public final PageInfo d = new PageInfo();
    public final MqpSectionModel<P>.PaySessionInfo e = new PaySessionInfo();
    public final long f = System.currentTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class BaseParams extends JsonModelBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public BaseParams() {
            add("timestamp", Long.valueOf(System.currentTimeMillis()));
        }

        public static /* synthetic */ Object ipc$super(BaseParams baseParams, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/section/MqpSectionModel$BaseParams");
        }

        public BaseParams apLinkToken(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseParams) ipChange.ipc$dispatch("7eaafe1b", new Object[]{this, str});
            }
            add("apLinkToken", String.valueOf(str));
            return this;
        }

        public BaseParams serviceId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseParams) ipChange.ipc$dispatch("8e9dbb50", new Object[]{this, new Integer(i)});
            }
            add("serviceId", String.valueOf(i));
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class CashierCmdParams extends BaseParams {
        public CashierCmdParams(String str, String str2, String[] strArr) {
            add("action", str);
            add("params", str2);
            add("paramsArray", strArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Env extends JsonModelBuilder {
        public Env() {
            add("os", "android");
            add("sdkVersion", GlobalSdkConstant.getMspVersion());
            Context context = MspContextUtil.getContext();
            if (context != null) {
                add("appName", context.getPackageName());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class JsonModelBuilder extends JSONObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(JsonModelBuilder jsonModelBuilder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/section/MqpSectionModel$JsonModelBuilder");
        }

        public JsonModelBuilder add(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JsonModelBuilder) ipChange.ipc$dispatch("6836b54b", new Object[]{this, str, obj});
            }
            try {
                if (!TextUtils.isEmpty(str) && obj != null) {
                    putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
            return this;
        }

        public String build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
            }
            return toString();
        }

        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            if (length() == 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class NotificationClickedParams extends BaseParams {
        public NotificationClickedParams(String str, boolean z) {
            add(Constants.KEY_USER_ID, str);
            add("handled", Boolean.valueOf(z));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class PageInfo extends JsonModelBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PageInfo pageInfo, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/section/MqpSectionModel$PageInfo");
        }

        public PageInfo clickCnt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageInfo) ipChange.ipc$dispatch("9c8072bb", new Object[]{this, new Integer(i)});
            }
            add("clickCnt", Integer.valueOf(i));
            return this;
        }

        public PageInfo isPayFirstPage(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageInfo) ipChange.ipc$dispatch("54ab65aa", new Object[]{this, new Boolean(z)});
            }
            add("isPayFirstPage", Boolean.valueOf(z));
            return this;
        }

        public PageInfo tplInfo(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageInfo) ipChange.ipc$dispatch("7a5d325d", new Object[]{this, str, str2});
            }
            add("tplId", str);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.length() > 0) {
                        add("tplTime", jSONObject.getString("time"));
                        add("tplVersion", jSONObject.getString("tplVersion"));
                    }
                } catch (JSONException e) {
                    LogUtil.record(8, "MqpSectionModel", "PageInfo.tplInfo exception:".concat(String.valueOf(e)));
                }
            }
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class PaySessionInfo extends JsonModelBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public PaySessionInfo() {
        }

        public static /* synthetic */ Object ipc$super(PaySessionInfo paySessionInfo, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/section/MqpSectionModel$PaySessionInfo");
        }

        public MqpSectionModel<P>.PaySessionInfo clientBizType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("de4f5ea4", new Object[]{this, str});
            }
            add("clientBizType", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo clientLogData(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("8416d2dc", new Object[]{this, map});
            }
            try {
                add(DynConstants.DynDataNames.D_CLIENT_LOG_DATA, new JSONObject(map));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo endCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("e9522c9e", new Object[]{this, str});
            }
            add("endCode", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo orderStr(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("b97c8a63", new Object[]{this, str});
            }
            add("orderStr", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo outTradeLaunchType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("c69f6183", new Object[]{this, str});
            }
            add("outTradeLaunchType", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo sessionId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("b1f223d5", new Object[]{this, str});
            }
            add("sessionId", str);
            return this;
        }

        public MqpSectionModel<P>.PaySessionInfo trdfrom(boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PaySessionInfo) ipChange.ipc$dispatch("2faad93a", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            add(MspFlybirdDefine.TRDFROM, str);
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class RpcParams extends BaseParams {
        public RpcParams(String str, String str2) {
            add("opType", str);
            add("action", str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ServiceParams extends BaseParams {
        public ServiceParams(String str) {
            add("type", str);
        }
    }

    public MqpSectionModel(String str, P p, MspContext mspContext) {
        this.f3558a = str;
        this.b = p;
        MqpBizSection.fillSectionModel(str, this, mspContext);
    }

    public static MqpSectionModel buildBaseMode(String str, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MqpSectionModel) ipChange.ipc$dispatch("378a8988", new Object[]{str, mspContext});
        }
        return new MqpSectionModel(str, new BaseParams(), mspContext);
    }

    public JSONObject buildJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b2c32a6b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(hpl.SECTION_NAME, this.f3558a);
            jSONObject.putOpt("sectionParams", this.b);
            jSONObject.putOpt("env", this.c);
            jSONObject.putOpt(HorizontalXslComponent.ATTR_PAGE_INFO, this.d);
            jSONObject.putOpt("paySession", this.e);
            jSONObject.putOpt(TrtcConstants.TRTC_PARAMS_ELAPSED, Long.valueOf(System.currentTimeMillis() - this.f));
        } catch (JSONException e) {
            LogUtil.record(8, "MqpSectionModel", "build fail: ".concat(String.valueOf(e)));
        }
        return jSONObject;
    }

    public boolean dataReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53550424", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.f3558a)) {
            return true;
        }
        return false;
    }

    public MqpSectionModel<P>.Env getEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Env) ipChange.ipc$dispatch("dc51cc94", new Object[]{this});
        }
        return this.c;
    }

    public PageInfo getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("da3633fc", new Object[]{this});
        }
        return this.d;
    }

    public MqpSectionModel<P>.PaySessionInfo getPaySessionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PaySessionInfo) ipChange.ipc$dispatch("e87d437e", new Object[]{this});
        }
        return this.e;
    }

    public P getSectionParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (P) ((BaseParams) ipChange.ipc$dispatch("a90090e0", new Object[]{this}));
        }
        return this.b;
    }
}
