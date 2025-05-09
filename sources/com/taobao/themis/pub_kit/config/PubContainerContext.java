package com.taobao.themis.pub_kit.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.PubCloseButtonGuide;
import com.taobao.themis.pub_kit.guide.PubIconChangeGuide;
import com.taobao.themis.pub_kit.guide.PubRevisitBackGuide;
import java.io.Serializable;
import kotlin.Metadata;
import tb.h3n;
import tb.o3n;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\b\"\u0004\bG\u0010\nR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0006\u001a\u0004\bO\u0010\b\"\u0004\bP\u0010\n¨\u0006Q"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubContainerContext;", "Ljava/io/Serializable;", "<init>", "()V", "", "hasAddToIcon", "Z", "getHasAddToIcon", "()Z", "setHasAddToIcon", "(Z)V", "hasClickAddIconButton", "getHasClickAddIconButton", "setHasClickAddIconButton", "addIconGuideIsShowing", "getAddIconGuideIsShowing", "setAddIconGuideIsShowing", "addIconTipsDisplayInApp", "getAddIconTipsDisplayInApp", "setAddIconTipsDisplayInApp", "", "userEnterTime", "J", "getUserEnterTime", "()J", "setUserEnterTime", "(J)V", "Ltb/h3n;", "pubOperateGuide", "Ltb/h3n;", "getPubOperateGuide", "()Ltb/h3n;", "setPubOperateGuide", "(Ltb/h3n;)V", "Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;", "pubAddIconGuide", "Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;", "getPubAddIconGuide", "()Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;", "setPubAddIconGuide", "(Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;)V", "Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;", "pubCloseButtonGuide", "Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;", "getPubCloseButtonGuide", "()Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;", "setPubCloseButtonGuide", "(Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;)V", "Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;", "pubRevisitBackGuide", "Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;", "getPubRevisitBackGuide", "()Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;", "setPubRevisitBackGuide", "(Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;)V", "Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;", "pubIconChangeGuide", "Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;", "getPubIconChangeGuide", "()Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;", "setPubIconChangeGuide", "(Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;)V", "Ltb/o3n;", "pubRevisitBackGuideV2", "Ltb/o3n;", "getPubRevisitBackGuideV2", "()Ltb/o3n;", "setPubRevisitBackGuideV2", "(Ltb/o3n;)V", "revisitBackGuideIsShowing", "getRevisitBackGuideIsShowing", "setRevisitBackGuideIsShowing", "", "userClickedCount", TLogTracker.LEVEL_INFO, "getUserClickedCount", "()I", "setUserClickedCount", "(I)V", "isRecommendGuideShowing", "setRecommendGuideShowing", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubContainerContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean addIconGuideIsShowing;
    private volatile boolean addIconTipsDisplayInApp;
    private boolean hasAddToIcon;
    private boolean hasClickAddIconButton;
    private boolean isRecommendGuideShowing;
    private PubAddIconGuide pubAddIconGuide;
    private PubCloseButtonGuide pubCloseButtonGuide;
    private PubIconChangeGuide pubIconChangeGuide;
    private h3n pubOperateGuide;
    private PubRevisitBackGuide pubRevisitBackGuide;
    private o3n pubRevisitBackGuideV2;
    private boolean revisitBackGuideIsShowing;
    private int userClickedCount;
    private long userEnterTime = System.currentTimeMillis();

    static {
        t2o.a(845152260);
    }

    public final boolean getAddIconGuideIsShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dfe344e", new Object[]{this})).booleanValue();
        }
        return this.addIconGuideIsShowing;
    }

    public final boolean getAddIconTipsDisplayInApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("519b4ca1", new Object[]{this})).booleanValue();
        }
        return this.addIconTipsDisplayInApp;
    }

    public final boolean getHasAddToIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d16ff29c", new Object[]{this})).booleanValue();
        }
        return this.hasAddToIcon;
    }

    public final boolean getHasClickAddIconButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1ef36f3", new Object[]{this})).booleanValue();
        }
        return this.hasClickAddIconButton;
    }

    public final PubAddIconGuide getPubAddIconGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubAddIconGuide) ipChange.ipc$dispatch("e3992326", new Object[]{this});
        }
        return this.pubAddIconGuide;
    }

    public final PubCloseButtonGuide getPubCloseButtonGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubCloseButtonGuide) ipChange.ipc$dispatch("ba64a726", new Object[]{this});
        }
        return this.pubCloseButtonGuide;
    }

    public final PubIconChangeGuide getPubIconChangeGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubIconChangeGuide) ipChange.ipc$dispatch("2140ffb8", new Object[]{this});
        }
        return this.pubIconChangeGuide;
    }

    public final h3n getPubOperateGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3n) ipChange.ipc$dispatch("1ad122e6", new Object[]{this});
        }
        return this.pubOperateGuide;
    }

    public final PubRevisitBackGuide getPubRevisitBackGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubRevisitBackGuide) ipChange.ipc$dispatch("ccbbf786", new Object[]{this});
        }
        return this.pubRevisitBackGuide;
    }

    public final o3n getPubRevisitBackGuideV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o3n) ipChange.ipc$dispatch("4d0cb046", new Object[]{this});
        }
        return this.pubRevisitBackGuideV2;
    }

    public final boolean getRevisitBackGuideIsShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("409e8b53", new Object[]{this})).booleanValue();
        }
        return this.revisitBackGuideIsShowing;
    }

    public final int getUserClickedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fd7803", new Object[]{this})).intValue();
        }
        return this.userClickedCount;
    }

    public final long getUserEnterTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c6248ff", new Object[]{this})).longValue();
        }
        return this.userEnterTime;
    }

    public final boolean isRecommendGuideShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e9c8406", new Object[]{this})).booleanValue();
        }
        return this.isRecommendGuideShowing;
    }

    public final void setAddIconGuideIsShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187bdd6", new Object[]{this, new Boolean(z)});
        } else {
            this.addIconGuideIsShowing = z;
        }
    }

    public final void setAddIconTipsDisplayInApp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb85ce3", new Object[]{this, new Boolean(z)});
        } else {
            this.addIconTipsDisplayInApp = z;
        }
    }

    public final void setHasAddToIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38251fb0", new Object[]{this, new Boolean(z)});
        } else {
            this.hasAddToIcon = z;
        }
    }

    public final void setHasClickAddIconButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb70fd1", new Object[]{this, new Boolean(z)});
        } else {
            this.hasClickAddIconButton = z;
        }
    }

    public final void setPubAddIconGuide(PubAddIconGuide pubAddIconGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6dc0e2", new Object[]{this, pubAddIconGuide});
        } else {
            this.pubAddIconGuide = pubAddIconGuide;
        }
    }

    public final void setPubCloseButtonGuide(PubCloseButtonGuide pubCloseButtonGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3200d982", new Object[]{this, pubCloseButtonGuide});
        } else {
            this.pubCloseButtonGuide = pubCloseButtonGuide;
        }
    }

    public final void setPubIconChangeGuide(PubIconChangeGuide pubIconChangeGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b385b4", new Object[]{this, pubIconChangeGuide});
        } else {
            this.pubIconChangeGuide = pubIconChangeGuide;
        }
    }

    public final void setPubOperateGuide(h3n h3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405f17f6", new Object[]{this, h3nVar});
        } else {
            this.pubOperateGuide = h3nVar;
        }
    }

    public final void setPubRevisitBackGuide(PubRevisitBackGuide pubRevisitBackGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3206f2c", new Object[]{this, pubRevisitBackGuide});
        } else {
            this.pubRevisitBackGuide = pubRevisitBackGuide;
        }
    }

    public final void setPubRevisitBackGuideV2(o3n o3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f26ff4", new Object[]{this, o3nVar});
        } else {
            this.pubRevisitBackGuideV2 = o3nVar;
        }
    }

    public final void setRecommendGuideShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e5484a", new Object[]{this, new Boolean(z)});
        } else {
            this.isRecommendGuideShowing = z;
        }
    }

    public final void setRevisitBackGuideIsShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9506171", new Object[]{this, new Boolean(z)});
        } else {
            this.revisitBackGuideIsShowing = z;
        }
    }

    public final void setUserClickedCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc4af67", new Object[]{this, new Integer(i)});
        } else {
            this.userClickedCount = i;
        }
    }

    public final void setUserEnterTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9712d125", new Object[]{this, new Long(j)});
        } else {
            this.userEnterTime = j;
        }
    }
}
