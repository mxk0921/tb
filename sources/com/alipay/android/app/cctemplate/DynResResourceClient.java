package com.alipay.android.app.cctemplate;

import android.os.ConditionVariable;
import android.util.Pair;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.model.FBSimpleTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.concurrent.ConcurrentHashMap;
import tb.uyv;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DynResResourceClient implements FBResourceClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final NoneValue b = new NoneValue();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Pair<String, FBResourceClient.Type>, Object> f3474a = new ConcurrentHashMap<>(32);

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* renamed from: com.alipay.android.app.cctemplate.DynResResourceClient$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$app$template$FBResourceClient$Type;

        static {
            int[] iArr = new int[FBResourceClient.Type.values().length];
            $SwitchMap$com$alipay$android$app$template$FBResourceClient$Type = iArr;
            try {
                iArr[FBResourceClient.Type.MAIN_FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$app$template$FBResourceClient$Type[FBResourceClient.Type.INNER_FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$app$template$FBResourceClient$Type[FBResourceClient.Type.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$app$template$FBResourceClient$Type[FBResourceClient.Type.DRAWABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class NoneValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public NoneValue() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "<NoneValue>";
        }
    }

    public final Object a(String str, FBResourceClient.Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f71d8fbd", new Object[]{this, str, type});
        }
        String str2 = null;
        if (str == null || type == null) {
            return null;
        }
        Object obj = this.f3474a.get(new Pair(str, type));
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" Get cache [");
        sb.append(type);
        sb.append("]");
        sb.append(str);
        sb.append(" -> ");
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        }
        sb.append(str2);
        LogUtils.record(2, "DynResResourceClient::getFromCache", sb.toString());
        return obj;
    }

    public final void b(String str, FBResourceClient.Type type, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc447320", new Object[]{this, str, type, obj});
        } else if (str != null && type != null) {
            if (obj == null) {
                obj = b;
            }
            if (this.f3474a.size() > 30) {
                this.f3474a.clear();
            }
            this.f3474a.put(new Pair<>(str, type), obj);
        }
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "<DynResResourceClient " + hashCode() + ">";
    }

    @Override // com.alipay.android.app.template.FBResourceClient
    public final Object shouldInterceptResource(String str, FBResourceClient.Type type) {
        final String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a4e0d8b8", new Object[]{this, str2, type});
        }
        Object a2 = a(str, type);
        if (a2 instanceof NoneValue) {
            return null;
        }
        if (a2 != null) {
            return a2;
        }
        if (str2 == null || str2.startsWith("http:") || str2.startsWith(uyv.HTTPS_SCHEMA) || str2.startsWith("data:")) {
            b(str2, type, null);
            return null;
        }
        LogUtils.record(2, "DynResResourceClient::shouldInterceptResource", this + " 拦截非缓存资源 [" + type + "]" + str2);
        str2.substring(str2.lastIndexOf("/") + 1);
        int i = AnonymousClass2.$SwitchMap$com$alipay$android$app$template$FBResourceClient$Type[type.ordinal()];
        if (i == 1 || i == 2) {
            LogUtils.record(2, "DynResResourceClient::shouldInterceptResource", "path=".concat(str2));
            if (str2.startsWith("mspFrameLocal/")) {
                if (str2.startsWith("mspFrameLocal/")) {
                    str2 = str2.substring(14);
                }
                final FBTemplateDecider j = FBTemplateDecider.j("QUICKPAY");
                if (j == null) {
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "missing-decider", "");
                    return null;
                }
                final FBTemplateContent[] fBTemplateContentArr = new FBTemplateContent[1];
                final ConditionVariable conditionVariable = new ConditionVariable();
                SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.cctemplate.DynResResourceClient.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        fBTemplateContentArr[0] = j.l(FBSimpleTplInfo.a(str2));
                        conditionVariable.open();
                    }
                });
                conditionVariable.block(Constants.STARTUP_TIME_LEVEL_1);
                FBTemplateContent fBTemplateContent = fBTemplateContentArr[0];
                if (fBTemplateContent == null) {
                    j.n(str2, "cashier:resourceFail", "", "cannot get template from getLocalTemplate");
                    return null;
                }
                String data = fBTemplateContent.getData();
                j.o(str2, fBTemplateContentArr[0], true);
                b(str2, type, data);
                return data;
            }
            b(str2, type, null);
            return null;
        }
        b(str2, type, null);
        return null;
    }
}
