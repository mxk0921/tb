package com.taobao.live.liveroom.liveBizComponent.ktManager.helper;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.live.liveroom.liveBizComponent.ktManager.helper.TaoLiveKtGlobalTimer;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.i04;
import tb.j1t;
import tb.ju6;
import tb.t2o;
import tb.x3t;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/ktManager/helper/TaoLiveKtGlobalTimer;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimer;", "<init>", "()V", "Ltb/xhv;", "dispatchEvent", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "handler", "", "tag", "", Constants.Name.INTERVAL, "Ltb/j1t;", "registerEvent", "(Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;Ljava/lang/String;J)Ltb/j1t;", "", "filterIfNeeded", "(Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;Ljava/lang/String;)Ljava/util/List;", "startTimer", "destroy", "delayEvent", "(Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;Ljava/lang/String;J)V", "loopEvent", "unregisterEvent", "(Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;Ljava/lang/String;)V", "Ltb/x3t;", "timer", "Ltb/x3t;", "eventQueue", "Ljava/util/List;", "", "getEList", "()Ljava/util/List;", "eList", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtGlobalTimer implements ITaoLiveKtGlobalTimer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<j1t> eventQueue;
    private x3t timer;

    static {
        t2o.a(1010827289);
        t2o.a(1003487276);
    }

    private final void dispatchEvent() {
        List<j1t> eList;
        List<j1t> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d725ec7", new Object[]{this});
            return;
        }
        List<j1t> eList2 = getEList();
        if ((eList2 == null || !eList2.isEmpty()) && (eList = getEList()) != null) {
            for (j1t j1tVar : eList) {
                long a2 = ju6.a();
                if (a2 - j1tVar.a() >= j1tVar.d()) {
                    ITaoLiveKtGlobalTimerHandler b = j1tVar.b();
                    if (b != null) {
                        b.handleEvent(j1tVar.c());
                    }
                    j1tVar.f(a2);
                    if (!j1tVar.e() && (list = this.eventQueue) != null) {
                        list.remove(j1tVar);
                    }
                }
            }
        }
    }

    private final List<j1t> filterIfNeeded(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler, String str) {
        List<j1t> list;
        List<j1t> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bd65532a", new Object[]{this, iTaoLiveKtGlobalTimerHandler, str});
        }
        List<j1t> eList = getEList();
        if (eList != null && eList.isEmpty()) {
            return new ArrayList();
        }
        List<j1t> eList2 = getEList();
        if (eList2 != null) {
            for (j1t j1tVar : eList2) {
                if (j1tVar.b() == null && (list2 = this.eventQueue) != null) {
                    list2.remove(j1tVar);
                }
                if (ckf.b(j1tVar.c(), str) && ckf.b(j1tVar.b(), iTaoLiveKtGlobalTimerHandler) && (list = this.eventQueue) != null) {
                    list.remove(j1tVar);
                }
            }
        }
        List<j1t> eList3 = getEList();
        if (eList3 != null) {
            return i04.E0(eList3);
        }
        return null;
    }

    private final List<j1t> getEList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c6c34d3", new Object[]{this});
        }
        List<j1t> list = this.eventQueue;
        if (list != null) {
            return i04.B0(list);
        }
        return null;
    }

    private final j1t registerEvent(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j1t) ipChange.ipc$dispatch("1930dcb1", new Object[]{this, iTaoLiveKtGlobalTimerHandler, str, new Long(j)});
        }
        this.eventQueue = filterIfNeeded(iTaoLiveKtGlobalTimerHandler, str);
        j1t j1tVar = new j1t();
        j1tVar.g(iTaoLiveKtGlobalTimerHandler);
        j1tVar.h(str);
        j1tVar.i(j);
        j1tVar.f(ju6.a());
        List<j1t> list = this.eventQueue;
        if (list != null) {
            list.add(j1tVar);
        }
        return j1tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv startTimer$lambda$0(TaoLiveKtGlobalTimer taoLiveKtGlobalTimer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("be2db7c5", new Object[]{taoLiveKtGlobalTimer});
        }
        taoLiveKtGlobalTimer.dispatchEvent();
        return xhv.INSTANCE;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<j1t> list = this.eventQueue;
        if (list != null) {
            list.clear();
        }
        this.eventQueue = null;
        x3t x3tVar = this.timer;
        if (x3tVar != null) {
            x3tVar.a();
        }
        this.timer = null;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer
    public void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else if (this.timer == null) {
            this.eventQueue = new ArrayList();
            x3t x3tVar = new x3t();
            this.timer = x3tVar;
            x3t.c(x3tVar, "TaoLiveKtGlobalTimer", false, 500L, new d1a() { // from class: tb.h1t
                @Override // tb.d1a
                public final Object invoke() {
                    xhv startTimer$lambda$0;
                    startTimer$lambda$0 = TaoLiveKtGlobalTimer.startTimer$lambda$0(TaoLiveKtGlobalTimer.this);
                    return startTimer$lambda$0;
                }
            }, null, 18, null);
        }
    }

    public final void unregisterEvent(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf90a71", new Object[]{this, iTaoLiveKtGlobalTimerHandler, str});
            return;
        }
        ckf.g(str, "tag");
        this.eventQueue = filterIfNeeded(iTaoLiveKtGlobalTimerHandler, str);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer
    public void delayEvent(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8181fa7a", new Object[]{this, iTaoLiveKtGlobalTimerHandler, str, new Long(j)});
            return;
        }
        ckf.g(iTaoLiveKtGlobalTimerHandler, "handler");
        ckf.g(str, "tag");
        registerEvent(iTaoLiveKtGlobalTimerHandler, str, j).j(false);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer
    public void loopEvent(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5e9edb", new Object[]{this, iTaoLiveKtGlobalTimerHandler, str, new Long(j)});
            return;
        }
        ckf.g(iTaoLiveKtGlobalTimerHandler, "handler");
        ckf.g(str, "tag");
        registerEvent(iTaoLiveKtGlobalTimerHandler, str, j).j(true);
    }
}
