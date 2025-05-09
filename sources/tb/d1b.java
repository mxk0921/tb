package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.FeedListResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d1b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TUrlImageView f17500a;
    public final RecyclerView b;

    static {
        t2o.a(310378688);
    }

    public d1b(View view, RecyclerView recyclerView) {
        this.b = recyclerView;
        if (view != null) {
            this.f17500a = (TUrlImageView) view.findViewById(R.id.live_home_main_top_background);
        }
    }

    public void a(BaseOutDo baseOutDo) {
        HashMap<String, JSONObject> hashMap;
        JSONArray jSONArray;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        ViewGroup viewGroup;
        String[] split;
        int i = 0;
        String str = "data";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f093b30", new Object[]{this, baseOutDo});
            return;
        }
        List<IMTOPDataObject> list = baseOutDo instanceof FeedListResponse ? ((FeedListResponse) baseOutDo).getData().dataList : null;
        if (this.b != null && list != null && list.size() > 0) {
            TLog.loge("TaoLiveHomepage", "delayWriteImageCache start");
            try {
                JSONArray jSONArray2 = new JSONArray();
                int min = Math.min(6, list.size());
                int i2 = 0;
                while (i2 < min) {
                    DinamicDataObject dinamicDataObject = (DinamicDataObject) list.get(i2);
                    if (!(dinamicDataObject == null || (hashMap = dinamicDataObject.data) == null || hashMap.get(str) == null || (jSONArray = dinamicDataObject.data.get(str).getJSONArray("cardData")) == null || jSONArray.size() == 0 || (findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(i2)) == null || (viewGroup = (ViewGroup) findViewHolderForAdapterPosition.itemView) == null || !(viewGroup.getChildAt(i) instanceof ViewGroup))) {
                        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
                        if (viewGroup2.getChildAt(i) instanceof DXRootView) {
                            DXRootView dXRootView = (DXRootView) viewGroup2.getChildAt(i);
                            DXWidgetNode dXWidgetNode = null;
                            for (String str2 : nvs.q0().split(",")) {
                                if (!lrq.a(str2)) {
                                    list = list;
                                    if (viewGroup.getChildAt(0) != null) {
                                        dXWidgetNode = dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId(str2);
                                    }
                                    if (dXWidgetNode == null || dXWidgetNode.getVisibility() != 0) {
                                        dXWidgetNode = dXWidgetNode;
                                        str = str;
                                    } else {
                                        int width = dXWidgetNode.getWidth();
                                        int height = dXWidgetNode.getHeight();
                                        String str3 = "";
                                        str = str;
                                        if (dXWidgetNode instanceof DXImageWidgetNode) {
                                            str3 = ((DXImageWidgetNode) dXWidgetNode).getImageUrl();
                                        } else if (dXWidgetNode instanceof he6) {
                                            str3 = ((he6) dXWidgetNode).u();
                                        } else if (dXWidgetNode instanceof fe6) {
                                            str3 = ((fe6) dXWidgetNode).v();
                                        }
                                        if (width <= 0 || height <= 0 || lrq.a(str3)) {
                                            dXWidgetNode = dXWidgetNode;
                                        } else {
                                            dXWidgetNode = dXWidgetNode;
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("imageUrl", (Object) str3);
                                            jSONObject.put("width", (Object) Integer.valueOf(width));
                                            jSONObject.put("height", (Object) Integer.valueOf(height));
                                            jSONArray2.add(jSONObject);
                                        }
                                    }
                                } else {
                                    list = list;
                                    str = str;
                                }
                            }
                        }
                    }
                    i2++;
                    i = 0;
                }
                TUrlImageView tUrlImageView = this.f17500a;
                if (tUrlImageView != null && !lrq.a(tUrlImageView.getImageUrl()) && this.f17500a.getVisibility() == 0) {
                    int width2 = this.f17500a.getWidth();
                    int height2 = this.f17500a.getHeight();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("imageUrl", (Object) this.f17500a.getImageUrl());
                    jSONObject2.put("width", (Object) Integer.valueOf(width2));
                    jSONObject2.put("height", (Object) Integer.valueOf(height2));
                    jSONArray2.add(jSONObject2);
                }
                nwg.e(Globals.getApplication(), "jingxuanFirstPageImageSp", JSON.toJSONString(jSONArray2));
                TLog.loge("HomeMainImageCacheCtrl", "delayWriteImageCache success");
            } catch (Exception unused) {
                TLog.loge("HomeMainImageCacheCtrl", "delayWriteImageCache error");
            }
        }
    }
}
