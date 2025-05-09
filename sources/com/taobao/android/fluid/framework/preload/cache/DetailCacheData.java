package com.taobao.android.fluid.framework.preload.cache;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.tao.timestamp.TimeStampManager;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONException;
import tb.b93;
import tb.c4o;
import tb.cnm;
import tb.grm;
import tb.hrm;
import tb.ir9;
import tb.re7;
import tb.t2o;
import tb.usm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DetailCacheData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MIN_CHECK_VIDEOCACHE_TIME = 10000;
    private static final String TAG = "DetailCacheData";
    public String contentId;
    @JSONField(deserialize = false, serialize = false)
    private int currentDataVersion;
    public JSONObject detailResponseData;
    public String enableVerticalLayout;
    public String firstFrameUrl;
    public boolean hasDownLoadError;
    public boolean hasVideoCached;
    public int hasVideoDownloadSize;
    public long hasVideoDownloadTime;
    public boolean isValid;
    public long lastCheckVideoCacheTime;
    @JSONField(deserialize = false, serialize = false)
    private JSONObject mediaContentDetailData;
    @JSONField(deserialize = false, serialize = false)
    private JSONObject mediaContentDetailJson;
    @JSONField(deserialize = false, serialize = false)
    private volatile boolean mediaContentLoaded;
    @JSONField(deserialize = false, serialize = false)
    private com.taobao.android.fluid.framework.data.datamodel.a mediaSetData;
    public String mixCacheType;
    private boolean playerCacheHighPriority;
    private String playerCacheKey;
    public String sceneName;
    public long timeStamp;
    public String version;
    @JSONField(deserialize = false, serialize = false)
    private org.json.JSONObject videoResourceJsonObject;
    private String videoResourceStr;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f7891a;
        public String b;
        public JSONObject c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public com.taobao.android.fluid.framework.data.datamodel.a i;
        public JSONObject j;
        public JSONObject k;
        public int l;

        static {
            t2o.a(468714633);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("857797c4", new Object[]{aVar})).longValue();
            }
            return aVar.f7891a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aba42ef", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("30780d5f", new Object[]{aVar});
            }
            return aVar.j;
        }

        public static /* synthetic */ JSONObject d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("e3f11f60", new Object[]{aVar});
            }
            return aVar.k;
        }

        public static /* synthetic */ JSONObject e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("c7d526f2", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9918db2d", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6048274c", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2777736b", new Object[]{aVar});
            }
            return aVar.g;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("eea6bf8a", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5d60ba9", new Object[]{aVar});
            }
            return aVar.h;
        }

        public static /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("85d695d9", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ int l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("69bb9dcc", new Object[]{aVar})).intValue();
            }
            return aVar.l;
        }

        public DetailCacheData m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailCacheData) ipChange.ipc$dispatch("8b309851", new Object[]{this});
            }
            return new DetailCacheData(this);
        }

        public a n(FluidContext fluidContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5cab87b3", new Object[]{this, fluidContext});
            }
            this.f7891a = TimeStampManager.instance().getCurrentTimeStamp();
            this.f = "1";
            this.e = "1";
            this.g = String.valueOf(b93.n(fluidContext));
            return this;
        }

        public a o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("32820d4a", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a p(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("46209702", new Object[]{this, jSONObject});
            }
            this.c = jSONObject;
            return this;
        }

        public a q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("19f9e56c", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a r(a.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2780ae2e", new Object[]{this, dVar});
            }
            MediaContentDetailData g = dVar.g();
            JSONObject jSONObject = dVar.d;
            this.j = (JSONObject) JSON.toJSON(g);
            this.k = jSONObject;
            this.l = g.currentDataVersion;
            return this;
        }

        public a s(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("62f9afe5", new Object[]{this, aVar});
            }
            this.i = aVar;
            return this;
        }

        public a t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("74423e76", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(468714632);
    }

    public DetailCacheData() {
        this.lastCheckVideoCacheTime = 0L;
        this.hasVideoDownloadTime = 0L;
        this.hasVideoDownloadSize = 0;
        this.hasDownLoadError = false;
        this.playerCacheHighPriority = false;
        this.mediaContentLoaded = false;
    }

    private void loadMediaContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740e7302", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.contentId)) {
            re7.f(this.contentId, this);
        }
        this.mediaContentLoaded = true;
    }

    public static DetailCacheData parseFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("28de1f42", new Object[]{jSONObject});
        }
        DetailCacheData detailCacheData = new DetailCacheData();
        if (jSONObject.containsKey("timeStamp")) {
            detailCacheData.timeStamp = jSONObject.getLong("timeStamp").longValue();
        }
        if (jSONObject.containsKey("videoResourceStr")) {
            detailCacheData.videoResourceStr = jSONObject.getString("videoResourceStr");
        }
        if (jSONObject.containsKey("detailResponseData")) {
            detailCacheData.detailResponseData = jSONObject.getJSONObject("detailResponseData");
        }
        if (jSONObject.containsKey("contentId")) {
            detailCacheData.contentId = jSONObject.getString("contentId");
        }
        if (jSONObject.containsKey("mixCacheType")) {
            detailCacheData.mixCacheType = jSONObject.getString("mixCacheType");
        }
        if (jSONObject.containsKey("version")) {
            detailCacheData.version = jSONObject.getString("version");
        }
        if (jSONObject.containsKey("firstFrameUrl")) {
            detailCacheData.firstFrameUrl = jSONObject.getString("firstFrameUrl");
        }
        if (jSONObject.containsKey("sceneName")) {
            detailCacheData.sceneName = jSONObject.getString("sceneName");
        }
        if (jSONObject.containsKey("isValid")) {
            detailCacheData.isValid = jSONObject.getBooleanValue("isValid");
        }
        if (jSONObject.containsKey("hasVideoCached")) {
            detailCacheData.hasVideoCached = jSONObject.getBooleanValue("hasVideoCached");
        }
        if (jSONObject.containsKey("hasVideoDownloadTime")) {
            detailCacheData.hasVideoDownloadTime = jSONObject.getLongValue("hasVideoDownloadTime");
        }
        if (jSONObject.containsKey("hasVideoDownloadSize")) {
            detailCacheData.hasVideoDownloadSize = jSONObject.getIntValue("hasVideoDownloadSize");
        }
        if (jSONObject.containsKey(c4o.KEY_VERTICAL_LAYOUT)) {
            detailCacheData.enableVerticalLayout = jSONObject.getString(c4o.KEY_VERTICAL_LAYOUT);
        }
        if (jSONObject.containsKey("mediaContentDetailData")) {
            detailCacheData.mediaContentDetailData = jSONObject.getJSONObject("mediaContentDetailData");
        }
        if (jSONObject.containsKey("mediaContentDetailJson")) {
            detailCacheData.mediaContentDetailJson = jSONObject.getJSONObject("mediaContentDetailJson");
        }
        if (jSONObject.containsKey("hasDownLoadError")) {
            detailCacheData.hasDownLoadError = jSONObject.getBooleanValue("hasDownLoadError");
        }
        if (jSONObject.containsKey("playerCacheKey")) {
            detailCacheData.playerCacheKey = jSONObject.getString("playerCacheKey");
        }
        if (jSONObject.containsKey("playerCacheHighPriority")) {
            detailCacheData.playerCacheHighPriority = jSONObject.getBooleanValue("playerCacheHighPriority");
        }
        return detailCacheData;
    }

    private String varValueExist(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0219330", new Object[]{this, obj});
        }
        if (obj == null) {
            return "false";
        }
        return "true";
    }

    public int calcHealthyScore() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fabf564", new Object[]{this})).intValue();
        }
        boolean checkUpdateValidOrNot = checkUpdateValidOrNot();
        boolean checkUpdateHasVideoCacheOrNot = checkUpdateHasVideoCacheOrNot();
        if (!checkUpdateValidOrNot || !checkUpdateHasVideoCacheOrNot) {
            i = 10;
        } else {
            i = 100;
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        long j = currentTimeStamp - 864000000;
        long j2 = this.timeStamp;
        long j3 = this.hasVideoDownloadTime;
        if (j3 > 0) {
            j = j3;
        }
        long j4 = currentTimeStamp - j2;
        long j5 = currentTimeStamp - j;
        long j6 = (long) IDetailCache.KEEP_MIN_HAS_CACHE_TIME;
        int i2 = (int) (j4 / j6);
        int i3 = (int) (j5 / j6);
        int i4 = (i - i2) - i3;
        ir9.b(TAG, "cacheDataHealthyScore, contentid=" + this.contentId + ", now=" + currentTimeStamp + " spendTimeDetail=" + j4 + " spendTimeVideo=" + j5 + ", spendSorceDetailCache=" + i2 + " spendSorceVideoCache=" + i3 + " remainScore=" + i4);
        return i4;
    }

    public long calcHealthyScoreFocusValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69351509", new Object[]{this})).longValue();
        }
        if (checkUpdateValidOrNot()) {
            return this.timeStamp;
        }
        return -1L;
    }

    public boolean checkUpdateHasVideoCacheOrNot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2474b2cb", new Object[]{this})).booleanValue();
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        if (currentTimeStamp - this.lastCheckVideoCacheTime < 10000) {
            return this.hasVideoCached;
        }
        this.hasVideoCached = cnm.A(getVideoResourceJsonObject());
        this.lastCheckVideoCacheTime = currentTimeStamp;
        ir9.b(TAG, "checkUpdateHasVideoCacheOrNot: contentid=" + this.contentId + ", hasVideoCached=" + this.hasVideoCached);
        return this.hasVideoCached;
    }

    public boolean checkUpdateHasVideoCacheOrNotForce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d977b96", new Object[]{this})).booleanValue();
        }
        this.hasVideoCached = cnm.A(getVideoResourceJsonObject());
        this.lastCheckVideoCacheTime = TimeStampManager.instance().getCurrentTimeStamp();
        ir9.b(TAG, "checkUpdateHasVideoCacheOrNotForce: contentid=" + this.contentId + ", hasVideoCached=" + this.hasVideoCached);
        return this.hasVideoCached;
    }

    public boolean checkUpdateValidOrNot() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7d3c430", new Object[]{this})).booleanValue();
        }
        if (dataState() == -1) {
            z = true;
        }
        this.isValid = z;
        return z;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailCacheData)) {
            return false;
        }
        return Objects.equals(this.contentId, ((DetailCacheData) obj).contentId);
    }

    public String getContentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        return this.contentId;
    }

    public int getCurrentDataVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("576d4f85", new Object[]{this})).intValue();
        }
        if (!this.mediaContentLoaded) {
            loadMediaContent();
        }
        return this.currentDataVersion;
    }

    public JSONObject getDetailResponseData(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2be8cccb", new Object[]{this, fluidContext});
        }
        if (!usm.b() && TextUtils.isEmpty(this.enableVerticalLayout)) {
            this.detailResponseData = null;
        } else if (!TextUtils.isEmpty(this.enableVerticalLayout) && !TextUtils.equals(this.enableVerticalLayout, String.valueOf(b93.n(fluidContext)))) {
            this.detailResponseData = null;
        }
        return this.detailResponseData;
    }

    public String getFirstFrameUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bb29c9d", new Object[]{this});
        }
        return this.firstFrameUrl;
    }

    public JSONObject getMediaContentDetailData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("68559d0d", new Object[]{this});
        }
        if (!this.mediaContentLoaded) {
            loadMediaContent();
        }
        return this.mediaContentDetailData;
    }

    public JSONObject getMediaContentDetailJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ae03534b", new Object[]{this});
        }
        if (!this.mediaContentLoaded) {
            loadMediaContent();
        }
        return this.mediaContentDetailJson;
    }

    public com.taobao.android.fluid.framework.data.datamodel.a getMediaSetData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("3ad1816c", new Object[]{this});
        }
        return this.mediaSetData;
    }

    public String getMixCacheType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43736b63", new Object[]{this});
        }
        return this.mixCacheType;
    }

    public String getPlayerCacheKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d87505", new Object[]{this});
        }
        return this.playerCacheKey;
    }

    public String getSceneName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return this.sceneName;
    }

    public long getTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue();
        }
        return this.timeStamp;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    public org.json.JSONObject getVideoResourceJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("e6f2828f", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.videoResourceStr)) {
            return null;
        }
        if (this.videoResourceJsonObject == null) {
            try {
                this.videoResourceJsonObject = new org.json.JSONObject(this.videoResourceStr);
            } catch (JSONException unused) {
                return null;
            }
        }
        return this.videoResourceJsonObject;
    }

    public String getVideoResourceStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12f8727b", new Object[]{this});
        }
        if (TextUtils.equals(this.videoResourceStr, "null")) {
            return null;
        }
        return this.videoResourceStr;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.contentId);
    }

    public boolean isExpired() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
        }
        grm b = hrm.a().b();
        long j = b.c;
        if (j < 0) {
            j = 216000000;
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        if (currentTimeStamp - getTimeStamp() > j) {
            return true;
        }
        if (b.k == null) {
            return false;
        }
        int i = 0;
        while (true) {
            long[] jArr = b.k;
            if (i >= jArr.length) {
                break;
            }
            long j2 = jArr[i];
            if (currentTimeStamp > j2 && j2 > getTimeStamp()) {
                z = true;
                break;
            }
            i++;
        }
        ir9.b(TAG, "isExpired(),detailCache expiredAfterTimeStamp:" + z);
        return z;
    }

    public boolean isPlayerCacheHighPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c65f6a8", new Object[]{this})).booleanValue();
        }
        return this.playerCacheHighPriority;
    }

    public int peekCurrentDataVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8262afca", new Object[]{this})).intValue();
        }
        return this.currentDataVersion;
    }

    public JSONObject peekMediaContentDetailData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3856fed2", new Object[]{this});
        }
        return this.mediaContentDetailData;
    }

    public JSONObject peekMediaContentDetailJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e04b510", new Object[]{this});
        }
        return this.mediaContentDetailJson;
    }

    public void setCurrentDataVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6cfb25", new Object[]{this, new Integer(i)});
        } else {
            this.currentDataVersion = i;
        }
    }

    public void setMediaContentDetailData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f462c217", new Object[]{this, jSONObject});
        } else {
            this.mediaContentDetailData = jSONObject;
        }
    }

    public void setMediaContentDetailJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646bd399", new Object[]{this, jSONObject});
        } else {
            this.mediaContentDetailJson = jSONObject;
        }
    }

    public void setPlayerCacheHighPriority(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b88bbe8", new Object[]{this, new Boolean(z)});
        } else {
            this.playerCacheHighPriority = z;
        }
    }

    public void setPlayerCacheKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7024d11", new Object[]{this, str});
        } else {
            this.playerCacheKey = str;
        }
    }

    public void setSceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6b77c6", new Object[]{this, str});
        } else {
            this.sceneName = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DetailCacheData{contentId='" + this.contentId + "', cacheSceneName='" + this.sceneName + "', isValid='" + this.isValid + "', hasVideoCached='" + this.hasVideoCached + "', hasVideoDownloadTime='" + this.hasVideoDownloadTime + "', timeStamp=" + this.timeStamp + ", videoResourceStr='" + varValueExist(this.videoResourceStr) + "', detailResponseData=" + varValueExist(this.detailResponseData) + ", mixCacheType='" + this.mixCacheType + "', enableVerticalLayout='" + this.enableVerticalLayout + "', cacheVersion='" + this.version + "', firstFrameUrl='" + varValueExist(this.firstFrameUrl) + "'}";
    }

    public int dataState() {
        boolean z = false;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17fec801", new Object[]{this})).intValue();
        }
        if (TextUtils.equals("1", getVersion())) {
            if (!TextUtils.equals(getMixCacheType(), "1")) {
                i = 2;
            } else {
                z = true;
                i = -1;
            }
        }
        boolean equals = TextUtils.equals(getSceneName(), IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED);
        if (!z || equals || !isExpired()) {
            return i;
        }
        return 3;
    }

    public DetailCacheData(a aVar) {
        this.lastCheckVideoCacheTime = 0L;
        this.hasVideoDownloadTime = 0L;
        this.hasVideoDownloadSize = 0;
        this.hasDownLoadError = false;
        this.playerCacheHighPriority = false;
        this.mediaContentLoaded = false;
        this.timeStamp = a.a(aVar);
        if (!TextUtils.equals(this.videoResourceStr, a.b(aVar))) {
            this.videoResourceJsonObject = null;
            this.videoResourceStr = a.b(aVar);
        }
        this.detailResponseData = a.e(aVar);
        this.contentId = a.f(aVar);
        this.mixCacheType = a.g(aVar);
        this.enableVerticalLayout = a.h(aVar);
        this.version = a.i(aVar);
        this.firstFrameUrl = a.j(aVar);
        this.mediaSetData = a.k(aVar);
        this.currentDataVersion = a.l(aVar);
        this.mediaContentDetailData = a.c(aVar);
        this.mediaContentDetailJson = a.d(aVar);
        this.mediaContentLoaded = true;
    }
}
