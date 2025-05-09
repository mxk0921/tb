package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBadgeModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentCriticalModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentType;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentDxModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtHotSaleItemModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtHotSaleModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rxs INSTANCE = new rxs();

    static {
        t2o.a(1010827308);
    }

    public static /* synthetic */ Map c(rxs rxsVar, czs czsVar, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("50b9b066", new Object[]{rxsVar, czsVar, map, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            map = null;
        }
        return rxsVar.b(czsVar, map);
    }

    public final TaoLiveKtCommentEntity a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("d086b8e5", new Object[]{this, map});
        }
        ckf.g(map, "data");
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = new TaoLiveKtCommentEntity();
        List<? extends Object> list = null;
        if (!(map instanceof Object)) {
            map = null;
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(map);
        KMPJsonObject jsonObject = kMPJsonObject.getJsonObject(Constants.KEY_USER_ID);
        taoLiveKtCommentEntity.setName(jsonObject != null ? jsonObject.getString("publisherNick") : null);
        taoLiveKtCommentEntity.setContent(kMPJsonObject.getString("content"));
        KMPJsonArray jsonArray = kMPJsonObject.getJsonArray(ChatMessage.KEY_MEDAL_LIST_DT);
        if (jsonArray != null) {
            list = jsonArray.toList();
        }
        taoLiveKtCommentEntity.setOriginBadgeInfos(list);
        return taoLiveKtCommentEntity;
    }

    public final TaoLiveKtCommentEntity d(TaoLiveKtCommentDxModel taoLiveKtCommentDxModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("4af80086", new Object[]{this, taoLiveKtCommentDxModel});
        }
        ckf.g(taoLiveKtCommentDxModel, "model");
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = new TaoLiveKtCommentEntity();
        taoLiveKtCommentEntity.setCommentType(TaoLiveKtCommentType.DXContent);
        taoLiveKtCommentEntity.setDxBizType(taoLiveKtCommentDxModel.getBizType());
        taoLiveKtCommentEntity.setDxData(taoLiveKtCommentDxModel.getData());
        taoLiveKtCommentEntity.setTemplateName(taoLiveKtCommentDxModel.getTemplateName());
        return taoLiveKtCommentEntity;
    }

    public final TaoLiveKtCommentEntity e(TaoLiveKtCommentModel taoLiveKtCommentModel, TaoLiveKtCommentCriticalModel taoLiveKtCommentCriticalModel) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("54584640", new Object[]{this, taoLiveKtCommentModel, taoLiveKtCommentCriticalModel});
        }
        ckf.g(taoLiveKtCommentModel, "model");
        ckf.g(taoLiveKtCommentCriticalModel, "criticalModel");
        TaoLiveKtCommentEntity h = h(taoLiveKtCommentModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("medalIcon", "https://img.alicdn.com/imgextra/i3/O1CN01sTzHo31qV3EoaZxSC_!!6000000005500-2-tps-160-60.png");
        linkedHashMap.put("medalIcon2", "https://gw.alicdn.com/imgextra/i2/O1CN01pmxACT1sQam7k3XxX_!!6000000005761-2-tps-152-60.png");
        h.setOriginBadgeInfos(xz3.e(linkedHashMap));
        l1t l1tVar = l1t.INSTANCE;
        List<Object> originBadgeInfos = h.getOriginBadgeInfos();
        ArrayList arrayList = null;
        if (originBadgeInfos != null) {
            try {
                arrayList = new ArrayList();
                try {
                    for (Object obj : originBadgeInfos) {
                        if (obj == null) {
                            obj = null;
                        }
                        Serializable decodeFromJsonObject = KMPJSONUtils_androidKt.decodeFromJsonObject(a.Companion, new KMPJsonObject(obj), dun.b(TaoLiveKtCommentBadgeModel.class));
                        if (decodeFromJsonObject != null) {
                            arrayList.add(decodeFromJsonObject);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    pus.INSTANCE.f(String.valueOf(((ns3) dun.b(l1tVar.getClass())).getSimpleName()), "", "listModelFromList === " + e.getMessage() + ", data === " + originBadgeInfos);
                    h.setBadgeInfos(arrayList);
                    taoLiveKtCommentCriticalModel.addCount();
                    h.setCriticalModel(taoLiveKtCommentCriticalModel);
                    return h;
                }
            } catch (Exception e3) {
                e = e3;
                arrayList = null;
            }
        }
        h.setBadgeInfos(arrayList);
        taoLiveKtCommentCriticalModel.addCount();
        h.setCriticalModel(taoLiveKtCommentCriticalModel);
        return h;
    }

    public final TaoLiveKtCommentEntity f(TaoLiveKtHotSaleItemModel taoLiveKtHotSaleItemModel, TaoLiveKtHotSaleModel taoLiveKtHotSaleModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("40f1af24", new Object[]{this, taoLiveKtHotSaleItemModel, taoLiveKtHotSaleModel});
        }
        ckf.g(taoLiveKtHotSaleItemModel, "hotSaleItemModel");
        ckf.g(taoLiveKtHotSaleModel, "resultModel");
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = new TaoLiveKtCommentEntity();
        taoLiveKtCommentEntity.setCommentType(TaoLiveKtCommentType.DXContent);
        taoLiveKtCommentEntity.setDxData(taoLiveKtHotSaleItemModel.getDataMessage());
        if (h2t.INSTANCE.r()) {
            str = taoLiveKtHotSaleItemModel.getTemplateName2();
        } else {
            str = taoLiveKtHotSaleItemModel.getTemplateName();
        }
        taoLiveKtCommentEntity.setTemplateName(str);
        taoLiveKtCommentEntity.setItemId(taoLiveKtHotSaleItemModel.getItemId());
        Long disappearTime = taoLiveKtHotSaleModel.getDisappearTime();
        taoLiveKtCommentEntity.setDisappearTime(disappearTime != null ? disappearTime.longValue() : 2000L);
        return taoLiveKtCommentEntity;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity g(com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResultModel r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rxs.g(com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResultModel):com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity");
    }

    public final TaoLiveKtCommentEntity h(TaoLiveKtCommentModel taoLiveKtCommentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("c50b7a87", new Object[]{this, taoLiveKtCommentModel});
        }
        ckf.g(taoLiveKtCommentModel, "model");
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = new TaoLiveKtCommentEntity();
        taoLiveKtCommentEntity.setSendTime(taoLiveKtCommentModel.getTimestamp());
        taoLiveKtCommentEntity.setRevTime(Long.valueOf(ju6.a()));
        taoLiveKtCommentEntity.setCommentId(taoLiveKtCommentModel.getCommentId());
        taoLiveKtCommentEntity.setName(taoLiveKtCommentModel.name());
        taoLiveKtCommentEntity.setContent(taoLiveKtCommentModel.getContent());
        taoLiveKtCommentEntity.setRenders(taoLiveKtCommentModel.getRenders());
        taoLiveKtCommentEntity.setOriginBadgeInfos(taoLiveKtCommentModel.originMedalList());
        taoLiveKtCommentEntity.setOriginBgStyle(taoLiveKtCommentModel.originBgStyle());
        taoLiveKtCommentEntity.setGuangGuangJumpUrl(taoLiveKtCommentModel.guangGuangJumpUrl());
        taoLiveKtCommentEntity.setFavorHighlightCommentStyle(taoLiveKtCommentModel.favorHighlightCommentStyle());
        return taoLiveKtCommentEntity;
    }

    public final TaoLiveKtCommentEntity j(Map<String, ? extends Object> map, String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("430599a2", new Object[]{this, map, str});
        }
        ckf.g(str, "dxTemplateName");
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = new TaoLiveKtCommentEntity();
        taoLiveKtCommentEntity.setCommentType(TaoLiveKtCommentType.TopWelcome);
        taoLiveKtCommentEntity.setTemplateName(str);
        taoLiveKtCommentEntity.setDxData(map);
        if (h2t.INSTANCE.l()) {
            j = 5000;
        } else {
            j = 8000;
        }
        taoLiveKtCommentEntity.setDisappearTime(j);
        return taoLiveKtCommentEntity;
    }

    public final TaoLiveKtCommentEntity[] i(czs czsVar) {
        List<Map<String, String>> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity[]) ipChange.ipc$dispatch("75958c35", new Object[]{this, czsVar});
        }
        ArrayList arrayList = new ArrayList();
        if (!(czsVar == null || (g = czsVar.g()) == null)) {
            Iterator<T> it = g.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                String str = (String) map.get("mockNick");
                String str2 = (String) map.get("content");
                if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
                    TaoLiveKtCommentEntity taoLiveKtCommentEntity = new TaoLiveKtCommentEntity();
                    taoLiveKtCommentEntity.setCommentType(TaoLiveKtCommentType.Notice);
                    taoLiveKtCommentEntity.setName(str);
                    taoLiveKtCommentEntity.setContent(str2);
                    arrayList.add(taoLiveKtCommentEntity);
                }
            }
        }
        return (TaoLiveKtCommentEntity[]) arrayList.toArray(new TaoLiveKtCommentEntity[0]);
    }

    public final TaoLiveKtCommentEntity k(czs czsVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("67829250", new Object[]{this, czsVar});
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = new TaoLiveKtCommentEntity();
        if (h2t.INSTANCE.r()) {
            str = "taobao_live_denoise_avatar_comment_mix";
        } else {
            str = "taobao_live_avatar_comment_mix";
        }
        taoLiveKtCommentEntity.setTemplateName(str);
        taoLiveKtCommentEntity.setCommentType(TaoLiveKtCommentType.TopWelcome);
        taoLiveKtCommentEntity.setDxData(c(this, czsVar, null, 2, null));
        taoLiveKtCommentEntity.setDisappearTime(5000L);
        return taoLiveKtCommentEntity;
    }

    public final Map<String, Object> b(czs czsVar, Map<String, ? extends Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String n;
        Boolean bool;
        KMPJsonObject c;
        KMPJsonObject c2;
        Map<String, Object> b;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("64e32829", new Object[]{this, czsVar, map});
        }
        KMPJsonObject kMPJsonObject = null;
        String valueOf = String.valueOf((czsVar == null || (b = czsVar.b()) == null) ? null : b.get("headImg"));
        String str6 = "";
        if (czsVar == null || (str = czsVar.o()) == null) {
            str = str6;
        }
        if (czsVar == null || (c2 = czsVar.c()) == null || (str2 = c2.getString("accountName")) == null) {
            str2 = str6;
        }
        if (czsVar == null || (str3 = czsVar.t()) == null) {
            str3 = str6;
        }
        if (czsVar == null || (str4 = czsVar.l()) == null) {
            str4 = str6;
        }
        if (str3.length() > 0 || str4.length() == 0) {
            str4 = "false";
        }
        KMPJsonArray jsonArray = (czsVar == null || (c = czsVar.c()) == null) ? null : c.getJsonArray("viconInfos");
        if (czsVar != null && czsVar.z()) {
            valueOf = czsVar.q().getString("officialHeadImg").toString();
            jsonArray = czsVar.q().getJsonArray("viconInfos");
            String string = czsVar.q().getString("location");
            str = string == null ? str6 : string;
            String string2 = czsVar.q().getString("accountName");
            str2 = string2 == null ? str6 : string2;
        }
        if (jsonArray != null && !tvr.c(jsonArray) && jsonArray.size() > 0) {
            kMPJsonObject = jsonArray.getJsonObject(0);
        }
        if (kMPJsonObject == null || (str5 = kMPJsonObject.getString("text")) == null) {
            str5 = str6;
        }
        if (!(kMPJsonObject == null || (bool = kMPJsonObject.getBoolean("isAccountTag")) == null)) {
            z = bool.booleanValue();
        }
        if (!(czsVar == null || (n = czsVar.n()) == null)) {
            str6 = n;
        }
        if (str6.length() == 0) {
            str6 = e3t.INSTANCE.s();
            if (str6.length() == 0) {
                str6 = "欢迎来到" + str2 + "直播间";
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("recReason", str3);
        linkedHashMap.put("avatarUrl", valueOf);
        linkedHashMap.put("vIconText", str5);
        linkedHashMap.put("location", str);
        linkedHashMap.put("avatarMixComment", str6);
        linkedHashMap.put("noFilter", str4);
        linkedHashMap.put("isAccountTag", Boolean.valueOf(z));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        return kotlin.collections.a.r(linkedHashMap);
    }
}
