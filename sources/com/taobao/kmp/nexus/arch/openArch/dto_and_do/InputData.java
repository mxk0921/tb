package com.taobao.kmp.nexus.arch.openArch.dto_and_do;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\bz\n\u0002\u0010$\n\u0002\b\u0018\b\u0000\u0018\u0000 Ñ\u00012\u00060\u0001j\u0002`\u0002:\u0002Ò\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0007\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010$\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0007\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR$\u0010*\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0007\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0007\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR$\u00100\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0007\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR$\u00103\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0007\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR$\u00106\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0007\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR$\u00109\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0007\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR$\u0010<\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0007\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR*\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010G\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0007\u001a\u0004\bH\u0010\t\"\u0004\bI\u0010\u000bR$\u0010J\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0007\u001a\u0004\bK\u0010\t\"\u0004\bL\u0010\u000bR$\u0010M\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0007\u001a\u0004\bN\u0010\t\"\u0004\bO\u0010\u000bR$\u0010P\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0007\u001a\u0004\bQ\u0010\t\"\u0004\bR\u0010\u000bR$\u0010S\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0007\u001a\u0004\bT\u0010\t\"\u0004\bU\u0010\u000bR$\u0010V\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\u0007\u001a\u0004\bW\u0010\t\"\u0004\bX\u0010\u000bR$\u0010Y\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010\u0007\u001a\u0004\bZ\u0010\t\"\u0004\b[\u0010\u000bR$\u0010\\\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u0007\u001a\u0004\b]\u0010\t\"\u0004\b^\u0010\u000bR$\u0010_\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010\u0007\u001a\u0004\b`\u0010\t\"\u0004\ba\u0010\u000bR$\u0010b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\u0007\u001a\u0004\bb\u0010\t\"\u0004\bc\u0010\u000bR$\u0010d\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010\u0007\u001a\u0004\be\u0010\t\"\u0004\bf\u0010\u000bR$\u0010g\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0007\u001a\u0004\bh\u0010\t\"\u0004\bi\u0010\u000bR$\u0010j\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010\u0007\u001a\u0004\bk\u0010\t\"\u0004\bl\u0010\u000bR$\u0010m\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010\u0007\u001a\u0004\bn\u0010\t\"\u0004\bo\u0010\u000bR$\u0010p\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010\u0007\u001a\u0004\bq\u0010\t\"\u0004\br\u0010\u000bR$\u0010s\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010\u0007\u001a\u0004\bt\u0010\t\"\u0004\bu\u0010\u000bR$\u0010v\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010\u0007\u001a\u0004\bw\u0010\t\"\u0004\bx\u0010\u000bR$\u0010y\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010\u0007\u001a\u0004\bz\u0010\t\"\u0004\b{\u0010\u000bR$\u0010|\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010\u0007\u001a\u0004\b}\u0010\t\"\u0004\b~\u0010\u000bR&\u0010\u007f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010\u0007\u001a\u0005\b\u0080\u0001\u0010\t\"\u0005\b\u0081\u0001\u0010\u000bR(\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010\u0007\u001a\u0005\b\u0083\u0001\u0010\t\"\u0005\b\u0084\u0001\u0010\u000bR(\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010\u0007\u001a\u0005\b\u0086\u0001\u0010\t\"\u0005\b\u0087\u0001\u0010\u000bR(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010\u0007\u001a\u0005\b\u0089\u0001\u0010\t\"\u0005\b\u008a\u0001\u0010\u000bR(\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010\u0007\u001a\u0005\b\u008c\u0001\u0010\t\"\u0005\b\u008d\u0001\u0010\u000bR(\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010\u0007\u001a\u0005\b\u008f\u0001\u0010\t\"\u0005\b\u0090\u0001\u0010\u000bR(\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010\u0007\u001a\u0005\b\u0092\u0001\u0010\t\"\u0005\b\u0093\u0001\u0010\u000bR(\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\u0007\u001a\u0005\b\u0095\u0001\u0010\t\"\u0005\b\u0096\u0001\u0010\u000bR(\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010\u0007\u001a\u0005\b\u0098\u0001\u0010\t\"\u0005\b\u0099\u0001\u0010\u000bR(\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010\u0007\u001a\u0005\b\u009b\u0001\u0010\t\"\u0005\b\u009c\u0001\u0010\u000bR(\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010\u0007\u001a\u0005\b\u009e\u0001\u0010\t\"\u0005\b\u009f\u0001\u0010\u000bR(\u0010 \u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010\u0007\u001a\u0005\b¡\u0001\u0010\t\"\u0005\b¢\u0001\u0010\u000bR(\u0010£\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010\u0007\u001a\u0005\b¤\u0001\u0010\t\"\u0005\b¥\u0001\u0010\u000bR(\u0010¦\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010\u0007\u001a\u0005\b§\u0001\u0010\t\"\u0005\b¨\u0001\u0010\u000bR(\u0010©\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010\u0007\u001a\u0005\bª\u0001\u0010\t\"\u0005\b«\u0001\u0010\u000bR(\u0010¬\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010\u0007\u001a\u0005\b\u00ad\u0001\u0010\t\"\u0005\b®\u0001\u0010\u000bR(\u0010¯\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010\u0007\u001a\u0005\b°\u0001\u0010\t\"\u0005\b±\u0001\u0010\u000bR(\u0010²\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b²\u0001\u0010\u0007\u001a\u0005\b³\u0001\u0010\t\"\u0005\b´\u0001\u0010\u000bR(\u0010µ\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bµ\u0001\u0010\u0007\u001a\u0005\b¶\u0001\u0010\t\"\u0005\b·\u0001\u0010\u000bR(\u0010¸\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010\u0007\u001a\u0005\b¹\u0001\u0010\t\"\u0005\bº\u0001\u0010\u000bR:\u0010¼\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010@\u0018\u00010»\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R(\u0010Â\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÂ\u0001\u0010\u0007\u001a\u0005\bÃ\u0001\u0010\t\"\u0005\bÄ\u0001\u0010\u000bR:\u0010Å\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010@\u0018\u00010»\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010½\u0001\u001a\u0006\bÆ\u0001\u0010¿\u0001\"\u0006\bÇ\u0001\u0010Á\u0001R(\u0010È\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÈ\u0001\u0010\u0007\u001a\u0005\bÉ\u0001\u0010\t\"\u0005\bÊ\u0001\u0010\u000bR(\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bË\u0001\u0010\u0007\u001a\u0005\bÌ\u0001\u0010\t\"\u0005\bÍ\u0001\u0010\u000bR8\u0010Î\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020@\u0018\u00010»\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010½\u0001\u001a\u0006\bÏ\u0001\u0010¿\u0001\"\u0006\bÐ\u0001\u0010Á\u0001¨\u0006Ó\u0001"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/InputData;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "liveId", "getLiveId", "setLiveId", "feedId", "getFeedId", "setFeedId", "userId", "getUserId", "setUserId", "accountId", "getAccountId", "setAccountId", "liveSource", "getLiveSource", "setLiveSource", "livesource", "getLivesource", "setLivesource", "livesourcePre", "getLivesourcePre", "setLivesourcePre", "spm", "getSpm", "setSpm", "scm", "getScm", "setScm", yj4.PARAM_UT_PARAMS, "getUtparam", "setUtparam", "trackInfo", "getTrackInfo", "setTrackInfo", yj4.PARAM_ENTRY_UT_PARAM, "getEntryUtparam", "setEntryUtparam", "utparamPre", "getUtparamPre", "setUtparamPre", "scmPre", "getScmPre", "setScmPre", "spmPre", "getSpmPre", "setSpmPre", yj4.PARAM_COVER_IMG, "getCoverImg", "setCoverImg", "mediaConfig", "getMediaConfig", "setMediaConfig", "", "", "liveUrlList", "Ljava/util/List;", "getLiveUrlList", "()Ljava/util/List;", "setLiveUrlList", "(Ljava/util/List;)V", yj4.PARAM_CUSTOM_PLAY_CTRL, "getCustomPlayCtrlParams", "setCustomPlayCtrlParams", "enableBackwardSwitch", "getEnableBackwardSwitch", "setEnableBackwardSwitch", "backwardParams", "getBackwardParams", "setBackwardParams", "backwardHeadImage", "getBackwardHeadImage", "setBackwardHeadImage", "alimama", "getAlimama", "setAlimama", "clickid", "getClickid", "setClickid", yj4.PARAM_SJSD_ITEM_ID, "getSjsdItemId", "setSjsdItemId", yj4.PARAM_TIMEMOVING_ITEM_ID, "getTimeMovingItemId", "setTimeMovingItemId", yj4.PARAM_TIME_PLAY_URL, "getTimePointPlayUrl", "setTimePointPlayUrl", yj4.PARAM_IS_LIVE_MUTE, "setLiveMute", "ignoreSameLive", "getIgnoreSameLive", "setIgnoreSameLive", "queryKey", "getQueryKey", "setQueryKey", yj4.PARAM_SWITCH_RT_RCMD, "getSwitchRtRcmd", "setSwitchRtRcmd", yj4.PARAM_TRANSPARENT_KEY, "getTransparentKey", "setTransparentKey", "queryDetailInfo", "getQueryDetailInfo", "setQueryDetailInfo", "updownFeedQuery", "getUpdownFeedQuery", "setUpdownFeedQuery", yj4.PARAM_RECOMMEND_SOURCE, "getRecommendSource", "setRecommendSource", yj4.PARAM_PRODUCT_TYPE, "getProductType", "setProductType", yj4.PARAM_NEED_RECOMMEND, "getNeedRecommend", "setNeedRecommend", SimpleProfile.KEY_SIGNATURE, "getSignature", "setSignature", "timestamp", "getTimestamp", "setTimestamp", "anchorGuard", "getAnchorGuard", "setAnchorGuard", yj4.PARAM_SHARER_ID, "getSharerId", "setSharerId", "keyPointId", "getKeyPointId", "setKeyPointId", "keypointid", "getKeypointid", "setKeypointid", "keypointId", "getKeypointId", "setKeypointId", yj4.PARAM_ITEM_IDS, "getHoldItemIds", "setHoldItemIds", yj4.PARAM_ITEM_HOLD_TYPE, "getItemHoldType", "setItemHoldType", "content", "getContent", "setContent", "tcpContext", "getTcpContext", "setTcpContext", yj4.PARAM_OUTER_PARAM, "getOuterParam", "setOuterParam", yj4.PARAM_HIGH_PRIORITY_BIZ_CODE, "getHighPriorityBizCode", "setHighPriorityBizCode", "itemid", "getItemid", "setItemid", yj4.PARAM_LIVE_DETAIL_EXT_JSON, "getLiveDetailExtJson", "setLiveDetailExtJson", "sjsdParams", "getSjsdParams", "setSjsdParams", "needProcSjsd", "getNeedProcSjsd", "setNeedProcSjsd", yj4.PARAM_IGNORE_PV, "getIgnorePv", "setIgnorePv", "useLiveFandom", "getUseLiveFandom", "setUseLiveFandom", "goodsManager", "getGoodsManager", "setGoodsManager", "", "customedSpfPlayVideo", "Ljava/util/Map;", "getCustomedSpfPlayVideo", "()Ljava/util/Map;", "setCustomedSpfPlayVideo", "(Ljava/util/Map;)V", "timeMovingSpfPlayVideo", "getTimeMovingSpfPlayVideo", "setTimeMovingSpfPlayVideo", "mixLiveRoomTppParam", "getMixLiveRoomTppParam", "setMixLiveRoomTppParam", "huanduanParams", "getHuanduanParams", "setHuanduanParams", "liveItemId", "getLiveItemId", "setLiveItemId", "rawData", "getRawData", "setRawData", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class InputData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String accountId;
    private String alimama;
    private String anchorGuard;
    private String backwardHeadImage;
    private String backwardParams;
    private String clickid;
    private String content;
    private String coverImg;
    private String customPlayCtrlParams;
    private Map<String, ? extends Object> customedSpfPlayVideo;
    private String enableBackwardSwitch;
    private String entryUtparam;
    private String feedId;
    private String goodsManager;
    private String highPriorityBizCode;
    private String holdItemIds;
    private String huanduanParams;
    private String id;
    private String ignorePv;
    private String ignoreSameLive;
    private String isLiveMute;
    private String itemHoldType;
    private String itemid;
    private String keyPointId;
    private String keypointId;
    private String keypointid;
    private String liveDetailExtJson;
    private String liveId;
    private String liveItemId;
    private String liveSource;
    private List<? extends Object> liveUrlList;
    private String livesource;
    private String livesourcePre;
    private String mediaConfig;
    private Map<String, ? extends Object> mixLiveRoomTppParam;
    private String needProcSjsd;
    private String needRecommend;
    private String outerParam;
    private String productType;
    private String queryDetailInfo;
    private String queryKey;
    private Map<String, ? extends Object> rawData;
    private String recommendSource;
    private String scm;
    private String scmPre;
    private String sharerId;
    private String signature;
    private String sjsdItemId;
    private String sjsdParams;
    private String spm;
    private String spmPre;
    private String switchRtRcmd;
    private String tcpContext;
    private String timeMovingItemId;
    private String timeMovingSpfPlayVideo;
    private String timePointPlayUrl;
    private String timestamp;
    private String trackInfo;
    private String transparentKey;
    private String updownFeedQuery;
    private String useLiveFandom;
    private String userId;
    private String utparam;
    private String utparamPre;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004535859);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004535858);
    }

    public final String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        return this.accountId;
    }

    public final String getAlimama() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87a1ec69", new Object[]{this});
        }
        return this.alimama;
    }

    public final String getAnchorGuard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c84a8b7f", new Object[]{this});
        }
        return this.anchorGuard;
    }

    public final String getBackwardHeadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ba3c237", new Object[]{this});
        }
        return this.backwardHeadImage;
    }

    public final String getBackwardParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdbc541a", new Object[]{this});
        }
        return this.backwardParams;
    }

    public final String getClickid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("823b58ac", new Object[]{this});
        }
        return this.clickid;
    }

    public final String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.content;
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

    public final Map<String, Object> getCustomedSpfPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b402cfe0", new Object[]{this});
        }
        return this.customedSpfPlayVideo;
    }

    public final String getEnableBackwardSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf8feb29", new Object[]{this});
        }
        return this.enableBackwardSwitch;
    }

    public final String getEntryUtparam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef986747", new Object[]{this});
        }
        return this.entryUtparam;
    }

    public final String getFeedId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1af4e40a", new Object[]{this});
        }
        return this.feedId;
    }

    public final String getGoodsManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33ae3f2c", new Object[]{this});
        }
        return this.goodsManager;
    }

    public final String getHighPriorityBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4559355", new Object[]{this});
        }
        return this.highPriorityBizCode;
    }

    public final String getHoldItemIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3e21149", new Object[]{this});
        }
        return this.holdItemIds;
    }

    public final String getHuanduanParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4401565", new Object[]{this});
        }
        return this.huanduanParams;
    }

    public final String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public final String getIgnorePv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5ff96cb", new Object[]{this});
        }
        return this.ignorePv;
    }

    public final String getIgnoreSameLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9358abdf", new Object[]{this});
        }
        return this.ignoreSameLive;
    }

    public final String getItemHoldType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d99e7cf7", new Object[]{this});
        }
        return this.itemHoldType;
    }

    public final String getItemid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e52315", new Object[]{this});
        }
        return this.itemid;
    }

    public final String getKeyPointId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2595acd7", new Object[]{this});
        }
        return this.keyPointId;
    }

    public final String getKeypointId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fb698b7", new Object[]{this});
        }
        return this.keypointId;
    }

    public final String getKeypointid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85e9c0d7", new Object[]{this});
        }
        return this.keypointid;
    }

    public final String getLiveDetailExtJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1596e5e3", new Object[]{this});
        }
        return this.liveDetailExtJson;
    }

    public final String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.liveId;
    }

    public final String getLiveItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af78969", new Object[]{this});
        }
        return this.liveItemId;
    }

    public final String getLiveSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this});
        }
        return this.liveSource;
    }

    public final List<Object> getLiveUrlList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d3c2b215", new Object[]{this});
        }
        return this.liveUrlList;
    }

    public final String getLivesource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a18f1c", new Object[]{this});
        }
        return this.livesource;
    }

    public final String getLivesourcePre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("683e3d53", new Object[]{this});
        }
        return this.livesourcePre;
    }

    public final String getMediaConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77880de9", new Object[]{this});
        }
        return this.mediaConfig;
    }

    public final Map<String, Object> getMixLiveRoomTppParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ac314c2", new Object[]{this});
        }
        return this.mixLiveRoomTppParam;
    }

    public final String getNeedProcSjsd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c2e0af", new Object[]{this});
        }
        return this.needProcSjsd;
    }

    public final String getNeedRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adcf4be9", new Object[]{this});
        }
        return this.needRecommend;
    }

    public final String getOuterParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f536a731", new Object[]{this});
        }
        return this.outerParam;
    }

    public final String getProductType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e01b146", new Object[]{this});
        }
        return this.productType;
    }

    public final String getQueryDetailInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25468e48", new Object[]{this});
        }
        return this.queryDetailInfo;
    }

    public final String getQueryKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc6bdf2c", new Object[]{this});
        }
        return this.queryKey;
    }

    public final Map<String, Object> getRawData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf91ab38", new Object[]{this});
        }
        return this.rawData;
    }

    public final String getRecommendSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aae5c7d8", new Object[]{this});
        }
        return this.recommendSource;
    }

    public final String getScm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        return this.scm;
    }

    public final String getScmPre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da3a9c3d", new Object[]{this});
        }
        return this.scmPre;
    }

    public final String getSharerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e93bb315", new Object[]{this});
        }
        return this.sharerId;
    }

    public final String getSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this});
        }
        return this.signature;
    }

    public final String getSjsdItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b140f9ed", new Object[]{this});
        }
        return this.sjsdItemId;
    }

    public final String getSjsdParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5687f6f5", new Object[]{this});
        }
        return this.sjsdParams;
    }

    public final String getSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        return this.spm;
    }

    public final String getSpmPre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f243d4d0", new Object[]{this});
        }
        return this.spmPre;
    }

    public final String getSwitchRtRcmd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b06a63c5", new Object[]{this});
        }
        return this.switchRtRcmd;
    }

    public final String getTcpContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97bed2f5", new Object[]{this});
        }
        return this.tcpContext;
    }

    public final String getTimeMovingItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67ffa", new Object[]{this});
        }
        return this.timeMovingItemId;
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

    public final String getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86bed099", new Object[]{this});
        }
        return this.timestamp;
    }

    public final String getTrackInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396b2cf6", new Object[]{this});
        }
        return this.trackInfo;
    }

    public final String getTransparentKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a15c636", new Object[]{this});
        }
        return this.transparentKey;
    }

    public final String getUpdownFeedQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25289d02", new Object[]{this});
        }
        return this.updownFeedQuery;
    }

    public final String getUseLiveFandom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0323ed", new Object[]{this});
        }
        return this.useLiveFandom;
    }

    public final String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    public final String getUtparam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d38bce1", new Object[]{this});
        }
        return this.utparam;
    }

    public final String getUtparamPre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c157d6e", new Object[]{this});
        }
        return this.utparamPre;
    }

    public final String isLiveMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("685f51ea", new Object[]{this});
        }
        return this.isLiveMute;
    }

    public final void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId = str;
        }
    }

    public final void setAlimama(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739f2995", new Object[]{this, str});
        } else {
            this.alimama = str;
        }
    }

    public final void setAnchorGuard(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58be133f", new Object[]{this, str});
        } else {
            this.anchorGuard = str;
        }
    }

    public final void setBackwardHeadImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6538c87", new Object[]{this, str});
        } else {
            this.backwardHeadImage = str;
        }
    }

    public final void setBackwardParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9a509c", new Object[]{this, str});
        } else {
            this.backwardParams = str;
        }
    }

    public final void setClickid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3345b2", new Object[]{this, str});
        } else {
            this.clickid = str;
        }
    }

    public final void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
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

    public final void setCustomedSpfPlayVideo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd750ae", new Object[]{this, map});
        } else {
            this.customedSpfPlayVideo = map;
        }
    }

    public final void setEnableBackwardSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b7226d", new Object[]{this, str});
        } else {
            this.enableBackwardSwitch = str;
        }
    }

    public final void setEntryUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9412f60f", new Object[]{this, str});
        } else {
            this.entryUtparam = str;
        }
    }

    public final void setFeedId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
        } else {
            this.feedId = str;
        }
    }

    public final void setGoodsManager(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b81aca", new Object[]{this, str});
        } else {
            this.goodsManager = str;
        }
    }

    public final void setHighPriorityBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e325229", new Object[]{this, str});
        } else {
            this.highPriorityBizCode = str;
        }
    }

    public final void setHoldItemIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01746b5", new Object[]{this, str});
        } else {
            this.holdItemIds = str;
        }
    }

    public final void setHuanduanParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48eb8b1", new Object[]{this, str});
        } else {
            this.huanduanParams = str;
        }
    }

    public final void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public final void setIgnorePv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d09d0b", new Object[]{this, str});
        } else {
            this.ignorePv = str;
        }
    }

    public final void setIgnoreSameLive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e888f177", new Object[]{this, str});
        } else {
            this.ignoreSameLive = str;
        }
    }

    public final void setItemHoldType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eacf965f", new Object[]{this, str});
        } else {
            this.itemHoldType = str;
        }
    }

    public final void setItemid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37692d01", new Object[]{this, str});
        } else {
            this.itemid = str;
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

    public final void setKeypointId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e06059f", new Object[]{this, str});
        } else {
            this.keypointId = str;
        }
    }

    public final void setKeypointid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae37e17f", new Object[]{this, str});
        } else {
            this.keypointid = str;
        }
    }

    public final void setLiveDetailExtJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac4de5b", new Object[]{this, str});
        } else {
            this.liveDetailExtJson = str;
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

    public final void setLiveItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae32b2d", new Object[]{this, str});
        } else {
            this.liveItemId = str;
        }
    }

    public final void setLiveMute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45cb2f8", new Object[]{this, str});
        } else {
            this.isLiveMute = str;
        }
    }

    public final void setLiveSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else {
            this.liveSource = str;
        }
    }

    public final void setLiveUrlList(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccad857", new Object[]{this, list});
        } else {
            this.liveUrlList = list;
        }
    }

    public final void setLivesource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4379dbda", new Object[]{this, str});
        } else {
            this.livesource = str;
        }
    }

    public final void setLivesourcePre(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4294eeb", new Object[]{this, str});
        } else {
            this.livesourcePre = str;
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

    public final void setMixLiveRoomTppParam(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce32ea4", new Object[]{this, map});
        } else {
            this.mixLiveRoomTppParam = map;
        }
    }

    public final void setNeedProcSjsd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437a9a7", new Object[]{this, str});
        } else {
            this.needProcSjsd = str;
        }
    }

    public final void setNeedRecommend(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ba1315", new Object[]{this, str});
        } else {
            this.needRecommend = str;
        }
    }

    public final void setOuterParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2887c665", new Object[]{this, str});
        } else {
            this.outerParam = str;
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

    public final void setQueryDetailInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db30f96", new Object[]{this, str});
        } else {
            this.queryDetailInfo = str;
        }
    }

    public final void setQueryKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bed60ca", new Object[]{this, str});
        } else {
            this.queryKey = str;
        }
    }

    public final void setRawData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2418ee", new Object[]{this, map});
        } else {
            this.rawData = map;
        }
    }

    public final void setRecommendSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfb0806", new Object[]{this, str});
        } else {
            this.recommendSource = str;
        }
    }

    public final void setScm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
        } else {
            this.scm = str;
        }
    }

    public final void setScmPre(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2d8d9", new Object[]{this, str});
        } else {
            this.scmPre = str;
        }
    }

    public final void setSharerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9180a01", new Object[]{this, str});
        } else {
            this.sharerId = str;
        }
    }

    public final void setSignature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e32887", new Object[]{this, str});
        } else {
            this.signature = str;
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

    public final void setSjsdParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1606f21", new Object[]{this, str});
        } else {
            this.sjsdParams = str;
        }
    }

    public final void setSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
        } else {
            this.spm = str;
        }
    }

    public final void setSpmPre(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e0b2a6", new Object[]{this, str});
        } else {
            this.spmPre = str;
        }
    }

    public final void setSwitchRtRcmd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed808951", new Object[]{this, str});
        } else {
            this.switchRtRcmd = str;
        }
    }

    public final void setTcpContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7051321", new Object[]{this, str});
        } else {
            this.tcpContext = str;
        }
    }

    public final void setTimeMovingItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0c0dbc", new Object[]{this, str});
        } else {
            this.timeMovingItemId = str;
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

    public final void setTimestamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d358fe65", new Object[]{this, str});
        } else {
            this.timestamp = str;
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

    public final void setTransparentKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496f2200", new Object[]{this, str});
        } else {
            this.transparentKey = str;
        }
    }

    public final void setUpdownFeedQuery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a12d81c", new Object[]{this, str});
        } else {
            this.updownFeedQuery = str;
        }
    }

    public final void setUseLiveFandom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7013b91", new Object[]{this, str});
        } else {
            this.useLiveFandom = str;
        }
    }

    public final void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public final void setUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e2681d", new Object[]{this, str});
        } else {
            this.utparam = str;
        }
    }

    public final void setUtparamPre(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d83b7c8", new Object[]{this, str});
        } else {
            this.utparamPre = str;
        }
    }
}
