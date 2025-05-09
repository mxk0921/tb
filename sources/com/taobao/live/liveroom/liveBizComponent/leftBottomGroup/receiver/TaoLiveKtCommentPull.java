package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentFetchModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver.TaoLiveKtCommentPull;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.czs;
import tb.d1a;
import tb.exs;
import tb.g1a;
import tb.ic1;
import tb.l1t;
import tb.pys;
import tb.rxs;
import tb.t2o;
import tb.u1a;
import tb.vqx;
import tb.xhv;
import tb.xys;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0004Rj\u0010\u001a\u001aJ\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012j\u0004\u0018\u0001`\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010%\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020.0-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentPull;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "<init>", "()V", "Ltb/xhv;", "delayCommentPullIntervalEvent", "mapFetchedComments", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentModel;", "model", "", "filteredComment", "(Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentModel;)Z", "", "tag", "handleEvent", "(Ljava/lang/String;)V", "pullMTopComments", "Lkotlin/Function2;", "", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "Lkotlin/ParameterName;", "name", "comments", "bottoms", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentFetchCallback;", "callback", "Ltb/u1a;", "getCallback", "()Ltb/u1a;", "setCallback", "(Ltb/u1a;)V", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentFetchModel;", "lastResult", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentFetchModel;", "lastIds", "[Ljava/lang/String;", "paused", "Z", "getPaused", "()Z", "setPaused", "(Z)V", "commentPullIntervalTag", "Ljava/lang/String;", "", "", vqx.HUMMER_FOUNDATION_GET_INTPUT_PARAMS, "()Ljava/util/Map;", "inputParams", "Companion", "a", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentPull extends TaoLiveKtComponent implements ITaoLiveKtGlobalTimerHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private u1a<? super TaoLiveKtCommentEntity[], ? super TaoLiveKtCommentEntity[], xhv> callback;
    private TaoLiveKtCommentFetchModel lastResult;
    private boolean paused;
    private String[] lastIds = new String[0];
    private final String commentPullIntervalTag = "commentPullIntervalTag";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1010827361);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean a(exs exsVar) {
            czs a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f7671604", new Object[]{this, exsVar})).booleanValue();
            }
            if (exsVar == null || (a2 = exsVar.a()) == null) {
                return false;
            }
            return !a2.k();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements g1a<TaoLiveKtCommentFetchModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fff86e", new Object[]{this, taoLiveKtCommentFetchModel});
                return;
            }
            ckf.g(taoLiveKtCommentFetchModel, p1.d);
            TaoLiveKtCommentPull.access$setLastResult$p(TaoLiveKtCommentPull.this, taoLiveKtCommentFetchModel);
            TaoLiveKtCommentPull.access$mapFetchedComments(TaoLiveKtCommentPull.this);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel) {
            a(taoLiveKtCommentFetchModel);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827360);
        t2o.a(1003487277);
    }

    public static final /* synthetic */ void access$mapFetchedComments(TaoLiveKtCommentPull taoLiveKtCommentPull) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d593f", new Object[]{taoLiveKtCommentPull});
        } else {
            taoLiveKtCommentPull.mapFetchedComments();
        }
    }

    public static final /* synthetic */ void access$setLastResult$p(TaoLiveKtCommentPull taoLiveKtCommentPull, TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c09563e", new Object[]{taoLiveKtCommentPull, taoLiveKtCommentFetchModel});
        } else {
            taoLiveKtCommentPull.lastResult = taoLiveKtCommentFetchModel;
        }
    }

    private final void delayCommentPullIntervalEvent() {
        ITaoLiveKtGlobalTimer b2;
        long j;
        Long delay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a785c51b", new Object[]{this});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (b2 = bizContext.b()) != null) {
            TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel = this.lastResult;
            if (taoLiveKtCommentFetchModel == null || (delay = taoLiveKtCommentFetchModel.getDelay()) == null) {
                j = 5000;
            } else {
                j = delay.longValue();
            }
            b2.delayEvent(this, this.commentPullIntervalTag, j);
        }
    }

    private final boolean filteredComment(TaoLiveKtCommentModel taoLiveKtCommentModel) {
        String str;
        czs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e32137e", new Object[]{this, taoLiveKtCommentModel})).booleanValue();
        }
        pys pysVar = pys.INSTANCE;
        if (pysVar.a(taoLiveKtCommentModel)) {
            return false;
        }
        exs bizContext = getBizContext();
        if (bizContext == null || (a2 = bizContext.a()) == null) {
            str = null;
        } else {
            str = a2.w();
        }
        if (pysVar.c(str, taoLiveKtCommentModel.getRenders())) {
            return false;
        }
        String commentId = taoLiveKtCommentModel.getCommentId();
        if (commentId == null) {
            commentId = "";
        }
        return !ic1.B(this.lastIds, commentId);
    }

    private final Map<String, Object> getInputParams() {
        String str;
        String str2;
        String paginationContext;
        czs a2;
        czs a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad86a8b6", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab", 2);
        linkedHashMap.put("limit", 20);
        linkedHashMap.put("order", "asc");
        exs bizContext = getBizContext();
        String str3 = "";
        if (bizContext == null || (a3 = bizContext.a()) == null || (str = a3.v()) == null) {
            str = str3;
        }
        linkedHashMap.put("topic", str);
        exs bizContext2 = getBizContext();
        if (bizContext2 == null || (a2 = bizContext2.a()) == null || (str2 = a2.p()) == null) {
            str2 = str3;
        }
        linkedHashMap.put("neoRoomType", str2);
        TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel = this.lastResult;
        if (!(taoLiveKtCommentFetchModel == null || (paginationContext = taoLiveKtCommentFetchModel.getPaginationContext()) == null)) {
            str3 = paginationContext;
        }
        linkedHashMap.put("paginationContext", str3);
        return kotlin.collections.a.r(linkedHashMap);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentPull taoLiveKtCommentPull, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentPull");
    }

    private final void mapFetchedComments() {
        List<TaoLiveKtCommentModel> comments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93c78f8", new Object[]{this});
            return;
        }
        TaoLiveKtCommentFetchModel taoLiveKtCommentFetchModel = this.lastResult;
        if (!(taoLiveKtCommentFetchModel == null || (comments = taoLiveKtCommentFetchModel.getComments()) == null)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (TaoLiveKtCommentModel taoLiveKtCommentModel : comments) {
                String commentId = taoLiveKtCommentModel.getCommentId();
                if (commentId == null) {
                    commentId = "";
                }
                if (filteredComment(taoLiveKtCommentModel)) {
                    TaoLiveKtCommentEntity h = rxs.INSTANCE.h(taoLiveKtCommentModel);
                    if (taoLiveKtCommentModel.showAtBottom()) {
                        arrayList3.add(h);
                    } else {
                        arrayList2.add(h);
                    }
                    arrayList.add(commentId);
                }
            }
            this.lastIds = (String[]) arrayList.toArray(new String[0]);
            u1a<? super TaoLiveKtCommentEntity[], ? super TaoLiveKtCommentEntity[], xhv> u1aVar = this.callback;
            if (u1aVar != null) {
                u1aVar.invoke(arrayList2.toArray(new TaoLiveKtCommentEntity[0]), arrayList3.toArray(new TaoLiveKtCommentEntity[0]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pullMTopComments$lambda$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca7a5b83", new Object[0]);
        }
        return "kmp comment pullMTopComments return";
    }

    public final u1a<TaoLiveKtCommentEntity[], TaoLiveKtCommentEntity[], xhv> getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("2fd5f979", new Object[]{this});
        }
        return this.callback;
    }

    public final boolean getPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb968eaf", new Object[]{this})).booleanValue();
        }
        return this.paused;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler
    public void handleEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba63e63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tag");
        if (ckf.b(str, this.commentPullIntervalTag)) {
            pullMTopComments();
        }
    }

    public final void pullMTopComments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226dfea8", new Object[]{this});
        } else if (Companion.a(getBizContext())) {
            delayCommentPullIntervalEvent();
            if (this.paused) {
                l1t.INSTANCE.a(new d1a() { // from class: tb.vys
                    @Override // tb.d1a
                    public final Object invoke() {
                        String pullMTopComments$lambda$0;
                        pullMTopComments$lambda$0 = TaoLiveKtCommentPull.pullMTopComments$lambda$0();
                        return pullMTopComments$lambda$0;
                    }
                });
            } else {
                xys.INSTANCE.b(getInputParams(), new b());
            }
        }
    }

    public final void setCallback(u1a<? super TaoLiveKtCommentEntity[], ? super TaoLiveKtCommentEntity[], xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d11f3", new Object[]{this, u1aVar});
        } else {
            this.callback = u1aVar;
        }
    }

    public final void setPaused(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da16cfd", new Object[]{this, new Boolean(z)});
        } else {
            this.paused = z;
        }
    }
}
