package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.QuickPublishModel;
import com.taobao.android.litecreator.sdk.editor.data.MusicInfo;
import com.taobao.taopai.material.bean.MaterialDetail;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c9n {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705121);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final QuickPublishModel a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList;
            JSONArray jSONArray;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            int i;
            JSONObject jSONObject5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QuickPublishModel) ipChange.ipc$dispatch("e9f13eef", new Object[]{this, jSONObject, jSONObject2});
            }
            QuickPublishModel quickPublishModel = new QuickPublishModel();
            if (jSONObject == null) {
                return quickPublishModel;
            }
            JSONObject jSONObject6 = jSONObject.getJSONObject("publish_data");
            JSONObject jSONObject7 = jSONObject.getJSONObject("recMaterialTool");
            JSONObject jSONObject8 = null;
            JSONObject jSONObject9 = jSONObject6 != null ? jSONObject6.getJSONObject("publishConfig") : null;
            quickPublishModel.publishConfig = jSONObject9;
            if (jSONObject9 == null) {
                quickPublishModel.publishConfig = jSONObject2;
            }
            QuickPublishModel.PublishData publishData = new QuickPublishModel.PublishData();
            publishData.templateId = jSONObject6 != null ? jSONObject6.getString("templateId") : null;
            publishData.textTpl = (jSONObject7 == null || (jSONObject5 = jSONObject7.getJSONObject("textTpl")) == null) ? null : (QuickPublishModel.TextTpl) jSONObject5.toJavaObject(QuickPublishModel.TextTpl.class);
            publishData.topic = jSONObject7 != null ? jSONObject7.getJSONObject("topic") : null;
            JSONArray jSONArray2 = jSONObject6 != null ? jSONObject6.getJSONArray("orderItems") : null;
            if (jSONArray2 != null) {
                arrayList = new ArrayList();
                int size = jSONArray2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    JSONObject jSONObject10 = jSONArray2.getJSONObject(i2);
                    QuickPublishModel.OrderItem orderItem = new QuickPublishModel.OrderItem();
                    orderItem.price = jSONObject10 != null ? jSONObject10.getString("price") : null;
                    orderItem.title = jSONObject10 != null ? jSONObject10.getString("title") : null;
                    orderItem.picUrl = jSONObject10 != null ? jSONObject10.getString("picUrl") : null;
                    arrayList.add(orderItem);
                }
            } else {
                arrayList = null;
            }
            publishData.orderItems = arrayList;
            xhv xhvVar = xhv.INSTANCE;
            quickPublishModel.publishData = publishData;
            quickPublishModel.extendInfo = jSONObject.getJSONObject(MspGlobalDefine.EXTENDINFO);
            QuickPublishModel.RenderData renderData = new QuickPublishModel.RenderData();
            JSONObject jSONObject11 = jSONObject6 != null ? jSONObject6.getJSONObject("feeds") : null;
            if (jSONObject11 != null) {
                renderData.bindMedias = jSONObject11.getJSONArray(tep.KEY_UNIFORM_RESULT);
                if (jSONObject11.containsKey("minReqNum")) {
                    i = jSONObject11.getIntValue("minReqNum");
                } else {
                    i = jSONObject11.size();
                }
                renderData.minMediasCount = i;
            }
            renderData.bindTexts = jSONObject6 != null ? jSONObject6.getJSONObject("materialToolMappings") : null;
            renderData.musicInfo = (jSONObject7 == null || (jSONObject4 = jSONObject7.getJSONObject("musicInfo")) == null) ? null : (MusicInfo) jSONObject4.toJavaObject(MusicInfo.class);
            renderData.templateDetail = (jSONObject7 == null || (jSONArray = jSONObject7.getJSONArray("materialTool")) == null || (jSONObject3 = jSONArray.getJSONObject(0)) == null) ? null : (MaterialDetail) jSONObject3.toJavaObject(MaterialDetail.class);
            quickPublishModel.renderData = renderData;
            QuickPublishModel.PreviewElements previewElements = new QuickPublishModel.PreviewElements();
            previewElements.recommendTitles = jSONObject7 != null ? jSONObject7.getJSONArray("recommendTitles") : null;
            previewElements.recommendMedias = jSONObject7 != null ? jSONObject7.getJSONArray("recommendBackgrounds") : null;
            if (jSONObject7 != null) {
                jSONObject8 = jSONObject7.getJSONObject("mediaActionBar");
            }
            previewElements.editMedia = jSONObject8;
            quickPublishModel.previewElements = previewElements;
            return quickPublishModel;
        }
    }

    static {
        t2o.a(511705120);
    }
}
