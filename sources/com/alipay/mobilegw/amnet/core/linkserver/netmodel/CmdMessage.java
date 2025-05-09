package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CmdMessage extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TAG_CMDDATA = 2;
    public static final int TAG_CMDTYPE = 1;
    @ProtoField(tag = 2, type = Message.Datatype.BYTES)
    public ByteString cmdData;
    @ProtoField(tag = 1, type = Message.Datatype.ENUM)
    public CmdType cmdType;
    public static final CmdType DEFAULT_CMDTYPE = CmdType.IpListUpdate;
    public static final ByteString DEFAULT_CMDDATA = ByteString.EMPTY;

    public CmdMessage(CmdMessage cmdMessage) {
        super(cmdMessage);
        if (cmdMessage != null) {
            this.cmdType = cmdMessage.cmdType;
            this.cmdData = cmdMessage.cmdData;
        }
    }

    public static /* synthetic */ Object ipc$super(CmdMessage cmdMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobilegw/amnet/core/linkserver/netmodel/CmdMessage");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdMessage)) {
            return false;
        }
        CmdMessage cmdMessage = (CmdMessage) obj;
        if (!equals(this.cmdType, cmdMessage.cmdType) || !equals(this.cmdData, cmdMessage.cmdData)) {
            return false;
        }
        return true;
    }

    public CmdMessage fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CmdMessage) ipChange.ipc$dispatch("419f02e5", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.cmdType = (CmdType) obj;
        } else if (i == 2) {
            this.cmdData = (ByteString) obj;
        }
        return this;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        CmdType cmdType = this.cmdType;
        if (cmdType != null) {
            i = cmdType.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 37;
        ByteString byteString = this.cmdData;
        if (byteString != null) {
            i2 = byteString.hashCode();
        }
        int i5 = i4 + i2;
        this.hashCode = i5;
        return i5;
    }

    public CmdMessage() {
    }
}
