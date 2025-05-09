package com.taobao.android.detail.ttdetail.data.meta;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.dt4;
import tb.t2o;
import tb.vbl;

/* compiled from: Taobao */
@MappingKey(key = "item")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Item extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String businessId;
    private final String categoryId;
    private long commentCount;
    private final JSONObject exParams;
    private final String groupId;
    private final String h5ItemUrl;
    private ArrayList<String> images;
    private String itemId;
    private final JSONObject moduleDescParams;
    private final String platformItemId;
    private final String rootCategoryId;
    private final String shareBizCode;
    private final String shareItemLink;
    private final String title;
    private final String wxShareUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dt4.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Item item) {
        }

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
    }

    static {
        t2o.a(912261671);
    }

    public Item(JSONObject jSONObject) {
        super(jSONObject);
        this.itemId = jSONObject.getString("itemId");
        this.title = jSONObject.getString("title");
        this.shareItemLink = jSONObject.getString("shareItemLink");
        this.wxShareUrl = jSONObject.getString("wxShareUrl");
        this.h5ItemUrl = jSONObject.getString("h5ItemUrl");
        this.platformItemId = jSONObject.getString("platformItemId");
        this.shareBizCode = jSONObject.getString("shareBizCode");
        this.categoryId = jSONObject.getString("categoryId");
        this.rootCategoryId = jSONObject.getString("rootCategoryId");
        this.images = initImages(jSONObject);
        try {
            this.commentCount = jSONObject.getLongValue("commentCount");
        } catch (Throwable unused) {
            this.commentCount = 0L;
        }
        this.groupId = jSONObject.getString("groupId");
        this.exParams = jSONObject.getJSONObject("exParams");
        this.moduleDescParams = jSONObject.getJSONObject("moduleDescParams");
        this.businessId = jSONObject.getString("businessId");
    }

    private ArrayList<String> initImages(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7a8f4dfb", new Object[]{this, jSONObject});
        }
        return dt4.a(jSONObject.getJSONArray("images"), new a(this));
    }

    public static /* synthetic */ Object ipc$super(Item item, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Item");
    }

    public String getBusinessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        return this.businessId;
    }

    public String getCategoryId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab8b4baa", new Object[]{this});
        }
        return this.categoryId;
    }

    public long getCommentCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3109e1", new Object[]{this})).longValue();
        }
        return this.commentCount;
    }

    public JSONObject getExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("512995b6", new Object[]{this});
        }
        return this.exParams;
    }

    public String getFirstImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2875328b", new Object[]{this});
        }
        ArrayList<String> arrayList = this.images;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return this.images.get(0);
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
        }
        return this.groupId;
    }

    public String getH5ItemUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a610780", new Object[]{this});
        }
        return this.h5ItemUrl;
    }

    public ArrayList<String> getImages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9e939a4f", new Object[]{this});
        }
        return this.images;
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        if (!vbl.b()) {
            return this.itemId;
        }
        if (TextUtils.isEmpty(this.platformItemId)) {
            return this.itemId;
        }
        return this.platformItemId;
    }

    public JSONObject getModuleDescParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("37fa11a0", new Object[]{this});
        }
        return this.moduleDescParams;
    }

    public String getPlatformItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84056082", new Object[]{this});
        }
        return this.platformItemId;
    }

    public String getRootCategoryId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67d3168", new Object[]{this});
        }
        return this.rootCategoryId;
    }

    public String getShareBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdf5b822", new Object[]{this});
        }
        return this.shareBizCode;
    }

    public String getShareItemLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("392e45c3", new Object[]{this});
        }
        return this.shareItemLink;
    }

    public String getSubItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dd0eac1", new Object[]{this});
        }
        return this.itemId;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public String getWxShareUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("797df252", new Object[]{this});
        }
        return this.wxShareUrl;
    }
}
