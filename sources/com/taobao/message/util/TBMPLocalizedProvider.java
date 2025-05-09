package com.taobao.message.util;

import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.security.realidentity.o;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.provider.IMPLocalizedProvider;
import com.taobao.message.kit.provider.TranslateCallback;
import com.taobao.message.translate.MtopOvsTranslateBatchSyncTranslateRequest;
import com.taobao.message.translate.MtopOvsTranslateSingleSyncTranslateRequest;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.a07;
import tb.ckf;
import tb.iu6;
import tb.t2o;
import tb.vqx;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ%\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0016¢\u0006\u0004\b$\u0010%J1\u0010(\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0&2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u0010J\u001f\u0010-\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/taobao/message/util/TBMPLocalizedProvider;", "Lcom/taobao/message/kit/provider/IMPLocalizedProvider;", "<init>", "()V", "", LoggingSPCache.STORAGE_LANGUAGE, "Lcom/alibaba/ability/localization/constants/Language;", "convertMpLanguageToTbLanguage", "(I)Lcom/alibaba/ability/localization/constants/Language;", "", "isSimplifiedChinese", "()Z", "getMPLanguage", "()I", "", vqx.HUMMER_FOUNDATION_GET_LANGUAGE, "()Ljava/lang/String;", "getCountry", "getLanguageTag", "getLanguageCountry", "", "timestamp", "formatDate", "(J)Ljava/lang/String;", "formatDateTime", "key", "localizedString", "(Ljava/lang/String;)Ljava/lang/String;", "id", "(I)Ljava/lang/String;", "expressionText", "localizedExpressionText", "originalText", "Lcom/taobao/message/kit/provider/TranslateCallback;", "callback", "Ltb/xhv;", "translate", "(Ljava/lang/String;Lcom/taobao/message/kit/provider/TranslateCallback;)V", "", "originalTextList", "batchTranslate", "(Ljava/util/List;Lcom/taobao/message/kit/provider/TranslateCallback;)V", "isI18nEdition", "getLocation", "locale", "setLocale", "(ILjava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "Companion", "message_base_tb_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TBMPLocalizedProvider implements IMPLocalizedProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private final String TAG = "TBMPLocalizedProvider";
    public static final Companion Companion = new Companion(null);
    public static final String BIZ_SCENE = BIZ_SCENE;
    public static final String BIZ_SCENE = BIZ_SCENE;
    public static final String SOURCE_TEXT_FORMAT_TYPE = "text";
    public static final String SOURCE_TEXT_CONTENT_TYPE = "chat";

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/message/util/TBMPLocalizedProvider$Companion;", "", "()V", "BIZ_SCENE", "", "SOURCE_TEXT_CONTENT_TYPE", "SOURCE_TEXT_FORMAT_TYPE", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        static {
            t2o.a(530579508);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(530579509);
            int[] iArr = new int[Language.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Language.SIMPLIFIED_CHINESE.ordinal()] = 1;
            iArr[Language.ENGLISH.ordinal()] = 2;
        }
    }

    public static final /* synthetic */ String access$getTAG$p(TBMPLocalizedProvider tBMPLocalizedProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("faa9245f", new Object[]{tBMPLocalizedProvider});
        }
        return tBMPLocalizedProvider.TAG;
    }

    private final Language convertMpLanguageToTbLanguage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("faf7016", new Object[]{this, new Integer(i)});
        }
        if (i == 1001) {
            return Language.SIMPLIFIED_CHINESE;
        }
        if (i != 1002) {
            return null;
        }
        return Language.ENGLISH;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public void batchTranslate(final List<String> list, final TranslateCallback<List<String>> translateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4d59ec", new Object[]{this, list, translateCallback});
            return;
        }
        ckf.h(list, "originalTextList");
        ckf.h(translateCallback, "callback");
        MtopOvsTranslateBatchSyncTranslateRequest mtopOvsTranslateBatchSyncTranslateRequest = new MtopOvsTranslateBatchSyncTranslateRequest();
        mtopOvsTranslateBatchSyncTranslateRequest.setBizScene(BIZ_SCENE);
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceLanguage(Language.SIMPLIFIED_CHINESE.getTag());
        mtopOvsTranslateBatchSyncTranslateRequest.setTargetLanguage(Language.ENGLISH.getTag());
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceTextContentType(SOURCE_TEXT_CONTENT_TYPE);
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceTextFormatType(SOURCE_TEXT_FORMAT_TYPE);
        mtopOvsTranslateBatchSyncTranslateRequest.setSourceTextList(list.toString());
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopOvsTranslateBatchSyncTranslateRequest);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.util.TBMPLocalizedProvider$batchTranslate$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ckf.h(mtopResponse, "mtopResponse");
                ckf.h(obj, o.b);
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback2 = translateCallback;
                String retMsg = mtopResponse.getRetMsg();
                ckf.c(retMsg, "mtopResponse.retMsg");
                translateCallback2.onTranslateError(retMsg);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ckf.h(mtopResponse, "mtopResponse");
                ckf.h(obj, o.b);
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onSystemError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback2 = translateCallback;
                String retMsg = mtopResponse.getRetMsg();
                ckf.c(retMsg, "mtopResponse.retMsg");
                translateCallback2.onTranslateError(retMsg);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ckf.h(mtopResponse, "mtopResponse");
                ckf.h(baseOutDo, "baseOutDo");
                ckf.h(obj, o.b);
                try {
                    JSONArray optJSONArray = mtopResponse.getDataJsonObject().optJSONArray("translateResponseList");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray.length() == list.size()) {
                        int length = optJSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            arrayList.add(optJSONArray.getJSONObject(i2).getString("targetText"));
                        }
                        translateCallback.onTranslateComplete(arrayList);
                        return;
                    }
                    translateCallback.onTranslateError("result length is not equal to input length");
                } catch (Throwable th) {
                    TranslateCallback translateCallback2 = translateCallback;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "handle mtop callback failed";
                    }
                    translateCallback2.onTranslateError(message);
                    String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                    TLog.loge(access$getTAG$p, "error " + th.toString());
                }
            }
        });
        build.startRequest(MtopOvsTranslateBatchSyncTranslateRequest.class);
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String formatDate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d58945a8", new Object[]{this, new Long(j)});
        }
        String a2 = iu6.a(j, 7);
        ckf.c(a2, "DateFormat.format(timestamp, DateFormat.FLAG_DATE)");
        return a2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String formatDateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b5aa255", new Object[]{this, new Long(j)});
        }
        String a2 = iu6.a(j, 31);
        ckf.c(a2, "DateFormat.format(timest…ateFormat.FLAG_DATE_TIME)");
        return a2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73367799", new Object[]{this});
        }
        Language h = Localization.h();
        ckf.c(h, "Localization.getLanguage()");
        String country = h.getCountry();
        ckf.c(country, "Localization.getLanguage().country");
        return country;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[]{this});
        }
        Language h = Localization.h();
        ckf.c(h, "Localization.getLanguage()");
        String language = h.getLanguage();
        ckf.c(language, "Localization.getLanguage().language");
        return language;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLanguageCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56d95511", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Language h = Localization.h();
        ckf.c(h, "Localization.getLanguage()");
        sb.append(h.getLanguage());
        sb.append("_");
        Language h2 = Localization.h();
        ckf.c(h2, "Localization.getLanguage()");
        sb.append(h2.getCountry());
        return sb.toString();
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLanguageTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1981fe8d", new Object[]{this});
        }
        Language h = Localization.h();
        ckf.c(h, "Localization.getLanguage()");
        String tag = h.getTag();
        ckf.c(tag, "Localization.getLanguage().tag");
        return tag;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String getLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d853caae", new Object[]{this});
        }
        String j = Localization.j();
        ckf.c(j, "Localization.getLocation()");
        return j;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public int getMPLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3002adeb", new Object[]{this})).intValue();
        }
        Language h = Localization.h();
        ckf.c(h, "Localization.getLanguage()");
        int i = WhenMappings.$EnumSwitchMapping$0[h.ordinal()];
        if (i == 1) {
            return 1001;
        }
        if (i != 2) {
            return 1000;
        }
        return 1002;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public boolean isI18nEdition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[]{this})).booleanValue();
        }
        return Localization.o();
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public boolean isSimplifiedChinese() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef4a576", new Object[]{this})).booleanValue();
        }
        return Localization.p();
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String localizedString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c25c8543", new Object[]{this, str});
        }
        ckf.h(str, "key");
        String r = Localization.r(str);
        return r != null ? r : "";
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public void setLocale(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d255d4a", new Object[]{this, new Integer(i), str});
            return;
        }
        ckf.h(str, "locale");
        if (convertMpLanguageToTbLanguage(i) == null) {
            String str2 = this.TAG;
            TLog.loge(str2, "cannot find language for " + i);
        }
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public void translate(String str, final TranslateCallback<String> translateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb36a59", new Object[]{this, str, translateCallback});
            return;
        }
        ckf.h(str, "originalText");
        ckf.h(translateCallback, "callback");
        MtopOvsTranslateSingleSyncTranslateRequest mtopOvsTranslateSingleSyncTranslateRequest = new MtopOvsTranslateSingleSyncTranslateRequest();
        mtopOvsTranslateSingleSyncTranslateRequest.setBizScene(BIZ_SCENE);
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceLanguage(Language.SIMPLIFIED_CHINESE.getTag());
        mtopOvsTranslateSingleSyncTranslateRequest.setTargetLanguage(Language.ENGLISH.getTag());
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceTextContentType(SOURCE_TEXT_CONTENT_TYPE);
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceTextFormatType(SOURCE_TEXT_FORMAT_TYPE);
        mtopOvsTranslateSingleSyncTranslateRequest.setSourceTextFormatType(str);
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopOvsTranslateSingleSyncTranslateRequest);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.util.TBMPLocalizedProvider$translate$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ckf.h(mtopResponse, "mtopResponse");
                ckf.h(obj, o.b);
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback2 = translateCallback;
                String retMsg = mtopResponse.getRetMsg();
                ckf.c(retMsg, "mtopResponse.retMsg");
                translateCallback2.onTranslateError(retMsg);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ckf.h(mtopResponse, "mtopResponse");
                ckf.h(baseOutDo, "baseOutDo");
                ckf.h(obj, o.b);
                try {
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    TranslateCallback translateCallback2 = translateCallback;
                    String string = dataJsonObject.getString("targetText");
                    ckf.c(string, "jsonObject.getString(\"targetText\")");
                    translateCallback2.onTranslateComplete(string);
                } catch (Throwable th) {
                    TranslateCallback translateCallback3 = translateCallback;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "handle mtop callback failed";
                    }
                    translateCallback3.onTranslateError(message);
                    String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                    TLog.loge(access$getTAG$p, "error " + th.toString());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ckf.h(mtopResponse, "mtopResponse");
                ckf.h(obj, o.b);
                String access$getTAG$p = TBMPLocalizedProvider.access$getTAG$p(TBMPLocalizedProvider.this);
                TLog.loge(access$getTAG$p, "onSystemError:" + mtopResponse.getRetMsg());
                TranslateCallback translateCallback2 = translateCallback;
                String retMsg = mtopResponse.getRetMsg();
                ckf.c(retMsg, "mtopResponse.retMsg");
                translateCallback2.onTranslateError(retMsg);
            }
        });
        build.startRequest(MtopOvsTranslateSingleSyncTranslateRequest.class);
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String localizedExpressionText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b44229ef", new Object[]{this, str});
        }
        ckf.h(str, "expressionText");
        Matcher matcher = Pattern.compile("\\$\\{mp_localization_([^}]*)\\}").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group == null) {
                group = "";
            }
            matcher.appendReplacement(stringBuffer, localizedString(group));
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        ckf.c(stringBuffer2, "stringBuffer.toString()");
        return stringBuffer2;
    }

    @Override // com.taobao.message.kit.provider.IMPLocalizedProvider
    public String localizedString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f754730", new Object[]{this, new Integer(i)});
        }
        String q = Localization.q(i);
        return q != null ? q : "";
    }

    static {
        t2o.a(530579507);
        t2o.a(529530949);
    }
}
