package com.taobao.tao.shop.rule;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteParserListener;
import com.taobao.tao.shop.rule.mtop.MtopShopRuleVersionedRulesRequest;
import com.taobao.tao.shop.rule.mtop.MtopShopRuleVersionedRulesResponse;
import com.taobao.tao.shop.rule.mtop.MtopShopRuleVersionedRulesResponseData;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.iio;
import tb.jio;
import tb.kyr;
import tb.mvr;
import tb.myr;
import tb.pvr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBUrlRuleDownloader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991553);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4811728", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
            mvr.d("checkRuleUpdate() - bundleName is empty");
        } else if (pvr.a(str2)) {
            mvr.d("checkRuleUpdate() - localVersion is empty");
        } else {
            int indexOf = str2.indexOf(".");
            if (indexOf < 0) {
                mvr.d("checkRuleUpdate() - localVersion is illegal");
                return;
            }
            String substring = str2.substring(0, indexOf);
            if (pvr.a(substring)) {
                mvr.d("checkRuleUpdate() - firstBitVersion is empty");
                return;
            }
            String config = OrangeConfig.getInstance().getConfig(str, iio.KEY_PRE + substring, null);
            if (pvr.a(config)) {
                mvr.d("checkRuleUpdate() - versionInConfig is empty");
            } else if (jio.b(str2, config)) {
                b(str, str2, config);
            } else {
                mvr.d("checkRuleUpdate() - localVersion >= versionInConfig ,  do not update");
            }
        }
    }

    public static void b(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ddc9ad", new Object[]{str, str2, str3});
        } else {
            new AsyncTask<Object, Object, Object>() { // from class: com.taobao.tao.shop.rule.TBUrlRuleDownloader.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str4, Object... objArr) {
                    str4.hashCode();
                    int hashCode = str4.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/taobao/tao/shop/rule/TBUrlRuleDownloader$1");
                }

                @Override // android.os.AsyncTask
                public Object doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                    }
                    kyr kyrVar = new kyr();
                    MtopShopRuleVersionedRulesRequest mtopShopRuleVersionedRulesRequest = new MtopShopRuleVersionedRulesRequest();
                    mtopShopRuleVersionedRulesRequest.setVersion(str2);
                    mtopShopRuleVersionedRulesRequest.setBizType(str);
                    kyrVar.a(new IRemoteParserListener() { // from class: com.taobao.tao.shop.rule.TBUrlRuleDownloader.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                        public void parseResponse(MtopResponse mtopResponse) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                                return;
                            }
                            if (mtopResponse != null) {
                                try {
                                    if (mtopResponse.getBytedata() != null) {
                                        MtopShopRuleVersionedRulesResponse mtopShopRuleVersionedRulesResponse = (MtopShopRuleVersionedRulesResponse) JSON.parseObject(mtopResponse.getBytedata(), MtopShopRuleVersionedRulesResponse.class, new Feature[0]);
                                        if (!(mtopShopRuleVersionedRulesResponse == null || mtopShopRuleVersionedRulesResponse.getData() == null)) {
                                            MtopShopRuleVersionedRulesResponseData data = mtopShopRuleVersionedRulesResponse.getData();
                                            if (data.rules != null && str3.equals(data.version)) {
                                                HashMap hashMap = new HashMap();
                                                hashMap.put("author", data.author);
                                                hashMap.put(MspGlobalDefine.RULES, data.rules);
                                                hashMap.put("version", data.version);
                                                myr.e().h(str, JSON.toJSONString(hashMap), data.version);
                                                return;
                                            }
                                            mvr.d("download() - data.rules == null || !versionInConfig.equals(data.version)");
                                            return;
                                        }
                                        String retMsg = mtopResponse.getRetMsg();
                                        mvr.d("download() - mtopResponse.retMsg = " + retMsg);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    mvr.b(th, "download() - download error");
                                    return;
                                }
                            }
                            mvr.d("download() - mtopResponse is null");
                        }
                    });
                    kyrVar.b(null, 0, mtopShopRuleVersionedRulesRequest, MtopShopRuleVersionedRulesResponse.class);
                    return null;
                }
            }.execute(new Object[0]);
        }
    }
}
