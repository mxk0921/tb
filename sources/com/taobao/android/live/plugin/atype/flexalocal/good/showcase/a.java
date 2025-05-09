package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.LiveGoodDataCenter;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import tb.fkx;
import tb.hha;
import tb.t2o;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xea f8524a;

    static {
        t2o.a(295699079);
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe4697d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 10080) {
            return true;
        }
        return false;
    }

    public void b(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172dd0bb", new Object[]{this, xeaVar});
        } else {
            this.f8524a = xeaVar;
        }
    }

    public void c(String str, int i, LiveGoodDataCenter.m mVar) {
        GoodMsgNew goodMsgNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2ba4e", new Object[]{this, str, new Integer(i), mVar});
        } else if (!TextUtils.isEmpty(str) && mVar != null && i == 10080 && (goodMsgNew = (GoodMsgNew) fkx.f(str, GoodMsgNew.class)) != null && goodMsgNew.liveItemDO != null) {
            xea xeaVar = this.f8524a;
            if (xeaVar != null) {
                LiveGoodDataCenter.n.a(xeaVar.n.f(), goodMsgNew.liveItemDO, i);
            }
            hha.c("PreheatMsgParser", "onMessageReceived | messagePreheatAddRemove, itemId=" + goodMsgNew.liveItemDO.itemId);
            mVar.E(goodMsgNew);
        }
    }
}
