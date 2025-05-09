package tb;

import android.os.Message;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ufg extends fv1 implements jac, xgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b h;
    public final ux9 i;
    public final List<LiveItem> j = new ArrayList();
    public LiveItem k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.ufg$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1068a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1068a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (ufg.f(ufg.this) != null) {
                    ufg.f(ufg.this).a(ufg.g(ufg.this), true);
                }
                pfa.U(ufg.this.f, 0, -1, false);
                ufg.this.b();
            }
        }

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                ufg.this.e.post(new RunnableC1068a());
            }
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(List<LiveItem> list, boolean z);

        void b(LiveItem liveItem);
    }

    static {
        t2o.a(295699055);
        t2o.a(806356161);
        t2o.a(295699048);
        t2o.a(295699049);
    }

    public ufg(FrameLayout frameLayout, VideoInfo videoInfo, xea xeaVar) {
        super(frameLayout, videoInfo, xeaVar);
        this.i = xeaVar.q();
    }

    public static /* synthetic */ b f(ufg ufgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a0cae452", new Object[]{ufgVar});
        }
        return ufgVar.h;
    }

    public static /* synthetic */ List g(ufg ufgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3fcdea0a", new Object[]{ufgVar});
        }
        return ufgVar.j;
    }

    public static /* synthetic */ Object ipc$super(ufg ufgVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/LandingCardPlayer");
    }

    @Override // tb.jac
    public void C(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f16b64", new Object[]{this, new Long(j), new Integer(i)});
        }
    }

    @Override // tb.xgc
    public void a(LiveItem liveItem) {
        LiveItem liveItem2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a26de", new Object[]{this, liveItem});
        } else if (liveItem != null && (liveItem2 = this.k) != null && liveItem.itemId == liveItem2.itemId) {
            hha.b("SingleGoodPlayerH", "updateItem | update big card.");
            o(liveItem);
        }
    }

    @Override // tb.fv1
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.b();
        this.h = null;
        ((ArrayList) this.j).clear();
        this.f.j().V(this);
        this.f.j().U(this);
        this.c.a(this.f19548a);
        FrameLayout frameLayout = this.f19548a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.k = null;
    }

    @Override // tb.xgc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431c2ec8", new Object[]{this});
        } else if (this.k != null) {
            hha.b("SingleGoodPlayerH", "updateItem | followChange.");
            o(this.k);
        }
    }

    @Override // tb.fv1
    public GLRenderType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GLRenderType) ipChange.ipc$dispatch("2dd0aef6", new Object[]{this});
        }
        return GLRenderType.BIG_CARD;
    }

    public final void h(GoodMsgNew goodMsgNew) {
        List<LiveItem> list;
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cea28c", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew != null && goodMsgNew.liveItemDO != null && (list = this.j) != null && !((ArrayList) list).isEmpty() && (liveItem = (LiveItem) ((ArrayList) this.j).get(0)) != null && liveItem.itemId == goodMsgNew.liveItemDO.itemId) {
            ((ArrayList) this.j).clear();
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message != null && message.what == 1) {
            i();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99482615", new Object[]{this});
            return;
        }
        this.k = null;
        FrameLayout frameLayout = this.f19548a;
        if (frameLayout != null && frameLayout.getWidth() > 0 && this.f19548a.getHeight() > 0) {
            awp.d(this.f19548a, this.i, new a());
        }
    }

    public void j(List<LiveItem> list, hmc hmcVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09a0042", new Object[]{this, list, hmcVar, bVar});
            return;
        }
        this.h = bVar;
        ((ArrayList) this.j).clear();
        ((ArrayList) this.j).addAll(list);
        p(hmcVar);
        this.f.j().s(this);
        this.f.j().r(this);
    }

    @Override // tb.jac
    public void k(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314945a5", new Object[]{this, goodMsgNew});
        }
    }

    public final void l(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99af66", new Object[]{this, liveItem});
            return;
        }
        jq6.n(liveItem);
        this.d.k(this.f, liveItem, this.b, "");
        jq6.c(liveItem, pfa.m());
    }

    @Override // tb.jac
    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22e87a4", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.jac
    public void n(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5433eb18", new Object[]{this, goodMsgNew});
        } else {
            h(goodMsgNew);
        }
    }

    public final void p(hmc hmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c1a03a", new Object[]{this, hmcVar});
            return;
        }
        List<LiveItem> list = this.j;
        if (list != null && !((ArrayList) list).isEmpty() && this.f19548a != null) {
            LiveItem liveItem = (LiveItem) ((ArrayList) this.j).get(0);
            if (liveItem == null) {
                b bVar = this.h;
                if (bVar != null) {
                    bVar.a(this.j, false);
                    return;
                }
                return;
            }
            if (!pfa.M(liveItem)) {
                ((ArrayList) this.j).clear();
            }
            String l = Long.toString(liveItem.itemId);
            hha.c("SingleGoodPlayerH", "checkIsNeedShow | id=" + l + "    name=" + liveItem.itemName + "  index=" + liveItem.goodsIndex);
            o(liveItem);
            this.f19548a.getViewTreeObserver().addOnGlobalLayoutListener(new tfg(this));
            LiveItem.Ext ext = liveItem.extendVal;
            if (ext != null && !TextUtils.isEmpty(ext.msgUuid)) {
                hha.c("SingleGoodPlayerH", "checkIsNeedShow | msgId=" + liveItem.extendVal.msgUuid);
                hmcVar.c(liveItem.extendVal.msgUuid);
            }
            this.e.removeCallbacksAndMessages(null);
            this.e.sendEmptyMessageDelayed(1, 10000L);
        }
    }

    @Override // tb.jac
    public void q(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b183b31f", new Object[]{this, goodMsgNew});
        }
    }

    @Override // tb.jac
    public void s(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b857be9e", new Object[]{this, goodMsgNew, new Boolean(z)});
        } else if (goodMsgNew != null && goodMsgNew.liveItemDO != null) {
            ((ArrayList) this.j).clear();
            ((ArrayList) this.j).add(goodMsgNew.liveItemDO);
        }
    }

    @Override // tb.jac
    public void u(GoodMsgNew goodMsgNew, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b640d63", new Object[]{this, goodMsgNew, new Boolean(z)});
        }
    }

    @Override // tb.jac
    public void x(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b784d2cb", new Object[]{this, goodMsgNew});
        } else {
            h(goodMsgNew);
        }
    }

    @Override // tb.jac
    public void y(LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cbd22f1", new Object[]{this, liveItem, str, str2});
        } else {
            a(liveItem);
        }
    }

    public final void o(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf095278", new Object[]{this, liveItem});
            return;
        }
        l(liveItem);
        b bVar = this.h;
        if (bVar != null) {
            bVar.b(liveItem);
        }
        this.k = liveItem;
        this.f19548a.setVisibility(0);
        long currentTimeMillis = System.currentTimeMillis();
        this.c.b(this.f19548a, liveItem);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        hha.d("SingleGoodPlayerH", "render | time=" + currentTimeMillis2);
        dvp.d(this.f, liveItem, this.b, d(), null);
    }
}
