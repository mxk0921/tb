package com.taobao.message.notification.banner.dx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher;", "", "<init>", "()V", "Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;", "fetcher", "Ltb/xhv;", "setFetcher", "(Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;)V", "", "templateId", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "fetchDXTemplateItem", "(I)Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "defaultConfig", "Lcom/alibaba/fastjson/JSONObject;", "getDefaultConfig", "()Lcom/alibaba/fastjson/JSONObject;", "currentConfig", "getCurrentConfig", "setCurrentConfig", "(Lcom/alibaba/fastjson/JSONObject;)V", "mFetcher", "Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;", "getMFetcher", "()Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;", "setMFetcher", "TemplateFetcher", "notification_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DXTemplateItemFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static JSONObject currentConfig;
    private static TemplateFetcher mFetcher;
    public static final DXTemplateItemFetcher INSTANCE = new DXTemplateItemFetcher();
    private static final JSONObject defaultConfig = JSON.parseObject("{\"281002\":{\"name\":\"alimp_test_new_push\",\"version\":1687838056288,\"templateUrl\":\"https://dinamicx.alibabausercontent.com/pub/alimp_test_new_push/1687838056288/alimp_test_new_push.zip\"},\"289001\":{\"name\":\"alimp_new_push_square\",\"version\":1687835691484,\"templateUrl\":\"https://dinamicx.alibabausercontent.com/pub/alimp_new_push_square/1687835691484/alimp_new_push_square.zip\"}}");

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;", "", CredentialRpcData.ACTION_FETCH, "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "templateId", "", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface TemplateFetcher {
        DXTemplateItem fetch(int i);
    }

    private DXTemplateItemFetcher() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[ORIG_RETURN, RETURN] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.taobao.android.dinamicx.template.download.DXTemplateItem fetchDXTemplateItem(int r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001a
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r5)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r1
            java.lang.String r1 = "43b15fbe"
            java.lang.Object r5 = r0.ipc$dispatch(r1, r5)
            com.taobao.android.dinamicx.template.download.DXTemplateItem r5 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r5
            return r5
        L_0x001a:
            com.taobao.message.notification.banner.dx.DXTemplateItemFetcher$TemplateFetcher r0 = com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.mFetcher
            r1 = 0
            if (r0 != 0) goto L_0x008c
            com.alibaba.fastjson.JSONObject r0 = com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.currentConfig
            if (r0 != 0) goto L_0x0041
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r2 = "pushLayoutInfo"
            java.lang.String r3 = ""
            java.lang.String r4 = "mpm_data_switch"
            java.lang.String r0 = r0.getConfig(r4, r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0041
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: Exception -> 0x0040
            com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.currentConfig = r0     // Catch: Exception -> 0x0040
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            com.alibaba.fastjson.JSONObject r0 = com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.currentConfig
            java.lang.Class<com.taobao.android.dinamicx.template.download.DXTemplateItem> r2 = com.taobao.android.dinamicx.template.download.DXTemplateItem.class
            if (r0 == 0) goto L_0x006a
            if (r0 == 0) goto L_0x0066
            java.lang.String r3 = java.lang.String.valueOf(r5)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x006a
            com.alibaba.fastjson.JSONObject r0 = com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.currentConfig
            if (r0 == 0) goto L_0x0062
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r0.getObject(r3, r2)
            com.taobao.android.dinamicx.template.download.DXTemplateItem r0 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r0
            goto L_0x006b
        L_0x0062:
            tb.ckf.s()
            throw r1
        L_0x0066:
            tb.ckf.s()
            throw r1
        L_0x006a:
            r0 = r1
        L_0x006b:
            if (r0 != 0) goto L_0x008b
            com.alibaba.fastjson.JSONObject r3 = com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.defaultConfig
            if (r3 == 0) goto L_0x0087
            java.lang.String r1 = java.lang.String.valueOf(r5)
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x008b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r5 = r3.getObject(r5, r2)
            r0 = r5
            com.taobao.android.dinamicx.template.download.DXTemplateItem r0 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r0
            goto L_0x008b
        L_0x0087:
            tb.ckf.s()
            throw r1
        L_0x008b:
            return r0
        L_0x008c:
            if (r0 == 0) goto L_0x0093
            com.taobao.android.dinamicx.template.download.DXTemplateItem r5 = r0.fetch(r5)
            return r5
        L_0x0093:
            tb.ckf.s()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.notification.banner.dx.DXTemplateItemFetcher.fetchDXTemplateItem(int):com.taobao.android.dinamicx.template.download.DXTemplateItem");
    }

    @JvmStatic
    public static final void setFetcher(TemplateFetcher templateFetcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4930dae7", new Object[]{templateFetcher});
            return;
        }
        ckf.h(templateFetcher, "fetcher");
        mFetcher = templateFetcher;
    }

    public final JSONObject getCurrentConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("af71ef8c", new Object[]{this});
        }
        return currentConfig;
    }

    public final JSONObject getDefaultConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63da8e54", new Object[]{this});
        }
        return defaultConfig;
    }

    public final TemplateFetcher getMFetcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateFetcher) ipChange.ipc$dispatch("4287f03a", new Object[]{this});
        }
        return mFetcher;
    }

    public final void setCurrentConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca3d610", new Object[]{this, jSONObject});
        } else {
            currentConfig = jSONObject;
        }
    }

    public final void setMFetcher(TemplateFetcher templateFetcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ece0f30", new Object[]{this, templateFetcher});
        } else {
            mFetcher = templateFetcher;
        }
    }

    static {
        t2o.a(610271248);
    }
}
