package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.hq9;
import tb.mop;
import tb.mzf;
import tb.qjg;
import tb.rg0;
import tb.t2o;
import tb.z9u;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b^\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 Þ\u00012\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002ß\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\t\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR;\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R/\u00105\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR/\u00109\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\t\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u0010\rR/\u0010=\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\t\u001a\u0004\b;\u0010\u000b\"\u0004\b<\u0010\rR/\u0010A\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\t\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\rR/\u0010E\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\t\u001a\u0004\bC\u0010\u000b\"\u0004\bD\u0010\rR/\u0010I\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\t\u001a\u0004\bG\u0010\u000b\"\u0004\bH\u0010\rR/\u0010M\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\t\u001a\u0004\bK\u0010\u000b\"\u0004\bL\u0010\rR/\u0010Q\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010\t\u001a\u0004\bO\u0010\u000b\"\u0004\bP\u0010\rR/\u0010U\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010\t\u001a\u0004\bS\u0010\u000b\"\u0004\bT\u0010\rR/\u0010Y\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010\t\u001a\u0004\bW\u0010\u000b\"\u0004\bX\u0010\rR/\u0010]\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010\t\u001a\u0004\b[\u0010\u000b\"\u0004\b\\\u0010\rR/\u0010a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010\t\u001a\u0004\b_\u0010\u000b\"\u0004\b`\u0010\rR/\u0010e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010\t\u001a\u0004\bc\u0010\u000b\"\u0004\bd\u0010\rR/\u0010i\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010\t\u001a\u0004\bg\u0010\u000b\"\u0004\bh\u0010\rR/\u0010m\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010\t\u001a\u0004\bk\u0010\u000b\"\u0004\bl\u0010\rR/\u0010q\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010\t\u001a\u0004\bo\u0010\u000b\"\u0004\bp\u0010\rR/\u0010u\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010\t\u001a\u0004\bs\u0010\u000b\"\u0004\bt\u0010\rR/\u0010y\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010\t\u001a\u0004\bw\u0010\u000b\"\u0004\bx\u0010\rR/\u0010}\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010\t\u001a\u0004\b{\u0010\u000b\"\u0004\b|\u0010\rR1\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\b~\u0010\t\u001a\u0004\b\u007f\u0010\u000b\"\u0005\b\u0080\u0001\u0010\rR?\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010\t\u001a\u0005\b\u0083\u0001\u0010.\"\u0005\b\u0084\u0001\u00100R3\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010\t\u001a\u0005\b\u0087\u0001\u0010\u000b\"\u0005\b\u0088\u0001\u0010\rRA\u0010\u008e\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008a\u0001\u0018\u00010*2\u000f\u0010\u0007\u001a\u000b\u0012\u0005\u0012\u00030\u008a\u0001\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010\t\u001a\u0005\b\u008c\u0001\u0010.\"\u0005\b\u008d\u0001\u00100R?\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010\t\u001a\u0005\b\u0090\u0001\u0010.\"\u0005\b\u0091\u0001\u00100R3\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010\t\u001a\u0005\b\u0094\u0001\u0010\u000b\"\u0005\b\u0095\u0001\u0010\rR3\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010\t\u001a\u0005\b\u0098\u0001\u0010\u000b\"\u0005\b\u0099\u0001\u0010\rR3\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010\t\u001a\u0005\b\u009c\u0001\u0010\u000b\"\u0005\b\u009d\u0001\u0010\rR3\u0010¢\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010\t\u001a\u0005\b \u0001\u0010\u000b\"\u0005\b¡\u0001\u0010\rR3\u0010¦\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b£\u0001\u0010\t\u001a\u0005\b¤\u0001\u0010\u000b\"\u0005\b¥\u0001\u0010\rR3\u0010ª\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b§\u0001\u0010\t\u001a\u0005\b¨\u0001\u0010\u000b\"\u0005\b©\u0001\u0010\rR3\u0010®\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b«\u0001\u0010\t\u001a\u0005\b¬\u0001\u0010\u000b\"\u0005\b\u00ad\u0001\u0010\rR3\u0010²\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¯\u0001\u0010\t\u001a\u0005\b°\u0001\u0010\u000b\"\u0005\b±\u0001\u0010\rR3\u0010¶\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b³\u0001\u0010\t\u001a\u0005\b´\u0001\u0010\u000b\"\u0005\bµ\u0001\u0010\rR3\u0010º\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b·\u0001\u0010\t\u001a\u0005\b¸\u0001\u0010\u000b\"\u0005\b¹\u0001\u0010\rR3\u0010¾\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b»\u0001\u0010\t\u001a\u0005\b¼\u0001\u0010\u000b\"\u0005\b½\u0001\u0010\rR3\u0010Â\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¿\u0001\u0010\t\u001a\u0005\bÀ\u0001\u0010\u000b\"\u0005\bÁ\u0001\u0010\rR3\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÃ\u0001\u0010\t\u001a\u0005\bÄ\u0001\u0010\u000b\"\u0005\bÅ\u0001\u0010\rR3\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÇ\u0001\u0010\t\u001a\u0005\bÈ\u0001\u0010\u000b\"\u0005\bÉ\u0001\u0010\rR3\u0010Î\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bË\u0001\u0010\t\u001a\u0005\bÌ\u0001\u0010\u000b\"\u0005\bÍ\u0001\u0010\rR3\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÏ\u0001\u0010\t\u001a\u0005\bÐ\u0001\u0010\u000b\"\u0005\bÑ\u0001\u0010\rR3\u0010Ö\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÓ\u0001\u0010\t\u001a\u0005\bÔ\u0001\u0010\u000b\"\u0005\bÕ\u0001\u0010\rR7\u0010Ý\u0001\u001a\u0005\u0018\u00010×\u00012\t\u0010\u0007\u001a\u0005\u0018\u00010×\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bØ\u0001\u0010\t\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006à\u0001"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/BroadCaster;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "accountId$delegate", "Ltb/qjg;", "getAccountId", "()Ljava/lang/String;", "setAccountId", "(Ljava/lang/String;)V", "accountId", "accountInfoNewUrl$delegate", "getAccountInfoNewUrl", "setAccountInfoNewUrl", "accountInfoNewUrl", "accountInfoUrl$delegate", "getAccountInfoUrl", "setAccountInfoUrl", "accountInfoUrl", "accountName$delegate", "getAccountName", "setAccountName", "accountName", "anchorGuard$delegate", "getAnchorGuard", "setAnchorGuard", "anchorGuard", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Atmosphere;", "atmosphere$delegate", "getAtmosphere", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Atmosphere;", "setAtmosphere", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Atmosphere;)V", "atmosphere", "backGroundImg$delegate", "getBackGroundImg", "setBackGroundImg", "backGroundImg", "", "", "broadCasterTags$delegate", "getBroadCasterTags", "()Ljava/util/List;", "setBroadCasterTags", "(Ljava/util/List;)V", "broadCasterTags", "encodeAccountId$delegate", "getEncodeAccountId", "setEncodeAccountId", LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, "fansNum$delegate", "getFansNum", "setFansNum", "fansNum", "fansNumFormat$delegate", "getFansNumFormat", "setFansNumFormat", "fansNumFormat", "follow$delegate", "getFollow", "setFollow", "follow", "hasFollowHistory$delegate", "getHasFollowHistory", "setHasFollowHistory", "hasFollowHistory", "hasShop$delegate", "getHasShop", "setHasShop", "hasShop", "headImg$delegate", "getHeadImg", "setHeadImg", "headImg", "hotsNum$delegate", "getHotsNum", "setHotsNum", "hotsNum", "jumpUrl$delegate", "getJumpUrl", "setJumpUrl", rg0.JUMP_URL, "rank$delegate", "getRank", "setRank", "rank", "roomNum$delegate", "getRoomNum", "setRoomNum", "roomNum", "roomStatus$delegate", "getRoomStatus", "setRoomStatus", "roomStatus", "shopId$delegate", "getShopId", "setShopId", "shopId", "strDes$delegate", "getStrDes", "setStrDes", "strDes", "subscribe$delegate", "getSubscribe", "setSubscribe", "subscribe", "taoKe$delegate", "getTaoKe", "setTaoKe", z9u.KEY_TAOKE, "tidbitsUrl$delegate", "getTidbitsUrl", "setTidbitsUrl", "tidbitsUrl", "tmall$delegate", "getTmall", "setTmall", hq9.TMALL, "topFollow$delegate", "getTopFollow", "setTopFollow", "topFollow", "type$delegate", NetworkAbility.API_GET_TYPE, "setType", "type", "types$delegate", "getTypes", "setTypes", "types", "v$delegate", "getV", "setV", "v", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/ViconInfo;", "viconInfos$delegate", "getViconInfos", "setViconInfos", "viconInfos", "vicons$delegate", "getVicons", "setVicons", "vicons", "wangwangLink$delegate", "getWangwangLink", "setWangwangLink", "wangwangLink", "subAccountName$delegate", "getSubAccountName", "setSubAccountName", "subAccountName", "shopName$delegate", "getShopName", "setShopName", "shopName", "ratingPicUrl$delegate", "getRatingPicUrl", "setRatingPicUrl", "ratingPicUrl", "accountDes$delegate", "getAccountDes", "setAccountDes", "accountDes", "accountExplain$delegate", "getAccountExplain", "setAccountExplain", "accountExplain", "accountIntroduce$delegate", "getAccountIntroduce", "setAccountIntroduce", "accountIntroduce", "typeLogo$delegate", "getTypeLogo", "setTypeLogo", "typeLogo", "url$delegate", "getUrl", "setUrl", "url", "status$delegate", "getStatus", "setStatus", "status", "shopUrl$delegate", "getShopUrl", "setShopUrl", mop.KEY_APM_SHOP_URL, "tmallHomepageUrl$delegate", "getTmallHomepageUrl", "setTmallHomepageUrl", "tmallHomepageUrl", "anchorSideKey$delegate", "getAnchorSideKey", "setAnchorSideKey", "anchorSideKey", "topicId$delegate", "getTopicId", "setTopicId", "topicId", "topicShowImage$delegate", "getTopicShowImage", "setTopicShowImage", "topicShowImage", "topicTitle$delegate", "getTopicTitle", "setTopicTitle", "topicTitle", "frameLockForbidden$delegate", "getFrameLockForbidden", "setFrameLockForbidden", "frameLockForbidden", "Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/WidgetTip;", "widgetTip$delegate", "getWidgetTip", "()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/WidgetTip;", "setWidgetTip", "(Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/WidgetTip;)V", "widgetTip", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BroadCaster extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg accountId$delegate = new qjg(null, this, BroadCaster$accountId$2.INSTANCE);
    private final qjg accountInfoNewUrl$delegate = new qjg(null, this, BroadCaster$accountInfoNewUrl$2.INSTANCE);
    private final qjg accountInfoUrl$delegate = new qjg(null, this, BroadCaster$accountInfoUrl$2.INSTANCE);
    private final qjg accountName$delegate = new qjg(null, this, BroadCaster$accountName$2.INSTANCE);
    private final qjg anchorGuard$delegate = new qjg(null, this, BroadCaster$anchorGuard$2.INSTANCE);
    private final qjg atmosphere$delegate = new qjg(null, this, BroadCaster$atmosphere$2.INSTANCE);
    private final qjg backGroundImg$delegate = new qjg(null, this, BroadCaster$backGroundImg$2.INSTANCE);
    private final qjg broadCasterTags$delegate = new qjg(null, this, BroadCaster$broadCasterTags$2.INSTANCE);
    private final qjg encodeAccountId$delegate = new qjg(null, this, BroadCaster$encodeAccountId$2.INSTANCE);
    private final qjg fansNum$delegate = new qjg(null, this, BroadCaster$fansNum$2.INSTANCE);
    private final qjg fansNumFormat$delegate = new qjg(null, this, BroadCaster$fansNumFormat$2.INSTANCE);
    private final qjg follow$delegate = new qjg(null, this, BroadCaster$follow$2.INSTANCE);
    private final qjg hasFollowHistory$delegate = new qjg(null, this, BroadCaster$hasFollowHistory$2.INSTANCE);
    private final qjg hasShop$delegate = new qjg(null, this, BroadCaster$hasShop$2.INSTANCE);
    private final qjg headImg$delegate = new qjg(null, this, BroadCaster$headImg$2.INSTANCE);
    private final qjg hotsNum$delegate = new qjg(null, this, BroadCaster$hotsNum$2.INSTANCE);
    private final qjg jumpUrl$delegate = new qjg(null, this, BroadCaster$jumpUrl$2.INSTANCE);
    private final qjg rank$delegate = new qjg(null, this, BroadCaster$rank$2.INSTANCE);
    private final qjg roomNum$delegate = new qjg(null, this, BroadCaster$roomNum$2.INSTANCE);
    private final qjg roomStatus$delegate = new qjg(null, this, BroadCaster$roomStatus$2.INSTANCE);
    private final qjg shopId$delegate = new qjg(null, this, BroadCaster$shopId$2.INSTANCE);
    private final qjg strDes$delegate = new qjg(null, this, BroadCaster$strDes$2.INSTANCE);
    private final qjg subscribe$delegate = new qjg(null, this, BroadCaster$subscribe$2.INSTANCE);
    private final qjg taoKe$delegate = new qjg(null, this, BroadCaster$taoKe$2.INSTANCE);
    private final qjg tidbitsUrl$delegate = new qjg(null, this, BroadCaster$tidbitsUrl$2.INSTANCE);
    private final qjg tmall$delegate = new qjg(null, this, BroadCaster$tmall$2.INSTANCE);
    private final qjg topFollow$delegate = new qjg(null, this, BroadCaster$topFollow$2.INSTANCE);
    private final qjg type$delegate = new qjg(null, this, BroadCaster$type$2.INSTANCE);
    private final qjg types$delegate = new qjg(null, this, BroadCaster$types$2.INSTANCE);
    private final qjg v$delegate = new qjg(null, this, BroadCaster$v$2.INSTANCE);
    private final qjg viconInfos$delegate = new qjg(null, this, BroadCaster$viconInfos$2.INSTANCE);
    private final qjg vicons$delegate = new qjg(null, this, BroadCaster$vicons$2.INSTANCE);
    private final qjg wangwangLink$delegate = new qjg(null, this, BroadCaster$wangwangLink$2.INSTANCE);
    private final qjg subAccountName$delegate = new qjg(null, this, BroadCaster$subAccountName$2.INSTANCE);
    private final qjg shopName$delegate = new qjg(null, this, BroadCaster$shopName$2.INSTANCE);
    private final qjg ratingPicUrl$delegate = new qjg(null, this, BroadCaster$ratingPicUrl$2.INSTANCE);
    private final qjg accountDes$delegate = new qjg(null, this, BroadCaster$accountDes$2.INSTANCE);
    private final qjg accountExplain$delegate = new qjg(null, this, BroadCaster$accountExplain$2.INSTANCE);
    private final qjg accountIntroduce$delegate = new qjg(null, this, BroadCaster$accountIntroduce$2.INSTANCE);
    private final qjg typeLogo$delegate = new qjg(null, this, BroadCaster$typeLogo$2.INSTANCE);
    private final qjg url$delegate = new qjg(null, this, BroadCaster$url$2.INSTANCE);
    private final qjg status$delegate = new qjg(null, this, BroadCaster$status$2.INSTANCE);
    private final qjg shopUrl$delegate = new qjg(null, this, BroadCaster$shopUrl$2.INSTANCE);
    private final qjg tmallHomepageUrl$delegate = new qjg(null, this, BroadCaster$tmallHomepageUrl$2.INSTANCE);
    private final qjg anchorSideKey$delegate = new qjg(null, this, BroadCaster$anchorSideKey$2.INSTANCE);
    private final qjg topicId$delegate = new qjg(null, this, BroadCaster$topicId$2.INSTANCE);
    private final qjg topicShowImage$delegate = new qjg(null, this, BroadCaster$topicShowImage$2.INSTANCE);
    private final qjg topicTitle$delegate = new qjg(null, this, BroadCaster$topicTitle$2.INSTANCE);
    private final qjg frameLockForbidden$delegate = new qjg(null, this, BroadCaster$frameLockForbidden$2.INSTANCE);
    private final qjg widgetTip$delegate = new qjg(null, this, BroadCaster$widgetTip$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004535888);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(BroadCaster broadCaster, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/BroadCaster");
    }

    public final String getAccountDes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28d57f3e", new Object[]{this});
        }
        return (String) this.accountDes$delegate.b(this, $$delegatedProperties[36]);
    }

    public final String getAccountExplain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6808cbf9", new Object[]{this});
        }
        return (String) this.accountExplain$delegate.b(this, $$delegatedProperties[37]);
    }

    public final String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        return (String) this.accountId$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getAccountInfoNewUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f539c25", new Object[]{this});
        }
        return (String) this.accountInfoNewUrl$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getAccountInfoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26d6254f", new Object[]{this});
        }
        return (String) this.accountInfoUrl$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getAccountIntroduce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcc0a711", new Object[]{this});
        }
        return (String) this.accountIntroduce$delegate.b(this, $$delegatedProperties[38]);
    }

    public final String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        return (String) this.accountName$delegate.b(this, $$delegatedProperties[3]);
    }

    public final String getAnchorGuard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c84a8b7f", new Object[]{this});
        }
        return (String) this.anchorGuard$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getAnchorSideKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad9cd9bc", new Object[]{this});
        }
        return (String) this.anchorSideKey$delegate.b(this, $$delegatedProperties[44]);
    }

    public final Atmosphere getAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Atmosphere) ipChange.ipc$dispatch("258003d3", new Object[]{this});
        }
        return (Atmosphere) this.atmosphere$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getBackGroundImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23a0b07a", new Object[]{this});
        }
        return (String) this.backGroundImg$delegate.b(this, $$delegatedProperties[6]);
    }

    public final List<Object> getBroadCasterTags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b97caef", new Object[]{this});
        }
        return (List) this.broadCasterTags$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getEncodeAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbe5abfd", new Object[]{this});
        }
        return (String) this.encodeAccountId$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String getFansNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d34fb589", new Object[]{this});
        }
        return (String) this.fansNum$delegate.b(this, $$delegatedProperties[9]);
    }

    public final String getFansNumFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9c9e9d2", new Object[]{this});
        }
        return (String) this.fansNumFormat$delegate.b(this, $$delegatedProperties[10]);
    }

    public final String getFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa1a4eb2", new Object[]{this});
        }
        return (String) this.follow$delegate.b(this, $$delegatedProperties[11]);
    }

    public final String getFrameLockForbidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5634ac2", new Object[]{this});
        }
        return (String) this.frameLockForbidden$delegate.b(this, $$delegatedProperties[48]);
    }

    public final String getHasFollowHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9fe61ba", new Object[]{this});
        }
        return (String) this.hasFollowHistory$delegate.b(this, $$delegatedProperties[12]);
    }

    public final String getHasShop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6b6debf", new Object[]{this});
        }
        return (String) this.hasShop$delegate.b(this, $$delegatedProperties[13]);
    }

    public final String getHeadImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1578c", new Object[]{this});
        }
        return (String) this.headImg$delegate.b(this, $$delegatedProperties[14]);
    }

    public final String getHotsNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e278a18f", new Object[]{this});
        }
        return (String) this.hotsNum$delegate.b(this, $$delegatedProperties[15]);
    }

    public final String getJumpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16f49ae", new Object[]{this});
        }
        return (String) this.jumpUrl$delegate.b(this, $$delegatedProperties[16]);
    }

    public final String getRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe1f1397", new Object[]{this});
        }
        return (String) this.rank$delegate.b(this, $$delegatedProperties[17]);
    }

    public final String getRatingPicUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51ec9c01", new Object[]{this});
        }
        return (String) this.ratingPicUrl$delegate.b(this, $$delegatedProperties[35]);
    }

    public final String getRoomNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28427da4", new Object[]{this});
        }
        return (String) this.roomNum$delegate.b(this, $$delegatedProperties[18]);
    }

    public final String getRoomStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24a1de36", new Object[]{this});
        }
        return (String) this.roomStatus$delegate.b(this, $$delegatedProperties[19]);
    }

    public final String getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return (String) this.shopId$delegate.b(this, $$delegatedProperties[20]);
    }

    public final String getShopName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6105d742", new Object[]{this});
        }
        return (String) this.shopName$delegate.b(this, $$delegatedProperties[34]);
    }

    public final String getShopUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935d5876", new Object[]{this});
        }
        return (String) this.shopUrl$delegate.b(this, $$delegatedProperties[42]);
    }

    public final String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return (String) this.status$delegate.b(this, $$delegatedProperties[41]);
    }

    public final String getStrDes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55535c42", new Object[]{this});
        }
        return (String) this.strDes$delegate.b(this, $$delegatedProperties[21]);
    }

    public final String getSubAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c7bc6cb", new Object[]{this});
        }
        return (String) this.subAccountName$delegate.b(this, $$delegatedProperties[33]);
    }

    public final String getSubscribe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17a84e5", new Object[]{this});
        }
        return (String) this.subscribe$delegate.b(this, $$delegatedProperties[22]);
    }

    public final String getTaoKe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17378bd3", new Object[]{this});
        }
        return (String) this.taoKe$delegate.b(this, $$delegatedProperties[23]);
    }

    public final String getTidbitsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52ecede9", new Object[]{this});
        }
        return (String) this.tidbitsUrl$delegate.b(this, $$delegatedProperties[24]);
    }

    public final String getTmall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf723367", new Object[]{this});
        }
        return (String) this.tmall$delegate.b(this, $$delegatedProperties[25]);
    }

    public final String getTmallHomepageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e88dea", new Object[]{this});
        }
        return (String) this.tmallHomepageUrl$delegate.b(this, $$delegatedProperties[43]);
    }

    public final String getTopFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d74f649", new Object[]{this});
        }
        return (String) this.topFollow$delegate.b(this, $$delegatedProperties[26]);
    }

    public final String getTopicId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2be37d05", new Object[]{this});
        }
        return (String) this.topicId$delegate.b(this, $$delegatedProperties[45]);
    }

    public final String getTopicShowImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6146734", new Object[]{this});
        }
        return (String) this.topicShowImage$delegate.b(this, $$delegatedProperties[46]);
    }

    public final String getTopicTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38d9adfa", new Object[]{this});
        }
        return (String) this.topicTitle$delegate.b(this, $$delegatedProperties[47]);
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return (String) this.type$delegate.b(this, $$delegatedProperties[27]);
    }

    public final String getTypeLogo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0f6a05e", new Object[]{this});
        }
        return (String) this.typeLogo$delegate.b(this, $$delegatedProperties[39]);
    }

    public final List<String> getTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f0e45b3d", new Object[]{this});
        }
        return (List) this.types$delegate.b(this, $$delegatedProperties[28]);
    }

    public final String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return (String) this.url$delegate.b(this, $$delegatedProperties[40]);
    }

    public final String getV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this});
        }
        return (String) this.v$delegate.b(this, $$delegatedProperties[29]);
    }

    public final List<ViconInfo> getViconInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3d9a5e94", new Object[]{this});
        }
        return (List) this.viconInfos$delegate.b(this, $$delegatedProperties[30]);
    }

    public final List<String> getVicons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("37277d46", new Object[]{this});
        }
        return (List) this.vicons$delegate.b(this, $$delegatedProperties[31]);
    }

    public final String getWangwangLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb878aa3", new Object[]{this});
        }
        return (String) this.wangwangLink$delegate.b(this, $$delegatedProperties[32]);
    }

    public final WidgetTip getWidgetTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetTip) ipChange.ipc$dispatch("49bc2ee1", new Object[]{this});
        }
        return (WidgetTip) this.widgetTip$delegate.b(this, $$delegatedProperties[49]);
    }

    public final void setAccountDes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c3eff8", new Object[]{this, str});
        } else {
            this.accountDes$delegate.a(this, $$delegatedProperties[36], str);
        }
    }

    public final void setAccountExplain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9dcd49d", new Object[]{this, str});
        } else {
            this.accountExplain$delegate.a(this, $$delegatedProperties[37], str);
        }
    }

    public final void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setAccountInfoNewUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589ef059", new Object[]{this, str});
        } else {
            this.accountInfoNewUrl$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setAccountInfoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4baa607", new Object[]{this, str});
        } else {
            this.accountInfoUrl$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setAccountIntroduce(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f796c985", new Object[]{this, str});
        } else {
            this.accountIntroduce$delegate.a(this, $$delegatedProperties[38], str);
        }
    }

    public final void setAccountName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14d5aa7", new Object[]{this, str});
        } else {
            this.accountName$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setAnchorGuard(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58be133f", new Object[]{this, str});
        } else {
            this.anchorGuard$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setAnchorSideKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a9e3fa2", new Object[]{this, str});
        } else {
            this.anchorSideKey$delegate.a(this, $$delegatedProperties[44], str);
        }
    }

    public final void setAtmosphere(Atmosphere atmosphere) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5944f9", new Object[]{this, atmosphere});
        } else {
            this.atmosphere$delegate.a(this, $$delegatedProperties[5], atmosphere);
        }
    }

    public final void setBackGroundImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851540a4", new Object[]{this, str});
        } else {
            this.backGroundImg$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setBroadCasterTags(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fb00bd", new Object[]{this, list});
        } else {
            this.broadCasterTags$delegate.a(this, $$delegatedProperties[7], list);
        }
    }

    public final void setEncodeAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af7a881", new Object[]{this, str});
        } else {
            this.encodeAccountId$delegate.a(this, $$delegatedProperties[8], str);
        }
    }

    public final void setFansNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9daa8475", new Object[]{this, str});
        } else {
            this.fansNum$delegate.a(this, $$delegatedProperties[9], str);
        }
    }

    public final void setFansNumFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413324c", new Object[]{this, str});
        } else {
            this.fansNumFormat$delegate.a(this, $$delegatedProperties[10], str);
        }
    }

    public final void setFollow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d97504", new Object[]{this, str});
        } else {
            this.follow$delegate.a(this, $$delegatedProperties[11], str);
        }
    }

    public final void setFrameLockForbidden(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad7c8f4", new Object[]{this, str});
        } else {
            this.frameLockForbidden$delegate.a(this, $$delegatedProperties[48], str);
        }
    }

    public final void setHasFollowHistory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21063fc", new Object[]{this, str});
        } else {
            this.hasFollowHistory$delegate.a(this, $$delegatedProperties[12], str);
        }
    }

    public final void setHasShop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372881ff", new Object[]{this, str});
        } else {
            this.hasShop$delegate.a(this, $$delegatedProperties[13], str);
        }
    }

    public final void setHeadImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8d22d2", new Object[]{this, str});
        } else {
            this.headImg$delegate.a(this, $$delegatedProperties[14], str);
        }
    }

    public final void setHotsNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739f192f", new Object[]{this, str});
        } else {
            this.hotsNum$delegate.a(this, $$delegatedProperties[15], str);
        }
    }

    public final void setJumpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337d74f0", new Object[]{this, str});
        } else {
            this.jumpUrl$delegate.a(this, $$delegatedProperties[16], str);
        }
    }

    public final void setRank(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a429fbf", new Object[]{this, str});
        } else {
            this.rank$delegate.a(this, $$delegatedProperties[17], str);
        }
    }

    public final void setRatingPicUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c455895", new Object[]{this, str});
        } else {
            this.ratingPicUrl$delegate.a(this, $$delegatedProperties[35], str);
        }
    }

    public final void setRoomNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e710bfba", new Object[]{this, str});
        } else {
            this.roomNum$delegate.a(this, $$delegatedProperties[18], str);
        }
    }

    public final void setRoomStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6837000", new Object[]{this, str});
        } else {
            this.roomStatus$delegate.a(this, $$delegatedProperties[19], str);
        }
    }

    public final void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId$delegate.a(this, $$delegatedProperties[20], str);
        }
    }

    public final void setShopName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a926b74", new Object[]{this, str});
        } else {
            this.shopName$delegate.a(this, $$delegatedProperties[34], str);
        }
    }

    public final void setShopUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df513f28", new Object[]{this, str});
        } else {
            this.shopUrl$delegate.a(this, $$delegatedProperties[42], str);
        }
    }

    public final void setStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
        } else {
            this.status$delegate.a(this, $$delegatedProperties[41], str);
        }
    }

    public final void setStrDes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c21974", new Object[]{this, str});
        } else {
            this.strDes$delegate.a(this, $$delegatedProperties[21], str);
        }
    }

    public final void setSubAccountName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c9340b", new Object[]{this, str});
        } else {
            this.subAccountName$delegate.a(this, $$delegatedProperties[33], str);
        }
    }

    public final void setSubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b013d399", new Object[]{this, str});
        } else {
            this.subscribe$delegate.a(this, $$delegatedProperties[22], str);
        }
    }

    public final void setTaoKe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c92846b", new Object[]{this, str});
        } else {
            this.taoKe$delegate.a(this, $$delegatedProperties[23], str);
        }
    }

    public final void setTidbitsUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a56ad", new Object[]{this, str});
        } else {
            this.tidbitsUrl$delegate.a(this, $$delegatedProperties[24], str);
        }
    }

    public final void setTmall(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbaccf57", new Object[]{this, str});
        } else {
            this.tmall$delegate.a(this, $$delegatedProperties[25], str);
        }
    }

    public final void setTmallHomepageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6bbdcc", new Object[]{this, str});
        } else {
            this.tmallHomepageUrl$delegate.a(this, $$delegatedProperties[43], str);
        }
    }

    public final void setTopFollow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3678eb5", new Object[]{this, str});
        } else {
            this.topFollow$delegate.a(this, $$delegatedProperties[26], str);
        }
    }

    public final void setTopicId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578fac79", new Object[]{this, str});
        } else {
            this.topicId$delegate.a(this, $$delegatedProperties[45], str);
        }
    }

    public final void setTopicShowImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd44a0c2", new Object[]{this, str});
        } else {
            this.topicShowImage$delegate.a(this, $$delegatedProperties[46], str);
        }
    }

    public final void setTopicTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594598bc", new Object[]{this, str});
        } else {
            this.topicTitle$delegate.a(this, $$delegatedProperties[47], str);
        }
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type$delegate.a(this, $$delegatedProperties[27], str);
        }
    }

    public final void setTypeLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bac5d8", new Object[]{this, str});
        } else {
            this.typeLogo$delegate.a(this, $$delegatedProperties[39], str);
        }
    }

    public final void setTypes(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502d7b2f", new Object[]{this, list});
        } else {
            this.types$delegate.a(this, $$delegatedProperties[28], list);
        }
    }

    public final void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url$delegate.a(this, $$delegatedProperties[40], str);
        }
    }

    public final void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        } else {
            this.v$delegate.a(this, $$delegatedProperties[29], str);
        }
    }

    public final void setViconInfos(List<ViconInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36885a50", new Object[]{this, list});
        } else {
            this.viconInfos$delegate.a(this, $$delegatedProperties[30], list);
        }
    }

    public final void setVicons(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7840f7de", new Object[]{this, list});
        } else {
            this.vicons$delegate.a(this, $$delegatedProperties[31], list);
        }
    }

    public final void setWangwangLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16083e33", new Object[]{this, str});
        } else {
            this.wangwangLink$delegate.a(this, $$delegatedProperties[32], str);
        }
    }

    public final void setWidgetTip(WidgetTip widgetTip) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf5ecf", new Object[]{this, widgetTip});
        } else {
            this.widgetTip$delegate.a(this, $$delegatedProperties[49], widgetTip);
        }
    }

    static {
        t2o.a(1004535887);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(BroadCaster.class, "accountId", "getAccountId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(BroadCaster.class, "accountInfoNewUrl", "getAccountInfoNewUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(BroadCaster.class, "accountInfoUrl", "getAccountInfoUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(BroadCaster.class, "accountName", "getAccountName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(BroadCaster.class, "anchorGuard", "getAnchorGuard()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(BroadCaster.class, "atmosphere", "getAtmosphere()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/Atmosphere;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(BroadCaster.class, "backGroundImg", "getBackGroundImg()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(BroadCaster.class, "broadCasterTags", "getBroadCasterTags()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(BroadCaster.class, LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, "getEncodeAccountId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(BroadCaster.class, "fansNum", "getFansNum()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(BroadCaster.class, "fansNumFormat", "getFansNumFormat()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(BroadCaster.class, "follow", "getFollow()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        MutablePropertyReference1Impl mutablePropertyReference1Impl13 = new MutablePropertyReference1Impl(BroadCaster.class, "hasFollowHistory", "getHasFollowHistory()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl13);
        MutablePropertyReference1Impl mutablePropertyReference1Impl14 = new MutablePropertyReference1Impl(BroadCaster.class, "hasShop", "getHasShop()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl14);
        MutablePropertyReference1Impl mutablePropertyReference1Impl15 = new MutablePropertyReference1Impl(BroadCaster.class, "headImg", "getHeadImg()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl15);
        MutablePropertyReference1Impl mutablePropertyReference1Impl16 = new MutablePropertyReference1Impl(BroadCaster.class, "hotsNum", "getHotsNum()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl16);
        MutablePropertyReference1Impl mutablePropertyReference1Impl17 = new MutablePropertyReference1Impl(BroadCaster.class, rg0.JUMP_URL, "getJumpUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl17);
        MutablePropertyReference1Impl mutablePropertyReference1Impl18 = new MutablePropertyReference1Impl(BroadCaster.class, "rank", "getRank()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl18);
        MutablePropertyReference1Impl mutablePropertyReference1Impl19 = new MutablePropertyReference1Impl(BroadCaster.class, "roomNum", "getRoomNum()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl19);
        MutablePropertyReference1Impl mutablePropertyReference1Impl20 = new MutablePropertyReference1Impl(BroadCaster.class, "roomStatus", "getRoomStatus()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl20);
        MutablePropertyReference1Impl mutablePropertyReference1Impl21 = new MutablePropertyReference1Impl(BroadCaster.class, "shopId", "getShopId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl21);
        MutablePropertyReference1Impl mutablePropertyReference1Impl22 = new MutablePropertyReference1Impl(BroadCaster.class, "strDes", "getStrDes()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl22);
        MutablePropertyReference1Impl mutablePropertyReference1Impl23 = new MutablePropertyReference1Impl(BroadCaster.class, "subscribe", "getSubscribe()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl23);
        MutablePropertyReference1Impl mutablePropertyReference1Impl24 = new MutablePropertyReference1Impl(BroadCaster.class, z9u.KEY_TAOKE, "getTaoKe()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl24);
        MutablePropertyReference1Impl mutablePropertyReference1Impl25 = new MutablePropertyReference1Impl(BroadCaster.class, "tidbitsUrl", "getTidbitsUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl25);
        MutablePropertyReference1Impl mutablePropertyReference1Impl26 = new MutablePropertyReference1Impl(BroadCaster.class, hq9.TMALL, "getTmall()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl26);
        MutablePropertyReference1Impl mutablePropertyReference1Impl27 = new MutablePropertyReference1Impl(BroadCaster.class, "topFollow", "getTopFollow()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl27);
        MutablePropertyReference1Impl mutablePropertyReference1Impl28 = new MutablePropertyReference1Impl(BroadCaster.class, "type", "getType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl28);
        MutablePropertyReference1Impl mutablePropertyReference1Impl29 = new MutablePropertyReference1Impl(BroadCaster.class, "types", "getTypes()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl29);
        MutablePropertyReference1Impl mutablePropertyReference1Impl30 = new MutablePropertyReference1Impl(BroadCaster.class, "v", "getV()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl30);
        MutablePropertyReference1Impl mutablePropertyReference1Impl31 = new MutablePropertyReference1Impl(BroadCaster.class, "viconInfos", "getViconInfos()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl31);
        MutablePropertyReference1Impl mutablePropertyReference1Impl32 = new MutablePropertyReference1Impl(BroadCaster.class, "vicons", "getVicons()Ljava/util/List;", 0);
        dun.f(mutablePropertyReference1Impl32);
        MutablePropertyReference1Impl mutablePropertyReference1Impl33 = new MutablePropertyReference1Impl(BroadCaster.class, "wangwangLink", "getWangwangLink()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl33);
        MutablePropertyReference1Impl mutablePropertyReference1Impl34 = new MutablePropertyReference1Impl(BroadCaster.class, "subAccountName", "getSubAccountName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl34);
        MutablePropertyReference1Impl mutablePropertyReference1Impl35 = new MutablePropertyReference1Impl(BroadCaster.class, "shopName", "getShopName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl35);
        MutablePropertyReference1Impl mutablePropertyReference1Impl36 = new MutablePropertyReference1Impl(BroadCaster.class, "ratingPicUrl", "getRatingPicUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl36);
        MutablePropertyReference1Impl mutablePropertyReference1Impl37 = new MutablePropertyReference1Impl(BroadCaster.class, "accountDes", "getAccountDes()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl37);
        MutablePropertyReference1Impl mutablePropertyReference1Impl38 = new MutablePropertyReference1Impl(BroadCaster.class, "accountExplain", "getAccountExplain()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl38);
        MutablePropertyReference1Impl mutablePropertyReference1Impl39 = new MutablePropertyReference1Impl(BroadCaster.class, "accountIntroduce", "getAccountIntroduce()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl39);
        MutablePropertyReference1Impl mutablePropertyReference1Impl40 = new MutablePropertyReference1Impl(BroadCaster.class, "typeLogo", "getTypeLogo()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl40);
        MutablePropertyReference1Impl mutablePropertyReference1Impl41 = new MutablePropertyReference1Impl(BroadCaster.class, "url", "getUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl41);
        MutablePropertyReference1Impl mutablePropertyReference1Impl42 = new MutablePropertyReference1Impl(BroadCaster.class, "status", "getStatus()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl42);
        MutablePropertyReference1Impl mutablePropertyReference1Impl43 = new MutablePropertyReference1Impl(BroadCaster.class, mop.KEY_APM_SHOP_URL, "getShopUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl43);
        MutablePropertyReference1Impl mutablePropertyReference1Impl44 = new MutablePropertyReference1Impl(BroadCaster.class, "tmallHomepageUrl", "getTmallHomepageUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl44);
        MutablePropertyReference1Impl mutablePropertyReference1Impl45 = new MutablePropertyReference1Impl(BroadCaster.class, "anchorSideKey", "getAnchorSideKey()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl45);
        MutablePropertyReference1Impl mutablePropertyReference1Impl46 = new MutablePropertyReference1Impl(BroadCaster.class, "topicId", "getTopicId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl46);
        MutablePropertyReference1Impl mutablePropertyReference1Impl47 = new MutablePropertyReference1Impl(BroadCaster.class, "topicShowImage", "getTopicShowImage()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl47);
        MutablePropertyReference1Impl mutablePropertyReference1Impl48 = new MutablePropertyReference1Impl(BroadCaster.class, "topicTitle", "getTopicTitle()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl48);
        MutablePropertyReference1Impl mutablePropertyReference1Impl49 = new MutablePropertyReference1Impl(BroadCaster.class, "frameLockForbidden", "getFrameLockForbidden()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl49);
        MutablePropertyReference1Impl mutablePropertyReference1Impl50 = new MutablePropertyReference1Impl(BroadCaster.class, "widgetTip", "getWidgetTip()Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/WidgetTip;", 0);
        dun.f(mutablePropertyReference1Impl50);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12, mutablePropertyReference1Impl13, mutablePropertyReference1Impl14, mutablePropertyReference1Impl15, mutablePropertyReference1Impl16, mutablePropertyReference1Impl17, mutablePropertyReference1Impl18, mutablePropertyReference1Impl19, mutablePropertyReference1Impl20, mutablePropertyReference1Impl21, mutablePropertyReference1Impl22, mutablePropertyReference1Impl23, mutablePropertyReference1Impl24, mutablePropertyReference1Impl25, mutablePropertyReference1Impl26, mutablePropertyReference1Impl27, mutablePropertyReference1Impl28, mutablePropertyReference1Impl29, mutablePropertyReference1Impl30, mutablePropertyReference1Impl31, mutablePropertyReference1Impl32, mutablePropertyReference1Impl33, mutablePropertyReference1Impl34, mutablePropertyReference1Impl35, mutablePropertyReference1Impl36, mutablePropertyReference1Impl37, mutablePropertyReference1Impl38, mutablePropertyReference1Impl39, mutablePropertyReference1Impl40, mutablePropertyReference1Impl41, mutablePropertyReference1Impl42, mutablePropertyReference1Impl43, mutablePropertyReference1Impl44, mutablePropertyReference1Impl45, mutablePropertyReference1Impl46, mutablePropertyReference1Impl47, mutablePropertyReference1Impl48, mutablePropertyReference1Impl49, mutablePropertyReference1Impl50};
    }
}
