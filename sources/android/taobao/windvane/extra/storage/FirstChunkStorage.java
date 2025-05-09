package android.taobao.windvane.extra.storage;

import android.net.Uri;
import android.taobao.windvane.extra.storage.strategy.FccStrategy;
import android.taobao.windvane.extra.storage.strategy.FccStrategyType;
import android.taobao.windvane.extra.uc.FirstTruckCacheSSRService;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.util.DeviceUtils;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.icn;
import tb.jpw;
import tb.jrd;
import tb.lcn;
import tb.oba;
import tb.pg1;
import tb.t2o;
import tb.v7t;
import tb.viy;
import tb.vpw;
import tb.wpw;
import tb.y71;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FirstChunkStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FccStrategy mFccStrategy;
    private final String mStorageKey;
    private final Uri mUri;
    private final String mUrl;
    private volatile boolean reportMetaSizeFlag = false;
    private static final IStorage META_STORAGE = StorageFactory.createStorageInstance("WindVaneFirstChunkV2");
    private static final IStorage HTML_STORAGE = StorageFactory.createStorageInstance("WindVaneFirstChunkV2-HTML");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HtmlStorageResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String html;
        public String htmlKey;
        public int htmlLength;
        public FccStorageType type;

        static {
            t2o.a(989856020);
        }

        public HtmlStorageResult(FccStorageType fccStorageType, String str, int i, String str2) {
            this.type = fccStorageType;
            this.html = str;
            this.htmlLength = i;
            this.htmlKey = str2;
        }

        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return TextUtils.isEmpty(this.html);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MetaItemResult {
        public JSONObject meatItem;
        public String metaKey;

        static {
            t2o.a(989856021);
        }

        public MetaItemResult(String str, JSONObject jSONObject) {
            this.metaKey = str;
            this.meatItem = jSONObject;
        }
    }

    static {
        t2o.a(989856018);
    }

    public FirstChunkStorage(String str) {
        Uri uri;
        String str2;
        jrd jrdVar;
        this.mUrl = str;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            uri = Uri.EMPTY;
        }
        this.mUri = uri;
        String queryParameter = uri.getQueryParameter("fcc_match_query");
        if (!TextUtils.isEmpty(queryParameter)) {
            str2 = uri.buildUpon().clearQuery().appendQueryParameter(queryParameter, uri.getQueryParameter(queryParameter)).toString();
        } else {
            str2 = uri.buildUpon().clearQuery().toString();
        }
        if (vpw.commonConfig.f2) {
            if (((jrd) jpw.c().a(jrd.class)) != null) {
                str2 = jrdVar.a() + "_" + str2;
            }
            lcn.f(RVLLevel.Info, FirstTruckCacheSSRService.TAG, "snapshot storage key: " + str2);
        }
        this.mFccStrategy = new FccStrategy();
        this.mStorageKey = str2;
    }

    public static /* synthetic */ String[] access$000(FirstChunkStorage firstChunkStorage, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("18bb8b2b", new Object[]{firstChunkStorage, strArr});
        }
        return firstChunkStorage.sortRules(strArr);
    }

    private MetaItemResult chooseOneFromCandidates(List<MetaItemResult> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaItemResult) ipChange.ipc$dispatch("1ba252f2", new Object[]{this, list});
        }
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                Collections.sort(list, new Comparator<MetaItemResult>() { // from class: android.taobao.windvane.extra.storage.FirstChunkStorage.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public int compare(MetaItemResult metaItemResult, MetaItemResult metaItemResult2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Number) ipChange2.ipc$dispatch("c43ec3d9", new Object[]{this, metaItemResult, metaItemResult2})).intValue();
                        }
                        String string = metaItemResult.meatItem.getString(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_RULE);
                        String string2 = metaItemResult2.meatItem.getString(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_RULE);
                        String[] strArr = new String[0];
                        String[] strArr2 = new String[0];
                        if (!TextUtils.isEmpty(string)) {
                            strArr = string.split(",");
                        }
                        if (!TextUtils.isEmpty(string2)) {
                            strArr2 = string2.split(",");
                        }
                        if (strArr.length != strArr2.length) {
                            return -(strArr.length - strArr2.length);
                        }
                        FirstChunkStorage.access$000(FirstChunkStorage.this, strArr);
                        FirstChunkStorage.access$000(FirstChunkStorage.this, strArr2);
                        return viy.a(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_RULE, strArr).compareTo(viy.a(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_RULE, strArr2));
                    }
                });
            }
            if (!list.isEmpty()) {
                return list.get(0);
            }
        }
        return null;
    }

    private String getHtmlByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76cb7568", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return HTML_STORAGE.read(str);
    }

    private HtmlStorageResult getHtmlByStrategy(FccStrategyType fccStrategyType, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HtmlStorageResult) ipChange.ipc$dispatch("507a02de", new Object[]{this, fccStrategyType, jSONObject});
        }
        String string = jSONObject.getString(FirstTruckCacheSSRService.CACHE_HTML_CACHE);
        String string2 = jSONObject.getString(FirstTruckCacheSSRService.CACHE_HTML_SNAPSHOT);
        int intValue = jSONObject.getIntValue(FirstTruckCacheSSRService.CACHE_HTML_LENGTH_CACHE);
        int intValue2 = jSONObject.getIntValue(FirstTruckCacheSSRService.CACHE_HTML_LENGTH_SNAPSHOT);
        if (fccStrategyType == FccStrategyType.CACHE) {
            return new HtmlStorageResult(FccStorageType.CACHE, getHtmlByKey(string), intValue, string);
        }
        if (fccStrategyType == FccStrategyType.SNAPSHOT) {
            return new HtmlStorageResult(FccStorageType.SNAPSHOT, getHtmlByKey(string2), intValue2, string2);
        }
        if (fccStrategyType == FccStrategyType.LEGACY) {
            return new HtmlStorageResult(getStorageTypeFromMeta(jSONObject), jSONObject.getString(FirstTruckCacheSSRService.CACHE_HTML), jSONObject.getIntValue(FirstTruckCacheSSRService.CACHE_HTML_LENGTH), FirstTruckCacheSSRService.CACHE_HTML);
        }
        String htmlByKey = getHtmlByKey(string2);
        if (!TextUtils.isEmpty(htmlByKey)) {
            return new HtmlStorageResult(FccStorageType.SNAPSHOT, htmlByKey, intValue2, string2);
        }
        return new HtmlStorageResult(FccStorageType.CACHE, getHtmlByKey(string), intValue, string);
    }

    private boolean isValidResponseContext(ResponseContext responseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec16aab", new Object[]{this, responseContext})).booleanValue();
        }
        if (responseContext == null || TextUtils.isEmpty(responseContext.getHtml())) {
            return false;
        }
        if (responseContext.getHtmlLength() > 0 && responseContext.getHtml().length() != responseContext.getHtmlLength()) {
            return false;
        }
        if (!vpw.commonConfig.f3 || !responseContext.isHtmlEmpty()) {
            return responseContext.isEnable();
        }
        return false;
    }

    private String makeHtmlStorageKey(String str, String str2, FccStorageType fccStorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51a027f", new Object[]{this, str, str2, fccStorageType});
        }
        return this.mStorageKey + "_" + str + "_" + str2 + "_" + fccStorageType.name;
    }

    private String makeQueryRuleValueKey(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c89f376e", new Object[]{this, str, uri});
        }
        try {
            String[] sortRules = sortRules(str.split(","));
            StringBuilder sb = new StringBuilder();
            for (String str2 : sortRules) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(str2) && queryParameter != null) {
                    sb.append(str2);
                    sb.append("=");
                    sb.append(queryParameter);
                    sb.append(",");
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private synchronized ResponseContext readInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResponseContext) ipChange.ipc$dispatch("b07f854", new Object[]{this});
        }
        MetaItemResult readMetaItemInfo = readMetaItemInfo();
        if (readMetaItemInfo == null) {
            return null;
        }
        return readResponseContext(readMetaItemInfo);
    }

    private MetaItemResult readMetaItemInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaItemResult) ipChange.ipc$dispatch("1c32c430", new Object[]{this});
        }
        JSONObject readMetaContext = readMetaContext();
        if (readMetaContext == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, Object> entry : readMetaContext.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) value;
                    try {
                        String string = jSONObject.getString(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_RULE);
                        String makeQueryRuleValueKey = makeQueryRuleValueKey(string, this.mUri);
                        if (vpw.commonConfig.n3 && TextUtils.equals(key, makeQueryRuleValueKey)) {
                            linkedList.add(new MetaItemResult(key, jSONObject));
                        } else if (TextUtils.equals(key, string)) {
                            String string2 = jSONObject.getString(FirstTruckCacheSSRService.CACHE_URL);
                            if (!TextUtils.isEmpty(string2) && TextUtils.equals(makeQueryRuleValueKey, makeQueryRuleValueKey(string, Uri.parse(string2)))) {
                                linkedList.add(new MetaItemResult(key, jSONObject));
                            }
                        }
                    } catch (Exception e) {
                        lcn.a(RVLLevel.Warn, FirstTruckCacheSSRService.TAG).j("readMetaItemError").a("storageKey", this.mStorageKey).a("key", key).a("msg", e.getMessage()).f();
                    }
                }
            }
        }
        return chooseOneFromCandidates(linkedList);
    }

    private void removeAllMetaItemInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26b3daa", new Object[]{this});
            return;
        }
        JSONObject readMetaContext = readMetaContext();
        if (readMetaContext != null) {
            for (Map.Entry<String, Object> entry : readMetaContext.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    removeMetaItemHtml((JSONObject) value);
                }
            }
        }
    }

    private boolean removeHtmlByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9cfa74e", new Object[]{this, str})).booleanValue();
        }
        lcn.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).j("removeHtml").a("htmlKey", str).f();
        return HTML_STORAGE.remove(str);
    }

    private void removeMetaItemHtml(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d329e82", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString(FirstTruckCacheSSRService.CACHE_HTML_SNAPSHOT);
        if (!TextUtils.isEmpty(string)) {
            removeHtmlByKey(string);
        }
        String string2 = jSONObject.getString(FirstTruckCacheSSRService.CACHE_HTML_CACHE);
        if (!TextUtils.isEmpty(string2)) {
            removeHtmlByKey(string2);
        }
    }

    private String[] sortRules(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("11d4592e", new Object[]{this, strArr});
        }
        Arrays.sort(strArr);
        return strArr;
    }

    public ResponseContext read() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResponseContext) ipChange.ipc$dispatch("457501b7", new Object[]{this});
        }
        String str = this.mUrl;
        if ((str == null || !str.contains("disableFcc=true")) && !shouldDisableSnapshot()) {
            return readInternal();
        }
        return null;
    }

    public synchronized void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            return;
        }
        removeAllMetaItemInfo();
        META_STORAGE.remove(this.mStorageKey);
        lcn.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).j("remove").a("storageKey", this.mStorageKey).f();
    }

    private FccStorageType getStorageTypeFromMeta(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FccStorageType) ipChange.ipc$dispatch("e6ccc8a4", new Object[]{this, jSONObject});
        }
        if (jSONObject.getIntValue(FirstTruckCacheSSRService.CACHE_PRIORITY) == 1) {
            return FccStorageType.SNAPSHOT;
        }
        return FccStorageType.CACHE;
    }

    private JSONObject readMetaContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2e15961b", new Object[]{this});
        }
        String read = META_STORAGE.read(this.mStorageKey);
        if (TextUtils.isEmpty(read)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(read);
            if (vpw.commonConfig.o3 && !this.reportMetaSizeFlag) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("metaSize", (Object) Integer.valueOf(read.length()));
                jSONObject.put("url", (Object) this.mUrl);
                if (parseObject != null) {
                    jSONObject.put("keyCount", (Object) Integer.valueOf(jSONObject.size()));
                }
                y71.commitSuccess("firstChunkMetaSize", jSONObject);
                this.reportMetaSizeFlag = true;
            }
            return parseObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean saveHtmlByKey(String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8fa1ebf", new Object[]{this, str, str2})).booleanValue();
        }
        icn a2 = lcn.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).j("writeHtml").a("htmlKey", str);
        if (str2 != null) {
            i = str2.length();
        }
        a2.a("size", Integer.valueOf(i)).f();
        return HTML_STORAGE.write(str, str2);
    }

    private boolean inWhiteList(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995398e1", new Object[]{this, str, str2})).booleanValue();
        }
        if (!(str == null || str2 == null)) {
            try {
                for (String str3 : str2.split(",")) {
                    if (str.contains(str3)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                v7t.e("FirstChunkStorage", "url parse fail", e, new Object[0]);
            }
        }
        return false;
    }

    public boolean shouldDisableSnapshot() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d3aaa4", new Object[]{this})).booleanValue();
        }
        wpw wpwVar = vpw.commonConfig;
        String str = wpwVar.b3;
        if (TextUtils.isEmpty(str) || !inWhiteList(this.mUrl, str) || (a2 = DeviceUtils.a()) < 0 || yaa.n == null || !oba.g("wvEnableSkipSnapshot")) {
            return false;
        }
        if (a2 <= wpwVar.c3) {
            return true;
        }
        return wpwVar.d3 && WVUCWebView.sWebViewFirstAttached;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0024, B:14:0x0030, B:16:0x003a, B:19:0x0046, B:21:0x004c, B:23:0x005a, B:26:0x0066, B:28:0x006c, B:32:0x0075, B:35:0x0086, B:39:0x008d, B:41:0x0093, B:43:0x009a, B:45:0x00a2, B:47:0x00a7, B:49:0x00b3, B:51:0x00bf, B:54:0x00ca, B:56:0x00d6, B:57:0x00d9, B:59:0x00e5, B:61:0x00eb, B:62:0x00f0, B:65:0x0153, B:69:0x015e, B:73:0x0180, B:74:0x0190, B:76:0x019c, B:77:0x01bd, B:79:0x01d1, B:81:0x01d9, B:82:0x01df, B:83:0x01e6, B:85:0x01fe, B:87:0x0207, B:89:0x022e, B:90:0x0236, B:91:0x028d, B:93:0x0293, B:94:0x02a7), top: B:99:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0024, B:14:0x0030, B:16:0x003a, B:19:0x0046, B:21:0x004c, B:23:0x005a, B:26:0x0066, B:28:0x006c, B:32:0x0075, B:35:0x0086, B:39:0x008d, B:41:0x0093, B:43:0x009a, B:45:0x00a2, B:47:0x00a7, B:49:0x00b3, B:51:0x00bf, B:54:0x00ca, B:56:0x00d6, B:57:0x00d9, B:59:0x00e5, B:61:0x00eb, B:62:0x00f0, B:65:0x0153, B:69:0x015e, B:73:0x0180, B:74:0x0190, B:76:0x019c, B:77:0x01bd, B:79:0x01d1, B:81:0x01d9, B:82:0x01df, B:83:0x01e6, B:85:0x01fe, B:87:0x0207, B:89:0x022e, B:90:0x0236, B:91:0x028d, B:93:0x0293, B:94:0x02a7), top: B:99:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5 A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0024, B:14:0x0030, B:16:0x003a, B:19:0x0046, B:21:0x004c, B:23:0x005a, B:26:0x0066, B:28:0x006c, B:32:0x0075, B:35:0x0086, B:39:0x008d, B:41:0x0093, B:43:0x009a, B:45:0x00a2, B:47:0x00a7, B:49:0x00b3, B:51:0x00bf, B:54:0x00ca, B:56:0x00d6, B:57:0x00d9, B:59:0x00e5, B:61:0x00eb, B:62:0x00f0, B:65:0x0153, B:69:0x015e, B:73:0x0180, B:74:0x0190, B:76:0x019c, B:77:0x01bd, B:79:0x01d1, B:81:0x01d9, B:82:0x01df, B:83:0x01e6, B:85:0x01fe, B:87:0x0207, B:89:0x022e, B:90:0x0236, B:91:0x028d, B:93:0x0293, B:94:0x02a7), top: B:99:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fe A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0024, B:14:0x0030, B:16:0x003a, B:19:0x0046, B:21:0x004c, B:23:0x005a, B:26:0x0066, B:28:0x006c, B:32:0x0075, B:35:0x0086, B:39:0x008d, B:41:0x0093, B:43:0x009a, B:45:0x00a2, B:47:0x00a7, B:49:0x00b3, B:51:0x00bf, B:54:0x00ca, B:56:0x00d6, B:57:0x00d9, B:59:0x00e5, B:61:0x00eb, B:62:0x00f0, B:65:0x0153, B:69:0x015e, B:73:0x0180, B:74:0x0190, B:76:0x019c, B:77:0x01bd, B:79:0x01d1, B:81:0x01d9, B:82:0x01df, B:83:0x01e6, B:85:0x01fe, B:87:0x0207, B:89:0x022e, B:90:0x0236, B:91:0x028d, B:93:0x0293, B:94:0x02a7), top: B:99:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022e A[Catch: all -> 0x001f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0024, B:14:0x0030, B:16:0x003a, B:19:0x0046, B:21:0x004c, B:23:0x005a, B:26:0x0066, B:28:0x006c, B:32:0x0075, B:35:0x0086, B:39:0x008d, B:41:0x0093, B:43:0x009a, B:45:0x00a2, B:47:0x00a7, B:49:0x00b3, B:51:0x00bf, B:54:0x00ca, B:56:0x00d6, B:57:0x00d9, B:59:0x00e5, B:61:0x00eb, B:62:0x00f0, B:65:0x0153, B:69:0x015e, B:73:0x0180, B:74:0x0190, B:76:0x019c, B:77:0x01bd, B:79:0x01d1, B:81:0x01d9, B:82:0x01df, B:83:0x01e6, B:85:0x01fe, B:87:0x0207, B:89:0x022e, B:90:0x0236, B:91:0x028d, B:93:0x0293, B:94:0x02a7), top: B:99:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0293 A[Catch: all -> 0x001f, LOOP:0: B:91:0x028d->B:93:0x0293, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0024, B:14:0x0030, B:16:0x003a, B:19:0x0046, B:21:0x004c, B:23:0x005a, B:26:0x0066, B:28:0x006c, B:32:0x0075, B:35:0x0086, B:39:0x008d, B:41:0x0093, B:43:0x009a, B:45:0x00a2, B:47:0x00a7, B:49:0x00b3, B:51:0x00bf, B:54:0x00ca, B:56:0x00d6, B:57:0x00d9, B:59:0x00e5, B:61:0x00eb, B:62:0x00f0, B:65:0x0153, B:69:0x015e, B:73:0x0180, B:74:0x0190, B:76:0x019c, B:77:0x01bd, B:79:0x01d1, B:81:0x01d9, B:82:0x01df, B:83:0x01e6, B:85:0x01fe, B:87:0x0207, B:89:0x022e, B:90:0x0236, B:91:0x028d, B:93:0x0293, B:94:0x02a7), top: B:99:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean write(android.taobao.windvane.extra.storage.ResponseContext r13) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.storage.FirstChunkStorage.write(android.taobao.windvane.extra.storage.ResponseContext):boolean");
    }

    private ResponseContext readResponseContext(MetaItemResult metaItemResult) {
        String str;
        HtmlStorageResult htmlStorageResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResponseContext) ipChange.ipc$dispatch("730f596", new Object[]{this, metaItemResult});
        }
        JSONObject jSONObject = metaItemResult.meatItem;
        if (jSONObject == null) {
            return null;
        }
        ResponseContext responseContext = new ResponseContext();
        responseContext.setRule(jSONObject.getString(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_RULE));
        responseContext.setVersion(jSONObject.getString(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_VERSION));
        responseContext.setUrl(jSONObject.getString(FirstTruckCacheSSRService.CACHE_URL));
        responseContext.setExpiredTime(jSONObject.getLongValue(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP));
        responseContext.setEnable(jSONObject.getBooleanValue(FirstTruckCacheSSRService.RESPONSE_HEADER_ENABLE_FCC));
        responseContext.setPriority(jSONObject.getIntValue(FirstTruckCacheSSRService.CACHE_PRIORITY));
        if (vpw.commonConfig.n3) {
            responseContext.setStrategyCache(jSONObject.getString(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_STRATEGY_CACHE));
            boolean useFccStrategyCache = this.mFccStrategy.useFccStrategyCache(responseContext.getStrategyCache());
            if (useFccStrategyCache) {
                htmlStorageResult = getHtmlByStrategy(FccStrategyType.CACHE, jSONObject);
            } else {
                htmlStorageResult = getHtmlByStrategy(FccStrategyType.DEFAULT, jSONObject);
            }
            if (htmlStorageResult.isEmpty()) {
                htmlStorageResult = getHtmlByStrategy(FccStrategyType.LEGACY, jSONObject);
            }
            responseContext.setStorageType(htmlStorageResult.type);
            responseContext.setHtml(htmlStorageResult.html);
            responseContext.setHtmlLength(htmlStorageResult.htmlLength);
            lcn.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).j("read").a("type", htmlStorageResult.type.name).a("strategyCacheResult", Boolean.valueOf(useFccStrategyCache)).a("strategyCache", responseContext.getStrategyCache()).a("storageKey", this.mStorageKey).a("metaKey", metaItemResult.metaKey).a("htmlKey", htmlStorageResult.htmlKey).a(LinkageUtils.PolicyType.RULE, responseContext.getRule()).a(pg1.ATOM_length, Integer.valueOf(responseContext.getHtmlLength())).a("size", Integer.valueOf(responseContext.getHtml() != null ? responseContext.getHtml().length() : 0)).f();
        } else {
            responseContext.setHtml(jSONObject.getString(FirstTruckCacheSSRService.CACHE_HTML));
            responseContext.setHtmlLength(jSONObject.getIntValue(FirstTruckCacheSSRService.CACHE_HTML_LENGTH));
            responseContext.setStorageType(getStorageTypeFromMeta(jSONObject));
            icn j = lcn.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).j("read");
            if (responseContext.getStorageType() != null) {
                str = responseContext.getStorageType().name;
            } else {
                str = "";
            }
            j.a("type", str).a("storageKey", this.mStorageKey).a("metaKey", metaItemResult.metaKey).a("htmlKey", FirstTruckCacheSSRService.CACHE_HTML).a(LinkageUtils.PolicyType.RULE, responseContext.getRule()).a(pg1.ATOM_length, Integer.valueOf(responseContext.getHtmlLength())).a("size", Integer.valueOf(responseContext.getHtml() != null ? responseContext.getHtml().length() : 0)).f();
        }
        if (isValidResponseContext(responseContext)) {
            return responseContext;
        }
        lcn.f(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "read invalid ssr response context.");
        return null;
    }
}
