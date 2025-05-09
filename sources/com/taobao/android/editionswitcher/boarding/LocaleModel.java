package com.taobao.android.editionswitcher.boarding;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LocaleModel implements Serializable, IMTOPDataObject {
    public List<SiteLangModel> countryInfo;
    public SiteLangModel currentCountryInfo;
    public Map<String, HomePopData> homePops;
    public boolean localBoardingI18nEnable;
    public PromoteText promoteText;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class HomePopData implements Serializable, IMTOPDataObject {
        public String chineseButtonTitle;
        public String clientLang;
        public String foreignButtonTitle;
        public String headerImg;
        public String title;

        static {
            t2o.a(456130637);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LangModel implements Serializable, IMTOPDataObject {
        public boolean defaultLang;
        public String lang;
        public String langName;

        static {
            t2o.a(456130638);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class PromoteText implements Serializable, IMTOPDataObject {
        public String bottomButton;
        public String bottomTips;
        public String chooseCountrySubTitle;
        public String chooseCountryTItle;
        public String chooseLangSubTitle;
        public String chooseLangTitle;
        public String protocolPrefix;
        public String selectText;

        static {
            t2o.a(456130640);
            t2o.a(589299906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SiteLangModel implements Serializable, IMTOPDataObject {
        public boolean i18nBlackIp = false;
        public boolean i18nEnable = false;
        public List<LangModel> langs;
        public String site;
        public Map<String, String> siteName;

        static {
            t2o.a(456130641);
            t2o.a(589299906);
        }
    }

    static {
        t2o.a(456130636);
        t2o.a(589299906);
    }

    public static LocaleModel getDefault() {
        return (LocaleModel) JSON.parseObject("{\"countryInfo\":[{\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文\"}],\"site\":\"CN\",\"siteName\":{\"en_US\":\"Mainland of China\",\"zh_CN\":\"中国大陆\"}},{\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文\"}],\"site\":\"SG\",\"siteName\":{\"en_US\":\"Singapore\",\"zh_CN\":\"新加坡\"}},{\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文\"}],\"site\":\"MY\",\"siteName\":{\"en_US\":\"Malaysia\",\"zh_CN\":\"马来西亚\"}}],\"currentCountryInfo\":{\"i18nBlackIp\":\"false\",\"i18nEnable\":\"false\",\"langs\":[{\"defaultLang\":\"true\",\"lang\":\"zh_CN\",\"langName\":\"中文 \"}],\"site\":\"CN\",\"siteName\":{\"en_US\":\"Mainland of China\",\"zh_CN\":\"中国大陆\"}},\"promoteText\":{\"bottomTips\":\"You can modify in Account > Settings\",\"selectText\":\"select region and language\"}}", LocaleModel.class);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LocaleData implements Serializable, IMTOPDataObject {
        public boolean isDefault;
        public String key;
        public int nationalFlag;
        public boolean selected;
        public String value;

        static {
            t2o.a(456130639);
            t2o.a(589299906);
        }

        public LocaleData(String str, String str2) {
            this.selected = false;
            this.isDefault = false;
            this.key = str;
            this.value = str2;
        }

        public LocaleData(String str, String str2, boolean z) {
            this.selected = false;
            this.key = str;
            this.value = str2;
            this.isDefault = z;
        }

        public LocaleData(String str, String str2, boolean z, int i) {
            this.isDefault = false;
            this.key = str;
            this.value = str2;
            this.selected = z;
            this.nationalFlag = i;
        }
    }
}
