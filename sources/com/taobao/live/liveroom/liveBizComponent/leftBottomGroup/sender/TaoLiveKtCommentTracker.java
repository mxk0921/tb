package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.sender;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentTrack;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import tb.czs;
import tb.dun;
import tb.exs;
import tb.i04;
import tb.jpu;
import tb.ju6;
import tb.jyu;
import tb.kyu;
import tb.l1t;
import tb.ns3;
import tb.pus;
import tb.pys;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0004R*\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/sender/TaoLiveKtCommentTracker;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentTrack;", "<init>", "()V", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "commentEntity", "", "filterComment", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;)Z", "Ltb/xhv;", "addDisplayedComment", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;)V", "exposeAllDisplayedComment", "", "", "", "", "displayComments", "Ljava/util/List;", "displayCommentIds", "", "maxDisplayComment", TLogTracker.LEVEL_INFO, "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentTracker extends TaoLiveKtComponent implements ITaoLiveKtCommentTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<Map<String, Object>> displayComments = new ArrayList();
    private List<String> displayCommentIds = new ArrayList();
    private int maxDisplayComment = 20;

    static {
        t2o.a(1010827376);
        t2o.a(1003487355);
    }

    private final boolean filterComment(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea7ae8f9", new Object[]{this, taoLiveKtCommentEntity})).booleanValue();
        }
        String commentId = taoLiveKtCommentEntity.getCommentId();
        if (commentId == null) {
            commentId = "";
        }
        if (commentId.length() == 0) {
            pus.INSTANCE.f(String.valueOf(((ns3) dun.b(TaoLiveKtCommentTracker.class)).getSimpleName()), "", "filterComment commentId is empty");
            return false;
        }
        Map<String, Object> renders = taoLiveKtCommentEntity.getRenders();
        String str = null;
        if (renders != null) {
            obj = renders.get(yj4.PARAM_CHAT_RENDERS_ENHANCE);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (str == null) {
            str = "";
        }
        if (pys.INSTANCE.e(str)) {
            pus.INSTANCE.f(String.valueOf(((ns3) dun.b(TaoLiveKtCommentTracker.class)).getSimpleName()), "", "filterComment isUserInteractActionMessage");
            return false;
        } else if (!i04.R(this.displayCommentIds, taoLiveKtCommentEntity.getCommentId())) {
            return true;
        } else {
            pus.INSTANCE.f(String.valueOf(((ns3) dun.b(TaoLiveKtCommentTracker.class)).getSimpleName()), "", "filterComment contained");
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentTracker taoLiveKtCommentTracker, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/sender/TaoLiveKtCommentTracker");
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentTrack
    public void exposeAllDisplayedComment() {
        ITaoLiveKtUtManager d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32160aa2", new Object[]{this});
        } else if (!this.displayComments.isEmpty()) {
            String b = l1t.INSTANCE.b(this.displayComments);
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(TaoLiveKtCommentTracker.class)).getSimpleName());
            pusVar.f(valueOf, "", "LiveCommentExposes jsonStr is " + b);
            if (b != null && b.length() != 0) {
                String b2 = kyu.b(jyu.Companion, b);
                String valueOf2 = String.valueOf(((ns3) dun.b(TaoLiveKtCommentTracker.class)).getSimpleName());
                pusVar.f(valueOf2, "", "LiveCommentExposes encodedStr is " + b2);
                if (b2.length() != 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("comments", b2);
                    exs bizContext = getBizContext();
                    if (!(bizContext == null || (d = bizContext.d()) == null)) {
                        ITaoLiveKtUtManager.a.a(d, "LiveCommentExposes", null, linkedHashMap, 2, null);
                    }
                    this.displayComments.clear();
                    this.displayCommentIds.clear();
                }
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentTrack
    public void addDisplayedComment(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        Map<String, Object> favorHighlightCommentStyle;
        ITaoLiveKtUtManager d;
        czs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329042d", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        exs bizContext = getBizContext();
        if ((bizContext == null || (a2 = bizContext.a()) == null || a2.x()) && taoLiveKtCommentEntity != null && filterComment(taoLiveKtCommentEntity)) {
            long a3 = ju6.a();
            Long revTime = taoLiveKtCommentEntity.getRevTime();
            long longValue = revTime != null ? revTime.longValue() : 0L;
            Long sendTime = taoLiveKtCommentEntity.getSendTime();
            long longValue2 = sendTime != null ? sendTime.longValue() : 0L;
            if (longValue != 0 && longValue2 != 0 && longValue2 <= longValue && longValue <= a3) {
                long j = longValue - longValue2;
                long j2 = a3 - longValue;
                long j3 = a3 - longValue2;
                this.displayComments.add(a.k(jpu.a("commentId", taoLiveKtCommentEntity.getCommentId()), jpu.a("revDelay", Long.valueOf(j)), jpu.a("displayDelay", Long.valueOf(j2)), jpu.a("totalDelay", Long.valueOf(j3)), jpu.a(RemoteMessageConst.SEND_TIME, Long.valueOf(longValue2)), jpu.a("revTime", Long.valueOf(longValue)), jpu.a("displayTime", Long.valueOf(a3))));
                String commentId = taoLiveKtCommentEntity.getCommentId();
                if (commentId != null) {
                    this.displayCommentIds.add(commentId);
                }
                if (!(taoLiveKtCommentEntity.getFavorHighlightCommentStyle() == null || (favorHighlightCommentStyle = taoLiveKtCommentEntity.getFavorHighlightCommentStyle()) == null || favorHighlightCommentStyle.isEmpty())) {
                    Map k = a.k(jpu.a("commentId", taoLiveKtCommentEntity.getCommentId()), jpu.a("revDelay", String.valueOf(j)), jpu.a("displayDelay", String.valueOf(j2)), jpu.a("totalDelay", String.valueOf(j3)), jpu.a(RemoteMessageConst.SEND_TIME, String.valueOf(longValue2)), jpu.a("revTime", String.valueOf(longValue)), jpu.a("displayTime", String.valueOf(a3)));
                    exs bizContext2 = getBizContext();
                    if (!(bizContext2 == null || (d = bizContext2.d()) == null)) {
                        ITaoLiveKtUtManager.a.a(d, "ArrestComment", null, k, 2, null);
                    }
                }
                if (this.displayComments.size() >= this.maxDisplayComment) {
                    exposeAllDisplayedComment();
                }
            }
        }
    }
}
