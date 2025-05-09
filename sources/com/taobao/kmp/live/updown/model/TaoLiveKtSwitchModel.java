package com.taobao.kmp.live.updown.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.falco.FalcoEnvironmentImpl;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.hpl;
import tb.t2o;
import tb.yj4;
import tb.z9u;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0010\b\n\u0002\bB\u0018\u0000 Ö\u00012\u00020\u0001:\u0002×\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR$\u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0016\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR$\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\b\"\u0004\bD\u0010\nR$\u0010E\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\b\"\u0004\bG\u0010\nR$\u0010H\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\b\"\u0004\bJ\u0010\nR$\u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\b\"\u0004\bM\u0010\nR$\u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\b\"\u0004\bP\u0010\nR$\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\b\"\u0004\bS\u0010\nR*\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010^\u001a\u0004\bd\u0010`\"\u0004\be\u0010bR2\u0010h\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010\u0006\u001a\u0004\bo\u0010\b\"\u0004\bp\u0010\nR2\u0010q\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010i\u001a\u0004\br\u0010k\"\u0004\bs\u0010mR2\u0010t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010i\u001a\u0004\bu\u0010k\"\u0004\bv\u0010mR\"\u0010w\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010\u0016\u001a\u0004\bx\u0010\u0018\"\u0004\by\u0010\u001aR\"\u0010z\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010\u0016\u001a\u0004\b{\u0010\u0018\"\u0004\b|\u0010\u001aR\"\u0010}\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010\u0016\u001a\u0004\b~\u0010\u0018\"\u0004\b\u007f\u0010\u001aR&\u0010\u0080\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u0016\u001a\u0005\b\u0081\u0001\u0010\u0018\"\u0005\b\u0082\u0001\u0010\u001aR6\u0010\u0083\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010i\u001a\u0005\b\u0084\u0001\u0010k\"\u0005\b\u0085\u0001\u0010mR6\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010i\u001a\u0005\b\u0087\u0001\u0010k\"\u0005\b\u0088\u0001\u0010mR6\u0010\u0089\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010i\u001a\u0005\b\u008a\u0001\u0010k\"\u0005\b\u008b\u0001\u0010mR&\u0010\u008c\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010^\u001a\u0005\b\u008c\u0001\u0010`\"\u0005\b\u008d\u0001\u0010bR(\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010\u0006\u001a\u0005\b\u008f\u0001\u0010\b\"\u0005\b\u0090\u0001\u0010\nR&\u0010\u0091\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010^\u001a\u0005\b\u0091\u0001\u0010`\"\u0005\b\u0092\u0001\u0010bR&\u0010\u0093\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010^\u001a\u0005\b\u0094\u0001\u0010`\"\u0005\b\u0095\u0001\u0010bR*\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R(\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\b\"\u0005\b\u009f\u0001\u0010\nR&\u0010 \u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010^\u001a\u0005\b¡\u0001\u0010`\"\u0005\b¢\u0001\u0010bR(\u0010£\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\b\"\u0005\b¥\u0001\u0010\nR(\u0010¦\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010\u0006\u001a\u0005\b§\u0001\u0010\b\"\u0005\b¨\u0001\u0010\nR(\u0010©\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\b\"\u0005\b«\u0001\u0010\nR&\u0010¬\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010^\u001a\u0005\b\u00ad\u0001\u0010`\"\u0005\b®\u0001\u0010bR6\u0010¯\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010i\u001a\u0005\b°\u0001\u0010k\"\u0005\b±\u0001\u0010mR6\u0010²\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b²\u0001\u0010i\u001a\u0005\b³\u0001\u0010k\"\u0005\b´\u0001\u0010mR&\u0010µ\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bµ\u0001\u0010^\u001a\u0005\b¶\u0001\u0010`\"\u0005\b·\u0001\u0010bR6\u0010¸\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010i\u001a\u0005\b¹\u0001\u0010k\"\u0005\bº\u0001\u0010mR&\u0010»\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b»\u0001\u0010^\u001a\u0005\b»\u0001\u0010`\"\u0005\b¼\u0001\u0010bR&\u0010½\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010^\u001a\u0005\b¾\u0001\u0010`\"\u0005\b¿\u0001\u0010bR6\u0010À\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÀ\u0001\u0010i\u001a\u0005\bÁ\u0001\u0010k\"\u0005\bÂ\u0001\u0010mR(\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÃ\u0001\u0010\u0006\u001a\u0005\bÄ\u0001\u0010\b\"\u0005\bÅ\u0001\u0010\nR6\u0010Æ\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010g\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÆ\u0001\u0010i\u001a\u0005\bÇ\u0001\u0010k\"\u0005\bÈ\u0001\u0010mR(\u0010É\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÉ\u0001\u0010\u0006\u001a\u0005\bÊ\u0001\u0010\b\"\u0005\bË\u0001\u0010\nR(\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÌ\u0001\u0010\u0006\u001a\u0005\bÍ\u0001\u0010\b\"\u0005\bÎ\u0001\u0010\nR(\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\b\"\u0005\bÑ\u0001\u0010\nR&\u0010Ò\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÒ\u0001\u0010^\u001a\u0005\bÓ\u0001\u0010`\"\u0005\bÔ\u0001\u0010bR\u0013\u0010Õ\u0001\u001a\u00020\\8F¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010`¨\u0006Ø\u0001"}, d2 = {"Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "liveId", "Ljava/lang/String;", "getLiveId", "()Ljava/lang/String;", "setLiveId", "(Ljava/lang/String;)V", "accountId", "getAccountId", "setAccountId", yj4.PARAM_COVER_IMG, "getCoverImg", "setCoverImg", "title", "getTitle", "setTitle", "", "viewCount", "J", "getViewCount", "()J", "setViewCount", "(J)V", "nativeFeedDetailUrl", "getNativeFeedDetailUrl", "setNativeFeedDetailUrl", "trackInfo", "getTrackInfo", "setTrackInfo", "updownPromptText", "getUpdownPromptText", "setUpdownPromptText", "updownRecommendDesc", "getUpdownRecommendDesc", "setUpdownRecommendDesc", "extendMap", "getExtendMap", "setExtendMap", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtAlimamaInfo;", "alimama", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtAlimamaInfo;", "getAlimama", "()Lcom/taobao/kmp/live/updown/model/TaoLiveKtAlimamaInfo;", "setAlimama", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtAlimamaInfo;)V", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdTransParams;", yj4.PARAM_MEDIA_INFO_ADTRANSPARAMS, "Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdTransParams;", "getAdTransParams", "()Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdTransParams;", "setAdTransParams", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdTransParams;)V", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdEurlParams;", "adEurlParams", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdEurlParams;", "getAdEurlParams", "()Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdEurlParams;", "setAdEurlParams", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtAdEurlParams;)V", "supportPreLoad", "getSupportPreLoad", "setSupportPreLoad", z9u.KEY_FEED_TYPE, "getFeedType", "setFeedType", "timeMovingId", "getTimeMovingId", "setTimeMovingId", yj4.PARAM_SJSD_ITEM_ID, "getSjsdItemId", "setSjsdItemId", yj4.PARAM_PRODUCT_TYPE, "getProductType", "setProductType", "keyPointId", "getKeyPointId", "setKeyPointId", "timeMovingSpfPlayVideo", "getTimeMovingSpfPlayVideo", "setTimeMovingSpfPlayVideo", "", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtLiveUrlItem;", "liveUrlList", "Ljava/util/List;", "getLiveUrlList", "()Ljava/util/List;", "setLiveUrlList", "(Ljava/util/List;)V", "", "h265", "Z", "getH265", "()Z", "setH265", "(Z)V", yj4.PARAM_MEDIA_INFO_RATEADAPTE, "getRateAdapte", "setRateAdapte", "", "", "clientReturnMap", "Ljava/util/Map;", "getClientReturnMap", "()Ljava/util/Map;", "setClientReturnMap", "(Ljava/util/Map;)V", "recommendBindId", "getRecommendBindId", "setRecommendBindId", "modelDebugInfo", "getModelDebugInfo", "setModelDebugInfo", "explainDebugInfo", "getExplainDebugInfo", "setExplainDebugInfo", "autoRecommendInterval", "getAutoRecommendInterval", "setAutoRecommendInterval", "autoRecommendRepeat", "getAutoRecommendRepeat", "setAutoRecommendRepeat", "autoRecommendIntervalFast", "getAutoRecommendIntervalFast", "setAutoRecommendIntervalFast", "autoRecommendFastStart", "getAutoRecommendFastStart", "setAutoRecommendFastStart", "recommendCardInfo", "getRecommendCardInfo", "setRecommendCardInfo", "reserveItemCardInfo", "getReserveItemCardInfo", "setReserveItemCardInfo", "whiteUserDataMap", "getWhiteUserDataMap", "setWhiteUserDataMap", "isSwitchIntelligent", "setSwitchIntelligent", "actionUrl", "getActionUrl", "setActionUrl", "isFirst", "setFirst", FalcoEnvironmentImpl.REPORT_SCENE_VISIT, "getVisit", "setVisit", "", hpl.VIEW_TYPE, TLogTracker.LEVEL_INFO, "getViewType", "()I", "setViewType", "(I)V", "viewItemId", "getViewItemId", "setViewItemId", "edgePcdn", "getEdgePcdn", "setEdgePcdn", "mediaConfig", "getMediaConfig", "setMediaConfig", RequestConfig.KEY_ANCHOR_ID, "getAnchorId", "setAnchorId", "mediaSourceType", "getMediaSourceType", "setMediaSourceType", "shouldIgnoredFlag", "getShouldIgnoredFlag", "setShouldIgnoredFlag", "recordedTimeMoveInfo", "getRecordedTimeMoveInfo", "setRecordedTimeMoveInfo", "originalQueryInfo", "getOriginalQueryInfo", "setOriginalQueryInfo", "enableBackwardSwitch", "getEnableBackwardSwitch", "setEnableBackwardSwitch", "queryParams", "getQueryParams", "setQueryParams", "isManualHotRecommend", "setManualHotRecommend", "needHoldItem", "getNeedHoldItem", "setNeedHoldItem", "algoExtendInfo", "getAlgoExtendInfo", "setAlgoExtendInfo", yj4.PARAM_CUSTOM_PLAY_CTRL, "getCustomPlayCtrlParams", "setCustomPlayCtrlParams", "videoGood", "getVideoGood", "setVideoGood", yj4.PARAM_TIME_PLAY_URL, "getTimePointPlayUrl", "setTimePointPlayUrl", "liveConfigForStream", "getLiveConfigForStream", "setLiveConfigForStream", "requestType", "getRequestType", "setRequestType", "nextGuideShown", "getNextGuideShown", "setNextGuideShown", "isGoodsCard", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtSwitchModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String accountId;
    private String actionUrl;
    private TaoLiveKtAdEurlParams adEurlParams;
    private TaoLiveKtAdTransParams adTransParams;
    private Map<String, ? extends Object> algoExtendInfo;
    private TaoLiveKtAlimamaInfo alimama;
    private String anchorId;
    private long autoRecommendFastStart;
    private long autoRecommendInterval;
    private long autoRecommendIntervalFast;
    private long autoRecommendRepeat;
    private Map<String, ? extends Object> clientReturnMap;
    private String coverImg;
    private String customPlayCtrlParams;
    private boolean edgePcdn;
    private boolean enableBackwardSwitch;
    private Map<String, ? extends Object> explainDebugInfo;
    private String extendMap;
    private String feedType;
    private boolean h265;
    private boolean isFirst;
    private boolean isManualHotRecommend;
    private boolean isSwitchIntelligent;
    private String keyPointId;
    private String liveConfigForStream;
    private String liveId;
    private List<TaoLiveKtLiveUrlItem> liveUrlList;
    private String mediaConfig;
    private String mediaSourceType;
    private Map<String, ? extends Object> modelDebugInfo;
    private String nativeFeedDetailUrl;
    private boolean needHoldItem;
    private boolean nextGuideShown;
    private Map<String, ? extends Object> originalQueryInfo;
    private String productType;
    private Map<String, ? extends Object> queryParams;
    private boolean rateAdapte;
    private String recommendBindId;
    private Map<String, ? extends Object> recommendCardInfo;
    private Map<String, ? extends Object> recordedTimeMoveInfo;
    private String requestType;
    private Map<String, ? extends Object> reserveItemCardInfo;
    private boolean shouldIgnoredFlag;
    private String sjsdItemId;
    private long supportPreLoad = 1;
    private String timeMovingId;
    private String timeMovingSpfPlayVideo;
    private String timePointPlayUrl;
    private String title;
    private String trackInfo;
    private String updownPromptText;
    private String updownRecommendDesc;
    private Map<String, ? extends Object> videoGood;
    private long viewCount;
    private String viewItemId;
    private int viewType;
    private boolean visit;
    private Map<String, ? extends Object> whiteUserDataMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487377);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487376);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtSwitchModel taoLiveKtSwitchModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel");
    }

    public final String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        return this.accountId;
    }

    public final String getActionUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65517636", new Object[]{this});
        }
        return this.actionUrl;
    }

    public final TaoLiveKtAdEurlParams getAdEurlParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAdEurlParams) ipChange.ipc$dispatch("2ddd0254", new Object[]{this});
        }
        return this.adEurlParams;
    }

    public final TaoLiveKtAdTransParams getAdTransParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAdTransParams) ipChange.ipc$dispatch("2ee35410", new Object[]{this});
        }
        return this.adTransParams;
    }

    public final Map<String, Object> getAlgoExtendInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11b7cecd", new Object[]{this});
        }
        return this.algoExtendInfo;
    }

    public final TaoLiveKtAlimamaInfo getAlimama() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAlimamaInfo) ipChange.ipc$dispatch("62c11b22", new Object[]{this});
        }
        return this.alimama;
    }

    public final String getAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("308bb293", new Object[]{this});
        }
        return this.anchorId;
    }

    public final long getAutoRecommendFastStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36f9000a", new Object[]{this})).longValue();
        }
        return this.autoRecommendFastStart;
    }

    public final long getAutoRecommendInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f29d6c77", new Object[]{this})).longValue();
        }
        return this.autoRecommendInterval;
    }

    public final long getAutoRecommendIntervalFast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("599fbcf3", new Object[]{this})).longValue();
        }
        return this.autoRecommendIntervalFast;
    }

    public final long getAutoRecommendRepeat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b58b5c0d", new Object[]{this})).longValue();
        }
        return this.autoRecommendRepeat;
    }

    public final Map<String, Object> getClientReturnMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("620df607", new Object[]{this});
        }
        return this.clientReturnMap;
    }

    public final String getCoverImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2508a37", new Object[]{this});
        }
        return this.coverImg;
    }

    public final String getCustomPlayCtrlParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d2ce0d", new Object[]{this});
        }
        return this.customPlayCtrlParams;
    }

    public final boolean getEdgePcdn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f81a1f1b", new Object[]{this})).booleanValue();
        }
        return this.edgePcdn;
    }

    public final boolean getEnableBackwardSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8406225b", new Object[]{this})).booleanValue();
        }
        return this.enableBackwardSwitch;
    }

    public final Map<String, Object> getExplainDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6fdd5c5c", new Object[]{this});
        }
        return this.explainDebugInfo;
    }

    public final String getExtendMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("750914d", new Object[]{this});
        }
        return this.extendMap;
    }

    public final String getFeedType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba05984b", new Object[]{this});
        }
        return this.feedType;
    }

    public final boolean getH265() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63721e8a", new Object[]{this})).booleanValue();
        }
        return this.h265;
    }

    public final String getKeyPointId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2595acd7", new Object[]{this});
        }
        return this.keyPointId;
    }

    public final String getLiveConfigForStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d62954", new Object[]{this});
        }
        return this.liveConfigForStream;
    }

    public final String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.liveId;
    }

    public final List<TaoLiveKtLiveUrlItem> getLiveUrlList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d3c2b215", new Object[]{this});
        }
        return this.liveUrlList;
    }

    public final String getMediaConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77880de9", new Object[]{this});
        }
        return this.mediaConfig;
    }

    public final String getMediaSourceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a219a016", new Object[]{this});
        }
        return this.mediaSourceType;
    }

    public final Map<String, Object> getModelDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3943dc6a", new Object[]{this});
        }
        return this.modelDebugInfo;
    }

    public final String getNativeFeedDetailUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fa84386", new Object[]{this});
        }
        return this.nativeFeedDetailUrl;
    }

    public final boolean getNeedHoldItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c947b29", new Object[]{this})).booleanValue();
        }
        return this.needHoldItem;
    }

    public final boolean getNextGuideShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301fad49", new Object[]{this})).booleanValue();
        }
        return this.nextGuideShown;
    }

    public final Map<String, Object> getOriginalQueryInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6d0fbecb", new Object[]{this});
        }
        return this.originalQueryInfo;
    }

    public final String getProductType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e01b146", new Object[]{this});
        }
        return this.productType;
    }

    public final Map<String, Object> getQueryParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6a6cfb4", new Object[]{this});
        }
        return this.queryParams;
    }

    public final boolean getRateAdapte() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bbe7684", new Object[]{this})).booleanValue();
        }
        return this.rateAdapte;
    }

    public final String getRecommendBindId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c7481db", new Object[]{this});
        }
        return this.recommendBindId;
    }

    public final Map<String, Object> getRecommendCardInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6d07f180", new Object[]{this});
        }
        return this.recommendCardInfo;
    }

    public final Map<String, Object> getRecordedTimeMoveInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("55ecbd4e", new Object[]{this});
        }
        return this.recordedTimeMoveInfo;
    }

    public final String getRequestType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this});
        }
        return this.requestType;
    }

    public final Map<String, Object> getReserveItemCardInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7052a73", new Object[]{this});
        }
        return this.reserveItemCardInfo;
    }

    public final boolean getShouldIgnoredFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45fa1500", new Object[]{this})).booleanValue();
        }
        return this.shouldIgnoredFlag;
    }

    public final String getSjsdItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b140f9ed", new Object[]{this});
        }
        return this.sjsdItemId;
    }

    public final long getSupportPreLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("214f0ccb", new Object[]{this})).longValue();
        }
        return this.supportPreLoad;
    }

    public final String getTimeMovingId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff62280d", new Object[]{this});
        }
        return this.timeMovingId;
    }

    public final String getTimeMovingSpfPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec36704a", new Object[]{this});
        }
        return this.timeMovingSpfPlayVideo;
    }

    public final String getTimePointPlayUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ee6b2eb", new Object[]{this});
        }
        return this.timePointPlayUrl;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final String getTrackInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396b2cf6", new Object[]{this});
        }
        return this.trackInfo;
    }

    public final String getUpdownPromptText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f98587b5", new Object[]{this});
        }
        return this.updownPromptText;
    }

    public final String getUpdownRecommendDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("501a1fbf", new Object[]{this});
        }
        return this.updownRecommendDesc;
    }

    public final Map<String, Object> getVideoGood() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2cba1f1e", new Object[]{this});
        }
        return this.videoGood;
    }

    public final long getViewCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9f1812f", new Object[]{this})).longValue();
        }
        return this.viewCount;
    }

    public final String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        return this.viewItemId;
    }

    public final int getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue();
        }
        return this.viewType;
    }

    public final boolean getVisit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f65a5a0", new Object[]{this})).booleanValue();
        }
        return this.visit;
    }

    public final Map<String, Object> getWhiteUserDataMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9fa7e810", new Object[]{this});
        }
        return this.whiteUserDataMap;
    }

    public final boolean isFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e18c131", new Object[]{this})).booleanValue();
        }
        return this.isFirst;
    }

    public final boolean isGoodsCard() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67df9407", new Object[]{this})).booleanValue();
        }
        if (this.recommendCardInfo == null) {
            Map<String, ? extends Object> map = this.reserveItemCardInfo;
            if (map == null) {
                return false;
            }
            if (map != null) {
                obj = map.get("cardInfo");
            } else {
                obj = null;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean isManualHotRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a19795aa", new Object[]{this})).booleanValue();
        }
        return this.isManualHotRecommend;
    }

    public final boolean isSwitchIntelligent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5a3f2a4", new Object[]{this})).booleanValue();
        }
        return this.isSwitchIntelligent;
    }

    public final void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId = str;
        }
    }

    public final void setActionUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71b0c68", new Object[]{this, str});
        } else {
            this.actionUrl = str;
        }
    }

    public final void setAdEurlParams(TaoLiveKtAdEurlParams taoLiveKtAdEurlParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc3ebea", new Object[]{this, taoLiveKtAdEurlParams});
        } else {
            this.adEurlParams = taoLiveKtAdEurlParams;
        }
    }

    public final void setAdTransParams(TaoLiveKtAdTransParams taoLiveKtAdTransParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955e274", new Object[]{this, taoLiveKtAdTransParams});
        } else {
            this.adTransParams = taoLiveKtAdTransParams;
        }
    }

    public final void setAlgoExtendInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffa5661", new Object[]{this, map});
        } else {
            this.algoExtendInfo = map;
        }
    }

    public final void setAlimama(TaoLiveKtAlimamaInfo taoLiveKtAlimamaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd55e930", new Object[]{this, taoLiveKtAlimamaInfo});
        } else {
            this.alimama = taoLiveKtAlimamaInfo;
        }
    }

    public final void setAnchorId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc7fa43", new Object[]{this, str});
        } else {
            this.anchorId = str;
        }
    }

    public final void setAutoRecommendFastStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03f84e2", new Object[]{this, new Long(j)});
        } else {
            this.autoRecommendFastStart = j;
        }
    }

    public final void setAutoRecommendInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cf50ad", new Object[]{this, new Long(j)});
        } else {
            this.autoRecommendInterval = j;
        }
    }

    public final void setAutoRecommendIntervalFast(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07529b1", new Object[]{this, new Long(j)});
        } else {
            this.autoRecommendIntervalFast = j;
        }
    }

    public final void setAutoRecommendRepeat(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abad66d7", new Object[]{this, new Long(j)});
        } else {
            this.autoRecommendRepeat = j;
        }
    }

    public final void setClientReturnMap(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3505bff", new Object[]{this, map});
        } else {
            this.clientReturnMap = map;
        }
    }

    public final void setCoverImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e171f", new Object[]{this, str});
        } else {
            this.coverImg = str;
        }
    }

    public final void setCustomPlayCtrlParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d09c09", new Object[]{this, str});
        } else {
            this.customPlayCtrlParams = str;
        }
    }

    public final void setEdgePcdn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e00dd11", new Object[]{this, new Boolean(z)});
        } else {
            this.edgePcdn = z;
        }
    }

    public final void setEnableBackwardSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468b33d1", new Object[]{this, new Boolean(z)});
        } else {
            this.enableBackwardSwitch = z;
        }
    }

    public final void setExplainDebugInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136f2db2", new Object[]{this, map});
        } else {
            this.explainDebugInfo = map;
        }
    }

    public final void setExtendMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ff5431", new Object[]{this, str});
        } else {
            this.extendMap = str;
        }
    }

    public final void setFeedType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118acb8b", new Object[]{this, str});
        } else {
            this.feedType = str;
        }
    }

    public final void setFirst(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa207f", new Object[]{this, new Boolean(z)});
        } else {
            this.isFirst = z;
        }
    }

    public final void setH265(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67262582", new Object[]{this, new Boolean(z)});
        } else {
            this.h265 = z;
        }
    }

    public final void setKeyPointId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409757f", new Object[]{this, str});
        } else {
            this.keyPointId = str;
        }
    }

    public final void setLiveConfigForStream(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc47c0a", new Object[]{this, str});
        } else {
            this.liveConfigForStream = str;
        }
    }

    public final void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.liveId = str;
        }
    }

    public final void setLiveUrlList(List<TaoLiveKtLiveUrlItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccad857", new Object[]{this, list});
        } else {
            this.liveUrlList = list;
        }
    }

    public final void setManualHotRecommend(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513c83b6", new Object[]{this, new Boolean(z)});
        } else {
            this.isManualHotRecommend = z;
        }
    }

    public final void setMediaConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9130de15", new Object[]{this, str});
        } else {
            this.mediaConfig = str;
        }
    }

    public final void setMediaSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b423788", new Object[]{this, str});
        } else {
            this.mediaSourceType = str;
        }
    }

    public final void setModelDebugInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59effc64", new Object[]{this, map});
        } else {
            this.modelDebugInfo = map;
        }
    }

    public final void setNativeFeedDetailUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d35a818", new Object[]{this, str});
        } else {
            this.nativeFeedDetailUrl = str;
        }
    }

    public final void setNeedHoldItem(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2191a8c3", new Object[]{this, new Boolean(z)});
        } else {
            this.needHoldItem = z;
        }
    }

    public final void setNextGuideShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221b6da3", new Object[]{this, new Boolean(z)});
        } else {
            this.nextGuideShown = z;
        }
    }

    public final void setOriginalQueryInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b558bb", new Object[]{this, map});
        } else {
            this.originalQueryInfo = map;
        }
    }

    public final void setProductType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eba658", new Object[]{this, str});
        } else {
            this.productType = str;
        }
    }

    public final void setQueryParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c119df2", new Object[]{this, map});
        } else {
            this.queryParams = map;
        }
    }

    public final void setRateAdapte(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e7a5c8", new Object[]{this, new Boolean(z)});
        } else {
            this.rateAdapte = z;
        }
    }

    public final void setRecommendBindId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec438e63", new Object[]{this, str});
        } else {
            this.recommendBindId = str;
        }
    }

    public final void setRecommendCardInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c37ca6", new Object[]{this, map});
        } else {
            this.recommendCardInfo = map;
        }
    }

    public final void setRecordedTimeMoveInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b1100", new Object[]{this, map});
        } else {
            this.recordedTimeMoveInfo = map;
        }
    }

    public final void setRequestType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88303f8", new Object[]{this, str});
        } else {
            this.requestType = str;
        }
    }

    public final void setReserveItemCardInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e3cf13", new Object[]{this, map});
        } else {
            this.reserveItemCardInfo = map;
        }
    }

    public final void setShouldIgnoredFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8cd964", new Object[]{this, new Boolean(z)});
        } else {
            this.shouldIgnoredFlag = z;
        }
    }

    public final void setSjsdItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc7cb29", new Object[]{this, str});
        } else {
            this.sjsdItemId = str;
        }
    }

    public final void setSupportPreLoad(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d7c441", new Object[]{this, new Long(j)});
        } else {
            this.supportPreLoad = j;
        }
    }

    public final void setSwitchIntelligent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab9096c", new Object[]{this, new Boolean(z)});
        } else {
            this.isSwitchIntelligent = z;
        }
    }

    public final void setTimeMovingId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d814e09", new Object[]{this, str});
        } else {
            this.timeMovingId = str;
        }
    }

    public final void setTimeMovingSpfPlayVideo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c111ee6c", new Object[]{this, str});
        } else {
            this.timeMovingSpfPlayVideo = str;
        }
    }

    public final void setTimePointPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3238eb", new Object[]{this, str});
        } else {
            this.timePointPlayUrl = str;
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final void setTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76382da8", new Object[]{this, str});
        } else {
            this.trackInfo = str;
        }
    }

    public final void setUpdownPromptText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736dfd61", new Object[]{this, str});
        } else {
            this.updownPromptText = str;
        }
    }

    public final void setUpdownRecommendDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aff52ff", new Object[]{this, str});
        } else {
            this.updownRecommendDesc = str;
        }
    }

    public final void setVideoGood(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d34cec8", new Object[]{this, map});
        } else {
            this.videoGood = map;
        }
    }

    public final void setViewCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3584f5", new Object[]{this, new Long(j)});
        } else {
            this.viewCount = j;
        }
    }

    public final void setViewItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ec5566", new Object[]{this, str});
        } else {
            this.viewItemId = str;
        }
    }

    public final void setViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486795fb", new Object[]{this, new Integer(i)});
        } else {
            this.viewType = i;
        }
    }

    public final void setVisit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab740ec4", new Object[]{this, new Boolean(z)});
        } else {
            this.visit = z;
        }
    }

    public final void setWhiteUserDataMap(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf6187e", new Object[]{this, map});
        } else {
            this.whiteUserDataMap = map;
        }
    }
}
