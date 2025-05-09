package com.taobao.android.litecreator.base.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.litecreator.sdk.editor.data.MusicInfo;
import com.taobao.taopai.material.bean.MaterialDetail;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class QuickPublishModel implements Serializable {
    public JSONObject extendInfo;
    public PreviewElements previewElements;
    public JSONObject publishConfig;
    public PublishData publishData;
    public RenderData renderData;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class OrderItem implements Serializable {
        public String picUrl;
        public String price;
        public String title;

        static {
            t2o.a(511705115);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class PreviewElements implements Serializable {
        public JSONObject editMedia;
        public boolean goodsListVisible = false;
        public int layoutType = 0;
        public JSONArray recommendMedias;
        public JSONArray recommendTemplates;
        public JSONArray recommendTitles;

        static {
            t2o.a(511705116);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class PublishData implements Serializable {
        public List<OrderItem> orderItems;
        public String templateId;
        public TextTpl textTpl;
        public JSONObject topic;

        static {
            t2o.a(511705117);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class RenderData implements Serializable {
        public JSONArray bindMedias;
        public JSONObject bindTexts;
        public int minMediasCount;
        public MusicInfo musicInfo;
        public MaterialDetail templateDetail;

        static {
            t2o.a(511705118);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TextTpl implements Serializable {
        public String literalText;
        public String rawText;
        public JSONArray textMetas;

        static {
            t2o.a(511705119);
        }
    }

    static {
        t2o.a(511705114);
    }
}
