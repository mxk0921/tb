package tb;

import android.os.Message;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bwl extends fv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOWCASE_SOURCE_PCG = "pcgCarousel";
    public List<ItemlistV2ResponseData.ItemListv1> h;
    public int i = 0;
    public int j = 5;
    public int k = 10;
    public int l = 10;
    public int m = 5;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            bwl.this.f19548a.setVisibility(8);
            bwl bwlVar = bwl.this;
            bwlVar.e.sendEmptyMessageDelayed(3, bwl.f(bwlVar) * 1000);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(295699077);
    }

    public bwl(FrameLayout frameLayout, VideoInfo videoInfo, xea xeaVar) {
        super(frameLayout, videoInfo, xeaVar);
    }

    public static /* synthetic */ int f(bwl bwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c284407", new Object[]{bwlVar})).intValue();
        }
        return bwlVar.l;
    }

    public static /* synthetic */ Object ipc$super(bwl bwlVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/PcgGoodPlayer");
    }

    @Override // tb.fv1
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.b();
        this.g = true;
        this.h = null;
        this.i = 0;
    }

    public void g() {
        VideoInfo.AdmireInfo admireInfo;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        xea xeaVar = this.f;
        if (xeaVar == null) {
            hha.b("PcgGoodPlayer", "init ｜ context is null.");
            return;
        }
        VideoInfo videoInfo = this.b;
        if (!(videoInfo == null || (admireInfo = videoInfo.admireInfo) == null || !admireInfo.contributionEnabled)) {
            z = true;
        }
        if (!xeaVar.c() || !this.f.l.i || z) {
            hha.b("PcgGoodPlayer", "init ｜ enablePcg=" + this.f.c() + " enablePcgRecCarouselShow=" + this.f.l.i);
            return;
        }
        h();
        this.e.sendEmptyMessageDelayed(1, this.j * 1000);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        String str = this.f.l.j;
        if (TextUtils.isEmpty(str)) {
            hha.b("PcgGoodPlayer", "initConfig ｜ config is null.");
            return;
        }
        hha.c("PcgGoodPlayer", "initConfig ｜ config=" + str);
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject != null) {
            this.j = urf.d(parseObject, "showDelay", this.j);
            this.k = urf.d(parseObject, StEvent.SHOW_TIME, this.k);
            this.l = urf.d(parseObject, "showEnd", this.l);
            this.m = urf.d(parseObject, "itemNum", this.m);
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        ux9 ux9Var;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message != null) {
            int i = message.what;
            if (1 == i) {
                xea xeaVar = this.f;
                if (xeaVar != null && xeaVar.j() != null) {
                    this.h = this.f.j().F();
                    StringBuilder sb = new StringBuilder("MSG_START_SHOW_PCG | mPcgGoods | isEmpty=");
                    List<ItemlistV2ResponseData.ItemListv1> list = this.h;
                    if (list != null && !list.isEmpty()) {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(" mCanShowCard=");
                    sb.append(this.g);
                    hha.c("PcgGoodPlayer", sb.toString());
                    j();
                }
            } else if (2 == i) {
                xea xeaVar2 = this.f;
                if (xeaVar2 != null) {
                    ux9Var = xeaVar2.q();
                } else {
                    ux9Var = null;
                }
                awp.d(this.f19548a, ux9Var, new a());
            } else if (3 == i) {
                j();
            }
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64f31e2", new Object[]{this, new Boolean(z)});
            return;
        }
        hha.c("PcgGoodPlayer", "canShowPcg | canShowCard=" + z);
        if (!z) {
            this.g = false;
            this.f19548a.setVisibility(8);
        }
    }

    public final boolean j() {
        List<ItemlistV2ResponseData.ItemListv1> list;
        int i;
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea8d81a2", new Object[]{this})).booleanValue();
        }
        if (this.g && (list = this.h) != null && !list.isEmpty()) {
            if (this.i >= this.h.size() || (i = this.i) >= this.m) {
                hha.c("PcgGoodPlayer", "showPcg | mCurrentPlayIndex=" + this.i + " size=" + this.h.size() + "   mItemNum=" + this.m);
            } else {
                ItemlistV2ResponseData.ItemListv1 itemListv1 = this.h.get(i);
                this.i++;
                if (itemListv1 == null || (liveItem = itemListv1.liveItemDO) == null) {
                    return j();
                }
                if (!fv1.e(this.b, liveItem, this.f)) {
                    return j();
                }
                LiveItem.Ext ext = itemListv1.liveItemDO.extendVal;
                if (ext != null && Boolean.parseBoolean(ext.closePopItem)) {
                    hha.c("PcgGoodPlayer", "showProducts | item is filter, itemId=" + itemListv1.liveItemDO.goodsIndex);
                    return false;
                } else if (!qfa.f(itemListv1.liveItemDO) || pfa.x(itemListv1.liveItemDO)) {
                    jq6.n(itemListv1.liveItemDO);
                    this.d.k(this.f, itemListv1.liveItemDO, this.b, "");
                    jq6.c(itemListv1.liveItemDO, pfa.m());
                    hha.c("PcgGoodPlayer", "showPcg | itemId=" + itemListv1.liveItemDO.itemId + " name=" + itemListv1.liveItemDO.itemName + " goodIndex=" + itemListv1.liveItemDO.goodsIndex);
                    this.f19548a.setVisibility(0);
                    this.c.b(this.f19548a, itemListv1.liveItemDO);
                    xea xeaVar = this.f;
                    awp.e(this.f19548a, xeaVar != null ? xeaVar.q() : null, null);
                    this.e.sendEmptyMessageDelayed(2, this.k * 1000);
                    HashMap hashMap = new HashMap();
                    hashMap.put("goodOpenFrom", SHOWCASE_SOURCE_PCG);
                    dvp.d(this.f, itemListv1.liveItemDO, this.b, GLRenderType.SMALL_CARD, hashMap);
                    return true;
                } else {
                    hha.c("PcgGoodPlayer", "showPcg | isRec and gift is empty. itemId=" + itemListv1.liveItemDO.itemId + " name=" + itemListv1.liveItemDO.itemName);
                    return j();
                }
            }
        }
        return false;
    }
}
