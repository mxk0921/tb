package com.taobao.umipublish.extension.preview;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreviewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MIX = 2;
    public static final int TYPE_VIDEO = 1;

    /* renamed from: a  reason: collision with root package name */
    public int f13989a;
    public int b;
    public boolean c;
    public Music e;
    public List<Media> d = new ArrayList();
    public String f = Localization.q(R.string.gg_pub_edit);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Media implements Serializable {
        public String coverUrl;
        public String draftId;
        public JSONObject originData;
        public String path;
        public String ratio;
        public ArrayList<Tag> tags = new ArrayList<>();
        public int type;

        static {
            t2o.a(944767032);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Music implements Serializable {
        public String name;
        public String path;

        static {
            t2o.a(944767033);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Tag implements Serializable {
        public String coverUrl;
        public String direction;
        public String itemId;
        public double posX;
        public double posY;
        public String tagName;

        static {
            t2o.a(944767034);
        }
    }

    static {
        t2o.a(944767031);
    }

    public static PreviewModel a(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("a245c351", new Object[]{str, new Integer(i), jSONArray, new Boolean(z)});
        }
        PreviewModel previewModel = new PreviewModel();
        previewModel.f13989a = i;
        previewModel.c = z;
        previewModel.b = 0;
        previewModel.d = d(jSONArray);
        return previewModel;
    }

    public static PreviewModel b(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("27158092", new Object[]{str, new Integer(i), jSONArray, new Boolean(z)});
        }
        PreviewModel previewModel = new PreviewModel();
        previewModel.b = 2;
        previewModel.f13989a = i;
        previewModel.c = z;
        previewModel.d = d(jSONArray);
        return previewModel;
    }

    public static PreviewModel c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("bd848150", new Object[]{str, str2});
        }
        PreviewModel previewModel = new PreviewModel();
        previewModel.d = new ArrayList();
        previewModel.b = 1;
        Media media = new Media();
        media.path = str;
        media.ratio = str2;
        previewModel.d.add(media);
        return previewModel;
    }

    public static List<Media> d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43297a7b", new Object[]{jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.size() > 0) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("path");
                    String string2 = jSONObject.getString("draftId");
                    String string3 = jSONObject.getString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
                    int intValue = jSONObject.getIntValue("type");
                    String string4 = jSONObject.getString("ratio");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("tags");
                    Media media = new Media();
                    media.originData = jSONObject;
                    media.path = string;
                    media.coverUrl = string3;
                    media.draftId = string2;
                    media.type = intValue;
                    media.ratio = string4;
                    if (jSONArray2 != null) {
                        media.tags = new ArrayList<>();
                        int size2 = jSONArray2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            media.tags.add((Tag) JSON.toJavaObject(jSONArray2.getJSONObject(i2), Tag.class));
                        }
                    }
                    arrayList.add(media);
                }
            }
        }
        return arrayList;
    }
}
