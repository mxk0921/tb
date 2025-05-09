package com.taobao.message.sp.chat.transformer;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.message.newmsgbody.NewVideoMsgBody;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.ItemState;
import com.taobao.message.lab.comfrm.inner2.IteratorTransformer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.sp.framework.model.SimpleMessage;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleVideoMessageVOTransform implements IteratorTransformer<ResultData<SimpleMessage>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(551551014);
        t2o.a(537919620);
    }

    public ItemState transform(Action action, SharedState sharedState, ResultData<SimpleMessage> resultData, ItemState itemState) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemState) ipChange.ipc$dispatch("e7333691", new Object[]{this, action, sharedState, resultData, itemState});
        }
        Map map = (Map) itemState.getData("messageViewData", Map.class, new HashMap());
        if (resultData.getMainData().getMsgType() == 105) {
            NewVideoMsgBody newVideoMsgBody = new NewVideoMsgBody(resultData.getMainData().getOriginalData(), resultData.getMainData().getLocalExt());
            map.put("videoUrl", newVideoMsgBody.getUrl());
            map.put("previewUrl", newVideoMsgBody.getPic());
            map.put("width", Integer.valueOf(newVideoMsgBody.getWidth()));
            map.put("height", Integer.valueOf(newVideoMsgBody.getHeight()));
            if (TextUtils.isEmpty(newVideoMsgBody.getUrl())) {
                map.put("videoUrl", newVideoMsgBody.getLocalVideoPath());
            }
            if (TextUtils.isEmpty(newVideoMsgBody.getPic())) {
                map.put("previewUrl", newVideoMsgBody.getLocalPicPath());
            }
            map.put("fileSize", Long.valueOf(newVideoMsgBody.getSize()));
            Map map2 = (Map) sharedState.getRuntimeData("sendProgressMap", Map.class, null);
            String clientId = resultData.getMainData().getCode().getClientId();
            if (map2 != null && map2.containsKey(clientId)) {
                map.put("uploadProgress", map2.get(clientId));
            }
            map.put("uploading", Boolean.valueOf(resultData.getMainData().getStatus() == 11));
            map.put("duration", Integer.valueOf(newVideoMsgBody.getDuration()));
            if (newVideoMsgBody.getGoodsInfo() == null || newVideoMsgBody.getGoodsInfo().size() <= 0) {
                z = false;
            }
            map.put("hasGoodsInfo", Boolean.valueOf(z));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("messageViewData", map);
        return itemState.updateData(hashMap);
    }
}
