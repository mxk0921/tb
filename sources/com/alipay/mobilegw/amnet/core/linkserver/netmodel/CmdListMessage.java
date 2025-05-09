package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CmdListMessage extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TAG_CMDLIST = 2;
    public static final int TAG_SEQ = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<CmdMessage> cmdList;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer seq;
    public static final Integer DEFAULT_SEQ = 0;
    public static final List<CmdMessage> DEFAULT_CMDLIST = Collections.emptyList();

    public CmdListMessage(CmdListMessage cmdListMessage) {
        super(cmdListMessage);
        if (cmdListMessage != null) {
            this.seq = cmdListMessage.seq;
            this.cmdList = Message.copyOf(cmdListMessage.cmdList);
        }
    }

    public static /* synthetic */ Object ipc$super(CmdListMessage cmdListMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobilegw/amnet/core/linkserver/netmodel/CmdListMessage");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdListMessage)) {
            return false;
        }
        CmdListMessage cmdListMessage = (CmdListMessage) obj;
        if (!equals(this.seq, cmdListMessage.seq) || !equals((List<?>) this.cmdList, (List<?>) cmdListMessage.cmdList)) {
            return false;
        }
        return true;
    }

    public CmdListMessage fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CmdListMessage) ipChange.ipc$dispatch("f6d14923", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.seq = (Integer) obj;
        } else if (i == 2) {
            this.cmdList = Message.immutableCopyOf((List) obj);
        }
        return this;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        Integer num = this.seq;
        if (num != null) {
            i = num.hashCode();
        }
        int i4 = i * 37;
        List<CmdMessage> list = this.cmdList;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i5 = i4 + i2;
        this.hashCode = i5;
        return i5;
    }

    public CmdListMessage() {
    }
}
