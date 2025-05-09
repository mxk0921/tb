package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bia;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum GLRenderType {
    GOODS_LIST("taolivegoodsGL", "normal2", "lists"),
    BIG_CARD("taolivegoodsBigCard", "normal2", bia.UNDER_TAKE_BIG_CARD),
    KANDIAN_BIG_CARD("taolivegoodsBigCard", "normal2", "kandianBigCard"),
    SMALL_CARD("taolivegoodsSmallCard", "GoodsSmallCard", "card");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String cpsCode;
    public final String pageCode;
    public final String renderNode;

    GLRenderType(String str, String str2, String str3) {
        this.pageCode = str;
        this.renderNode = str2;
        this.cpsCode = str3;
    }

    public static /* synthetic */ Object ipc$super(GLRenderType gLRenderType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/constans/GLRenderType");
    }

    public static GLRenderType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GLRenderType) ipChange.ipc$dispatch("8e52542a", new Object[]{str});
        }
        return (GLRenderType) Enum.valueOf(GLRenderType.class, str);
    }
}
