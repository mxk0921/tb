package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.AlgoGoodsCardConfigData;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t1k implements isd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28417a;
    public gwp b;
    public AlgoGoodsCardConfigData c;
    public final Queue<gwp> d = new LinkedList();
    public final long e;

    static {
        t2o.a(295699076);
        t2o.a(295699053);
    }

    public t1k(List<LiveItem> list, List<LiveItem> list2, VideoInfo videoInfo, long j, boolean z) {
        this.f28417a = z;
        this.e = j;
        g(list, list2, videoInfo);
    }

    @Override // tb.isd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a13601", new Object[]{this});
            return;
        }
        ((LinkedList) this.d).clear();
        f();
    }

    @Override // tb.isd
    public AlgoGoodsCardConfigData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgoGoodsCardConfigData) ipChange.ipc$dispatch("4d49c5c", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.isd
    public gwp c() {
        long j;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwp) ipChange.ipc$dispatch("a7f6f1b5", new Object[]{this});
        }
        if (!this.f28417a) {
            return null;
        }
        gwp gwpVar = this.b;
        if (gwpVar != null) {
            LiveItem liveItem = gwpVar.c;
            if (liveItem == null || liveItem.extendVal == null) {
                j = -1;
            } else {
                j = pfa.r(liveItem);
            }
            if (j > 0 && pfa.m() - j > this.e * 1000) {
                StringBuilder sb = new StringBuilder("getCacheItem | out time. index=");
                LiveItem liveItem2 = this.b.c;
                if (liveItem2 != null) {
                    obj = Integer.valueOf(liveItem2.goodsIndex);
                } else {
                    obj = "0";
                }
                sb.append(obj);
                hha.b("NewStashItemHolder", sb.toString());
                this.b = null;
            }
        }
        if (this.b != null || ((LinkedList) this.d).size() <= 0) {
            return this.b;
        }
        gwp gwpVar2 = (gwp) ((LinkedList) this.d).poll();
        if (gwpVar2 == null) {
            return null;
        }
        if (pfa.y(gwpVar2.c) && pfa.w(gwpVar2.c)) {
            return null;
        }
        if (pfa.M(gwpVar2.c)) {
            this.b = gwpVar2;
        }
        return gwpVar2;
    }

    @Override // tb.isd
    public void d(LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7061949", new Object[]{this, liveItem, new Boolean(z)});
        } else if (pfa.M(liveItem)) {
            this.b = new gwp(liveItem);
        }
    }

    @Override // tb.isd
    public void e(LiveItem liveItem) {
        gwp gwpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c4633d", new Object[]{this, liveItem});
        } else if (liveItem != null && (gwpVar = this.b) != null && gwpVar.f20272a == liveItem.itemId) {
            this.b = null;
        }
    }

    @Override // tb.isd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6500b479", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public final void g(List<LiveItem> list, List<LiveItem> list2, VideoInfo videoInfo) {
        JSONObject jSONObject;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9162834", new Object[]{this, list, list2, videoInfo});
        } else if (list != null && !list.isEmpty()) {
            ((LinkedList) this.d).clear();
            if (list2 != null && !list2.isEmpty() && pfa.y(list2.get(0))) {
                h(list2.get(0), 1);
                i = 1;
            }
            for (LiveItem liveItem : list) {
                gwp gwpVar = new gwp(liveItem);
                if (pfa.y(gwpVar.a())) {
                    i++;
                    h(gwpVar.a(), i);
                }
                ((LinkedList) this.d).add(gwpVar);
            }
            if (videoInfo != null && (jSONObject = videoInfo.itemConfigInfo) != null) {
                String string = jSONObject.getString("itemAlgoRecommendCardParam");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        AlgoGoodsCardConfigData algoGoodsCardConfigData = (AlgoGoodsCardConfigData) JSON.parseObject(string, AlgoGoodsCardConfigData.class);
                        this.c = algoGoodsCardConfigData;
                        pfa.W(algoGoodsCardConfigData.notClickTimeMaxLimit);
                    } catch (Exception e) {
                        hha.b("StashItemHolder", e.getMessage());
                    }
                }
            }
        }
    }

    public final void h(LiveItem liveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671aa977", new Object[]{this, liveItem, new Integer(i)});
            return;
        }
        JSONObject jSONObject = liveItem.nativeConfigInfos;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("algoItemIndex", (Object) Integer.valueOf(i));
        liveItem.nativeConfigInfos = jSONObject;
    }
}
