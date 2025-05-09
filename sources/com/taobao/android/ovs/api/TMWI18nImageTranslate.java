package com.taobao.android.ovs.api;

import anet.channel.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TMWI18nImageTranslate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.ovs.api.TMWI18nImageTranslate$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class AnonymousClass1 implements IRemoteListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a val$callback;

        public AnonymousClass1(a aVar) {
            this.val$callback = aVar;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            TLog.loge("TMWI18nImageTranslate", "onError" + mtopResponse.getRetMsg());
            this.val$callback.a(false, null);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            try {
                TLog.loge("TMWI18nImageTranslate", "onSuccess" + mtopResponse.getDataJsonObject().toString());
                this.val$callback.a(true, (TMWI18nImageTranslateModel) JSON.parseObject(mtopResponse.getDataJsonObject().toString(), TMWI18nImageTranslateModel.class));
            } catch (Exception e) {
                TLog.loge("TMWI18nImageTranslate", e.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(boolean z, TMWI18nImageTranslateModel tMWI18nImageTranslateModel);
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf06bf2", new Object[]{str, str2, str3, str4, map, aVar});
        } else if (aVar != null) {
            if (!StringUtils.isBlank(str) || (!StringUtils.isBlank(str2) && str2.length() <= 512000)) {
                try {
                    MtopRequest mtopRequest = new MtopRequest();
                    mtopRequest.setApiName("mtop.ovs.translate.image.singleSyncTranslate");
                    mtopRequest.setVersion("1.0");
                    mtopRequest.setNeedSession(false);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sourceImageUrl", (Object) str);
                    jSONObject.put("sourceImageBase64", (Object) str2);
                    jSONObject.put(z9u.KEY_TAOKE_BIZSCENE, (Object) "mtop_pailitao");
                    if (StringUtils.isBlank(str3)) {
                        str3 = "auto";
                    }
                    jSONObject.put("sourceLanguage", (Object) str3);
                    if (StringUtils.isBlank(str4)) {
                        str4 = "auto";
                    }
                    jSONObject.put("targetLanguage", (Object) str4);
                    jSONObject.put("sourceImageContentType", (Object) "e_commerce");
                    jSONObject.put("translateAbility", (Object) "qwen_outer");
                    jSONObject.put("abilityExtraMap", (Object) map);
                    mtopRequest.setData(jSONObject.toJSONString());
                    MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener(new IRemoteListener() { // from class: com.taobao.android.ovs.api.TMWI18nImageTranslate.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            TLog.loge("TMWI18nImageTranslate", "onError" + mtopResponse.getRetMsg());
                            a.this.a(false, null);
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            try {
                                TLog.loge("TMWI18nImageTranslate", "onSuccess" + mtopResponse.getDataJsonObject().toString());
                                a.this.a(true, (TMWI18nImageTranslateModel) JSON.parseObject(mtopResponse.getDataJsonObject().toString(), TMWI18nImageTranslateModel.class));
                            } catch (Exception e) {
                                TLog.loge("TMWI18nImageTranslate", e.toString());
                            }
                        }
                    }).reqMethod(MethodEnum.POST).startRequest(BaseOutDo.class);
                } catch (Exception e) {
                    TLog.loge("TMWI18nImageTranslate", e.toString());
                }
            } else {
                aVar.a(false, null);
            }
        }
    }
}
